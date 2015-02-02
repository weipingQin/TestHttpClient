package com.qinweiping.api;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import com.example.testhttpclient.R;
import com.hzblzx.common.util.BlzxException;

import android.content.Context;

public class TestApi extends BaseApi{
	
	public static final String TAG = "TestApi";
	private Context mContext;

	public TestApi(Context context) {
		super(context);
		mContext = context;
	}
	
	public String login(String phoneNumber,String password,String deviceToken) throws BlzxException {
		String url = String.format(mContext.getString(R.string.host_base_url), mContext.getString(R.string.host_base_url));
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("mobile",phoneNumber));
		params.add(new BasicNameValuePair("pwd",password));
		params.add(new BasicNameValuePair("mac",deviceToken));
		JSONObject json = getJsonResponseByPost(url, params);
		return json.toString();
	}

}
