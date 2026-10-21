package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import ad.d;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.o1;
import androidx.collection.k;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.CharCompanionObject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfo<T> implements zzgb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfl zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzez zzm;
    private final zzgp zzn;
    private final zzdo zzo;
    private final zzfr zzp;
    private final zzfg zzq;

    private zzfo(int[] iArr, Object[] objArr, int i10, int i11, zzfl zzflVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzfr zzfrVar, zzez zzezVar, zzgp zzgpVar, zzdo zzdoVar, zzfg zzfgVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzdoVar != null && zzdoVar.zzf(zzflVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzfrVar;
        this.zzm = zzezVar;
        this.zzn = zzgpVar;
        this.zzo = zzdoVar;
        this.zzg = zzflVar;
        this.zzq = zzfgVar;
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzC(Object obj, long j10) {
        return ((Long) zzgz.zzf(obj, j10)).longValue();
    }

    private final zzeg zzD(int i10) {
        int i11 = i10 / 3;
        return (zzeg) this.zzd[i11 + i11 + 1];
    }

    private final zzgb zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgb zzgbVar = (zzgb) this.zzd[i12];
        if (zzgbVar != null) {
            return zzgbVar;
        }
        zzgb zzgbVarZzb = zzfu.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzgbVarZzb;
        return zzgbVarZzb;
    }

    private final Object zzF(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(c.a(String.valueOf(str).length(), 40, name.length(), String.valueOf(string).length()));
            k.e(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(d.f(sb2, " not found. Known fields are ", string));
        }
    }

    private final void zzH(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        if (zzM(obj2, i10)) {
            Object objZzf = zzgz.zzf(obj, jZzB);
            Object objZzf2 = zzgz.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzgz.zzs(obj, jZzB, zzel.zzg(objZzf, objZzf2));
                zzJ(obj, i10);
            } else if (objZzf2 != null) {
                zzgz.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i10);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int iZzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j10 = iZzB & 1048575;
        if (zzP(obj2, i11, i10)) {
            Object objZzf = zzP(obj, i11, i10) ? zzgz.zzf(obj, j10) : null;
            Object objZzf2 = zzgz.zzf(obj2, j10);
            if (objZzf != null && objZzf2 != null) {
                zzgz.zzs(obj, j10, zzel.zzg(objZzf, objZzf2));
                zzK(obj, i11, i10);
            } else if (objZzf2 != null) {
                zzgz.zzs(obj, j10, objZzf2);
                zzK(obj, i11, i10);
            }
        }
    }

    private final void zzJ(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = 1048575 & iZzy;
        if (j10 == 1048575) {
            return;
        }
        zzgz.zzq(obj, j10, (1 << (iZzy >>> 20)) | zzgz.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzgz.zzq(obj, zzy(i11) & 1048575, i10);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzM(obj, i10) == zzM(obj2, i10);
    }

    private final boolean zzM(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = iZzy & 1048575;
        if (j10 != 1048575) {
            return (zzgz.zzc(obj, j10) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i10);
        long j11 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzgz.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgz.zzb(obj, j11)) != 0;
            case 2:
                return zzgz.zzd(obj, j11) != 0;
            case 3:
                return zzgz.zzd(obj, j11) != 0;
            case 4:
                return zzgz.zzc(obj, j11) != 0;
            case 5:
                return zzgz.zzd(obj, j11) != 0;
            case 6:
                return zzgz.zzc(obj, j11) != 0;
            case 7:
                return zzgz.zzw(obj, j11);
            case 8:
                Object objZzf = zzgz.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzdb) {
                    return !zzdb.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.zzf(obj, j11) != null;
            case 10:
                return !zzdb.zzb.equals(zzgz.zzf(obj, j11));
            case 11:
                return zzgz.zzc(obj, j11) != 0;
            case 12:
                return zzgz.zzc(obj, j11) != 0;
            case 13:
                return zzgz.zzc(obj, j11) != 0;
            case 14:
                return zzgz.zzd(obj, j11) != 0;
            case 15:
                return zzgz.zzc(obj, j11) != 0;
            case 16:
                return zzgz.zzd(obj, j11) != 0;
            case 17:
                return zzgz.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzN(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzM(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzO(Object obj, int i10, zzgb zzgbVar) {
        return zzgbVar.zzj(zzgz.zzf(obj, i10 & 1048575));
    }

    private final boolean zzP(Object obj, int i10, int i11) {
        return zzgz.zzc(obj, (long) (zzy(i11) & 1048575)) == i10;
    }

    private static boolean zzQ(Object obj, long j10) {
        return ((Boolean) zzgz.zzf(obj, j10)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private final void zzR(Object obj, zzdj zzdjVar) throws IOException {
        Iterator itZzf;
        Map.Entry entry;
        int i10;
        boolean z10;
        if (this.zzh) {
            zzds zzdsVarZzb = this.zzo.zzb(obj);
            if (zzdsVarZzb.zza.isEmpty()) {
                itZzf = null;
                entry = null;
            } else {
                itZzf = zzdsVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
            }
        } else {
            itZzf = null;
            entry = null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzB = zzB(i13);
            int[] iArr = this.zzc;
            int i14 = iArr[i13];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                if (i16 != i11) {
                    i12 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            } else {
                i10 = 0;
            }
            while (entry != null && this.zzo.zza(entry) <= i14) {
                this.zzo.zzg(zzdjVar, entry);
                entry = itZzf.hasNext() ? (Map.Entry) itZzf.next() : null;
            }
            long j10 = iZzB & 1048575;
            switch (iZzA) {
                case 0:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzf(i14, zzgz.zza(obj, j10));
                    }
                    break;
                case 1:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzo(i14, zzgz.zzb(obj, j10));
                    }
                    break;
                case 2:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzt(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzK(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzr(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzm(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzk(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzb(i14, zzgz.zzw(obj, j10));
                    }
                    break;
                case 8:
                    if ((i10 & i12) != 0) {
                        zzT(i14, unsafe.getObject(obj, j10), zzdjVar);
                    }
                    break;
                case 9:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzv(i14, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 10:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzd(i14, (zzdb) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzI(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzi(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzx(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzz(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzB(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzD(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    if ((i10 & i12) != 0) {
                        zzdjVar.zzq(i14, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 18:
                    z10 = false;
                    zzgd.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 19:
                    z10 = false;
                    zzgd.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 20:
                    z10 = false;
                    zzgd.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 21:
                    z10 = false;
                    zzgd.zzaa(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 22:
                    z10 = false;
                    zzgd.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 23:
                    z10 = false;
                    zzgd.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 24:
                    z10 = false;
                    zzgd.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 25:
                    z10 = false;
                    zzgd.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 26:
                    zzgd.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar);
                    break;
                case 27:
                    zzgd.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, zzE(i13));
                    break;
                case 28:
                    zzgd.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar);
                    break;
                case 29:
                    z10 = false;
                    zzgd.zzZ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 30:
                    z10 = false;
                    zzgd.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 31:
                    z10 = false;
                    zzgd.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 32:
                    z10 = false;
                    zzgd.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 33:
                    z10 = false;
                    zzgd.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 34:
                    z10 = false;
                    zzgd.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, false);
                    break;
                case 35:
                    zzgd.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 36:
                    zzgd.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 37:
                    zzgd.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 38:
                    zzgd.zzaa(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 39:
                    zzgd.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 40:
                    zzgd.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 41:
                    zzgd.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 42:
                    zzgd.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 43:
                    zzgd.zzZ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 44:
                    zzgd.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 45:
                    zzgd.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 46:
                    zzgd.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 47:
                    zzgd.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 48:
                    zzgd.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, true);
                    break;
                case 49:
                    zzgd.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzdjVar, zzE(i13));
                    break;
                case 50:
                    zzS(zzdjVar, i14, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzf(i14, zzn(obj, j10));
                    }
                    break;
                case 52:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzo(i14, zzo(obj, j10));
                    }
                    break;
                case 53:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzt(i14, zzC(obj, j10));
                    }
                    break;
                case 54:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzK(i14, zzC(obj, j10));
                    }
                    break;
                case 55:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzr(i14, zzr(obj, j10));
                    }
                    break;
                case 56:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzm(i14, zzC(obj, j10));
                    }
                    break;
                case 57:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzk(i14, zzr(obj, j10));
                    }
                    break;
                case 58:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzb(i14, zzQ(obj, j10));
                    }
                    break;
                case 59:
                    if (zzP(obj, i14, i13)) {
                        zzT(i14, unsafe.getObject(obj, j10), zzdjVar);
                    }
                    break;
                case 60:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzv(i14, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 61:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzd(i14, (zzdb) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzI(i14, zzr(obj, j10));
                    }
                    break;
                case 63:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzi(i14, zzr(obj, j10));
                    }
                    break;
                case 64:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzx(i14, zzr(obj, j10));
                    }
                    break;
                case 65:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzz(i14, zzC(obj, j10));
                    }
                    break;
                case 66:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzB(i14, zzr(obj, j10));
                    }
                    break;
                case 67:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzD(i14, zzC(obj, j10));
                    }
                    break;
                case 68:
                    if (zzP(obj, i14, i13)) {
                        zzdjVar.zzq(i14, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                default:
                    break;
            }
        }
        while (entry != null) {
            this.zzo.zzg(zzdjVar, entry);
            entry = itZzf.hasNext() ? (Map.Entry) itZzf.next() : null;
        }
        zzgp zzgpVar = this.zzn;
        zzgpVar.zzj(zzgpVar.zzc(obj), zzdjVar);
    }

    private final void zzS(zzdj zzdjVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzT(int i10, Object obj, zzdj zzdjVar) throws IOException {
        if (obj instanceof String) {
            zzdjVar.zzG(i10, (String) obj);
        } else {
            zzdjVar.zzd(i10, (zzdb) obj);
        }
    }

    public static zzgq zzd(Object obj) {
        zzec zzecVar = (zzec) obj;
        zzgq zzgqVar = zzecVar.zzc;
        if (zzgqVar != zzgq.zzc()) {
            return zzgqVar;
        }
        zzgq zzgqVarZze = zzgq.zze();
        zzecVar.zzc = zzgqVarZze;
        return zzgqVarZze;
    }

    public static zzfo zzk(Class cls, zzfi zzfiVar, zzfr zzfrVar, zzez zzezVar, zzgp zzgpVar, zzdo zzdoVar, zzfg zzfgVar) {
        if (zzfiVar instanceof zzfw) {
            return zzl((zzfw) zzfiVar, zzfrVar, zzezVar, zzgpVar, zzdoVar, zzfgVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:130:0x027f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0332  */
    /* JADX WARN: Code duplicated, block: B:180:0x0381  */
    /* JADX WARN: Code duplicated, block: B:183:0x038a  */
    public static zzfo zzl(zzfw zzfwVar, zzfr zzfrVar, zzez zzezVar, zzgp zzgpVar, zzdo zzdoVar, zzfg zzfgVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int[] iArr2;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Object[] objArr;
        int i29;
        int i30;
        Field fieldZzG;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldZzG2;
        int i35;
        Object obj2;
        Field fieldZzG3;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        boolean z10 = zzfwVar.zzc() == 2;
        String strZzd = zzfwVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (strZzd.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt4 = strZzd.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i42 = iCharAt4 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strZzd.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt4 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt4 == 0) {
            iCharAt = 0;
            i14 = 0;
            iCharAt2 = 0;
            i13 = 0;
            iCharAt3 = 0;
            i11 = 0;
            iArr = zza;
            i12 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt5 = strZzd.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    cCharAt8 = strZzd.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                iCharAt5 = i45 | (cCharAt8 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int iCharAt6 = strZzd.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    cCharAt7 = strZzd.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                iCharAt6 = i48 | (cCharAt7 << i49);
                i47 = i21;
            }
            int i50 = i47 + 1;
            iCharAt = strZzd.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    cCharAt6 = strZzd.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                iCharAt = i51 | (cCharAt6 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            int iCharAt7 = strZzd.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    cCharAt5 = strZzd.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                iCharAt7 = i54 | (cCharAt5 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            iCharAt2 = strZzd.charAt(i53);
            if (iCharAt2 >= 55296) {
                int i57 = iCharAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i18 = i56 + 1;
                    cCharAt4 = strZzd.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i18;
                }
                iCharAt2 = i57 | (cCharAt4 << i58);
                i56 = i18;
            }
            int i59 = i56 + 1;
            int iCharAt8 = strZzd.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    cCharAt3 = strZzd.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                iCharAt8 = i60 | (cCharAt3 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            int iCharAt9 = strZzd.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i16 = i62 + 1;
                    cCharAt2 = strZzd.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i16;
                }
                iCharAt9 = i63 | (cCharAt2 << i64);
                i62 = i16;
            }
            int i65 = i62 + 1;
            iCharAt3 = strZzd.charAt(i62);
            if (iCharAt3 >= 55296) {
                int i66 = iCharAt3 & 8191;
                int i67 = 13;
                while (true) {
                    i15 = i65 + 1;
                    cCharAt = strZzd.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i15;
                }
                iCharAt3 = i66 | (cCharAt << i67);
                i65 = i15;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i11 = iCharAt5 + iCharAt5 + iCharAt6;
            i12 = iCharAt5;
            i41 = i65;
            int i68 = iCharAt8;
            i13 = iCharAt7;
            i14 = i68;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzfwVar.zze();
        Class<?> cls = zzfwVar.zza().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 + iCharAt2];
        int i69 = iCharAt3 + i14;
        int i70 = iCharAt3;
        int i71 = i69;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt10 = strZzd.charAt(i41);
            if (iCharAt10 >= c10) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt12 = strZzd.charAt(i76);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i23 = i38;
            } else {
                i23 = i74;
            }
            int i78 = i23 + 1;
            int iCharAt11 = strZzd.charAt(i23);
            if (iCharAt11 >= c10) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = strZzd.charAt(i80);
                    i24 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                    length = i24;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i25 = i37;
            } else {
                i24 = length;
                i25 = i78;
            }
            int i82 = iCharAt11 & 255;
            int i83 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            if (i82 >= 51) {
                int i84 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i36 = i86 + 1;
                        cCharAt10 = strZzd.charAt(i86);
                        i27 = i13;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i86 = i36;
                        i13 = i27;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i87);
                    i32 = i36;
                } else {
                    i27 = i13;
                    i32 = i84;
                }
                int i88 = i82 - 51;
                int i89 = i32;
                if (i88 == 9 || i88 == 17) {
                    int i90 = i72 / 3;
                    i33 = i11 + 1;
                    objArr2[i90 + i90 + 1] = objArrZze[i11];
                } else {
                    if (i88 == 12 && !z10) {
                        int i91 = i72 / 3;
                        i33 = i11 + 1;
                        objArr2[i91 + i91 + 1] = objArrZze[i11];
                    }
                    i34 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i34];
                    if (obj instanceof Field) {
                        fieldZzG2 = (Field) obj;
                    } else {
                        fieldZzG2 = zzG(cls, (String) obj);
                        objArrZze[i34] = fieldZzG2;
                    }
                    iArr2 = iArr3;
                    i26 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzG2);
                    i35 = i34 + 1;
                    obj2 = objArrZze[i35];
                    if (obj2 instanceof Field) {
                        fieldZzG3 = (Field) obj2;
                    } else {
                        fieldZzG3 = zzG(cls, (String) obj2);
                        objArrZze[i35] = fieldZzG3;
                    }
                    objArr = objArr2;
                    i28 = i11;
                    i29 = i89;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i30 = 0;
                }
                i11 = i33;
                i34 = iCharAt12 + iCharAt12;
                obj = objArrZze[i34];
                if (obj instanceof Field) {
                    fieldZzG2 = (Field) obj;
                } else {
                    fieldZzG2 = zzG(cls, (String) obj);
                    objArrZze[i34] = fieldZzG2;
                }
                iArr2 = iArr3;
                i26 = iCharAt;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzG2);
                i35 = i34 + 1;
                obj2 = objArrZze[i35];
                if (obj2 instanceof Field) {
                    fieldZzG3 = (Field) obj2;
                } else {
                    fieldZzG3 = zzG(cls, (String) obj2);
                    objArrZze[i35] = fieldZzG3;
                }
                objArr = objArr2;
                i28 = i11;
                i29 = i89;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i30 = 0;
            } else {
                iArr2 = iArr3;
                i26 = iCharAt;
                i27 = i13;
                int i92 = i11 + 1;
                Field fieldZzG4 = zzG(cls, (String) objArrZze[i11]);
                if (i82 == 9 || i82 == 17) {
                    int i93 = i72 / 3;
                    objArr2[i93 + i93 + 1] = fieldZzG4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        int i94 = i72 / 3;
                        i31 = i11 + 2;
                        objArr2[i94 + i94 + 1] = objArrZze[i92];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        if (!z10) {
                            int i95 = i72 / 3;
                            i31 = i11 + 2;
                            objArr2[i95 + i95 + 1] = objArrZze[i92];
                        }
                    } else if (i82 == 50) {
                        int i96 = i70 + 1;
                        iArr[i70] = i72;
                        int i97 = i72 / 3;
                        int i98 = i97 + i97;
                        int i99 = i11 + 2;
                        objArr2[i98] = objArrZze[i92];
                        if ((iCharAt11 & 2048) != 0) {
                            i92 = i11 + 3;
                            objArr2[i98 + 1] = objArrZze[i99];
                            i70 = i96;
                        } else {
                            i70 = i96;
                            i28 = i99;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                        iObjectFieldOffset2 = 1048575;
                        objArr = objArr2;
                        if ((iCharAt11 & 4096) == 4096 || i82 > 17) {
                            i29 = i25;
                            i30 = 0;
                        } else {
                            int i100 = i25 + 1;
                            int iCharAt13 = strZzd.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i101 = iCharAt13 & 8191;
                                int i102 = 13;
                                while (true) {
                                    i29 = i100 + 1;
                                    cCharAt9 = strZzd.charAt(i100);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i101 |= (cCharAt9 & 8191) << i102;
                                    i102 += 13;
                                    i100 = i29;
                                }
                                iCharAt13 = i101 | (cCharAt9 << i102);
                            } else {
                                i29 = i100;
                            }
                            int i103 = (iCharAt13 / 32) + i12 + i12;
                            Object obj3 = objArrZze[i103];
                            if (obj3 instanceof Field) {
                                fieldZzG = (Field) obj3;
                            } else {
                                fieldZzG = zzG(cls, (String) obj3);
                                objArrZze[i103] = fieldZzG;
                            }
                            i30 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG);
                        }
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i71] = iObjectFieldOffset;
                            i71++;
                        }
                    }
                    i28 = i31;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                    iObjectFieldOffset2 = 1048575;
                    objArr = objArr2;
                    if ((iCharAt11 & 4096) == 4096) {
                        i29 = i25;
                        i30 = 0;
                    } else {
                        i29 = i25;
                        i30 = 0;
                    }
                    if (i82 >= 18) {
                        iArr[i71] = iObjectFieldOffset;
                        i71++;
                    }
                }
                i28 = i92;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                iObjectFieldOffset2 = 1048575;
                objArr = objArr2;
                if ((iCharAt11 & 4096) == 4096) {
                    i29 = i25;
                    i30 = 0;
                } else {
                    i29 = i25;
                    i30 = 0;
                }
                if (i82 >= 18) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
            }
            int i104 = i72 + 1;
            iArr2[i72] = iCharAt10;
            int i105 = i72 + 2;
            iArr2[i104] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | (i82 << 20) | iObjectFieldOffset;
            i72 += 3;
            iArr2[i105] = (i30 << 20) | iObjectFieldOffset2;
            iCharAt = i26;
            iCharAt3 = i83;
            i41 = i29;
            length = i24;
            objArr2 = objArr;
            i11 = i28;
            iArr3 = iArr2;
            i13 = i27;
            c10 = 55296;
        }
        return new zzfo(iArr3, objArr2, iCharAt, i13, zzfwVar.zza(), z10, false, iArr, iCharAt3, i69, zzfrVar, zzezVar, zzgpVar, zzdoVar, zzfgVar, null);
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzgz.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzgz.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i10;
        int iZzD;
        int iZzE;
        int iZzE2;
        int iZzD2;
        int iZzx;
        int iZzo;
        int iZzu;
        boolean z10;
        int iZzd;
        int iZzD3;
        int iZzE3;
        int iZzE4;
        int iZzD4;
        int iZzx2;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int iA = 0;
        int i14 = 0;
        while (i13 < this.zzc.length) {
            int iZzB = zzB(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                i10 = 1 << (i16 >>> 20);
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
            } else {
                i10 = 0;
            }
            long j10 = iZzB & i11;
            switch (iZzA) {
                case 0:
                    if ((i14 & i10) != 0) {
                        iA = o1.a(i15 << 3, 8, iA);
                    }
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        iA = o1.a(i15 << 3, 4, iA);
                    }
                    break;
                case 2:
                    if ((i14 & i10) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzD = zzdi.zzD(i15 << 3);
                        iZzE = zzdi.zzE(j11);
                        iZzE2 = iZzE + iZzD;
                        iA += iZzE2;
                    }
                    break;
                case 3:
                    if ((i14 & i10) != 0) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzD = zzdi.zzD(i15 << 3);
                        iZzE = zzdi.zzE(j12);
                        iZzE2 = iZzE + iZzD;
                        iA += iZzE2;
                    }
                    break;
                case 4:
                    if ((i14 & i10) != 0) {
                        int i18 = unsafe.getInt(obj, j10);
                        iZzD2 = zzdi.zzD(i15 << 3);
                        iZzx = zzdi.zzx(i18);
                        iZzE2 = iZzx + iZzD2;
                        iA += iZzE2;
                    }
                    break;
                case 5:
                    if ((i14 & i10) != 0) {
                        iA = o1.a(i15 << 3, 8, iA);
                    }
                    break;
                case 6:
                    if ((i14 & i10) != 0) {
                        iA = o1.a(i15 << 3, 4, iA);
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        iA = o1.a(i15 << 3, 1, iA);
                    }
                    break;
                case 8:
                    if ((i14 & i10) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzdb) {
                            int iZzD5 = zzdi.zzD(i15 << 3);
                            int iZzd2 = ((zzdb) object).zzd();
                            iA = a.a(iZzd2, iZzd2, iZzD5, iA);
                        } else {
                            iZzD2 = zzdi.zzD(i15 << 3);
                            iZzx = zzdi.zzB((String) object);
                            iZzE2 = iZzx + iZzD2;
                            iA += iZzE2;
                        }
                    }
                    break;
                case 9:
                    if ((i14 & i10) != 0) {
                        iZzo = zzgd.zzo(i15, unsafe.getObject(obj, j10), zzE(i13));
                        iA += iZzo;
                    }
                    break;
                case 10:
                    if ((i14 & i10) != 0) {
                        zzdb zzdbVar = (zzdb) unsafe.getObject(obj, j10);
                        int iZzD6 = zzdi.zzD(i15 << 3);
                        int iZzd3 = zzdbVar.zzd();
                        iA = a.a(iZzd3, iZzd3, iZzD6, iA);
                    }
                    break;
                case 11:
                    if ((i14 & i10) != 0) {
                        iA = o1.a(unsafe.getInt(obj, j10), zzdi.zzD(i15 << 3), iA);
                    }
                    break;
                case 12:
                    if ((i14 & i10) != 0) {
                        int i19 = unsafe.getInt(obj, j10);
                        iZzD2 = zzdi.zzD(i15 << 3);
                        iZzx = zzdi.zzx(i19);
                        iZzE2 = iZzx + iZzD2;
                        iA += iZzE2;
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        iA = o1.a(i15 << 3, 4, iA);
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        iA = o1.a(i15 << 3, 8, iA);
                    }
                    break;
                case 15:
                    if ((i14 & i10) != 0) {
                        int i20 = unsafe.getInt(obj, j10);
                        iA = o1.a((i20 >> 31) ^ (i20 + i20), zzdi.zzD(i15 << 3), iA);
                    }
                    break;
                case 16:
                    if ((i10 & i14) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        iZzE2 = zzdi.zzE((j13 >> 63) ^ (j13 + j13)) + zzdi.zzD(i15 << 3);
                        iA += iZzE2;
                    }
                    break;
                case 17:
                    if ((i14 & i10) != 0) {
                        iZzE2 = zzdi.zzv(i15, (zzfl) unsafe.getObject(obj, j10), zzE(i13));
                        iA += iZzE2;
                    }
                    break;
                case 18:
                    iZzo = zzgd.zzh(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 19:
                    iZzo = zzgd.zzf(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 20:
                    iZzo = zzgd.zzm(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 21:
                    iZzo = zzgd.zzx(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 22:
                    iZzo = zzgd.zzk(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 23:
                    iZzo = zzgd.zzh(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 24:
                    iZzo = zzgd.zzf(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 25:
                    iZzo = zzgd.zza(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 26:
                    iZzu = zzgd.zzu(i15, (List) unsafe.getObject(obj, j10));
                    iA += iZzu;
                    break;
                case 27:
                    iZzu = zzgd.zzp(i15, (List) unsafe.getObject(obj, j10), zzE(i13));
                    iA += iZzu;
                    break;
                case 28:
                    iZzu = zzgd.zzc(i15, (List) unsafe.getObject(obj, j10));
                    iA += iZzu;
                    break;
                case 29:
                    iZzu = zzgd.zzv(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzu;
                    break;
                case 30:
                    z10 = false;
                    iZzd = zzgd.zzd(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 31:
                    z10 = false;
                    iZzd = zzgd.zzf(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 32:
                    z10 = false;
                    iZzd = zzgd.zzh(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 33:
                    z10 = false;
                    iZzd = zzgd.zzq(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 34:
                    z10 = false;
                    iZzd = zzgd.zzs(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 35:
                    int iZzi = zzgd.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iA = a.a(iZzi, zzdi.zzC(i15), iZzi, iA);
                    }
                    break;
                case 36:
                    int iZzg = zzgd.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg > 0) {
                        iA = a.a(iZzg, zzdi.zzC(i15), iZzg, iA);
                    }
                    break;
                case 37:
                    int iZzn = zzgd.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzn > 0) {
                        iA = a.a(iZzn, zzdi.zzC(i15), iZzn, iA);
                    }
                    break;
                case 38:
                    int iZzy = zzgd.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzy > 0) {
                        iA = a.a(iZzy, zzdi.zzC(i15), iZzy, iA);
                    }
                    break;
                case 39:
                    int iZzl = zzgd.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzl > 0) {
                        iA = a.a(iZzl, zzdi.zzC(i15), iZzl, iA);
                    }
                    break;
                case 40:
                    int iZzi2 = zzgd.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi2 > 0) {
                        iA = a.a(iZzi2, zzdi.zzC(i15), iZzi2, iA);
                    }
                    break;
                case 41:
                    int iZzg2 = zzgd.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg2 > 0) {
                        iA = a.a(iZzg2, zzdi.zzC(i15), iZzg2, iA);
                    }
                    break;
                case 42:
                    int iZzb = zzgd.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzb > 0) {
                        iA = a.a(iZzb, zzdi.zzC(i15), iZzb, iA);
                    }
                    break;
                case 43:
                    int iZzw = zzgd.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzw > 0) {
                        iA = a.a(iZzw, zzdi.zzC(i15), iZzw, iA);
                    }
                    break;
                case 44:
                    int iZze = zzgd.zze((List) unsafe.getObject(obj, j10));
                    if (iZze > 0) {
                        iA = a.a(iZze, zzdi.zzC(i15), iZze, iA);
                    }
                    break;
                case 45:
                    int iZzg3 = zzgd.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg3 > 0) {
                        iA = a.a(iZzg3, zzdi.zzC(i15), iZzg3, iA);
                    }
                    break;
                case 46:
                    int iZzi3 = zzgd.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi3 > 0) {
                        iA = a.a(iZzi3, zzdi.zzC(i15), iZzi3, iA);
                    }
                    break;
                case 47:
                    int iZzr = zzgd.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzr > 0) {
                        iA = a.a(iZzr, zzdi.zzC(i15), iZzr, iA);
                    }
                    break;
                case 48:
                    int iZzt = zzgd.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzt > 0) {
                        iA = a.a(iZzt, zzdi.zzC(i15), iZzt, iA);
                    }
                    break;
                case 49:
                    iZzu = zzgd.zzj(i15, (List) unsafe.getObject(obj, j10), zzE(i13));
                    iA += iZzu;
                    break;
                case 50:
                    zzfg.zza(i15, unsafe.getObject(obj, j10), zzF(i13));
                    break;
                case 51:
                    if (zzP(obj, i15, i13)) {
                        iA = o1.a(i15 << 3, 8, iA);
                    }
                    break;
                case 52:
                    if (zzP(obj, i15, i13)) {
                        iA = o1.a(i15 << 3, 4, iA);
                    }
                    break;
                case 53:
                    if (zzP(obj, i15, i13)) {
                        long jZzC = zzC(obj, j10);
                        iZzD3 = zzdi.zzD(i15 << 3);
                        iZzE3 = zzdi.zzE(jZzC);
                        iZzE4 = iZzE3 + iZzD3;
                        iA += iZzE4;
                    }
                    break;
                case 54:
                    if (zzP(obj, i15, i13)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzD3 = zzdi.zzD(i15 << 3);
                        iZzE3 = zzdi.zzE(jZzC2);
                        iZzE4 = iZzE3 + iZzD3;
                        iA += iZzE4;
                    }
                    break;
                case 55:
                    if (zzP(obj, i15, i13)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzD4 = zzdi.zzD(i15 << 3);
                        iZzx2 = zzdi.zzx(iZzr2);
                        iZzE4 = iZzx2 + iZzD4;
                        iA += iZzE4;
                    }
                    break;
                case 56:
                    if (zzP(obj, i15, i13)) {
                        iA = o1.a(i15 << 3, 8, iA);
                    }
                    break;
                case 57:
                    if (zzP(obj, i15, i13)) {
                        iA = o1.a(i15 << 3, 4, iA);
                    }
                    break;
                case 58:
                    if (zzP(obj, i15, i13)) {
                        iA = o1.a(i15 << 3, 1, iA);
                    }
                    break;
                case 59:
                    if (zzP(obj, i15, i13)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzdb) {
                            int iZzD7 = zzdi.zzD(i15 << 3);
                            int iZzd4 = ((zzdb) object2).zzd();
                            iA = a.a(iZzd4, iZzd4, iZzD7, iA);
                        } else {
                            iZzD4 = zzdi.zzD(i15 << 3);
                            iZzx2 = zzdi.zzB((String) object2);
                            iZzE4 = iZzx2 + iZzD4;
                            iA += iZzE4;
                        }
                    }
                    break;
                case 60:
                    if (zzP(obj, i15, i13)) {
                        iZzu = zzgd.zzo(i15, unsafe.getObject(obj, j10), zzE(i13));
                        iA += iZzu;
                    }
                    break;
                case 61:
                    if (zzP(obj, i15, i13)) {
                        zzdb zzdbVar2 = (zzdb) unsafe.getObject(obj, j10);
                        int iZzD8 = zzdi.zzD(i15 << 3);
                        int iZzd5 = zzdbVar2.zzd();
                        iA = a.a(iZzd5, iZzd5, iZzD8, iA);
                    }
                    break;
                case 62:
                    if (zzP(obj, i15, i13)) {
                        iA = o1.a(zzr(obj, j10), zzdi.zzD(i15 << 3), iA);
                    }
                    break;
                case 63:
                    if (zzP(obj, i15, i13)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzD4 = zzdi.zzD(i15 << 3);
                        iZzx2 = zzdi.zzx(iZzr3);
                        iZzE4 = iZzx2 + iZzD4;
                        iA += iZzE4;
                    }
                    break;
                case 64:
                    if (zzP(obj, i15, i13)) {
                        iA = o1.a(i15 << 3, 4, iA);
                    }
                    break;
                case 65:
                    if (zzP(obj, i15, i13)) {
                        iA = o1.a(i15 << 3, 8, iA);
                    }
                    break;
                case 66:
                    if (zzP(obj, i15, i13)) {
                        int iZzr4 = zzr(obj, j10);
                        iA = o1.a((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzdi.zzD(i15 << 3), iA);
                    }
                    break;
                case 67:
                    if (zzP(obj, i15, i13)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzE4 = zzdi.zzE((jZzC3 >> 63) ^ (jZzC3 + jZzC3)) + zzdi.zzD(i15 << 3);
                        iA += iZzE4;
                    }
                    break;
                case 68:
                    if (zzP(obj, i15, i13)) {
                        iZzE4 = zzdi.zzv(i15, (zzfl) unsafe.getObject(obj, j10), zzE(i13));
                        iA += iZzE4;
                    }
                    break;
                default:
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        int iZza = 0;
        zzgp zzgpVar = this.zzn;
        int iZza2 = iA + zzgpVar.zza(zzgpVar.zzc(obj));
        if (!this.zzh) {
            return iZza2;
        }
        zzds zzdsVarZzb = this.zzo.zzb(obj);
        for (int i21 = 0; i21 < zzdsVarZzb.zza.zzb(); i21++) {
            Map.Entry entryZzg = zzdsVarZzb.zza.zzg(i21);
            iZza += zzds.zza((zzdr) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzdsVarZzb.zza.zzc()) {
            iZza += zzds.zza((zzdr) entry.getKey(), entry.getValue());
        }
        return iZza2 + iZza;
    }

    private final int zzq(Object obj) {
        int iZzD;
        int iZzE;
        int iZzD2;
        int iZzx;
        int iZzo;
        int iZzv;
        Unsafe unsafe = zzb;
        int iA = 0;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB = zzB(i10);
            int iZzA = zzA(iZzB);
            int i11 = this.zzc[i10];
            long j10 = iZzB & 1048575;
            if (iZzA >= zzdt.zzJ.zza() && iZzA <= zzdt.zzW.zza()) {
                int i12 = this.zzc[i10 + 2];
            }
            switch (iZzA) {
                case 0:
                    if (zzM(obj, i10)) {
                        iA = o1.a(i11 << 3, 8, iA);
                    }
                    break;
                case 1:
                    if (zzM(obj, i10)) {
                        iA = o1.a(i11 << 3, 4, iA);
                    }
                    break;
                case 2:
                    if (zzM(obj, i10)) {
                        long jZzd = zzgz.zzd(obj, j10);
                        iZzD = zzdi.zzD(i11 << 3);
                        iZzE = zzdi.zzE(jZzd);
                        iZzv = iZzE + iZzD;
                        iA += iZzv;
                    }
                    break;
                case 3:
                    if (zzM(obj, i10)) {
                        long jZzd2 = zzgz.zzd(obj, j10);
                        iZzD = zzdi.zzD(i11 << 3);
                        iZzE = zzdi.zzE(jZzd2);
                        iZzv = iZzE + iZzD;
                        iA += iZzv;
                    }
                    break;
                case 4:
                    if (zzM(obj, i10)) {
                        int iZzc = zzgz.zzc(obj, j10);
                        iZzD2 = zzdi.zzD(i11 << 3);
                        iZzx = zzdi.zzx(iZzc);
                        iZzv = iZzx + iZzD2;
                        iA += iZzv;
                    }
                    break;
                case 5:
                    if (zzM(obj, i10)) {
                        iA = o1.a(i11 << 3, 8, iA);
                    }
                    break;
                case 6:
                    if (zzM(obj, i10)) {
                        iA = o1.a(i11 << 3, 4, iA);
                    }
                    break;
                case 7:
                    if (zzM(obj, i10)) {
                        iA = o1.a(i11 << 3, 1, iA);
                    }
                    break;
                case 8:
                    if (zzM(obj, i10)) {
                        Object objZzf = zzgz.zzf(obj, j10);
                        if (objZzf instanceof zzdb) {
                            int iZzD3 = zzdi.zzD(i11 << 3);
                            int iZzd = ((zzdb) objZzf).zzd();
                            iA = a.a(iZzd, iZzd, iZzD3, iA);
                        } else {
                            iZzD2 = zzdi.zzD(i11 << 3);
                            iZzx = zzdi.zzB((String) objZzf);
                            iZzv = iZzx + iZzD2;
                            iA += iZzv;
                        }
                    }
                    break;
                case 9:
                    if (zzM(obj, i10)) {
                        iZzo = zzgd.zzo(i11, zzgz.zzf(obj, j10), zzE(i10));
                        iA += iZzo;
                    }
                    break;
                case 10:
                    if (zzM(obj, i10)) {
                        zzdb zzdbVar = (zzdb) zzgz.zzf(obj, j10);
                        int iZzD4 = zzdi.zzD(i11 << 3);
                        int iZzd2 = zzdbVar.zzd();
                        iA = a.a(iZzd2, iZzd2, iZzD4, iA);
                    }
                    break;
                case 11:
                    if (zzM(obj, i10)) {
                        iA = o1.a(zzgz.zzc(obj, j10), zzdi.zzD(i11 << 3), iA);
                    }
                    break;
                case 12:
                    if (zzM(obj, i10)) {
                        int iZzc2 = zzgz.zzc(obj, j10);
                        iZzD2 = zzdi.zzD(i11 << 3);
                        iZzx = zzdi.zzx(iZzc2);
                        iZzv = iZzx + iZzD2;
                        iA += iZzv;
                    }
                    break;
                case 13:
                    if (zzM(obj, i10)) {
                        iA = o1.a(i11 << 3, 4, iA);
                    }
                    break;
                case 14:
                    if (zzM(obj, i10)) {
                        iA = o1.a(i11 << 3, 8, iA);
                    }
                    break;
                case 15:
                    if (zzM(obj, i10)) {
                        int iZzc3 = zzgz.zzc(obj, j10);
                        iA = o1.a((iZzc3 >> 31) ^ (iZzc3 + iZzc3), zzdi.zzD(i11 << 3), iA);
                    }
                    break;
                case 16:
                    if (zzM(obj, i10)) {
                        long jZzd3 = zzgz.zzd(obj, j10);
                        iZzD = zzdi.zzD(i11 << 3);
                        iZzE = zzdi.zzE((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        iZzv = iZzE + iZzD;
                        iA += iZzv;
                    }
                    break;
                case 17:
                    if (zzM(obj, i10)) {
                        iZzv = zzdi.zzv(i11, (zzfl) zzgz.zzf(obj, j10), zzE(i10));
                        iA += iZzv;
                    }
                    break;
                case 18:
                    iZzo = zzgd.zzh(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 19:
                    iZzo = zzgd.zzf(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 20:
                    iZzo = zzgd.zzm(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 21:
                    iZzo = zzgd.zzx(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 22:
                    iZzo = zzgd.zzk(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 23:
                    iZzo = zzgd.zzh(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 24:
                    iZzo = zzgd.zzf(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 25:
                    iZzo = zzgd.zza(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 26:
                    iZzo = zzgd.zzu(i11, (List) zzgz.zzf(obj, j10));
                    iA += iZzo;
                    break;
                case 27:
                    iZzo = zzgd.zzp(i11, (List) zzgz.zzf(obj, j10), zzE(i10));
                    iA += iZzo;
                    break;
                case 28:
                    iZzo = zzgd.zzc(i11, (List) zzgz.zzf(obj, j10));
                    iA += iZzo;
                    break;
                case 29:
                    iZzo = zzgd.zzv(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 30:
                    iZzo = zzgd.zzd(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 31:
                    iZzo = zzgd.zzf(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 32:
                    iZzo = zzgd.zzh(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 33:
                    iZzo = zzgd.zzq(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 34:
                    iZzo = zzgd.zzs(i11, (List) zzgz.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 35:
                    int iZzi = zzgd.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iA = a.a(iZzi, zzdi.zzC(i11), iZzi, iA);
                    }
                    break;
                case 36:
                    int iZzg = zzgd.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg > 0) {
                        iA = a.a(iZzg, zzdi.zzC(i11), iZzg, iA);
                    }
                    break;
                case 37:
                    int iZzn = zzgd.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzn > 0) {
                        iA = a.a(iZzn, zzdi.zzC(i11), iZzn, iA);
                    }
                    break;
                case 38:
                    int iZzy = zzgd.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzy > 0) {
                        iA = a.a(iZzy, zzdi.zzC(i11), iZzy, iA);
                    }
                    break;
                case 39:
                    int iZzl = zzgd.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzl > 0) {
                        iA = a.a(iZzl, zzdi.zzC(i11), iZzl, iA);
                    }
                    break;
                case 40:
                    int iZzi2 = zzgd.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi2 > 0) {
                        iA = a.a(iZzi2, zzdi.zzC(i11), iZzi2, iA);
                    }
                    break;
                case 41:
                    int iZzg2 = zzgd.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg2 > 0) {
                        iA = a.a(iZzg2, zzdi.zzC(i11), iZzg2, iA);
                    }
                    break;
                case 42:
                    int iZzb = zzgd.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzb > 0) {
                        iA = a.a(iZzb, zzdi.zzC(i11), iZzb, iA);
                    }
                    break;
                case 43:
                    int iZzw = zzgd.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzw > 0) {
                        iA = a.a(iZzw, zzdi.zzC(i11), iZzw, iA);
                    }
                    break;
                case 44:
                    int iZze = zzgd.zze((List) unsafe.getObject(obj, j10));
                    if (iZze > 0) {
                        iA = a.a(iZze, zzdi.zzC(i11), iZze, iA);
                    }
                    break;
                case 45:
                    int iZzg3 = zzgd.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg3 > 0) {
                        iA = a.a(iZzg3, zzdi.zzC(i11), iZzg3, iA);
                    }
                    break;
                case 46:
                    int iZzi3 = zzgd.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi3 > 0) {
                        iA = a.a(iZzi3, zzdi.zzC(i11), iZzi3, iA);
                    }
                    break;
                case 47:
                    int iZzr = zzgd.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzr > 0) {
                        iA = a.a(iZzr, zzdi.zzC(i11), iZzr, iA);
                    }
                    break;
                case 48:
                    int iZzt = zzgd.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzt > 0) {
                        iA = a.a(iZzt, zzdi.zzC(i11), iZzt, iA);
                    }
                    break;
                case 49:
                    iZzo = zzgd.zzj(i11, (List) zzgz.zzf(obj, j10), zzE(i10));
                    iA += iZzo;
                    break;
                case 50:
                    zzfg.zza(i11, zzgz.zzf(obj, j10), zzF(i10));
                    break;
                case 51:
                    if (zzP(obj, i11, i10)) {
                        iA = o1.a(i11 << 3, 8, iA);
                    }
                    break;
                case 52:
                    if (zzP(obj, i11, i10)) {
                        iA = o1.a(i11 << 3, 4, iA);
                    }
                    break;
                case 53:
                    if (zzP(obj, i11, i10)) {
                        long jZzC = zzC(obj, j10);
                        iZzD = zzdi.zzD(i11 << 3);
                        iZzE = zzdi.zzE(jZzC);
                        iZzv = iZzE + iZzD;
                        iA += iZzv;
                    }
                    break;
                case 54:
                    if (zzP(obj, i11, i10)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzD = zzdi.zzD(i11 << 3);
                        iZzE = zzdi.zzE(jZzC2);
                        iZzv = iZzE + iZzD;
                        iA += iZzv;
                    }
                    break;
                case 55:
                    if (zzP(obj, i11, i10)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzD2 = zzdi.zzD(i11 << 3);
                        iZzx = zzdi.zzx(iZzr2);
                        iZzv = iZzx + iZzD2;
                        iA += iZzv;
                    }
                    break;
                case 56:
                    if (zzP(obj, i11, i10)) {
                        iA = o1.a(i11 << 3, 8, iA);
                    }
                    break;
                case 57:
                    if (zzP(obj, i11, i10)) {
                        iA = o1.a(i11 << 3, 4, iA);
                    }
                    break;
                case 58:
                    if (zzP(obj, i11, i10)) {
                        iA = o1.a(i11 << 3, 1, iA);
                    }
                    break;
                case 59:
                    if (zzP(obj, i11, i10)) {
                        Object objZzf2 = zzgz.zzf(obj, j10);
                        if (objZzf2 instanceof zzdb) {
                            int iZzD5 = zzdi.zzD(i11 << 3);
                            int iZzd3 = ((zzdb) objZzf2).zzd();
                            iA = a.a(iZzd3, iZzd3, iZzD5, iA);
                        } else {
                            iZzD2 = zzdi.zzD(i11 << 3);
                            iZzx = zzdi.zzB((String) objZzf2);
                            iZzv = iZzx + iZzD2;
                            iA += iZzv;
                        }
                    }
                    break;
                case 60:
                    if (zzP(obj, i11, i10)) {
                        iZzo = zzgd.zzo(i11, zzgz.zzf(obj, j10), zzE(i10));
                        iA += iZzo;
                    }
                    break;
                case 61:
                    if (zzP(obj, i11, i10)) {
                        zzdb zzdbVar2 = (zzdb) zzgz.zzf(obj, j10);
                        int iZzD6 = zzdi.zzD(i11 << 3);
                        int iZzd4 = zzdbVar2.zzd();
                        iA = a.a(iZzd4, iZzd4, iZzD6, iA);
                    }
                    break;
                case 62:
                    if (zzP(obj, i11, i10)) {
                        iA = o1.a(zzr(obj, j10), zzdi.zzD(i11 << 3), iA);
                    }
                    break;
                case 63:
                    if (zzP(obj, i11, i10)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzD2 = zzdi.zzD(i11 << 3);
                        iZzx = zzdi.zzx(iZzr3);
                        iZzv = iZzx + iZzD2;
                        iA += iZzv;
                    }
                    break;
                case 64:
                    if (zzP(obj, i11, i10)) {
                        iA = o1.a(i11 << 3, 4, iA);
                    }
                    break;
                case 65:
                    if (zzP(obj, i11, i10)) {
                        iA = o1.a(i11 << 3, 8, iA);
                    }
                    break;
                case 66:
                    if (zzP(obj, i11, i10)) {
                        int iZzr4 = zzr(obj, j10);
                        iA = o1.a((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzdi.zzD(i11 << 3), iA);
                    }
                    break;
                case 67:
                    if (zzP(obj, i11, i10)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzD = zzdi.zzD(i11 << 3);
                        iZzE = zzdi.zzE((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        iZzv = iZzE + iZzD;
                        iA += iZzv;
                    }
                    break;
                case 68:
                    if (zzP(obj, i11, i10)) {
                        iZzv = zzdi.zzv(i11, (zzfl) zzgz.zzf(obj, j10), zzE(i10));
                        iA += iZzv;
                    }
                    break;
            }
        }
        zzgp zzgpVar = this.zzn;
        return iA + zzgpVar.zza(zzgpVar.zzc(obj));
    }

    private static int zzr(Object obj, long j10) {
        return ((Integer) zzgz.zzf(obj, j10)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzco zzcoVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzff) object).zze()) {
            zzff zzffVarZzb = zzff.zza().zzb();
            zzfg.zzb(zzffVarZzb, object);
            unsafe.putObject(obj, j10, zzffVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzco zzcoVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzcp.zzo(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzcp.zzb(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm = zzcp.zzm(bArr, i10, zzcoVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzcoVar.zzb));
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj = zzcp.zzj(bArr, i10, zzcoVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzcoVar.zza));
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzcp.zzo(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzcp.zzb(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm2 = zzcp.zzm(bArr, i10, zzcoVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(zzcoVar.zzb != 0));
                unsafe.putInt(obj, j11, i13);
                return iZzm2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iZzj2 = zzcp.zzj(bArr, i10, zzcoVar);
                int i18 = zzcoVar.zza;
                if (i18 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & PKIFailureInfo.duplicateCertReq) != 0 && !zzhe.zzi(bArr, iZzj2, iZzj2 + i18)) {
                        throw zzen.zzc();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj2, i18, zzel.zzb));
                    iZzj2 += i18;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iZzd = zzcp.zzd(zzE(i17), bArr, i10, i11, zzcoVar);
                Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, zzcoVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzel.zzg(object, zzcoVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzd;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iZza = zzcp.zza(bArr, i10, zzcoVar);
                unsafe.putObject(obj, j10, zzcoVar.zzc);
                unsafe.putInt(obj, j11, i13);
                return iZza;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj3 = zzcp.zzj(bArr, i10, zzcoVar);
                int i19 = zzcoVar.zza;
                zzeg zzegVarZzD = zzD(i17);
                if (zzegVarZzD == null || zzegVarZzD.zza(i19)) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i19));
                    unsafe.putInt(obj, j11, i13);
                } else {
                    zzd(obj).zzh(i12, Long.valueOf(i19));
                }
                return iZzj3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj4 = zzcp.zzj(bArr, i10, zzcoVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzde.zzb(zzcoVar.zza)));
                unsafe.putInt(obj, j11, i13);
                return iZzj4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm3 = zzcp.zzm(bArr, i10, zzcoVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzde.zzc(zzcoVar.zzb)));
                unsafe.putInt(obj, j11, i13);
                return iZzm3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                int iZzc = zzcp.zzc(zzE(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzcoVar);
                Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j10, zzcoVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzel.zzg(object2, zzcoVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzc;
            default:
                return i10;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0081. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i10, int i11, zzco zzcoVar) throws IOException {
        int i12;
        int iZzk;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int i19;
        int iZzm;
        int iZzd;
        int i20;
        int i21;
        int i22;
        zzfo<T> zzfoVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i23 = i11;
        zzcoVar = zzcoVar;
        Unsafe unsafe2 = zzb;
        int i24 = 1048575;
        int i25 = -1;
        int iZzi = i10;
        int i26 = -1;
        int i27 = 1048575;
        int i28 = 0;
        int i29 = 0;
        while (iZzi < i23) {
            int i30 = iZzi + 1;
            byte b10 = bArr2[iZzi];
            if (b10 < 0) {
                iZzk = zzcp.zzk(b10, bArr2, i30, zzcoVar);
                i12 = zzcoVar.zza;
            } else {
                i12 = b10;
                iZzk = i30;
            }
            int i31 = i12 >>> 3;
            int i32 = i12 & 7;
            int iZzx = i31 > i26 ? zzfoVar.zzx(i31, i28 / 3) : zzfoVar.zzw(i31);
            if (iZzx == i25) {
                i13 = iZzk;
                i14 = i31;
                i15 = i25;
                unsafe = unsafe2;
                i16 = 0;
            } else {
                int[] iArr = zzfoVar.zzc;
                int i33 = iArr[iZzx + 1];
                int iZzA = zzA(i33);
                long j10 = i33 & i24;
                if (iZzA <= 17) {
                    int i34 = iArr[iZzx + 2];
                    int i35 = 1 << (i34 >>> 20);
                    i17 = 1048575;
                    int i36 = i34 & 1048575;
                    if (i36 != i27) {
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj2, i27, i29);
                        }
                        if (i36 != 1048575) {
                            i29 = unsafe2.getInt(obj2, i36);
                        }
                        i27 = i36;
                    }
                    switch (iZzA) {
                        case 0:
                            i18 = iZzx;
                            i19 = iZzk;
                            i14 = i31;
                            if (i32 != 1) {
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                zzgz.zzo(obj2, j10, Double.longBitsToDouble(zzcp.zzo(bArr2, i19)));
                                iZzi = i19 + 8;
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 1:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i19 = iZzk;
                            i17 = 1048575;
                            i14 = i31;
                            if (i32 != 5) {
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                zzgz.zzp(obj2, j10, Float.intBitsToFloat(zzcp.zzb(bArr2, i19)));
                                iZzi = i19 + 4;
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i19 = iZzk;
                            i14 = i31;
                            if (i32 != 0) {
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                iZzm = zzcp.zzm(bArr2, i19, zzcoVar);
                                unsafe2.putLong(obj, j10, zzcoVar.zzb);
                                i29 |= i35;
                                iZzi = iZzm;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i19 = iZzk;
                            i17 = 1048575;
                            i14 = i31;
                            if (i32 != 0) {
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                iZzi = zzcp.zzj(bArr2, i19, zzcoVar);
                                unsafe2.putInt(obj2, j10, zzcoVar.zza);
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i18 = iZzx;
                            i14 = i31;
                            if (i32 != 1) {
                                i19 = iZzk;
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                i19 = iZzk;
                                unsafe2.putLong(obj, j10, zzcp.zzo(bArr2, iZzk));
                                iZzi = i19 + 8;
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i17 = 1048575;
                            i14 = i31;
                            if (i32 != 5) {
                                i19 = iZzk;
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                unsafe2.putInt(obj2, j10, zzcp.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 7:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i17 = 1048575;
                            i14 = i31;
                            if (i32 != 0) {
                                i19 = iZzk;
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                iZzi = zzcp.zzm(bArr2, iZzk, zzcoVar);
                                zzgz.zzm(obj2, j10, zzcoVar.zzb != 0);
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 8:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i17 = 1048575;
                            i14 = i31;
                            if (i32 != 2) {
                                i19 = iZzk;
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                iZzi = (536870912 & i33) == 0 ? zzcp.zzg(bArr2, iZzk, zzcoVar) : zzcp.zzh(bArr2, iZzk, zzcoVar);
                                unsafe2.putObject(obj2, j10, zzcoVar.zzc);
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 9:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i17 = 1048575;
                            i14 = i31;
                            if (i32 != 2) {
                                i19 = iZzk;
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                iZzd = zzcp.zzd(zzfoVar.zzE(i18), bArr2, iZzk, i23, zzcoVar);
                                Object object = unsafe2.getObject(obj2, j10);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j10, zzcoVar.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j10, zzel.zzg(object, zzcoVar.zzc));
                                }
                                i29 |= i35;
                                iZzi = iZzd;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 10:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i17 = 1048575;
                            i14 = i31;
                            if (i32 != 2) {
                                i19 = iZzk;
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                iZzd = zzcp.zza(bArr2, iZzk, zzcoVar);
                                unsafe2.putObject(obj2, j10, zzcoVar.zzc);
                                i29 |= i35;
                                iZzi = iZzd;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 12:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i17 = 1048575;
                            i14 = i31;
                            if (i32 != 0) {
                                i19 = iZzk;
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                iZzd = zzcp.zzj(bArr2, iZzk, zzcoVar);
                                unsafe2.putInt(obj2, j10, zzcoVar.zza);
                                i29 |= i35;
                                iZzi = iZzd;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 15:
                            zzcoVar = zzcoVar;
                            i18 = iZzx;
                            i17 = 1048575;
                            i14 = i31;
                            if (i32 != 0) {
                                i19 = iZzk;
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                iZzd = zzcp.zzj(bArr2, iZzk, zzcoVar);
                                unsafe2.putInt(obj2, j10, zzde.zzb(zzcoVar.zza));
                                i29 |= i35;
                                iZzi = iZzd;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 16:
                            if (i32 != 0) {
                                i14 = i31;
                                i18 = iZzx;
                                i19 = iZzk;
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                zzcoVar = zzcoVar;
                                iZzm = zzcp.zzm(bArr2, iZzk, zzcoVar);
                                i18 = iZzx;
                                i14 = i31;
                                unsafe2.putLong(obj, j10, zzde.zzc(zzcoVar.zzb));
                                i29 |= i35;
                                iZzi = iZzm;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        default:
                            i14 = i31;
                            i18 = iZzx;
                            i19 = iZzk;
                            i13 = i19;
                            unsafe = unsafe2;
                            i16 = i18;
                            i15 = -1;
                            break;
                    }
                } else {
                    zzcoVar = zzcoVar;
                    i18 = iZzx;
                    int i37 = iZzk;
                    i17 = 1048575;
                    i14 = i31;
                    if (iZzA == 27) {
                        if (i32 == 2) {
                            zzek zzekVarZzd = (zzek) unsafe2.getObject(obj2, j10);
                            if (!zzekVarZzd.zzc()) {
                                int size = zzekVarZzd.size();
                                zzekVarZzd = zzekVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j10, zzekVarZzd);
                            }
                            iZzi = zzcp.zze(zzfoVar.zzE(i18), i12, bArr, i37, i11, zzekVarZzd, zzcoVar);
                            i29 = i29;
                            i28 = i18;
                            i26 = i14;
                            i24 = i17;
                            i25 = -1;
                        } else {
                            i20 = i37;
                            i21 = i29;
                            i22 = i27;
                            unsafe = unsafe2;
                            i16 = i18;
                            i15 = -1;
                        }
                    } else if (iZzA <= 49) {
                        i21 = i29;
                        i22 = i27;
                        i15 = -1;
                        unsafe = unsafe2;
                        i16 = i18;
                        iZzi = zzv(obj, bArr, i37, i11, i12, i14, i32, i18, i33, iZzA, j10, zzcoVar);
                        if (iZzi != i37) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i23 = i11;
                            zzcoVar = zzcoVar;
                            i27 = i22;
                            i25 = i15;
                            i26 = i14;
                            i29 = i21;
                            i28 = i16;
                            unsafe2 = unsafe;
                            i24 = 1048575;
                            zzfoVar = this;
                        } else {
                            i13 = iZzi;
                            i27 = i22;
                            i29 = i21;
                        }
                    } else {
                        i20 = i37;
                        i21 = i29;
                        i22 = i27;
                        unsafe = unsafe2;
                        i16 = i18;
                        i15 = -1;
                        if (iZzA != 50) {
                            iZzi = zzt(obj, bArr, i20, i11, i12, i14, i32, i33, iZzA, j10, i16, zzcoVar);
                            if (iZzi != i20) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i23 = i11;
                                zzcoVar = zzcoVar;
                                i27 = i22;
                                i25 = i15;
                                i26 = i14;
                                i29 = i21;
                                i28 = i16;
                                unsafe2 = unsafe;
                                i24 = 1048575;
                                zzfoVar = this;
                            } else {
                                i13 = iZzi;
                                i27 = i22;
                                i29 = i21;
                            }
                        } else if (i32 == 2) {
                            iZzi = zzs(obj, bArr, i20, i11, i16, j10, zzcoVar);
                            if (iZzi != i20) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i23 = i11;
                                zzcoVar = zzcoVar;
                                i27 = i22;
                                i25 = i15;
                                i26 = i14;
                                i29 = i21;
                                i28 = i16;
                                unsafe2 = unsafe;
                                i24 = 1048575;
                                zzfoVar = this;
                            } else {
                                i13 = iZzi;
                                i27 = i22;
                                i29 = i21;
                            }
                        }
                    }
                    i13 = i20;
                    i27 = i22;
                    i29 = i21;
                }
            }
            iZzi = zzcp.zzi(i12, bArr, i13, i11, zzd(obj), zzcoVar);
            zzfoVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i23 = i11;
            zzcoVar = zzcoVar;
            i25 = i15;
            i26 = i14;
            i28 = i16;
            unsafe2 = unsafe;
            i24 = 1048575;
        }
        int i38 = i29;
        int i39 = i27;
        Unsafe unsafe3 = unsafe2;
        if (i39 != i24) {
            unsafe3.putInt(obj, i39, i38);
        }
        if (iZzi == i11) {
            return iZzi;
        }
        throw zzen.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, zzco zzcoVar) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int iZzj;
        int iZzj2 = i10;
        Unsafe unsafe = zzb;
        zzek zzekVarZzd = (zzek) unsafe.getObject(obj, j11);
        if (!zzekVarZzd.zzc()) {
            int size = zzekVarZzd.size();
            zzekVarZzd = zzekVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzekVarZzd);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzdk zzdkVar = (zzdk) zzekVarZzd;
                    int iZzj3 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i21 = zzcoVar.zza + iZzj3;
                    while (iZzj3 < i21) {
                        zzdkVar.zze(Double.longBitsToDouble(zzcp.zzo(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i21) {
                        return iZzj3;
                    }
                    throw zzen.zzg();
                }
                if (i14 == 1) {
                    zzdk zzdkVar2 = (zzdk) zzekVarZzd;
                    zzdkVar2.zze(Double.longBitsToDouble(zzcp.zzo(bArr, i10)));
                    while (true) {
                        i17 = iZzj2 + 8;
                        if (i17 < i11) {
                            iZzj2 = zzcp.zzj(bArr, i17, zzcoVar);
                            if (i12 == zzcoVar.zza) {
                                zzdkVar2.zze(Double.longBitsToDouble(zzcp.zzo(bArr, iZzj2)));
                            }
                        }
                    }
                    return i17;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzdu zzduVar = (zzdu) zzekVarZzd;
                    int iZzj4 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i22 = zzcoVar.zza + iZzj4;
                    while (iZzj4 < i22) {
                        zzduVar.zzg(Float.intBitsToFloat(zzcp.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i22) {
                        return iZzj4;
                    }
                    throw zzen.zzg();
                }
                if (i14 == 5) {
                    zzdu zzduVar2 = (zzdu) zzekVarZzd;
                    zzduVar2.zzg(Float.intBitsToFloat(zzcp.zzb(bArr, i10)));
                    while (true) {
                        i18 = iZzj2 + 4;
                        if (i18 < i11) {
                            iZzj2 = zzcp.zzj(bArr, i18, zzcoVar);
                            if (i12 == zzcoVar.zza) {
                                zzduVar2.zzg(Float.intBitsToFloat(zzcp.zzb(bArr, iZzj2)));
                            }
                        }
                    }
                    return i18;
                }
                return iZzj2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    zzfa zzfaVar = (zzfa) zzekVarZzd;
                    int iZzj5 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i23 = zzcoVar.zza + iZzj5;
                    while (iZzj5 < i23) {
                        iZzj5 = zzcp.zzm(bArr, iZzj5, zzcoVar);
                        zzfaVar.zzf(zzcoVar.zzb);
                    }
                    if (iZzj5 == i23) {
                        return iZzj5;
                    }
                    throw zzen.zzg();
                }
                if (i14 == 0) {
                    zzfa zzfaVar2 = (zzfa) zzekVarZzd;
                    int iZzm = zzcp.zzm(bArr, iZzj2, zzcoVar);
                    zzfaVar2.zzf(zzcoVar.zzb);
                    while (iZzm < i11) {
                        int iZzj6 = zzcp.zzj(bArr, iZzm, zzcoVar);
                        if (i12 != zzcoVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzcp.zzm(bArr, iZzj6, zzcoVar);
                        zzfaVar2.zzf(zzcoVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzcp.zzf(bArr, iZzj2, zzekVarZzd, zzcoVar);
                }
                if (i14 == 0) {
                    return zzcp.zzl(i12, bArr, i10, i11, zzekVarZzd, zzcoVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzfa zzfaVar3 = (zzfa) zzekVarZzd;
                    int iZzj7 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i24 = zzcoVar.zza + iZzj7;
                    while (iZzj7 < i24) {
                        zzfaVar3.zzf(zzcp.zzo(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i24) {
                        return iZzj7;
                    }
                    throw zzen.zzg();
                }
                if (i14 == 1) {
                    zzfa zzfaVar4 = (zzfa) zzekVarZzd;
                    zzfaVar4.zzf(zzcp.zzo(bArr, i10));
                    while (true) {
                        i19 = iZzj2 + 8;
                        if (i19 < i11) {
                            iZzj2 = zzcp.zzj(bArr, i19, zzcoVar);
                            if (i12 == zzcoVar.zza) {
                                zzfaVar4.zzf(zzcp.zzo(bArr, iZzj2));
                            }
                        }
                    }
                    return i19;
                }
                return iZzj2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    zzed zzedVar = (zzed) zzekVarZzd;
                    int iZzj8 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i25 = zzcoVar.zza + iZzj8;
                    while (iZzj8 < i25) {
                        zzedVar.zzg(zzcp.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i25) {
                        return iZzj8;
                    }
                    throw zzen.zzg();
                }
                if (i14 == 5) {
                    zzed zzedVar2 = (zzed) zzekVarZzd;
                    zzedVar2.zzg(zzcp.zzb(bArr, i10));
                    while (true) {
                        i20 = iZzj2 + 4;
                        if (i20 < i11) {
                            iZzj2 = zzcp.zzj(bArr, i20, zzcoVar);
                            if (i12 == zzcoVar.zza) {
                                zzedVar2.zzg(zzcp.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i20;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i14 == 2) {
                    zzcq zzcqVar = (zzcq) zzekVarZzd;
                    iZzj = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i26 = zzcoVar.zza + iZzj;
                    while (iZzj < i26) {
                        iZzj = zzcp.zzm(bArr, iZzj, zzcoVar);
                        zzcqVar.zze(zzcoVar.zzb != 0);
                    }
                    if (iZzj != i26) {
                        throw zzen.zzg();
                    }
                    return iZzj;
                }
                if (i14 == 0) {
                    zzcq zzcqVar2 = (zzcq) zzekVarZzd;
                    int iZzm2 = zzcp.zzm(bArr, iZzj2, zzcoVar);
                    zzcqVar2.zze(zzcoVar.zzb != 0);
                    while (iZzm2 < i11) {
                        int iZzj9 = zzcp.zzj(bArr, iZzm2, zzcoVar);
                        if (i12 != zzcoVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzcp.zzm(bArr, iZzj9, zzcoVar);
                        zzcqVar2.zze(zzcoVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i14 == 2) {
                    if ((j10 & SvgConstantsKt.SPECIFIED_CLIP_RULE) == 0) {
                        int iZzj10 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                        int i27 = zzcoVar.zza;
                        if (i27 < 0) {
                            throw zzen.zzd();
                        }
                        if (i27 == 0) {
                            zzekVarZzd.add("");
                        } else {
                            zzekVarZzd.add(new String(bArr, iZzj10, i27, zzel.zzb));
                            iZzj10 += i27;
                        }
                        while (iZzj10 < i11) {
                            int iZzj11 = zzcp.zzj(bArr, iZzj10, zzcoVar);
                            if (i12 != zzcoVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzcp.zzj(bArr, iZzj11, zzcoVar);
                            int i28 = zzcoVar.zza;
                            if (i28 < 0) {
                                throw zzen.zzd();
                            }
                            if (i28 == 0) {
                                zzekVarZzd.add("");
                            } else {
                                zzekVarZzd.add(new String(bArr, iZzj10, i28, zzel.zzb));
                                iZzj10 += i28;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i29 = zzcoVar.zza;
                    if (i29 < 0) {
                        throw zzen.zzd();
                    }
                    if (i29 == 0) {
                        zzekVarZzd.add("");
                    } else {
                        int i30 = iZzj12 + i29;
                        if (!zzhe.zzi(bArr, iZzj12, i30)) {
                            throw zzen.zzc();
                        }
                        zzekVarZzd.add(new String(bArr, iZzj12, i29, zzel.zzb));
                        iZzj12 = i30;
                    }
                    while (iZzj12 < i11) {
                        int iZzj13 = zzcp.zzj(bArr, iZzj12, zzcoVar);
                        if (i12 != zzcoVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzcp.zzj(bArr, iZzj13, zzcoVar);
                        int i31 = zzcoVar.zza;
                        if (i31 < 0) {
                            throw zzen.zzd();
                        }
                        if (i31 == 0) {
                            zzekVarZzd.add("");
                        } else {
                            int i32 = iZzj12 + i31;
                            if (!zzhe.zzi(bArr, iZzj12, i32)) {
                                throw zzen.zzc();
                            }
                            zzekVarZzd.add(new String(bArr, iZzj12, i31, zzel.zzb));
                            iZzj12 = i32;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 27:
                if (i14 == 2) {
                    return zzcp.zze(zzE(i15), i12, bArr, i10, i11, zzekVarZzd, zzcoVar);
                }
                return iZzj2;
            case 28:
                if (i14 == 2) {
                    int iZzj14 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i33 = zzcoVar.zza;
                    if (i33 < 0) {
                        throw zzen.zzd();
                    }
                    if (i33 > bArr.length - iZzj14) {
                        throw zzen.zzg();
                    }
                    if (i33 == 0) {
                        zzekVarZzd.add(zzdb.zzb);
                    } else {
                        zzekVarZzd.add(zzdb.zzr(bArr, iZzj14, i33));
                        iZzj14 += i33;
                    }
                    while (iZzj14 < i11) {
                        int iZzj15 = zzcp.zzj(bArr, iZzj14, zzcoVar);
                        if (i12 != zzcoVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzcp.zzj(bArr, iZzj15, zzcoVar);
                        int i34 = zzcoVar.zza;
                        if (i34 < 0) {
                            throw zzen.zzd();
                        }
                        if (i34 > bArr.length - iZzj14) {
                            throw zzen.zzg();
                        }
                        if (i34 == 0) {
                            zzekVarZzd.add(zzdb.zzb);
                        } else {
                            zzekVarZzd.add(zzdb.zzr(bArr, iZzj14, i34));
                            iZzj14 += i34;
                        }
                    }
                    return iZzj14;
                }
                return iZzj2;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iZzj = zzcp.zzl(i12, bArr, i10, i11, zzekVarZzd, zzcoVar);
                    }
                    return iZzj2;
                }
                iZzj = zzcp.zzf(bArr, iZzj2, zzekVarZzd, zzcoVar);
                zzec zzecVar = (zzec) obj;
                zzgq zzgqVar = zzecVar.zzc;
                if (zzgqVar == zzgq.zzc()) {
                    zzgqVar = null;
                }
                Object objZzC = zzgd.zzC(i13, zzekVarZzd, zzD(i15), zzgqVar, this.zzn);
                if (objZzC != null) {
                    zzecVar.zzc = (zzgq) objZzC;
                    return iZzj;
                }
                return iZzj;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzed zzedVar3 = (zzed) zzekVarZzd;
                    int iZzj16 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i35 = zzcoVar.zza + iZzj16;
                    while (iZzj16 < i35) {
                        iZzj16 = zzcp.zzj(bArr, iZzj16, zzcoVar);
                        zzedVar3.zzg(zzde.zzb(zzcoVar.zza));
                    }
                    if (iZzj16 == i35) {
                        return iZzj16;
                    }
                    throw zzen.zzg();
                }
                if (i14 == 0) {
                    zzed zzedVar4 = (zzed) zzekVarZzd;
                    int iZzj17 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    zzedVar4.zzg(zzde.zzb(zzcoVar.zza));
                    while (iZzj17 < i11) {
                        int iZzj18 = zzcp.zzj(bArr, iZzj17, zzcoVar);
                        if (i12 != zzcoVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzcp.zzj(bArr, iZzj18, zzcoVar);
                        zzedVar4.zzg(zzde.zzb(zzcoVar.zza));
                    }
                    return iZzj17;
                }
                return iZzj2;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzfa zzfaVar5 = (zzfa) zzekVarZzd;
                    int iZzj19 = zzcp.zzj(bArr, iZzj2, zzcoVar);
                    int i36 = zzcoVar.zza + iZzj19;
                    while (iZzj19 < i36) {
                        iZzj19 = zzcp.zzm(bArr, iZzj19, zzcoVar);
                        zzfaVar5.zzf(zzde.zzc(zzcoVar.zzb));
                    }
                    if (iZzj19 == i36) {
                        return iZzj19;
                    }
                    throw zzen.zzg();
                }
                if (i14 == 0) {
                    zzfa zzfaVar6 = (zzfa) zzekVarZzd;
                    int iZzm3 = zzcp.zzm(bArr, iZzj2, zzcoVar);
                    zzfaVar6.zzf(zzde.zzc(zzcoVar.zzb));
                    while (iZzm3 < i11) {
                        int iZzj20 = zzcp.zzj(bArr, iZzm3, zzcoVar);
                        if (i12 != zzcoVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzcp.zzm(bArr, iZzj20, zzcoVar);
                        zzfaVar6.zzf(zzde.zzc(zzcoVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i14 == 3) {
                    zzgb zzgbVarZzE = zzE(i15);
                    int i37 = (i12 & (-8)) | 4;
                    int iZzc = zzcp.zzc(zzgbVarZzE, bArr, i10, i11, i37, zzcoVar);
                    zzekVarZzd.add(zzcoVar.zzc);
                    while (iZzc < i11) {
                        int iZzj21 = zzcp.zzj(bArr, iZzc, zzcoVar);
                        if (i12 != zzcoVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzcp.zzc(zzgbVarZzE, bArr, iZzj21, i11, i37, zzcoVar);
                        zzekVarZzd.add(zzcoVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    private final int zzw(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, 0);
    }

    private final int zzx(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, i11);
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzz(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final int zzb(Object obj) {
        int i10;
        int iZzc;
        int i11;
        int iZzc2;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzB = zzB(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i10 = i12 * 53;
                    iZzc = zzel.zzc(Double.doubleToLongBits(zzgz.zza(obj, j10)));
                    i12 = iZzc + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iZzc = Float.floatToIntBits(zzgz.zzb(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iZzc = zzel.zzc(zzgz.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iZzc = zzel.zzc(zzgz.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iZzc2 = zzgz.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iZzc = zzel.zzc(zzgz.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iZzc2 = zzgz.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iZzc = zzel.zza(zzgz.zzw(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iZzc = ((String) zzgz.zzf(obj, j10)).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 9:
                    Object objZzf = zzgz.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iZzc = zzgz.zzf(obj, j10).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iZzc2 = zzgz.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iZzc2 = zzgz.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iZzc2 = zzgz.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iZzc = zzel.zzc(zzgz.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iZzc2 = zzgz.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iZzc = zzel.zzc(zzgz.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 17:
                    Object objZzf2 = zzgz.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    iZzc = zzgz.zzf(obj, j10).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iZzc = zzgz.zzf(obj, j10).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 51:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzel.zzc(Double.doubleToLongBits(zzn(obj, j10)));
                        i12 = iZzc + i10;
                    }
                    break;
                case 52:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 53:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzel.zzc(zzC(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 54:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzel.zzc(zzC(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 55:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j10);
                        i12 = i11 + iZzc2;
                    }
                    break;
                case 56:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzel.zzc(zzC(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 57:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j10);
                        i12 = i11 + iZzc2;
                    }
                    break;
                case 58:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzel.zza(zzQ(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 59:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = ((String) zzgz.zzf(obj, j10)).hashCode();
                        i12 = iZzc + i10;
                    }
                    break;
                case 60:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzgz.zzf(obj, j10).hashCode();
                        i12 = iZzc + i10;
                    }
                    break;
                case 61:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzgz.zzf(obj, j10).hashCode();
                        i12 = iZzc + i10;
                    }
                    break;
                case 62:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j10);
                        i12 = i11 + iZzc2;
                    }
                    break;
                case 63:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j10);
                        i12 = i11 + iZzc2;
                    }
                    break;
                case 64:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j10);
                        i12 = i11 + iZzc2;
                    }
                    break;
                case 65:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzel.zzc(zzC(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 66:
                    if (zzP(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j10);
                        i12 = i11 + iZzc2;
                    }
                    break;
                case 67:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzel.zzc(zzC(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 68:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzgz.zzf(obj, j10).hashCode();
                        i12 = iZzc + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzc(obj).hashCode() + (i12 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:182:0x05b2  */
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzco zzcoVar) throws IOException {
        Unsafe unsafe;
        int i13;
        Object obj2;
        zzfo<T> zzfoVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzm;
        int i18;
        int i19;
        int i20;
        boolean z10;
        zzco zzcoVar2;
        Object objValueOf;
        Object objZzg;
        int iOrdinal;
        Object objZze;
        long j10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z11;
        int iZzm2;
        int i26;
        int i27;
        int i28;
        char c10;
        int i29;
        int i30;
        int i31;
        zzfo<T> zzfoVar2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i32 = i11;
        int i33 = i12;
        zzco zzcoVar3 = zzcoVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i10;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -1;
        int i38 = 1048575;
        while (true) {
            Object objValueOf2 = null;
            if (iZzi < i32) {
                int i39 = iZzi + 1;
                byte b10 = bArr2[iZzi];
                if (b10 < 0) {
                    int iZzk = zzcp.zzk(b10, bArr2, i39, zzcoVar3);
                    i16 = zzcoVar3.zza;
                    i39 = iZzk;
                } else {
                    i16 = b10;
                }
                int i40 = i16 >>> 3;
                int i41 = i16 & 7;
                int iZzx = i40 > i37 ? zzfoVar2.zzx(i40, i35 / 3) : zzfoVar2.zzw(i40);
                if (iZzx == -1) {
                    i17 = i40;
                    iZzm = i39;
                    i18 = i16;
                    i19 = i36;
                    unsafe = unsafe2;
                    i12 = i33;
                    i20 = 0;
                    z10 = true;
                } else {
                    int[] iArr = zzfoVar2.zzc;
                    int i42 = iArr[iZzx + 1];
                    int iZzA = zzA(i42);
                    int i43 = i39;
                    long j11 = i42 & 1048575;
                    int i44 = i16;
                    if (iZzA <= 17) {
                        int i45 = iArr[iZzx + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i38) {
                            if (i38 != 1048575) {
                                obj3 = obj;
                                j10 = j11;
                                unsafe2.putInt(obj3, i38, i36);
                            } else {
                                obj3 = obj;
                                j10 = j11;
                            }
                            i21 = i47;
                            i22 = unsafe2.getInt(obj3, i47);
                        } else {
                            obj3 = obj;
                            i42 = i42;
                            j10 = j11;
                            i21 = i38;
                            i22 = i36;
                        }
                        switch (iZzA) {
                            case 0:
                                i17 = i40;
                                long j12 = j10;
                                i24 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                z11 = true;
                                bArr2 = bArr;
                                if (i41 == 1) {
                                    zzgz.zzo(obj3, j12, Double.longBitsToDouble(zzcp.zzo(bArr2, i24)));
                                    iZzi = i24 + 8;
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i11;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 1:
                                i17 = i40;
                                long j13 = j10;
                                i24 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i41 == 5) {
                                    zzgz.zzp(obj3, j13, Float.intBitsToFloat(zzcp.zzb(bArr2, i24)));
                                    iZzi = i24 + 4;
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i11;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    z11 = true;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 2:
                            case 3:
                                i17 = i40;
                                long j14 = j10;
                                i24 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i41 == 0) {
                                    iZzm2 = zzcp.zzm(bArr2, i24, zzcoVar3);
                                    unsafe2.putLong(obj, j14, zzcoVar3.zzb);
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i11;
                                    i34 = i23;
                                    iZzi = iZzm2;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    z11 = true;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 4:
                            case 11:
                                i17 = i40;
                                long j15 = j10;
                                i24 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i41 == 0) {
                                    iZzi = zzcp.zzj(bArr2, i24, zzcoVar3);
                                    unsafe2.putInt(obj3, j15, zzcoVar3.zza);
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i11;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    z11 = true;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 5:
                            case 14:
                                i17 = i40;
                                long j16 = j10;
                                i25 = iZzx;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i41 == 1) {
                                    i24 = i43;
                                    unsafe2.putLong(obj, j16, zzcp.zzo(bArr2, i43));
                                    iZzi = i24 + 8;
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i11;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    i24 = i43;
                                    z11 = true;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 6:
                            case 13:
                                i17 = i40;
                                long j17 = j10;
                                i26 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i41 == 5) {
                                    unsafe2.putInt(obj3, j17, zzcp.zzb(bArr2, i26));
                                    iZzi = i26 + 4;
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i11;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    i24 = i26;
                                    z11 = true;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 7:
                                i27 = i11;
                                i17 = i40;
                                long j18 = j10;
                                i26 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i41 == 0) {
                                    iZzi = zzcp.zzm(bArr2, i26, zzcoVar3);
                                    zzgz.zzm(obj3, j18, zzcoVar3.zzb != 0);
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i27;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    i24 = i26;
                                    z11 = true;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 8:
                                i27 = i11;
                                i17 = i40;
                                long j19 = j10;
                                i26 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i41 == 2) {
                                    iZzi = (536870912 & i42) == 0 ? zzcp.zzg(bArr2, i26, zzcoVar3) : zzcp.zzh(bArr2, i26, zzcoVar3);
                                    unsafe2.putObject(obj3, j19, zzcoVar3.zzc);
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i27;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    i24 = i26;
                                    z11 = true;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 9:
                                i17 = i40;
                                long j20 = j10;
                                i26 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                bArr2 = bArr;
                                if (i41 == 2) {
                                    i27 = i11;
                                    iZzi = zzcp.zzd(zzfoVar2.zzE(i25), bArr2, i26, i27, zzcoVar3);
                                    if ((i22 & i46) == 0) {
                                        unsafe2.putObject(obj3, j20, zzcoVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j20, zzel.zzg(unsafe2.getObject(obj3, j20), zzcoVar3.zzc));
                                    }
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i27;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    i24 = i26;
                                    z11 = true;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 10:
                                i17 = i40;
                                long j21 = j10;
                                i28 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                c10 = CharCompanionObject.MAX_VALUE;
                                bArr2 = bArr;
                                if (i41 == 2) {
                                    iZzi = zzcp.zza(bArr2, i28, zzcoVar3);
                                    unsafe2.putObject(obj3, j21, zzcoVar3.zzc);
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i11;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    z11 = true;
                                    i24 = i28;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 12:
                                i17 = i40;
                                long j22 = j10;
                                i28 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                c10 = CharCompanionObject.MAX_VALUE;
                                bArr2 = bArr;
                                if (i41 == 0) {
                                    iZzi = zzcp.zzj(bArr2, i28, zzcoVar3);
                                    int i48 = zzcoVar3.zza;
                                    zzeg zzegVarZzD = zzfoVar2.zzD(i25);
                                    if (zzegVarZzD == null || zzegVarZzD.zza(i48)) {
                                        unsafe2.putInt(obj3, j22, i48);
                                        i36 = i22 | i46;
                                        i37 = i17;
                                        i32 = i11;
                                    } else {
                                        zzd(obj).zzh(i23, Long.valueOf(i48));
                                        i37 = i17;
                                        i32 = i11;
                                        i36 = i22;
                                    }
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    z11 = true;
                                    i24 = i28;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 15:
                                i17 = i40;
                                long j23 = j10;
                                i28 = i43;
                                i25 = iZzx;
                                i23 = i44;
                                c10 = CharCompanionObject.MAX_VALUE;
                                bArr2 = bArr;
                                if (i41 == 0) {
                                    iZzi = zzcp.zzj(bArr2, i28, zzcoVar3);
                                    unsafe2.putInt(obj3, j23, zzde.zzb(zzcoVar3.zza));
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i11;
                                    i34 = i23;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    z11 = true;
                                    i24 = i28;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            case 16:
                                i17 = i40;
                                i28 = i43;
                                i23 = i44;
                                c10 = CharCompanionObject.MAX_VALUE;
                                if (i41 == 0) {
                                    bArr2 = bArr;
                                    iZzm2 = zzcp.zzm(bArr2, i28, zzcoVar3);
                                    i25 = iZzx;
                                    unsafe2.putLong(obj, j10, zzde.zzc(zzcoVar3.zzb));
                                    i36 = i22 | i46;
                                    i37 = i17;
                                    i32 = i11;
                                    i34 = i23;
                                    iZzi = iZzm2;
                                    i35 = i25;
                                    i38 = i21;
                                    i33 = i12;
                                } else {
                                    i25 = iZzx;
                                    z11 = true;
                                    i24 = i28;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                            default:
                                if (i41 == 3) {
                                    iZzi = zzcp.zzc(zzfoVar2.zzE(iZzx), bArr, i43, i11, (i40 << 3) | 4, zzcoVar);
                                    if ((i22 & i46) == 0) {
                                        unsafe2.putObject(obj3, j10, zzcoVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j10, zzel.zzg(unsafe2.getObject(obj3, j10), zzcoVar3.zzc));
                                    }
                                    i36 = i22 | i46;
                                    bArr2 = bArr;
                                    i37 = i40;
                                    i32 = i11;
                                    i33 = i12;
                                    i34 = i44;
                                    i35 = iZzx;
                                    i38 = i21;
                                } else {
                                    i17 = i40;
                                    i23 = i44;
                                    i24 = i43;
                                    i25 = iZzx;
                                    z11 = true;
                                    z10 = z11;
                                    i19 = i22;
                                    i18 = i23;
                                    unsafe = unsafe2;
                                    i20 = i25;
                                    iZzm = i24;
                                    i38 = i21;
                                    i12 = i12;
                                }
                                break;
                        }
                    } else {
                        i17 = i40;
                        obj3 = obj;
                        if (iZzA != 27) {
                            i19 = i36;
                            i29 = i38;
                            if (iZzA <= 49) {
                                z10 = true;
                                unsafe = unsafe2;
                                i20 = iZzx;
                                i31 = i44;
                                iZzi = zzv(obj, bArr, i43, i11, i44, i17, i41, iZzx, i42, iZzA, j11, zzcoVar);
                                if (iZzi != i43) {
                                    zzfoVar2 = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i37 = i17;
                                    i32 = i11;
                                    i33 = i12;
                                    zzcoVar3 = zzcoVar;
                                    i35 = i20;
                                    i36 = i19;
                                    i34 = i31;
                                    i38 = i29;
                                    unsafe2 = unsafe;
                                } else {
                                    iZzm = iZzi;
                                    i18 = i31;
                                    i38 = i29;
                                }
                            } else {
                                i30 = i43;
                                i31 = i44;
                                unsafe = unsafe2;
                                i20 = iZzx;
                                z10 = true;
                                if (iZzA != 50) {
                                    iZzi = zzt(obj, bArr, i30, i11, i31, i17, i41, i42, iZzA, j11, i20, zzcoVar);
                                    if (iZzi != i30) {
                                        zzfoVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i37 = i17;
                                        i32 = i11;
                                        i33 = i12;
                                        zzcoVar3 = zzcoVar;
                                        i35 = i20;
                                        i36 = i19;
                                        i34 = i31;
                                        i38 = i29;
                                        unsafe2 = unsafe;
                                    } else {
                                        iZzm = iZzi;
                                        i18 = i31;
                                        i38 = i29;
                                    }
                                } else if (i41 == 2) {
                                    iZzi = zzs(obj, bArr, i30, i11, i20, j11, zzcoVar);
                                    if (iZzi != i30) {
                                        zzfoVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i37 = i17;
                                        i32 = i11;
                                        i33 = i12;
                                        zzcoVar3 = zzcoVar;
                                        i35 = i20;
                                        i36 = i19;
                                        i34 = i31;
                                        i38 = i29;
                                        unsafe2 = unsafe;
                                    } else {
                                        iZzm = iZzi;
                                        i18 = i31;
                                        i38 = i29;
                                    }
                                }
                            }
                        } else if (i41 == 2) {
                            zzek zzekVarZzd = (zzek) unsafe2.getObject(obj3, j11);
                            if (!zzekVarZzd.zzc()) {
                                int size = zzekVarZzd.size();
                                zzekVarZzd = zzekVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j11, zzekVarZzd);
                            }
                            zzek zzekVar = zzekVarZzd;
                            i34 = i44;
                            i21 = i38;
                            iZzi = zzcp.zze(zzfoVar2.zzE(iZzx), i34, bArr, i43, i11, zzekVar, zzcoVar);
                            i37 = i17;
                            i32 = i11;
                            i35 = iZzx;
                            i36 = i36;
                            i38 = i21;
                            i33 = i12;
                        } else {
                            i19 = i36;
                            i29 = i38;
                            i30 = i43;
                            i31 = i44;
                            unsafe = unsafe2;
                            i20 = iZzx;
                            z10 = true;
                        }
                        iZzm = i30;
                        i18 = i31;
                        i38 = i29;
                    }
                }
                if (i18 != i12 || i12 == 0) {
                    if (this.zzh) {
                        zzcoVar2 = zzcoVar;
                        if (zzcoVar2.zzd != zzdn.zza()) {
                            i17 = i17;
                            zzea zzeaVarZzb = zzcoVar2.zzd.zzb(this.zzg, i17);
                            if (zzeaVarZzb != null) {
                                obj = obj;
                                zzdy zzdyVar = (zzdy) obj;
                                zzdyVar.zzc();
                                zzds zzdsVar = zzdyVar.zza;
                                zzhf zzhfVar = zzeaVarZzb.zzd.zzb;
                                if (zzhfVar == zzhf.zzn) {
                                    zzcp.zzj(bArr, iZzm, zzcoVar2);
                                    throw null;
                                }
                                switch (zzhfVar.ordinal()) {
                                    case 0:
                                        bArr = bArr;
                                        objValueOf = Double.valueOf(Double.longBitsToDouble(zzcp.zzo(bArr, iZzm)));
                                        iZzm += 8;
                                        objZzg = objValueOf;
                                        zzdz zzdzVar = zzeaVarZzb.zzd;
                                        boolean z12 = zzdzVar.zzc;
                                        iOrdinal = zzdzVar.zzb.ordinal();
                                        if ((iOrdinal != 9 || iOrdinal == 10) && (objZze = zzdsVar.zze(zzeaVarZzb.zzd)) != null) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 1:
                                        bArr = bArr;
                                        objValueOf = Float.valueOf(Float.intBitsToFloat(zzcp.zzb(bArr, iZzm)));
                                        iZzm += 4;
                                        objZzg = objValueOf;
                                        zzdz zzdzVar2 = zzeaVarZzb.zzd;
                                        boolean z13 = zzdzVar2.zzc;
                                        iOrdinal = zzdzVar2.zzb.ordinal();
                                        objZzg = iOrdinal != 9 ? zzel.zzg(objZze, objZzg) : zzel.zzg(objZze, objZzg);
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 2:
                                    case 3:
                                        bArr = bArr;
                                        i38 = i38;
                                        i11 = i11;
                                        iZzm = zzcp.zzm(bArr, iZzm, zzcoVar2);
                                        objValueOf = Long.valueOf(zzcoVar2.zzb);
                                        objZzg = objValueOf;
                                        zzdz zzdzVar3 = zzeaVarZzb.zzd;
                                        boolean z14 = zzdzVar3.zzc;
                                        iOrdinal = zzdzVar3.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 4:
                                    case 12:
                                        bArr = bArr;
                                        i38 = i38;
                                        i11 = i11;
                                        iZzm = zzcp.zzj(bArr, iZzm, zzcoVar2);
                                        objValueOf = Integer.valueOf(zzcoVar2.zza);
                                        objZzg = objValueOf;
                                        zzdz zzdzVar4 = zzeaVarZzb.zzd;
                                        boolean z15 = zzdzVar4.zzc;
                                        iOrdinal = zzdzVar4.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 5:
                                    case 15:
                                        bArr = bArr;
                                        objValueOf = Long.valueOf(zzcp.zzo(bArr, iZzm));
                                        iZzm += 8;
                                        objZzg = objValueOf;
                                        zzdz zzdzVar5 = zzeaVarZzb.zzd;
                                        boolean z16 = zzdzVar5.zzc;
                                        iOrdinal = zzdzVar5.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 6:
                                    case 14:
                                        bArr = bArr;
                                        objValueOf = Integer.valueOf(zzcp.zzb(bArr, iZzm));
                                        iZzm += 4;
                                        objZzg = objValueOf;
                                        zzdz zzdzVar6 = zzeaVarZzb.zzd;
                                        boolean z17 = zzdzVar6.zzc;
                                        iOrdinal = zzdzVar6.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 7:
                                        bArr = bArr;
                                        i38 = i38;
                                        i11 = i11;
                                        iZzm = zzcp.zzm(bArr, iZzm, zzcoVar2);
                                        if (zzcoVar2.zzb == 0) {
                                            z10 = false;
                                        }
                                        objValueOf = Boolean.valueOf(z10);
                                        objZzg = objValueOf;
                                        zzdz zzdzVar7 = zzeaVarZzb.zzd;
                                        boolean z18 = zzdzVar7.zzc;
                                        iOrdinal = zzdzVar7.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 8:
                                        bArr = bArr;
                                        i38 = i38;
                                        i11 = i11;
                                        iZzm = zzcp.zzg(bArr, iZzm, zzcoVar2);
                                        objZzg = zzcoVar2.zzc;
                                        zzdz zzdzVar8 = zzeaVarZzb.zzd;
                                        boolean z19 = zzdzVar8.zzc;
                                        iOrdinal = zzdzVar8.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 9:
                                        bArr = bArr;
                                        i38 = i38;
                                        i11 = i11;
                                        iZzm = zzcp.zzc(zzfu.zza().zzb(zzeaVarZzb.zzc.getClass()), bArr, iZzm, i11, (i17 << 3) | 4, zzcoVar);
                                        objZzg = zzcoVar2.zzc;
                                        zzdz zzdzVar9 = zzeaVarZzb.zzd;
                                        boolean z110 = zzdzVar9.zzc;
                                        iOrdinal = zzdzVar9.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 10:
                                        bArr = bArr;
                                        iZzm = zzcp.zzd(zzfu.zza().zzb(zzeaVarZzb.zzc.getClass()), bArr, iZzm, i11, zzcoVar2);
                                        objZzg = zzcoVar2.zzc;
                                        i38 = i38;
                                        i11 = i11;
                                        zzdz zzdzVar10 = zzeaVarZzb.zzd;
                                        boolean z111 = zzdzVar10.zzc;
                                        iOrdinal = zzdzVar10.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 11:
                                        bArr = bArr;
                                        iZzm = zzcp.zza(bArr, iZzm, zzcoVar2);
                                        objZzg = zzcoVar2.zzc;
                                        i11 = i11;
                                        zzdz zzdzVar11 = zzeaVarZzb.zzd;
                                        boolean z112 = zzdzVar11.zzc;
                                        iOrdinal = zzdzVar11.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 13:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case 16:
                                        bArr = bArr;
                                        iZzm = zzcp.zzj(bArr, iZzm, zzcoVar2);
                                        objValueOf2 = Integer.valueOf(zzde.zzb(zzcoVar2.zza));
                                        objZzg = objValueOf2;
                                        i11 = i11;
                                        zzdz zzdzVar12 = zzeaVarZzb.zzd;
                                        boolean z113 = zzdzVar12.zzc;
                                        iOrdinal = zzdzVar12.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    case 17:
                                        bArr = bArr;
                                        iZzm = zzcp.zzm(bArr, iZzm, zzcoVar2);
                                        objValueOf2 = Long.valueOf(zzde.zzc(zzcoVar2.zzb));
                                        objZzg = objValueOf2;
                                        i11 = i11;
                                        zzdz zzdzVar13 = zzeaVarZzb.zzd;
                                        boolean z114 = zzdzVar13.zzc;
                                        iOrdinal = zzdzVar13.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                    default:
                                        bArr = bArr;
                                        objZzg = objValueOf2;
                                        i11 = i11;
                                        zzdz zzdzVar14 = zzeaVarZzb.zzd;
                                        boolean z115 = zzdzVar14.zzc;
                                        iOrdinal = zzdzVar14.zzb.ordinal();
                                        if (iOrdinal != 9) {
                                        }
                                        zzdsVar.zzi(zzeaVarZzb.zzd, objZzg);
                                        iZzi = iZzm;
                                        break;
                                }
                            } else {
                                iZzi = zzcp.zzi(i18, bArr, iZzm, i11, zzd(obj), zzcoVar);
                                obj = obj;
                                bArr = bArr;
                                i38 = i38;
                                i11 = i11;
                            }
                        }
                        i34 = i18;
                        i37 = i17;
                        obj3 = obj;
                        bArr2 = bArr;
                        i35 = i20;
                        i36 = i19;
                        i32 = i11;
                        i33 = i12;
                        zzfoVar2 = this;
                        zzcoVar3 = zzcoVar2;
                        unsafe2 = unsafe;
                        i38 = i38;
                    } else {
                        zzcoVar2 = zzcoVar;
                    }
                    i38 = i38;
                    i11 = i11;
                    iZzi = zzcp.zzi(i18, bArr, iZzm, i11, zzd(obj), zzcoVar);
                    i34 = i18;
                    i37 = i17;
                    obj3 = obj;
                    bArr2 = bArr;
                    i35 = i20;
                    i36 = i19;
                    i32 = i11;
                    i33 = i12;
                    zzfoVar2 = this;
                    zzcoVar3 = zzcoVar2;
                    unsafe2 = unsafe;
                    i38 = i38;
                } else {
                    zzfoVar = this;
                    obj2 = obj;
                    iZzi = iZzm;
                    i14 = i38;
                    i34 = i18;
                    i36 = i19;
                    i15 = 1048575;
                    i13 = i11;
                }
            } else {
                int i49 = i38;
                unsafe = unsafe2;
                i12 = i33;
                i13 = i32;
                obj2 = obj3;
                zzfoVar = zzfoVar2;
                i14 = i49;
                i15 = 1048575;
            }
        }
        if (i14 != i15) {
            unsafe.putInt(obj2, i14, i36);
        }
        for (int i50 = zzfoVar.zzk; i50 < zzfoVar.zzl; i50++) {
            int i51 = zzfoVar.zzj[i50];
            int i52 = zzfoVar.zzc[i51];
            Object objZzf = zzgz.zzf(obj2, zzfoVar.zzB(i51) & i15);
            if (objZzf != null && zzfoVar.zzD(i51) != null) {
                throw null;
            }
        }
        if (i12 == 0) {
            if (iZzi != i13) {
                throw zzen.zze();
            }
        } else if (iZzi > i13 || i34 != i12) {
            throw zzen.zze();
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final Object zze() {
        return ((zzec) this.zzg).zzg(4, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long jZzB = zzB(this.zzj[i11]) & 1048575;
            Object objZzf = zzgz.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzff) objZzf).zzc();
                zzgz.zzs(obj, jZzB, objZzf);
            }
            i11++;
        }
        int length = this.zzj.length;
        while (i10 < length) {
            this.zzm.zza(obj, this.zzj[i10]);
            i10++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = 1048575 & iZzB;
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzM(obj2, i10)) {
                        zzgz.zzo(obj, j10, zzgz.zza(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 1:
                    if (zzM(obj2, i10)) {
                        zzgz.zzp(obj, j10, zzgz.zzb(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 2:
                    if (zzM(obj2, i10)) {
                        zzgz.zzr(obj, j10, zzgz.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 3:
                    if (zzM(obj2, i10)) {
                        zzgz.zzr(obj, j10, zzgz.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 4:
                    if (zzM(obj2, i10)) {
                        zzgz.zzq(obj, j10, zzgz.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 5:
                    if (zzM(obj2, i10)) {
                        zzgz.zzr(obj, j10, zzgz.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 6:
                    if (zzM(obj2, i10)) {
                        zzgz.zzq(obj, j10, zzgz.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 7:
                    if (zzM(obj2, i10)) {
                        zzgz.zzm(obj, j10, zzgz.zzw(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 8:
                    if (zzM(obj2, i10)) {
                        zzgz.zzs(obj, j10, zzgz.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzM(obj2, i10)) {
                        zzgz.zzs(obj, j10, zzgz.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 11:
                    if (zzM(obj2, i10)) {
                        zzgz.zzq(obj, j10, zzgz.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 12:
                    if (zzM(obj2, i10)) {
                        zzgz.zzq(obj, j10, zzgz.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 13:
                    if (zzM(obj2, i10)) {
                        zzgz.zzq(obj, j10, zzgz.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 14:
                    if (zzM(obj2, i10)) {
                        zzgz.zzr(obj, j10, zzgz.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 15:
                    if (zzM(obj2, i10)) {
                        zzgz.zzq(obj, j10, zzgz.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 16:
                    if (zzM(obj2, i10)) {
                        zzgz.zzr(obj, j10, zzgz.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 17:
                    zzH(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzgd.zzI(this.zzq, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzP(obj2, i11, i10)) {
                        zzgz.zzs(obj, j10, zzgz.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzP(obj2, i11, i10)) {
                        zzgz.zzs(obj, j10, zzgz.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzgd.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzgd.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzco zzcoVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i10, i11, zzcoVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zzcoVar);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final boolean zzi(Object obj, Object obj2) {
        boolean zZzH;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzgz.zza(obj, j10)) != Double.doubleToLongBits(zzgz.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzgz.zzb(obj, j10)) != Float.floatToIntBits(zzgz.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzgz.zzd(obj, j10) != zzgz.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzgz.zzd(obj, j10) != zzgz.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzgz.zzc(obj, j10) != zzgz.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzgz.zzd(obj, j10) != zzgz.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzgz.zzc(obj, j10) != zzgz.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzgz.zzw(obj, j10) != zzgz.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzgd.zzH(zzgz.zzf(obj, j10), zzgz.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzgd.zzH(zzgz.zzf(obj, j10), zzgz.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzgd.zzH(zzgz.zzf(obj, j10), zzgz.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzgz.zzc(obj, j10) != zzgz.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzgz.zzc(obj, j10) != zzgz.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzgz.zzc(obj, j10) != zzgz.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzgz.zzd(obj, j10) != zzgz.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzgz.zzc(obj, j10) != zzgz.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzgz.zzd(obj, j10) != zzgz.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzgd.zzH(zzgz.zzf(obj, j10), zzgz.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzH = zzgd.zzH(zzgz.zzf(obj, j10), zzgz.zzf(obj2, j10));
                    break;
                case 50:
                    zZzH = zzgd.zzH(zzgz.zzf(obj, j10), zzgz.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzy = zzy(i10) & 1048575;
                    if (zzgz.zzc(obj, jZzy) != zzgz.zzc(obj2, jZzy) || !zzgd.zzH(zzgz.zzf(obj, j10), zzgz.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzH) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final boolean zzj(Object obj) {
        int i10;
        int i11;
        List list;
        zzgb zzgbVarZzE;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzk) {
            int i16 = this.zzj[i15];
            int i17 = this.zzc[i16];
            int iZzB = zzB(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = zzb.getInt(obj, i19);
                }
                i11 = i14;
                i10 = i19;
            } else {
                i10 = i13;
                i11 = i14;
            }
            if ((268435456 & iZzB) != 0 && !zzN(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzN(obj, i16, i10, i11, i20) && !zzO(obj, iZzB, zzE(i16))) {
                    return false;
                }
            } else if (iZzA == 27) {
                list = (List) zzgz.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgbVarZzE = zzE(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzgbVarZzE.zzj(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzP(obj, i17, i16) && !zzO(obj, iZzB, zzE(i16))) {
                    return false;
                }
            } else if (iZzA == 49) {
                list = (List) zzgz.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    zzgbVarZzE = zzE(i16);
                    while (i12 < list.size()) {
                        if (!zzgbVarZzE.zzj(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzA == 50 && !((zzff) zzgz.zzf(obj, iZzB & 1048575)).isEmpty()) {
                throw null;
            }
            i15++;
            i13 = i10;
            i14 = i11;
        }
        return !this.zzh || this.zzo.zzb(obj).zzk();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzm(Object obj, zzdj zzdjVar) throws IOException {
        Iterator itZzf;
        Map.Entry entry;
        if (!this.zzi) {
            zzR(obj, zzdjVar);
            return;
        }
        if (this.zzh) {
            zzds zzdsVarZzb = this.zzo.zzb(obj);
            if (zzdsVarZzb.zza.isEmpty()) {
                itZzf = null;
                entry = null;
            } else {
                itZzf = zzdsVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
            }
        } else {
            itZzf = null;
            entry = null;
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            int i11 = this.zzc[i10];
            while (entry != null && this.zzo.zza(entry) <= i11) {
                this.zzo.zzg(zzdjVar, entry);
                entry = itZzf.hasNext() ? (Map.Entry) itZzf.next() : null;
            }
            switch (zzA(iZzB)) {
                case 0:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzf(i11, zzgz.zza(obj, iZzB & 1048575));
                    }
                    break;
                case 1:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzo(i11, zzgz.zzb(obj, iZzB & 1048575));
                    }
                    break;
                case 2:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzt(i11, zzgz.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 3:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzK(i11, zzgz.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 4:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzr(i11, zzgz.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 5:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzm(i11, zzgz.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 6:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzk(i11, zzgz.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 7:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzb(i11, zzgz.zzw(obj, iZzB & 1048575));
                    }
                    break;
                case 8:
                    if (zzM(obj, i10)) {
                        zzT(i11, zzgz.zzf(obj, iZzB & 1048575), zzdjVar);
                    }
                    break;
                case 9:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzv(i11, zzgz.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 10:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzd(i11, (zzdb) zzgz.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzI(i11, zzgz.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 12:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzi(i11, zzgz.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 13:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzx(i11, zzgz.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 14:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzz(i11, zzgz.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 15:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzB(i11, zzgz.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 16:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzD(i11, zzgz.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 17:
                    if (zzM(obj, i10)) {
                        zzdjVar.zzq(i11, zzgz.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 18:
                    zzgd.zzL(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 19:
                    zzgd.zzP(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 20:
                    zzgd.zzS(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 21:
                    zzgd.zzaa(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 22:
                    zzgd.zzR(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 23:
                    zzgd.zzO(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 24:
                    zzgd.zzN(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 25:
                    zzgd.zzJ(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 26:
                    zzgd.zzY(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar);
                    break;
                case 27:
                    zzgd.zzT(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, zzE(i10));
                    break;
                case 28:
                    zzgd.zzK(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar);
                    break;
                case 29:
                    zzgd.zzZ(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 30:
                    zzgd.zzM(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 31:
                    zzgd.zzU(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 32:
                    zzgd.zzV(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 33:
                    zzgd.zzW(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 34:
                    zzgd.zzX(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, false);
                    break;
                case 35:
                    zzgd.zzL(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 36:
                    zzgd.zzP(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 37:
                    zzgd.zzS(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 38:
                    zzgd.zzaa(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 39:
                    zzgd.zzR(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 40:
                    zzgd.zzO(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 41:
                    zzgd.zzN(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 42:
                    zzgd.zzJ(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 43:
                    zzgd.zzZ(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 44:
                    zzgd.zzM(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 45:
                    zzgd.zzU(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 46:
                    zzgd.zzV(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 47:
                    zzgd.zzW(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 48:
                    zzgd.zzX(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, true);
                    break;
                case 49:
                    zzgd.zzQ(this.zzc[i10], (List) zzgz.zzf(obj, iZzB & 1048575), zzdjVar, zzE(i10));
                    break;
                case 50:
                    zzS(zzdjVar, i11, zzgz.zzf(obj, iZzB & 1048575), i10);
                    break;
                case 51:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzf(i11, zzn(obj, iZzB & 1048575));
                    }
                    break;
                case 52:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzo(i11, zzo(obj, iZzB & 1048575));
                    }
                    break;
                case 53:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzt(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 54:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzK(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 55:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzr(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 56:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzm(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 57:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzk(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 58:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzb(i11, zzQ(obj, iZzB & 1048575));
                    }
                    break;
                case 59:
                    if (zzP(obj, i11, i10)) {
                        zzT(i11, zzgz.zzf(obj, iZzB & 1048575), zzdjVar);
                    }
                    break;
                case 60:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzv(i11, zzgz.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 61:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzd(i11, (zzdb) zzgz.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 62:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzI(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 63:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzi(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 64:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzx(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 65:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzz(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 66:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzB(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 67:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzD(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 68:
                    if (zzP(obj, i11, i10)) {
                        zzdjVar.zzq(i11, zzgz.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.zzo.zzg(zzdjVar, entry);
            entry = itZzf.hasNext() ? (Map.Entry) itZzf.next() : null;
        }
        zzgp zzgpVar = this.zzn;
        zzgpVar.zzj(zzgpVar.zzc(obj), zzdjVar);
    }
}
