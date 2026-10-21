package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class cr extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55021p = {c.e(cr.class, "magStripeModeSupported_B1b8", "getMagStripeModeSupported_B1b8()Z", 0), c.e(cr.class, "emvModeSupported_B1b6", "getEmvModeSupported_B1b6()Z", 0), c.e(cr.class, "emvContactChipSupported_B1b5", "getEmvContactChipSupported_B1b5()Z", 0), c.e(cr.class, "offlineOnlyReader_B1b4", "getOfflineOnlyReader_B1b4()Z", 0), c.e(cr.class, "onlinePINSupported_B1b3", "getOnlinePINSupported_B1b3()Z", 0), c.e(cr.class, "signatureSupported_B1b2", "getSignatureSupported_B1b2()Z", 0), c.e(cr.class, "offlineDataAuthenticationForOnlineAuthorizationsSupported_B1b1", "getOfflineDataAuthenticationForOnlineAuthorizationsSupported_B1b1()Z", 0), c.e(cr.class, "onlineCryptogramRequired_B2b8", "getOnlineCryptogramRequired_B2b8()Z", 0), c.e(cr.class, "cvmRequired_B2b7", "getCvmRequired_B2b7()Z", 0), c.e(cr.class, "contactChipOfflinePINSupported_B2b6", "getContactChipOfflinePINSupported_B2b6()Z", 0), c.e(cr.class, "issuerUpdateProcessingSupported_B3b8", "getIssuerUpdateProcessingSupported_B3b8()Z", 0), c.e(cr.class, "consumerDeviceCVMSupported_B3b7", "getConsumerDeviceCVMSupported_B3b7()Z", 0)};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f55022q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f55023r = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f55024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f55025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f55026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f55027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final h f55028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final h f55029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f55030l;

    @NotNull
    public final h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final h f55031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final h f55032o;

    static {
        int i10 = f55022q;
        int i11 = ((i10 | 61) << 1) - (((~i10) & 61) | (i10 & (-62)));
        f55023r = i11 % 128;
        int i12 = i11 % 2;
    }

    public cr() {
        super(setAnimation.setLineSpacing().setDividerPadding());
        this.f55024f = new h(0, 7);
        this.f55025g = new h(0, 5);
        this.f55026h = new h(0, 4);
        this.f55027i = new h(0, 3);
        this.f55028j = new h(0, 2);
        this.f55029k = new h(0, 1);
        this.f55030l = new h(0, 0);
        this.m = new h(1, 7);
        this.f55031n = new h(1, 6);
        new h(1, 5);
        new h(2, 7);
        this.f55032o = new h(2, 6);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Boolean boolValueOf;
        Object onFocusChangeListener;
        int i13 = ~i11;
        int i14 = (~i12) | i13;
        int i15 = (((~i14) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
        int i16 = ~i10;
        int i17 = ((~(i13 | i12)) * 113) + (((~(i10 | i14)) | (~(i11 | i16)) | (~(i16 | i12))) * (-113)) + i15;
        KProperty<Object>[] kPropertyArr = f55021p;
        switch (i17) {
            case 1:
                cr crVar = (cr) objArr[0];
                int i18 = f55023r;
                int i19 = i18 & 67;
                int i20 = (((i18 ^ 67) | i19) << 1) - ((i18 | 67) & (~i19));
                f55022q = i20 % 128;
                int i21 = i20 % 2;
                h hVar = crVar.f55030l;
                boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, crVar, kPropertyArr[6]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue();
                int i22 = f55022q;
                int i23 = ((i22 & 8) + (i22 | 8)) - 1;
                f55023r = i23 % 128;
                if (i23 % 2 != 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            case 2:
                cr crVar2 = (cr) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i24 = f55023r + 7;
                f55022q = i24 % 128;
                if (i24 % 2 != 0) {
                    h hVar2 = crVar2.m;
                    h.setOnFocusChangeListener(new Object[]{hVar2, crVar2, kPropertyArr[118], Boolean.valueOf(zBooleanValue2)}, 951550455, -951550455, System.identityHashCode(hVar2));
                    return null;
                }
                h hVar3 = crVar2.m;
                h.setOnFocusChangeListener(new Object[]{hVar3, crVar2, kPropertyArr[7], Boolean.valueOf(zBooleanValue2)}, 951550455, -951550455, System.identityHashCode(hVar3));
                return null;
            case 3:
                cr crVar3 = (cr) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int i25 = f55023r;
                int i26 = i25 & 35;
                int i27 = (35 ^ i25) | i26;
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                f55022q = i28 % 128;
                int i29 = i28 % 2;
                h hVar4 = crVar3.f55031n;
                if (i29 != 0) {
                    h.setOnFocusChangeListener(new Object[]{hVar4, crVar3, kPropertyArr[108], Boolean.valueOf(zBooleanValue3)}, 951550455, -951550455, System.identityHashCode(hVar4));
                } else {
                    h.setOnFocusChangeListener(new Object[]{hVar4, crVar3, kPropertyArr[8], Boolean.valueOf(zBooleanValue3)}, 951550455, -951550455, System.identityHashCode(hVar4));
                }
                int i30 = f55022q;
                int i31 = i30 ^ 77;
                int i32 = (((i30 & 77) | i31) << 1) - i31;
                f55023r = i32 % 128;
                if (i32 % 2 != 0) {
                    return null;
                }
                int i33 = 61 / 0;
                return null;
            case 4:
                cr crVar4 = (cr) objArr[0];
                int i34 = f55022q;
                int i35 = i34 & 93;
                int i36 = ((i34 ^ 93) | i35) << 1;
                int i37 = -((i34 | 93) & (~i35));
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                f55023r = i38 % 128;
                int i39 = i38 % 2;
                h hVar5 = crVar4.m;
                boolean zBooleanValue4 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar5, crVar4, kPropertyArr[7]}, -709183664, 709183665, System.identityHashCode(hVar5))).booleanValue();
                int i40 = f55023r + 49;
                f55022q = i40 % 128;
                if (i40 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue4);
                }
                throw null;
            case 5:
                cr crVar5 = (cr) objArr[0];
                int i41 = f55022q + 3;
                f55023r = i41 % 128;
                int i42 = i41 % 2;
                h hVar6 = crVar5.f55027i;
                boolean zBooleanValue5 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar6, crVar5, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar6))).booleanValue();
                int i43 = f55022q;
                int i44 = ((i43 | 43) << 1) - (i43 ^ 43);
                f55023r = i44 % 128;
                int i45 = i44 % 2;
                return Boolean.valueOf(zBooleanValue5);
            case 6:
                cr crVar6 = (cr) objArr[0];
                int i46 = f55023r;
                int i47 = (i46 ^ 109) + ((i46 & 109) << 1);
                f55022q = i47 % 128;
                int i48 = i47 % 2;
                h hVar7 = crVar6.f55028j;
                boolean zBooleanValue6 = ((Boolean) (i48 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar7, crVar6, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar7)) : h.setOnFocusChangeListener(new Object[]{hVar7, crVar6, kPropertyArr[4]}, -709183664, 709183665, System.identityHashCode(hVar7)))).booleanValue();
                int i49 = f55023r;
                int i50 = i49 & 105;
                int i51 = -(-((i49 ^ 105) | i50));
                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                f55022q = i52 % 128;
                if (i52 % 2 != 0) {
                    int i53 = 30 / 0;
                }
                boolValueOf = Boolean.valueOf(zBooleanValue6);
                break;
            case 7:
                cr crVar7 = (cr) objArr[0];
                int i54 = f55022q;
                int i55 = i54 & 43;
                int i56 = -(-((i54 ^ 43) | i55));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                f55023r = i57 % 128;
                if (i57 % 2 == 0) {
                    h hVar8 = crVar7.f55031n;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar8, crVar7, kPropertyArr[35]}, -709183664, 709183665, System.identityHashCode(hVar8));
                } else {
                    h hVar9 = crVar7.f55031n;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar9, crVar7, kPropertyArr[8]}, -709183664, 709183665, System.identityHashCode(hVar9));
                }
                return Boolean.valueOf(((Boolean) onFocusChangeListener).booleanValue());
            case 8:
                cr crVar8 = (cr) objArr[0];
                int i58 = f55023r;
                int i59 = ((i58 ^ 110) + ((i58 & 110) << 1)) - 1;
                f55022q = i59 % 128;
                int i60 = i59 % 2;
                h hVar10 = crVar8.f55026h;
                boolean zBooleanValue7 = ((Boolean) (i60 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar10, crVar8, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar10)) : h.setOnFocusChangeListener(new Object[]{hVar10, crVar8, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar10)))).booleanValue();
                int i61 = f55022q;
                int i62 = i61 & 65;
                int i63 = (((i61 | 65) & (~i62)) - (~(-(-(i62 << 1))))) - 1;
                f55023r = i63 % 128;
                if (i63 % 2 == 0) {
                    int i64 = 16 / 0;
                }
                boolValueOf = Boolean.valueOf(zBooleanValue7);
                break;
            case 9:
                cr crVar9 = (cr) objArr[0];
                int i65 = f55023r;
                int i66 = ((i65 & 102) + (i65 | 102)) - 1;
                f55022q = i66 % 128;
                int i67 = i66 % 2;
                h hVar11 = crVar9.f55032o;
                boolean zBooleanValue8 = ((Boolean) (i67 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar11, crVar9, kPropertyArr[56]}, -709183664, 709183665, System.identityHashCode(hVar11)) : h.setOnFocusChangeListener(new Object[]{hVar11, crVar9, kPropertyArr[11]}, -709183664, 709183665, System.identityHashCode(hVar11)))).booleanValue();
                int i68 = f55022q;
                int i69 = i68 ^ 29;
                int i70 = (i68 & 29) << 1;
                int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                f55023r = i71 % 128;
                if (i71 % 2 != 0) {
                    return Boolean.valueOf(zBooleanValue8);
                }
                throw null;
            case 10:
                cr crVar10 = (cr) objArr[0];
                int i72 = f55022q;
                int i73 = i72 ^ 53;
                int i74 = ((i72 & 53) | i73) << 1;
                int i75 = -i73;
                int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                f55023r = i76 % 128;
                int i77 = i76 % 2;
                h hVar12 = crVar10.f55025g;
                boolean zBooleanValue9 = ((Boolean) (i77 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar12, crVar10, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar12)) : h.setOnFocusChangeListener(new Object[]{hVar12, crVar10, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar12)))).booleanValue();
                int i78 = f55023r;
                int i79 = i78 ^ 31;
                int i80 = (((i78 & 31) | i79) << 1) - i79;
                f55022q = i80 % 128;
                if (i80 % 2 != 0) {
                    int i81 = 6 / 0;
                }
                boolValueOf = Boolean.valueOf(zBooleanValue9);
                break;
            case 11:
                cr crVar11 = (cr) objArr[0];
                boolean zBooleanValue10 = ((Boolean) objArr[1]).booleanValue();
                int i82 = f55023r;
                int i83 = (((i82 | 50) << 1) - (i82 ^ 50)) - 1;
                f55022q = i83 % 128;
                int i84 = i83 % 2;
                h hVar13 = crVar11.f55030l;
                h.setOnFocusChangeListener(new Object[]{hVar13, crVar11, kPropertyArr[6], Boolean.valueOf(zBooleanValue10)}, 951550455, -951550455, System.identityHashCode(hVar13));
                int i85 = f55023r + 9;
                f55022q = i85 % 128;
                if (i85 % 2 == 0) {
                    return null;
                }
                int i86 = 94 / 0;
                return null;
            case 12:
                cr crVar12 = (cr) objArr[0];
                int i87 = f55023r;
                int i88 = i87 & 125;
                int i89 = i88 + ((i87 ^ 125) | i88);
                f55022q = i89 % 128;
                int i90 = i89 % 2;
                h hVar14 = crVar12.f55024f;
                return Boolean.valueOf(((Boolean) (i90 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar14, crVar12, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar14)) : h.setOnFocusChangeListener(new Object[]{hVar14, crVar12, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar14)))).booleanValue());
            default:
                cr crVar13 = (cr) objArr[0];
                int i91 = f55022q;
                int i92 = (((i91 | 20) << 1) - (i91 ^ 20)) - 1;
                f55023r = i92 % 128;
                int i93 = i92 % 2;
                h hVar15 = crVar13.f55029k;
                boolean zBooleanValue11 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar15, crVar13, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar15))).booleanValue();
                int i94 = f55023r;
                int i95 = i94 & 77;
                int i96 = (i94 | 77) & (~i95);
                int i97 = i95 << 1;
                int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
                f55022q = i98 % 128;
                int i99 = i98 % 2;
                return Boolean.valueOf(zBooleanValue11);
        }
        return boolValueOf;
    }

    public final boolean UiMessageCallbackKtWhenMappings() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 352286407, -352286406, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1523021381, 1523021393, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1991636604, 1991636608, System.identityHashCode(this))).booleanValue();
    }

    public final void setCompoundDrawableTintBlendMode(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 2136829513, -2136829502, System.identityHashCode(this));
    }

    public final boolean setIncludeFontPadding() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1815100415, -1815100409, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -426527980, 426527990, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1286694359, -1286694351, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setOnEditorActionListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 720483124, -720483117, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setTextAlignment() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -798032540, 798032540, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setTextScaleX() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1108158449, -1108158440, System.identityHashCode(this))).booleanValue();
    }

    public final void setX(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 1459052326, -1459052324, System.identityHashCode(this));
    }

    public final boolean setZ() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -590986648, 590986653, System.identityHashCode(this))).booleanValue();
    }

    public final void setDividerPadding(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -2146251303, 2146251306, System.identityHashCode(this));
    }
}
