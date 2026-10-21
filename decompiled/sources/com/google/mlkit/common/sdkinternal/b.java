package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements Executor {
    public static final b zza;
    private static final /* synthetic */ b[] zzb;

    static {
        b bVar = new b("INSTANCE", 0);
        zza = bVar;
        zzb = new b[]{bVar};
    }

    public static b[] values() {
        return (b[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        MLTaskExecutor.getInstance().f49412a.post(runnable);
    }
}
