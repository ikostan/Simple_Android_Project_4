package com.example.egorkostan_volcalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    //Radio group
    private RadioGroup radioGroup;
    //Radio buttons
    //private RadioButton radioCube, radioSphere, radioCylinder;
    //Go button
    private Button btnGo;

    Intent newIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        btnGo = (Button) findViewById(R.id.btnGo);

        //Event handler
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(radioGroup.getCheckedRadioButtonId() == R.id.radioCube){

                    newIntent = new Intent(MainActivity.this, Cube.class);
                }
                else if(radioGroup.getCheckedRadioButtonId() == R.id.radioSphere){

                    newIntent = new Intent(MainActivity.this, Sphere.class);
                }
                else if(radioGroup.getCheckedRadioButtonId() == R.id.radioCylinder){

                    newIntent = new Intent(MainActivity.this, Cylinder.class);
                }

                try{

                    startActivity(newIntent);
                }
                catch(Exception ex){

                    Toast.makeText(getApplicationContext(), "Please choose one of the options first", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
