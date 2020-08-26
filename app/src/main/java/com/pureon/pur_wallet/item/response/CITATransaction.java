package com.pureon.pur_wallet.item.response;

import com.pureon.pur_wallet.item.transaction.RestTransaction;

import java.util.List;

public class CITATransaction {

    public CITATransactionResult result;

    public static class CITATransactionResult {
        public List<RestTransaction> transactions;
    }

}
