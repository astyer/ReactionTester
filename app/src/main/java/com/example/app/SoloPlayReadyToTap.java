package com.example.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.app.Global.selectedColor;
import static com.example.app.R.drawable.blue;
import static com.example.app.R.drawable.choingface;
import static com.example.app.R.drawable.green;
import static com.example.app.R.drawable.lblue;
import static com.example.app.R.drawable.lgreen;
import static com.example.app.R.drawable.orange;
import static com.example.app.R.drawable.purple;
import static com.example.app.R.drawable.rainbowback;
import static com.example.app.R.drawable.bluelightning;
import static com.example.app.R.drawable.red;
import static com.example.app.R.drawable.yellow;

public class SoloPlayReadyToTap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_play_ready_to_tap);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Global.soloStartTime = System.nanoTime();
        goToSoloResults();
    }

    public void goToSoloResults() {
        ImageButton toResults = (ImageButton) findViewById(R.id.SoloPink);
        if(selectedColor.equals("red"))
        {
            toResults.setImageResource(red);
        }
        if(selectedColor.equals("orange"))
        {
            toResults.setImageResource(orange);
        }
        if(selectedColor.equals("yellow"))
        {
            toResults.setImageResource(yellow);
        }
        if(selectedColor.equals("green"))
        {
            toResults.setImageResource(green);
        }
        if(selectedColor.equals("blue"))
        {
            toResults.setImageResource(blue);
        }
        if(selectedColor.equals("purple"))
        {
            toResults.setImageResource(purple);
        }
        if(selectedColor.equals("lblue"))
        {
            toResults.setImageResource(lblue);
        }
        if(selectedColor.equals("lgreen"))
        {
            toResults.setImageResource(lgreen);
        }
        if(selectedColor.equals("rainbow"))
        {
            toResults.setImageResource(rainbowback);
        }
        if(selectedColor.equals("lightning"))
        {
            toResults.setImageResource(bluelightning);
        }
        if(selectedColor.equals("choing"))
        {
            toResults.setImageResource(choingface);
        }
        toResults.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double endTime = System.nanoTime();
                Intent intent = new Intent(SoloPlayReadyToTap.this, SoloResults.class);
                intent.putExtra("endTime", endTime);
                startActivity(intent);
            }
        });
    }
}