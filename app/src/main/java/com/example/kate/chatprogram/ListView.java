package com.example.kate.chatprogram;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class ListView extends BaseAdapter {
Context context;
ArrayList<String> myArrayList;
Activity activity;
public ListView(Context context, ArrayList <String> array, Activity activity) {
super();
this.context = context;
this.myArrayList = array;
this.activity = activity;
}
@Override
public int getCount(){
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

//Your Code to make your custom text message view.
//Hint: Look up how to inflate your custom view in getView method of a BaseAdapter class
 return convertView;
 }
}

