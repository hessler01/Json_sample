package com.danialhz.app.json_train;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        JSONObject root =new JSONObject();

        try {
            JSONObject glossary =new JSONObject();
            glossary.put("title","example glossary");
            JSONObject glossDiv=new JSONObject();
            glossDiv.put("title","S");
            JSONObject glossList = new JSONObject();
            JSONObject glossEntry = new JSONObject();
            glossEntry.put("id","SGML");
            glossEntry.put("SortAs","SGML");
            glossEntry.put("GlossTerm","Standard Generalized Markup Language");
            glossEntry.put("Acronym","SGML");
            glossEntry.put("Abbrev","ISO 8879:1986");
            JSONObject glossdef = new JSONObject();
            glossdef.put("para","A meta-markup language, used to create markup languages such as DocBook.");
            JSONArray glossseealso = new JSONArray();
            glossseealso.put("GML");
            glossseealso.put("XML");

            root.put("Gloss see","markup");

        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        Log.e("Tag",root.toString());

    }
}
