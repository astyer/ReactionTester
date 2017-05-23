package com.example.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VsPlayReadyToTap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_play_ready_to_tap);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Global.vsStartTime = System.nanoTime();
        goToSoloResultsP1();
        goToSoloResultsP2();
    }

    public void goToSoloResultsP1() {
        ImageButton toResults = (ImageButton) findViewById(R.id.vsPink1);
        toResults.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double endTime = System.nanoTime();
                Intent intent = new Intent(VsPlayReadyToTap.this, VsResults1.class);
                intent.putExtra("endTime", endTime);
                startActivity(intent);
            }
        });
    }

    public void goToSoloResultsP2() {
        ImageButton toResults = (ImageButton) findViewById(R.id.VsPink2);
        toResults.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double endTime = System.nanoTime();
                Intent intent = new Intent(VsPlayReadyToTap.this, VsResults2.class);
                intent.putExtra("endTime", endTime);
                startActivity(intent);
            }
        });
    }
}
