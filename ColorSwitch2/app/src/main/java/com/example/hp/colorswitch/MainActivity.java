package com.example.hp.colorswitch;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button switcher;
    View back;
    int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors=new int[]{Color.BLACK,Color.GRAY,Color.RED,Color.GREEN,Color.BLUE,Color.CYAN,Color.MAGENTA,Color.YELLOW};
        back=findViewById(R.id.background);
        switcher=(Button)findViewById(R.id.button);
        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int arraylength=colors.length;
                Random rand= new Random();
                int randNum=rand.nextInt(arraylength);
                back.setBackgroundColor(colors[randNum]);
                Log.d("val",String.valueOf(randNum));
            }
        });
    }
}
