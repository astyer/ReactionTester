package com.example.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.example.app.Global.arcadeCounter;
import static com.example.app.Global.notStarted;

public class ArcadePlayReadyToTap8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcade_play_ready_to_tap8);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        if(notStarted)
        {
            Global.arcadeStartTime = System.nanoTime();
            notStarted = false;
        }
        goToNext();
    }

    public void goToNext() {
        ImageButton toNext = (ImageButton) findViewById(R.id.arcadePink);
        toNext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                arcadeCounter++;
                if(arcadeCounter > 9)
                {
                    arcadeCounter = 0;
                    double endTime = System.nanoTime();
                    Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadeResults.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    intent.putExtra("endTime", endTime);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else
                {
                    int r = (int)(Math.random() * 9);
                    if(r == 0)
                    {
                        Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadePlayReadyToTap1.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                    else if(r == 1)
                    {
                        Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadePlayReadyToTap2.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                    else if(r == 2)
                    {
                        Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadePlayReadyToTap3.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                    else if(r == 3)
                    {
                        Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadePlayReadyToTap4.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                    else if(r == 4)
                    {
                        Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadePlayReadyToTap5.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                    else if(r == 5)
                    {
                        Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadePlayReadyToTap6.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                    else if(r == 6)
                    {
                        Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadePlayReadyToTap7.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                    else if(r == 7)
                    {
                        Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadePlayReadyToTap9.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                    else if(r == 8)
                    {
                        Intent intent = new Intent(ArcadePlayReadyToTap8.this, ArcadePlayReadyToTap10.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                }

            }
        });
    }
}
