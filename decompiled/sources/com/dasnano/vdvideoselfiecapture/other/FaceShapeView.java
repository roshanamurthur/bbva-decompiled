package com.dasnano.vdvideoselfiecapture.other;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class FaceShapeView extends View {
    public ObjectAnimator colorFade;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f39866p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RectF f39867q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final RectF f39868r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Path f39869s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f39870t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f39871u0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f39872p0;

        /* JADX INFO: renamed from: com.dasnano.vdvideoselfiecapture.other.FaceShapeView$a$a, reason: collision with other inner class name */
        public class C0190a implements ValueAnimator.AnimatorUpdateListener {
            public C0190a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FaceShapeView.this.invalidate();
            }
        }

        public a(int i10) {
            this.f39872p0 = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FaceShapeView faceShapeView = FaceShapeView.this;
            faceShapeView.colorFade = ObjectAnimator.ofObject(faceShapeView.f39866p0, "color", new ArgbEvaluator(), Integer.valueOf(this.f39872p0), Integer.valueOf(faceShapeView.f39871u0));
            faceShapeView.colorFade.setDuration(500L);
            faceShapeView.colorFade.addUpdateListener(new C0190a());
            faceShapeView.colorFade.start();
        }
    }

    public FaceShapeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39866p0 = new Paint();
        this.f39867q0 = null;
        this.f39868r0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f39869s0 = new Path();
        this.f39870t0 = true;
        this.colorFade = null;
        this.f39871u0 = -1;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        RectF rectF = this.f39867q0;
        if (rectF == null || rectF.equals(this.f39868r0)) {
            return;
        }
        boolean z10 = this.f39870t0;
        Paint paint = this.f39866p0;
        if (z10) {
            canvas.drawOval(this.f39867q0, paint);
            return;
        }
        float fWidth = this.f39867q0.width();
        float f6 = (4.0f * fWidth) / 3.0f;
        float width = (getWidth() - fWidth) / 2.0f;
        float height = (getHeight() - f6) / 2.0f;
        Path path = this.f39869s0;
        float f10 = width + fWidth;
        float f11 = (0.37f * f6) + height;
        path.moveTo(f10, f11);
        float f12 = (0.718f * f6) + height;
        float f13 = height + f6;
        path.cubicTo(f10, f12, (0.776f * fWidth) + width, f13, (0.5f * fWidth) + width, f13);
        path.cubicTo((0.224f * fWidth) + width, f13, width, f12, width, f11);
        float f14 = (f6 * 0.022f) + height;
        path.cubicTo(width, f14, (0.234f * fWidth) + width, height, (0.51f * fWidth) + width, height);
        path.cubicTo((fWidth * 0.786f) + width, height, f10, f14, f10, f11);
        canvas.drawPath(path, paint);
    }

    public int getColor() {
        return this.f39871u0;
    }

    public void invalidateDraw() {
        ObjectAnimator objectAnimator = this.colorFade;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
        }
    }

    public void setIsFaceShapeOval(boolean z10) {
        this.f39870t0 = z10;
    }

    public void setRect(int i10, Rect rect, int i11, Activity activity) {
        int i12 = this.f39871u0;
        this.f39871u0 = i10;
        Paint paint = this.f39866p0;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((i11 / 1080.0f) * 20.0f);
        this.f39867q0 = new RectF(rect);
        int i13 = this.f39871u0;
        if (i13 != i12 || i13 == -1) {
            activity.runOnUiThread(new a(i12));
        }
    }
}
