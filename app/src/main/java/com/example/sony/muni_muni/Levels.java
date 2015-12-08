package com.example.sony.muni_muni;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Levels extends Activity {

    String[] levels = {"Level 1",
            "Level 2",
            "Level 3",
            "Level 4",
            "Level 5"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        final Button submitbutton = (Button) findViewById(R.id.buttonsubmit);
        submitbutton.setOnClickListener(new Button.OnClickListener() {

                                            @Override
                                            public void onClick(View arg0) {
                                                Intent intent = new Intent(Levels.this, RankingsActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                ArrayAdapter < String > adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, levels);
                ListView list = (ListView) findViewById(R.id.listView);
                list.setAdapter(adapter);

                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        switch (position) {
                            case 0:
                                Intent goToLevel1 = new Intent(Levels.this, Level1.class);
                                startActivity(goToLevel1);
                                break;

                            case 1:
                                Intent goToLevel2 = new Intent(Levels.this, Level2.class);
                                startActivity(goToLevel2);
                                break;

                            case 2:
                                Intent goToLevel3 = new Intent(Levels.this, Level3.class);
                                startActivity(goToLevel3);
                                break;

                            case 3:
                                Intent goToLevel4 = new Intent(Levels.this, Level4.class);
                                startActivity(goToLevel4);
                                break;

                            case 4:
                                Intent goToLevel5 = new Intent(Levels.this, Level5.class);
                                startActivity(goToLevel5);
                                break;
                        }
                    }
                });

            }

        }
