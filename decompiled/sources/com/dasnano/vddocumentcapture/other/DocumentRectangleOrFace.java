package com.dasnano.vddocumentcapture.other;

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
import com.dasnano.vddocumentcapture.other.DocumentRectangleOrFace;
import com.dasnano.vddocumentcapture.other.DocumentRectangleOrFace.a;
import com.veridas.display.DisplayUtils;

/* JADX INFO: loaded from: classes9.dex */
public class DocumentRectangleOrFace extends View {
    public static final int ANIMATION_DURATION = 500;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f39475p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RectF f39476q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f39477r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f39478s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public TypesDrawables f39479t0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypesDrawables {
        private static final /* synthetic */ TypesDrawables[] $VALUES;
        public static final TypesDrawables FACE_OVAL;
        public static final TypesDrawables ROUNDED_RECTANGLE;

        static {
            TypesDrawables typesDrawables = new TypesDrawables("ROUNDED_RECTANGLE", 0);
            ROUNDED_RECTANGLE = typesDrawables;
            TypesDrawables typesDrawables2 = new TypesDrawables("FACE_OVAL", 1);
            FACE_OVAL = typesDrawables2;
            $VALUES = new TypesDrawables[]{typesDrawables, typesDrawables2};
        }

        public TypesDrawables() {
            throw null;
        }

        public static TypesDrawables valueOf(String str) {
            return (TypesDrawables) Enum.valueOf(TypesDrawables.class, str);
        }

        public static TypesDrawables[] values() {
            return (TypesDrawables[]) $VALUES.clone();
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DocumentRectangleOrFace.this.invalidate();
        }
    }

    public DocumentRectangleOrFace(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39475p0 = new Paint();
        this.f39478s0 = 0;
        this.f39477r0 = -1;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        RectF rectF = this.f39476q0;
        if (rectF != null) {
            TypesDrawables typesDrawables = this.f39479t0;
            TypesDrawables typesDrawables2 = TypesDrawables.FACE_OVAL;
            Paint paint = this.f39475p0;
            if (typesDrawables == typesDrawables2) {
                canvas.drawOval(rectF, paint);
            } else {
                int i10 = this.f39478s0;
                canvas.drawRoundRect(rectF, i10, i10, paint);
            }
        }
    }

    public int getColor() {
        return this.f39477r0;
    }

    public void setDocumentOrFaceRectangle(final int i10, final Rect rect, final TypesDrawables typesDrawables, final int i11, final Activity activity) {
        activity.runOnUiThread(new Runnable(activity, i10, i11, rect, typesDrawables) { // from class: md.b

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Activity f83394q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ int f83395r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Rect f83396s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ DocumentRectangleOrFace.TypesDrawables f83397t0;

            {
                this.f83396s0 = rect;
                this.f83397t0 = typesDrawables;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DocumentRectangleOrFace documentRectangleOrFace = this.f83393p0;
                int i12 = documentRectangleOrFace.f39477r0;
                Context applicationContext = this.f83394q0.getApplicationContext();
                documentRectangleOrFace.f39477r0 = this.f83395r0;
                Paint paint = documentRectangleOrFace.f39475p0;
                paint.setStyle(Paint.Style.STROKE);
                documentRectangleOrFace.f39478s0 = DisplayUtils.getSizeInPixels(applicationContext, 20.0f);
                paint.setStrokeWidth(DisplayUtils.getSizeInPixels(applicationContext, 6.6667f));
                documentRectangleOrFace.f39476q0 = new RectF(this.f83396s0);
                documentRectangleOrFace.f39479t0 = this.f83397t0;
                int i13 = documentRectangleOrFace.f39477r0;
                if (i13 == -1 || i13 != i12) {
                    ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(paint, "color", new ArgbEvaluator(), Integer.valueOf(i12), Integer.valueOf(documentRectangleOrFace.f39477r0));
                    objectAnimatorOfObject.setDuration(500L);
                    objectAnimatorOfObject.addUpdateListener(documentRectangleOrFace.new a());
                    objectAnimatorOfObject.start();
                }
            }
        });
    }
}
