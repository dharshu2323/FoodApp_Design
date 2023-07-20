package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.airbnb.lottie.LottieAnimationView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(login.this,R.color.coff));
        setContentView(R.layout.activity_login);

        Button login = findViewById(R.id.btn);
        EditText username = findViewById(R.id.et1);
        LottieAnimationView animationView=findViewById(R.id.run);



        SharedPreferences sharedPreferences = getSharedPreferences("shared",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        login.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(login.this, MainActivity.class);
                editor.putString("name", username.getText().toString());
                editor.commit();
                startActivity(i);


            }

        });
    }




}