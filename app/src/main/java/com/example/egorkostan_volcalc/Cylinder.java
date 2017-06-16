package com.example.egorkostan_volcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cylinder extends Activity {

    private Button btnCloseCylinder, calcCylVol;

    private EditText txtHeigh, txtRadius;

    private TextView txtCylV;

    double h, r, vol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        btnCloseCylinder = (Button) findViewById(R.id.btnCloseCylinder);

        calcCylVol = (Button) findViewById(R.id.calcCylVol);

        txtHeigh = (EditText) findViewById(R.id.txtHeigh);

        txtRadius = (EditText) findViewById(R.id.txtRadius);

        txtCylV = (TextView) findViewById(R.id.txtCylV);


        calcCylVol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try{

                    h = Double.parseDouble(txtHeigh.getText().toString());

                    r = Double.parseDouble(txtRadius.getText().toString());

                    vol = Math.PI * Math.pow(r,2) * h;

                    txtCylV.setText(String.format("%.2f", vol));

                }catch(Exception ex){

                    txtCylV.setText("ERROR");
                    Toast.makeText(getBaseContext(),"Please enter all required values", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Event handler - close button
        btnCloseCylinder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Close the current view
                finish();
            }
        });
    }
}
