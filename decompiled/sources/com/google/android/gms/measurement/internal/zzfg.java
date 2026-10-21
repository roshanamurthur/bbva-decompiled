package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfg implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfi zza;

    public zzfg(zzfi zzfiVar) {
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        zzef zzefVarZzc;
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzefVarZzc = this.zza.zzs.zzay().zzc();
        } else if (i11 != 1) {
            if (i11 == 3) {
                zzefVarZzc = this.zza.zzs.zzay().zzj();
            } else if (i11 != 4) {
                zzefVarZzc = this.zza.zzs.zzay().zzi();
            } else if (z10) {
                zzefVarZzc = this.zza.zzs.zzay().zzm();
            } else {
                zzefVarZzc = !z11 ? this.zza.zzs.zzay().zzl() : this.zza.zzs.zzay().zzk();
            }
        } else if (z10) {
            zzefVarZzc = this.zza.zzs.zzay().zzh();
        } else {
            zzefVarZzc = !z11 ? this.zza.zzs.zzay().zze() : this.zza.zzs.zzay().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzefVarZzc.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzefVarZzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzefVarZzc.zza(str);
        } else {
            zzefVarZzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
