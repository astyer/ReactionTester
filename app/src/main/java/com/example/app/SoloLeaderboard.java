package com.example.app;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.Collections;

import static com.example.app.Global.soloTimes;

public class SoloLeaderboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_leaderboard);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        TextView scrollText = (TextView) findViewById(R.id.scrollingText);
        scrollText.setMovementMethod(new ScrollingMovementMethod());
        Collections.sort(soloTimes);
        for(int i = 0; i < 20; i++)
        {
            String dSA = "\t\t\t-------";
            if(i < soloTimes.size())
            {
                String dS = soloTimes.get(i) + "";
                dSA = dS.substring(0,5) + "s";
            }
            String num = (i+1) + "";
            if(num.length() > 1)
            {
                scrollText.append(num + ".\t\t\t\t\t\t\t\t" + dSA + "\n");
            }
            else
            {
                scrollText.append(num + ".\t\t\t\t\t\t\t\t\t\t\t\t" + dSA + "\n");
            }
        }

    }
}
