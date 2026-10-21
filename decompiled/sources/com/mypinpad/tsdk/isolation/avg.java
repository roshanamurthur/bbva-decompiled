package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class avg extends adw {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f53952w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f53953x0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f53954r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f53955s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f53956t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f53957u0;
    public avo v0;

    public avg(byte[] bArr, byte[] bArr2, byte[] bArr3, avo avoVar) {
        this.f53955s0 = bArr;
        this.f53956t0 = bArr2;
        this.f53957u0 = bArr3;
        this.v0 = avoVar;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object afvVar;
        int i13 = (~i10) | i11;
        int i14 = ~i13;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | (~((~i11) | i10)) | (~(i13 | i12))) * 140) + ((i14 | (~(i15 | i11))) * (-280)) + ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        if (i16 == 1) {
            avg avgVar = (avg) objArr[0];
            int i17 = f53952w0;
            int i18 = i17 & 43;
            int i19 = (i17 | 43) & (~i18);
            int i20 = i18 << 1;
            int i21 = (i19 & i20) + (i19 | i20);
            f53953x0 = i21 % 128;
            int i22 = i21 % 2;
            afvVar = (byte[]) bek.setOnFocusChangeListener(new Object[]{avgVar.f53955s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i23 = f53952w0;
            int i24 = (i23 & (-40)) | ((~i23) & 39);
            int i25 = (39 & i23) << 1;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f53953x0 = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 0 / 0;
            }
        } else if (i16 == 2) {
            avg avgVar2 = (avg) objArr[0];
            adh adhVar = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avgVar2.f53954r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avgVar2.f53955s0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avgVar2.f53956t0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avgVar2.f53957u0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            avo avoVar = avgVar2.v0;
            if (avoVar != null) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new avo((byte[]) avo.setOnFocusChangeListener(new Object[]{avoVar}, -22282219, 22282219, System.identityHashCode(avoVar)))}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i28 = f53952w0;
                int i29 = ((-1) << 1) - ((((i28 | 18) << 1) - (i28 ^ 18)) ^ (-1));
                f53953x0 = i29 % 128;
                int i30 = i29 % 2;
            }
            afvVar = new afv(adhVar);
            int i31 = f53952w0;
            int i32 = i31 & 1;
            int i33 = i31 | 1;
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            f53953x0 = i34 % 128;
            int i35 = i34 % 2;
        } else if (i16 == 3) {
            avg avgVar3 = (avg) objArr[0];
            int i36 = f53952w0;
            int i37 = i36 & 49;
            int i38 = ((~i37) & (i36 | 49)) + (i37 << 1);
            f53953x0 = i38 % 128;
            int i39 = i38 % 2;
            afvVar = avgVar3.v0;
            if (i39 == 0) {
                int i40 = 4 / 0;
            }
            int i41 = (i36 ^ 59) + ((i36 & 59) << 1);
            f53953x0 = i41 % 128;
            if (i41 % 2 == 0) {
                int i42 = 39 / 0;
            }
        } else if (i16 == 4) {
            avg avgVar4 = (avg) objArr[0];
            int i43 = f53953x0;
            int i44 = (i43 & 77) + (i43 | 77);
            f53952w0 = i44 % 128;
            int i45 = i44 % 2;
            byte[] bArr = avgVar4.f53956t0;
            Object[] objArr2 = new Object[1];
            if (i45 != 0) {
                objArr2[0] = bArr;
                afvVar = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
                int i46 = 9 / 0;
            } else {
                objArr2[0] = bArr;
                afvVar = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            int i47 = f53952w0;
            int i48 = i47 & 77;
            int i49 = -(-((i47 ^ 77) | i48));
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            f53953x0 = i50 % 128;
            if (i50 % 2 == 0) {
                throw null;
            }
        } else {
            if (i16 == 5) {
                avg avgVar5 = (avg) objArr[0];
                int i51 = f53952w0;
                int i52 = ((i51 & 44) + (i51 | 44)) - 1;
                f53953x0 = i52 % 128;
                int i53 = i52 % 2;
                byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{avgVar5.f53957u0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i54 = f53953x0;
                int i55 = i54 & 97;
                int i56 = (((i54 | 97) & (~i55)) - (~(-(-(i55 << 1))))) - 1;
                f53952w0 = i56 % 128;
                int i57 = i56 % 2;
                return bArr2;
            }
            Object obj = objArr[0];
            int i58 = f53952w0;
            int i59 = (((i58 | 116) << 1) - (i58 ^ 116)) - 1;
            int i60 = i59 % 128;
            f53953x0 = i60;
            int i61 = i59 % 2;
            if (!(obj instanceof avg)) {
                if (obj == null) {
                    int i62 = i60 & 85;
                    int i63 = ((i60 ^ 85) | i62) << 1;
                    int i64 = -((~i62) & (i60 | 85));
                    int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                    f53952w0 = i65 % 128;
                    int i66 = i65 % 2;
                    return null;
                }
                aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                avg avgVar6 = new avg();
                adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
                int iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
                avgVar6.f53954r0 = iIntValue;
                if (iIntValue != 0) {
                    throw new IllegalArgumentException("unrecognized version");
                }
                ads adsVar = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                avgVar6.f53955s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
                ads adsVar2 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(2)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                avgVar6.f53956t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
                ads adsVar3 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(3)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                avgVar6.f53957u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar3}, -952512304, 952512305, System.identityHashCode(adsVar3))}, -150521869, 150521882, (int) System.currentTimeMillis());
                if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() == 5) {
                    avgVar6.v0 = (avo) avo.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(4)}, 658749726, -658749724, (int) System.currentTimeMillis());
                }
                int i67 = f53952w0;
                int i68 = ((i67 | 17) << 1) - (i67 ^ 17);
                f53953x0 = i68 % 128;
                if (i68 % 2 != 0) {
                    return avgVar6;
                }
                int i69 = 8 / 0;
                return avgVar6;
            }
            int i70 = i60 & 113;
            int i71 = ((~i70) & (i60 | 113)) + (i70 << 1);
            int i72 = i71 % 128;
            f53952w0 = i72;
            int i73 = i71 % 2;
            afvVar = (avg) obj;
            int i74 = (i72 & (-78)) | ((~i72) & 77);
            int i75 = (i72 & 77) << 1;
            int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
            f53953x0 = i76 % 128;
            int i77 = i76 % 2;
        }
        return afvVar;
    }

    public static avg setX(Object obj) {
        return (avg) setCompoundDrawableTintBlendMode(new Object[]{obj}, 578524105, -578524105, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 108592493, -108592491, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 164903975, -164903970, System.identityHashCode(this));
    }

    public final avo setOnFocusChangeListener() {
        return (avo) setCompoundDrawableTintBlendMode(new Object[]{this}, 856407898, -856407895, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1344469090, -1344469086, System.identityHashCode(this));
    }

    public final byte[] setX() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 2052898221, -2052898220, System.identityHashCode(this));
    }
}
