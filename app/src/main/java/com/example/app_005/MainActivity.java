package com.example.app_005;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_secondActivityShow(View view) {
       // Intent intent = new Intent(this, SecondActivity.class);

        Intent intent = new Intent(this, ThirdActivity.class);

        //Intent intent = new Intent(this, FourthActivity.class);
        // Intent intent = new Intent(this, FithActivity.class);
        // Intent intent = new Intent(this, SixthActivity.class);

        startActivity(intent);
    }
}