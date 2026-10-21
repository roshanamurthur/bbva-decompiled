package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfh implements com.google.android.gms.internal.measurement.zzo {
    final /* synthetic */ String zza;
    final /* synthetic */ zzfi zzb;

    public zzfh(zzfi zzfiVar, String str) {
        this.zzb = zzfiVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.zzb.zze.get(this.zza);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
