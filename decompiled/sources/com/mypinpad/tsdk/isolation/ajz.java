package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class ajz extends adw implements akf {
    public static int E0 = 1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final BigInteger f52978x0 = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52979y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ake f52980r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public aph f52981s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public akb f52982t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public BigInteger f52983u0;
    public BigInteger v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public byte[] f52984w0;

    static {
        int i10 = E0;
        int i11 = ((i10 & (-82)) | ((~i10) & 81)) + ((i10 & 81) << 1);
        f52979y0 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public ajz(aph aphVar, akb akbVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        ake akeVar;
        this.f52981s0 = aphVar;
        this.f52982t0 = akbVar;
        this.f52983u0 = bigInteger;
        this.v0 = bigInteger2;
        this.f52984w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        if (((Boolean) api.setX(new Object[]{aphVar}, 2068174862, -2068174856, (int) System.currentTimeMillis())).booleanValue()) {
            akeVar = new ake(((aul) aph.setX(new Object[]{aphVar}, 444393625, -444393611, System.identityHashCode(aphVar))).setY());
        } else {
            if (!((Boolean) api.setX(new Object[]{aphVar}, 784073018, -784073015, (int) System.currentTimeMillis())).booleanValue()) {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] onFocusChangeListener = ((auq) ((aul) aph.setX(new Object[]{aphVar}, 444393625, -444393611, System.identityHashCode(aphVar)))).setX().setOnFocusChangeListener();
            if (onFocusChangeListener.length == 3) {
                akeVar = new ake(onFocusChangeListener[2], onFocusChangeListener[1]);
            } else {
                if (onFocusChangeListener.length != 5) {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                akeVar = new ake(onFocusChangeListener[4], onFocusChangeListener[1], onFocusChangeListener[2], onFocusChangeListener[3]);
            }
        }
        this.f52980r0 = akeVar;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46);
        ajz ajzVar = null;
        switch (i15) {
            case 1:
                ajz ajzVar2 = (ajz) objArr[0];
                int i16 = f52979y0;
                int i17 = ((i16 | 67) << 1) - (i16 ^ 67);
                E0 = i17 % 128;
                int i18 = i17 % 2;
                BigInteger bigInteger = ajzVar2.f52983u0;
                if (i18 != 0) {
                    return bigInteger;
                }
                throw null;
            case 2:
                ajz ajzVar3 = (ajz) objArr[0];
                int i19 = f52979y0;
                int i20 = i19 & 79;
                int i21 = i20 + ((i19 ^ 79) | i20);
                E0 = i21 % 128;
                int i22 = i21 % 2;
                byte[] bArr = ajzVar3.f52984w0;
                if (i22 != 0) {
                    return (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                throw null;
            case 3:
                ajz ajzVar4 = (ajz) objArr[0];
                int i23 = f52979y0;
                int i24 = i23 & 105;
                int i25 = (i24 - (~(-(-((i23 ^ 105) | i24))))) - 1;
                E0 = i25 % 128;
                int i26 = i25 % 2;
                aph aphVar = ajzVar4.f52981s0;
                int i27 = ((i23 ^ 42) + ((i23 & 42) << 1)) - 1;
                E0 = i27 % 128;
                int i28 = i27 % 2;
                return aphVar;
            case 4:
                Object obj = objArr[0];
                int i29 = E0;
                int i30 = i29 & 63;
                int i31 = ((i29 ^ 63) | i30) << 1;
                int i32 = -((i29 | 63) & (~i30));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                int i34 = i33 % 128;
                f52979y0 = i34;
                int i35 = i33 % 2;
                if (obj != null) {
                    aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                    ajzVar = new ajz();
                    if (!(compoundDrawableTintBlendMode.setX(0) instanceof adp) || !((Boolean) adp.setOnFocusChangeListener(new Object[]{(adp) compoundDrawableTintBlendMode.setX(0), 1}, 920356441, -920356436, 1)).booleanValue()) {
                        throw new IllegalArgumentException("bad version in X9ECParameters");
                    }
                    adp adpVar = (adp) compoundDrawableTintBlendMode.setX(4);
                    BigInteger bigInteger2 = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar}, 1599682974, -1599682960, System.identityHashCode(adpVar));
                    ajzVar.f52983u0 = bigInteger2;
                    if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() == 6) {
                        adp adpVar2 = (adp) compoundDrawableTintBlendMode.setX(5);
                        ajzVar.v0 = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar2}, 1599682974, -1599682960, System.identityHashCode(adpVar2));
                    }
                    aka akaVar = new aka((ake) ake.setY(new Object[]{compoundDrawableTintBlendMode.setX(1)}, -1517063374, 1517063377, (int) System.currentTimeMillis()), bigInteger2, ajzVar.v0, aed.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode.setX(2)));
                    aph aphVar2 = (aph) aka.setX(new Object[]{akaVar}, 1388224118, -1388224115, System.identityHashCode(akaVar));
                    ajzVar.f52981s0 = aphVar2;
                    add x4 = compoundDrawableTintBlendMode.setX(3);
                    if (x4 instanceof akb) {
                        ajzVar.f52982t0 = (akb) x4;
                    } else {
                        ajzVar.f52982t0 = new akb(aphVar2, (ads) x4);
                    }
                    ajzVar.f52984w0 = (byte[]) aka.setX(new Object[]{akaVar}, 861568773, -861568772, System.identityHashCode(akaVar));
                    int i36 = E0;
                    int i37 = ((i36 ^ 63) - (~((i36 & 63) << 1))) - 1;
                    f52979y0 = i37 % 128;
                    if (i37 % 2 != 0) {
                        int i38 = 74 / 0;
                    }
                } else {
                    int i39 = i34 & 15;
                    int i40 = i39 + ((i34 ^ 15) | i39);
                    E0 = i40 % 128;
                    int i41 = i40 % 2;
                }
                return ajzVar;
            case 5:
                ajz ajzVar5 = (ajz) objArr[0];
                int i42 = E0;
                int i43 = ((i42 | 69) << 1) - (i42 ^ 69);
                f52979y0 = i43 % 128;
                int i44 = i43 % 2;
                apl x6 = ajzVar5.f52982t0.setX();
                int i45 = f52979y0 + 41;
                E0 = i45 % 128;
                if (i45 % 2 != 0) {
                    return x6;
                }
                int i46 = 84 / 0;
                return x6;
            case 6:
                ajz ajzVar6 = (ajz) objArr[0];
                adh adhVar = new adh(6);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(f52978x0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajzVar6.f52980r0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aka(ajzVar6.f52981s0, ajzVar6.f52984w0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajzVar6.f52982t0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(ajzVar6.f52983u0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                BigInteger bigInteger3 = ajzVar6.v0;
                if (bigInteger3 != null) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(bigInteger3)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i47 = E0;
                    int i48 = i47 & 69;
                    int i49 = (i47 | 69) & (~i48);
                    int i50 = -(-(i48 << 1));
                    int i51 = (i49 & i50) + (i49 | i50);
                    f52979y0 = i51 % 128;
                    int i52 = i51 % 2;
                }
                afv afvVar = new afv(adhVar);
                int i53 = f52979y0;
                int i54 = (((i53 | 72) << 1) - (i53 ^ 72)) - 1;
                E0 = i54 % 128;
                if (i54 % 2 != 0) {
                    return afvVar;
                }
                throw null;
            default:
                ajz ajzVar7 = (ajz) objArr[0];
                int i55 = f52979y0;
                int i56 = i55 + 123;
                E0 = i56 % 128;
                int i57 = i56 % 2;
                BigInteger bigInteger4 = ajzVar7.v0;
                int i58 = ((i55 ^ 123) | (i55 & 123)) << 1;
                int i59 = -(((~i55) & 123) | (i55 & (-124)));
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                E0 = i60 % 128;
                if (i60 % 2 != 0) {
                    return bigInteger4;
                }
                int i61 = 36 / 0;
                return bigInteger4;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, -809696894, 809696900, System.identityHashCode(this));
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setDividerPadding(new Object[]{this}, -300233911, 300233913, System.identityHashCode(this));
    }

    public final apl setOnFocusChangeListener() {
        return (apl) setDividerPadding(new Object[]{this}, -1392274509, 1392274514, System.identityHashCode(this));
    }

    public final BigInteger setX() {
        return (BigInteger) setDividerPadding(new Object[]{this}, 1221539445, -1221539444, System.identityHashCode(this));
    }

    public final BigInteger setY() {
        return (BigInteger) setDividerPadding(new Object[]{this}, 1190704931, -1190704931, System.identityHashCode(this));
    }

    public static ajz setY(Object obj) {
        return (ajz) setDividerPadding(new Object[]{obj}, 1538081117, -1538081113, (int) System.currentTimeMillis());
    }

    public final aph setDividerPadding() {
        return (aph) setDividerPadding(new Object[]{this}, -1237598812, 1237598815, System.identityHashCode(this));
    }
}
