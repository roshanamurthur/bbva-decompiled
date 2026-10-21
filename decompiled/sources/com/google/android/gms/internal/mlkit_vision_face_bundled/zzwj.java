package com.google.android.gms.internal.mlkit_vision_face_bundled;

import ai.a;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzwj {
    public static final /* synthetic */ int zza = 0;
    private static final zzwv zzb;

    static {
        int i10 = zzwe.zza;
        zzb = new zzwx();
    }

    public static void zzA(int i10, List list, zzxi zzxiVar, zzwh zzwhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzud) zzxiVar).zzv(i10, list.get(i11), zzwhVar);
        }
    }

    public static void zzB(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzy(i10, list, z10);
    }

    public static void zzC(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzA(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzC(i10, list, z10);
    }

    public static void zzE(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzE(i10, list, z10);
    }

    public static void zzF(int i10, List list, zzxi zzxiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzH(i10, list);
    }

    public static void zzG(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzJ(i10, list, z10);
    }

    public static void zzH(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzL(i10, list, z10);
    }

    public static boolean zzI(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzux) {
            zzux zzuxVar = (zzux) list;
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzuc.zzA(zzuxVar.zze(i10));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzuc.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzuc.zzz(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzuc.zzz(i10 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzux) {
            zzux zzuxVar = (zzux) list;
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzuc.zzA(zzuxVar.zze(i10));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzuc.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzg(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvl) {
            zzvl zzvlVar = (zzvl) list;
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzuc.zzA(zzvlVar.zze(i10));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzuc.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzh(int i10, Object obj, zzwh zzwhVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzvh)) {
            return zzuc.zzx((zzvw) obj, zzwhVar) + zzuc.zzz(i11);
        }
        int iZzz = zzuc.zzz(i11);
        int iZza = ((zzvh) obj).zza();
        return a.d(iZza, iZza, iZzz);
    }

    public static int zzi(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzux) {
            zzux zzuxVar = (zzux) list;
            iZzz = 0;
            while (i10 < size) {
                int iZze = zzuxVar.zze(i10);
                iZzz += zzuc.zzz((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzz += zzuc.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzz;
    }

    public static int zzj(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvl) {
            zzvl zzvlVar = (zzvl) list;
            iZzA = 0;
            while (i10 < size) {
                long jZze = zzvlVar.zze(i10);
                iZzA += zzuc.zzA((jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzA += zzuc.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzk(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzux) {
            zzux zzuxVar = (zzux) list;
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzuc.zzz(zzuxVar.zze(i10));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzuc.zzz(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzz;
    }

    public static int zzl(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvl) {
            zzvl zzvlVar = (zzvl) list;
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzuc.zzA(zzvlVar.zze(i10));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzuc.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzA;
    }

    public static zzwv zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i10, int i11, Object obj2, zzwv zzwvVar) {
        zzuw zzuwVar;
        zzww zzwwVar;
        Object obj3 = obj2;
        if (obj2 == null && (zzwwVar = (zzuwVar = (zzuw) obj).zzc) == zzww.zzc()) {
            obj3 = zzwwVar;
            zzww zzwwVarZzf = zzww.zzf();
            zzuwVar.zzc = zzwwVarZzf;
            obj3 = zzwwVarZzf;
        }
        obj3 = zzwwVar;
        ((zzww) obj3).zzj(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

    public static void zzo(zzui zzuiVar, Object obj, Object obj2) {
        zzum zzumVar = ((zzus) obj2).zzb;
        if (zzumVar.zza.isEmpty()) {
            return;
        }
        ((zzus) obj).zzb().zzi(zzumVar);
    }

    public static void zzp(zzwv zzwvVar, Object obj, Object obj2) {
        zzuw zzuwVar = (zzuw) obj;
        zzww zzwwVarZze = zzuwVar.zzc;
        zzww zzwwVar = ((zzuw) obj2).zzc;
        if (!zzww.zzc().equals(zzwwVar)) {
            if (zzww.zzc().equals(zzwwVarZze)) {
                zzwwVarZze = zzww.zze(zzwwVarZze, zzwwVar);
            } else {
                zzwwVarZze.zzd(zzwwVar);
            }
        }
        zzuwVar.zzc = zzwwVarZze;
    }

    public static void zzq(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzc(i10, list, z10);
    }

    public static void zzr(int i10, List list, zzxi zzxiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zze(i10, list);
    }

    public static void zzs(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzg(i10, list, z10);
    }

    public static void zzt(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzj(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzl(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzn(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzp(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzxi zzxiVar, zzwh zzwhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzud) zzxiVar).zzq(i10, list.get(i11), zzwhVar);
        }
    }

    public static void zzy(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzs(i10, list, z10);
    }

    public static void zzz(int i10, List list, zzxi zzxiVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzu(i10, list, z10);
    }
}
