package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzw extends zzai {
    final Map zza;
    private final zzj zzb;

    public zzw(zzj zzjVar) {
        super("require");
        this.zza = new HashMap();
        this.zzb = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzap zzapVar;
        zzh.zzh("require", 1, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        if (this.zza.containsKey(strZzi)) {
            return (zzap) this.zza.get(strZzi);
        }
        zzj zzjVar = this.zzb;
        if (zzjVar.zza.containsKey(strZzi)) {
            try {
                zzapVar = (zzap) ((Callable) zzjVar.zza.get(strZzi)).call();
            } catch (Exception unused) {
                String strValueOf = String.valueOf(strZzi);
                throw new IllegalStateException(strValueOf.length() != 0 ? "Failed to create API implementation: ".concat(strValueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            zzapVar = zzap.zzf;
        }
        if (zzapVar instanceof zzai) {
            this.zza.put(strZzi, (zzai) zzapVar);
        }
        return zzapVar;
    }
}
