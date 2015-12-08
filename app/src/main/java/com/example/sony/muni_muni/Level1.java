package com.example.sony.muni_muni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        ImageButton btn1 = (ImageButton)findViewById(R.id.imageButton1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, DagatActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn2 = (ImageButton)findViewById(R.id.imageButton2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, PambahayActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn3 = (ImageButton)findViewById(R.id.imageButton3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, KasoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn4 = (ImageButton)findViewById(R.id.imageButton4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, PanisActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn5 = (ImageButton)findViewById(R.id.imageButton5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, BalahiboActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn6 = (ImageButton)findViewById(R.id.imageButton6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, AbotActivity.class);
                startActivity(intent);
            }
        });


    }

}
