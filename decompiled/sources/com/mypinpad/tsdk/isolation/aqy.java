package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53633a = {-1, -1, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53634b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53635c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53636d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53637e = 1;

    static {
        int i10 = 1 ^ 7;
        int i11 = (((1 & 7) | i10) << 1) - i10;
        f53636d = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x009e  */
    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53636d;
        int i11 = i10 & 115;
        int i12 = -(-(i10 | 115));
        int i13 = (i11 & i12) + (i12 | i11);
        f53637e = i13 % 128;
        if (i13 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr, iArr2}, 1108035559, -1108035515, 6)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr, iArr2}, 1108035559, -1108035515, 16)).intValue() != 0) {
            setDividerPadding(new Object[]{iArr2}, 1637622876, -1637622863, (int) System.currentTimeMillis());
            int i14 = f53637e + 83;
            f53636d = i14 % 128;
            int i15 = i14 % 2;
        } else {
            int i16 = f53637e;
            int i17 = i16 & 125;
            int i18 = ((i16 ^ 125) | i17) << 1;
            int i19 = -((i16 | 125) & (~i17));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            int i21 = i20 % 128;
            f53636d = i21;
            int i22 = i20 % 2;
            if (iArr2[5] == -1) {
                int i23 = i21 + 7;
                f53637e = i23 % 128;
                int i24 = i23 % 2;
                if (!(!((Boolean) auv.setDividerPadding(new Object[]{iArr2, f53633a}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue())) {
                    setDividerPadding(new Object[]{iArr2}, 1637622876, -1637622863, (int) System.currentTimeMillis());
                    int i110 = f53637e + 83;
                    f53636d = i110 % 128;
                    int i111 = i110 % 2;
                }
            }
        }
        int i25 = f53636d + 99;
        f53637e = i25 % 128;
        if (i25 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        do {
            setDividerPadding(new Object[]{secureRandom, iArr}, 768042773, -768042764, (int) System.currentTimeMillis());
        } while (((Integer) setDividerPadding(new Object[]{iArr}, -929903733, 929903747, (int) System.currentTimeMillis())).intValue() != 0);
        int i10 = f53637e;
        int i11 = ((i10 ^ 39) | (i10 & 39)) << 1;
        int i12 = -(((~i10) & 39) | (i10 & (-40)));
        int i13 = (i11 & i12) + (i12 | i11);
        f53636d = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53636d;
        int i11 = i10 & 43;
        int i12 = (i11 - (~(-(-((i10 ^ 43) | i11))))) - 1;
        f53637e = i12 % 128;
        if (i12 % 2 == 0) {
            ((Integer) auv.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1996833703, -1996833684, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        if (((Integer) auv.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1996833703, -1996833684, (int) System.currentTimeMillis())).intValue() != 0) {
            setDividerPadding(new Object[]{iArr3}, 132930167, -132930161, (int) System.currentTimeMillis());
            int i13 = f53636d + 15;
            f53637e = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = f53637e;
        int i16 = ((i15 | 1) << 1) - (i15 ^ 1);
        f53636d = i16 % 128;
        int i17 = i16 % 2;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53636d;
        int i11 = ((i10 & 84) + (i10 | 84)) - 1;
        f53637e = i11 % 128;
        int i12 = i11 % 2;
        int iIntValue = ((Integer) setDividerPadding(new Object[]{iArr}, -929903733, 929903747, (int) System.currentTimeMillis())).intValue();
        int[] iArr3 = f53633a;
        if (iIntValue != 0) {
            int i13 = f53636d;
            int i14 = (i13 ^ 93) + ((i13 & 93) << 1);
            f53637e = i14 % 128;
            Object[] objArr2 = new Object[3];
            if (i14 % 2 != 0) {
                objArr2[0] = iArr3;
                objArr2[1] = iArr3;
                objArr2[2] = iArr2;
                ((Integer) auv.setDividerPadding(objArr2, 1996833703, -1996833684, (int) System.currentTimeMillis())).intValue();
                return;
            }
            objArr2[0] = iArr3;
            objArr2[1] = iArr3;
            objArr2[2] = iArr2;
            ((Integer) auv.setDividerPadding(objArr2, 1996833703, -1996833684, (int) System.currentTimeMillis())).intValue();
            int i15 = 99 / 0;
            return;
        }
        ((Integer) auv.setDividerPadding(new Object[]{iArr3, iArr, iArr2}, 1996833703, -1996833684, (int) System.currentTimeMillis())).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i16 = ~iCurrentTimeMillis;
        int i17 = (iCurrentTimeMillis | i16) & i16;
        int i18 = -(-(((i17 & (-563216425)) | ((-563216425) ^ i17)) * 184));
        int i19 = 1669161600 ^ i18;
        int i20 = ((i18 & 1669161600) | i19) << 1;
        int i21 = -i19;
        int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
        int i23 = i16 & (-670444524);
        int i24 = (((-670444524) | i16) & (~i23)) | i23;
        int i25 = ~i24;
        int i26 = (i24 | i25) & i25;
        int i27 = ((~i26) & (-938962924)) | (938962923 & i26);
        int i28 = i26 & (-938962924);
        int i29 = (i28 & i27) | (i27 ^ i28);
        int i30 = -(-(((i29 & 107228099) | (i29 ^ 107228099)) * 184));
        int i31 = i22 & i30;
        int i32 = (i31 - (~(-(-((i30 ^ i22) | i31))))) - 1;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i33 = 1366147651 & iCurrentTimeMillis2;
        int i34 = ((1366147651 | iCurrentTimeMillis2) & (~i33)) | i33;
        int i35 = ~i34;
        int i36 = (i34 | i35) & i35;
        int i37 = -(-(((i36 & 41951244) | (41951244 ^ i36)) * (-140)));
        int i38 = ((570972421 | i37) << 1) - (i37 ^ 570972421);
        int i39 = -(-((~((1408098895 & iCurrentTimeMillis2) | (1408098895 ^ iCurrentTimeMillis2))) * 70));
        int i40 = i38 & i39;
        int i41 = (i39 ^ i38) | i40;
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        int i43 = 65364044 & iCurrentTimeMillis2;
        int i44 = (iCurrentTimeMillis2 | 65364044) & (~i43);
        int i45 = ~((i44 & i43) | (i44 ^ i43));
        int i46 = 1384686095 ^ i45;
        int i47 = i45 & 1384686095;
        int i48 = ((i47 & i46) | (i46 ^ i47)) * 70;
        if (i32 > (((~i48) & i42) | ((~i42) & i48)) + ((i48 & i42) << 1)) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0099  */
    public static /* synthetic */ void e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53637e;
        int i11 = i10 & 39;
        int i12 = -(-((i10 ^ 39) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f53636d = i13 % 128;
        if (i13 % 2 == 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr, 0, iArr2}, -1008052683, 1008052691, 6)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{98, iArr, 1, iArr2}, -1008052683, 1008052691, 98)).intValue() != 0) {
            setDividerPadding(new Object[]{iArr2}, 1637622876, -1637622863, (int) System.currentTimeMillis());
            int i14 = f53636d + 83;
            f53637e = i14 % 128;
            int i15 = i14 % 2;
        } else if (iArr2[5] == -1) {
            int i16 = f53637e;
            int i17 = ((i16 | 103) << 1) - (i16 ^ 103);
            f53636d = i17 % 128;
            int i18 = i17 % 2;
            if (((Boolean) auv.setDividerPadding(new Object[]{iArr2, f53633a}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue()) {
                setDividerPadding(new Object[]{iArr2}, 1637622876, -1637622863, (int) System.currentTimeMillis());
                int i19 = f53636d + 83;
                f53637e = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        int i20 = f53636d + 113;
        f53637e = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 62 / 0;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53637e;
        int i11 = i10 & 121;
        int i12 = ((((i10 ^ 121) | i11) << 1) - (~(-((~i11) & (i10 | 121))))) - 1;
        f53636d = i12 % 128;
        int i13 = i12 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            int i14 = (i10 & (-110)) | ((~i10) & 109);
            int i15 = -(-((i10 & 109) << 1));
            int i16 = (i14 & i15) + (i14 | i15);
            f53636d = i16 % 128;
            int i17 = i16 % 2;
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
            int i18 = i10 & 69;
            int i19 = (i10 ^ 69) | i18;
            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
            f53636d = i20 % 128;
            int i21 = i20 % 2;
        }
        long j13 = ((4294967295L & ((long) iArr[2])) - 1) + j11;
        iArr[2] = (int) j13;
        if ((j13 >> 32) != 0) {
            int i22 = i10 & 25;
            int i23 = (i22 - (~((i10 ^ 25) | i22))) - 1;
            f53636d = i23 % 128;
            int i24 = i23 % 2;
            ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr, 3}, -115920179, 115920214, 6)).intValue();
            int i25 = f53637e;
            int i26 = i25 & 121;
            int i27 = ((i25 ^ 121) | i26) << 1;
            int i28 = -((i25 | 121) & (~i26));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f53636d = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = f53636d;
        int i32 = i31 & 71;
        int i33 = (((i31 | 71) & (~i32)) - (~(-(-(i32 << 1))))) - 1;
        f53637e = i33 % 128;
        if (i33 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int i10 = f53637e;
        int i11 = i10 + 111;
        f53636d = i11 % 128;
        byte[] bArr = new byte[i11 % 2 != 0 ? 45 : 24];
        int i12 = ((i10 & 67) - (~(-(-(i10 | 67))))) - 1;
        f53636d = i12 % 128;
        int i13 = i12 % 2;
        do {
            secureRandom.nextBytes(bArr);
            ber.setDividerPadding(new Object[]{bArr, 0, iArr, 6}, 1570947064, -1570947056, 0);
        } while (((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr, f53633a}, -188447753, 188447787, 6)).intValue() == 0);
        int i14 = f53637e + 4;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f53636d = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void h(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53636d;
        int i11 = (i10 & 11) + (i10 | 11);
        f53637e = i11 % 128;
        int i12 = i11 % 2;
        int[] iArr3 = (int[]) auv.setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
        auv.setDividerPadding(new Object[]{iArr, iArr3}, 955273017, -955272992, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr3, iArr2}, 1570810584, -1570810580, (int) System.currentTimeMillis());
        int i13 = f53636d;
        int i14 = ((i13 ^ 73) | (i13 & 73)) << 1;
        int i15 = -(((~i13) & 73) | (i13 & (-74)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f53637e = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0135  */
    /* JADX WARN: Code duplicated, block: B:21:0x013a  */
    public static /* synthetic */ void i(Object[] objArr) {
        char c10;
        int i10;
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i11 = f53637e;
        int i12 = (i11 & (-60)) | ((~i11) & 59);
        int i13 = (i11 & 59) << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f53636d = i14 % 128;
        int i15 = i14 % 2;
        long j10 = ((long) iArr[6]) & 4294967295L;
        long j11 = ((long) iArr[7]) & 4294967295L;
        long j12 = ((long) iArr[8]) & 4294967295L;
        long j13 = ((long) iArr[9]) & 4294967295L;
        long j14 = (((long) iArr[10]) & 4294967295L) + j10;
        long j15 = (((long) iArr[11]) & 4294967295L) + j11;
        long j16 = (((long) iArr[0]) & 4294967295L) + j14;
        int i16 = (int) j16;
        long j17 = (((long) iArr[1]) & 4294967295L) + j15 + (j16 >> 32);
        int i17 = (int) j17;
        iArr2[1] = i17;
        long j18 = j14 + j12;
        long j19 = j15 + j13;
        long j20 = (((long) iArr[2]) & 4294967295L) + j18 + (j17 >> 32);
        long j21 = (((long) iArr[3]) & 4294967295L) + j19 + (j20 >> 32);
        iArr2[3] = (int) j21;
        long j22 = (((long) iArr[4]) & 4294967295L) + (j18 - j10) + (j21 >> 32);
        iArr2[4] = (int) j22;
        long j23 = (((long) iArr[5]) & 4294967295L) + (j19 - j11) + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = j23 >> 32;
        long j25 = (j20 & 4294967295L) + j24;
        long j26 = j24 + (((long) i16) & 4294967295L);
        iArr2[0] = (int) j26;
        long j27 = j26 >> 32;
        if (j27 != 0) {
            int i18 = (i11 ^ 73) + ((i11 & 73) << 1);
            f53636d = i18 % 128;
            long j28 = i17;
            if (i18 % 2 != 0) {
                long j29 = j27 / (j28 * 4294967295L);
                iArr2[0] = (int) j29;
                j25 /= j29 >> 100;
                c10 = ' ';
            } else {
                long j30 = j27 + (4294967295L & j28);
                iArr2[1] = (int) j30;
                c10 = ' ';
                j25 += j30 >> 32;
            }
        } else {
            c10 = ' ';
        }
        iArr2[2] = (int) j25;
        if ((j25 >> c10) != 0) {
            int i19 = i11 + 77;
            f53636d = i19 % 128;
            if (i19 % 2 == 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr2, 3}, -668114120, 668114158, 6)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{26, iArr2, 3}, -668114120, 668114158, 26)).intValue() != 0) {
                i10 = 1;
            } else if (iArr2[5] == -1) {
                int i20 = f53637e;
                int i21 = ((i20 | 119) << 1) - (i20 ^ 119);
                f53636d = i21 % 128;
                int i22 = i21 % 2;
                i10 = 1;
                if (((Boolean) auv.setDividerPadding(new Object[]{iArr2, f53633a}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue()) {
                }
            }
            Object[] objArr2 = new Object[i10];
            objArr2[0] = iArr2;
            setDividerPadding(objArr2, 1637622876, -1637622863, (int) System.currentTimeMillis());
            int i23 = f53636d;
            int i24 = i23 & 69;
            int i25 = ((i23 ^ 69) | i24) << 1;
            int i26 = -((i23 | 69) & (~i24));
            int i27 = (i25 & i26) + (i26 | i25);
            f53637e = i27 % 128;
            int i28 = i27 % 2;
        } else if (iArr2[5] == -1) {
            int i29 = f53637e;
            int i210 = ((i29 | 119) << 1) - (i29 ^ 119);
            f53636d = i210 % 128;
            int i211 = i210 % 2;
            i10 = 1;
            if (((Boolean) auv.setDividerPadding(new Object[]{iArr2, f53633a}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue()) {
                Object[] objArr3 = new Object[i10];
                objArr3[0] = iArr2;
                setDividerPadding(objArr3, 1637622876, -1637622863, (int) System.currentTimeMillis());
                int i212 = f53636d;
                int i213 = i212 & 69;
                int i214 = ((i212 ^ 69) | i213) << 1;
                int i215 = -((i212 | 69) & (~i213));
                int i216 = (i214 & i215) + (i215 | i214);
                f53637e = i216 % 128;
                int i217 = i216 % 2;
            }
        }
        int i30 = f53637e;
        int i31 = i30 & 71;
        int i32 = i31 + ((i30 ^ 71) | i31);
        f53636d = i32 % 128;
        if (i32 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0093  */
    public static /* synthetic */ void j(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53636d + 21;
        f53637e = i10 % 128;
        int i11 = i10 % 2;
        if (((Integer) auv.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -162499025, 162499057, (int) System.currentTimeMillis())).intValue() == 0) {
            int i12 = f53636d;
            int i13 = (((i12 & (-68)) | ((~i12) & 67)) - (~(-(-((i12 & 67) << 1))))) - 1;
            int i14 = i13 % 128;
            f53637e = i14;
            int i15 = i13 % 2;
            if (iArr3[5] == -1) {
                int i16 = i14 + 47;
                f53636d = i16 % 128;
                int i17 = i16 % 2;
                int[] iArr4 = f53633a;
                if (i17 != 0) {
                    ((Boolean) auv.setDividerPadding(new Object[]{iArr3, iArr4}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (!(!((Boolean) auv.setDividerPadding(new Object[]{iArr3, iArr4}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue())) {
                    setDividerPadding(new Object[]{iArr3}, 1637622876, -1637622863, (int) System.currentTimeMillis());
                    int i18 = f53637e;
                    int i19 = i18 ^ 69;
                    int i20 = ((i18 & 69) | i19) << 1;
                    int i21 = -i19;
                    int i22 = (i20 & i21) + (i20 | i21);
                    f53636d = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
        } else {
            setDividerPadding(new Object[]{iArr3}, 1637622876, -1637622863, (int) System.currentTimeMillis());
            int i110 = f53637e;
            int i111 = i110 ^ 69;
            int i24 = ((i110 & 69) | i111) << 1;
            int i25 = -i111;
            int i26 = (i24 & i25) + (i24 | i25);
            f53636d = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = f53637e;
        int i29 = (((i28 & (-64)) | ((~i28) & 63)) - (~((i28 & 63) << 1))) - 1;
        f53636d = i29 % 128;
        if (i29 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        int i10 = 0;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53636d;
        int i12 = (((i11 | 39) << 1) - (~(-(((~i11) & 39) | (i11 & (-40)))))) - 1;
        int i13 = i12 % 128;
        f53637e = i13;
        int i14 = i12 % 2;
        int i15 = i13 & 15;
        int i16 = i15 + ((i13 ^ 15) | i15);
        f53636d = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i10 < 6) {
            int i19 = f53636d;
            int i20 = ((i19 | 7) << 1) - (i19 ^ 7);
            int i21 = i20 % 128;
            f53637e = i21;
            if (i20 % 2 == 0) {
                int i22 = iArr[i10];
                int i23 = i18 & i22;
                int i24 = (i18 | i22) & (~i23);
                i18 = (i24 & i23) | (i24 ^ i23);
                int i25 = i10 & 99;
                int i26 = i10 | 99;
                int i27 = (i25 & i26) + (i26 | i25);
                int i28 = ((i27 ^ (-17)) | (i27 & (-17))) << 1;
                int i29 = -((i27 & 16) | ((~i27) & (-17)));
                i10 = (i28 ^ i29) + ((i28 & i29) << 1);
            } else {
                int i30 = iArr[i10];
                int i31 = i18 ^ i30;
                int i32 = i18 & i30;
                i18 = (i32 & i31) | (i31 ^ i32);
                i10++;
            }
            int i33 = i21 & 63;
            int i34 = -(-((i21 ^ 63) | i33));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            f53636d = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = i18 >>> 1;
        int i38 = i18 & 1;
        int i39 = (i37 & i38) | (i37 ^ i38);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i40 = -(-(i39 * 517));
        int i41 = 515 & i40;
        int i42 = (i40 | 515) & (~i41);
        int i43 = -(-(i41 << 1));
        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
        int i45 = ~i39;
        int i46 = (i45 | i39) & i45;
        int i47 = i46 & iCurrentTimeMillis;
        int i48 = (i46 | iCurrentTimeMillis) & (~i47);
        int i49 = ~iCurrentTimeMillis;
        int i50 = ~(i48 | i47);
        int i51 = ~i49;
        int i52 = ~((i51 & i49) | (i51 ^ i49));
        int i53 = ((~i52) & i50) | ((~i50) & i52);
        int i54 = i50 & i52;
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = ~((i49 ^ i39) | (i49 & i39));
        int i57 = ((i55 & i56) | (i55 ^ i56)) * (-516);
        int i58 = ((i44 ^ i57) | (i44 & i57)) << 1;
        int i59 = -((i57 & (~i44)) | ((~i57) & i44));
        int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
        int i61 = i45 & iCurrentTimeMillis;
        int i62 = (~i61) & (i45 | iCurrentTimeMillis);
        int i63 = ~((i61 & i62) | (i62 ^ i61));
        int i64 = (iCurrentTimeMillis | i49) & i49;
        int i65 = i64 & i39;
        int i66 = (~i65) & (i64 | i39);
        int i67 = ~((i66 & i65) | (i66 ^ i65));
        int i68 = i63 & i67;
        int i69 = (i63 | i67) & (~i68);
        int i70 = (i60 - (~(-(-(((i69 & i68) | (i69 ^ i68)) * LibMCryptConstants.IND_HEX_SEGMENTO2))))) - 1;
        int i71 = (i39 ^ i64) | i65;
        int i72 = ~i71;
        int i73 = (i71 | i72) & i72;
        int i74 = ((~i73) & i45) | ((~i45) & i73);
        int i75 = i73 & i45;
        int i76 = ((-2) - ((i70 - (~(-(-(((i75 & i74) | (i74 ^ i75)) * LibMCryptConstants.IND_HEX_SEGMENTO2))))) ^ (-1))) >> 31;
        int i77 = f53637e;
        int i78 = (i77 ^ 45) + ((i77 & 45) << 1);
        f53636d = i78 % 128;
        if (i78 % 2 == 0) {
            return Integer.valueOf(i76);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0072  */
    /* JADX WARN: Code duplicated, block: B:13:0x0082  */
    /* JADX WARN: Code duplicated, block: B:14:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0052 A[PHI: r10
      0x0052: PHI (r10v6 int[]) = (r10v5 int[]), (r10v14 int[]) binds: [B:8:0x0050, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object l(Object[] objArr) {
        int[] iArr;
        int[] iArr2;
        int i10;
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i11 = f53637e;
        int i12 = ((i11 ^ 37) | (i11 & 37)) << 1;
        int i13 = -(((~i11) & 37) | (i11 & (-38)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f53636d = i14 % 128;
        if (i14 % 2 != 0) {
            iArr = (int[]) auv.setDividerPadding(new Object[]{bigInteger}, 1502133921, -1502133895, (int) System.currentTimeMillis());
            if (iArr[3] == -1) {
                iArr2 = f53633a;
                if (!(!((Boolean) auv.setDividerPadding(new Object[]{iArr, iArr2}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue())) {
                    i10 = f53637e + 5;
                    f53636d = i10 % 128;
                    if (i10 % 2 == 0) {
                        ((Integer) auv.setDividerPadding(new Object[]{iArr2, iArr}, -1105853010, 1105853027, (int) System.currentTimeMillis())).intValue();
                        throw null;
                    }
                    ((Integer) auv.setDividerPadding(new Object[]{iArr2, iArr}, -1105853010, 1105853027, (int) System.currentTimeMillis())).intValue();
                    int i15 = f53636d + 13;
                    f53637e = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
        } else {
            iArr = (int[]) auv.setDividerPadding(new Object[]{bigInteger}, 1502133921, -1502133895, (int) System.currentTimeMillis());
            if (iArr[5] == -1) {
                iArr2 = f53633a;
                if (!(!((Boolean) auv.setDividerPadding(new Object[]{iArr, iArr2}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue())) {
                    i10 = f53637e + 5;
                    f53636d = i10 % 128;
                    if (i10 % 2 == 0) {
                        ((Integer) auv.setDividerPadding(new Object[]{iArr2, iArr}, -1105853010, 1105853027, (int) System.currentTimeMillis())).intValue();
                        throw null;
                    }
                    ((Integer) auv.setDividerPadding(new Object[]{iArr2, iArr}, -1105853010, 1105853027, (int) System.currentTimeMillis())).intValue();
                    int i17 = f53636d + 13;
                    f53637e = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
        }
        int i19 = f53637e;
        int i20 = i19 ^ 71;
        int i21 = ((((i19 & 71) | i20) << 1) - (~(-i20))) - 1;
        f53636d = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 2 / 0;
        }
        return iArr;
    }

    public static /* synthetic */ void m(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int i10 = f53636d;
        int i11 = i10 & 33;
        int i12 = (((i10 | 33) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f53637e = i12 % 128;
        if (i12 % 2 == 0) {
            int[] iArr3 = (int[]) auv.setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
            auv.setDividerPadding(new Object[]{iArr, iArr3}, 955273017, -955272992, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{iArr3, iArr2}, 1570810584, -1570810580, (int) System.currentTimeMillis());
            throw null;
        }
        int[] iArr4 = (int[]) auv.setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
        auv.setDividerPadding(new Object[]{iArr, iArr4}, 955273017, -955272992, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr4, iArr2}, 1570810584, -1570810580, (int) System.currentTimeMillis());
        int i13 = f53636d;
        int i14 = (((i13 & (-110)) | ((~i13) & 109)) - (~(-(-((i13 & 109) << 1))))) - 1;
        f53637e = i14 % 128;
        while (true) {
            int i15 = i14 % 2;
            iIntValue--;
            if (iIntValue <= 0) {
                int i16 = f53636d;
                int i17 = ((i16 & 72) + (i16 | 72)) - 1;
                f53637e = i17 % 128;
                int i18 = i17 % 2;
                return;
            }
            int i19 = f53636d + 121;
            f53637e = i19 % 128;
            int i20 = i19 % 2;
            auv.setDividerPadding(new Object[]{iArr2, iArr4}, 955273017, -955272992, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{iArr4, iArr2}, 1570810584, -1570810580, (int) System.currentTimeMillis());
            int i21 = f53637e;
            i14 = (((i21 | 94) << 1) - (i21 ^ 94)) - 1;
            f53636d = i14 % 128;
        }
    }

    public static /* synthetic */ void n(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53637e;
        int i11 = i10 & 85;
        int i12 = i11 + ((i10 ^ 85) | i11);
        f53636d = i12 % 128;
        int i13 = i12 % 2;
        int[] iArr3 = f53633a;
        if (i13 != 0) {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
            int i14 = 53 / 0;
        } else {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
        }
        int i15 = f53636d;
        int i16 = i15 & 61;
        int i17 = (i16 - (~(-(-((i15 ^ 61) | i16))))) - 1;
        f53637e = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 43 / 0;
        }
    }

    public static void setCompoundDrawableTintBlendMode(int i10, int[] iArr) {
        setDividerPadding(new Object[]{Integer.valueOf(i10), iArr}, -1380861850, 1380861861, i10);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0081 A[PHI: r7
      0x0081: PHI (r7v28 long) = (r7v22 long), (r7v32 long) binds: [B:17:0x0092, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0094 A[PHI: r7
      0x0094: PHI (r7v23 long) = (r7v22 long), (r7v32 long) binds: [B:17:0x0092, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x020e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0230  */
    /* JADX WARN: Code duplicated, block: B:73:0x034b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0351  */
    /* JADX WARN: Code duplicated, block: B:77:0x0386  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        long j10;
        char c10;
        int i13;
        Object onFocusChangeListener;
        long j11;
        int i14;
        long j12;
        int i15 = ~i10;
        int i16 = ~i11;
        Integer num = 3;
        switch ((((~(i10 | (~i12))) | i16) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i15 | i16)) | (~(i16 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167))) {
            case 1:
                int[] iArr = (int[]) objArr[0];
                int[] iArr2 = (int[]) objArr[1];
                int[] iArr3 = (int[]) objArr[2];
                int i17 = f53636d;
                int i18 = (i17 ^ 38) + ((i17 & 38) << 1);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                f53637e = i19 % 128;
                int i20 = i19 % 2;
                int[] iArr4 = (int[]) auv.setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
                auv.setDividerPadding(new Object[]{iArr, iArr2, iArr4}, 1843135733, -1843135721, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{iArr4, iArr3}, 1570810584, -1570810580, (int) System.currentTimeMillis());
                int i21 = f53637e;
                int i22 = (i21 & 62) + (i21 | 62);
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                f53636d = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 2:
                e(objArr);
                return null;
            case 3:
                m(objArr);
                return null;
            case 4:
                i(objArr);
                return null;
            case 5:
                return l(objArr);
            case 6:
                f(objArr);
                return null;
            case 7:
                b(objArr);
                return null;
            case 8:
                j(objArr);
                return null;
            case 9:
                g(objArr);
                return null;
            case 10:
                h(objArr);
                return null;
            case 11:
                int iIntValue = ((Number) objArr[0]).intValue();
                int[] iArr5 = (int[]) objArr[1];
                int i25 = f53637e;
                int i26 = ((i25 | 60) << 1) - (i25 ^ 60);
                int i27 = (i26 ^ (-1)) + (i26 << 1);
                f53636d = i27 % 128;
                int i28 = i27 % 2;
                if (iIntValue != 0) {
                    int i29 = (((i25 ^ 115) | (i25 & 115)) << 1) - (((~i25) & 115) | (i25 & (-116)));
                    int i30 = i29 % 128;
                    f53636d = i30;
                    int i31 = i29 % 2;
                    long j13 = ((long) iIntValue) & 4294967295L;
                    long j14 = (((long) iArr5[0]) & 4294967295L) + j13;
                    int i32 = (int) j14;
                    iArr5[0] = i32;
                    long j15 = j14 >> 32;
                    if (j15 != 0) {
                        int i33 = (-2) - (((i30 ^ 86) + ((i30 & 86) << 1)) ^ (-1));
                        f53637e = i33 % 128;
                        if (i33 % 2 == 0) {
                            long j16 = (((long) i32) ^ 4294967295L) ^ j15;
                            iArr5[0] = (int) j16;
                            j15 = j16 >> 4;
                            c10 = ' ';
                        } else {
                            long j17 = j15 + (((long) iArr5[1]) & 4294967295L);
                            iArr5[1] = (int) j17;
                            c10 = ' ';
                            j15 = j17 >> 32;
                        }
                    } else {
                        c10 = ' ';
                    }
                    long j18 = (((long) iArr5[2]) & 4294967295L) + j13 + j15;
                    iArr5[2] = (int) j18;
                    j10 = j18 >> c10;
                    int i34 = f53637e;
                    int i35 = i34 & 31;
                    int i36 = i35 + ((i34 ^ 31) | i35);
                    f53636d = i36 % 128;
                    int i37 = i36 % 2;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    int i38 = f53636d;
                    int i39 = i38 & 119;
                    int i40 = -(-((i38 ^ 119) | i39));
                    int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                    f53637e = i41 % 128;
                    if (i41 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr5, num}, -668114120, 668114158, 6)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{57, iArr5, 2}, -668114120, 668114158, 57)).intValue() != 0) {
                        setDividerPadding(new Object[]{iArr5}, 1637622876, -1637622863, (int) System.currentTimeMillis());
                    } else if (iArr5[5] == -1) {
                        int i42 = f53636d;
                        int i43 = i42 & 37;
                        int i44 = ((i42 ^ 37) | i43) << 1;
                        int i45 = -((i42 | 37) & (~i43));
                        int i46 = (i44 & i45) + (i45 | i44);
                        f53637e = i46 % 128;
                        int i47 = i46 % 2;
                        if (((Boolean) auv.setDividerPadding(new Object[]{iArr5, f53633a}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue()) {
                            setDividerPadding(new Object[]{iArr5}, 1637622876, -1637622863, (int) System.currentTimeMillis());
                        }
                    }
                } else if (iArr5[5] == -1) {
                    int i48 = f53636d;
                    int i49 = i48 & 37;
                    int i410 = ((i48 ^ 37) | i49) << 1;
                    int i411 = -((i48 | 37) & (~i49));
                    int i412 = (i410 & i411) + (i411 | i410);
                    f53637e = i412 % 128;
                    int i413 = i412 % 2;
                    if (((Boolean) auv.setDividerPadding(new Object[]{iArr5, f53633a}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue()) {
                        setDividerPadding(new Object[]{iArr5}, 1637622876, -1637622863, (int) System.currentTimeMillis());
                    }
                }
                int i50 = f53637e;
                int i51 = (i50 | 97) << 1;
                int i52 = -(i50 ^ 97);
                int i53 = (i51 & i52) + (i52 | i51);
                f53636d = i53 % 128;
                int i54 = i53 % 2;
                return null;
            case 12:
                int[] iArr6 = (int[]) objArr[0];
                int[] iArr7 = (int[]) objArr[1];
                int[] iArr8 = (int[]) objArr[2];
                int i55 = f53636d;
                int i56 = i55 & 73;
                int i57 = ((i55 ^ 73) | i56) << 1;
                int i58 = -((i55 | 73) & (~i56));
                int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                f53637e = i59 % 128;
                int i60 = i59 % 2;
                if (((Integer) auv.setDividerPadding(new Object[]{iArr6, iArr7, iArr8}, -275346568, 275346590, (int) System.currentTimeMillis())).intValue() == 0) {
                    int i61 = f53637e;
                    int i62 = i61 & 43;
                    int i63 = (i61 ^ 43) | i62;
                    int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                    f53636d = i64 % 128;
                    if (i64 % 2 == 0 ? iArr8[11] == -1 : iArr8[13] == -1) {
                        int i65 = (i61 ^ 105) + ((i61 & 105) << 1);
                        f53636d = i65 % 128;
                        int i66 = i65 % 2;
                        int[] iArr9 = f53634b;
                        if (i66 == 0 ? ((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr8, iArr9}, 280624047, -280624046, 12)).booleanValue() : ((Boolean) auy.setOnFocusChangeListener(new Object[]{74, iArr8, iArr9}, 280624047, -280624046, 74)).booleanValue()) {
                            if (((Integer) auy.setOnFocusChangeListener(new Object[]{9, f53635c, iArr8}, -1807856331, 1807856377, 9)).intValue() != 0) {
                                int i67 = f53636d;
                                int i68 = i67 ^ 25;
                                int i69 = ((i67 & 25) | i68) << 1;
                                int i70 = -i68;
                                i13 = (i69 ^ i70) + ((i69 & i70) << 1);
                                f53637e = i13 % 128;
                                if (i13 % 2 == 0) {
                                    onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{104, iArr8, 9}, -668114120, 668114158, 104);
                                } else {
                                    onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{12, iArr8, 9}, -668114120, 668114158, 12);
                                }
                                ((Integer) onFocusChangeListener).intValue();
                                int i71 = f53637e + 77;
                                f53636d = i71 % 128;
                                int i72 = i71 % 2;
                            }
                        }
                    }
                } else if (((Integer) auy.setOnFocusChangeListener(new Object[]{9, f53635c, iArr8}, -1807856331, 1807856377, 9)).intValue() != 0) {
                    int i610 = f53636d;
                    int i611 = i610 ^ 25;
                    int i612 = ((i610 & 25) | i611) << 1;
                    int i73 = -i611;
                    i13 = (i612 ^ i73) + ((i612 & i73) << 1);
                    f53637e = i13 % 128;
                    if (i13 % 2 == 0) {
                        onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{104, iArr8, 9}, -668114120, 668114158, 104);
                    } else {
                        onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{12, iArr8, 9}, -668114120, 668114158, 12);
                    }
                    ((Integer) onFocusChangeListener).intValue();
                    int i74 = f53637e + 77;
                    f53636d = i74 % 128;
                    int i75 = i74 % 2;
                }
                int i76 = f53636d;
                int i77 = i76 & 125;
                int i78 = ((i76 | 125) & (~i77)) + (i77 << 1);
                f53637e = i78 % 128;
                int i79 = i78 % 2;
                return null;
            case 13:
                int[] iArr10 = (int[]) objArr[0];
                int i80 = f53636d;
                int i81 = i80 & 105;
                int i82 = -(-((i80 ^ 105) | i81));
                int i83 = (i81 & i82) + (i81 | i82);
                f53637e = i83 % 128;
                if (i83 % 2 == 0) {
                    long j19 = (((long) iArr10[0]) % 4294967295L) % 0;
                    iArr10[1] = (int) j19;
                    j11 = j19 << 3;
                    if (j11 != 1) {
                        i14 = i80 + 109;
                        f53637e = i14 % 128;
                        if (i14 % 2 == 0) {
                            long j20 = j11 - (((long) iArr10[0]) / 4294967295L);
                            iArr10[0] = (int) j20;
                            j12 = j20 << 48;
                        } else {
                            long j21 = j11 + (((long) iArr10[1]) & 4294967295L);
                            iArr10[1] = (int) j21;
                            j12 = j21 >> 32;
                        }
                        j11 = j12;
                        int i84 = (i80 & (-72)) | ((~i80) & 71);
                        int i85 = (i80 & 71) << 1;
                        int i86 = (i84 ^ i85) + ((i84 & i85) << 1);
                        f53637e = i86 % 128;
                        int i87 = i86 % 2;
                    } else {
                        num = num;
                    }
                } else {
                    long j22 = (((long) iArr10[0]) & 4294967295L) + 1;
                    iArr10[0] = (int) j22;
                    j11 = j22 >> 32;
                    if (j11 != 0) {
                        i14 = i80 + 109;
                        f53637e = i14 % 128;
                        if (i14 % 2 == 0) {
                            long j23 = j11 - (((long) iArr10[0]) / 4294967295L);
                            iArr10[0] = (int) j23;
                            j12 = j23 << 48;
                        } else {
                            long j24 = j11 + (((long) iArr10[1]) & 4294967295L);
                            iArr10[1] = (int) j24;
                            j12 = j24 >> 32;
                        }
                        j11 = j12;
                        int i88 = (i80 & (-72)) | ((~i80) & 71);
                        int i89 = (i80 & 71) << 1;
                        int i810 = (i88 ^ i89) + ((i88 & i89) << 1);
                        f53637e = i810 % 128;
                        int i811 = i810 % 2;
                    } else {
                        num = num;
                    }
                }
                long j25 = (((long) iArr10[2]) & 4294967295L) + 1 + j11;
                iArr10[2] = (int) j25;
                if ((j25 >> 32) != 0) {
                    int i90 = ((i80 & 81) - (~(-(-(i80 | 81))))) - 1;
                    f53637e = i90 % 128;
                    int i91 = i90 % 2;
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr10, num}, -668114120, 668114158, 6)).intValue();
                    int i92 = f53637e;
                    int i93 = i92 & 81;
                    int i94 = i92 | 81;
                    int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                    f53636d = i95 % 128;
                    int i96 = i95 % 2;
                }
                int i97 = f53636d;
                int i98 = ((i97 | 21) << 1) - (i97 ^ 21);
                f53637e = i98 % 128;
                int i99 = i98 % 2;
                return null;
            case 14:
                return k(objArr);
            case 15:
                a(objArr);
                return null;
            case 16:
                c(objArr);
                return null;
            case 17:
                n(objArr);
                return null;
            default:
                d(objArr);
                return null;
        }
    }

    public static void setOnDragListener(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -7280817, 7280819, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 1570810584, -1570810580, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1537018435, 1537018435, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int i10, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, Integer.valueOf(i10), iArr2}, -805245684, 805245687, i10);
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1560807306, 1560807323, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1204843885, -1204843884, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1487504285, -1487504273, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 1165206214, -1165206204, (int) System.currentTimeMillis());
    }

    public static int[] setY(BigInteger bigInteger) {
        return (int[]) setDividerPadding(new Object[]{bigInteger}, 198146799, -198146794, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 577026792, -577026784, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 2133577096, -2133577080, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(SecureRandom secureRandom, int[] iArr) {
        setDividerPadding(new Object[]{secureRandom, iArr}, 699509921, -699509914, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 402014030, -402014015, (int) System.currentTimeMillis());
    }
}
