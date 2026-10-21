package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bfe implements bey {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54686c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54687d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f54688a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f54689b = new byte[128];

    public bfe() throws IOException {
        setY(new Object[]{this}, 1204214972, -1204214968, System.identityHashCode(this));
    }

    public static /* synthetic */ Integer a(Object[] objArr) throws IOException {
        int i10;
        OutputStream outputStream;
        byte[] bArr;
        bfe bfeVar;
        int i11;
        int i12;
        int i13 = 0;
        bfe bfeVar2 = (bfe) objArr[0];
        String str = (String) objArr[1];
        int i14 = 2;
        OutputStream outputStream2 = (OutputStream) objArr[2];
        int i15 = f54687d;
        int i16 = (((i15 ^ 37) | (i15 & 37)) << 1) - (((~i15) & 37) | (i15 & (-38)));
        f54686c = i16 % 128;
        int i17 = i16 % 2;
        byte[] bArr2 = new byte[36];
        int length = str.length();
        int i18 = f54686c;
        int i19 = i18 & 11;
        int i20 = (((i18 | 11) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
        f54687d = i20 % 128;
        int i21 = i20 % 2;
        while (true) {
            i10 = -1359455845;
            if (length <= 0) {
                break;
            }
            int i22 = f54686c;
            int i23 = i22 & 33;
            int i24 = ((((i22 ^ 33) | i23) << 1) - (~(-((i22 | 33) & (~i23))))) - 1;
            f54687d = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = -(-((length ^ (-1)) | length));
                if (!((Boolean) setY(new Object[]{Character.valueOf(str.charAt((length ^ i25) + ((i25 & length) << 1)))}, 1359455846, -1359455845, (int) System.currentTimeMillis())).booleanValue()) {
                    break;
                }
                int i26 = f54687d;
                int i27 = i26 ^ 57;
                int i28 = (((i26 & 57) | i27) << 1) - i27;
                f54686c = i28 % 128;
                int i29 = i28 % 2;
                int i30 = ((length ^ 77) - (~(-(-((length & 77) << 1))))) - 1;
                int i31 = i30 & (-78);
                int i32 = -(-((i30 ^ (-78)) | i31));
                length = ((i31 & i32) << 1) + (i31 ^ i32);
                System.identityHashCode(bfeVar2);
                System.identityHashCode(bfeVar2);
            } else {
                if (!((Boolean) setY(new Object[]{Character.valueOf(str.charAt(length))}, 1359455846, -1359455845, (int) System.currentTimeMillis())).booleanValue()) {
                    break;
                }
                int i210 = f54687d;
                int i211 = i210 ^ 57;
                int i212 = (((i210 & 57) | i211) << 1) - i211;
                f54686c = i212 % 128;
                int i213 = i212 % 2;
                int i33 = ((length ^ 77) - (~(-(-((length & 77) << 1))))) - 1;
                int i34 = i33 & (-78);
                int i35 = -(-((i33 ^ (-78)) | i34));
                length = ((i34 & i35) << 1) + (i34 ^ i35);
                System.identityHashCode(bfeVar2);
                System.identityHashCode(bfeVar2);
            }
        }
        int i36 = f54687d;
        int i37 = i36 & 123;
        int i38 = (i36 ^ 123) | i37;
        int i39 = (i37 & i38) + (i38 | i37);
        f54686c = i39 % 128;
        int i40 = i39 % 2;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        while (i41 < length) {
            while (true) {
                if (i41 < length) {
                    int i44 = f54686c;
                    int i45 = i44 & 111;
                    int i46 = ((i44 ^ 111) | i45) << 1;
                    int i47 = -((~i45) & (i44 | 111));
                    int i48 = (i46 & i47) + (i47 | i46);
                    f54687d = i48 % 128;
                    if (i48 % i14 != 0) {
                        outputStream = outputStream2;
                        Object[] objArr2 = new Object[1];
                        objArr2[i13] = Character.valueOf(str.charAt(i41));
                        bArr = bArr2;
                        if (!((Boolean) setY(objArr2, 1359455846, i10, (int) System.currentTimeMillis())).booleanValue()) {
                            break;
                        }
                    } else {
                        Object[] objArr3 = new Object[1];
                        objArr3[i13] = Character.valueOf(str.charAt(i41));
                        outputStream = outputStream2;
                        int i49 = 6 / i13;
                        if (((Boolean) setY(objArr3, 1359455846, i10, (int) System.currentTimeMillis())).booleanValue()) {
                            bArr = bArr2;
                        }
                    }
                    i41++;
                    int i50 = f54686c;
                    int i51 = (i50 & 73) + (i50 | 73);
                    f54687d = i51 % 128;
                    int i52 = i51 % 2;
                    bArr2 = bArr;
                    outputStream2 = outputStream;
                    i14 = 2;
                } else {
                    outputStream = outputStream2;
                }
                bArr = bArr2;
                break;
            }
            byte[] bArr3 = bfeVar2.f54689b;
            int i53 = (-2) - ((((((i41 ^ (-31)) | (i41 & (-31))) << 1) - (((~i41) & (-31)) | (i41 & 30))) + 33) ^ (-1));
            byte b10 = bArr3[str.charAt(i41)];
            int i54 = f54686c;
            int i55 = i54 & 87;
            int i56 = ((i54 ^ 87) | i55) << 1;
            int i57 = -((i54 | 87) & (~i55));
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            f54687d = i58 % 128;
            int i59 = i58 % 2;
            while (true) {
                if (i53 >= length) {
                    bfeVar = bfeVar2;
                    break;
                }
                int i60 = (-2) - ((f54686c + 56) ^ (-1));
                f54687d = i60 % 128;
                int i61 = i60 % 2;
                Object[] objArr4 = new Object[1];
                objArr4[i13] = Character.valueOf(str.charAt(i53));
                bfeVar = bfeVar2;
                if (!((Boolean) setY(objArr4, 1359455846, i10, (int) System.currentTimeMillis())).booleanValue()) {
                    break;
                }
                int i62 = f54687d;
                int i63 = i62 ^ 61;
                int i64 = ((i62 & 61) | i63) << 1;
                int i65 = -i63;
                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                f54686c = i66 % 128;
                if (i66 % 2 != 0) {
                    int i67 = i53 ^ (-70);
                    int i68 = ((i53 & (-70)) | i67) << 1;
                    int i69 = -i67;
                    int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                    int i71 = i70 & 94;
                    int i72 = (~i71) & (i70 | 94);
                    int i73 = -(-(i71 << 1));
                    i11 = i72 ^ i73;
                    i12 = (i73 & i72) << 1;
                } else {
                    int i74 = i53 & 17;
                    int i75 = i53 | 17;
                    int i76 = (i74 ^ i75) + ((i74 & i75) << 1);
                    int i77 = (i76 & 15) | ((-16) & (~i76));
                    int i78 = (i76 & (-16)) << 1;
                    i11 = i77 & i78;
                    i12 = i77 | i78;
                }
                i53 = i11 + i12;
                int i79 = (i62 ^ 29) + ((i62 & 29) << 1);
                f54686c = i79 % 128;
                int i80 = i79 % 2;
                bfeVar2 = bfeVar;
                i13 = 0;
            }
            int i81 = ((i53 ^ 11) + ((i53 & 11) << 1)) - 1;
            int i82 = i81 & (-9);
            int i83 = (((i81 | (-9)) & (~i82)) - (~(-(-(i82 << 1))))) - 1;
            char cCharAt = str.charAt(i53);
            bfe bfeVar3 = bfeVar;
            byte b11 = bfeVar3.f54689b[cCharAt];
            int i84 = b10 & b11;
            if ((((~i84) & (b10 | b11)) | i84) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            int i85 = (((i42 ^ 95) | (i42 & 95)) << 1) - (((~i42) & 95) | (i42 & (-96)));
            int i86 = ((i85 ^ (-94)) - (~((i85 & (-94)) << 1))) - 1;
            int i87 = b10 << 4;
            bArr[i42] = (byte) ((b11 & i87) | (i87 ^ b11));
            if (i86 == 36) {
                int i88 = f54686c + 47;
                f54687d = i88 % 128;
                if (i88 % 2 == 0) {
                    outputStream2 = outputStream;
                    outputStream2.write(bArr);
                    i86 = 1;
                } else {
                    outputStream2 = outputStream;
                    outputStream2.write(bArr);
                    i86 = 0;
                }
                int i89 = f54687d;
                int i90 = i89 & 89;
                int i91 = ((i89 ^ 89) | i90) << 1;
                int i92 = -((i89 | 89) & (~i90));
                int i93 = (i91 & i92) + (i92 | i91);
                f54686c = i93 % 128;
                int i94 = i93 % 2;
            } else {
                outputStream2 = outputStream;
            }
            i42 = i86;
            i43++;
            int i95 = f54687d;
            int i96 = i95 & 71;
            int i97 = i96 + ((i95 ^ 71) | i96);
            f54686c = i97 % 128;
            int i98 = i97 % 2;
            i41 = i83;
            bfeVar2 = bfeVar3;
            i13 = 0;
            i10 = -1359455845;
            bArr2 = bArr;
            i14 = 2;
        }
        byte[] bArr4 = bArr2;
        if (i42 > 0) {
            int i99 = f54686c;
            int i100 = ((i99 & (-44)) | ((~i99) & 43)) + ((i99 & 43) << 1);
            f54687d = i100 % 128;
            if (i100 % 2 == 0) {
                outputStream2.write(bArr4, 1, i42);
            } else {
                outputStream2.write(bArr4, 0, i42);
            }
        }
        int i101 = f54687d;
        int i102 = i101 & 99;
        int i103 = i101 | 99;
        int i104 = (i102 & i103) + (i103 | i102);
        f54686c = i104 % 128;
        int i105 = i104 % 2;
        return Integer.valueOf(i43);
    }

    public static /* synthetic */ Integer b(Object[] objArr) throws IOException {
        int i10 = 0;
        bfe bfeVar = (bfe) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        char c10 = 3;
        int iIntValue2 = ((Number) objArr[3]).intValue();
        char c11 = 4;
        OutputStream outputStream = (OutputStream) objArr[4];
        int i11 = f54687d;
        int i12 = i11 & 93;
        int i13 = i12 + ((i11 ^ 93) | i12);
        int i14 = i13 % 128;
        f54686c = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (iIntValue2 < 0) {
            int i15 = i14 & 43;
            int i16 = i15 + ((i14 ^ 43) | i15);
            int i17 = i16 % 128;
            f54687d = i17;
            i10 = i16 % 2 != 0 ? 1 : 0;
            int i18 = (((i17 & (-86)) | ((~i17) & 85)) - (~(-(-((i17 & 85) << 1))))) - 1;
            f54686c = i18 % 128;
            int i19 = i18 % 2;
            return Integer.valueOf(i10 ^ 1);
        }
        byte[] bArr2 = new byte[72];
        int i20 = (((i11 | 52) << 1) - (i11 ^ 52)) - 1;
        f54686c = i20 % 128;
        int i21 = i20 % 2;
        int i22 = iIntValue;
        int i23 = iIntValue2;
        while (i23 > 0) {
            int i24 = f54687d;
            int i25 = ((i24 | 87) << 1) - (87 ^ i24);
            f54686c = i25 % 128;
            int i26 = i25 % 2;
            int iMin = Math.min(36, i23);
            Object[] objArr2 = new Object[5];
            objArr2[i10] = bfeVar;
            objArr2[1] = bArr;
            objArr2[2] = Integer.valueOf(i22);
            objArr2[c10] = Integer.valueOf(iMin);
            objArr2[c11] = bArr2;
            outputStream.write(bArr2, i10, ((Integer) setY(objArr2, -958046868, 958046873, i22)).intValue());
            i22 = (i22 | iMin) + (i22 & iMin);
            int i27 = -iMin;
            int i28 = i27 * 477;
            int i29 = -(~(-(-(i23 * (-475)))));
            int i30 = ((i28 & i29) + (i28 | i29)) - 1;
            int i31 = ~i27;
            int i32 = ~i23;
            int i33 = ~((i23 & i31) | (i31 ^ i23));
            int i34 = ~(i32 | i27 | iIntValue);
            int i35 = -(-(((i33 ^ i34) | (i33 & i34)) * (-476)));
            int i36 = ((~i30) & i35) | ((~i35) & i30);
            int i37 = -(-((i35 & i30) << 1));
            int i38 = (i36 & i37) + (i36 | i37);
            int i39 = (i32 & i31) | ((~i32) & i27) | (i32 & i27);
            int i40 = ~iIntValue;
            int i41 = (i39 & i40) | ((~i39) & iIntValue);
            int i42 = i39 & iIntValue;
            int i43 = (i42 & i41) | (i41 ^ i42);
            int i44 = ~i43;
            int i45 = -(~(((i43 | i44) & i44) * 952));
            int i46 = i32 & i40;
            int i47 = (i32 | i40) & (~i46);
            int i48 = (i47 & i46) | (i47 ^ i46);
            int i49 = i48 & i27;
            int i50 = (i27 | i48) & (~i49);
            i23 = ((~((i50 & i49) | (i50 ^ i49))) * 476) + ((-2) - ((((i38 | i45) << 1) - (i45 ^ i38)) ^ (-1)));
            int i51 = f54686c;
            int i52 = (i51 ^ 59) + ((i51 & 59) << 1);
            f54687d = i52 % 128;
            int i53 = i52 % 2;
            i10 = 0;
            c10 = 3;
            c11 = 4;
        }
        int i54 = iIntValue2 << 1;
        int i55 = f54687d;
        int i56 = ((((i55 ^ 111) | (i55 & 111)) << 1) - (~(-(((~i55) & 111) | (i55 & (-112)))))) - 1;
        f54686c = i56 % 128;
        if (i56 % 2 == 0) {
            return Integer.valueOf(i54);
        }
        int i57 = 87 / 0;
        return Integer.valueOf(i54);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b3, code lost:
    
        if (r10 <= ((-2) - ((-1) ^ (r1.length() - (~r11))))) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
    
        if (r10 <= ((r5 & r12) + (r5 | r12))) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c3, code lost:
    
        if ((r11 & 1) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c5, code lost:
    
        r5 = r11 >>> 1;
        r11 = new byte[r5];
        r12 = com.mypinpad.tsdk.isolation.bfe.f54687d;
        r13 = r12 ^ 3;
        r6 = (((3 & r12) | r13) << 1) - r13;
        com.mypinpad.tsdk.isolation.bfe.f54686c = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d6, code lost:
    
        if (r7 >= r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d8, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.bfe.f54686c;
        r13 = r6 & 67;
        r12 = ((((r6 ^ 67) | r13) << 1) - (~(-((r6 | 67) & (~r13))))) - 1;
        com.mypinpad.tsdk.isolation.bfe.f54687d = r12 % 128;
        r12 = r12 % 2;
        r12 = r10 + 2;
        r13 = (r12 ^ (-1)) + (r12 << 1);
        r6 = r0.f54689b[r1.charAt(r10)];
        r10 = r13 - 67;
        r10 = ((r10 | 68) << 1) - (r10 ^ 68);
        r12 = r0.f54689b[r1.charAt(r13)];
        r6 = r6 << 4;
        r13 = ((~r12) & r6) | ((~r6) & r12);
        r6 = r6 & r12;
        r6 = (r6 & r13) | (r13 ^ r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0115, code lost:
    
        if (r6 < 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0117, code lost:
    
        r11[r7] = (byte) r6;
        r7 = ((r7 & 1) << 1) + (r7 ^ 1);
        r6 = com.mypinpad.tsdk.isolation.bfe.f54687d;
        r12 = (((r6 & (-72)) | ((~r6) & 71)) - (~(-(-((r6 & 71) << 1))))) - 1;
        com.mypinpad.tsdk.isolation.bfe.f54686c = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013d, code lost:
    
        throw new java.io.IOException("invalid characters encountered in Hex string");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013e, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.bfe.f54687d;
        r1 = r0 & 73;
        r0 = (r0 | 73) & (~r1);
        r1 = r1 << 1;
        r2 = ((r0 | r1) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.bfe.f54686c = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x015b, code lost:
    
        throw new java.io.IOException("a hexadecimal encoding must have an even number of characters");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r18, int r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bfe.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.bey
    public final int setDividerPadding(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        return ((Integer) setY(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11), outputStream}, 1173777077, -1173777075, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.bey
    public final int setDividerPadding(int i10) {
        return ((Integer) setY(new Object[]{this, Integer.valueOf(i10)}, 1800430331, -1800430331, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.bey
    public final int setY(String str, OutputStream outputStream) throws IOException {
        return ((Integer) setY(new Object[]{this, str, outputStream}, 561429701, -561429698, System.identityHashCode(this))).intValue();
    }
}
