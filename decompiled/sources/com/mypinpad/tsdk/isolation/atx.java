package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class atx extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final att f53859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final att f53860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53861i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f53862j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aty f53863f;

    static {
        new att(apj.setOnFocusChangeListener);
        att attVar = new att(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        f53859g = attVar;
        f53860h = (att) attVar.setOnLongClickListener();
        int i10 = f53862j;
        int i11 = ((i10 | 94) << 1) - (i10 ^ 94);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f53861i = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public atx() {
        super(571, 2, 5, 10);
        this.f53863f = new aty(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setCompoundDrawableTintBlendMode = f53859g;
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i11)) | (~(i12 | i13))) * 49) + (((~((~i10) | i14)) | i13 | (~(i10 | i12))) * (-49)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (i11 * (-97)) + (i10 * 50);
        if (i15 == 1) {
            atx atxVar = new atx();
            int i16 = f53861i;
            int i17 = (((i16 | 14) << 1) - (i16 ^ 14)) - 1;
            f53862j = i17 % 128;
            if (i17 % 2 != 0) {
                return atxVar;
            }
            throw null;
        }
        if (i15 == 2) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i18 = f53861i;
            int i19 = i18 + 41;
            int i20 = i19 % 128;
            f53862j = i20;
            int i21 = i19 % 2;
            if (iIntValue != 6) {
                int i22 = i18 & 109;
                int i23 = (((i18 ^ 109) | i22) << 1) - ((i18 | 109) & (~i22));
                f53862j = i23 % 128;
                int i24 = i23 % 2;
                obj = Boolean.FALSE;
            } else {
                int i25 = ((i20 | 73) << 1) - (i20 ^ 73);
                f53861i = i25 % 128;
                int i26 = i25 % 2;
                obj = Boolean.TRUE;
            }
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    int i27 = f53861i;
                    int i28 = ((-1) << 1) - ((-1) ^ ((i27 ^ 6) + ((i27 & 6) << 1)));
                    f53862j = i28 % 128;
                    return Integer.valueOf(i28 % 2 == 0 ? 26339 : 571);
                }
                if (i15 == 5) {
                    aty atyVar = new aty((atx) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                    int i29 = f53862j;
                    int i30 = i29 & 117;
                    int i31 = (i30 - (~((i29 ^ 117) | i30))) - 1;
                    f53861i = i31 % 128;
                    int i32 = i31 % 2;
                    return atyVar;
                }
                att attVar = new att((BigInteger) objArr[1]);
                int i33 = f53861i;
                int i34 = i33 & 79;
                int i35 = (i33 | 79) & (~i34);
                int i36 = -(-(i34 << 1));
                int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                f53862j = i37 % 128;
                int i38 = i37 % 2;
                return attVar;
            }
            atx atxVar2 = (atx) objArr[0];
            int i39 = f53861i;
            int i40 = ((i39 | 97) << 1) - (i39 ^ 97);
            f53862j = i40 % 128;
            int i41 = i40 % 2;
            obj = atxVar2.f53863f;
            int i42 = (i39 & (-50)) | ((~i39) & 49);
            int i43 = (i39 & 49) << 1;
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            f53862j = i44 % 128;
            if (i44 % 2 == 0) {
                throw null;
            }
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, -1321380347, 1321380352, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, bigInteger}, 885852312, -885852312, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 1033185815, -1033185812, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -1215043773, 1215043775, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 151462853, -151462849, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setCompoundDrawableTintBlendMode(new Object[]{this}, -236300886, 236300887, System.identityHashCode(this));
    }
}
