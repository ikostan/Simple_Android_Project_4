package com.example.egorkostan_volcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cube extends Activity {

    private Button btnCloseCube, btnCalcCube;
    private TextView txtCubeV;
    private EditText txtH;
    double  h, CubeVol;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        btnCalcCube= (Button) findViewById(R.id.btnCalcCube);
        btnCloseCube = (Button) findViewById(R.id.btnCloseCube);
        txtCubeV = (TextView) findViewById(R.id.txtCubeV);
        txtH = (EditText) findViewById(R.id.txtH);

        //Calculate button event handler
        btnCalcCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    h = Double.parseDouble(txtH.getText().toString());
                    //Volume formula
                    CubeVol = Math.pow(h, 3);
                    txtCubeV.setText(String.format("%.2f", CubeVol));

                }
                catch(Exception ex){
                    txtCubeV.setText("ERROR");
                    Toast.makeText(getBaseContext(),"Please enter all required values", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //Close button evenet handler
        btnCloseCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}
