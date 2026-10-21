package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzki implements zzej {
    final /* synthetic */ String zza;
    final /* synthetic */ zzkp zzb;

    public zzki(zzkp zzkpVar, String str) {
        this.zzb = zzkpVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zza(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.zzb.zzJ(i10, th2, bArr, this.zza);
    }
}
