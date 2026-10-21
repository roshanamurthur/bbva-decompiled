package com.mypinpad.tsdk.isolation;

import androidx.emoji2.text.flatbuffer.a;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class ajf extends adw {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52871u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ajd f52872r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ajl f52873s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ajh f52874t0;

    public static ajf setDividerPadding(Object obj) {
        return (ajf) setOnFocusChangeListener(new Object[]{obj}, -648552251, 648552251, (int) System.currentTimeMillis());
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i12 | i11);
        int i15 = (((~(i10 | (~i11))) | (~(i13 | i11))) * 110) + ((i14 | (~(i10 | i11))) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109));
        if (i15 == 1) {
            ajf ajfVar = (ajf) objArr[0];
            String str = (String) bez.setX(new Object[0], 464644689, -464644689, (int) System.currentTimeMillis());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("DistributionPoint: [");
            stringBuffer.append(str);
            ajd ajdVar = ajfVar.f52872r0;
            if (ajdVar != null) {
                int i16 = f52871u0;
                int i17 = i16 & 41;
                int i18 = ((i16 ^ 41) | i17) << 1;
                int i19 = -((i16 | 41) & (~i17));
                int i20 = (i18 & i19) + (i19 | i18);
                v0 = i20 % 128;
                int i21 = i20 % 2;
                setOnFocusChangeListener(new Object[]{stringBuffer, str, "distributionPoint", ajdVar.toString()}, 2083038060, -2083038058, (int) System.currentTimeMillis());
                int i22 = f52871u0;
                int i23 = i22 | 19;
                int i24 = i23 << 1;
                int i25 = -((~(i22 & 19)) & i23);
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                v0 = i26 % 128;
                int i27 = i26 % 2;
            }
            ajl ajlVar = ajfVar.f52873s0;
            if (ajlVar != null) {
                int i28 = f52871u0 + 33;
                v0 = i28 % 128;
                int i29 = i28 % 2;
                String string = ajlVar.toString();
                if (i29 == 0) {
                    setOnFocusChangeListener(new Object[]{stringBuffer, str, "reasons", string}, 2083038060, -2083038058, (int) System.currentTimeMillis());
                    int i30 = 77 / 0;
                } else {
                    setOnFocusChangeListener(new Object[]{stringBuffer, str, "reasons", string}, 2083038060, -2083038058, (int) System.currentTimeMillis());
                }
                int i31 = v0;
                int i32 = i31 & 115;
                int i33 = (i32 - (~((i31 ^ 115) | i32))) - 1;
                f52871u0 = i33 % 128;
                int i34 = i33 % 2;
            }
            ajh ajhVar = ajfVar.f52874t0;
            if (ajhVar != null) {
                int i35 = f52871u0 + 101;
                v0 = i35 % 128;
                int i36 = i35 % 2;
                String string2 = ajhVar.toString();
                if (i36 == 0) {
                    setOnFocusChangeListener(new Object[]{stringBuffer, str, "cRLIssuer", string2}, 2083038060, -2083038058, (int) System.currentTimeMillis());
                    throw null;
                }
                setOnFocusChangeListener(new Object[]{stringBuffer, str, "cRLIssuer", string2}, 2083038060, -2083038058, (int) System.currentTimeMillis());
                int i37 = v0;
                int i38 = i37 & 73;
                int i39 = ((i37 ^ 73) | i38) << 1;
                int i40 = -((i37 | 73) & (~i38));
                int i41 = (i39 & i40) + (i40 | i39);
                f52871u0 = i41 % 128;
                int i42 = i41 % 2;
            }
            stringBuffer.append(Constant.BRACKET_CLOSE);
            stringBuffer.append(str);
            String string3 = stringBuffer.toString();
            int i43 = f52871u0 + 75;
            v0 = i43 % 128;
            int i44 = i43 % 2;
            return string3;
        }
        if (i15 == 2) {
            StringBuffer stringBuffer2 = (StringBuffer) objArr[0];
            String str2 = (String) objArr[1];
            String str3 = (String) objArr[2];
            String str4 = (String) objArr[3];
            int i45 = f52871u0;
            int i46 = ((i45 ^ 27) | (i45 & 27)) << 1;
            int i47 = -(((~i45) & 27) | (i45 & (-28)));
            int i48 = (i46 & i47) + (i47 | i46);
            v0 = i48 % 128;
            int i49 = i48 % 2;
            stringBuffer2.append("    ");
            stringBuffer2.append(str3);
            stringBuffer2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            stringBuffer2.append(str2);
            stringBuffer2.append("    ");
            stringBuffer2.append("    ");
            stringBuffer2.append(str4);
            stringBuffer2.append(str2);
            int i50 = f52871u0;
            int i51 = i50 ^ 101;
            int i52 = (((i50 & 101) | i51) << 1) - i51;
            v0 = i52 % 128;
            if (i52 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i15 == 3) {
            ajf ajfVar2 = (ajf) objArr[0];
            adh adhVar = new adh(3);
            ajd ajdVar2 = ajfVar2.f52872r0;
            if (ajdVar2 != null) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(ajdVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i53 = v0;
                int i54 = i53 | 77;
                int i55 = (i54 << 1) - ((~(i53 & 77)) & i54);
                f52871u0 = i55 % 128;
                int i56 = i55 % 2;
            }
            ajl ajlVar2 = ajfVar2.f52873s0;
            if (ajlVar2 != null) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(false, 1, ajlVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i57 = f52871u0 + 83;
                v0 = i57 % 128;
                int i58 = i57 % 2;
            }
            ajh ajhVar2 = ajfVar2.f52874t0;
            if (ajhVar2 != null) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(false, 2, ajhVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i59 = f52871u0;
                int i60 = i59 ^ 87;
                int i61 = (((i59 & 87) | i60) << 1) - i60;
                v0 = i61 % 128;
                int i62 = i61 % 2;
            }
            afv afvVar = new afv(adhVar);
            int i63 = v0;
            int i64 = i63 & 5;
            int i65 = (((i63 ^ 5) | i64) << 1) - ((i63 | 5) & (~i64));
            f52871u0 = i65 % 128;
            int i66 = i65 % 2;
            return afvVar;
        }
        Object obj = objArr[0];
        int i67 = f52871u0;
        int i68 = (i67 ^ 109) + ((i67 & 109) << 1);
        v0 = i68 % 128;
        if (i68 % 2 == 0) {
            throw null;
        }
        if (obj == null || (obj instanceof ajf)) {
            ajf ajfVar3 = (ajf) obj;
            int i69 = i67 & 121;
            int i70 = (i67 ^ 121) | i69;
            int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
            v0 = i71 % 128;
            if (i71 % 2 != 0) {
                return ajfVar3;
            }
            throw null;
        }
        if (!(obj instanceof aed)) {
            throw new IllegalArgumentException(a.c(obj, "Invalid DistributionPoint: "));
        }
        aed aedVar = (aed) obj;
        ajf ajfVar4 = new ajf();
        for (int i72 = 0; i72 != aedVar.setCompoundDrawableTintBlendMode(); i72++) {
            aeh aehVar = (aeh) aeh.setOnFocusChangeListener(new Object[]{aedVar.setX(i72)}, -1361475358, 1361475364, (int) System.currentTimeMillis());
            int iIntValue = ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue();
            if (iIntValue == 0) {
                ajfVar4.f52872r0 = (ajd) ajd.setOnFocusChangeListener(new Object[]{aehVar}, 1148331213, -1148331213, (int) System.currentTimeMillis());
            } else if (iIntValue == 1) {
                ajfVar4.f52873s0 = new ajl(acz.setDividerPadding(aehVar));
            } else {
                if (iIntValue != 2) {
                    StringBuilder sb2 = new StringBuilder("Unknown tag encountered in structure: ");
                    sb2.append(aehVar.setCompoundDrawableTintBlendMode());
                    throw new IllegalArgumentException(sb2.toString());
                }
                ajfVar4.f52874t0 = (ajh) ajh.setDividerPadding(new Object[]{aehVar}, -875421438, 875421442, (int) System.currentTimeMillis());
            }
        }
        int i73 = f52871u0;
        int i74 = i73 & 117;
        int i75 = (i74 - (~((i73 ^ 117) | i74))) - 1;
        v0 = i75 % 128;
        int i76 = i75 % 2;
        return ajfVar4;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, 393880201, -393880198, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1014046011, 1014046012, System.identityHashCode(this));
    }
}
