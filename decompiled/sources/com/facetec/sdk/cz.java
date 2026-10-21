package com.facetec.sdk;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* JADX INFO: loaded from: classes9.dex */
public final class cz extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Handler f41083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f41084b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f41086d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f41088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f41089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f41090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f41091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f41092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animatable2Compat.AnimationCallback f41093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatedVectorDrawableCompat f41094l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f41095n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f41085c = false;
    private boolean m = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final aq.b f41087e = new aq.b(new i3(this, 6));

    /* JADX INFO: renamed from: com.facetec.sdk.cz$3, reason: invalid class name */
    public class AnonymousClass3 extends Animatable2Compat.AnimationCallback {
        public AnonymousClass3() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            cz.this.b(new l1(this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (cz.this.f41094l == null) {
                return;
            }
            cz.this.f41094l.start();
        }
    }

    public interface e {
        void s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f41090h.setImageDrawable(this.f41094l);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        this.f41093k = anonymousClass3;
        this.f41094l.registerAnimationCallback(anonymousClass3);
        this.f41094l.start();
    }

    public final void d() {
        if (this.f41085c && this.m) {
            b(new y0(this, new aq.b(new u4(this, 7)), 1));
        }
    }

    @Override // com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.facetec_securing_camera_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        this.f41084b = (RelativeLayout) view.findViewById(R.id.mainLayout);
        this.f41089g = (RelativeLayout) view.findViewById(R.id.mainContainer);
        this.f41092j = view.findViewById(R.id.mainBackgroundView);
        this.f41088f = (TextView) view.findViewById(R.id.messageTextView);
        this.f41091i = (ImageView) view.findViewById(R.id.animationBackgroundImageView);
        this.f41090h = (ImageView) view.findViewById(R.id.animationForegroundImageView);
        db.h(this.f41092j);
        this.f41092j.getBackground().setAlpha(db.aS());
        float fC = db.c() * db.d();
        float fFloatValue = ((Float) db.c(new Object[0], -473030507, 473030524, (int) System.currentTimeMillis())).floatValue();
        int iE = db.e();
        int iRound = Math.round(ay.e(40) * fFloatValue * fC);
        this.f41089g.setTranslationY(Math.round(ay.e(-55) * fC));
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.animationFrameLayout);
        frameLayout.getLayoutParams().height = iRound;
        frameLayout.getLayoutParams().width = iRound;
        int iAL = db.aL();
        int iAJ = db.aJ();
        if (iAJ != 0) {
            this.f41094l = ay.a(getActivity(), iAJ);
        }
        if (iAL != 0) {
            this.f41095n = ContextCompat.getDrawable(getActivity(), iAL);
        }
        int i10 = 8;
        if (this.f41094l != null) {
            this.f41091i.setVisibility(8);
            b(new h3(this, i10));
        } else if (this.f41095n != null) {
            this.f41091i.setVisibility(8);
            this.f41090h.setImageDrawable(this.f41095n);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setDuration(FaceTecSDK.f40106a.m.customAnimationImageRotationInterval);
            rotateAnimation.setRepeatCount(-1);
            this.f41090h.startAnimation(rotateAnimation);
        } else {
            ImageView imageView = this.f41091i;
            int iP = db.p(getActivity());
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(iP, mode);
            this.f41090h.setColorFilter(db.s(getActivity()), mode);
            RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation2.setDuration(1000L);
            rotateAnimation2.setInterpolator(new LinearInterpolator());
            rotateAnimation2.setRepeatCount(-1);
            this.f41090h.startAnimation(rotateAnimation2);
        }
        db.bO_(this.f41088f, db.s(getActivity()));
        this.f41088f.setTypeface(FaceTecSDK.f40106a.m.messageFont);
        dd.bv_(this.f41088f, R.string.FaceTec_initializing_camera);
        this.f41088f.setTextSize(2, fC * 16.0f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f41088f.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iE;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iE;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = iE;
        this.f41088f.setLayoutParams(layoutParams);
        t.e(new Object[]{cu.SECURING_CAMERA}, -590439926, 590439930, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(aq.b bVar) {
        b(new s0(this, bVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(aq.b bVar) {
        RelativeLayout relativeLayout = this.f41089g;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (bVar != null) {
            bVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(aq.b bVar) {
        this.f41089g.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).withEndAction(new aq.b(new k1(this, bVar, 3))).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        e eVar = this.f41086d;
        if (eVar != null) {
            eVar.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.m = true;
        d();
    }
}
