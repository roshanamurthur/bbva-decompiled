package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.datastore.preferences.protobuf.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    public static final float m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f800l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.f789a = paint;
        this.f795g = new Path();
        this.f797i = false;
        this.f800l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f796h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.f791c = Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.f790b = Math.round(typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f792d = typedArrayObtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f6, float f10, float f11) {
        return e.a(f10, f6, f11, f6);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f800l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? DrawableCompat.getLayoutDirection(this) == 0 : DrawableCompat.getLayoutDirection(this) == 1))) {
            z10 = true;
        }
        float f6 = this.f790b;
        float fA = a(this.f791c, (float) Math.sqrt(f6 * f6 * 2.0f), this.f798j);
        float fA2 = a(this.f791c, this.f792d, this.f798j);
        float fRound = Math.round(a(0.0f, this.f799k, this.f798j));
        float fA3 = a(0.0f, m, this.f798j);
        float fA4 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f798j);
        double d2 = fA;
        double d3 = fA3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d3) * d2);
        float fRound3 = Math.round(Math.sin(d3) * d2);
        Path path = this.f795g;
        path.rewind();
        float f10 = this.f793e;
        Paint paint = this.f789a;
        float fA5 = a(paint.getStrokeWidth() + f10, -this.f799k, this.f798j);
        float f11 = (-fA2) / 2.0f;
        path.moveTo(f11 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f11, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f11, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f12 = this.f793e;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f12 + ((((int) (fHeight - (2.0f * f12))) / 4) * 2));
        if (this.f794f) {
            canvas.rotate(fA4 * (this.f797i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public float getArrowHeadLength() {
        return this.f790b;
    }

    public float getArrowShaftLength() {
        return this.f792d;
    }

    public float getBarLength() {
        return this.f791c;
    }

    public float getBarThickness() {
        return this.f789a.getStrokeWidth();
    }

    @ColorInt
    public int getColor() {
        return this.f789a.getColor();
    }

    public int getDirection() {
        return this.f800l;
    }

    public float getGapSize() {
        return this.f793e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f796h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f796h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.f789a;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f798j;
    }

    public boolean isSpinEnabled() {
        return this.f794f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Paint paint = this.f789a;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f6) {
        if (this.f790b != f6) {
            this.f790b = f6;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f6) {
        if (this.f792d != f6) {
            this.f792d = f6;
            invalidateSelf();
        }
    }

    public void setBarLength(float f6) {
        if (this.f791c != f6) {
            this.f791c = f6;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f6) {
        Paint paint = this.f789a;
        if (paint.getStrokeWidth() != f6) {
            paint.setStrokeWidth(f6);
            this.f799k = (float) (Math.cos(m) * ((double) (f6 / 2.0f)));
            invalidateSelf();
        }
    }

    public void setColor(@ColorInt int i10) {
        Paint paint = this.f789a;
        if (i10 != paint.getColor()) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f789a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(int i10) {
        if (i10 != this.f800l) {
            this.f800l = i10;
            invalidateSelf();
        }
    }

    public void setGapSize(float f6) {
        if (f6 != this.f793e) {
            this.f793e = f6;
            invalidateSelf();
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        if (this.f798j != f6) {
            this.f798j = f6;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z10) {
        if (this.f794f != z10) {
            this.f794f = z10;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z10) {
        if (this.f797i != z10) {
            this.f797i = z10;
            invalidateSelf();
        }
    }
}
