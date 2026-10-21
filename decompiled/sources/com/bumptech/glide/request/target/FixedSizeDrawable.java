package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public class FixedSizeDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f38832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f38833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f38834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f38835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f38836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38837f;

    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f38838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f38839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f38840c;

        public a(Drawable.ConstantState constantState, int i10, int i11) {
            this.f38838a = constantState;
            this.f38839b = i10;
            this.f38840c = i11;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new FixedSizeDrawable(this, this.f38838a.newDrawable());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new FixedSizeDrawable(this, this.f38838a.newDrawable(resources));
        }
    }

    public FixedSizeDrawable(Drawable drawable, int i10, int i11) {
        this(new a(drawable.getConstantState(), i10, i11), drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f38835d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        canvas.concat(this.f38832a);
        this.f38835d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(19)
    public int getAlpha() {
        return this.f38835d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f38835d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f38835d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f38836e;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f38835d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f38836e.f38840c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f38836e.f38839b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f38835d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f38835d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f38835d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f38835d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f38835d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f38837f && super.mutate() == this) {
            this.f38835d = this.f38835d.mutate();
            a aVar = this.f38836e;
            this.f38836e = new a(aVar.f38838a, aVar.f38839b, aVar.f38840c);
            this.f38837f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@NonNull Runnable runnable, long j10) {
        super.scheduleSelf(runnable, j10);
        this.f38835d.scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f38835d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        RectF rectF = this.f38834c;
        rectF.set(i10, i11, i12, i13);
        this.f38832a.setRectToRect(this.f38833b, rectF, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f38835d.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, @NonNull PorterDuff.Mode mode) {
        this.f38835d.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z10) {
        this.f38835d.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f38835d.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return this.f38835d.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@NonNull Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f38835d.unscheduleSelf(runnable);
    }

    public FixedSizeDrawable(a aVar, Drawable drawable) {
        this.f38836e = (a) Preconditions.checkNotNull(aVar);
        this.f38835d = (Drawable) Preconditions.checkNotNull(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f38832a = new Matrix();
        this.f38833b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f38834c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38835d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect) {
        super.setBounds(rect);
        RectF rectF = this.f38834c;
        rectF.set(rect);
        this.f38832a.setRectToRect(this.f38833b, rectF, Matrix.ScaleToFit.CENTER);
    }
}
