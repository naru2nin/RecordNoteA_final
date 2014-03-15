package com.knw.recordnotea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Layout10Act extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout10);
		
		ImageButton btn = (ImageButton) findViewById(R.id.imageAdd1);
		btn.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), Layout2Act.class);
				startActivityForResult(intent,0);
			}
		});
		
		ImageButton menu = (ImageButton) findViewById(R.id.imageMenu1);
		menu.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(v.getContext(), Layout1Activity.class);
				startActivityForResult(intent1,0);
			}
		});
	}
}

