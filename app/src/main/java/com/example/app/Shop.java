package com.example.app;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.app.Global.blueNot;
import static com.example.app.Global.choingNot;
import static com.example.app.Global.debugging;
import static com.example.app.Global.greenNot;
import static com.example.app.Global.lblueNot;
import static com.example.app.Global.lgreenNot;
import static com.example.app.Global.lightningNot;
import static com.example.app.Global.moneyTotal;
import static com.example.app.Global.orangeNot;
import static com.example.app.Global.purpleNot;
import static com.example.app.Global.rainbowNot;
import static com.example.app.Global.redNot;
import static com.example.app.Global.selectedColor;
import static com.example.app.Global.yellowNot;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        TextView money = (TextView) findViewById(R.id.moneyText);
        money.setText(moneyTotal + "$");

        Button pink = (Button) findViewById(R.id.Pink);
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
        TextView rainbow = (TextView) findViewById(R.id.rainbowText);
        TextView lightning = (TextView) findViewById(R.id.lightningText);
        TextView choing = (TextView) findViewById(R.id.ChoingText);

        if(selectedColor.equals("pink"))
        {
            pink.setText("Selected");
            pink.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Button pink = (Button) findViewById(R.id.Pink);
                    pink.setText("Selected");
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "pink";
                }
            });
        }
        else
        {
            pink.setText("");
            pink.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Button pink = (Button) findViewById(R.id.Pink);
                    pink.setText("Selected");
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "pink";
                }
            });
        }

        if(redNot)
        {
            red.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 10000 || debugging)
                    {
                        moneyTotal-=10000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                        redNot = false;
                        Button red = (Button) findViewById(R.id.Red);
                        red.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "red";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("red"))
            {
                red.setText("Selected");
                red.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button red = (Button) findViewById(R.id.Red);
                        red.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "red";
                    }
                });
            }
            else
            {
                red.setText("");
                red.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button red = (Button) findViewById(R.id.Red);
                        red.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "red";
                    }
                });
            }
        }

        if(orangeNot)
        {
            orange.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 10000 || debugging)
                    {
                    moneyTotal-=10000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                    orangeNot = false;
                    Button orange = (Button) findViewById(R.id.Orange);
                    orange.setText("Selected");
                    if(selectedColor.equals("pink"))
                    {
                        Button c = (Button) findViewById(R.id.Pink);
                        c.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "orange";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("orange"))
            {
                orange.setText("Selected");
                orange.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button orange = (Button) findViewById(R.id.Orange);
                        orange.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "orange";
                    }
                });
            }
            else
            {
                orange.setText("");
                orange.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button orange = (Button) findViewById(R.id.Orange);
                        orange.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "orange";
                    }
                });
            }
        }

        if(yellowNot)
        {
            yellow.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 10000 || debugging)
                    {
                    moneyTotal-=10000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                    yellowNot = false;
                    Button yellow = (Button) findViewById(R.id.Yellow);
                    yellow.setText("Selected");
                    if(selectedColor.equals("pink"))
                    {
                        Button c = (Button) findViewById(R.id.Pink);
                        c.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "yellow";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("yellow"))
            {
                yellow.setText("Selected");
                yellow.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button yellow = (Button) findViewById(R.id.Yellow);
                        yellow.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "yellow";
                    }
                });
            }
            else
            {
                yellow.setText("");
                yellow.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button yellow = (Button) findViewById(R.id.Yellow);
                        yellow.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "yellow";
                    }
                });
            }
        }

        if(greenNot)
        {
            green.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 10000 || debugging)
                    {
                    moneyTotal-=10000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                    greenNot = false;
                    Button green = (Button) findViewById(R.id.Green);
                    green.setText("Selected");
                    if(selectedColor.equals("pink"))
                    {
                        Button c = (Button) findViewById(R.id.Pink);
                        c.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "green";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("green"))
            {
                green.setText("Selected");
                green.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button green = (Button) findViewById(R.id.Green);
                        green.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "green";
                    }
                });
            }
            else
            {
                green.setText("");
                green.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button green = (Button) findViewById(R.id.Green);
                        green.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "green";
                    }
                });
            }
        }

        if(blueNot)
        {
            blue.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 10000 || debugging)
                    {
                    moneyTotal-=10000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                    blueNot = false;
                    Button blue = (Button) findViewById(R.id.Blue);
                    blue.setText("Selected");
                    if(selectedColor.equals("pink"))
                    {
                        Button c = (Button) findViewById(R.id.Pink);
                        c.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "blue";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("blue"))
            {
                blue.setText("Selected");
                blue.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button blue = (Button) findViewById(R.id.Blue);
                        blue.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "blue";
                    }
                });
            }
            else
            {
                blue.setText("");
                blue.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button blue = (Button) findViewById(R.id.Blue);
                        blue.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "blue";
                    }
                });
            }
        }

        if(purpleNot)
        {
            purple.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 10000 || debugging)
                    {
                    moneyTotal-=10000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                    purpleNot = false;
                    Button purple = (Button) findViewById(R.id.Purple);
                    purple.setText("Selected");
                    if(selectedColor.equals("pink"))
                    {
                        Button c = (Button) findViewById(R.id.Pink);
                        c.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "purple";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("purple"))
            {
                purple.setText("Selected");
                purple.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button purple = (Button) findViewById(R.id.Purple);
                        purple.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "purple";
                    }
                });
            }
            else
            {
                purple.setText("");
                purple.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button purple = (Button) findViewById(R.id.Purple);
                        purple.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "purple";
                    }
                });
            }
        }
        
        if(lblueNot)
        {
            lblue.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 10000 || debugging)
                    {
                        moneyTotal-=10000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                        lblueNot = false;
                        Button lblue = (Button) findViewById(R.id.lightBlue);
                        lblue.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "lblue";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("lblue"))
            {
                lblue.setText("Selected");
                lblue.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button lblue = (Button) findViewById(R.id.lightBlue);
                        lblue.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "lblue";
                    }
                });
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
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "lblue";
                    }
                });
            }
        }
        
        if(lgreenNot)
        {
            lgreen.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 10000 || debugging)
                    {
                    moneyTotal-=10000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                    lgreenNot = false;
                    Button lgreen = (Button) findViewById(R.id.lightGreen);
                    lgreen.setText("Selected");
                    if(selectedColor.equals("pink"))
                    {
                        Button c = (Button) findViewById(R.id.Pink);
                        c.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "lgreen";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("lgreen"))
            {
                lgreen.setText("Selected");
                lgreen.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button lgreen = (Button) findViewById(R.id.lightGreen);
                        lgreen.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "lgreen";
                    }
                });
            }
            else
            {
                lgreen.setText("");
                lgreen.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Button lgreen = (Button) findViewById(R.id.lightGreen);
                        lgreen.setText("Selected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "lgreen";
                    }
                });
            }
        }

        if(lightningNot)
        {
            lightning.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 50000 || debugging)
                    {
                    moneyTotal-=50000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                    lightningNot = false;
                    TextView lightning = (TextView) findViewById(R.id.lightningText);
                    lightning.setText("\nSelected");
                    if(selectedColor.equals("pink"))
                    {
                        Button c = (Button) findViewById(R.id.Pink);
                        c.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "lightning";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("lightning"))
            {
                lightning.setText("\nSelected");
                lightning.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        TextView lightning = (TextView) findViewById(R.id.lightningText);
                        lightning.setText("\nSelected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "lightning";
                    }
                });
            }
            else
            {
                lightning.setText("");
                lightning.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        TextView lightning = (TextView) findViewById(R.id.lightningText);
                        lightning.setText("\nSelected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "lightning";
                    }
                });
            }
        }

        if(rainbowNot)
        {
            rainbow.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 75000 || debugging)
                    {
                    moneyTotal-=75000;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                    rainbowNot = false;
                    TextView rainbow = (TextView) findViewById(R.id.rainbowText);
                    rainbow.setText("\nSelected");
                    if(selectedColor.equals("pink"))
                    {
                        Button c = (Button) findViewById(R.id.Pink);
                        c.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("choing"))
                    {
                        TextView c = (TextView) findViewById(R.id.ChoingText);
                        c.setText("");
                    }
                    selectedColor = "rainbow";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("rainbow"))
            {
                rainbow.setText("\nSelected");
                rainbow.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        TextView rainbow = (TextView) findViewById(R.id.rainbowText);
                        rainbow.setText("\nSelected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "rainbow";
                    }
                });
            }
            else
            {
                rainbow.setText("");
                rainbow.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        TextView rainbow = (TextView) findViewById(R.id.rainbowText);
                        rainbow.setText("\nSelected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("choing"))
                        {
                            TextView c = (TextView) findViewById(R.id.ChoingText);
                            c.setText("");
                        }
                        selectedColor = "rainbow";
                    }
                });
            }
        }

        if(choingNot)
        {
            choing.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if(moneyTotal >= 99999 || debugging)
                    {
                    moneyTotal-=99999;
                        TextView money = (TextView) findViewById(R.id.moneyText);
                        money.setText(moneyTotal + "$");
                    choingNot = false;
                    TextView choing = (TextView) findViewById(R.id.ChoingText);
                    choing.setText("\nSelected");
                    if(selectedColor.equals("pink"))
                    {
                        Button c = (Button) findViewById(R.id.Pink);
                        c.setText("");
                    }
                    if(selectedColor.equals("red"))
                    {
                        Button c = (Button) findViewById(R.id.Red);
                        c.setText("");
                    }
                    if(selectedColor.equals("orange"))
                    {
                        Button c = (Button) findViewById(R.id.Orange);
                        c.setText("");
                    }
                    if(selectedColor.equals("yellow"))
                    {
                        Button c = (Button) findViewById(R.id.Yellow);
                        c.setText("");
                    }
                    if(selectedColor.equals("green"))
                    {
                        Button c = (Button) findViewById(R.id.Green);
                        c.setText("");
                    }
                    if(selectedColor.equals("blue"))
                    {
                        Button c = (Button) findViewById(R.id.Blue);
                        c.setText("");
                    }
                    if(selectedColor.equals("purple"))
                    {
                        Button c = (Button) findViewById(R.id.Purple);
                        c.setText("");
                    }
                    if(selectedColor.equals("lgreen"))
                    {
                        Button c = (Button) findViewById(R.id.lightGreen);
                        c.setText("");
                    }
                    if(selectedColor.equals("lblue"))
                    {
                        Button c = (Button) findViewById(R.id.lightBlue);
                        c.setText("");
                    }
                    if(selectedColor.equals("lightning"))
                    {
                        TextView c = (TextView) findViewById(R.id.lightningText);
                        c.setText("");
                    }
                    if(selectedColor.equals("rainbow"))
                    {
                        TextView c = (TextView) findViewById(R.id.rainbowText);
                        c.setText("");
                    }
                    selectedColor = "choing";
                    }
                }
            });
        }
        else
        {
            if(selectedColor.equals("choing"))
            {
                choing.setText("\nSelected");
                choing.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        TextView choing = (TextView) findViewById(R.id.ChoingText);
                        choing.setText("\nSelected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        selectedColor = "choing";
                    }
                });
            }
            else
            {
                choing.setText("");
                choing.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        TextView choing = (TextView) findViewById(R.id.ChoingText);
                        choing.setText("\nSelected");
                        if(selectedColor.equals("pink"))
                        {
                            Button c = (Button) findViewById(R.id.Pink);
                            c.setText("");
                        }
                        if(selectedColor.equals("red"))
                        {
                            Button c = (Button) findViewById(R.id.Red);
                            c.setText("");
                        }
                        if(selectedColor.equals("orange"))
                        {
                            Button c = (Button) findViewById(R.id.Orange);
                            c.setText("");
                        }
                        if(selectedColor.equals("yellow"))
                        {
                            Button c = (Button) findViewById(R.id.Yellow);
                            c.setText("");
                        }
                        if(selectedColor.equals("green"))
                        {
                            Button c = (Button) findViewById(R.id.Green);
                            c.setText("");
                        }
                        if(selectedColor.equals("blue"))
                        {
                            Button c = (Button) findViewById(R.id.Blue);
                            c.setText("");
                        }
                        if(selectedColor.equals("purple"))
                        {
                            Button c = (Button) findViewById(R.id.Purple);
                            c.setText("");
                        }
                        if(selectedColor.equals("lgreen"))
                        {
                            Button c = (Button) findViewById(R.id.lightGreen);
                            c.setText("");
                        }
                        if(selectedColor.equals("lblue"))
                        {
                            Button c = (Button) findViewById(R.id.lightBlue);
                            c.setText("");
                        }
                        if(selectedColor.equals("lightning"))
                        {
                            TextView c = (TextView) findViewById(R.id.lightningText);
                            c.setText("");
                        }
                        if(selectedColor.equals("rainbow"))
                        {
                            TextView c = (TextView) findViewById(R.id.rainbowText);
                            c.setText("");
                        }
                        selectedColor = "choing";
                    }
                });
            }
        }
    }
}
