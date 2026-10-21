package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: MotionStrategy.java */
/* JADX INFO: loaded from: classes10.dex */
public interface o {
    void a();

    boolean b();

    void c();

    @AnimatorRes
    int d();

    AnimatorSet e();

    void f(@Nullable ExtendedFloatingActionButton.OnChangedCallback onChangedCallback);

    void onAnimationEnd();

    void onAnimationStart(Animator animator);
}
