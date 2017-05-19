package com.example.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SoloPlayReadyToTap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_play_ready_to_tap);
        Global.soloStartTime = System.nanoTime();
        goToSoloResults();
    }

    public void goToSoloResults() {
        ImageButton toResults = (ImageButton) findViewById(R.id.SoloPink);
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