package com.example.kate.chatprogram;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kate on 12/6/2017.
 */

public class MyListAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> myArrayList;
    Activity activity;

    public MyListAdapter(Context context, ArrayList<String> array, Activity activity) {
        super();
        this.context = context;
        this.myArrayList = array;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return myArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        String message = myArrayList.get(position);
LayoutInflater inflater = (LayoutInflater) activity.getApplicationContext().getSystemService (Context.LAYOUT_INFLATER_SERVICE);
View myCellLayout = inflater.inflate(R.layout.mylistaadapter, null);
TextView messageTextView = (TextView) myCellLayout.findViewById(R.id.list_view);  // messageTV is the id of your message textview in your custom made message cell XML
messageTextView.setText(message);
//now you set the convertView to be displayed as your custom layout.
convertView = myCellLayout;

        return convertView;
    }
}