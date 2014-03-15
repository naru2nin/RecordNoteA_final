package com.knw.recordnotea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Layout7Act extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout7);
		
		ImageButton rytarrow = (ImageButton) findViewById(R.id.imageRight1);
		rytarrow.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), Layout8Act.class);
				startActivityForResult(intent,0);
			}
		});
	}
}
