package com.google.android.gms.internal.measurement;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzil {
    public static int zza(byte[] bArr, int i10, zzik zzikVar) throws zzkh {
        int iZzj = zzj(bArr, i10, zzikVar);
        int i11 = zzikVar.zza;
        if (i11 < 0) {
            throw zzkh.zzd();
        }
        if (i11 > bArr.length - iZzj) {
            throw zzkh.zzf();
        }
        if (i11 == 0) {
            zzikVar.zzc = zzix.zzb;
            return iZzj;
        }
        zzikVar.zzc = zzix.zzl(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(zzln zzlnVar, byte[] bArr, int i10, int i11, int i12, zzik zzikVar) throws IOException {
        zzlf zzlfVar = (zzlf) zzlnVar;
        Object objZze = zzlfVar.zze();
        int iZzc = zzlfVar.zzc(objZze, bArr, i10, i11, i12, zzikVar);
        zzlfVar.zzf(objZze);
        zzikVar.zzc = objZze;
        return iZzc;
    }

    public static int zzd(zzln zzlnVar, byte[] bArr, int i10, int i11, zzik zzikVar) throws IOException {
        int iZzk = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzk = zzk(i12, bArr, iZzk, zzikVar);
            i12 = zzikVar.zza;
        }
        int i13 = iZzk;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzkh.zzf();
        }
        Object objZze = zzlnVar.zze();
        int i14 = i12 + i13;
        zzlnVar.zzh(objZze, bArr, i13, i14, zzikVar);
        zzlnVar.zzf(objZze);
        zzikVar.zzc = objZze;
        return i14;
    }

    public static int zze(zzln zzlnVar, int i10, byte[] bArr, int i11, int i12, zzke zzkeVar, zzik zzikVar) throws IOException {
        int iZzd = zzd(zzlnVar, bArr, i11, i12, zzikVar);
        zzkeVar.add(zzikVar.zzc);
        while (iZzd < i12) {
            int iZzj = zzj(bArr, iZzd, zzikVar);
            if (i10 != zzikVar.zza) {
                break;
            }
            iZzd = zzd(zzlnVar, bArr, iZzj, i12, zzikVar);
            zzkeVar.add(zzikVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzke zzkeVar, zzik zzikVar) throws IOException {
        zzjy zzjyVar = (zzjy) zzkeVar;
        int iZzj = zzj(bArr, i10, zzikVar);
        int i11 = zzikVar.zza + iZzj;
        while (iZzj < i11) {
            iZzj = zzj(bArr, iZzj, zzikVar);
            zzjyVar.zzh(zzikVar.zza);
        }
        if (iZzj == i11) {
            return iZzj;
        }
        throw zzkh.zzf();
    }

    public static int zzg(byte[] bArr, int i10, zzik zzikVar) throws zzkh {
        int iZzj = zzj(bArr, i10, zzikVar);
        int i11 = zzikVar.zza;
        if (i11 < 0) {
            throw zzkh.zzd();
        }
        if (i11 == 0) {
            zzikVar.zzc = "";
            return iZzj;
        }
        zzikVar.zzc = new String(bArr, iZzj, i11, zzkf.zzb);
        return iZzj + i11;
    }

    public static int zzh(byte[] bArr, int i10, zzik zzikVar) throws zzkh {
        int iZzj = zzj(bArr, i10, zzikVar);
        int i11 = zzikVar.zza;
        if (i11 < 0) {
            throw zzkh.zzd();
        }
        if (i11 == 0) {
            zzikVar.zzc = "";
            return iZzj;
        }
        zzikVar.zzc = zzmq.zzd(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzmc zzmcVar, zzik zzikVar) throws zzkh {
        if ((i10 >>> 3) == 0) {
            throw zzkh.zzb();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzm = zzm(bArr, i11, zzikVar);
            zzmcVar.zzh(i10, Long.valueOf(zzikVar.zzb));
            return iZzm;
        }
        if (i13 == 1) {
            zzmcVar.zzh(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzj = zzj(bArr, i11, zzikVar);
            int i14 = zzikVar.zza;
            if (i14 < 0) {
                throw zzkh.zzd();
            }
            if (i14 > bArr.length - iZzj) {
                throw zzkh.zzf();
            }
            if (i14 == 0) {
                zzmcVar.zzh(i10, zzix.zzb);
            } else {
                zzmcVar.zzh(i10, zzix.zzl(bArr, iZzj, i14));
            }
            return iZzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzkh.zzb();
            }
            zzmcVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzmc zzmcVarZze = zzmc.zze();
        int i16 = 0;
        while (i11 < i12) {
            int iZzj2 = zzj(bArr, i11, zzikVar);
            int i17 = zzikVar.zza;
            if (i17 == i15) {
                i16 = i17;
                i11 = iZzj2;
                break;
            }
            i16 = i17;
            i11 = zzi(i17, bArr, iZzj2, i12, zzmcVarZze, zzikVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw zzkh.zze();
        }
        zzmcVar.zzh(i10, zzmcVarZze);
        return i11;
    }

    public static int zzj(byte[] bArr, int i10, zzik zzikVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzikVar);
        }
        zzikVar.zza = b10;
        return i11;
    }

    public static int zzk(int i10, byte[] bArr, int i11, zzik zzikVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzikVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzikVar.zza = i14 | (b11 << Constants.CVR_B1b41_1110_ONLINE_PIN);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzikVar.zza = i16 | (b12 << MessageUtils.MESSAGE_21_NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzikVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzikVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzke zzkeVar, zzik zzikVar) {
        zzjy zzjyVar = (zzjy) zzkeVar;
        int iZzj = zzj(bArr, i11, zzikVar);
        zzjyVar.zzh(zzikVar.zza);
        while (iZzj < i12) {
            int iZzj2 = zzj(bArr, iZzj, zzikVar);
            if (i10 != zzikVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzikVar);
            zzjyVar.zzh(zzikVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i10, zzik zzikVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzikVar.zzb = j10;
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
        zzikVar.zzb = j11;
        return i12;
    }

    public static long zzn(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
