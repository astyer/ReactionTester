package com.example.app;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.Collections;

import static com.example.app.Global.vsObjs;
import static com.example.app.Global.vsTimes;

public class VsLeaderboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_leaderboard);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        TextView scrollText = (TextView) findViewById(R.id.scrollingTextVs);
        scrollText.setMovementMethod(new ScrollingMovementMethod());
        Collections.sort(vsTimes);
        for(double d : vsTimes)
        {
            for(VsTime a: vsObjs)
            {
                if(d == a.time)
                {
                    String dS = d + "";
                    scrollText.append("\t\t\t\t\t\t\t" + a.player + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + dS.substring(0,5) + "\n");
                }
            }

        }
    }
}
