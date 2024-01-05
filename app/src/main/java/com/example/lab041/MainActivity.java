package com.example.lab041;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewMonHoc = findViewById(R.id.listViewMonHoc);

        // Tạo danh sách các môn học
        List<MonHoc> monHocList = new ArrayList<>();
        monHocList.add(new MonHoc(R.mipmap.ic_launcher, "CMP354", "Lập trình di động", "Nguyễn Huy Cường"));
        monHocList.add(new MonHoc(R.mipmap.ic_launcher, "CMP324", "Lập trình Java", "Nguyễn Văn A"));

        // Tạo Adapter và đặt Adapter cho ListView
        MonHocAdapter adapter = new MonHocAdapter(this, monHocList);
        listViewMonHoc.setAdapter(adapter);
    }
}
