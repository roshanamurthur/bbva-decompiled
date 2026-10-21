package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class kh extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f56785p = {c.e(kh.class, "onlinePinRequired_B1b8", "getOnlinePinRequired_B1b8()Z", 0), c.e(kh.class, "signatureRequired_B1b7", "getSignatureRequired_B1b7()Z", 0), c.e(kh.class, "pidLimitReachedLoyaltyTransactionApproved_B1b6", "getPidLimitReachedLoyaltyTransactionApproved_B1b6()Z", 0), c.e(kh.class, "consumerDeviceCvmPerformed_B1b5", "getConsumerDeviceCvmPerformed_B1b5()Z", 0), c.e(kh.class, "switchOtherInterfaceIfUnableToProcessOnline_B2b8", "getSwitchOtherInterfaceIfUnableToProcessOnline_B2b8()Z", 0), c.e(kh.class, "processOnlineIfCdaFailed_B2b7", "getProcessOnlineIfCdaFailed_B2b7()Z", 0), c.e(kh.class, "declineSwitchOtherInterfaceIfCdaFailed_B2b6", "getDeclineSwitchOtherInterfaceIfCdaFailed_B2b6()Z", 0), c.e(kh.class, "issuerUpdateProcessingSupported_B2b5", "getIssuerUpdateProcessingSupported_B2b5()Z", 0), c.e(kh.class, "processOnlineIfCardExpired_B2b4", "getProcessOnlineIfCardExpired_B2b4()Z", 0), c.e(kh.class, "declineIfCardExpired_B2b3", "getDeclineIfCardExpired_B2b3()Z", 0), c.e(kh.class, "cvmFallbackToSignatureAllowed_B2b2", "getCvmFallbackToSignatureAllowed_B2b2()Z", 0), c.e(kh.class, "cvmFallbackToNoCvmAllowed_B2b1", "getCvmFallbackToNoCvmAllowed_B2b1()Z", 0)};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f56786q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f56787r = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f56788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f56789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f56790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f56791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final h f56792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final h f56793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f56794l;

    @NotNull
    public final h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final h f56795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final h f56796o;

    static {
        int i10 = f56786q;
        int i11 = i10 & 81;
        int i12 = ((((i10 ^ 81) | i11) << 1) - (~(-((i10 | 81) & (~i11))))) - 1;
        f56787r = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public kh() {
        super(setAnimation.compareTo().setDividerPadding());
        this.f56788f = new h(0, 7);
        this.f56789g = new h(0, 6);
        this.f56790h = new h(0, 5);
        this.f56791i = new h(0, 4);
        new h(1, 7);
        this.f56792j = new h(1, 6);
        this.f56793k = new h(1, 5);
        new h(1, 4);
        this.f56794l = new h(1, 3);
        this.m = new h(1, 2);
        this.f56795n = new h(1, 1);
        this.f56796o = new h(1, 0);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        int i17 = ((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711));
        KProperty<Object>[] kPropertyArr = f56785p;
        switch (i17) {
            case 1:
                kh khVar = (kh) objArr[0];
                int i18 = f56787r;
                int i19 = i18 ^ 79;
                int i20 = -(-((i18 & 79) << 1));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f56786q = i21 % 128;
                int i22 = i21 % 2;
                h hVar = khVar.f56796o;
                return Boolean.valueOf(((Boolean) (i22 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar, khVar, kPropertyArr[122]}, -709183664, 709183665, System.identityHashCode(hVar)) : h.setOnFocusChangeListener(new Object[]{hVar, khVar, kPropertyArr[11]}, -709183664, 709183665, System.identityHashCode(hVar)))).booleanValue());
            case 2:
                kh khVar2 = (kh) objArr[0];
                int i23 = f56786q;
                int i24 = i23 & 23;
                int i25 = (i23 | 23) & (~i24);
                int i26 = i24 << 1;
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                f56787r = i27 % 128;
                int i28 = i27 % 2;
                h hVar2 = khVar2.f56791i;
                boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar2, khVar2, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar2))).booleanValue();
                int i29 = f56787r;
                int i30 = i29 & 81;
                int i31 = ((((i29 ^ 81) | i30) << 1) - (~(-((i29 | 81) & (~i30))))) - 1;
                f56786q = i31 % 128;
                if (i31 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            case 3:
                kh khVar3 = (kh) objArr[0];
                int i32 = f56786q;
                int i33 = i32 & 87;
                int i34 = (i32 | 87) & (~i33);
                int i35 = i33 << 1;
                int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
                f56787r = i36 % 128;
                int i37 = i36 % 2;
                h hVar3 = khVar3.f56789g;
                return Boolean.valueOf(((Boolean) (i37 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar3, khVar3, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar3)) : h.setOnFocusChangeListener(new Object[]{hVar3, khVar3, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar3)))).booleanValue());
            case 4:
                kh khVar4 = (kh) objArr[0];
                int i38 = f56786q;
                int i39 = (((i38 & (-84)) | ((~i38) & 83)) - (~((83 & i38) << 1))) - 1;
                f56787r = i39 % 128;
                int i40 = i39 % 2;
                h hVar4 = khVar4.f56794l;
                boolean zBooleanValue2 = ((Boolean) (i40 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar4, khVar4, kPropertyArr[15]}, -709183664, 709183665, System.identityHashCode(hVar4)) : h.setOnFocusChangeListener(new Object[]{hVar4, khVar4, kPropertyArr[8]}, -709183664, 709183665, System.identityHashCode(hVar4)))).booleanValue();
                int i41 = f56786q;
                int i42 = i41 & 115;
                int i43 = ((((i41 ^ 115) | i42) << 1) - (~(-((i41 | 115) & (~i42))))) - 1;
                f56787r = i43 % 128;
                if (i43 % 2 == 0) {
                    int i44 = 12 / 0;
                }
                return Boolean.valueOf(zBooleanValue2);
            case 5:
                kh khVar5 = (kh) objArr[0];
                int i45 = f56787r;
                int i46 = (i45 & 13) + (i45 | 13);
                f56786q = i46 % 128;
                int i47 = i46 % 2;
                h hVar5 = khVar5.f56788f;
                boolean zBooleanValue3 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar5, khVar5, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar5))).booleanValue();
                int i48 = f56787r;
                int i49 = (((i48 | 34) << 1) - (i48 ^ 34)) - 1;
                f56786q = i49 % 128;
                int i50 = i49 % 2;
                return Boolean.valueOf(zBooleanValue3);
            case 6:
                kh khVar6 = (kh) objArr[0];
                int i51 = f56786q + 27;
                f56787r = i51 % 128;
                int i52 = i51 % 2;
                h hVar6 = khVar6.m;
                boolean zBooleanValue4 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar6, khVar6, kPropertyArr[9]}, -709183664, 709183665, System.identityHashCode(hVar6))).booleanValue();
                int i53 = f56787r;
                int i54 = i53 & 63;
                int i55 = i54 + ((i53 ^ 63) | i54);
                f56786q = i55 % 128;
                if (i55 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue4);
                }
                throw null;
            case 7:
                kh khVar7 = (kh) objArr[0];
                System.identityHashCode(khVar7);
                System.identityHashCode(khVar7);
                h hVar7 = khVar7.f56790h;
                boolean zBooleanValue5 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar7, khVar7, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar7))).booleanValue();
                int i56 = f56787r;
                int i57 = (i56 ^ 19) + ((i56 & 19) << 1);
                f56786q = i57 % 128;
                if (i57 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue5);
                }
                throw null;
            case 8:
                kh khVar8 = (kh) objArr[0];
                int i58 = f56787r;
                int i59 = ((i58 | 7) << 1) - (i58 ^ 7);
                f56786q = i59 % 128;
                int i60 = i59 % 2;
                h hVar8 = khVar8.f56793k;
                boolean zBooleanValue6 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar8, khVar8, kPropertyArr[6]}, -709183664, 709183665, System.identityHashCode(hVar8))).booleanValue();
                int i61 = f56787r;
                int i62 = i61 & 101;
                int i63 = (i61 ^ 101) | i62;
                int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                f56786q = i64 % 128;
                int i65 = i64 % 2;
                return Boolean.valueOf(zBooleanValue6);
            case 9:
                kh khVar9 = (kh) objArr[0];
                int i66 = f56786q;
                int i67 = i66 ^ 97;
                int i68 = -(-((i66 & 97) << 1));
                int i69 = (i67 & i68) + (i68 | i67);
                f56787r = i69 % 128;
                int i70 = i69 % 2;
                h hVar9 = khVar9.f56795n;
                boolean zBooleanValue7 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar9, khVar9, kPropertyArr[10]}, -709183664, 709183665, System.identityHashCode(hVar9))).booleanValue();
                int i71 = f56787r;
                int i72 = ((i71 & 83) - (~(-(-(83 | i71))))) - 1;
                f56786q = i72 % 128;
                if (i72 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue7);
                }
                throw null;
            default:
                kh khVar10 = (kh) objArr[0];
                int i73 = f56787r;
                int i74 = ((i73 ^ 81) | (i73 & 81)) << 1;
                int i75 = -(((~i73) & 81) | (i73 & (-82)));
                int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                f56786q = i76 % 128;
                int i77 = i76 % 2;
                h hVar10 = khVar10.f56792j;
                boolean zBooleanValue8 = ((Boolean) (i77 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar10, khVar10, kPropertyArr[4]}, -709183664, 709183665, System.identityHashCode(hVar10)) : h.setOnFocusChangeListener(new Object[]{hVar10, khVar10, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar10)))).booleanValue();
                int i78 = f56787r;
                int i79 = ((i78 ^ 10) + ((i78 & 10) << 1)) - 1;
                f56786q = i79 % 128;
                if (i79 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue8);
                }
                throw null;
        }
    }

    public final boolean UiMessageCallbackKtWhenMappings() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -102916255, 102916263, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getAmountFieldTextColor() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1961484936, -1961484935, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 590359461, -590359456, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1245743152, -1245743150, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setChildDivider() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 563562359, -563562350, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setIncludeFontPadding() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -415067137, 415067143, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1185078793, -1185078786, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1645668590, -1645668587, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setTextAlignment() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1935116275, 1935116275, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setZ() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -460704695, 460704699, System.identityHashCode(this))).booleanValue();
    }
}
