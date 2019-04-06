package com.example.attendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.attendance.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn1Button;
    private Button mBtn2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn1Button = (Button) findViewById(R.id.main_btn1);
        mBtn2Button = (Button) findViewById(R.id.main_btn2);
        mBtn1Button.setOnClickListener(this);
        mBtn2Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_btn1:
                startActivity(new Intent(this,LoginActivity.class));
                break;
            case R.id.main_btn2:
                startActivity(new Intent(this,LoginActivity.class));
                break;
        }
    }
}
