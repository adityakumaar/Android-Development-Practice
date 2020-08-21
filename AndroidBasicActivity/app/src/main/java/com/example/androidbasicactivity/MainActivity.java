package com.example.androidbasicactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find button1 by its ID
        this.button1 = (Button) this.findViewById(R.id.button1);

        //Find button2 by its ID
        this.button2 = (Button) this.findViewById(R.id.button2);

        //Find button3 by its ID
        this.button3 = (Button) this.findViewById(R.id.button3);

        //Find button4 by its ID
        this.button4 = (Button) this.findViewById(R.id.button4);

        //Find button5 by its ID
        this.button5 = (Button) this.findViewById(R.id.button5);

        //Called when user clicks the button1
        button1.setOnClickListener (new Button.OnClickListener(){

            @Override
            public void onClick(View v){
                //Create an Intent
                //This object contains content that will be sent to Example1 Activity
                Intent myIntent = new Intent(MainActivity.this, Example1Activity.class);

                //Put parameters
                myIntent.putExtra("text1", "This is text1 sent from MainActivity at " +new Date());
                myIntent.putExtra("text2", "This is text2 sent from MainActivity at " +new Date());

                //Start Example1Activity
                MainActivity.this.startActivity(myIntent);
            }
        });

        //Called when user clicks button2
        button2.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v){
                //Create an Intent
                //This object contains content that will be sent to Example2 Activity
                Intent myIntent = new Intent(MainActivity.this, Example2Activity.class);

                //Start Example2Activity
                MainActivity.this.startActivity(myIntent);
            }
        });

        //Called when user clicks button3
        button3.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v){
                //Create an Intent
                //This object contains content that will be sent to Example3 Activity
                Intent myIntent = new Intent(MainActivity.this, Example3Activity.class);

                //Start Example2Activity
                MainActivity.this.startActivity(myIntent);
            }
        });

        //Called when user clicks button4
        button4.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v){
                //Create an Intent
                //This object contains content that will be sent to Example4 Activity
                Intent myIntent = new Intent(MainActivity.this, Example4Activity.class);

                //Start Example2Activity
                MainActivity.this.startActivity(myIntent);
            }
        });

        //Called when user clicks button5
        button5.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v){
                //Create an Intent
                //This object contains content that will be sent to Example5 Activity
                Intent myIntent = new Intent(MainActivity.this, Example5Activity.class);

                //Start Example2Activity
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}