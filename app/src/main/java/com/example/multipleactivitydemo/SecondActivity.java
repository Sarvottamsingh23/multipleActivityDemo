package com.example.multipleactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    public  void goToFirst(View view){
        //Intent intent= new Intent(getApplicationContext(), MainActivity.class);
        //startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        int age=intent.getIntExtra("Blood Group",0);
        Toast.makeText(this,"Hey Sarvottam. Your Blood Group is B+",Toast.LENGTH_LONG).show();
    }
}
