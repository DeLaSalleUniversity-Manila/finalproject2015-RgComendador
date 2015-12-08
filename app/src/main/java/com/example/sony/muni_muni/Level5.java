package com.example.sony.muni_muni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Level5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);

        ImageButton btn25 = (ImageButton)findViewById(R.id.imageButton25);

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, AlsaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn26 = (ImageButton)findViewById(R.id.imageButton26);

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, PamamalakadActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn27 = (ImageButton)findViewById(R.id.imageButton27);

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, PasmaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn28 = (ImageButton)findViewById(R.id.imageButton28);

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, SalumpuwitActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn29 = (ImageButton)findViewById(R.id.imageButton29);

        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, TakipsilimActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn30 = (ImageButton)findViewById(R.id.imageButton30);

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, TampoActivity.class);
                startActivity(intent);
            }
        });


    }

}
