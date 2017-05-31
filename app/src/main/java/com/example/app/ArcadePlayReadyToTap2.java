package com.example.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.example.app.Global.arcadeCounter;
import static com.example.app.Global.notStarted;

public class ArcadePlayReadyToTap2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcade_play_ready_to_tap2);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        if(notStarted)
        {
            Global.arcadeStartTime = System.nanoTime();
            notStarted = false;
        }
        arcadeCounter++;
        goToNext();
    }

    public void goToNext() {
        ImageButton toNext = (ImageButton) findViewById(R.id.arcadePink);
        toNext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(arcadeCounter > 1)
                {
                    double endTime = System.nanoTime();
                    Intent intent = new Intent(ArcadePlayReadyToTap2.this, ArcadeResults.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    intent.putExtra("endTime", endTime);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                int r = (int)(Math.random() * 1);
                if(r == 0)
                {
                    Intent intent = new Intent(ArcadePlayReadyToTap2.this, ArcadePlayReadyToTap1.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                /*else if(r == 1)
                {
                    Intent intent = new Intent(ArcadePlayReadyToTap1.this, ArcadePlayReadyToTap3.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }*/

            }
        });
    }
}
