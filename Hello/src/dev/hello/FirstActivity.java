package dev.hello;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;

public class FirstActivity extends Activity {
	
	public static final String TAG = "MYLogging";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d("myLog", "onCreate startoooo~~~~~~~~~~~~~");
        Log.v(TAG, "verbose.........haha");
        Log.e(TAG, "error.........haha");
        Log.i(TAG, "info.........haha");
        Log.w(TAG, "warn.........haha");
        Log.d(TAG, "debug.........haha");
        
        
       
        
    }

    

    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		 Log.d(TAG, "debug.........onPause");
		
	}



	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		 Log.d(TAG, "debug.........onRestart");
	}



	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		 Log.d(TAG, "debug.........onResume");
	}



	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		 Log.d(TAG, "debug.........onStart");
	}



	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		 Log.d(TAG, "debug.........onStop");
	}



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }
    
    
    
    
}
