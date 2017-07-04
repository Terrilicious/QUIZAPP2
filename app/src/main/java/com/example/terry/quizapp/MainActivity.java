package com.example.terry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private ImageView next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next=(ImageView)findViewById(R.id.imageView9);
        next.setOnClickListener(this);
    }

     @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imageView9){
            Intent intent = new Intent(MainActivity.this, Main6Activity.class);
            startActivity(intent);


        }

    }
}
