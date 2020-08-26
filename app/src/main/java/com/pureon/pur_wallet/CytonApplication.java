package com.pureon.pur_wallet;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

import com.pureon.pur_wallet.service.http.EthRpcService;
import com.pureon.pur_wallet.util.crypto.AESCrypt;
import com.pureon.pur_wallet.util.crypto.WalletEntity;
import com.pureon.pur_wallet.util.db.SharePrefUtil;

/**
 * Created by duanyytop on 2018/4/17
 */
public class CytonApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
        WalletEntity.initWalletMnemonic(this);
        SharePrefUtil.init(this);
        EthRpcService.init(this);
        AESCrypt.init(this);
    }
}
