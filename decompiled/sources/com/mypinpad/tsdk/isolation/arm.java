package com.mypinpad.tsdk.isolation;

import ai.a;
import androidx.camera.camera2.internal.n1;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class arm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53687a = {-1, -1, -1, 0, 0, 0, 1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53688b = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53689c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53690d = 1;

    static {
        int i10 = 56 - 1;
        f53690d = i10 % 128;
        int i11 = i10 % 2;
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int[] iArr3 = (int[]) objArr[3];
        int i10 = f53690d;
        int i11 = (i10 ^ 57) + ((i10 & 57) << 1);
        f53689c = i11 % 128;
        int i12 = i11 % 2;
        avf.setX(new Object[]{iArr, iArr3}, -44054691, 44054719, (int) System.currentTimeMillis());
        setX(new Object[]{iArr3, iArr2}, 1883843384, -1883843371, (int) System.currentTimeMillis());
        int i13 = f53689c;
        int i14 = i13 & 41;
        int i15 = i14 + ((i13 ^ 41) | i14);
        while (true) {
            f53690d = i15 % 128;
            int i16 = i15 % 2;
            int i17 = -(~iIntValue);
            iIntValue = ((-2) & i17) + (i17 | (-2));
            if (iIntValue <= 0) {
                break;
            }
            int i18 = f53689c;
            int i19 = (((i18 ^ 109) | (i18 & 109)) << 1) - (((~i18) & 109) | (i18 & (-110)));
            f53690d = i19 % 128;
            int i20 = i19 % 2;
            avf.setX(new Object[]{iArr2, iArr3}, -44054691, 44054719, (int) System.currentTimeMillis());
            setX(new Object[]{iArr3, iArr2}, 1883843384, -1883843371, (int) System.currentTimeMillis());
            int i21 = f53689c;
            i15 = (((i21 | 2) << 1) - (i21 ^ 2)) - 1;
        }
        int i22 = f53689c;
        int i23 = (i22 ^ 33) + ((i22 & 33) << 1);
        f53690d = i23 % 128;
        if (i23 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53689c;
        int i11 = ((i10 ^ 90) + ((i10 & 90) << 1)) - 1;
        f53690d = i11 % 128;
        int i12 = i11 % 2;
        if (((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue() != 0) {
            int i13 = f53689c;
            int i14 = ((i13 | 7) << 1) - (i13 ^ 7);
            f53690d = i14 % 128;
            int i15 = i14 % 2;
            setX(new Object[]{iArr3}, -964764999, 964765018, (int) System.currentTimeMillis());
            int i16 = f53690d;
            int i17 = i16 & 97;
            int i18 = -(-(i16 | 97));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f53689c = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = f53689c;
        int i22 = (((i21 & (-96)) | ((~i21) & 95)) - (~(-(-((i21 & 95) << 1))))) - 1;
        f53690d = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53690d;
        int i11 = i10 & 49;
        int i12 = -(-((i10 ^ 49) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f53689c = i13 % 128;
        int i14 = i13 % 2;
        int[] iArr3 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
        avf.setX(new Object[]{iArr, iArr3}, -44054691, 44054719, (int) System.currentTimeMillis());
        setX(new Object[]{iArr3, iArr2}, 1883843384, -1883843371, (int) System.currentTimeMillis());
        int i15 = (-2) - ((f53689c + 38) ^ (-1));
        f53690d = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53689c;
        int i11 = i10 & 9;
        int i12 = (i10 | 9) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f53690d = i14 % 128;
        int i15 = i14 % 2;
        int iIntValue = ((Integer) setX(new Object[]{iArr}, -8084230, 8084234, (int) System.currentTimeMillis())).intValue();
        int[] iArr3 = f53687a;
        if (iIntValue == 0) {
            ((Integer) avf.setX(new Object[]{iArr3, iArr, iArr2}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
            int i16 = f53690d;
            int i17 = i16 & 41;
            int i18 = ((((i16 ^ 41) | i17) << 1) - (~(-((i16 | 41) & (~i17))))) - 1;
            f53689c = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i19 = f53690d;
        int i20 = (i19 & 103) + (i19 | 103);
        f53689c = i20 % 128;
        int i21 = i20 % 2;
        ((Integer) avf.setX(new Object[]{iArr3, iArr3, iArr2}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
        int i22 = f53690d;
        int i23 = i22 & 125;
        int i24 = ((i22 ^ 125) | i23) << 1;
        int i25 = -((i22 | 125) & (~i23));
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        f53689c = i26 % 128;
        int i27 = i26 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0090  */
    public static /* synthetic */ void e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53689c;
        int i11 = ((i10 ^ 5) | (i10 & 5)) << 1;
        int i12 = -(((~i10) & 5) | (i10 & (-6)));
        int i13 = (i11 & i12) + (i12 | i11);
        f53690d = i13 % 128;
        int i14 = i13 % 2;
        int iIntValue = ((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, 340994627, -340994605, (int) System.currentTimeMillis())).intValue();
        int[] iArr4 = f53688b;
        if (iIntValue == 0) {
            int i15 = f53689c;
            int i16 = i15 & 49;
            int i17 = (((i15 | 49) & (~i16)) - (~(-(-(i16 << 1))))) - 1;
            f53690d = i17 % 128;
            if (i17 % 2 != 0 ? (iArr3[15] >>> 1) >= Integer.MAX_VALUE : iArr3[68] / 0 >= Integer.MAX_VALUE) {
                if (((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr3, iArr4}, 280624047, -280624046, 16)).booleanValue()) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr4, iArr3}, 562472640, -562472619, 16)).intValue();
                    int i18 = f53689c;
                    int i19 = i18 & 47;
                    int i20 = (i18 | 47) & (~i19);
                    int i21 = -(-(i19 << 1));
                    int i22 = (i20 & i21) + (i20 | i21);
                    f53690d = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
        } else {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr4, iArr3}, 562472640, -562472619, 16)).intValue();
            int i110 = f53689c;
            int i111 = i110 & 47;
            int i24 = (i110 | 47) & (~i111);
            int i25 = -(-(i111 << 1));
            int i26 = (i24 & i25) + (i24 | i25);
            f53690d = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = f53689c;
        int i29 = i28 ^ 79;
        int i30 = -(-((i28 & 79) << 1));
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        f53690d = i31 % 128;
        if (i31 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0043  */
    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    /* JADX WARN: Code duplicated, block: B:15:0x0065 A[PHI: r5 r7
      0x0065: PHI (r5v8 long) = (r5v7 long), (r5v10 long) binds: [B:14:0x0063, B:11:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r7v6 long) = (r7v5 long), (r7v21 long) binds: [B:14:0x0063, B:11:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0187  */
    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    public static /* synthetic */ void f(Object[] objArr) {
        long j10;
        int i10;
        long j11;
        long j12;
        long j13;
        long j14;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i11 = f53690d;
        int i12 = (i11 ^ 29) + ((i11 & 29) << 1);
        int i13 = i12 % 128;
        f53689c = i13;
        long j15 = 1;
        if (i12 % 2 != 0) {
            if (iIntValue != 0) {
                int i14 = i13 & 49;
                int i15 = -(-((i13 ^ 49) | i14));
                i10 = ((i14 | i15) << 1) - (i14 ^ i15);
                f53690d = i10 % 128;
                j11 = iIntValue;
                if (i10 % 2 == 0) {
                    j12 = j11 % 4294967295L;
                    long j16 = 1 | ((((long) iArr[0]) ^ 4294967295L) ^ j12);
                    iArr[0] = (int) j16;
                    j13 = j16 >> 30;
                    if (j13 != 0) {
                        int i16 = ((i13 ^ 5) | (i13 & 5)) << 1;
                        int i17 = -((i13 & (-6)) | ((~i13) & 5));
                        int i18 = (i16 & i17) + (i16 | i17);
                        f53690d = i18 % 128;
                        int i19 = i18 % 2;
                        long j17 = j13 + (((long) iArr[1]) & 4294967295L);
                        iArr[1] = (int) j17;
                        long j18 = (j17 >> 32) + (((long) iArr[2]) & 4294967295L);
                        iArr[2] = (int) j18;
                        j13 = j18 >> 32;
                        int i20 = ((i13 | 16) << 1) - (i13 ^ 16);
                        int i21 = (i20 ^ (-1)) + (i20 << 1);
                        f53690d = i21 % 128;
                        int i22 = i21 % 2;
                    }
                } else {
                    j12 = j11 & 4294967295L;
                    long j19 = (((long) iArr[0]) & 4294967295L) + j12;
                    iArr[0] = (int) j19;
                    j13 = j19 >> 32;
                    if (j13 != 0) {
                        int i110 = ((i13 ^ 5) | (i13 & 5)) << 1;
                        int i111 = -((i13 & (-6)) | ((~i13) & 5));
                        int i112 = (i110 & i111) + (i110 | i111);
                        f53690d = i112 % 128;
                        int i113 = i112 % 2;
                        long j110 = j13 + (((long) iArr[1]) & 4294967295L);
                        iArr[1] = (int) j110;
                        long j111 = (j110 >> 32) + (((long) iArr[2]) & 4294967295L);
                        iArr[2] = (int) j111;
                        j13 = j111 >> 32;
                        int i23 = ((i13 | 16) << 1) - (i13 ^ 16);
                        int i24 = (i23 ^ (-1)) + (i23 << 1);
                        f53690d = i24 % 128;
                        int i25 = i24 % 2;
                    }
                }
                long j20 = ((((long) iArr[3]) & 4294967295L) - j12) + j13;
                iArr[3] = (int) j20;
                j14 = j20 >> 32;
                if (j14 != 0) {
                    int i26 = f53690d;
                    int i27 = ((i26 | 67) << 1) - (i26 ^ 67);
                    int i28 = i27 % 128;
                    f53689c = i28;
                    int i29 = i27 % 2;
                    long j21 = j14 + (((long) iArr[4]) & 4294967295L);
                    iArr[4] = (int) j21;
                    long j22 = (j21 >> 32) + (((long) iArr[5]) & 4294967295L);
                    iArr[5] = (int) j22;
                    j14 = j22 >> 32;
                    int i30 = (i28 ^ 37) + ((i28 & 37) << 1);
                    f53690d = i30 % 128;
                    int i31 = i30 % 2;
                }
                long j23 = ((((long) iArr[6]) & 4294967295L) - j12) + j14;
                iArr[6] = (int) j23;
                long j24 = (((long) iArr[7]) & 4294967295L) + j12 + (j23 >> 32);
                iArr[7] = (int) j24;
                j15 = j24 >> 32;
                int i32 = f53689c;
                int i33 = i32 & 33;
                int i34 = ((i32 | 33) & (~i33)) + (i33 << 1);
                f53690d = i34 % 128;
                int i35 = i34 % 2;
                j10 = 0;
            } else {
                j10 = 0;
            }
        } else if (iIntValue != 0) {
            int i114 = i13 & 49;
            int i115 = -(-((i13 ^ 49) | i114));
            i10 = ((i114 | i115) << 1) - (i114 ^ i115);
            f53690d = i10 % 128;
            j11 = iIntValue;
            if (i10 % 2 == 0) {
                j12 = j11 % 4294967295L;
                long j112 = 1 | ((((long) iArr[0]) ^ 4294967295L) ^ j12);
                iArr[0] = (int) j112;
                j13 = j112 >> 30;
                if (j13 != 0) {
                    int i116 = ((i13 ^ 5) | (i13 & 5)) << 1;
                    int i117 = -((i13 & (-6)) | ((~i13) & 5));
                    int i118 = (i116 & i117) + (i116 | i117);
                    f53690d = i118 % 128;
                    int i119 = i118 % 2;
                    long j113 = j13 + (((long) iArr[1]) & 4294967295L);
                    iArr[1] = (int) j113;
                    long j114 = (j113 >> 32) + (((long) iArr[2]) & 4294967295L);
                    iArr[2] = (int) j114;
                    j13 = j114 >> 32;
                    int i210 = ((i13 | 16) << 1) - (i13 ^ 16);
                    int i211 = (i210 ^ (-1)) + (i210 << 1);
                    f53690d = i211 % 128;
                    int i212 = i211 % 2;
                }
            } else {
                j12 = j11 & 4294967295L;
                long j115 = (((long) iArr[0]) & 4294967295L) + j12;
                iArr[0] = (int) j115;
                j13 = j115 >> 32;
                if (j13 != 0) {
                    int i1110 = ((i13 ^ 5) | (i13 & 5)) << 1;
                    int i1111 = -((i13 & (-6)) | ((~i13) & 5));
                    int i1112 = (i1110 & i1111) + (i1110 | i1111);
                    f53690d = i1112 % 128;
                    int i1113 = i1112 % 2;
                    long j116 = j13 + (((long) iArr[1]) & 4294967295L);
                    iArr[1] = (int) j116;
                    long j117 = (j116 >> 32) + (((long) iArr[2]) & 4294967295L);
                    iArr[2] = (int) j117;
                    j13 = j117 >> 32;
                    int i213 = ((i13 | 16) << 1) - (i13 ^ 16);
                    int i214 = (i213 ^ (-1)) + (i213 << 1);
                    f53690d = i214 % 128;
                    int i215 = i214 % 2;
                }
            }
            long j25 = ((((long) iArr[3]) & 4294967295L) - j12) + j13;
            iArr[3] = (int) j25;
            j14 = j25 >> 32;
            if (j14 != 0) {
                int i216 = f53690d;
                int i217 = ((i216 | 67) << 1) - (i216 ^ 67);
                int i218 = i217 % 128;
                f53689c = i218;
                int i219 = i217 % 2;
                long j26 = j14 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j26;
                long j27 = (j26 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j27;
                j14 = j27 >> 32;
                int i36 = (i218 ^ 37) + ((i218 & 37) << 1);
                f53690d = i36 % 128;
                int i37 = i36 % 2;
            }
            long j28 = ((((long) iArr[6]) & 4294967295L) - j12) + j14;
            iArr[6] = (int) j28;
            long j29 = (((long) iArr[7]) & 4294967295L) + j12 + (j28 >> 32);
            iArr[7] = (int) j29;
            j15 = j29 >> 32;
            int i38 = f53689c;
            int i39 = i38 & 33;
            int i310 = ((i38 | 33) & (~i39)) + (i39 << 1);
            f53690d = i310 % 128;
            int i311 = i310 % 2;
            j10 = 0;
        } else {
            j10 = 0;
            j15 = 0;
        }
        if (j15 == j10) {
            int i40 = f53689c;
            int i41 = i40 & 117;
            int i42 = -(-(i40 | 117));
            int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
            f53690d = i43 % 128;
            if (i43 % 2 != 0 ? iArr[7] == -1 : iArr[43] == -1) {
                int i44 = i40 & 101;
                int i45 = (i44 - (~((i40 ^ 101) | i44))) - 1;
                f53690d = i45 % 128;
                int i46 = i45 % 2;
                int[] iArr2 = f53687a;
                if (i46 == 0) {
                    ((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                    setX(new Object[]{iArr}, -1505989768, 1505989778, (int) System.currentTimeMillis());
                    int i47 = f53689c;
                    int i48 = (((i47 ^ 29) | (i47 & 29)) << 1) - (((~i47) & 29) | (i47 & (-30)));
                    f53690d = i48 % 128;
                    int i49 = i48 % 2;
                }
            }
        } else {
            setX(new Object[]{iArr}, -1505989768, 1505989778, (int) System.currentTimeMillis());
            int i410 = f53689c;
            int i411 = (((i410 ^ 29) | (i410 & 29)) << 1) - (((~i410) & 29) | (i410 & (-30)));
            f53690d = i411 % 128;
            int i412 = i411 % 2;
        }
        int i50 = f53690d;
        int i51 = (i50 & 66) + (i50 | 66);
        int i52 = (i51 ^ (-1)) + (i51 << 1);
        f53689c = i52 % 128;
        int i53 = i52 % 2;
    }

    public static /* synthetic */ void g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int[] iArr4 = (int[]) objArr[3];
        int i10 = f53689c;
        int i11 = ((i10 ^ 89) | (i10 & 89)) << 1;
        int i12 = -(((~i10) & 89) | (i10 & (-90)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53690d = i13 % 128;
        Object[] objArr2 = new Object[3];
        if (i13 % 2 != 0) {
            objArr2[0] = iArr;
            objArr2[1] = iArr2;
            objArr2[2] = iArr4;
            avf.setX(objArr2, -701222223, 701222256, (int) System.currentTimeMillis());
            setX(new Object[]{iArr4, iArr3}, 1883843384, -1883843371, (int) System.currentTimeMillis());
            return;
        }
        objArr2[0] = iArr;
        objArr2[1] = iArr2;
        objArr2[2] = iArr4;
        avf.setX(objArr2, -701222223, 701222256, (int) System.currentTimeMillis());
        setX(new Object[]{iArr4, iArr3}, 1883843384, -1883843371, (int) System.currentTimeMillis());
        int i14 = 6 / 0;
    }

    public static /* synthetic */ void h(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        do {
            setX(new Object[]{secureRandom, iArr}, 1865895322, -1865895304, (int) System.currentTimeMillis());
        } while (((Integer) setX(new Object[]{iArr}, -8084230, 8084234, (int) System.currentTimeMillis())).intValue() != 0);
        int i10 = f53690d;
        int i11 = i10 & 77;
        int i12 = (i11 - (~(-(-((i10 ^ 77) | i11))))) - 1;
        f53689c = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object i(Object[] objArr) {
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i10 = f53690d;
        int i11 = i10 & 27;
        int i12 = (i10 | 27) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f53689c = i14 % 128;
        int i15 = i14 % 2;
        int[] iArr = (int[]) avf.setX(new Object[]{bigInteger}, -1818387099, 1818387099, (int) System.currentTimeMillis());
        if (iArr[7] == -1) {
            int i16 = f53689c;
            int i17 = i16 ^ 105;
            int i18 = (((i16 & 105) | i17) << 1) - i17;
            f53690d = i18 % 128;
            int i19 = i18 % 2;
            int[] iArr2 = f53687a;
            if (i19 == 0) {
                ((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                int i20 = f53689c;
                int i21 = i20 & 85;
                int i22 = -(-(i20 | 85));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f53690d = i23 % 128;
                if (i23 % 2 == 0) {
                    ((Integer) avf.setX(new Object[]{iArr2, iArr}, 1877956622, -1877956593, (int) System.currentTimeMillis())).intValue();
                    throw null;
                }
                ((Integer) avf.setX(new Object[]{iArr2, iArr}, 1877956622, -1877956593, (int) System.currentTimeMillis())).intValue();
            }
        }
        int i24 = f53690d;
        int i25 = i24 & 35;
        int i26 = (i24 | 35) & (~i25);
        int i27 = -(-(i25 << 1));
        int i28 = (i26 & i27) + (i26 | i27);
        f53689c = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 6 / 0;
        }
        return iArr;
    }

    public static /* synthetic */ void j(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53689c;
        int i11 = i10 & 123;
        int i12 = ((i10 | 123) & (~i11)) + (i11 << 1);
        f53690d = i12 % 128;
        int i13 = i12 % 2;
        ava.setOnFocusChangeListener(new Object[]{f53687a, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
        int i14 = f53690d;
        int i15 = (i14 & 105) + (i14 | 105);
        f53689c = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 81 / 0;
        }
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        int i10;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53689c;
        int i12 = i11 ^ 39;
        int i13 = ((i11 & 39) | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 & i14) + (i14 | i13);
        f53690d = i15 % 128;
        int i16 = i15 % 2 == 0 ? 1 : 0;
        int i17 = (i11 & 19) + (i11 | 19);
        f53690d = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i19 < 8) {
            int i20 = f53690d + 111;
            int i21 = i20 % 128;
            f53689c = i21;
            if (i20 % 2 != 0) {
                int i22 = iArr[i19];
                int i23 = ((~i22) & i16) | ((~i16) & i22);
                int i24 = i16 & i22;
                i16 = (i24 & i23) | (i23 ^ i24);
                i10 = ((i19 & (-31)) - (~(i19 | (-31)))) + 53;
            } else {
                int i25 = iArr[i19];
                i16 = (i16 & i25) | ((~i25) & i16) | ((~i16) & i25);
                i10 = ((i19 | 2) << 1) - (i19 ^ 2);
            }
            i19 = (-2) - (i10 ^ (-1));
            int i26 = i21 & 125;
            int i27 = -(-((i21 ^ 125) | i26));
            int i28 = (i26 & i27) + (i26 | i27);
            f53690d = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = i16 >>> 1;
        int i31 = i16 & 1;
        int i32 = (i30 & i31) | (i30 ^ i31);
        int i33 = ~i32;
        int i34 = -(-(i32 << 1));
        int i35 = (((i33 | i34) << 1) - (i34 ^ i33)) >> 31;
        int i36 = f53690d;
        int i37 = i36 ^ 85;
        int i38 = (i36 & 85) << 1;
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        f53689c = i39 % 128;
        if (i39 % 2 == 0) {
            return Integer.valueOf(i35);
        }
        int i40 = 17 / 0;
        return Integer.valueOf(i35);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    public static /* synthetic */ void l(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53690d;
        int i11 = (i10 ^ 111) + ((i10 & 111) << 1);
        f53689c = i11 % 128;
        int i12 = i11 % 2;
        if (((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr, iArr2}, 1108035559, -1108035515, 8)).intValue() == 0) {
            int i13 = f53690d;
            int i14 = (i13 ^ 97) + ((i13 & 97) << 1);
            int i15 = i14 % 128;
            f53689c = i15;
            if (i14 % 2 == 0 ? iArr2[7] == -1 : iArr2[67] == -1) {
                int i16 = i15 | 11;
                int i17 = (i16 << 1) - ((~(i15 & 11)) & i16);
                f53690d = i17 % 128;
                int i18 = i17 % 2;
                int[] iArr3 = f53687a;
                if (i18 == 0) {
                    ((Boolean) avf.setX(new Object[]{iArr2, iArr3}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (!(!((Boolean) avf.setX(new Object[]{iArr2, iArr3}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
                    setX(new Object[]{iArr2}, -1505989768, 1505989778, (int) System.currentTimeMillis());
                    int i19 = f53689c;
                    int i20 = i19 & 65;
                    int i21 = (i20 - (~((i19 ^ 65) | i20))) - 1;
                    f53690d = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
        } else {
            setX(new Object[]{iArr2}, -1505989768, 1505989778, (int) System.currentTimeMillis());
            int i110 = f53689c;
            int i23 = i110 & 65;
            int i24 = (i23 - (~((i110 ^ 65) | i23))) - 1;
            f53690d = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f53689c;
        int i27 = ((((i26 ^ 107) | (i26 & 107)) << 1) - (~(-(((~i26) & 107) | (i26 & (-108)))))) - 1;
        f53690d = i27 % 128;
        if (i27 % 2 == 0) {
            throw null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -1728650277, 1728650279, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int i10, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, Integer.valueOf(i10), iArr2, iArr3}, -149611126, 149611140, i10);
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, 1905043206, -1905043200, (int) System.currentTimeMillis());
    }

    public static void setOnLongClickListener(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, 774945823, -774945807, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x02cd  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        char c10;
        long j10;
        char c11;
        long j11;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~(i13 | i12);
        int i16 = ~i11;
        int i17 = ((i15 | (~(i16 | i12))) * 140) + ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
        int i18 = ~(i13 | i16 | i12);
        int i19 = ~i12;
        int i20 = (((~(i10 | i19 | i16)) | (~(i11 | i13 | i19)) | i18) * 140) + i17;
        int[] iArr = f53687a;
        switch (i20) {
            case 1:
                return i(objArr);
            case 2:
                d(objArr);
                return null;
            case 3:
                e(objArr);
                return null;
            case 4:
                return k(objArr);
            case 5:
                b(objArr);
                return null;
            case 6:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int[] iArr4 = (int[]) objArr[2];
                int i21 = f53689c;
                int i22 = ((i21 ^ 79) | (i21 & 79)) << 1;
                int i23 = -(((~i21) & 79) | (i21 & (-80)));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f53690d = i24 % 128;
                int i25 = i24 % 2;
                avf.setX(new Object[]{iArr2, iArr4}, -44054691, 44054719, (int) System.currentTimeMillis());
                setX(new Object[]{iArr4, iArr3}, 1883843384, -1883843371, (int) System.currentTimeMillis());
                int i26 = f53689c;
                int i27 = i26 & 97;
                int i28 = (i26 ^ 97) | i27;
                int i29 = (i27 & i28) + (i28 | i27);
                f53690d = i29 % 128;
                int i30 = i29 % 2;
                return null;
            case 7:
                int[] iArr5 = (int[]) objArr[0];
                int[] iArr6 = (int[]) objArr[1];
                int[] iArr7 = (int[]) objArr[2];
                int i31 = f53689c;
                int i32 = ((i31 | 61) << 1) - (i31 ^ 61);
                f53690d = i32 % 128;
                int i33 = i32 % 2;
                int[] iArr8 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
                avf.setX(new Object[]{iArr5, iArr6, iArr8}, -701222223, 701222256, (int) System.currentTimeMillis());
                setX(new Object[]{iArr8, iArr7}, 1883843384, -1883843371, (int) System.currentTimeMillis());
                int i34 = f53689c;
                int i35 = i34 & 97;
                int i36 = (((i34 ^ 97) | i35) << 1) - ((i34 | 97) & (~i35));
                f53690d = i36 % 128;
                int i37 = i36 % 2;
                return null;
            case 8:
                g(objArr);
                return null;
            case 9:
                j(objArr);
                return null;
            case 10:
                int[] iArr9 = (int[]) objArr[0];
                int i38 = f53690d;
                int i39 = i38 & 15;
                int i40 = (((i38 | 15) & (~i39)) - (~(i39 << 1))) - 1;
                int i41 = i40 % 128;
                f53689c = i41;
                if (i40 % 2 != 0) {
                    long j12 = ((long) iArr9[1]) / 4294967295L;
                    iArr9[0] = (int) j12;
                    j10 = j12 << 114;
                    if (j10 != 0) {
                        c10 = ' ';
                        long j13 = j10 + (((long) iArr9[1]) & 4294967295L);
                        iArr9[1] = (int) j13;
                        long j14 = (j13 >> c10) + (((long) iArr9[2]) & 4294967295L);
                        iArr9[2] = (int) j14;
                        j10 = j14 >> c10;
                        int i42 = i41 & 73;
                        int i43 = -(-((i41 ^ 73) | i42));
                        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                        f53690d = i44 % 128;
                        int i45 = i44 % 2;
                    }
                } else {
                    long j15 = (((long) iArr9[0]) & 4294967295L) + 1;
                    iArr9[0] = (int) j15;
                    c10 = ' ';
                    j10 = j15 >> 32;
                    if (j10 != 0) {
                        long j16 = j10 + (((long) iArr9[1]) & 4294967295L);
                        iArr9[1] = (int) j16;
                        long j17 = (j16 >> c10) + (((long) iArr9[2]) & 4294967295L);
                        iArr9[2] = (int) j17;
                        j10 = j17 >> c10;
                        int i46 = i41 & 73;
                        int i47 = -(-((i41 ^ 73) | i46));
                        int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                        f53690d = i48 % 128;
                        int i49 = i48 % 2;
                    }
                }
                long j18 = ((((long) iArr9[3]) & 4294967295L) - 1) + j10;
                iArr9[3] = (int) j18;
                long j19 = j18 >> 32;
                if (j19 != 0) {
                    int i50 = ((i41 | 47) << 1) - (i41 ^ 47);
                    f53690d = i50 % 128;
                    if (i50 % 2 == 0) {
                        long j20 = iArr9[2];
                        long j21 = j19 / (j20 & 4294967295L);
                        iArr9[5] = (int) j21;
                        long j22 = (j21 >> 30) / (j20 % 4294967295L);
                        iArr9[2] = (int) j22;
                        j19 = j22 >>> 58;
                        c11 = ' ';
                    } else {
                        long j23 = j19 + (((long) iArr9[4]) & 4294967295L);
                        iArr9[4] = (int) j23;
                        c11 = ' ';
                        long j24 = (j23 >> 32) + (((long) iArr9[5]) & 4294967295L);
                        iArr9[5] = (int) j24;
                        j19 = j24 >> 32;
                    }
                } else {
                    c11 = ' ';
                }
                long j25 = ((((long) iArr9[6]) & 4294967295L) - 1) + j19;
                iArr9[6] = (int) j25;
                iArr9[7] = (int) ((((long) iArr9[7]) & 4294967295L) + 1 + (j25 >> c11));
                int i51 = f53690d + 123;
                f53689c = i51 % 128;
                int i52 = i51 % 2;
                return null;
            case 11:
                h(objArr);
                return null;
            case 12:
                f(objArr);
                return null;
            case 13:
                int[] iArr10 = (int[]) objArr[0];
                int[] iArr11 = (int[]) objArr[1];
                int i53 = f53690d;
                int i54 = (i53 & 61) + (i53 | 61);
                f53689c = i54 % 128;
                int i55 = i54 % 2;
                long j26 = ((long) iArr10[8]) & 4294967295L;
                long j27 = ((long) iArr10[9]) & 4294967295L;
                long j28 = ((long) iArr10[10]) & 4294967295L;
                long j29 = ((long) iArr10[11]) & 4294967295L;
                long j30 = ((long) iArr10[12]) & 4294967295L;
                long j31 = ((long) iArr10[13]) & 4294967295L;
                long j32 = ((long) iArr10[14]) & 4294967295L;
                long j33 = ((long) iArr10[15]) & 4294967295L;
                long j34 = j26 - 6;
                long j35 = j27 + j28;
                long j36 = (j28 + j29) - j33;
                long j37 = j29 + j30;
                long j38 = j30 + j31;
                long j39 = j31 + j32;
                long j40 = j32 + j33;
                long j41 = j39 - (j34 + j27);
                long j42 = ((((long) iArr10[0]) & 4294967295L) - j37) - j41;
                iArr11[0] = (int) j42;
                long j43 = ((((((long) iArr10[1]) & 4294967295L) + j35) - j38) - j40) + (j42 >> 32);
                iArr11[1] = (int) j43;
                long jG = a.g(((long) iArr10[2]) & 4294967295L, j36, j39, j43 >> 32);
                iArr11[2] = (int) jG;
                long jD = n1.d(((long) iArr10[3]) & 4294967295L, j37 << 1, j41, j40, jG >> 32);
                iArr11[3] = (int) jD;
                long jD2 = n1.d(((long) iArr10[4]) & 4294967295L, j38 << 1, j32, j35, jD >> 32);
                iArr11[4] = (int) jD2;
                long jG2 = a.g(((long) iArr10[5]) & 4294967295L, j39 << 1, j36, jD2 >> 32);
                iArr11[5] = (int) jG2;
                long j44 = (((long) iArr10[6]) & 4294967295L) + (j40 << 1) + j41 + (jG2 >> 32);
                iArr11[6] = (int) j44;
                long j45 = (((((((long) iArr10[7]) & 4294967295L) + (j33 << 1)) + j34) - j36) - j38) + (j44 >> 32);
                iArr11[7] = (int) j45;
                int i56 = (int) ((j45 >> 32) + 6);
                setX(new Object[]{Integer.valueOf(i56), iArr11}, -232155518, 232155530, i56);
                int i57 = f53689c;
                int i58 = i57 ^ 1;
                int i59 = -(-((i57 & 1) << 1));
                int i60 = (i58 & i59) + (i59 | i58);
                f53690d = i60 % 128;
                int i61 = i60 % 2;
                return null;
            case 14:
                a(objArr);
                return null;
            case 15:
                c(objArr);
                return null;
            case 16:
                int[] iArr12 = (int[]) objArr[0];
                int[] iArr13 = (int[]) objArr[1];
                int i62 = f53690d;
                int i63 = i62 & 53;
                int i64 = (~i63) & (i62 | 53);
                int i65 = -(-(i63 << 1));
                int i66 = (i64 & i65) + (i64 | i65);
                f53689c = i66 % 128;
                int i67 = i66 % 2;
                if (((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr12, 0, iArr13}, -1008052683, 1008052691, 8)).intValue() == 0) {
                    int i68 = f53689c;
                    int i69 = (i68 & (-22)) | ((~i68) & 21);
                    int i70 = (i68 & 21) << 1;
                    int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
                    f53690d = i71 % 128;
                    if (i71 % 2 != 0 ? iArr13[7] == -1 : iArr13[36] == -1) {
                        int i72 = i68 + 77;
                        f53690d = i72 % 128;
                        int i73 = i72 % 2;
                        if (!(!((Boolean) avf.setX(new Object[]{iArr13, iArr}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
                            setX(new Object[]{iArr13}, -1505989768, 1505989778, (int) System.currentTimeMillis());
                            int i74 = f53690d + 67;
                            f53689c = i74 % 128;
                            int i75 = i74 % 2;
                        }
                    }
                } else {
                    setX(new Object[]{iArr13}, -1505989768, 1505989778, (int) System.currentTimeMillis());
                    int i76 = f53690d + 67;
                    f53689c = i76 % 128;
                    int i77 = i76 % 2;
                }
                int i78 = f53689c;
                int i79 = i78 & 93;
                int i80 = (((i78 ^ 93) | i79) << 1) - ((i78 | 93) & (~i79));
                f53690d = i80 % 128;
                int i81 = i80 % 2;
                return null;
            case 17:
                l(objArr);
                return null;
            case 18:
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                int[] iArr14 = (int[]) objArr[1];
                int i82 = f53689c;
                int i83 = i82 & 91;
                int i84 = ((((i82 ^ 91) | i83) << 1) - (~(-((i82 | 91) & (~i83))))) - 1;
                int i85 = i84 % 128;
                f53690d = i85;
                int i86 = i84 % 2;
                byte[] bArr = new byte[32];
                int i87 = i85 & 15;
                int i88 = ((i85 ^ 15) | i87) << 1;
                int i89 = -((i85 | 15) & (~i87));
                int i90 = (i88 & i89) + (i89 | i88);
                f53689c = i90 % 128;
                int i91 = i90 % 2;
                do {
                    secureRandom.nextBytes(bArr);
                    ber.setDividerPadding(new Object[]{bArr, 0, iArr14, 8}, 1570947064, -1570947056, 0);
                } while (((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr14, iArr}, -188447753, 188447787, 8)).intValue() == 0);
                int i92 = f53690d;
                int i93 = i92 & 87;
                int i94 = (i93 - (~((i92 ^ 87) | i93))) - 1;
                f53689c = i94 % 128;
                int i95 = i94 % 2;
                return null;
            case 19:
                int[] iArr15 = (int[]) objArr[0];
                int i96 = f53689c;
                int i97 = i96 + 3;
                f53690d = i97 % 128;
                int i98 = i97 % 2;
                long j46 = (((long) iArr15[0]) & 4294967295L) - 1;
                iArr15[0] = (int) j46;
                long j47 = j46 >> 32;
                if (j47 != 0) {
                    int i99 = ((i96 | 33) << 1) - (i96 ^ 33);
                    f53690d = i99 % 128;
                    if (i99 % 2 == 0) {
                        long j48 = j47 ^ (((long) iArr15[1]) + 4294967295L);
                        iArr15[0] = (int) j48;
                        long j49 = (j48 << 80) / (((long) iArr15[3]) - 4294967295L);
                        iArr15[3] = (int) j49;
                        j11 = j49 << 72;
                    } else {
                        long j50 = j47 + (((long) iArr15[1]) & 4294967295L);
                        iArr15[1] = (int) j50;
                        long j51 = (j50 >> 32) + (((long) iArr15[2]) & 4294967295L);
                        iArr15[2] = (int) j51;
                        j11 = j51 >> 32;
                    }
                    j47 = j11;
                }
                long j52 = (((long) iArr15[3]) & 4294967295L) + 1 + j47;
                iArr15[3] = (int) j52;
                long j53 = j52 >> 32;
                if (j53 != 0) {
                    int i100 = f53690d;
                    int i101 = ((i100 & (-102)) | ((~i100) & 101)) + ((i100 & 101) << 1);
                    int i102 = i101 % 128;
                    f53689c = i102;
                    int i103 = i101 % 2;
                    long j54 = j53 + (((long) iArr15[4]) & 4294967295L);
                    iArr15[4] = (int) j54;
                    long j55 = (j54 >> 32) + (((long) iArr15[5]) & 4294967295L);
                    iArr15[5] = (int) j55;
                    j53 = j55 >> 32;
                    int i104 = (-2) - ((i102 + 92) ^ (-1));
                    f53690d = i104 % 128;
                    int i105 = i104 % 2;
                }
                long j56 = (((long) iArr15[6]) & 4294967295L) + 1 + j53;
                iArr15[6] = (int) j56;
                iArr15[7] = (int) (((((long) iArr15[7]) & 4294967295L) - 1) + (j56 >> 32));
                int i106 = f53690d + 123;
                f53689c = i106 % 128;
                if (i106 % 2 == 0) {
                    return null;
                }
                throw null;
            default:
                int[] iArr16 = (int[]) objArr[0];
                int[] iArr17 = (int[]) objArr[1];
                int[] iArr18 = (int[]) objArr[2];
                int i107 = f53690d;
                int i108 = i107 & 19;
                int i109 = (i107 | 19) & (~i108);
                int i110 = -(-(i108 << 1));
                int i111 = ((i109 | i110) << 1) - (i109 ^ i110);
                f53689c = i111 % 128;
                int i112 = i111 % 2;
                if (((Integer) avf.setX(new Object[]{iArr16, iArr17, iArr18}, -993304868, 993304870, (int) System.currentTimeMillis())).intValue() == 0) {
                    int i113 = f53689c;
                    int i114 = i113 & 1;
                    int i115 = (i113 | 1) & (~i114);
                    int i116 = -(-(i114 << 1));
                    int i117 = (i115 ^ i116) + ((i115 & i116) << 1);
                    f53690d = i117 % 128;
                    if (i117 % 2 != 0 ? iArr18[7] == -1 : iArr18[57] == -1) {
                        if (!(!((Boolean) avf.setX(new Object[]{iArr18, iArr}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
                            setX(new Object[]{iArr18}, -1505989768, 1505989778, (int) System.currentTimeMillis());
                            int i118 = f53690d;
                            int i119 = i118 ^ 57;
                            int i120 = -(-((i118 & 57) << 1));
                            int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                            f53689c = i121 % 128;
                            int i122 = i121 % 2;
                        }
                    }
                } else {
                    setX(new Object[]{iArr18}, -1505989768, 1505989778, (int) System.currentTimeMillis());
                    int i1110 = f53690d;
                    int i1111 = i1110 ^ 57;
                    int i123 = -(-((i1110 & 57) << 1));
                    int i124 = ((i1111 | i123) << 1) - (i123 ^ i1111);
                    f53689c = i124 % 128;
                    int i125 = i124 % 2;
                }
                int i126 = f53689c;
                int i127 = (i126 & (-100)) | ((~i126) & 99);
                int i128 = -(-((i126 & 99) << 1));
                int i129 = ((i127 | i128) << 1) - (i128 ^ i127);
                f53690d = i129 % 128;
                if (i129 % 2 != 0) {
                    return null;
                }
                throw null;
        }
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, -1114350457, 1114350462, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, 1644823132, -1644823125, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -1519702901, 1519702916, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int i10, int[] iArr) {
        setX(new Object[]{Integer.valueOf(i10), iArr}, -232155518, 232155530, i10);
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -1865932043, 1865932060, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(SecureRandom secureRandom, int[] iArr) {
        setX(new Object[]{secureRandom, iArr}, -413207273, 413207284, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        setX(new Object[]{iArr, iArr2, iArr3, iArr4}, -749654156, 749654164, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, 2080958267, -2080958267, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -418903590, 418903599, (int) System.currentTimeMillis());
    }

    public static int[] setOnFocusChangeListener(BigInteger bigInteger) {
        return (int[]) setX(new Object[]{bigInteger}, -1902789300, 1902789301, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, 1883843384, -1883843371, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, -1272840337, 1272840340, (int) System.currentTimeMillis());
    }
}
