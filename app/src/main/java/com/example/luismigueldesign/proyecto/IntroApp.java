package com.example.luismigueldesign.proyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroApp extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_app);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()
            {
                Intent intent = new Intent(IntroApp.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}
