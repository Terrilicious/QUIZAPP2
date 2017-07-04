package com.example.terry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rad1, rad2, rad3, rad4, rad5, rad6, rad7, rad8, rad9, rad10;
    private EditText name;
    private Button answer, back, results;

    int score, score2, score3, score4, score5, score6, score7, score8, score9, score10, answr = 0;

    Questions q = new Questions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        rad1 = (RadioButton) findViewById(R.id.rad100000y);
        rad2 = (RadioButton) findViewById(R.id.rad1994);
        rad3 = (RadioButton) findViewById(R.id.radmandela);
        rad4 = (RadioButton) findViewById(R.id.radjune1976);
        rad5 = (RadioButton) findViewById(R.id.radvanree);
        rad6 = (RadioButton) findViewById(R.id.radButhelezi);
        rad7 = (RadioButton) findViewById(R.id.radJulies);
        rad8 = (RadioButton) findViewById(R.id.radTranval);
        rad9 = (RadioButton) findViewById(R.id.rad1866);
        rad10 = (RadioButton) findViewById(R.id.radEmily);
        name = (EditText) findViewById(R.id.edtname);
        answer = (Button) findViewById(R.id.btntry);
        back = (Button) findViewById(R.id.button2);
        results = (Button) findViewById(R.id.button);


        answer.setOnClickListener(this);
        back.setOnClickListener(this);
        results.setOnClickListener(this);
    }


      @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
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
            String names = name.getText().toString();
            if (names.isEmpty()) {
                Toast.makeText(Main2Activity.this, "Enter your name", Toast.LENGTH_SHORT).show();
            }
            else {


            }

            answr = score + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
            if (answr > 7) {
                Toast.makeText(Main2Activity.this, " Dear " + names  + " You scored " + answr + " out of 10" + " Congrats!!! You passed ", Toast.LENGTH_SHORT).show();
            } else if (answr < 7) {
                Toast.makeText(Main2Activity.this, " Dear " + names  + " You scored " + answr + " out of 10 " + " Sorry!!! You failed,view corrections", Toast.LENGTH_SHORT).show();

            }

            score = 0;
            answer.setVisibility(View.VISIBLE);
            back.setVisibility(View.VISIBLE);

        } else if (v.getId() == R.id.button2) {
            Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
            startActivity(intent);


        } else if (v.getId() == R.id.btntry) {
            Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
            startActivity(intent);

        }

        }

        }





