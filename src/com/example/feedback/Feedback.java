package com.example.feedback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class Feedback extends Activity  {
	
	
	
	private EditText name;
	private EditText age;
	private EditText phno;
	private EditText feedbackbox;
	private RatingBar ratingbar1;
	private Button send;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback);
		
		
		name = (EditText) findViewById(R.id.name);
		send = (Button) findViewById(R.id.send);
		age = (EditText) findViewById(R.id.age);
	    phno = (EditText) findViewById(R.id.phno);
		feedbackbox = (EditText) findViewById(R.id.feedbackbox);
		String un= getIntent().getExtras().getString("username");
		name.setText(un);
		
		OnClickListener listener = new OnClickListener() {

			@Override
			public void onClick(View x) {
				
				Intent output = new Intent(getApplicationContext(),Output.class);
				Bundle bundle = new Bundle();
				bundle.putString("feedbackbox",feedbackbox.getText().toString());
				output.putExtras(bundle);
				startActivity(output);
				
			}
		
		};
		send.setOnClickListener(listener);
		
		
		
	}

	

}
