package com.google.android.gms.internal.measurement;

import ad.e;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlp {
    private static final Class zza;
    private static final zzmb zzb;
    private static final zzmb zzc;
    private static final zzmb zzd;

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
        zzd = new zzmd();
    }

    public static zzmb zzA() {
        return zzc;
    }

    public static zzmb zzB() {
        return zzd;
    }

    public static Object zzC(int i10, List list, zzkb zzkbVar, Object obj, zzmb zzmbVar) {
        if (zzkbVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (zzkbVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj = zzD(i10, iIntValue, obj, zzmbVar);
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
                if (!zzkbVar.zza(iIntValue2)) {
                    obj = zzD(i10, iIntValue2, obj, zzmbVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i10, int i11, Object obj, zzmb zzmbVar) {
        if (obj == null) {
            obj = zzmbVar.zze();
        }
        zzmbVar.zzf(obj, i10, i11);
        return obj;
    }

    public static void zzE(zzjk zzjkVar, Object obj, Object obj2) {
        zzjkVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzmb zzmbVar, Object obj, Object obj2) {
        zzmbVar.zzh(obj, zzmbVar.zzd(zzmbVar.zzc(obj), zzmbVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzjx.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzI(zzkx zzkxVar, Object obj, Object obj2, long j10) {
        zzml.zzs(obj, j10, zzkx.zzb(zzml.zzf(obj, j10), zzml.zzf(obj2, j10)));
    }

    public static void zzJ(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzc(i10, list, z10);
    }

    public static void zzK(int i10, List list, zzjf zzjfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zze(i10, list);
    }

    public static void zzL(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzg(i10, list, z10);
    }

    public static void zzM(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzj(i10, list, z10);
    }

    public static void zzN(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzl(i10, list, z10);
    }

    public static void zzO(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzn(i10, list, z10);
    }

    public static void zzP(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzp(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zzjf zzjfVar, zzln zzlnVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzjfVar.zzq(i10, list.get(i11), zzlnVar);
        }
    }

    public static void zzR(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzs(i10, list, z10);
    }

    public static void zzS(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzu(i10, list, z10);
    }

    public static void zzT(int i10, List list, zzjf zzjfVar, zzln zzlnVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzjfVar.zzv(i10, list.get(i11), zzlnVar);
        }
    }

    public static void zzU(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzx(i10, list, z10);
    }

    public static void zzV(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzz(i10, list, z10);
    }

    public static void zzW(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzB(i10, list, z10);
    }

    public static void zzX(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzD(i10, list, z10);
    }

    public static void zzY(int i10, List list, zzjf zzjfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzG(i10, list);
    }

    public static void zzZ(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzI(i10, list, z10);
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzA(i10 << 3) + 1) * size;
    }

    public static void zzaa(int i10, List list, zzjf zzjfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjfVar.zzK(i10, list, z10);
    }

    private static zzmb zzab(boolean z10) {
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
            return (zzmb) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
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
        int iZzz = zzje.zzz(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzz += zzje.zzt((zzix) list.get(i11));
        }
        return iZzz;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i10) * size) + zze(list);
    }

    public static int zze(List list) {
        int iZzv;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzje.zzv(zzjyVar.zze(i10));
                i10++;
            }
        } else {
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzje.zzv(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzv;
    }

    public static int zzf(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzA(i10 << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzA(i10 << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i10, List list, zzln zzlnVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzu = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZzu += zzje.zzu(i10, (zzlc) list.get(i11), zzlnVar);
        }
        return iZzu;
    }

    public static int zzk(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i10) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int iZzv;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzje.zzv(zzjyVar.zze(i10));
                i10++;
            }
        } else {
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzje.zzv(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzv;
    }

    public static int zzm(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzje.zzz(i10) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzje.zzB(zzkrVar.zza(i10));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzje.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzB;
    }

    public static int zzo(int i10, Object obj, zzln zzlnVar) {
        if (!(obj instanceof zzkk)) {
            return zzje.zzx((zzlc) obj, zzlnVar) + zzje.zzA(i10 << 3);
        }
        int iZzA = zzje.zzA(i10 << 3);
        int iZza = ((zzkk) obj).zza();
        return e.a(iZza, iZza, iZzA);
    }

    public static int zzp(int i10, List list, zzln zzlnVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzje.zzz(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iZzz = (obj instanceof zzkk ? zzje.zzw((zzkk) obj) : zzje.zzx((zzlc) obj, zzlnVar)) + iZzz;
        }
        return iZzz;
    }

    public static int zzq(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i10) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            iZzA = 0;
            while (i10 < size) {
                int iZze = zzjyVar.zze(i10);
                iZzA += zzje.zzA((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzA += zzje.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzs(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i10) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            iZzB = 0;
            while (i10 < size) {
                long jZza = zzkrVar.zza(i10);
                iZzB += zzje.zzB((jZza >> 63) ^ (jZza + jZza));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzB += zzje.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzB;
    }

    public static int zzu(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzz = zzje.zzz(i10) * size;
        if (list instanceof zzkm) {
            zzkm zzkmVar = (zzkm) list;
            while (i11 < size) {
                Object objZzf = zzkmVar.zzf(i11);
                iZzz = (objZzf instanceof zzix ? zzje.zzt((zzix) objZzf) : zzje.zzy((String) objZzf)) + iZzz;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iZzz = (obj instanceof zzix ? zzje.zzt((zzix) obj) : zzje.zzy((String) obj)) + iZzz;
                i11++;
            }
        }
        return iZzz;
    }

    public static int zzv(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i10) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzje.zzA(zzjyVar.zze(i10));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzje.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzx(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzje.zzz(i10) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzje.zzB(zzkrVar.zza(i10));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzje.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzB;
    }

    public static zzmb zzz() {
        return zzb;
    }
}
