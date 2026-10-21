package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class fn extends ao {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55561u = {i.d(fn.class, "validAtTransitTerminals_B2b6", "getValidAtTransitTerminals_B2b6()Z", 0), i.d(fn.class, "validAtCAT3Terminals_B2b5", "getValidAtCAT3Terminals_B2b5()Z", 0), i.d(fn.class, "validForDomesticMoneyAdd_B2b4", "getValidForDomesticMoneyAdd_B2b4()Z", 0), i.d(fn.class, "validForDomesticVoidTransactions_B2b3", "getValidForDomesticVoidTransactions_B2b3()Z", 0)};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f55562v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f55563w = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final h f55564s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final h f55565t;

    static {
        int i10 = f55563w + 53;
        f55562v = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 34 / 0;
        }
    }

    public fn() {
        new h(1, 5);
        this.f55564s = new h(1, 4);
        this.f55565t = new h(1, 3);
        new h(1, 2);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13;
        KProperty<Object>[] kPropertyArr = f55561u;
        if (i16 != 1) {
            fn fnVar = (fn) objArr[0];
            int i17 = f55562v + 21;
            f55563w = i17 % 128;
            if (i17 % 2 == 0) {
                h hVar = fnVar.f55564s;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar, fnVar, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar));
            } else {
                h hVar2 = fnVar.f55564s;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar2, fnVar, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar2));
            }
            boolean zBooleanValue = ((Boolean) onFocusChangeListener).booleanValue();
            int i18 = f55562v;
            int i19 = (i18 & 125) + (i18 | 125);
            f55563w = i19 % 128;
            int i20 = i19 % 2;
            return Boolean.valueOf(zBooleanValue);
        }
        fn fnVar2 = (fn) objArr[0];
        int i21 = f55563w;
        int i22 = i21 ^ 37;
        int i23 = (i21 & 37) << 1;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        f55562v = i24 % 128;
        int i25 = i24 % 2;
        h hVar3 = fnVar2.f55565t;
        boolean zBooleanValue2 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar3, fnVar2, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar3))).booleanValue();
        int i26 = f55562v;
        int i27 = ((((i26 ^ 119) | (i26 & 119)) << 1) - (~(-(((~i26) & 119) | (i26 & (-120)))))) - 1;
        f55563w = i27 % 128;
        if (i27 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue2);
        }
        throw null;
    }

    public final boolean getAmountFieldTextColor() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -2122257697, 2122257697, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setTextScaleX() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 33335514, -33335513, System.identityHashCode(this))).booleanValue();
    }
}
