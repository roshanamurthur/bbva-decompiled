package com.dasnano.vddocumentcapture.other;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.veridas.graphics.RectUtils;

/* JADX INFO: loaded from: classes9.dex */
public class Rectangle extends View {
    public Boolean isRoundedCorner;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Rect f39483p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Paint f39484q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final CornerPathEffect f39485r0;

    public Rectangle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39483p0 = null;
        this.f39484q0 = new Paint();
        this.f39485r0 = new CornerPathEffect(25.0f);
        this.isRoundedCorner = Boolean.TRUE;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f39483p0;
        Paint paint = this.f39484q0;
        if (rect == null) {
            paint.setColor(0);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawRect(0.0f, 0.0f, getRight(), getBottom(), paint);
        } else {
            paint.setColor(-16711936);
            paint.setStrokeWidth(8.0f);
            paint.setStyle(Paint.Style.STROKE);
            if (this.isRoundedCorner.booleanValue()) {
                paint.setPathEffect(this.f39485r0);
            }
            canvas.drawRect(this.f39483p0, paint);
        }
    }

    public void setRect(@Nullable Rect rect) {
        if (RectUtils.safeEquals(this.f39483p0, rect)) {
            return;
        }
        this.f39483p0 = rect;
        invalidate();
    }
}
