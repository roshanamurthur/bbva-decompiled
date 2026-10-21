package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {
    public Path E0;
    public ViewOutlineProvider F0;
    public RectF G0;
    public final Drawable[] H0;
    public LayerDrawable I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final c f19641s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f19642t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Drawable f19643u0;
    public Drawable v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f19644w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f19645x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f19646y0;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            int width = imageFilterView.getWidth();
            int height = imageFilterView.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterView.f19645x0) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), imageFilterView.f19646y0);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f19649a = new float[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ColorMatrix f19650b = new ColorMatrix();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ColorMatrix f19651c = new ColorMatrix();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f19652d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f19653e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f19654f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f19655g = 1.0f;

        public final void a(ImageView imageView) {
            boolean z10;
            float fLog;
            float fPow;
            float fLog2;
            ColorMatrix colorMatrix = this.f19650b;
            colorMatrix.reset();
            float f6 = this.f19653e;
            float f10 = 1.0f;
            float[] fArr = this.f19649a;
            if (f6 != 1.0f) {
                float f11 = 1.0f - f6;
                float f12 = 0.2999f * f11;
                float f13 = 0.587f * f11;
                float f14 = f11 * 0.114f;
                fArr[0] = f12 + f6;
                fArr[1] = f13;
                fArr[2] = f14;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f12;
                fArr[6] = f13 + f6;
                fArr[7] = f14;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f12;
                fArr[11] = f13;
                fArr[12] = f14 + f6;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix.set(fArr);
                z10 = true;
            } else {
                z10 = false;
            }
            float f15 = this.f19654f;
            ColorMatrix colorMatrix2 = this.f19651c;
            if (f15 != 1.0f) {
                colorMatrix2.setScale(f15, f15, f15, 1.0f);
                colorMatrix.postConcat(colorMatrix2);
                z10 = true;
            }
            float f16 = this.f19655g;
            if (f16 != 1.0f) {
                if (f16 <= 0.0f) {
                    f16 = 0.01f;
                }
                float f17 = (5000.0f / f16) / 100.0f;
                if (f17 > 66.0f) {
                    double d2 = f17 - 60.0f;
                    fPow = ((float) Math.pow(d2, -0.13320475816726685d)) * 329.69873f;
                    fLog = ((float) Math.pow(d2, 0.07551485300064087d)) * 288.12216f;
                } else {
                    fLog = (((float) Math.log(f17)) * 99.4708f) - 161.11957f;
                    fPow = 255.0f;
                }
                if (f17 < 66.0f) {
                    fLog2 = f17 > 19.0f ? (((float) Math.log(f17 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
                } else {
                    fLog2 = 255.0f;
                }
                float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
                float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
                float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
                float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
                float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
                float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
                float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
                float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
                fArr[0] = fMin / fMin4;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = fMin2 / fMin5;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[11] = 0.0f;
                fArr[12] = fMin6;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f10 = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
                z10 = true;
            }
            float f18 = this.f19652d;
            if (f18 != f10) {
                fArr[0] = f18;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[11] = 0.0f;
                fArr[12] = f18;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
            } else if (!z10) {
                imageView.clearColorFilter();
                return;
            }
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f19641s0 = new c();
        this.f19642t0 = true;
        this.f19643u0 = null;
        this.v0 = null;
        this.f19644w0 = 0.0f;
        this.f19645x0 = 0.0f;
        this.f19646y0 = Float.NaN;
        this.H0 = new Drawable[2];
        this.J0 = Float.NaN;
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
    }

    private void setOverlay(boolean z10) {
        this.f19642t0 = z10;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f19643u0 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.f19644w0 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_brightness) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f19642t0));
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
            this.v0 = drawable;
            Drawable drawable2 = this.f19643u0;
            Drawable[] drawableArr = this.H0;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.v0 = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.v0 = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.v0 = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.f19643u0.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.I0 = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f19644w0 * 255.0f));
            if (!this.f19642t0) {
                this.I0.getDrawable(0).setAlpha((int) ((1.0f - this.f19644w0) * 255.0f));
            }
            super.setImageDrawable(this.I0);
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

    public float getBrightness() {
        return this.f19641s0.f19652d;
    }

    public float getContrast() {
        return this.f19641s0.f19654f;
    }

    public float getCrossfade() {
        return this.f19644w0;
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
        return this.f19646y0;
    }

    public float getRoundPercent() {
        return this.f19645x0;
    }

    public float getSaturation() {
        return this.f19641s0.f19653e;
    }

    public float getWarmth() {
        return this.f19641s0.f19655g;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        b();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f19643u0 = drawableMutate;
        Drawable drawable2 = this.v0;
        Drawable[] drawableArr = this.H0;
        drawableArr[0] = drawable2;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.I0 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19644w0);
    }

    public void setAltImageResource(int i10) {
        Drawable drawable = AppCompatResources.getDrawable(getContext(), i10);
        this.f19643u0 = drawable;
        setAltImageDrawable(drawable);
    }

    public void setBrightness(float f6) {
        c cVar = this.f19641s0;
        cVar.f19652d = f6;
        cVar.a(this);
    }

    public void setContrast(float f6) {
        c cVar = this.f19641s0;
        cVar.f19654f = f6;
        cVar.a(this);
    }

    public void setCrossfade(float f6) {
        this.f19644w0 = f6;
        if (this.H0 != null) {
            if (!this.f19642t0) {
                this.I0.getDrawable(0).setAlpha((int) ((1.0f - this.f19644w0) * 255.0f));
            }
            this.I0.getDrawable(1).setAlpha((int) (this.f19644w0 * 255.0f));
            super.setImageDrawable(this.I0);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f19643u0 == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.v0 = drawableMutate;
        Drawable[] drawableArr = this.H0;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f19643u0;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.I0 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19644w0);
    }

    public void setImagePanX(float f6) {
        this.J0 = f6;
        c();
    }

    public void setImagePanY(float f6) {
        this.K0 = f6;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f19643u0 == null) {
            super.setImageResource(i10);
            return;
        }
        Drawable drawableMutate = AppCompatResources.getDrawable(getContext(), i10).mutate();
        this.v0 = drawableMutate;
        Drawable[] drawableArr = this.H0;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f19643u0;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.I0 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f19644w0);
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
            this.f19646y0 = f6;
            float f10 = this.f19645x0;
            this.f19645x0 = -1.0f;
            setRoundPercent(f10);
            return;
        }
        boolean z10 = this.f19646y0 != f6;
        this.f19646y0 = f6;
        if (f6 != 0.0f) {
            if (this.E0 == null) {
                this.E0 = new Path();
            }
            if (this.G0 == null) {
                this.G0 = new RectF();
            }
            if (this.F0 == null) {
                b bVar = new b();
                this.F0 = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.G0.set(0.0f, 0.0f, getWidth(), getHeight());
            this.E0.reset();
            Path path = this.E0;
            RectF rectF = this.G0;
            float f11 = this.f19646y0;
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
        boolean z10 = this.f19645x0 != f6;
        this.f19645x0 = f6;
        if (f6 != 0.0f) {
            if (this.E0 == null) {
                this.E0 = new Path();
            }
            if (this.G0 == null) {
                this.G0 = new RectF();
            }
            if (this.F0 == null) {
                a aVar = new a();
                this.F0 = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f19645x0) / 2.0f;
            this.G0.set(0.0f, 0.0f, width, height);
            this.E0.reset();
            this.E0.addRoundRect(this.G0, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f6) {
        c cVar = this.f19641s0;
        cVar.f19653e = f6;
        cVar.a(this);
    }

    public void setWarmth(float f6) {
        c cVar = this.f19641s0;
        cVar.f19655g = f6;
        cVar.a(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19641s0 = new c();
        this.f19642t0 = true;
        this.f19643u0 = null;
        this.v0 = null;
        this.f19644w0 = 0.0f;
        this.f19645x0 = 0.0f;
        this.f19646y0 = Float.NaN;
        this.H0 = new Drawable[2];
        this.J0 = Float.NaN;
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        a(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19641s0 = new c();
        this.f19642t0 = true;
        this.f19643u0 = null;
        this.v0 = null;
        this.f19644w0 = 0.0f;
        this.f19645x0 = 0.0f;
        this.f19646y0 = Float.NaN;
        this.H0 = new Drawable[2];
        this.J0 = Float.NaN;
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        a(context, attributeSet);
    }
}
