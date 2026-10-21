package com.huawei.secure.android.common.webview;

import android.webkit.WebView;
import com.huawei.secure.android.common.util.b;
import com.huawei.secure.android.common.util.c;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes10.dex */
public class SafeGetUrl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50690c = "SafeGetUrl";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f50691d = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebView f50693b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f50694a;

        public a(CountDownLatch countDownLatch) {
            this.f50694a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            SafeGetUrl safeGetUrl = SafeGetUrl.this;
            safeGetUrl.setUrl(safeGetUrl.f50693b.getUrl());
            this.f50694a.countDown();
        }
    }

    public SafeGetUrl() {
    }

    public String getUrlMethod() {
        if (this.f50693b == null) {
            return "";
        }
        if (b.a()) {
            return this.f50693b.getUrl();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c.a(new a(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e5) {
            e5.getMessage();
        }
        return this.f50692a;
    }

    public WebView getWebView() {
        return this.f50693b;
    }

    public void setUrl(String str) {
        this.f50692a = str;
    }

    public void setWebView(WebView webView) {
        this.f50693b = webView;
    }

    public SafeGetUrl(WebView webView) {
        this.f50693b = webView;
    }
}
