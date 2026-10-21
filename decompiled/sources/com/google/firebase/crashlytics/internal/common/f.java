package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements SuccessContinuation<Settings, Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Executor f47815p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ g f47816q0;

    public f(g gVar, Executor executor) {
        this.f47816q0 = gVar;
        this.f47815p0 = executor;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable Settings settings) throws Exception {
        if (settings == null) {
            Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
            return Tasks.forResult(null);
        }
        g gVar = this.f47816q0;
        e.b(e.this);
        e.b bVar = gVar.f47818q0;
        e.this.m.sendReports(this.f47815p0);
        e.this.f47805r.trySetResult(null);
        return Tasks.forResult(null);
    }
}
