package com.noknok.android.client.oobsdk;

import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.BaseTask;
import com.noknok.android.client.utils.Logger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
class ProcessQRTask extends BaseTask<ActivityProxy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OobReceiver.ICompletionListener f63383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OOBRequestProcessor f63384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f63385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OOBRequestProcessor.OobData f63387e;

    public final ProcessQRTask a(HashMap<String, String> map) {
        this.f63385c = map;
        return this;
    }

    public void processResult(ActivityProxy activityProxy, OOBRequestProcessor.OobData oobData, ResultType resultType) {
        Logger.i("ProcessQRTask", "refID: " + oobData.f63372b);
        OobReceiver.ICompletionListener iCompletionListener = this.f63383a;
        if (iCompletionListener == null) {
            Logger.w("ProcessQRTask", "OobSDKListener is not initialized");
        } else {
            iCompletionListener.onComplete(activityProxy, resultType, oobData.f63372b, oobData.f63373c);
        }
    }

    public final ProcessQRTask a(String str) {
        this.f63386d = str;
        return this;
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void doInBackground(ActivityProxy... activityProxyArr) {
        Logger.i("ProcessQRTask", "doInBackground()");
        ActivityProxy activityProxy = activityProxyArr[0];
        this.f63387e = new OOBRequestProcessor.OobData();
        try {
            try {
                OOBRequestProcessor.OobData oobDataC = this.f63384b.c(this.f63386d);
                this.f63387e = oobDataC;
                this.f63384b.a(activityProxy, oobDataC, this.f63385c);
                processResult(activityProxy, this.f63387e, ResultType.SUCCESS);
            } catch (AppSDKException e5) {
                Logger.e("ProcessQRTask", "OOB proccess failed", e5);
                processResult(activityProxy, this.f63387e, e5.getResultType());
            }
        } finally {
            activityProxy.finish();
        }
    }

    @Override // com.noknok.android.client.utils.BaseTask
    public void handleException(RuntimeException runtimeException, ActivityProxy... activityProxyArr) {
        Logger.e("ProcessQRTask", "OOB proccess failed", runtimeException);
        processResult(activityProxyArr[0], this.f63387e, ResultType.FAILURE);
    }

    public final ProcessQRTask a(OobReceiver.ICompletionListener iCompletionListener) {
        this.f63383a = iCompletionListener;
        return this;
    }

    public final ProcessQRTask a(OOBRequestProcessor oOBRequestProcessor) {
        this.f63384b = oOBRequestProcessor;
        return this;
    }
}
