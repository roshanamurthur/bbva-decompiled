package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.camera.camera2.internal.compat.u;
import androidx.collection.ScatterMapKt;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {
    public static final Paint R0;
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    public final Region E0;
    public final Region F0;
    public ShapeAppearanceModel G0;
    public final Paint H0;
    public final Paint I0;
    public final ShadowRenderer J0;

    @NonNull
    public final a K0;
    public final ShapeAppearancePathProvider L0;

    @Nullable
    public PorterDuffColorFilter M0;

    @Nullable
    public PorterDuffColorFilter N0;
    public int O0;

    @NonNull
    public final RectF P0;
    public boolean Q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MaterialShapeDrawableState f45236p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ShapePath.d[] f45237q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ShapePath.d[] f45238r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BitSet f45239s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f45240t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Matrix f45241u0;
    public final Path v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Path f45242w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final RectF f45243x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final RectF f45244y0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    public class a implements ShapeAppearancePathProvider.PathListener {
        public a() {
        }

        @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
        public final void onCornerPathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i10) {
            MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
            materialShapeDrawable.f45239s0.set(i10, shapePath.f45309c);
            shapePath.a(shapePath.endShadowAngle);
            materialShapeDrawable.f45237q0[i10] = new b(new ArrayList(shapePath.f45308b), new Matrix(matrix));
        }

        @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
        public final void onEdgePathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i10) {
            MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
            materialShapeDrawable.f45239s0.set(i10 + 4, shapePath.f45309c);
            shapePath.a(shapePath.endShadowAngle);
            materialShapeDrawable.f45238r0[i10] = new b(new ArrayList(shapePath.f45308b), new Matrix(matrix));
        }
    }

    static {
        Paint paint = new Paint(1);
        R0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    public final void a(@NonNull RectF rectF, @NonNull Path path) {
        calculatePathForSize(rectF, path);
        if (this.f45236p0.f45253i != 1.0f) {
            Matrix matrix = this.f45241u0;
            matrix.reset();
            float f6 = this.f45236p0.f45253i;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.P0, true);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    @NonNull
    public final PorterDuffColorFilter b(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = compositeElevationOverlayIfNeeded(colorForState);
            }
            this.O0 = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10) {
            int color = paint.getColor();
            int iCompositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(color);
            this.O0 = iCompositeElevationOverlayIfNeeded;
            if (iCompositeElevationOverlayIfNeeded != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(iCompositeElevationOverlayIfNeeded, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final void c(@NonNull Canvas canvas) {
        if (this.f45239s0.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f45236p0.f45261r;
        Path path = this.v0;
        ShadowRenderer shadowRenderer = this.J0;
        if (i10 != 0) {
            canvas.drawPath(path, shadowRenderer.getShadowPaint());
        }
        for (int i11 = 0; i11 < 4; i11++) {
            ShapePath.d dVar = this.f45237q0[i11];
            int i12 = this.f45236p0.f45260q;
            Matrix matrix = ShapePath.d.f45327b;
            dVar.a(matrix, shadowRenderer, i12, canvas);
            this.f45238r0[i11].a(matrix, shadowRenderer, this.f45236p0.f45260q, canvas);
        }
        if (this.Q0) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(path, R0);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void calculatePathForSize(@NonNull RectF rectF, @NonNull Path path) {
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.L0;
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        shapeAppearancePathProvider.calculatePath(materialShapeDrawableState.f45245a, materialShapeDrawableState.f45254j, rectF, this.K0, path);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int compositeElevationOverlayIfNeeded(@ColorInt int i10) {
        float parentAbsoluteElevation = getParentAbsoluteElevation() + getZ();
        ElevationOverlayProvider elevationOverlayProvider = this.f45236p0.f45246b;
        return elevationOverlayProvider != null ? elevationOverlayProvider.compositeOverlayIfNeeded(i10, parentAbsoluteElevation) : i10;
    }

    public final void d(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull ShapeAppearanceModel shapeAppearanceModel, @NonNull RectF rectF) {
        if (!shapeAppearanceModel.isRoundRect(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float cornerSize = shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) * this.f45236p0.f45254j;
            canvas.drawRoundRect(rectF, cornerSize, cornerSize, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Paint paint = this.H0;
        paint.setColorFilter(this.M0);
        int alpha = paint.getAlpha();
        int i10 = this.f45236p0.f45256l;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.I0;
        paint2.setColorFilter(this.N0);
        paint2.setStrokeWidth(this.f45236p0.f45255k);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f45236p0.f45256l;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z10 = this.f45240t0;
        Path path = this.v0;
        if (z10) {
            ShapeAppearanceModel shapeAppearanceModelWithTransformedCornerSizes = getShapeAppearanceModel().withTransformedCornerSizes(new com.google.android.material.shape.a(-(e() ? paint2.getStrokeWidth() / 2.0f : 0.0f)));
            this.G0 = shapeAppearanceModelWithTransformedCornerSizes;
            float f6 = this.f45236p0.f45254j;
            RectF rectF = this.f45244y0;
            rectF.set(getBoundsAsRectF());
            float strokeWidth = e() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.L0.calculatePath(shapeAppearanceModelWithTransformedCornerSizes, f6, rectF, this.f45242w0);
            a(getBoundsAsRectF(), path);
            this.f45240t0 = false;
        }
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        int i12 = materialShapeDrawableState.f45259p;
        if (i12 != 1 && materialShapeDrawableState.f45260q > 0 && (i12 == 2 || requiresCompatShadow())) {
            canvas.save();
            canvas.translate(getShadowOffsetX(), getShadowOffsetY());
            if (this.Q0) {
                RectF rectF2 = this.P0;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(u.b(this.f45236p0.f45260q, 2, (int) rectF2.width(), iWidth), u.b(this.f45236p0.f45260q, 2, (int) rectF2.height(), iHeight), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f10 = (getBounds().left - this.f45236p0.f45260q) - iWidth;
                float f11 = (getBounds().top - this.f45236p0.f45260q) - iHeight;
                canvas2.translate(-f10, -f11);
                c(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                c(canvas);
                canvas.restore();
            }
        }
        MaterialShapeDrawableState materialShapeDrawableState2 = this.f45236p0;
        Paint.Style style = materialShapeDrawableState2.f45264u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, materialShapeDrawableState2.f45245a, getBoundsAsRectF());
        }
        if (e()) {
            drawStrokeShape(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        d(canvas, paint, path, this.f45236p0.f45245a, rectF);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void drawStrokeShape(@NonNull Canvas canvas) {
        Paint paint = this.I0;
        Path path = this.f45242w0;
        ShapeAppearanceModel shapeAppearanceModel = this.G0;
        RectF rectF = this.f45244y0;
        rectF.set(getBoundsAsRectF());
        float strokeWidth = e() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, shapeAppearanceModel, rectF);
    }

    public final boolean e() {
        Paint.Style style = this.f45236p0.f45264u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.I0.getStrokeWidth() > 0.0f;
    }

    public final boolean f(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f45236p0.f45247c == null || color2 == (colorForState2 = this.f45236p0.f45247c.getColorForState(iArr, (color2 = (paint2 = this.H0).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.f45236p0.f45248d == null || color == (colorForState = this.f45236p0.f45248d.getColorForState(iArr, (color = (paint = this.I0).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean g() {
        PorterDuffColorFilter porterDuffColorFilter = this.M0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.N0;
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        this.M0 = b(materialShapeDrawableState.f45250f, materialShapeDrawableState.f45251g, this.H0, true);
        MaterialShapeDrawableState materialShapeDrawableState2 = this.f45236p0;
        this.N0 = b(materialShapeDrawableState2.f45249e, materialShapeDrawableState2.f45251g, this.I0, false);
        MaterialShapeDrawableState materialShapeDrawableState3 = this.f45236p0;
        if (materialShapeDrawableState3.f45263t) {
            this.J0.setShadowColor(materialShapeDrawableState3.f45250f.getColorForState(getState(), 0));
        }
        return (ObjectsCompat.equals(porterDuffColorFilter, this.M0) && ObjectsCompat.equals(porterDuffColorFilter2, this.N0)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f45236p0.f45256l;
    }

    public float getBottomLeftCornerResolvedSize() {
        return this.f45236p0.f45245a.getBottomLeftCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getBottomRightCornerResolvedSize() {
        return this.f45236p0.f45245a.getBottomRightCornerSize().getCornerSize(getBoundsAsRectF());
    }

    @NonNull
    public RectF getBoundsAsRectF() {
        RectF rectF = this.f45243x0;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f45236p0;
    }

    public float getElevation() {
        return this.f45236p0.f45257n;
    }

    @Nullable
    public ColorStateList getFillColor() {
        return this.f45236p0.f45247c;
    }

    public float getInterpolation() {
        return this.f45236p0.f45254j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f45236p0.f45259p == 2) {
            return;
        }
        if (isRoundRect()) {
            outline.setRoundRect(getBounds(), getTopLeftCornerResolvedSize() * this.f45236p0.f45254j);
        } else {
            RectF boundsAsRectF = getBoundsAsRectF();
            Path path = this.v0;
            a(boundsAsRectF, path);
            DrawableUtils.setOutlineToPath(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f45236p0.f45252h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.f45236p0.f45264u;
    }

    public float getParentAbsoluteElevation() {
        return this.f45236p0.m;
    }

    @Deprecated
    public void getPathForSize(int i10, int i11, @NonNull Path path) {
        calculatePathForSize(new RectF(0.0f, 0.0f, i10, i11), path);
    }

    @ColorInt
    public int getResolvedTintColor() {
        return this.O0;
    }

    public float getScale() {
        return this.f45236p0.f45253i;
    }

    public int getShadowCompatRotation() {
        return this.f45236p0.f45262s;
    }

    public int getShadowCompatibilityMode() {
        return this.f45236p0.f45259p;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        return (int) (Math.sin(Math.toRadians(materialShapeDrawableState.f45262s)) * ((double) materialShapeDrawableState.f45261r));
    }

    public int getShadowOffsetY() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        return (int) (Math.cos(Math.toRadians(materialShapeDrawableState.f45262s)) * ((double) materialShapeDrawableState.f45261r));
    }

    public int getShadowRadius() {
        return this.f45236p0.f45260q;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getShadowVerticalOffset() {
        return this.f45236p0.f45261r;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f45236p0.f45245a;
    }

    @Nullable
    @Deprecated
    public ShapePathModel getShapedViewModel() {
        ShapeAppearanceModel shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof ShapePathModel) {
            return (ShapePathModel) shapeAppearanceModel;
        }
        return null;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f45236p0.f45248d;
    }

    @Nullable
    public ColorStateList getStrokeTintList() {
        return this.f45236p0.f45249e;
    }

    public float getStrokeWidth() {
        return this.f45236p0.f45255k;
    }

    @Nullable
    public ColorStateList getTintList() {
        return this.f45236p0.f45250f;
    }

    public float getTopLeftCornerResolvedSize() {
        return this.f45236p0.f45245a.getTopLeftCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getTopRightCornerResolvedSize() {
        return this.f45236p0.f45245a.getTopRightCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getTranslationZ() {
        return this.f45236p0.f45258o;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.E0;
        region.set(bounds);
        RectF boundsAsRectF = getBoundsAsRectF();
        Path path = this.v0;
        a(boundsAsRectF, path);
        Region region2 = this.F0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public float getZ() {
        return getTranslationZ() + getElevation();
    }

    public final void h() {
        float z10 = getZ();
        this.f45236p0.f45260q = (int) Math.ceil(0.75f * z10);
        this.f45236p0.f45261r = (int) Math.ceil(z10 * 0.25f);
        g();
        super.invalidateSelf();
    }

    public void initializeElevationOverlay(Context context) {
        this.f45236p0.f45246b = new ElevationOverlayProvider(context);
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f45240t0 = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        ElevationOverlayProvider elevationOverlayProvider = this.f45236p0.f45246b;
        return elevationOverlayProvider != null && elevationOverlayProvider.isThemeElevationOverlayEnabled();
    }

    public boolean isElevationOverlayInitialized() {
        return this.f45236p0.f45246b != null;
    }

    public boolean isPointInTransparentRegion(int i10, int i11) {
        return getTransparentRegion().contains(i10, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect() {
        return this.f45236p0.f45245a.isRoundRect(getBoundsAsRectF());
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i10 = this.f45236p0.f45259p;
        return i10 == 0 || i10 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f45236p0.f45250f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f45236p0.f45249e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f45236p0.f45248d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f45236p0.f45247c) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f45236p0 = new MaterialShapeDrawableState(this.f45236p0);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f45240t0 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        boolean z10 = f(iArr) || g();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public boolean requiresCompatShadow() {
        return (isRoundRect() || this.v0.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45256l != i10) {
            materialShapeDrawableState.f45256l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f45236p0.getClass();
        super.invalidateSelf();
    }

    public void setCornerSize(float f6) {
        setShapeAppearanceModel(this.f45236p0.f45245a.withCornerSize(f6));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEdgeIntersectionCheckEnable(boolean z10) {
        this.L0.f45305l = z10;
    }

    public void setElevation(float f6) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45257n != f6) {
            materialShapeDrawableState.f45257n = f6;
            h();
        }
    }

    public void setFillColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45247c != colorStateList) {
            materialShapeDrawableState.f45247c = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f6) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45254j != f6) {
            materialShapeDrawableState.f45254j = f6;
            this.f45240t0 = true;
            invalidateSelf();
        }
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45252h == null) {
            materialShapeDrawableState.f45252h = new Rect();
        }
        this.f45236p0.f45252h.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.f45236p0.f45264u = style;
        super.invalidateSelf();
    }

    public void setParentAbsoluteElevation(float f6) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.m != f6) {
            materialShapeDrawableState.m = f6;
            h();
        }
    }

    public void setScale(float f6) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45253i != f6) {
            materialShapeDrawableState.f45253i = f6;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowBitmapDrawingEnable(boolean z10) {
        this.Q0 = z10;
    }

    public void setShadowColor(int i10) {
        this.J0.setShadowColor(i10);
        this.f45236p0.f45263t = false;
        super.invalidateSelf();
    }

    public void setShadowCompatRotation(int i10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45262s != i10) {
            materialShapeDrawableState.f45262s = i10;
            super.invalidateSelf();
        }
    }

    public void setShadowCompatibilityMode(int i10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45259p != i10) {
            materialShapeDrawableState.f45259p = i10;
            super.invalidateSelf();
        }
    }

    @Deprecated
    public void setShadowElevation(int i10) {
        setElevation(i10);
    }

    @Deprecated
    public void setShadowEnabled(boolean z10) {
        setShadowCompatibilityMode(!z10 ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i10) {
        this.f45236p0.f45260q = i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowVerticalOffset(int i10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45261r != i10) {
            materialShapeDrawableState.f45261r = i10;
            super.invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f45236p0.f45245a = shapeAppearanceModel;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(@NonNull ShapePathModel shapePathModel) {
        setShapeAppearanceModel(shapePathModel);
    }

    public void setStroke(float f6, @ColorInt int i10) {
        setStrokeWidth(f6);
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45248d != colorStateList) {
            materialShapeDrawableState.f45248d = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.f45236p0.f45249e = colorStateList;
        g();
        super.invalidateSelf();
    }

    public void setStrokeWidth(float f6) {
        this.f45236p0.f45255k = f6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f45236p0.f45250f = colorStateList;
        g();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45251g != mode) {
            materialShapeDrawableState.f45251g = mode;
            g();
            super.invalidateSelf();
        }
    }

    public void setTranslationZ(float f6) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45258o != f6) {
            materialShapeDrawableState.f45258o = f6;
            h();
        }
    }

    public void setUseTintColorForShadow(boolean z10) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f45236p0;
        if (materialShapeDrawableState.f45263t != z10) {
            materialShapeDrawableState.f45263t = z10;
            invalidateSelf();
        }
    }

    public void setZ(float f6) {
        setTranslationZ(f6 - getElevation());
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        this(ShapeAppearanceModel.builder(context, attributeSet, i10, i11).build());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f6) {
        return createWithElevationOverlay(context, f6, null);
    }

    public void setCornerSize(@NonNull CornerSize cornerSize) {
        setShapeAppearanceModel(this.f45236p0.f45245a.withCornerSize(cornerSize));
    }

    @Deprecated
    public MaterialShapeDrawable(@NonNull ShapePathModel shapePathModel) {
        this((ShapeAppearanceModel) shapePathModel);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f6, @Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(MaterialColors.getColor(context, R.attr.colorSurface, "MaterialShapeDrawable"));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setElevation(f6);
        return materialShapeDrawable;
    }

    public void setStroke(float f6, @Nullable ColorStateList colorStateList) {
        setStrokeWidth(f6);
        setStrokeColor(colorStateList);
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel, null));
    }

    public void setStrokeTint(@ColorInt int i10) {
        setStrokeTint(ColorStateList.valueOf(i10));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MaterialShapeDrawable(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.f45237q0 = new ShapePath.d[4];
        this.f45238r0 = new ShapePath.d[4];
        this.f45239s0 = new BitSet(8);
        this.f45241u0 = new Matrix();
        this.v0 = new Path();
        this.f45242w0 = new Path();
        this.f45243x0 = new RectF();
        this.f45244y0 = new RectF();
        this.E0 = new Region();
        this.F0 = new Region();
        Paint paint = new Paint(1);
        this.H0 = paint;
        Paint paint2 = new Paint(1);
        this.I0 = paint2;
        this.J0 = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.getInstance();
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.L0 = shapeAppearancePathProvider;
        this.P0 = new RectF();
        this.Q0 = true;
        this.f45236p0 = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        g();
        f(getState());
        this.K0 = new a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class MaterialShapeDrawableState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public ShapeAppearanceModel f45245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public ElevationOverlayProvider f45246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ColorStateList f45247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ColorStateList f45248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ColorStateList f45249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public ColorStateList f45250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public PorterDuff.Mode f45251g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public Rect f45252h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f45253i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f45254j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f45255k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f45256l;
        public float m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f45257n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f45258o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f45259p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f45260q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f45261r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f45262s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f45263t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Paint.Style f45264u;

        public MaterialShapeDrawableState(@NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable ElevationOverlayProvider elevationOverlayProvider) {
            this.f45247c = null;
            this.f45248d = null;
            this.f45249e = null;
            this.f45250f = null;
            this.f45251g = PorterDuff.Mode.SRC_IN;
            this.f45252h = null;
            this.f45253i = 1.0f;
            this.f45254j = 1.0f;
            this.f45256l = 255;
            this.m = 0.0f;
            this.f45257n = 0.0f;
            this.f45258o = 0.0f;
            this.f45259p = 0;
            this.f45260q = 0;
            this.f45261r = 0;
            this.f45262s = 0;
            this.f45263t = false;
            this.f45264u = Paint.Style.FILL_AND_STROKE;
            this.f45245a = shapeAppearanceModel;
            this.f45246b = elevationOverlayProvider;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f45240t0 = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
            this.f45247c = null;
            this.f45248d = null;
            this.f45249e = null;
            this.f45250f = null;
            this.f45251g = PorterDuff.Mode.SRC_IN;
            this.f45252h = null;
            this.f45253i = 1.0f;
            this.f45254j = 1.0f;
            this.f45256l = 255;
            this.m = 0.0f;
            this.f45257n = 0.0f;
            this.f45258o = 0.0f;
            this.f45259p = 0;
            this.f45260q = 0;
            this.f45261r = 0;
            this.f45262s = 0;
            this.f45263t = false;
            this.f45264u = Paint.Style.FILL_AND_STROKE;
            this.f45245a = materialShapeDrawableState.f45245a;
            this.f45246b = materialShapeDrawableState.f45246b;
            this.f45255k = materialShapeDrawableState.f45255k;
            this.f45247c = materialShapeDrawableState.f45247c;
            this.f45248d = materialShapeDrawableState.f45248d;
            this.f45251g = materialShapeDrawableState.f45251g;
            this.f45250f = materialShapeDrawableState.f45250f;
            this.f45256l = materialShapeDrawableState.f45256l;
            this.f45253i = materialShapeDrawableState.f45253i;
            this.f45261r = materialShapeDrawableState.f45261r;
            this.f45259p = materialShapeDrawableState.f45259p;
            this.f45263t = materialShapeDrawableState.f45263t;
            this.f45254j = materialShapeDrawableState.f45254j;
            this.m = materialShapeDrawableState.m;
            this.f45257n = materialShapeDrawableState.f45257n;
            this.f45258o = materialShapeDrawableState.f45258o;
            this.f45260q = materialShapeDrawableState.f45260q;
            this.f45262s = materialShapeDrawableState.f45262s;
            this.f45249e = materialShapeDrawableState.f45249e;
            this.f45264u = materialShapeDrawableState.f45264u;
            if (materialShapeDrawableState.f45252h != null) {
                this.f45252h = new Rect(materialShapeDrawableState.f45252h);
            }
        }
    }
}
