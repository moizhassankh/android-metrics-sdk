package ai.benshi.java;

import android.app.Application;

import ai.benshi.BshScroll;

public class ExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        BshScroll
                .buildConfiguration()
                .initialize(this);
    }
}
