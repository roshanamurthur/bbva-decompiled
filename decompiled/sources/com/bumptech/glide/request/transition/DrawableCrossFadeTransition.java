package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class DrawableCrossFadeTransition implements Transition<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38873b;

    public DrawableCrossFadeTransition(int i10, boolean z10) {
        this.f38872a = i10;
        this.f38873b = z10;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(Drawable drawable, Transition.ViewAdapter viewAdapter) {
        Drawable currentDrawable = viewAdapter.getCurrentDrawable();
        if (currentDrawable == null) {
            currentDrawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f38873b);
        transitionDrawable.startTransition(this.f38872a);
        viewAdapter.setDrawable(transitionDrawable);
        return true;
    }
}
