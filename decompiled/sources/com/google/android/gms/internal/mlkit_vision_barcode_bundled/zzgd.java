package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.appcompat.widget.o1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgd {
    private static final Class zza;
    private static final zzgp zzb;
    private static final zzgp zzc;
    private static final zzgp zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzgr();
    }

    public static zzgp zzA() {
        return zzc;
    }

    public static zzgp zzB() {
        return zzd;
    }

    public static Object zzC(int i10, List list, zzeg zzegVar, Object obj, zzgp zzgpVar) {
        if (zzegVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (zzegVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj = zzD(i10, iIntValue, obj, zzgpVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzegVar.zza(iIntValue2)) {
                    obj = zzD(i10, iIntValue2, obj, zzgpVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i10, int i11, Object obj, zzgp zzgpVar) {
        if (obj == null) {
            obj = zzgpVar.zze();
        }
        zzgpVar.zzf(obj, i10, i11);
        return obj;
    }

    public static void zzE(zzdo zzdoVar, Object obj, Object obj2) {
        zzds zzdsVarZzb = zzdoVar.zzb(obj2);
        if (zzdsVarZzb.zza.isEmpty()) {
            return;
        }
        zzdoVar.zzc(obj).zzh(zzdsVarZzb);
    }

    public static void zzF(zzgp zzgpVar, Object obj, Object obj2) {
        zzgpVar.zzh(obj, zzgpVar.zzd(zzgpVar.zzc(obj), zzgpVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzec.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzI(zzfg zzfgVar, Object obj, Object obj2, long j10) {
        zzgz.zzs(obj, j10, zzfg.zzb(zzgz.zzf(obj, j10), zzgz.zzf(obj2, j10)));
    }

    public static void zzJ(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzc(i10, list, z10);
    }

    public static void zzK(int i10, List list, zzdj zzdjVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zze(i10, list);
    }

    public static void zzL(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzg(i10, list, z10);
    }

    public static void zzM(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzj(i10, list, z10);
    }

    public static void zzN(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzl(i10, list, z10);
    }

    public static void zzO(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzn(i10, list, z10);
    }

    public static void zzP(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzp(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zzdj zzdjVar, zzgb zzgbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzdjVar.zzq(i10, list.get(i11), zzgbVar);
        }
    }

    public static void zzR(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzs(i10, list, z10);
    }

    public static void zzS(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzu(i10, list, z10);
    }

    public static void zzT(int i10, List list, zzdj zzdjVar, zzgb zzgbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzdjVar.zzv(i10, list.get(i11), zzgbVar);
        }
    }

    public static void zzU(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzy(i10, list, z10);
    }

    public static void zzV(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzA(i10, list, z10);
    }

    public static void zzW(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzC(i10, list, z10);
    }

    public static void zzX(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzE(i10, list, z10);
    }

    public static void zzY(int i10, List list, zzdj zzdjVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzH(i10, list);
    }

    public static void zzZ(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzJ(i10, list, z10);
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzD(i10 << 3) + 1) * size;
    }

    public static void zzaa(int i10, List list, zzdj zzdjVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzL(i10, list, z10);
    }

    private static zzgp zzab(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgp) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzC = zzdi.zzC(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzC += zzdi.zzu((zzdb) list.get(i11));
        }
        return iZzC;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i10) * size) + zze(list);
    }

    public static int zze(List list) {
        int iZzx;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzedVar = (zzed) list;
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzdi.zzx(zzedVar.zze(i10));
                i10++;
            }
        } else {
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzdi.zzx(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzx;
    }

    public static int zzf(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzD(i10 << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzD(i10 << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i10, List list, zzgb zzgbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzv = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZzv += zzdi.zzv(i10, (zzfl) list.get(i11), zzgbVar);
        }
        return iZzv;
    }

    public static int zzk(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i10) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int iZzx;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzedVar = (zzed) list;
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzdi.zzx(zzedVar.zze(i10));
                i10++;
            }
        } else {
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzdi.zzx(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzx;
    }

    public static int zzm(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzdi.zzC(i10) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int iZzE;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            iZzE = 0;
            while (i10 < size) {
                iZzE += zzdi.zzE(zzfaVar.zze(i10));
                i10++;
            }
        } else {
            iZzE = 0;
            while (i10 < size) {
                iZzE += zzdi.zzE(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzE;
    }

    public static int zzo(int i10, Object obj, zzgb zzgbVar) {
        if (!(obj instanceof zzet)) {
            return zzdi.zzA((zzfl) obj, zzgbVar) + zzdi.zzD(i10 << 3);
        }
        int iZzD = zzdi.zzD(i10 << 3);
        int iZza = ((zzet) obj).zza();
        return o1.a(iZza, iZza, iZzD);
    }

    public static int zzp(int i10, List list, zzgb zzgbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzC = zzdi.zzC(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iZzC = (obj instanceof zzet ? zzdi.zzy((zzet) obj) : zzdi.zzA((zzfl) obj, zzgbVar)) + iZzC;
        }
        return iZzC;
    }

    public static int zzq(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i10) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int iZzD;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzedVar = (zzed) list;
            iZzD = 0;
            while (i10 < size) {
                int iZze = zzedVar.zze(i10);
                iZzD += zzdi.zzD((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzD = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzD += zzdi.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzD;
    }

    public static int zzs(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i10) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int iZzE;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            iZzE = 0;
            while (i10 < size) {
                long jZze = zzfaVar.zze(i10);
                iZzE += zzdi.zzE((jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
        } else {
            iZzE = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzE += zzdi.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzE;
    }

    public static int zzu(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzC = zzdi.zzC(i10) * size;
        if (list instanceof zzev) {
            zzev zzevVar = (zzev) list;
            while (i11 < size) {
                Object objZzf = zzevVar.zzf(i11);
                iZzC = (objZzf instanceof zzdb ? zzdi.zzu((zzdb) objZzf) : zzdi.zzB((String) objZzf)) + iZzC;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iZzC = (obj instanceof zzdb ? zzdi.zzu((zzdb) obj) : zzdi.zzB((String) obj)) + iZzC;
                i11++;
            }
        }
        return iZzC;
    }

    public static int zzv(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i10) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int iZzD;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzedVar = (zzed) list;
            iZzD = 0;
            while (i10 < size) {
                iZzD += zzdi.zzD(zzedVar.zze(i10));
                i10++;
            }
        } else {
            iZzD = 0;
            while (i10 < size) {
                iZzD += zzdi.zzD(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzD;
    }

    public static int zzx(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i10) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int iZzE;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            iZzE = 0;
            while (i10 < size) {
                iZzE += zzdi.zzE(zzfaVar.zze(i10));
                i10++;
            }
        } else {
            iZzE = 0;
            while (i10 < size) {
                iZzE += zzdi.zzE(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzE;
    }

    public static zzgp zzz() {
        return zzb;
    }
}
