package com.example.feedback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
	
	private Button login;
	 private EditText username;
	 private EditText password;
	 
	 
	
	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
   
    
        OnClickListener listener = new OnClickListener() {

			@Override
			public void onClick(View x) {
				
				if(username.getText().toString().equals(password.getText().toString()))
				{
						
								
	Toast.makeText(getApplicationContext(),(CharSequence)password.getText()+"validated",Toast.LENGTH_LONG).show();
						
	Intent feedback = new Intent(getApplicationContext(),Feedback.class);
						
	Bundle bundle = new Bundle();
	bundle.putString("username",username.getText().toString());
	feedback.putExtras(bundle);
	
	startActivity(feedback);
						
						
						
				}
				
						
				
				
			
				
				else
				{
					
					
Toast.makeText(getApplicationContext(),password.getText() +"Invalid username/password",Toast.LENGTH_LONG).show();
				}
			
			}	
			
			};

			login.setOnClickListener(listener);
			
    
    }


    
    
}