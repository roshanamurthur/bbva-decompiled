package com.visa.internal;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class s1v3 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f68041a;

    public s1v3(Function0 function0) {
        this.f68041a = function0;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        Function0 function0 = this.f68041a;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
