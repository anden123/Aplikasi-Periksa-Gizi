package com.example.aplikasiperiksagizi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gizidaurhidup extends Activity{

	Button btnGiziBayi, btnGizidanASI, btnGiziBalita, btnGiziAnakSekolah, btnGiziRemaja, btnGiziOrangDewasa, btnGiziLansia;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView (R.layout.gizidaurhidup);
		
	btnGizidanASI = (Button) findViewById (R.id.GizidanASI);
	btnGizidanASI.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			startActivity (new Intent("com.example.aplikasiperiksagizi.giziatas"));
		}
	});
	
	btnGiziBalita = (Button) findViewById (R.id.GiziBalita);
	btnGiziBalita.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			startActivity (new Intent("com.example.aplikasiperiksagizi.GiziBalita"));
		}
	});
	
	btnGiziAnakSekolah = (Button) findViewById (R.id.GiziAnakSekolah);
	btnGiziAnakSekolah.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			startActivity (new Intent("com.example.aplikasiperiksagizi.GiziAnakSekolah"));
		}
	});
	
	btnGiziRemaja = (Button) findViewById (R.id.GiziRemaja);
	btnGiziRemaja.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			startActivity (new Intent("com.example.aplikasiperiksagizi.GiziRemaja"));
		}
	});
	
	btnGiziOrangDewasa = (Button) findViewById (R.id.GiziOrangDewasa);
	btnGiziOrangDewasa.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			startActivity (new Intent("com.example.aplikasiperiksagizi.GiziOrangDewasa"));
		}
	});
	
	btnGiziLansia = (Button) findViewById (R.id.GiziLansia);
	btnGiziLansia.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			startActivity (new Intent("com.example.aplikasiperiksagizi.GiziLansia"));
		}
	});
	
	}	
}