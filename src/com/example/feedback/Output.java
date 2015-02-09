package com.example.feedback;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Output extends Activity {
	private TextView fb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_output);
		
		
		fb = (TextView) findViewById(R.id.fb);
	
	
		String bc= getIntent().getExtras().getString("feedbackbox");
		fb.setText(bc);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.output, menu);
		return true;
	}

}
