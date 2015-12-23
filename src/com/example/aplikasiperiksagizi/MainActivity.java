package com.example.aplikasiperiksagizi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
public class MainActivity extends Activity {
	 protected boolean _active = true;
	    protected int _splashTime = 5000;
	 
	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	 
	        // thread for displaying the SplashScreen
	        Thread splashTread = new Thread() {
	            @Override
	            public void run() {
	                try {
	                    int waited = 0;
	                    while(_active && (waited < _splashTime)) {
	                        sleep(100);
	                        if(_active) {
	                            waited += 100;
	                        }
	                    }
	                } catch(InterruptedException e) {
	                    // do nothing
	                } finally {
	                    finish();
	                    Intent newIntent=new Intent(MainActivity.this,LogSharedPref.class);
	            		startActivityForResult(newIntent,0);
	                }
	            }
	        };
	        splashTread.start();
	    }
	 
	    @Override
	    public boolean onTouchEvent(MotionEvent event) {
	        if (event.getAction() == MotionEvent.ACTION_DOWN) {
	            _active = false;
	        }
	        return true;
	    }
}
