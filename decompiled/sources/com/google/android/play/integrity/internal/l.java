package com.google.android.play.integrity.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class l implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final TaskCompletionSource f46382p0;

    public l() {
        this.f46382p0 = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f46382p0;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e5) {
            a(e5);
        }
    }

    public l(@Nullable TaskCompletionSource taskCompletionSource) {
        this.f46382p0 = taskCompletionSource;
    }
}
