package com.pureon.pur_wallet.view.webview;

import android.net.Uri;

public interface UrlHandler {

    String getScheme();

    String handle(Uri uri);
}