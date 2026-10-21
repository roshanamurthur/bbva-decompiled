package com.noknok.android.client.appsdk;

import ad.d;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.Gson;
import com.noknok.android.client.appsdk.common.WebRequestParams;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.JsonObjectAdapter;
import com.noknok.android.client.utils.Logger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class WebAppSDK {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62874b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IAppSDK f62878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppSDK2 f62879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WebView f62880h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebRequestParams f62873a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f62875c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActivityProxy f62876d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f62877e = null;

    public class initOperationAsync extends AsyncTask<Object, Void, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f62881a;

        public /* synthetic */ initOperationAsync(WebAppSDK webAppSDK, int i10) {
            this();
        }

        private initOperationAsync() {
            this.f62881a = null;
        }

        @Override // android.os.AsyncTask
        public String doInBackground(Object... objArr) {
            if (WebAppSDK.this.f62879g == null) {
                return null;
            }
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            this.f62881a = (String) objArr[2];
            AppSDK2.Operation operationValueOf = AppSDK2.Operation.valueOf(str);
            Gson gsonCreate = JsonObjectAdapter.GsonBuilder().create();
            AppSDK2.RPData rPData = (AppSDK2.RPData) gsonCreate.fromJson(str2, AppSDK2.RPData.class);
            if (rPData.origin == null) {
                rPData.origin = WebAppSDK.this.f62873a.getOrigin();
            }
            WebAppSDK webAppSDK = WebAppSDK.this;
            ActivityProxy activityProxy = webAppSDK.f62876d;
            if (activityProxy != null) {
                rPData.setCallerActivityProxy(activityProxy);
            } else {
                rPData.setCallerActivity(webAppSDK.f62875c);
            }
            return gsonCreate.toJson(WebAppSDK.this.f62879g.initOperation(operationValueOf, rPData));
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            if (this.f62881a != null) {
                AppSDK2.ResponseData responseData = (AppSDK2.ResponseData) JsonObjectAdapter.GsonBuilder().create().fromJson(str, AppSDK2.ResponseData.class);
                responseData.message = responseData.message.replace(RootService.LINE_BREAK, "");
                StringBuilder sb2 = new StringBuilder("javascript:");
                sb2.append(this.f62881a);
                sb2.append("(");
                sb2.append(responseData.status.ordinal());
                sb2.append(",'");
                WebAppSDK.this.f62880h.loadUrl(d.f(sb2, responseData.message, "')"));
            }
            super.onPostExecute(str);
        }
    }

    public class processAsync extends AsyncTask<Object, Void, FidoOut> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f62883a;

        public /* synthetic */ processAsync(WebAppSDK webAppSDK, int i10) {
            this();
        }

        private processAsync() {
            this.f62883a = null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.AsyncTask
        public FidoOut doInBackground(Object... objArr) {
            String str = (String) objArr[0];
            this.f62883a = (String) objArr[1];
            FidoIn fidoIn = (FidoIn) JsonObjectAdapter.GsonBuilder().create().fromJson(str, FidoIn.class);
            if (fidoIn.origin == null) {
                fidoIn.origin = WebAppSDK.this.f62873a.getOrigin();
            }
            if (fidoIn.channelBindings == null) {
                HashMap map = new HashMap();
                map.put("serverEndPoint", null);
                map.put("tlsServerCertificate", null);
                map.put(ClientData.KEY_CID_PUBKEY, null);
                map.put("tlsUnique", null);
                fidoIn.channelBindings = map;
            }
            WebAppSDK webAppSDK = WebAppSDK.this;
            ResultType resultTypeInit = webAppSDK.f62878f.init(webAppSDK.f62877e);
            WebAppSDK webAppSDK2 = WebAppSDK.this;
            ActivityProxy activityProxy = webAppSDK2.f62876d;
            if (activityProxy != null) {
                fidoIn.setCallerActivityProxy(activityProxy);
            } else {
                fidoIn.setCallerActivity(webAppSDK2.f62875c);
            }
            if (resultTypeInit == ResultType.SUCCESS || resultTypeInit == ResultType.ALREADY_INITIALIZED) {
                return WebAppSDK.this.f62878f.process(fidoIn);
            }
            Logger.e("WebAppSDK", "Failed to initialize IAppSDK. Error " + resultTypeInit);
            FidoOut fidoOut = new FidoOut();
            fidoOut.fidoStatus = ResultType.FAILURE;
            return fidoOut;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(FidoOut fidoOut) {
            if (this.f62883a != null) {
                WebAppSDK.this.f62880h.loadUrl(("javascript:" + this.f62883a + "('" + fidoOut.fidoStatus + "','" + fidoOut.fidoResponse + "')").replace("\"", "\\\""));
            }
            super.onPostExecute(fidoOut);
        }
    }

    public class processV2Async extends AsyncTask<Object, Void, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f62885a;

        public /* synthetic */ processV2Async(WebAppSDK webAppSDK, int i10) {
            this();
        }

        private processV2Async() {
            this.f62885a = null;
        }

        @Override // android.os.AsyncTask
        public String doInBackground(Object... objArr) {
            if (WebAppSDK.this.f62879g == null) {
                return null;
            }
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            this.f62885a = (String) objArr[2];
            Gson gsonCreate = JsonObjectAdapter.GsonBuilder().create();
            AppSDK2.RPData rPData = (AppSDK2.RPData) gsonCreate.fromJson(str, AppSDK2.RPData.class);
            if (rPData.origin == null) {
                rPData.origin = WebAppSDK.this.f62873a.getOrigin();
            }
            WebAppSDK webAppSDK = WebAppSDK.this;
            ActivityProxy activityProxy = webAppSDK.f62876d;
            if (activityProxy != null) {
                rPData.setCallerActivityProxy(activityProxy);
            } else {
                rPData.setCallerActivity(webAppSDK.f62875c);
            }
            return gsonCreate.toJson(WebAppSDK.this.f62879g.process(rPData, str2));
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            if (this.f62885a != null) {
                AppSDK2.ResponseData responseData = (AppSDK2.ResponseData) JsonObjectAdapter.GsonBuilder().create().fromJson(str, AppSDK2.ResponseData.class);
                String str2 = responseData.message;
                if (str2 != null) {
                    responseData.message = str2.replace(RootService.LINE_BREAK, "");
                } else {
                    responseData.message = "";
                }
                StringBuilder sb2 = new StringBuilder("javascript:");
                sb2.append(this.f62885a);
                sb2.append("(");
                sb2.append(responseData.status.ordinal());
                sb2.append(",'");
                WebAppSDK.this.f62880h.loadUrl(d.f(sb2, responseData.message, "')"));
            }
            super.onPostExecute(str);
        }
    }

    public WebAppSDK(IAppSDK iAppSDK, AppSDK2 appSDK2) {
        this.f62878f = iAppSDK;
        this.f62879g = appSDK2;
    }

    @JavascriptInterface
    public void deleteSession() {
        CookieManager.getInstance().removeAllCookies(null);
    }

    @JavascriptInterface
    public String getResultType(int i10) {
        ResultType resultType;
        ResultType[] resultTypeArrValues = ResultType.values();
        int length = resultTypeArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                resultType = null;
                break;
            }
            resultType = resultTypeArrValues[i11];
            if (resultType.ordinal() == i10) {
                break;
            }
            i11++;
        }
        if (resultType == null) {
            resultType = ResultType.FAILURE;
        }
        return resultType.getMessage(this.f62877e);
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    @Deprecated
    public void init(Activity activity, WebView webView) {
        if (activity == null) {
            throw new IllegalArgumentException();
        }
        this.f62875c = activity;
        this.f62877e = activity.getApplicationContext();
        init(webView);
    }

    @JavascriptInterface
    public void initOperation(String str, String str2, String str3) {
        if (this.f62875c == null && this.f62876d == null) {
            throw new IllegalArgumentException("Init not called");
        }
        new initOperationAsync(this, 0).execute(str, str2, str3);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f62873a.setOrigin(str);
        if (this.f62874b == null) {
            this.f62874b = WebRequestParams.readRawFile(this.f62877e, "injectedappsdk");
        }
        if (this.f62874b != null) {
            Logger.i("WebAppSDK", "onPageFinished (" + str + "): Inject injectedappsdk.js");
            webView.evaluateJavascript(this.f62874b, new a());
        }
    }

    @JavascriptInterface
    public void process(String str, String str2) {
        if (this.f62875c == null && this.f62876d == null) {
            throw new IllegalArgumentException("Init not called");
        }
        new processAsync(this, 0).execute(str, str2);
    }

    @JavascriptInterface
    public void process(String str, String str2, String str3) {
        if (this.f62875c == null && this.f62876d == null) {
            throw new IllegalArgumentException("Init not called");
        }
        new processV2Async(this, 0).execute(str, str2, str3);
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public void init(ActivityProxy activityProxy, WebView webView) {
        if (activityProxy != null) {
            this.f62876d = activityProxy;
            this.f62877e = activityProxy.getApplicationContext();
            init(webView);
            return;
        }
        throw new IllegalArgumentException();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void init(WebView webView) {
        this.f62873a = new WebRequestParams();
        this.f62880h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f62880h.addJavascriptInterface(this, "NNLAppSdk");
        this.f62880h.getSettings().setDomStorageEnabled(true);
        this.f62880h.getSettings().setAllowUniversalAccessFromFileURLs(true);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        CookieManager.setAcceptFileSchemeCookies(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str) {
    }
}
