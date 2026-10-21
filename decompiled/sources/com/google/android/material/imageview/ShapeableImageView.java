package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes10.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {
    public static final int P0 = R.style.Widget_MaterialComponents_ShapeableImageView;

    @Nullable
    public MaterialShapeDrawable E0;
    public ShapeAppearanceModel F0;

    @Dimension
    public float G0;
    public final Path H0;

    @Dimension
    public int I0;

    @Dimension
    public int J0;

    @Dimension
    public int K0;

    @Dimension
    public int L0;

    @Dimension
    public int M0;

    @Dimension
    public int N0;
    public boolean O0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ShapeAppearancePathProvider f44760s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final RectF f44761t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final RectF f44762u0;
    public final Paint v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Paint f44763w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Path f44764x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public ColorStateList f44765y0;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f44766a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.F0 == null) {
                return;
            }
            if (shapeableImageView.E0 == null) {
                shapeableImageView.E0 = new MaterialShapeDrawable(shapeableImageView.F0);
            }
            RectF rectF = shapeableImageView.f44761t0;
            Rect rect = this.f44766a;
            rectF.round(rect);
            shapeableImageView.E0.setBounds(rect);
            shapeableImageView.E0.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public final boolean a() {
        return getLayoutDirection() == 1;
    }

    public final void b(int i10, int i11) {
        RectF rectF = this.f44761t0;
        rectF.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        ShapeAppearanceModel shapeAppearanceModel = this.F0;
        Path path = this.f44764x0;
        this.f44760s0.calculatePath(shapeAppearanceModel, 1.0f, rectF, path);
        Path path2 = this.H0;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f44762u0;
        rectF2.set(0.0f, 0.0f, i10, i11);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.L0;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i10 = this.N0;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return a() ? this.I0 : this.K0;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (this.M0 != Integer.MIN_VALUE || this.N0 != Integer.MIN_VALUE) {
            if (a() && (i11 = this.N0) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!a() && (i10 = this.M0) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.I0;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (this.M0 != Integer.MIN_VALUE || this.N0 != Integer.MIN_VALUE) {
            if (a() && (i11 = this.M0) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!a() && (i10 = this.N0) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.K0;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i10 = this.M0;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return a() ? this.K0 : this.I0;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.J0;
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.F0;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f44765y0;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.G0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.H0, this.f44763w0);
        if (this.f44765y0 == null) {
            return;
        }
        Paint paint = this.v0;
        paint.setStrokeWidth(this.G0);
        int colorForState = this.f44765y0.getColorForState(getDrawableState(), this.f44765y0.getDefaultColor());
        if (this.G0 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f44764x0, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.O0 && isLayoutDirectionResolved()) {
            this.O0 = true;
            if (!isPaddingRelative() && this.M0 == Integer.MIN_VALUE && this.N0 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b(i10, i11);
    }

    public void setContentPadding(@Dimension int i10, @Dimension int i11, @Dimension int i12, @Dimension int i13) {
        this.M0 = Integer.MIN_VALUE;
        this.N0 = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.I0) + i10, (super.getPaddingTop() - this.J0) + i11, (super.getPaddingRight() - this.K0) + i12, (super.getPaddingBottom() - this.L0) + i13);
        this.I0 = i10;
        this.J0 = i11;
        this.K0 = i12;
        this.L0 = i13;
    }

    @RequiresApi(17)
    public void setContentPaddingRelative(@Dimension int i10, @Dimension int i11, @Dimension int i12, @Dimension int i13) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i10, (super.getPaddingTop() - this.J0) + i11, (super.getPaddingEnd() - getContentPaddingEnd()) + i12, (super.getPaddingBottom() - this.L0) + i13);
        this.I0 = a() ? i12 : i10;
        this.J0 = i11;
        if (!a()) {
            i10 = i12;
        }
        this.K0 = i10;
        this.L0 = i13;
    }

    @Override // android.view.View
    public void setPadding(@Dimension int i10, @Dimension int i11, @Dimension int i12, @Dimension int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public void setPaddingRelative(@Dimension int i10, @Dimension int i11, @Dimension int i12, @Dimension int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.F0 = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.E0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        b(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f44765y0 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i10) {
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setStrokeWidth(@Dimension float f6) {
        if (this.G0 != f6) {
            this.G0 = f6;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = P0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f44760s0 = ShapeAppearancePathProvider.getInstance();
        this.f44764x0 = new Path();
        this.O0 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f44763w0 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f44761t0 = new RectF();
        this.f44762u0 = new RectF();
        this.H0 = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.ShapeableImageView, i10, i11);
        setLayerType(2, null);
        this.f44765y0 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.ShapeableImageView_strokeColor);
        this.G0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPadding, 0);
        this.I0 = dimensionPixelSize;
        this.J0 = dimensionPixelSize;
        this.K0 = dimensionPixelSize;
        this.L0 = dimensionPixelSize;
        this.I0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.J0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.K0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.L0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.M0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.N0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.v0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.F0 = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build();
        setOutlineProvider(new a());
    }
}
