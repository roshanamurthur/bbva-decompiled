package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zztk {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i10, zztj zztjVar) throws zzve {
        int iZzj = zzj(bArr, i10, zztjVar);
        int i11 = zztjVar.zza;
        if (i11 < 0) {
            throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZzj) {
            throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zztjVar.zzc = zztu.zzb;
            return iZzj;
        }
        zztjVar.zzc = zztu.zzj(bArr, iZzj, i11);
        return iZzj + i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzb(int i10, byte[] bArr, int i11, int i12, zzus zzusVar, zzuu zzuuVar, zzwv zzwvVar, zztj zztjVar) throws IOException {
        int i13;
        zzum zzumVar = zzusVar.zzb;
        zzxg zzxgVar = zzuuVar.zzd.zzb;
        Object objValueOf = null;
        if (zzxgVar == zzxg.zzn) {
            zzj(bArr, i11, zztjVar);
            throw null;
        }
        switch (zzxgVar.ordinal()) {
            case 0:
                i13 = i11 + 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(zzq(bArr, i11)));
                i11 = i13;
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 1:
                i13 = i11 + 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(zzc(bArr, i11)));
                i11 = i13;
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 2:
            case 3:
                i11 = zzm(bArr, i11, zztjVar);
                objValueOf = Long.valueOf(zztjVar.zzb);
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 4:
            case 12:
                i11 = zzj(bArr, i11, zztjVar);
                objValueOf = Integer.valueOf(zztjVar.zza);
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 5:
            case 15:
                i13 = i11 + 8;
                objValueOf = Long.valueOf(zzq(bArr, i11));
                i11 = i13;
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 6:
            case 14:
                i13 = i11 + 4;
                objValueOf = Integer.valueOf(zzc(bArr, i11));
                i11 = i13;
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 7:
                i11 = zzm(bArr, i11, zztjVar);
                objValueOf = Boolean.valueOf(zztjVar.zzb != 0);
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 8:
                i11 = zzh(bArr, i11, zztjVar);
                objValueOf = zztjVar.zzc;
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 9:
                int iZzd = zzd(zzwe.zza().zzb(zzuuVar.zzc.getClass()), bArr, i11, i12, ((i10 >>> 3) << 3) | 4, zztjVar);
                zzumVar.zzg(zzuuVar.zzd, zztjVar.zzc);
                return iZzd;
            case 10:
                int iZze = zze(zzwe.zza().zzb(zzuuVar.zzc.getClass()), bArr, i11, i12, zztjVar);
                zzumVar.zzg(zzuuVar.zzd, zztjVar.zzc);
                return iZze;
            case 11:
                i11 = zza(bArr, i11, zztjVar);
                objValueOf = zztjVar.zzc;
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i11 = zzj(bArr, i11, zztjVar);
                objValueOf = Integer.valueOf(zzty.zzb(zztjVar.zza));
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            case 17:
                i11 = zzm(bArr, i11, zztjVar);
                objValueOf = Long.valueOf(zzty.zzc(zztjVar.zzb));
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
            default:
                zzumVar.zzg(zzuuVar.zzd, objValueOf);
                return i11;
        }
    }

    public static int zzc(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzd(zzwh zzwhVar, byte[] bArr, int i10, int i11, int i12, zztj zztjVar) throws IOException {
        Object objZze = zzwhVar.zze();
        int iZzn = zzn(objZze, zzwhVar, bArr, i10, i11, i12, zztjVar);
        zzwhVar.zzf(objZze);
        zztjVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzwh zzwhVar, byte[] bArr, int i10, int i11, zztj zztjVar) throws IOException {
        Object objZze = zzwhVar.zze();
        int iZzo = zzo(objZze, zzwhVar, bArr, i10, i11, zztjVar);
        zzwhVar.zzf(objZze);
        zztjVar.zzc = objZze;
        return iZzo;
    }

    public static int zzf(zzwh zzwhVar, int i10, byte[] bArr, int i11, int i12, zzvb zzvbVar, zztj zztjVar) throws IOException {
        int iZze = zze(zzwhVar, bArr, i11, i12, zztjVar);
        zzvbVar.add(zztjVar.zzc);
        while (iZze < i12) {
            int iZzj = zzj(bArr, iZze, zztjVar);
            if (i10 != zztjVar.zza) {
                break;
            }
            iZze = zze(zzwhVar, bArr, iZzj, i12, zztjVar);
            zzvbVar.add(zztjVar.zzc);
        }
        return iZze;
    }

    public static int zzg(byte[] bArr, int i10, zzvb zzvbVar, zztj zztjVar) throws IOException {
        zzux zzuxVar = (zzux) zzvbVar;
        int iZzj = zzj(bArr, i10, zztjVar);
        int i11 = zztjVar.zza + iZzj;
        while (iZzj < i11) {
            iZzj = zzj(bArr, iZzj, zztjVar);
            zzuxVar.zzf(zztjVar.zza);
        }
        if (iZzj == i11) {
            return iZzj;
        }
        throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzh(byte[] bArr, int i10, zztj zztjVar) throws zzve {
        int iZzj = zzj(bArr, i10, zztjVar);
        int i11 = zztjVar.zza;
        if (i11 < 0) {
            throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            zztjVar.zzc = "";
            return iZzj;
        }
        zztjVar.zzc = new String(bArr, iZzj, i11, zzvc.zza);
        return iZzj + i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzww zzwwVar, zztj zztjVar) throws zzve {
        if ((i10 >>> 3) == 0) {
            throw new zzve("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzm = zzm(bArr, i11, zztjVar);
            zzwwVar.zzj(i10, Long.valueOf(zztjVar.zzb));
            return iZzm;
        }
        if (i13 == 1) {
            zzwwVar.zzj(i10, Long.valueOf(zzq(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzj = zzj(bArr, i11, zztjVar);
            int i14 = zztjVar.zza;
            if (i14 < 0) {
                throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZzj) {
                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzwwVar.zzj(i10, zztu.zzb);
            } else {
                zzwwVar.zzj(i10, zztu.zzj(bArr, iZzj, i14));
            }
            return iZzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzve("Protocol message contained an invalid tag (zero).");
            }
            zzwwVar.zzj(i10, Integer.valueOf(zzc(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzww zzwwVarZzf = zzww.zzf();
        int i16 = zztjVar.zze + 1;
        zztjVar.zze = i16;
        zzr(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iZzj2 = zzj(bArr, i11, zztjVar);
            i17 = zztjVar.zza;
            if (i17 == i15) {
                i11 = iZzj2;
                break;
            }
            i11 = zzi(i17, bArr, iZzj2, i12, zzwwVarZzf, zztjVar);
        }
        zztjVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzve("Failed to parse the message.");
        }
        zzwwVar.zzj(i10, zzwwVarZzf);
        return i11;
    }

    public static int zzj(byte[] bArr, int i10, zztj zztjVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zztjVar);
        }
        zztjVar.zza = b10;
        return i11;
    }

    public static int zzk(int i10, byte[] bArr, int i11, zztj zztjVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zztjVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zztjVar.zza = i14 | (b11 << Constants.CVR_B1b41_1110_ONLINE_PIN);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zztjVar.zza = i16 | (b12 << MessageUtils.MESSAGE_21_NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zztjVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zztjVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzvb zzvbVar, zztj zztjVar) {
        zzux zzuxVar = (zzux) zzvbVar;
        int iZzj = zzj(bArr, i11, zztjVar);
        zzuxVar.zzf(zztjVar.zza);
        while (iZzj < i12) {
            int iZzj2 = zzj(bArr, iZzj, zztjVar);
            if (i10 != zztjVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zztjVar);
            zzuxVar.zzf(zztjVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i10, zztj zztjVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zztjVar.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        zztjVar.zzb = j11;
        return i12;
    }

    public static int zzn(Object obj, zzwh zzwhVar, byte[] bArr, int i10, int i11, int i12, zztj zztjVar) throws IOException {
        zzvz zzvzVar = (zzvz) zzwhVar;
        int i13 = zztjVar.zze + 1;
        zztjVar.zze = i13;
        zzr(i13);
        int iZzc = zzvzVar.zzc(obj, bArr, i10, i11, i12, zztjVar);
        zztjVar.zze--;
        zztjVar.zzc = obj;
        return iZzc;
    }

    public static int zzo(Object obj, zzwh zzwhVar, byte[] bArr, int i10, int i11, zztj zztjVar) throws IOException {
        int iZzk = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzk = zzk(i12, bArr, iZzk, zztjVar);
            i12 = zztjVar.zza;
        }
        int i13 = iZzk;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zztjVar.zze + 1;
        zztjVar.zze = i14;
        zzr(i14);
        int i15 = i12 + i13;
        zzwhVar.zzh(obj, bArr, i13, i15, zztjVar);
        zztjVar.zze--;
        zztjVar.zzc = obj;
        return i15;
    }

    public static int zzp(int i10, byte[] bArr, int i11, int i12, zztj zztjVar) throws zzve {
        if ((i10 >>> 3) == 0) {
            throw new zzve("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzm(bArr, i11, zztjVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzj(bArr, i11, zztjVar) + zztjVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzve("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzj(bArr, i11, zztjVar);
            i15 = zztjVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzp(i15, bArr, i11, i12, zztjVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzve("Failed to parse the message.");
        }
        return i11;
    }

    public static long zzq(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    private static void zzr(int i10) throws zzve {
        if (i10 >= zzb) {
            throw new zzve("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
