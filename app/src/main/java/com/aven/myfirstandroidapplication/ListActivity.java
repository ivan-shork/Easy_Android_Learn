package com.aven.myfirstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class ListActivity extends android.app.ListActivity {

    // step1: create dataset 创建数据集
    String data[] = {
            "aven",
            "jody",
            "jody",
            "jody",
            "jody",
            "jody",
            "android",
            "android",
            "android",
            "android",
            "android",
            "boolish",
            "boolish",
            "boolish",
            "boolish"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list);

        // step2: create data adapater  //创建一个数据插槽
        ArrayAdapter<String> myAdapater = new ArrayAdapter<String>(
                // 传自己的上下文对象过去，因为可能会回调这边的方法
                this,
                // 这个list的外观资源档 用android自带的
                android.R.layout.simple_list_item_1,
                // text的id
                android.R.id.text1,
                data

        );
        // update Adapater
        setListAdapter(myAdapater);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }


}