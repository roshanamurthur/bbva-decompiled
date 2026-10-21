package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import qe.p;
import qe.q;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Px
    public int f45987b = -1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i10) {
        this.f45986a = i10;
    }

    public static ObjectAnimator a(View view, float f6, float f10, float f11) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f6, f10));
        objectAnimatorOfPropertyValuesHolder.addListener(new p(f11, view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator b(View view, float f6, float f10, float f11) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f10));
        objectAnimatorOfPropertyValuesHolder.addListener(new q(f11, view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        int i10 = this.f45986a;
        Context context = view.getContext();
        int dimensionPixelSize = this.f45987b;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
        }
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (i10 == 3) {
            return a(view, dimensionPixelSize + translationX, translationX, translationX);
        }
        if (i10 == 5) {
            return a(view, translationX - dimensionPixelSize, translationX, translationX);
        }
        if (i10 == 48) {
            return b(view, translationY - dimensionPixelSize, translationY, translationY);
        }
        if (i10 == 80) {
            return b(view, dimensionPixelSize + translationY, translationY, translationY);
        }
        if (i10 == 8388611) {
            return a(view, ViewCompat.getLayoutDirection(viewGroup) == 1 ? dimensionPixelSize + translationX : translationX - dimensionPixelSize, translationX, translationX);
        }
        if (i10 == 8388613) {
            return a(view, ViewCompat.getLayoutDirection(viewGroup) == 1 ? translationX - dimensionPixelSize : dimensionPixelSize + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException(g0.c("Invalid slide direction: ", i10));
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        int i10 = this.f45986a;
        Context context = view.getContext();
        int dimensionPixelSize = this.f45987b;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
        }
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (i10 == 3) {
            return a(view, translationX, translationX - dimensionPixelSize, translationX);
        }
        if (i10 == 5) {
            return a(view, translationX, dimensionPixelSize + translationX, translationX);
        }
        if (i10 == 48) {
            return b(view, translationY, dimensionPixelSize + translationY, translationY);
        }
        if (i10 == 80) {
            return b(view, translationY, translationY - dimensionPixelSize, translationY);
        }
        if (i10 == 8388611) {
            return a(view, translationX, ViewCompat.getLayoutDirection(viewGroup) == 1 ? translationX - dimensionPixelSize : dimensionPixelSize + translationX, translationX);
        }
        if (i10 == 8388613) {
            return a(view, translationX, ViewCompat.getLayoutDirection(viewGroup) == 1 ? dimensionPixelSize + translationX : translationX - dimensionPixelSize, translationX);
        }
        throw new IllegalArgumentException(g0.c("Invalid slide direction: ", i10));
    }

    @Px
    public int getSlideDistance() {
        return this.f45987b;
    }

    public int getSlideEdge() {
        return this.f45986a;
    }

    public void setSlideDistance(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.f45987b = i10;
    }

    public void setSlideEdge(int i10) {
        this.f45986a = i10;
    }
}
