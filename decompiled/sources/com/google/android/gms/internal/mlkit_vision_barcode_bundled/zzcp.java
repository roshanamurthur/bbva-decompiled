package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcp {
    public static int zza(byte[] bArr, int i10, zzco zzcoVar) throws zzen {
        int iZzj = zzj(bArr, i10, zzcoVar);
        int i11 = zzcoVar.zza;
        if (i11 < 0) {
            throw zzen.zzd();
        }
        if (i11 > bArr.length - iZzj) {
            throw zzen.zzg();
        }
        if (i11 == 0) {
            zzcoVar.zzc = zzdb.zzb;
            return iZzj;
        }
        zzcoVar.zzc = zzdb.zzr(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(zzgb zzgbVar, byte[] bArr, int i10, int i11, int i12, zzco zzcoVar) throws IOException {
        zzfo zzfoVar = (zzfo) zzgbVar;
        Object objZze = zzfoVar.zze();
        int iZzc = zzfoVar.zzc(objZze, bArr, i10, i11, i12, zzcoVar);
        zzfoVar.zzf(objZze);
        zzcoVar.zzc = objZze;
        return iZzc;
    }

    public static int zzd(zzgb zzgbVar, byte[] bArr, int i10, int i11, zzco zzcoVar) throws IOException {
        int iZzk = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzk = zzk(i12, bArr, iZzk, zzcoVar);
            i12 = zzcoVar.zza;
        }
        int i13 = iZzk;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzen.zzg();
        }
        Object objZze = zzgbVar.zze();
        int i14 = i12 + i13;
        zzgbVar.zzh(objZze, bArr, i13, i14, zzcoVar);
        zzgbVar.zzf(objZze);
        zzcoVar.zzc = objZze;
        return i14;
    }

    public static int zze(zzgb zzgbVar, int i10, byte[] bArr, int i11, int i12, zzek zzekVar, zzco zzcoVar) throws IOException {
        int iZzd = zzd(zzgbVar, bArr, i11, i12, zzcoVar);
        zzekVar.add(zzcoVar.zzc);
        while (iZzd < i12) {
            int iZzj = zzj(bArr, iZzd, zzcoVar);
            if (i10 != zzcoVar.zza) {
                break;
            }
            iZzd = zzd(zzgbVar, bArr, iZzj, i12, zzcoVar);
            zzekVar.add(zzcoVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzek zzekVar, zzco zzcoVar) throws IOException {
        zzed zzedVar = (zzed) zzekVar;
        int iZzj = zzj(bArr, i10, zzcoVar);
        int i11 = zzcoVar.zza + iZzj;
        while (iZzj < i11) {
            iZzj = zzj(bArr, iZzj, zzcoVar);
            zzedVar.zzg(zzcoVar.zza);
        }
        if (iZzj == i11) {
            return iZzj;
        }
        throw zzen.zzg();
    }

    public static int zzg(byte[] bArr, int i10, zzco zzcoVar) throws zzen {
        int iZzj = zzj(bArr, i10, zzcoVar);
        int i11 = zzcoVar.zza;
        if (i11 < 0) {
            throw zzen.zzd();
        }
        if (i11 == 0) {
            zzcoVar.zzc = "";
            return iZzj;
        }
        zzcoVar.zzc = new String(bArr, iZzj, i11, zzel.zzb);
        return iZzj + i11;
    }

    public static int zzh(byte[] bArr, int i10, zzco zzcoVar) throws zzen {
        int iZzj = zzj(bArr, i10, zzcoVar);
        int i11 = zzcoVar.zza;
        if (i11 < 0) {
            throw zzen.zzd();
        }
        if (i11 == 0) {
            zzcoVar.zzc = "";
            return iZzj;
        }
        zzcoVar.zzc = zzhe.zzg(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzgq zzgqVar, zzco zzcoVar) throws zzen {
        if ((i10 >>> 3) == 0) {
            throw zzen.zzb();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzm = zzm(bArr, i11, zzcoVar);
            zzgqVar.zzh(i10, Long.valueOf(zzcoVar.zzb));
            return iZzm;
        }
        if (i13 == 1) {
            zzgqVar.zzh(i10, Long.valueOf(zzo(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzj = zzj(bArr, i11, zzcoVar);
            int i14 = zzcoVar.zza;
            if (i14 < 0) {
                throw zzen.zzd();
            }
            if (i14 > bArr.length - iZzj) {
                throw zzen.zzg();
            }
            if (i14 == 0) {
                zzgqVar.zzh(i10, zzdb.zzb);
            } else {
                zzgqVar.zzh(i10, zzdb.zzr(bArr, iZzj, i14));
            }
            return iZzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzen.zzb();
            }
            zzgqVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzgq zzgqVarZze = zzgq.zze();
        int i16 = 0;
        while (i11 < i12) {
            int iZzj2 = zzj(bArr, i11, zzcoVar);
            int i17 = zzcoVar.zza;
            if (i17 == i15) {
                i16 = i17;
                i11 = iZzj2;
                break;
            }
            i16 = i17;
            i11 = zzi(i17, bArr, iZzj2, i12, zzgqVarZze, zzcoVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw zzen.zze();
        }
        zzgqVar.zzh(i10, zzgqVarZze);
        return i11;
    }

    public static int zzj(byte[] bArr, int i10, zzco zzcoVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzcoVar);
        }
        zzcoVar.zza = b10;
        return i11;
    }

    public static int zzk(int i10, byte[] bArr, int i11, zzco zzcoVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzcoVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzcoVar.zza = i14 | (b11 << Constants.CVR_B1b41_1110_ONLINE_PIN);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzcoVar.zza = i16 | (b12 << MessageUtils.MESSAGE_21_NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzcoVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzcoVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzek zzekVar, zzco zzcoVar) {
        zzed zzedVar = (zzed) zzekVar;
        int iZzj = zzj(bArr, i11, zzcoVar);
        zzedVar.zzg(zzcoVar.zza);
        while (iZzj < i12) {
            int iZzj2 = zzj(bArr, iZzj, zzcoVar);
            if (i10 != zzcoVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzcoVar);
            zzedVar.zzg(zzcoVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i10, zzco zzcoVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzcoVar.zzb = j10;
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
        zzcoVar.zzb = j11;
        return i12;
    }

    public static int zzn(int i10, byte[] bArr, int i11, int i12, zzco zzcoVar) throws zzen {
        if ((i10 >>> 3) == 0) {
            throw zzen.zzb();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzm(bArr, i11, zzcoVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzj(bArr, i11, zzcoVar) + zzcoVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzen.zzb();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzj(bArr, i11, zzcoVar);
            i15 = zzcoVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzn(i15, bArr, i11, i12, zzcoVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzen.zze();
        }
        return i11;
    }

    public static long zzo(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
