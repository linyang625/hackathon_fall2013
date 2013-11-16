package com.example.taskshare;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

 
public class SplashScreen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				Intent i = new Intent(SplashScreen.this, MainActivity.class);
				startActivity(i);
				synchronized (this) {
					try {
						wait(3000);
						System.out.println("Thread waited for 3 seconds");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		try {
			t.start();
			t.join();
			finish();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}