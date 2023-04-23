package com.example.tp3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class domotique extends AppCompatActivity
{
    private Snackbar snack;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domotique);
        Button apply = findViewById(R.id.apply);
        apply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                snack = Snackbar.make(findViewById(android.R.id.content), "Changements Appliqués", Snackbar.LENGTH_SHORT);
                snack.show();
            }
        });
    }
}
