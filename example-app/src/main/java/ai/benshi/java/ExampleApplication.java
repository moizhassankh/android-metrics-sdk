package ai.benshi.java;

import android.app.Application;

import ai.benshi.PromotedAi;

public class ExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        PromotedAi
                .buildConfiguration()
                .withMetricsLoggingApiKey("")
                .withMetricsLoggingUrl("")
                .initialize(this);
    }
}
