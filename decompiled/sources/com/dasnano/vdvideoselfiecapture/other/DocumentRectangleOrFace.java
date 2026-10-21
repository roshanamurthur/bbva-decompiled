package com.dasnano.vdvideoselfiecapture.other;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class DocumentRectangleOrFace extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f39858p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RectF f39859q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f39860r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f39861s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public typesDrawables f39862t0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f39863p0;

        /* JADX INFO: renamed from: com.dasnano.vdvideoselfiecapture.other.DocumentRectangleOrFace$a$a, reason: collision with other inner class name */
        public class C0189a implements ValueAnimator.AnimatorUpdateListener {
            public C0189a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DocumentRectangleOrFace.this.invalidate();
            }
        }

        public a(int i10) {
            this.f39863p0 = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DocumentRectangleOrFace documentRectangleOrFace = DocumentRectangleOrFace.this;
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(documentRectangleOrFace.f39858p0, "color", new ArgbEvaluator(), Integer.valueOf(this.f39863p0), Integer.valueOf(documentRectangleOrFace.f39860r0));
            objectAnimatorOfObject.setDuration(500L);
            objectAnimatorOfObject.addUpdateListener(new C0189a());
            objectAnimatorOfObject.start();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class typesDrawables {
        private static final /* synthetic */ typesDrawables[] $VALUES;
        public static final typesDrawables FACE_OVAL;
        public static final typesDrawables ROUNDED_RECTANGLE;

        static {
            typesDrawables typesdrawables = new typesDrawables("ROUNDED_RECTANGLE", 0);
            ROUNDED_RECTANGLE = typesdrawables;
            typesDrawables typesdrawables2 = new typesDrawables("FACE_OVAL", 1);
            FACE_OVAL = typesdrawables2;
            $VALUES = new typesDrawables[]{typesdrawables, typesdrawables2};
        }

        public typesDrawables() {
            throw null;
        }

        public static typesDrawables valueOf(String str) {
            return (typesDrawables) Enum.valueOf(typesDrawables.class, str);
        }

        public static typesDrawables[] values() {
            return (typesDrawables[]) $VALUES.clone();
        }
    }

    public DocumentRectangleOrFace(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39858p0 = new Paint();
        this.f39860r0 = -1;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        typesDrawables typesdrawables = this.f39862t0;
        typesDrawables typesdrawables2 = typesDrawables.FACE_OVAL;
        Paint paint = this.f39858p0;
        if (typesdrawables == typesdrawables2) {
            canvas.drawOval(this.f39859q0, paint);
            return;
        }
        RectF rectF = this.f39859q0;
        if (rectF != null) {
            float f6 = this.f39861s0 * 33.75f;
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
    }

    public int getColor() {
        return this.f39860r0;
    }

    public void setDocumentOrFaceRectangle(int i10, Rect rect, typesDrawables typesdrawables, int i11, Activity activity) {
        int i12 = this.f39860r0;
        this.f39860r0 = i10;
        Paint paint = this.f39858p0;
        paint.setStyle(Paint.Style.STROKE);
        float f6 = i11 / 1080.0f;
        this.f39861s0 = f6;
        paint.setStrokeWidth(f6 * 20.0f);
        this.f39859q0 = new RectF(rect);
        this.f39862t0 = typesdrawables;
        int i13 = this.f39860r0;
        if (i13 != i12 || i13 == -1) {
            activity.runOnUiThread(new a(i12));
        }
    }
}
