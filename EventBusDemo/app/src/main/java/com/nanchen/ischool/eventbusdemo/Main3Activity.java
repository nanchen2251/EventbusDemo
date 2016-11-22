package com.nanchen.ischool.eventbusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;

public class Main3Activity extends AppCompatActivity {

    private EditText mEditUsername;
    private EditText mEditPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mEditUsername = (EditText) findViewById(R.id.edit_username);
        mEditPwd = (EditText) findViewById(R.id.edit_pwd);
    }

    public void btnClick3(View view) {
        String username = mEditUsername.getText().toString().trim();
        String password = mEditPwd.getText().toString().trim();
        EventBus.getDefault().post(new MessageEvent(new User(username,password)));
        finish();
    }
}
