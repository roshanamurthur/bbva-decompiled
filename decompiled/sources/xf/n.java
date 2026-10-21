package xf;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n implements Callable<Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f94625p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.e f94626q0;

    public n(com.google.firebase.crashlytics.internal.common.e eVar, long j10) {
        this.f94626q0 = eVar;
        this.f94625p0 = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f94625p0);
        this.f94626q0.f47799k.logEvent("_ae", bundle);
        return null;
    }
}
