package com.example.gr1_dz3_3mesias_ulan_recyclerview;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String>carList = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        carList.add("Toyota");
        carList.add("Mers");
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Opel");
        carList.add("Tesla");
        carList.add("Kia");
        carList.add("Nissan");
        carList.add("Jeep");
        carList.add("Lexus");
        carList.add("Labo");
        carList.add("Ferrari");
        carList.add("Lamborgini");
        carList.add("Bentley");
        carList.add("Bugatti");
        carList.add("Jigul");
        carList.add("Audi");
        carList.add("Rangerover");
        carList.add("Rav4");

        CarAdapter adapter = new CarAdapter(carList);

        recyclerView.setAdapter(adapter);
    }
}