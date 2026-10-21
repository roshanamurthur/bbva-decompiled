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
public final class d implements SuccessContinuation<Settings, Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Executor f47785p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f47786q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ e.a f47787r0;

    public d(e.a aVar, Executor executor, String str) {
        this.f47787r0 = aVar;
        this.f47785p0 = executor;
        this.f47786q0 = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable Settings settings) throws Exception {
        if (settings == null) {
            Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        e.a aVar = this.f47787r0;
        taskArr[0] = e.b(e.this);
        taskArr[1] = e.this.m.sendReports(this.f47785p0, aVar.f47811t0 ? this.f47786q0 : null);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
