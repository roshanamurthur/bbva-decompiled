package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class bw extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f54737g = {c.e(bw.class, "onlinePinSupported_B1b7", "getOnlinePinSupported_B1b7()Z", 0), c.e(bw.class, "signatureSupported_B1b6", "getSignatureSupported_B1b6()Z", 0), c.e(bw.class, "noCvmRequired_B1b4", "getNoCvmRequired_B1b4()Z", 0)};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f54738h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f54739i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f54740f;

    static {
        int i10 = f54738h;
        int i11 = i10 & 95;
        int i12 = (i10 | 95) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f54739i = i14 % 128;
        int i15 = i14 % 2;
    }

    public bw() {
        super(setAnimation.EuropeEndpoint().setDividerPadding());
        this.f54740f = new h(0, 6);
        new h(0, 5);
        new h(0, 3);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        bw bwVar = (bw) objArr[0];
        int i13 = f54738h;
        int i14 = (((i13 & (-2)) | ((~i13) & 1)) - (~((i13 & 1) << 1))) - 1;
        f54739i = i14 % 128;
        int i15 = i14 % 2;
        h hVar = bwVar.f54740f;
        boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, bwVar, f54737g[0]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue();
        int i16 = f54739i;
        int i17 = i16 & 53;
        int i18 = i17 + ((i16 ^ 53) | i17);
        f54738h = i18 % 128;
        int i19 = i18 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setY(new Object[]{this}, -1441108679, 1441108679, System.identityHashCode(this))).booleanValue();
    }
}
