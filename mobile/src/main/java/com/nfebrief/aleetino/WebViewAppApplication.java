package com.nfebrief.aleetino;

import android.app.Application;
import android.content.Context;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.onesignal.OneSignal;
import com.robotemplates.kozuza.Kozuza;
import com.nfebrief.aleetino.listener.OneSignalNotificationOpenedHandler;


public class WebViewAppApplication extends Application
{
	private static WebViewAppApplication sInstance;

	private Tracker mTracker;


	public WebViewAppApplication()
	{
		sInstance = this;
	}


	public static Context getContext()
	{
		return sInstance;
	}


	@Override
	public void onCreate()
	{
		super.onCreate();

		// force AsyncTask to be initialized in the main thread due to the bug:
		// http://stackoverflow.com/questions/4280330/onpostexecute-not-being-called-in-asynctask-handler-runtime-exception
		try
		{
			Class.forName("android.os.AsyncTask");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		// initialize OneSignal
		OneSignal.startInit(this).setNotificationOpenedHandler(new OneSignalNotificationOpenedHandler()).init();
		OneSignal.setInFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification);

		// kozuza
		Kozuza.initWebViewApp(this, WebViewAppConfig.PURCHASE_CODE);
	}


	public synchronized Tracker getTracker()
	{
		if(mTracker == null)
		{
			GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
			analytics.setDryRun(WebViewAppConfig.ANALYTICS_TRACKING_ID == null || WebViewAppConfig.ANALYTICS_TRACKING_ID.equals(""));
			mTracker = analytics.newTracker(R.xml.analytics_app_tracker);
			mTracker.set("&tid", WebViewAppConfig.ANALYTICS_TRACKING_ID);
		}
		return mTracker;
	}
}
