package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
class zzgk implements zzgm {
    protected final zzfr zzs;

    public zzgk(zzfr zzfrVar) {
        Preconditions.checkNotNull(zzfrVar);
        this.zzs = zzfrVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final Context zzau() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final Clock zzav() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzaa zzaw() {
        throw null;
    }

    public void zzax() {
        this.zzs.zzaz().zzax();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzeh zzay() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzfo zzaz() {
        throw null;
    }

    public void zzg() {
        this.zzs.zzaz().zzg();
    }
}
