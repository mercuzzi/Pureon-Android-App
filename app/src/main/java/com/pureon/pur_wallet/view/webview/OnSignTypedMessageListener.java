package com.pureon.pur_wallet.view.webview;

import com.pureon.pur_wallet.view.webview.item.Message;
import com.pureon.pur_wallet.view.webview.item.TypedData;

public interface OnSignTypedMessageListener {
    void onSignTypedMessage(Message<TypedData[]> message);
}
