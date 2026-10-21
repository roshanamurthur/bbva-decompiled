package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgt implements zzeb {
    final /* synthetic */ zzfr zza;

    public zzgt(zzgu zzguVar, zzfr zzfrVar) {
        this.zza = zzfrVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    public final boolean zza() {
        return this.zza.zzL() && Log.isLoggable(this.zza.zzay().zzq(), 3);
    }
}
