package com.example.utkarsh.pes_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showData(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, data.class);
        startActivity(intent);
    }
}
