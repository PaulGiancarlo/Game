package com.example.game;




import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class grid extends Activity {//implements android.widget.AdapterView.OnItemClickListener{
	
	Integer[] imagenesID={
			
		R.drawable.num01,
		R.drawable.num02,
		R.drawable.num3,
		R.drawable.num4,
		R.drawable.num05,
		R.drawable.num06,
		R.drawable.num08,		
		R.drawable.num09
		
	};
	
	protected void OnCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid);
		GridView gridView = (GridView) findViewById(R.id.gridView);
		gridView.setAdapter(new ImageAdapter(this));
		gridView.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView parent,
					View v, int position, long id)
					{
					Toast.makeText(getBaseContext(),
					"pic" + (position + 1) + "selected",
					Toast.LENGTH_SHORT).show();
					}
		});
		
	}
	
	public class ImageAdapter extends BaseAdapter{
		
		private Context contexto;
		public ImageAdapter(Context c){
			contexto =c;
			
			
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return imagenesID.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			// TODO Auto-generated method stub
			ImageView imageView;
			
			if(convertView ==null){
				imageView = new ImageView(contexto);
				imageView.setLayoutParams(new GridView.LayoutParams(85,85));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(5,5,5,5);
				
			}else{
				imageView =(ImageView) convertView;
				
							
			}
			imageView.setImageResource(imagenesID[position]);
			
			return imageView;
		}
		
		
		
	}
/*
	@Override
	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
	}*/
}