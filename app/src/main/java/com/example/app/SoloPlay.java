package com.example.app;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SoloPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_play);

        change();
    }

    public void change()
    {
        Timerstuff t = new Timerstuff();
        t.start();
        while(true)
        {
            if(t.running())
            {
                Intent intent = new Intent(SoloPlay.this, SoloPlayReadyToTap.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
            }
        }
    }


}
