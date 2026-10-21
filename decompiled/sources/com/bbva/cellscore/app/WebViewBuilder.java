package com.bbva.cellscore.app;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.cellscore.web.client.CellsWebChromeClient;
import com.bbva.cellscore.web.client.CellsWebClient;
import com.bbva.cellscore.web.constant.DarkMode;
import com.bbva.cellscore.web.navigation.Route;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CellsWebChromeClient f26915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CellsWebClient f26916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Route f26922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DarkMode f26923i = DarkMode.FORCE_AUTO;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26924j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26925k = true;

    public WebViewBuilder autoLoad(boolean z10) {
        this.f26925k = z10;
        return this;
    }

    public WebViewBuilder chromeClient(CellsWebChromeClient cellsWebChromeClient) {
        this.f26915a = cellsWebChromeClient;
        return this;
    }

    public WebViewBuilder client(CellsWebClient cellsWebClient) {
        this.f26916b = cellsWebClient;
        return this;
    }

    public WebViewBuilder darkMode(DarkMode darkMode) {
        this.f26923i = darkMode;
        return this;
    }

    public WebViewBuilder enableCookies(boolean z10) {
        this.f26920f = z10;
        return this;
    }

    public CellsWebChromeClient getChromeClient() {
        return this.f26915a;
    }

    public CellsWebClient getClient() {
        return this.f26916b;
    }

    public DarkMode getDarkMode() {
        return this.f26923i;
    }

    public String getIndex() {
        return this.f26917c;
    }

    public int getMaxPluginFileCacheAge() {
        return this.f26924j;
    }

    public Route getNativeWebContainerRoute() {
        return this.f26922h;
    }

    public String getWebId() {
        return this.f26918d;
    }

    public long getWebViewLoadDelay() {
        return this.f26921g;
    }

    public WebViewBuilder index(String str) {
        this.f26917c = str;
        return this;
    }

    public boolean isAutoLoadEnabled() {
        return this.f26925k;
    }

    public boolean isEnableCookies() {
        return this.f26920f;
    }

    public boolean isWebDebugging() {
        return this.f26919e;
    }

    public WebViewBuilder maxPluginFileCacheExpiration(int i10) {
        this.f26924j = i10;
        return this;
    }

    public WebViewBuilder nativeWebContainerRoute(Route route) {
        this.f26922h = route;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebViewBuilder{mChromeClient=");
        sb2.append(this.f26915a);
        sb2.append(", mClient=");
        sb2.append(this.f26916b);
        sb2.append(", mIndex='");
        sb2.append(this.f26917c);
        sb2.append("', mWebId='");
        sb2.append(this.f26918d);
        sb2.append("', mWebDebugging=");
        sb2.append(this.f26919e);
        sb2.append(", mEnableCookies=");
        sb2.append(this.f26920f);
        sb2.append(", mWebViewLoadDelay=");
        sb2.append(this.f26921g);
        sb2.append(", mNativeWebContainerRoute=");
        sb2.append(this.f26922h);
        sb2.append(", mDarkMode=");
        sb2.append(this.f26923i);
        sb2.append(", mFileCachedMaxDays=");
        sb2.append(this.f26924j);
        sb2.append(", mAutoLoad=");
        return a.d(sb2, this.f26925k, AbstractJsonLexerKt.END_OBJ);
    }

    public WebViewBuilder webDebugging(boolean z10) {
        this.f26919e = z10;
        return this;
    }

    public WebViewBuilder webId(String str) {
        this.f26918d = str;
        return this;
    }

    public WebViewBuilder webViewLoadDelay(long j10) {
        this.f26921g = j10;
        return this;
    }
}
