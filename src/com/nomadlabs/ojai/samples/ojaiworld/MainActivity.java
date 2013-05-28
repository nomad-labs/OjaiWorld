package com.nomadlabs.ojai.samples.ojaiworld;

import com.nomadlabs.ojai.client.ScanActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends ScanActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onScan(String data, Bundle extras) {
		super.onScan(data, extras);
		
		TextView tv = (TextView) findViewById(R.id.hello_textview);
		tv.setText(data);
	}

}
