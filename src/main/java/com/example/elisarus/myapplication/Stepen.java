package com.example.elisarus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;

public class Stepen extends AppCompatActivity {
int x =4, y = 4, n = 4, c = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepen);

        Button button = (Button)(findViewById(R.id.button4));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


int array1[][] = new int[x][y];
int array2[][] = new int[n][c];
                EditText[][] edit = new EditText[array1.length][array1[0].length];
                TextView[][] text = new TextView[array1.length][array1[0].length];
                int u = 0, z = 0;
                for(int i = 0; i < array1.length; i++){
                    for(int k = 0; k < array1[0].length; k++){
                        int id = getResources().getIdentifier("editText"+u, "id", getPackageName());
                        edit[i][k] = findViewById(id);

                        u++;
                    }



                }



                for(int i = 0; i < array2.length; i++){
                    for(int k = 0; k < array2[0].length; k++){
                        int id = getResources().getIdentifier("textView"+z, "id", getPackageName());
                        text[i][k] = findViewById(id);

                        z++;
                    }



                }

                for(int i = 0; i < array1.length; i++){
                    for(int k = 0; k < array1[0].length; k++){

                        array1[i][k] = Integer.parseInt(edit[i][k].getText().toString());

                    }


                }



                array2 = array1;
                int[][] array3 = new int[4][4];
                for(int e=0; e<2; e++) {
                    for (int k = 0; k < array1.length; k++) {
                        for (int i = 0; i < array2[0].length; i++) {
                            for (int n = 0; n < array1[0].length; n++) {

                                array3[k][i] += array1[k][n] * array2[n][i];


                            }
                        }

                    }
                }


                for (int i = 0; i < array3.length; i++) {
                        for(int k = 0; k < array3[0].length; k++){

                            text[i][k].setText(Integer.toString(array3[i][k]));


                        }

                    }





            }
        });




    }
}

