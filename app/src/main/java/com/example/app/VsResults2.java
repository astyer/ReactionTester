package com.example.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VsResults2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_results2);

        double eTime = getIntent().getDoubleExtra("endTime", 0);
        double elapsedTime = eTime - Global.vsStartTime;
        double timeInSecs = elapsedTime / Math.pow(10,9);
        TextView time = (TextView) findViewById(R.id.vsTimeText2);
        String timeS = timeInSecs + "";
        time.setText(timeS.substring(0,5) + "s");

        TextView response = (TextView) findViewById(R.id.vsResponse2);

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
            response.setText("Are you ok?");
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
        Button toSolo = (Button) findViewById(R.id.vsPlayAgain2);
        toSolo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(VsResults2.this, VsMenu.class));
            }
        });
    }

    public void goToMainMenu() {
        Button toMenu = (Button) findViewById(R.id.vsMainMenu2);
        toMenu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(VsResults2.this, MainMenu.class));
            }
        });
    }

}
