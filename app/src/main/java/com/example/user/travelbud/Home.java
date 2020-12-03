package com.example.user.travelbud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    ImageButton Cam,Map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Cam = (ImageButton)findViewById(R.id.btnCam);
        Map = (ImageButton)findViewById(R.id.btnMap);

        Cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });
        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Home.this,MapsActivity.class);
                startActivity(a);
            }
        });
    }
}