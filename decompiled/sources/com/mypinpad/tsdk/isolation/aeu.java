package com.mypinpad.tsdk.isolation;

import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52564a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52565b = 1;

    public static String setCompoundDrawableTintBlendMode(int i10, int i11) {
        return (String) setX(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 1539419709, -1539419709, i10);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        if ((((~(i10 | i11)) | (~(i12 | i13))) * 433) + (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432)) == 1) {
            aeh aehVar = (aeh) objArr[0];
            int i14 = f52565b;
            int i15 = ((i14 | 73) << 1) - (i14 ^ 73);
            f52564a = i15 % 128;
            if (i15 % 2 == 0) {
                int iIntValue = ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 1270018882, -1270018871, System.identityHashCode(aehVar))).intValue();
                return (String) setX(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue())}, 1539419709, -1539419709, iIntValue);
            }
            int iIntValue2 = ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 1270018882, -1270018871, System.identityHashCode(aehVar))).intValue();
            throw null;
        }
        int iIntValue3 = ((Number) objArr[0]).intValue();
        int iIntValue4 = ((Number) objArr[1]).intValue();
        int i16 = f52564a;
        int i17 = i16 & 53;
        int i18 = i17 + ((i16 ^ 53) | i17);
        f52565b = i18 % 128;
        int i19 = i18 % 2;
        if (iIntValue3 == 64) {
            StringBuilder sb2 = new StringBuilder("[APPLICATION ");
            sb2.append(iIntValue4);
            sb2.append(Constant.BRACKET_CLOSE);
            String string = sb2.toString();
            int i20 = f52565b;
            int i21 = (i20 & (-28)) | ((~i20) & 27);
            int i22 = (i20 & 27) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f52564a = i23 % 128;
            if (i23 % 2 == 0) {
                return string;
            }
            throw null;
        }
        if (iIntValue3 == 128) {
            StringBuilder sb3 = new StringBuilder("[CONTEXT ");
            sb3.append(iIntValue4);
            sb3.append(Constant.BRACKET_CLOSE);
            String string2 = sb3.toString();
            int i24 = f52565b;
            int i25 = ((i24 & 19) - (~(-(-(i24 | 19))))) - 1;
            f52564a = i25 % 128;
            if (i25 % 2 == 0) {
                return string2;
            }
            throw null;
        }
        if (iIntValue3 != 192) {
            StringBuilder sb4 = new StringBuilder("[UNIVERSAL ");
            sb4.append(iIntValue4);
            sb4.append(Constant.BRACKET_CLOSE);
            String string3 = sb4.toString();
            int i26 = f52564a;
            int i27 = i26 & 85;
            int i28 = i27 + ((i26 ^ 85) | i27);
            f52565b = i28 % 128;
            int i29 = i28 % 2;
            return string3;
        }
        StringBuilder sb5 = new StringBuilder("[PRIVATE ");
        sb5.append(iIntValue4);
        sb5.append(Constant.BRACKET_CLOSE);
        String string4 = sb5.toString();
        int i30 = f52564a;
        int i31 = (i30 ^ 93) + ((i30 & 93) << 1);
        f52565b = i31 % 128;
        if (i31 % 2 != 0) {
            return string4;
        }
        int i32 = 14 / 0;
        return string4;
    }

    public static String setY(aeh aehVar) {
        return (String) setX(new Object[]{aehVar}, 533451139, -533451138, (int) System.currentTimeMillis());
    }
}
