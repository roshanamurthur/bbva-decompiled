package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setImageLevel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setDrawingCacheEnabled f59824a;

    public setImageLevel(@NotNull setDrawingCacheEnabled setdrawingcacheenabled) {
        Intrinsics.checkNotNullParameter(setdrawingcacheenabled, "");
        this.f59824a = setdrawingcacheenabled;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        setImageLevel setimagelevel = (setImageLevel) objArr[0];
        setStateListAnimator setstatelistanimator = (setStateListAnimator) objArr[1];
        Intrinsics.checkNotNullParameter(setstatelistanimator, "");
        getPinDigitTintColor getpindigittintcolor = (getPinDigitTintColor) setstatelistanimator;
        setRight setright = new setRight(setimagelevel.f59824a);
        byte[] bArr = (byte[]) getPinDigitTintColor.setY(new Object[]{getpindigittintcolor}, -294745519, 294745519, System.identityHashCode(getpindigittintcolor));
        setDrawingCacheEnabled setdrawingcacheenabled = setimagelevel.f59824a;
        setRight.setOnFocusChangeListener(setright, new setNextFocusUpId(bArr, setdrawingcacheenabled), new getAmountFieldTextSizeSp((byte[]) getPinDigitTintColor.setY(new Object[]{getpindigittintcolor}, 579785128, -579785127, System.identityHashCode(getpindigittintcolor)), setdrawingcacheenabled));
        return new getProgressBarColor(setRight.setY(setright, 48));
    }

    @NotNull
    public final Endpoint setOnFocusChangeListener(@NotNull setStateListAnimator setstatelistanimator) {
        return (Endpoint) setCompoundDrawableTintBlendMode(new Object[]{this, setstatelistanimator}, -890222760, 890222760, System.identityHashCode(this));
    }
}
