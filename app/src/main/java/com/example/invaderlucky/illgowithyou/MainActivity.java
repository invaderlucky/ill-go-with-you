package com.example.invaderlucky.illgowithyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton findAlly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAlly = (ImageButton) findViewById(R.id.findally) ;
        findAlly.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        find(v);
                    }
                }
        );
    }

    public void find(View view) {

    }
}
