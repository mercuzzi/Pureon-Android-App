package com.pureon.pur_wallet.view.webview;

import com.pureon.pur_wallet.view.webview.item.Message;
import com.pureon.pur_wallet.view.webview.item.Transaction;

public interface OnSignPersonalMessageListener {
    void onSignPersonalMessage(Message<Transaction> message);
}
