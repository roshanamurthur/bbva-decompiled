package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class ajj extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52889t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52890u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public aiw f52891r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public acz f52892s0;

    public ajj(aiw aiwVar, byte[] bArr) {
        this.f52892s0 = new afk(bArr);
        this.f52891r0 = aiwVar;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (((~i10) | i13) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i13) * (-824)) + (i11 * 825) + (i10 * 1649);
        ajj ajjVar = null;
        if (i14 == 1) {
            ajj ajjVar2 = (ajj) objArr[0];
            int i15 = f52889t0;
            int i16 = ((i15 | 23) << 1) - (i15 ^ 23);
            f52890u0 = i16 % 128;
            int i17 = i16 % 2;
            acz aczVar = ajjVar2.f52892s0;
            if (i17 == 0) {
                throw null;
            }
            int i18 = ((i15 ^ 126) + ((i15 & 126) << 1)) - 1;
            f52890u0 = i18 % 128;
            if (i18 % 2 != 0) {
                return aczVar;
            }
            int i19 = 75 / 0;
            return aczVar;
        }
        if (i14 == 2) {
            ajj ajjVar3 = (ajj) objArr[0];
            int i20 = f52890u0;
            int i21 = i20 + 57;
            f52889t0 = i21 % 128;
            int i22 = i21 % 2;
            aiw aiwVar = ajjVar3.f52891r0;
            if (i22 != 0) {
                throw null;
            }
            int i23 = i20 + 28;
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            f52889t0 = i24 % 128;
            if (i24 % 2 == 0) {
                return aiwVar;
            }
            int i25 = 43 / 0;
            return aiwVar;
        }
        if (i14 == 3) {
            Object obj = objArr[0];
            int i26 = f52890u0;
            int i27 = i26 & 123;
            int i28 = -(-((i26 ^ 123) | i27));
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            int i30 = i29 % 128;
            f52889t0 = i30;
            int i31 = i29 % 2;
            if (!(!(obj instanceof ajj))) {
                int i32 = i30 & 1;
                int i33 = (~i32) & (i30 | 1);
                int i34 = i32 << 1;
                int i35 = (i33 & i34) + (i34 | i33);
                int i36 = i35 % 128;
                f52890u0 = i36;
                int i37 = i35 % 2;
                ajjVar = (ajj) obj;
                int i38 = (i36 & 65) + (i36 | 65);
                f52889t0 = i38 % 128;
                int i39 = i38 % 2;
            } else if (obj != null) {
                aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                ajj ajjVar4 = new ajj();
                if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() != 2) {
                    StringBuilder sb2 = new StringBuilder("Bad sequence size: ");
                    sb2.append(compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode());
                    throw new IllegalArgumentException(sb2.toString());
                }
                Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
                ajjVar4.f52891r0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, 866360717, -866360713, (int) System.currentTimeMillis());
                ajjVar4.f52892s0 = (acz) acz.setDividerPadding(new Object[]{dividerPadding.nextElement()}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                int i40 = f52890u0;
                int i41 = i40 & 53;
                int i42 = (i40 | 53) & (~i41);
                int i43 = i41 << 1;
                int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                f52889t0 = i44 % 128;
                if (i44 % 2 != 0) {
                    throw null;
                }
                ajjVar = ajjVar4;
            } else {
                int i45 = (i26 & 79) + (i26 | 79);
                f52889t0 = i45 % 128;
                if (i45 % 2 != 0) {
                    throw null;
                }
            }
            return ajjVar;
        }
        if (i14 != 4) {
            ajj ajjVar5 = (ajj) objArr[0];
            int i46 = f52889t0 + 89;
            f52890u0 = i46 % 128;
            int i47 = i46 % 2;
            acz aczVar2 = ajjVar5.f52892s0;
            if (i47 != 0) {
                return (ady) ady.setNavigationOnClickListener(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar2}, 541981427, -541981422, System.identityHashCode(aczVar2))}, -1692126728, 1692126730, (int) System.currentTimeMillis());
            }
            int i48 = 60 / 0;
            return (ady) ady.setNavigationOnClickListener(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar2}, 541981427, -541981422, System.identityHashCode(aczVar2))}, -1692126728, 1692126730, (int) System.currentTimeMillis());
        }
        ajj ajjVar6 = (ajj) objArr[0];
        adh adhVar = new adh(2);
        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajjVar6.f52891r0}, 240298319, -240298315, System.identityHashCode(adhVar));
        afv afvVarA = c.a(adhVar, new Object[]{adhVar, ajjVar6.f52892s0}, 240298319, -240298315, adhVar);
        int iIdentityHashCode = System.identityHashCode(ajjVar6);
        int i49 = 617401233 - (~((((-601453168) ^ iIdentityHashCode) | ((-601453168) & iIdentityHashCode)) * (-859)));
        int i50 = ~iIdentityHashCode;
        int i51 = ~((-601453168) | i50);
        int i52 = ((-67502353) & i50) | (67502352 & iIdentityHashCode);
        int i53 = iIdentityHashCode & (-67502353);
        int i54 = ~((i53 & i52) | (i52 ^ i53));
        int i55 = i51 & i54;
        int i56 = (i54 | i51) & (~i55);
        int i57 = ((i56 & i55) | (i56 ^ i55)) * 859;
        int i58 = ((~i57) & i49) | ((~i49) & i57);
        int i59 = (i57 & i49) << 1;
        int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
        int i61 = ~(((~i50) & (-612832084)) | (612832083 & i50) | ((-612832084) & i50));
        int i62 = ((-545329732) & i61) | ((~i61) & 545329731);
        int i63 = i61 & 545329731;
        int i64 = ((i63 & i62) | (i62 ^ i63)) * 859;
        int i65 = i60 ^ i64;
        int i66 = (((i64 & i60) | i65) << 1) - i65;
        int iIdentityHashCode2 = System.identityHashCode(ajjVar6);
        int i67 = ~iIdentityHashCode2;
        int i68 = (2058509552 & i67) | (iIdentityHashCode2 & (-2058509553));
        int i69 = 2058509552 & iIdentityHashCode2;
        int i70 = ~((i68 & i69) | (i68 ^ i69));
        int i71 = ((~i70) & (-2130698231)) | (2130698230 & i70);
        int i72 = i70 & (-2130698231);
        int i73 = ((i72 & i71) | (i71 ^ i72)) * 992;
        int i74 = ((~i73) & (-1163653448)) | (1163653447 & i73);
        int i75 = (i73 & (-1163653448)) << 1;
        int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
        int i77 = (~i69) & (2058509552 | iIdentityHashCode2);
        int i78 = ~((i77 & i69) | (i77 ^ i69));
        int i79 = (-2130698231) & i78;
        int i80 = ((i78 | (-2130698231)) & (~i79)) | i79;
        int i81 = i67 & (i67 | iIdentityHashCode2);
        int i82 = (2058509552 & i81) | ((~i81) & (-2058509553));
        int i83 = i81 & (-2058509553);
        int i84 = (i83 & i82) | (i82 ^ i83);
        int i85 = (351262678 & i84) | ((~i84) & (-351262679));
        int i86 = i84 & (-351262679);
        int i87 = (i86 & i85) | (i85 ^ i86);
        int i88 = ~i87;
        int i89 = (i87 | i88) & i88;
        int i90 = -(~(-(-(((i89 & i80) | (i80 ^ i89)) * (-496)))));
        int i91 = ((i76 ^ i90) + ((i90 & i76) << 1)) - 1;
        int i92 = -(-(((iIdentityHashCode2 & (-351262679)) | ((-351262679) ^ iIdentityHashCode2)) * 496));
        int i93 = i91 & i92;
        int i94 = -(-((i92 ^ i91) | i93));
        if (i66 > ((i93 | i94) << 1) - (i94 ^ i93)) {
            int i95 = 82 / 0;
        }
        return afvVarA;
    }

    public static ajj setY(Object obj) {
        return (ajj) setCompoundDrawableTintBlendMode(new Object[]{obj}, 909154525, -909154522, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 442033137, -442033133, System.identityHashCode(this));
    }

    public final acz setOnFocusChangeListener() {
        return (acz) setCompoundDrawableTintBlendMode(new Object[]{this}, -792808893, 792808894, System.identityHashCode(this));
    }

    public final aiw setX() {
        return (aiw) setCompoundDrawableTintBlendMode(new Object[]{this}, 912478577, -912478575, System.identityHashCode(this));
    }

    public ajj(aiw aiwVar, add addVar) throws IOException {
        this.f52892s0 = new afk(addVar);
        this.f52891r0 = aiwVar;
    }

    public final ady setCompoundDrawableTintBlendMode() throws IOException {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 777066731, -777066731, System.identityHashCode(this));
    }
}
