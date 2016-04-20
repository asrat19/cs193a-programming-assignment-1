package com.asrat19stanford.cointoss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class CoinToss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_toss);
    }



    public void tossCoin(View view) {
    Button tossButton = (Button) findViewById(R.id.toss);
        Random or = new Random();
        TextView decision = (TextView) findViewById(R.id.result);
        Boolean bool = or.nextBoolean();

        if (bool == true) {
            decision.setText("HEAD");
        } else {
            decision.setText("TAIL");
        }
    }
}
