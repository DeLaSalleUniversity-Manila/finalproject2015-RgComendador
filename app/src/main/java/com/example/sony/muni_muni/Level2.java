package com.example.sony.muni_muni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Level2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        ImageButton btn7 = (ImageButton)findViewById(R.id.imageButton7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, OperaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn8 = (ImageButton)findViewById(R.id.imageButton8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, PatayActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn9 = (ImageButton)findViewById(R.id.imageButton9);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, PikonActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn10 = (ImageButton)findViewById(R.id.imageButton10);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, AbubotActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn11 = (ImageButton)findViewById(R.id.imageButton11);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, BahaghariActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn12 = (ImageButton)findViewById(R.id.imageButton12);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, PooksapotActivity.class);
                startActivity(intent);
            }
        });


    }

}
