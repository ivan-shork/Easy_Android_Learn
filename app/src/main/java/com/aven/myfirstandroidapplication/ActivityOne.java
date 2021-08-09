package com.aven.myfirstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_one);

        // 获取组件
        Button btn1 = (Button) findViewById(R.id.button9);
        Button btn2 = (Button) findViewById(R.id.button8);
        // 需要将接口实现的实例传递进组件
        btn1.setOnClickListener(ActivityOne.this);
        btn2.setOnClickListener(ActivityOne.this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button9:
                Toast.makeText(ActivityOne.this,"产品被点击", Toast.LENGTH_SHORT).show();
                // 新建一个意图，并将自己的实例传递过去方便引用
                Intent i = new Intent(ActivityOne.this, ActivityTwo.class);
                startActivity(i);
                break;
            case R.id.button8:
                Toast.makeText(ActivityOne.this,"跳转到电话列表", Toast.LENGTH_SHORT).show();
                Intent listIndent = new Intent(ActivityOne.this, ListActivity.class);
                startActivity(listIndent);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }

}