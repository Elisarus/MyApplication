package com.example.elisarus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

class Multiply extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply);


        Button multiply = (Button)(findViewById(R.id.multiply));

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int x = 2, y = 3;
                int a =3, b = 2;
                int [][] array1 = new int[x][y];
                int [][] array2 = new int[a][b];
                int[][] array3 = new int[x][b];


                EditText edit1[][] = new EditText[x][y];
                EditText edit2[][] = new EditText[a][b];
                TextView text[][] = new TextView[x][b];
int t = 0;
                for(int i = 0; i<text.length; i++){
                    for(int k = 0; k<text[0].length; k++){

                        int id = getResources().getIdentifier("textView" + t, "id", getPackageName());
                        text[i][k] = findViewById(id);


                        t++;


                    }
                }






                int j = 0;
                for(int i = 0; i<edit1.length; i++){
                    for(int k = 0; k<edit1[0].length; k++){

                        int id = getResources().getIdentifier("editText" + j, "id", getPackageName());
                        edit1[i][k] = findViewById(id);


                        j++;


                    }
                }

int g = 6;
                for(int i = 0; i<edit2.length; i++){
                    for(int k = 0; k<edit2[0].length; k++){

                        int id = getResources().getIdentifier("editText" + g, "id", getPackageName());
                        edit2[i][k] = findViewById(id);


                        g++;


                    }
                }

                for(int i = 0; i<array1.length; i++){
                    for(int k = 0; k<array1[0].length; k++){


                        array1[i][k] = Integer.parseInt(edit1[i][k].getText().toString());




                    }
                }


                for(int i = 0; i<array2.length; i++){
                    for(int k = 0; k<array2[0].length; k++){


                        array2[i][k] = Integer.parseInt(edit2[i][k].getText().toString());




                    }
                }






                for (int k = 0; k < array1.length; k++) {
                    for (int i = 0; i < array2[0].length; i++) {
                        for(int n=0; n < array1[0].length; n++) {

                            array3[k][i] += array1[k][n]*array2[n][i];


                        }
                    }

                }


                for(int i = 0; i<array3.length; i++){
                    for(int k = 0; k<array3[i].length; k++){


                        text[i][k].setText(Integer.toString(array3[i][k]));




                    }
                }







            }
        });


    }
}
