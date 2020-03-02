package com.example.honoursproject_opendayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

public class Geography extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);


        listView = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        new Connection().execute();

    }

    class Connection extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            String result = "";

            String host = "http://150.237.94.38:8081/geography.php";
            try{
                HttpClient client = new DefaultHttpClient();
                HttpGet request = new HttpGet();
                request.setURI(new URI(host));
                HttpResponse response = client.execute(request);
                BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

                StringBuffer stringBuffer = new StringBuffer("");

                String line ="";
                while ((line = reader.readLine()) !=null){
                    stringBuffer.append(line);
                    break;
                }
                reader.close();
                result = stringBuffer.toString();

            }
            catch(Exception e){
                return new String("Exception: " + e.getMessage());

            }
            return result;
        }

        @Override
        protected void onPostExecute(String result){
            try {
                JSONObject jsonResult = new JSONObject(result);
                int success = jsonResult.getInt("success");
                if(success == 1){
                    JSONArray geography = jsonResult.getJSONArray("geography");
                    for(int i =0; i < geography.length(); i++){
                        JSONObject geography_ = geography.getJSONObject(i);
                        int id = geography_.getInt("id");
                        String starttime = geography_.getString("Start Time");
                        String finishtime = geography_.getString("Finish Time");
                        String building = geography_.getString("Building");
                        String room = geography_.getString("Room");
                        String description = geography_.getString("Description");
                        String line =  starttime + " - " + finishtime + " | " + building + " - " + room + " | " + description;
                        adapter.add(line);
                    }

                }
                else{
                    Toast.makeText(getApplicationContext(), "No timetable available" ,Toast.LENGTH_SHORT).show();

                }
            } catch (JSONException e) {
                Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

    }


}
