package com.example.aplikasiperiksagizi;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class LogSharedPref extends Activity {
	EditText user;
	EditText pass;
	Button btnLogin;
	Button btnNew;
	CheckBox chkpass;
	public static final String mypref = "MySharedPreferencesLog";
	final int mode = Activity.MODE_PRIVATE;
	String userpref;
	String passpref;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_log_shared_pref);
	user = (EditText) findViewById(R.id.user);
	pass = (EditText) findViewById(R.id.pwd);
	btnLogin = (Button) findViewById(R.id.btnLogin);
	btnNew = (Button) findViewById(R.id.btnNew);
	chkpass = (CheckBox) findViewById(R.id.checkpass);
	chkpass.setOnCheckedChangeListener(new OnCheckedChangeListener() {
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean
	isChecked) {
	// TODO Auto-generated method stub
	if(!chkpass.isChecked()){
		pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
	} else{
	pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
	}
	}
	});
	btnNew.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View v) {
	// TODO Auto-generated method stub
	Intent intNew = new Intent(LogSharedPref.this, UserNew.class);
	startActivity(intNew);
	}
	});
	btnLogin.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View v) {
	// TODO Auto-generated method stub
	String usr = user.getText().toString();
	String pas = pass.getText().toString();
	SharedPreferences mySharedPreferences =
			getSharedPreferences(mypref,mode);
			// extract the <key/value> pairs, use default param for missing data
			userpref = mySharedPreferences.getString("username", "---");
			passpref = mySharedPreferences.getString("password", "---");
			if (usr.equalsIgnoreCase(userpref) &&
			pas.equalsIgnoreCase(passpref)) {
			Intent intShared = new
			Intent(LogSharedPref.this,menuawal.class);
			startActivity(intShared);
			} else{
			Toast.makeText(getApplicationContext(), "Username dan password anda salah", Toast.LENGTH_SHORT).show();
			}
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


