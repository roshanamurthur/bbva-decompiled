package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzav;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class MlKitThreadPool extends zzav {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final ThreadLocal f49416q0 = new ThreadLocal();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ThreadPoolExecutor f49417p0;

    public MlKitThreadPool() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.zzj
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable2 = runnable;
                        MlKitThreadPool.f49416q0.set(new ArrayDeque());
                        runnable2.run();
                    }
                });
            }
        });
        this.f49417p0 = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, java.util.concurrent.Executor
    public final void execute(@NonNull final Runnable runnable) {
        Deque deque = (Deque) f49416q0.get();
        if (deque == null || deque.size() > 1) {
            this.f49417p0.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    Deque deque2 = (Deque) MlKitThreadPool.f49416q0.get();
                    Preconditions.checkNotNull(deque2);
                    deque2.add(runnable2);
                    if (deque2.size() <= 1) {
                        do {
                            runnable2.run();
                            deque2.removeFirst();
                            runnable2 = (Runnable) deque2.peekFirst();
                        } while (runnable2 != null);
                    }
                }
            });
            return;
        }
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzx
    @NonNull
    public final /* synthetic */ Object zza() {
        return this.f49417p0;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav
    @NonNull
    public final ExecutorService zzb() {
        return this.f49417p0;
    }
}
