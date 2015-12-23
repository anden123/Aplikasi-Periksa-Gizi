package com.example.aplikasiperiksagizi;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class UserNew extends Activity{
	EditText useredit;
	EditText passedit;
	Button btnSave;
	public static final String mypref = "MySharedPreferencesLog";
	final int mode = Activity.MODE_PRIVATE;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_user_new);
	useredit = (EditText) findViewById(R.id.useredit);
	passedit = (EditText) findViewById(R.id.pwdedit);
	btnSave = (Button) findViewById(R.id.btnSave);
	btnSave.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View v) {
	// TODO Auto-generated method stub
	String user = useredit.getText().toString();
	String pass = passedit.getText().toString();
	SharedPreferences mySharedPreferences =
	getSharedPreferences(mypref, mode);
	SharedPreferences.Editor myEditor = mySharedPreferences.edit();
	myEditor.putString("username", user);
	myEditor.putString("password", pass);
	myEditor.commit();
	Toast.makeText(getApplicationContext(), "Username dan password anda Telah Disimpan", Toast.LENGTH_SHORT).show();
	}
	});
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
