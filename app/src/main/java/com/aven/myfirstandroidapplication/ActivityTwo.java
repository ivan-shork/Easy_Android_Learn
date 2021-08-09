package com.aven.myfirstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
        Button baiduBtn = (Button) findViewById(R.id.baidu);
        baiduBtn.setOnClickListener(ActivityTwo.this);
        Button phoneBtn = (Button) findViewById(R.id.baidu);
        phoneBtn.setOnClickListener(ActivityTwo.this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button7:
                Toast.makeText(ActivityTwo.this,"跳转回首页", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ActivityTwo.this, ActivityOne.class);
                startActivity(i);
                System.out.print("跳转首页成功！！！！！！！");
                break;
            case R.id.baidu:
                Intent baiduIndent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.baidu.com"));
                startActivity(baiduIndent);
                break;
            case R.id.phone:
                Intent phoneIndent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:15815200256"));
                startActivity(phoneIndent);
                break;
            default:
                break;
        }
    }
}