package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.salesforce.marketingcloud.MCKeep;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ClippingConstraintLayout extends ConstraintLayout {
    private float borderWidth;
    private float cornerRadius;
    private Path path;
    private RectF rect;
    private Rect tmpRect;

    public ClippingConstraintLayout(Context context) {
        super(context);
        this.path = new Path();
        this.rect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.tmpRect = new Rect(0, 0, 0, 0);
        init();
    }

    private void init() {
        Resources resources = getResources();
        this.cornerRadius = (float) Math.floor(TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        this.borderWidth = TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.path.reset();
        getDrawingRect(this.tmpRect);
        RectF rectF = this.rect;
        Rect rect = this.tmpRect;
        float f6 = rect.left;
        float f10 = this.borderWidth;
        rectF.set(f6 + f10, rect.top + f10, rect.right - f10, rect.bottom - f10);
        Path path = this.path;
        RectF rectF2 = this.rect;
        float f11 = this.cornerRadius;
        path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
        this.path.close();
    }

    public void setClippingDetails(float f6, float f10) {
        if (this.borderWidth == f6 && this.cornerRadius == f10) {
            return;
        }
        this.borderWidth = f6;
        this.cornerRadius = (float) Math.floor(f10);
        invalidate();
    }

    public ClippingConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.path = new Path();
        this.rect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.tmpRect = new Rect(0, 0, 0, 0);
        init();
    }

    public ClippingConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.path = new Path();
        this.rect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.tmpRect = new Rect(0, 0, 0, 0);
        init();
    }
}
