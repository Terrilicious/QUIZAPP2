package com.example.terry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton radq1, radq2, radq3, radq4, radq5,radq6,radq7,radq8,radq9,radq10;
    private Button answer, next, results;
    private EditText name;
    int score, score1, score2, score3, score4, score5,score6,score7,score8,score9,score10 = 0;
    Questions q = new Questions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        radq1 = (RadioButton) findViewById(R.id.radsouthernafrica);
        radq2 = (RadioButton) findViewById(R.id.radasia);
        radq3 = (RadioButton) findViewById(R.id.radindonesia);
        radq4 = (RadioButton) findViewById(R.id.radgarlic);
        radq5 = (RadioButton) findViewById(R.id.radiraq);
        radq6 = (RadioButton) findViewById(R.id.radegypt);
        radq7 = (RadioButton) findViewById(R.id.radeurope);
        radq8 = (RadioButton) findViewById(R.id.radginger);
        radq9 = (RadioButton) findViewById(R.id.radnorth);
        radq10 = (RadioButton) findViewById(R.id.radIndia);
        answer = (Button) findViewById(R.id.button5);
        next = (Button) findViewById(R.id.btnnext);
        results = (Button) findViewById(R.id.button4);
        name=(EditText)findViewById(R.id.edtname) ;

        answer.setOnClickListener(this);
        next.setOnClickListener(this);
        results.setOnClickListener(this);
    }

      @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button4) {
            q.setQ1(q.getCORRECT());
            q.setQ2(q.getINCORRECT());

            if (radq1.isChecked()) {

                score1 = (q.getCORRECT());

            } else {
                score1 = (q.getINCORRECT());

            }
            if (radq2.isChecked()) {

                score2 = (q.getCORRECT());
            } else {
                score2 = (q.getINCORRECT());

            }

            if (radq3.isChecked()) {

                score3 = (q.getCORRECT());
            } else {
                score3 = (q.getINCORRECT());
            }

            if (radq4.isChecked()) {

                score4 = (q.getCORRECT());
            } else {
                score4 = (q.getINCORRECT());
            }

            if (radq5.isChecked()) {

                score5 = (q.getCORRECT());
            } else {
                score5 = (q.getINCORRECT());
            }

            if (radq6.isChecked()) {

                score6 = (q.getCORRECT());
            } else {
                score5 = (q.getINCORRECT());
            }
            if (radq7.isChecked()) {

                score7 = (q.getCORRECT());
            } else {
                score7 = (q.getINCORRECT());
            }
            if (radq8.isChecked()) {

                score8 = (q.getCORRECT());
            } else {
                score8 = (q.getINCORRECT());
            }
            if (radq9.isChecked()) {

                score9= (q.getCORRECT());
            } else {
                score9 = (q.getINCORRECT());
            }
            if (radq10.isChecked()) {

                score10 = (q.getCORRECT());
            } else {
                score10 = (q.getINCORRECT());
            }


            answer.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);

            String names=name.getText().toString();
            if (names.isEmpty()) {
                Toast.makeText(Main3Activity.this, "Enter your name", Toast.LENGTH_SHORT).show();
            }
            else {

            }
                score = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;

            if (score > 7) {

                Toast.makeText(Main3Activity.this,"Dear " +names +" you scored: " + score + " out of 10 " + " Congrats!!! you passed ", Toast.LENGTH_SHORT).show();
            } else if (score < 7) {
                Toast.makeText(Main3Activity.this,"Dear " +names+ " you scored: " + score + " out of 10 " + "Sorry!!! you failed, view corrections ", Toast.LENGTH_SHORT).show();

            }
        } else if (v.getId() == R.id.button5) {
            Intent intent = new Intent(Main3Activity.this, Main5Activity.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.btnnext){

            Intent intent = new Intent(Main3Activity.this, Main7Activity.class);
            startActivity(intent);
        }

    }
}






