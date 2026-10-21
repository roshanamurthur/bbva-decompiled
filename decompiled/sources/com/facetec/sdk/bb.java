package com.facetec.sdk;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes9.dex */
class bb extends cs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Paint f40484c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Matrix f40485k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f40486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f40487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f40489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f40490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f40491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float[] f40492t;

    public bb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40485k = new Matrix();
        this.f40492t = new float[9];
        this.f40489q = 0.0f;
        this.f40490r = 0.0f;
        this.f40491s = false;
        this.f40488p = -1;
        this.f40486n = context;
        post(new i2(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ac_(ValueAnimator valueAnimator) {
        Matrix matrix = this.f40485k;
        if (matrix == null) {
            return;
        }
        matrix.getValues(this.f40492t);
        float f6 = -((valueAnimator.getAnimatedFraction() * this.f40489q) - (this.f40489q - this.f40492t[2]));
        this.f40490r = f6;
        this.f40485k.postTranslate(f6, 0.0f);
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ad_(ValueAnimator valueAnimator) {
        Paint paint = this.f41001a;
        if (paint == null) {
            return;
        }
        paint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ae_(ValueAnimator valueAnimator) {
        Paint paint = this.f40484c;
        if (paint == null) {
            return;
        }
        paint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void af_(ValueAnimator valueAnimator) {
        Drawable drawable = this.f40487o;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ag_(int i10, ValueAnimator valueAnimator) {
        if (this.f40487o == null) {
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f40487o.setColorFilter(db.c(i10, fFloatValue), PorterDuff.Mode.SRC_ATOP);
        double d2 = fFloatValue;
        if (d2 == 0.0d || d2 == 1.0d) {
            if (d2 == 1.0d) {
                db.bF_(this.f40487o, i10);
            }
            this.f40487o.setColorFilter(null);
        }
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ah_(ValueAnimator valueAnimator) {
        Paint paint = this.f41001a;
        if (paint == null) {
            return;
        }
        paint.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ai_(ValueAnimator valueAnimator) {
        Paint paint = this.f40484c;
        if (paint == null) {
            return;
        }
        paint.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i10, int i11) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, i10);
        valueAnimatorOfInt.setDuration(i11);
        valueAnimatorOfInt.addUpdateListener(new p2(0, this));
        valueAnimatorOfInt.start();
    }

    public final void a() {
        postDelayed(new l2(this, 0), 0L);
    }

    public final void b(final int i10, final int i11, int i12) {
        postDelayed(new Runnable() { // from class: com.facetec.sdk.n2
            @Override // java.lang.Runnable
            public final void run() {
                this.f42650p0.c(i10, i11);
            }
        }, i12);
    }

    public final void e() {
        this.f40491s = true;
        postInvalidate();
    }

    @Override // com.facetec.sdk.cs, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.f40487o;
        if (drawable == null) {
            canvas.drawColor(db.a(db.k(this.f40486n), 255));
            return;
        }
        drawable.draw(canvas);
        if (!this.f40491s || this.f41005e == null || this.f41006f == null || this.f41009i == null || this.f40484c == null || this.f41004d == null || this.f41001a == null) {
            return;
        }
        canvas.concat(this.f40485k);
        canvas.drawOval(this.f41005e, this.f41004d);
        canvas.drawOval(this.f41009i, this.f40484c);
        canvas.drawOval(this.f41006f, this.f41001a);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int width = getWidth();
        if (width != this.f40488p) {
            if (this.f40487o == null) {
                Drawable drawableBD_ = db.bD_(this.f40486n);
                this.f40487o = drawableBD_;
                drawableBD_.setAlpha(255);
            }
            this.f40487o.setBounds(0, 0, getWidth(), getHeight());
            if (this.f40488p != -1) {
                c(true);
            }
            this.f40488p = width;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        setLayerType(2, null);
        Paint paint = new Paint(1);
        this.f40484c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f40484c.setColor(db.o(this.f40486n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f40489q, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.o2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f42741a.ac_(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        Paint paint = this.f40484c;
        if (paint == null) {
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(paint.getColor()), Integer.valueOf(db.o(this.f40486n)));
        valueAnimatorOfObject.setDuration(1000L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.r2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f42804a.ai_(valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
        ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f41001a.getColor()), Integer.valueOf(db.n(this.f40486n)));
        valueAnimatorOfObject2.setDuration(1000L);
        valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.s2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f42819a.ah_(valueAnimator);
            }
        });
        valueAnimatorOfObject2.start();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int iK = db.K();
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.t2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f42864a.ag_(iK, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void b() {
        this.f40491s = true;
        float fD = getResources().getDisplayMetrics().widthPixels * db.d();
        this.f40489q = fD;
        this.f40485k.setTranslate(fD, 0.0f);
        post(new m2(this, 0));
    }

    public final void c() {
        postDelayed(new Runnable() { // from class: com.facetec.sdk.q2
            @Override // java.lang.Runnable
            public final void run() {
                this.f42776p0.c(1000);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i10) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, db.b(this.f40486n, FaceTecSDK.f40106a.f40086i.readyScreenOvalFillColor));
        long j10 = i10;
        valueAnimatorOfInt.setDuration(j10);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.j2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41888a.ae_(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, db.b(this.f40486n, FaceTecSDK.f40106a.f40091o.strokeColor));
        valueAnimatorOfInt2.setDuration(j10);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.k2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41969a.ad_(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
    }
}
