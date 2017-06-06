package com.example.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.app.Global.moneyTotal;
import static com.example.app.Global.vsObjs;
import static com.example.app.Global.vsTimes;

public class VsResults1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_results1);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        double eTime = getIntent().getDoubleExtra("endTime", 0);
        double elapsedTime = eTime - Global.vsStartTime;
        double timeInSecs = elapsedTime / Math.pow(10,9);
        vsTimes.add(timeInSecs);
        vsObjs.add(new VsTime(timeInSecs, "1"));
        TextView time = (TextView) findViewById(R.id.vstimeText1);
        String timeS = timeInSecs + "";
        time.setText(timeS.substring(0,5) + "s");

        TextView response = (TextView) findViewById(R.id.vsResponse1);
        TextView money = (TextView) findViewById(R.id.moneyAdded);

        if(timeInSecs < 0.35)
        {
            response.setText("Godly!");
            money.setText("+2000$");
            moneyTotal += 2000;
        }
        else if(timeInSecs < 0.4)
        {
            response.setText("Insane!");
            money.setText("+1200$");
            moneyTotal += 1200;
        }
        else if(timeInSecs < 0.45)
        {
            response.setText("Outstanding!");
            money.setText("+1000$");
            moneyTotal += 1000;
        }
        else if(timeInSecs < 0.5)
        {
            response.setText("Amazing!");
            money.setText("+700$");
            moneyTotal += 700;
        }
        else if(timeInSecs < 0.55)
        {
            response.setText("Speedy!");
            money.setText("+500$");
            moneyTotal += 500;
        }
        else if(timeInSecs < 0.6)
        {
            response.setText("Quick one!");
            money.setText("+400$");
            moneyTotal += 400;
        }
        else if(timeInSecs < 0.65)
        {
            response.setText("Nice!");
            money.setText("+350$");
            moneyTotal += 350;
        }
        else if(timeInSecs < 0.7)
        {
            response.setText("Decent");
            money.setText("+300$");
            moneyTotal += 300;
        }
        else if(timeInSecs < 0.75)
        {
            response.setText("Okay");
            money.setText("+250$");
            moneyTotal += 250;
        }
        else if(timeInSecs < 0.8)
        {
            response.setText("Alright");
            money.setText("+200$");
            moneyTotal += 200;
        }
        else if(timeInSecs < 0.85)
        {
            response.setText("Meh");
            money.setText("+150$");
            moneyTotal += 150;
        }
        else if(timeInSecs < 0.9)
        {
            response.setText("Subpar");
            money.setText("+100$");
            moneyTotal += 100;
        }
        else if(timeInSecs < 0.95)
        {
            response.setText("Are you okay?");
            money.setText("+50$");
            moneyTotal += 50;
        }
        else if(timeInSecs < 1)
        {
            response.setText("Are you colorblind or something?");
            money.setText("+25$");
            moneyTotal += 25;
        }
        else if(timeInSecs < 1.5)
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

        goToSoloMenu();
        goToMainMenu();
        goToVsL();
    }

    public void goToSoloMenu() {
        Button toSolo = (Button) findViewById(R.id.vsPlayAgain1);
        toSolo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(VsResults1.this, VsMenu.class));
            }
        });
    }

    public void goToMainMenu() {
        Button toMenu = (Button) findViewById(R.id.vsMainMenu1);
        toMenu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(VsResults1.this, MainMenu.class));
            }
        });
    }

    public void goToVsL() {
        Button toVsL = (Button) findViewById(R.id.toVsL);
        toVsL.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(VsResults1.this, VsLeaderboard.class));
            }
        });
    }
}
