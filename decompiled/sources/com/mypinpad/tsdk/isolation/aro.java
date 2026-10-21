package com.mypinpad.tsdk.isolation;

import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53693a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53694b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53695c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53696d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53697e = 1;

    static {
        int i10 = -(-69);
        f53697e = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer a(Object[] objArr) {
        int i10 = 0;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53697e;
        int i12 = ((i11 ^ 108) + ((i11 & 108) << 1)) - 1;
        int i13 = i12 % 128;
        f53696d = i13;
        int i14 = i12 % 2;
        int i15 = (i13 ^ 69) + ((i13 & 69) << 1);
        f53697e = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i10 < 12) {
            int i18 = f53696d;
            int i19 = i18 & 21;
            int i20 = (i18 ^ 21) | i19;
            int i21 = (i19 & i20) + (i20 | i19);
            f53697e = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = iArr[i10];
                int i23 = i17 ^ i22;
                int i24 = i17 & i22;
                i17 = (i24 & i23) | (i23 ^ i24);
                int i25 = i10 & (-82);
                i10 = i25 + ((i10 ^ (-82)) | i25) + 127;
            } else {
                int i26 = iArr[i10];
                i17 = (i17 & i26) | (i17 ^ i26);
                int i27 = i10 & 1;
                int i28 = -(-((i10 ^ 1) | i27));
                i10 = (i27 ^ i28) + ((i28 & i27) << 1);
            }
        }
        int i29 = i17 >>> 1;
        int i30 = i17 & 1;
        int i31 = i29 & i30;
        int i32 = ((i29 | i30) & (~i31)) | i31;
        System.currentTimeMillis();
        int i33 = 699 - (~(i32 * 702));
        int i34 = ~i32;
        int i35 = -(-((~i34) * 701));
        int i36 = (i33 ^ i35) + ((i33 & i35) << 1);
        int i37 = -(-(i32 * (-701)));
        int i38 = ((~i37) & i36) | ((~i36) & i37);
        int i39 = -(-((i37 & i36) << 1));
        int i40 = ((((i38 & i39) + (i39 | i38)) - (~(-(-(i34 * 701))))) - 1) >> 31;
        int i41 = f53696d;
        int i42 = i41 & 63;
        int i43 = ((i41 ^ 63) | i42) << 1;
        int i44 = -((i41 | 63) & (~i42));
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        f53697e = i45 % 128;
        if (i45 % 2 != 0) {
            return Integer.valueOf(i40);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:20:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:22:0x0127  */
    public static /* synthetic */ void b(Object[] objArr) {
        long j10;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53697e;
        int i11 = i10 ^ 103;
        int i12 = ((((i10 & 103) | i11) << 1) - (~(-i11))) - 1;
        int i13 = i12 % 128;
        f53696d = i13;
        int i14 = i12 % 2;
        if (iIntValue != 0) {
            int i15 = ((i13 & 16) + (i13 | 16)) - 1;
            f53697e = i15 % 128;
            int i16 = i15 % 2;
            long j11 = ((long) iIntValue) & 4294967295L;
            long j12 = (((long) iArr[0]) & 4294967295L) + j11;
            iArr[0] = (int) j12;
            long j13 = ((((long) iArr[1]) & 4294967295L) - j11) + (j12 >> 32);
            iArr[1] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                int i17 = (((i13 ^ 3) | (i13 & 3)) << 1) - ((i13 & (-4)) | (3 & (~i13)));
                int i18 = i17 % 128;
                f53697e = i18;
                if (i17 % 2 == 0) {
                    long j15 = j14 / (((long) iArr[3]) % 4294967295L);
                    iArr[2] = (int) j15;
                    j14 = j15 >> 16;
                } else {
                    long j16 = j14 + (((long) iArr[2]) & 4294967295L);
                    iArr[2] = (int) j16;
                    j14 = j16 >> 32;
                }
                int i19 = (i18 & 7) + (i18 | 7);
                f53696d = i19 % 128;
                int i20 = i19 % 2;
            }
            long j17 = (((long) iArr[3]) & 4294967295L) + j11 + j14;
            iArr[3] = (int) j17;
            long j18 = (4294967295L & ((long) iArr[4])) + j11 + (j17 >> 32);
            iArr[4] = (int) j18;
            j10 = j18 >> 32;
            int i21 = f53697e;
            int i22 = (i21 & (-38)) | ((~i21) & 37);
            int i23 = (i21 & 37) << 1;
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            f53696d = i24 % 128;
            int i25 = i24 % 2;
        } else {
            j10 = 0;
        }
        if (j10 != 0) {
            int i26 = f53696d;
            int i27 = i26 ^ 111;
            int i28 = (i26 & 111) << 1;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f53697e = i29 % 128;
            int i30 = i29 % 2;
            if (((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr, 5}, -668114120, 668114158, 12)).intValue() != 0) {
                setDividerPadding(new Object[]{iArr}, 668685463, -668685448, (int) System.currentTimeMillis());
                int i31 = f53696d;
                int i32 = i31 | 23;
                int i33 = (i32 << 1) - ((~(i31 & 23)) & i32);
                f53697e = i33 % 128;
                int i34 = i33 % 2;
            } else if (iArr[11] == -1) {
                int i35 = f53696d + 19;
                f53697e = i35 % 128;
                int i36 = i35 % 2;
                if (((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr, f53693a}, 280624047, -280624046, 12)).booleanValue()) {
                    setDividerPadding(new Object[]{iArr}, 668685463, -668685448, (int) System.currentTimeMillis());
                    int i37 = f53696d;
                    int i38 = i37 | 23;
                    int i39 = (i38 << 1) - ((~(i37 & 23)) & i38);
                    f53697e = i39 % 128;
                    int i310 = i39 % 2;
                }
            }
        } else if (iArr[11] == -1) {
            int i311 = f53696d + 19;
            f53697e = i311 % 128;
            int i312 = i311 % 2;
            if (((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr, f53693a}, 280624047, -280624046, 12)).booleanValue()) {
                setDividerPadding(new Object[]{iArr}, 668685463, -668685448, (int) System.currentTimeMillis());
                int i313 = f53696d;
                int i314 = i313 | 23;
                int i315 = (i314 << 1) - ((~(i313 & 23)) & i314);
                f53697e = i315 % 128;
                int i316 = i315 % 2;
            }
        }
        int i40 = f53696d;
        int i41 = ((i40 | 5) << 1) - (i40 ^ 5);
        f53697e = i41 % 128;
        if (i41 % 2 == 0) {
            int i42 = 87 / 0;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53696d;
        int i11 = i10 & 27;
        int i12 = -(-((i10 ^ 27) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53697e = i13 % 128;
        int i14 = i13 % 2;
        int[] iArr4 = (int[]) auy.setOnFocusChangeListener(new Object[]{24}, 1950542281, -1950542250, 24);
        avd.setX(new Object[]{iArr, iArr2, iArr4}, -563638869, 563638870, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr4, iArr3}, -675644206, 675644210, (int) System.currentTimeMillis());
        int i15 = f53696d + 60;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        f53697e = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 64 / 0;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int[] iArr3 = (int[]) objArr[3];
        int i10 = f53697e;
        int i11 = i10 | 11;
        int i12 = ((i11 << 1) - (~(-((~(i10 & 11)) & i11)))) - 1;
        f53696d = i12 % 128;
        int i13 = i12 % 2;
        avd.setX(new Object[]{iArr, iArr3}, -890681907, 890681907, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr3, iArr2}, -675644206, 675644210, (int) System.currentTimeMillis());
        int i14 = f53696d;
        int i15 = (i14 & (-112)) | ((~i14) & 111);
        int i16 = (i14 & 111) << 1;
        int i17 = (i15 & i16) + (i16 | i15);
        f53697e = i17 % 128;
        int i18 = i17 % 2;
        while (true) {
            int i19 = ~iIntValue;
            int i20 = (iIntValue | i19) << 1;
            int i21 = -i19;
            iIntValue = (i20 ^ i21) + ((i21 & i20) << 1);
            if (iIntValue <= 0) {
                int i22 = f53697e + 75;
                f53696d = i22 % 128;
                int i23 = i22 % 2;
                return;
            }
            int i24 = f53697e;
            int i25 = ((i24 ^ 82) + ((i24 & 82) << 1)) - 1;
            f53696d = i25 % 128;
            Object[] objArr2 = new Object[2];
            if (i25 % 2 != 0) {
                objArr2[0] = iArr2;
                objArr2[1] = iArr3;
                avd.setX(objArr2, -890681907, 890681907, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{iArr3, iArr2}, -675644206, 675644210, (int) System.currentTimeMillis());
                int i26 = 96 / 0;
            } else {
                objArr2[0] = iArr2;
                objArr2[1] = iArr3;
                avd.setX(objArr2, -890681907, 890681907, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{iArr3, iArr2}, -675644206, 675644210, (int) System.currentTimeMillis());
            }
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = (-2) - ((f53696d + 88) ^ (-1));
        f53697e = i10 % 128;
        int i11 = i10 % 2;
        int iIntValue = ((Integer) setDividerPadding(new Object[]{iArr}, -1093127550, 1093127569, (int) System.currentTimeMillis())).intValue();
        int[] iArr3 = f53693a;
        if (iIntValue == 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr3, iArr, iArr2}, 324288195, -324288186, 12)).intValue();
            int i12 = f53697e;
            int i13 = (((i12 & (-74)) | ((~i12) & 73)) - (~((i12 & 73) << 1))) - 1;
            f53696d = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 86 / 0;
                return;
            }
            return;
        }
        int i15 = f53697e;
        int i16 = ((i15 ^ 105) | (i15 & 105)) << 1;
        int i17 = -(((~i15) & 105) | (i15 & (-106)));
        int i18 = (i16 & i17) + (i17 | i16);
        f53696d = i18 % 128;
        int i19 = i18 % 2;
        ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr3, iArr3, iArr2}, 324288195, -324288186, 12)).intValue();
        int i20 = f53697e + 77;
        f53696d = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53697e;
        int i11 = i10 & 43;
        int i12 = ((i10 ^ 43) | i11) << 1;
        int i13 = -((i10 | 43) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f53696d = i14 % 128;
        int i15 = i14 % 2;
        avd.setX(new Object[]{iArr, iArr3}, -890681907, 890681907, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr3, iArr2}, -675644206, 675644210, (int) System.currentTimeMillis());
        int i16 = f53696d;
        int i17 = i16 & 95;
        int i18 = -(-((i16 ^ 95) | i17));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        f53697e = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53696d;
        int i11 = i10 ^ 125;
        int i12 = ((i10 & 125) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        f53697e = i14 % 128;
        int i15 = i14 % 2;
        int[] iArr3 = f53693a;
        if (i15 == 0) {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
            throw null;
        }
        ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
        int i16 = f53696d;
        int i17 = ((i16 | 91) << 1) - (i16 ^ 91);
        f53697e = i17 % 128;
        int i18 = i17 % 2;
    }

    public static /* synthetic */ Object h(Object[] objArr) {
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i10 = f53696d;
        int i11 = (i10 ^ 89) + ((i10 & 89) << 1);
        f53697e = i11 % 128;
        int i12 = i11 % 2;
        int[] iArr = (int[]) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(BluetoothState.REQUEST_CONNECT_DEVICE), bigInteger}, 1842671690, -1842671680, BluetoothState.REQUEST_CONNECT_DEVICE);
        if (iArr[11] == -1) {
            int i13 = f53697e;
            int i14 = ((-1) << 1) - ((((i13 | 66) << 1) - (i13 ^ 66)) ^ (-1));
            f53696d = i14 % 128;
            int i15 = i14 % 2;
            int[] iArr2 = f53693a;
            if (i15 == 0 ? !(!((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr, iArr2}, 280624047, -280624046, 12)).booleanValue()) : ((Boolean) auy.setOnFocusChangeListener(new Object[]{116, iArr, iArr2}, 280624047, -280624046, 116)).booleanValue()) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr2, iArr}, 562472640, -562472619, 12)).intValue();
                int i16 = f53696d;
                int i17 = i16 & 105;
                int i18 = i17 + ((i16 ^ 105) | i17);
                f53697e = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        int i20 = f53697e - (-1);
        f53696d = i20 % 128;
        if (i20 % 2 == 0) {
            return iArr;
        }
        throw null;
    }

    public static /* synthetic */ void i(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53697e;
        int i11 = ((i10 ^ 122) + ((i10 & 122) << 1)) - 1;
        f53696d = i11 % 128;
        if (i11 % 2 == 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr, iArr2, iArr3}, 324288195, -324288186, 12)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{35, iArr, iArr2, iArr3}, 324288195, -324288186, 35)).intValue() != 0) {
            int i12 = f53696d;
            int i13 = ((i12 | 43) << 1) - (i12 ^ 43);
            f53697e = i13 % 128;
            if (i13 % 2 == 0) {
                setDividerPadding(new Object[]{iArr3}, -1641900889, 1641900895, (int) System.currentTimeMillis());
                int i14 = 74 / 0;
            } else {
                setDividerPadding(new Object[]{iArr3}, -1641900889, 1641900895, (int) System.currentTimeMillis());
            }
        }
        int i15 = f53697e;
        int i16 = i15 ^ 67;
        int i17 = ((i15 & 67) | i16) << 1;
        int i18 = -i16;
        int i19 = (i17 & i18) + (i17 | i18);
        f53696d = i19 % 128;
        int i20 = i19 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0096  */
    public static /* synthetic */ void j(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53696d;
        int i11 = i10 | 119;
        int i12 = ((i11 << 1) - (~(-((~(i10 & 119)) & i11)))) - 1;
        f53697e = i12 % 128;
        if (i12 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr, iArr2}, 1108035559, -1108035515, 12)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{0, iArr, iArr2}, 1108035559, -1108035515, 0)).intValue() != 0) {
            setDividerPadding(new Object[]{iArr2}, 668685463, -668685448, (int) System.currentTimeMillis());
            int i13 = f53697e;
            int i14 = i13 & 19;
            int i15 = -(-((i13 ^ 19) | i14));
            int i16 = (i14 & i15) + (i15 | i14);
            f53696d = i16 % 128;
            int i17 = i16 % 2;
        } else if (iArr2[11] == -1) {
            int i18 = f53697e;
            int i19 = i18 & 49;
            int i20 = (i18 | 49) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            f53696d = i22 % 128;
            int i23 = i22 % 2;
            if (!(!((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr2, f53693a}, 280624047, -280624046, 12)).booleanValue())) {
                setDividerPadding(new Object[]{iArr2}, 668685463, -668685448, (int) System.currentTimeMillis());
                int i110 = f53697e;
                int i111 = i110 & 19;
                int i112 = -(-((i110 ^ 19) | i111));
                int i113 = (i111 & i112) + (i112 | i111);
                f53696d = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        int i24 = f53697e;
        int i25 = i24 & 35;
        int i26 = (i24 ^ 35) | i25;
        int i27 = (i25 & i26) + (i26 | i25);
        f53696d = i27 % 128;
        if (i27 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void k(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int[] iArr4 = (int[]) objArr[3];
        int i10 = f53696d;
        int i11 = (i10 & (-108)) | ((~i10) & 107);
        int i12 = -(-((i10 & 107) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53697e = i13 % 128;
        int i14 = i13 % 2;
        avd.setX(new Object[]{iArr, iArr2, iArr4}, -563638869, 563638870, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr4, iArr3}, -675644206, 675644210, (int) System.currentTimeMillis());
        int i15 = f53696d;
        int i16 = i15 & 3;
        int i17 = (i15 | 3) & (~i16);
        int i18 = i16 << 1;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        f53697e = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void l(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int i10 = f53696d;
        int i11 = (i10 & 123) + (i10 | 123);
        int i12 = i11 % 128;
        f53697e = i12;
        int i13 = i11 % 2;
        byte[] bArr = new byte[48];
        int i14 = i12 & 65;
        int i15 = i14 + ((i12 ^ 65) | i14);
        f53696d = i15 % 128;
        int i16 = i15 % 2;
        do {
            secureRandom.nextBytes(bArr);
            ber.setDividerPadding(new Object[]{bArr, 0, iArr, 12}, 1570947064, -1570947056, 0);
        } while (((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr, f53693a}, -188447753, 188447787, 12)).intValue() == 0);
        int i17 = f53697e;
        int i18 = i17 & 57;
        int i19 = i18 + ((i17 ^ 57) | i18);
        f53696d = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -140358632, 140358640, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00de  */
    /* JADX WARN: Code duplicated, block: B:15:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x02b8  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Object onFocusChangeListener;
        long j10;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i14 | i12)) | i15) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i15 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i14 | i15 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317));
        int[] iArr = f53693a;
        int i17 = 2;
        switch (i16) {
            case 1:
                d(objArr);
                return null;
            case 2:
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                int[] iArr2 = (int[]) objArr[1];
                while (true) {
                    Object[] objArr2 = new Object[i17];
                    objArr2[0] = secureRandom;
                    objArr2[1] = iArr2;
                    setDividerPadding(objArr2, 1679380777, -1679380759, (int) System.currentTimeMillis());
                    if (((Integer) setDividerPadding(new Object[]{iArr2}, -1093127550, 1093127569, (int) System.currentTimeMillis())).intValue() == 0) {
                        int i18 = f53696d + 97;
                        f53697e = i18 % 128;
                        int i19 = i18 % 2;
                        return null;
                    }
                    i17 = 2;
                }
                break;
            case 3:
                int[] iArr3 = (int[]) objArr[0];
                int[] iArr4 = (int[]) objArr[1];
                int i20 = f53696d;
                int i21 = ((i20 & (-20)) | ((~i20) & 19)) + ((i20 & 19) << 1);
                f53697e = i21 % 128;
                int i22 = i21 % 2;
                if (((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr3, 0, iArr4}, -1008052683, 1008052691, 12)).intValue() == 0) {
                    int i23 = f53696d;
                    int i24 = i23 & 111;
                    int i25 = (((i23 ^ 111) | i24) << 1) - ((~i24) & (i23 | 111));
                    f53697e = i25 % 128;
                    if (i25 % 2 != 0 ? iArr4[11] == -1 : iArr4[59] == -1) {
                        int i26 = (i23 & 112) + (i23 | 112);
                        i13 = 1;
                        int i27 = i26 - 1;
                        f53697e = i27 % 128;
                        int i28 = i27 % 2;
                        if (((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr4, iArr}, 280624047, -280624046, 12)).booleanValue()) {
                        }
                    }
                    int i29 = f53696d;
                    int i30 = (i29 & (-58)) | ((~i29) & 57);
                    int i31 = (i29 & 57) << 1;
                    int i32 = (i30 & i31) + (i31 | i30);
                    f53697e = i32 % 128;
                    int i33 = i32 % 2;
                    return null;
                }
                i13 = 1;
                Object[] objArr3 = new Object[i13];
                objArr3[0] = iArr4;
                setDividerPadding(objArr3, 668685463, -668685448, (int) System.currentTimeMillis());
                int i34 = f53696d;
                int i35 = ((i34 & (-20)) | ((~i34) & 19)) + ((i34 & 19) << 1);
                f53697e = i35 % 128;
                int i36 = i35 % 2;
                int i210 = f53696d;
                int i37 = (i210 & (-58)) | ((~i210) & 57);
                int i38 = (i210 & 57) << 1;
                int i39 = (i37 & i38) + (i38 | i37);
                f53697e = i39 % 128;
                int i310 = i39 % 2;
                return null;
            case 4:
                int[] iArr5 = (int[]) objArr[0];
                int[] iArr6 = (int[]) objArr[1];
                int i40 = f53696d;
                int i41 = (((i40 | 42) << 1) - (i40 ^ 42)) - 1;
                f53697e = i41 % 128;
                int i42 = i41 % 2;
                long j11 = ((long) iArr5[16]) & 4294967295L;
                long j12 = ((long) iArr5[17]) & 4294967295L;
                long j13 = ((long) iArr5[18]) & 4294967295L;
                long j14 = ((long) iArr5[19]) & 4294967295L;
                long j15 = ((long) iArr5[20]) & 4294967295L;
                long j16 = ((long) iArr5[21]) & 4294967295L;
                long j17 = ((long) iArr5[22]) & 4294967295L;
                long j18 = ((long) iArr5[23]) & 4294967295L;
                long j19 = ((((long) iArr5[12]) & 4294967295L) + j15) - 1;
                long j20 = (((long) iArr5[13]) & 4294967295L) + j17;
                long j21 = (((long) iArr5[14]) & 4294967295L) + j17 + j18;
                long j22 = (((long) iArr5[15]) & 4294967295L) + j18;
                long j23 = j12 + j16;
                long j24 = j16 - j18;
                long j25 = j17 - j18;
                long j26 = j19 + j24;
                long j27 = (((long) iArr5[0]) & 4294967295L) + j26;
                iArr6[0] = (int) j27;
                long jB = a.b(((long) iArr5[1]) & 4294967295L, j18, j19, j20, j27 >> 32);
                iArr6[1] = (int) jB;
                long j28 = (((((long) iArr5[2]) & 4294967295L) - j16) - j20) + j21 + (jB >> 32);
                iArr6[2] = (int) j28;
                long j29 = ((((long) iArr5[3]) & 4294967295L) - j21) + j22 + j26 + (j28 >> 32);
                iArr6[3] = (int) j29;
                long j30 = (((((((long) iArr5[4]) & 4294967295L) + j11) + j16) + j20) - j22) + j26 + (j29 >> 32);
                iArr6[4] = (int) j30;
                long j31 = ((((long) iArr5[5]) & 4294967295L) - j11) + j20 + j21 + j23 + (j30 >> 32);
                iArr6[5] = (int) j31;
                long j32 = (((((long) iArr5[6]) & 4294967295L) + j13) - j12) + j21 + j22 + (j31 >> 32);
                iArr6[6] = (int) j32;
                long j33 = ((((((long) iArr5[7]) & 4294967295L) + j11) + j14) - j13) + j22 + (j32 >> 32);
                iArr6[7] = (int) j33;
                long j34 = (((((((long) iArr5[8]) & 4294967295L) + j11) + j12) + j15) - j14) + (j33 >> 32);
                iArr6[8] = (int) j34;
                long jB2 = a.b(((long) iArr5[9]) & 4294967295L, j13, j15, j23, j34 >> 32);
                iArr6[9] = (int) jB2;
                long j35 = ((((((long) iArr5[10]) & 4294967295L) + j13) + j14) - j24) + j25 + (jB2 >> 32);
                iArr6[10] = (int) j35;
                long jD = n1.d(((long) iArr5[11]) & 4294967295L, j14, j15, j25, j35 >> 32);
                iArr6[11] = (int) jD;
                int i43 = (int) ((jD >> 32) + 1);
                setDividerPadding(new Object[]{Integer.valueOf(i43), iArr6}, 386780309, -386780296, i43);
                int i44 = f53697e;
                int i45 = ((i44 & 42) + (i44 | 42)) - 1;
                f53696d = i45 % 128;
                int i46 = i45 % 2;
                return null;
            case 5:
                c(objArr);
                return null;
            case 6:
                int[] iArr7 = (int[]) objArr[0];
                int i47 = f53697e;
                int i48 = (i47 & (-22)) | ((~i47) & 21);
                int i49 = -(-((i47 & 21) << 1));
                int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                int i51 = i50 % 128;
                f53696d = i51;
                int i52 = i50 % 2;
                long j36 = (((long) iArr7[0]) & 4294967295L) - 1;
                iArr7[0] = (int) j36;
                long j37 = (((long) iArr7[1]) & 4294967295L) + 1 + (j36 >> 32);
                iArr7[1] = (int) j37;
                long j38 = j37 >> 32;
                if (j38 != 0) {
                    int i53 = (((i51 | 40) << 1) - (i51 ^ 40)) - 1;
                    f53697e = i53 % 128;
                    if (i53 % 2 == 0) {
                        long j39 = j38 | (((long) iArr7[3]) % 4294967295L);
                        iArr7[3] = (int) j39;
                        j10 = j39 >>> 52;
                    } else {
                        long j40 = j38 + (((long) iArr7[2]) & 4294967295L);
                        iArr7[2] = (int) j40;
                        j10 = j40 >> 32;
                    }
                    j38 = j10;
                }
                long j41 = ((((long) iArr7[3]) & 4294967295L) - 1) + j38;
                iArr7[3] = (int) j41;
                long j42 = ((((long) iArr7[4]) & 4294967295L) - 1) + (j41 >> 32);
                iArr7[4] = (int) j42;
                if ((j42 >> 32) != 0) {
                    int i54 = f53697e;
                    int i55 = i54 & 113;
                    int i56 = ((((i54 ^ 113) | i55) << 1) - (~(-((i54 | 113) & (~i55))))) - 1;
                    f53696d = i56 % 128;
                    Object[] objArr4 = new Object[3];
                    if (i56 % 2 != 0) {
                        objArr4[0] = 88;
                        objArr4[1] = iArr7;
                        objArr4[2] = 2;
                        onFocusChangeListener = auy.setOnFocusChangeListener(objArr4, -115920179, 115920214, 88);
                    } else {
                        objArr4[0] = 12;
                        objArr4[1] = iArr7;
                        objArr4[2] = 5;
                        onFocusChangeListener = auy.setOnFocusChangeListener(objArr4, -115920179, 115920214, 12);
                    }
                    ((Integer) onFocusChangeListener).intValue();
                    int i57 = f53696d;
                    int i58 = i57 & 115;
                    int i59 = ((i57 ^ 115) | i58) << 1;
                    int i60 = -((i57 | 115) & (~i58));
                    int i61 = (i59 & i60) + (i60 | i59);
                    f53697e = i61 % 128;
                    int i62 = i61 % 2;
                }
                int i63 = f53697e;
                int i64 = ((i63 & 42) + (i63 | 42)) - 1;
                f53696d = i64 % 128;
                int i65 = i64 % 2;
                return null;
            case 7:
                return h(objArr);
            case 8:
                int[] iArr8 = (int[]) objArr[0];
                int[] iArr9 = (int[]) objArr[1];
                int i66 = f53696d;
                int i67 = ((((i66 ^ 67) | (i66 & 67)) << 1) - (~(-(((~i66) & 67) | (i66 & (-68)))))) - 1;
                f53697e = i67 % 128;
                int i68 = i67 % 2;
                int[] iArr10 = (int[]) auy.setOnFocusChangeListener(new Object[]{24}, 1950542281, -1950542250, 24);
                avd.setX(new Object[]{iArr8, iArr10}, -890681907, 890681907, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{iArr10, iArr9}, -675644206, 675644210, (int) System.currentTimeMillis());
                int i69 = f53696d;
                int i70 = i69 ^ 49;
                int i71 = ((i69 & 49) | i70) << 1;
                int i72 = -i70;
                int i73 = (i71 ^ i72) + ((i71 & i72) << 1);
                f53697e = i73 % 128;
                int i74 = i73 % 2;
                return null;
            case 9:
                j(objArr);
                return null;
            case 10:
                int[] iArr11 = (int[]) objArr[0];
                int[] iArr12 = (int[]) objArr[1];
                int[] iArr13 = (int[]) objArr[2];
                int i75 = f53697e + 7;
                f53696d = i75 % 128;
                if (i75 % 2 == 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr11, iArr12, iArr13}, -729001745, 729001745, 12)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{41, iArr11, iArr12, iArr13}, -729001745, 729001745, 41)).intValue() != 0) {
                    setDividerPadding(new Object[]{iArr13}, 668685463, -668685448, (int) System.currentTimeMillis());
                    int i76 = f53696d;
                    int i77 = i76 & 113;
                    int i78 = ((i76 ^ 113) | i77) << 1;
                    int i79 = -((i76 | 113) & (~i77));
                    int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                    f53697e = i80 % 128;
                    int i81 = i80 % 2;
                } else {
                    int i82 = f53696d;
                    int i83 = ((i82 & 80) + (i82 | 80)) - 1;
                    f53697e = i83 % 128;
                    if (i83 % 2 != 0 ? iArr13[11] == -1 : iArr13[121] == -1) {
                        if (((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr13, iArr}, 280624047, -280624046, 12)).booleanValue()) {
                            setDividerPadding(new Object[]{iArr13}, 668685463, -668685448, (int) System.currentTimeMillis());
                            int i710 = f53696d;
                            int i711 = i710 & 113;
                            int i712 = ((i710 ^ 113) | i711) << 1;
                            int i713 = -((i710 | 113) & (~i711));
                            int i84 = ((i712 | i713) << 1) - (i713 ^ i712);
                            f53697e = i84 % 128;
                            int i85 = i84 % 2;
                        }
                    }
                }
                int i86 = f53696d;
                int i87 = ((i86 ^ 99) | (i86 & 99)) << 1;
                int i88 = -(((~i86) & 99) | (i86 & (-100)));
                int i89 = (i87 & i88) + (i88 | i87);
                f53697e = i89 % 128;
                int i90 = i89 % 2;
                return null;
            case 11:
                g(objArr);
                return null;
            case 12:
                i(objArr);
                return null;
            case 13:
                b(objArr);
                return null;
            case 14:
                e(objArr);
                return null;
            case 15:
                int[] iArr14 = (int[]) objArr[0];
                int i91 = f53697e;
                int i92 = i91 & 45;
                int i93 = ((i91 ^ 45) | i92) << 1;
                int i94 = -((~i92) & (i91 | 45));
                int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
                f53696d = i95 % 128;
                int i96 = i95 % 2;
                long j43 = (((long) iArr14[0]) & 4294967295L) + 1;
                iArr14[0] = (int) j43;
                long j44 = ((((long) iArr14[1]) & 4294967295L) - 1) + (j43 >> 32);
                iArr14[1] = (int) j44;
                long j45 = j44 >> 32;
                if (j45 != 0) {
                    int i97 = i91 + 21;
                    f53696d = i97 % 128;
                    if (i97 % 2 != 0) {
                        long j46 = j45 / (((long) iArr14[4]) | 4294967295L);
                        iArr14[2] = (int) j46;
                        j45 = j46 >> 34;
                    } else {
                        long j47 = j45 + (((long) iArr14[2]) & 4294967295L);
                        iArr14[2] = (int) j47;
                        j45 = j47 >> 32;
                    }
                    int i98 = i91 + 81;
                    f53696d = i98 % 128;
                    int i99 = i98 % 2;
                }
                long j48 = (((long) iArr14[3]) & 4294967295L) + 1 + j45;
                iArr14[3] = (int) j48;
                long j49 = (((long) iArr14[4]) & 4294967295L) + 1 + (j48 >> 32);
                iArr14[4] = (int) j49;
                if ((j49 >> 32) != 0) {
                    int i100 = f53696d;
                    int i101 = i100 & 9;
                    int i102 = -(-((i100 ^ 9) | i101));
                    int i103 = (i101 ^ i102) + ((i102 & i101) << 1);
                    f53697e = i103 % 128;
                    int i104 = i103 % 2;
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr14, 5}, -668114120, 668114158, 12)).intValue();
                    int i105 = f53696d;
                    int i106 = i105 & 67;
                    int i107 = (((i105 | 67) & (~i106)) - (~(-(-(i106 << 1))))) - 1;
                    f53697e = i107 % 128;
                    int i108 = i107 % 2;
                }
                int i109 = f53696d;
                int i110 = i109 | 9;
                int i111 = i110 << 1;
                int i112 = -((~(i109 & 9)) & i110);
                int i113 = (i111 & i112) + (i112 | i111);
                f53697e = i113 % 128;
                int i114 = i113 % 2;
                return null;
            case 16:
                f(objArr);
                return null;
            case 17:
                int[] iArr15 = (int[]) objArr[0];
                int[] iArr16 = (int[]) objArr[1];
                int[] iArr17 = (int[]) objArr[2];
                int i115 = f53697e + 83;
                f53696d = i115 % 128;
                int i116 = i115 % 2;
                if (((Integer) auy.setOnFocusChangeListener(new Object[]{24, iArr15, iArr16, iArr17}, -729001745, 729001745, 24)).intValue() == 0) {
                    int i117 = f53697e;
                    int i118 = (i117 & (-28)) | ((~i117) & 27);
                    int i119 = -(-((i117 & 27) << 1));
                    int i120 = (i118 ^ i119) + ((i118 & i119) << 1);
                    f53696d = i120 % 128;
                    int i121 = i120 % 2;
                    if (iArr17[23] == -1) {
                        int i122 = i117 + 69;
                        f53696d = i122 % 128;
                        int i123 = i122 % 2;
                        if (((Boolean) auy.setOnFocusChangeListener(new Object[]{24, iArr17, f53694b}, 280624047, -280624046, 24)).booleanValue()) {
                            if (((Integer) auy.setOnFocusChangeListener(new Object[]{17, f53695c, iArr17}, -1807856331, 1807856377, 17)).intValue() != 0) {
                                int i124 = f53696d;
                                int i125 = i124 & 5;
                                int i126 = (i124 ^ 5) | i125;
                                int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                                f53697e = i127 % 128;
                                int i128 = i127 % 2;
                                ((Integer) auy.setOnFocusChangeListener(new Object[]{24, iArr17, 17}, -668114120, 668114158, 24)).intValue();
                                int i129 = f53697e;
                                int i130 = i129 & 3;
                                int i131 = -(-(i129 | 3));
                                int i132 = (i130 ^ i131) + ((i131 & i130) << 1);
                                f53696d = i132 % 128;
                                int i133 = i132 % 2;
                            }
                        }
                    }
                } else if (((Integer) auy.setOnFocusChangeListener(new Object[]{17, f53695c, iArr17}, -1807856331, 1807856377, 17)).intValue() != 0) {
                    int i1210 = f53696d;
                    int i1211 = i1210 & 5;
                    int i1212 = (i1210 ^ 5) | i1211;
                    int i1213 = ((i1211 | i1212) << 1) - (i1212 ^ i1211);
                    f53697e = i1213 % 128;
                    int i1214 = i1213 % 2;
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{24, iArr17, 17}, -668114120, 668114158, 24)).intValue();
                    int i1215 = f53697e;
                    int i134 = i1215 & 3;
                    int i135 = -(-(i1215 | 3));
                    int i136 = (i134 ^ i135) + ((i135 & i134) << 1);
                    f53696d = i136 % 128;
                    int i137 = i136 % 2;
                }
                int i138 = f53696d;
                int i139 = (((i138 & (-58)) | ((~i138) & 57)) - (~((i138 & 57) << 1))) - 1;
                f53697e = i139 % 128;
                int i140 = i139 % 2;
                return null;
            case 18:
                l(objArr);
                return null;
            case 19:
                return a(objArr);
            default:
                k(objArr);
                return null;
        }
    }

    public static void setNavigationOnClickListener(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1563856121, 1563856124, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int i10, int[] iArr) {
        setDividerPadding(new Object[]{Integer.valueOf(i10), iArr}, 386780309, -386780296, i10);
    }

    public static void setX(int[] iArr, int i10, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, Integer.valueOf(i10), iArr2, iArr3}, -222135200, 222135201, i10);
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -1570771979, 1570771995, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1798884365, -1798884355, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 1272573318, -1272573307, (int) System.currentTimeMillis());
    }

    public static void setX(SecureRandom secureRandom, int[] iArr) {
        setDividerPadding(new Object[]{secureRandom, iArr}, 1180277873, -1180277871, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -675644206, 675644210, (int) System.currentTimeMillis());
    }

    public static int[] setOnFocusChangeListener(BigInteger bigInteger) {
        return (int[]) setDividerPadding(new Object[]{bigInteger}, -1203313814, 1203313821, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -895516728, 895516742, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -1000115482, 1000115499, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3, iArr4}, 260671883, -260671883, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1046795108, -1046795103, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 977033749, -977033737, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1863857962, 1863857971, (int) System.currentTimeMillis());
    }
}
