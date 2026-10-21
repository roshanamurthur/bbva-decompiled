package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class am extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f53117p = {c.e(am.class, "sdaSupported_B1b7", "getSdaSupported_B1b7()Z", 0), c.e(am.class, "ddaSupported_B1b6", "getDdaSupported_B1b6()Z", 0), c.e(am.class, "cardholderVerificationIsSupported_B1b5", "getCardholderVerificationIsSupported_B1b5()Z", 0), c.e(am.class, "terminalRiskManagementIsToBePerformed_B1b4", "getTerminalRiskManagementIsToBePerformed_B1b4()Z", 0), c.e(am.class, "issuerAuthenticationIsSupported_B1b3", "getIssuerAuthenticationIsSupported_B1b3()Z", 0), c.e(am.class, "onDeviceCardholderVerificationIsSupported_B1b2", "getOnDeviceCardholderVerificationIsSupported_B1b2()Z", 0), c.e(am.class, "cdaSupported_B1b1", "getCdaSupported_B1b1()Z", 0), c.e(am.class, "emvModeIsSupported_B2b8", "getEmvModeIsSupported_B2b8()Z", 0), c.e(am.class, "contactlessMobileIsSupported_B2b7", "getContactlessMobileIsSupported_B2b7()Z", 0), c.e(am.class, "mobileHceIsSupported_B2b6", "getMobileHceIsSupported_B2b6()Z", 0), c.e(am.class, "relayResistanceProtocolIsSupported_B2b1", "getRelayResistanceProtocolIsSupported_B2b1()Z", 0)};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f53118q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f53119r = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f53120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f53121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f53122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f53123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final h f53124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final h f53125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f53126l;

    @NotNull
    public final h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final h f53127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final h f53128o;

    static {
        int i10 = f53118q;
        int i11 = ((i10 | 72) << 1) - (i10 ^ 72);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f53119r = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public am() {
        super(setAnimation.printStackTrace().setDividerPadding());
        this.f53120f = new h(0, 6);
        this.f53121g = new h(0, 5);
        this.f53122h = new h(0, 4);
        this.f53123i = new h(0, 3);
        new h(0, 2);
        this.f53124j = new h(0, 1);
        this.f53125k = new h(0, 0);
        this.f53126l = new h(1, 7);
        this.m = new h(1, 6);
        this.f53127n = new h(1, 5);
        this.f53128o = new h(1, 0);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        Object onFocusChangeListener2;
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13;
        KProperty<Object>[] kPropertyArr = f53117p;
        switch (i16) {
            case 1:
                am amVar = (am) objArr[0];
                int i17 = f53119r;
                int i18 = (i17 ^ 91) + ((i17 & 91) << 1);
                f53118q = i18 % 128;
                int i19 = i18 % 2;
                h hVar = amVar.f53122h;
                boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, amVar, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue();
                int i20 = f53118q + 119;
                f53119r = i20 % 128;
                int i21 = i20 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 2:
                am amVar2 = (am) objArr[0];
                int i22 = f53119r;
                int i23 = ((i22 & (-26)) | ((~i22) & 25)) + ((i22 & 25) << 1);
                f53118q = i23 % 128;
                int i24 = i23 % 2;
                h hVar2 = amVar2.f53123i;
                boolean zBooleanValue2 = ((Boolean) (i24 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar2, amVar2, kPropertyArr[4]}, -709183664, 709183665, System.identityHashCode(hVar2)) : h.setOnFocusChangeListener(new Object[]{hVar2, amVar2, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar2)))).booleanValue();
                int i25 = f53119r;
                int i26 = i25 & 3;
                int i27 = ((((i25 ^ 3) | i26) << 1) - (~(-((i25 | 3) & (~i26))))) - 1;
                f53118q = i27 % 128;
                if (i27 % 2 != 0) {
                    int i28 = 65 / 0;
                }
                return Boolean.valueOf(zBooleanValue2);
            case 3:
                am amVar3 = (am) objArr[0];
                int i29 = f53118q + 41;
                f53119r = i29 % 128;
                int i30 = i29 % 2;
                h hVar3 = amVar3.f53125k;
                boolean zBooleanValue3 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar3, amVar3, kPropertyArr[6]}, -709183664, 709183665, System.identityHashCode(hVar3))).booleanValue();
                int i31 = f53118q + 117;
                f53119r = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 43 / 0;
                }
                return Boolean.valueOf(zBooleanValue3);
            case 4:
                am amVar4 = (am) objArr[0];
                int i33 = f53119r;
                int i34 = (((i33 | 120) << 1) - (i33 ^ 120)) - 1;
                f53118q = i34 % 128;
                int i35 = i34 % 2;
                h hVar4 = amVar4.f53126l;
                boolean zBooleanValue4 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar4, amVar4, kPropertyArr[7]}, -709183664, 709183665, System.identityHashCode(hVar4))).booleanValue();
                int i36 = f53119r;
                int i37 = i36 & 97;
                int i38 = i37 + ((i36 ^ 97) | i37);
                f53118q = i38 % 128;
                if (i38 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue4);
                }
                throw null;
            case 5:
                am amVar5 = (am) objArr[0];
                int i39 = f53118q;
                int i40 = i39 & 55;
                int i41 = i39 | 55;
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f53119r = i42 % 128;
                int i43 = i42 % 2;
                h hVar5 = amVar5.f53128o;
                return Boolean.valueOf(((Boolean) (i43 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar5, amVar5, kPropertyArr[4]}, -709183664, 709183665, System.identityHashCode(hVar5)) : h.setOnFocusChangeListener(new Object[]{hVar5, amVar5, kPropertyArr[10]}, -709183664, 709183665, System.identityHashCode(hVar5)))).booleanValue());
            case 6:
                am amVar6 = (am) objArr[0];
                int i44 = f53119r;
                int i45 = i44 ^ 113;
                int i46 = (((i44 & 113) | i45) << 1) - i45;
                f53118q = i46 % 128;
                if (i46 % 2 != 0) {
                    h hVar6 = amVar6.f53124j;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar6, amVar6, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar6));
                } else {
                    h hVar7 = amVar6.f53124j;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar7, amVar6, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar7));
                }
                boolean zBooleanValue5 = ((Boolean) onFocusChangeListener).booleanValue();
                int i47 = f53119r;
                int i48 = ((i47 ^ 126) + ((i47 & 126) << 1)) - 1;
                f53118q = i48 % 128;
                int i49 = i48 % 2;
                return Boolean.valueOf(zBooleanValue5);
            case 7:
                am amVar7 = (am) objArr[0];
                int i50 = f53119r;
                int i51 = i50 & 55;
                int i52 = (i51 - (~(-(-((i50 ^ 55) | i51))))) - 1;
                f53118q = i52 % 128;
                int i53 = i52 % 2;
                h hVar8 = amVar7.f53127n;
                boolean zBooleanValue6 = ((Boolean) (i53 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar8, amVar7, kPropertyArr[66]}, -709183664, 709183665, System.identityHashCode(hVar8)) : h.setOnFocusChangeListener(new Object[]{hVar8, amVar7, kPropertyArr[9]}, -709183664, 709183665, System.identityHashCode(hVar8)))).booleanValue();
                int i54 = f53118q;
                int i55 = ((i54 ^ 83) | (i54 & 83)) << 1;
                int i56 = -(((~i54) & 83) | (i54 & (-84)));
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                f53119r = i57 % 128;
                int i58 = i57 % 2;
                return Boolean.valueOf(zBooleanValue6);
            case 8:
                am amVar8 = (am) objArr[0];
                int i59 = f53119r;
                int i60 = ((i59 & 61) - (~(i59 | 61))) - 1;
                f53118q = i60 % 128;
                int i61 = i60 % 2;
                h hVar9 = amVar8.m;
                return Boolean.valueOf(((Boolean) (i61 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar9, amVar8, kPropertyArr[68]}, -709183664, 709183665, System.identityHashCode(hVar9)) : h.setOnFocusChangeListener(new Object[]{hVar9, amVar8, kPropertyArr[8]}, -709183664, 709183665, System.identityHashCode(hVar9)))).booleanValue());
            case 9:
                am amVar9 = (am) objArr[0];
                int i62 = f53118q + 125;
                f53119r = i62 % 128;
                if (i62 % 2 == 0) {
                    h hVar10 = amVar9.f53121g;
                    onFocusChangeListener2 = h.setOnFocusChangeListener(new Object[]{hVar10, amVar9, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar10));
                } else {
                    h hVar11 = amVar9.f53121g;
                    onFocusChangeListener2 = h.setOnFocusChangeListener(new Object[]{hVar11, amVar9, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar11));
                }
                boolean zBooleanValue7 = ((Boolean) onFocusChangeListener2).booleanValue();
                int i63 = f53119r + 29;
                f53118q = i63 % 128;
                int i64 = i63 % 2;
                return Boolean.valueOf(zBooleanValue7);
            default:
                am amVar10 = (am) objArr[0];
                int i65 = f53118q;
                int i66 = i65 & 97;
                int i67 = (i65 ^ 97) | i66;
                int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                f53119r = i68 % 128;
                int i69 = i68 % 2;
                h hVar12 = amVar10.f53120f;
                boolean zBooleanValue8 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar12, amVar10, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar12))).booleanValue();
                int i70 = f53118q;
                int i71 = (i70 ^ 115) + ((i70 & 115) << 1);
                f53119r = i71 % 128;
                int i72 = i71 % 2;
                return Boolean.valueOf(zBooleanValue8);
        }
    }

    public final boolean UiMessageCallbackKtWhenMappings() {
        return ((Boolean) setY(new Object[]{this}, -1841382210, 1841382214, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -1378668101, 1378668110, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setY(new Object[]{this}, -776903, 776911, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setCompoundDrawablePadding() {
        return ((Boolean) setY(new Object[]{this}, -146153948, 146153955, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setIncludeFontPadding() {
        return ((Boolean) setY(new Object[]{this}, -514113289, 514113295, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setY(new Object[]{this}, -1574629909, 1574629909, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setY(new Object[]{this}, 27011347, -27011346, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setTextAlignment() {
        return ((Boolean) setY(new Object[]{this}, -1201480057, 1201480059, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setTextScaleX() {
        return ((Boolean) setY(new Object[]{this}, 1965114111, -1965114106, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setZ() {
        return ((Boolean) setY(new Object[]{this}, -452511308, 452511311, System.identityHashCode(this))).booleanValue();
    }
}
