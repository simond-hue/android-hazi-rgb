package com.example.hazi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int redProgress = 0;
    private int greenProgress = 0;
    private int blueProgress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar red = (SeekBar) findViewById(R.id.RED);
        SeekBar green = (SeekBar) findViewById(R.id.GREEN);
        SeekBar blue = (SeekBar) findViewById(R.id.BLUE);

        final TextView progressAmountRed = (TextView) findViewById(R.id.progressRed);
        final TextView progressAmountGreen = (TextView) findViewById(R.id.progressGreen);
        final TextView progressAmountBlue = (TextView) findViewById(R.id.progressBlue);

        final RelativeLayout background = (RelativeLayout) findViewById(R.id.layout);

        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressAmountRed.setText(String.valueOf("("+255*progress/100)+", ");
                redProgress = 255*progress/100;
                background.setBackgroundColor(Color.rgb(redProgress,greenProgress,blueProgress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressAmountGreen.setText(String.valueOf(255*progress/100)+", ");
                greenProgress = 255*progress/100;
                background.setBackgroundColor(Color.rgb(redProgress,greenProgress,blueProgress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressAmountBlue.setText(String.valueOf(255*progress/100)+")");
                blueProgress = 255*progress/100;
                background.setBackgroundColor(Color.rgb(redProgress,greenProgress,blueProgress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
