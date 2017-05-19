package com.example.app;

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

        TextView scrollText = (TextView) findViewById(R.id.scrollingText);
        scrollText.setMovementMethod(new ScrollingMovementMethod());
        Collections.sort(soloTimes);
        for(double d : soloTimes)
        {
            String dS = d + "";
            scrollText.append(dS.substring(0,5) + "\n");
        }

    }
}
