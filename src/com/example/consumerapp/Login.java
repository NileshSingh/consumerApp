package com.example.consumerapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity implements OnClickListener {
	
	EditText username, password;
	Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_screen); 
		
		username=(EditText)findViewById(R.id.username);
		password=(EditText)findViewById(R.id.password);
		
		submit=(Button)findViewById(R.id.submit);
}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		
	}
}