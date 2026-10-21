package com.bbva.biometrics.authenticator;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HandlerThreadExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/biometrics/authenticator/HandlerThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "execute", "", "runnable", "Ljava/lang/Runnable;", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HandlerThreadExecutor implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
