package com.example.c4q.loopactivity.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.c4q.loopactivity.R;

/**
 * Created by c4q on 12/6/17.
 */

public class NumberViewHolder extends RecyclerView.ViewHolder {

    private TextView numbers;

    public NumberViewHolder(View itemView) {
        super(itemView);

        //again, not sure why I get a red when I try to reference my text view
        numbers = itemView.findViewById(R.id.number_textview);

        //didn't get the chance to attempt the logic for the itemviews




    }
}
