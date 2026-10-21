package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ji extends t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f56640l = {c.e(ji.class, "aeipsContactModeSupported_B1b8", "getAeipsContactModeSupported_B1b8()Z", 0), c.e(ji.class, "expresspayMagstripeModeSupported_B1b7", "getExpresspayMagstripeModeSupported_B1b7()Z", 0), c.e(ji.class, "expresspayEmvFullOnlineModeNotSupported_B1b6", "getExpresspayEmvFullOnlineModeNotSupported_B1b6()Z", 0), c.e(ji.class, "expresspayEmvPartialOnlineModeSupported_B1b5", "getExpresspayEmvPartialOnlineModeSupported_B1b5()Z", 0), c.e(ji.class, "expresspayMobileSupported_B1b4", "getExpresspayMobileSupported_B1b4()Z", 0), c.e(ji.class, "tryAnotherInterfaceAfterADecline_B1b3", "getTryAnotherInterfaceAfterADecline_B1b3()Z", 0), c.e(ji.class, "mobileCvmSupported_B2b8", "getMobileCvmSupported_B2b8()Z", 0), c.e(ji.class, "onlinePinSupported_B2b7", "getOnlinePinSupported_B2b7()Z", 0), c.e(ji.class, "signature_B2b6", "getSignature_B2b6()Z", 0), c.e(ji.class, "plaintextOfflinePin_B2b5", "getPlaintextOfflinePin_B2b5()Z", 0), c.e(ji.class, "terminalIsOfflineOnly_B3b8", "getTerminalIsOfflineOnly_B3b8()Z", 0), c.e(ji.class, "cvmRequired_B3b7", "getCvmRequired_B3b7()Z", 0), c.e(ji.class, "terminalExemptFromNoCvmChecks_B4b8", "getTerminalExemptFromNoCvmChecks_B4b8()Z", 0), c.e(ji.class, "delayedAuthorizationTerminal_B4b7", "getDelayedAuthorizationTerminal_B4b7()Z", 0), c.e(ji.class, "transitTerminal_B4b6", "getTransitTerminal_B4b6()Z", 0), c.e(ji.class, "expresspayKernelVersion_B4b3b1", "getExpresspayKernelVersion_B4b3b1()Lcom/mypinpad/softpos/emv/terminal/kernel/kernel4/model/smarttag/tag/terminal/ExpresspayKernelVersion;", 0)};
    public static int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f56641n = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f56642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f56643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f56644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f56645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final h f56646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final h f56647k;

    static {
        int i10 = m + 27;
        f56641n = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public ji() {
        super(setAnimation.setTextLocale().setDividerPadding());
        this.f56642f = new h(0, 7);
        this.f56643g = new h(0, 6);
        new h(0, 5);
        new h(0, 4);
        new h(0, 3);
        new h(0, 2);
        this.f56644h = new h(1, 7);
        this.f56645i = new h(1, 6);
        this.f56646j = new h(1, 5);
        new h(1, 4);
        new h(2, 7);
        this.f56647k = new h(2, 6);
        new h(3, 7);
        new h(3, 6);
        new h(3, 5);
        jg.Companion companion = jg.INSTANCE;
        new n(3, 2, 0, (openContextMenu) jg.Companion.setCompoundDrawableTintBlendMode(new Object[0], -756573368, 756573368, (int) System.currentTimeMillis()));
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167));
        KProperty<Object>[] kPropertyArr = f56640l;
        switch (i18) {
            case 1:
                ji jiVar = (ji) objArr[0];
                int i19 = f56641n;
                int i20 = (i19 & 11) + (i19 | 11);
                m = i20 % 128;
                int i21 = i20 % 2;
                h hVar = jiVar.f56646j;
                boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, jiVar, kPropertyArr[8]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue();
                int i22 = f56641n;
                int i23 = i22 & 9;
                int i24 = i23 + ((i22 ^ 9) | i23);
                m = i24 % 128;
                if (i24 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            case 2:
                ji jiVar2 = (ji) objArr[0];
                int i25 = f56641n;
                int i26 = (((i25 & (-58)) | ((~i25) & 57)) - (~((i25 & 57) << 1))) - 1;
                m = i26 % 128;
                int i27 = i26 % 2;
                h hVar2 = jiVar2.f56644h;
                boolean zBooleanValue2 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar2, jiVar2, kPropertyArr[6]}, -709183664, 709183665, System.identityHashCode(hVar2))).booleanValue();
                int i28 = m;
                int i29 = ((i28 ^ 104) + ((i28 & 104) << 1)) - 1;
                f56641n = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 90 / 0;
                }
                return Boolean.valueOf(zBooleanValue2);
            case 3:
                ji jiVar3 = (ji) objArr[0];
                int i31 = m;
                int i32 = ((((i31 ^ 71) | (i31 & 71)) << 1) - (~(-(((~i31) & 71) | (i31 & (-72)))))) - 1;
                f56641n = i32 % 128;
                if (i32 % 2 == 0) {
                    h hVar3 = jiVar3.f56647k;
                    h.setOnFocusChangeListener(new Object[]{hVar3, jiVar3, kPropertyArr[34], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar3));
                    return null;
                }
                h hVar4 = jiVar3.f56647k;
                h.setOnFocusChangeListener(new Object[]{hVar4, jiVar3, kPropertyArr[11], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar4));
                return null;
            case 4:
                ji jiVar4 = (ji) objArr[0];
                int i33 = m;
                int i34 = i33 & 43;
                int i35 = (((i33 ^ 43) | i34) << 1) - ((i33 | 43) & (~i34));
                f56641n = i35 % 128;
                int i36 = i35 % 2;
                h hVar5 = jiVar4.f56643g;
                boolean zBooleanValue3 = ((Boolean) (i36 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar5, jiVar4, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar5)) : h.setOnFocusChangeListener(new Object[]{hVar5, jiVar4, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar5)))).booleanValue();
                int i37 = f56641n;
                int i38 = ((i37 | 15) << 1) - (i37 ^ 15);
                m = i38 % 128;
                if (i38 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue3);
                }
                throw null;
            case 5:
                ji jiVar5 = (ji) objArr[0];
                int i39 = f56641n + 36;
                int i40 = (i39 ^ (-1)) + (i39 << 1);
                m = i40 % 128;
                int i41 = i40 % 2;
                h hVar6 = jiVar5.f56647k;
                return Boolean.valueOf(((Boolean) (i41 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar6, jiVar5, kPropertyArr[90]}, -709183664, 709183665, System.identityHashCode(hVar6)) : h.setOnFocusChangeListener(new Object[]{hVar6, jiVar5, kPropertyArr[11]}, -709183664, 709183665, System.identityHashCode(hVar6)))).booleanValue());
            case 6:
                ji jiVar6 = (ji) objArr[0];
                int i42 = f56641n;
                int i43 = (i42 & 91) + (i42 | 91);
                m = i43 % 128;
                int i44 = i43 % 2;
                h hVar7 = jiVar6.f56642f;
                return Boolean.valueOf(((Boolean) (i44 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar7, jiVar6, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar7)) : h.setOnFocusChangeListener(new Object[]{hVar7, jiVar6, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar7)))).booleanValue());
            default:
                ji jiVar7 = (ji) objArr[0];
                int i45 = f56641n;
                int i46 = (i45 & 59) + (i45 | 59);
                m = i46 % 128;
                int i47 = i46 % 2;
                h hVar8 = jiVar7.f56645i;
                boolean zBooleanValue4 = ((Boolean) (i47 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar8, jiVar7, kPropertyArr[61]}, -709183664, 709183665, System.identityHashCode(hVar8)) : h.setOnFocusChangeListener(new Object[]{hVar8, jiVar7, kPropertyArr[7]}, -709183664, 709183665, System.identityHashCode(hVar8)))).booleanValue();
                int i48 = m;
                int i49 = ((i48 & 2) + (i48 | 2)) - 1;
                f56641n = i49 % 128;
                int i50 = i49 % 2;
                return Boolean.valueOf(zBooleanValue4);
        }
    }

    public final boolean UiMessageCallbackKtWhenMappings() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 858549070, -858549065, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 3313946, -3313944, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 462990443, -462990443, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1505013453, -1505013449, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -2048597984, 2048597990, System.identityHashCode(this))).booleanValue();
    }

    public final void setTextAlignment() {
        setDividerPadding(new Object[]{this}, 1403259952, -1403259949, System.identityHashCode(this));
    }

    public final boolean setZ() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 647380318, -647380317, System.identityHashCode(this))).booleanValue();
    }
}
