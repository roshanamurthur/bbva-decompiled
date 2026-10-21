package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Boolean f47817p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ e.b f47818q0;

    public g(e.b bVar, Boolean bool) {
        this.f47818q0 = bVar;
        this.f47817p0 = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        Boolean bool = this.f47817p0;
        boolean zBooleanValue = bool.booleanValue();
        e.b bVar = this.f47818q0;
        if (zBooleanValue) {
            Logger.getLogger().d("Sending cached crash reports...");
            e.this.f47790b.grantDataCollectionPermission(bool.booleanValue());
            Executor executor = e.this.f47793e.getExecutor();
            return bVar.f47813p0.onSuccessTask(executor, new f(this, executor));
        }
        Logger.getLogger().v("Deleting cached crash reports...");
        e eVar = e.this;
        Iterator<File> it = eVar.f47795g.getCommonFiles(e.f47788t).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
        e eVar2 = e.this;
        eVar2.m.removeAllReports();
        eVar2.f47805r.trySetResult(null);
        return Tasks.forResult(null);
    }
}
