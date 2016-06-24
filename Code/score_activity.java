/**
 * 
 */
package com.icourse.CollegeLifeManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class score_activity extends Activity {
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score);
		setTitle("ÆÀ¸ö·Ö°ÉO(¡É_¡É)O~");

	RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
	ratingBar.setOnRatingBarChangeListener(
			new RatingBar.OnRatingBarChangeListener() {  
	        @Override  
	        public void onRatingChanged(RatingBar ratingBar,  
	                float rating, boolean fromUser) {  
	            // TODO Auto-generated method stub  
	            ratingBar.setRating(rating);  
	            Toast.makeText(score_activity.this,  
	                    "Ð»Ð»ÆÀ·Ö£¡", Toast.LENGTH_SHORT).show();
	            finish();
	        	}         
			}
			);  
	}
}
