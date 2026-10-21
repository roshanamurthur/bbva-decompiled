package com.google.android.gms.internal.measurement;

import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z10, boolean z11) {
        super(LogKeysKt.LOG);
        this.zzc = zztVar;
        this.zza = z10;
        this.zzb = z11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093 A[LOOP:0: B:23:0x0089->B:25:0x0093, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        int i10;
        int i11;
        String strZzi;
        ArrayList arrayList;
        zzh.zzi(LogKeysKt.LOG, 1, list);
        if (list.size() == 1) {
            this.zzc.zza.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.zza, this.zzb);
            return zzap.zzf;
        }
        int iZzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
        if (iZzb != 2) {
            i10 = 3;
            if (iZzb == 3) {
                i11 = 1;
            } else if (iZzb == 5) {
                i11 = 5;
            } else if (iZzb == 6) {
                i11 = 2;
            }
            strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() == 2) {
                this.zzc.zza.zza(i11, strZzi, Collections.emptyList(), this.zza, this.zzb);
                return zzap.zzf;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(zzgVar.zzb((zzap) list.get(i12)).zzi());
            }
            this.zzc.zza.zza(i11, strZzi, arrayList, this.zza, this.zzb);
            return zzap.zzf;
        }
        i10 = 4;
        i11 = i10;
        strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
        if (list.size() == 2) {
            this.zzc.zza.zza(i11, strZzi, Collections.emptyList(), this.zza, this.zzb);
            return zzap.zzf;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(zzgVar.zzb((zzap) list.get(i12)).zzi());
        }
        this.zzc.zza.zza(i11, strZzi, arrayList, this.zza, this.zzb);
        return zzap.zzf;
    }
}
