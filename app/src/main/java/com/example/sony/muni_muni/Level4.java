package com.example.sony.muni_muni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Level4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);

        ImageButton btn19 = (ImageButton)findViewById(R.id.imageButton19);

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, BalintiyakActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn20 = (ImageButton)findViewById(R.id.imageButton20);

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, SalamatActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn21 = (ImageButton)findViewById(R.id.imageButton21);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, UnanActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn22 = (ImageButton)findViewById(R.id.imageButton22);

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GigilActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn23 = (ImageButton)findViewById(R.id.imageButton23);

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, LikhaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn24 = (ImageButton)findViewById(R.id.imageButton24);

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, DugongbughawActivity.class);
                startActivity(intent);
            }
        });


    }

}
