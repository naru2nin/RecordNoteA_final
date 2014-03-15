package com.knw.recordnotea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Layout3Act extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout3);
		
		ImageButton color = (ImageButton) findViewById(R.id.imageRecordColor1);
		color.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), Layout4Act.class);
				startActivityForResult(intent,0);
			}
		});
		
		ImageButton rowbot = (ImageButton) findViewById(R.id.rowAddImg);
		rowbot.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(v.getContext(), Layout5Act.class);
				startActivityForResult(intent1,0);
			}
		});
	}
}
