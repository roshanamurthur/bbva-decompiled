package xf;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m implements Callable<Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f94623p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.e f94624q0;

    public m(com.google.firebase.crashlytics.internal.common.e eVar, String str) {
        this.f94624q0 = eVar;
        this.f94623p0 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        com.google.firebase.crashlytics.internal.common.e.a(this.f94624q0, this.f94623p0, Boolean.FALSE);
        return null;
    }
}
