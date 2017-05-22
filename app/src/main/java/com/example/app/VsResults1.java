package com.example.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.app.Global.vsObjs;
import static com.example.app.Global.vsTimes;

public class VsResults1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_results1);

        double eTime = getIntent().getDoubleExtra("endTime", 0);
        double elapsedTime = eTime - Global.vsStartTime;
        double timeInSecs = elapsedTime / Math.pow(10,9);
        vsTimes.add(timeInSecs);
        vsObjs.add(new VsTime(timeInSecs, "1"));
        TextView time = (TextView) findViewById(R.id.vstimeText1);
        String timeS = timeInSecs + "";
        time.setText(timeS.substring(0,5) + "s");

        TextView response = (TextView) findViewById(R.id.vsResponse1);

        if(timeInSecs < 0.35)
        {
            response.setText("Godly!");
        }
        else if(timeInSecs < 0.4)
        {
            response.setText("Insane!");
        }
        else if(timeInSecs < 0.45)
        {
            response.setText("Outstanding!");
        }
        else if(timeInSecs < 0.5)
        {
            response.setText("Amazing!");
        }
        else if(timeInSecs < 0.55)
        {
            response.setText("Speedy!");
        }
        else if(timeInSecs < 0.6)
        {
            response.setText("Quick one!");
        }
        else if(timeInSecs < 0.65)
        {
            response.setText("Nice!");
        }
        else if(timeInSecs < 0.7)
        {
            response.setText("Decent");
        }
        else if(timeInSecs < 0.75)
        {
            response.setText("OK");
        }
        else if(timeInSecs < 0.8)
        {
            response.setText("Alright");
        }
        else if(timeInSecs < 0.85)
        {
            response.setText("Meh");
        }
        else if(timeInSecs < 0.9)
        {
            response.setText("Subpar");
        }
        else if(timeInSecs < 0.95)
        {
            response.setText("Are you okay?");
        }
        else if(timeInSecs < 1)
        {
            response.setText("Are you colorblind or something?");
        }
        else if(timeInSecs < 1.5)
        {
            response.setText("Ok now you're not even trying");
        }
        else
        {
            response.setText("Did I catch you napping?");
        }

        goToSoloMenu();
        goToMainMenu();
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
}
