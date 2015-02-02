package com.qinweiping;

import com.example.testhttpclient.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TestHttpClientActivity extends Activity {
	
	TextView mtestHttp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testhttpclient);
		init();
	}

	private void init(){
		mtestHttp = (TextView)findViewById(R.id.testhttpclient_info);
	}
}
