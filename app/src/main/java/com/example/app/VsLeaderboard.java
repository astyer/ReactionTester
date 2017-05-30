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
        for(int i = 0; i < 20; i++)
        {
            String num = (i+1) + "";
            for(int x = 0; x < vsObjs.size(); x++)
            {
                String nextTimeS = vsTimes.get(i) + "";
                String objTimeS = vsObjs.get(x).time + "";
                if(nextTimeS.substring(0,5).equals(objTimeS.substring(0,5)))
                {
                    scrollText.append(num + "\n");
                    //String dS = vsTimes.get(i) + "";
                    //scrollText.append(num + "\t\t\t\t\t\t\t" + vsObjs.get(x).player + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + dS.substring(0,5) + "\n");
                }
            }
        }

        /*for(int i = 0; i < 20; i++)
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
        }*/
    }
}
