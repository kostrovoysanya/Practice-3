package ru.mirea.kudriashov.intent_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Received extends AppCompatActivity {
    TextView textViewTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recived);
        textViewTime = findViewById(R.id.TextTime);
        Intent intent = getIntent();
        textViewTime.setText(intent.getStringExtra("time"));
    }
}