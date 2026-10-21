package com.dasnano.vdvideoselfiecapture.other;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.veridas.graphics.RectUtils;
import com.veridas.log.Log;

/* JADX INFO: loaded from: classes9.dex */
public class OvalView extends View {
    public static float v0 = 1.0f;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public RectF f39875p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Path f39876q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final RectF f39877r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f39878s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Paint f39879t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f39880u0;

    public OvalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39875p0 = null;
        this.f39876q0 = null;
        this.f39877r0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f39878s0 = true;
        this.f39879t0 = new Paint();
        this.f39880u0 = Color.parseColor("#00CC00");
    }

    public final void a(Canvas canvas) {
        RectF rectF = this.f39875p0;
        if (rectF != null) {
            float f6 = rectF.left;
            float f10 = rectF.top;
            float fWidth = rectF.width();
            float fHeight = this.f39875p0.height();
            Path path = new Path();
            this.f39876q0 = path;
            float f11 = f6 + fWidth;
            float f12 = (0.37f * fHeight) + f10;
            path.moveTo(f11, f12);
            float f13 = (0.718f * fHeight) + f10;
            float f14 = f10 + fHeight;
            this.f39876q0.cubicTo(f11, f13, (0.776f * fWidth) + f6, f14, (0.5f * fWidth) + f6, f14);
            this.f39876q0.cubicTo((0.224f * fWidth) + f6, f14, f6, f13, f6, f12);
            float f15 = (fHeight * 0.022f) + f10;
            this.f39876q0.cubicTo(f6, f15, (0.234f * fWidth) + f6, f10, (0.51f * fWidth) + f6, f10);
            this.f39876q0.cubicTo((fWidth * 0.786f) + f6, f10, f11, f15, f11, f12);
            canvas.drawPath(this.f39876q0, this.f39879t0);
        }
    }

    public RectF getRect() {
        return this.f39875p0;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        try {
            RectF rectF = this.f39875p0;
            Paint paint = this.f39879t0;
            if (rectF == null || rectF.equals(this.f39877r0)) {
                paint.setColor(0);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                if (this.f39878s0) {
                    canvas.drawRect(new Rect(0, 0, getRight(), getBottom()), paint);
                } else {
                    a(canvas);
                }
            } else {
                paint.setColor(this.f39880u0);
                paint.setStrokeWidth(12.0f);
                paint.setStyle(Paint.Style.STROKE);
                if (this.f39878s0) {
                    canvas.drawOval(this.f39875p0, paint);
                } else {
                    a(canvas);
                }
            }
        } catch (Exception e5) {
            Log.e(getClass().getSimpleName(), "Unable to draw Oval.", e5);
        }
    }

    public void setColor(int i10) {
        this.f39880u0 = i10;
    }

    public void setIsFaceShapeOval(boolean z10) {
        this.f39878s0 = z10;
    }

    public void setRatio(float f6) {
        v0 = f6;
    }

    public void setRect(@Nullable Rect rect) {
        if (rect == null) {
            if (this.f39875p0 != null) {
                invalidate();
                this.f39875p0 = null;
                return;
            }
            return;
        }
        float f6 = (1.0f / v0) * 1.0f;
        int iRound = Math.round(((rect.width() * 0.0f) / 2.0f) + rect.left);
        int iRound2 = Math.round((((1.0f - f6) * rect.height()) / 2.0f) + rect.top);
        RectF rectF = new RectF(iRound, iRound2, iRound + Math.round(rect.width() * 1.0f), iRound2 + Math.round(rect.height() * f6));
        if (RectUtils.safeEquals(this.f39875p0, rectF)) {
            return;
        }
        invalidate();
        this.f39875p0 = rectF;
    }
}
