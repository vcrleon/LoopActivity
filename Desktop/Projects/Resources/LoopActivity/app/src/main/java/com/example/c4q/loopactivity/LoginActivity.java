package com.example.c4q.loopactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "login_shared_preferences";
    private SharedPreferences login;
    private EditText userName;
    private EditText password;
    private CheckBox save;
    private Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = findViewById(R.id.edit_text01);
        password = findViewById(R.id.edit_text02);
        save = findViewById(R.id.checkbox01);
        enter = findViewById(R.id.button01);

        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = login.edit();

                if(save.isChecked()) {
                    editor.putString("username", userName.getText().toString());
                    editor.putString("password", password.getText().toString());
                    editor.putBoolean("isChecked", true);
                    editor.commit();

                } //missing else statement, I'm just not sure how to set it up...

                String userEmail = "user@aol.com";
                String userPassword = "password1234";

                if((userName.getText().toString().equalsIgnoreCase(userEmail))
                        && (password.getText().toString().equalsIgnoreCase(userPassword))) {

                    Intent intent = new Intent(LoginActivity.this, ListActivity.class);
                    intent.putExtra("user email address", userName.getText().toString());
                    startActivity(intent);

                } //again, missing an else statement, bc I'm not sure how to set it up

            }
        });

    }
}
