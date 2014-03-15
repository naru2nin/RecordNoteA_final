package com.knw.recordnotea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Layout6Act extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout6);
		
		ImageButton rytarrow = (ImageButton) findViewById(R.id.imageRight);
		rytarrow.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), Layout7Act.class);
				startActivityForResult(intent,0);
			}
		});
	}
}
