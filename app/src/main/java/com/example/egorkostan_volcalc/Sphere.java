package com.example.egorkostan_volcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sphere extends Activity {

    private Button btnCloseSphere, calcSphere;
    private EditText txtRadius;
    private TextView txtSphereRes;

    double radius, sphereVol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        btnCloseSphere = (Button) findViewById(R.id.btnCloseSphere);
        calcSphere = (Button) findViewById(R.id.calcSphere);

        txtRadius = (EditText) findViewById(R.id.txtRadius);

        txtSphereRes = (TextView) findViewById(R.id.txtSphereRes);

        calcSphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    radius = Double.parseDouble(txtRadius.getText().toString());
                    sphereVol = (4.0/3.0) * Math.PI * Math.pow(radius,3);
                    txtSphereRes.setText(String.format("%.2f", sphereVol));
                }
                catch  (Exception ex){

                    txtSphereRes.setText("ERROR");
                    Toast.makeText(getBaseContext(),"Please enter all required values", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Event handler - close button
        btnCloseSphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Close the current view
                finish();
            }
        });
    }
}
