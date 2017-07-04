package com.example.terry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rad1, rad2, rad3, rad4, rad5, rad6, rad7, rad8, rad9, rad10;
    private Button done, cancel, corrections;
    private EditText name;

    int score, score1, score2, score3, score4, score5, score6, score7, score8, score9, score10;
    Questions q = new Questions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        rad1 = (RadioButton) findViewById(R.id.radapple);
        rad2 = (RadioButton) findViewById(R.id.radBMW);
        rad3 = (RadioButton) findViewById(R.id.radsprite);
        rad4 = (RadioButton) findViewById(R.id.radvolkswagen);
        rad5 = (RadioButton) findViewById(R.id.radnike);
        rad6 = (RadioButton) findViewById(R.id.radvodacom);
        rad7 = (RadioButton) findViewById(R.id.radmcdonald);
        rad8 = (RadioButton) findViewById(R.id.radadidas);
        rad9 = (RadioButton) findViewById(R.id.radmcdonald);
        rad10 = (RadioButton) findViewById(R.id.radkfc);
        cancel = (Button) findViewById(R.id.btncancel);
        done = (Button) findViewById(R.id.btndone);
        corrections = (Button) findViewById(R.id.btncorrections);
        name=(EditText) findViewById(R.id.edtname);


        done.setOnClickListener(this);
        cancel.setOnClickListener(this);
        corrections.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btndone) {
            q.setQ1(q.getCORRECT());
            q.setQ2(q.getINCORRECT());


            if (rad1.isChecked()) {

                score = (q.getCORRECT());

            } else {
                score = (q.getINCORRECT());

            }
            if (rad2.isChecked()) {

                score2 = (q.getCORRECT());
            } else {
                score2 = (q.getINCORRECT());

            }

            if (rad3.isChecked()) {

                score3 = (q.getCORRECT());
            } else {
                score3 = (q.getINCORRECT());
            }
            if (rad4.isChecked()) {

                score4 = (q.getCORRECT());
            } else {
                score4 = (q.getINCORRECT());
            }

            if (rad5.isChecked()) {

                score5 = (q.getCORRECT());
            } else {
                score5 = (q.getINCORRECT());
            }
            if (rad6.isChecked()) {

                score6 = (q.getCORRECT());
            } else {
                score6 = (q.getINCORRECT());
            }

            if (rad7.isChecked()) {

                score7 = (q.getCORRECT());
            } else {
                score7 = (q.getINCORRECT());
            }

            if (rad8.isChecked()) {

                score8 = (q.getCORRECT());
            } else {
                score8 = (q.getINCORRECT());

            }
            if (rad9.isChecked()) {

                score9 = (q.getCORRECT());
            } else {
                score9 = (q.getINCORRECT());
            }

            if (rad10.isChecked()) {

                score10 = (q.getCORRECT());
            } else {
                score10 = (q.getINCORRECT());
            }
            String names=name.getText().toString();
            if (names.isEmpty()) {
                Toast.makeText(Main7Activity.this, "Enter your name", Toast.LENGTH_SHORT).show();

            }
                    score = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;



            if (score > 7) {
                Toast.makeText(Main7Activity.this," Dear " + names +" You scored: " + score + " out of 10 " + " Congrats!! You passed ", Toast.LENGTH_SHORT).show();
            } else if (score < 7) {
                Toast.makeText(Main7Activity.this,"Dear "+ names + " You scored:" + score + " out of 10 " + " Sorry!! You failed", Toast.LENGTH_SHORT).show();

                corrections.setVisibility(View.VISIBLE);
                cancel.setVisibility(View.VISIBLE);


            }

        } else if (v.getId() == R.id.btncorrections) {
            Intent intent = new Intent(Main7Activity.this, Main8Activity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.btncancel) {

            Intent intent = new Intent(Main7Activity.this, Main6Activity.class);
            startActivity(intent);
        }
    }
}

