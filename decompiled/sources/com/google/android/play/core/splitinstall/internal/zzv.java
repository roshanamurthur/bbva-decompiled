package com.google.android.play.core.splitinstall.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzv implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final TaskCompletionSource f46323p0;

    public zzv() {
        this.f46323p0 = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzc();
        } catch (Exception e5) {
            zzb(e5);
        }
    }

    public final void zzb(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f46323p0;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void zzc();

    public zzv(@Nullable TaskCompletionSource taskCompletionSource) {
        this.f46323p0 = taskCompletionSource;
    }
}
