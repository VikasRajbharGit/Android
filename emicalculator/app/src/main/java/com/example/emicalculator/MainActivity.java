package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText amtET;
    private EditText mntET;
    private EditText interestET;
    private TextView emiT;
    private EditText interest;
     Button calc;
     Button nav;
     Button rand;
     TextView randT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amtET=findViewById(R.id.amtF);
        mntET=findViewById(R.id.mntF);
        //amtET=findViewById(R.id.interest);
        emiT=findViewById(R.id.emi);
        calc=findViewById(R.id.calc);
        nav=findViewById(R.id.nav);
        rand=findViewById(R.id.rand);
        randT=findViewById(R.id.randT);
        interest=findViewById(R.id.interest);

        calc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d("hello","hello");
                        if (amtET.getText()!=null && mntET.getText()!=null && interest.getText()!=null){
                            float temp=Float.parseFloat(String.valueOf(amtET.getText()))*(1+Float.parseFloat(String.valueOf(interest.getText()))*Float.parseFloat(String.valueOf(mntET.getText())));
                            emiT.setText(String.valueOf(temp));
                        }
                        else{
                            emiT.setText("invalid values");
                        }

                    }
                }
        );

        nav.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.setData(Uri.parse("market://details?id=" + "com.whatsapp"));
                        startActivity(intent);
                    }
                }
        );

        rand.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Random rnd=new Random();
                        randT.setText(String.valueOf(rnd.nextInt(100)));
                    }
                }
        );







    }
}
