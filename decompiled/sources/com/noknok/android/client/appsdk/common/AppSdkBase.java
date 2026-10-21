package com.noknok.android.client.appsdk.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.adobe.marketing.mobile.EventDataKeys;
import com.noknok.android.client.appsdk.FidoIn;
import com.noknok.android.client.appsdk.FidoOut;
import com.noknok.android.client.appsdk.IAppSDK;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Logger;
import java.security.InvalidParameterException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AppSdkBase implements IAppSDK {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FidoOut f62893b;
    protected IAppSDK.ClientLocation mClientLocation;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62892a = "AppSdkBase";
    protected Context mContext = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Semaphore f62894c = new Semaphore(0, true);
    protected boolean isInitialized = false;

    public void assertState() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new InvalidParameterException("Process should be called from background thread.");
        }
        if (this.mContext == null) {
            throw new IAppSDK.InitNotCalledException();
        }
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    @Deprecated
    public void autoSetSignature(Activity activity, String str) {
        a(activity, str, null, null);
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public void cancel() {
        Logger.i(this.f62892a, EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL);
        FidoOut fidoOut = new FidoOut();
        this.f62893b = fidoOut;
        fidoOut.fidoStatus = ResultType.CANCELED;
        this.f62894c.release();
        Logger.i(this.f62892a, "Ongoing process has been cancelled");
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public ResultType checkAuthPossible(ActivityProxy activityProxy, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    @Deprecated
    public boolean hasPlatformAuthenticator(Activity activity) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            return hasPlatformAuthenticator(activityProxyCreateFromActivity);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public ResultType init(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new InvalidParameterException("Init should call from background thread.");
        }
        ResultType resultType = ResultType.ALREADY_INITIALIZED;
        if (this.isInitialized) {
            return resultType;
        }
        Logger.i(Logger.TAG_CONFIG_REPORTER, "APPSDK Version : 9.1.0.1100");
        if (context == null) {
            throw new IllegalArgumentException("The aContext cannot be null!");
        }
        this.mContext = context.getApplicationContext();
        return ResultType.SUCCESS;
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public abstract FidoOut process(FidoIn fidoIn);

    public FidoOut waitForResponse() {
        try {
            this.f62894c.acquire();
        } catch (InterruptedException e5) {
            Logger.e(this.f62892a, "Error processing the request", e5);
            FidoOut fidoOut = new FidoOut();
            this.f62893b = fidoOut;
            fidoOut.fidoStatus = ResultType.FAILURE;
        }
        return this.f62893b;
    }

    private void a(Activity activity, String str, String str2, String[] strArr) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            autoSetSignature(activityProxyCreateFromActivity, str, str2, strArr);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public void autoSetSignature(ActivityProxy activityProxy, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public ResultType checkAuthPossible(ActivityProxy activityProxy, String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    @Deprecated
    public void autoSetSignature(Activity activity, String str, String str2) {
        a(activity, str, str2, null);
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    @Deprecated
    public ResultType checkAuthPossible(Activity activity, String str) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            return checkAuthPossible(activityProxyCreateFromActivity, str, (String) null);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public void autoSetSignature(ActivityProxy activityProxy, String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    @Deprecated
    public void autoSetSignature(Activity activity, String str, String str2, String[] strArr) {
        a(activity, str, str2, strArr);
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public boolean hasPlatformAuthenticator(ActivityProxy activityProxy) {
        throw new UnsupportedOperationException();
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    public void autoSetSignature(ActivityProxy activityProxy, String str, String str2, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.noknok.android.client.appsdk.IAppSDK
    @Deprecated
    public ResultType checkAuthPossible(Activity activity, String str, String str2) {
        ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(activity);
        try {
            return checkAuthPossible(activityProxyCreateFromActivity, str, str2);
        } finally {
            activityProxyCreateFromActivity.finish();
        }
    }

    public class CommunicationResponse implements ICommunicationClientResponse {
        public CommunicationResponse() {
        }

        @Override // com.noknok.android.client.commlib.ICommunicationClientResponse
        public void onResponse(String str, Object obj) {
            AppSdkBase appSdkBase = AppSdkBase.this;
            appSdkBase.f62893b = (FidoOut) obj;
            appSdkBase.f62894c.release();
        }

        @Override // com.noknok.android.client.commlib.ICommunicationClientResponse
        public void onRemoveRequest() {
        }

        @Override // com.noknok.android.client.commlib.ICommunicationClientResponse
        public void onError(String str) {
        }
    }
}
