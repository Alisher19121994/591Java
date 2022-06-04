package com.example.a591java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.main_RecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        getMainAdapter(data());
    }


    void getMainAdapter(ArrayList<Main> list) {
        MainAdapter mainAdapter = new MainAdapter(this, list);
        recyclerView.setAdapter(mainAdapter);
    }

    ArrayList<Main> data() {
        ArrayList<Main> list = new ArrayList<>();
        ArrayList<Feeds> feeds = new ArrayList<>();

        list.add(new Main());
        list.add(new Main(feeds));

        feeds.add(new Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"));
        feeds.add(new Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"));
        feeds.add(new Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"));
        feeds.add(new Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"));
        feeds.add(new Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"));
        feeds.add(new Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"));
        feeds.add(new Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"));
        feeds.add(new Feeds(R.drawable.rasm, R.drawable.rasm1, "Alisher Daminov"));


        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));
        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));
        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));
        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));
        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));
        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));
        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));
        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));
        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));
        list.add(new Main(new Story("Alisher Daminov was tagged", R.drawable.rasm, "Alisher Daminov", "Jizzax Kelajak liderlari ", "Futzal bo'yicha viloyat kubigi bo'lib o'tmoqda bugungi kunda", R.drawable.rasm1)));

        return list;
    }

}