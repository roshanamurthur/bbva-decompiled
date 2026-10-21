package com.google.android.play.core.splitinstall;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzo implements zzg {
    public static final zzo zza;
    private static final AtomicReference zzb;
    private static final /* synthetic */ zzo[] zzc;

    static {
        zzo zzoVar = new zzo("INSTANCE", 0);
        zza = zzoVar;
        zzc = new zzo[]{zzoVar};
        zzb = new AtomicReference(null);
    }

    public static zzo[] values() {
        return (zzo[]) zzc.clone();
    }

    @Override // com.google.android.play.core.splitinstall.zzg
    @Nullable
    public final zzh zza() {
        return (zzh) zzb.get();
    }

    public final void zzb(zzh zzhVar) {
        zzb.set(zzhVar);
    }
}
