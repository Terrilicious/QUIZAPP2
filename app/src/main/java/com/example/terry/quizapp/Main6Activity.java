package com.example.terry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {
private ImageView mandela,food,logo;
    private Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mandela=(ImageView)findViewById(R.id.imageView4);
        food=(ImageView)findViewById(R.id.imageView5);
        logo=(ImageView)findViewById(R.id.imageView8);
        exit=(Button)findViewById(R.id.button3);


        mandela.setOnClickListener(this);
        food.setOnClickListener(this);
        logo.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

         @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageView4){

            Intent intent = new Intent(Main6Activity.this, Main2Activity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.imageView5){
            Intent intent = new Intent(Main6Activity.this, Main3Activity.class);
            startActivity(intent);
        }

      else if(v.getId()==R.id.imageView8) {
            Intent intent = new Intent(Main6Activity.this, Main7Activity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.button3){
            finish();
        }

    }
}

