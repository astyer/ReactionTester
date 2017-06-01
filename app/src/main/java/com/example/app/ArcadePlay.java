package com.example.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ArcadePlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcade_play);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        finish();
        change();
    }

    public void change()
    {
        Timerstuff t = new Timerstuff();
        t.start();
        while(true)
        {
            if(t.stopped())
            {
                int r = (int)(Math.random() * 10);
                if(r == 0)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap1.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else if(r == 1)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap2.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else if(r == 2)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap3.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else if(r == 3)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap4.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else if(r == 4)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap5.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else if(r == 5)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap6.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else if(r == 6)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap7.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else if(r == 7)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap8.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else if(r == 8)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap9.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                else if(r == 9)
                {
                    Intent intent = new Intent(ArcadePlay.this, ArcadePlayReadyToTap10.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
                break;
            }
        }
    }
}
