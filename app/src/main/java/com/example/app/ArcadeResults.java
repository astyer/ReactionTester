package com.example.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.app.Global.arcadeTimes;
import static com.example.app.Global.moneyTotal;
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
        TextView money = (TextView) findViewById(R.id.moneyAdded);

        if(timeInSecs < 5)
        {
            response.setText("Godly!");
            money.setText("+2000$");
            moneyTotal += 2000;
        }
        else if(timeInSecs < 5.25)
        {
            response.setText("Insane!");
            money.setText("+1200$");
            moneyTotal += 1200;
        }
        else if(timeInSecs < 5.5)
        {
            response.setText("Outstanding!");
            money.setText("+1000$");
            moneyTotal += 1000;
        }
        else if(timeInSecs < 5.75)
        {
            response.setText("Amazing!");
            money.setText("+700$");
            moneyTotal += 700;
        }
        else if(timeInSecs < 6)
        {
            response.setText("Speedy!");
            money.setText("+500$");
            moneyTotal += 500;
        }
        else if(timeInSecs < 6.25)
        {
            response.setText("Quick one!");
            money.setText("+400$");
            moneyTotal += 400;
        }
        else if(timeInSecs < 6.5)
        {
            response.setText("Nice!");
            money.setText("+350$");
            moneyTotal += 350;
        }
        else if(timeInSecs < 6.75)
        {
            response.setText("Decent");
            money.setText("+300$");
            moneyTotal += 300;
        }
        else if(timeInSecs < 7)
        {
            response.setText("Okay");
            money.setText("+250$");
            moneyTotal += 250;
        }
        else if(timeInSecs < 7.25)
        {
            response.setText("Alright");
            money.setText("+200$");
            moneyTotal += 200;
        }
        else if(timeInSecs < 7.5)
        {
            response.setText("Meh");
            money.setText("+150$");
            moneyTotal += 150;
        }
        else if(timeInSecs < 7.75)
        {
            response.setText("Subpar");
            money.setText("+100$");
            moneyTotal += 100;
        }
        else if(timeInSecs < 8)
        {
            response.setText("Are you okay?");
            money.setText("+50$");
            moneyTotal += 50;
        }
        else if(timeInSecs < 8.25)
        {
            response.setText("Are you colorblind or something?");
            money.setText("+25$");
            moneyTotal += 25;
        }
        else if(timeInSecs < 8.5)
        {
            response.setText("Ok now you're not even trying");
            money.setText("+15$");
            moneyTotal += 15;
        }
        else
        {
            response.setText("Did I catch you napping?");
            money.setText("+5$");
            moneyTotal += 5;
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
