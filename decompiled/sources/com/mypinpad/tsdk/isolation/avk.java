package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class avk extends adw {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f53965y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f53966r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f53967s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f53968t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f53969u0;
    public byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public byte[] f53970w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public avj f53971x0;

    public avk(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, avj avjVar) {
        this.f53967s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f53968t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f53969u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f53970w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr5}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f53971x0 = avjVar;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        byte[] bArr2;
        int i13 = ~i12;
        int i14 = (((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559));
        avk avkVar = null;
        switch (i14) {
            case 1:
                avk avkVar2 = (avk) objArr[0];
                int i15 = E0 + 57;
                f53965y0 = i15 % 128;
                int i16 = i15 % 2;
                byte[] bArr3 = avkVar2.f53969u0;
                if (i16 == 0) {
                    return (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                throw null;
            case 2:
                avk avkVar3 = (avk) objArr[0];
                int i17 = E0;
                int i18 = i17 & 107;
                int i19 = ((((i17 ^ 107) | i18) << 1) - (~(-((i17 | 107) & (~i18))))) - 1;
                f53965y0 = i19 % 128;
                int i20 = i19 % 2;
                byte[] bArr4 = avkVar3.f53970w0;
                Object[] objArr2 = new Object[1];
                if (i20 != 0) {
                    objArr2[0] = bArr4;
                    bArr = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
                    int i21 = 26 / 0;
                } else {
                    objArr2[0] = bArr4;
                    bArr = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                int i22 = f53965y0;
                int i23 = ((i22 | 93) << 1) - (i22 ^ 93);
                E0 = i23 % 128;
                int i24 = i23 % 2;
                return bArr;
            case 3:
                avk avkVar4 = (avk) objArr[0];
                int i25 = f53965y0;
                int i26 = i25 ^ 125;
                int i27 = ((i25 & 125) | i26) << 1;
                int i28 = -i26;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                E0 = i29 % 128;
                int i30 = i29 % 2;
                byte[] bArr5 = (byte[]) bek.setOnFocusChangeListener(new Object[]{avkVar4.f53967s0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i31 = E0;
                int i32 = i31 & 21;
                int i33 = (i31 ^ 21) | i32;
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                f53965y0 = i34 % 128;
                int i35 = i34 % 2;
                return bArr5;
            case 4:
                avk avkVar5 = (avk) objArr[0];
                int i36 = E0;
                int i37 = i36 & 113;
                int i38 = i36 | 113;
                int i39 = (i37 & i38) + (i38 | i37);
                f53965y0 = i39 % 128;
                int i40 = i39 % 2;
                byte[] bArr6 = avkVar5.v0;
                Object[] objArr3 = new Object[1];
                if (i40 != 0) {
                    objArr3[0] = bArr6;
                    throw null;
                }
                objArr3[0] = bArr6;
                byte[] bArr7 = (byte[]) bek.setOnFocusChangeListener(objArr3, -150521869, 150521882, (int) System.currentTimeMillis());
                int i41 = f53965y0;
                int i42 = (((i41 | 42) << 1) - (i41 ^ 42)) - 1;
                E0 = i42 % 128;
                int i43 = i42 % 2;
                return bArr7;
            case 5:
                Object obj = objArr[0];
                int i44 = f53965y0;
                int i45 = i44 + 107;
                int i46 = i45 % 128;
                E0 = i46;
                int i47 = i45 % 2;
                if (obj instanceof avk) {
                    int i48 = (((i44 | 61) << 1) - (~(-((61 & (~i44)) | (i44 & (-62)))))) - 1;
                    E0 = i48 % 128;
                    int i49 = i48 % 2;
                    avk avkVar6 = (avk) obj;
                    int i50 = ((i44 ^ 68) + ((i44 & 68) << 1)) - 1;
                    E0 = i50 % 128;
                    if (i50 % 2 == 0) {
                        throw null;
                    }
                    avkVar = avkVar6;
                } else if (obj != null) {
                    aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                    avkVar = new avk();
                    adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
                    int iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
                    avkVar.f53966r0 = iIntValue;
                    if (iIntValue != 0) {
                        throw new IllegalArgumentException("unrecognized version");
                    }
                    ads adsVar = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    avkVar.f53967s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
                    ads adsVar2 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(2)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    avkVar.f53968t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
                    ads adsVar3 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(3)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    avkVar.f53969u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar3}, -952512304, 952512305, System.identityHashCode(adsVar3))}, -150521869, 150521882, (int) System.currentTimeMillis());
                    ads adsVar4 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(4)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    avkVar.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar4}, -952512304, 952512305, System.identityHashCode(adsVar4))}, -150521869, 150521882, (int) System.currentTimeMillis());
                    ads adsVar5 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(5)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    avkVar.f53970w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar5}, -952512304, 952512305, System.identityHashCode(adsVar5))}, -150521869, 150521882, (int) System.currentTimeMillis());
                    if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() == 7) {
                        avkVar.f53971x0 = (avj) avj.setX(new Object[]{compoundDrawableTintBlendMode.setX(6)}, 557978652, -557978652, (int) System.currentTimeMillis());
                    }
                    int i51 = E0;
                    int i52 = i51 & 35;
                    int i53 = i52 + ((i51 ^ 35) | i52);
                    f53965y0 = i53 % 128;
                    int i54 = i53 % 2;
                } else {
                    int i55 = ((i46 & (-122)) | ((~i46) & 121)) + ((i46 & 121) << 1);
                    f53965y0 = i55 % 128;
                    int i56 = i55 % 2;
                }
                return avkVar;
            case 6:
                avk avkVar7 = (avk) objArr[0];
                int i57 = E0 + 1;
                f53965y0 = i57 % 128;
                int i58 = i57 % 2;
                byte[] bArr8 = avkVar7.f53968t0;
                if (i58 != 0) {
                    bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr8}, -150521869, 150521882, (int) System.currentTimeMillis());
                    int i59 = 32 / 0;
                } else {
                    bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr8}, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                int i60 = E0;
                int i61 = i60 & 61;
                int i62 = -(-((i60 ^ 61) | i61));
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                f53965y0 = i63 % 128;
                int i64 = i63 % 2;
                return bArr2;
            default:
                avk avkVar8 = (avk) objArr[0];
                adh adhVar = new adh();
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avkVar8.f53966r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avkVar8.f53967s0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avkVar8.f53968t0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avkVar8.f53969u0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avkVar8.v0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avkVar8.f53970w0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                avj avjVar = avkVar8.f53971x0;
                if (avjVar != null) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new avj((byte[]) avj.setX(new Object[]{avjVar}, 143831184, -143831182, System.identityHashCode(avjVar)))}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i65 = E0;
                    int i66 = i65 & 53;
                    int i67 = (i66 - (~(-(-((i65 ^ 53) | i66))))) - 1;
                    f53965y0 = i67 % 128;
                    int i68 = i67 % 2;
                }
                afv afvVar = new afv(adhVar);
                int i69 = E0;
                int i70 = (i69 ^ 109) + ((i69 & 109) << 1);
                f53965y0 = i70 % 128;
                int i71 = i70 % 2;
                return afvVar;
        }
    }

    public static avk setY(Object obj) {
        return (avk) setOnFocusChangeListener(new Object[]{obj}, 715034813, -715034808, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, 1755609054, -1755609054, System.identityHashCode(this));
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1665021223, -1665021221, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1450166724, -1450166723, System.identityHashCode(this));
    }

    public final byte[] setX() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -1925570520, 1925570523, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1131173366, -1131173362, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 281367112, -281367106, System.identityHashCode(this));
    }
}
