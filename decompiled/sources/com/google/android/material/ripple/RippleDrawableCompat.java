package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RippleDrawableCompat extends Drawable implements Shapeable, TintAwareDrawable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public a f45108p0;

    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public MaterialShapeDrawable f45109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45110b;

        public a(@NonNull a aVar) {
            this.f45109a = (MaterialShapeDrawable) aVar.f45109a.getConstantState().newDrawable();
            this.f45110b = aVar.f45110b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new RippleDrawableCompat(new a(this));
        }
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        a aVar = new a();
        aVar.f45109a = materialShapeDrawable;
        aVar.f45110b = false;
        this(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        a aVar = this.f45108p0;
        if (aVar.f45110b) {
            aVar.f45109a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f45108p0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f45108p0.f45109a.getOpacity();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f45108p0.f45109a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f45108p0.f45109a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f45108p0.f45109a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zShouldDrawRippleCompat = RippleUtils.shouldDrawRippleCompat(iArr);
        a aVar = this.f45108p0;
        if (aVar.f45110b == zShouldDrawRippleCompat) {
            return zOnStateChange;
        }
        aVar.f45110b = zShouldDrawRippleCompat;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f45108p0.f45109a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f45108p0.f45109a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f45108p0.f45109a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i10) {
        this.f45108p0.f45109a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f45108p0.f45109a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f45108p0.f45109a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public RippleDrawableCompat mutate() {
        this.f45108p0 = new a(this.f45108p0);
        return this;
    }

    public RippleDrawableCompat(a aVar) {
        this.f45108p0 = aVar;
    }
}
