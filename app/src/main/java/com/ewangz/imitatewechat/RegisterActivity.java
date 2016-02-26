package com.ewangz.imitatewechat;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView loginLink = (TextView)findViewById(R.id.returnLoginLink);
        loginLink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ComponentName componentname = new ComponentName(RegisterActivity.this, LoginActivity.class);
                Intent intent = new Intent();
                intent.setComponent(componentname);
                startActivity(intent);
            }
        });
    }
}
