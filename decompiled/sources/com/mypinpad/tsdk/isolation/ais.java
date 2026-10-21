package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;

/* JADX INFO: loaded from: classes10.dex */
public final class ais extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52812s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52813t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public aed f52814r0;

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        int i20 = (((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16;
        int i21 = 0;
        if (i20 == 1) {
            Object obj2 = objArr[0];
            int i22 = f52813t0;
            int i23 = (i22 & (-96)) | ((~i22) & 95);
            int i24 = (i22 & 95) << 1;
            int i25 = (i23 & i24) + (i23 | i24);
            f52812s0 = i25 % 128;
            if (i25 % 2 != 0) {
                throw null;
            }
            if (obj2 == null) {
                int i26 = i22 ^ 47;
                int i27 = (((i22 & 47) | i26) << 1) - i26;
                f52812s0 = i27 % 128;
                int i28 = i27 % 2;
                return null;
            }
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj2);
            ais aisVar = new ais();
            aisVar.f52814r0 = compoundDrawableTintBlendMode;
            int i29 = f52813t0 + 109;
            f52812s0 = i29 % 128;
            int i30 = i29 % 2;
            obj = aisVar;
        } else {
            if (i20 == 2) {
                ais aisVar2 = (ais) objArr[0];
                StringBuffer stringBuffer = new StringBuffer("CRLDistPoint:");
                String str = (String) bez.setX(new Object[0], 464644689, -464644689, (int) System.currentTimeMillis());
                stringBuffer.append(str);
                ajf[] ajfVarArr = (ajf[]) setDividerPadding(new Object[]{aisVar2}, -1799462088, 1799462091, System.identityHashCode(aisVar2));
                int i31 = f52812s0 + 115;
                f52813t0 = i31 % 128;
                int i32 = i31 % 2;
                while (i21 != ajfVarArr.length) {
                    int i33 = f52812s0;
                    int i34 = (i33 ^ 86) + ((i33 & 86) << 1);
                    int i35 = (i34 ^ (-1)) + (i34 << 1);
                    f52813t0 = i35 % 128;
                    int i36 = i35 % 2;
                    stringBuffer.append("    ");
                    if (i36 == 0) {
                        stringBuffer.append(ajfVarArr[i21]);
                        stringBuffer.append(str);
                        int i37 = ((-1) << 1) - (((i21 & 69) + (i21 | 69)) ^ (-1));
                        int i38 = i37 & 52;
                        int i39 = (i37 ^ 52) | i38;
                        i21 = (i38 & i39) + (i39 | i38);
                    } else {
                        stringBuffer.append(ajfVarArr[i21]);
                        stringBuffer.append(str);
                        int i40 = ((i21 ^ 83) | (i21 & 83)) << 1;
                        int i41 = -(((~i21) & 83) | (i21 & (-84)));
                        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                        int i43 = i42 & (-82);
                        i21 = i43 + ((i42 ^ (-82)) | i43);
                    }
                    int i44 = f52812s0;
                    int i45 = (i44 & 33) + (i44 | 33);
                    f52813t0 = i45 % 128;
                    int i46 = i45 % 2;
                }
                String string = stringBuffer.toString();
                int i47 = f52812s0;
                int i48 = (i47 ^ 81) + ((i47 & 81) << 1);
                f52813t0 = i48 % 128;
                int i49 = i48 % 2;
                return string;
            }
            if (i20 != 3) {
                ais aisVar3 = (ais) objArr[0];
                int i50 = f52812s0;
                int i51 = (((i50 | 16) << 1) - (i50 ^ 16)) - 1;
                f52813t0 = i51 % 128;
                int i52 = i51 % 2;
                aed aedVar = aisVar3.f52814r0;
                int i53 = ((-1) << 1) - (((i50 & 94) + (i50 | 94)) ^ (-1));
                f52813t0 = i53 % 128;
                int i54 = i53 % 2;
                return aedVar;
            }
            ais aisVar4 = (ais) objArr[0];
            int i55 = f52812s0;
            int i56 = (((i55 | 90) << 1) - (i55 ^ 90)) - 1;
            f52813t0 = i56 % 128;
            int i57 = i56 % 2;
            ajf[] ajfVarArr2 = new ajf[aisVar4.f52814r0.setCompoundDrawableTintBlendMode()];
            int i58 = f52812s0;
            int i59 = (((i58 | 22) << 1) - (i58 ^ 22)) - 1;
            f52813t0 = i59 % 128;
            int i60 = i59 % 2;
            int i61 = 0;
            while (i61 != aisVar4.f52814r0.setCompoundDrawableTintBlendMode()) {
                int i62 = f52813t0;
                int i63 = i62 | 33;
                int i64 = ((i63 << 1) - (~(-((~(i62 & 33)) & i63)))) - 1;
                f52812s0 = i64 % 128;
                int i65 = i64 % 2;
                aed aedVar2 = aisVar4.f52814r0;
                if (i65 != 0) {
                    ajfVarArr2[i61] = (ajf) ajf.setOnFocusChangeListener(new Object[]{aedVar2.setX(i61)}, -648552251, 648552251, (int) System.currentTimeMillis());
                    int i66 = i61 & 84;
                    int i67 = ((i61 ^ 84) | i66) << 1;
                    int i68 = -((i61 | 84) & (~i66));
                    int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                    int i70 = i69 & (-37);
                    i61 = (i70 - (~((i69 ^ (-37)) | i70))) - 1;
                } else {
                    ajfVarArr2[i61] = (ajf) ajf.setOnFocusChangeListener(new Object[]{aedVar2.setX(i61)}, -648552251, 648552251, (int) System.currentTimeMillis());
                    int i71 = i61 & (-120);
                    int i72 = -(-((i61 ^ (-120)) | i71));
                    int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                    i61 = ((i73 | 121) << 1) - (i73 ^ 121);
                }
            }
            int i74 = f52813t0;
            int i75 = i74 & 69;
            int i76 = -(-(i74 | 69));
            int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
            f52812s0 = i77 % 128;
            int i78 = i77 % 2;
            obj = ajfVarArr2;
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, -1900869396, 1900869396, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, -1668976746, 1668976748, System.identityHashCode(this));
    }

    public static ais setDividerPadding(Object obj) {
        return (ais) setDividerPadding(new Object[]{obj}, -1830307896, 1830307897, (int) System.currentTimeMillis());
    }
}
