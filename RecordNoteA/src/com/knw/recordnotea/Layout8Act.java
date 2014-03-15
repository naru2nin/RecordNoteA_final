package com.knw.recordnotea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Layout8Act extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout8);
		
		ImageButton leftarrow = (ImageButton) findViewById(R.id.imageLeft);
		leftarrow.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), Layout7Act.class);
				startActivityForResult(intent,0);
			}
		});
		
		ImageButton check = (ImageButton) findViewById(R.id.imageUnCheck);
		check.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(v.getContext(), Layout9Act.class);
				startActivityForResult(intent1,0);
			}
		});
		
		ImageButton edit = (ImageButton) findViewById(R.id.imageEdit2);
		edit.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent2 = new Intent(v.getContext(), Layout3Act.class);
				startActivityForResult(intent2,0);
			}
		});
	}
}
