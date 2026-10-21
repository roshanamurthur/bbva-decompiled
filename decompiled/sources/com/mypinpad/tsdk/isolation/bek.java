package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class bek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54637a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54638b = 1;

    public static class setDividerPadding<T> implements Iterator<T> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f54639r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f54640s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T[] f54641p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f54642q0 = 0;

        public setDividerPadding(T[] tArr) {
            this.f54641p0 = tArr;
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i10 | (~i12))) | i14) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i13 | i14)) | (~(i14 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167));
            if (i15 == 1) {
                throw new UnsupportedOperationException("Cannot remove element from an Array.");
            }
            if (i15 != 2) {
                setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                int i16 = f54640s0;
                int i17 = i16 & 19;
                int i18 = i17 + ((i16 ^ 19) | i17);
                f54639r0 = i18 % 128;
                int i19 = i18 % 2;
                int i20 = setdividerpadding.f54642q0;
                T[] tArr = setdividerpadding.f54641p0;
                if (i20 == tArr.length) {
                    StringBuilder sb2 = new StringBuilder("Out of elements: ");
                    sb2.append(setdividerpadding.f54642q0);
                    throw new NoSuchElementException(sb2.toString());
                }
                int i21 = ((i20 ^ 1) | (i20 & 1)) << 1;
                int i22 = -((i20 & (-2)) | ((~i20) & 1));
                setdividerpadding.f54642q0 = (i21 & i22) + (i21 | i22);
                T t10 = tArr[i20];
                int i23 = (((i16 | 106) << 1) - (i16 ^ 106)) - 1;
                f54639r0 = i23 % 128;
                if (i23 % 2 == 0) {
                    return t10;
                }
                throw null;
            }
            setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
            int i24 = f54639r0;
            int i25 = i24 & 41;
            int i26 = (i25 - (~(-(-((i24 ^ 41) | i25))))) - 1;
            int i27 = i26 % 128;
            f54640s0 = i27;
            int i28 = i26 % 2;
            if (setdividerpadding2.f54642q0 >= setdividerpadding2.f54641p0.length) {
                int i29 = (i27 ^ 101) + ((i27 & 101) << 1);
                f54639r0 = i29 % 128;
                if (i29 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            int i30 = (i24 ^ 45) + ((i24 & 45) << 1);
            int i31 = i30 % 128;
            f54640s0 = i31;
            int i32 = i30 % 2;
            int i33 = i31 & 43;
            int i34 = ((((i31 ^ 43) | i33) << 1) - (~(-((i31 | 43) & (~i33))))) - 1;
            f54639r0 = i34 % 128;
            if (i34 % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -590557068, 590557070, System.identityHashCode(this))).booleanValue();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) setCompoundDrawableTintBlendMode(new Object[]{this}, -1490651047, 1490651047, System.identityHashCode(this));
        }

        @Override // java.util.Iterator
        public final void remove() {
            setCompoundDrawableTintBlendMode(new Object[]{this}, -1417182140, 1417182141, System.identityHashCode(this));
        }
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        int i10 = 0;
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i11 = f54638b;
        int i12 = i11 & 35;
        int i13 = ((i11 ^ 35) | i12) << 1;
        int i14 = -((i11 | 35) & (~i12));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        f54637a = i15 % 128;
        int i16 = i15 % 2 != 0 ? 1 : 0;
        while (i16 < 32) {
            int i17 = f54637a;
            int i18 = i17 & 9;
            int i19 = ((i17 ^ 9) | i18) << 1;
            int i20 = -((i17 | 9) & (~i18));
            int i21 = (i19 & i20) + (i20 | i19);
            f54638b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i16 * 70;
            int i24 = iIntValue * (-68);
            int i25 = ((((i23 ^ i24) | (i23 & i24)) << 1) - (~(-(((~i23) & i24) | ((~i24) & i23))))) - 1;
            int i26 = ~i16;
            int i27 = ~iIntValue;
            int i28 = ((~i27) & i26) | ((~i26) & i27) | (i26 & i27);
            int i29 = i28 & iIntValue;
            int i30 = (i28 | iIntValue) & (~i29);
            int i31 = (i30 & i29) | (i30 ^ i29);
            int i32 = ~i31;
            int i33 = (i31 | i32) & i32;
            int i34 = i16 & i27;
            int i35 = iIntValue & i26;
            int i36 = i34 | i35;
            int i37 = i16 & iIntValue;
            int i38 = (i36 & i37) | (i36 ^ i37);
            int i39 = i38 & iIntValue;
            int i40 = (i38 | iIntValue) & (~i39);
            int i41 = ~((i40 & i39) | (i40 ^ i39));
            int i42 = i33 ^ i41;
            int i43 = i33 & i41;
            int i44 = ((i43 & i42) | (i42 ^ i43)) * 69;
            int i45 = i25 & i44;
            int i46 = ((i25 ^ i44) | i45) << 1;
            int i47 = -((i25 | i44) & (~i45));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            int i49 = i26 ^ iIntValue;
            int i50 = ~((i49 & i35) | (i49 ^ i35));
            int i51 = (i26 & (i26 | i16)) | iIntValue;
            int i52 = ~i51;
            int i53 = (i51 | i52) & i52;
            int i54 = i50 ^ i53;
            int i55 = i53 & i50;
            int i56 = (i55 & i54) | (i54 ^ i55);
            int i57 = ~(iIntValue | iIntValue);
            int i58 = ((i56 & i57) | (i56 ^ i57)) * (-69);
            int i59 = i48 ^ i58;
            int i60 = ((((i58 & i48) | i59) << 1) - (~(-i59))) - 1;
            int i61 = (i27 | i16) & (~i34);
            int i62 = (i61 & i34) | (i61 ^ i34);
            int i63 = ~i62;
            int i64 = ((i62 | i63) & i63) * 69;
            int i65 = ((i60 ^ i64) | (i60 & i64)) << 1;
            int i66 = -(((~i60) & i64) | ((~i64) & i60));
            byte b10 = bArr[((i65 | i66) << 1) - (i66 ^ i65)];
            int i67 = i10 ^ b10;
            int i68 = i10 & b10;
            i10 = (i68 & i67) | (i67 ^ i68);
            int i69 = i16 ^ 1;
            int i70 = (i16 & 1) << 1;
            i16 = ((i69 | i70) << 1) - (i70 ^ i69);
        }
        if (i10 != 0) {
            int i71 = f54638b;
            int i72 = i71 ^ 101;
            int i73 = (((i71 & 101) | i72) << 1) - i72;
            f54637a = i73 % 128;
            if (i73 % 2 == 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i74 = f54637a;
        int i75 = i74 + 61;
        f54638b = i75 % 128;
        int i76 = i75 % 2;
        int i77 = i74 & 41;
        int i78 = (i77 - (~((i74 ^ 41) | i77))) - 1;
        f54638b = i78 % 128;
        int i79 = i78 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f54637a;
        int i11 = (i10 ^ 105) + ((i10 & 105) << 1);
        f54638b = i11 % 128;
        if (i11 % 2 == 0) {
            Arrays.equals(iArr, iArr2);
            throw null;
        }
        boolean zEquals = Arrays.equals(iArr, iArr2);
        int i12 = f54637a;
        int i13 = i12 & 81;
        int i14 = (i12 ^ 81) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f54638b = i15 % 128;
        int i16 = i15 % 2;
        return Boolean.valueOf(zEquals);
    }

    public static /* synthetic */ Object c(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte bByteValue = ((Byte) objArr[1]).byteValue();
        int i10 = f54638b;
        int i11 = i10 & 33;
        int i12 = (((i10 | 33) & (~i11)) - (~(i11 << 1))) - 1;
        int i13 = i12 % 128;
        f54637a = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (bArr == null) {
            byte[] bArr2 = {bByteValue};
            int i14 = ((-1) << 1) - ((((i13 | 58) << 1) - (i13 ^ 58)) ^ (-1));
            f54638b = i14 % 128;
            int i15 = i14 % 2;
            return bArr2;
        }
        int length = bArr.length;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i16 = -(~(-(-(length * (-958)))));
        int i17 = ((((-958) | i16) << 1) - (i16 ^ (-958))) - 1;
        int i18 = ~length;
        int i19 = ~iCurrentTimeMillis;
        int i20 = ~iCurrentTimeMillis;
        int i21 = (i20 | iCurrentTimeMillis) & i19;
        int i22 = i18 ^ i21;
        int i23 = i18 & i21;
        int i24 = ~((i23 & i22) | (i22 ^ i23));
        int i25 = ~(((-2) ^ iCurrentTimeMillis) | ((-2) & iCurrentTimeMillis));
        int i26 = ((~i25) & i24) | ((~i24) & i25);
        int i27 = i24 & i25;
        int i28 = (i27 & i26) | (i26 ^ i27);
        int i29 = ~((i19 & (-2)) | ((~i19) & 1) | (i19 & 1));
        int i30 = i28 & i29;
        int i31 = (i28 | i29) & (~i30);
        int i32 = ((i31 & i30) | (i31 ^ i30)) * 959;
        int i33 = ((i17 | i32) << 1) - (i32 ^ i17);
        int i34 = -(~(-(-((~((length ^ 1) | (length & 1))) * (-959)))));
        int i35 = ((i33 ^ i34) + ((i34 & i33) << 1)) - 1;
        int i36 = ((~i19) & (-2)) | (i19 & 1);
        int i37 = i19 & (-2);
        int i38 = ~((i36 & i37) | (i36 ^ i37));
        int i39 = ~length;
        int i40 = (i20 & i39) | ((~i39) & iCurrentTimeMillis);
        int i41 = i39 & iCurrentTimeMillis;
        int i42 = (i41 & i40) | (i40 ^ i41);
        int i43 = (i42 | (~i42)) & (~i42);
        int i44 = (i38 & i43) | ((~i43) & i38) | ((~i38) & i43);
        int i45 = ~((iCurrentTimeMillis & 1) | (iCurrentTimeMillis ^ 1));
        int i46 = i44 & i45;
        int i47 = (i45 | i44) & (~i46);
        int i48 = -(-(((i47 & i46) | (i47 ^ i46)) * 959));
        int i49 = ((~i48) & i35) | ((~i35) & i48);
        int i50 = -(-((i48 & i35) << 1));
        byte[] bArr3 = new byte[(i49 ^ i50) + ((i50 & i49) << 1)];
        System.arraycopy(bArr, 0, bArr3, 1, length);
        bArr3[0] = bByteValue;
        int i51 = f54638b;
        int i52 = ((i51 | 113) << 1) - (i51 ^ 113);
        f54637a = i52 % 128;
        int i53 = i52 % 2;
        return bArr3;
    }

    public static /* synthetic */ Object d(Object[] objArr) {
        boolean[] zArr = (boolean[]) objArr[0];
        int i10 = f54637a + 58;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        int i12 = i11 % 128;
        f54638b = i12;
        int i13 = i11 % 2;
        if (zArr == null) {
            int i14 = i12 + 89;
            f54637a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((i12 & 72) + (i12 | 72)) - 1;
            f54637a = i16 % 128;
            if (i16 % 2 == 0) {
                return null;
            }
            throw null;
        }
        boolean[] zArr2 = (boolean[]) zArr.clone();
        int i17 = f54638b;
        int i18 = i17 & 61;
        int i19 = (i17 ^ 61) | i18;
        int i20 = (i18 & i19) + (i19 | i18);
        f54637a = i20 % 128;
        int i21 = i20 % 2;
        return zArr2;
    }

    public static /* synthetic */ Integer e(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i10 = f54638b;
        int i11 = ((i10 | 91) << 1) - (i10 ^ 91);
        f54637a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = -iIntValue;
        int i14 = iIntValue2 ^ i13;
        int i15 = (((i13 & iIntValue2) | i14) << 1) - i14;
        if (i15 < 0) {
            StringBuffer stringBuffer = new StringBuffer(iIntValue);
            stringBuffer.append(" > ");
            stringBuffer.append(iIntValue2);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        int i16 = (i10 & 101) + (i10 | 101);
        f54637a = i16 % 128;
        if (i16 % 2 == 0) {
            return Integer.valueOf(i15);
        }
        throw null;
    }

    public static /* synthetic */ Integer f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f54638b;
        int i11 = i10 & 109;
        int i12 = ((i10 | 109) & (~i11)) + (i11 << 1);
        int i13 = i12 % 128;
        f54637a = i13;
        int i14 = i12 % 2;
        if (iArr == null) {
            int i15 = i13 & 77;
            int i16 = ((~i15) & (i13 | 77)) + (i15 << 1);
            f54638b = i16 % 128;
            int i17 = i16 % 2;
            int i18 = (i13 & (-72)) | ((~i13) & 71);
            int i19 = -(-((i13 & 71) << 1));
            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
            f54638b = i20 % 128;
            if (i20 % 2 != 0) {
                return 0;
            }
            throw null;
        }
        int i21 = ((iIntValue & 2) + (iIntValue | 2)) - 1;
        int i22 = i13 & 121;
        int i23 = (i22 - (~((i13 ^ 121) | i22))) - 1;
        f54638b = i23 % 128;
        int i24 = i23 % 2;
        while (true) {
            int i25 = ((iIntValue | (-40)) << 1) - (iIntValue ^ (-40));
            int i26 = (i25 & 40) + (i25 | 40);
            iIntValue = (i26 << 1) + (i26 ^ (-1));
            if (iIntValue < 0) {
                break;
            }
            int i27 = (-2) - ((f54637a + 114) ^ (-1));
            int i28 = i27 % 128;
            f54638b = i28;
            int i29 = i27 % 2;
            int i30 = i21 * 257;
            int i31 = iArr[iIntValue];
            int i32 = i30 & i31;
            i21 = ((i30 ^ i31) | i32) & (~i32);
            int i33 = i28 & 35;
            int i34 = (i33 - (~((i28 ^ 35) | i33))) - 1;
            f54637a = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = f54637a;
        int i37 = i36 & 25;
        int i38 = i36 | 25;
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        f54638b = i39 % 128;
        if (i39 % 2 != 0) {
            return Integer.valueOf(i21);
        }
        int i40 = 52 / 0;
        return Integer.valueOf(i21);
    }

    public static /* synthetic */ void g(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i10 = f54637a;
        int i11 = ((((i10 ^ 117) | (i10 & 117)) << 1) - (~(-(((~i10) & 117) | (i10 & (-118)))))) - 1;
        f54638b = i11 % 128;
        int i12 = i11 % 2;
        Arrays.fill(bArr, (byte) 0);
        int i13 = f54638b;
        int i14 = (i13 ^ 113) + ((i13 & 113) << 1);
        f54637a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x011a, code lost:
    
        r11 = (byte[]) r11.clone();
        r0 = com.mypinpad.tsdk.isolation.bek.f54638b;
        r2 = ((r0 | 113) << 1) - (r0 ^ 113);
        com.mypinpad.tsdk.isolation.bek.f54637a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x012f, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0131, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ea, code lost:
    
        if (r11 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ed, code lost:
    
        if (r11 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ef, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.bek.f54638b;
        r0 = ((r11 | 17) << 1) - (r11 ^ 17);
        com.mypinpad.tsdk.isolation.bek.f54637a = r0 % 128;
        r0 = r0 % 2;
        r0 = ((r11 ^ 95) | (r11 & 95)) << 1;
        r11 = -(((~r11) & 95) | (r11 & (-96)));
        r2 = ((r0 | r11) << 1) - (r11 ^ r0);
        com.mypinpad.tsdk.isolation.bek.f54637a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0119, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object h(java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bek.h(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object i(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int i10 = f54638b;
        int i11 = (i10 | 25) << 1;
        int i12 = -((i10 & (-26)) | ((~i10) & 25));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f54637a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (bArr == null) {
            int i14 = ((i10 & 55) - (~(-(-(i10 | 55))))) - 1;
            f54637a = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            byte[] bArr3 = (byte[]) setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i15 = f54637a;
            int i16 = i15 | 27;
            int i17 = i16 << 1;
            int i18 = -((~(i15 & 27)) & i16);
            int i19 = (i17 & i18) + (i18 | i17);
            f54638b = i19 % 128;
            int i20 = i19 % 2;
            return bArr3;
        }
        if (bArr2 == null) {
            int i21 = i10 & 93;
            int i22 = (i21 - (~((i10 ^ 93) | i21))) - 1;
            f54637a = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
            byte[] bArr4 = (byte[]) setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i23 = f54637a;
            int i24 = ((i23 | 107) << 1) - (i23 ^ 107);
            f54638b = i24 % 128;
            if (i24 % 2 != 0) {
                return bArr4;
            }
            throw null;
        }
        int length = bArr.length;
        int i25 = -(~bArr2.length);
        byte[] bArr5 = new byte[((length ^ i25) + ((length & i25) << 1)) - 1];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        int i26 = f54637a;
        int i27 = i26 ^ 3;
        int i28 = ((i26 & 3) | i27) << 1;
        int i29 = -i27;
        int i30 = (i28 & i29) + (i28 | i29);
        f54638b = i30 % 128;
        if (i30 % 2 != 0) {
            return bArr5;
        }
        throw null;
    }

    public static /* synthetic */ Object j(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = f54638b;
        int i11 = ((i10 & (-108)) | ((~i10) & 107)) + ((i10 & 107) << 1);
        int i12 = i11 % 128;
        f54637a = i12;
        int i13 = i11 % 2;
        if (jArr == null) {
            int i14 = i12 + 15;
            f54638b = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 72 / 0;
            }
            return null;
        }
        long[] jArr2 = (long[]) jArr.clone();
        int i16 = f54638b;
        int i17 = ((-1) << 1) - ((-1) ^ (((i16 | 4) << 1) - (i16 ^ 4)));
        f54637a = i17 % 128;
        if (i17 % 2 == 0) {
            return jArr2;
        }
        throw null;
    }

    public static /* synthetic */ Boolean k(Object[] objArr) {
        int length;
        int i10;
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int i11 = f54638b;
        int i12 = (i11 & (-32)) | ((~i11) & 31);
        int i13 = (i11 & 31) << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f54637a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (bArr != null) {
            int i15 = i11 & 85;
            int i16 = (((i11 ^ 85) | i15) << 1) - ((~i15) & (i11 | 85));
            int i17 = i16 % 128;
            f54637a = i17;
            int i18 = i16 % 2;
            if (bArr2 != null) {
                if (bArr == bArr2) {
                    int i19 = i17 + 61;
                    int i20 = i19 % 128;
                    f54638b = i20;
                    int i21 = i19 % 2;
                    int i22 = i20 & 91;
                    int i23 = (i20 ^ 91) | i22;
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    f54637a = i24 % 128;
                    int i25 = i24 % 2;
                    return Boolean.TRUE;
                }
                if (bArr.length < bArr2.length) {
                    int i26 = i11 + 61;
                    f54637a = i26 % 128;
                    if (i26 % 2 != 0) {
                        throw null;
                    }
                    length = bArr.length;
                } else {
                    length = bArr2.length;
                    int i27 = i17 & 87;
                    int i28 = (i17 | 87) & (~i27);
                    int i29 = -(-(i27 << 1));
                    int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                    f54638b = i30 % 128;
                    int i31 = i30 % 2;
                }
                int length2 = bArr.length;
                int length3 = bArr2.length;
                int i32 = length2 & length3;
                int i33 = ((length2 ^ length3) | i32) & (~i32);
                int i34 = f54638b;
                int i35 = i34 & 13;
                int i36 = i35 + ((i34 ^ 13) | i35);
                f54637a = i36 % 128;
                int i37 = i36 % 2;
                int i38 = 0;
                while (i38 != length) {
                    int i39 = f54638b;
                    int i40 = (i39 ^ 97) + ((i39 & 97) << 1);
                    f54637a = i40 % 128;
                    if (i40 % 2 != 0) {
                        byte b10 = bArr[i38];
                        byte b11 = bArr2[i38];
                        int i41 = b10 & b11;
                        int i42 = ((b10 ^ b11) | i41) & (~i41);
                        i33 = (i33 & i42) | (i33 ^ i42);
                        int i43 = (i38 & (-22)) | ((~i38) & 21);
                        int i44 = (i38 & 21) << 1;
                        i38 = ((i43 | i44) << 1) - (i44 ^ i43);
                    } else {
                        byte b12 = bArr[i38];
                        byte b13 = bArr2[i38];
                        int i45 = b12 & b13;
                        int i46 = ((b12 ^ b13) | i45) & (~i45);
                        i33 = (i33 & i46) | (i33 ^ i46);
                        i38 = ((i38 | 1) << 1) - (i38 ^ 1);
                    }
                    int i47 = i39 + 66;
                    int i48 = (i47 ^ (-1)) + (i47 << 1);
                    f54637a = i48 % 128;
                    int i49 = i48 % 2;
                }
                int i50 = f54637a + 93;
                f54638b = i50 % 128;
                int i51 = i50 % 2;
                while (length < bArr2.length) {
                    int i52 = f54638b;
                    int i53 = (i52 ^ 103) + ((i52 & 103) << 1);
                    f54637a = i53 % 128;
                    if (i53 % 2 != 0) {
                        byte b14 = bArr2[length];
                        int i54 = ~b14;
                        int i55 = (i54 | b14) & i54;
                        int i56 = (b14 & (~i55)) | (i54 & i55);
                        i10 = (i56 & i33) | (i33 ^ i56);
                        length = (length & (-4)) + (length | (-4)) + 24;
                    } else {
                        byte b15 = bArr2[length];
                        int i57 = ~b15;
                        int i58 = b15 & i57;
                        int i59 = ((b15 ^ i57) | i58) & (~i58);
                        int i60 = i33 & i59;
                        int i61 = (i59 | i33) & (~i60);
                        i10 = (i61 & i60) | (i61 ^ i60);
                        length++;
                    }
                    i33 = i10;
                }
                if (i33 != 0) {
                    int i62 = f54638b;
                    int i63 = ((i62 ^ 101) | (i62 & 101)) << 1;
                    int i64 = -(((~i62) & 101) | (i62 & (-102)));
                    int i65 = (i63 & i64) + (i64 | i63);
                    f54637a = i65 % 128;
                    if (i65 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                int i66 = f54637a;
                int i67 = ((i66 & 10) + (i66 | 10)) - 1;
                f54638b = i67 % 128;
                int i68 = i67 % 2;
                int i69 = i66 & 69;
                int i70 = ((i66 ^ 69) | i69) << 1;
                int i71 = -((i66 | 69) & (~i69));
                int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                f54638b = i72 % 128;
                if (i72 % 2 != 0) {
                    return Boolean.TRUE;
                }
                int i73 = 80 / 0;
                return Boolean.TRUE;
            }
        }
        int i74 = f54637a;
        int i75 = i74 & 55;
        int i76 = (i74 ^ 55) | i75;
        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
        f54638b = i77 % 128;
        int i78 = i77 % 2;
        return Boolean.FALSE;
    }

    public static /* synthetic */ Object l(Object[] objArr) {
        short[] sArr = (short[]) objArr[0];
        int i10 = f54637a + 97;
        int i11 = i10 % 128;
        f54638b = i11;
        int i12 = i10 % 2;
        if (sArr == null) {
            int i13 = i11 + 15;
            f54637a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((i11 & 66) + (i11 | 66)) - 1;
            f54637a = i15 % 128;
            if (i15 % 2 == 0) {
                return null;
            }
            throw null;
        }
        short[] sArr2 = (short[]) sArr.clone();
        int i16 = f54638b;
        int i17 = i16 & 61;
        int i18 = ((i16 ^ 61) | i17) << 1;
        int i19 = -((i16 | 61) & (~i17));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        f54637a = i20 % 128;
        if (i20 % 2 == 0) {
            return sArr2;
        }
        throw null;
    }

    public static /* synthetic */ Boolean m(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int i10 = f54638b;
        int i11 = i10 & 81;
        int i12 = -(-((i10 ^ 81) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f54637a = i13 % 128;
        int i14 = i13 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i15 = f54638b;
        int i16 = i15 & 57;
        int i17 = (i15 | 57) & (~i16);
        int i18 = i16 << 1;
        int i19 = (i17 & i18) + (i17 | i18);
        f54637a = i19 % 128;
        if (i19 % 2 == 0) {
            return Boolean.valueOf(zEquals);
        }
        int i20 = 73 / 0;
        return Boolean.valueOf(zEquals);
    }

    public static /* synthetic */ Integer n(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f54638b + 31;
        int i11 = i10 % 128;
        f54637a = i11;
        int i12 = i10 % 2;
        if (jArr == null) {
            int i13 = ((i11 ^ 5) | (i11 & 5)) << 1;
            int i14 = -((i11 & (-6)) | ((~i11) & 5));
            int i15 = (i13 & i14) + (i13 | i14);
            int i16 = i15 % 128;
            f54638b = i16;
            int i17 = i15 % 2;
            int i18 = i16 & 67;
            int i19 = i18 + ((i16 ^ 67) | i18);
            f54637a = i19 % 128;
            if (i19 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int i20 = iIntValue & 1;
        int i21 = i20 + ((iIntValue ^ 1) | i20);
        int i22 = (i11 & 25) + (i11 | 25);
        f54638b = i22 % 128;
        int i23 = i22 % 2;
        while (true) {
            int i24 = iIntValue & (-29);
            int i25 = (iIntValue | (-29)) & (~i24);
            int i26 = -(-(i24 << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            int i28 = i27 & 28;
            iIntValue = ((((i27 ^ 28) | i28) << 1) - (~(-((~i28) & (i27 | 28))))) - 1;
            if (iIntValue < 0) {
                break;
            }
            int i29 = f54638b;
            int i30 = i29 + 91;
            f54637a = i30 % 128;
            int i31 = i30 % 2;
            long j10 = jArr[iIntValue];
            int i32 = i21 * 257;
            int i33 = (int) j10;
            int i34 = i32 & i33;
            int i35 = (((i32 ^ i33) | i34) & (~i34)) * 257;
            int i36 = (int) (j10 >>> 32);
            int i37 = (~i36) & i35;
            int i38 = (~i35) & i36;
            i21 = (i38 & i37) | (i37 ^ i38);
            int i39 = (i29 & 90) + (i29 | 90);
            int i40 = (i39 ^ (-1)) + (i39 << 1);
            f54637a = i40 % 128;
            int i41 = i40 % 2;
        }
        int i42 = f54637a;
        int i43 = i42 & 37;
        int i44 = ((i42 ^ 37) | i43) << 1;
        int i45 = -((i42 | 37) & (~i43));
        int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
        f54638b = i46 % 128;
        if (i46 % 2 != 0) {
            return Integer.valueOf(i21);
        }
        int i47 = 61 / 0;
        return Integer.valueOf(i21);
    }

    public static /* synthetic */ Object o(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        byte[] bArr3 = (byte[]) objArr[2];
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = ((~iCurrentTimeMillis) | iCurrentTimeMillis) & i10;
        int i12 = (-109422588) & i11;
        int i13 = ((i11 | (-109422588)) & (~i12)) | i12;
        int i14 = (i13 | (~i13)) & (~i13);
        int i15 = ~(((-173138872) ^ iCurrentTimeMillis) | ((-173138872) & iCurrentTimeMillis));
        int i16 = i14 & i15;
        int i17 = (i14 | i15) & (~i16);
        int i18 = ((i17 & i16) | (i17 ^ i16)) * (-370);
        int i19 = 1751085814 & i18;
        int i20 = i18 | 1751085814;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        int i22 = (-173138872) & i10;
        int i23 = (i10 | (-173138872)) & (~i22);
        int i24 = ~((i23 & i22) | (i23 ^ i22));
        int i25 = ~(iCurrentTimeMillis | (-109422588));
        int i26 = i24 & i25;
        int i27 = (i25 | i24) & (~i26);
        int i28 = (i27 & i26) | (i27 ^ i26);
        int i29 = (248899583 & i28) | ((~i28) & (-248899584));
        int i30 = i28 & (-248899584);
        int i31 = -(-(((i30 & i29) | (i29 ^ i30)) * (-370)));
        int i32 = i21 & i31;
        int i33 = -(-(i31 | i21));
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        int i35 = (1898532863 & i34) | ((~i34) & (-1898532864));
        int i36 = -(-((i34 & (-1898532864)) << 1));
        int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
        int i38 = ~((int) System.currentTimeMillis());
        int i39 = ((-283441155) ^ i38) | ((-283441155) & i38);
        int i40 = (i39 | (~i39)) & (~i39);
        int i41 = ((~i40) & 278931456) | ((-278931457) & i40);
        int i42 = i40 & 278931456;
        int i43 = ((i42 & i41) | (i41 ^ i42)) * (-241);
        int i44 = ((-3337976) ^ i43) + ((i43 & (-3337976)) << 1);
        int i45 = (i44 | 774661258) << 1;
        int i46 = -((774661258 & (~i44)) | ((-774661259) & i44));
        int i47 = (i45 & i46) + (i46 | i45);
        int i48 = ((~i38) & (-283441155)) | (283441154 & i38);
        int i49 = i38 & (-283441155);
        int i50 = (i49 & i48) | (i48 ^ i49);
        int i51 = i50 & (-139777687);
        int i52 = (i50 | (-139777687)) & (~i51);
        int i53 = ~((i52 & i51) | (i52 ^ i51));
        int i54 = (-418709143) & i53;
        int i55 = (i53 | (-418709143)) & (~i54);
        int i56 = ((i55 & i54) | (i55 ^ i54)) * 241;
        int i57 = i47 & i56;
        if (i37 <= i57 + ((i56 ^ i47) | i57)) {
            throw null;
        }
        if (bArr == null) {
            byte[] bArr4 = (byte[]) setOnFocusChangeListener(new Object[]{bArr2, bArr3}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            int i58 = f54638b + 87;
            f54637a = i58 % 128;
            int i59 = i58 % 2;
            return bArr4;
        }
        if (bArr2 == null) {
            int i60 = f54638b;
            int i61 = i60 & 71;
            int i62 = (i61 - (~((i60 ^ 71) | i61))) - 1;
            f54637a = i62 % 128;
            int i63 = i62 % 2;
            byte[] bArr5 = (byte[]) setOnFocusChangeListener(new Object[]{bArr, bArr3}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            int i64 = f54638b + 41;
            f54637a = i64 % 128;
            int i65 = i64 % 2;
            return bArr5;
        }
        if (bArr3 == null) {
            int i66 = f54638b + 29;
            f54637a = i66 % 128;
            if (i66 % 2 != 0) {
                throw null;
            }
            byte[] bArr6 = (byte[]) setOnFocusChangeListener(new Object[]{bArr, bArr2}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            int i67 = f54637a;
            int i68 = i67 & 27;
            int i69 = (i68 - (~((i67 ^ 27) | i68))) - 1;
            f54638b = i69 % 128;
            if (i69 % 2 == 0) {
                int i70 = 62 / 0;
            }
            return bArr6;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i71 = length2 * (-574);
        int i72 = -(-(length * (-574)));
        int i73 = i71 ^ i72;
        int i74 = -(-((i71 & i72) << 1));
        int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
        int i76 = ~length2;
        int i77 = ~iCurrentTimeMillis2;
        int i78 = i76 & i77;
        int i79 = (~i78) & (i76 | i77);
        int i80 = ~((i78 & i79) | (i79 ^ i78));
        int i81 = ~length;
        int i82 = (i81 ^ iCurrentTimeMillis2) | (i81 & iCurrentTimeMillis2);
        int i83 = ((~i82) | i82) & (~i82);
        int i84 = -(~(((i83 & i80) | (i80 ^ i83)) * 1150));
        int i85 = (((i75 | i84) << 1) - (i84 ^ i75)) - 1;
        int i86 = ~length;
        int i87 = (i86 | length) & i81;
        int i88 = ~iCurrentTimeMillis2;
        int i89 = (i87 & iCurrentTimeMillis2) | (i87 & i88) | ((~i87) & iCurrentTimeMillis2);
        int i90 = (i88 | iCurrentTimeMillis2) & i77;
        int i91 = -(-(((~((i86 & i90) | ((~i90) & length) | (length & i90))) | ((i89 | (~i89)) & (~i89))) * (-575)));
        int i92 = i85 & i91;
        int i93 = ((i85 ^ i91) | i92) << 1;
        int i94 = -((i91 | i85) & (~i92));
        int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
        int i96 = i76 & iCurrentTimeMillis2;
        int i97 = ~(i96 | ((~i96) & (iCurrentTimeMillis2 | i76)));
        int i98 = i77 & length2;
        int i99 = ~(i98 | ((length2 | i77) & (~i98)));
        int i100 = -(-(((i97 & i99) | ((~i99) & i97) | ((~i97) & i99)) * 575));
        int i101 = i95 & i100;
        int i102 = (i100 ^ i95) | i101;
        int i103 = (i101 & i102) + (i102 | i101);
        int i104 = -(-bArr3.length);
        int i105 = ((i103 ^ i104) | (i103 & i104)) << 1;
        int i106 = -((i104 & (~i103)) | ((~i104) & i103));
        byte[] bArr7 = new byte[(i105 ^ i106) + ((i106 & i105) << 1)];
        System.arraycopy(bArr, 0, bArr7, 0, bArr.length);
        int i107 = (-1) - (~(-(-bArr.length)));
        System.arraycopy(bArr2, 0, bArr7, i107, bArr2.length);
        int i108 = -(-bArr2.length);
        int i109 = ((~i108) & i107) | ((~i107) & i108);
        int i110 = (i107 & i108) << 1;
        System.arraycopy(bArr3, 0, bArr7, ((i109 | i110) << 1) - (i110 ^ i109), bArr3.length);
        int i111 = f54638b;
        int i112 = i111 & 79;
        int i113 = -(-((i111 ^ 79) | i112));
        int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
        f54637a = i114 % 128;
        int i115 = i114 % 2;
        return bArr7;
    }

    public static /* synthetic */ Integer p(Object[] objArr) {
        char[] cArr = (char[]) objArr[0];
        int i10 = f54638b;
        int i11 = i10 ^ 79;
        int i12 = (i10 & 79) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f54637a = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (cArr == null) {
            int i15 = ((i14 ^ 1) | (i14 & 1)) << 1;
            int i16 = -(((~i14) & 1) | (i14 & (-2)));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            f54638b = i17 % 128;
            if (i17 % 2 != 0) {
                return 0;
            }
            throw null;
        }
        int length = cArr.length;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i18 = length * (-520);
        int i19 = (522 ^ i18) + ((i18 & ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) << 1);
        int i20 = ~iCurrentTimeMillis;
        int i21 = i20 ^ length;
        int i22 = i20 & length;
        int i23 = ~((i21 & i22) | (i21 ^ i22));
        int i24 = -(~(-(-(((i23 & 1) | ((~i23) & 1) | (i23 & (-2))) * (-1042)))));
        int i25 = (((i19 | i24) << 1) - (i24 ^ i19)) - 1;
        int i26 = ((length ^ iCurrentTimeMillis) | (length & iCurrentTimeMillis)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
        int i27 = i25 & i26;
        int i28 = -(-((i26 ^ i25) | i27));
        int i29 = (i27 & i28) + (i28 | i27);
        int i30 = ~length;
        int i31 = (-2) & i30;
        int i32 = (i30 | (-2)) & (~i31);
        int i33 = ~((i32 & i31) | (i32 ^ i31));
        int i34 = (-2) & iCurrentTimeMillis;
        int i35 = (iCurrentTimeMillis | (-2)) & (~i34);
        int i36 = ~((i35 & i34) | (i35 ^ i34));
        int i37 = i33 & i36;
        int i38 = (i36 | i33) & (~i37);
        int i39 = (i38 & i37) | (i38 ^ i37);
        int i40 = (i20 & (-2)) | ((~i20) & 1);
        int i41 = i20 & 1;
        int i42 = (i41 & i40) | (i40 ^ i41);
        int i43 = i42 ^ length;
        int i44 = i42 & length;
        int i45 = (i44 & i43) | (i43 ^ i44);
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = i39 & i47;
        int i49 = (i39 | i47) & (~i48);
        int i50 = -(-(((i49 & i48) | (i49 ^ i48)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
        int i51 = i29 & i50;
        int i52 = ((i50 | i29) & (~i51)) + (i51 << 1);
        int i53 = f54638b;
        int i54 = i53 & 93;
        int i55 = (((i53 ^ 93) | i54) << 1) - ((i53 | 93) & (~i54));
        while (true) {
            f54637a = i55 % 128;
            int i56 = i55 % 2;
            int i57 = length & 102;
            int i58 = ((((length ^ 102) | i57) << 1) - (~(-((length | 102) & (~i57))))) - 1;
            length = ((i58 ^ (-102)) + ((i58 & (-102)) << 1)) - 1;
            if (length < 0) {
                break;
            }
            int i59 = f54637a;
            int i60 = i59 & 89;
            int i61 = (i59 ^ 89) | i60;
            int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
            int i63 = i62 % 128;
            f54638b = i63;
            int i64 = i62 % 2;
            int i65 = i52 * 257;
            char c10 = cArr[length];
            int i66 = i65 & c10;
            i52 = ((i65 ^ c10) | i66) & (~i66);
            i55 = ((i63 ^ 50) + ((i63 & 50) << 1)) - 1;
        }
        int i67 = f54637a;
        int i68 = (i67 ^ 97) + ((i67 & 97) << 1);
        f54638b = i68 % 128;
        if (i68 % 2 != 0) {
            return Integer.valueOf(i52);
        }
        throw null;
    }

    public static /* synthetic */ Object q(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f54637a;
        int i11 = i10 & 101;
        int i12 = ((i10 ^ 101) | i11) << 1;
        int i13 = -((~i11) & (i10 | 101));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f54638b = i14 % 128;
        int i15 = i14 % 2;
        if (iArr != null) {
            int[] iArr2 = (int[]) iArr.clone();
            int i16 = f54638b;
            int i17 = ((i16 & 108) + (i16 | 108)) - 1;
            f54637a = i17 % 128;
            int i18 = i17 % 2;
            return iArr2;
        }
        int i19 = i10 & 79;
        int i20 = -(-((i10 ^ 79) | i19));
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        f54638b = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 68 / 0;
        }
        int i23 = i10 & 57;
        int i24 = (((i10 ^ 57) | i23) << 1) - ((~i23) & (i10 | 57));
        f54638b = i24 % 128;
        if (i24 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r1 = r7.length;
        r4 = (r2 & (-6)) | ((~r2) & 5);
        r2 = -(-((r2 & 5) << 1));
        r5 = ((r4 | r2) << 1) - (r2 ^ r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        com.mypinpad.tsdk.isolation.bek.f54637a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r0 >= r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.bek.f54637a;
        r4 = r2 | 67;
        r5 = (r4 << 1) - (r4 & (~(r2 & 67)));
        r4 = r5 % 128;
        com.mypinpad.tsdk.isolation.bek.f54638b = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if ((r5 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r7[r0] != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r2 = r2 + 117;
        com.mypinpad.tsdk.isolation.bek.f54638b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r0 = r0 + 1;
        r2 = r4 & 47;
        r4 = (r4 ^ 47) | r2;
        r5 = (r2 ^ r4) + ((r2 & r4) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        r7 = r7[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.bek.f54637a;
        r0 = ((r7 ^ 112) + ((r7 & 112) << 1)) - 1;
        com.mypinpad.tsdk.isolation.bek.f54638b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r7 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r7 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r2 = r2 + 29;
        com.mypinpad.tsdk.isolation.bek.f54637a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean r(java.lang.Object[] r7) {
        /*
            r0 = 0
            r7 = r7[r0]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r1 = com.mypinpad.tsdk.isolation.bek.f54637a
            r2 = r1 ^ 17
            r1 = r1 & 17
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = -r2
            int r2 = ~r2
            int r1 = r1 - r2
            int r1 = r1 + (-1)
            int r2 = r1 % 128
            com.mypinpad.tsdk.isolation.bek.f54638b = r2
            int r1 = r1 % 2
            r3 = 0
            if (r1 != 0) goto L22
            r1 = 16
            int r1 = r1 / r0
            if (r7 != 0) goto L32
            goto L24
        L22:
            if (r7 != 0) goto L32
        L24:
            int r2 = r2 + 29
            int r7 = r2 % 128
            com.mypinpad.tsdk.isolation.bek.f54637a = r7
            int r2 = r2 % 2
            if (r2 != 0) goto L31
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L31:
            throw r3
        L32:
            int r1 = r7.length
            r4 = r2 & (-6)
            int r5 = ~r2
            r6 = 5
            r5 = r5 & r6
            r4 = r4 | r5
            r2 = r2 & r6
            int r2 = r2 << 1
            int r2 = -r2
            int r2 = -r2
            r5 = r4 | r2
            int r5 = r5 << 1
            r2 = r2 ^ r4
            int r5 = r5 - r2
        L44:
            int r2 = r5 % 128
            com.mypinpad.tsdk.isolation.bek.f54637a = r2
            int r5 = r5 % 2
            if (r0 >= r1) goto L7f
            int r2 = com.mypinpad.tsdk.isolation.bek.f54637a
            r4 = r2 | 67
            int r5 = r4 << 1
            r6 = r2 & 67
            int r6 = ~r6
            r4 = r4 & r6
            int r5 = r5 - r4
            int r4 = r5 % 128
            com.mypinpad.tsdk.isolation.bek.f54638b = r4
            int r5 = r5 % 2
            if (r5 == 0) goto L7c
            r5 = r7[r0]
            if (r5 != 0) goto L6e
            int r2 = r2 + 117
            int r7 = r2 % 128
            com.mypinpad.tsdk.isolation.bek.f54638b = r7
            int r2 = r2 % 2
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L6e:
            int r0 = r0 + 1
            r2 = r4 & 47
            r4 = r4 ^ 47
            r4 = r4 | r2
            r5 = r2 ^ r4
            r2 = r2 & r4
            int r2 = r2 << 1
            int r5 = r5 + r2
            goto L44
        L7c:
            r7 = r7[r0]
            throw r3
        L7f:
            int r7 = com.mypinpad.tsdk.isolation.bek.f54637a
            r0 = r7 ^ 112(0x70, float:1.57E-43)
            r7 = r7 & 112(0x70, float:1.57E-43)
            int r7 = r7 << 1
            int r0 = r0 + r7
            int r0 = r0 + (-1)
            int r7 = r0 % 128
            com.mypinpad.tsdk.isolation.bek.f54638b = r7
            int r0 = r0 % 2
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bek.r(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Object s(Object[] objArr) {
        byte[][] bArr = (byte[][]) objArr[0];
        int i10 = f54637a + 45;
        f54638b = i10 % 128;
        int i11 = i10 % 2 == 0 ? 1 : 0;
        int i12 = i11;
        while (i12 != bArr.length) {
            int i13 = f54637a;
            int i14 = (i13 & 75) + (i13 | 75);
            f54638b = i14 % 128;
            int i15 = i14 % 2;
            int length = bArr[i12].length;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i16 = length * 141;
            int i17 = i11 * (-279);
            int i18 = i16 & i17;
            int i19 = i18 + ((i16 ^ i17) | i18);
            int i20 = -(-(((i11 ^ iCurrentTimeMillis) | (i11 & iCurrentTimeMillis)) * 140));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            int i22 = ~length;
            int i23 = i22 ^ i11;
            int i24 = i22 & i11;
            int i25 = ~(i23 | i24);
            int i26 = ~iCurrentTimeMillis;
            int i27 = i26 ^ i11;
            int i28 = i26 & i11;
            int i29 = (i27 & i28) | (i27 ^ i28);
            int i30 = (i29 | (~i29)) & (~i29);
            int i31 = -(-(((i25 & i30) | (i25 ^ i30)) * (-280)));
            int i32 = ((i21 & i31) - (~(-(-(i21 | i31))))) - 1;
            int i33 = ~i11;
            int i34 = (i22 & i33) | ((~i33) & length);
            int i35 = i33 & length;
            int i36 = ~((i35 & i34) | (i34 ^ i35));
            int i37 = i26 & length;
            int i38 = (length | i26) & (~i37);
            int i39 = ~((i38 & i37) | (i38 ^ i37));
            int i40 = i36 & i39;
            int i41 = ((i36 | i39) & (~i40)) | i40;
            int i42 = (i23 ^ i24) | (i23 & i24);
            int i43 = -(-((i41 | (~((i42 & iCurrentTimeMillis) | (i42 & i26) | ((~i42) & iCurrentTimeMillis)))) * 140));
            i11 = ((i43 & i32) << 1) + (i32 ^ i43);
            int i44 = i12 | 1;
            i12 = (i44 << 1) - ((~(i12 & 1)) & i44);
            int i45 = f54638b;
            int i46 = i45 & 91;
            int i47 = i46 + ((i45 ^ 91) | i46);
            f54637a = i47 % 128;
            int i48 = i47 % 2;
        }
        byte[] bArr2 = new byte[i11];
        int i49 = f54638b;
        int i50 = (((i49 | 70) << 1) - (i49 ^ 70)) - 1;
        f54637a = i50 % 128;
        int i51 = i50 % 2;
        int i52 = 0;
        int i53 = 0;
        while (i52 != bArr.length) {
            int i54 = f54638b;
            int i55 = i54 & 91;
            int i56 = ((((i54 ^ 91) | i55) << 1) - (~(-((i54 | 91) & (~i55))))) - 1;
            f54637a = i56 % 128;
            int i57 = i56 % 2;
            byte[] bArr3 = bArr[i52];
            System.arraycopy(bArr3, 0, bArr2, i53, bArr3.length);
            int length2 = bArr[i52].length;
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i58 = length2 * (-55);
            int i59 = -(-(i53 * (-55)));
            int i60 = ((((~i59) & i58) | ((~i58) & i59)) - (~((i58 & i59) << 1))) - 1;
            int i61 = ~iCurrentTimeMillis2;
            int i62 = ~length2;
            int i63 = (length2 & i61) | (iCurrentTimeMillis2 & i62);
            int i64 = length2 & iCurrentTimeMillis2;
            int i65 = (i63 & i64) | (i63 ^ i64);
            int i66 = (i65 | (~i65)) & (~i65);
            int i67 = i53 & i66;
            int i68 = (i66 | i53) & (~i67);
            int i69 = ((i68 & i67) | (i68 ^ i67)) * 56;
            int i70 = i60 & i69;
            int i71 = i70 + ((i69 ^ i60) | i70);
            int i72 = length2 & i53;
            int i73 = (~i72) & (length2 | i53);
            int i74 = (~((i72 & i73) | (i73 ^ i72))) * (-56);
            int i75 = ((i71 ^ i74) | (i71 & i74)) << 1;
            int i76 = -((i74 & (~i71)) | ((~i74) & i71));
            int i77 = (i75 & i76) + (i76 | i75);
            int i78 = (iCurrentTimeMillis2 | i61) & (~iCurrentTimeMillis2);
            int i79 = ~((i53 & i78) | (i78 ^ i53));
            int i80 = ((~i79) & length2) | (i79 & i62);
            int i81 = i79 & length2;
            int i82 = ((i81 & i80) | (i80 ^ i81)) * 56;
            i53 = ((i77 ^ i82) - (~(-(-((i82 & i77) << 1))))) - 1;
            int i83 = i52 | (-39);
            int i84 = i83 << 1;
            int i85 = -((~(i52 & (-39))) & i83);
            int i86 = (i84 & i85) + (i85 | i84);
            int i87 = (i86 & (-41)) | ((~i86) & 40);
            int i88 = (i86 & 40) << 1;
            i52 = ((i87 & i88) << 1) + (i87 ^ i88);
            int i89 = f54638b;
            int i90 = ((i89 & (-76)) | ((~i89) & 75)) + ((i89 & 75) << 1);
            f54637a = i90 % 128;
            int i91 = i90 % 2;
        }
        int i92 = f54637a;
        int i93 = i92 & 51;
        int i94 = i92 | 51;
        int i95 = (i93 & i94) + (i94 | i93);
        f54638b = i95 % 128;
        if (i95 % 2 == 0) {
            int i96 = 31 / 0;
        }
        return bArr2;
    }

    public static short[] setCompoundDrawableTintBlendMode(short[] sArr) {
        return (short[]) setOnFocusChangeListener(new Object[]{sArr}, -54945966, 54945974, (int) System.currentTimeMillis());
    }

    public static byte[] setDividerPadding(byte[] bArr, byte b10) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr, Byte.valueOf(b10)}, -503467610, 503467616, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = (i11 * 517) + (i10 * (-515));
        int i20 = ~i11;
        int i21 = ~(i20 | i12);
        int i22 = ~i12;
        int i23 = i21 | (~(i22 | i10));
        int i24 = ~(i22 | i11);
        int i25 = ~i10;
        int i26 = (((~(i25 | i11)) | i24) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i20 | i25)) | (~(i25 | i22 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i23 | i24) * (-516)) + i19;
        int iValueOf = 0;
        switch (i26) {
            case 1:
                return n(objArr);
            case 2:
                g(objArr);
                return null;
            case 3:
                return r(objArr);
            case 4:
                byte[] bArr2 = (byte[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i27 = f54638b;
                int i28 = i27 & 15;
                int i29 = -(-((i27 ^ 15) | i28));
                int i30 = (i28 & i29) + (i29 | i28);
                f54637a = i30 % 128;
                int i31 = i30 % 2;
                iValueOf = new byte[iIntValue];
                int iMin = Math.min(bArr2.length, iIntValue);
                if (i31 == 0) {
                    System.arraycopy(bArr2, 0, iValueOf, 0, iMin);
                } else {
                    System.arraycopy(bArr2, 1, iValueOf, 0, iMin);
                }
                break;
            case 5:
                short[] sArr = (short[]) objArr[0];
                short[] sArr2 = (short[]) objArr[1];
                int i32 = f54638b + 123;
                f54637a = i32 % 128;
                int i33 = i32 % 2;
                boolean zEquals = Arrays.equals(sArr, sArr2);
                if (i33 != 0) {
                    int i34 = 39 / 0;
                }
                return Boolean.valueOf(zEquals);
            case 6:
                return c(objArr);
            case 7:
                return o(objArr);
            case 8:
                return l(objArr);
            case 9:
                return i(objArr);
            case 10:
                return d(objArr);
            case 11:
                return p(objArr);
            case 12:
                byte[] bArr3 = (byte[]) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i35 = f54638b;
                int i36 = (i35 ^ 53) + ((i35 & 53) << 1);
                int i37 = i36 % 128;
                f54637a = i37;
                int i38 = i36 % 2;
                if (bArr3 != null) {
                    int i39 = iIntValue2 ^ 1;
                    int i40 = -(-((iIntValue2 & 1) << 1));
                    int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                    int i42 = i35 & 45;
                    int i43 = (i42 - (~((i35 ^ 45) | i42))) - 1;
                    f54637a = i43 % 128;
                    int i44 = i43 % 2;
                    while (true) {
                        iIntValue2 = (iIntValue2 << 1) + (~iIntValue2);
                        if (iIntValue2 < 0) {
                            int i45 = f54637a;
                            int i46 = ((i45 ^ 53) | (i45 & 53)) << 1;
                            int i47 = -(((~i45) & 53) | (i45 & (-54)));
                            int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                            f54638b = i48 % 128;
                            int i49 = i48 % 2;
                            iValueOf = Integer.valueOf(i41);
                        } else {
                            int i50 = f54638b;
                            int i51 = ((i50 ^ 28) + ((i50 & 28) << 1)) - 1;
                            f54637a = i51 % 128;
                            int i52 = i51 % 2;
                            int i53 = i41 * 257;
                            byte b10 = bArr3[iIntValue2];
                            i41 = (~(i53 & b10)) & (b10 | i53);
                            int i54 = (-2) - (((i50 & 56) + (i50 | 56)) ^ (-1));
                            f54637a = i54 % 128;
                            int i55 = i54 % 2;
                        }
                    }
                } else {
                    int i56 = (-2) - (((i37 ^ 106) + ((i37 & 106) << 1)) ^ (-1));
                    f54638b = i56 % 128;
                    int i57 = i56 % 2;
                    int i58 = i37 | 55;
                    int i59 = i58 << 1;
                    int i60 = -(i58 & (~(i37 & 55)));
                    int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                    f54638b = i61 % 128;
                    int i62 = i61 % 2;
                }
                break;
            case 13:
                return h(objArr);
            case 14:
                return s(objArr);
            case 15:
                return a(objArr);
            case 16:
                return b(objArr);
            case 17:
                return e(objArr);
            case 18:
                int[] iArr = (int[]) objArr[0];
                int i63 = f54637a;
                int i64 = (i63 & 15) + (i63 | 15);
                int i65 = i64 % 128;
                f54638b = i65;
                int i66 = i64 % 2;
                if (iArr != null) {
                    int length = iArr.length;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i67 = -(-(length * (-69)));
                    int i68 = ((~i67) & 71) | (i67 & (-72));
                    int i69 = -(-((i67 & 71) << 1));
                    int i70 = (i68 & i69) + (i69 | i68);
                    int i71 = ~length;
                    int i72 = length & 1;
                    int i73 = (-2) & length;
                    int i74 = ((-2) & i71) | i72 | i73;
                    int i75 = ~i74;
                    int i76 = (i74 | i75) & i75;
                    int i77 = (length ^ iCurrentTimeMillis) | (length & iCurrentTimeMillis);
                    int i78 = ~i77;
                    int i79 = (i77 | i78) & i78;
                    int i80 = i76 & i79;
                    int i81 = (i76 | i79) & (~i80);
                    int i82 = -(-(((i81 & i80) | (i81 ^ i80)) * (-140)));
                    int i83 = i70 ^ i82;
                    int i84 = (i82 & i70) << 1;
                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                    int i86 = length ^ 1;
                    int i87 = (i86 & i72) | (i86 ^ i72);
                    int i88 = -(-((~((i87 & iCurrentTimeMillis) | (i87 ^ iCurrentTimeMillis))) * 70));
                    int i89 = (i85 | i88) << 1;
                    int i90 = -((i88 & (~i85)) | ((~i88) & i85));
                    int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
                    int i92 = (~i73) & ((-2) | length);
                    int i93 = ~((i92 & i73) | (i92 ^ i73));
                    int i94 = i71 ^ 1;
                    int i95 = i71 & 1;
                    int i96 = ~((i95 & i94) | (i94 ^ i95));
                    int i97 = i93 & i96;
                    int i98 = ((i96 | i93) & (~i97)) | i97;
                    int i99 = iCurrentTimeMillis & 1;
                    int i100 = (iCurrentTimeMillis | 1) & (~i99);
                    int i101 = (i100 & i99) | (i100 ^ i99);
                    int i102 = ~i101;
                    int i103 = (i101 | i102) & i102;
                    int i104 = ((i103 & i98) | (i98 ^ i103)) * 70;
                    int i105 = (i91 | i104) << 1;
                    int i106 = -(i104 ^ i91);
                    int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                    int i108 = f54637a + 121;
                    f54638b = i108 % 128;
                    int i109 = i108 % 2;
                    while (true) {
                        int i110 = (length & 41) | ((~length) & (-42));
                        int i111 = (length & (-42)) << 1;
                        int i112 = (i110 & i111) + (i111 | i110);
                        length = ((((i112 ^ 41) | (i112 & 41)) << 1) - (~(-((i112 & (-42)) | ((~i112) & 41))))) - 1;
                        if (length < 0) {
                            int i113 = f54638b;
                            int i114 = i113 & 63;
                            int i115 = ((i113 ^ 63) | i114) << 1;
                            int i116 = -((i113 | 63) & (~i114));
                            int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                            f54637a = i117 % 128;
                            int i118 = i117 % 2;
                            iValueOf = Integer.valueOf(i107);
                        } else {
                            int i119 = f54638b;
                            int i120 = i119 + 59;
                            f54637a = i120 % 128;
                            if (i120 % 2 != 0) {
                                int i121 = i107 / 26023;
                                int i122 = iArr[length];
                                int i123 = i121 & i122;
                                i13 = ((i122 ^ i121) | i123) & (~i123);
                            } else {
                                int i124 = i107 * 257;
                                int i125 = iArr[length];
                                int i126 = (~i125) & i124;
                                int i127 = i125 & (~i124);
                                i13 = (i127 & i126) | (i126 ^ i127);
                            }
                            i107 = i13;
                            int i128 = ((i119 ^ 35) | (i119 & 35)) << 1;
                            int i129 = -(((~i119) & 35) | (i119 & (-36)));
                            int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
                            f54637a = i130 % 128;
                            int i131 = i130 % 2;
                        }
                    }
                } else {
                    int i132 = i65 + 121;
                    f54637a = i132 % 128;
                    int i133 = i132 % 2;
                }
                break;
            case 19:
                byte[] bArr4 = (byte[]) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int i134 = f54638b;
                int i135 = (i134 & 1) + (i134 | 1);
                f54637a = i135 % 128;
                if (i135 % 2 != 0) {
                    int iIntValue5 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)}, 930533752, -930533735, iIntValue3)).intValue();
                    byte[] bArr5 = new byte[iIntValue5];
                    System.arraycopy(bArr4, iIntValue3, bArr5, 1, Math.min(bArr4.length * iIntValue3, iIntValue5));
                    bArr = bArr5;
                } else {
                    int iIntValue6 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)}, 930533752, -930533735, iIntValue3)).intValue();
                    bArr = new byte[iIntValue6];
                    int length2 = bArr4.length;
                    int i136 = -iIntValue3;
                    int i137 = ((~i136) & length2) | ((~length2) & i136);
                    int i138 = (length2 & i136) << 1;
                    System.arraycopy(bArr4, iIntValue3, bArr, 0, Math.min((i137 & i138) + (i138 | i137), iIntValue6));
                }
                int i139 = f54637a;
                int i140 = ((i139 | 73) << 1) - (i139 ^ 73);
                f54638b = i140 % 128;
                int i141 = i140 % 2;
                return bArr;
            case 20:
                return f(objArr);
            case 21:
                return m(objArr);
            case 22:
                return q(objArr);
            case 23:
                return j(objArr);
            case 24:
                char[] cArr = (char[]) objArr[0];
                char[] cArr2 = (char[]) objArr[1];
                int i142 = f54637a;
                int i143 = i142 & 21;
                int i144 = (((i142 | 21) & (~i143)) - (~(i143 << 1))) - 1;
                f54638b = i144 % 128;
                int i145 = i144 % 2;
                boolean zEquals2 = Arrays.equals(cArr, cArr2);
                int i146 = f54638b;
                int i147 = i146 | 53;
                int i148 = i147 << 1;
                int i149 = -((~(i146 & 53)) & i147);
                int i150 = (i148 & i149) + (i149 | i148);
                f54637a = i150 % 128;
                if (i150 % 2 == 0) {
                    return Boolean.valueOf(zEquals2);
                }
                throw null;
            case 25:
                return k(objArr);
            case 26:
                short[] sArr3 = (short[]) objArr[0];
                int i151 = f54638b;
                int i152 = i151 + 75;
                int i153 = i152 % 128;
                f54637a = i153;
                int i154 = i152 % 2;
                if (sArr3 == null) {
                    int i155 = i153 & 113;
                    int i156 = ((i153 ^ 113) | i155) << 1;
                    int i157 = -((~i155) & (i153 | 113));
                    int i158 = (i156 ^ i157) + ((i156 & i157) << 1);
                    f54638b = i158 % 128;
                    int i159 = i158 % 2;
                    int i160 = i153 + 85;
                    f54638b = i160 % 128;
                    if (i160 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int length3 = sArr3.length;
                    int i161 = (length3 & (-2)) | ((~length3) & 1);
                    int i162 = (length3 & 1) << 1;
                    int i163 = (i161 & i162) + (i161 | i162);
                    int i164 = (((i151 | 10) << 1) - (i151 ^ 10)) - 1;
                    f54637a = i164 % 128;
                    int i165 = i164 % 2;
                    while (true) {
                        int i166 = (((length3 | 18) << 1) - (length3 ^ 18)) - 1;
                        length3 = ((i166 & 17) | ((~i166) & (-18))) + ((i166 & (-18)) << 1);
                        if (length3 >= 0) {
                            int i167 = f54638b;
                            int i168 = ((i167 & 40) + (i167 | 40)) - 1;
                            f54637a = i168 % 128;
                            if (i168 % 2 != 0) {
                                int i169 = i163 << 23301;
                                int i170 = sArr3[length3] & 16117;
                                int i171 = i169 & i170;
                                i14 = ((i169 ^ i170) | i171) & (~i171);
                            } else {
                                int i172 = i163 * 257;
                                int i173 = sArr3[length3] & 255;
                                int i174 = (~i173) & i172;
                                int i175 = i173 & (~i172);
                                i14 = (i175 & i174) | (i174 ^ i175);
                            }
                            i163 = i14;
                        } else {
                            int i176 = (-2) - ((f54638b + 72) ^ (-1));
                            f54637a = i176 % 128;
                            if (i176 % 2 != 0) {
                                throw null;
                            }
                            iValueOf = Integer.valueOf(i163);
                        }
                    }
                }
                break;
            default:
                byte[] bArr6 = (byte[]) objArr[0];
                int i177 = f54638b;
                int i178 = i177 & 13;
                int i179 = i178 + ((i177 ^ 13) | i178);
                f54637a = i179 % 128;
                int i180 = i179 % 2;
                if (bArr6 == 0) {
                    int i181 = (i177 | 93) << 1;
                    int i182 = -(((~i177) & 93) | (i177 & (-94)));
                    int i183 = (i181 ^ i182) + ((i181 & i182) << 1);
                    int i184 = i183 % 128;
                    f54637a = i184;
                    int i185 = i183 % 2;
                    int i186 = ((i184 | 17) << 1) - (i184 ^ 17);
                    f54638b = i186 % 128;
                    int i187 = i186 % 2;
                } else {
                    int length4 = bArr6.length;
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i188 = (-713) - (~(-(~(-(-(length4 * 713))))));
                    int i189 = ~length4;
                    int i190 = (i189 | length4) & i189;
                    int i191 = i190 & 1;
                    int i192 = (~i191) & (i190 | 1);
                    int i193 = ~((i191 & i192) | (i192 ^ i191));
                    int i194 = ~iCurrentTimeMillis2;
                    int i195 = i194 ^ 1;
                    int i196 = i194 & 1;
                    int i197 = (i195 & i196) | (i195 ^ i196);
                    int i198 = ~i197;
                    int i199 = (i197 | i198) & i198;
                    int i200 = i193 & i199;
                    int i201 = (i193 | i199) & (~i200);
                    int i202 = ((i201 & i200) | (i201 ^ i200)) * (-712);
                    int i203 = (((i188 ^ i202) | (i188 & i202)) << 1) - (((~i188) & i202) | ((~i202) & i188));
                    int i204 = (i190 ^ i194) | (i190 & i194);
                    int i205 = i204 & 1;
                    int i206 = (i204 | 1) & (~i205);
                    int i207 = ~((i206 & i205) | (i206 ^ i205));
                    int i208 = length4 & 1;
                    int i209 = i208 | ((~i208) & (length4 | 1));
                    int i210 = i209 & iCurrentTimeMillis2;
                    int i211 = (iCurrentTimeMillis2 | i209) & (~i210);
                    int i212 = (i211 & i210) | (i211 ^ i210);
                    int i213 = ~i212;
                    int i214 = (i212 | i213) & i213;
                    int i215 = ((~i214) & i207) | ((~i207) & i214);
                    int i216 = i214 & i207;
                    int i217 = -(-(((i216 & i215) | (i215 ^ i216)) * (-712)));
                    int i218 = i203 & i217;
                    int i219 = (i217 ^ i203) | i218;
                    int i220 = (i218 ^ i219) + ((i219 & i218) << 1);
                    int i221 = ~((i194 & (-2)) | ((~i194) & 1) | i196);
                    int i222 = i189 & i221;
                    int i223 = (i221 | i189) & (~i222);
                    int i224 = -(-(((i223 & i222) | (i223 ^ i222)) * 712));
                    int i225 = (((~i224) & i220) | ((~i220) & i224)) + ((i224 & i220) << 1);
                    int i226 = f54637a;
                    int i227 = i226 ^ 103;
                    int i228 = (i226 & 103) << 1;
                    int i229 = (i227 ^ i228) + ((i228 & i227) << 1);
                    f54638b = i229 % 128;
                    int i230 = i229 % 2;
                    while (true) {
                        length4 = ((~length4) - (~(length4 << 1))) - 1;
                        if (length4 >= 0) {
                            int i231 = f54638b;
                            int i232 = i231 & 73;
                            int i233 = i232 + ((i231 ^ 73) | i232);
                            f54637a = i233 % 128;
                            if (i233 % 2 != 0) {
                                i16 = i225 >> 882;
                                i15 = bArr6[length4];
                                i17 = i16 & i15;
                                i18 = ~i17;
                            } else {
                                i15 = i225 * 257;
                                i16 = bArr6[length4];
                                i17 = i15 & i16;
                                i18 = ~i17;
                            }
                            i225 = ((i16 ^ i15) | i17) & i18;
                        } else {
                            int i234 = f54637a;
                            int i235 = (i234 & 83) + (i234 | 83);
                            f54638b = i235 % 128;
                            if (i235 % 2 == 0) {
                                throw null;
                            }
                            iValueOf = Integer.valueOf(i225);
                        }
                    }
                }
                break;
        }
        return iValueOf;
    }

    public static boolean setX(Object[] objArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{objArr}, -1223043475, 1223043478, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setY(int[] iArr, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, Integer.valueOf(i10)}, 1613127163, -1613127143, i10)).intValue();
    }

    public static int[] setCompoundDrawableTintBlendMode(int[] iArr) {
        return (int[]) setOnFocusChangeListener(new Object[]{iArr}, -1653586244, 1653586266, (int) System.currentTimeMillis());
    }

    public static byte[] setDividerPadding(byte[] bArr, int i10) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i10)}, 575197588, -575197584, i10);
    }

    public static byte[] setX(byte[][] bArr) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr}, 107086576, -107086562, (int) System.currentTimeMillis());
    }

    public static int setY(char[] cArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{cArr}, -2017054740, 2017054751, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setCompoundDrawableTintBlendMode(short[] sArr, short[] sArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{sArr, sArr2}, 225655275, -225655270, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setDividerPadding(short[] sArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{sArr}, -2022403238, 2022403264, (int) System.currentTimeMillis())).intValue();
    }

    public static byte[] setX(byte[] bArr, int i10, int i11) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 525237936, -525237917, i10);
    }

    public static void setY(byte[] bArr) {
        setOnFocusChangeListener(new Object[]{bArr}, -949833373, 949833375, (int) System.currentTimeMillis());
    }

    public static boolean setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1688418299, 1688418315, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setDividerPadding(long[] jArr, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{jArr, Integer.valueOf(i10)}, -1971094880, 1971094881, i10)).intValue();
    }

    public static long[] setX(long[] jArr) {
        return (long[]) setOnFocusChangeListener(new Object[]{jArr}, 1616665569, -1616665546, (int) System.currentTimeMillis());
    }

    public static boolean setY(char[] cArr, char[] cArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{cArr, cArr2}, -423504169, 423504193, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setDividerPadding(byte[] bArr, byte[] bArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{bArr, bArr2}, 1295906124, -1295906099, (int) System.currentTimeMillis())).booleanValue();
    }

    public static byte[] setX(byte[] bArr) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static boolean setY(byte[] bArr, int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i10)}, -1326375370, 1326375385, i10)).booleanValue();
    }

    public static boolean[] setX(boolean[] zArr) {
        return (boolean[]) setOnFocusChangeListener(new Object[]{zArr}, 1612495211, -1612495201, (int) System.currentTimeMillis());
    }

    public static int setX(int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr}, 2105780221, -2105780203, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setX(byte[] bArr, byte[] bArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{bArr, bArr2}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
    }

    public static byte[] setOnFocusChangeListener(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr, bArr2, bArr3}, -271182023, 271182030, (int) System.currentTimeMillis());
    }

    public static byte[] setOnFocusChangeListener(byte[] bArr, byte[] bArr2) {
        return (byte[]) setOnFocusChangeListener(new Object[]{bArr, bArr2}, 1396275083, -1396275074, (int) System.currentTimeMillis());
    }

    public static int setOnFocusChangeListener(byte[] bArr, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i10)}, 1594133518, -1594133506, i10)).intValue();
    }

    public static int setOnFocusChangeListener(byte[] bArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{bArr}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
    }
}
