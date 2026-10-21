package com.dasnano.vdphotoselfiecapture.other;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.veridas.graphics.RectUtils;

/* JADX INFO: loaded from: classes9.dex */
public class RectangleView extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public RectF f39694p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f39695q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f39696r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Paint f39697s0;

    public RectangleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39694p0 = null;
        this.f39695q0 = 1.0f;
        this.f39696r0 = Color.parseColor("#00CC00");
        this.f39697s0 = new Paint();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f39694p0;
        Paint paint = this.f39697s0;
        if (rectF == null) {
            paint.setColor(0);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawRect(0.0f, 0.0f, getRight(), getBottom(), paint);
        } else {
            paint.setColor(this.f39696r0);
            paint.setStrokeWidth(12.0f);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawOval(this.f39694p0, paint);
        }
    }

    public void setColor(int i10) {
        this.f39696r0 = i10;
    }

    public void setRatio(float f6) {
        this.f39695q0 = f6;
    }

    public void setRect(@Nullable Rect rect) {
        if (rect == null) {
            if (this.f39694p0 != null) {
                invalidate();
                this.f39694p0 = null;
                return;
            }
            return;
        }
        float f6 = (1.0f / this.f39695q0) * 1.0f;
        int iRound = Math.round(((rect.width() * 0.0f) / 2.0f) + rect.left);
        int iRound2 = Math.round((((1.0f - f6) * rect.height()) / 2.0f) + rect.top);
        RectF rectF = new RectF(iRound, iRound2, iRound + Math.round(rect.width() * 1.0f), iRound2 + Math.round(rect.height() * f6));
        if (RectUtils.safeEquals(this.f39694p0, rectF)) {
            return;
        }
        invalidate();
        this.f39694p0 = rectF;
    }
}
