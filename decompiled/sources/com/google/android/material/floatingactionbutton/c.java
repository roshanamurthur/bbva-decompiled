package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ScatterMapKt;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

/* JADX INFO: compiled from: BorderDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class c extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Paint f44686b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Dimension
    public float f44692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ColorInt
    public int f44693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColorInt
    public int f44694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColorInt
    public int f44695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ColorInt
    public int f44696l;

    @ColorInt
    public int m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ShapeAppearanceModel f44698o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ColorStateList f44699p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapeAppearancePathProvider f44685a = ShapeAppearancePathProvider.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f44687c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f44688d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f44689e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f44690f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f44691g = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44697n = true;

    /* JADX INFO: compiled from: BorderDrawable.java */
    public class a extends Drawable.ConstantState {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return c.this;
        }
    }

    public c(ShapeAppearanceModel shapeAppearanceModel) {
        this.f44698o = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.f44686b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        boolean z10 = this.f44697n;
        Paint paint = this.f44686b;
        Rect rect = this.f44688d;
        if (z10) {
            copyBounds(rect);
            float fHeight = this.f44692h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{ColorUtils.compositeColors(this.f44693i, this.m), ColorUtils.compositeColors(this.f44694j, this.m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f44694j, 0), this.m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f44696l, 0), this.m), ColorUtils.compositeColors(this.f44696l, this.m), ColorUtils.compositeColors(this.f44695k, this.m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f44697n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f44689e;
        rectF.set(rect);
        CornerSize topLeftCornerSize = this.f44698o.getTopLeftCornerSize();
        RectF rectF2 = this.f44690f;
        rectF2.set(getBounds());
        float fMin = Math.min(topLeftCornerSize.getCornerSize(rectF2), rectF.width() / 2.0f);
        ShapeAppearanceModel shapeAppearanceModel = this.f44698o;
        rectF2.set(getBounds());
        if (shapeAppearanceModel.isRoundRect(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f44691g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f44692h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        ShapeAppearanceModel shapeAppearanceModel = this.f44698o;
        RectF rectF = this.f44690f;
        rectF.set(getBounds());
        if (shapeAppearanceModel.isRoundRect(rectF)) {
            CornerSize topLeftCornerSize = this.f44698o.getTopLeftCornerSize();
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), topLeftCornerSize.getCornerSize(rectF));
            return;
        }
        Rect rect = this.f44688d;
        copyBounds(rect);
        RectF rectF2 = this.f44689e;
        rectF2.set(rect);
        ShapeAppearanceModel shapeAppearanceModel2 = this.f44698o;
        Path path = this.f44687c;
        this.f44685a.calculatePath(shapeAppearanceModel2, 1.0f, rectF2, path);
        DrawableUtils.setOutlineToPath(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        ShapeAppearanceModel shapeAppearanceModel = this.f44698o;
        RectF rectF = this.f44690f;
        rectF.set(getBounds());
        if (!shapeAppearanceModel.isRoundRect(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f44692h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f44699p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f44697n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f44699p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.f44697n = true;
            this.m = colorForState;
        }
        if (this.f44697n) {
            invalidateSelf();
        }
        return this.f44697n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        this.f44686b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f44686b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
