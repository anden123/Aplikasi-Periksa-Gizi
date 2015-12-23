package com.example.aplikasiperiksagizi;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.app.Activity;
public class news extends Activity {
	WebView browser;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_news);
	browser = (WebView) findViewById(R.id.webkit);
	browser.loadUrl("http://www.gizikia.kemkes.go.id");
	browser.getSettings().setJavaScriptEnabled(true);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	// Handle action bar item clicks here. The action bar will
	// automatically handle clicks on the Home/Up button, so long
	// as you specify a parent activity in AndroidManifest.xml.
	int id = item.getItemId();
	if (id == R.id.action_settings) {
	return true;
	}
	return super.onOptionsItemSelected(item);
	}
	}

