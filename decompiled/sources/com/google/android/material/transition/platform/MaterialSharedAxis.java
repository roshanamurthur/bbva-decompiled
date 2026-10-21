package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.core.view.GravityCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import qe.n;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class MaterialSharedAxis extends n<VisibilityAnimatorProvider> {
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @AttrRes
    public static final int f45977u0 = R.attr.motionDurationLong1;

    @AttrRes
    public static final int v0 = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f45978s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f45979t0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Axis {
    }

    public MaterialSharedAxis(int i10, boolean z10) {
        VisibilityAnimatorProvider slideDistanceProvider;
        if (i10 == 0) {
            slideDistanceProvider = new SlideDistanceProvider(z10 ? GravityCompat.END : GravityCompat.START);
        } else if (i10 == 1) {
            slideDistanceProvider = new SlideDistanceProvider(z10 ? 80 : 48);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(g0.c("Invalid axis: ", i10));
            }
            slideDistanceProvider = new ScaleProvider(z10);
        }
        super(slideDistanceProvider, new FadeThroughProvider());
        this.f45978s0 = i10;
        this.f45979t0 = z10;
    }

    @Override // qe.n
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // qe.n
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // qe.n
    @AttrRes
    public final int d(boolean z10) {
        return f45977u0;
    }

    @Override // qe.n
    @AttrRes
    public final int e(boolean z10) {
        return v0;
    }

    public int getAxis() {
        return this.f45978s0;
    }

    @Override // qe.n
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // qe.n
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.f45979t0;
    }

    @Override // qe.n, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // qe.n, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // qe.n
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // qe.n
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
