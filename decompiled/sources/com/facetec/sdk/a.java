package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes9.dex */
class a extends AppCompatButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Typeface f40159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f40161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f40162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f40168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ValueAnimator f40169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40170l;
    private FaceTecSDK.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private EnumC0192a f40171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f40172o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f40173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ValueAnimator f40174s;

    /* JADX INFO: renamed from: com.facetec.sdk.a$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f40175d;

        static {
            int[] iArr = new int[EnumC0192a.values().length];
            f40175d = iArr;
            try {
                iArr[EnumC0192a.Guidance.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40175d[EnumC0192a.IDScan.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40175d[EnumC0192a.OCRConfirmation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.a$a, reason: collision with other inner class name */
    public enum EnumC0192a {
        Guidance,
        IDScan,
        OCRConfirmation
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40164f = 200;
        this.f40162d = false;
        this.f40172o = false;
        this.f40170l = false;
        this.f40171n = EnumC0192a.Guidance;
        this.m = FaceTecSDK.c.NORMAL;
        this.f40169k = new ValueAnimator();
        this.f40174s = new ValueAnimator();
        this.f40173r = new ValueAnimator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g_(Animator animator) {
        this.f40162d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h_(ValueAnimator valueAnimator) {
        this.f40160b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i_(Context context, float f6, ValueAnimator valueAnimator) {
        this.f40168j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Drawable drawable = this.f40161c;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        db.c(new Object[]{drawable, Integer.valueOf(iIntValue), Integer.valueOf(Math.round(ay.e(this.f40166h) * f6)), Double.valueOf(ay.e(this.f40167i) * f6)}, -469893939, 469893965, iIntValue);
        setBackground(this.f40161c);
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j_(Context context, ValueAnimator valueAnimator) {
        this.f40163e = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Drawable drawable = this.f40161c;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        db.c(new Object[]{drawable, Integer.valueOf(iIntValue)}, -113975920, 113975965, iIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean k_(View view, MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            b(true, false);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() > getHeight()) {
            b(false, true);
        } else if (motionEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        e(false);
    }

    private void b(boolean z10, boolean z11) {
        if (this.f40172o == z10 || !isEnabled()) {
            return;
        }
        this.f40172o = z10;
        e(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Runnable runnable, View view) {
        b(false, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void a() {
        this.f40171n = EnumC0192a.IDScan;
        this.f40170l = false;
        d();
    }

    public final void c(final Runnable runnable) {
        setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42392p0.d(runnable, view);
            }
        });
    }

    public final void e() {
        this.f40171n = EnumC0192a.OCRConfirmation;
        this.f40170l = false;
        d();
    }

    private void c() {
        this.f40169k.cancel();
        this.f40174s.cancel();
        this.f40173r.cancel();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void d() {
        if (this.f40170l) {
            return;
        }
        ay.b(this);
        this.f40170l = true;
        Context context = getContext();
        this.f40161c = ContextCompat.getDrawable(context, R.drawable.facetec_button_background);
        int i10 = AnonymousClass2.f40175d[this.f40171n.ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            this.f40163e = db.e(context, isEnabled() ? db.X() : db.U());
            this.f40160b = db.e(context, isEnabled() ? db.Q() : db.T());
            this.f40168j = db.e(context, db.W());
            this.f40166h = db.m();
            this.f40167i = db.D();
            this.f40165g = 20;
            this.f40159a = FaceTecSDK.f40106a.f40086i.buttonFont;
        } else if (i10 == 2) {
            this.f40163e = db.e(context, isEnabled() ? db.aa() : db.ad());
            this.f40160b = db.e(context, isEnabled() ? ((Integer) db.c(new Object[0], -75853599, 75853617, (int) System.currentTimeMillis())).intValue() : db.Z());
            this.f40168j = db.e(context, ((Integer) db.c(new Object[0], -312411180, 312411208, (int) System.currentTimeMillis())).intValue());
            this.f40166h = db.o();
            this.f40167i = db.C();
            this.f40165g = 20;
            this.f40159a = FaceTecSDK.f40106a.f40083f.buttonFont;
        } else if (i10 == 3) {
            this.f40163e = db.e(context, isEnabled() ? db.ak() : db.al());
            this.f40160b = db.e(context, isEnabled() ? db.ah() : db.ag());
            this.f40168j = db.e(context, db.ai());
            this.f40166h = ((Integer) db.c(new Object[0], -356874651, 356874688, (int) System.currentTimeMillis())).intValue();
            this.f40167i = ((Integer) db.c(new Object[0], -1292905333, 1292905373, (int) System.currentTimeMillis())).intValue();
            this.f40165g = 20;
            this.f40159a = FaceTecSDK.f40106a.f40084g.buttonFont;
        }
        setTextSize(2, this.f40165g * db.c() * db.d());
        setTypeface(this.f40159a);
        setMaxLines(1);
        e(false);
        setOnTouchListener(new h0(this, i11));
    }

    private void e(boolean z10) {
        int iE;
        int iE2;
        int iE3;
        if (this.f40162d) {
            c();
        }
        this.f40162d = true;
        final Context context = getContext();
        final float fD = db.d();
        int i10 = 0;
        int i11 = z10 ? this.f40164f : 0;
        int i12 = this.f40163e;
        int i13 = this.f40168j;
        int i14 = this.f40160b;
        int i15 = AnonymousClass2.f40175d[this.f40171n.ordinal()];
        if (i15 == 1) {
            iE = db.e(context, db.W());
            if (!isEnabled()) {
                iE2 = db.e(context, db.U());
                iE3 = db.e(context, db.T());
            } else if (this.f40172o) {
                iE2 = db.e(context, ((Integer) db.c(new Object[0], 1586402759, -1586402755, (int) System.currentTimeMillis())).intValue());
                iE3 = db.e(context, db.P());
            } else {
                iE2 = db.e(context, db.X());
                iE3 = db.e(context, db.Q());
            }
        } else if (i15 == 2) {
            iE = db.e(context, ((Integer) db.c(new Object[0], -312411180, 312411208, (int) System.currentTimeMillis())).intValue());
            if (!isEnabled()) {
                iE2 = db.e(context, db.ad());
                iE3 = db.e(context, db.Z());
            } else if (this.f40172o) {
                iE2 = db.e(context, db.ac());
                iE3 = db.e(context, db.Y());
            } else {
                iE2 = db.e(context, db.aa());
                iE3 = db.e(context, ((Integer) db.c(new Object[0], -75853599, 75853617, (int) System.currentTimeMillis())).intValue());
            }
        } else if (i15 != 3) {
            iE = 0;
            iE2 = 0;
            iE3 = 0;
        } else {
            iE = db.e(context, db.ai());
            if (!isEnabled()) {
                iE2 = db.e(context, db.al());
                iE3 = db.e(context, db.ag());
            } else if (this.f40172o) {
                iE2 = db.e(context, db.am());
                iE3 = db.e(context, db.af());
            } else {
                iE2 = db.e(context, db.ak());
                iE3 = db.e(context, db.ah());
            }
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i12), Integer.valueOf(iE2));
        this.f40169k = valueAnimatorOfObject;
        long j10 = i11;
        valueAnimatorOfObject.setDuration(j10);
        this.f40169k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.i0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41866a.j_(context, valueAnimator);
            }
        });
        this.f40169k.start();
        ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i13), Integer.valueOf(iE));
        this.f40174s = valueAnimatorOfObject2;
        valueAnimatorOfObject2.setDuration(j10);
        this.f40174s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.j0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41882a.i_(context, fD, valueAnimator);
            }
        });
        this.f40174s.start();
        ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i14), Integer.valueOf(iE3));
        this.f40173r = valueAnimatorOfObject3;
        valueAnimatorOfObject3.setDuration(j10);
        this.f40173r.addUpdateListener(new k0(this, i10));
        this.f40173r.addListener(new b() { // from class: com.facetec.sdk.l0
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.f42236a.g_(animator);
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
        this.f40173r.start();
    }

    public final void b() {
        FaceTecSDK.c cVar = this.m;
        FaceTecSDK.c cVar2 = FaceTecSDK.f40108c;
        if (cVar == cVar2) {
            return;
        }
        this.m = cVar2;
        this.f40164f = 1000;
        e(true);
    }

    public final void d(boolean z10, boolean z11) {
        if (isEnabled() == z10) {
            if (this.f40162d) {
                return;
            }
            e(false);
        } else {
            super.setEnabled(z10);
            this.f40164f = 200;
            e(z11);
        }
    }
}
