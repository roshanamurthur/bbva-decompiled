package com.google.android.gms.internal.auth;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdu {
    public static int zza(byte[] bArr, int i10, zzdt zzdtVar) throws zzfb {
        int iZzh = zzh(bArr, i10, zzdtVar);
        int i11 = zzdtVar.zza;
        if (i11 < 0) {
            throw zzfb.zzc();
        }
        if (i11 > bArr.length - iZzh) {
            throw zzfb.zzf();
        }
        if (i11 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return iZzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, iZzh, i11);
        return iZzh + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzgi zzgiVar, byte[] bArr, int i10, int i11, int i12, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzl = zzl(objZzd, zzgiVar, bArr, i10, i11, i12, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzl;
    }

    public static int zzd(zzgi zzgiVar, byte[] bArr, int i10, int i11, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzm = zzm(objZzd, zzgiVar, bArr, i10, i11, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzm;
    }

    public static int zze(zzgi zzgiVar, int i10, byte[] bArr, int i11, int i12, zzez zzezVar, zzdt zzdtVar) throws IOException {
        int iZzd = zzd(zzgiVar, bArr, i11, i12, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (iZzd < i12) {
            int iZzh = zzh(bArr, iZzd, zzdtVar);
            if (i10 != zzdtVar.zza) {
                break;
            }
            iZzd = zzd(zzgiVar, bArr, iZzh, i12, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzez zzezVar, zzdt zzdtVar) throws IOException {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i10, zzdtVar);
        int i11 = zzdtVar.zza + iZzh;
        while (iZzh < i11) {
            iZzh = zzh(bArr, iZzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (iZzh == i11) {
            return iZzh;
        }
        throw zzfb.zzf();
    }

    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzha zzhaVar, zzdt zzdtVar) throws zzfb {
        if ((i10 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzk = zzk(bArr, i11, zzdtVar);
            zzhaVar.zzh(i10, Long.valueOf(zzdtVar.zzb));
            return iZzk;
        }
        if (i13 == 1) {
            zzhaVar.zzh(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzh = zzh(bArr, i11, zzdtVar);
            int i14 = zzdtVar.zza;
            if (i14 < 0) {
                throw zzfb.zzc();
            }
            if (i14 > bArr.length - iZzh) {
                throw zzfb.zzf();
            }
            if (i14 == 0) {
                zzhaVar.zzh(i10, zzef.zzb);
            } else {
                zzhaVar.zzh(i10, zzef.zzk(bArr, iZzh, i14));
            }
            return iZzh + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzha zzhaVarZzd = zzha.zzd();
        int i16 = 0;
        while (i11 < i12) {
            int iZzh2 = zzh(bArr, i11, zzdtVar);
            int i17 = zzdtVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = iZzh2;
                break;
            }
            int iZzg = zzg(i16, bArr, iZzh2, i12, zzhaVarZzd, zzdtVar);
            i16 = i17;
            i11 = iZzg;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i10, zzhaVarZzd);
        return i11;
    }

    public static int zzh(byte[] bArr, int i10, zzdt zzdtVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzdtVar);
        }
        zzdtVar.zza = b10;
        return i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, zzdt zzdtVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzdtVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzdtVar.zza = i14 | (b11 << Constants.CVR_B1b41_1110_ONLINE_PIN);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzdtVar.zza = i16 | (b12 << MessageUtils.MESSAGE_21_NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzdtVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzdtVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i11, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (iZzh < i12) {
            int iZzh2 = zzh(bArr, iZzh, zzdtVar);
            if (i10 != zzdtVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i10, zzdt zzdtVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzdtVar.zzb = j10;
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
        zzdtVar.zzb = j11;
        return i12;
    }

    public static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i10, int i11, int i12, zzdt zzdtVar) throws IOException {
        int iZzb = ((zzga) zzgiVar).zzb(obj, bArr, i10, i11, i12, zzdtVar);
        zzdtVar.zzc = obj;
        return iZzb;
    }

    public static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i10, int i11, zzdt zzdtVar) throws IOException {
        int iZzi = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzi = zzi(i12, bArr, iZzi, zzdtVar);
            i12 = zzdtVar.zza;
        }
        int i13 = iZzi;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzfb.zzf();
        }
        int i14 = i12 + i13;
        zzgiVar.zzg(obj, bArr, i13, i14, zzdtVar);
        zzdtVar.zzc = obj;
        return i14;
    }

    public static long zzn(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
