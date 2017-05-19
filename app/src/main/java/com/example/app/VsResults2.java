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
