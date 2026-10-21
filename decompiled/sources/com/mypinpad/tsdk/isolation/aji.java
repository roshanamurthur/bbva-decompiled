package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class aji extends adw {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52882y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ajd f52883r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f52884s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f52885t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ajl f52886u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f52887w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public aed f52888x0;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i10;
        int i14 = i13 | i11;
        int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i16 = ~(i14 | i12);
        int i17 = ~i12;
        int i18 = ((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15;
        int i19 = 4;
        if (i18 == 1) {
            Object obj2 = objArr[0];
            int i20 = f52882y0;
            int i21 = (-2) - ((i20 + 106) ^ (-1));
            E0 = i21 % 128;
            if (i21 % 2 == 0) {
                boolean z10 = obj2 instanceof aji;
                throw null;
            }
            if (!(obj2 instanceof aji)) {
                if (obj2 == null) {
                    int i22 = (i20 & (-26)) | ((~i20) & 25);
                    int i23 = -(-((i20 & 25) << 1));
                    int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                    E0 = i24 % 128;
                    if (i24 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj2);
                aji ajiVar = new aji();
                ajiVar.f52888x0 = compoundDrawableTintBlendMode;
                int i25 = 0;
                while (i25 != compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode()) {
                    aeh aehVar = (aeh) aeh.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(i25)}, -1361475358, 1361475364, (int) System.currentTimeMillis());
                    int iIntValue = ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue();
                    if (iIntValue == 0) {
                        ajiVar.f52883r0 = (ajd) ajd.setOnFocusChangeListener(new Object[]{aehVar}, 1148331213, -1148331213, (int) System.currentTimeMillis());
                    } else if (iIntValue == 1) {
                        adf adfVar = (adf) adf.setDividerPadding(new Object[]{aehVar}, 183106444, -183106435, (int) System.currentTimeMillis());
                        ajiVar.f52884s0 = ((Boolean) adf.setDividerPadding(new Object[]{adfVar}, 1550984628, -1550984623, System.identityHashCode(adfVar))).booleanValue();
                    } else if (iIntValue == 2) {
                        adf adfVar2 = (adf) adf.setDividerPadding(new Object[]{aehVar}, 183106444, -183106435, (int) System.currentTimeMillis());
                        ajiVar.f52885t0 = ((Boolean) adf.setDividerPadding(new Object[]{adfVar2}, 1550984628, -1550984623, System.identityHashCode(adfVar2))).booleanValue();
                    } else if (iIntValue == 3) {
                        ajiVar.f52886u0 = new ajl(acz.setDividerPadding(aehVar));
                    } else if (iIntValue == i19) {
                        adf adfVar3 = (adf) adf.setDividerPadding(new Object[]{aehVar}, 183106444, -183106435, (int) System.currentTimeMillis());
                        ajiVar.v0 = ((Boolean) adf.setDividerPadding(new Object[]{adfVar3}, 1550984628, -1550984623, System.identityHashCode(adfVar3))).booleanValue();
                    } else {
                        if (iIntValue != 5) {
                            throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                        }
                        adf adfVar4 = (adf) adf.setDividerPadding(new Object[]{aehVar}, 183106444, -183106435, (int) System.currentTimeMillis());
                        ajiVar.f52887w0 = ((Boolean) adf.setDividerPadding(new Object[]{adfVar4}, 1550984628, -1550984623, System.identityHashCode(adfVar4))).booleanValue();
                    }
                    int i26 = i25 & (-7);
                    int i27 = (i25 ^ (-7)) | i26;
                    int i28 = (i26 & i27) + (i26 | i27);
                    int i29 = i28 & 8;
                    int i30 = i28 | 8;
                    i25 = ((i29 | i30) << 1) - (i29 ^ i30);
                    compoundDrawableTintBlendMode = compoundDrawableTintBlendMode;
                    i19 = 4;
                }
                int i31 = f52882y0 + 43;
                E0 = i31 % 128;
                if (i31 % 2 != 0) {
                    return ajiVar;
                }
                throw null;
            }
            obj = (aji) obj2;
            int i32 = i20 ^ 15;
            int i33 = ((((i20 & 15) | i32) << 1) - (~(-i32))) - 1;
            E0 = i33 % 128;
            int i34 = i33 % 2;
        } else {
            if (i18 == 2) {
                aji ajiVar2 = (aji) objArr[0];
                String str = (String) bez.setX(new Object[0], 464644689, -464644689, (int) System.currentTimeMillis());
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("IssuingDistributionPoint: [");
                stringBuffer.append(str);
                ajd ajdVar = ajiVar2.f52883r0;
                if (ajdVar != null) {
                    int i35 = f52882y0;
                    int i36 = ((i35 ^ 9) | (i35 & 9)) << 1;
                    int i37 = -(((~i35) & 9) | (i35 & (-10)));
                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                    E0 = i38 % 128;
                    if (i38 % 2 == 0) {
                        setCompoundDrawableTintBlendMode(new Object[]{stringBuffer, str, "distributionPoint", ajdVar.toString()}, 719743548, -719743545, (int) System.currentTimeMillis());
                        throw null;
                    }
                    setCompoundDrawableTintBlendMode(new Object[]{stringBuffer, str, "distributionPoint", ajdVar.toString()}, 719743548, -719743545, (int) System.currentTimeMillis());
                    int i39 = f52882y0;
                    int i40 = ((i39 & 90) + (i39 | 90)) - 1;
                    E0 = i40 % 128;
                    int i41 = i40 % 2;
                }
                boolean z11 = ajiVar2.f52884s0;
                if (!(!z11)) {
                    int i42 = E0;
                    int i43 = ((i42 ^ 35) | (i42 & 35)) << 1;
                    int i44 = -(((~i42) & 35) | (i42 & (-36)));
                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                    f52882y0 = i45 % 128;
                    int i46 = i45 % 2;
                    setCompoundDrawableTintBlendMode(new Object[]{stringBuffer, str, "onlyContainsUserCerts", (String) setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(z11)}, 1814737471, -1814737466, (int) System.currentTimeMillis())}, 719743548, -719743545, (int) System.currentTimeMillis());
                    int i47 = f52882y0;
                    int i48 = (i47 ^ 114) + ((i47 & 114) << 1);
                    int i49 = (i48 ^ (-1)) + (i48 << 1);
                    E0 = i49 % 128;
                    int i50 = i49 % 2;
                }
                boolean z12 = ajiVar2.f52885t0;
                if (z12) {
                    int i51 = E0;
                    int i52 = i51 & 113;
                    int i53 = (((i51 ^ 113) | i52) << 1) - ((i51 | 113) & (~i52));
                    f52882y0 = i53 % 128;
                    if (i53 % 2 != 0) {
                        setCompoundDrawableTintBlendMode(new Object[]{stringBuffer, str, "onlyContainsCACerts", (String) setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(z12)}, 1814737471, -1814737466, (int) System.currentTimeMillis())}, 719743548, -719743545, (int) System.currentTimeMillis());
                        int i54 = 19 / 0;
                    } else {
                        setCompoundDrawableTintBlendMode(new Object[]{stringBuffer, str, "onlyContainsCACerts", (String) setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(z12)}, 1814737471, -1814737466, (int) System.currentTimeMillis())}, 719743548, -719743545, (int) System.currentTimeMillis());
                    }
                    int i55 = E0;
                    int i56 = (((i55 | 34) << 1) - (i55 ^ 34)) - 1;
                    f52882y0 = i56 % 128;
                    int i57 = i56 % 2;
                }
                ajl ajlVar = ajiVar2.f52886u0;
                if (ajlVar != null) {
                    int i58 = E0 + 49;
                    f52882y0 = i58 % 128;
                    int i59 = i58 % 2;
                    setCompoundDrawableTintBlendMode(new Object[]{stringBuffer, str, "onlySomeReasons", ajlVar.toString()}, 719743548, -719743545, (int) System.currentTimeMillis());
                    int i60 = f52882y0;
                    int i61 = ((i60 ^ 5) | (i60 & 5)) << 1;
                    int i62 = -(((~i60) & 5) | (i60 & (-6)));
                    int i63 = (i61 & i62) + (i62 | i61);
                    E0 = i63 % 128;
                    int i64 = i63 % 2;
                }
                boolean z13 = ajiVar2.f52887w0;
                if (z13) {
                    int i65 = E0;
                    int i66 = i65 & 7;
                    int i67 = i66 + ((i65 ^ 7) | i66);
                    f52882y0 = i67 % 128;
                    if (i67 % 2 != 0) {
                        setCompoundDrawableTintBlendMode(new Object[]{stringBuffer, str, "onlyContainsAttributeCerts", (String) setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(z13)}, 1814737471, -1814737466, (int) System.currentTimeMillis())}, 719743548, -719743545, (int) System.currentTimeMillis());
                        throw null;
                    }
                    setCompoundDrawableTintBlendMode(new Object[]{stringBuffer, str, "onlyContainsAttributeCerts", (String) setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(z13)}, 1814737471, -1814737466, (int) System.currentTimeMillis())}, 719743548, -719743545, (int) System.currentTimeMillis());
                    int i68 = f52882y0 + 103;
                    E0 = i68 % 128;
                    int i69 = i68 % 2;
                }
                boolean z14 = ajiVar2.v0;
                if (z14) {
                    int i70 = f52882y0;
                    int i71 = i70 & 19;
                    int i72 = (i70 ^ 19) | i71;
                    int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                    E0 = i73 % 128;
                    int i74 = i73 % 2;
                    setCompoundDrawableTintBlendMode(new Object[]{stringBuffer, str, "indirectCRL", (String) setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(z14)}, 1814737471, -1814737466, (int) System.currentTimeMillis())}, 719743548, -719743545, (int) System.currentTimeMillis());
                    int i75 = f52882y0;
                    int i76 = (i75 ^ 23) + ((i75 & 23) << 1);
                    E0 = i76 % 128;
                    int i77 = i76 % 2;
                }
                stringBuffer.append(Constant.BRACKET_CLOSE);
                stringBuffer.append(str);
                String string = stringBuffer.toString();
                int i78 = f52882y0 + 119;
                E0 = i78 % 128;
                int i79 = i78 % 2;
                return string;
            }
            if (i18 == 3) {
                StringBuffer stringBuffer2 = (StringBuffer) objArr[0];
                String str2 = (String) objArr[1];
                String str3 = (String) objArr[2];
                String str4 = (String) objArr[3];
                int i80 = f52882y0;
                int i81 = i80 & 77;
                int i82 = ((i80 ^ 77) | i81) << 1;
                int i83 = -((i80 | 77) & (~i81));
                int i84 = (i82 & i83) + (i83 | i82);
                E0 = i84 % 128;
                int i85 = i84 % 2;
                stringBuffer2.append("    ");
                stringBuffer2.append(str3);
                stringBuffer2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                stringBuffer2.append(str2);
                stringBuffer2.append("    ");
                stringBuffer2.append("    ");
                stringBuffer2.append(str4);
                stringBuffer2.append(str2);
                int i86 = E0;
                int i87 = ((i86 ^ 123) | (i86 & 123)) << 1;
                int i88 = -(((~i86) & 123) | (i86 & (-124)));
                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                f52882y0 = i89 % 128;
                int i90 = i89 % 2;
                return null;
            }
            if (i18 == 4) {
                aji ajiVar3 = (aji) objArr[0];
                int i91 = f52882y0;
                int i92 = i91 & 43;
                int i93 = i92 + ((i91 ^ 43) | i92);
                E0 = i93 % 128;
                int i94 = i93 % 2;
                boolean z15 = ajiVar3.v0;
                int i95 = ((i91 | 5) << 1) - (i91 ^ 5);
                E0 = i95 % 128;
                int i96 = i95 % 2;
                return Boolean.valueOf(z15);
            }
            if (i18 != 5) {
                aji ajiVar4 = (aji) objArr[0];
                int i97 = E0;
                int i98 = i97 & 59;
                int i99 = (~i98) & (i97 | 59);
                int i100 = -(-(i98 << 1));
                int i101 = (i99 & i100) + (i100 | i99);
                f52882y0 = i101 % 128;
                int i102 = i101 % 2;
                aed aedVar = ajiVar4.f52888x0;
                int i103 = ((i97 & (-12)) | ((~i97) & 11)) + ((i97 & 11) << 1);
                f52882y0 = i103 % 128;
                int i104 = i103 % 2;
                return aedVar;
            }
            boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
            int i105 = E0;
            int i106 = i105 & 13;
            int i107 = (((i105 ^ 13) | i106) << 1) - ((i105 | 13) & (~i106));
            int i108 = i107 % 128;
            f52882y0 = i108;
            if (i107 % 2 != 0) {
                throw null;
            }
            if (!zBooleanValue) {
                int i109 = ((i108 | 47) << 1) - (i108 ^ 47);
                E0 = i109 % 128;
                if (i109 % 2 == 0) {
                    int i110 = 82 / 0;
                }
                return "false";
            }
            int i111 = i108 + 79;
            E0 = i111 % 128;
            obj = "true";
            if (i111 % 2 == 0) {
                int i112 = 14 / 0;
            }
        }
        return obj;
    }

    public static aji setY(Object obj) {
        return (aji) setCompoundDrawableTintBlendMode(new Object[]{obj}, -1073045403, 1073045404, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 978052360, -978052360, System.identityHashCode(this));
    }

    public final boolean setDividerPadding() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -959008302, 959008306, System.identityHashCode(this))).booleanValue();
    }

    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1054957771, 1054957773, System.identityHashCode(this));
    }
}
