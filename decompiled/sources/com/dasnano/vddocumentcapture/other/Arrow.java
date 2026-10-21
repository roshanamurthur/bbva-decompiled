package com.dasnano.vddocumentcapture.other;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class Arrow extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public volatile boolean f39464p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile boolean f39465q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Paint f39466r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Path[] f39467s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int[] f39468t0;

    public Arrow(Context context) {
        super(context);
        this.f39464p0 = false;
        this.f39465q0 = true;
        this.f39466r0 = new Paint();
        this.f39467s0 = new Path[0];
        this.f39468t0 = new int[0];
    }

    public static float a(Point point, Point point2) {
        float fAbs = Math.abs(point.x - point2.x);
        float fAbs2 = Math.abs(point.y - point2.y);
        return (float) Math.sqrt((fAbs2 * fAbs2) + (fAbs * fAbs));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10 = this.f39464p0;
        super.onDraw(canvas);
        int i10 = 0;
        if (!z10) {
            if (this.f39465q0) {
                this.f39466r0.setColor(0);
                this.f39466r0.setStyle(Paint.Style.FILL_AND_STROKE);
                while (true) {
                    Path[] pathArr = this.f39467s0;
                    if (i10 >= pathArr.length) {
                        break;
                    }
                    canvas.drawPath(pathArr[i10], this.f39466r0);
                    i10++;
                }
            }
        } else {
            this.f39466r0.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f39466r0.setStrokeWidth(1.0f);
            while (i10 < this.f39467s0.length) {
                this.f39466r0.setColor(this.f39468t0[i10]);
                canvas.drawPath(this.f39467s0[i10], this.f39466r0);
                i10++;
            }
        }
        this.f39465q0 = z10;
    }

    public void setAttributes(Point point, Point point2, int i10) {
        float f6 = i10;
        int i11 = 0;
        this.f39464p0 = (point == null || point2 == null || a(point, point2) < 0.06944445f * f6) ? false : true;
        for (Path path : this.f39467s0) {
            path.reset();
        }
        if (this.f39464p0) {
            int iRound = Math.round(0.018518519f * f6);
            int i12 = point.x;
            if (i12 > point2.x - 5) {
                point.x = i12 - iRound;
                point2.x = (iRound * 2) + point2.x;
            } else {
                point.x = i12 + iRound;
                point2.x -= iRound * 2;
            }
            int i13 = point.y;
            if (i13 > point2.y - 5) {
                point.y = i13 - iRound;
                point2.y = (iRound * 2) + point2.y;
            } else {
                point.y = i13 + iRound;
                point2.y -= iRound * 2;
            }
            float f10 = f6 / 1080.0f;
            float f11 = 50.0f * f10;
            float f12 = f10 * 7.0f;
            while (true) {
                Path[] pathArr = this.f39467s0;
                if (i11 >= pathArr.length) {
                    break;
                }
                int i14 = i11 + 1;
                Path path2 = pathArr[i11];
                float f13 = f11 / 2.0f;
                float f14 = f13 - f12;
                path2.moveTo(0.0f, f14);
                path2.lineTo(0.0f, f13);
                path2.lineTo(f13, 0.0f);
                float f15 = -f13;
                path2.lineTo(0.0f, f15);
                float f16 = f15 + f12;
                path2.lineTo(0.0f, f16);
                path2.lineTo(0.0f, f16);
                path2.lineTo(f14, 0.0f);
                path2.lineTo(0.0f, f14);
                float fA = a(point, point2);
                float degrees = (float) Math.toDegrees(Math.atan2(point2.x - point.x, point2.y - point.y));
                Matrix matrix = new Matrix();
                matrix.preTranslate(((fA * i14) / 5.0f) - f13, 0.0f);
                matrix.postTranslate(point2.x, point2.y);
                matrix.postRotate((-degrees) - 90.0f, point2.x, point2.y);
                path2.transform(matrix);
                i11 = i14;
            }
        }
        invalidate();
    }

    public void setPaths(int[] iArr) {
        int length = iArr.length;
        this.f39467s0 = new Path[length];
        this.f39468t0 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.f39467s0[i10] = new Path();
            this.f39468t0[i10] = iArr[i10];
        }
    }

    public Arrow(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39464p0 = false;
        this.f39465q0 = true;
        this.f39466r0 = new Paint();
        this.f39467s0 = new Path[0];
        this.f39468t0 = new int[0];
    }

    public Arrow(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39464p0 = false;
        this.f39465q0 = true;
        this.f39466r0 = new Paint();
        this.f39467s0 = new Path[0];
        this.f39468t0 = new int[0];
    }
}
