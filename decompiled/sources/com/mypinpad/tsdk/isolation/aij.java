package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52789a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52790b = 1;

    /* JADX WARN: Code duplicated, block: B:17:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:21:0x010c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0138  */
    /* JADX WARN: Code duplicated, block: B:25:0x0143  */
    /* JADX WARN: Code duplicated, block: B:32:0x0183  */
    /* JADX WARN: Code duplicated, block: B:33:0x0184  */
    /* JADX WARN: Code duplicated, block: B:37:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x01af  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x036d  */
    /* JADX WARN: Code duplicated, block: B:68:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0157 A[SYNTHETIC] */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        apk onFocusChangeListener;
        Random random;
        int onFocusChangeListener2;
        apk onFocusChangeListener3;
        int i15;
        apk apkVar;
        apk onFocusChangeListener4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = ~i12;
        int i21 = (((~((~i10) | i11)) | (~(i11 | i20))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i20 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559));
        apk compoundDrawableTintBlendMode = null;
        if (i21 == 1) {
            aph aphVar = (aph) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int length = bArr.length;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i22 = length * (-67);
            int i23 = (-69) & i22;
            int i24 = -(-((i22 ^ (-69)) | i23));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            int i26 = ~length;
            int i27 = ~iCurrentTimeMillis;
            int i28 = (i27 | iCurrentTimeMillis) & i27;
            int i29 = (i28 & i26) | (i26 ^ i28);
            int i30 = ~i29;
            int i31 = (i29 | i30) & i30;
            int i32 = ~(((-1) ^ length) | length);
            int i33 = (i31 & i32) | (i31 ^ i32);
            int i34 = length ^ iCurrentTimeMillis;
            int i35 = iCurrentTimeMillis & length;
            int i36 = ~((i35 & i34) | (i34 ^ i35));
            int i37 = i33 ^ i36;
            int i38 = i36 & i33;
            int i39 = (i25 - (~(-(~(-(-(((i38 & i37) | (i37 ^ i38)) * (-68)))))))) - 2;
            int i40 = i27 & i26;
            int i41 = ((~i27) & length) | i40;
            int i42 = length & i27;
            int i43 = (i42 & i41) | (i41 ^ i42);
            int i44 = ~i43;
            int i45 = ((i43 | i44) & i44) * (-68);
            int i46 = (i39 ^ i45) + ((i45 & i39) << 1);
            int i47 = -(-((~((i26 ^ i27) | i40)) * 68));
            apk onFocusChangeListener5 = aphVar.setOnFocusChangeListener(BigInteger.valueOf(bArr[((i46 & i47) - (~(i47 | i46))) - 1] & 1));
            apk onFocusChangeListener6 = aphVar.setOnFocusChangeListener(new BigInteger(1, bArr));
            if (!((apk) setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener6}, 1618052871, -1618052871, (int) System.currentTimeMillis())).equals((apk) aph.setX(new Object[]{aphVar}, -277774148, 277774152, System.identityHashCode(aphVar)))) {
                int i48 = f52789a;
                int i49 = i48 & 49;
                int i50 = (i48 ^ 49) | i49;
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                f52790b = i51 % 128;
                if (i51 % 2 == 0) {
                    onFocusChangeListener6.setDividerPadding();
                    throw null;
                }
                onFocusChangeListener6 = onFocusChangeListener6.setDividerPadding();
            }
            if (!onFocusChangeListener6.setOnDragListener()) {
                apk dividerPadding = (apk) setCompoundDrawableTintBlendMode(new Object[]{aphVar, onFocusChangeListener6.setX().setNavigationOnClickListener().setCompoundDrawableTintBlendMode((apk) aph.setX(new Object[]{aphVar}, -1036175453, 1036175463, System.identityHashCode(aphVar))).setOnFocusChangeListener((apk) aph.setX(new Object[]{aphVar}, -277774148, 277774152, System.identityHashCode(aphVar))).setOnFocusChangeListener(onFocusChangeListener6)}, -1174004474, 1174004476, (int) System.currentTimeMillis());
                if (dividerPadding != null) {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    if (!((apk) setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 1618052871, -1618052871, (int) System.currentTimeMillis())).equals(onFocusChangeListener5)) {
                        int i52 = f52790b;
                        int i53 = i52 & 1;
                        int i54 = (i52 ^ 1) | i53;
                        int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                        f52789a = i55 % 128;
                        if (i55 % 2 != 0) {
                            dividerPadding.setDividerPadding();
                            throw null;
                        }
                        dividerPadding = dividerPadding.setDividerPadding();
                    }
                    compoundDrawableTintBlendMode = onFocusChangeListener6.setCompoundDrawableTintBlendMode(dividerPadding);
                    int i56 = f52790b;
                    int i57 = i56 & 95;
                    i13 = ((i56 ^ 95) | i57) << 1;
                    i14 = (i56 | 95) & (~i57);
                }
                if (compoundDrawableTintBlendMode != null) {
                    throw new IllegalArgumentException("Invalid point compression");
                }
                apl aplVar = (apl) aph.setX(new Object[]{aphVar, onFocusChangeListener6.setCompoundDrawableTintBlendMode(), compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode()}, 408674527, -408674516, System.identityHashCode(aphVar));
                int i58 = f52789a;
                int i59 = (i58 & 110) + (i58 | 110);
                int i60 = (i59 ^ (-1)) + (i59 << 1);
                f52790b = i60 % 128;
                int i61 = i60 % 2;
                return aplVar;
            }
            int i62 = f52789a;
            int i63 = i62 | 93;
            int i64 = i63 << 1;
            int i65 = -((~(i62 & 93)) & i63);
            int i66 = (i64 & i65) + (i65 | i64);
            f52790b = i66 % 128;
            int i67 = i66 % 2;
            compoundDrawableTintBlendMode = ((apk) aph.setX(new Object[]{aphVar}, -1036175453, 1036175463, System.identityHashCode(aphVar))).setOnLongClickListener();
            int i68 = f52790b;
            i13 = i68 & 21;
            i14 = -(i68 | 21);
            int i69 = -i14;
            int i70 = (i13 ^ i69) + ((i69 & i13) << 1);
            f52789a = i70 % 128;
            int i71 = i70 % 2;
            if (compoundDrawableTintBlendMode != null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            apl aplVar2 = (apl) aph.setX(new Object[]{aphVar, onFocusChangeListener6.setCompoundDrawableTintBlendMode(), compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode()}, 408674527, -408674516, System.identityHashCode(aphVar));
            int i510 = f52789a;
            int i511 = (i510 & 110) + (i510 | 110);
            int i610 = (i511 ^ (-1)) + (i511 << 1);
            f52790b = i610 % 128;
            int i611 = i610 % 2;
            return aplVar2;
        }
        if (i21 != 2) {
            apk apkVar2 = (apk) objArr[0];
            int i72 = f52789a;
            int i73 = ((i72 ^ 83) | (i72 & 83)) << 1;
            int i74 = -((i72 & (-84)) | ((~i72) & 83));
            int i75 = ((i73 | i74) << 1) - (i73 ^ i74);
            f52790b = i75 % 128;
            int i76 = i75 % 2;
            int i77 = (i72 & (-6)) | ((~i72) & 5);
            int i78 = (i72 & 5) << 1;
            int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
            f52790b = i79 % 128;
            int i80 = i79 % 2;
            apk onFocusChangeListener7 = apkVar2;
            int i81 = 1;
            while (i81 < apkVar2.setOnFocusChangeListener()) {
                int i82 = f52789a;
                int i83 = ((i82 & (-114)) | ((~i82) & 113)) + ((i82 & 113) << 1);
                f52790b = i83 % 128;
                int i84 = i83 % 2;
                onFocusChangeListener7 = onFocusChangeListener7.setX().setOnFocusChangeListener(apkVar2);
                int i85 = i81 & 1;
                i81 = (((i81 | 1) & (~i85)) - (~(-(-(i85 << 1))))) - 1;
                int i86 = f52790b;
                int i87 = i86 & 29;
                int i88 = ((i86 | 29) & (~i87)) + (i87 << 1);
                f52789a = i88 % 128;
                int i89 = i88 % 2;
            }
            int i90 = f52789a;
            int i91 = (i90 ^ 84) + ((i90 & 84) << 1);
            int i92 = (i91 ^ (-1)) + (i91 << 1);
            f52790b = i92 % 128;
            int i93 = i92 % 2;
            return onFocusChangeListener7;
        }
        aph aphVar2 = (aph) objArr[0];
        apk apkVar3 = (apk) objArr[1];
        int i94 = f52789a + 39;
        f52790b = i94 % 128;
        if (i94 % 2 == 0) {
            int i95 = 29 / 0;
            if (!apkVar3.setOnDragListener()) {
                onFocusChangeListener = aphVar2.setOnFocusChangeListener(apj.setY);
                random = new Random();
                onFocusChangeListener2 = apkVar3.setOnFocusChangeListener();
                int i96 = f52790b;
                int i97 = i96 & 51;
                int i98 = (((i96 | 51) & (~i97)) - (~(i97 << 1))) - 1;
                f52789a = i98 % 128;
                int i99 = i98 % 2;
                do {
                    onFocusChangeListener3 = aphVar2.setOnFocusChangeListener(new BigInteger(onFocusChangeListener2, random));
                    int i100 = f52790b;
                    int i101 = (i100 & 43) + (i100 | 43);
                    f52789a = i101 % 128;
                    int i102 = i101 % 2;
                    i15 = 1;
                    apkVar = apkVar3;
                    onFocusChangeListener4 = onFocusChangeListener;
                    while (i15 <= onFocusChangeListener2 - 1) {
                        int i103 = f52790b;
                        int i104 = i103 & 33;
                        int i105 = (~i104) & (i103 | 33);
                        int i106 = -(-(i104 << 1));
                        int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
                        f52789a = i107 % 128;
                        i19 = i107 % 2;
                        apk x4 = apkVar.setX();
                        onFocusChangeListener4 = onFocusChangeListener4.setX().setOnFocusChangeListener(x4.setCompoundDrawableTintBlendMode(onFocusChangeListener3));
                        apk onFocusChangeListener8 = x4.setOnFocusChangeListener(apkVar3);
                        if (i19 != 0) {
                            i15 = ((i15 ^ 108) + ((i15 & 108) << 1)) - 71;
                        } else {
                            int i108 = i15 & 1;
                            int i109 = (i15 ^ 1) | i108;
                            i15 = (i108 & i109) + (i109 | i108);
                        }
                        apkVar = onFocusChangeListener8;
                    }
                    if (!apkVar.setOnDragListener()) {
                        int i110 = f52789a;
                        int i111 = ((i110 ^ 71) | (i110 & 71)) << 1;
                        int i112 = -(((~i110) & 71) | (i110 & (-72)));
                        int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                        int i114 = i113 % 128;
                        f52790b = i114;
                        int i115 = i113 % 2;
                        int i116 = i114 & 15;
                        int i117 = -(-(i114 | 15));
                        i16 = ((i116 | i117) << 1) - (i117 ^ i116);
                        f52789a = i16 % 128;
                        if (i16 % 2 != 0) {
                            throw null;
                        }
                    }
                } while (onFocusChangeListener4.setX().setOnFocusChangeListener(onFocusChangeListener4).setOnDragListener());
                int i118 = f52790b;
                i17 = ((i118 ^ 98) + ((i118 & 98) << 1)) - 1;
                int i119 = i17 % 128;
                f52789a = i119;
                if (i17 % 2 != 0) {
                    int i120 = 32 / 0;
                }
                i18 = i119 + 49;
                f52790b = i18 % 128;
                if (i18 % 2 != 0) {
                    throw null;
                }
                compoundDrawableTintBlendMode = onFocusChangeListener4;
            } else {
                int i121 = f52789a;
                int i122 = ((i121 | 111) << 1) - (i121 ^ 111);
                f52790b = i122 % 128;
                int i123 = i122 % 2;
                compoundDrawableTintBlendMode = apkVar3;
            }
        } else if (!apkVar3.setOnDragListener()) {
            onFocusChangeListener = aphVar2.setOnFocusChangeListener(apj.setY);
            random = new Random();
            onFocusChangeListener2 = apkVar3.setOnFocusChangeListener();
            int i910 = f52790b;
            int i911 = i910 & 51;
            int i912 = (((i910 | 51) & (~i911)) - (~(i911 << 1))) - 1;
            f52789a = i912 % 128;
            int i913 = i912 % 2;
            do {
                onFocusChangeListener3 = aphVar2.setOnFocusChangeListener(new BigInteger(onFocusChangeListener2, random));
                int i1010 = f52790b;
                int i1011 = (i1010 & 43) + (i1010 | 43);
                f52789a = i1011 % 128;
                int i1012 = i1011 % 2;
                i15 = 1;
                apkVar = apkVar3;
                onFocusChangeListener4 = onFocusChangeListener;
                while (i15 <= onFocusChangeListener2 - 1) {
                    int i1013 = f52790b;
                    int i1014 = i1013 & 33;
                    int i1015 = (~i1014) & (i1013 | 33);
                    int i1016 = -(-(i1014 << 1));
                    int i1017 = (i1015 ^ i1016) + ((i1015 & i1016) << 1);
                    f52789a = i1017 % 128;
                    i19 = i1017 % 2;
                    apk x6 = apkVar.setX();
                    onFocusChangeListener4 = onFocusChangeListener4.setX().setOnFocusChangeListener(x6.setCompoundDrawableTintBlendMode(onFocusChangeListener3));
                    apk onFocusChangeListener9 = x6.setOnFocusChangeListener(apkVar3);
                    if (i19 != 0) {
                        i15 = ((i15 ^ 108) + ((i15 & 108) << 1)) - 71;
                    } else {
                        int i1018 = i15 & 1;
                        int i1019 = (i15 ^ 1) | i1018;
                        i15 = (i1018 & i1019) + (i1019 | i1018);
                    }
                    apkVar = onFocusChangeListener9;
                }
                if (!apkVar.setOnDragListener()) {
                    int i1110 = f52789a;
                    int i1111 = ((i1110 ^ 71) | (i1110 & 71)) << 1;
                    int i1112 = -(((~i1110) & 71) | (i1110 & (-72)));
                    int i1113 = (i1111 ^ i1112) + ((i1112 & i1111) << 1);
                    int i1114 = i1113 % 128;
                    f52790b = i1114;
                    int i1115 = i1113 % 2;
                    int i1116 = i1114 & 15;
                    int i1117 = -(-(i1114 | 15));
                    i16 = ((i1116 | i1117) << 1) - (i1117 ^ i1116);
                    f52789a = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                }
            } while (onFocusChangeListener4.setX().setOnFocusChangeListener(onFocusChangeListener4).setOnDragListener());
            int i1118 = f52790b;
            i17 = ((i1118 ^ 98) + ((i1118 & 98) << 1)) - 1;
            int i1119 = i17 % 128;
            f52789a = i1119;
            if (i17 % 2 != 0) {
                int i124 = 32 / 0;
            }
            i18 = i1119 + 49;
            f52790b = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            compoundDrawableTintBlendMode = onFocusChangeListener4;
        } else {
            int i125 = f52789a;
            int i126 = ((i125 | 111) << 1) - (i125 ^ 111);
            f52790b = i126 % 128;
            int i127 = i126 % 2;
            compoundDrawableTintBlendMode = apkVar3;
        }
        return compoundDrawableTintBlendMode;
    }

    public static apl setX(aph aphVar, byte[] bArr) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{aphVar, bArr}, -834321393, 834321394, (int) System.currentTimeMillis());
    }
}
