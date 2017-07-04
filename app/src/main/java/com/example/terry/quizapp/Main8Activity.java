package com.example.terry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main8Activity extends AppCompatActivity  implements View.OnClickListener{
private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        back=(ImageView) findViewById(R.id.imageView11);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.imageView11){

            Intent intent = new Intent(Main8Activity.this, Main6Activity.class);
            startActivity(intent);
        }

    }
}
