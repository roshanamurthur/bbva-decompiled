package com.google.android.play.core.splitcompat;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import we.b;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ThreadPoolExecutor f46249a;

    public static Executor zza() {
        if (f46249a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
            f46249a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f46249a;
    }
}
