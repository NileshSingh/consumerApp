package com.example.consumerapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class main_page extends Activity implements OnClickListener {
	
	Button new_customer;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main_page); 
			
			new_customer=(Button) findViewById(R.id.new_cust);
			new_customer.setOnClickListener(this);
			

}

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			if(v==new_customer)
			{
				 Intent i=new Intent(getBaseContext(),new_customer.class);
	               startActivity(i);
			}
			
		}
}