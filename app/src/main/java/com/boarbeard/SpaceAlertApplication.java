package com.boarbeard;

import android.app.Application;

import com.boarbeard.io.ExternalMedia;

public class SpaceAlertApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		ExternalMedia.init(this);
	}
}
