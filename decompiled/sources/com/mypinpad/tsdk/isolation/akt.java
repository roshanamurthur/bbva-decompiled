package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public abstract class akt implements akz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53015a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53016b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int iIntValue;
        int i13;
        int i14 = 2;
        int i15 = 57;
        int i16 = 1;
        if ((((~(i10 | (~i12))) | (~i11)) * 305) + (((~(i10 | i11)) | (~(i10 | i12))) * 305) + (i11 * 306) + (i10 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS != 1) {
            akt aktVar = (akt) objArr[0];
            int i17 = f53015a;
            int i18 = i17 & 41;
            int i19 = ((i17 ^ 41) | i18) << 1;
            int i20 = -((i17 | 41) & (~i18));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f53016b = i21 % 128;
            int i22 = i21 % 2;
            int y7 = aktVar.setY();
            int i23 = f53015a;
            int i24 = i23 & 77;
            int i25 = -(-((i23 ^ 77) | i24));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f53016b = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 57 / 0;
            }
            return Integer.valueOf(y7);
        }
        akt aktVar2 = (akt) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        byte[] bArr2 = (byte[]) objArr[4];
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int i28 = f53016b;
        int i29 = i28 & 67;
        int i30 = (i28 | 67) & (~i29);
        int i31 = -(-(i29 << 1));
        int i32 = (i30 & i31) + (i30 | i31);
        f53015a = i32 % 128;
        if (i32 % 2 != 0) {
            iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{aktVar2}, -91479461, 91479461, System.identityHashCode(aktVar2))).intValue();
            i13 = 1;
        } else {
            iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{aktVar2}, -91479461, 91479461, System.identityHashCode(aktVar2))).intValue();
            i13 = 0;
        }
        int i33 = i13;
        int i34 = f53016b;
        int i35 = (i34 & 91) + (i34 | 91);
        f53015a = i35 % 128;
        int i36 = i35 % 2;
        int i37 = iIntValue2;
        while (i33 != iIntValue3) {
            int i38 = f53016b;
            int i39 = (((i38 | 57) << i16) - (~(-((i38 & (-58)) | ((~i38) & i15))))) - i16;
            f53015a = i39 % 128;
            int i40 = i39 % i14;
            int i41 = ~i13;
            int dividerPadding = aktVar2.setDividerPadding(bArr, i37, bArr2, (((~iIntValue4) & i13) | (iIntValue4 & i41)) + ((iIntValue4 & i13) << i16));
            int i42 = dividerPadding * 465;
            int i43 = -(~(i13 * (-463)));
            int i44 = ((i42 & i43) + (i43 | i42)) - 1;
            int i45 = ~iIntValue2;
            int i46 = i41 ^ i45;
            int i47 = i41 & i45;
            int i48 = ~((i46 ^ i47) | (i46 & i47));
            int i49 = (i13 | i41) & i41;
            int i50 = (i49 ^ dividerPadding) | (i49 & dividerPadding);
            int i51 = ~i50;
            int i52 = (i50 | i51) & i51;
            int i53 = (i48 ^ i52) | (i48 & i52);
            int i54 = (i45 | iIntValue2) & i45;
            int i55 = ~dividerPadding;
            akt aktVar3 = aktVar2;
            int i56 = (i54 & i55) | ((~i54) & dividerPadding);
            int i57 = i54 & dividerPadding;
            int i58 = ~((i56 ^ i57) | (i56 & i57));
            int i59 = i53 & i58;
            byte[] bArr3 = bArr;
            int i60 = (i58 | i53) & (~i59);
            int i61 = -(-(((i60 & i59) | (i60 ^ i59)) * 464));
            int i62 = ((~i61) & i44) | ((~i44) & i61);
            int i63 = -(-((i61 & i44) << 1));
            int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
            int i65 = iIntValue2 | i55;
            int i66 = ((~i49) & i65) | ((~i65) & i49);
            int i67 = i65 & i49;
            int i68 = -(-(((i67 & i66) | (i66 ^ i67)) * (-464)));
            int i69 = i64 & i68;
            int i70 = (i68 | i64) & (~i69);
            int i71 = -(-(i69 << 1));
            int i72 = (i70 & i71) + (i70 | i71);
            int i73 = ~((dividerPadding ^ iIntValue2) | (dividerPadding & iIntValue2));
            int i74 = i51 ^ i73;
            int i75 = i73 & i51;
            int i76 = -(-(((i75 & i74) | (i74 ^ i75)) * 464));
            int i77 = i72 & i76;
            i13 = i77 + ((i76 ^ i72) | i77);
            int i78 = -(-iIntValue);
            i37 = (((~i78) & i37) | ((~i37) & i78)) + ((i78 & i37) << 1);
            int i79 = i33 & 1;
            int i80 = -(-((i33 ^ 1) | i79));
            i33 = (i79 & i80) + (i79 | i80);
            i16 = 1;
            bArr = bArr3;
            aktVar2 = aktVar3;
            i14 = 2;
            i15 = 57;
        }
        int i81 = f53015a;
        int i82 = (i81 & 21) + (i81 | 21);
        f53016b = i82 % 128;
        if (i82 % 2 == 0) {
            int i83 = 54 / 0;
        }
        return Integer.valueOf(i13);
    }

    @Override // com.mypinpad.tsdk.isolation.akz
    public final int setX(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, akr {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11), bArr2, Integer.valueOf(i12)}, -10024040, 10024041, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.akz
    public final int setX() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -91479461, 91479461, System.identityHashCode(this))).intValue();
    }
}
