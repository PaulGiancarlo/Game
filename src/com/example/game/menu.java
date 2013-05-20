package com.example.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


	public class menu extends Activity  implements OnClickListener {

		Button grid;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.grid);
			
			grid = (Button) findViewById(R.id.gvGrid);
			grid.setOnClickListener(this);
			
			
			
		}
		
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			//v.getId(R.id.gvGrid);
			//v.setOnClickListener(l)
			switch (v.getId()){
			
			case R.id.gvGrid:
					
				Intent g = new Intent("com.example.game.GRID");
				startActivity(g);
				break;
				
			
			
			}
			
			
			
		}

		
		
		
		
		
	}
	
	

