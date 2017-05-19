package com.example.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        goToSoloMenu();
        goToVsMenu();
        goToLeaderboardsMenu();
    }

    public void goToSoloMenu() {
        Button toSolo = (Button) findViewById(R.id.toSolobutton);
        toSolo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainMenu.this, SoloMenu.class));
            }
        });
    }

    public void goToVsMenu() {
        Button toVs = (Button) findViewById(R.id.toVsbutton);
        toVs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainMenu.this, VsMenu.class));
            }
        });
    }

    public void goToLeaderboardsMenu() {
        Button toL = (Button) findViewById(R.id.toLeaderboards);
        toL.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainMenu.this, LeaderboardsMenu.class));
            }
        });
    }
}
