package com.cyberfend.cyfsecurity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.budiyev.android.codescanner.BarcodeUtils;

/* JADX INFO: loaded from: classes9.dex */
public class CircleProgressBar extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f39242p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f39243q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f39244r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f39245s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final RectF f39246t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Paint f39247u0;
    public final Paint v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f39248w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Handler f39249x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final a f39250y0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CircleProgressBar circleProgressBar = CircleProgressBar.this;
            int i10 = circleProgressBar.f39248w0;
            if (i10 < 9) {
                circleProgressBar.f39248w0 = i10 + 1;
                circleProgressBar.f39243q0 += 1.0f;
                circleProgressBar.postInvalidate();
                circleProgressBar.f39249x0.postDelayed(circleProgressBar.f39250y0, 100L);
            }
        }
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39242p0 = 20.0f;
        this.f39243q0 = 0.0f;
        this.f39244r0 = 100;
        this.f39245s0 = BarcodeUtils.ROTATION_270;
        this.f39248w0 = 0;
        Handler handler = new Handler();
        this.f39249x0 = handler;
        a aVar = new a();
        this.f39250y0 = aVar;
        this.f39246t0 = new RectF();
        Paint paint = new Paint(1);
        this.f39247u0 = paint;
        paint.setColor(context.getResources().getColor(R.color.akamaiCCAcolorProgressBackground));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.v0 = paint2;
        paint2.setColor(context.getResources().getColor(R.color.akamaiCCAcolorProgressForeground));
        paint2.setStyle(style);
        handler.postDelayed(aVar, 100L);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f39246t0;
        canvas.drawOval(rectF, this.f39247u0);
        canvas.drawArc(rectF, this.f39245s0, (this.f39243q0 * 360.0f) / this.f39244r0, true, this.v0);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        setMeasuredDimension(iMin, iMin);
        RectF rectF = this.f39246t0;
        float f6 = this.f39242p0;
        float f10 = iMin;
        rectF.set((f6 / 2.0f) + 0.0f, (f6 / 2.0f) + 0.0f, f10 - (f6 / 2.0f), f10 - (f6 / 2.0f));
    }

    public synchronized void setProgress(float f6) {
        this.f39243q0 = f6 * this.f39244r0;
        this.f39248w0 = 0;
        this.f39249x0.postDelayed(this.f39250y0, 100L);
        postInvalidate();
    }

    public void setProgressBarColor(int i10) {
        this.v0.setColor(i10);
        this.f39247u0.setColor(Color.argb(Math.round(Color.alpha(i10) * 0.25f), Color.red(i10), Color.green(i10), Color.blue(i10)));
    }
}
