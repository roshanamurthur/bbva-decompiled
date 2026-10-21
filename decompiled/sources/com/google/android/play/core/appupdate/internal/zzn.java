package com.google.android.play.core.appupdate.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzn implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final TaskCompletionSource f46070p0;

    public zzn() {
        this.f46070p0 = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e5) {
            zzc(e5);
        }
    }

    public abstract void zza();

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f46070p0;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public zzn(@Nullable TaskCompletionSource taskCompletionSource) {
        this.f46070p0 = taskCompletionSource;
    }
}
