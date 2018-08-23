package com.jh.recyclerviewdeletedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MyAdapter adapter;
    ItemRemoveRecyclerView recyclerView;

    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (ItemRemoveRecyclerView) findViewById(R.id.recyclerView);

        for (int i = 0; i < 10; i++) {
          mList.add("测试数据 " + i);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(this, mList);
        recyclerView.setAdapter(adapter);

        recyclerView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "当前position = " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDeleteClick(int position) {
                Toast.makeText(MainActivity.this, "删除的position = " + position, Toast.LENGTH_SHORT).show();
                adapter.removeItem(position);
            }
        });
    }
}
