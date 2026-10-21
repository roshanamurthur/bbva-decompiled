package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61219a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61220b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ~i12;
        int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
        int i16 = ~i11;
        int i17 = (~(i12 | i16)) | i13;
        int i18 = ~(i14 | i10);
        int i19 = (((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15;
        if (i19 == 1) {
            t tVar = (t) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int iIntValue3 = ((Number) objArr[3]).intValue();
            byte bByteValue = ((Byte) objArr[4]).byteValue();
            int i20 = f61220b;
            int i21 = (i20 | 73) << 1;
            int i22 = -((73 & (~i20)) | (i20 & (-74)));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f61219a = i23 % 128;
            if (i23 % 2 == 0) {
                ((byte[]) setImageTintList.setX(new Object[]{tVar}, -1317873722, 1317873728, System.identityHashCode(tVar)))[iIntValue] = ((Byte) setLogo.setY(new Object[]{Byte.valueOf(((byte[]) setImageTintList.setX(new Object[]{tVar}, -1317873722, 1317873728, System.identityHashCode(tVar)))[iIntValue]), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Byte.valueOf(bByteValue)}, -883253918, 883253919, iIntValue2)).byteValue();
                return null;
            }
            ((byte[]) setImageTintList.setX(new Object[]{tVar}, -1317873722, 1317873728, System.identityHashCode(tVar)))[iIntValue] = ((Byte) setLogo.setY(new Object[]{Byte.valueOf(((byte[]) setImageTintList.setX(new Object[]{tVar}, -1317873722, 1317873728, System.identityHashCode(tVar)))[iIntValue]), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Byte.valueOf(bByteValue)}, -883253918, 883253919, iIntValue2)).byteValue();
            throw null;
        }
        if (i19 == 2) {
            t tVar2 = (t) objArr[0];
            int iIntValue4 = ((Number) objArr[1]).intValue();
            int iIntValue5 = ((Number) objArr[2]).intValue();
            int iIntValue6 = ((Number) objArr[3]).intValue();
            int i24 = f61220b;
            int i25 = i24 & 123;
            int i26 = i25 + ((i24 ^ 123) | i25);
            f61219a = i26 % 128;
            Object[] objArr2 = new Object[4];
            if (i26 % 2 != 0) {
                objArr2[0] = tVar2;
                objArr2[1] = Integer.valueOf(iIntValue4);
                objArr2[2] = Integer.valueOf(iIntValue5);
                objArr2[3] = Integer.valueOf(iIntValue6);
                ((Byte) setDividerPadding(objArr2, -1572344914, 1572344917, iIntValue4)).byteValue();
                throw null;
            }
            objArr2[0] = tVar2;
            objArr2[1] = Integer.valueOf(iIntValue4);
            objArr2[2] = Integer.valueOf(iIntValue5);
            objArr2[3] = Integer.valueOf(iIntValue6);
            byte bByteValue2 = ((Byte) setDividerPadding(objArr2, -1572344914, 1572344917, iIntValue4)).byteValue();
            int i27 = f61219a;
            int i28 = i27 & 99;
            int i29 = (i27 ^ 99) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f61220b = i30 % 128;
            if (i30 % 2 != 0) {
                return Byte.valueOf(bByteValue2);
            }
            throw null;
        }
        if (i19 != 3) {
            t tVar3 = (t) objArr[0];
            int iIntValue7 = ((Number) objArr[1]).intValue();
            int iIntValue8 = ((Number) objArr[2]).intValue();
            int iIntValue9 = ((Number) objArr[3]).intValue();
            byte bByteValue3 = ((Byte) objArr[4]).byteValue();
            int i31 = f61219a;
            int i32 = (i31 & 55) + (i31 | 55);
            f61220b = i32 % 128;
            if (i32 % 2 == 0) {
                setDividerPadding(new Object[]{tVar3, Integer.valueOf(iIntValue7), Integer.valueOf(iIntValue8), Integer.valueOf(iIntValue9), Byte.valueOf(bByteValue3)}, -1611011888, 1611011889, iIntValue7);
                int i33 = 13 / 0;
            } else {
                setDividerPadding(new Object[]{tVar3, Integer.valueOf(iIntValue7), Integer.valueOf(iIntValue8), Integer.valueOf(iIntValue9), Byte.valueOf(bByteValue3)}, -1611011888, 1611011889, iIntValue7);
            }
            int i34 = f61220b;
            int i35 = (i34 ^ 33) + ((i34 & 33) << 1);
            f61219a = i35 % 128;
            int i36 = i35 % 2;
            return null;
        }
        t tVar4 = (t) objArr[0];
        int iIntValue10 = ((Number) objArr[1]).intValue();
        int iIntValue11 = ((Number) objArr[2]).intValue();
        int iIntValue12 = ((Number) objArr[3]).intValue();
        int i37 = f61219a;
        int i38 = (i37 | 1) << 1;
        int i39 = -(i37 ^ 1);
        int i40 = (i38 & i39) + (i39 | i38);
        f61220b = i40 % 128;
        if (i40 % 2 == 0) {
            ((Byte) setLogo.setY(new Object[]{Byte.valueOf(((byte[]) setImageTintList.setX(new Object[]{tVar4}, -1317873722, 1317873728, System.identityHashCode(tVar4)))[iIntValue10]), Integer.valueOf(iIntValue11), Integer.valueOf(iIntValue12)}, -1812187572, 1812187578, iIntValue11)).byteValue();
            throw null;
        }
        byte bByteValue4 = ((Byte) setLogo.setY(new Object[]{Byte.valueOf(((byte[]) setImageTintList.setX(new Object[]{tVar4}, -1317873722, 1317873728, System.identityHashCode(tVar4)))[iIntValue10]), Integer.valueOf(iIntValue11), Integer.valueOf(iIntValue12)}, -1812187572, 1812187578, iIntValue11)).byteValue();
        int i41 = f61219a;
        int i42 = i41 & 91;
        int i43 = -(-((i41 ^ 91) | i42));
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        f61220b = i44 % 128;
        int i45 = i44 % 2;
        return Byte.valueOf(bByteValue4);
    }
}
