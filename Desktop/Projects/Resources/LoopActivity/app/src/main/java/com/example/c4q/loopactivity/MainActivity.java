package com.example.c4q.loopactivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView integersDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private class asynClass extends AsyncTask<Integer, Integer, Integer> {

        int i = 0;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(Integer... value) {

           while (i < 100000) {
               publishProgress(i);
           }


            return i;
        }

        @Override
        protected void onProgressUpdate(Integer... progress) {
            super.onProgressUpdate(progress);
            integersDisplay.setText("Loops completed: " + i);

        }

        @Override
        protected void onPostExecute(Integer result) {
            super.onPostExecute(result);
            integersDisplay.setText("Loops completed: " + i);

            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);


        }
    }
}
