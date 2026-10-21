package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Nullable;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
final class bk extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Paint f40628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f40629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f40630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f40631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f40632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RectF f40633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f40635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f40636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f40637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f40638k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f40639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f40640o;

    public enum a {
        DEFAULT,
        SMALL_FOR_OVERZOOMED
    }

    public bk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40629b = a.DEFAULT;
        this.f40636i = false;
        this.f40634g = false;
        this.f40637j = context;
        post(new m2(this, 1));
    }

    private RectF aB_(float f6) {
        float width = getWidth();
        float height = getHeight();
        float fA = (height - androidx.core.graphics.b.a(f6, 2.0f, width, 0.632f)) / 2.0f;
        return new RectF(f6, fA, width - f6, height - fA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aC_(final Runnable runnable, Animator animator) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f40630c, 0.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new s5(this, 0));
        valueAnimatorOfFloat.addListener(new b() { // from class: com.facetec.sdk.t5
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator2) {
                v1.a(this, animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                bk.aD_(runnable, animator2);
            }

            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationRepeat(Animator animator2) {
                v1.b(this, animator2);
            }

            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationStart(Animator animator2) {
                v1.c(this, animator2);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void aD_(Runnable runnable, Animator animator) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aE_(ValueAnimator valueAnimator) {
        this.f40628a.setStrokeWidth(((Float) valueAnimator.getAnimatedValue()).floatValue());
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aF_(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f40635h = fFloatValue;
        this.f40633f = aB_(fFloatValue);
        this.f40632e = Math.min(Math.round(((getWidth() - (this.f40635h * 2.0f)) * 0.632f) / 2.0f), this.f40632e);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void aG_(Runnable runnable, Animator animator) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aH_(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f40635h = fFloatValue;
        this.f40633f = aB_(fFloatValue);
        b();
    }

    public final RectF aA_() {
        if (this.f40633f == null) {
            a(false);
        }
        return this.f40633f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        canvas.drawColor(db.a(db.b(this.f40637j), 255));
        if (!this.f40636i || (rectF = this.f40633f) == null || (paint = this.f40640o) == null || this.f40628a == null) {
            return;
        }
        int i10 = this.f40632e;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        RectF rectF2 = this.f40633f;
        int i11 = this.f40632e;
        canvas.drawRoundRect(rectF2, i11, i11, this.f40628a);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(true);
        b();
    }

    private void d(float f6) {
        this.f40631d = f6;
        this.f40639n = f6 / 1.5f;
        this.f40638k = getWidth() / 2.0f;
        this.f40635h = this.f40631d;
    }

    public final void a(boolean z10) {
        if (!this.f40634g || z10) {
            this.f40634g = true;
            int width = getWidth();
            int height = getHeight();
            float f6 = width;
            float fE = (f6 - (db.e() * 2.0f)) * d();
            float f10 = height;
            float f11 = (f10 - (0.632f * fE)) / 2.0f;
            float f12 = (f6 - fE) / 2.0f;
            d(f12);
            RectF rectF = new RectF();
            this.f40633f = rectF;
            rectF.set(f12, f11, f6 - f12, f10 - f11);
            ag.f40236g = this.f40633f.centerX();
            ag.f40237h = this.f40633f.centerY();
        }
    }

    public final void b() {
        this.f40636i = true;
        postInvalidate();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void e() {
        this.f40632e = Math.round(ay.e(((Integer) db.c(new Object[0], 1487513195, -1487513153, (int) System.currentTimeMillis())).intValue()) * db.d());
        this.f40630c = Math.round(ay.e(db.r()) * db.d());
        d(db.e());
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.f40640o = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f40640o.setAlpha(0);
        this.f40640o.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(2, null);
        Paint paint2 = new Paint(1);
        this.f40628a = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f40628a.setStrokeWidth(Math.round(this.f40630c));
        this.f40628a.setColor(db.d(this.f40637j));
    }

    public final void b(@Nullable Runnable runnable) {
        final p5 p5Var = new p5(this, runnable, 0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f40635h, this.f40639n);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.q5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f42782a.aH_(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b() { // from class: com.facetec.sdk.r5
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                bk.aG_(p5Var, animator);
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
    }

    private float d() {
        if (this.f40629b != a.SMALL_FOR_OVERZOOMED) {
            return 1.0f;
        }
        return 1.0f / (((new Random().nextInt(Math.round(0.050000004f) + 1) / 100.0f) + 0.1f) + 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final Runnable runnable) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f40635h, this.f40638k);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new p2(1, this));
        valueAnimatorOfFloat.addListener(new b() { // from class: com.facetec.sdk.u5
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.f42902a.aC_(runnable, animator);
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
    }
}
