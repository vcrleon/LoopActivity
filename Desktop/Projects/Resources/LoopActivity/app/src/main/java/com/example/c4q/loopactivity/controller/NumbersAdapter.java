package com.example.c4q.loopactivity.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.c4q.loopactivity.model.Numbers;
import com.example.c4q.loopactivity.view.NumberViewHolder;

import java.util.List;

/**
 * Created by c4q on 12/6/17.
 */

public class NumbersAdapter extends RecyclerView.Adapter<NumberViewHolder>{

    private List<Numbers> numbersList;


    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext().inflate(android.support.v4.R.layout.activity_list, parent, false));
        return null;
    }

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {
        Numbers numbers = numbersList.get(position);

    }

    @Override
    public int getItemCount() {
        return numbersList.size();
    }
}
