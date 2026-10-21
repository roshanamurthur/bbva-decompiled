package com.mypinpad.tsdk.isolation;

import ai.a;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class ari {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53674a = {1, 0, 0, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53675b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53676c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53677d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53678e = 1;

    static {
        int i10 = (0 - (-35)) - 1;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f53678e = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0077  */
    /* JADX WARN: Code duplicated, block: B:13:0x0090  */
    /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0044 A[PHI: r10
      0x0044: PHI (r10v6 int[]) = (r10v5 int[]), (r10v13 int[]) binds: [B:8:0x0042, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object a(Object[] objArr) {
        int[] iArr;
        int[] iArr2;
        int i10;
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i11 = f53677d + 27;
        f53678e = i11 % 128;
        if (i11 % 2 == 0) {
            iArr = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, 1823441057, -1823441048, (int) System.currentTimeMillis());
            if (iArr[34] == -1) {
                int i12 = f53678e;
                int i13 = i12 ^ 27;
                int i14 = ((i12 & 27) | i13) << 1;
                int i15 = -i13;
                int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                f53677d = i16 % 128;
                int i17 = i16 % 2;
                iArr2 = f53674a;
                if (!(!((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue())) {
                    int i18 = f53677d;
                    int i19 = i18 & 87;
                    int i20 = (i18 ^ 87) | i19;
                    i10 = (i19 ^ i20) + ((i20 & i19) << 1);
                    f53678e = i10 % 128;
                    if (i10 % 2 != 0) {
                        ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, -1905808826, 1905808829, (int) System.currentTimeMillis())).intValue();
                        throw null;
                    }
                    ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, -1905808826, 1905808829, (int) System.currentTimeMillis())).intValue();
                    int i21 = f53678e;
                    int i22 = ((i21 ^ 43) - (~((i21 & 43) << 1))) - 1;
                    f53677d = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
        } else {
            iArr = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, 1823441057, -1823441048, (int) System.currentTimeMillis());
            if (iArr[6] == -1) {
                int i110 = f53678e;
                int i111 = i110 ^ 27;
                int i112 = ((i110 & 27) | i111) << 1;
                int i113 = -i111;
                int i114 = ((i112 | i113) << 1) - (i112 ^ i113);
                f53677d = i114 % 128;
                int i115 = i114 % 2;
                iArr2 = f53674a;
                if (!(!((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue())) {
                    int i116 = f53677d;
                    int i117 = i116 & 87;
                    int i24 = (i116 ^ 87) | i117;
                    i10 = (i117 ^ i24) + ((i24 & i117) << 1);
                    f53678e = i10 % 128;
                    if (i10 % 2 != 0) {
                        ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, -1905808826, 1905808829, (int) System.currentTimeMillis())).intValue();
                        throw null;
                    }
                    ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, -1905808826, 1905808829, (int) System.currentTimeMillis())).intValue();
                    int i25 = f53678e;
                    int i26 = ((i25 ^ 43) - (~((i25 & 43) << 1))) - 1;
                    f53677d = i26 % 128;
                    int i27 = i26 % 2;
                }
            }
        }
        int i28 = f53678e;
        int i29 = ((((i28 ^ 77) | (i28 & 77)) << 1) - (~(-(((~i28) & 77) | (i28 & (-78)))))) - 1;
        f53677d = i29 % 128;
        if (i29 % 2 == 0) {
            return iArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0093  */
    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53678e;
        int i11 = i10 & 97;
        int i12 = -(-((i10 ^ 97) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53677d = i13 % 128;
        int i14 = i13 % 2;
        if (((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, 210372306, -210372290, (int) System.currentTimeMillis())).intValue() == 0) {
            int i15 = f53677d;
            int i16 = i15 + 25;
            f53678e = i16 % 128;
            int i17 = i16 % 2;
            if (iArr3[6] == -1) {
                int i18 = (i15 & 77) + (i15 | 77);
                f53678e = i18 % 128;
                int i19 = i18 % 2;
                int[] iArr4 = f53674a;
                if (i19 == 0) {
                    ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr4}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr4}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                    setOnFocusChangeListener(new Object[]{iArr3}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                    int i20 = f53678e;
                    int i21 = i20 & 71;
                    int i22 = (i20 ^ 71) | i21;
                    int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                    f53677d = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
        } else {
            setOnFocusChangeListener(new Object[]{iArr3}, -1360837773, 1360837780, (int) System.currentTimeMillis());
            int i25 = f53678e;
            int i26 = i25 & 71;
            int i27 = (i25 ^ 71) | i26;
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            f53677d = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = f53677d + 93;
        f53678e = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 43 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    /* JADX WARN: Code duplicated, block: B:12:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:23:0x00df  */
    /* JADX WARN: Code duplicated, block: B:25:0x0101  */
    /* JADX WARN: Code duplicated, block: B:27:0x0118  */
    /* JADX WARN: Code duplicated, block: B:28:0x0139  */
    /* JADX WARN: Code duplicated, block: B:8:0x0030  */
    public static /* synthetic */ void c(Object[] objArr) {
        long j10;
        long j11;
        long j12;
        int i10;
        long j13;
        int i11;
        int[] iArr;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr2 = (int[]) objArr[1];
        int i12 = f53678e;
        int i13 = i12 & 31;
        int i14 = (((i12 ^ 31) | i13) << 1) - ((~i13) & (i12 | 31));
        f53677d = i14 % 128;
        if (i14 % 2 != 0) {
            if (iIntValue != 0) {
                long j14 = ((long) iIntValue) & 4294967295L;
                long j15 = (((long) iArr2[0]) & 4294967295L) - j14;
                iArr2[0] = (int) j15;
                j12 = j15 >> 32;
                if (j12 != 0) {
                    i10 = ((i12 & 26) + (i12 | 26)) - 1;
                    f53677d = i10 % 128;
                    if (i10 % 2 != 0) {
                        long j16 = j12 / (((long) iArr2[1]) % 4294967295L);
                        iArr2[1] = (int) j16;
                        long j17 = (j16 >>> 68) / (((long) iArr2[5]) + 4294967295L);
                        iArr2[5] = (int) j17;
                        j13 = j17 << 101;
                    } else {
                        long j18 = j12 + (((long) iArr2[1]) & 4294967295L);
                        iArr2[1] = (int) j18;
                        long j19 = (j18 >> 32) + (((long) iArr2[2]) & 4294967295L);
                        iArr2[2] = (int) j19;
                        j13 = j19 >> 32;
                    }
                    j12 = j13;
                }
                long j20 = (((long) iArr2[3]) & 4294967295L) + j14 + j12;
                iArr2[3] = (int) j20;
                j11 = j20 >> 32;
                int i15 = i12 ^ 1;
                int i16 = -(-((i12 & 1) << 1));
                int i17 = (i15 & i16) + (i15 | i16);
                f53677d = i17 % 128;
                int i18 = i17 % 2;
                j10 = 0;
            } else {
                j11 = 1;
                j10 = 0;
            }
        } else if (iIntValue != 0) {
            long j110 = ((long) iIntValue) & 4294967295L;
            long j111 = (((long) iArr2[0]) & 4294967295L) - j110;
            iArr2[0] = (int) j111;
            j12 = j111 >> 32;
            if (j12 != 0) {
                i10 = ((i12 & 26) + (i12 | 26)) - 1;
                f53677d = i10 % 128;
                if (i10 % 2 != 0) {
                    long j112 = j12 / (((long) iArr2[1]) % 4294967295L);
                    iArr2[1] = (int) j112;
                    long j113 = (j112 >>> 68) / (((long) iArr2[5]) + 4294967295L);
                    iArr2[5] = (int) j113;
                    j13 = j113 << 101;
                } else {
                    long j114 = j12 + (((long) iArr2[1]) & 4294967295L);
                    iArr2[1] = (int) j114;
                    long j115 = (j114 >> 32) + (((long) iArr2[2]) & 4294967295L);
                    iArr2[2] = (int) j115;
                    j13 = j115 >> 32;
                }
                j12 = j13;
            }
            long j21 = (((long) iArr2[3]) & 4294967295L) + j110 + j12;
            iArr2[3] = (int) j21;
            j11 = j21 >> 32;
            int i19 = i12 ^ 1;
            int i110 = -(-((i12 & 1) << 1));
            int i111 = (i19 & i110) + (i19 | i110);
            f53677d = i111 % 128;
            int i112 = i111 % 2;
            j10 = 0;
        } else {
            j10 = 0;
            j11 = 0;
        }
        if (j11 != j10) {
            int i20 = i12 + 121;
            f53677d = i20 % 128;
            int i21 = i20 % 2;
            if (((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr2, 4}, -668114120, 668114158, 7)).intValue() != 0) {
                setOnFocusChangeListener(new Object[]{iArr2}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                int i22 = f53678e;
                int i23 = i22 & 23;
                int i24 = i23 + ((i22 ^ 23) | i23);
                f53677d = i24 % 128;
                int i25 = i24 % 2;
            } else if (iArr2[6] == -1) {
                int i26 = f53677d;
                int i27 = ((((i26 ^ 85) | (i26 & 85)) << 1) - (~(-(((~i26) & 85) | (i26 & (-86)))))) - 1;
                f53678e = i27 % 128;
                i11 = i27 % 2;
                iArr = f53674a;
                if (i11 != 0) {
                    ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                    setOnFocusChangeListener(new Object[]{iArr2}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                    int i28 = f53678e;
                    int i29 = i28 & 23;
                    int i210 = i29 + ((i28 ^ 23) | i29);
                    f53677d = i210 % 128;
                    int i211 = i210 % 2;
                }
            }
        } else if (iArr2[6] == -1) {
            int i212 = f53677d;
            int i213 = ((((i212 ^ 85) | (i212 & 85)) << 1) - (~(-(((~i212) & 85) | (i212 & (-86)))))) - 1;
            f53678e = i213 % 128;
            i11 = i213 % 2;
            iArr = f53674a;
            if (i11 != 0) {
                ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                setOnFocusChangeListener(new Object[]{iArr2}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                int i214 = f53678e;
                int i215 = i214 & 23;
                int i216 = i215 + ((i214 ^ 23) | i215);
                f53677d = i216 % 128;
                int i217 = i216 % 2;
            }
        }
        int i30 = f53677d;
        int i31 = ((((i30 ^ 45) | (i30 & 45)) << 1) - (~(-(((~i30) & 45) | (i30 & (-46)))))) - 1;
        f53678e = i31 % 128;
        if (i31 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ad  */
    public static /* synthetic */ void d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53678e;
        int i11 = i10 | 125;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 125)) & i11);
        int i14 = (i12 & i13) + (i13 | i12);
        f53677d = i14 % 128;
        if (i14 % 2 == 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr, iArr2}, 1108035559, -1108035515, 7)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{20, iArr, iArr2}, 1108035559, -1108035515, 20)).intValue() != 0) {
            setOnFocusChangeListener(new Object[]{iArr2}, -1360837773, 1360837780, (int) System.currentTimeMillis());
            int i15 = f53677d;
            int i16 = (i15 ^ 33) + ((i15 & 33) << 1);
            f53678e = i16 % 128;
            int i17 = i16 % 2;
        } else if (iArr2[6] == -1) {
            int i18 = f53677d;
            int i19 = i18 & 31;
            int i20 = -(-((i18 ^ 31) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f53678e = i21 % 128;
            int i22 = i21 % 2;
            int[] iArr3 = f53674a;
            if (i22 == 0) {
                ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr3}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr3}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                setOnFocusChangeListener(new Object[]{iArr2}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                int i110 = f53677d;
                int i111 = (i110 ^ 33) + ((i110 & 33) << 1);
                f53678e = i111 % 128;
                int i112 = i111 % 2;
            }
        }
        int i23 = f53677d + 91;
        f53678e = i23 % 128;
        int i24 = i23 % 2;
    }

    public static /* synthetic */ void e(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int i10 = f53677d;
        int i11 = i10 & 11;
        int i12 = -(-((i10 ^ 11) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f53678e = i14;
        int i15 = i13 % 2;
        byte[] bArr = new byte[28];
        int i16 = ((i14 ^ 107) | (i14 & 107)) << 1;
        int i17 = -(((~i14) & 107) | (i14 & (-108)));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f53677d = i18 % 128;
        int i19 = i18 % 2;
        do {
            secureRandom.nextBytes(bArr);
            ber.setDividerPadding(new Object[]{bArr, 0, iArr, 7}, 1570947064, -1570947056, 0);
        } while (((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr, f53674a}, -188447753, 188447787, 7)).intValue() == 0);
        int i20 = f53678e;
        int i21 = i20 & 29;
        int i22 = i21 + ((i20 ^ 29) | i21);
        f53677d = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0042 A[PHI: r13
      0x0042: PHI (r13v4 long) = (r13v3 long), (r13v12 long) binds: [B:8:0x0040, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void f(Object[] objArr) {
        long j10;
        int[] iArr = (int[]) objArr[0];
        int i10 = f53678e;
        int i11 = i10 & 43;
        int i12 = -(-((i10 ^ 43) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f53677d = i14;
        if (i13 % 2 != 0) {
            long j11 = ((long) iArr[0]) | 4294967295L;
            iArr[0] = (int) j11;
            j10 = j11 << 70;
            if (j10 != 1) {
                long j12 = j10 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j12;
                long j13 = (j12 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j13;
                j10 = j13 >> 32;
                int i15 = i14 & 9;
                int i16 = -(-((i14 ^ 9) | i15));
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                f53678e = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            long j14 = (((long) iArr[0]) & 4294967295L) - 1;
            iArr[0] = (int) j14;
            j10 = j14 >> 32;
            if (j10 != 0) {
                long j15 = j10 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j15;
                long j16 = (j15 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j16;
                j10 = j16 >> 32;
                int i19 = i14 & 9;
                int i110 = -(-((i14 ^ 9) | i19));
                int i111 = (i19 ^ i110) + ((i19 & i110) << 1);
                f53678e = i111 % 128;
                int i112 = i111 % 2;
            }
        }
        long j17 = (((long) iArr[3]) & 4294967295L) + 1 + j10;
        iArr[3] = (int) j17;
        if ((j17 >> 32) != 0) {
            int i20 = i14 & 13;
            int i21 = (((i14 ^ 13) | i20) << 1) - ((i14 | 13) & (~i20));
            f53678e = i21 % 128;
            int i22 = i21 % 2;
            ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr, 4}, -668114120, 668114158, 7)).intValue();
            int i23 = f53678e + 65;
            f53677d = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = f53677d;
        int i26 = i25 ^ 93;
        int i27 = (i25 & 93) << 1;
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        f53678e = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 60 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005f  */
    public static /* synthetic */ void g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53677d;
        int i11 = ((i10 & (-18)) | ((~i10) & 17)) + ((i10 & 17) << 1);
        f53678e = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr2 = {iArr, iArr2, iArr3};
            int i12 = 8 / 0;
            if (((Integer) avb.setCompoundDrawableTintBlendMode(objArr2, -201684302, 201684313, (int) System.currentTimeMillis())).intValue() != 0) {
                setOnFocusChangeListener(new Object[]{iArr3}, 1700803973, -1700803970, (int) System.currentTimeMillis());
                int i13 = f53678e;
                int i14 = ((i13 & (-94)) | ((~i13) & 93)) + ((i13 & 93) << 1);
                f53677d = i14 % 128;
                int i15 = i14 % 2;
            }
        } else if (((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, -201684302, 201684313, (int) System.currentTimeMillis())).intValue() != 0) {
            setOnFocusChangeListener(new Object[]{iArr3}, 1700803973, -1700803970, (int) System.currentTimeMillis());
            int i16 = f53678e;
            int i17 = ((i16 & (-94)) | ((~i16) & 93)) + ((i16 & 93) << 1);
            f53677d = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = f53677d;
        int i20 = i19 ^ 3;
        int i21 = (((i19 & 3) | i20) << 1) - i20;
        f53678e = i21 % 128;
        if (i21 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void h(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53678e;
        int i11 = ((i10 ^ 65) | (i10 & 65)) << 1;
        int i12 = -(((~i10) & 65) | (i10 & (-66)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f53677d = i14;
        int i15 = i13 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            int i16 = (i14 & 41) + (i14 | 41);
            f53678e = i16 % 128;
            int i17 = i16 % 2;
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
            int i18 = (i14 | 17) << 1;
            int i19 = -(((~i14) & 17) | (i14 & (-18)));
            int i20 = (i18 & i19) + (i19 | i18);
            f53678e = i20 % 128;
            int i21 = i20 % 2;
        }
        long j14 = ((4294967295L & ((long) iArr[3])) - 1) + j11;
        iArr[3] = (int) j14;
        if ((j14 >> 32) != 0) {
            int i22 = f53678e + 45;
            f53677d = i22 % 128;
            int i23 = i22 % 2;
            ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr, 4}, -115920179, 115920214, 7)).intValue();
            int i24 = f53678e;
            int i25 = i24 & 1;
            int i26 = ((((i24 ^ 1) | i25) << 1) - (~(-((i24 | 1) & (~i25))))) - 1;
            f53677d = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = f53678e + 71;
        f53677d = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 68 / 0;
        }
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, -1190829516, 1190829517, (int) System.currentTimeMillis());
    }

    public static int[] setDividerPadding(BigInteger bigInteger) {
        return (int[]) setOnFocusChangeListener(new Object[]{bigInteger}, 1702574152, -1702574144, (int) System.currentTimeMillis());
    }

    public static void setLayoutAnimation(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, 1116618120, -1116618105, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0339  */
    /* JADX WARN: Code duplicated, block: B:29:0x0356  */
    /* JADX WARN: Code duplicated, block: B:31:0x036a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0388  */
    /* JADX WARN: Code duplicated, block: B:53:0x045d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0704  */
    /* JADX WARN: Code duplicated, block: B:85:0x0709  */
    /* JADX WARN: Code duplicated, block: B:87:0x0732  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = ~i12;
        int i16 = (~i10) | i15;
        int i17 = (((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i16))) * 369) + (((~i16) | i11) * (-369)) + ((i10 | i11 | i15) * (-369)) + (i11 * 370) + (i10 * 370);
        int[] iArr = f53674a;
        int i18 = 0;
        switch (i17) {
            case 1:
                g(objArr);
                return null;
            case 2:
                b(objArr);
                return null;
            case 3:
                h(objArr);
                return null;
            case 4:
                c(objArr);
                return null;
            case 5:
                d(objArr);
                return null;
            case 6:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int[] iArr4 = (int[]) objArr[2];
                int i19 = f53678e;
                int i20 = ((i19 ^ 56) + ((i19 & 56) << 1)) - 1;
                f53677d = i20 % 128;
                int i21 = i20 % 2;
                int[] iArr5 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr3, iArr5}, 1112455082, -1112455081, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{iArr5, iArr4}, 1402837881, -1402837870, (int) System.currentTimeMillis());
                int i22 = f53678e + 35;
                f53677d = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 7:
                f(objArr);
                return null;
            case 8:
                return a(objArr);
            case 9:
                e(objArr);
                return null;
            case 10:
                int[] iArr6 = (int[]) objArr[0];
                int[] iArr7 = (int[]) objArr[1];
                int i24 = f53677d;
                int i25 = (((i24 & (-64)) | ((~i24) & 63)) - (~((i24 & 63) << 1))) - 1;
                f53678e = i25 % 128;
                if (i25 % 2 != 0 ? ((Integer) setOnFocusChangeListener(new Object[]{iArr6}, 762268477, -762268464, (int) System.currentTimeMillis())).intValue() == 0 : ((Integer) setOnFocusChangeListener(new Object[]{iArr6}, 762268477, -762268464, (int) System.currentTimeMillis())).intValue() == 0) {
                    ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr6, iArr7}, -201684302, 201684313, (int) System.currentTimeMillis())).intValue();
                    int i26 = f53677d;
                    int i27 = i26 & 13;
                    int i28 = (i26 ^ 13) | i27;
                    int i29 = (i27 & i28) + (i28 | i27);
                    f53678e = i29 % 128;
                    if (i29 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i30 = f53677d;
                int i31 = i30 & 37;
                int i32 = (i30 | 37) & (~i31);
                int i33 = -(-(i31 << 1));
                int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                f53678e = i34 % 128;
                if (i34 % 2 == 0) {
                    ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr, iArr7}, -201684302, 201684313, (int) System.currentTimeMillis())).intValue();
                    int i35 = 92 / 0;
                } else {
                    ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr, iArr7}, -201684302, 201684313, (int) System.currentTimeMillis())).intValue();
                }
                int i36 = f53677d;
                int i37 = ((i36 ^ 69) - (~((i36 & 69) << 1))) - 1;
                f53678e = i37 % 128;
                int i38 = i37 % 2;
                return null;
            case 11:
                int[] iArr8 = (int[]) objArr[0];
                int[] iArr9 = (int[]) objArr[1];
                int i39 = f53677d;
                int i40 = i39 | 115;
                int i41 = i40 << 1;
                int i42 = -(i40 & (~(i39 & 115)));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f53678e = i43 % 128;
                int i44 = i43 % 2;
                long j10 = ((long) iArr8[10]) & 4294967295L;
                long j11 = ((long) iArr8[11]) & 4294967295L;
                long j12 = ((long) iArr8[12]) & 4294967295L;
                long j13 = ((long) iArr8[13]) & 4294967295L;
                long j14 = ((((long) iArr8[7]) & 4294967295L) + j11) - 1;
                long j15 = (((long) iArr8[8]) & 4294967295L) + j12;
                long j16 = (((long) iArr8[9]) & 4294967295L) + j13;
                long j17 = (((long) iArr8[0]) & 4294967295L) - j14;
                long j18 = j17 & 4294967295L;
                long j19 = ((((long) iArr8[1]) & 4294967295L) - j15) + (j17 >> 32);
                int i45 = (int) j19;
                iArr9[1] = i45;
                long j20 = ((((long) iArr8[2]) & 4294967295L) - j16) + (j19 >> 32);
                int i46 = (int) j20;
                iArr9[2] = i46;
                long jG = a.g(((long) iArr8[3]) & 4294967295L, j14, j10, j20 >> 32);
                long j21 = jG & 4294967295L;
                long jG2 = a.g(((long) iArr8[4]) & 4294967295L, j15, j11, jG >> 32);
                iArr9[4] = (int) jG2;
                long jG3 = a.g(((long) iArr8[5]) & 4294967295L, j16, j12, jG2 >> 32);
                iArr9[5] = (int) jG3;
                long jG4 = a.g(((long) iArr8[6]) & 4294967295L, j10, j13, jG3 >> 32);
                iArr9[6] = (int) jG4;
                long j22 = (jG4 >> 32) + 1;
                long j23 = j21 + j22;
                long j24 = j18 - j22;
                iArr9[0] = (int) j24;
                long j25 = j24 >> 32;
                if (j25 != 0) {
                    int i47 = (i39 ^ 21) + ((i39 & 21) << 1);
                    int i48 = i47 % 128;
                    f53678e = i48;
                    int i49 = i47 % 2;
                    long j26 = j25 + (((long) i45) & 4294967295L);
                    iArr9[1] = (int) j26;
                    long j27 = (j26 >> 32) + (((long) i46) & 4294967295L);
                    iArr9[2] = (int) j27;
                    j23 += j27 >> 32;
                    int i50 = (i48 & 57) + (i48 | 57);
                    f53677d = i50 % 128;
                    int i51 = i50 % 2;
                }
                iArr9[3] = (int) j23;
                if ((j23 >> 32) != 0) {
                    int i52 = f53677d + 103;
                    f53678e = i52 % 128;
                    if (i52 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr9, 4}, -668114120, 668114158, 7)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{111, iArr9, 5}, -668114120, 668114158, 111)).intValue() != 0) {
                        setOnFocusChangeListener(new Object[]{iArr9}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                        int i53 = f53677d;
                        int i54 = i53 | 31;
                        int i55 = (i54 << 1) - ((~(i53 & 31)) & i54);
                        f53678e = i55 % 128;
                        int i56 = i55 % 2;
                    } else if (iArr9[6] == -1) {
                        int i57 = f53678e + 69;
                        f53677d = i57 % 128;
                        int i58 = i57 % 2;
                        if (!(!((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr9, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue())) {
                            setOnFocusChangeListener(new Object[]{iArr9}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                            int i59 = f53677d;
                            int i510 = i59 | 31;
                            int i511 = (i510 << 1) - ((~(i59 & 31)) & i510);
                            f53678e = i511 % 128;
                            int i512 = i511 % 2;
                        }
                    }
                } else if (iArr9[6] == -1) {
                    int i513 = f53678e + 69;
                    f53677d = i513 % 128;
                    int i514 = i513 % 2;
                    if (!(!((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr9, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue())) {
                        setOnFocusChangeListener(new Object[]{iArr9}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                        int i515 = f53677d;
                        int i516 = i515 | 31;
                        int i517 = (i516 << 1) - ((~(i515 & 31)) & i516);
                        f53678e = i517 % 128;
                        int i518 = i517 % 2;
                    }
                }
                int i60 = f53678e;
                int i61 = (i60 & 111) + (i60 | 111);
                f53677d = i61 % 128;
                if (i61 % 2 == 0) {
                    return null;
                }
                throw null;
            case 12:
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                int[] iArr10 = (int[]) objArr[1];
                do {
                    setOnFocusChangeListener(new Object[]{secureRandom, iArr10}, 299713023, -299713014, (int) System.currentTimeMillis());
                } while (((Integer) setOnFocusChangeListener(new Object[]{iArr10}, 762268477, -762268464, (int) System.currentTimeMillis())).intValue() != 0);
                int i62 = f53678e + 121;
                f53677d = i62 % 128;
                int i63 = i62 % 2;
                return null;
            case 13:
                int[] iArr11 = (int[]) objArr[0];
                int i64 = f53678e;
                int i65 = (((i64 | 28) << 1) - (i64 ^ 28)) - 1;
                f53677d = i65 % 128;
                int i66 = i65 % 2;
                int i67 = 0;
                while (i18 < 7) {
                    int i68 = f53678e;
                    int i69 = i68 & 85;
                    int i70 = -(-(i68 | 85));
                    int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                    int i72 = i71 % 128;
                    f53677d = i72;
                    int i73 = i71 % 2;
                    int i74 = iArr11[i18];
                    int i75 = i67 & i74;
                    int i76 = (i67 | i74) & (~i75);
                    i67 = (i76 & i75) | (i76 ^ i75);
                    i18++;
                    int i77 = ((i72 | 103) << 1) - (i72 ^ 103);
                    f53678e = i77 % 128;
                    int i78 = i77 % 2;
                }
                int i79 = i67 >>> 1;
                int i80 = i67 & 1;
                int i81 = ((-2) - (((i79 & i80) | (((~i80) & i79) | ((~i79) & i80))) ^ (-1))) >> 31;
                int i82 = f53677d;
                int i83 = (i82 & (-104)) | ((~i82) & 103);
                int i84 = -(-((i82 & 103) << 1));
                int i85 = (i83 & i84) + (i84 | i83);
                f53678e = i85 % 128;
                if (i85 % 2 != 0) {
                    return Integer.valueOf(i81);
                }
                throw null;
            case 14:
                int[] iArr12 = (int[]) objArr[0];
                int[] iArr13 = (int[]) objArr[1];
                int i86 = f53678e;
                int i87 = ((i86 & (-44)) | ((~i86) & 43)) + ((i86 & 43) << 1);
                f53677d = i87 % 128;
                int i88 = i87 % 2;
                ava.setOnFocusChangeListener(new Object[]{iArr, iArr12, iArr13}, 1200653283, -1200653275, (int) System.currentTimeMillis());
                int i89 = f53677d;
                int i90 = ((i89 ^ 101) | (i89 & 101)) << 1;
                int i91 = -(((~i89) & 101) | (i89 & (-102)));
                int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
                f53678e = i92 % 128;
                int i93 = i92 % 2;
                return null;
            case 15:
                int[] iArr14 = (int[]) objArr[0];
                int[] iArr15 = (int[]) objArr[1];
                int i94 = f53677d;
                int i95 = i94 & 57;
                int i96 = -(-((i94 ^ 57) | i95));
                int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                f53678e = i97 % 128;
                if (i97 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr14, 0, iArr15}, -1008052683, 1008052691, 7)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{56, iArr14, 0, iArr15}, -1008052683, 1008052691, 56)).intValue() != 0) {
                    setOnFocusChangeListener(new Object[]{iArr15}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                    int i98 = f53678e + 67;
                    f53677d = i98 % 128;
                    i13 = 2;
                    int i99 = i98 % 2;
                } else {
                    if (iArr15[6] == -1) {
                        int i100 = f53678e + 99;
                        f53677d = i100 % 128;
                        if (i100 % 2 != 0) {
                            ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr15, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr15, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                            setOnFocusChangeListener(new Object[]{iArr15}, -1360837773, 1360837780, (int) System.currentTimeMillis());
                            int i910 = f53678e + 67;
                            f53677d = i910 % 128;
                            i13 = 2;
                            int i911 = i910 % 2;
                        }
                    }
                    i13 = 2;
                }
                int i101 = (-2) - ((f53678e + 86) ^ (-1));
                f53677d = i101 % 128;
                if (i101 % i13 == 0) {
                    return null;
                }
                throw null;
            case 16:
                int[] iArr16 = (int[]) objArr[0];
                int[] iArr17 = (int[]) objArr[1];
                int[] iArr18 = (int[]) objArr[2];
                int i102 = f53677d;
                int i103 = (((i102 | 89) << 1) - (~(-(i102 ^ 89)))) - 1;
                f53678e = i103 % 128;
                int i104 = i103 % 2;
                if (((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr16, iArr17, iArr18}, -1558441269, 1558441282, (int) System.currentTimeMillis())).intValue() == 0) {
                    int i105 = f53678e;
                    int i106 = i105 + 7;
                    f53677d = i106 % 128;
                    int i107 = i106 % 2;
                    if (iArr18[13] == -1) {
                        int i108 = i105 + 13;
                        f53677d = i108 % 128;
                        int i109 = i108 % 2;
                        int[] iArr19 = f53675b;
                        if (i109 == 0 ? ((Boolean) auy.setOnFocusChangeListener(new Object[]{14, iArr18, iArr19}, 280624047, -280624046, 14)).booleanValue() : ((Boolean) auy.setOnFocusChangeListener(new Object[]{24, iArr18, iArr19}, 280624047, -280624046, 24)).booleanValue()) {
                            if (((Integer) auy.setOnFocusChangeListener(new Object[]{11, f53676c, iArr18}, -1807856331, 1807856377, 11)).intValue() != 0) {
                                int i110 = f53677d;
                                int i111 = i110 & 3;
                                i14 = (((i110 ^ 3) | i111) << 1) - ((i110 | 3) & (~i111));
                                f53678e = i14 % 128;
                                if (i14 % 2 == 0) {
                                    ((Integer) auy.setOnFocusChangeListener(new Object[]{34, iArr18, 11}, -668114120, 668114158, 34)).intValue();
                                } else {
                                    ((Integer) auy.setOnFocusChangeListener(new Object[]{14, iArr18, 11}, -668114120, 668114158, 14)).intValue();
                                }
                            }
                        }
                    }
                } else if (((Integer) auy.setOnFocusChangeListener(new Object[]{11, f53676c, iArr18}, -1807856331, 1807856377, 11)).intValue() != 0) {
                    int i112 = f53677d;
                    int i113 = i112 & 3;
                    i14 = (((i112 ^ 3) | i113) << 1) - ((i112 | 3) & (~i113));
                    f53678e = i14 % 128;
                    if (i14 % 2 == 0) {
                        ((Integer) auy.setOnFocusChangeListener(new Object[]{34, iArr18, 11}, -668114120, 668114158, 34)).intValue();
                    } else {
                        ((Integer) auy.setOnFocusChangeListener(new Object[]{14, iArr18, 11}, -668114120, 668114158, 14)).intValue();
                    }
                }
                int i114 = f53678e;
                int i115 = ((i114 ^ 58) + ((i114 & 58) << 1)) - 1;
                f53677d = i115 % 128;
                if (i115 % 2 == 0) {
                    return null;
                }
                int i116 = 48 / 0;
                return null;
            case 17:
                int[] iArr20 = (int[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int[] iArr21 = (int[]) objArr[2];
                int i117 = f53677d;
                int i118 = i117 ^ 77;
                int i119 = ((((i117 & 77) | i118) << 1) - (~(-i118))) - 1;
                f53678e = i119 % 128;
                int i120 = i119 % 2;
                int[] iArr22 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                avb.setCompoundDrawableTintBlendMode(new Object[]{iArr20, iArr22}, 1407394238, -1407394231, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{iArr22, iArr21}, 1402837881, -1402837870, (int) System.currentTimeMillis());
                int i121 = f53678e;
                int i122 = (((i121 & (-12)) | ((~i121) & 11)) - (~((i121 & 11) << 1))) - 1;
                f53677d = i122 % 128;
                int i123 = i122 % 2;
                while (true) {
                    iIntValue = (-2) - (~iIntValue);
                    if (iIntValue <= 0) {
                        int i124 = f53677d;
                        int i125 = ((i124 | 47) << 1) - (i124 ^ 47);
                        f53678e = i125 % 128;
                        if (i125 % 2 != 0) {
                            return null;
                        }
                        int i126 = 51 / 0;
                        return null;
                    }
                    int i127 = f53677d;
                    int i128 = (((i127 | 70) << 1) - (i127 ^ 70)) - 1;
                    f53678e = i128 % 128;
                    int i129 = i128 % 2;
                    avb.setCompoundDrawableTintBlendMode(new Object[]{iArr21, iArr22}, 1407394238, -1407394231, (int) System.currentTimeMillis());
                    setOnFocusChangeListener(new Object[]{iArr22, iArr21}, 1402837881, -1402837870, (int) System.currentTimeMillis());
                    int i130 = f53678e;
                    int i131 = ((i130 & 93) - (~(i130 | 93))) - 1;
                    f53677d = i131 % 128;
                    int i132 = i131 % 2;
                }
                break;
            default:
                int[] iArr23 = (int[]) objArr[0];
                int[] iArr24 = (int[]) objArr[1];
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i133 = ~iCurrentTimeMillis;
                int i134 = ((-514577183) & i133) | (iCurrentTimeMillis & 514577182);
                int i135 = (-514577183) & iCurrentTimeMillis;
                int i136 = ~((i134 ^ i135) | (i134 & i135));
                int i137 = (44798478 & (~i136)) | (i136 & (-44798479));
                int i138 = 44798478 & i136;
                int i139 = (i137 ^ i138) | (i138 & i137);
                int i140 = (iCurrentTimeMillis | i133) & i133;
                int i141 = i140 & 581680719;
                int i142 = (i140 | 581680719) & (~i141);
                int i143 = (i142 & i141) | (i142 ^ i141);
                int i144 = ((-514577183) & i143) | (514577182 & (~i143));
                int i145 = i143 & 514577182;
                int i146 = ~((i145 & i144) | (i144 ^ i145));
                int i147 = i139 ^ i146;
                int i148 = i146 & i139;
                int i149 = -(-(((i148 & i147) | (i147 ^ i148)) * 886));
                int i150 = (393491053 ^ i149) + ((i149 & 393491053) << 1);
                int i151 = ~(i133 | 514577182);
                int i152 = ((~i151) & 581680719) | ((-581680720) & i151);
                int i153 = i151 & 581680719;
                int i154 = ((i153 & i152) | (i152 ^ i153)) * (-1772);
                int i155 = (i150 ^ i154) + ((i154 & i150) << 1);
                int i156 = i133 ^ 581680719;
                int i157 = i133 & 581680719;
                int i158 = (i156 & i157) | (i156 ^ i157);
                int i159 = ~i158;
                int i160 = -(~(-(-(((i158 | i159) & i159) * 886))));
                int i161 = (-2) - ((((i155 | i160) << 1) - (i160 ^ i155)) ^ (-1));
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i162 = ~iCurrentTimeMillis2;
                int i163 = (iCurrentTimeMillis2 | i162) & i162;
                int i164 = i163 & (-1539233582);
                int i165 = ((~i163) & 1539233581) | i164;
                int i166 = i163 & 1539233581;
                int i167 = (i165 ^ i166) | (i165 & i166);
                int i168 = (i167 ^ (-321805123)) | (i167 & (-321805123));
                int i169 = ~i168;
                int i170 = -(~(-(-((i169 & (i168 | i169)) * 52))));
                int i171 = (-2) - ((((-1067303638) & i170) + (i170 | (-1067303638))) ^ (-1));
                int i172 = 321805122 ^ i163;
                int i173 = 321805122 & i163;
                int i174 = ~((i172 ^ i173) | (i173 & i172));
                int i175 = i174 & (-1539235696);
                int i176 = i175 | ((i174 | (-1539235696)) & (~i175));
                int i177 = ~((i162 & 1539233581) | (i162 ^ 1539233581));
                int i178 = -(-(((i177 & i176) | (i176 ^ i177)) * (-52)));
                int i179 = ((i171 ^ i178) | (i171 & i178)) << 1;
                int i180 = -((i178 & (~i171)) | ((~i178) & i171));
                int i181 = (i179 & i180) + (i180 | i179);
                int i182 = ~((i163 ^ (-1539233582)) | i164);
                int i183 = ((-321803009) & i182) | ((~i182) & 321803008);
                int i184 = i182 & 321803008;
                if (i161 > (((i184 & i183) | (i183 ^ i184)) * 52) + i181) {
                    int[] iArr25 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                    avb.setCompoundDrawableTintBlendMode(new Object[]{iArr23, iArr25}, 1407394238, -1407394231, (int) System.currentTimeMillis());
                    setOnFocusChangeListener(new Object[]{iArr25, iArr24}, 1402837881, -1402837870, (int) System.currentTimeMillis());
                    int i185 = 87 / 0;
                } else {
                    int[] iArr26 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                    avb.setCompoundDrawableTintBlendMode(new Object[]{iArr23, iArr26}, 1407394238, -1407394231, (int) System.currentTimeMillis());
                    setOnFocusChangeListener(new Object[]{iArr26, iArr24}, 1402837881, -1402837870, (int) System.currentTimeMillis());
                }
                int i186 = f53677d;
                int i187 = (i186 ^ 93) + ((i186 & 93) << 1);
                f53678e = i187 % 128;
                int i188 = i187 % 2;
                return null;
        }
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 2139494229, -2139494213, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int i10, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, Integer.valueOf(i10), iArr2}, -1413376143, 1413376160, i10);
    }

    public static void setCompoundDrawableTintBlendMode(int i10, int[] iArr) {
        setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr}, 133532328, -133532324, i10);
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, 905209294, -905209289, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, 233739961, -233739947, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -480701941, 480701951, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, 1402837881, -1402837870, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 1075082301, -1075082295, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(SecureRandom secureRandom, int[] iArr) {
        setOnFocusChangeListener(new Object[]{secureRandom, iArr}, 1035719548, -1035719536, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -779819085, 779819085, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 250520891, -250520889, (int) System.currentTimeMillis());
    }
}
