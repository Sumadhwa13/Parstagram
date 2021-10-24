package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        // Register your Parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("sDL0rkZcKuQ9pBXOfmKKdJaR7bE97ISmbvsrNgEa")
                .clientKey("nyPM9gfDE5s1kATZGzUZIAO5vdCiI1oNf0EmDBcb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
