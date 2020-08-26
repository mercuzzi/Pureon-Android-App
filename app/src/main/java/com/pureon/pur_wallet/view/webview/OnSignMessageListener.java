package com.pureon.pur_wallet.view.webview;


import com.pureon.pur_wallet.view.webview.item.Message;
import com.pureon.pur_wallet.view.webview.item.Transaction;

public interface OnSignMessageListener {
    void onSignMessage(Message<Transaction> message);
}
