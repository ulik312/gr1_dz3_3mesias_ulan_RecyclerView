package com.example.gr1_dz3_3mesias_ulan_recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter  extends RecyclerView.Adapter <CarViewHolder> {

    private ArrayList<String> carList;

    public CarAdapter(ArrayList<String> carList) {
        this.carList = carList;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_brand_machine,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bind(carList.get(position));

    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}