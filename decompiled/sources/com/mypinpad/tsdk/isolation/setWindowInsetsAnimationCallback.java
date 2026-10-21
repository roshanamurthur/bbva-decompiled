package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setWindowInsetsAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setTextSelectHandleLeft f60839a;

    public setWindowInsetsAnimationCallback(@NotNull setTextSelectHandleLeft settextselecthandleleft) {
        Intrinsics.checkNotNullParameter(settextselecthandleleft, "");
        this.f60839a = settextselecthandleleft;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setWindowInsetsAnimationCallback setwindowinsetsanimationcallback = (setWindowInsetsAnimationCallback) objArr[0];
        setStateListAnimator setstatelistanimator = (setStateListAnimator) objArr[1];
        Intrinsics.checkNotNullParameter(setstatelistanimator, "");
        TransactionCancelReason transactionCancelReason = (TransactionCancelReason) setstatelistanimator;
        return new setKeyboardNavigationCluster(setwindowinsetsanimationcallback.f60839a.setX(((Integer) TransactionCancelReason.setOnFocusChangeListener(new Object[]{transactionCancelReason}, -750079656, 750079656, System.identityHashCode(transactionCancelReason))).intValue()));
    }

    @NotNull
    public final Endpoint setOnFocusChangeListener(@NotNull setStateListAnimator setstatelistanimator) {
        return (Endpoint) setDividerPadding(new Object[]{this, setstatelistanimator}, -1337034765, 1337034765, System.identityHashCode(this));
    }
}
