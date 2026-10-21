package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzoa;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzt {
    final /* synthetic */ zzz zza;
    private String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzgd zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map zzg;
    private Map zzh;

    public /* synthetic */ zzt(zzz zzzVar, String str, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new ArrayMap();
        this.zzh = new ArrayMap();
    }

    @NonNull
    public final com.google.android.gms.internal.measurement.zzfk zza(int i10) {
        ArrayList arrayList;
        List listEmptyList;
        com.google.android.gms.internal.measurement.zzfj zzfjVarZzb = com.google.android.gms.internal.measurement.zzfk.zzb();
        zzfjVarZzb.zza(i10);
        zzfjVarZzb.zzc(this.zzc);
        com.google.android.gms.internal.measurement.zzgd zzgdVar = this.zzd;
        if (zzgdVar != null) {
            zzfjVarZzb.zzd(zzgdVar);
        }
        com.google.android.gms.internal.measurement.zzgc zzgcVarZzf = com.google.android.gms.internal.measurement.zzgd.zzf();
        zzgcVarZzf.zzb(zzkr.zzr(this.zze));
        zzgcVarZzf.zzd(zzkr.zzr(this.zzf));
        Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator it = this.zzg.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                Long l6 = (Long) this.zzg.get(Integer.valueOf(iIntValue));
                if (l6 != null) {
                    com.google.android.gms.internal.measurement.zzfl zzflVarZzc = com.google.android.gms.internal.measurement.zzfm.zzc();
                    zzflVarZzc.zzb(iIntValue);
                    zzflVarZzc.zza(l6.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.zzfm) zzflVarZzc.zzay());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzgcVarZzf.zza(arrayList);
        }
        Map map2 = this.zzh;
        if (map2 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzge zzgeVarZzd = com.google.android.gms.internal.measurement.zzgf.zzd();
                zzgeVarZzd.zzb(num.intValue());
                List list = (List) this.zzh.get(num);
                if (list != null) {
                    Collections.sort(list);
                    zzgeVarZzd.zza(list);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzgf) zzgeVarZzd.zzay());
            }
            listEmptyList = arrayList3;
        }
        zzgcVarZzf.zzc(listEmptyList);
        zzfjVarZzb.zzb(zzgcVarZzf);
        return (com.google.android.gms.internal.measurement.zzfk) zzfjVarZzb.zzay();
    }

    public final void zzc(@NonNull zzx zzxVar) {
        int iZza = zzxVar.zza();
        Boolean bool = zzxVar.zzd;
        if (bool != null) {
            this.zzf.set(iZza, bool.booleanValue());
        }
        Boolean bool2 = zzxVar.zze;
        if (bool2 != null) {
            this.zze.set(iZza, bool2.booleanValue());
        }
        if (zzxVar.zzf != null) {
            Map map = this.zzg;
            Integer numValueOf = Integer.valueOf(iZza);
            Long l6 = (Long) map.get(numValueOf);
            long jLongValue = zzxVar.zzf.longValue() / 1000;
            if (l6 == null || jLongValue > l6.longValue()) {
                this.zzg.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (zzxVar.zzg != null) {
            Map map2 = this.zzh;
            Integer numValueOf2 = Integer.valueOf(iZza);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.zzh.put(numValueOf2, arrayList);
            }
            if (zzxVar.zzc()) {
                arrayList.clear();
            }
            zzoa.zzc();
            zzaf zzafVarZzf = this.zza.zzs.zzf();
            String str = this.zzb;
            zzdt zzdtVar = zzdu.zzW;
            if (zzafVarZzf.zzs(str, zzdtVar) && zzxVar.zzb()) {
                arrayList.clear();
            }
            zzoa.zzc();
            if (!this.zza.zzs.zzf().zzs(this.zzb, zzdtVar)) {
                arrayList.add(Long.valueOf(zzxVar.zzg.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(zzxVar.zzg.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public /* synthetic */ zzt(zzz zzzVar, String str, com.google.android.gms.internal.measurement.zzgd zzgdVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzgdVar;
    }
}
