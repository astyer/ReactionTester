package com.example.app;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.app.Global.blueNot;
import static com.example.app.Global.moneyTotal;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        TextView money = (TextView) findViewById(R.id.moneyText);
        money.setText(moneyTotal + "$");

        if(blueNot)
        {
            blueNot = false;
            Button blue = (Button) findViewById(R.id.blue);
            blue.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Button blue = (Button) findViewById(R.id.blue);
                    blue.setText("Selected");
                }
            });
        }
        else
        {
            Button blue = (Button) findViewById(R.id.blue);
            blue.setText("Selected");
        }
    }
}
