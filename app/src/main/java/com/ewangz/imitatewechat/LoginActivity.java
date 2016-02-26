package com.ewangz.imitatewechat;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView register = (TextView)findViewById(R.id.registerLink);
        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ComponentName componentname = new ComponentName(LoginActivity.this, RegisterActivity.class);
                Intent intent = new Intent();
                intent.setComponent(componentname);
                startActivity(intent);
            }
        });
    }
}
