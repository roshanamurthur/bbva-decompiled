package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ShadowRenderer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f45211i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f45212j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f45213k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f45214l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Paint f45215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Paint f45216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Paint f45217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f45221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f45222h;

    public ShadowRenderer() {
        this(ViewCompat.MEASURED_STATE_MASK);
    }

    public void drawCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i10, float f6, float f10) {
        boolean z10 = f10 < 0.0f;
        Path path = this.f45221g;
        int[] iArr = f45213k;
        if (z10) {
            iArr[0] = 0;
            iArr[1] = this.f45220f;
            iArr[2] = this.f45219e;
            iArr[3] = this.f45218d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f10);
            path.close();
            float f11 = -i10;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = this.f45218d;
            iArr[2] = this.f45219e;
            iArr[3] = this.f45220f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f12 = 1.0f - (i10 / fWidth);
        float[] fArr = f45214l;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = this.f45216b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f45222h);
        }
        canvas.drawArc(rectF, f6, f10, true, paint);
        canvas.restore();
    }

    public void drawEdgeShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f45211i;
        iArr[0] = this.f45220f;
        iArr[1] = this.f45219e;
        iArr[2] = this.f45218d;
        Paint paint = this.f45217c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, f45212j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public void drawInnerCornerShadow(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i10, float f6, float f10, @NonNull float[] fArr) {
        if (f10 > 0.0f) {
            f6 += f10;
            f10 = -f10;
        }
        drawCornerShadow(canvas, matrix, rectF, i10, f6, f10);
        Path path = this.f45221g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f6, f10);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f45222h);
        canvas.drawPath(path, this.f45215a);
        canvas.restore();
    }

    @NonNull
    public Paint getShadowPaint() {
        return this.f45215a;
    }

    public void setShadowColor(int i10) {
        this.f45218d = ColorUtils.setAlphaComponent(i10, 68);
        this.f45219e = ColorUtils.setAlphaComponent(i10, 20);
        this.f45220f = ColorUtils.setAlphaComponent(i10, 0);
        this.f45215a.setColor(this.f45218d);
    }

    public ShadowRenderer(int i10) {
        this.f45221g = new Path();
        Paint paint = new Paint();
        this.f45222h = paint;
        this.f45215a = new Paint();
        setShadowColor(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f45216b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f45217c = new Paint(paint2);
    }
}
