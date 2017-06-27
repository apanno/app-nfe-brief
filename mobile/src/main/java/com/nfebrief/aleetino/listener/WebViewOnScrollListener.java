package com.nfebrief.aleetino.listener;

import com.nfebrief.aleetino.view.RoboWebView;
import com.nfebrief.aleetino.utility.Logcat;


public class WebViewOnScrollListener implements RoboWebView.OnScrollListener
{
	private static final int THRESHOLD = 100;

	private int mCounter = 0;
	private boolean mShown = true;


	@Override
	public void onScrollChanged(RoboWebView roboWebView, int x, int y, int oldx, int oldy)
	{
		int diff = y - oldy;

		if(y == 0)
		{
			if(!mShown)
			{
				mShown = true;
				mCounter = 0;
				Logcat.d("show");
			}
		}
		else
		{
			if(mShown && mCounter > THRESHOLD)
			{
				mShown = false;
				mCounter = 0;
				Logcat.d("hide");
			}
			else if(!mShown && mCounter < -THRESHOLD)
			{
				mShown = true;
				mCounter = 0;
				Logcat.d("show");
			}
		}

		if((mShown && diff > 0) || (!mShown && diff < 0))
		{
			mCounter += diff;
		}
	}
}
