package com.example.qwerty;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txt_view = findViewById(R.id.txt_view);
        
        String getText = getIntent().getStringExtra("edt_qwerty");
        txt_view.setText(txt_view.getText().toString() + " " + getText);

    }
    @SuppressLint("NonConstantResourceId")
    public void back(View view){
        if (view.getId() == R.id.btn_second) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}