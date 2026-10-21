package com.dasnano.vdvideoselfiecapture.other;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.veridas.graphics.RectUtils;
import com.veridas.log.Log;

/* JADX INFO: loaded from: classes9.dex */
public class RectangleView extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Rect f39881p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Paint f39882q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f39883r0;

    public RectangleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39881p0 = null;
        this.f39882q0 = new Paint();
        this.f39883r0 = Color.parseColor("#00CC00");
    }

    public Rect getRect() {
        return this.f39881p0;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        try {
            Rect rect = this.f39881p0;
            Paint paint = this.f39882q0;
            if (rect != null) {
                paint.setColor(this.f39883r0);
                paint.setStrokeWidth(8.0f);
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawRect(this.f39881p0, paint);
            } else {
                paint.setColor(0);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawRect(0.0f, 0.0f, getRight(), getBottom(), paint);
            }
        } catch (Exception e5) {
            Log.e("RectangleView", "Unable to draw Rectangle.", e5);
        }
    }

    public void setColor(int i10) {
        this.f39883r0 = i10;
    }

    public void setRect(@Nullable Rect rect) {
        if (RectUtils.safeEquals(this.f39881p0, rect)) {
            return;
        }
        this.f39881p0 = rect;
        invalidate();
    }
}
