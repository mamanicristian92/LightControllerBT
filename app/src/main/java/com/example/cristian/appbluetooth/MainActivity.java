package com.example.cristian.appbluetooth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button conectarBT;
    Button letfButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //enlazar los controles con sus respectivos views
        conectarBT = (Button) findViewById(R.id.buttonBT);

    }
}
