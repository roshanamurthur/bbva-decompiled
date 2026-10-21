package com.google.android.gms.internal.measurement;

import androidx.fragment.app.a;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzmq {
    private static final zzmn zza;

    static {
        if (zzml.zzx() && zzml.zzy()) {
            int i10 = zzij.zza;
        }
        zza = new zzmo();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else {
                if (i12 != 2) {
                    throw new AssertionError();
                }
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    public static int zzb(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        int length = charSequence.length();
        int i14 = i11 + i10;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = charSequence.charAt(i15)) < 128) {
            bArr[i13] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = charSequence.charAt(i15);
            if (cCharAt2 < 128 && i16 < i14) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                i16 += 2;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i16 > i14 - 3) {
                    if (i16 > i14 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                            throw new zzmp(i15, length);
                        }
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt2);
                        sb2.append(" at index ");
                        sb2.append(i16);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i18 = i15 + 1;
                    if (i18 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i18);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i19 = i16 + 3;
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i19] = (byte) ((codePoint & 63) | 128);
                            i15 = i18;
                        } else {
                            i15 = i18;
                        }
                    }
                    throw new zzmp(i15 - 1, length);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i20 = i16 + 2;
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i16 += 3;
                bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
            }
            i15++;
        }
        return i16;
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new zzmp(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sbA = a.a(54, "UTF-8 length does not fit in int: ");
        sbA.append(((long) i12) + SvgConstantsKt.SPECIFIED_SOLID_OPACITY);
        throw new IllegalArgumentException(sbA.toString());
    }

    public static String zzd(byte[] bArr, int i10, int i11) throws zzkh {
        int length = bArr.length;
        if ((i10 | i11 | ((length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!zzmm.zzd(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (zzmm.zzd(b11)) {
                cArr[i13] = (char) b11;
                i13++;
                i10 = i14;
                while (i10 < i12) {
                    byte b12 = bArr[i10];
                    if (!zzmm.zzd(b12)) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) b12;
                    i13++;
                }
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw zzkh.zzc();
                }
                i10 += 2;
                zzmm.zzb(b11, bArr[i14], cArr, i13);
                i13++;
            } else if (b11 < -16) {
                if (i14 >= i12 - 1) {
                    throw zzkh.zzc();
                }
                int i15 = i10 + 2;
                i10 += 3;
                zzmm.zzc(b11, bArr[i14], bArr[i15], cArr, i13);
                i13++;
            } else {
                if (i14 >= i12 - 2) {
                    throw zzkh.zzc();
                }
                int i16 = i10 + 2;
                int i17 = i10 + 3;
                i10 += 4;
                zzmm.zza(b11, bArr[i14], bArr[i16], bArr[i17], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i10, int i11) {
        return zza.zzb(bArr, i10, i11);
    }
}
