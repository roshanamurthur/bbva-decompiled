package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DefaultRunnableScheduler implements RunnableScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f24350a;

    public DefaultRunnableScheduler() {
        this.f24350a = HandlerCompat.createAsync(Looper.getMainLooper());
    }

    @Override // androidx.work.RunnableScheduler
    public void cancel(@NonNull Runnable runnable) {
        this.f24350a.removeCallbacks(runnable);
    }

    @NonNull
    public Handler getHandler() {
        return this.f24350a;
    }

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long j10, @NonNull Runnable runnable) {
        this.f24350a.postDelayed(runnable, j10);
    }

    @VisibleForTesting
    public DefaultRunnableScheduler(@NonNull Handler handler) {
        this.f24350a = handler;
    }
}
