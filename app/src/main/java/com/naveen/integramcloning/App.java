package com.naveen.integramcloning;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Fk8swAhh8OyXnrLmJv1shT1yN5krrnhucARDg4Zn")
                // if defined
                .clientKey("FB7HQ09H5NiDP78ivpSlvBkgphgvgRQk8XFcf0gi")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
