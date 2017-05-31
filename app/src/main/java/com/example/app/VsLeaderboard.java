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
            String dSA = "-\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-------";
            if(i < vsTimes.size())
            {
                for(int x = 0; x < vsObjs.size(); x++)
                {
                    if(vsTimes.get(i) == vsObjs.get(x).time)
                    {
                        String dS = vsTimes.get(i) + "";
                        dSA = dS.substring(0,5) + "s";
                        if(num.length() > 1)
                        {
                            scrollText.append(num + ".\t\t\t\t\t\t" + vsObjs.get(x).player + "\t\t\t\t\t\t\t\t\t\t\t\t" + dSA + "\n");
                        }
                        else
                        {
                            scrollText.append(num + ".\t\t\t\t\t\t\t\t\t\t" + vsObjs.get(x).player + "\t\t\t\t\t\t\t\t\t\t\t" + dSA + "\n");
                        }
                    }
                }
            }
            else
            {
                if(num.length() > 1)
                {
                    scrollText.append(num + ".\t\t\t\t\t\t\t" + dSA + "\n");
                }
                else
                {
                    scrollText.append(num + ".\t\t\t\t\t\t\t\t\t\t\t" + dSA + "\n");
                }
            }

        }
    }
}
