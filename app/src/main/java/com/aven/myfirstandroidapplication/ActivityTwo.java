package com.aven.myfirstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_two);

        Button btn1 = (Button) findViewById(R.id.button7);
        btn1.setOnClickListener(ActivityTwo.this);
    }

    @Override
    public void onClick(View view) {
        int btn7 = R.id.button7;
        if(view.getId() == btn7) {
            Toast.makeText(ActivityTwo.this,"跳转回首页", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(ActivityTwo.this, ActivityOne.class);
            startActivity(i);
            System.out.print("跳转首页成功！！！！！！！");
        }

    }
}