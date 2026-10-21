package com.fasterxml.jackson.core.io;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class NumberOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43062a = String.valueOf(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f43063b = String.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f43064c = new int[1000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f43065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f43066e;

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int i13 = 0;
                while (i13 < 10) {
                    f43064c[i10] = ((i11 + 48) << 16) | ((i12 + 48) << 8) | (i13 + 48);
                    i13++;
                    i10++;
                }
            }
        }
        f43065d = new String[]{"0", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", StorageTokenBuilder.OTP_LENGTH, "7", "8", "9", "10"};
        f43066e = new String[]{"-1", "-2", "-3", "-4", "-5", EglobalUtils.INVALID_ISSUER_AUTHENTICATION, "-7", "-8", "-9", "-10"};
    }

    public static int a(int i10, int i11, byte[] bArr) {
        int i12 = f43064c[i10];
        bArr[i11] = (byte) (i12 >> 16);
        int i13 = i11 + 2;
        bArr[i11 + 1] = (byte) (i12 >> 8);
        int i14 = i11 + 3;
        bArr[i13] = (byte) i12;
        return i14;
    }

    public static int b(int i10, char[] cArr, int i11) {
        int i12 = f43064c[i10];
        cArr[i11] = (char) (i12 >> 16);
        int i13 = i11 + 2;
        cArr[i11 + 1] = (char) ((i12 >> 8) & 127);
        int i14 = i11 + 3;
        cArr[i13] = (char) (i12 & 127);
        return i14;
    }

    public static int c(int i10, int i11, byte[] bArr) {
        int i12 = f43064c[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                bArr[i11] = (byte) (i12 >> 16);
                i11++;
            }
            bArr[i11] = (byte) (i12 >> 8);
            i11++;
        }
        int i13 = i11 + 1;
        bArr[i11] = (byte) i12;
        return i13;
    }

    public static int d(int i10, char[] cArr, int i11) {
        int i12 = f43064c[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i11] = (char) (i12 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i12 >> 8) & 127);
            i11++;
        }
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 & 127);
        return i13;
    }

    public static int e(int i10, int i11, byte[] bArr) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int i15 = i12 - (i14 * 1000);
        int[] iArr = f43064c;
        int i16 = iArr[i14];
        bArr[i11] = (byte) (i16 >> 16);
        bArr[i11 + 1] = (byte) (i16 >> 8);
        bArr[i11 + 2] = (byte) i16;
        int i17 = iArr[i15];
        bArr[i11 + 3] = (byte) (i17 >> 16);
        bArr[i11 + 4] = (byte) (i17 >> 8);
        bArr[i11 + 5] = (byte) i17;
        int i18 = iArr[i13];
        bArr[i11 + 6] = (byte) (i18 >> 16);
        int i19 = i11 + 8;
        bArr[i11 + 7] = (byte) (i18 >> 8);
        int i20 = i11 + 9;
        bArr[i19] = (byte) i18;
        return i20;
    }

    public static int f(int i10, char[] cArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int[] iArr = f43064c;
        int i15 = iArr[i14];
        cArr[i11] = (char) (i15 >> 16);
        cArr[i11 + 1] = (char) ((i15 >> 8) & 127);
        cArr[i11 + 2] = (char) (i15 & 127);
        int i16 = iArr[i12 - (i14 * 1000)];
        cArr[i11 + 3] = (char) (i16 >> 16);
        cArr[i11 + 4] = (char) ((i16 >> 8) & 127);
        cArr[i11 + 5] = (char) (i16 & 127);
        int i17 = iArr[i13];
        cArr[i11 + 6] = (char) (i17 >> 16);
        int i18 = i11 + 8;
        cArr[i11 + 7] = (char) ((i17 >> 8) & 127);
        int i19 = i11 + 9;
        cArr[i18] = (char) (i17 & 127);
        return i19;
    }

    public static int outputInt(int i10, char[] cArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                String str = f43062a;
                int length = str.length();
                str.getChars(0, length, cArr, i11);
                return length + i11;
            }
            cArr[i11] = '-';
            i10 = -i10;
            i11++;
        }
        if (i10 < 1000000) {
            if (i10 >= 1000) {
                int i13 = i10 / 1000;
                return b(i10 - (i13 * 1000), cArr, d(i13, cArr, i11));
            }
            if (i10 >= 10) {
                return d(i10, cArr, i11);
            }
            cArr[i11] = (char) (i10 + 48);
            return i11 + 1;
        }
        if (i10 < 1000000000) {
            int i14 = i10 / 1000;
            int i15 = i14 / 1000;
            return b(i10 - (i14 * 1000), cArr, b(i14 - (i15 * 1000), cArr, d(i15, cArr, i11)));
        }
        int i16 = i10 - 1000000000;
        if (i16 >= 1000000000) {
            i16 = i10 - 2000000000;
            i12 = i11 + 1;
            cArr[i11] = '2';
        } else {
            i12 = i11 + 1;
            cArr[i11] = '1';
        }
        return f(i16, cArr, i12);
    }

    public static int outputLong(long j10, char[] cArr, int i10) {
        int iF;
        if (j10 < 0) {
            if (j10 > -2147483648L) {
                return outputInt((int) j10, cArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                String str = f43063b;
                int length = str.length();
                str.getChars(0, length, cArr, i10);
                return length + i10;
            }
            cArr[i10] = '-';
            j10 = -j10;
            i10++;
        } else if (j10 <= 2147483647L) {
            return outputInt((int) j10, cArr, i10);
        }
        long j11 = j10 / 1000000000;
        long j12 = j10 - (j11 * 1000000000);
        if (j11 < 1000000000) {
            int i11 = (int) j11;
            int[] iArr = f43064c;
            if (i11 >= 1000000) {
                int i12 = i11 / 1000;
                int i13 = i11 - (i12 * 1000);
                int i14 = i12 / 1000;
                int iD = d(i14, cArr, i10);
                int i15 = iArr[i12 - (i14 * 1000)];
                cArr[iD] = (char) (i15 >> 16);
                cArr[iD + 1] = (char) ((i15 >> 8) & 127);
                cArr[iD + 2] = (char) (i15 & 127);
                int i16 = iArr[i13];
                cArr[iD + 3] = (char) (i16 >> 16);
                int i17 = iD + 5;
                cArr[iD + 4] = (char) ((i16 >> 8) & 127);
                iF = iD + 6;
                cArr[i17] = (char) (i16 & 127);
            } else if (i11 < 1000) {
                iF = d(i11, cArr, i10);
            } else {
                int i18 = i11 / 1000;
                int i19 = i11 - (i18 * 1000);
                int i20 = iArr[i18];
                if (i18 > 9) {
                    if (i18 > 99) {
                        cArr[i10] = (char) (i20 >> 16);
                        i10++;
                    }
                    cArr[i10] = (char) ((i20 >> 8) & 127);
                    i10++;
                }
                cArr[i10] = (char) (i20 & 127);
                int i21 = iArr[i19];
                cArr[i10 + 1] = (char) (i21 >> 16);
                int i22 = i10 + 3;
                cArr[i10 + 2] = (char) ((i21 >> 8) & 127);
                iF = i10 + 4;
                cArr[i22] = (char) (i21 & 127);
            }
        } else {
            long j13 = j11 / 1000000000;
            int iD2 = d((int) j13, cArr, i10);
            iF = f((int) (j11 - (1000000000 * j13)), cArr, iD2);
        }
        return f((int) j12, cArr, iF);
    }

    public static String toString(int i10) {
        String[] strArr = f43065d;
        if (i10 < strArr.length) {
            if (i10 >= 0) {
                return strArr[i10];
            }
            int i11 = (-i10) - 1;
            String[] strArr2 = f43066e;
            if (i11 < strArr2.length) {
                return strArr2[i11];
            }
        }
        return Integer.toString(i10);
    }

    public static String toString(long j10) {
        if (j10 <= 2147483647L && j10 >= -2147483648L) {
            return toString((int) j10);
        }
        return Long.toString(j10);
    }

    public static String toString(double d2) {
        return Double.toString(d2);
    }

    public static String toString(float f6) {
        return Float.toString(f6);
    }

    public static int outputInt(int i10, byte[] bArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                String str = f43062a;
                int length = str.length();
                int i13 = 0;
                while (i13 < length) {
                    bArr[i11] = (byte) str.charAt(i13);
                    i13++;
                    i11++;
                }
                return i11;
            }
            bArr[i11] = 45;
            i10 = -i10;
            i11++;
        }
        if (i10 < 1000000) {
            if (i10 >= 1000) {
                int i14 = i10 / 1000;
                return a(i10 - (i14 * 1000), c(i14, i11, bArr), bArr);
            }
            if (i10 < 10) {
                int i15 = i11 + 1;
                bArr[i11] = (byte) (i10 + 48);
                return i15;
            }
            return c(i10, i11, bArr);
        }
        if (i10 >= 1000000000) {
            int i16 = i10 - 1000000000;
            if (i16 >= 1000000000) {
                i16 = i10 - 2000000000;
                i12 = i11 + 1;
                bArr[i11] = 50;
            } else {
                i12 = i11 + 1;
                bArr[i11] = 49;
            }
            return e(i16, i12, bArr);
        }
        int i17 = i10 / 1000;
        int i18 = i17 / 1000;
        return a(i10 - (i17 * 1000), a(i17 - (i18 * 1000), c(i18, i11, bArr), bArr), bArr);
    }

    public static int outputLong(long j10, byte[] bArr, int i10) {
        int iE;
        if (j10 < 0) {
            if (j10 > -2147483648L) {
                return outputInt((int) j10, bArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                String str = f43063b;
                int length = str.length();
                int i11 = 0;
                while (i11 < length) {
                    bArr[i10] = (byte) str.charAt(i11);
                    i11++;
                    i10++;
                }
                return i10;
            }
            bArr[i10] = 45;
            j10 = -j10;
            i10++;
        } else if (j10 <= 2147483647L) {
            return outputInt((int) j10, bArr, i10);
        }
        long j11 = j10 / 1000000000;
        long j12 = j10 - (j11 * 1000000000);
        if (j11 < 1000000000) {
            int i12 = (int) j11;
            int[] iArr = f43064c;
            if (i12 >= 1000000) {
                int i13 = i12 / 1000;
                int i14 = i12 - (i13 * 1000);
                int i15 = i13 / 1000;
                int iC = c(i15, i10, bArr);
                int i16 = iArr[i13 - (i15 * 1000)];
                bArr[iC] = (byte) (i16 >> 16);
                bArr[iC + 1] = (byte) (i16 >> 8);
                bArr[iC + 2] = (byte) i16;
                int i17 = iArr[i14];
                bArr[iC + 3] = (byte) (i17 >> 16);
                int i18 = iC + 5;
                bArr[iC + 4] = (byte) (i17 >> 8);
                iE = iC + 6;
                bArr[i18] = (byte) i17;
            } else if (i12 < 1000) {
                iE = c(i12, i10, bArr);
            } else {
                int i19 = i12 / 1000;
                int i20 = i12 - (i19 * 1000);
                int i21 = iArr[i19];
                if (i19 > 9) {
                    if (i19 > 99) {
                        bArr[i10] = (byte) (i21 >> 16);
                        i10++;
                    }
                    bArr[i10] = (byte) (i21 >> 8);
                    i10++;
                }
                bArr[i10] = (byte) i21;
                int i22 = iArr[i20];
                bArr[i10 + 1] = (byte) (i22 >> 16);
                int i23 = i10 + 3;
                bArr[i10 + 2] = (byte) (i22 >> 8);
                iE = i10 + 4;
                bArr[i23] = (byte) i22;
            }
        } else {
            long j13 = j11 / 1000000000;
            int iC2 = c((int) j13, i10, bArr);
            iE = e((int) (j11 - (1000000000 * j13)), iC2, bArr);
        }
        return e((int) j12, iE, bArr);
    }
}
