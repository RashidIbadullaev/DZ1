package com.example.qwerty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edt_qwerty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_qwerty = findViewById(R.id.edt_qwerty);

    }

    public void goNewView (View view){
        if (view.getId() == R.id.btn_qwerty) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("edt_qwerty", edt_qwerty.getText().toString());
            startActivity(intent);
        }
    }

}