package com.knw.recordnotea;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Layout2Act extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout2);
		
		ImageButton add1 = (ImageButton) findViewById(R.id.imageAddCol);
		add1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), Layout3Act.class);
				startActivityForResult(intent,0);
			}
		});
		
		ImageButton add2 = (ImageButton) findViewById(R.id.imageAddCol1);
		add2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(v.getContext(), Layout3Act.class);
				startActivityForResult(intent1,0);
			}
		});
		
		ImageButton color = (ImageButton) findViewById(R.id.imageRecordColor);
		color.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent2 = new Intent(v.getContext(), Layout4Act.class);
				startActivityForResult(intent2,0);
			}
		});
	}
}
