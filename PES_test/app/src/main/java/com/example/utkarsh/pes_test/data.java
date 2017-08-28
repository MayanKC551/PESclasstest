package com.example.utkarsh.pes_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
    }
    public void showGraph(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, graph.class);
        startActivity(intent);
    }
}
