package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity
{


    private Snackbar snack;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domotique);
       /* Button homeApp = findViewById(R.id.appButton);
        homeApp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, domotique.class);
                startActivity(intent);
            }
        });*/
        //Button save = findViewById(R.id.save);
        /*save.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                snack = Snackbar.make(findViewById(android.R.id.content), "Evenement Enrégistré", Snackbar.LENGTH_SHORT);
                snack.show();
            }
        });*/

    }
}
