package com.google.android.gms.internal.measurement;

import ad.d;
import ad.e;
import androidx.appcompat.widget.c;
import androidx.collection.k;
import c2.b;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlf<T> implements zzln<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzml.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkq zzm;
    private final zzmb zzn;
    private final zzjk zzo;
    private final zzlh zzp;
    private final zzkx zzq;

    private zzlf(int[] iArr, Object[] objArr, int i10, int i11, zzlc zzlcVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzlh zzlhVar, zzkq zzkqVar, zzmb zzmbVar, zzjk zzjkVar, zzkx zzkxVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzjkVar != null && zzjkVar.zzc(zzlcVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzlhVar;
        this.zzm = zzkqVar;
        this.zzn = zzmbVar;
        this.zzo = zzjkVar;
        this.zzg = zzlcVar;
        this.zzq = zzkxVar;
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzC(Object obj, long j10) {
        return ((Long) zzml.zzf(obj, j10)).longValue();
    }

    private final zzkb zzD(int i10) {
        int i11 = i10 / 3;
        return (zzkb) this.zzd[i11 + i11 + 1];
    }

    private final zzln zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzln zzlnVar = (zzln) this.zzd[i12];
        if (zzlnVar != null) {
            return zzlnVar;
        }
        zzln zzlnVarZzb = zzlk.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzlnVarZzb;
        return zzlnVarZzb;
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
            Object objZzf = zzml.zzf(obj, jZzB);
            Object objZzf2 = zzml.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzml.zzs(obj, jZzB, zzkf.zzg(objZzf, objZzf2));
                zzJ(obj, i10);
            } else if (objZzf2 != null) {
                zzml.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i10);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int iZzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j10 = iZzB & 1048575;
        if (zzP(obj2, i11, i10)) {
            Object objZzf = zzP(obj, i11, i10) ? zzml.zzf(obj, j10) : null;
            Object objZzf2 = zzml.zzf(obj2, j10);
            if (objZzf != null && objZzf2 != null) {
                zzml.zzs(obj, j10, zzkf.zzg(objZzf, objZzf2));
                zzK(obj, i11, i10);
            } else if (objZzf2 != null) {
                zzml.zzs(obj, j10, objZzf2);
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
        zzml.zzq(obj, j10, (1 << (iZzy >>> 20)) | zzml.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzml.zzq(obj, zzy(i11) & 1048575, i10);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzM(obj, i10) == zzM(obj2, i10);
    }

    private final boolean zzM(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = iZzy & 1048575;
        if (j10 != 1048575) {
            return (zzml.zzc(obj, j10) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i10);
        long j11 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzml.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzml.zzb(obj, j11)) != 0;
            case 2:
                return zzml.zzd(obj, j11) != 0;
            case 3:
                return zzml.zzd(obj, j11) != 0;
            case 4:
                return zzml.zzc(obj, j11) != 0;
            case 5:
                return zzml.zzd(obj, j11) != 0;
            case 6:
                return zzml.zzc(obj, j11) != 0;
            case 7:
                return zzml.zzw(obj, j11);
            case 8:
                Object objZzf = zzml.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzix) {
                    return !zzix.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzml.zzf(obj, j11) != null;
            case 10:
                return !zzix.zzb.equals(zzml.zzf(obj, j11));
            case 11:
                return zzml.zzc(obj, j11) != 0;
            case 12:
                return zzml.zzc(obj, j11) != 0;
            case 13:
                return zzml.zzc(obj, j11) != 0;
            case 14:
                return zzml.zzd(obj, j11) != 0;
            case 15:
                return zzml.zzc(obj, j11) != 0;
            case 16:
                return zzml.zzd(obj, j11) != 0;
            case 17:
                return zzml.zzf(obj, j11) != null;
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

    private static boolean zzO(Object obj, int i10, zzln zzlnVar) {
        return zzlnVar.zzj(zzml.zzf(obj, i10 & 1048575));
    }

    private final boolean zzP(Object obj, int i10, int i11) {
        return zzml.zzc(obj, (long) (zzy(i11) & 1048575)) == i10;
    }

    private static boolean zzQ(Object obj, long j10) {
        return ((Boolean) zzml.zzf(obj, j10)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzR(Object obj, zzjf zzjfVar) throws IOException {
        int i10;
        boolean z10;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iZzB = zzB(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iZzB & i11;
            switch (iZzA) {
                case 0:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzf(i15, zzml.zza(obj, j10));
                    }
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzo(i15, zzml.zzb(obj, j10));
                    }
                    break;
                case 2:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzt(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzJ(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzr(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzm(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzk(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzb(i15, zzml.zzw(obj, j10));
                    }
                    break;
                case 8:
                    if ((i14 & i10) != 0) {
                        zzT(i15, unsafe.getObject(obj, j10), zzjfVar);
                    }
                    break;
                case 9:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 10:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzd(i15, (zzix) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzH(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzi(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzw(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzy(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzA(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzC(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    if ((i14 & i10) != 0) {
                        zzjfVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 18:
                    zzlp.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 19:
                    zzlp.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 20:
                    zzlp.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 21:
                    zzlp.zzaa(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 22:
                    zzlp.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 23:
                    zzlp.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 24:
                    zzlp.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 25:
                    zzlp.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 26:
                    zzlp.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar);
                    break;
                case 27:
                    zzlp.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, zzE(i13));
                    break;
                case 28:
                    zzlp.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar);
                    break;
                case 29:
                    z10 = false;
                    zzlp.zzZ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 30:
                    z10 = false;
                    zzlp.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 31:
                    z10 = false;
                    zzlp.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 32:
                    z10 = false;
                    zzlp.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 33:
                    z10 = false;
                    zzlp.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 34:
                    z10 = false;
                    zzlp.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, false);
                    break;
                case 35:
                    zzlp.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 36:
                    zzlp.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 37:
                    zzlp.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 38:
                    zzlp.zzaa(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 39:
                    zzlp.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 40:
                    zzlp.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 41:
                    zzlp.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 42:
                    zzlp.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 43:
                    zzlp.zzZ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 44:
                    zzlp.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 45:
                    zzlp.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 46:
                    zzlp.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 47:
                    zzlp.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 48:
                    zzlp.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, true);
                    break;
                case 49:
                    zzlp.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzjfVar, zzE(i13));
                    break;
                case 50:
                    zzS(zzjfVar, i15, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzf(i15, zzn(obj, j10));
                    }
                    break;
                case 52:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzo(i15, zzo(obj, j10));
                    }
                    break;
                case 53:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzt(i15, zzC(obj, j10));
                    }
                    break;
                case 54:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzJ(i15, zzC(obj, j10));
                    }
                    break;
                case 55:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzr(i15, zzr(obj, j10));
                    }
                    break;
                case 56:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzm(i15, zzC(obj, j10));
                    }
                    break;
                case 57:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzk(i15, zzr(obj, j10));
                    }
                    break;
                case 58:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzb(i15, zzQ(obj, j10));
                    }
                    break;
                case 59:
                    if (zzP(obj, i15, i13)) {
                        zzT(i15, unsafe.getObject(obj, j10), zzjfVar);
                    }
                    break;
                case 60:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 61:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzd(i15, (zzix) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzH(i15, zzr(obj, j10));
                    }
                    break;
                case 63:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzi(i15, zzr(obj, j10));
                    }
                    break;
                case 64:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzw(i15, zzr(obj, j10));
                    }
                    break;
                case 65:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzy(i15, zzC(obj, j10));
                    }
                    break;
                case 66:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzA(i15, zzr(obj, j10));
                    }
                    break;
                case 67:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzC(i15, zzC(obj, j10));
                    }
                    break;
                case 68:
                    if (zzP(obj, i15, i13)) {
                        zzjfVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                default:
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzmb zzmbVar = this.zzn;
        zzmbVar.zzi(zzmbVar.zzc(obj), zzjfVar);
    }

    private final void zzS(zzjf zzjfVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzT(int i10, Object obj, zzjf zzjfVar) throws IOException {
        if (obj instanceof String) {
            zzjfVar.zzF(i10, (String) obj);
        } else {
            zzjfVar.zzd(i10, (zzix) obj);
        }
    }

    public static zzmc zzd(Object obj) {
        zzjx zzjxVar = (zzjx) obj;
        zzmc zzmcVar = zzjxVar.zzc;
        if (zzmcVar != zzmc.zzc()) {
            return zzmcVar;
        }
        zzmc zzmcVarZze = zzmc.zze();
        zzjxVar.zzc = zzmcVarZze;
        return zzmcVarZze;
    }

    public static zzlf zzk(Class cls, zzkz zzkzVar, zzlh zzlhVar, zzkq zzkqVar, zzmb zzmbVar, zzjk zzjkVar, zzkx zzkxVar) {
        if (zzkzVar instanceof zzlm) {
            return zzl((zzlm) zzkzVar, zzlhVar, zzkqVar, zzmbVar, zzjkVar, zzkxVar);
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
    public static zzlf zzl(zzlm zzlmVar, zzlh zzlhVar, zzkq zzkqVar, zzmb zzmbVar, zzjk zzjkVar, zzkx zzkxVar) {
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
        boolean z10 = zzlmVar.zzc() == 2;
        String strZzd = zzlmVar.zzd();
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
        Object[] objArrZze = zzlmVar.zze();
        Class<?> cls = zzlmVar.zza().getClass();
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
        return new zzlf(iArr3, objArr2, iCharAt, i13, zzlmVar.zza(), z10, false, iArr, iCharAt3, i69, zzlhVar, zzkqVar, zzmbVar, zzjkVar, zzkxVar, null);
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzml.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzml.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i10;
        int iZzA;
        int iZzB;
        int iZzB2;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        boolean z10;
        int iZzd;
        int iZzA3;
        int iZzB3;
        int iZzB4;
        int iZzA4;
        int iZzv2;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int iA = 0;
        int i14 = 0;
        while (i13 < this.zzc.length) {
            int iZzB5 = zzB(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int iZzA5 = zzA(iZzB5);
            if (iZzA5 <= 17) {
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
            long j10 = iZzB5 & i11;
            switch (iZzA5) {
                case 0:
                    if ((i14 & i10) != 0) {
                        iA = e.a(i15 << 3, 8, iA);
                    }
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        iA = e.a(i15 << 3, 4, iA);
                    }
                    break;
                case 2:
                    if ((i14 & i10) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzA = zzje.zzA(i15 << 3);
                        iZzB = zzje.zzB(j11);
                        iZzB2 = iZzB + iZzA;
                        iA += iZzB2;
                    }
                    break;
                case 3:
                    if ((i14 & i10) != 0) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzA = zzje.zzA(i15 << 3);
                        iZzB = zzje.zzB(j12);
                        iZzB2 = iZzB + iZzA;
                        iA += iZzB2;
                    }
                    break;
                case 4:
                    if ((i14 & i10) != 0) {
                        int i18 = unsafe.getInt(obj, j10);
                        iZzA2 = zzje.zzA(i15 << 3);
                        iZzv = zzje.zzv(i18);
                        iZzB2 = iZzv + iZzA2;
                        iA += iZzB2;
                    }
                    break;
                case 5:
                    if ((i14 & i10) != 0) {
                        iA = e.a(i15 << 3, 8, iA);
                    }
                    break;
                case 6:
                    if ((i14 & i10) != 0) {
                        iA = e.a(i15 << 3, 4, iA);
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        iA = e.a(i15 << 3, 1, iA);
                    }
                    break;
                case 8:
                    if ((i14 & i10) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        if (!(object instanceof zzix)) {
                            iZzA2 = zzje.zzA(i15 << 3);
                            iZzv = zzje.zzy((String) object);
                            iZzB2 = iZzv + iZzA2;
                            iA += iZzB2;
                        } else {
                            int iZzA6 = zzje.zzA(i15 << 3);
                            int iZzd2 = ((zzix) object).zzd();
                            iA = b.f(iZzd2, iZzd2, iZzA6, iA);
                        }
                    }
                    break;
                case 9:
                    if ((i14 & i10) != 0) {
                        iZzo = zzlp.zzo(i15, unsafe.getObject(obj, j10), zzE(i13));
                        iA += iZzo;
                    }
                    break;
                case 10:
                    if ((i14 & i10) != 0) {
                        zzix zzixVar = (zzix) unsafe.getObject(obj, j10);
                        int iZzA7 = zzje.zzA(i15 << 3);
                        int iZzd3 = zzixVar.zzd();
                        iA = b.f(iZzd3, iZzd3, iZzA7, iA);
                    }
                    break;
                case 11:
                    if ((i14 & i10) != 0) {
                        iA = e.a(unsafe.getInt(obj, j10), zzje.zzA(i15 << 3), iA);
                    }
                    break;
                case 12:
                    if ((i14 & i10) != 0) {
                        int i19 = unsafe.getInt(obj, j10);
                        iZzA2 = zzje.zzA(i15 << 3);
                        iZzv = zzje.zzv(i19);
                        iZzB2 = iZzv + iZzA2;
                        iA += iZzB2;
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        iA = e.a(i15 << 3, 4, iA);
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        iA = e.a(i15 << 3, 8, iA);
                    }
                    break;
                case 15:
                    if ((i14 & i10) != 0) {
                        int i20 = unsafe.getInt(obj, j10);
                        iA = e.a((i20 >> 31) ^ (i20 + i20), zzje.zzA(i15 << 3), iA);
                    }
                    break;
                case 16:
                    if ((i10 & i14) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        iZzB2 = zzje.zzB((j13 >> 63) ^ (j13 + j13)) + zzje.zzA(i15 << 3);
                        iA += iZzB2;
                    }
                    break;
                case 17:
                    if ((i14 & i10) != 0) {
                        iZzB2 = zzje.zzu(i15, (zzlc) unsafe.getObject(obj, j10), zzE(i13));
                        iA += iZzB2;
                    }
                    break;
                case 18:
                    iZzo = zzlp.zzh(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 19:
                    iZzo = zzlp.zzf(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 20:
                    iZzo = zzlp.zzm(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 21:
                    iZzo = zzlp.zzx(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 22:
                    iZzo = zzlp.zzk(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 23:
                    iZzo = zzlp.zzh(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 24:
                    iZzo = zzlp.zzf(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 25:
                    iZzo = zzlp.zza(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzo;
                    break;
                case 26:
                    iZzu = zzlp.zzu(i15, (List) unsafe.getObject(obj, j10));
                    iA += iZzu;
                    break;
                case 27:
                    iZzu = zzlp.zzp(i15, (List) unsafe.getObject(obj, j10), zzE(i13));
                    iA += iZzu;
                    break;
                case 28:
                    iZzu = zzlp.zzc(i15, (List) unsafe.getObject(obj, j10));
                    iA += iZzu;
                    break;
                case 29:
                    iZzu = zzlp.zzv(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzu;
                    break;
                case 30:
                    z10 = false;
                    iZzd = zzlp.zzd(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 31:
                    z10 = false;
                    iZzd = zzlp.zzf(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 32:
                    z10 = false;
                    iZzd = zzlp.zzh(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 33:
                    z10 = false;
                    iZzd = zzlp.zzq(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 34:
                    z10 = false;
                    iZzd = zzlp.zzs(i15, (List) unsafe.getObject(obj, j10), false);
                    iA += iZzd;
                    break;
                case 35:
                    int iZzi = zzlp.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iA = b.f(iZzi, zzje.zzz(i15), iZzi, iA);
                    }
                    break;
                case 36:
                    int iZzg = zzlp.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg > 0) {
                        iA = b.f(iZzg, zzje.zzz(i15), iZzg, iA);
                    }
                    break;
                case 37:
                    int iZzn = zzlp.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzn > 0) {
                        iA = b.f(iZzn, zzje.zzz(i15), iZzn, iA);
                    }
                    break;
                case 38:
                    int iZzy = zzlp.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzy > 0) {
                        iA = b.f(iZzy, zzje.zzz(i15), iZzy, iA);
                    }
                    break;
                case 39:
                    int iZzl = zzlp.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzl > 0) {
                        iA = b.f(iZzl, zzje.zzz(i15), iZzl, iA);
                    }
                    break;
                case 40:
                    int iZzi2 = zzlp.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi2 > 0) {
                        iA = b.f(iZzi2, zzje.zzz(i15), iZzi2, iA);
                    }
                    break;
                case 41:
                    int iZzg2 = zzlp.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg2 > 0) {
                        iA = b.f(iZzg2, zzje.zzz(i15), iZzg2, iA);
                    }
                    break;
                case 42:
                    int iZzb = zzlp.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzb > 0) {
                        iA = b.f(iZzb, zzje.zzz(i15), iZzb, iA);
                    }
                    break;
                case 43:
                    int iZzw = zzlp.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzw > 0) {
                        iA = b.f(iZzw, zzje.zzz(i15), iZzw, iA);
                    }
                    break;
                case 44:
                    int iZze = zzlp.zze((List) unsafe.getObject(obj, j10));
                    if (iZze > 0) {
                        iA = b.f(iZze, zzje.zzz(i15), iZze, iA);
                    }
                    break;
                case 45:
                    int iZzg3 = zzlp.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg3 > 0) {
                        iA = b.f(iZzg3, zzje.zzz(i15), iZzg3, iA);
                    }
                    break;
                case 46:
                    int iZzi3 = zzlp.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi3 > 0) {
                        iA = b.f(iZzi3, zzje.zzz(i15), iZzi3, iA);
                    }
                    break;
                case 47:
                    int iZzr = zzlp.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzr > 0) {
                        iA = b.f(iZzr, zzje.zzz(i15), iZzr, iA);
                    }
                    break;
                case 48:
                    int iZzt = zzlp.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzt > 0) {
                        iA = b.f(iZzt, zzje.zzz(i15), iZzt, iA);
                    }
                    break;
                case 49:
                    iZzu = zzlp.zzj(i15, (List) unsafe.getObject(obj, j10), zzE(i13));
                    iA += iZzu;
                    break;
                case 50:
                    zzkx.zza(i15, unsafe.getObject(obj, j10), zzF(i13));
                    break;
                case 51:
                    if (zzP(obj, i15, i13)) {
                        iA = e.a(i15 << 3, 8, iA);
                    }
                    break;
                case 52:
                    if (zzP(obj, i15, i13)) {
                        iA = e.a(i15 << 3, 4, iA);
                    }
                    break;
                case 53:
                    if (zzP(obj, i15, i13)) {
                        long jZzC = zzC(obj, j10);
                        iZzA3 = zzje.zzA(i15 << 3);
                        iZzB3 = zzje.zzB(jZzC);
                        iZzB4 = iZzB3 + iZzA3;
                        iA += iZzB4;
                    }
                    break;
                case 54:
                    if (zzP(obj, i15, i13)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzA3 = zzje.zzA(i15 << 3);
                        iZzB3 = zzje.zzB(jZzC2);
                        iZzB4 = iZzB3 + iZzA3;
                        iA += iZzB4;
                    }
                    break;
                case 55:
                    if (zzP(obj, i15, i13)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzA4 = zzje.zzA(i15 << 3);
                        iZzv2 = zzje.zzv(iZzr2);
                        iZzB4 = iZzv2 + iZzA4;
                        iA += iZzB4;
                    }
                    break;
                case 56:
                    if (zzP(obj, i15, i13)) {
                        iA = e.a(i15 << 3, 8, iA);
                    }
                    break;
                case 57:
                    if (zzP(obj, i15, i13)) {
                        iA = e.a(i15 << 3, 4, iA);
                    }
                    break;
                case 58:
                    if (zzP(obj, i15, i13)) {
                        iA = e.a(i15 << 3, 1, iA);
                    }
                    break;
                case 59:
                    if (zzP(obj, i15, i13)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzix) {
                            int iZzA8 = zzje.zzA(i15 << 3);
                            int iZzd4 = ((zzix) object2).zzd();
                            iA = b.f(iZzd4, iZzd4, iZzA8, iA);
                        } else {
                            iZzA4 = zzje.zzA(i15 << 3);
                            iZzv2 = zzje.zzy((String) object2);
                            iZzB4 = iZzv2 + iZzA4;
                            iA += iZzB4;
                        }
                    }
                    break;
                case 60:
                    if (zzP(obj, i15, i13)) {
                        iZzu = zzlp.zzo(i15, unsafe.getObject(obj, j10), zzE(i13));
                        iA += iZzu;
                    }
                    break;
                case 61:
                    if (zzP(obj, i15, i13)) {
                        zzix zzixVar2 = (zzix) unsafe.getObject(obj, j10);
                        int iZzA9 = zzje.zzA(i15 << 3);
                        int iZzd5 = zzixVar2.zzd();
                        iA = b.f(iZzd5, iZzd5, iZzA9, iA);
                    }
                    break;
                case 62:
                    if (zzP(obj, i15, i13)) {
                        iA = e.a(zzr(obj, j10), zzje.zzA(i15 << 3), iA);
                    }
                    break;
                case 63:
                    if (zzP(obj, i15, i13)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzA4 = zzje.zzA(i15 << 3);
                        iZzv2 = zzje.zzv(iZzr3);
                        iZzB4 = iZzv2 + iZzA4;
                        iA += iZzB4;
                    }
                    break;
                case 64:
                    if (zzP(obj, i15, i13)) {
                        iA = e.a(i15 << 3, 4, iA);
                    }
                    break;
                case 65:
                    if (zzP(obj, i15, i13)) {
                        iA = e.a(i15 << 3, 8, iA);
                    }
                    break;
                case 66:
                    if (zzP(obj, i15, i13)) {
                        int iZzr4 = zzr(obj, j10);
                        iA = e.a((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzje.zzA(i15 << 3), iA);
                    }
                    break;
                case 67:
                    if (zzP(obj, i15, i13)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzB4 = zzje.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3)) + zzje.zzA(i15 << 3);
                        iA += iZzB4;
                    }
                    break;
                case 68:
                    if (zzP(obj, i15, i13)) {
                        iZzB4 = zzje.zzu(i15, (zzlc) unsafe.getObject(obj, j10), zzE(i13));
                        iA += iZzB4;
                    }
                    break;
                default:
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzmb zzmbVar = this.zzn;
        int iZza = iA + zzmbVar.zza(zzmbVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        Unsafe unsafe = zzb;
        int iA = 0;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB2 = zzB(i10);
            int iZzA3 = zzA(iZzB2);
            int i11 = this.zzc[i10];
            long j10 = iZzB2 & 1048575;
            if (iZzA3 >= zzjp.zzJ.zza() && iZzA3 <= zzjp.zzW.zza()) {
                int i12 = this.zzc[i10 + 2];
            }
            switch (iZzA3) {
                case 0:
                    if (zzM(obj, i10)) {
                        iA = e.a(i11 << 3, 8, iA);
                    }
                    break;
                case 1:
                    if (zzM(obj, i10)) {
                        iA = e.a(i11 << 3, 4, iA);
                    }
                    break;
                case 2:
                    if (zzM(obj, i10)) {
                        long jZzd = zzml.zzd(obj, j10);
                        iZzA = zzje.zzA(i11 << 3);
                        iZzB = zzje.zzB(jZzd);
                        iZzu = iZzB + iZzA;
                        iA += iZzu;
                    }
                    break;
                case 3:
                    if (zzM(obj, i10)) {
                        long jZzd2 = zzml.zzd(obj, j10);
                        iZzA = zzje.zzA(i11 << 3);
                        iZzB = zzje.zzB(jZzd2);
                        iZzu = iZzB + iZzA;
                        iA += iZzu;
                    }
                    break;
                case 4:
                    if (zzM(obj, i10)) {
                        int iZzc = zzml.zzc(obj, j10);
                        iZzA2 = zzje.zzA(i11 << 3);
                        iZzv = zzje.zzv(iZzc);
                        iZzu = iZzv + iZzA2;
                        iA += iZzu;
                    }
                    break;
                case 5:
                    if (zzM(obj, i10)) {
                        iA = e.a(i11 << 3, 8, iA);
                    }
                    break;
                case 6:
                    if (zzM(obj, i10)) {
                        iA = e.a(i11 << 3, 4, iA);
                    }
                    break;
                case 7:
                    if (zzM(obj, i10)) {
                        iA = e.a(i11 << 3, 1, iA);
                    }
                    break;
                case 8:
                    if (zzM(obj, i10)) {
                        Object objZzf = zzml.zzf(obj, j10);
                        if (objZzf instanceof zzix) {
                            int iZzA4 = zzje.zzA(i11 << 3);
                            int iZzd = ((zzix) objZzf).zzd();
                            iA = b.f(iZzd, iZzd, iZzA4, iA);
                        } else {
                            iZzA2 = zzje.zzA(i11 << 3);
                            iZzv = zzje.zzy((String) objZzf);
                            iZzu = iZzv + iZzA2;
                            iA += iZzu;
                        }
                    }
                    break;
                case 9:
                    if (zzM(obj, i10)) {
                        iZzo = zzlp.zzo(i11, zzml.zzf(obj, j10), zzE(i10));
                        iA += iZzo;
                    }
                    break;
                case 10:
                    if (zzM(obj, i10)) {
                        zzix zzixVar = (zzix) zzml.zzf(obj, j10);
                        int iZzA5 = zzje.zzA(i11 << 3);
                        int iZzd2 = zzixVar.zzd();
                        iA = b.f(iZzd2, iZzd2, iZzA5, iA);
                    }
                    break;
                case 11:
                    if (zzM(obj, i10)) {
                        iA = e.a(zzml.zzc(obj, j10), zzje.zzA(i11 << 3), iA);
                    }
                    break;
                case 12:
                    if (zzM(obj, i10)) {
                        int iZzc2 = zzml.zzc(obj, j10);
                        iZzA2 = zzje.zzA(i11 << 3);
                        iZzv = zzje.zzv(iZzc2);
                        iZzu = iZzv + iZzA2;
                        iA += iZzu;
                    }
                    break;
                case 13:
                    if (zzM(obj, i10)) {
                        iA = e.a(i11 << 3, 4, iA);
                    }
                    break;
                case 14:
                    if (zzM(obj, i10)) {
                        iA = e.a(i11 << 3, 8, iA);
                    }
                    break;
                case 15:
                    if (zzM(obj, i10)) {
                        int iZzc3 = zzml.zzc(obj, j10);
                        iA = e.a((iZzc3 >> 31) ^ (iZzc3 + iZzc3), zzje.zzA(i11 << 3), iA);
                    }
                    break;
                case 16:
                    if (zzM(obj, i10)) {
                        long jZzd3 = zzml.zzd(obj, j10);
                        iZzA = zzje.zzA(i11 << 3);
                        iZzB = zzje.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        iZzu = iZzB + iZzA;
                        iA += iZzu;
                    }
                    break;
                case 17:
                    if (zzM(obj, i10)) {
                        iZzu = zzje.zzu(i11, (zzlc) zzml.zzf(obj, j10), zzE(i10));
                        iA += iZzu;
                    }
                    break;
                case 18:
                    iZzo = zzlp.zzh(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 19:
                    iZzo = zzlp.zzf(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 20:
                    iZzo = zzlp.zzm(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 21:
                    iZzo = zzlp.zzx(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 22:
                    iZzo = zzlp.zzk(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 23:
                    iZzo = zzlp.zzh(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 24:
                    iZzo = zzlp.zzf(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 25:
                    iZzo = zzlp.zza(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 26:
                    iZzo = zzlp.zzu(i11, (List) zzml.zzf(obj, j10));
                    iA += iZzo;
                    break;
                case 27:
                    iZzo = zzlp.zzp(i11, (List) zzml.zzf(obj, j10), zzE(i10));
                    iA += iZzo;
                    break;
                case 28:
                    iZzo = zzlp.zzc(i11, (List) zzml.zzf(obj, j10));
                    iA += iZzo;
                    break;
                case 29:
                    iZzo = zzlp.zzv(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 30:
                    iZzo = zzlp.zzd(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 31:
                    iZzo = zzlp.zzf(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 32:
                    iZzo = zzlp.zzh(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 33:
                    iZzo = zzlp.zzq(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 34:
                    iZzo = zzlp.zzs(i11, (List) zzml.zzf(obj, j10), false);
                    iA += iZzo;
                    break;
                case 35:
                    int iZzi = zzlp.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iA = b.f(iZzi, zzje.zzz(i11), iZzi, iA);
                    }
                    break;
                case 36:
                    int iZzg = zzlp.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg > 0) {
                        iA = b.f(iZzg, zzje.zzz(i11), iZzg, iA);
                    }
                    break;
                case 37:
                    int iZzn = zzlp.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzn > 0) {
                        iA = b.f(iZzn, zzje.zzz(i11), iZzn, iA);
                    }
                    break;
                case 38:
                    int iZzy = zzlp.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzy > 0) {
                        iA = b.f(iZzy, zzje.zzz(i11), iZzy, iA);
                    }
                    break;
                case 39:
                    int iZzl = zzlp.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzl > 0) {
                        iA = b.f(iZzl, zzje.zzz(i11), iZzl, iA);
                    }
                    break;
                case 40:
                    int iZzi2 = zzlp.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi2 > 0) {
                        iA = b.f(iZzi2, zzje.zzz(i11), iZzi2, iA);
                    }
                    break;
                case 41:
                    int iZzg2 = zzlp.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg2 > 0) {
                        iA = b.f(iZzg2, zzje.zzz(i11), iZzg2, iA);
                    }
                    break;
                case 42:
                    int iZzb = zzlp.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzb > 0) {
                        iA = b.f(iZzb, zzje.zzz(i11), iZzb, iA);
                    }
                    break;
                case 43:
                    int iZzw = zzlp.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzw > 0) {
                        iA = b.f(iZzw, zzje.zzz(i11), iZzw, iA);
                    }
                    break;
                case 44:
                    int iZze = zzlp.zze((List) unsafe.getObject(obj, j10));
                    if (iZze > 0) {
                        iA = b.f(iZze, zzje.zzz(i11), iZze, iA);
                    }
                    break;
                case 45:
                    int iZzg3 = zzlp.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzg3 > 0) {
                        iA = b.f(iZzg3, zzje.zzz(i11), iZzg3, iA);
                    }
                    break;
                case 46:
                    int iZzi3 = zzlp.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi3 > 0) {
                        iA = b.f(iZzi3, zzje.zzz(i11), iZzi3, iA);
                    }
                    break;
                case 47:
                    int iZzr = zzlp.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzr > 0) {
                        iA = b.f(iZzr, zzje.zzz(i11), iZzr, iA);
                    }
                    break;
                case 48:
                    int iZzt = zzlp.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzt > 0) {
                        iA = b.f(iZzt, zzje.zzz(i11), iZzt, iA);
                    }
                    break;
                case 49:
                    iZzo = zzlp.zzj(i11, (List) zzml.zzf(obj, j10), zzE(i10));
                    iA += iZzo;
                    break;
                case 50:
                    zzkx.zza(i11, zzml.zzf(obj, j10), zzF(i10));
                    break;
                case 51:
                    if (zzP(obj, i11, i10)) {
                        iA = e.a(i11 << 3, 8, iA);
                    }
                    break;
                case 52:
                    if (zzP(obj, i11, i10)) {
                        iA = e.a(i11 << 3, 4, iA);
                    }
                    break;
                case 53:
                    if (zzP(obj, i11, i10)) {
                        long jZzC = zzC(obj, j10);
                        iZzA = zzje.zzA(i11 << 3);
                        iZzB = zzje.zzB(jZzC);
                        iZzu = iZzB + iZzA;
                        iA += iZzu;
                    }
                    break;
                case 54:
                    if (zzP(obj, i11, i10)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzA = zzje.zzA(i11 << 3);
                        iZzB = zzje.zzB(jZzC2);
                        iZzu = iZzB + iZzA;
                        iA += iZzu;
                    }
                    break;
                case 55:
                    if (zzP(obj, i11, i10)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzA2 = zzje.zzA(i11 << 3);
                        iZzv = zzje.zzv(iZzr2);
                        iZzu = iZzv + iZzA2;
                        iA += iZzu;
                    }
                    break;
                case 56:
                    if (zzP(obj, i11, i10)) {
                        iA = e.a(i11 << 3, 8, iA);
                    }
                    break;
                case 57:
                    if (zzP(obj, i11, i10)) {
                        iA = e.a(i11 << 3, 4, iA);
                    }
                    break;
                case 58:
                    if (zzP(obj, i11, i10)) {
                        iA = e.a(i11 << 3, 1, iA);
                    }
                    break;
                case 59:
                    if (zzP(obj, i11, i10)) {
                        Object objZzf2 = zzml.zzf(obj, j10);
                        if (objZzf2 instanceof zzix) {
                            int iZzA6 = zzje.zzA(i11 << 3);
                            int iZzd3 = ((zzix) objZzf2).zzd();
                            iA = b.f(iZzd3, iZzd3, iZzA6, iA);
                        } else {
                            iZzA2 = zzje.zzA(i11 << 3);
                            iZzv = zzje.zzy((String) objZzf2);
                            iZzu = iZzv + iZzA2;
                            iA += iZzu;
                        }
                    }
                    break;
                case 60:
                    if (zzP(obj, i11, i10)) {
                        iZzo = zzlp.zzo(i11, zzml.zzf(obj, j10), zzE(i10));
                        iA += iZzo;
                    }
                    break;
                case 61:
                    if (zzP(obj, i11, i10)) {
                        zzix zzixVar2 = (zzix) zzml.zzf(obj, j10);
                        int iZzA7 = zzje.zzA(i11 << 3);
                        int iZzd4 = zzixVar2.zzd();
                        iA = b.f(iZzd4, iZzd4, iZzA7, iA);
                    }
                    break;
                case 62:
                    if (zzP(obj, i11, i10)) {
                        iA = e.a(zzr(obj, j10), zzje.zzA(i11 << 3), iA);
                    }
                    break;
                case 63:
                    if (zzP(obj, i11, i10)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzA2 = zzje.zzA(i11 << 3);
                        iZzv = zzje.zzv(iZzr3);
                        iZzu = iZzv + iZzA2;
                        iA += iZzu;
                    }
                    break;
                case 64:
                    if (zzP(obj, i11, i10)) {
                        iA = e.a(i11 << 3, 4, iA);
                    }
                    break;
                case 65:
                    if (zzP(obj, i11, i10)) {
                        iA = e.a(i11 << 3, 8, iA);
                    }
                    break;
                case 66:
                    if (zzP(obj, i11, i10)) {
                        int iZzr4 = zzr(obj, j10);
                        iA = e.a((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzje.zzA(i11 << 3), iA);
                    }
                    break;
                case 67:
                    if (zzP(obj, i11, i10)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzA = zzje.zzA(i11 << 3);
                        iZzB = zzje.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        iZzu = iZzB + iZzA;
                        iA += iZzu;
                    }
                    break;
                case 68:
                    if (zzP(obj, i11, i10)) {
                        iZzu = zzje.zzu(i11, (zzlc) zzml.zzf(obj, j10), zzE(i10));
                        iA += iZzu;
                    }
                    break;
            }
        }
        zzmb zzmbVar = this.zzn;
        return iA + zzmbVar.zza(zzmbVar.zzc(obj));
    }

    private static int zzr(Object obj, long j10) {
        return ((Integer) zzml.zzf(obj, j10)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzik zzikVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzkw) object).zze()) {
            zzkw zzkwVarZzb = zzkw.zza().zzb();
            zzkx.zzb(zzkwVarZzb, object);
            unsafe.putObject(obj, j10, zzkwVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzik zzikVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzil.zzn(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm = zzil.zzm(bArr, i10, zzikVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzikVar.zzb));
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj = zzil.zzj(bArr, i10, zzikVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzikVar.zza));
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzil.zzn(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzil.zzb(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm2 = zzil.zzm(bArr, i10, zzikVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(zzikVar.zzb != 0));
                unsafe.putInt(obj, j11, i13);
                return iZzm2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iZzj2 = zzil.zzj(bArr, i10, zzikVar);
                int i18 = zzikVar.zza;
                if (i18 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & PKIFailureInfo.duplicateCertReq) != 0 && !zzmq.zzf(bArr, iZzj2, iZzj2 + i18)) {
                        throw zzkh.zzc();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj2, i18, zzkf.zzb));
                    iZzj2 += i18;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iZzd = zzil.zzd(zzE(i17), bArr, i10, i11, zzikVar);
                Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, zzikVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzkf.zzg(object, zzikVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzd;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iZza = zzil.zza(bArr, i10, zzikVar);
                unsafe.putObject(obj, j10, zzikVar.zzc);
                unsafe.putInt(obj, j11, i13);
                return iZza;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj3 = zzil.zzj(bArr, i10, zzikVar);
                int i19 = zzikVar.zza;
                zzkb zzkbVarZzD = zzD(i17);
                if (zzkbVarZzD == null || zzkbVarZzD.zza(i19)) {
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
                int iZzj4 = zzil.zzj(bArr, i10, zzikVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzja.zzb(zzikVar.zza)));
                unsafe.putInt(obj, j11, i13);
                return iZzj4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm3 = zzil.zzm(bArr, i10, zzikVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzja.zzc(zzikVar.zzb)));
                unsafe.putInt(obj, j11, i13);
                return iZzm3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                int iZzc = zzil.zzc(zzE(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzikVar);
                Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j10, zzikVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzkf.zzg(object2, zzikVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzc;
            default:
                return i10;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0081. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i10, int i11, zzik zzikVar) throws IOException {
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
        zzlf<T> zzlfVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i23 = i11;
        zzikVar = zzikVar;
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
                iZzk = zzil.zzk(b10, bArr2, i30, zzikVar);
                i12 = zzikVar.zza;
            } else {
                i12 = b10;
                iZzk = i30;
            }
            int i31 = i12 >>> 3;
            int i32 = i12 & 7;
            int iZzx = i31 > i26 ? zzlfVar.zzx(i31, i28 / 3) : zzlfVar.zzw(i31);
            if (iZzx == i25) {
                i13 = iZzk;
                i14 = i31;
                i15 = i25;
                unsafe = unsafe2;
                i16 = 0;
            } else {
                int[] iArr = zzlfVar.zzc;
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
                                zzml.zzo(obj2, j10, Double.longBitsToDouble(zzil.zzn(bArr2, i19)));
                                iZzi = i19 + 8;
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 1:
                            zzikVar = zzikVar;
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
                                zzml.zzp(obj2, j10, Float.intBitsToFloat(zzil.zzb(bArr2, i19)));
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
                            zzikVar = zzikVar;
                            i18 = iZzx;
                            i19 = iZzk;
                            i14 = i31;
                            if (i32 != 0) {
                                i13 = i19;
                                unsafe = unsafe2;
                                i16 = i18;
                                i15 = -1;
                            } else {
                                iZzm = zzil.zzm(bArr2, i19, zzikVar);
                                unsafe2.putLong(obj, j10, zzikVar.zzb);
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
                            zzikVar = zzikVar;
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
                                iZzi = zzil.zzj(bArr2, i19, zzikVar);
                                unsafe2.putInt(obj2, j10, zzikVar.zza);
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
                                unsafe2.putLong(obj, j10, zzil.zzn(bArr2, iZzk));
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
                            zzikVar = zzikVar;
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
                                unsafe2.putInt(obj2, j10, zzil.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 7:
                            zzikVar = zzikVar;
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
                                iZzi = zzil.zzm(bArr2, iZzk, zzikVar);
                                zzml.zzm(obj2, j10, zzikVar.zzb != 0);
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 8:
                            zzikVar = zzikVar;
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
                                iZzi = (536870912 & i33) == 0 ? zzil.zzg(bArr2, iZzk, zzikVar) : zzil.zzh(bArr2, iZzk, zzikVar);
                                unsafe2.putObject(obj2, j10, zzikVar.zzc);
                                i29 |= i35;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 9:
                            zzikVar = zzikVar;
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
                                iZzd = zzil.zzd(zzlfVar.zzE(i18), bArr2, iZzk, i23, zzikVar);
                                Object object = unsafe2.getObject(obj2, j10);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j10, zzikVar.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j10, zzkf.zzg(object, zzikVar.zzc));
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
                            zzikVar = zzikVar;
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
                                iZzd = zzil.zza(bArr2, iZzk, zzikVar);
                                unsafe2.putObject(obj2, j10, zzikVar.zzc);
                                i29 |= i35;
                                iZzi = iZzd;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 12:
                            zzikVar = zzikVar;
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
                                iZzd = zzil.zzj(bArr2, iZzk, zzikVar);
                                unsafe2.putInt(obj2, j10, zzikVar.zza);
                                i29 |= i35;
                                iZzi = iZzd;
                                i28 = i18;
                                i26 = i14;
                                i24 = i17;
                                i25 = -1;
                            }
                            break;
                        case 15:
                            zzikVar = zzikVar;
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
                                iZzd = zzil.zzj(bArr2, iZzk, zzikVar);
                                unsafe2.putInt(obj2, j10, zzja.zzb(zzikVar.zza));
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
                                zzikVar = zzikVar;
                                iZzm = zzil.zzm(bArr2, iZzk, zzikVar);
                                i18 = iZzx;
                                i14 = i31;
                                unsafe2.putLong(obj, j10, zzja.zzc(zzikVar.zzb));
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
                    zzikVar = zzikVar;
                    i18 = iZzx;
                    int i37 = iZzk;
                    i17 = 1048575;
                    i14 = i31;
                    if (iZzA == 27) {
                        if (i32 == 2) {
                            zzke zzkeVarZzd = (zzke) unsafe2.getObject(obj2, j10);
                            if (!zzkeVarZzd.zzc()) {
                                int size = zzkeVarZzd.size();
                                zzkeVarZzd = zzkeVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j10, zzkeVarZzd);
                            }
                            iZzi = zzil.zze(zzlfVar.zzE(i18), i12, bArr, i37, i11, zzkeVarZzd, zzikVar);
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
                        iZzi = zzv(obj, bArr, i37, i11, i12, i14, i32, i18, i33, iZzA, j10, zzikVar);
                        if (iZzi != i37) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i23 = i11;
                            zzikVar = zzikVar;
                            i27 = i22;
                            i25 = i15;
                            i26 = i14;
                            i29 = i21;
                            i28 = i16;
                            unsafe2 = unsafe;
                            i24 = 1048575;
                            zzlfVar = this;
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
                            iZzi = zzt(obj, bArr, i20, i11, i12, i14, i32, i33, iZzA, j10, i16, zzikVar);
                            if (iZzi != i20) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i23 = i11;
                                zzikVar = zzikVar;
                                i27 = i22;
                                i25 = i15;
                                i26 = i14;
                                i29 = i21;
                                i28 = i16;
                                unsafe2 = unsafe;
                                i24 = 1048575;
                                zzlfVar = this;
                            } else {
                                i13 = iZzi;
                                i27 = i22;
                                i29 = i21;
                            }
                        } else if (i32 == 2) {
                            iZzi = zzs(obj, bArr, i20, i11, i16, j10, zzikVar);
                            if (iZzi != i20) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i23 = i11;
                                zzikVar = zzikVar;
                                i27 = i22;
                                i25 = i15;
                                i26 = i14;
                                i29 = i21;
                                i28 = i16;
                                unsafe2 = unsafe;
                                i24 = 1048575;
                                zzlfVar = this;
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
            iZzi = zzil.zzi(i12, bArr, i13, i11, zzd(obj), zzikVar);
            zzlfVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i23 = i11;
            zzikVar = zzikVar;
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
        throw zzkh.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, zzik zzikVar) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int iZzj;
        int iZzj2 = i10;
        Unsafe unsafe = zzb;
        zzke zzkeVarZzd = (zzke) unsafe.getObject(obj, j11);
        if (!zzkeVarZzd.zzc()) {
            int size = zzkeVarZzd.size();
            zzkeVarZzd = zzkeVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzkeVarZzd);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzjg zzjgVar = (zzjg) zzkeVarZzd;
                    int iZzj3 = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i21 = zzikVar.zza + iZzj3;
                    while (iZzj3 < i21) {
                        zzjgVar.zze(Double.longBitsToDouble(zzil.zzn(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i21) {
                        return iZzj3;
                    }
                    throw zzkh.zzf();
                }
                if (i14 == 1) {
                    zzjg zzjgVar2 = (zzjg) zzkeVarZzd;
                    zzjgVar2.zze(Double.longBitsToDouble(zzil.zzn(bArr, i10)));
                    while (true) {
                        i17 = iZzj2 + 8;
                        if (i17 < i11) {
                            iZzj2 = zzil.zzj(bArr, i17, zzikVar);
                            if (i12 == zzikVar.zza) {
                                zzjgVar2.zze(Double.longBitsToDouble(zzil.zzn(bArr, iZzj2)));
                            }
                        }
                    }
                    return i17;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzjq zzjqVar = (zzjq) zzkeVarZzd;
                    int iZzj4 = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i22 = zzikVar.zza + iZzj4;
                    while (iZzj4 < i22) {
                        zzjqVar.zze(Float.intBitsToFloat(zzil.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i22) {
                        return iZzj4;
                    }
                    throw zzkh.zzf();
                }
                if (i14 == 5) {
                    zzjq zzjqVar2 = (zzjq) zzkeVarZzd;
                    zzjqVar2.zze(Float.intBitsToFloat(zzil.zzb(bArr, i10)));
                    while (true) {
                        i18 = iZzj2 + 4;
                        if (i18 < i11) {
                            iZzj2 = zzil.zzj(bArr, i18, zzikVar);
                            if (i12 == zzikVar.zza) {
                                zzjqVar2.zze(Float.intBitsToFloat(zzil.zzb(bArr, iZzj2)));
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
                    zzkr zzkrVar = (zzkr) zzkeVarZzd;
                    int iZzj5 = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i23 = zzikVar.zza + iZzj5;
                    while (iZzj5 < i23) {
                        iZzj5 = zzil.zzm(bArr, iZzj5, zzikVar);
                        zzkrVar.zzg(zzikVar.zzb);
                    }
                    if (iZzj5 == i23) {
                        return iZzj5;
                    }
                    throw zzkh.zzf();
                }
                if (i14 == 0) {
                    zzkr zzkrVar2 = (zzkr) zzkeVarZzd;
                    int iZzm = zzil.zzm(bArr, iZzj2, zzikVar);
                    zzkrVar2.zzg(zzikVar.zzb);
                    while (iZzm < i11) {
                        int iZzj6 = zzil.zzj(bArr, iZzm, zzikVar);
                        if (i12 != zzikVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzil.zzm(bArr, iZzj6, zzikVar);
                        zzkrVar2.zzg(zzikVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzil.zzf(bArr, iZzj2, zzkeVarZzd, zzikVar);
                }
                if (i14 == 0) {
                    return zzil.zzl(i12, bArr, i10, i11, zzkeVarZzd, zzikVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzkr zzkrVar3 = (zzkr) zzkeVarZzd;
                    int iZzj7 = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i24 = zzikVar.zza + iZzj7;
                    while (iZzj7 < i24) {
                        zzkrVar3.zzg(zzil.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i24) {
                        return iZzj7;
                    }
                    throw zzkh.zzf();
                }
                if (i14 == 1) {
                    zzkr zzkrVar4 = (zzkr) zzkeVarZzd;
                    zzkrVar4.zzg(zzil.zzn(bArr, i10));
                    while (true) {
                        i19 = iZzj2 + 8;
                        if (i19 < i11) {
                            iZzj2 = zzil.zzj(bArr, i19, zzikVar);
                            if (i12 == zzikVar.zza) {
                                zzkrVar4.zzg(zzil.zzn(bArr, iZzj2));
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
                    zzjy zzjyVar = (zzjy) zzkeVarZzd;
                    int iZzj8 = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i25 = zzikVar.zza + iZzj8;
                    while (iZzj8 < i25) {
                        zzjyVar.zzh(zzil.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i25) {
                        return iZzj8;
                    }
                    throw zzkh.zzf();
                }
                if (i14 == 5) {
                    zzjy zzjyVar2 = (zzjy) zzkeVarZzd;
                    zzjyVar2.zzh(zzil.zzb(bArr, i10));
                    while (true) {
                        i20 = iZzj2 + 4;
                        if (i20 < i11) {
                            iZzj2 = zzil.zzj(bArr, i20, zzikVar);
                            if (i12 == zzikVar.zza) {
                                zzjyVar2.zzh(zzil.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i20;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i14 == 2) {
                    zzim zzimVar = (zzim) zzkeVarZzd;
                    iZzj = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i26 = zzikVar.zza + iZzj;
                    while (iZzj < i26) {
                        iZzj = zzil.zzm(bArr, iZzj, zzikVar);
                        zzimVar.zze(zzikVar.zzb != 0);
                    }
                    if (iZzj != i26) {
                        throw zzkh.zzf();
                    }
                    return iZzj;
                }
                if (i14 == 0) {
                    zzim zzimVar2 = (zzim) zzkeVarZzd;
                    int iZzm2 = zzil.zzm(bArr, iZzj2, zzikVar);
                    zzimVar2.zze(zzikVar.zzb != 0);
                    while (iZzm2 < i11) {
                        int iZzj9 = zzil.zzj(bArr, iZzm2, zzikVar);
                        if (i12 != zzikVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzil.zzm(bArr, iZzj9, zzikVar);
                        zzimVar2.zze(zzikVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i14 == 2) {
                    if ((j10 & SvgConstantsKt.SPECIFIED_CLIP_RULE) == 0) {
                        int iZzj10 = zzil.zzj(bArr, iZzj2, zzikVar);
                        int i27 = zzikVar.zza;
                        if (i27 < 0) {
                            throw zzkh.zzd();
                        }
                        if (i27 == 0) {
                            zzkeVarZzd.add("");
                        } else {
                            zzkeVarZzd.add(new String(bArr, iZzj10, i27, zzkf.zzb));
                            iZzj10 += i27;
                        }
                        while (iZzj10 < i11) {
                            int iZzj11 = zzil.zzj(bArr, iZzj10, zzikVar);
                            if (i12 != zzikVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzil.zzj(bArr, iZzj11, zzikVar);
                            int i28 = zzikVar.zza;
                            if (i28 < 0) {
                                throw zzkh.zzd();
                            }
                            if (i28 == 0) {
                                zzkeVarZzd.add("");
                            } else {
                                zzkeVarZzd.add(new String(bArr, iZzj10, i28, zzkf.zzb));
                                iZzj10 += i28;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i29 = zzikVar.zza;
                    if (i29 < 0) {
                        throw zzkh.zzd();
                    }
                    if (i29 == 0) {
                        zzkeVarZzd.add("");
                    } else {
                        int i30 = iZzj12 + i29;
                        if (!zzmq.zzf(bArr, iZzj12, i30)) {
                            throw zzkh.zzc();
                        }
                        zzkeVarZzd.add(new String(bArr, iZzj12, i29, zzkf.zzb));
                        iZzj12 = i30;
                    }
                    while (iZzj12 < i11) {
                        int iZzj13 = zzil.zzj(bArr, iZzj12, zzikVar);
                        if (i12 != zzikVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzil.zzj(bArr, iZzj13, zzikVar);
                        int i31 = zzikVar.zza;
                        if (i31 < 0) {
                            throw zzkh.zzd();
                        }
                        if (i31 == 0) {
                            zzkeVarZzd.add("");
                        } else {
                            int i32 = iZzj12 + i31;
                            if (!zzmq.zzf(bArr, iZzj12, i32)) {
                                throw zzkh.zzc();
                            }
                            zzkeVarZzd.add(new String(bArr, iZzj12, i31, zzkf.zzb));
                            iZzj12 = i32;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 27:
                if (i14 == 2) {
                    return zzil.zze(zzE(i15), i12, bArr, i10, i11, zzkeVarZzd, zzikVar);
                }
                return iZzj2;
            case 28:
                if (i14 == 2) {
                    int iZzj14 = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i33 = zzikVar.zza;
                    if (i33 < 0) {
                        throw zzkh.zzd();
                    }
                    if (i33 > bArr.length - iZzj14) {
                        throw zzkh.zzf();
                    }
                    if (i33 == 0) {
                        zzkeVarZzd.add(zzix.zzb);
                    } else {
                        zzkeVarZzd.add(zzix.zzl(bArr, iZzj14, i33));
                        iZzj14 += i33;
                    }
                    while (iZzj14 < i11) {
                        int iZzj15 = zzil.zzj(bArr, iZzj14, zzikVar);
                        if (i12 != zzikVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzil.zzj(bArr, iZzj15, zzikVar);
                        int i34 = zzikVar.zza;
                        if (i34 < 0) {
                            throw zzkh.zzd();
                        }
                        if (i34 > bArr.length - iZzj14) {
                            throw zzkh.zzf();
                        }
                        if (i34 == 0) {
                            zzkeVarZzd.add(zzix.zzb);
                        } else {
                            zzkeVarZzd.add(zzix.zzl(bArr, iZzj14, i34));
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
                        iZzj = zzil.zzl(i12, bArr, i10, i11, zzkeVarZzd, zzikVar);
                    }
                    return iZzj2;
                }
                iZzj = zzil.zzf(bArr, iZzj2, zzkeVarZzd, zzikVar);
                zzjx zzjxVar = (zzjx) obj;
                zzmc zzmcVar = zzjxVar.zzc;
                if (zzmcVar == zzmc.zzc()) {
                    zzmcVar = null;
                }
                Object objZzC = zzlp.zzC(i13, zzkeVarZzd, zzD(i15), zzmcVar, this.zzn);
                if (objZzC != null) {
                    zzjxVar.zzc = (zzmc) objZzC;
                    return iZzj;
                }
                return iZzj;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzjy zzjyVar3 = (zzjy) zzkeVarZzd;
                    int iZzj16 = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i35 = zzikVar.zza + iZzj16;
                    while (iZzj16 < i35) {
                        iZzj16 = zzil.zzj(bArr, iZzj16, zzikVar);
                        zzjyVar3.zzh(zzja.zzb(zzikVar.zza));
                    }
                    if (iZzj16 == i35) {
                        return iZzj16;
                    }
                    throw zzkh.zzf();
                }
                if (i14 == 0) {
                    zzjy zzjyVar4 = (zzjy) zzkeVarZzd;
                    int iZzj17 = zzil.zzj(bArr, iZzj2, zzikVar);
                    zzjyVar4.zzh(zzja.zzb(zzikVar.zza));
                    while (iZzj17 < i11) {
                        int iZzj18 = zzil.zzj(bArr, iZzj17, zzikVar);
                        if (i12 != zzikVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzil.zzj(bArr, iZzj18, zzikVar);
                        zzjyVar4.zzh(zzja.zzb(zzikVar.zza));
                    }
                    return iZzj17;
                }
                return iZzj2;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzkr zzkrVar5 = (zzkr) zzkeVarZzd;
                    int iZzj19 = zzil.zzj(bArr, iZzj2, zzikVar);
                    int i36 = zzikVar.zza + iZzj19;
                    while (iZzj19 < i36) {
                        iZzj19 = zzil.zzm(bArr, iZzj19, zzikVar);
                        zzkrVar5.zzg(zzja.zzc(zzikVar.zzb));
                    }
                    if (iZzj19 == i36) {
                        return iZzj19;
                    }
                    throw zzkh.zzf();
                }
                if (i14 == 0) {
                    zzkr zzkrVar6 = (zzkr) zzkeVarZzd;
                    int iZzm3 = zzil.zzm(bArr, iZzj2, zzikVar);
                    zzkrVar6.zzg(zzja.zzc(zzikVar.zzb));
                    while (iZzm3 < i11) {
                        int iZzj20 = zzil.zzj(bArr, iZzm3, zzikVar);
                        if (i12 != zzikVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzil.zzm(bArr, iZzj20, zzikVar);
                        zzkrVar6.zzg(zzja.zzc(zzikVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i14 == 3) {
                    zzln zzlnVarZzE = zzE(i15);
                    int i37 = (i12 & (-8)) | 4;
                    int iZzc = zzil.zzc(zzlnVarZzE, bArr, i10, i11, i37, zzikVar);
                    zzkeVarZzd.add(zzikVar.zzc);
                    while (iZzc < i11) {
                        int iZzj21 = zzil.zzj(bArr, iZzc, zzikVar);
                        if (i12 != zzikVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzil.zzc(zzlnVarZzE, bArr, iZzj21, i11, i37, zzikVar);
                        zzkeVarZzd.add(zzikVar.zzc);
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

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
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
                    iZzc = zzkf.zzc(Double.doubleToLongBits(zzml.zza(obj, j10)));
                    i12 = iZzc + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iZzc = Float.floatToIntBits(zzml.zzb(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iZzc = zzkf.zzc(zzml.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iZzc = zzkf.zzc(zzml.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iZzc2 = zzml.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iZzc = zzkf.zzc(zzml.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iZzc2 = zzml.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iZzc = zzkf.zza(zzml.zzw(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iZzc = ((String) zzml.zzf(obj, j10)).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 9:
                    Object objZzf = zzml.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iZzc = zzml.zzf(obj, j10).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iZzc2 = zzml.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iZzc2 = zzml.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iZzc2 = zzml.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iZzc = zzkf.zzc(zzml.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iZzc2 = zzml.zzc(obj, j10);
                    i12 = i11 + iZzc2;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iZzc = zzkf.zzc(zzml.zzd(obj, j10));
                    i12 = iZzc + i10;
                    break;
                case 17:
                    Object objZzf2 = zzml.zzf(obj, j10);
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
                    iZzc = zzml.zzf(obj, j10).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iZzc = zzml.zzf(obj, j10).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 51:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzkf.zzc(Double.doubleToLongBits(zzn(obj, j10)));
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
                        iZzc = zzkf.zzc(zzC(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 54:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzkf.zzc(zzC(obj, j10));
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
                        iZzc = zzkf.zzc(zzC(obj, j10));
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
                        iZzc = zzkf.zza(zzQ(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 59:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = ((String) zzml.zzf(obj, j10)).hashCode();
                        i12 = iZzc + i10;
                    }
                    break;
                case 60:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzml.zzf(obj, j10).hashCode();
                        i12 = iZzc + i10;
                    }
                    break;
                case 61:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzml.zzf(obj, j10).hashCode();
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
                        iZzc = zzkf.zzc(zzC(obj, j10));
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
                        iZzc = zzkf.zzc(zzC(obj, j10));
                        i12 = iZzc + i10;
                    }
                    break;
                case 68:
                    if (zzP(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzml.zzf(obj, j10).hashCode();
                        i12 = iZzc + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzc(obj).hashCode() + (i12 * 53);
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x03ad A[PHI: r0 r28 r33
      0x03ad: PHI (r0v35 int) = (r0v29 int), (r0v32 int), (r0v37 int) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x03ad: PHI (r28v7 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x03ad: PHI (r33v5 int) = (r33v3 int), (r33v3 int), (r33v6 int) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x03c7 A[PHI: r0 r28 r33
      0x03c7: PHI (r0v33 int) = (r0v29 int), (r0v32 int), (r0v37 int) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x03c7: PHI (r28v6 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x03c7: PHI (r33v4 int) = (r33v3 int), (r33v3 int), (r33v6 int) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzik zzikVar) throws IOException {
        Unsafe unsafe;
        int i13;
        Object obj2;
        zzlf<T> zzlfVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzik zzikVar2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        zzlf<T> zzlfVar2 = this;
        Object obj3 = obj;
        bArr = bArr;
        i11 = i11;
        int i32 = i12;
        zzik zzikVar3 = zzikVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i10;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1;
        int i37 = 1048575;
        while (true) {
            if (iZzi < i11) {
                int i38 = iZzi + 1;
                byte b10 = bArr[iZzi];
                if (b10 < 0) {
                    int iZzk = zzil.zzk(b10, bArr, i38, zzikVar3);
                    i14 = zzikVar3.zza;
                    i38 = iZzk;
                } else {
                    i14 = b10;
                }
                int i39 = i14 >>> 3;
                int i40 = i14 & 7;
                int iZzx = i39 > i36 ? zzlfVar2.zzx(i39, i34 / 3) : zzlfVar2.zzw(i39);
                if (iZzx == -1) {
                    i15 = i39;
                    i16 = i14;
                    i17 = i35;
                    unsafe = unsafe2;
                    i18 = i32;
                    i19 = 0;
                    i20 = i38;
                } else {
                    int[] iArr = zzlfVar2.zzc;
                    int i41 = iArr[iZzx + 1];
                    int iZzA = zzA(i41);
                    int i42 = i38;
                    long j10 = i41 & 1048575;
                    int i43 = i14;
                    if (iZzA <= 17) {
                        int i44 = iArr[iZzx + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        if (i46 != i37) {
                            if (i37 != 1048575) {
                                unsafe2.putInt(obj3, i37, i35);
                            }
                            i37 = i46;
                            i23 = unsafe2.getInt(obj3, i46);
                        } else {
                            i37 = i37;
                            i23 = i35;
                        }
                        switch (iZzA) {
                            case 0:
                                i24 = i39;
                                i25 = iZzx;
                                i26 = i42;
                                bArr = bArr;
                                if (i40 == 1) {
                                    zzml.zzo(obj3, j10, Double.longBitsToDouble(zzil.zzn(bArr, i26)));
                                    iZzi = i26 + 8;
                                    i35 = i23 | i45;
                                    i36 = i24;
                                    i33 = i43;
                                    i37 = i37;
                                    i34 = i25;
                                    i32 = i12;
                                } else {
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 1:
                                i24 = i39;
                                i25 = iZzx;
                                i26 = i42;
                                bArr = bArr;
                                if (i40 == 5) {
                                    zzml.zzp(obj3, j10, Float.intBitsToFloat(zzil.zzb(bArr, i26)));
                                    iZzi = i26 + 4;
                                    i35 = i23 | i45;
                                    i36 = i24;
                                    i33 = i43;
                                    i37 = i37;
                                    i34 = i25;
                                    i32 = i12;
                                } else {
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 2:
                            case 3:
                                i24 = i39;
                                i25 = iZzx;
                                i26 = i42;
                                bArr = bArr;
                                if (i40 == 0) {
                                    int iZzm = zzil.zzm(bArr, i26, zzikVar3);
                                    unsafe2.putLong(obj, j10, zzikVar3.zzb);
                                    i35 = i23 | i45;
                                    iZzi = iZzm;
                                    i36 = i24;
                                    i33 = i43;
                                    i37 = i37;
                                    i34 = i25;
                                    i32 = i12;
                                } else {
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 4:
                            case 11:
                                i24 = i39;
                                i25 = iZzx;
                                i26 = i42;
                                bArr = bArr;
                                if (i40 == 0) {
                                    iZzi = zzil.zzj(bArr, i26, zzikVar3);
                                    unsafe2.putInt(obj3, j10, zzikVar3.zza);
                                    i35 = i23 | i45;
                                    i36 = i24;
                                    i33 = i43;
                                    i37 = i37;
                                    i34 = i25;
                                    i32 = i12;
                                } else {
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 5:
                            case 14:
                                i24 = i39;
                                i27 = iZzx;
                                i28 = i42;
                                i29 = i43;
                                bArr = bArr;
                                if (i40 == 1) {
                                    i25 = i27;
                                    i43 = i29;
                                    i26 = i28;
                                    unsafe2.putLong(obj, j10, zzil.zzn(bArr, i28));
                                    iZzi = i26 + 8;
                                    i35 = i23 | i45;
                                    i36 = i24;
                                    i33 = i43;
                                    i37 = i37;
                                    i34 = i25;
                                    i32 = i12;
                                } else {
                                    i25 = i27;
                                    i43 = i29;
                                    i26 = i28;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 6:
                            case 13:
                                i24 = i39;
                                i27 = iZzx;
                                i28 = i42;
                                i29 = i43;
                                bArr = bArr;
                                if (i40 == 5) {
                                    unsafe2.putInt(obj3, j10, zzil.zzb(bArr, i28));
                                    int i47 = i28 + 4;
                                    i35 = i23 | i45;
                                    i34 = i27;
                                    iZzi = i47;
                                    i36 = i24;
                                    i33 = i29;
                                    i37 = i37;
                                    i11 = i11;
                                    i32 = i12;
                                } else {
                                    i25 = i27;
                                    i43 = i29;
                                    i26 = i28;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 7:
                                i31 = i11;
                                i24 = i39;
                                i27 = iZzx;
                                i28 = i42;
                                i29 = i43;
                                bArr = bArr;
                                if (i40 == 0) {
                                    int iZzm2 = zzil.zzm(bArr, i28, zzikVar3);
                                    zzml.zzm(obj3, j10, zzikVar3.zzb != 0);
                                    i34 = i27;
                                    iZzi = iZzm2;
                                    i35 = i23 | i45;
                                    i36 = i24;
                                    i32 = i12;
                                    int i48 = i29;
                                    i11 = i31;
                                    i33 = i48;
                                } else {
                                    i25 = i27;
                                    i43 = i29;
                                    i26 = i28;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 8:
                                i31 = i11;
                                i24 = i39;
                                i27 = iZzx;
                                i28 = i42;
                                i29 = i43;
                                bArr = bArr;
                                if (i40 == 2) {
                                    int iZzg = (536870912 & i41) == 0 ? zzil.zzg(bArr, i28, zzikVar3) : zzil.zzh(bArr, i28, zzikVar3);
                                    unsafe2.putObject(obj3, j10, zzikVar3.zzc);
                                    i35 = i23 | i45;
                                    i34 = i27;
                                    iZzi = iZzg;
                                    i36 = i24;
                                    i32 = i12;
                                    int i49 = i29;
                                    i11 = i31;
                                    i33 = i49;
                                } else {
                                    i25 = i27;
                                    i43 = i29;
                                    i26 = i28;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 9:
                                i24 = i39;
                                i30 = iZzx;
                                i28 = i42;
                                i29 = i43;
                                bArr = bArr;
                                if (i40 == 2) {
                                    i31 = i11;
                                    iZzi = zzil.zzd(zzlfVar2.zzE(i30), bArr, i28, i31, zzikVar3);
                                    if ((i23 & i45) == 0) {
                                        unsafe2.putObject(obj3, j10, zzikVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j10, zzkf.zzg(unsafe2.getObject(obj3, j10), zzikVar3.zzc));
                                    }
                                    i35 = i23 | i45;
                                    i34 = i30;
                                    i36 = i24;
                                    i32 = i12;
                                    int i410 = i29;
                                    i11 = i31;
                                    i33 = i410;
                                } else {
                                    i25 = i30;
                                    i43 = i29;
                                    i26 = i28;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 10:
                                i24 = i39;
                                i30 = iZzx;
                                i28 = i42;
                                i29 = i43;
                                bArr = bArr;
                                if (i40 == 2) {
                                    iZzi = zzil.zza(bArr, i28, zzikVar3);
                                    unsafe2.putObject(obj3, j10, zzikVar3.zzc);
                                    i35 = i23 | i45;
                                    i34 = i30;
                                    i36 = i24;
                                    i33 = i29;
                                    i37 = i37;
                                    i11 = i11;
                                    i32 = i12;
                                } else {
                                    i25 = i30;
                                    i43 = i29;
                                    i26 = i28;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 12:
                                i24 = i39;
                                i30 = iZzx;
                                i28 = i42;
                                i29 = i43;
                                bArr = bArr;
                                if (i40 == 0) {
                                    iZzi = zzil.zzj(bArr, i28, zzikVar3);
                                    int i50 = zzikVar3.zza;
                                    zzkb zzkbVarZzD = zzlfVar2.zzD(i30);
                                    if (zzkbVarZzD == null || zzkbVarZzD.zza(i50)) {
                                        unsafe2.putInt(obj3, j10, i50);
                                        i35 = i23 | i45;
                                    } else {
                                        zzd(obj).zzh(i29, Long.valueOf(i50));
                                        i35 = i23;
                                    }
                                    i34 = i30;
                                    i36 = i24;
                                    i33 = i29;
                                    i37 = i37;
                                    i11 = i11;
                                    i32 = i12;
                                } else {
                                    i25 = i30;
                                    i43 = i29;
                                    i26 = i28;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 15:
                                i24 = i39;
                                i30 = iZzx;
                                i28 = i42;
                                i29 = i43;
                                bArr = bArr;
                                if (i40 == 0) {
                                    iZzi = zzil.zzj(bArr, i28, zzikVar3);
                                    unsafe2.putInt(obj3, j10, zzja.zzb(zzikVar3.zza));
                                    i35 = i23 | i45;
                                    i34 = i30;
                                    i36 = i24;
                                    i33 = i29;
                                    i37 = i37;
                                    i11 = i11;
                                    i32 = i12;
                                } else {
                                    i25 = i30;
                                    i43 = i29;
                                    i26 = i28;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            case 16:
                                i24 = i39;
                                if (i40 == 0) {
                                    bArr = bArr;
                                    int iZzm3 = zzil.zzm(bArr, i42, zzikVar3);
                                    i29 = i43;
                                    unsafe2.putLong(obj, j10, zzja.zzc(zzikVar3.zzb));
                                    i35 = i23 | i45;
                                    i34 = iZzx;
                                    iZzi = iZzm3;
                                    i36 = i24;
                                    i33 = i29;
                                    i37 = i37;
                                    i11 = i11;
                                    i32 = i12;
                                } else {
                                    i43 = i43;
                                    i26 = i42;
                                    i25 = iZzx;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                            default:
                                if (i40 == 3) {
                                    iZzi = zzil.zzc(zzlfVar2.zzE(iZzx), bArr, i42, i11, (i39 << 3) | 4, zzikVar);
                                    if ((i23 & i45) == 0) {
                                        unsafe2.putObject(obj3, j10, zzikVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j10, zzkf.zzg(unsafe2.getObject(obj3, j10), zzikVar3.zzc));
                                    }
                                    i35 = i23 | i45;
                                    i34 = iZzx;
                                    i33 = i43;
                                    i36 = i39;
                                    i37 = i37;
                                    i32 = i12;
                                } else {
                                    i24 = i39;
                                    i25 = iZzx;
                                    i26 = i42;
                                    i18 = i12;
                                    i17 = i23;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i20 = i26;
                                    i16 = i43;
                                    i37 = i37;
                                    i19 = i25;
                                }
                                break;
                        }
                    } else {
                        if (iZzA != 27) {
                            i17 = i35;
                            i21 = i37;
                            i19 = iZzx;
                            if (iZzA <= 49) {
                                i15 = i39;
                                unsafe = unsafe2;
                                iZzi = zzv(obj, bArr, i42, i11, i43, i15, i40, i19, i41, iZzA, j10, zzikVar);
                                if (iZzi != i42) {
                                    zzlfVar2 = this;
                                    obj3 = obj;
                                    i36 = i15;
                                    i32 = i12;
                                    zzikVar3 = zzikVar;
                                    i35 = i17;
                                    i33 = i43;
                                    i34 = i19;
                                    i37 = i21;
                                } else {
                                    i20 = iZzi;
                                    i16 = i43;
                                    i37 = i21;
                                    i18 = i12;
                                }
                                unsafe2 = unsafe;
                            } else {
                                i15 = i39;
                                unsafe = unsafe2;
                                i22 = i42;
                                if (iZzA != 50) {
                                    iZzi = zzt(obj, bArr, i22, i11, i43, i15, i40, i41, iZzA, j10, i19, zzikVar);
                                    if (iZzi != i22) {
                                        zzlfVar2 = this;
                                        obj3 = obj;
                                        i36 = i15;
                                        i32 = i12;
                                        zzikVar3 = zzikVar;
                                        i35 = i17;
                                        i33 = i43;
                                        i34 = i19;
                                        i37 = i21;
                                    } else {
                                        i20 = iZzi;
                                        i16 = i43;
                                        i37 = i21;
                                        i18 = i12;
                                    }
                                    unsafe2 = unsafe;
                                } else if (i40 == 2) {
                                    iZzi = zzs(obj, bArr, i22, i11, i19, j10, zzikVar);
                                    if (iZzi != i22) {
                                        zzlfVar2 = this;
                                        obj3 = obj;
                                        i36 = i15;
                                        i32 = i12;
                                        zzikVar3 = zzikVar;
                                        i35 = i17;
                                        i33 = i43;
                                        i34 = i19;
                                        i37 = i21;
                                    } else {
                                        i20 = iZzi;
                                        i16 = i43;
                                        i37 = i21;
                                        i18 = i12;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i40 == 2) {
                            zzke zzkeVarZzd = (zzke) unsafe2.getObject(obj3, j10);
                            if (!zzkeVarZzd.zzc()) {
                                int size = zzkeVarZzd.size();
                                zzkeVarZzd = zzkeVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j10, zzkeVarZzd);
                            }
                            i33 = i43;
                            i37 = i37;
                            iZzi = zzil.zze(zzlfVar2.zzE(iZzx), i33, bArr, i42, i11, zzkeVarZzd, zzikVar);
                            i34 = iZzx;
                            i36 = i39;
                            i35 = i35;
                            i37 = i37;
                            i32 = i12;
                        } else {
                            i17 = i35;
                            i21 = i37;
                            i15 = i39;
                            unsafe = unsafe2;
                            i22 = i42;
                            i19 = iZzx;
                        }
                        i18 = i12;
                        i20 = i22;
                        i16 = i43;
                        i37 = i21;
                    }
                }
                if (i16 != i18 || i18 == 0) {
                    int i51 = i18;
                    if (this.zzh) {
                        zzikVar2 = zzikVar;
                        if (zzikVar2.zzd != zzjj.zza()) {
                            i15 = i15;
                            if (zzikVar2.zzd.zzc(this.zzg, i15) != null) {
                                throw null;
                            }
                            iZzi = zzil.zzi(i16, bArr, i20, i11, zzd(obj), zzikVar);
                            obj = obj;
                        }
                        i33 = i16;
                        zzlfVar2 = this;
                        i36 = i15;
                        obj3 = obj;
                        i35 = i17;
                        i34 = i19;
                        i32 = i51;
                        zzikVar3 = zzikVar2;
                        unsafe2 = unsafe;
                    } else {
                        zzikVar2 = zzikVar;
                    }
                    iZzi = zzil.zzi(i16, bArr, i20, i11, zzd(obj), zzikVar);
                    i33 = i16;
                    zzlfVar2 = this;
                    i36 = i15;
                    obj3 = obj;
                    i35 = i17;
                    i34 = i19;
                    i32 = i51;
                    zzikVar3 = zzikVar2;
                    unsafe2 = unsafe;
                } else {
                    zzlfVar = this;
                    obj2 = obj;
                    i13 = i18;
                    iZzi = i20;
                    i33 = i16;
                    i35 = i17;
                }
            } else {
                unsafe = unsafe2;
                i13 = i32;
                obj2 = obj3;
                zzlfVar = zzlfVar2;
            }
        }
        if (i37 != 1048575) {
            unsafe.putInt(obj2, i37, i35);
        }
        for (int i52 = zzlfVar.zzk; i52 < zzlfVar.zzl; i52++) {
            int i53 = zzlfVar.zzj[i52];
            int i54 = zzlfVar.zzc[i53];
            Object objZzf = zzml.zzf(obj2, zzlfVar.zzB(i53) & 1048575);
            if (objZzf != null && zzlfVar.zzD(i53) != null) {
                throw null;
            }
        }
        if (i13 == 0) {
            if (iZzi != i11) {
                throw zzkh.zze();
            }
        } else if (iZzi > i11 || i33 != i13) {
            throw zzkh.zze();
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final Object zze() {
        return ((zzjx) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long jZzB = zzB(this.zzj[i11]) & 1048575;
            Object objZzf = zzml.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzkw) objZzf).zzc();
                zzml.zzs(obj, jZzB, objZzf);
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
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = 1048575 & iZzB;
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzM(obj2, i10)) {
                        zzml.zzo(obj, j10, zzml.zza(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 1:
                    if (zzM(obj2, i10)) {
                        zzml.zzp(obj, j10, zzml.zzb(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 2:
                    if (zzM(obj2, i10)) {
                        zzml.zzr(obj, j10, zzml.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 3:
                    if (zzM(obj2, i10)) {
                        zzml.zzr(obj, j10, zzml.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 4:
                    if (zzM(obj2, i10)) {
                        zzml.zzq(obj, j10, zzml.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 5:
                    if (zzM(obj2, i10)) {
                        zzml.zzr(obj, j10, zzml.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 6:
                    if (zzM(obj2, i10)) {
                        zzml.zzq(obj, j10, zzml.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 7:
                    if (zzM(obj2, i10)) {
                        zzml.zzm(obj, j10, zzml.zzw(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 8:
                    if (zzM(obj2, i10)) {
                        zzml.zzs(obj, j10, zzml.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzM(obj2, i10)) {
                        zzml.zzs(obj, j10, zzml.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 11:
                    if (zzM(obj2, i10)) {
                        zzml.zzq(obj, j10, zzml.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 12:
                    if (zzM(obj2, i10)) {
                        zzml.zzq(obj, j10, zzml.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 13:
                    if (zzM(obj2, i10)) {
                        zzml.zzq(obj, j10, zzml.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 14:
                    if (zzM(obj2, i10)) {
                        zzml.zzr(obj, j10, zzml.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 15:
                    if (zzM(obj2, i10)) {
                        zzml.zzq(obj, j10, zzml.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 16:
                    if (zzM(obj2, i10)) {
                        zzml.zzr(obj, j10, zzml.zzd(obj2, j10));
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
                    zzlp.zzI(this.zzq, obj, obj2, j10);
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
                        zzml.zzs(obj, j10, zzml.zzf(obj2, j10));
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
                        zzml.zzs(obj, j10, zzml.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzlp.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlp.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzik zzikVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i10, i11, zzikVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zzikVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzi(Object obj, Object obj2) {
        boolean zZzH;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzml.zza(obj, j10)) != Double.doubleToLongBits(zzml.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzml.zzb(obj, j10)) != Float.floatToIntBits(zzml.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzml.zzd(obj, j10) != zzml.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzml.zzd(obj, j10) != zzml.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzml.zzc(obj, j10) != zzml.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzml.zzd(obj, j10) != zzml.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzml.zzc(obj, j10) != zzml.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzml.zzw(obj, j10) != zzml.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzlp.zzH(zzml.zzf(obj, j10), zzml.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzlp.zzH(zzml.zzf(obj, j10), zzml.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzlp.zzH(zzml.zzf(obj, j10), zzml.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzml.zzc(obj, j10) != zzml.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzml.zzc(obj, j10) != zzml.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzml.zzc(obj, j10) != zzml.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzml.zzd(obj, j10) != zzml.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzml.zzc(obj, j10) != zzml.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzml.zzd(obj, j10) != zzml.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzlp.zzH(zzml.zzf(obj, j10), zzml.zzf(obj2, j10))) {
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
                    zZzH = zzlp.zzH(zzml.zzf(obj, j10), zzml.zzf(obj2, j10));
                    break;
                case 50:
                    zZzH = zzlp.zzH(zzml.zzf(obj, j10), zzml.zzf(obj2, j10));
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
                    if (zzml.zzc(obj, jZzy) != zzml.zzc(obj2, jZzy) || !zzlp.zzH(zzml.zzf(obj, j10), zzml.zzf(obj2, j10))) {
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
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[LOOP:1: B:45:0x00b2->B:50:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzj(Object obj) {
        int i10;
        int i11;
        List list;
        zzln zzlnVarZzE;
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
                list = (List) zzml.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlnVarZzE = zzE(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzlnVarZzE.zzj(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzP(obj, i17, i16) && !zzO(obj, iZzB, zzE(i16))) {
                    return false;
                }
            } else if (iZzA == 49) {
                list = (List) zzml.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    zzlnVarZzE = zzE(i16);
                    while (i12 < list.size()) {
                        if (!zzlnVarZzE.zzj(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzA == 50 && !((zzkw) zzml.zzf(obj, iZzB & 1048575)).isEmpty()) {
                throw null;
            }
            i15++;
            i13 = i10;
            i14 = i11;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzm(Object obj, zzjf zzjfVar) throws IOException {
        if (!this.zzi) {
            zzR(obj, zzjfVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzf(i11, zzml.zza(obj, iZzB & 1048575));
                    }
                    break;
                case 1:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzo(i11, zzml.zzb(obj, iZzB & 1048575));
                    }
                    break;
                case 2:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzt(i11, zzml.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 3:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzJ(i11, zzml.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 4:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzr(i11, zzml.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 5:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzm(i11, zzml.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 6:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzk(i11, zzml.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 7:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzb(i11, zzml.zzw(obj, iZzB & 1048575));
                    }
                    break;
                case 8:
                    if (zzM(obj, i10)) {
                        zzT(i11, zzml.zzf(obj, iZzB & 1048575), zzjfVar);
                    }
                    break;
                case 9:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzv(i11, zzml.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 10:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzd(i11, (zzix) zzml.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzH(i11, zzml.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 12:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzi(i11, zzml.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 13:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzw(i11, zzml.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 14:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzy(i11, zzml.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 15:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzA(i11, zzml.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 16:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzC(i11, zzml.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 17:
                    if (zzM(obj, i10)) {
                        zzjfVar.zzq(i11, zzml.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 18:
                    zzlp.zzL(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 19:
                    zzlp.zzP(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 20:
                    zzlp.zzS(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 21:
                    zzlp.zzaa(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 22:
                    zzlp.zzR(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 23:
                    zzlp.zzO(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 24:
                    zzlp.zzN(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 25:
                    zzlp.zzJ(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 26:
                    zzlp.zzY(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar);
                    break;
                case 27:
                    zzlp.zzT(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, zzE(i10));
                    break;
                case 28:
                    zzlp.zzK(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar);
                    break;
                case 29:
                    zzlp.zzZ(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 30:
                    zzlp.zzM(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 31:
                    zzlp.zzU(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 32:
                    zzlp.zzV(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 33:
                    zzlp.zzW(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 34:
                    zzlp.zzX(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, false);
                    break;
                case 35:
                    zzlp.zzL(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 36:
                    zzlp.zzP(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 37:
                    zzlp.zzS(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 38:
                    zzlp.zzaa(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 39:
                    zzlp.zzR(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 40:
                    zzlp.zzO(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 41:
                    zzlp.zzN(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 42:
                    zzlp.zzJ(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 43:
                    zzlp.zzZ(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 44:
                    zzlp.zzM(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 45:
                    zzlp.zzU(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 46:
                    zzlp.zzV(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 47:
                    zzlp.zzW(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 48:
                    zzlp.zzX(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, true);
                    break;
                case 49:
                    zzlp.zzQ(i11, (List) zzml.zzf(obj, iZzB & 1048575), zzjfVar, zzE(i10));
                    break;
                case 50:
                    zzS(zzjfVar, i11, zzml.zzf(obj, iZzB & 1048575), i10);
                    break;
                case 51:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzf(i11, zzn(obj, iZzB & 1048575));
                    }
                    break;
                case 52:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzo(i11, zzo(obj, iZzB & 1048575));
                    }
                    break;
                case 53:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzt(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 54:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzJ(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 55:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzr(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 56:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzm(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 57:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzk(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 58:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzb(i11, zzQ(obj, iZzB & 1048575));
                    }
                    break;
                case 59:
                    if (zzP(obj, i11, i10)) {
                        zzT(i11, zzml.zzf(obj, iZzB & 1048575), zzjfVar);
                    }
                    break;
                case 60:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzv(i11, zzml.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 61:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzd(i11, (zzix) zzml.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 62:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzH(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 63:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzi(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 64:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzw(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 65:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzy(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 66:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzA(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 67:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzC(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 68:
                    if (zzP(obj, i11, i10)) {
                        zzjfVar.zzq(i11, zzml.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
            }
        }
        zzmb zzmbVar = this.zzn;
        zzmbVar.zzi(zzmbVar.zzc(obj), zzjfVar);
    }
}
