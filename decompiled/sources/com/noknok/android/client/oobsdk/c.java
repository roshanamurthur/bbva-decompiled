package com.noknok.android.client.oobsdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.noknok.android.client.appsdk.AppSDK2;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.utils.ActivityProxy;

/* JADX INFO: compiled from: OobReceiver.java */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c {
    @Deprecated
    public static void a(OobReceiver.ICompletionListener iCompletionListener, Activity activity, ResultType resultType, String str, AppSDK2.Operation operation) {
        throw new UnsupportedOperationException();
    }

    public static void b(final OobReceiver.ICompletionListener iCompletionListener, ActivityProxy activityProxy, final ResultType resultType, final String str, final AppSDK2.Operation operation) {
        final Activity workerActivity = activityProxy.getWorkerActivity();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.noknok.android.client.oobsdk.b
            @Override // java.lang.Runnable
            public final void run() {
                iCompletionListener.onComplete(workerActivity, resultType, str, operation);
            }
        });
    }
}
