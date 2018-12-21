package com.example.elisarus.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   final public void newSum(View v){

        Intent newObj = new Intent(this, SUM.class);
        startActivity(newObj);
    }
    final public void newMult(View v){

        Intent newObj = new Intent(this, Multiply.class);
        startActivity(newObj);
    }
    final public void newTrans(View v){

        Intent newObj = new Intent(this, Trans.class);
        startActivity(newObj);
    }

    final public void newStepen(View v){

        Intent newObj = new Intent(this, Stepen.class);
        startActivity(newObj);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
