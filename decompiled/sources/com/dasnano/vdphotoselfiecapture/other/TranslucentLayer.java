package com.dasnano.vdphotoselfiecapture.other;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.dasnano.vdphotoselfiecapture.R;

/* JADX INFO: loaded from: classes9.dex */
public class TranslucentLayer extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Paint f39706p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Paint f39707q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RectF f39708r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final RectF f39709s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f39710t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Path f39711u0;
    public int v0;

    public TranslucentLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39706p0 = new Paint();
        this.f39707q0 = new Paint();
        this.f39708r0 = null;
        this.f39709s0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f39710t0 = true;
        this.f39711u0 = new Path();
        this.v0 = getResources().getColor(R.color.vd_photo_transparent_grey);
        setLayerType(2, null);
    }

    public int getBackgroundColor() {
        return this.v0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        this.f39706p0 = paint;
        paint.setColor(this.v0);
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f39706p0);
        Paint paint2 = new Paint();
        this.f39707q0 = paint2;
        paint2.setAlpha(255);
        this.f39707q0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        RectF rectF = this.f39708r0;
        if (rectF == null || rectF.equals(this.f39709s0)) {
            return;
        }
        if (this.f39710t0) {
            canvas.drawOval(this.f39708r0, this.f39707q0);
            return;
        }
        float fWidth = this.f39708r0.width();
        float f6 = (4.0f * fWidth) / 3.0f;
        float width = (getWidth() - fWidth) / 2.0f;
        float height = (getHeight() - f6) / 2.0f;
        Path path = new Path();
        this.f39711u0 = path;
        float f10 = width + fWidth;
        float f11 = (0.37f * f6) + height;
        path.moveTo(f10, f11);
        float f12 = (0.718f * f6) + height;
        float f13 = height + f6;
        this.f39711u0.cubicTo(f10, f12, (0.776f * fWidth) + width, f13, (0.5f * fWidth) + width, f13);
        this.f39711u0.cubicTo((0.224f * fWidth) + width, f13, width, f12, width, f11);
        float f14 = (f6 * 0.022f) + height;
        this.f39711u0.cubicTo(width, f14, (0.234f * fWidth) + width, height, (0.51f * fWidth) + width, height);
        this.f39711u0.cubicTo((fWidth * 0.786f) + width, height, f10, f14, f10, f11);
        canvas.drawPath(this.f39711u0, this.f39707q0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.v0 = i10;
    }

    public void setIsFaceShapeOval(boolean z10) {
        this.f39710t0 = z10;
    }

    public void setReferenceRect(Rect rect) {
        this.f39708r0 = new RectF(rect);
        invalidate();
    }
}
