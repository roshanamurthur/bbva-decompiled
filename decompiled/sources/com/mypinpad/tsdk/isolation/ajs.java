package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class ajs extends adw {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52927w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52928x0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final adp f52929r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final adp f52930s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final adp f52931t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final adp f52932u0;
    public final ajt v0;

    public ajs(aed aedVar) {
        if (aedVar.setCompoundDrawableTintBlendMode() < 3 || aedVar.setCompoundDrawableTintBlendMode() > 5) {
            StringBuilder sb2 = new StringBuilder("Bad sequence size: ");
            sb2.append(aedVar.setCompoundDrawableTintBlendMode());
            throw new IllegalArgumentException(sb2.toString());
        }
        Enumeration dividerPadding = aedVar.setDividerPadding();
        this.f52929r0 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
        this.f52930s0 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
        this.f52931t0 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
        add addVar = (add) setY(new Object[]{dividerPadding}, 1708183742, -1708183735, (int) System.currentTimeMillis());
        if (addVar == null || !(addVar instanceof adp)) {
            this.f52932u0 = null;
        } else {
            this.f52932u0 = (adp) adp.setOnFocusChangeListener(new Object[]{addVar}, -837021952, 837021958, (int) System.currentTimeMillis());
            addVar = (add) setY(new Object[]{dividerPadding}, 1708183742, -1708183735, (int) System.currentTimeMillis());
        }
        if (addVar != null) {
            this.v0 = (ajt) ajt.setCompoundDrawableTintBlendMode(new Object[]{addVar.UiMessageCallbackKtWhenMappings()}, -794632281, 794632281, (int) System.currentTimeMillis());
        } else {
            this.v0 = null;
        }
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object afvVar;
        int i13;
        int i14 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ~(i15 | i16 | i12);
        int i18 = ~i12;
        int i19 = i16 | i18;
        int i20 = (((~(i10 | i18)) | (~(i16 | i10)) | (~i19)) * 50) + ((i17 | (~(i19 | i10))) * 50) + i14;
        add addVar = null;
        switch (i20) {
            case 1:
                ajs ajsVar = (ajs) objArr[0];
                adh adhVar = new adh(5);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajsVar.f52929r0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajsVar.f52930s0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajsVar.f52931t0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adp adpVar = ajsVar.f52932u0;
                if (adpVar != null) {
                    int i21 = f52928x0;
                    int i22 = i21 & 21;
                    int i23 = -(-((i21 ^ 21) | i22));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    f52927w0 = i24 % 128;
                    Object[] objArr2 = new Object[2];
                    if (i24 % 2 != 0) {
                        objArr2[0] = adhVar;
                        objArr2[1] = adpVar;
                        adh.setCompoundDrawableTintBlendMode(objArr2, 240298319, -240298315, System.identityHashCode(adhVar));
                        int i25 = 89 / 0;
                    } else {
                        objArr2[0] = adhVar;
                        objArr2[1] = adpVar;
                        adh.setCompoundDrawableTintBlendMode(objArr2, 240298319, -240298315, System.identityHashCode(adhVar));
                    }
                    int i26 = f52928x0;
                    int i27 = i26 & 73;
                    int i28 = ((((i26 ^ 73) | i27) << 1) - (~(-((i26 | 73) & (~i27))))) - 1;
                    f52927w0 = i28 % 128;
                    int i29 = i28 % 2;
                }
                ajt ajtVar = ajsVar.v0;
                if (ajtVar != null) {
                    int i30 = f52927w0;
                    int i31 = i30 ^ 109;
                    int i32 = (((i30 & 109) | i31) << 1) - i31;
                    f52928x0 = i32 % 128;
                    int i33 = i32 % 2;
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajtVar}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i34 = f52927w0;
                    int i35 = (-2) - ((((i34 | 88) << 1) - (i34 ^ 88)) ^ (-1));
                    f52928x0 = i35 % 128;
                    int i36 = i35 % 2;
                }
                afvVar = new afv(adhVar);
                int i37 = f52928x0 + 37;
                f52927w0 = i37 % 128;
                if (i37 % 2 != 0) {
                    throw null;
                }
                break;
            case 2:
                Object obj = objArr[0];
                int i38 = f52928x0;
                int i39 = ((i38 | 3) << 1) - (i38 ^ 3);
                int i40 = i39 % 128;
                f52927w0 = i40;
                int i41 = i39 % 2;
                if (obj instanceof ajs) {
                    int i42 = i40 & 125;
                    int i43 = (((i40 | 125) & (~i42)) - (~(i42 << 1))) - 1;
                    int i44 = i43 % 128;
                    f52928x0 = i44;
                    int i45 = i43 % 2;
                    ajs ajsVar2 = (ajs) obj;
                    int i46 = (i44 & 125) + (i44 | 125);
                    f52927w0 = i46 % 128;
                    int i47 = i46 % 2;
                    return ajsVar2;
                }
                if (obj == null) {
                    int i48 = (i40 ^ 112) + ((i40 & 112) << 1);
                    int i49 = (i48 ^ (-1)) + (i48 << 1);
                    f52928x0 = i49 % 128;
                    if (i49 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                ajs ajsVar3 = new ajs(aed.setCompoundDrawableTintBlendMode(obj));
                int i50 = f52928x0;
                int i51 = i50 & 77;
                int i52 = ((i50 | 77) & (~i51)) + (i51 << 1);
                f52927w0 = i52 % 128;
                if (i52 % 2 == 0) {
                    return ajsVar3;
                }
                throw null;
            case 3:
                ajs ajsVar4 = (ajs) objArr[0];
                int i53 = f52927w0;
                int i54 = ((i53 ^ 115) | (i53 & 115)) << 1;
                int i55 = -(((~i53) & 115) | (i53 & (-116)));
                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                f52928x0 = i56 % 128;
                int i57 = i56 % 2;
                adp adpVar2 = ajsVar4.f52929r0;
                BigInteger bigInteger = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar2}, 446421226, -446421218, System.identityHashCode(adpVar2));
                int i58 = f52927w0;
                int i59 = (i58 ^ 57) + ((i58 & 57) << 1);
                f52928x0 = i59 % 128;
                int i60 = i59 % 2;
                return bigInteger;
            case 4:
                ajs ajsVar5 = (ajs) objArr[0];
                int i61 = f52928x0;
                int i62 = i61 & 97;
                int i63 = ((i61 ^ 97) | i62) << 1;
                int i64 = -((i61 | 97) & (~i62));
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                f52927w0 = i65 % 128;
                int i66 = i65 % 2;
                adp adpVar3 = ajsVar5.f52931t0;
                BigInteger bigInteger2 = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar3}, 446421226, -446421218, System.identityHashCode(adpVar3));
                int i67 = f52928x0;
                int i68 = i67 & 119;
                int i69 = ((((i67 ^ 119) | i68) << 1) - (~(-((i67 | 119) & (~i68))))) - 1;
                f52927w0 = i69 % 128;
                int i70 = i69 % 2;
                return bigInteger2;
            case 5:
                ajs ajsVar6 = (ajs) objArr[0];
                int i71 = f52928x0;
                int i72 = i71 & 9;
                int i73 = (((i71 ^ 9) | i72) << 1) - ((i71 | 9) & (~i72));
                f52927w0 = i73 % 128;
                int i74 = i73 % 2;
                adp adpVar4 = ajsVar6.f52930s0;
                afvVar = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar4}, 446421226, -446421218, System.identityHashCode(adpVar4));
                int i75 = f52927w0;
                int i76 = (i75 | 17) << 1;
                int i77 = -(i75 ^ 17);
                int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                f52928x0 = i78 % 128;
                if (i78 % 2 == 0) {
                    throw null;
                }
                break;
            case 6:
                ajs ajsVar7 = (ajs) objArr[0];
                int i79 = f52927w0;
                int i80 = (i79 & 123) + (i79 | 123);
                int i81 = i80 % 128;
                f52928x0 = i81;
                int i82 = i80 % 2;
                afvVar = ajsVar7.v0;
                if (i82 == 0) {
                    int i83 = 60 / 0;
                }
                int i84 = ((i81 | 83) << 1) - (i81 ^ 83);
                f52927w0 = i84 % 128;
                if (i84 % 2 != 0) {
                    throw null;
                }
                break;
            case 7:
                Enumeration enumeration = (Enumeration) objArr[0];
                int i85 = (-2) - ((f52928x0 + 102) ^ (-1));
                f52927w0 = i85 % 128;
                if (i85 % 2 != 0) {
                    enumeration.hasMoreElements();
                    throw null;
                }
                if (!enumeration.hasMoreElements()) {
                    i13 = f52927w0 + 21;
                    f52928x0 = i13 % 128;
                } else {
                    int i86 = f52928x0 + 15;
                    f52927w0 = i86 % 128;
                    int i87 = i86 % 2;
                    Object objNextElement = enumeration.nextElement();
                    if (i87 != 0) {
                        throw null;
                    }
                    addVar = (add) objNextElement;
                    i13 = f52928x0 + 111;
                    f52927w0 = i13 % 128;
                }
                int i88 = i13 % 2;
                return addVar;
            default:
                ajs ajsVar8 = (ajs) objArr[0];
                int i89 = f52928x0;
                int i90 = i89 & 81;
                int i91 = i89 | 81;
                int i92 = ((i90 | i91) << 1) - (i90 ^ i91);
                f52927w0 = i92 % 128;
                int i93 = i92 % 2;
                adp adpVar5 = ajsVar8.f52932u0;
                if (adpVar5 == null) {
                    int i94 = (i89 ^ 107) + ((i89 & 107) << 1);
                    int i95 = i94 % 128;
                    f52927w0 = i95;
                    if (i94 % 2 != 0) {
                        int i96 = 47 / 0;
                    }
                    int i97 = i95 + 53;
                    f52928x0 = i97 % 128;
                    if (i97 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                afvVar = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar5}, 446421226, -446421218, System.identityHashCode(adpVar5));
                int i98 = f52927w0;
                int i99 = i98 & 115;
                int i100 = i98 | 115;
                int i101 = (i99 & i100) + (i100 | i99);
                f52928x0 = i101 % 128;
                if (i101 % 2 == 0) {
                    throw null;
                }
                break;
        }
        return afvVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, 571221187, -571221186, System.identityHashCode(this));
    }

    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setY(new Object[]{this}, -327654908, 327654911, System.identityHashCode(this));
    }

    public final BigInteger setDividerPadding() {
        return (BigInteger) setY(new Object[]{this}, 1670427418, -1670427414, System.identityHashCode(this));
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setY(new Object[]{this}, -171671074, 171671074, System.identityHashCode(this));
    }

    public final ajt setX() {
        return (ajt) setY(new Object[]{this}, -2133152458, 2133152464, System.identityHashCode(this));
    }

    public static ajs setOnFocusChangeListener(Object obj) {
        return (ajs) setY(new Object[]{obj}, -532838143, 532838145, (int) System.currentTimeMillis());
    }

    public final BigInteger setY() {
        return (BigInteger) setY(new Object[]{this}, -860916433, 860916438, System.identityHashCode(this));
    }
}
