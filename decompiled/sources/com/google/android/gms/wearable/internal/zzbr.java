package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbr extends zzej {
    private final Object lock = new Object();

    @GuardedBy("lock")
    @Nullable
    private zzav zzcw;

    @GuardedBy("lock")
    @Nullable
    private zzbs zzda;

    public final void zza(zzbs zzbsVar) {
        zzav zzavVar;
        synchronized (this.lock) {
            this.zzda = (zzbs) Preconditions.checkNotNull(zzbsVar);
            zzavVar = this.zzcw;
        }
        if (zzavVar != null) {
            zzbsVar.zzb(zzavVar);
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzei
    public final void zza(int i10, int i11) {
        zzbs zzbsVar;
        zzav zzavVar;
        synchronized (this.lock) {
            zzbsVar = this.zzda;
            zzavVar = new zzav(i10, i11);
            this.zzcw = zzavVar;
        }
        if (zzbsVar != null) {
            zzbsVar.zzb(zzavVar);
        }
    }
}
