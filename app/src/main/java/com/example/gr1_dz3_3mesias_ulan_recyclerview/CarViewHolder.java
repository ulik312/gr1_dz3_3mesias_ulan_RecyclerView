package com.example.gr1_dz3_3mesias_ulan_recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_car;


    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_car = itemView.findViewById(R.id.tv_care);
    }

    public void bind(String car) {
        tv_car.setText(car);
    }

}