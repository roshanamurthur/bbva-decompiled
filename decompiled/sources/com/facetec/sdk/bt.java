package com.facetec.sdk;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewPropertyAnimator;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.mastercard.sonic.StatusCode;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
final class bt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final co f40713b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected AnimatedVectorDrawableCompat f40715d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40717j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f40714c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40716e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40712a = false;

    /* JADX INFO: renamed from: com.facetec.sdk.bt$4, reason: invalid class name */
    public class AnonymousClass4 extends Animatable2Compat.AnimationCallback {
        public AnonymousClass4() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = bt.this.f40715d;
            if (animatedVectorDrawableCompat != null) {
                animatedVectorDrawableCompat.start();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            bt.this.f40713b.b(new c6(this, 0));
        }
    }

    public bt(co coVar, boolean z10) {
        this.f40713b = coVar;
        this.f40717j = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        b(db.a(ca.STARTING, this.f40717j));
        this.f40713b.f40926e.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        c(false);
    }

    private void c(final boolean z10) {
        c();
        this.f40713b.b(new Runnable() { // from class: com.facetec.sdk.a6
            @Override // java.lang.Runnable
            public final void run() {
                this.f40191p0.g(z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(boolean z10) {
        g();
        if (!z10) {
            this.f40713b.a(new y1(this, 1));
            return;
        }
        ViewPropertyAnimator listener = this.f40713b.f40926e.animate().alpha(0.0f).setDuration(800L).setListener(null);
        co coVar = this.f40713b;
        Objects.requireNonNull(coVar);
        listener.withEndAction(new aq.b(new x1(this, 2))).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(boolean z10) {
        int iIntValue;
        int iBa;
        Drawable drawable;
        if (this.f40717j) {
            iIntValue = db.aW();
            iBa = db.aZ();
        } else {
            iIntValue = ((Integer) db.c(new Object[0], 530330153, -530330133, (int) System.currentTimeMillis())).intValue();
            iBa = db.ba();
        }
        Activity activity = this.f40713b.getActivity();
        if (z10 && iBa != 0) {
            this.f40715d = ay.a(activity, iBa);
        } else if (!z10 && iIntValue != 0) {
            this.f40715d = ay.a(activity, iIntValue);
        }
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f40715d;
        if (animatedVectorDrawableCompat != null) {
            this.f40713b.f40922a.setImageDrawable(animatedVectorDrawableCompat);
            this.f40715d.registerAnimationCallback(new AnonymousClass4());
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f40715d;
            if (animatedVectorDrawableCompat2 != null) {
                animatedVectorDrawableCompat2.start();
                return;
            }
            return;
        }
        this.f40713b.f40922a.getLayoutParams().width = (int) (this.f40713b.f40922a.getLayoutParams().height * 0.875f);
        this.f40713b.f40922a.requestLayout();
        if (z10) {
            int iIntValue2 = ((Integer) db.c(new Object[0], -1543971378, 1543971387, (int) System.currentTimeMillis())).intValue();
            if (iIntValue2 == 0) {
                iIntValue2 = R.drawable.facetec_internal_nfc;
            }
            drawable = ContextCompat.getDrawable(activity, iIntValue2);
        } else {
            int iBe = db.be();
            if (iBe == 0) {
                iBe = R.drawable.facetec_internal_nfc;
            }
            drawable = ContextCompat.getDrawable(activity, iBe);
        }
        if (drawable != null) {
            this.f40713b.f40922a.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        if (this.f40712a || this.f40713b.f40927f.getAlpha() != 1.0f || this.f40713b.f40927f.isEnabled()) {
            return;
        }
        a aVar = this.f40713b.f40927f;
        aVar.d(true, aVar.getAlpha() > 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        a aVar = this.f40713b.f40927f;
        aVar.d(false, aVar.getAlpha() > 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f40712a) {
            return;
        }
        int i10 = (this.f40713b.f40927f.getAlpha() == 1.0f && this.f40713b.f40927f.isEnabled()) ? 0 : WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;
        b(false);
        Handler handler = this.f40714c;
        co coVar = this.f40713b;
        Objects.requireNonNull(coVar);
        handler.postDelayed(new aq.b(new r1(this, 1)), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f40713b.f40927f.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a(true);
        d(false);
        ViewPropertyAnimator listener = this.f40713b.f40924c.animate().alpha(0.0f).setDuration(800L).setListener(null);
        co coVar = this.f40713b;
        Objects.requireNonNull(coVar);
        listener.withEndAction(new aq.b(new u4(this, 1))).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        a(true);
        d(false);
        this.f40713b.f40922a.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
        ViewPropertyAnimator listener = this.f40713b.f40926e.animate().alpha(0.0f).setDuration(800L).setListener(null);
        co coVar = this.f40713b;
        Objects.requireNonNull(coVar);
        listener.withEndAction(new aq.b(new h3(this, 2))).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        b(db.a(ca.SCANNING, this.f40717j));
        this.f40713b.f40922a.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
        this.f40713b.f40926e.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
        this.f40713b.b(new s1(this, 2), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        c();
        this.f40713b.bc_().setVisibility(8);
        this.f40713b.f40923b.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() throws Throwable {
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) this.f40713b.getActivity();
        if (faceTecSessionActivity == null) {
            return;
        }
        FaceTecCancelButtonCustomization.ButtonLocation buttonLocation = FaceTecSDK.f40106a.f40090n.f40073e;
        FaceTecCancelButtonCustomization.ButtonLocation buttonLocation2 = FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM;
        if (buttonLocation != buttonLocation2 && FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.f40713b.f40930i.setVisibility(0);
        } else if (FaceTecSDK.f40106a.f40090n.f40073e == buttonLocation2) {
            faceTecSessionActivity.f40518o.setVisibility(0);
            faceTecSessionActivity.f40518o.setAlpha(0.0f);
        }
        if (!dr.c(this.f40713b.getActivity()) || dr.a(faceTecSessionActivity)) {
            b(db.a(ca.STARTING, this.f40717j));
        } else {
            a(true);
            faceTecSessionActivity.I();
            b(db.a(ca.DISABLED, this.f40717j));
        }
        this.f40713b.f40924c.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
        this.f40713b.bc_().animate().alpha(1.0f).setDuration(800L).setListener(null).start();
        d(true);
        this.f40713b.b(new k3(this, 3), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        g();
        this.f40713b.f40922a.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
        ViewPropertyAnimator listener = this.f40713b.f40926e.animate().alpha(0.0f).setDuration(800L).setListener(null);
        co coVar = this.f40713b;
        Objects.requireNonNull(coVar);
        listener.withEndAction(new aq.b(new b6(this, 0))).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        b(db.a(ca.WEAK_CONNECTION, this.f40717j));
        this.f40713b.f40922a.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
        this.f40713b.f40926e.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
        d(true);
        this.f40713b.b(new d1(this, 4), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        c(false);
    }

    public final void a() {
        this.f40713b.b(new i3(this, 1));
    }

    public final void b() {
        this.f40713b.b(new b1(this, 2));
    }

    public final void d() {
        this.f40713b.b(new l2(this, 1));
    }

    public final void e(final boolean z10) {
        if (this.f40713b.getActivity() == null) {
            return;
        }
        this.f40713b.b(new Runnable() { // from class: com.facetec.sdk.z5
            @Override // java.lang.Runnable
            public final void run() {
                this.f43020p0.f(z10);
            }
        });
    }

    private void a(boolean z10) {
        this.f40716e = z10;
        if (z10) {
            e();
            b(true);
            this.f40713b.b(new g3(this, 1));
        }
    }

    private void b(String str) {
        if (this.f40713b.getActivity() == null) {
            return;
        }
        this.f40713b.b(new a1(this, str, 1));
    }

    private void d(boolean z10) {
        float f6 = z10 ? 1.0f : 0.0f;
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) this.f40713b.getActivity();
        if (FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            this.f40713b.f40930i.animate().alpha(f6).setDuration(800L).setListener(null).start();
            this.f40713b.f40930i.setEnabled(z10);
        } else {
            faceTecSessionActivity.f40518o.animate().alpha(f6).setDuration(800L).setListener(null).start();
            faceTecSessionActivity.f40518o.setEnabled(z10);
        }
    }

    private void c() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f40715d;
        if (animatedVectorDrawableCompat != null) {
            animatedVectorDrawableCompat.stop();
            this.f40715d.clearAnimationCallbacks();
            this.f40715d = null;
        }
    }

    private void e() {
        Handler handler = this.f40714c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void b(boolean z10) {
        this.f40712a = z10;
        if (z10) {
            e();
            this.f40713b.b(new m2(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f40716e) {
            return;
        }
        ViewPropertyAnimator listener = this.f40713b.f40927f.animate().alpha(1.0f).setDuration(this.f40713b.f40927f.getAlpha() == 1.0f ? 0 : StatusCode.SUCCESS).setListener(null);
        co coVar = this.f40713b;
        Objects.requireNonNull(coVar);
        listener.withEndAction(new aq.b(new t0(this, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        this.f40713b.f40926e.setText(str);
    }

    private void g() {
        int i10 = this.f40713b.f40927f.getAlpha() == 1.0f ? 0 : 6000;
        e();
        a(false);
        b(false);
        Handler handler = this.f40714c;
        co coVar = this.f40713b;
        Objects.requireNonNull(coVar);
        handler.postDelayed(new aq.b(new u2(this, 1)), i10);
    }
}
