package com.pureon.pur_wallet.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.view.View
import android.webkit.WebView
import com.pureon.pur_wallet.R
import com.pureon.pur_wallet.activity.AddWebsiteActivity
import com.pureon.pur_wallet.activity.AppWebActivity
import com.pureon.pur_wallet.activity.collectwebsite.CollectWebsiteActivity
import com.pureon.pur_wallet.plugin.AppTabPlugin
import com.pureon.pur_wallet.constant.url.HttpUrls
import com.pureon.pur_wallet.util.web.WebAppUtil
import com.pureon.pur_wallet.view.TitleBar
import com.pureon.pur_wallet.view.WebErrorView
import com.pureon.pur_wallet.view.webview.SimpleWebViewClient

/**
 * Created by duanyytop on 2018/5/18
 */
class AppFragment : NBaseFragment() {

    companion object {
        val TAG = AppFragment::class.java.name!!
        const val COLLECT_WEBSITE = "https://pureon.ca"
    }

    private var webView: WebView? = null
    private var webErrorView: WebErrorView? = null

    override val contentLayout: Int
        get() = R.layout.fragment_application

    override fun initView() {
        webView = findViewById(R.id.webview) as WebView
        webErrorView = findViewById(R.id.view_web_error) as WebErrorView
    }

    override fun initData() {
        WebAppUtil.loadUrl(webView!!, HttpUrls.DISCOVER_URL)
        initWebSettings()
        initWebView()
    }

    override fun initAction() {
        webErrorView!!.setImpl { reloadUrl ->
            WebAppUtil.loadUrl(webView!!, reloadUrl)
            webView!!.visibility = View.VISIBLE
            webErrorView!!.visibility = View.GONE
        }
        var title = findViewById(R.id.title) as TitleBar
        title.setOnRightClickListener {
            activity!!.startActivity(Intent(activity, AddWebsiteActivity::class.java))
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initWebSettings() {
        WebAppUtil.initWebSettings(webView!!.settings)
        WebAppUtil.initWebViewCache(context, webView!!.settings)
    }

    private fun initWebView() {
        webView!!.webViewClient = object : SimpleWebViewClient(context, webErrorView) {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                if (url.contains(COLLECT_WEBSITE)) {
                    startActivity(Intent(context, CollectWebsiteActivity::class.java))
                } else {
                    val intent = Intent(context, AppWebActivity::class.java)
                    intent.putExtra(AppWebActivity.EXTRA_URL, url)
                    startActivity(intent)
                }
                return true
            }
        }
        webView!!.addJavascriptInterface(AppTabPlugin(activity!!), "appHybrid")
    }


    fun canGoBack(): Boolean {
        return webView!!.canGoBack()
    }

    fun goBack() {
        webView!!.goBack()
    }

}
