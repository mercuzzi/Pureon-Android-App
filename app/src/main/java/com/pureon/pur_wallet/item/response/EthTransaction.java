package com.pureon.pur_wallet.item.response;

import com.pureon.pur_wallet.item.transaction.RestTransaction;

import java.util.List;

public class EthTransaction {

    public String status;
    public String message;
    public List<RestTransaction> result;

}
