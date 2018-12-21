package com.example.elisarus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trans extends AppCompatActivity {
    int[][] array1 = new int[3][4];
    int[][]  array2 = new int[array1[0].length][array1.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);

        Button button3 = (Button)(findViewById(R.id.button3));

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
int b = 1;
                EditText[][] edit = new EditText[array1.length][array1[0].length];
                for(int i = 0; i < array1.length; i++){
                    for(int k = 0; k < array1[0].length; k++){
                        int id = getResources().getIdentifier("editText"+b, "id", getPackageName());
                        edit[i][k] = findViewById(id);

                        b++;
                    }



                }


                int z = 0;
                TextView[][] text = new TextView[array1[0].length][array1.length];
                for(int i = 0; i < array2.length; i++){
                    for(int k = 0; k<array2[0].length; k++){
                        int id = getResources().getIdentifier("textView"+z, "id", getPackageName());
                        text[i][k] = findViewById(id);

                        z++;
                    }



                }


                for(int i = 0; i<array1.length; i++){
                    for(int k = 0; k<array1[0].length; k++){


                        array1[i][k] = Integer.parseInt(edit[i][k].getText().toString());




                    }
                }


                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1[0].length; j++) {
                        array2[j][i] = array1[i][j];



                    }
                }

                for(int i = 0; i<array2.length; i++){
                    for(int k = 0; k<array2[0].length; k++){


                        text[i][k].setText(Integer.toString(array2[i][k]));




                    }
                }





            /*    EditText edit1 = (EditText)(findViewById(R.id.editText1));
                EditText edit2 = (EditText)(findViewById(R.id.editText2));
                EditText edit3 = (EditText)(findViewById(R.id.editText3));
                EditText edit4 = (EditText)(findViewById(R.id.editText4));
                EditText edit5 = (EditText)(findViewById(R.id.editText5));
                EditText edit6 = (EditText)(findViewById(R.id.editText6));
                EditText edit7 = (EditText)(findViewById(R.id.editText7));
                EditText edit8 = (EditText)(findViewById(R.id.editText8));
                EditText edit9 = (EditText)(findViewById(R.id.editText9));
                EditText edit10 = (EditText)(findViewById(R.id.editText10));
                EditText edit11 = (EditText)(findViewById(R.id.editText11));
                EditText edit12 = (EditText)(findViewById(R.id.editText12));



                TextView text1 = (TextView)(findViewById(R.id.textView9));
                TextView text2 = (TextView)(findViewById(R.id.textView10));
                TextView text3 = (TextView)(findViewById(R.id.textView11));
                TextView text4 = (TextView)(findViewById(R.id.textView13));
                TextView text5 = (TextView)(findViewById(R.id.textView14));
                TextView text6 = (TextView)(findViewById(R.id.textView15));
                TextView text7 = (TextView)(findViewById(R.id.textView16));
                TextView text8 = (TextView)(findViewById(R.id.textView17));
                TextView text9 = (TextView)(findViewById(R.id.textView18));
                TextView text10 = (TextView)(findViewById(R.id.textView19));
                TextView text11 = (TextView)(findViewById(R.id.textView20));
                TextView text12 = (TextView)(findViewById(R.id.textView21));


                array1[0][0] = Integer.parseInt(edit1.getText().toString());
                array1[0][1] = Integer.parseInt(edit2.getText().toString());
                array1[0][2] = Integer.parseInt(edit3.getText().toString());
                array1[1][0] = Integer.parseInt(edit4.getText().toString());
                array1[1][1] = Integer.parseInt(edit5.getText().toString());
                array1[1][2] = Integer.parseInt(edit6.getText().toString());
                array1[2][0] = Integer.parseInt(edit7.getText().toString());
                array1[2][1] = Integer.parseInt(edit8.getText().toString());
                array1[2][2] = Integer.parseInt(edit9.getText().toString());
                array1[3][0] = Integer.parseInt(edit10.getText().toString());
                array1[3][1] = Integer.parseInt(edit11.getText().toString());
                array1[3][2] = Integer.parseInt(edit12.getText().toString());




                text1.setText(Integer.toString(array2[0][0]));
                text2.setText(Integer.toString(array2[0][1]));
                text3.setText(Integer.toString(array2[0][2]));
                text4.setText(Integer.toString(array2[0][3]));
                text5.setText(Integer.toString(array2[1][0]));
                text6.setText(Integer.toString(array2[1][1]));
                text7.setText(Integer.toString(array2[1][2]));
                text8.setText(Integer.toString(array2[1][3]));
                text9.setText(Integer.toString(array2[2][0]));
                text10.setText(Integer.toString(array2[2][1]));
                text11.setText(Integer.toString(array2[2][2]));
                text12.setText(Integer.toString(array2[2][3]));

*/





            }
        });



    }
}
