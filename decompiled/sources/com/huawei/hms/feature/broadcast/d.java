package com.huawei.hms.feature.broadcast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.utils.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class d extends FeatureInstallListenerRegistry<InstallState> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f50200g = "LocalApk-FeatureInstallListenerRegistry";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static FeatureInstallListenerRegistry f50201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Handler f50202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f50203j;

    public class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InstallState f50204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f50205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f50206c;

        public a(InstallState installState, Intent intent, Context context) {
            this.f50204a = installState;
            this.f50205b = intent;
            this.f50206c = context;
        }

        @Override // com.huawei.hms.feature.broadcast.f
        public void a() {
            if (this.f50205b.getBooleanExtra("triggered_by_app", false)) {
                Logger.i(d.f50200g, "send broadcast after verified.");
            } else {
                this.f50205b.putExtra("triggered_by_app", true);
                this.f50206c.sendBroadcast(com.huawei.hms.feature.utils.e.a(this.f50205b));
            }
        }

        @Override // com.huawei.hms.feature.broadcast.f
        public Intent b() {
            return this.f50205b;
        }

        @Override // com.huawei.hms.feature.broadcast.f
        public void c() {
            d.this.a(this.f50204a, 5, 0);
        }

        @Override // com.huawei.hms.feature.broadcast.f
        public void a(int i10) {
            d.this.a(this.f50204a, 6, i10);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InstallState f50208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f50210c;

        public b(InstallState installState, int i10, int i11) {
            this.f50208a = installState;
            this.f50209b = i10;
            this.f50210c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.notifyListeners(this.f50208a.makeSessionState(this.f50209b, this.f50210c));
        }
    }

    private d(Context context) {
        this(context, h.a());
    }

    public static synchronized FeatureInstallListenerRegistry a(Context context) {
        try {
            if (f50201h == null) {
                f50201h = new d(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f50201h;
    }

    @Override // com.huawei.hms.feature.broadcast.FeatureInstallListenerRegistry
    public final void handleBroadcast(Context context, Intent intent) {
        if (context == null || intent == null) {
            Logger.w(f50200g, "The context or intent is null.");
            return;
        }
        String str = f50200g;
        Logger.i(str, "begin handle broadcast ...");
        IHWMarketBroadcastHandler broadcastHandler = BroadcastHandlerManager.getBroadcastHandler(intent);
        if (broadcastHandler == null) {
            return;
        }
        InstallState installStateMakeSessionState = broadcastHandler.makeSessionState(intent);
        Logger.d(str, "featureInstallSessionState : " + installStateMakeSessionState);
        if (installStateMakeSessionState.status() != 3 || this.f50203j == null || installStateMakeSessionState.mInternalIntents == null) {
            notifyListeners(installStateMakeSessionState);
        } else if (!com.huawei.hms.feature.utils.f.a(context, true) || Build.VERSION.SDK_INT != 24) {
            a(context, intent, installStateMakeSessionState);
        } else {
            Logger.w(str, "Android 7.0 return apk list ，but it is System app  ");
            notifyListeners(installStateMakeSessionState);
        }
    }

    private d(Context context, g gVar) {
        super(context);
        this.f50202i = new Handler(Looper.getMainLooper());
        this.f50203j = gVar;
    }

    private void a(Context context, Intent intent, InstallState installState) {
        if (this.f50203j == null || installState.mInternalIntents == null) {
            return;
        }
        this.f50203j.a(installState.mInternalIntents, new a(installState, intent, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InstallState installState, int i10, int i11) {
        this.f50202i.post(new b(installState, i10, i11));
    }
}
