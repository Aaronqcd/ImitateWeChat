package com.ewangz.imitatewechat;

import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeActivity extends ListActivity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.activity_home,
                new String[]{"title","info","img"},
                new int[]{R.id.title,R.id.info,R.id.img});
        setListAdapter(adapter);
    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "T1");
        map.put("info", "test 1");
        map.put("img", R.drawable.i5);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "T2");
        map.put("info", "test 2");
        map.put("img", R.drawable.i6);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "T3");
        map.put("info", "test 3");
        map.put("img", R.drawable.i7);
        list.add(map);

        return list;
    }
}
