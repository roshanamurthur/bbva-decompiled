package com.mypinpad.tsdk.isolation;

import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setProgressTintBlendMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setProgressBackgroundTintBlendMode f60382a;

    public setProgressTintBlendMode(@NotNull setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode) {
        Intrinsics.checkNotNullParameter(setprogressbackgroundtintblendmode, "");
        this.f60382a = setprogressbackgroundtintblendmode;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setProgressTintBlendMode setprogresstintblendmode = (setProgressTintBlendMode) objArr[0];
        setStateListAnimator setstatelistanimator = (setStateListAnimator) objArr[1];
        Intrinsics.checkNotNullParameter(setstatelistanimator, "");
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = (setCustomSelectionActionModeCallback) setstatelistanimator;
        setInterpolator setinterpolator = (setInterpolator) setCustomSelectionActionModeCallback.setX(new Object[]{setcustomselectionactionmodecallback}, -282972840, 282972840, System.identityHashCode(setcustomselectionactionmodecallback));
        try {
            setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = new setVerticalFadingEdgeEnabled(setprogresstintblendmode.f60382a.setOnFocusChangeListener(setinterpolator));
            CloseableKt.closeFinally(setinterpolator, null);
            return setverticalfadingedgeenabled;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(setinterpolator, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final Endpoint setX(@NotNull setStateListAnimator setstatelistanimator) {
        return (Endpoint) setDividerPadding(new Object[]{this, setstatelistanimator}, 1718379916, -1718379916, System.identityHashCode(this));
    }
}
