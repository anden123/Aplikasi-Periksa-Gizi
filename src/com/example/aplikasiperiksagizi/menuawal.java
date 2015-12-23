package com.example.aplikasiperiksagizi;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class menuawal extends Activity{
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.menu);
	        
	        /**
	         * Creating all buttons instances
	         * */

	        Button gizidaurhidup = (Button) findViewById(R.id.gizidaurgidup);

	        Button kalkulator = (Button) findViewById(R.id.kalkulator);

	        Button news = (Button) findViewById(R.id.news);

	        Button catatan = (Button) findViewById(R.id.catatan);
	               
	        /**
	         * Handling all button click events
	         * */
	        
	        // Listening to News Feed button click
	        gizidaurhidup.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), gizidaurhidup.class);
					startActivity(i);
				}
			});
	        
	       // Listening Friends button click
	        kalkulator.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), kalkulatorgizi.class);
					startActivity(i);
				}
			});
	        
	        // Listening Messages button click
	        news.setOnClickListener(new View.OnClickListener() {
				
			
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), news.class);
					startActivity(i);
				}
			});
	        
	        // Listening to Places button click
	        catatan.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), Mainsql.class);
					startActivity(i);
				}
			});
	              
	 }
	    
	
}
