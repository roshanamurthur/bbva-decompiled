package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
final class bm extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<c> f40646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40651f;

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        d f40652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Paint f40653b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f40656e = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f40655d = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ArrayList<Animator> f40654c = new ArrayList<>();

        public c(float f6, float f10) {
            this.f40652a = new d(f6, f10);
            bm.this.setLayerType(2, null);
            Paint paint = new Paint(1);
            this.f40653b = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f40653b.setStrokeWidth(this.f40656e);
            this.f40653b.setColor(this.f40655d);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f40658a = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f40659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f40660d;

        public d(float f6, float f10) {
            this.f40660d = f6;
            this.f40659c = f10;
        }
    }

    public bm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40647b = 500;
        this.f40649d = 5;
        this.f40646a = new ArrayList<>();
        this.f40651f = false;
        post(new k3(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void av_(c cVar, ValueAnimator valueAnimator, Animator animator) {
        cVar.f40653b.setAlpha(0);
        d();
        cVar.f40654c.remove(valueAnimator);
        this.f40646a.remove(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aw_(c cVar, ValueAnimator valueAnimator) {
        cVar.f40652a.f40658a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fMin = Math.min(this.f40648c, cVar.f40652a.f40658a);
        cVar.f40656e = fMin;
        Paint paint = cVar.f40653b;
        if (paint != null) {
            paint.setStrokeWidth(fMin);
        }
        cVar.f40653b.setAlpha(Math.round((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
        d();
    }

    private void d() {
        this.f40651f = true;
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList<c> arrayList;
        if (!this.f40651f || (arrayList = this.f40646a) == null || arrayList.size() <= 0) {
            return;
        }
        for (c cVar : this.f40646a) {
            d dVar = cVar.f40652a;
            canvas.drawCircle(dVar.f40660d, dVar.f40659c, dVar.f40658a, cVar.f40653b);
        }
        this.f40651f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f40650e = Math.round(ay.e(50) * db.d() * db.c());
        this.f40648c = Math.round(ay.e(3) * db.d() * db.c());
    }

    public final void d(float f6, float f10) {
        if (this.f40646a.size() > 5) {
            return;
        }
        final c cVar = new c(f6, f10);
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(cVar.f40652a.f40658a, this.f40650e);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.v5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f42923a.aw_(cVar, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b() { // from class: com.facetec.sdk.w5
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.f42940a.av_(cVar, valueAnimatorOfFloat, animator);
            }

            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationRepeat(Animator animator) {
                v1.b(this, animator);
            }

            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationStart(Animator animator) {
                v1.c(this, animator);
            }
        });
        valueAnimatorOfFloat.start();
        cVar.f40654c.add(valueAnimatorOfFloat);
        this.f40646a.add(cVar);
    }
}
