package com.example.elisarus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


import org.w3c.dom.Text;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.List;


class SUM extends AppCompatActivity {
    int [][] array1 = new int[2][2];
    int [][] array2 = new int[2][2];
    int[][] array3 = new int[2][2];


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

      final TextView soska = findViewById(R.id.sosaka);



        final Spinner spinner = (Spinner) (findViewById(R.id.spinner));
        int HOLD = spinner.getSelectedItemPosition() + 1 ;
        String Hold = String.valueOf(HOLD);



        Button button2 = (Button) (findViewById(R.id.button2));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View klick2) {
                int HOLD = spinner.getSelectedItemPosition() + 1 ;
                String Hold = String.valueOf(HOLD);
                switch (HOLD) {
                    case 1:
                        soska.setText(Hold);
                        break;

                    case 2:
                        soska.setText(Hold);
                        break;

                    case 3:
                        soska.setText(Hold);
                        break;

                    case 4:
                        soska.setText(Hold);
                        break;
                    default:

                        break;

                }





            }

        });



        Button button = (Button) (findViewById(R.id.button));




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klick) {


                TextView[][] text = new TextView[2][2];

                EditText[][] edit1 = new EditText[2][2];
                EditText[][] edit2 = new EditText[2][2];
                String[] editArray = new String[8];
                String[] textArray = new String[4];



                for(int k = 0; k < textArray.length; k++){
                    textArray[k] = "text"+k;

                }


                for(int k = 0; k<editArray.length; k++){
                    editArray[k] = "editText"+k;

                }




                ////////////////////////////////////////////
                int z = 0;
                for(int i=0; i < text.length; i++){
                    for(int k=0; k < text[0].length; k++) {

                        int id = getResources().getIdentifier("textView" + z, "id", getPackageName());
                        text[i][k] = findViewById(id);
                        z++;
                    }


                }


                int b = 0;
                for(int i = 0; i<edit1.length; i++){  ////////////// Edit1 Array (0-3)
                    for(int k = 0; k< edit1[0].length; k++){



                    int id = getResources().getIdentifier("editText" + b, "id", getPackageName());
                    edit1[i][k] = findViewById(id);

                    b++;
                }
                }



                /////////////////////////////////////////

                int c = 4;
                for(int i = 0; i<edit2.length; i++){  ////////////// Edit2 Array (4-7)
                    for(int k = 0; k< edit2[0].length; k++){



                        int id = getResources().getIdentifier("editText" + c, "id", getPackageName());
                        edit2[i][k] = findViewById(id);

                        c++;
                    }
                }








                for(int i = 0; i<array1.length; i++) {
                    for (int k = 0; k < array1[0].length; k++) {

                        array1[i][k] = Integer.parseInt(edit1[i][k].getText().toString());


                    }
                }

                for(int i = 0; i < array1.length; i++) {
                    for(int k=0; k<array1[0].length; k++){

                        array2[i][k] = Integer.parseInt(edit2[i][k].getText().toString());

                    }
                }


                for(int x = 0; x < array1.length; x++){
                    for(int i = 0; i < array1[0].length; i++){
                        array3[x][i] = array1[x][i] + array2[x][i];


                    }
                }
                for(int x = 0; x < array3.length; x++){
                    for(int i = 0; i < array3[0].length; i++){

                        text[x][i].setText(Integer.toString(array3[x][i]));


                    }
                }


















            }

        });





        }




















    }






