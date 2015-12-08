package com.example.sony.muni_muni;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class RankingsActivity extends Activity {

    public static final String DATABASE_NAME = "highscores.db";
    public static final String HIGH_SCORE_TABLE = "highscore";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_SCORE = "SCORE";
    public static final String COLUMN_NAME = "NAME";

    private SQLiteDatabase scoreDB;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rankings);

        final EditText editTextName = (EditText) findViewById(R.id.editTextName);
        final EditText editTextScore = (EditText) findViewById(R.id.editTextHighScore);
        final WebView webview = (WebView) findViewById(R.id.webview);

        Button saveHighScore = (Button) findViewById(R.id.buttonSaveHighScore);
        saveHighScore.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                String name = editTextName.getText().toString();
                int score = 0;

                try {
                    score = Integer
                            .parseInt(editTextScore.getText().toString());
                } catch (NumberFormatException e) {
                    return;
                }

                ContentValues values = new ContentValues();
                values.put(COLUMN_NAME, name);
                values.put(COLUMN_SCORE, score);
                scoreDB.insert(HIGH_SCORE_TABLE, null, values);


                Cursor c = scoreDB.query(HIGH_SCORE_TABLE, new String[]{
                                COLUMN_NAME, COLUMN_SCORE}, null, null, null, null,
                        COLUMN_SCORE);

                StringBuilder builder = new StringBuilder();
                builder.append("<html><body><h1>High Scores</h1><table>");

                c.moveToLast();
                for (int i = c.getCount() - 1; i >= 0; i--) {

                    builder.append("<tr><td>");
                    builder.append(c.getString(0));
                    builder.append("</td><td>");
                    builder.append(c.getString(1));
                    builder.append("</td></tr>");

                    c.moveToPrevious();
                }

                builder.append("</table></html>");
                webview.loadData(builder.toString(), "text/html", "UTF-8");

                c.close();

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        scoreDB = openOrCreateDatabase(DATABASE_NAME,
                SQLiteDatabase.CREATE_IF_NECESSARY
                        | SQLiteDatabase.OPEN_READWRITE, null);
        scoreDB.execSQL("CREATE TABLE IF NOT EXISTS " + HIGH_SCORE_TABLE + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY, " + COLUMN_NAME
                + " VARCHAR, " + COLUMN_SCORE + " INT)");
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (scoreDB.isOpen()) {
            scoreDB.close();
        }

    }
}