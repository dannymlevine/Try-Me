
package com.levine.daniel.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int[] colors;

    private View windowView;
    private Button tryMeButton;
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            colors = new int[]{
                    Color.CYAN,Color.GREEN,Color.RED,Color.BLUE,Color.BLACK,Color.BLACK,Color.DKGRAY,
                    Color.LTGRAY,Color.MAGENTA,Color.YELLOW
            };

            windowView = findViewById(R.id.windowViewID);



            tryMeButton = (Button) findViewById(R.id.tryMeButton);
            tryMeButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Random random = new Random();
                    int randomNum = random.nextInt(colors.length);
                    windowView.setBackgroundColor(colors[randomNum]);

                }
            });

        }

        }
