package com.example.taskshare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

    
        Thread background = new Thread() {
            public void run() {
                 
                try {
                    // Thread will sleep for 1 second
                    sleep(5*1000);
                     
                    // After 1 second redirect to another intent
                    Intent i=new Intent(getBaseContext(),MainScreen.class);
                    startActivity(i);
                     
                    //Remove activity
                    finish();
                     
                } catch (Exception e) {
                 
                }
            }
        };
         
        // start thread
        background.start();
     
}



} 
