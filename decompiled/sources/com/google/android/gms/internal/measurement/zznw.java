package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznw implements zznv {
    public static final zzhu zza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zze("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }
}
