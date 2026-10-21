package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avm extends adw {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f53977w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f53978x0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f53979r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f53980s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public avn f53981t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f53982u0;
    public byte[] v0;

    public avm(byte[] bArr, byte[] bArr2, byte[] bArr3, avn avnVar) {
        this.f53980s0 = bArr;
        this.f53981t0 = avnVar;
        this.f53982u0 = bArr2;
        this.v0 = bArr3;
    }

    public static avm setDividerPadding(Object obj) {
        return (avm) setOnFocusChangeListener(new Object[]{obj}, -538996146, 538996150, (int) System.currentTimeMillis());
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16 = ~i12;
        int i17 = ~i10;
        int i18 = ~i11;
        int i19 = (((~(i10 | i18)) | (~(i11 | i17))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i16 | (~(i17 | i18))) * 1324) + (i11 * (-661)) + (i10 * (-661));
        if (i19 == 1) {
            avm avmVar = (avm) objArr[0];
            int i20 = f53978x0;
            int i21 = i20 ^ 73;
            int i22 = (i20 & 73) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f53977w0 = i23 % 128;
            int i24 = i23 % 2;
            byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{avmVar.f53980s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i25 = f53978x0;
            int i26 = i25 & 47;
            int i27 = (i26 - (~((i25 ^ 47) | i26))) - 1;
            f53977w0 = i27 % 128;
            int i28 = i27 % 2;
            return bArr;
        }
        if (i19 == 2) {
            avm avmVar2 = (avm) objArr[0];
            adh adhVar = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avmVar2.f53979r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avmVar2.f53980s0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            avn avnVar = avmVar2.f53981t0;
            if (avnVar != null) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new avn((byte[]) avn.setDividerPadding(new Object[]{avnVar}, -1424884788, 1424884791, System.identityHashCode(avnVar)), (byte[]) avn.setDividerPadding(new Object[]{avnVar}, 1319934164, -1319934162, System.identityHashCode(avnVar)))}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i29 = f53978x0;
                int i30 = (((i29 & (-26)) | ((~i29) & 25)) - (~(-(-((i29 & 25) << 1))))) - 1;
                f53977w0 = i30 % 128;
                i13 = 2;
                int i31 = i30 % 2;
            } else {
                i13 = 2;
            }
            aft aftVar = new aft(avmVar2.f53982u0);
            Object[] objArr2 = new Object[i13];
            objArr2[0] = adhVar;
            objArr2[1] = aftVar;
            adh.setCompoundDrawableTintBlendMode(objArr2, 240298319, -240298315, System.identityHashCode(adhVar));
            aft aftVar2 = new aft(avmVar2.v0);
            Object[] objArr3 = new Object[i13];
            objArr3[0] = adhVar;
            objArr3[1] = aftVar2;
            afv afvVarA = c.a(adhVar, objArr3, 240298319, -240298315, adhVar);
            int i32 = f53978x0;
            int i33 = (i32 & 53) + (i32 | 53);
            f53977w0 = i33 % 128;
            int i34 = i33 % 2;
            return afvVarA;
        }
        if (i19 == 3) {
            avm avmVar3 = (avm) objArr[0];
            int i35 = f53977w0;
            int i36 = i35 & 125;
            int i37 = -(-((i35 ^ 125) | i36));
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            f53978x0 = i38 % 128;
            int i39 = i38 % 2;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{avmVar3.f53982u0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i40 = f53978x0;
            int i41 = ((i40 | 75) << 1) - (i40 ^ 75);
            f53977w0 = i41 % 128;
            int i42 = i41 % 2;
            return bArr2;
        }
        avm avmVar4 = null;
        if (i19 != 4) {
            if (i19 != 5) {
                avm avmVar5 = (avm) objArr[0];
                int i43 = f53977w0;
                int i44 = i43 & 13;
                int i45 = (i44 - (~((i43 ^ 13) | i44))) - 1;
                int i46 = i45 % 128;
                f53978x0 = i46;
                int i47 = i45 % 2;
                avn avnVar2 = avmVar5.f53981t0;
                int i48 = ((i46 | 125) << 1) - (i46 ^ 125);
                f53977w0 = i48 % 128;
                int i49 = i48 % 2;
                return avnVar2;
            }
            avm avmVar6 = (avm) objArr[0];
            int i50 = f53977w0 + 91;
            f53978x0 = i50 % 128;
            int i51 = i50 % 2;
            byte[] bArr3 = avmVar6.v0;
            Object[] objArr4 = new Object[1];
            if (i51 != 0) {
                objArr4[0] = bArr3;
                return (byte[]) bek.setOnFocusChangeListener(objArr4, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            objArr4[0] = bArr3;
            throw null;
        }
        Object obj = objArr[0];
        int i52 = f53977w0;
        int i53 = (i52 ^ 107) + ((i52 & 107) << 1);
        int i54 = i53 % 128;
        f53978x0 = i54;
        if (i53 % 2 == 0) {
            boolean z10 = obj instanceof avm;
            throw null;
        }
        if (obj instanceof avm) {
            int i55 = i52 & 121;
            int i56 = i55 + ((i52 ^ 121) | i55);
            f53978x0 = i56 % 128;
            if (i56 % 2 == 0) {
                throw null;
            }
            avmVar4 = (avm) obj;
        } else {
            if (obj != null) {
                aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                avmVar4 = new avm();
                adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
                int iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
                avmVar4.f53979r0 = iIntValue;
                if (iIntValue != 0) {
                    throw new IllegalArgumentException("unrecognized version");
                }
                ads adsVar = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                avmVar4.f53980s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
                if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() == 5) {
                    avmVar4.f53981t0 = (avn) avn.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(2)}, -469735755, 469735755, (int) System.currentTimeMillis());
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                int i57 = -i15;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i58 = i57 * (-501);
                int i59 = (i58 & 1509) + (i58 | 1509);
                int i60 = ~(((-4) ^ iCurrentTimeMillis) | ((-4) & iCurrentTimeMillis));
                int i61 = ~i57;
                int i62 = (i57 & (-4)) | (i61 & 3);
                int i63 = i57 & 3;
                int i64 = ~((i62 ^ i63) | (i62 & i63));
                int i65 = i60 & i64;
                int i66 = (i64 | i60) & (~i65);
                int i67 = ((i66 & i65) | (i66 ^ i65)) * (-502);
                int i68 = ((i59 | i67) << 1) - (i67 ^ i59);
                int i69 = ~iCurrentTimeMillis;
                int i70 = (i69 & (-4)) | ((-4) ^ i69);
                int i71 = (i70 & i57) | (i70 ^ i57);
                int i72 = ~i71;
                int i73 = ((i71 | i72) & i72) * (-502);
                int i74 = i68 & i73;
                int i75 = (i74 - (~((i73 ^ i68) | i74))) - 1;
                int i76 = i61 ^ iCurrentTimeMillis;
                int i77 = i61 & iCurrentTimeMillis;
                int i78 = ~((i76 & i77) | (i76 ^ i77));
                int i79 = ((~i78) & (-4)) | (i78 & 3);
                int i80 = i78 & (-4);
                int i81 = ((i80 & i79) | (i79 ^ i80)) * 502;
                int i82 = ((~i81) & i75) | ((~i75) & i81);
                int i83 = (i81 & i75) << 1;
                ads adsVar2 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX((i82 ^ i83) + ((i83 & i82) << 1))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                avmVar4.f53982u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i84 = i61 & (-5);
                int i85 = (~i84) & (i61 | (-5));
                int i86 = (i84 & i85) | (i85 ^ i84);
                int i87 = ~iCurrentTimeMillis2;
                int i88 = i86 ^ i87;
                int i89 = i86 & i87;
                int i90 = ~((i89 & i88) | (i88 ^ i89));
                int i91 = i61 & 4;
                int i92 = (i57 & (-5)) | i91;
                int i93 = i57 & 4;
                int i94 = (i92 ^ i93) | (i92 & i93);
                int i95 = ~((i87 & i94) | ((~i94) & iCurrentTimeMillis2) | (i94 & iCurrentTimeMillis2));
                int i96 = i90 ^ i95;
                int i97 = i90 & i95;
                int i98 = (-2) - (((((i57 * 273) - 1084) - (~(-(~(((i97 & i96) | (i96 ^ i97)) * (-272)))))) - 1) ^ (-1));
                int i99 = (~i91) & (i61 | 4);
                int i100 = ~((i99 & i91) | (i99 ^ i91));
                int i101 = (i61 & iCurrentTimeMillis2) | (i61 ^ iCurrentTimeMillis2);
                int i102 = ~i101;
                int i103 = (i101 | i102) & i102;
                int i104 = ((~i103) & i100) | ((~i100) & i103);
                int i105 = i103 & i100;
                int i106 = -(-(((i105 & i104) | (i104 ^ i105)) * (-272)));
                int i107 = i98 & i106;
                int i108 = (i107 - (~((i98 ^ i106) | i107))) - 1;
                int i109 = i57 & iCurrentTimeMillis2;
                int i110 = ~(((iCurrentTimeMillis2 | i57) & (~i109)) | i109);
                int i111 = -(-(((i110 & 4) | ((~i110) & 4) | (i110 & (-5))) * 272));
                ads adsVar3 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(((i108 | i111) << 1) - (i111 ^ i108))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                avmVar4.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar3}, -952512304, 952512305, System.identityHashCode(adsVar3))}, -150521869, 150521882, (int) System.currentTimeMillis());
                i14 = f53978x0 + 69;
            } else {
                int i112 = i54 & 111;
                i14 = (i112 - (~((i54 ^ 111) | i112))) - 1;
            }
            f53977w0 = i14 % 128;
            int i113 = i14 % 2;
        }
        return avmVar4;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -1140632587, 1140632589, System.identityHashCode(this));
    }

    public final byte[] setX() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 610437674, -610437673, System.identityHashCode(this));
    }

    public final avn setY() {
        return (avn) setOnFocusChangeListener(new Object[]{this}, 575576204, -575576204, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -1350132337, 1350132342, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -1003176187, 1003176190, System.identityHashCode(this));
    }
}
