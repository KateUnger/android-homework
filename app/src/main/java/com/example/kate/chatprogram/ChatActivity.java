package com.example.kate.chatprogram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by Kate on 12/6/2017.
 */

public class ChatActivity extends AppCompatActivity {
    ListView myListview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ArrayList<String> foodLists = new ArrayList();
        foodLists.add("Chips");
        foodLists.add("Pizza");
        foodLists.add("Hamburger");
        foodLists.add("Bananas");
        foodLists.add("Apples");

        myListview = (ListView) findViewById(R.id.list_view);
        MyListAdapter adapter = new MyListAdapter(getApplicationContext(), foodLists, ChatActivity.this);
        myListview.setAdapter(adapter);
        adapter.notifyDataSetChanged();



    }



}
