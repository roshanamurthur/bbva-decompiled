package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzh {
    public static double zza(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == 0.0d) {
            return d2;
        }
        return Math.floor(Math.abs(d2)) * ((double) (d2 > 0.0d ? 1 : -1));
    }

    public static int zzb(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d2)) * ((double) (d2 > 0.0d ? 1 : -1))) % 4.294967296E9d);
    }

    public static int zzc(zzg zzgVar) {
        int iZzb = zzb(zzgVar.zzd("runtime.counter").zzh().doubleValue() + 1.0d);
        if (iZzb > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        zzgVar.zzg("runtime.counter", new zzah(Double.valueOf(iZzb)));
        return iZzb;
    }

    public static long zzd(double d2) {
        return ((long) zzb(d2)) & 4294967295L;
    }

    public static zzbl zze(String str) {
        zzbl zzblVarZza = null;
        if (str != null && !str.isEmpty()) {
            zzblVarZza = zzbl.zza(Integer.parseInt(str));
        }
        if (zzblVarZza != null) {
            return zzblVarZza;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object zzf(zzap zzapVar) {
        if (zzap.zzg.equals(zzapVar)) {
            return null;
        }
        if (zzap.zzf.equals(zzapVar)) {
            return "";
        }
        if (zzapVar instanceof zzam) {
            return zzg((zzam) zzapVar);
        }
        if (!(zzapVar instanceof zzae)) {
            return !zzapVar.zzh().isNaN() ? zzapVar.zzh() : zzapVar.zzi();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzae) zzapVar).iterator();
        while (it.hasNext()) {
            Object objZzf = zzf((zzap) it.next());
            if (objZzf != null) {
                arrayList.add(objZzf);
            }
        }
        return arrayList;
    }

    public static Map zzg(zzam zzamVar) {
        HashMap map = new HashMap();
        for (String str : zzamVar.zzb()) {
            Object objZzf = zzf(zzamVar.zzf(str));
            if (objZzf != null) {
                map.put(str, objZzf);
            }
        }
        return map;
    }

    public static void zzh(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void zzi(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void zzj(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean zzk(zzap zzapVar) {
        if (zzapVar == null) {
            return false;
        }
        Double dZzh = zzapVar.zzh();
        return !dZzh.isNaN() && dZzh.doubleValue() >= 0.0d && dZzh.equals(Double.valueOf(Math.floor(dZzh.doubleValue())));
    }

    public static boolean zzl(zzap zzapVar, zzap zzapVar2) {
        if (!zzapVar.getClass().equals(zzapVar2.getClass())) {
            return false;
        }
        if ((zzapVar instanceof zzau) || (zzapVar instanceof zzan)) {
            return true;
        }
        if (zzapVar instanceof zzah) {
            if (Double.isNaN(zzapVar.zzh().doubleValue()) || Double.isNaN(zzapVar2.zzh().doubleValue())) {
                return false;
            }
            return zzapVar.zzh().equals(zzapVar2.zzh());
        }
        if (zzapVar instanceof zzat) {
            return zzapVar.zzi().equals(zzapVar2.zzi());
        }
        if (zzapVar instanceof zzaf) {
            return zzapVar.zzg().equals(zzapVar2.zzg());
        }
        return zzapVar == zzapVar2;
    }
}
