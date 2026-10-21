package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class bfb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfe f54679a = new bfe();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54680b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54681c = 1;

    static {
        int i10 = f54681c;
        int i11 = i10 & 73;
        int i12 = ((i10 | 73) & (~i11)) + (i11 << 1);
        f54680b = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object compoundDrawableTintBlendMode;
        int i13 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15 | i12);
        int i17 = ~i12;
        int i18 = i15 | i17;
        int i19 = (((~(i10 | i17)) | (~(i15 | i10)) | (~i18)) * 50) + ((i16 | (~(i18 | i10))) * 50) + i13;
        bfe bfeVar = f54679a;
        if (i19 == 1) {
            String str = (String) objArr[0];
            int i20 = f54680b + 44;
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f54681c = i21 % 128;
            try {
                return (byte[]) (i21 % 2 == 0 ? bfe.setY(new Object[]{bfeVar, str, 0, Integer.valueOf(str.length())}, -200309002, 200309008, 0) : bfe.setY(new Object[]{bfeVar, str, 0, Integer.valueOf(str.length())}, -200309002, 200309008, 0));
            } catch (Exception e5) {
                StringBuilder sb2 = new StringBuilder("exception decoding Hex string: ");
                sb2.append(e5.getMessage());
                throw new bew(sb2.toString(), e5);
            }
        }
        if (i19 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int i22 = f54681c + 107;
            f54680b = i22 % 128;
            int i23 = i22 % 2;
            return (String) bez.setX(new Object[]{(byte[]) setCompoundDrawableTintBlendMode(new Object[]{bArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 447768942, -447768939, iIntValue)}, -1321203111, 1321203112, (int) System.currentTimeMillis());
        }
        if (i19 == 3) {
            byte[] bArr2 = (byte[]) objArr[0];
            int iIntValue3 = ((Number) objArr[1]).intValue();
            int iIntValue4 = ((Number) objArr[2]).intValue();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ((Integer) bfe.setY(new Object[]{bfeVar, bArr2, Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4), byteArrayOutputStream}, 1173777077, -1173777075, iIntValue3)).intValue();
                int i24 = f54680b;
                int i25 = (i24 ^ 6) + ((i24 & 6) << 1);
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                f54681c = i26 % 128;
                int i27 = i26 % 2;
                int i28 = i24 & 49;
                int i29 = (i24 | 49) & (~i28);
                int i30 = -(-(i28 << 1));
                int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                f54681c = i31 % 128;
                int i32 = i31 % 2;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (i32 == 0) {
                    int i33 = 4 / 0;
                }
                int i34 = f54680b;
                int i35 = (i34 & 19) + (i34 | 19);
                f54681c = i35 % 128;
                if (i35 % 2 != 0) {
                    return byteArray;
                }
                throw null;
            } catch (Exception e7) {
                StringBuilder sb3 = new StringBuilder("exception encoding Hex string: ");
                sb3.append(e7.getMessage());
                throw new bfd(sb3.toString(), e7);
            }
        }
        if (i19 == 4) {
            byte[] bArr3 = (byte[]) objArr[0];
            int i36 = f54680b;
            int i37 = (i36 & (-80)) | ((~i36) & 79);
            int i38 = -(-((i36 & 79) << 1));
            int i39 = (i37 & i38) + (i38 | i37);
            f54681c = i39 % 128;
            int i40 = i39 % 2;
            int length = bArr3.length;
            Object[] objArr2 = new Object[3];
            if (i40 == 0) {
                objArr2[0] = bArr3;
                objArr2[1] = 1;
                objArr2[2] = Integer.valueOf(length);
                compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(objArr2, 447768942, -447768939, 1);
            } else {
                objArr2[0] = bArr3;
                objArr2[1] = 0;
                objArr2[2] = Integer.valueOf(length);
                compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(objArr2, 447768942, -447768939, 0);
            }
            return (byte[]) compoundDrawableTintBlendMode;
        }
        if (i19 != 5) {
            byte[] bArr4 = (byte[]) objArr[0];
            int i41 = f54680b;
            int i42 = (((i41 ^ 107) | (i41 & 107)) << 1) - (((~i41) & 107) | (i41 & (-108)));
            f54681c = i42 % 128;
            return (String) (i42 % 2 == 0 ? setCompoundDrawableTintBlendMode(new Object[]{bArr4, 0, Integer.valueOf(bArr4.length)}, 279467104, -279467102, 0) : setCompoundDrawableTintBlendMode(new Object[]{bArr4, 0, Integer.valueOf(bArr4.length)}, 279467104, -279467102, 0));
        }
        String str2 = (String) objArr[0];
        int iIntValue5 = ((Number) objArr[1]).intValue();
        int i43 = f54681c + 47;
        f54680b = i43 % 128;
        int i44 = i43 % 2;
        try {
            byte[] bArr5 = (byte[]) bfe.setY(new Object[]{bfeVar, str2, 1, Integer.valueOf(iIntValue5)}, -200309002, 200309008, 1);
            int i45 = f54681c;
            int i46 = i45 & 103;
            int i47 = (i45 | 103) & (~i46);
            int i48 = -(-(i46 << 1));
            int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
            f54680b = i49 % 128;
            int i50 = i49 % 2;
            return bArr5;
        } catch (Exception e10) {
            StringBuilder sb4 = new StringBuilder("exception decoding Hex string: ");
            sb4.append(e10.getMessage());
            throw new bew(sb4.toString(), e10);
        }
    }

    public static byte[] setDividerPadding(String str) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{str}, -666540625, 666540626, (int) System.currentTimeMillis());
    }

    public static String setOnFocusChangeListener(byte[] bArr, int i10, int i11) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 279467104, -279467102, i10);
    }

    public static byte[] setX(String str, int i10) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{str, Integer.valueOf(i10)}, 9548453, -9548448, i10);
    }

    public static byte[] setY(byte[] bArr, int i10, int i11) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 447768942, -447768939, i10);
    }

    public static String setOnFocusChangeListener(byte[] bArr) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{bArr}, 421028844, -421028844, (int) System.currentTimeMillis());
    }

    public static byte[] setCompoundDrawableTintBlendMode(byte[] bArr) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{bArr}, 1477946699, -1477946695, (int) System.currentTimeMillis());
    }
}
