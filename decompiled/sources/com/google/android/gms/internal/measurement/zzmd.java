package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzmd extends zzmb {
    @Override // com.google.android.gms.internal.measurement.zzmb
    public final /* synthetic */ int zza(Object obj) {
        return ((zzmc) obj).zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzmc) obj).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final /* synthetic */ Object zzc(Object obj) {
        return ((zzjx) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final /* bridge */ /* synthetic */ Object zzd(Object obj, Object obj2) {
        zzmc zzmcVar = (zzmc) obj2;
        return zzmcVar.equals(zzmc.zzc()) ? obj : zzmc.zzd((zzmc) obj, zzmcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final /* synthetic */ Object zze() {
        return zzmc.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, long j10) {
        ((zzmc) obj).zzh(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final void zzg(Object obj) {
        ((zzjx) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzjx) obj).zzc = (zzmc) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final /* synthetic */ void zzi(Object obj, zzjf zzjfVar) throws IOException {
        ((zzmc) obj).zzi(zzjfVar);
    }
}
