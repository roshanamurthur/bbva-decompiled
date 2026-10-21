package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import okio.Utf8;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzha {
    public static /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzen {
        if (!zze(b11)) {
            if ((((b11 + Constants.CVR_B1b85_0111_VERIFIED_CLOUD) + (b10 << 28)) >> 30) == 0 && !zze(b12) && !zze(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw zzen.zzc();
    }

    public static /* synthetic */ void zzb(byte b10, byte b11, char[] cArr, int i10) throws zzen {
        if (b10 < -62 || zze(b11)) {
            throw zzen.zzc();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* synthetic */ void zzc(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzen {
        if (!zze(b11)) {
            if (b10 != -32) {
                if (b10 != -19) {
                    if (!zze(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!zze(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                }
            } else if (b11 >= -96) {
                b10 = -32;
                if (b10 != -19) {
                    if (!zze(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!zze(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                }
            }
        }
        throw zzen.zzc();
    }

    public static /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    private static boolean zze(byte b10) {
        return b10 > -65;
    }
}
