package com.example.game;



import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
/*		
		Thread logo = new Thread(){
			public void run(){
				try{
					int tiempo =0;
					while(tiempo <5000){
						sleep(100);
						tiempo = tiempo + 100;
											
					}
					
					Intent i = new Intent("com.example.game.GRID");
					startActivity(i);
					
				}catch(InterruptedException e){
					e.printStackTrace();
					
				}finally{
					finish();
					
				}
				
				
			}
		};//////
		
		logo.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}*/

	}
}