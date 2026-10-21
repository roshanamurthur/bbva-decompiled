package com.mypinpad.tsdk.isolation;

import androidx.databinding.e;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public abstract class apl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final apk[] f53508a = new apk[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53509b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53510c = 1;
    protected Hashtable setCompoundDrawableTintBlendMode;
    protected aph setDividerPadding;
    protected apk setOnFocusChangeListener;
    protected apk setX;
    protected apk[] setY;

    public static class setCompoundDrawableTintBlendMode extends setX {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f53511f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f53512g = 1;

        public static /* synthetic */ apk i(Object[] objArr) {
            apk apkVar = (apk) objArr[0];
            int i10 = f53511f;
            int i11 = (i10 & (-112)) | ((~i10) & 111);
            int i12 = -(-((i10 & 111) << 1));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f53512g = i13 % 128;
            int i14 = i13 % 2;
            apk onFocusChangeListener = apkVar.setOnFocusChangeListener(apkVar);
            int i15 = f53512g;
            int i16 = (i15 ^ 67) + ((i15 & 67) << 1);
            f53511f = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 94 / 0;
            }
            return onFocusChangeListener;
        }

        public static /* synthetic */ apk j(Object[] objArr) {
            apk apkVar = (apk) objArr[0];
            int i10 = f53512g;
            int i11 = (i10 & 30) + (i10 | 30);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            f53511f = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            apk apkVar2 = (apk) setCompoundDrawableTintBlendMode(new Object[]{(apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar}, -1207261826, 1207261830, (int) System.currentTimeMillis())}, -1207261826, 1207261830, (int) System.currentTimeMillis());
            int i13 = f53511f;
            int i14 = i13 & 83;
            int i15 = (i13 | 83) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 & i16) + (i15 | i16);
            f53512g = i17 % 128;
            if (i17 % 2 != 0) {
                return apkVar2;
            }
            throw null;
        }

        public static /* synthetic */ apk k(Object[] objArr) {
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i10 = f53512g;
            int i11 = ((i10 | 33) << 1) - (i10 ^ 33);
            int i12 = i11 % 128;
            f53511f = i12;
            int i13 = i11 % 2;
            if (iIntValue == 1) {
                int i14 = (i12 ^ 72) + ((i12 & 72) << 1);
                int i15 = (i14 ^ (-1)) + (i14 << 1);
                f53512g = i15 % 128;
                int i16 = i15 % 2;
                if (4 == setcompounddrawabletintblendmode.setCompoundDrawableTintBlendMode()) {
                    int i17 = f53512g + 15;
                    f53511f = i17 % 128;
                    int i18 = i17 % 2;
                    apk apkVar = (apk) setCompoundDrawableTintBlendMode(new Object[]{setcompounddrawabletintblendmode}, 39733342, -39733334, System.identityHashCode(setcompounddrawabletintblendmode));
                    int i19 = f53512g;
                    int i20 = (((i19 | 19) << 1) - (~(-(((~i19) & 19) | (i19 & (-20)))))) - 1;
                    f53511f = i20 % 128;
                    if (i20 % 2 == 0) {
                        return apkVar;
                    }
                    throw null;
                }
            }
            apk y7 = super.setY(iIntValue);
            int i21 = f53511f;
            int i22 = i21 & 25;
            int i23 = i22 + ((i21 ^ 25) | i22);
            f53512g = i23 % 128;
            int i24 = i23 % 2;
            return y7;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:49:0x01ce  */
        public static apl l(Object[] objArr) {
            apk compoundDrawableTintBlendMode;
            apk x4;
            int i10;
            apk x6;
            int i11;
            int i12;
            apk apkVar;
            apk apkVar2;
            apk x7;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
            int i13 = f53511f;
            int i14 = ((i13 ^ 97) | (i13 & 97)) << 1;
            int i15 = -(((~i13) & 97) | (i13 & (-98)));
            int i16 = (i14 & i15) + (i15 | i14);
            f53512g = i16 % 128;
            if (i16 % 2 == 0) {
                setcompounddrawabletintblendmode.setIncludeFontPadding();
                throw null;
            }
            if (setcompounddrawabletintblendmode.setIncludeFontPadding()) {
                int i17 = f53511f;
                int i18 = i17 & 65;
                int i19 = (i18 - (~(-(-((i17 ^ 65) | i18))))) - 1;
                int i20 = i19 % 128;
                f53512g = i20;
                if (i19 % 2 == 0) {
                    int i21 = 96 / 0;
                }
                int i22 = ((i20 & (-126)) | ((~i20) & 125)) + ((i20 & 125) << 1);
                f53511f = i22 % 128;
                int i23 = i22 % 2;
                return setcompounddrawabletintblendmode;
            }
            aph x10 = setcompounddrawabletintblendmode.setX();
            apk apkVar3 = setcompounddrawabletintblendmode.setOnFocusChangeListener;
            if (apkVar3.setOnDragListener()) {
                int i24 = f53512g + 125;
                f53511f = i24 % 128;
                int i25 = i24 % 2;
                apl y7 = x10.setY();
                int i26 = f53511f;
                int i27 = (i26 & 66) + (i26 | 66);
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                f53512g = i28 % 128;
                int i29 = i28 % 2;
                return y7;
            }
            int layoutAnimation = x10.setLayoutAnimation();
            apk apkVar4 = setcompounddrawabletintblendmode.setX;
            if (layoutAnimation == 0) {
                apk dividerPadding = ((apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar4.setX()}, 1335823421, -1335823421, (int) System.currentTimeMillis())).setOnFocusChangeListener(setcompounddrawabletintblendmode.setX().getNavBarTitleString()).setDividerPadding((apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar3}, -1207261826, 1207261830, (int) System.currentTimeMillis()));
                apk y10 = dividerPadding.setX().setY((apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar4}, -1207261826, 1207261830, (int) System.currentTimeMillis()));
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = new setCompoundDrawableTintBlendMode(x10, y10, dividerPadding.setCompoundDrawableTintBlendMode(apkVar4.setY(y10)).setY(apkVar3));
                int i30 = f53511f;
                int i31 = ((i30 & 54) + (i30 | 54)) - 1;
                f53512g = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 51 / 0;
                }
                return setcompounddrawabletintblendmode2;
            }
            if (layoutAnimation == 1) {
                apk apkVar5 = setcompounddrawabletintblendmode.setY[0];
                boolean navBarTitleString = apkVar5.getNavBarTitleString();
                apk navBarTitleString2 = x10.getNavBarTitleString();
                if (!navBarTitleString2.setOnDragListener()) {
                    int i33 = f53512g;
                    int i34 = i33 ^ 39;
                    int i35 = (i33 & 39) << 1;
                    int i36 = (i34 & i35) + (i35 | i34);
                    int i37 = i36 % 128;
                    f53511f = i37;
                    int i38 = i36 % 2;
                    if (!navBarTitleString) {
                        int i39 = i37 + 112;
                        int i40 = (i39 ^ (-1)) + (i39 << 1);
                        f53512g = i40 % 128;
                        if (i40 % 2 == 0) {
                            navBarTitleString2.setCompoundDrawableTintBlendMode(apkVar5.setX());
                            throw null;
                        }
                        navBarTitleString2 = navBarTitleString2.setCompoundDrawableTintBlendMode(apkVar5.setX());
                        int i41 = f53512g;
                        int i42 = ((i41 ^ 53) | (i41 & 53)) << 1;
                        int i43 = -(((~i41) & 53) | (i41 & (-54)));
                        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                        f53511f = i44 % 128;
                        int i45 = i44 % 2;
                    }
                }
                apk onFocusChangeListener = navBarTitleString2.setOnFocusChangeListener((apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar4.setX()}, 1335823421, -1335823421, (int) System.currentTimeMillis()));
                if (navBarTitleString) {
                    int i46 = f53511f + 87;
                    int i47 = i46 % 128;
                    f53512g = i47;
                    int i48 = i46 % 2;
                    int i49 = i47 | 51;
                    int i50 = i49 << 1;
                    int i51 = -(i49 & (~(51 & i47)));
                    int i52 = (i50 & i51) + (i51 | i50);
                    f53511f = i52 % 128;
                    int i53 = i52 % 2;
                    compoundDrawableTintBlendMode = apkVar3;
                } else {
                    compoundDrawableTintBlendMode = apkVar3.setCompoundDrawableTintBlendMode(apkVar5);
                    int i54 = f53511f;
                    int i55 = i54 & 3;
                    int i56 = (i54 | 3) & (~i55);
                    int i57 = i55 << 1;
                    int i58 = (i56 & i57) + (i56 | i57);
                    f53512g = i58 % 128;
                    int i59 = i58 % 2;
                }
                if (!navBarTitleString) {
                    x4 = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(apkVar3);
                    int i60 = f53511f;
                    i10 = (i60 ^ 47) + ((i60 & 47) << 1);
                    f53512g = i10 % 128;
                } else {
                    int i61 = f53511f;
                    int i62 = (-2) - (((i61 ^ 64) + ((i61 & 64) << 1)) ^ (-1));
                    f53512g = i62 % 128;
                    int i63 = i62 % 2;
                    x4 = apkVar3.setX();
                    if (i63 == 0) {
                        int i64 = 78 / 0;
                    }
                    int i65 = f53512g;
                    int i66 = i65 & 71;
                    i10 = ((((i65 ^ 71) | i66) << 1) - (~(-((i65 | 71) & (~i66))))) - 1;
                    f53511f = i10 % 128;
                }
                int i67 = i10 % 2;
                apk apkVar6 = (apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar4.setCompoundDrawableTintBlendMode(x4)}, -1245090548, 1245090554, (int) System.currentTimeMillis());
                apk y11 = onFocusChangeListener.setX().setY((apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar6}, -1207261826, 1207261830, (int) System.currentTimeMillis()));
                apk apkVar7 = (apk) setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -1207261826, 1207261830, (int) System.currentTimeMillis());
                apk compoundDrawableTintBlendMode2 = y11.setCompoundDrawableTintBlendMode(apkVar7);
                apk apkVar8 = (apk) setCompoundDrawableTintBlendMode(new Object[]{x4}, -1207261826, 1207261830, (int) System.currentTimeMillis());
                apk y12 = apkVar6.setY(y11).setCompoundDrawableTintBlendMode(onFocusChangeListener).setY((apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar8.setX()}, -1207261826, 1207261830, (int) System.currentTimeMillis()));
                if (navBarTitleString) {
                    int i68 = f53512g;
                    int i69 = i68 & 115;
                    int i70 = ((i68 ^ 115) | i69) << 1;
                    int i71 = -((i68 | 115) & (~i69));
                    int i72 = (i70 & i71) + (i71 | i70);
                    f53511f = i72 % 128;
                    i11 = 1;
                    if (i72 % 2 != 0) {
                        throw null;
                    }
                    x6 = (apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar8}, -1207261826, 1207261830, (int) System.currentTimeMillis());
                } else {
                    x6 = apkVar7.setX();
                    int i73 = f53511f + 93;
                    f53512g = i73 % 128;
                    int i74 = i73 % 2;
                    i11 = 1;
                }
                Object[] objArr2 = new Object[i11];
                objArr2[0] = x6;
                apk[] apkVarArr = new apk[i11];
                apkVarArr[0] = ((apk) setCompoundDrawableTintBlendMode(objArr2, -1207261826, 1207261830, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode);
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = new setCompoundDrawableTintBlendMode(x10, compoundDrawableTintBlendMode2, y12, apkVarArr);
                int i75 = f53512g + 61;
                f53511f = i75 % 128;
                int i76 = i75 % 2;
                return setcompounddrawabletintblendmode3;
            }
            if (layoutAnimation != 2) {
                if (layoutAnimation != 4) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode(new Object[]{setcompounddrawabletintblendmode}, 1060191206, -1060191204, System.identityHashCode(setcompounddrawabletintblendmode));
                int i77 = f53511f;
                int i78 = ((i77 ^ 69) - (~((i77 & 69) << 1))) - 1;
                f53512g = i78 % 128;
                int i79 = i78 % 2;
                return setcompounddrawabletintblendmode4;
            }
            apk apkVar9 = setcompounddrawabletintblendmode.setY[0];
            boolean navBarTitleString3 = apkVar9.getNavBarTitleString();
            apk x11 = apkVar3.setX();
            apk x12 = x11.setX();
            apk navBarTitleString4 = x10.getNavBarTitleString();
            apk y13 = navBarTitleString4.setY();
            if (y13.setCompoundDrawableTintBlendMode().equals(BigInteger.valueOf(3L))) {
                int i80 = f53512g;
                int i81 = ((i80 ^ 66) + ((i80 & 66) << 1)) - 1;
                f53511f = i81 % 128;
                int i82 = i81 % 2;
                if (!navBarTitleString3) {
                    x7 = apkVar9.setX();
                } else {
                    int i83 = i80 & 67;
                    int i84 = i83 + ((i80 ^ 67) | i83);
                    f53511f = i84 % 128;
                    int i85 = i84 % 2;
                    x7 = apkVar9;
                }
                apkVar = (apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar4.setOnFocusChangeListener(x7).setCompoundDrawableTintBlendMode(apkVar4.setY(x7))}, 1335823421, -1335823421, (int) System.currentTimeMillis());
                apkVar2 = (apk) setCompoundDrawableTintBlendMode(new Object[]{x11.setCompoundDrawableTintBlendMode(apkVar4)}, -1245090548, 1245090554, (int) System.currentTimeMillis());
                int i86 = f53511f;
                int i87 = (i86 & (-8)) | ((~i86) & 7);
                int i88 = (i86 & 7) << 1;
                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                f53512g = i89 % 128;
                int i90 = i89 % 2;
            } else {
                apk y14 = (apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar4.setX()}, 1335823421, -1335823421, (int) System.currentTimeMillis());
                if (navBarTitleString3) {
                    int i91 = f53512g;
                    int i92 = (((i91 | 54) << 1) - (i91 ^ 54)) - 1;
                    f53511f = i92 % 128;
                    int i93 = i92 % 2;
                    y14 = y14.setOnFocusChangeListener(navBarTitleString4);
                    if (i93 != 0) {
                        int i94 = 19 / 0;
                    }
                } else if (!navBarTitleString4.setOnDragListener()) {
                    int i95 = f53512g;
                    int i96 = (i95 & 115) + (i95 | 115);
                    f53511f = i96 % 128;
                    int i97 = i96 % 2;
                    apk x13 = apkVar9.setX().setX();
                    if (i97 != 0) {
                        int i98 = 13 / 0;
                        if (y13.setLayoutAnimation() < navBarTitleString4.setLayoutAnimation()) {
                            y14 = y14.setY(x13.setCompoundDrawableTintBlendMode(y13));
                            int i99 = f53511f;
                            i12 = (i99 & 93) + (i99 | 93);
                            f53512g = i12 % 128;
                        } else {
                            y14 = y14.setOnFocusChangeListener(x13.setCompoundDrawableTintBlendMode(navBarTitleString4));
                            int i100 = f53512g;
                            int i101 = i100 & 33;
                            i12 = ((((i100 ^ 33) | i101) << 1) - (~(-((i100 | 33) & (~i101))))) - 1;
                            f53511f = i12 % 128;
                        }
                    } else if (y13.setLayoutAnimation() < navBarTitleString4.setLayoutAnimation()) {
                        y14 = y14.setY(x13.setCompoundDrawableTintBlendMode(y13));
                        int i910 = f53511f;
                        i12 = (i910 & 93) + (i910 | 93);
                        f53512g = i12 % 128;
                    } else {
                        y14 = y14.setOnFocusChangeListener(x13.setCompoundDrawableTintBlendMode(navBarTitleString4));
                        int i102 = f53512g;
                        int i103 = i102 & 33;
                        i12 = ((((i102 ^ 33) | i103) << 1) - (~(-((i102 | 33) & (~i103))))) - 1;
                        f53511f = i12 % 128;
                    }
                    int i104 = i12 % 2;
                }
                apkVar = y14;
                apkVar2 = (apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar4.setCompoundDrawableTintBlendMode(x11)}, -1245090548, 1245090554, (int) System.currentTimeMillis());
                int i105 = f53512g;
                int i106 = i105 ^ 27;
                int i107 = ((i105 & 27) | i106) << 1;
                int i108 = -i106;
                int i109 = (i107 ^ i108) + ((i107 & i108) << 1);
                f53511f = i109 % 128;
                int i110 = i109 % 2;
            }
            apk y15 = apkVar.setX().setY((apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar2}, -1207261826, 1207261830, (int) System.currentTimeMillis()));
            apk y16 = apkVar2.setY(y15).setCompoundDrawableTintBlendMode(apkVar).setY((apk) setCompoundDrawableTintBlendMode(new Object[]{setcompounddrawabletintblendmode, x12}, 857533871, -857533866, System.identityHashCode(setcompounddrawabletintblendmode)));
            apk apkVar10 = (apk) setCompoundDrawableTintBlendMode(new Object[]{apkVar3}, -1207261826, 1207261830, (int) System.currentTimeMillis());
            if (!navBarTitleString3) {
                int i111 = f53512g;
                int i112 = i111 & 5;
                int i113 = (((i111 ^ 5) | i112) << 1) - ((i111 | 5) & (~i112));
                f53511f = i113 % 128;
                int i114 = i113 % 2;
                apk compoundDrawableTintBlendMode3 = apkVar10.setCompoundDrawableTintBlendMode(apkVar9);
                if (i114 != 0) {
                    int i115 = 43 / 0;
                }
                apkVar10 = compoundDrawableTintBlendMode3;
                int i116 = f53511f + 59;
                f53512g = i116 % 128;
                int i117 = i116 % 2;
            }
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = new setCompoundDrawableTintBlendMode(x10, y15, y16, new apk[]{apkVar10});
            int i118 = f53511f;
            int i119 = i118 ^ 109;
            int i120 = (i118 & 109) << 1;
            int i121 = (i119 & i120) + (i120 | i119);
            f53512g = i121 % 128;
            int i122 = i121 % 2;
            return setcompounddrawabletintblendmode5;
        }

        /* JADX WARN: Code duplicated, block: B:103:0x037d  */
        /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x0192 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:52:0x0194  */
        /* JADX WARN: Code duplicated, block: B:54:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:57:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:60:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:61:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:64:0x0203  */
        /* JADX WARN: Code duplicated, block: B:66:0x0212  */
        /* JADX WARN: Code duplicated, block: B:68:0x0218  */
        /* JADX WARN: Code duplicated, block: B:70:0x0236  */
        /* JADX WARN: Code duplicated, block: B:71:0x023c  */
        /* JADX WARN: Code duplicated, block: B:74:0x0255  */
        /* JADX WARN: Code duplicated, block: B:75:0x0256  */
        /* JADX WARN: Code duplicated, block: B:77:0x025a  */
        /* JADX WARN: Code duplicated, block: B:79:0x0299  */
        /* JADX WARN: Code duplicated, block: B:81:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:83:0x02ab  */
        /* JADX WARN: Code duplicated, block: B:85:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:88:0x02b5  */
        /* JADX WARN: Code duplicated, block: B:89:0x02b7  */
        /* JADX WARN: Code duplicated, block: B:91:0x02ca  */
        /* JADX WARN: Code duplicated, block: B:93:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:94:0x02e9  */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
        
            if (r1 != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
        
            if (r2.setOnDragListener() != true) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
        
            r0 = r13.setY();
            r1 = com.mypinpad.tsdk.i.apl.setCompoundDrawableTintBlendMode.f53512g;
            r2 = r1 & 63;
            r2 = (r2 - (~((r1 ^ 63) | r2))) - 1;
            com.mypinpad.tsdk.i.apl.setCompoundDrawableTintBlendMode.f53511f = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
        
            r1 = com.mypinpad.tsdk.i.apl.setCompoundDrawableTintBlendMode.f53511f;
            r3 = r1 & 13;
            r2 = ((((r1 ^ 13) | r3) << 1) - (~(-((r1 | 13) & (~r3))))) - 1;
            com.mypinpad.tsdk.i.apl.setCompoundDrawableTintBlendMode.f53512g = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x014d, code lost:
        
            if ((r2 % 2) == 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0151, code lost:
        
            r0.setOnEditorActionListener();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0154, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r21, int r22, int r23, int r24) {
            /*
                Method dump skipped, instruction units count: 2382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.apl.setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final apl UiMessageCallbackKtWhenMappings() {
            return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 474703604, -474703597, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final apl setOnEditorActionListener() {
            return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 1130382722, -1130382719, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final apl setOnFocusChangeListener(apl aplVar) {
            return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, aplVar}, 1674701739, -1674701729, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final apk setY(int i10) {
            return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -1567224067, 1567224068, i10);
        }
    }

    public static class setOnFocusChangeListener extends setY {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f53513f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f53514g = 1;

        /* JADX WARN: Code restructure failed: missing block: B:86:0x0406, code lost:
        
            if (r0 != false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0409, code lost:
        
            if (r0 != false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x040f, code lost:
        
            return r1.setOnEditorActionListener();
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0410, code lost:
        
            r0 = r5.setY();
            r3 = java.lang.System.identityHashCode(r1);
            r4 = ~r3;
            r6 = 1951627346 & r4;
            r7 = (~r6) & (1951627346 | r4);
            r6 = ~((r6 & r7) | (r7 ^ r6));
            r8 = 1766704565 & r6;
            r6 = (r6 | 1766704565) & (~r8);
            r6 = -(~(-(-(((r6 & r8) | (r6 ^ r8)) * (-865)))));
            r9 = (((-467780230) & r6) + (r6 | (-467780230))) - 1;
            r8 = (-1951627347) & r4;
            r5 = (1951627346 & r3) | r8;
            r3 = r3 & (-1951627347);
            r3 = (~((r3 & r5) | (r5 ^ r3))) * 865;
            r5 = r9 & r3;
            r3 = (r3 | r9) & (~r5);
            r5 = -(-(r5 << 1));
            r9 = (r3 ^ r5) + ((r3 & r5) << 1);
            r3 = ((~r4) & 1766704565) | ((-1766704566) & r4);
            r5 = 1766704565 & r4;
            r3 = ~((r3 & r5) | (r3 ^ r5));
            r4 = ~(((r4 | (-1951627347)) & (~r8)) | r8);
            r5 = r3 & r4;
            r3 = (r3 | r4) & (~r5);
            r3 = ((r3 & r5) | (r3 ^ r5)) * 865;
            r5 = r9 & r3;
            r4 = ((r9 ^ r3) | r5) << 1;
            r3 = -((r3 | r9) & (~r5));
            r5 = ((r4 | r3) << 1) - (r3 ^ r4);
            r1 = java.lang.System.identityHashCode(r1);
            r3 = ~r1;
            r4 = ~((947994191 & r3) | (r3 ^ 947994191));
            r7 = 37519648 & r4;
            r4 = (r4 | 37519648) & (~r7);
            r6 = (-1123744732) - (~(-(-(((r4 & r7) | (r4 ^ r7)) * (-108)))));
            r7 = ((-574402855) & r3) | (r1 & 574402854);
            r4 = (-574402855) & r1;
            r4 = ~((r4 & r7) | (r7 ^ r4));
            r7 = ((-411110986) & r4) | ((~r4) & 411110985);
            r4 = r4 & 411110985;
            r4 = (r4 & r7) | (r7 ^ r4);
            r7 = r3 & 574402854;
            r3 = ~(((r3 | 574402854) & (~r7)) | r7);
            r7 = r4 & r3;
            r3 = (r3 | r4) & (~r7);
            r3 = ((r3 & r7) | (r3 ^ r7)) * 54;
            r4 = r6 & r3;
            r3 = -(-(r3 | r6));
            r6 = (r4 & r3) + (r3 | r4);
            r3 = r1 ^ 411110985;
            r1 = r1 & 411110985;
            r1 = ((r1 & r3) | (r3 ^ r1)) * 54;
            r3 = r6 ^ r1;
            r1 = (r1 & r6) << 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x04f9, code lost:
        
            if (r5 > ((r3 ^ r1) + ((r1 & r3) << 1))) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x04fb, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x04fd, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.mypinpad.tsdk.isolation.apl i(java.lang.Object[] r18) {
            /*
                Method dump skipped, instruction units count: 1854
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.apl.setOnFocusChangeListener.i(java.lang.Object[]):com.mypinpad.tsdk.i.apl");
        }

        /* JADX WARN: Code duplicated, block: B:109:0x048c  */
        /* JADX WARN: Code duplicated, block: B:111:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:113:0x04ac  */
        /* JADX WARN: Code duplicated, block: B:115:0x04b2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:116:0x04b4  */
        /* JADX WARN: Code duplicated, block: B:118:0x04b7 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:119:0x04b9  */
        /* JADX WARN: Code duplicated, block: B:120:0x04e4  */
        /* JADX WARN: Code duplicated, block: B:122:0x04ec  */
        /* JADX WARN: Code duplicated, block: B:124:0x050a  */
        /* JADX WARN: Code duplicated, block: B:125:0x0535  */
        /* JADX WARN: Code duplicated, block: B:126:0x0550  */
        /* JADX WARN: Code duplicated, block: B:129:0x0577  */
        public static Object setY(Object[] objArr, int i10, int i11, int i12) {
            apk dividerPadding;
            Object obj;
            apk apkVar;
            int i13;
            int compoundDrawableTintBlendMode;
            int i14;
            setOnFocusChangeListener setonfocuschangelistener;
            setOnFocusChangeListener setonfocuschangelistener2;
            int i15;
            apk compoundDrawableTintBlendMode2;
            int i16;
            apk compoundDrawableTintBlendMode3;
            apk x4;
            apk compoundDrawableTintBlendMode4;
            apk compoundDrawableTintBlendMode5;
            apk onFocusChangeListener;
            int i17;
            apk y7;
            int i18;
            int i19;
            int i20 = ~i10;
            int i21 = ~(i20 | i11);
            int i22 = ~i11;
            int i23 = ((i12 | i21 | (~(i22 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
            int i24 = ~i12;
            int i25 = (((~(i10 | i24 | i11)) | (~(i20 | i22 | i24))) * 614) + (((~(i20 | i24)) | i21 | (~(i24 | i11))) * (-1228)) + i23;
            if (i25 == 1) {
                setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                int i26 = f53513f + 115;
                f53514g = i26 % 128;
                if (i26 % 2 == 0) {
                    setonfocuschangelistener3.setCompoundDrawableTintBlendMode();
                    throw null;
                }
                int compoundDrawableTintBlendMode6 = setonfocuschangelistener3.setCompoundDrawableTintBlendMode();
                if (compoundDrawableTintBlendMode6 != 5 && compoundDrawableTintBlendMode6 != 6) {
                    apk apkVar2 = setonfocuschangelistener3.setOnFocusChangeListener;
                    int i27 = f53513f;
                    int i28 = ((i27 ^ 100) + ((i27 & 100) << 1)) - 1;
                    f53514g = i28 % 128;
                    int i29 = i28 % 2;
                    return apkVar2;
                }
                apk apkVar3 = setonfocuschangelistener3.setX;
                apk apkVar4 = setonfocuschangelistener3.setOnFocusChangeListener;
                if (!setonfocuschangelistener3.setIncludeFontPadding()) {
                    int i30 = f53514g;
                    int i31 = i30 & 57;
                    int i32 = ((i30 ^ 57) | i31) << 1;
                    int i33 = -((i30 | 57) & (~i31));
                    int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                    f53513f = i34 % 128;
                    int i35 = i34 % 2;
                    if (!apkVar3.setOnDragListener()) {
                        apk compoundDrawableTintBlendMode7 = apkVar4.setOnFocusChangeListener(apkVar3).setCompoundDrawableTintBlendMode(apkVar3);
                        if (6 == compoundDrawableTintBlendMode6) {
                            int i36 = f53514g;
                            int i37 = i36 & 69;
                            int i38 = -(-(i36 | 69));
                            int i39 = (i37 & i38) + (i38 | i37);
                            f53513f = i39 % 128;
                            int i40 = i39 % 2;
                            apk apkVar5 = setonfocuschangelistener3.setY[0];
                            if (!apkVar5.getNavBarTitleString()) {
                                int i41 = f53514g;
                                int i42 = i41 & 45;
                                int i43 = i42 + ((i41 ^ 45) | i42);
                                f53513f = i43 % 128;
                                if (i43 % 2 != 0) {
                                    dividerPadding = compoundDrawableTintBlendMode7;
                                    dividerPadding = compoundDrawableTintBlendMode7;
                                    compoundDrawableTintBlendMode7.setDividerPadding(apkVar5);
                                    throw null;
                                }
                                dividerPadding = compoundDrawableTintBlendMode7;
                                dividerPadding = compoundDrawableTintBlendMode7;
                                dividerPadding = compoundDrawableTintBlendMode7.setDividerPadding(apkVar5);
                            }
                        }
                        dividerPadding = compoundDrawableTintBlendMode7;
                        dividerPadding = compoundDrawableTintBlendMode7;
                        dividerPadding = compoundDrawableTintBlendMode7;
                        int i44 = f53513f;
                        int i45 = i44 & 35;
                        int i46 = -(-(i44 | 35));
                        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                        f53514g = i47 % 128;
                        int i48 = i47 % 2;
                        obj = dividerPadding;
                    }
                }
                int i49 = f53514g;
                int i50 = ((((i49 ^ 79) | (i49 & 79)) << 1) - (~(-(((~i49) & 79) | (i49 & (-80)))))) - 1;
                f53513f = i50 % 128;
                int i51 = i50 % 2;
                return apkVar4;
            }
            if (i25 == 2) {
                setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) objArr[0];
                int i52 = f53514g + 125;
                f53513f = i52 % 128;
                if (i52 % 2 == 0) {
                    if (setonfocuschangelistener4.setIncludeFontPadding()) {
                        int i53 = f53514g;
                        int i54 = i53 & 83;
                        int i55 = (((i53 ^ 83) | i54) << 1) - ((i53 | 83) & (~i54));
                        f53513f = i55 % 128;
                        int i56 = i55 % 2;
                    } else {
                        apkVar = setonfocuschangelistener4.setX;
                        if (!apkVar.setOnDragListener()) {
                            compoundDrawableTintBlendMode = setonfocuschangelistener4.setCompoundDrawableTintBlendMode();
                            if (compoundDrawableTintBlendMode != 0) {
                                setOnFocusChangeListener setonfocuschangelistener5 = new setOnFocusChangeListener(setonfocuschangelistener4.setDividerPadding, apkVar, setonfocuschangelistener4.setOnFocusChangeListener.setOnFocusChangeListener(apkVar));
                                int i57 = f53514g;
                                i14 = ((i57 | 117) << 1) - (i57 ^ 117);
                                f53513f = i14 % 128;
                                setonfocuschangelistener = setonfocuschangelistener5;
                            } else {
                                if (compoundDrawableTintBlendMode != 1) {
                                    setOnFocusChangeListener setonfocuschangelistener6 = new setOnFocusChangeListener(setonfocuschangelistener4.setDividerPadding, apkVar, setonfocuschangelistener4.setOnFocusChangeListener.setOnFocusChangeListener(apkVar), new apk[]{setonfocuschangelistener4.setY[0]});
                                    int i58 = f53514g;
                                    int i59 = i58 & 95;
                                    int i60 = ((i58 | 95) & (~i59)) + (i59 << 1);
                                    f53513f = i60 % 128;
                                    int i61 = i60 % 2;
                                    return setonfocuschangelistener6;
                                }
                                if (compoundDrawableTintBlendMode != 5) {
                                    if (compoundDrawableTintBlendMode == 6) {
                                        throw new IllegalStateException("unsupported coordinate system");
                                    }
                                    apk apkVar6 = setonfocuschangelistener4.setOnFocusChangeListener;
                                    apk apkVar7 = setonfocuschangelistener4.setY[0];
                                    setOnFocusChangeListener setonfocuschangelistener7 = new setOnFocusChangeListener(setonfocuschangelistener4.setDividerPadding, apkVar, apkVar6.setOnFocusChangeListener(apkVar7), new apk[]{apkVar7});
                                    int i62 = f53514g;
                                    int i63 = i62 ^ 17;
                                    int i64 = (i62 & 17) << 1;
                                    int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                                    f53513f = i65 % 128;
                                    int i66 = i65 % 2;
                                    return setonfocuschangelistener7;
                                }
                                setOnFocusChangeListener setonfocuschangelistener8 = new setOnFocusChangeListener(setonfocuschangelistener4.setDividerPadding, apkVar, setonfocuschangelistener4.setOnFocusChangeListener.setDividerPadding());
                                int i67 = f53513f;
                                i14 = (i67 ^ 31) + ((i67 & 31) << 1);
                                f53514g = i14 % 128;
                                setonfocuschangelistener = setonfocuschangelistener8;
                            }
                            int i68 = i14 % 2;
                            obj = setonfocuschangelistener;
                        } else {
                            int i69 = f53514g;
                            int i70 = ((i69 & 124) + (i69 | 124)) - 1;
                            f53513f = i70 % 128;
                            int i71 = i70 % 2;
                            int i72 = i69 & 75;
                            i13 = ((((i69 ^ 75) | i72) << 1) - (~(-((i69 | 75) & (~i72))))) - 1;
                            f53513f = i13 % 128;
                            if (i13 % 2 != 0) {
                                throw null;
                            }
                        }
                    }
                    return setonfocuschangelistener4;
                }
                int i73 = 85 / 0;
                if (setonfocuschangelistener4.setIncludeFontPadding()) {
                    int i510 = f53514g;
                    int i511 = i510 & 83;
                    int i512 = (((i510 ^ 83) | i511) << 1) - ((i510 | 83) & (~i511));
                    f53513f = i512 % 128;
                    int i513 = i512 % 2;
                } else {
                    apkVar = setonfocuschangelistener4.setX;
                    if (!apkVar.setOnDragListener()) {
                        compoundDrawableTintBlendMode = setonfocuschangelistener4.setCompoundDrawableTintBlendMode();
                        if (compoundDrawableTintBlendMode != 0) {
                            setOnFocusChangeListener setonfocuschangelistener9 = new setOnFocusChangeListener(setonfocuschangelistener4.setDividerPadding, apkVar, setonfocuschangelistener4.setOnFocusChangeListener.setOnFocusChangeListener(apkVar));
                            int i514 = f53514g;
                            i14 = ((i514 | 117) << 1) - (i514 ^ 117);
                            f53513f = i14 % 128;
                            setonfocuschangelistener = setonfocuschangelistener9;
                        } else {
                            if (compoundDrawableTintBlendMode != 1) {
                                setOnFocusChangeListener setonfocuschangelistener10 = new setOnFocusChangeListener(setonfocuschangelistener4.setDividerPadding, apkVar, setonfocuschangelistener4.setOnFocusChangeListener.setOnFocusChangeListener(apkVar), new apk[]{setonfocuschangelistener4.setY[0]});
                                int i515 = f53514g;
                                int i516 = i515 & 95;
                                int i610 = ((i515 | 95) & (~i516)) + (i516 << 1);
                                f53513f = i610 % 128;
                                int i611 = i610 % 2;
                                return setonfocuschangelistener10;
                            }
                            if (compoundDrawableTintBlendMode != 5) {
                                if (compoundDrawableTintBlendMode == 6) {
                                    throw new IllegalStateException("unsupported coordinate system");
                                }
                                apk apkVar8 = setonfocuschangelistener4.setOnFocusChangeListener;
                                apk apkVar9 = setonfocuschangelistener4.setY[0];
                                setOnFocusChangeListener setonfocuschangelistener11 = new setOnFocusChangeListener(setonfocuschangelistener4.setDividerPadding, apkVar, apkVar8.setOnFocusChangeListener(apkVar9), new apk[]{apkVar9});
                                int i612 = f53514g;
                                int i613 = i612 ^ 17;
                                int i614 = (i612 & 17) << 1;
                                int i615 = ((i613 | i614) << 1) - (i614 ^ i613);
                                f53513f = i615 % 128;
                                int i616 = i615 % 2;
                                return setonfocuschangelistener11;
                            }
                            setOnFocusChangeListener setonfocuschangelistener12 = new setOnFocusChangeListener(setonfocuschangelistener4.setDividerPadding, apkVar, setonfocuschangelistener4.setOnFocusChangeListener.setDividerPadding());
                            int i617 = f53513f;
                            i14 = (i617 ^ 31) + ((i617 & 31) << 1);
                            f53514g = i14 % 128;
                            setonfocuschangelistener = setonfocuschangelistener12;
                        }
                        int i618 = i14 % 2;
                        obj = setonfocuschangelistener;
                    } else {
                        int i619 = f53514g;
                        int i74 = ((i619 & 124) + (i619 | 124)) - 1;
                        f53513f = i74 % 128;
                        int i75 = i74 % 2;
                        int i76 = i619 & 75;
                        i13 = ((((i619 ^ 75) | i76) << 1) - (~(-((i619 | 75) & (~i76))))) - 1;
                        f53513f = i13 % 128;
                        if (i13 % 2 != 0) {
                            throw null;
                        }
                    }
                }
                return setonfocuschangelistener4;
            }
            if (i25 == 3) {
                return i(objArr);
            }
            setOnFocusChangeListener setonfocuschangelistener13 = (setOnFocusChangeListener) objArr[0];
            int i77 = f53513f;
            int i78 = i77 & 89;
            int i79 = -(-((i77 ^ 89) | i78));
            int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
            f53514g = i80 % 128;
            int i81 = i80 % 2;
            if (setonfocuschangelistener13.setIncludeFontPadding()) {
                int i82 = f53513f;
                int i83 = i82 + 95;
                f53514g = i83 % 128;
                if (i83 % 2 == 0) {
                    throw null;
                }
                int i84 = ((i82 & 41) - (~(-(-(i82 | 41))))) - 1;
                f53514g = i84 % 128;
                if (i84 % 2 != 0) {
                    return setonfocuschangelistener13;
                }
                throw null;
            }
            aph x6 = setonfocuschangelistener13.setX();
            apk compoundDrawableTintBlendMode8 = setonfocuschangelistener13.setX;
            if (compoundDrawableTintBlendMode8.setOnDragListener()) {
                int i85 = f53514g;
                int i86 = i85 & 17;
                int i87 = ((i85 ^ 17) | i86) << 1;
                int i88 = -((i85 | 17) & (~i86));
                int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                f53513f = i89 % 128;
                int i90 = i89 % 2;
                apl y10 = x6.setY();
                int i91 = f53513f + 122;
                int i92 = (i91 ^ (-1)) + (i91 << 1);
                f53514g = i92 % 128;
                if (i92 % 2 != 0) {
                    return y10;
                }
                throw null;
            }
            int layoutAnimation = x6.setLayoutAnimation();
            if (layoutAnimation == 0) {
                apk onFocusChangeListener2 = setonfocuschangelistener13.setOnFocusChangeListener.setDividerPadding(compoundDrawableTintBlendMode8).setOnFocusChangeListener(compoundDrawableTintBlendMode8);
                apk onFocusChangeListener3 = onFocusChangeListener2.setX().setOnFocusChangeListener(onFocusChangeListener2).setOnFocusChangeListener(x6.getNavBarTitleString());
                setonfocuschangelistener2 = new setOnFocusChangeListener(x6, onFocusChangeListener3, compoundDrawableTintBlendMode8.setY(onFocusChangeListener3, onFocusChangeListener2.setDividerPadding()));
                int i93 = f53513f;
                int i94 = ((i93 | 110) << 1) - (i93 ^ 110);
                i15 = (i94 ^ (-1)) + (i94 << 1);
            } else if (layoutAnimation == 1) {
                apk compoundDrawableTintBlendMode9 = setonfocuschangelistener13.setOnFocusChangeListener;
                apk apkVar10 = setonfocuschangelistener13.setY[0];
                boolean navBarTitleString = apkVar10.getNavBarTitleString();
                if (navBarTitleString) {
                    int i95 = f53513f;
                    int i96 = (((i95 | 46) << 1) - (i95 ^ 46)) - 1;
                    f53514g = i96 % 128;
                    if (i96 % 2 == 0) {
                        throw null;
                    }
                    int i97 = (i95 ^ 73) + ((i95 & 73) << 1);
                    f53514g = i97 % 128;
                    int i98 = i97 % 2;
                    compoundDrawableTintBlendMode2 = compoundDrawableTintBlendMode8;
                    i16 = 1;
                } else {
                    compoundDrawableTintBlendMode2 = compoundDrawableTintBlendMode8.setCompoundDrawableTintBlendMode(apkVar10);
                    int i99 = f53514g;
                    int i100 = i99 & 67;
                    i16 = 1;
                    int i101 = (((i99 | 67) & (~i100)) - (~(-(-(i100 << 1))))) - 1;
                    f53513f = i101 % 128;
                    int i102 = i101 % 2;
                }
                if (navBarTitleString != i16) {
                    compoundDrawableTintBlendMode9 = compoundDrawableTintBlendMode9.setCompoundDrawableTintBlendMode(apkVar10);
                    int i103 = f53514g;
                    int i104 = i103 & 111;
                    int i105 = (i103 ^ 111) | i104;
                    int i106 = (i104 ^ i105) + ((i105 & i104) << i16);
                    f53513f = i106 % 128;
                    int i107 = i106 % 2;
                } else {
                    int i108 = f53514g;
                    int i109 = i108 & 25;
                    int i110 = i109 + ((i108 ^ 25) | i109);
                    f53513f = i110 % 128;
                    if (i110 % 2 != 0) {
                        throw null;
                    }
                }
                apk x7 = compoundDrawableTintBlendMode8.setX();
                apk onFocusChangeListener4 = x7.setOnFocusChangeListener(compoundDrawableTintBlendMode9);
                apk x10 = compoundDrawableTintBlendMode2.setX();
                apk onFocusChangeListener5 = onFocusChangeListener4.setOnFocusChangeListener(compoundDrawableTintBlendMode2);
                apk compoundDrawableTintBlendMode10 = onFocusChangeListener5.setCompoundDrawableTintBlendMode(onFocusChangeListener4, x10, x6.getNavBarTitleString());
                setonfocuschangelistener2 = new setOnFocusChangeListener(x6, compoundDrawableTintBlendMode2.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode10), x7.setX().setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2, compoundDrawableTintBlendMode10, onFocusChangeListener5), new apk[]{compoundDrawableTintBlendMode2.setCompoundDrawableTintBlendMode(x10)});
                int i111 = f53513f;
                i15 = (-2) - (((i111 & 86) + (i111 | 86)) ^ (-1));
            } else {
                if (layoutAnimation != 6) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                apk apkVar11 = setonfocuschangelistener13.setOnFocusChangeListener;
                apk apkVar12 = setonfocuschangelistener13.setY[0];
                boolean navBarTitleString2 = apkVar12.getNavBarTitleString();
                if (navBarTitleString2) {
                    int i112 = f53514g + 47;
                    int i113 = i112 % 128;
                    f53513f = i113;
                    int i114 = i112 % 2;
                    int i115 = i113 + 119;
                    f53514g = i115 % 128;
                    int i116 = i115 % 2;
                    compoundDrawableTintBlendMode3 = apkVar11;
                } else {
                    compoundDrawableTintBlendMode3 = apkVar11.setCompoundDrawableTintBlendMode(apkVar12);
                    int i117 = f53513f;
                    int i118 = i117 & 103;
                    int i119 = (i117 ^ 103) | i118;
                    int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                    f53514g = i120 % 128;
                    int i121 = i120 % 2;
                }
                if (navBarTitleString2) {
                    int i122 = f53514g + 29;
                    f53513f = i122 % 128;
                    int i123 = i122 % 2;
                    x4 = apkVar12;
                } else {
                    x4 = apkVar12.setX();
                    int i124 = f53513f + 103;
                    f53514g = i124 % 128;
                    int i125 = i124 % 2;
                }
                apk navBarTitleString3 = x6.getNavBarTitleString();
                if (navBarTitleString2) {
                    System.identityHashCode(setonfocuschangelistener13);
                    System.identityHashCode(setonfocuschangelistener13);
                    compoundDrawableTintBlendMode4 = navBarTitleString3;
                } else {
                    compoundDrawableTintBlendMode4 = navBarTitleString3.setCompoundDrawableTintBlendMode(x4);
                    int i126 = f53513f;
                    int i127 = i126 & 49;
                    int i128 = -(-((i126 ^ 49) | i127));
                    int i129 = (i127 & i128) + (i127 | i128);
                    f53514g = i129 % 128;
                    int i130 = i129 % 2;
                }
                apk apkVarB = e.b(apkVar11, compoundDrawableTintBlendMode3, compoundDrawableTintBlendMode4);
                if (apkVarB.setOnDragListener()) {
                    setOnFocusChangeListener setonfocuschangelistener14 = new setOnFocusChangeListener(x6, apkVarB, x6.setOnLongClickListener().setOnLongClickListener());
                    int i131 = f53514g;
                    int i132 = i131 & 23;
                    int i133 = ((((i131 ^ 23) | i132) << 1) - (~(-((i131 | 23) & (~i132))))) - 1;
                    f53513f = i133 % 128;
                    int i134 = i133 % 2;
                    return setonfocuschangelistener14;
                }
                apk x11 = apkVarB.setX();
                if (navBarTitleString2) {
                    int i135 = (-2) - ((f53514g + 10) ^ (-1));
                    f53513f = i135 % 128;
                    int i136 = i135 % 2;
                    compoundDrawableTintBlendMode5 = apkVarB;
                } else {
                    compoundDrawableTintBlendMode5 = apkVarB.setCompoundDrawableTintBlendMode(x4);
                    int i137 = f53514g;
                    int i138 = (-2) - ((((i137 | 110) << 1) - (i137 ^ 110)) ^ (-1));
                    f53513f = i138 % 128;
                    int i139 = i138 % 2;
                }
                apk onLongClickListener = x6.setOnLongClickListener();
                if (onLongClickListener.setLayoutAnimation() < (x6.setOnFocusChangeListener() >> 1)) {
                    int i140 = f53513f;
                    int i141 = ((i140 ^ 102) + ((i140 & 102) << 1)) - 1;
                    f53514g = i141 % 128;
                    if (i141 % 2 == 0) {
                        apkVar11.setOnFocusChangeListener(compoundDrawableTintBlendMode8).setX();
                        onLongClickListener.getNavBarTitleString();
                        throw null;
                    }
                    apk x12 = apkVar11.setOnFocusChangeListener(compoundDrawableTintBlendMode8).setX();
                    if (onLongClickListener.getNavBarTitleString()) {
                        int i142 = f53513f;
                        int i143 = i142 & 121;
                        int i144 = i142 | 121;
                        int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                        f53514g = i145 % 128;
                        if (i145 % 2 == 0) {
                            compoundDrawableTintBlendMode4.setOnFocusChangeListener(x4).setX();
                            throw null;
                        }
                        y7 = compoundDrawableTintBlendMode4.setOnFocusChangeListener(x4).setX();
                        int i146 = f53513f;
                        int i147 = (i146 & (-112)) | ((~i146) & 111);
                        int i148 = -(-((i146 & 111) << 1));
                        i18 = i147 & i148;
                        i19 = i148 | i147;
                    } else {
                        y7 = compoundDrawableTintBlendMode4.setY(onLongClickListener, x4.setX());
                        int i149 = f53513f;
                        int i150 = i149 & 105;
                        int i151 = (i149 | 105) & (~i150);
                        int i152 = i150 << 1;
                        i18 = i151 & i152;
                        i19 = i151 | i152;
                    }
                    int i153 = i18 + i19;
                    f53514g = i153 % 128;
                    int i154 = i153 % 2;
                    onFocusChangeListener = x12.setOnFocusChangeListener(apkVarB).setOnFocusChangeListener(x4).setCompoundDrawableTintBlendMode(x12).setOnFocusChangeListener(y7).setOnFocusChangeListener(x11);
                    if (!(!navBarTitleString3.setOnDragListener())) {
                        System.identityHashCode(setonfocuschangelistener13);
                        System.identityHashCode(setonfocuschangelistener13);
                        onFocusChangeListener = onFocusChangeListener.setOnFocusChangeListener(compoundDrawableTintBlendMode5);
                        int i155 = f53513f;
                        int i156 = ((i155 | 33) << 1) - (((~i155) & 33) | (i155 & (-34)));
                        f53514g = i156 % 128;
                        int i157 = i156 % 2;
                    } else if (!navBarTitleString3.getNavBarTitleString()) {
                        int i158 = f53514g;
                        int i159 = i158 & 29;
                        int i160 = ((i158 ^ 29) | i159) << 1;
                        int i161 = -((i158 | 29) & (~i159));
                        int i162 = ((i160 | i161) << 1) - (i161 ^ i160);
                        f53513f = i162 % 128;
                        if (i162 % 2 != 0) {
                            onFocusChangeListener.setOnFocusChangeListener(navBarTitleString3.setDividerPadding().setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode5));
                            throw null;
                        }
                        onFocusChangeListener = onFocusChangeListener.setOnFocusChangeListener(navBarTitleString3.setDividerPadding().setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode5));
                        int i163 = f53514g;
                        int i164 = i163 & 53;
                        int i165 = -(-((i163 ^ 53) | i164));
                        int i166 = (i164 & i165) + (i165 | i164);
                        f53513f = i166 % 128;
                        int i167 = i166 % 2;
                    }
                    i17 = 1;
                } else {
                    if (navBarTitleString2) {
                        int i168 = f53514g;
                        int i169 = i168 & 5;
                        int i170 = (((i168 ^ 5) | i169) << 1) - ((i168 | 5) & (~i169));
                        f53513f = i170 % 128;
                        if (i170 % 2 != 0) {
                            int i171 = 88 / 0;
                        }
                    } else {
                        compoundDrawableTintBlendMode8 = compoundDrawableTintBlendMode8.setCompoundDrawableTintBlendMode(apkVar12);
                    }
                    onFocusChangeListener = compoundDrawableTintBlendMode8.setY(apkVarB, compoundDrawableTintBlendMode3).setOnFocusChangeListener(x11).setOnFocusChangeListener(compoundDrawableTintBlendMode5);
                    int i172 = f53513f;
                    i17 = 1;
                    int i173 = (i172 ^ 63) + ((i172 & 63) << 1);
                    f53514g = i173 % 128;
                    int i174 = i173 % 2;
                }
                apk[] apkVarArr = new apk[i17];
                apkVarArr[0] = compoundDrawableTintBlendMode5;
                setOnFocusChangeListener setonfocuschangelistener15 = new setOnFocusChangeListener(x6, x11, onFocusChangeListener, apkVarArr);
                System.identityHashCode(setonfocuschangelistener13);
                int iIdentityHashCode = System.identityHashCode(setonfocuschangelistener13);
                int i175 = ~iIdentityHashCode;
                int i176 = ((~i175) & (-961277448)) | (961277447 & i175);
                int i177 = (-961277448) & i175;
                int i178 = ~((i176 & i177) | (i176 ^ i177));
                int i179 = (i178 & 419481601) | ((-419481602) & i178) | ((~i178) & 419481601);
                int i180 = (-3146025) & iIdentityHashCode;
                int i181 = (-3146025) | iIdentityHashCode;
                int i182 = (~i180) & i181;
                int i183 = (i180 & i182) | (i182 ^ i180);
                int i184 = ~i183;
                int i185 = (i183 | i184) & i184;
                int i186 = ((~i185) & i179) | ((~i179) & i185);
                int i187 = i179 & i185;
                int i188 = -(~(-(-(((i187 & i186) | (i186 ^ i187)) * (-713)))));
                int i189 = (((2000742294 | i188) << 1) - (i188 ^ 2000742294)) - 1;
                int i190 = ~i181;
                int i191 = -(-((i190 & (i181 | i190)) * 1426));
                int i192 = (i189 ^ i191) + ((i191 & i189) << 1);
                int i193 = (iIdentityHashCode | i175) & i175;
                int i194 = (-544941871) ^ i193;
                int i195 = i193 & (-544941871);
                int i196 = (i195 & i194) | (i194 ^ i195);
                int i197 = ~i196;
                int i198 = -(~(-(-(((i196 | i197) & i197) * 713))));
                int i199 = (i192 & i198) + (i198 | i192);
                obj = setonfocuschangelistener15;
                if (1715070146 <= (i199 ^ (-1)) + (i199 << 1)) {
                    throw null;
                }
            }
            f53514g = i15 % 128;
            int i200 = i15 % 2;
            return setonfocuschangelistener2;
            return obj;
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final apl UiMessageCallbackKtWhenMappings() {
            return (apl) setY(new Object[]{this}, 1356378516, -1356378514, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final apk setNavigationOnClickListener() {
            return (apk) setY(new Object[]{this}, -1628160426, 1628160427, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final apl setOnEditorActionListener() {
            return (apl) setY(new Object[]{this}, 1998811312, -1998811312, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final apl setOnFocusChangeListener(apl aplVar) {
            return (apl) setY(new Object[]{this, aplVar}, -1224522540, 1224522543, System.identityHashCode(this));
        }
    }

    public static abstract class setX extends apl {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f53515d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f53516e = 1;

        public setX(aph aphVar, apk apkVar, apk apkVar2, apk[] apkVarArr) {
            super(aphVar, apkVar, apkVar2, apkVarArr);
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13;
            setX setx = (setX) objArr[0];
            int i14 = f53516e;
            int i15 = ((((i14 ^ 71) | (i14 & 71)) << 1) - (~(-(((~i14) & 71) | (i14 & (-72)))))) - 1;
            f53515d = i15 % 128;
            int i16 = i15 % 2;
            apk apkVar = setx.setX;
            apk apkVar2 = setx.setOnFocusChangeListener;
            apk navBarTitleString = setx.setDividerPadding.getNavBarTitleString();
            apk onLongClickListener = setx.setDividerPadding.setOnLongClickListener();
            apk x4 = apkVar2.setX();
            int compoundDrawableTintBlendMode = setx.setCompoundDrawableTintBlendMode();
            if (compoundDrawableTintBlendMode == 0) {
                int i17 = f53515d + 1;
                f53516e = i17 % 128;
                int i18 = i17 % 2;
            } else if (compoundDrawableTintBlendMode == 1) {
                apk apkVar3 = setx.setY[0];
                if (!apkVar3.getNavBarTitleString()) {
                    int i19 = f53515d;
                    int i20 = i19 ^ 115;
                    int i21 = -(-((i19 & 115) << 1));
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    f53516e = i22 % 128;
                    int i23 = i22 % 2;
                    apk x6 = apkVar3.setX();
                    apk compoundDrawableTintBlendMode2 = apkVar3.setCompoundDrawableTintBlendMode(x6);
                    x4 = x4.setCompoundDrawableTintBlendMode(apkVar3);
                    navBarTitleString = navBarTitleString.setCompoundDrawableTintBlendMode(x6);
                    onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2);
                    int i24 = f53516e;
                    int i25 = i24 & 87;
                    i13 = i25 + ((i24 ^ 87) | i25);
                    f53515d = i13 % 128;
                    int i26 = i13 % 2;
                }
            } else {
                if (compoundDrawableTintBlendMode != 2 && compoundDrawableTintBlendMode != 3 && compoundDrawableTintBlendMode != 4) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                apk apkVar4 = setx.setY[0];
                if (!apkVar4.getNavBarTitleString()) {
                    int i27 = f53515d;
                    int i28 = i27 ^ 17;
                    int i29 = (i27 & 17) << 1;
                    int i30 = (i28 & i29) + (i29 | i28);
                    f53516e = i30 % 128;
                    int i31 = i30 % 2;
                    apk x7 = apkVar4.setX();
                    apk x10 = x7.setX();
                    apk compoundDrawableTintBlendMode3 = x7.setCompoundDrawableTintBlendMode(x10);
                    if (i31 == 0) {
                        navBarTitleString.setCompoundDrawableTintBlendMode(x10);
                        onLongClickListener.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode3);
                        throw null;
                    }
                    navBarTitleString = navBarTitleString.setCompoundDrawableTintBlendMode(x10);
                    onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode3);
                    int i32 = f53515d;
                    i13 = (((i32 ^ 105) | (i32 & 105)) << 1) - (((~i32) & 105) | (i32 & (-106)));
                    f53516e = i13 % 128;
                    int i210 = i13 % 2;
                }
            }
            boolean zEquals = x4.equals(apkVar.setX().setOnFocusChangeListener(navBarTitleString).setCompoundDrawableTintBlendMode(apkVar).setOnFocusChangeListener(onLongClickListener));
            int i33 = f53515d;
            int i34 = ((i33 & 84) + (i33 | 84)) - 1;
            f53516e = i34 % 128;
            int i35 = i34 % 2;
            return Boolean.valueOf(zEquals);
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final boolean setDividerPadding() {
            return ((Boolean) setX(new Object[]{this}, -655558578, 655558578, System.identityHashCode(this))).booleanValue();
        }

        public setX(aph aphVar, apk apkVar, apk apkVar2) {
            super(aphVar, apkVar, apkVar2);
        }
    }

    public static abstract class setY extends apl {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f53517d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f53518e = 1;

        public setY(aph aphVar, apk apkVar, apk apkVar2, apk[] apkVarArr) {
            super(aphVar, apkVar, apkVar2, apkVarArr);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:29:0x0206 A[PHI: r0 r4 r8
          0x0206: PHI (r0v24 com.mypinpad.tsdk.i.apl) = (r0v23 com.mypinpad.tsdk.i.apl), (r0v29 com.mypinpad.tsdk.i.apl) binds: [B:27:0x01fa, B:24:0x01d2] A[DONT_GENERATE, DONT_INLINE]
          0x0206: PHI (r4v21 com.mypinpad.tsdk.i.apk) = (r4v20 com.mypinpad.tsdk.i.apk), (r4v22 com.mypinpad.tsdk.i.apk) binds: [B:27:0x01fa, B:24:0x01d2] A[DONT_GENERATE, DONT_INLINE]
          0x0206: PHI (r8v49 com.mypinpad.tsdk.i.apk) = (r8v45 com.mypinpad.tsdk.i.apk), (r8v70 com.mypinpad.tsdk.i.apk) binds: [B:27:0x01fa, B:24:0x01d2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x021a  */
        /* JADX WARN: Code duplicated, block: B:34:0x0249  */
        /* JADX WARN: Code duplicated, block: B:35:0x024a  */
        /* JADX WARN: Code duplicated, block: B:44:0x02b7 A[PHI: r2 r3 r4
          0x02b7: PHI (r2v6 com.mypinpad.tsdk.i.apk) = (r2v5 com.mypinpad.tsdk.i.apk), (r2v27 com.mypinpad.tsdk.i.apk) binds: [B:43:0x02b5, B:40:0x029f] A[DONT_GENERATE, DONT_INLINE]
          0x02b7: PHI (r3v4 com.mypinpad.tsdk.i.apk) = (r3v3 com.mypinpad.tsdk.i.apk), (r3v13 com.mypinpad.tsdk.i.apk) binds: [B:43:0x02b5, B:40:0x029f] A[DONT_GENERATE, DONT_INLINE]
          0x02b7: PHI (r4v6 com.mypinpad.tsdk.i.apk) = (r4v5 com.mypinpad.tsdk.i.apk), (r4v19 com.mypinpad.tsdk.i.apk) binds: [B:43:0x02b5, B:40:0x029f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x02c5  */
        /* JADX WARN: Code duplicated, block: B:48:0x02dd  */
        /* JADX WARN: Code duplicated, block: B:51:0x02e1 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:52:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:55:0x0324  */
        /* JADX WARN: Code duplicated, block: B:57:0x032e  */
        /* JADX WARN: Code duplicated, block: B:58:0x0358  */
        /* JADX WARN: Code duplicated, block: B:60:0x036d  */
        /* JADX WARN: Code duplicated, block: B:61:0x037d  */
        /* JADX WARN: Code duplicated, block: B:64:0x03a9  */
        /* JADX WARN: Code duplicated, block: B:66:0x03b2 A[PHI: r2 r3 r4 r9
          0x03b2: PHI (r2v26 com.mypinpad.tsdk.i.apk) = (r2v5 com.mypinpad.tsdk.i.apk), (r2v27 com.mypinpad.tsdk.i.apk) binds: [B:43:0x02b5, B:40:0x029f] A[DONT_GENERATE, DONT_INLINE]
          0x03b2: PHI (r3v8 com.mypinpad.tsdk.i.apk) = (r3v3 com.mypinpad.tsdk.i.apk), (r3v13 com.mypinpad.tsdk.i.apk) binds: [B:43:0x02b5, B:40:0x029f] A[DONT_GENERATE, DONT_INLINE]
          0x03b2: PHI (r4v14 com.mypinpad.tsdk.i.apk) = (r4v5 com.mypinpad.tsdk.i.apk), (r4v19 com.mypinpad.tsdk.i.apk) binds: [B:43:0x02b5, B:40:0x029f] A[DONT_GENERATE, DONT_INLINE]
          0x03b2: PHI (r9v49 int) = (r9v13 int), (r9v76 int) binds: [B:43:0x02b5, B:40:0x029f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:68:0x03be A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:69:0x03c0  */
        /* JADX WARN: Code duplicated, block: B:71:0x03ca  */
        /* JADX WARN: Code duplicated, block: B:73:0x03e9  */
        /* JADX WARN: Code duplicated, block: B:74:0x03f9  */
        /* JADX WARN: Code duplicated, block: B:76:0x0419  */
        /* JADX WARN: Code duplicated, block: B:78:0x0421  */
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            apk apkVar;
            apk navBarTitleString;
            apk onLongClickListener;
            int layoutAnimation;
            apk apkVar2;
            boolean navBarTitleString2;
            apk apkVar3;
            apk x4;
            int i13;
            apk apkVarB;
            apk onFocusChangeListener;
            boolean zEquals;
            int i14;
            int i15;
            int i16;
            apk compoundDrawableTintBlendMode;
            apk apkVar4;
            int i17;
            apk compoundDrawableTintBlendMode2;
            apl alwaysDrawnWithCacheEnabled;
            apk onFocusChangeListener2;
            apk apkVar5;
            int i18;
            int i19 = ~i10;
            int i20 = ~i11;
            int i21 = i19 | i20;
            int i22 = ~(i21 | i12);
            int i23 = ~i12;
            if ((((~(i10 | i20 | i12)) | (~(i11 | i19 | i12)) | (~(i21 | i23))) * 920) + (((~i21) | (~(i19 | i23))) * 920) + ((i22 | (~(i20 | i23 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919)) != 1) {
                setY sety = (setY) objArr[0];
                int i24 = f53518e;
                int i25 = (i24 & 21) + (i24 | 21);
                f53517d = i25 % 128;
                int i26 = i25 % 2;
                BigInteger onDragListener = sety.setDividerPadding.setOnDragListener();
                if (apj.setDividerPadding.equals(onDragListener)) {
                    int i27 = f53517d;
                    int i28 = (i27 ^ 94) + ((i27 & 94) << 1);
                    int i29 = (i28 ^ (-1)) + (i28 << 1);
                    f53518e = i29 % 128;
                    if (i29 % 2 != 0 ? ((apk.setOnFocusChangeListener) sety.setAlwaysDrawnWithCacheEnabled().setOnFocusChangeListener()).UiMessageCallbackKtWhenMappings() != 0 : ((apk.setOnFocusChangeListener) sety.setAlwaysDrawnWithCacheEnabled().setOnFocusChangeListener()).UiMessageCallbackKtWhenMappings() != 0) {
                        int i30 = f53517d;
                        int i31 = i30 & 107;
                        int i32 = (((i30 ^ 107) | i31) << 1) - ((i30 | 107) & (~i31));
                        int i33 = i32 % 128;
                        f53518e = i33;
                        int i34 = i32 % 2;
                        int i35 = (((i33 | 14) << 1) - (i33 ^ 14)) - 1;
                        f53517d = i35 % 128;
                        int i36 = i35 % 2;
                        return Boolean.TRUE;
                    }
                    int iIdentityHashCode = System.identityHashCode(sety);
                    int i37 = ~iIdentityHashCode;
                    int i38 = (i37 | iIdentityHashCode) & i37;
                    int i39 = ~((i38 & 1382097033) | (1382097033 ^ i38));
                    int i40 = ((-1344282754) & i39) | ((~i39) & 1344282753);
                    int i41 = i39 & 1344282753;
                    int i42 = (i41 & i40) | (i40 ^ i41);
                    int i43 = (-1382097034) & iIdentityHashCode;
                    int i44 = ((-1382097034) | iIdentityHashCode) & (~i43);
                    int i45 = ~((i44 & i43) | (i44 ^ i43));
                    int i46 = i42 & i45;
                    int i47 = -(-((((i42 | i45) & (~i46)) | i46) * (-338)));
                    int i48 = ((1383088045 & i47) - (~(i47 | 1383088045))) - 1689257813;
                    int i49 = 1382097033 & i37;
                    int i50 = ~(i49 | ((1382097033 | i37) & (~i49)));
                    int i51 = (i37 & (-37814281)) | (37814280 & iIdentityHashCode);
                    int i52 = iIdentityHashCode & (-37814281);
                    int i53 = (i52 & i51) | (i51 ^ i52);
                    int i54 = ~i53;
                    int i55 = (i53 | i54) & i54;
                    int i56 = i50 & i55;
                    int i57 = (i55 | i50) & (~i56);
                    int i58 = -(~(((i57 & i56) | (i57 ^ i56)) * 338));
                    int i59 = ((i48 & i58) + (i58 | i48)) - 1;
                    int iIdentityHashCode2 = System.identityHashCode(sety);
                    int i60 = ~iIdentityHashCode2;
                    int i61 = (i60 | iIdentityHashCode2) & i60;
                    int i62 = 2088002748 ^ i61;
                    int i63 = 2088002748 & i61;
                    int i64 = ~((i63 & i62) | (i62 ^ i63));
                    int i65 = (2104814847 & i64) | ((~i64) & (-2104814848));
                    int i66 = i64 & (-2104814848);
                    int i67 = (i66 & i65) | (i65 ^ i66);
                    int i68 = (-1348493465) | iIdentityHashCode2;
                    int i69 = ~i68;
                    int i70 = (i68 | i69) & i69;
                    int i71 = i67 ^ i70;
                    int i72 = i67 & i70;
                    int i73 = (((i72 & i71) | (i71 ^ i72)) * (-713)) - 1915263034;
                    int i74 = (i60 & (-1348493465)) | (1348493464 & iIdentityHashCode2);
                    int i75 = iIdentityHashCode2 & (-1348493465);
                    int i76 = (~((i75 & i74) | (i74 ^ i75))) * 1426;
                    int i77 = (((i73 ^ i76) | (i73 & i76)) << 1) - ((i76 & (~i73)) | ((~i76) & i73));
                    int i78 = (-1365305564) & i61;
                    int i79 = ((-1365305564) | i61) & (~i78);
                    int i80 = -(-((~((i79 & i78) | (i79 ^ i78))) * 713));
                    if (i59 <= ((((i77 ^ i80) | (i77 & i80)) << 1) - (~(-((i80 & (~i77)) | ((~i80) & i77))))) - 1) {
                        throw null;
                    }
                    return Boolean.FALSE;
                }
                if (!apj.setCompoundDrawableTintBlendMode.equals(onDragListener)) {
                    boolean y7 = super.setY();
                    int i81 = f53517d;
                    int i82 = (-2) - (((i81 & 80) + (i81 | 80)) ^ (-1));
                    f53518e = i82 % 128;
                    int i83 = i82 % 2;
                    return Boolean.valueOf(y7);
                }
                int i84 = f53518e;
                int i85 = (((i84 | 72) << 1) - (i84 ^ 72)) - 1;
                f53517d = i85 % 128;
                if (i85 % 2 == 0) {
                    alwaysDrawnWithCacheEnabled = sety.setAlwaysDrawnWithCacheEnabled();
                    onFocusChangeListener2 = alwaysDrawnWithCacheEnabled.setOnFocusChangeListener();
                    aph aphVar = sety.setDividerPadding;
                    aph.setDividerPadding setdividerpadding = (aph.setDividerPadding) aphVar;
                    apkVar5 = (apk) aph.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding, onFocusChangeListener2.setOnFocusChangeListener(aphVar.getNavBarTitleString())}, -451405860, 451405862, System.identityHashCode(setdividerpadding));
                    if (apkVar5 == null) {
                        int i86 = f53517d + 119;
                        f53518e = i86 % 128;
                        int i87 = i86 % 2;
                    } else {
                        if (((apk.setOnFocusChangeListener) onFocusChangeListener2.setCompoundDrawableTintBlendMode(apkVar5).setOnFocusChangeListener(alwaysDrawnWithCacheEnabled.setLayoutAnimation())).UiMessageCallbackKtWhenMappings() == 0) {
                            int i88 = f53517d;
                            int i89 = i88 & 91;
                            int i90 = ((i88 ^ 91) | i89) << 1;
                            int i91 = -((~i89) & (i88 | 91));
                            int i92 = (i90 & i91) + (i90 | i91);
                            f53518e = i92 % 128;
                            int i93 = i92 % 2;
                            int i94 = i88 & 79;
                            int i95 = ((i88 ^ 79) | i94) << 1;
                            int i96 = -((i88 | 79) & (~i94));
                            i18 = ((i95 | i96) << 1) - (i96 ^ i95);
                            f53518e = i18 % 128;
                            if (i18 % 2 == 0) {
                                throw null;
                            }
                            return Boolean.TRUE;
                        }
                        int i97 = f53517d;
                        int i98 = i97 & 85;
                        int i99 = (i98 - (~((i97 ^ 85) | i98))) - 1;
                        f53518e = i99 % 128;
                        int i100 = i99 % 2;
                    }
                    return Boolean.FALSE;
                }
                alwaysDrawnWithCacheEnabled = sety.setAlwaysDrawnWithCacheEnabled();
                onFocusChangeListener2 = alwaysDrawnWithCacheEnabled.setOnFocusChangeListener();
                aph aphVar2 = sety.setDividerPadding;
                aph.setDividerPadding setdividerpadding2 = (aph.setDividerPadding) aphVar2;
                apkVar5 = (apk) aph.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2, onFocusChangeListener2.setOnFocusChangeListener(aphVar2.getNavBarTitleString())}, -451405860, 451405862, System.identityHashCode(setdividerpadding2));
                int i101 = 17 / 0;
                if (apkVar5 == null) {
                    int i810 = f53517d + 119;
                    f53518e = i810 % 128;
                    int i811 = i810 % 2;
                } else {
                    if (((apk.setOnFocusChangeListener) onFocusChangeListener2.setCompoundDrawableTintBlendMode(apkVar5).setOnFocusChangeListener(alwaysDrawnWithCacheEnabled.setLayoutAnimation())).UiMessageCallbackKtWhenMappings() == 0) {
                        int i812 = f53517d;
                        int i813 = i812 & 91;
                        int i910 = ((i812 ^ 91) | i813) << 1;
                        int i911 = -((~i813) & (i812 | 91));
                        int i912 = (i910 & i911) + (i910 | i911);
                        f53518e = i912 % 128;
                        int i913 = i912 % 2;
                        int i914 = i812 & 79;
                        int i915 = ((i812 ^ 79) | i914) << 1;
                        int i916 = -((i812 | 79) & (~i914));
                        i18 = ((i915 | i916) << 1) - (i916 ^ i915);
                        f53518e = i18 % 128;
                        if (i18 % 2 == 0) {
                            throw null;
                        }
                        return Boolean.TRUE;
                    }
                    int i917 = f53517d;
                    int i918 = i917 & 85;
                    int i919 = (i918 - (~((i917 ^ 85) | i918))) - 1;
                    f53518e = i919 % 128;
                    int i102 = i919 % 2;
                }
                return Boolean.FALSE;
            }
            setY sety2 = (setY) objArr[0];
            int i103 = f53518e;
            int i104 = (i103 & 90) + (i103 | 90);
            int i105 = (i104 ^ (-1)) + (i104 << 1);
            f53517d = i105 % 128;
            if (i105 % 2 != 0) {
                aph x6 = sety2.setX();
                apkVar = sety2.setX;
                navBarTitleString = x6.getNavBarTitleString();
                onLongClickListener = x6.setOnLongClickListener();
                layoutAnimation = x6.setLayoutAnimation();
                if (layoutAnimation == 15) {
                    apkVar2 = sety2.setY[0];
                    navBarTitleString2 = apkVar2.getNavBarTitleString();
                    if (apkVar.setOnDragListener()) {
                        int i106 = f53518e;
                        int i107 = i106 ^ 95;
                        int i108 = (i106 & 95) << 1;
                        int i109 = (i107 & i108) + (i108 | i107);
                        f53517d = i109 % 128;
                        i15 = i109 % 2;
                        apk x7 = sety2.setOnFocusChangeListener.setX();
                        if (i15 != 0) {
                            int i110 = 21 / 0;
                            if (!navBarTitleString2) {
                                int i111 = f53518e;
                                int i112 = i111 & 55;
                                int i113 = (i111 | 55) & (~i112);
                                int i114 = -(-(i112 << 1));
                                int i115 = ((i113 | i114) << 1) - (i113 ^ i114);
                                f53517d = i115 % 128;
                                int i116 = i115 % 2;
                                onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar2.setX());
                                int i117 = f53518e + 21;
                                f53517d = i117 % 128;
                                int i118 = i117 % 2;
                            }
                        } else if (!navBarTitleString2) {
                            int i119 = f53518e;
                            int i1110 = i119 & 55;
                            int i1111 = (i119 | 55) & (~i1110);
                            int i1112 = -(-(i1110 << 1));
                            int i1113 = ((i1111 | i1112) << 1) - (i1111 ^ i1112);
                            f53517d = i1113 % 128;
                            int i1114 = i1113 % 2;
                            onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar2.setX());
                            int i1115 = f53518e + 21;
                            f53517d = i1115 % 128;
                            int i1116 = i1115 % 2;
                        }
                        zEquals = x7.equals(onLongClickListener);
                        int i120 = f53517d;
                        int i121 = i120 | 45;
                        int i122 = i121 << 1;
                        int i123 = -((~(i120 & 45)) & i121);
                        i16 = (i122 & i123) + (i123 | i122);
                        f53518e = i16 % 128;
                    } else {
                        apkVar3 = sety2.setOnFocusChangeListener;
                        x4 = apkVar.setX();
                        if (!navBarTitleString2) {
                            apk x10 = apkVar2.setX();
                            apk x11 = x10.setX();
                            apkVarB = apkVar3.setOnFocusChangeListener(apkVar2).setCompoundDrawableTintBlendMode(apkVar3, navBarTitleString, x10);
                            onFocusChangeListener = x4.setY(onLongClickListener, x11);
                            int i124 = f53518e;
                            int i125 = (i124 & (-88)) | ((~i124) & 87);
                            int i126 = (i124 & 87) << 1;
                            int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                            f53517d = i127 % 128;
                            int i128 = i127 % 2;
                        } else {
                            int i129 = f53518e;
                            int i130 = i129 & 79;
                            int i131 = -(-((i129 ^ 79) | i130));
                            i13 = ((i130 | i131) << 1) - (i131 ^ i130);
                            f53517d = i13 % 128;
                            if (i13 % 2 != 0) {
                                apkVarB = e.b(apkVar3, apkVar3, navBarTitleString);
                                onFocusChangeListener = x4.setX().setOnFocusChangeListener(onLongClickListener);
                                int i132 = 37 / 0;
                            } else {
                                apkVarB = e.b(apkVar3, apkVar3, navBarTitleString);
                                onFocusChangeListener = x4.setX().setOnFocusChangeListener(onLongClickListener);
                            }
                        }
                        zEquals = apkVarB.setCompoundDrawableTintBlendMode(x4).equals(onFocusChangeListener);
                        int i133 = f53518e;
                        int i134 = i133 & 121;
                        int i135 = ((i133 ^ 121) | i134) << 1;
                        int i136 = -((i133 | 121) & (~i134));
                        i14 = (i135 & i136) + (i136 | i135);
                        f53517d = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i137 = 46 / 0;
                        }
                    }
                } else {
                    apk apkVar6 = sety2.setOnFocusChangeListener;
                    compoundDrawableTintBlendMode = apkVar6.setOnFocusChangeListener(apkVar).setCompoundDrawableTintBlendMode(apkVar6);
                    if (layoutAnimation != 0) {
                        int i138 = f53517d;
                        int i139 = (((i138 & (-36)) | ((~i138) & 35)) - (~((i138 & 35) << 1))) - 1;
                        f53518e = i139 % 128;
                        int i140 = i139 % 2;
                    } else {
                        if (layoutAnimation == 1) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                        apkVar4 = sety2.setY[0];
                        if (!apkVar4.getNavBarTitleString()) {
                            int i141 = f53517d;
                            int i142 = i141 | 45;
                            int i143 = i142 << 1;
                            int i144 = -((~(i141 & 45)) & i142);
                            int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                            f53518e = i145 % 128;
                            i17 = i145 % 2;
                            compoundDrawableTintBlendMode2 = apkVar4.setCompoundDrawableTintBlendMode(apkVar4.setX());
                            if (i17 == 0) {
                                compoundDrawableTintBlendMode = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(apkVar4);
                                int i146 = 21 / 0;
                                navBarTitleString = navBarTitleString.setCompoundDrawableTintBlendMode(apkVar4);
                                onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2);
                            } else {
                                apk compoundDrawableTintBlendMode3 = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(apkVar4);
                                navBarTitleString = navBarTitleString.setCompoundDrawableTintBlendMode(apkVar4);
                                onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2);
                                compoundDrawableTintBlendMode = compoundDrawableTintBlendMode3;
                            }
                            int i147 = f53517d;
                            int i148 = i147 ^ 1;
                            int i149 = (i147 & 1) << 1;
                            int i150 = (i148 ^ i149) + ((i149 & i148) << 1);
                            f53518e = i150 % 128;
                            int i151 = i150 % 2;
                        }
                    }
                    zEquals = compoundDrawableTintBlendMode.equals(apkVar.setOnFocusChangeListener(navBarTitleString).setCompoundDrawableTintBlendMode(apkVar.setX()).setOnFocusChangeListener(onLongClickListener));
                    int i152 = f53518e + 60;
                    i16 = (i152 ^ (-1)) + (i152 << 1);
                    f53517d = i16 % 128;
                }
                int i153 = i16 % 2;
            } else {
                aph x12 = sety2.setX();
                apkVar = sety2.setX;
                navBarTitleString = x12.getNavBarTitleString();
                onLongClickListener = x12.setOnLongClickListener();
                layoutAnimation = x12.setLayoutAnimation();
                if (layoutAnimation == 6) {
                    apkVar2 = sety2.setY[0];
                    navBarTitleString2 = apkVar2.getNavBarTitleString();
                    if (apkVar.setOnDragListener()) {
                        int i1010 = f53518e;
                        int i1011 = i1010 ^ 95;
                        int i1012 = (i1010 & 95) << 1;
                        int i1013 = (i1011 & i1012) + (i1012 | i1011);
                        f53517d = i1013 % 128;
                        i15 = i1013 % 2;
                        apk x13 = sety2.setOnFocusChangeListener.setX();
                        if (i15 != 0) {
                            int i1117 = 21 / 0;
                            if (!navBarTitleString2) {
                                int i1118 = f53518e;
                                int i1119 = i1118 & 55;
                                int i11110 = (i1118 | 55) & (~i1119);
                                int i11111 = -(-(i1119 << 1));
                                int i11112 = ((i11110 | i11111) << 1) - (i11110 ^ i11111);
                                f53517d = i11112 % 128;
                                int i11113 = i11112 % 2;
                                onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar2.setX());
                                int i11114 = f53518e + 21;
                                f53517d = i11114 % 128;
                                int i11115 = i11114 % 2;
                            }
                        } else if (!navBarTitleString2) {
                            int i11116 = f53518e;
                            int i11117 = i11116 & 55;
                            int i11118 = (i11116 | 55) & (~i11117);
                            int i11119 = -(-(i11117 << 1));
                            int i111110 = ((i11118 | i11119) << 1) - (i11118 ^ i11119);
                            f53517d = i111110 % 128;
                            int i111111 = i111110 % 2;
                            onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar2.setX());
                            int i111112 = f53518e + 21;
                            f53517d = i111112 % 128;
                            int i111113 = i111112 % 2;
                        }
                        zEquals = x13.equals(onLongClickListener);
                        int i1210 = f53517d;
                        int i1211 = i1210 | 45;
                        int i1212 = i1211 << 1;
                        int i1213 = -((~(i1210 & 45)) & i1211);
                        i16 = (i1212 & i1213) + (i1213 | i1212);
                        f53518e = i16 % 128;
                    } else {
                        apkVar3 = sety2.setOnFocusChangeListener;
                        x4 = apkVar.setX();
                        if (!navBarTitleString2) {
                            apk x14 = apkVar2.setX();
                            apk x15 = x14.setX();
                            apkVarB = apkVar3.setOnFocusChangeListener(apkVar2).setCompoundDrawableTintBlendMode(apkVar3, navBarTitleString, x14);
                            onFocusChangeListener = x4.setY(onLongClickListener, x15);
                            int i1214 = f53518e;
                            int i1215 = (i1214 & (-88)) | ((~i1214) & 87);
                            int i1216 = (i1214 & 87) << 1;
                            int i1217 = (i1215 ^ i1216) + ((i1216 & i1215) << 1);
                            f53517d = i1217 % 128;
                            int i1218 = i1217 % 2;
                        } else {
                            int i1219 = f53518e;
                            int i1310 = i1219 & 79;
                            int i1311 = -(-((i1219 ^ 79) | i1310));
                            i13 = ((i1310 | i1311) << 1) - (i1311 ^ i1310);
                            f53517d = i13 % 128;
                            if (i13 % 2 != 0) {
                                apkVarB = e.b(apkVar3, apkVar3, navBarTitleString);
                                onFocusChangeListener = x4.setX().setOnFocusChangeListener(onLongClickListener);
                                int i1312 = 37 / 0;
                            } else {
                                apkVarB = e.b(apkVar3, apkVar3, navBarTitleString);
                                onFocusChangeListener = x4.setX().setOnFocusChangeListener(onLongClickListener);
                            }
                        }
                        zEquals = apkVarB.setCompoundDrawableTintBlendMode(x4).equals(onFocusChangeListener);
                        int i1313 = f53518e;
                        int i1314 = i1313 & 121;
                        int i1315 = ((i1313 ^ 121) | i1314) << 1;
                        int i1316 = -((i1313 | 121) & (~i1314));
                        i14 = (i1315 & i1316) + (i1316 | i1315);
                        f53517d = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i1317 = 46 / 0;
                        }
                    }
                } else {
                    apk apkVar7 = sety2.setOnFocusChangeListener;
                    compoundDrawableTintBlendMode = apkVar7.setOnFocusChangeListener(apkVar).setCompoundDrawableTintBlendMode(apkVar7);
                    if (layoutAnimation != 0) {
                        int i1318 = f53517d;
                        int i1319 = (((i1318 & (-36)) | ((~i1318) & 35)) - (~((i1318 & 35) << 1))) - 1;
                        f53518e = i1319 % 128;
                        int i1410 = i1319 % 2;
                    } else {
                        if (layoutAnimation == 1) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                        apkVar4 = sety2.setY[0];
                        if (!apkVar4.getNavBarTitleString()) {
                            int i1411 = f53517d;
                            int i1412 = i1411 | 45;
                            int i1413 = i1412 << 1;
                            int i1414 = -((~(i1411 & 45)) & i1412);
                            int i1415 = (i1413 ^ i1414) + ((i1414 & i1413) << 1);
                            f53518e = i1415 % 128;
                            i17 = i1415 % 2;
                            compoundDrawableTintBlendMode2 = apkVar4.setCompoundDrawableTintBlendMode(apkVar4.setX());
                            if (i17 == 0) {
                                compoundDrawableTintBlendMode = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(apkVar4);
                                int i1416 = 21 / 0;
                                navBarTitleString = navBarTitleString.setCompoundDrawableTintBlendMode(apkVar4);
                                onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2);
                            } else {
                                apk compoundDrawableTintBlendMode4 = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(apkVar4);
                                navBarTitleString = navBarTitleString.setCompoundDrawableTintBlendMode(apkVar4);
                                onLongClickListener = onLongClickListener.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2);
                                compoundDrawableTintBlendMode = compoundDrawableTintBlendMode4;
                            }
                            int i1417 = f53517d;
                            int i1418 = i1417 ^ 1;
                            int i1419 = (i1417 & 1) << 1;
                            int i154 = (i1418 ^ i1419) + ((i1419 & i1418) << 1);
                            f53518e = i154 % 128;
                            int i155 = i154 % 2;
                        }
                    }
                    zEquals = compoundDrawableTintBlendMode.equals(apkVar.setOnFocusChangeListener(navBarTitleString).setCompoundDrawableTintBlendMode(apkVar.setX()).setOnFocusChangeListener(onLongClickListener));
                    int i156 = f53518e + 60;
                    i16 = (i156 ^ (-1)) + (i156 << 1);
                    f53517d = i16 % 128;
                }
                int i157 = i16 % 2;
            }
            return Boolean.valueOf(zEquals);
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final boolean setDividerPadding() {
            return ((Boolean) setX(new Object[]{this}, 1336058007, -1336058006, System.identityHashCode(this))).booleanValue();
        }

        @Override // com.mypinpad.tsdk.isolation.apl
        public final boolean setY() {
            return ((Boolean) setX(new Object[]{this}, 586810894, -586810894, System.identityHashCode(this))).booleanValue();
        }

        public setY(aph aphVar, apk apkVar, apk apkVar2) {
            super(aphVar, apkVar, apkVar2);
        }
    }

    static {
        int i10 = ((1 ^ 50) + ((1 & 50) << 1)) - 1;
        f53509b = i10 % 128;
        int i11 = i10 % 2;
    }

    public apl(aph aphVar, apk apkVar, apk apkVar2, apk[] apkVarArr) {
        this.setCompoundDrawableTintBlendMode = null;
        this.setDividerPadding = aphVar;
        this.setX = apkVar;
        this.setOnFocusChangeListener = apkVar2;
        this.setY = apkVarArr;
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        apl aplVar = (apl) objArr[0];
        int i10 = f53510c;
        int i11 = (i10 & 51) + (i10 | 51);
        f53509b = i11 % 128;
        if (i11 % 2 != 0) {
            ((Integer) setOnFocusChangeListener(new Object[]{aplVar}, 1009290571, -1009290567, System.identityHashCode(aplVar))).intValue();
            throw null;
        }
        int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{aplVar}, 1009290571, -1009290567, System.identityHashCode(aplVar))).intValue();
        if (iIntValue != 0 && iIntValue != 5) {
            int i12 = f53509b;
            int i13 = i12 ^ 121;
            int i14 = (i12 & 121) << 1;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            f53510c = i15 % 128;
            int i16 = i15 % 2;
            if (!((Boolean) setOnFocusChangeListener(new Object[]{aplVar}, 2114769082, -2114769081, System.identityHashCode(aplVar))).booleanValue()) {
                int i17 = f53509b;
                int i18 = (-2) - (((i17 ^ 58) + ((i17 & 58) << 1)) ^ (-1));
                f53510c = i18 % 128;
                int i19 = i18 % 2;
                if (!aplVar.setY[0].getNavBarTitleString()) {
                    int i20 = f53510c + 121;
                    f53509b = i20 % 128;
                    int i21 = i20 % 2;
                    return Boolean.FALSE;
                }
            }
        }
        int i22 = f53510c + 123;
        f53509b = i22 % 128;
        int i23 = i22 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        apl aplVar = (apl) objArr[0];
        int i10 = f53510c;
        int i11 = i10 & 97;
        int i12 = (i10 ^ 97) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53509b = i13 % 128;
        if (i13 % 2 != 0) {
            ((Boolean) setOnFocusChangeListener(new Object[]{aplVar}, 985929864, -985929852, System.identityHashCode(aplVar))).booleanValue();
            throw null;
        }
        if (!((Boolean) setOnFocusChangeListener(new Object[]{aplVar}, 985929864, -985929852, System.identityHashCode(aplVar))).booleanValue()) {
            throw new IllegalStateException("point not in normal form");
        }
        int i14 = f53509b;
        int i15 = i14 ^ 51;
        int i16 = (i14 & 51) << 1;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f53510c = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 7 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:28:0x0101  */
    /* JADX WARN: Code duplicated, block: B:30:0x0118  */
    /* JADX WARN: Code duplicated, block: B:31:0x0128  */
    /* JADX WARN: Code duplicated, block: B:33:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0139  */
    /* JADX WARN: Code duplicated, block: B:35:0x015e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0164  */
    /* JADX WARN: Code duplicated, block: B:40:0x0170  */
    /* JADX WARN: Code duplicated, block: B:43:0x0181  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027e, code lost:
    
        if (r14 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0281, code lost:
    
        if (r14 != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean c(java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.apl.c(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ apl d(Object[] objArr) {
        apl aplVar = (apl) objArr[0];
        apk apkVar = (apk) objArr[1];
        int i10 = f53510c;
        int i11 = (i10 & (-96)) | ((~i10) & 95);
        int i12 = (i10 & 95) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f53509b = i13 % 128;
        int i14 = i13 % 2;
        int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{aplVar}, 1009290571, -1009290567, System.identityHashCode(aplVar))).intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2 || iIntValue == 3 || iIntValue == 4) {
                apk x4 = apkVar.setX();
                apl aplVar2 = (apl) setOnFocusChangeListener(new Object[]{aplVar, x4, x4.setCompoundDrawableTintBlendMode(apkVar)}, -1977420179, 1977420186, System.identityHashCode(aplVar));
                int i15 = f53509b;
                int i16 = ((i15 | 69) << 1) - (i15 ^ 69);
                f53510c = i16 % 128;
                int i17 = i16 % 2;
                return aplVar2;
            }
            if (iIntValue != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        apl aplVar3 = (apl) setOnFocusChangeListener(new Object[]{aplVar, apkVar, apkVar}, -1977420179, 1977420186, System.identityHashCode(aplVar));
        int i18 = f53510c;
        int i19 = ((i18 | 84) << 1) - (i18 ^ 84);
        int i20 = (i19 ^ (-1)) + (i19 << 1);
        f53509b = i20 % 128;
        if (i20 % 2 == 0) {
            return aplVar3;
        }
        throw null;
    }

    public static /* synthetic */ Boolean e(Object[] objArr) {
        apl aplVar = (apl) objArr[0];
        int i10 = f53510c;
        int i11 = i10 & 91;
        int i12 = (((~i11) & (i10 | 91)) - (~(-(-(i11 << 1))))) - 1;
        f53509b = i12 % 128;
        int i13 = i12 % 2;
        if (aplVar.setX != null) {
            int i14 = i10 & 37;
            int i15 = -(-((i10 ^ 37) | i14));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            f53509b = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            if (aplVar.setOnFocusChangeListener != null) {
                int i17 = ((i10 ^ 33) | (i10 & 33)) << 1;
                int i18 = -(((~i10) & 33) | (i10 & (-34)));
                int i19 = (i17 & i18) + (i18 | i17);
                int i20 = i19 % 128;
                f53509b = i20;
                int i21 = i19 % 2;
                apk[] apkVarArr = aplVar.setY;
                if (apkVarArr.length > 0) {
                    int i22 = i20 ^ 77;
                    int i23 = -(-((i20 & 77) << 1));
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    f53510c = i24 % 128;
                    if (i24 % 2 != 0) {
                    }
                }
                int i25 = f53510c;
                int i26 = i25 ^ 71;
                int i27 = -(-((i25 & 71) << 1));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                f53509b = i28 % 128;
                if (i28 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
        }
        int i29 = f53509b;
        int i30 = (i29 ^ 45) + ((i29 & 45) << 1);
        f53510c = i30 % 128;
        if (i30 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static Boolean f(Object[] objArr) {
        apl aplVar = (apl) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f53510c;
        int i11 = (i10 & (-8)) | ((~i10) & 7);
        int i12 = -(-((i10 & 7) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f53509b = i13 % 128;
        if (i13 % 2 != 0) {
            ((Boolean) setOnFocusChangeListener(new Object[]{aplVar}, 2114769082, -2114769081, System.identityHashCode(aplVar))).booleanValue();
            throw null;
        }
        if (((Boolean) setOnFocusChangeListener(new Object[]{aplVar}, 2114769082, -2114769081, System.identityHashCode(aplVar))).booleanValue()) {
            int i14 = f53510c;
            int i15 = (-2) - (((i14 ^ 116) + ((i14 & 116) << 1)) ^ (-1));
            f53509b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i14 + 107;
            f53509b = i17 % 128;
            int i18 = i17 % 2;
            return Boolean.TRUE;
        }
        aph aphVar = (aph) setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar));
        o1 o1Var = new o1();
        o1Var.f57388b = aplVar;
        o1Var.f57387a = zBooleanValue;
        q1 q1Var = (q1) aphVar.setCompoundDrawableTintBlendMode(aplVar, "bc_validity", o1Var);
        if (q1.a(new Object[]{q1Var}, -1556613181, 1556613185, System.identityHashCode(q1Var)).booleanValue()) {
            int i19 = f53510c;
            int i20 = i19 | 17;
            int i21 = ((i20 << 1) - (~(-((~(i19 & 17)) & i20)))) - 1;
            f53509b = i21 % 128;
            int i22 = i21 % 2;
            return Boolean.FALSE;
        }
        int i23 = f53509b;
        int i24 = ((i23 ^ 71) | (i23 & 71)) << 1;
        int i25 = -(((~i23) & 71) | (i23 & (-72)));
        int i26 = (i24 & i25) + (i25 | i24);
        int i27 = i26 % 128;
        f53510c = i27;
        int i28 = i26 % 2;
        int i29 = i27 + 17;
        f53509b = i29 % 128;
        int i30 = i29 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Object g(Object[] objArr) {
        int layoutAnimation;
        aph aphVar = (aph) objArr[0];
        int i10 = f53510c;
        int i11 = i10 & 105;
        int i12 = (~i11) & (i10 | 105);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f53509b = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (aphVar == null) {
            int i15 = (i10 & 103) + (i10 | 103);
            f53509b = i15 % 128;
            int i16 = i15 % 2;
            layoutAnimation = 0;
        } else {
            layoutAnimation = aphVar.setLayoutAnimation();
            int i17 = f53510c;
            int i18 = i17 & 73;
            int i19 = (i17 | 73) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            f53509b = i21 % 128;
            int i22 = i21 % 2;
        }
        if (layoutAnimation == 0 || layoutAnimation == 5) {
            apk[] apkVarArr = f53508a;
            int i23 = f53509b;
            int i24 = ((i23 & (-24)) | ((~i23) & 23)) + ((i23 & 23) << 1);
            f53510c = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = 43 / 0;
            }
            return apkVarArr;
        }
        apk onFocusChangeListener = aphVar.setOnFocusChangeListener(apj.setOnFocusChangeListener);
        if (layoutAnimation != 1 && layoutAnimation != 2) {
            if (layoutAnimation == 3) {
                apk[] apkVarArr2 = {onFocusChangeListener, onFocusChangeListener, onFocusChangeListener};
                int i26 = f53510c + 105;
                f53509b = i26 % 128;
                if (i26 % 2 == 0) {
                    return apkVarArr2;
                }
                throw null;
            }
            if (layoutAnimation == 4) {
                apk[] apkVarArr3 = {onFocusChangeListener, aphVar.getNavBarTitleString()};
                int i27 = f53510c + 73;
                f53509b = i27 % 128;
                if (i27 % 2 == 0) {
                    return apkVarArr3;
                }
                throw null;
            }
            if (layoutAnimation != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        apk[] apkVarArr4 = {onFocusChangeListener};
        int i28 = f53509b;
        int i29 = (i28 ^ 59) + ((i28 & 59) << 1);
        f53510c = i29 % 128;
        if (i29 % 2 != 0) {
            return apkVarArr4;
        }
        throw null;
    }

    public static /* synthetic */ Integer h(Object[] objArr) {
        apl aplVar = (apl) objArr[0];
        int i10 = f53510c + 69;
        int i11 = i10 % 128;
        f53509b = i11;
        int i12 = i10 % 2;
        aph aphVar = aplVar.setDividerPadding;
        if (i12 != 0) {
            throw null;
        }
        if (aphVar != null) {
            int layoutAnimation = aphVar.setLayoutAnimation();
            int i13 = f53509b;
            int i14 = ((i13 ^ 89) | (i13 & 89)) << 1;
            int i15 = -(((~i13) & 89) | (i13 & (-90)));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f53510c = i16 % 128;
            int i17 = i16 % 2;
            return Integer.valueOf(layoutAnimation);
        }
        int i18 = ((i11 | 117) << 1) - ((i11 & (-118)) | ((~i11) & 117));
        int i19 = i18 % 128;
        f53510c = i19;
        int i20 = i18 % 2;
        int i21 = (i19 & (-116)) | ((~i19) & 115);
        int i22 = (i19 & 115) << 1;
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        f53509b = i23 % 128;
        int i24 = i23 % 2;
        return 0;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        apl aplVar;
        byte[] bArr;
        Object obj;
        apk apkVar;
        int i13 = (i11 * (-195)) + (i10 * (-391));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~(i11 | i12);
        switch ((((~((~i10) | i14)) | i16) * 196) + ((i11 | i10) * 392) + ((i15 | i16) * (-196)) + i13) {
            case 1:
                return e(objArr);
            case 2:
                apl aplVar2 = (apl) objArr[0];
                int i17 = f53510c + 113;
                f53509b = i17 % 128;
                int i18 = i17 % 2;
                aph aphVar = aplVar2.setDividerPadding;
                System.identityHashCode(aplVar2);
                System.identityHashCode(aplVar2);
                return aphVar;
            case 3:
                return g(objArr);
            case 4:
                return h(objArr);
            case 5:
                b(objArr);
                return null;
            case 6:
                apl aplVar3 = (apl) objArr[0];
                int i19 = f53510c;
                int i20 = (i19 & (-50)) | ((~i19) & 49);
                int i21 = -(-((i19 & 49) << 1));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f53509b = i22 % 128;
                if (i22 % 2 == 0) {
                    return aplVar3.setOnFocusChangeListener;
                }
                apk apkVar2 = aplVar3.setOnFocusChangeListener;
                throw null;
            case 7:
                apl aplVar4 = (apl) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                apk apkVar4 = (apk) objArr[2];
                int i23 = f53510c;
                int i24 = i23 & 61;
                int i25 = (i23 | 61) & (~i24);
                int i26 = -(-(i24 << 1));
                int i27 = (i25 & i26) + (i25 | i26);
                f53509b = i27 % 128;
                int i28 = i27 % 2;
                apl dividerPadding = ((aph) setOnFocusChangeListener(new Object[]{aplVar4}, 498238248, -498238246, System.identityHashCode(aplVar4))).setDividerPadding(((apk) setOnFocusChangeListener(new Object[]{aplVar4}, -233106713, 233106730, System.identityHashCode(aplVar4))).setCompoundDrawableTintBlendMode(apkVar3), ((apk) setOnFocusChangeListener(new Object[]{aplVar4}, -1686004092, 1686004098, System.identityHashCode(aplVar4))).setCompoundDrawableTintBlendMode(apkVar4));
                int i29 = f53509b;
                int i30 = ((i29 ^ 69) | (i29 & 69)) << 1;
                int i31 = -(((~i29) & 69) | (i29 & (-70)));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f53510c = i32 % 128;
                int i33 = i32 % 2;
                return dividerPadding;
            case 8:
                apl aplVar5 = (apl) objArr[0];
                int i34 = f53510c + 39;
                f53509b = i34 % 128;
                if (i34 % 2 == 0) {
                    return aplVar5.setX;
                }
                apk apkVar5 = aplVar5.setX;
                throw null;
            case 9:
                apl aplVar6 = (apl) objArr[0];
                int i35 = f53509b;
                int i36 = ((i35 ^ 47) | (i35 & 47)) << 1;
                int i37 = -(((~i35) & 47) | (i35 & (-48)));
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                f53510c = i38 % 128;
                int i39 = i38 % 2;
                setOnFocusChangeListener(new Object[]{aplVar6}, -1938712283, 1938712288, System.identityHashCode(aplVar6));
                apk navigationOnClickListener = aplVar6.setNavigationOnClickListener();
                int i40 = f53509b;
                int i41 = i40 & 5;
                int i42 = -(-(i40 | 5));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f53510c = i43 % 128;
                int i44 = i43 % 2;
                return navigationOnClickListener;
            case 10:
                return d(objArr);
            case 11:
                return f(objArr);
            case 12:
                return a(objArr);
            case 13:
                aplVar = (apl) objArr[0];
                int i45 = f53509b;
                int i46 = ((i45 ^ 3) | (i45 & 3)) << 1;
                int i47 = -(((~i45) & 3) | (i45 & (-4)));
                int i48 = (i46 & i47) + (i47 | i46);
                f53510c = i48 % 128;
                int i49 = i48 % 2;
                if (((Boolean) setOnFocusChangeListener(new Object[]{aplVar}, 2114769082, -2114769081, System.identityHashCode(aplVar))).booleanValue()) {
                    int i50 = f53509b;
                    int i51 = i50 + 9;
                    f53510c = i51 % 128;
                    int i52 = i51 % 2;
                    int i53 = i50 ^ 75;
                    int i54 = (i50 & 75) << 1;
                    int i55 = (i53 & i54) + (i54 | i53);
                    f53510c = i55 % 128;
                    if (i55 % 2 == 0) {
                        obj = aplVar;
                        int i56 = 30 / 0;
                        obj = aplVar;
                    }
                } else {
                    int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{aplVar}, 1009290571, -1009290567, System.identityHashCode(aplVar))).intValue();
                    if (iIntValue == 0 || iIntValue == 5) {
                        int i57 = f53510c;
                        int i58 = ((i57 | 53) << 1) - (i57 ^ 53);
                        f53509b = i58 % 128;
                        int i59 = i58 % 2;
                        obj = aplVar;
                    } else {
                        apk y7 = aplVar.setY(0);
                        if (!y7.getNavBarTitleString()) {
                            if (aplVar.setDividerPadding == null) {
                                throw new IllegalStateException("Detached points must be in affine coordinates");
                            }
                            apk y10 = aplVar.setDividerPadding.setY((SecureRandom) aku.setCompoundDrawableTintBlendMode(new Object[0], -496048399, 496048400, (int) System.currentTimeMillis()));
                            apl aplVar7 = (apl) setOnFocusChangeListener(new Object[]{aplVar, y7.setCompoundDrawableTintBlendMode(y10).setNavigationOnClickListener().setCompoundDrawableTintBlendMode(y10)}, -660392021, 660392031, System.identityHashCode(aplVar));
                            int iIdentityHashCode = System.identityHashCode(aplVar);
                            int i60 = (-1082947646) & iIdentityHashCode;
                            int i61 = ((-1082947646) | iIdentityHashCode) & (~i60);
                            int i62 = ~iIdentityHashCode;
                            int i63 = (i61 & i60) | (i61 ^ i60);
                            int i64 = ~i63;
                            int i65 = (i63 | i64) & i64;
                            int i66 = 892049554 & i65;
                            int i67 = (i65 | 892049554) & (~i66);
                            int i68 = -(-(((i67 & i66) | (i67 ^ i66)) * (-948)));
                            int i69 = (-117497366) ^ i68;
                            int i70 = ((((i68 & (-117497366)) | i69) << 1) - (~(-i69))) - 1;
                            int i71 = (-1082417198) & i62;
                            int i72 = (i62 | (-1082417198)) & (~i71);
                            int i73 = (i72 & i71) | (i72 ^ i71);
                            int i74 = ~i73;
                            int i75 = ((i73 | i74) & i74) * (-948);
                            int i76 = (i70 ^ i75) + ((i75 & i70) << 1);
                            int i77 = i76 & (-502865652);
                            int i78 = ((-502865652) ^ i76) | i77;
                            int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                            int iIdentityHashCode2 = System.identityHashCode(aplVar);
                            int i80 = ~iIdentityHashCode2;
                            int i81 = ((-969106608) & i80) | ((-969106608) ^ i80);
                            int i82 = ~i81;
                            int i83 = (i81 | i82) & i82;
                            int i84 = (i83 & (-2036173969)) | ((-2036173969) ^ i83);
                            int i85 = 969106607 ^ iIdentityHashCode2;
                            int i86 = 969106607 & iIdentityHashCode2;
                            int i87 = ~((i86 & i85) | (i85 ^ i86));
                            int i88 = -(-(((i84 & i87) | ((~i87) & i84) | ((~i84) & i87)) * (-564)));
                            int i89 = (-1820256885) & i88;
                            int i90 = i88 | (-1820256885);
                            int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
                            int i92 = (iIdentityHashCode2 & (-1075611665)) | ((-1075611665) & i80) | (1075611664 & iIdentityHashCode2);
                            int i93 = ~i92;
                            int i94 = (i91 - (~(-(-(((i92 | i93) & i93) * 1128))))) - 1;
                            int i95 = (-2036173969) ^ i80;
                            int i96 = i80 & (-2036173969);
                            int i97 = ~((i95 & i96) | (i95 ^ i96));
                            int i98 = i97 ^ (-2044718272);
                            int i99 = i97 & (-2044718272);
                            int i100 = ((i99 & i98) | (i98 ^ i99)) * 564;
                            if (i79 > (i94 ^ i100) + ((i100 & i94) << 1)) {
                                return aplVar7;
                            }
                            throw null;
                        }
                        int i101 = f53510c;
                        int i102 = ((i101 & 92) + (i101 | 92)) - 1;
                        int i103 = i102 % 128;
                        f53509b = i103;
                        int i104 = i102 % 2;
                        int i105 = (i103 ^ 35) + ((i103 & 35) << 1);
                        f53510c = i105 % 128;
                        int i106 = i105 % 2;
                        obj = aplVar;
                    }
                }
                break;
            case 14:
                apl aplVar8 = (apl) objArr[0];
                int i107 = f53509b + 1;
                f53510c = i107 % 128;
                if (i107 % 2 == 0) {
                    setOnFocusChangeListener(new Object[]{aplVar8}, -1938712283, 1938712288, System.identityHashCode(aplVar8));
                    throw null;
                }
                setOnFocusChangeListener(new Object[]{aplVar8}, -1938712283, 1938712288, System.identityHashCode(aplVar8));
                apk apkVar6 = (apk) setOnFocusChangeListener(new Object[]{aplVar8}, -696079921, 696079929, System.identityHashCode(aplVar8));
                int i108 = f53509b;
                int i109 = ((i108 | 37) << 1) - (i108 ^ 37);
                f53510c = i109 % 128;
                int i110 = i109 % 2;
                return apkVar6;
            case 15:
                return c(objArr);
            case 16:
                apl aplVar9 = (apl) objArr[0];
                ((Boolean) objArr[1]).booleanValue();
                int i111 = f53510c + 51;
                f53509b = i111 % 128;
                if (i111 % 2 != 0) {
                    ((Boolean) setOnFocusChangeListener(new Object[]{aplVar9}, 2114769082, -2114769081, System.identityHashCode(aplVar9))).booleanValue();
                    throw null;
                }
                if (!((Boolean) setOnFocusChangeListener(new Object[]{aplVar9}, 2114769082, -2114769081, System.identityHashCode(aplVar9))).booleanValue()) {
                    apl aplVar10 = (apl) setOnFocusChangeListener(new Object[]{aplVar9}, 1013204546, -1013204533, System.identityHashCode(aplVar9));
                    apk apkVar7 = (apk) setOnFocusChangeListener(new Object[]{aplVar10}, -696079921, 696079929, System.identityHashCode(aplVar10));
                    byte[] bArr2 = (byte[]) apk.setOnFocusChangeListener(new Object[]{apkVar7}, 1440196034, -1440196034, System.identityHashCode(apkVar7));
                    apk navigationOnClickListener2 = aplVar10.setNavigationOnClickListener();
                    byte[] bArr3 = (byte[]) apk.setOnFocusChangeListener(new Object[]{navigationOnClickListener2}, 1440196034, -1440196034, System.identityHashCode(navigationOnClickListener2));
                    int length = bArr2.length;
                    int length2 = bArr3.length;
                    int i112 = ((((~length2) & length) | ((~length) & length2)) - (~(-(-((length & length2) << 1))))) - 1;
                    byte[] bArr4 = new byte[(i112 & 1) + (i112 | 1)];
                    bArr4[0] = 4;
                    System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
                    int length3 = bArr2.length;
                    int iIdentityHashCode3 = System.identityHashCode(aplVar9);
                    int i113 = (length3 * 868) + 868;
                    int i114 = ~iIdentityHashCode3;
                    int i115 = ~i114;
                    int i116 = ((-2) & i115) | (i114 & 1);
                    int i117 = (-2) & i114;
                    int i118 = (i116 & i117) | (i116 ^ i117);
                    int i119 = ~i118;
                    int i120 = (i118 | i119) & i119;
                    int i121 = ~length3;
                    int i122 = i121 ^ i114;
                    int i123 = i121 & i114;
                    int i124 = ~((i122 ^ i123) | (i122 & i123));
                    int i125 = i120 ^ i124;
                    int i126 = i120 & i124;
                    int i127 = ((i126 & i125) | (i125 ^ i126)) * (-867);
                    int i128 = i113 | i127;
                    int i129 = i128 << 1;
                    int i130 = -((~(i113 & i127)) & i128);
                    int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
                    int i132 = (i121 | length3) & i121;
                    int i133 = (-2) & i132;
                    int i134 = ~(i133 | ((~i133) & ((-2) | i132)));
                    int i135 = (-2) & iIdentityHashCode3;
                    int i136 = (~i135) & ((-2) | iIdentityHashCode3);
                    int i137 = (i136 ^ i135) | (i136 & i135);
                    int i138 = ~i137;
                    int i139 = (i137 | i138) & i138;
                    int i140 = (i139 & i134) | ((~i134) & i139) | ((~i139) & i134);
                    int i141 = i121 ^ iIdentityHashCode3;
                    int i142 = i121 & iIdentityHashCode3;
                    int i143 = -(-((i140 | (~((i141 & i142) | (i141 ^ i142)))) * (-1734)));
                    int i144 = i131 & i143;
                    int i145 = i143 | i131;
                    int i146 = (i144 ^ i145) + ((i145 & i144) << 1);
                    int i147 = (-2) & i121;
                    int i148 = ((-2) ^ i121) | i147;
                    int i149 = (i115 & i148) | ((~i148) & i114);
                    int i150 = i148 & i114;
                    int i151 = ~((i149 & i150) | (i149 ^ i150));
                    int i152 = (length3 & 1) | i147;
                    int i153 = length3 & (-2);
                    int i154 = (i153 & i152) | (i152 ^ i153);
                    int i155 = i154 & iIdentityHashCode3;
                    int i156 = (i154 | iIdentityHashCode3) & (~i155);
                    int i157 = ~((i156 & i155) | (i156 ^ i155));
                    int i158 = i151 ^ i157;
                    int i159 = i157 & i151;
                    int i160 = (i159 & i158) | (i158 ^ i159);
                    int i161 = i132 ^ 1;
                    int i162 = i132 & 1;
                    int i163 = (i162 & i161) | (i161 ^ i162);
                    int i164 = (iIdentityHashCode3 & i163) | (i114 & i163) | ((~i163) & iIdentityHashCode3);
                    int i165 = ~i164;
                    int i166 = (i164 | i165) & i165;
                    int i167 = i160 & i166;
                    System.arraycopy(bArr3, 0, bArr4, (i146 - (~((((i166 | i160) & (~i167)) | i167) * 867))) - 1, bArr3.length);
                    int i168 = f53509b;
                    int i169 = i168 & 45;
                    int i170 = (i168 | 45) & (~i169);
                    int i171 = -(-(i169 << 1));
                    int i172 = ((i170 | i171) << 1) - (i170 ^ i171);
                    f53510c = i172 % 128;
                    if (i172 % 2 != 0) {
                        return bArr4;
                    }
                    throw null;
                }
                bArr = new byte[1];
                int i173 = f53509b;
                int i174 = ((i173 & 45) - (~(i173 | 45))) - 1;
                f53510c = i174 % 128;
                if (i174 % 2 == 0) {
                    obj = bArr;
                    throw null;
                }
                break;
            case 17:
                apl aplVar11 = (apl) objArr[0];
                int i175 = f53510c;
                int i176 = ((i175 & 61) - (~(-(-(i175 | 61))))) - 1;
                f53509b = i176 % 128;
                int i177 = i176 % 2;
                apkVar = aplVar11.setX;
                if (i177 != 0) {
                    throw null;
                }
                int i178 = i175 & 29;
                int i179 = (((i175 | 29) & (~i178)) - (~(-(-(i178 << 1))))) - 1;
                f53509b = i179 % 128;
                if (i179 % 2 != 0) {
                    obj = apkVar;
                    throw null;
                }
                break;
            default:
                apl aplVar12 = (apl) objArr[0];
                int i180 = f53509b;
                int i181 = (i180 ^ 61) + ((i180 & 61) << 1);
                f53510c = i181 % 128;
                int i182 = i181 % 2;
                boolean zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{aplVar12, Boolean.FALSE}, -644764850, 644764861, System.identityHashCode(aplVar12))).booleanValue();
                int i183 = f53510c;
                int i184 = ((i183 | 22) << 1) - (i183 ^ 22);
                int i185 = (i184 ^ (-1)) + (i184 << 1);
                f53509b = i185 % 128;
                if (i185 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
        }
        obj = aplVar;
        obj = bArr;
        obj = apkVar;
        return obj;
    }

    public abstract apl UiMessageCallbackKtWhenMappings();

    public boolean equals(Object obj) {
        int i10 = f53510c + 11;
        int i11 = i10 % 128;
        f53509b = i11;
        int i12 = i10 % 2;
        if (obj == this) {
            int i13 = (i11 ^ 109) + ((i11 & 109) << 1);
            f53510c = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i11 & 101;
            int i16 = (i11 ^ 101) | i15;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            f53510c = i17 % 128;
            int i18 = i17 % 2;
            return true;
        }
        if (obj instanceof apl) {
            boolean zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{this, (apl) obj}, -1376432433, 1376432448, System.identityHashCode(this))).booleanValue();
            int i19 = f53509b;
            int i20 = (i19 & 57) + (i19 | 57);
            f53510c = i20 % 128;
            int i21 = i20 % 2;
            return zBooleanValue;
        }
        System.identityHashCode(this);
        System.identityHashCode(this);
        int i22 = f53510c;
        int i23 = (i22 ^ 49) + ((i22 & 49) << 1);
        f53509b = i23 % 128;
        if (i23 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final apk getNavBarTitleString() {
        return (apk) setOnFocusChangeListener(new Object[]{this}, -696079921, 696079929, System.identityHashCode(this));
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = f53509b + 43;
        f53510c = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        aph aphVar = (aph) setOnFocusChangeListener(new Object[]{this}, 498238248, -498238246, System.identityHashCode(this));
        if (aphVar == null) {
            int i14 = f53509b;
            int i15 = i14 ^ 9;
            int i16 = ((i14 & 9) | i15) << 1;
            int i17 = -i15;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            f53510c = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i14 + 25;
            f53510c = i20 % 128;
            int i21 = i20 % 2;
            i10 = 0;
        } else {
            int iHashCode = aphVar.hashCode();
            i10 = (iHashCode | (~iHashCode)) & (~iHashCode);
            int i22 = f53510c + 7;
            f53509b = i22 % 128;
            int i23 = i22 % 2;
        }
        if (!((Boolean) setOnFocusChangeListener(new Object[]{this}, 2114769082, -2114769081, System.identityHashCode(this))).booleanValue()) {
            int i24 = f53510c + 83;
            f53509b = i24 % 128;
            if (i24 % 2 != 0) {
                apl aplVar = (apl) setOnFocusChangeListener(new Object[]{this}, 1013204546, -1013204533, System.identityHashCode(this));
                int iHashCode2 = ((apk) setOnFocusChangeListener(new Object[]{aplVar}, -696079921, 696079929, System.identityHashCode(aplVar))).hashCode() * 93;
                int i25 = i10 & iHashCode2;
                int i26 = ((i10 ^ iHashCode2) | i25) & (~i25);
                int iHashCode3 = aplVar.setNavigationOnClickListener().hashCode();
                int i27 = ((iHashCode3 & (-29873)) | ((~iHashCode3) & 29872)) + ((iHashCode3 & 29872) << 1);
                int i28 = i26 & i27;
                i11 = ~i28;
                i12 = (i26 ^ i27) | i28;
            } else {
                apl aplVar2 = (apl) setOnFocusChangeListener(new Object[]{this}, 1013204546, -1013204533, System.identityHashCode(this));
                int iHashCode4 = ((apk) setOnFocusChangeListener(new Object[]{aplVar2}, -696079921, 696079929, System.identityHashCode(aplVar2))).hashCode() * 17;
                int i29 = i10 & iHashCode4;
                int i30 = ((i10 ^ iHashCode4) | i29) & (~i29);
                int iHashCode5 = aplVar2.setNavigationOnClickListener().hashCode() * 257;
                int i31 = i30 & iHashCode5;
                i11 = ~i31;
                i12 = (i30 ^ iHashCode5) | i31;
            }
            i10 = i12 & i11;
            int i32 = f53509b;
            int i33 = i32 & 27;
            int i34 = i32 | 27;
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f53510c = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = f53509b + 83;
        f53510c = i37 % 128;
        if (i37 % 2 == 0) {
            int i38 = 66 / 0;
        }
        return i10;
    }

    public final apl setAlwaysDrawnWithCacheEnabled() {
        return (apl) setOnFocusChangeListener(new Object[]{this}, 1013204546, -1013204533, System.identityHashCode(this));
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1009290571, -1009290567, System.identityHashCode(this))).intValue();
    }

    public abstract boolean setDividerPadding();

    public final boolean setIncludeFontPadding() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 2114769082, -2114769081, System.identityHashCode(this))).booleanValue();
    }

    public final apk setLayoutAnimation() {
        return (apk) setOnFocusChangeListener(new Object[]{this}, -739496835, 739496844, System.identityHashCode(this));
    }

    public apk setNavigationOnClickListener() {
        int i10 = f53510c;
        int i11 = ((i10 & 117) - (~(-(-(i10 | 117))))) - 1;
        f53509b = i11 % 128;
        int i12 = i11 % 2;
        apk apkVar = this.setOnFocusChangeListener;
        int i13 = i10 & 67;
        int i14 = ((((i10 ^ 67) | i13) << 1) - (~(-((i10 | 67) & (~i13))))) - 1;
        f53509b = i14 % 128;
        if (i14 % 2 == 0) {
            return apkVar;
        }
        throw null;
    }

    public final apk setOnDragListener() {
        return (apk) setOnFocusChangeListener(new Object[]{this}, -1686004092, 1686004098, System.identityHashCode(this));
    }

    public abstract apl setOnEditorActionListener();

    public abstract apl setOnFocusChangeListener(apl aplVar);

    public final apk setOnLongClickListener() {
        return (apk) setOnFocusChangeListener(new Object[]{this}, -233106713, 233106730, System.identityHashCode(this));
    }

    public final boolean setTextAlignment() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 985929864, -985929852, System.identityHashCode(this))).booleanValue();
    }

    public final byte[] setX(boolean z10) {
        return (byte[]) setOnFocusChangeListener(new Object[]{this, Boolean.valueOf(z10)}, -866502364, 866502380, System.identityHashCode(this));
    }

    public apk setY(int i10) {
        int i11 = f53509b;
        int i12 = i11 + 13;
        f53510c = i12 % 128;
        int i13 = i12 % 2;
        if (i10 >= 0) {
            int i14 = i11 ^ 75;
            int i15 = (((i11 & 75) | i14) << 1) - i14;
            int i16 = i15 % 128;
            f53510c = i16;
            if (i15 % 2 == 0) {
                int length = this.setY.length;
                throw null;
            }
            apk[] apkVarArr = this.setY;
            if (i10 < apkVarArr.length) {
                apk apkVar = apkVarArr[i10];
                int i17 = (i16 ^ 57) + ((i16 & 57) << 1);
                f53509b = i17 % 128;
                int i18 = i17 % 2;
                return apkVar;
            }
        }
        int i19 = ((i11 ^ 123) | (i11 & 123)) << 1;
        int i20 = -(((~i11) & 123) | (i11 & (-124)));
        int i21 = (i19 & i20) + (i19 | i20);
        f53510c = i21 % 128;
        if (i21 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final boolean setZ() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1076104209, 1076104209, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = f53510c;
        int i11 = ((-1) << 1) - (((i10 ^ 116) + ((i10 & 116) << 1)) ^ (-1));
        f53509b = i11 % 128;
        int i12 = 0;
        if (i11 % 2 != 0) {
            ((Boolean) setOnFocusChangeListener(new Object[]{this}, 2114769082, -2114769081, System.identityHashCode(this))).booleanValue();
            throw null;
        }
        if (((Boolean) setOnFocusChangeListener(new Object[]{this}, 2114769082, -2114769081, System.identityHashCode(this))).booleanValue()) {
            int i13 = f53509b;
            int i14 = (i13 & 91) + (i13 | 91);
            f53510c = i14 % 128;
            if (i14 % 2 != 0) {
                return "INF";
            }
            throw null;
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append((apk) setOnFocusChangeListener(new Object[]{this}, -233106713, 233106730, System.identityHashCode(this)));
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append((apk) setOnFocusChangeListener(new Object[]{this}, -1686004092, 1686004098, System.identityHashCode(this)));
        int i15 = f53509b;
        int i16 = (i15 & 53) + (i15 | 53);
        f53510c = i16 % 128;
        while (true) {
            int i17 = i16 % 2;
            if (i12 >= this.setY.length) {
                stringBuffer.append(RootService.CLOSE_BRACKET);
                String string = stringBuffer.toString();
                int i18 = f53510c;
                int i19 = ((((i18 ^ 115) | (i18 & 115)) << 1) - (~(-(((~i18) & 115) | (i18 & (-116)))))) - 1;
                f53509b = i19 % 128;
                int i20 = i19 % 2;
                return string;
            }
            int i21 = f53510c;
            int i22 = i21 & 123;
            int i23 = ((i21 ^ 123) | i22) << 1;
            int i24 = -((i21 | 123) & (~i22));
            int i25 = (i23 & i24) + (i24 | i23);
            f53509b = i25 % 128;
            int i26 = i25 % 2;
            stringBuffer.append(AbstractJsonLexerKt.COMMA);
            stringBuffer.append(this.setY[i12]);
            int i27 = i12 ^ 1;
            int i28 = ((i12 & 1) | i27) << 1;
            int i29 = -i27;
            i12 = (i28 ^ i29) + ((i29 & i28) << 1);
            int i30 = f53510c;
            i16 = (((i30 | 49) << 1) - (~(-(((~i30) & 49) | (i30 & (-50)))))) - 1;
            f53509b = i16 % 128;
        }
    }

    public apl(aph aphVar, apk apkVar, apk apkVar2) {
        this(aphVar, apkVar, apkVar2, (apk[]) setOnFocusChangeListener(new Object[]{aphVar}, -1281282773, 1281282776, (int) System.currentTimeMillis()));
    }

    public final boolean setX(apl aplVar) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, aplVar}, -1376432433, 1376432448, System.identityHashCode(this))).booleanValue();
    }

    public boolean setY() {
        int i10 = f53510c;
        int i11 = i10 & 21;
        int i12 = -(-(i10 | 21));
        int i13 = (i11 & i12) + (i12 | i11);
        f53509b = i13 % 128;
        int i14 = i13 % 2;
        if (apj.setOnFocusChangeListener.equals(this.setDividerPadding.setOnDragListener())) {
            int i15 = f53510c;
            int i16 = (((i15 ^ 11) | (i15 & 11)) << 1) - (((~i15) & 11) | (i15 & (-12)));
            f53509b = i16 % 128;
            return i16 % 2 == 0;
        }
        BigInteger navigationOnClickListener = this.setDividerPadding.setNavigationOnClickListener();
        if (navigationOnClickListener != null) {
            int i17 = f53510c;
            int i18 = i17 & 53;
            int i19 = (i17 | 53) & (~i18);
            int i20 = i18 << 1;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            f53509b = i21 % 128;
            if (i21 % 2 != 0) {
                apl aplVar = (apl) api.setX(new Object[]{this, navigationOnClickListener}, 479453798, -479453793, (int) System.currentTimeMillis());
                ((Boolean) setOnFocusChangeListener(new Object[]{aplVar}, 2114769082, -2114769081, System.identityHashCode(aplVar))).booleanValue();
                throw null;
            }
            apl aplVar2 = (apl) api.setX(new Object[]{this, navigationOnClickListener}, 479453798, -479453793, (int) System.currentTimeMillis());
            if (!((Boolean) setOnFocusChangeListener(new Object[]{aplVar2}, 2114769082, -2114769081, System.identityHashCode(aplVar2))).booleanValue()) {
                int i22 = f53509b;
                int i23 = i22 & 79;
                int i24 = -(-((i22 ^ 79) | i23));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                f53510c = i25 % 128;
                if (i25 % 2 != 0) {
                    return false;
                }
                throw null;
            }
        }
        int i26 = f53510c + 113;
        f53509b = i26 % 128;
        int i27 = i26 % 2;
        return true;
    }

    public final aph setX() {
        return (aph) setOnFocusChangeListener(new Object[]{this}, 498238248, -498238246, System.identityHashCode(this));
    }

    public final apk setOnFocusChangeListener() {
        return (apk) setOnFocusChangeListener(new Object[]{this}, 1215243068, -1215243054, System.identityHashCode(this));
    }
}
