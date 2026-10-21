package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getDynamicButtonTextColor extends setStateListAnimator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55820b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getAmountFieldBgColor f55821a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDynamicButtonTextColor(@NotNull getAmountFieldBgColor getamountfieldbgcolor) {
        super(null);
        Intrinsics.checkNotNullParameter(getamountfieldbgcolor, "");
        this.f55821a = getamountfieldbgcolor;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        getDynamicButtonTextColor getdynamicbuttontextcolor = (getDynamicButtonTextColor) objArr[0];
        int i13 = f55820b;
        int i14 = ((i13 ^ 43) | (i13 & 43)) << 1;
        int i15 = -(((~i13) & 43) | (i13 & (-44)));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        getAmountFieldBgColor getamountfieldbgcolor = getdynamicbuttontextcolor.f55821a;
        int i19 = i17 & 81;
        int i20 = ((i17 ^ 81) | i19) << 1;
        int i21 = -((i17 | 81) & (~i19));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        f55820b = i22 % 128;
        int i23 = i22 % 2;
        return getamountfieldbgcolor;
    }

    @NotNull
    public final getAmountFieldBgColor setCompoundDrawableTintBlendMode() {
        return (getAmountFieldBgColor) setX(new Object[]{this}, 1209620396, -1209620396, System.identityHashCode(this));
    }
}
