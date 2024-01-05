package com.example.lab041;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Tạo danh sách các mục
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("Android cơ bản");
        dataList.add("Android nâng cao");
        dataList.add("Thiết kế giao diện Android");
        dataList.add("Test và triển khai ứng dụng Android");
        dataList.add("NodeJS");
        dataList.add("Game 2D");

        // Tạo Adapter và đặt Adapter cho ListView
        MyAdapter adapter = new MyAdapter(this, dataList);
        listView.setAdapter(adapter);
    }
}
