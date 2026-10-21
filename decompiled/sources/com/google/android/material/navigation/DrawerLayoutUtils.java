package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DrawerLayoutUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44964a = Color.alpha(-1728053248);

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DrawerLayout f44965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f44966b;

        public a(DrawerLayout drawerLayout, View view) {
            this.f44965a = drawerLayout;
            this.f44966b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f44966b;
            DrawerLayout drawerLayout = this.f44965a;
            drawerLayout.closeDrawer(view, false);
            drawerLayout.setScrimColor(-1728053248);
        }
    }

    @NonNull
    public static Animator.AnimatorListener getScrimCloseAnimatorListener(@NonNull DrawerLayout drawerLayout, @NonNull View view) {
        return new a(drawerLayout, view);
    }

    @NonNull
    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(@NonNull final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = DrawerLayoutUtils.f44964a;
                drawerLayout.setScrimColor(ColorUtils.setAlphaComponent(-1728053248, AnimationUtils.lerp(DrawerLayoutUtils.f44964a, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }
}
