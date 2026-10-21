package com.visa.internal;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class bsv4 extends Animatable2Compat.AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f68029a;

    public bsv4(Function0 function0) {
        this.f68029a = function0;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        Function0 function0 = this.f68029a;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
