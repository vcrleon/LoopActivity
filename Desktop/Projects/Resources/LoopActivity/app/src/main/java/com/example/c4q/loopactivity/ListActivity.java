package com.example.c4q.loopactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    private TextView userEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //not sure why I can't reference my text view and recycler view's ids
        userEmail = findViewById(R.id.user_email);
        RecyclerView listRecyclerView = findViewById(R.id.list_recycler_view);


    }
}
