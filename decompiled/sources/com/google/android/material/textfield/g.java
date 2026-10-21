package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: compiled from: CutoutDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends MaterialShapeDrawable {
    public static final /* synthetic */ int T0 = 0;

    @NonNull
    public a S0;

    /* JADX INFO: compiled from: CutoutDrawable.java */
    @TargetApi(18)
    public static class b extends g {
        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void drawStrokeShape(@NonNull Canvas canvas) {
            if (this.S0.f45625v.isEmpty()) {
                super.drawStrokeShape(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.S0.f45625v);
            } else {
                canvas.clipRect(this.S0.f45625v, Region.Op.DIFFERENCE);
            }
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }

    public g(a aVar) {
        super(aVar);
        this.S0 = aVar;
    }

    public final void i(float f6, float f10, float f11, float f12) {
        RectF rectF = this.S0.f45625v;
        if (f6 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f6, f10, f11, f12);
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.S0 = new a(this.S0);
        return this;
    }

    /* JADX INFO: compiled from: CutoutDrawable.java */
    public static final class a extends MaterialShapeDrawable.MaterialShapeDrawableState {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public final RectF f45625v;

        public a(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            super(shapeAppearanceModel, null);
            this.f45625v = rectF;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.f45625v = aVar.f45625v;
        }
    }
}
