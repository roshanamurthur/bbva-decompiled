package xf;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k implements Callable<Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f94616p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f94617q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.e f94618r0;

    public k(com.google.firebase.crashlytics.internal.common.e eVar, long j10, String str) {
        this.f94618r0 = eVar;
        this.f94616p0 = j10;
        this.f94617q0 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        com.google.firebase.crashlytics.internal.common.e eVar = this.f94618r0;
        com.google.firebase.crashlytics.internal.common.h hVar = eVar.f47801n;
        if (hVar != null && hVar.f47823e.get()) {
            return null;
        }
        eVar.f47797i.writeToLog(this.f94616p0, this.f94617q0);
        return null;
    }
}
