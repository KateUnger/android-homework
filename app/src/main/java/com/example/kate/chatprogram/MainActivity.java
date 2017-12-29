package com.example.kate.chatprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_chat_windowchat_activity);
    }

    public void enterChat(View view) {
        //make an intent, to start an activitiy
        //should have three extras: Chatroom name, username, and boolean for incognito mode

        //EditText for chatroom name --->
        EditText chatroomEditText = (EditText) findViewById(R.id.Input_chat_name);
        String chatroomName = chatroomEditText.getText().toString();

        //EditText for username --->
        EditText usernameEditText = (EditText) findViewById(R.id.Input_username);
        String username = usernameEditText.getText().toString();

        //Switch for incognito mode --->
        Switch incognitoMode = (Switch) findViewById(R.id.Switch);
        Boolean  incognitoModeSwitch = incognitoMode.isChecked();

        Bundle b = new Bundle();
        b.putString("chatroom", chatroomName);
        b.putString("username", username);
        b.putBoolean("incognitoMode", incognitoModeSwitch);;
        startActivity(new Intent(this, ChatActivity.class), b);
    }
}