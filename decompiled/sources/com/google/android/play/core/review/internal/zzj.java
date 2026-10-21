package com.google.android.play.core.review.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzj implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final TaskCompletionSource f46215p0;

    public zzj() {
        this.f46215p0 = null;
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
        TaskCompletionSource taskCompletionSource = this.f46215p0;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public zzj(@Nullable TaskCompletionSource taskCompletionSource) {
        this.f46215p0 = taskCompletionSource;
    }
}
