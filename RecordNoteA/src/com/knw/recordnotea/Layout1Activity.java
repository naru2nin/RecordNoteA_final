package com.knw.recordnotea;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Layout1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout1);
		
		ImageButton btn = (ImageButton) findViewById(R.id.imageAddRec);
		btn.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), Layout2Act.class);
				startActivityForResult(intent,0);
			}
		});
		
		ImageButton menu = (ImageButton) findViewById(R.id.imageMenu);
		menu.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(v.getContext(), Layout10Act.class);
				startActivityForResult(intent1,0);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout1, menu);
		return true;
	}

}
