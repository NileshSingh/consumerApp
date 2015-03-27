package com.example.consumerapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 /****** Create Thread that will sleep for 5 seconds *************/        
		   Thread background = new Thread() {
		       public void run() {
		            
		           try {
		               // Thread will sleep for 5 seconds
		               sleep(5*1000);
		                
		               // After 5 seconds redirect to another intent
		               Intent i=new Intent(getBaseContext(),Login.class);
		               startActivity(i);
		                
		               //Remove activity
		               finish();
		                
		           } catch (Exception e) {
		            
		           }
		       }
		   };
		   
		   // start thread
		   background.start();
		    }  

		@Override
		protected void onDestroy() {
		    
		   super.onDestroy();
		    
		}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
