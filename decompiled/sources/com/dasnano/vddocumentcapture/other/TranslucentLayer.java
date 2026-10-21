package com.dasnano.vddocumentcapture.other;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.veridas.display.DisplayUtils;

/* JADX INFO: loaded from: classes9.dex */
public class TranslucentLayer extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f39489p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Paint f39490q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PorterDuffXfermode f39491r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f39492s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f39493t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public RectF f39494u0;

    public TranslucentLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39489p0 = new Paint();
        this.f39490q0 = new Paint();
        this.f39491r0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f39493t0 = 0;
        this.f39494u0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        Paint paint = this.f39489p0;
        paint.setColor(this.f39492s0);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        Paint paint2 = this.f39490q0;
        paint2.setAlpha(255);
        paint2.setXfermode(this.f39491r0);
        RectF rectF = this.f39494u0;
        if (rectF == null || (i10 = this.f39493t0) == 0) {
            return;
        }
        canvas.drawRoundRect(rectF, i10, i10, paint2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f39492s0 = i10;
    }

    public void setReferenceRect(Context context, Rect rect) {
        this.f39493t0 = DisplayUtils.getSizeInPixels(context, 20.0f);
        this.f39494u0 = new RectF(rect);
        invalidate();
    }
}
