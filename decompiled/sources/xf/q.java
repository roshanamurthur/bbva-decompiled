package xf;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q implements Callable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f94629p0;

    public q(CrashlyticsCore crashlyticsCore) {
        this.f94629p0 = crashlyticsCore;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        com.google.firebase.crashlytics.internal.common.e eVar = this.f94629p0.f47732h;
        r rVar = eVar.f47791c;
        FileStore fileStore = rVar.f94631b;
        String str = rVar.f94630a;
        boolean z10 = true;
        if (fileStore.getCommonFile(str).exists()) {
            Logger.getLogger().v("Found previous crash marker.");
            rVar.f94631b.getCommonFile(str).delete();
        } else {
            String strF = eVar.f();
            if (strF == null || !eVar.f47798j.hasCrashDataForSession(strF)) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
