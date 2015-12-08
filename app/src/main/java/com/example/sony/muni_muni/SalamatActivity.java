package com.example.sony.muni_muni;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.Toast;

public class SalamatActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salamat);

        //USER INPUT AND ANSWER BUTTON

        final Button answerbutton = (Button) findViewById(R.id.answer);
        answerbutton.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                EditText answer = (EditText) findViewById(R.id.editText);
                String str = answer.getText().toString();
                String correctAnswer = "salamat";

                if (correctAnswer.equalsIgnoreCase(str)) {
                    Toast.makeText(SalamatActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                    finish();
                } else {
                    Toast.makeText(SalamatActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final Button btnOpenPopup1 = (Button)findViewById(R.id.openpopup1);
        final Button btnOpenPopup2 = (Button)findViewById(R.id.openpopup2);


        btnOpenPopup1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater1
                        = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);

                View popupView1 = layoutInflater1.inflate(R.layout.salamat_definition_popup, null);
                final PopupWindow popupWindow1 = new PopupWindow(popupView1, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView1.findViewById(R.id.dismiss1);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow1.dismiss();
                    }
                });

                popupWindow1.showAsDropDown(btnOpenPopup1, 50, -30);

            }
        });


        btnOpenPopup2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater2
                        = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);

                View popupView2 = layoutInflater2.inflate(R.layout.salamat_singkahulugan_popup, null);
                final PopupWindow popupWindow2 = new PopupWindow(popupView2, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView2.findViewById(R.id.dismiss2);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow2.dismiss();
                    }
                });

                popupWindow2.showAsDropDown(btnOpenPopup2, 50, -30);

            }
        });
    };
}
