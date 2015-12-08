package com.example.sony.muni_muni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Level3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        ImageButton btn13 = (ImageButton)findViewById(R.id.imageButton13);

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, IlalimActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn14 = (ImageButton)findViewById(R.id.imageButton14);

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GunitaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn15 = (ImageButton)findViewById(R.id.imageButton15);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, MakisigActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn16 = (ImageButton)findViewById(R.id.imageButton16);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, BisperasActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn17 = (ImageButton)findViewById(R.id.imageButton17);

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, IndakActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn18 = (ImageButton)findViewById(R.id.imageButton18);

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, DiskwentoActivity.class);
                startActivity(intent);
            }
        });


    }

}
