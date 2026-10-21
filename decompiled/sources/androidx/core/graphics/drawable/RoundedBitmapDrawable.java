package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RoundedBitmapDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f19893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19894b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitmapShader f19897e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19899g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19904l;
    public int m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19895c = 119;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f19896d = new Paint(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f19898f = new Matrix();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f19900h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f19901i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19902j = true;

    public RoundedBitmapDrawable(Resources resources, Bitmap bitmap) {
        this.f19894b = 160;
        if (resources != null) {
            this.f19894b = resources.getDisplayMetrics().densityDpi;
        }
        this.f19893a = bitmap;
        if (bitmap == null) {
            this.m = -1;
            this.f19904l = -1;
            this.f19897e = null;
        } else {
            this.f19904l = bitmap.getScaledWidth(this.f19894b);
            this.m = bitmap.getScaledHeight(this.f19894b);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f19897e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public void a(int i10, int i11, int i12, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        if (this.f19902j) {
            boolean z10 = this.f19903k;
            Rect rect = this.f19900h;
            if (z10) {
                int iMin = Math.min(this.f19904l, this.m);
                a(this.f19895c, iMin, iMin, getBounds(), this.f19900h);
                int iMin2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - iMin2) / 2), Math.max(0, (rect.height() - iMin2) / 2));
                this.f19899g = iMin2 * 0.5f;
            } else {
                a(this.f19895c, this.f19904l, this.m, getBounds(), this.f19900h);
            }
            RectF rectF = this.f19901i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f19897e;
            if (bitmapShader != null) {
                Matrix matrix = this.f19898f;
                matrix.setTranslate(rectF.left, rectF.top);
                float fWidth = rectF.width();
                Bitmap bitmap = this.f19893a;
                matrix.preScale(fWidth / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f19896d.setShader(bitmapShader);
            }
            this.f19902j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f19893a;
        if (bitmap == null) {
            return;
        }
        b();
        Paint paint = this.f19896d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f19900h, paint);
            return;
        }
        RectF rectF = this.f19901i;
        float f6 = this.f19899g;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19896d.getAlpha();
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.f19893a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f19896d.getColorFilter();
    }

    public float getCornerRadius() {
        return this.f19899g;
    }

    public int getGravity() {
        return this.f19895c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f19904l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f19895c != 119 || this.f19903k || (bitmap = this.f19893a) == null || bitmap.hasAlpha() || this.f19896d.getAlpha() < 255 || this.f19899g > 0.05f) ? -3 : -1;
    }

    @NonNull
    public final Paint getPaint() {
        return this.f19896d;
    }

    public boolean hasAntiAlias() {
        return this.f19896d.isAntiAlias();
    }

    public boolean hasMipMap() {
        throw new UnsupportedOperationException();
    }

    public boolean isCircular() {
        return this.f19903k;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        if (this.f19903k) {
            this.f19899g = Math.min(this.m, this.f19904l) / 2;
        }
        this.f19902j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Paint paint = this.f19896d;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setAntiAlias(boolean z10) {
        this.f19896d.setAntiAlias(z10);
        invalidateSelf();
    }

    public void setCircular(boolean z10) {
        this.f19903k = z10;
        this.f19902j = true;
        if (!z10) {
            setCornerRadius(0.0f);
            return;
        }
        this.f19899g = Math.min(this.m, this.f19904l) / 2;
        this.f19896d.setShader(this.f19897e);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19896d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCornerRadius(float f6) {
        if (this.f19899g == f6) {
            return;
        }
        this.f19903k = false;
        boolean z10 = f6 > 0.05f;
        Paint paint = this.f19896d;
        if (z10) {
            paint.setShader(this.f19897e);
        } else {
            paint.setShader(null);
        }
        this.f19899g = f6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f19896d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f19896d.setFilterBitmap(z10);
        invalidateSelf();
    }

    public void setGravity(int i10) {
        if (this.f19895c != i10) {
            this.f19895c = i10;
            this.f19902j = true;
            invalidateSelf();
        }
    }

    public void setMipMap(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public void setTargetDensity(@NonNull Canvas canvas) {
        setTargetDensity(canvas.getDensity());
    }

    public void setTargetDensity(@NonNull DisplayMetrics displayMetrics) {
        setTargetDensity(displayMetrics.densityDpi);
    }

    public void setTargetDensity(int i10) {
        if (this.f19894b != i10) {
            if (i10 == 0) {
                i10 = 160;
            }
            this.f19894b = i10;
            Bitmap bitmap = this.f19893a;
            if (bitmap != null) {
                this.f19904l = bitmap.getScaledWidth(i10);
                this.m = bitmap.getScaledHeight(this.f19894b);
            }
            invalidateSelf();
        }
    }
}
