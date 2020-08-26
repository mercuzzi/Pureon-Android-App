package com.pureon.pur_wallet.event;

import com.pureon.pur_wallet.item.App;

public class AppHistoryEvent {

    public App app;

    public AppHistoryEvent(App app, long timestamp) {
        this.app = app;
        this.app.timestamp = timestamp;
    }

}
