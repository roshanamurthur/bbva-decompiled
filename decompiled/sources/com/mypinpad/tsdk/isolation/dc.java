package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class dc extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55129j = {c.e(dc.class, "offlineDataAuthenticationWasPerformed_B1b8", "getOfflineDataAuthenticationWasPerformed_B1b8()Z", 0), c.e(dc.class, "cardholderVerificationWasPerformed_B1b7", "getCardholderVerificationWasPerformed_B1b7()Z", 0), c.e(dc.class, "cardRiskManagementWasPerformed_B1b6", "getCardRiskManagementWasPerformed_B1b6()Z", 0), c.e(dc.class, "issuerAuthenticationWasPerformed_B1b5", "getIssuerAuthenticationWasPerformed_B1b5()Z", 0), c.e(dc.class, "terminalRiskManagementWasPerformed_B1b4", "getTerminalRiskManagementWasPerformed_B1b4()Z", 0), c.e(dc.class, "scriptProcessingWasPerformed_B1b3", "getScriptProcessingWasPerformed_B1b3()Z", 0)};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f55130k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f55131l = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f55132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f55133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f55134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f55135i;

    static {
        int i10 = f55130k;
        int i11 = (i10 ^ 13) + ((i10 & 13) << 1);
        f55131l = i11 % 128;
        int i12 = i11 % 2;
    }

    public dc() {
        super(setAnimation.setImportantForContentCapture().setDividerPadding());
        this.f55132f = new h(0, 7);
        this.f55133g = new h(0, 6);
        this.f55134h = new h(0, 5);
        new h(0, 4);
        this.f55135i = new h(0, 3);
        new h(0, 2);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i12)) | (~((~i10) | i14)) | (~(i11 | i12))) * 831) + ((~(i13 | i10 | i12)) * (-1662)) + (((~(i13 | i14)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830));
        KProperty<Object>[] kPropertyArr = f55129j;
        if (i15 == 1) {
            dc dcVar = (dc) objArr[0];
            int i16 = f55130k + 30;
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            f55131l = i17 % 128;
            int i18 = i17 % 2;
            h hVar = dcVar.f55132f;
            if (i18 == 0) {
                h.setOnFocusChangeListener(new Object[]{hVar, dcVar, kPropertyArr[0], Boolean.FALSE}, 951550455, -951550455, System.identityHashCode(hVar));
            } else {
                h.setOnFocusChangeListener(new Object[]{hVar, dcVar, kPropertyArr[0], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar));
            }
            int i19 = f55130k;
            int i20 = ((i19 ^ 73) | (i19 & 73)) << 1;
            int i21 = -(((~i19) & 73) | (i19 & (-74)));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f55131l = i22 % 128;
            int i23 = i22 % 2;
        } else if (i15 == 2) {
            dc dcVar2 = (dc) objArr[0];
            int i24 = f55131l;
            int i25 = (i24 ^ 47) + ((i24 & 47) << 1);
            f55130k = i25 % 128;
            int i26 = i25 % 2;
            h hVar2 = dcVar2.f55135i;
            if (i26 != 0) {
                h.setOnFocusChangeListener(new Object[]{hVar2, dcVar2, kPropertyArr[5], Boolean.FALSE}, 951550455, -951550455, System.identityHashCode(hVar2));
            } else {
                h.setOnFocusChangeListener(new Object[]{hVar2, dcVar2, kPropertyArr[4], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar2));
            }
            int i27 = f55131l;
            int i28 = i27 & 41;
            int i29 = i28 + ((i27 ^ 41) | i28);
            f55130k = i29 % 128;
            int i30 = i29 % 2;
        } else if (i15 != 3) {
            dc dcVar3 = (dc) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            int i31 = f55131l;
            int i32 = ((((i31 ^ 101) | (i31 & 101)) << 1) - (~(-(((~i31) & 101) | (i31 & (-102)))))) - 1;
            f55130k = i32 % 128;
            int i33 = i32 % 2;
            h hVar3 = dcVar3.f55133g;
            if (i33 != 0) {
                h.setOnFocusChangeListener(new Object[]{hVar3, dcVar3, kPropertyArr[1], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar3));
            } else {
                h.setOnFocusChangeListener(new Object[]{hVar3, dcVar3, kPropertyArr[1], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar3));
            }
            int i34 = f55130k;
            int i35 = (i34 & (-40)) | ((~i34) & 39);
            int i36 = -(-((i34 & 39) << 1));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            f55131l = i37 % 128;
            if (i37 % 2 == 0) {
                throw null;
            }
        } else {
            dc dcVar4 = (dc) objArr[0];
            int i38 = f55131l;
            int i39 = ((i38 | 77) << 1) - (i38 ^ 77);
            f55130k = i39 % 128;
            int i40 = i39 % 2;
            h hVar4 = dcVar4.f55134h;
            if (i40 != 0) {
                h.setOnFocusChangeListener(new Object[]{hVar4, dcVar4, kPropertyArr[2], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar4));
            } else {
                h.setOnFocusChangeListener(new Object[]{hVar4, dcVar4, kPropertyArr[2], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar4));
            }
        }
        return null;
    }

    public final void getNavBarTitleString() {
        setDividerPadding(new Object[]{this}, -1087540522, 1087540523, System.identityHashCode(this));
    }

    public final void setLayoutAnimation() {
        setDividerPadding(new Object[]{this}, 1266704093, -1266704091, System.identityHashCode(this));
    }

    public final void setNavigationOnClickListener() {
        setDividerPadding(new Object[]{this}, -1928700375, 1928700378, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 1763882755, -1763882755, System.identityHashCode(this));
    }
}
