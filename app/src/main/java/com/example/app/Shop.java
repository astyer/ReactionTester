package com.example.app;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.app.Global.lblueNot;
import static com.example.app.Global.moneyTotal;
import static com.example.app.Global.selectedColor;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        TextView money = (TextView) findViewById(R.id.moneyText);
        money.setText(moneyTotal + "$");

        Button red = (Button) findViewById(R.id.Red);
        red.setBackgroundColor(Color.parseColor("#E72C0F"));
        Button orange = (Button) findViewById(R.id.Orange);
        orange.setBackgroundColor(Color.parseColor("#F99719"));
        Button yellow = (Button) findViewById(R.id.Yellow);
        yellow.setBackgroundColor(Color.parseColor("#FAF42F"));
        Button green = (Button) findViewById(R.id.Green);
        green.setBackgroundColor(Color.parseColor("#25AB21"));
        Button blue = (Button) findViewById(R.id.Blue);
        blue.setBackgroundColor(Color.parseColor("#2C31CF"));
        Button purple = (Button) findViewById(R.id.Purple);
        purple.setBackgroundColor(Color.parseColor("#A02CCF"));
        Button lblue = (Button) findViewById(R.id.lightBlue);
        Button lgreen = (Button) findViewById(R.id.lightGreen);
        ImageButton rainbow = (ImageButton) findViewById(R.id.Rainbow);
        ImageButton lightning = (ImageButton) findViewById(R.id.Lightning);
        ImageButton choing = (ImageButton) findViewById(R.id.Choing);


        if(lblueNot)
        {
            lblueNot = false;
            lblue.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    //if(moneyTotal >= 10000)
                    //{
                        Button lblue = (Button) findViewById(R.id.lightBlue);
                        lblue.setText("Selected");

                    if(selectedColor.equals("red"))
                    {
                        Button red = (Button) findViewById(R.id.Red);
                        red.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button orange = (Button) findViewById(R.id.Orange);
                        orange.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button red = (Button) findViewById(R.id.Red);
                        red.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button red = (Button) findViewById(R.id.Red);
                        red.setText("");
                    }


                    //}
                }
            });
        }
        else
        {
            if(selectedColor.equals("lblue"))
            {
                lblue.setText("Selected");
            }
            else
            {
                lblue.setText("");
                lblue.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button lblue = (Button) findViewById(R.id.lightBlue);
                        lblue.setText("Selected");
                        selectedColor = "lblue";
                    }
                });
            }
        }
    }
}
