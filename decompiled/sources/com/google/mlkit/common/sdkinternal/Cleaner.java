package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public class Cleaner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f49402a = new ReferenceQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f49403b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    public interface Cleanable {
        @KeepForSdk
        void clean();
    }

    @NonNull
    @KeepForSdk
    public static Cleaner create() {
        Cleaner cleaner = new Cleaner();
        cleaner.register(cleaner, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zza
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = cleaner.f49402a;
        final Set set = cleaner.f49403b;
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzb
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((a) referenceQueue2.remove()).clean();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return cleaner;
    }

    @NonNull
    @KeepForSdk
    public Cleanable register(@NonNull Object obj, @NonNull Runnable runnable) {
        ReferenceQueue referenceQueue = this.f49402a;
        Set set = this.f49403b;
        a aVar = new a(obj, referenceQueue, set, runnable);
        set.add(aVar);
        return aVar;
    }
}
