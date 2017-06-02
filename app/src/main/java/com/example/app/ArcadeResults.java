package com.example.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.app.Global.arcadeTimes;
import static com.example.app.Global.notStarted;

public class ArcadeResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcade_results);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        notStarted = true;
        double eTime = getIntent().getDoubleExtra("endTime", 0);
        double elapsedTime = eTime - Global.arcadeStartTime;
        double timeInSecs = elapsedTime / Math.pow(10,9);
        arcadeTimes.add(timeInSecs);
        TextView time = (TextView) findViewById(R.id.timeText);
        String timeS = timeInSecs + "";
        String timeSA = timeS.substring(0,5) + "s";
        time.setText(timeSA);

        TextView response = (TextView) findViewById(R.id.arcadeResponse);

        if(timeInSecs < 5)
        {
            response.setText("Godly!");
        }
        else if(timeInSecs < 5.25)
        {
            response.setText("Insane!");
        }
        else if(timeInSecs < 5.5)
        {
            response.setText("Outstanding!");
        }
        else if(timeInSecs < 5.75)
        {
            response.setText("Amazing!");
        }
        else if(timeInSecs < 6)
        {
            response.setText("Speedy!");
        }
        else if(timeInSecs < 6.25)
        {
            response.setText("Quick one!");
        }
        else if(timeInSecs < 6.5)
        {
            response.setText("Nice!");
        }
        else if(timeInSecs < 6.75)
        {
            response.setText("Decent");
        }
        else if(timeInSecs < 7)
        {
            response.setText("Okay");
        }
        else if(timeInSecs < 7.25)
        {
            response.setText("Alright");
        }
        else if(timeInSecs < 7.5)
        {
            response.setText("Meh");
        }
        else if(timeInSecs < 7.75)
        {
            response.setText("Subpar");
        }
        else if(timeInSecs < 8)
        {
            response.setText("Are you okay?");
        }
        else if(timeInSecs < 8.25)
        {
            response.setText("Are you colorblind or something?");
        }
        else if(timeInSecs < 8.5)
        {
            response.setText("Ok now you're not even trying");
        }
        else
        {
            response.setText("Did I catch you napping?");
        }

        goToArcadeMenu();
        goToMainMenu();
        goToArcadeLeaderboard();
    }

    public void goToArcadeMenu() {
        Button toSolo = (Button) findViewById(R.id.playAgain);
        toSolo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(ArcadeResults.this, ArcadeMenu.class));
            }
        });
    }

    public void goToMainMenu() {
        Button toSolo = (Button) findViewById(R.id.mainMenu);
        toSolo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(ArcadeResults.this, MainMenu.class));
            }
        });
    }

    public void goToArcadeLeaderboard() {
        Button toSolo = (Button) findViewById(R.id.arcadeLeaderboard);
        toSolo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(ArcadeResults.this, ArcadeLeaderboard.class));
            }
        });
    }
}
