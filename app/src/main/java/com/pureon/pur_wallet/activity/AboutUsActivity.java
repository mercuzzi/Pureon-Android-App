package com.pureon.pur_wallet.activity;

import android.content.pm.PackageManager;
import android.widget.TextView;

import com.pureon.pur_wallet.R;
import com.pureon.pur_wallet.constant.url.HttpUrls;
import com.pureon.pur_wallet.view.SettingButtonView;
import com.pureon.pur_wallet.view.TitleBar;

/**
 * Created by BaojunCZ on 2018/7/30.
 */
public class AboutUsActivity extends NBaseActivity {

    private TextView versionText;
    private TitleBar title;
    private SettingButtonView sourceCodeSBV, serverPrivateSBV, InfuraSBV, openSeaSBV;
    @Override
    protected int getContentLayout() {
        return R.layout.activity_about_us;
    }

    @Override
    protected void initView() {
        versionText = findViewById(R.id.app_version);
        sourceCodeSBV = findViewById(R.id.sbv_source_code);
        serverPrivateSBV = findViewById(R.id.sbv_server_private);
        InfuraSBV = findViewById(R.id.sbv_infura);
        openSeaSBV = findViewById(R.id.sbv_open_sea);
        title = findViewById(R.id.title);


    }

    @Override
    protected void initAction() {
        initListener();
    }

    @Override
    protected void initData() {
        try {
            String versionName = getPackageManager()
                    .getPackageInfo(getPackageName(), 0).versionName;
            versionText.setText(String.format("V %s", versionName));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        title.setLeftImage(R.drawable.ic_toptitle_back_white);
    }

    private void initListener() {
        sourceCodeSBV.setOnClickListener(() -> {
            SimpleWebActivity.gotoSimpleWeb(AboutUsActivity.this, HttpUrls.SOURCE_CODE_GITHUB_URL);
        });
        serverPrivateSBV.setOnClickListener(() -> {
            SimpleWebActivity.gotoSimpleWeb(AboutUsActivity.this, HttpUrls.PRODUCT_AGREEMENT_URL);
        });
        InfuraSBV.setOnClickListener(() -> {
            SimpleWebActivity.gotoSimpleWeb(AboutUsActivity.this, HttpUrls.INFURA_URL);
        });
        openSeaSBV.setOnClickListener(() -> {
            SimpleWebActivity.gotoSimpleWeb(AboutUsActivity.this, HttpUrls.OPEN_SEA_URL);
        });

    }
}
