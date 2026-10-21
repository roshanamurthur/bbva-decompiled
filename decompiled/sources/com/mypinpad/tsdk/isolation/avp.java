package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avp extends adw {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f53990x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f53991y0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f53992r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f53993s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f53994t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f53995u0;
    public byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public aiw f53996w0;

    public avp(int i10, int i11, bdt bdtVar, bdz bdzVar, bdx bdxVar, aiw aiwVar) {
        this.f53992r0 = i10;
        this.f53993s0 = i11;
        this.f53994t0 = (byte[]) bdt.setX(new Object[]{bdtVar}, -1008508006, 1008508016, System.identityHashCode(bdtVar));
        this.f53995u0 = (byte[]) bdz.setDividerPadding(new Object[]{bdzVar}, -449127289, 449127295, System.identityHashCode(bdzVar));
        this.v0 = (byte[]) bdx.setY(new Object[]{bdxVar}, -794480986, 794480986, System.identityHashCode(bdxVar));
        this.f53996w0 = aiwVar;
    }

    public static avp setCompoundDrawableTintBlendMode(Object obj) {
        return (avp) setDividerPadding(new Object[]{obj}, -1285440580, 1285440580, (int) System.currentTimeMillis());
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = (i11 * 591) + (i10 * (-589));
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (~(i14 | i10)) | (~(i14 | i15)) | (~(i15 | i10));
        int i17 = ~i10;
        switch ((((~(i17 | i15)) | (~(i11 | i15))) * 590) + (i16 * (-1180)) + (((~(i12 | i17 | i11)) | i16) * 590) + i13) {
            case 1:
                avp avpVar = (avp) objArr[0];
                int i18 = f53991y0;
                int i19 = (((i18 ^ 91) | (i18 & 91)) << 1) - (((~i18) & 91) | (i18 & (-92)));
                int i20 = i19 % 128;
                f53990x0 = i20;
                int i21 = i19 % 2;
                int i22 = avpVar.f53993s0;
                int i23 = i20 & 113;
                int i24 = (((i20 | 113) & (~i23)) - (~(i23 << 1))) - 1;
                f53991y0 = i24 % 128;
                if (i24 % 2 != 0) {
                    return Integer.valueOf(i22);
                }
                throw null;
            case 2:
                avp avpVar2 = (avp) objArr[0];
                adh adhVar = new adh();
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avpVar2.f53992r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avpVar2.f53993s0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avpVar2.f53994t0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avpVar2.f53995u0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft(avpVar2.v0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                afv afvVarA = c.a(adhVar, new Object[]{adhVar, avpVar2.f53996w0}, 240298319, -240298315, adhVar);
                int i25 = f53990x0;
                int i26 = ((i25 ^ 81) | (i25 & 81)) << 1;
                int i27 = -(((~i25) & 81) | (i25 & (-82)));
                int i28 = (i26 & i27) + (i27 | i26);
                f53991y0 = i28 % 128;
                int i29 = i28 % 2;
                return afvVarA;
            case 3:
                avp avpVar3 = (avp) objArr[0];
                int i30 = f53991y0;
                int i31 = (((i30 | 98) << 1) - (i30 ^ 98)) - 1;
                int i32 = i31 % 128;
                f53990x0 = i32;
                int i33 = i31 % 2;
                int i34 = avpVar3.f53992r0;
                if (i33 != 0) {
                    throw null;
                }
                int i35 = i32 & 97;
                int i36 = ((i32 ^ 97) | i35) << 1;
                int i37 = -((i32 | 97) & (~i35));
                int i38 = (i36 & i37) + (i37 | i36);
                f53991y0 = i38 % 128;
                if (i38 % 2 == 0) {
                    int i39 = 99 / 0;
                }
                objValueOf = Integer.valueOf(i34);
                break;
                break;
            case 4:
                bdx bdxVar = new bdx(((avp) objArr[0]).v0);
                int i40 = f53991y0;
                int i41 = i40 & 15;
                int i42 = i40 | 15;
                int i43 = (i41 & i42) + (i42 | i41);
                f53990x0 = i43 % 128;
                if (i43 % 2 == 0) {
                    return bdxVar;
                }
                int i44 = 73 / 0;
                return bdxVar;
            case 5:
                bdt bdtVar = new bdt(((avp) objArr[0]).f53994t0);
                int i45 = f53990x0;
                int i46 = i45 & 95;
                int i47 = (i45 ^ 95) | i46;
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                f53991y0 = i48 % 128;
                int i49 = i48 % 2;
                return bdtVar;
            case 6:
                avp avpVar4 = (avp) objArr[0];
                bdz bdzVar = new bdz(avpVar4.setX(), avpVar4.f53995u0);
                int i50 = f53991y0;
                int i51 = ((i50 | 112) << 1) - (i50 ^ 112);
                int i52 = (i51 ^ (-1)) + (i51 << 1);
                f53990x0 = i52 % 128;
                if (i52 % 2 == 0) {
                    return bdzVar;
                }
                int i53 = 34 / 0;
                return bdzVar;
            case 7:
                avp avpVar5 = (avp) objArr[0];
                System.identityHashCode(avpVar5);
                System.identityHashCode(avpVar5);
                objValueOf = avpVar5.f53996w0;
                int i54 = f53991y0 + 81;
                f53990x0 = i54 % 128;
                if (i54 % 2 != 0) {
                    throw null;
                }
                break;
            default:
                Object obj = objArr[0];
                int i55 = f53990x0;
                int i56 = i55 & 57;
                int i57 = (i56 - (~((i55 ^ 57) | i56))) - 1;
                int i58 = i57 % 128;
                f53991y0 = i58;
                int i59 = i57 % 2;
                if (!(obj instanceof avp)) {
                    if (obj == null) {
                        int i60 = (((i55 | 16) << 1) - (i55 ^ 16)) - 1;
                        f53991y0 = i60 % 128;
                        if (i60 % 2 != 0) {
                            return null;
                        }
                        int i61 = 62 / 0;
                        return null;
                    }
                    aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                    avp avpVar6 = new avp();
                    adp adpVar = (adp) compoundDrawableTintBlendMode.setX(0);
                    avpVar6.f53992r0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
                    adp adpVar2 = (adp) compoundDrawableTintBlendMode.setX(1);
                    avpVar6.f53993s0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar2}, -2079758436, 2079758436, System.identityHashCode(adpVar2))).intValue();
                    ads adsVar = (ads) compoundDrawableTintBlendMode.setX(2);
                    avpVar6.f53994t0 = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
                    ads adsVar2 = (ads) compoundDrawableTintBlendMode.setX(3);
                    avpVar6.f53995u0 = (byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2));
                    ads adsVar3 = (ads) compoundDrawableTintBlendMode.setX(4);
                    avpVar6.v0 = (byte[]) ads.setDividerPadding(new Object[]{adsVar3}, -952512304, 952512305, System.identityHashCode(adsVar3));
                    avpVar6.f53996w0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(5)}, 866360717, -866360713, (int) System.currentTimeMillis());
                    int i62 = f53990x0 + 19;
                    f53991y0 = i62 % 128;
                    int i63 = i62 % 2;
                    return avpVar6;
                }
                int i64 = i58 & 71;
                int i65 = (~i64) & (i58 | 71);
                int i66 = -(-(i64 << 1));
                int i67 = (i65 & i66) + (i66 | i65);
                f53990x0 = i67 % 128;
                objValueOf = (avp) obj;
                if (i67 % 2 != 0) {
                    int i68 = 48 / 0;
                }
                break;
                break;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, 2079579865, -2079579863, System.identityHashCode(this));
    }

    public final aiw getNavBarTitleString() {
        return (aiw) setDividerPadding(new Object[]{this}, -675120733, 675120740, System.identityHashCode(this));
    }

    public final bdz setOnFocusChangeListener() {
        return (bdz) setDividerPadding(new Object[]{this}, 494068270, -494068264, System.identityHashCode(this));
    }

    public final bdt setX() {
        return (bdt) setDividerPadding(new Object[]{this}, 1256170397, -1256170392, System.identityHashCode(this));
    }

    public final int setY() {
        return ((Integer) setDividerPadding(new Object[]{this}, 2070052947, -2070052944, System.identityHashCode(this))).intValue();
    }

    public final bdx setCompoundDrawableTintBlendMode() {
        return (bdx) setDividerPadding(new Object[]{this}, 452531429, -452531425, System.identityHashCode(this));
    }

    public final int setDividerPadding() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1100362398, -1100362397, System.identityHashCode(this))).intValue();
    }
}
