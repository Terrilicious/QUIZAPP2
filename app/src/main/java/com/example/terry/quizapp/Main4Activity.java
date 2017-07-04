package com.example.terry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
private ImageView menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        menu=(ImageView)findViewById(R.id.imageView6);
        menu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.imageView6){
            Intent intent =new Intent(Main4Activity.this,Main6Activity.class);
            startActivity(intent);

        }

    }
}
