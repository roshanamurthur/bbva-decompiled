package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdv extends zzch {
    private final com.google.android.gms.measurement.internal.zzgs zza;

    public zzdv(com.google.android.gms.measurement.internal.zzgs zzgsVar) {
        this.zza = zzgsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.onEvent(str, str2, bundle, j10);
    }
}
