package com.example.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeaderboardsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboards_menu);

        goToSolo();
        goToVs();
        goToArcade();
    }

    public void goToSolo() {
        Button toSolo = (Button) findViewById(R.id.toSoloL);
        toSolo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(LeaderboardsMenu.this, SoloLeaderboard.class));
            }
        });
    }

    public void goToVs() {
        Button toVs = (Button) findViewById(R.id.toVsL);
        toVs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(LeaderboardsMenu.this, VsLeaderboard.class));
            }
        });
    }

    public void goToArcade() {
        Button toArc = (Button) findViewById(R.id.toArcL);
        toArc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(LeaderboardsMenu.this, ArcadeLeaderboard.class));
            }
        });
    }

}
