package xf;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p implements Callable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f94628p0;

    public p(CrashlyticsCore crashlyticsCore) {
        this.f94628p0 = crashlyticsCore;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        try {
            r rVar = this.f94628p0.f47729e;
            boolean zDelete = rVar.f94631b.getCommonFile(rVar.f94630a).delete();
            if (!zDelete) {
                Logger.getLogger().w("Initialization marker file was not properly removed.");
            }
            return Boolean.valueOf(zDelete);
        } catch (Exception e5) {
            Logger.getLogger().e("Problem encountered deleting Crashlytics initialization marker.", e5);
            return Boolean.FALSE;
        }
    }
}
