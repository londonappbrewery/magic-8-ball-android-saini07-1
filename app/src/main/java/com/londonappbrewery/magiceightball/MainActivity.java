package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollbutton;
        rollbutton=(Button)findViewById(R.id.rollbutton);
        final ImageView magicball=(ImageView)findViewById(R.id.magicball);
        final int[] magicballarray={R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        rollbutton.setOnClickListener(new View.OnClickListener(){
       @Override
        public void onClick(View v){
           Log.d("magicball","the button has pressed!");
           Random randomNumberGenerator=new Random();
           int ballnumber=randomNumberGenerator.nextInt(5);
           Log.d("magicball","the random number is:"+ballnumber);
           magicball.setImageResource(magicballarray[ballnumber]);
           ballnumber=randomNumberGenerator.nextInt(5);
       }
    });
}}
