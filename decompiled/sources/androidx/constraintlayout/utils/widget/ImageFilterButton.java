package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public final Drawable[] E0;
    public LayerDrawable F0;
    public boolean G0;
    public Drawable H0;
    public Drawable I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ImageFilterView.c f19633s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f19634t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f19635u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Path f19636w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ViewOutlineProvider f19637x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public RectF f19638y0;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            int width = imageFilterButton.getWidth();
            int height = imageFilterButton.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterButton.f19635u0) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.v0);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f19633s0 = new ImageFilterView.c();
        this.f19634t0 = 0.0f;
        this.f19635u0 = 0.0f;
        this.v0 = Float.NaN;
        this.E0 = new Drawable[2];
        this.G0 = true;
        this.H0 = null;
        this.I0 = null;
        this.J0 = Float.NaN;
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        a(context, null);
    }

    private void setOverlay(boolean z10) {
        this.G0 = z10;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.H0 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.f19634t0 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.G0));
                } else if (index == R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.J0));
                } else if (index == R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.K0));
                } else if (index == R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.M0));
                } else if (index == R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.L0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.I0 = drawable;
            Drawable drawable2 = this.H0;
            Drawable[] drawableArr = this.E0;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.I0 = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.I0 = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.I0 = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.H0.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.F0 = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f19634t0 * 255.0f));
            if (!this.G0) {
                this.F0.getDrawable(0).setAlpha((int) ((1.0f - this.f19634t0) * 255.0f));
            }
            super.setImageDrawable(this.F0);
        }
    }

    public final void b() {
        if (Float.isNaN(this.J0) && Float.isNaN(this.K0) && Float.isNaN(this.L0) && Float.isNaN(this.M0)) {
            return;
        }
        float f6 = Float.isNaN(this.J0) ? 0.0f : this.J0;
        float f10 = Float.isNaN(this.K0) ? 0.0f : this.K0;
        float f11 = Float.isNaN(this.L0) ? 1.0f : this.L0;
        float f12 = Float.isNaN(this.M0) ? 0.0f : this.M0;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f13 = f11 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f13, f13);
        float f14 = intrinsicWidth * f13;
        float f15 = f13 * intrinsicHeight;
        matrix.postTranslate(((((width - f14) * f6) + width) - f14) * 0.5f, ((((height - f15) * f10) + height) - f15) * 0.5f);
        matrix.postRotate(f12, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void c() {
        if (Float.isNaN(this.J0) && Float.isNaN(this.K0) && Float.isNaN(this.L0) && Float.isNaN(this.M0)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            b();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f19633s0.f19654f;
    }

    public float getCrossfade() {
        return this.f19634t0;
    }

    public float getImagePanX() {
        return this.J0;
    }

    public float getImagePanY() {
        return this.K0;
    }

    public float getImageRotate() {
        return this.M0;
    }

    public float getImageZoom() {
        return this.L0;
    }

    public float getRound() {
        return this.v0;
    }

    public float getRoundPercent() {
        return this.f19635u0;
    }

    public float getSaturation() {
        return this.f19633s0.f19653e;
    }

    public float getWarmth() {
        return this.f19633s0.f19655g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        b();
    }

    public void setAltImageResource(int i10) {
        Drawable drawableMutate = AppCompatResources.getDrawable(getContext(), i10).mutate();
        this.H0 = drawableMutate;
        Drawable drawable = this.I0;
        Drawable[] drawableArr = this.E0;
        drawableArr[0] = drawable;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.F0 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19634t0);
    }

    public void setBrightness(float f6) {
        ImageFilterView.c cVar = this.f19633s0;
        cVar.f19652d = f6;
        cVar.a(this);
    }

    public void setContrast(float f6) {
        ImageFilterView.c cVar = this.f19633s0;
        cVar.f19654f = f6;
        cVar.a(this);
    }

    public void setCrossfade(float f6) {
        this.f19634t0 = f6;
        if (this.E0 != null) {
            if (!this.G0) {
                this.F0.getDrawable(0).setAlpha((int) ((1.0f - this.f19634t0) * 255.0f));
            }
            this.F0.getDrawable(1).setAlpha((int) (this.f19634t0 * 255.0f));
            super.setImageDrawable(this.F0);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.H0 == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.I0 = drawableMutate;
        Drawable[] drawableArr = this.E0;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.H0;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.F0 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19634t0);
    }

    public void setImagePanX(float f6) {
        this.J0 = f6;
        c();
    }

    public void setImagePanY(float f6) {
        this.K0 = f6;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.H0 == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable drawableMutate = AppCompatResources.getDrawable(getContext(), i10).mutate();
        this.I0 = drawableMutate;
        Drawable[] drawableArr = this.E0;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.H0;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.F0 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19634t0);
    }

    public void setImageRotate(float f6) {
        this.M0 = f6;
        c();
    }

    public void setImageZoom(float f6) {
        this.L0 = f6;
        c();
    }

    @RequiresApi(21)
    public void setRound(float f6) {
        if (Float.isNaN(f6)) {
            this.v0 = f6;
            float f10 = this.f19635u0;
            this.f19635u0 = -1.0f;
            setRoundPercent(f10);
            return;
        }
        boolean z10 = this.v0 != f6;
        this.v0 = f6;
        if (f6 != 0.0f) {
            if (this.f19636w0 == null) {
                this.f19636w0 = new Path();
            }
            if (this.f19638y0 == null) {
                this.f19638y0 = new RectF();
            }
            if (this.f19637x0 == null) {
                b bVar = new b();
                this.f19637x0 = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f19638y0.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f19636w0.reset();
            Path path = this.f19636w0;
            RectF rectF = this.f19638y0;
            float f11 = this.v0;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f6) {
        boolean z10 = this.f19635u0 != f6;
        this.f19635u0 = f6;
        if (f6 != 0.0f) {
            if (this.f19636w0 == null) {
                this.f19636w0 = new Path();
            }
            if (this.f19638y0 == null) {
                this.f19638y0 = new RectF();
            }
            if (this.f19637x0 == null) {
                a aVar = new a();
                this.f19637x0 = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f19635u0) / 2.0f;
            this.f19638y0.set(0.0f, 0.0f, width, height);
            this.f19636w0.reset();
            this.f19636w0.addRoundRect(this.f19638y0, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f6) {
        ImageFilterView.c cVar = this.f19633s0;
        cVar.f19653e = f6;
        cVar.a(this);
    }

    public void setWarmth(float f6) {
        ImageFilterView.c cVar = this.f19633s0;
        cVar.f19655g = f6;
        cVar.a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19633s0 = new ImageFilterView.c();
        this.f19634t0 = 0.0f;
        this.f19635u0 = 0.0f;
        this.v0 = Float.NaN;
        this.E0 = new Drawable[2];
        this.G0 = true;
        this.H0 = null;
        this.I0 = null;
        this.J0 = Float.NaN;
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        a(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19633s0 = new ImageFilterView.c();
        this.f19634t0 = 0.0f;
        this.f19635u0 = 0.0f;
        this.v0 = Float.NaN;
        this.E0 = new Drawable[2];
        this.G0 = true;
        this.H0 = null;
        this.I0 = null;
        this.J0 = Float.NaN;
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        a(context, attributeSet);
    }
}
