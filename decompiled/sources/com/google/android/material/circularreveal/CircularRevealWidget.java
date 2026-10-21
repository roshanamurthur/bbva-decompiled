package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.math.MathUtils;

/* JADX INFO: loaded from: classes10.dex */
public interface CircularRevealWidget extends CircularRevealHelper.Delegate {

    public static class CircularRevealEvaluator implements TypeEvaluator<RevealInfo> {
        public static final TypeEvaluator<RevealInfo> CIRCULAR_REVEAL = new CircularRevealEvaluator();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevealInfo f44308a = new RevealInfo();

        @Override // android.animation.TypeEvaluator
        @NonNull
        public RevealInfo evaluate(float f6, @NonNull RevealInfo revealInfo, @NonNull RevealInfo revealInfo2) {
            float fLerp = MathUtils.lerp(revealInfo.centerX, revealInfo2.centerX, f6);
            float fLerp2 = MathUtils.lerp(revealInfo.centerY, revealInfo2.centerY, f6);
            float fLerp3 = MathUtils.lerp(revealInfo.radius, revealInfo2.radius, f6);
            RevealInfo revealInfo3 = this.f44308a;
            revealInfo3.set(fLerp, fLerp2, fLerp3);
            return revealInfo3;
        }
    }

    public static class CircularRevealProperty extends Property<CircularRevealWidget, RevealInfo> {
        public static final Property<CircularRevealWidget, RevealInfo> CIRCULAR_REVEAL = new CircularRevealProperty(RevealInfo.class, "circularReveal");

        @Override // android.util.Property
        @Nullable
        public RevealInfo get(@NonNull CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(@NonNull CircularRevealWidget circularRevealWidget, @Nullable RevealInfo revealInfo) {
            circularRevealWidget.setRevealInfo(revealInfo);
        }
    }

    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {
        public static final Property<CircularRevealWidget, Integer> CIRCULAR_REVEAL_SCRIM_COLOR = new CircularRevealScrimColorProperty(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        @NonNull
        public Integer get(@NonNull CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(@NonNull CircularRevealWidget circularRevealWidget, @NonNull Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    void draw(Canvas canvas);

    @Nullable
    Drawable getCircularRevealOverlayDrawable();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    RevealInfo getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i10);

    void setRevealInfo(@Nullable RevealInfo revealInfo);

    public static class RevealInfo {
        public static final float INVALID_RADIUS = Float.MAX_VALUE;
        public float centerX;
        public float centerY;
        public float radius;

        public RevealInfo() {
        }

        public RevealInfo(float f6, float f10, float f11) {
            this.centerX = f6;
            this.centerY = f10;
            this.radius = f11;
        }

        public boolean isInvalid() {
            return this.radius == Float.MAX_VALUE;
        }

        public void set(float f6, float f10, float f11) {
            this.centerX = f6;
            this.centerY = f10;
            this.radius = f11;
        }

        public void set(@NonNull RevealInfo revealInfo) {
            set(revealInfo.centerX, revealInfo.centerY, revealInfo.radius);
        }

        public RevealInfo(@NonNull RevealInfo revealInfo) {
            this(revealInfo.centerX, revealInfo.centerY, revealInfo.radius);
        }
    }
}
