package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class avt extends adw {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54004w0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f54005r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f54006s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f54007t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public avs f54008u0;

    public avt(byte[] bArr, byte[] bArr2, avs avsVar) {
        this.f54006s0 = bArr;
        this.f54007t0 = bArr2;
        this.f54008u0 = avsVar;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        avt avtVar;
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i10 | i11)) * 933) + (((~(i13 | i10)) | (~(i13 | i15))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934);
        if (i16 == 1) {
            avt avtVar2 = (avt) objArr[0];
            adh adhVar = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avtVar2.f54005r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avtVar2.f54006s0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avtVar2.f54007t0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            avs avsVar = avtVar2.f54008u0;
            if (avsVar != null) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new avs((byte[]) avs.setDividerPadding(new Object[]{avsVar}, -1584478043, 1584478043, System.identityHashCode(avsVar)), (byte[]) avs.setDividerPadding(new Object[]{avsVar}, -402634163, 402634166, System.identityHashCode(avsVar)))}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i17 = f54004w0;
                int i18 = (i17 & 65) + (i17 | 65);
                v0 = i18 % 128;
                int i19 = i18 % 2;
            }
            afv afvVar = new afv(adhVar);
            int i20 = f54004w0;
            int i21 = (((i20 & (-18)) | ((~i20) & 17)) - (~(-(-((17 & i20) << 1))))) - 1;
            v0 = i21 % 128;
            int i22 = i21 % 2;
            return afvVar;
        }
        if (i16 != 2) {
            if (i16 == 3) {
                avt avtVar3 = (avt) objArr[0];
                int i23 = v0;
                int i24 = i23 + 95;
                f54004w0 = i24 % 128;
                int i25 = i24 % 2;
                avs avsVar2 = avtVar3.f54008u0;
                int i26 = i23 + 107;
                f54004w0 = i26 % 128;
                if (i26 % 2 != 0) {
                    return avsVar2;
                }
                throw null;
            }
            if (i16 != 4) {
                avt avtVar4 = (avt) objArr[0];
                int i27 = v0;
                int i28 = i27 & 5;
                int i29 = -(-((i27 ^ 5) | i28));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                f54004w0 = i30 % 128;
                int i31 = i30 % 2;
                byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{avtVar4.f54007t0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i32 = f54004w0;
                int i33 = ((i32 ^ 82) + ((i32 & 82) << 1)) - 1;
                v0 = i33 % 128;
                int i34 = i33 % 2;
                return bArr;
            }
            avt avtVar5 = (avt) objArr[0];
            int i35 = f54004w0;
            int i36 = (i35 & (-40)) | ((~i35) & 39);
            int i37 = (i35 & 39) << 1;
            int i38 = (i36 & i37) + (i37 | i36);
            v0 = i38 % 128;
            int i39 = i38 % 2;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{avtVar5.f54006s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i40 = v0;
            int i41 = i40 & 73;
            int i42 = ((i40 ^ 73) | i41) << 1;
            int i43 = -((i40 | 73) & (~i41));
            int i44 = (i42 & i43) + (i42 | i43);
            f54004w0 = i44 % 128;
            if (i44 % 2 != 0) {
                return bArr2;
            }
            int i45 = 17 / 0;
            return bArr2;
        }
        Object obj = objArr[0];
        int i46 = f54004w0;
        int i47 = i46 & 73;
        int i48 = i46 | 73;
        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
        int i50 = i49 % 128;
        v0 = i50;
        int i51 = i49 % 2;
        if (obj instanceof avt) {
            int i52 = ((i50 ^ 67) | (i50 & 67)) << 1;
            int i53 = -((i50 & (-68)) | ((~i50) & 67));
            int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
            f54004w0 = i54 % 128;
            int i55 = i54 % 2;
            avtVar = (avt) obj;
            int i56 = i50 + 13;
            f54004w0 = i56 % 128;
            int i57 = i56 % 2;
        } else if (obj != null) {
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
            avt avtVar6 = new avt();
            adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
            int iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
            avtVar6.f54005r0 = iIntValue;
            if (iIntValue != 0) {
                throw new IllegalArgumentException("unrecognized version");
            }
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            avtVar6.f54006s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
            ads adsVar2 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(2)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            avtVar6.f54007t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
            if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() == 4) {
                avtVar6.f54008u0 = (avs) avs.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(3)}, -1562201294, 1562201296, (int) System.currentTimeMillis());
            }
            int i58 = f54004w0;
            int i59 = i58 ^ 13;
            int i60 = ((i58 & 13) | i59) << 1;
            int i61 = -i59;
            int i62 = (i60 & i61) + (i60 | i61);
            v0 = i62 % 128;
            if (i62 % 2 != 0) {
                throw null;
            }
            avtVar = avtVar6;
        } else {
            int i63 = (i50 ^ 25) + ((i50 & 25) << 1);
            f54004w0 = i63 % 128;
            if (i63 % 2 == 0) {
                throw null;
            }
            avtVar = null;
        }
        return avtVar;
    }

    public static avt setX(Object obj) {
        return (avt) setCompoundDrawableTintBlendMode(new Object[]{obj}, -22898737, 22898739, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, -1454497640, 1454497641, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1028628232, -1028628228, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1559919378, 1559919378, System.identityHashCode(this));
    }

    public final avs setCompoundDrawableTintBlendMode() {
        return (avs) setCompoundDrawableTintBlendMode(new Object[]{this}, 1123633468, -1123633465, System.identityHashCode(this));
    }
}
