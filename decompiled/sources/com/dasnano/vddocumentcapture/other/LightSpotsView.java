package com.dasnano.vddocumentcapture.other;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class LightSpotsView extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f39481p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f39482q0;

    public LightSpotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f39481p0 = paint;
        paint.setStrokeWidth(8.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.f39482q0 = new ArrayList();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        ArrayList<Rect> arrayList = this.f39482q0;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawColor(0);
            return;
        }
        for (Rect rect : arrayList) {
            canvas.drawCircle(rect.centerX(), rect.centerY(), rect.width() / 2, this.f39481p0);
        }
    }

    public void setColor(int i10) {
        this.f39481p0.setColor(i10);
    }

    public void setRects(List<Rect> list) {
        ArrayList arrayList = this.f39482q0;
        arrayList.clear();
        arrayList.addAll(list);
        invalidate();
    }
}
