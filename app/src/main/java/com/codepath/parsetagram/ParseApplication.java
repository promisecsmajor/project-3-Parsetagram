package com.codepath.parsetagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2jSGWFyM7ulMRKYSIQf0DFzIiVJEixYVZl5QbPIo")
                .clientKey("FxumaQ9t1Lppj8Q4IQj5DU3ece7zVUcECmTPsMrt")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
