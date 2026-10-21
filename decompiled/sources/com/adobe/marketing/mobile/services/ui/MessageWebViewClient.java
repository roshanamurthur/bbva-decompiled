package com.adobe.marketing.mobile.services.ui;

import android.annotation.TargetApi;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import ci.a;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.internal.utility.StringUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class MessageWebViewClient extends WebViewClient {
    private static final String TAG = "MessageWebViewClient";
    private Map<String, String> assetMap = Collections.emptyMap();
    private final AEPMessage message;

    public MessageWebViewClient(AEPMessage aEPMessage) {
        this.message = aEPMessage;
    }

    private boolean handleUrl(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            MobileCore.log(LoggingMode.DEBUG, TAG, "Unable to handle a null or empty url.");
            return true;
        }
        AEPMessage aEPMessage = this.message;
        FullscreenMessageDelegate fullscreenMessageDelegate = aEPMessage.fullScreenMessageDelegate;
        return fullscreenMessageDelegate == null || fullscreenMessageDelegate.overrideUrlLoad(aEPMessage, str);
    }

    private WebResourceResponse handleWebResourceRequest(String str) {
        if (StringUtils.stringIsUrl(str) && this.assetMap.get(str) != null) {
            try {
                return new WebResourceResponse(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str)), null, new FileInputStream(this.assetMap.get(str)));
            } catch (IOException unused) {
                LoggingMode loggingMode = LoggingMode.DEBUG;
                StringBuilder sbD = a.d("Unable to create WebResourceResponse for remote asset ", str, "and local asset ");
                sbD.append(this.assetMap.get(str));
                MobileCore.log(loggingMode, TAG, sbD.toString());
            }
        }
        return null;
    }

    public void setLocalAssetsMap(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.assetMap = new HashMap(map);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseHandleWebResourceRequest = handleWebResourceRequest(str);
        return webResourceResponseHandleWebResourceRequest != null ? webResourceResponseHandleWebResourceRequest : super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return handleUrl(str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return handleUrl(webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseHandleWebResourceRequest = handleWebResourceRequest(webResourceRequest.getUrl().toString());
        return webResourceResponseHandleWebResourceRequest != null ? webResourceResponseHandleWebResourceRequest : super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
