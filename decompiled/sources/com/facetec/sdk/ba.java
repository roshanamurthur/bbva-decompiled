package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
abstract class ba extends aq {
    private Runnable A;
    private bv B;
    private cc.b C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ImageView f40456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected bb f40457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ViewGroup f40458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected RelativeLayout f40459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected a f40460e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected View f40463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Animator f40464i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageView f40466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f40467l;
    private TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f40468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f40469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f40470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f40471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f40472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ViewGroup f40473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f40474t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Animator f40475u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Handler f40477w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AnimatorSet f40479y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f40476v = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f40462g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f40461f = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f40465j = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f40478x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Handler f40480z = new Handler(Looper.getMainLooper());
    private aq.b D = null;
    private final bv.c G = new bv.c() { // from class: com.facetec.sdk.e2
        @Override // com.facetec.sdk.bv.c
        public final void onDarkLightDetected() throws Throwable {
            this.f41451a.B();
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.ba$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40481a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f40482c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f40483e;

        static {
            int[] iArr = new int[FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            f40482c = iArr;
            try {
                iArr[FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40482c[FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40482c[FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40482c[FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ci.values().length];
            f40481a = iArr2;
            try {
                iArr2[ci.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40481a[ci.DARK_AS_POSSIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40481a[ci.BRIGHT_AS_POSSIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[cl.values().length];
            f40483e = iArr3;
            try {
                iArr3[cl.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40483e[cl.DISABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() throws Throwable {
        be beVarG = g();
        if (beVarG != null) {
            be.b(new Object[]{beVarG, Boolean.TRUE}, -2013187710, 2013187720, System.identityHashCode(beVarG));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        p();
        if (g() == null || g().f40522s) {
            return;
        }
        boolean zI = i();
        boolean z10 = this.f40462g || dn.d();
        boolean zIsEnabled = this.f40460e.isEnabled();
        if (zI && z10 && zIsEnabled) {
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        a aVar = this.f40460e;
        if (aVar != null && !aVar.f40162d && !this.f40476v && aVar.isEnabled()) {
            this.f40460e.d(true, false);
        }
        this.f40477w.postDelayed(this.A, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    public /* synthetic */ boolean al_(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40456a.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f) {
            this.f40456a.setAlpha(1.0f);
        } else {
            if (motionEvent.getX() > this.f40456a.getLeft() + this.f40456a.getWidth() + 10 || motionEvent.getY() < 0.0f) {
                this.f40456a.setAlpha(1.0f);
            } else {
                if (motionEvent.getY() > this.f40456a.getTop() + this.f40456a.getHeight() + 10) {
                    this.f40456a.setAlpha(1.0f);
                } else if (motionEvent.getAction() == 1) {
                    this.f40456a.performClick();
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void am_(ImageView imageView, boolean z10) {
        if (imageView == null || z10) {
            return;
        }
        imageView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context, boolean z10) throws Throwable {
        cc ccVarK = k();
        if (ccVarK != null) {
            cc.b bVar = new cc.b() { // from class: com.facetec.sdk.w1
                @Override // com.facetec.sdk.cc.b
                public final void onPreSessionProgress(cp cpVar, ci ciVar, ck ckVar, cl clVar) throws Throwable {
                    this.f42935a.a(cpVar, ciVar, ckVar, clVar);
                }
            };
            this.C = bVar;
            ccVarK.e(bVar);
            if (ccVarK.a(context, z10) || g() == null) {
                return;
            }
            g().b(ak.f40304v);
        }
    }

    private void r() {
        Handler handler = new Handler();
        this.f40477w = handler;
        g1 g1Var = new g1(this, 1);
        this.A = g1Var;
        handler.post(g1Var);
    }

    private aq.b s() {
        return new aq.b(new b2(this, 0));
    }

    private void t() {
        if (g() == null) {
            return;
        }
        cx.d(new d2(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        be beVarG = g();
        this.B = beVarG == null ? null : new bv(beVarG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        if (getActivity() != null) {
            a(true);
            this.f40456a.setEnabled(true);
            this.f40460e.setEnabled(true);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void x() {
        this.f40476v = true;
        this.f40456a.setEnabled(false);
        a(false);
        this.f40460e.d(false, true);
        this.f40464i = ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 0.0f).setDuration(1000L);
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        cc ccVarK = k();
        bv bvVar = this.B;
        if (bvVar == null || ccVarK == null) {
            return;
        }
        bvVar.b(this.G, ccVarK);
    }

    public abstract void a();

    public final void a(boolean z10) {
        ImageView imageView = this.f40469o;
        if (imageView == null || FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            return;
        }
        imageView.setEnabled(z10);
    }

    public final ImageView aj_() {
        if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            return this.f40469o;
        }
        if (FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            return this.f40456a;
        }
        return null;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final void d(final boolean z10, int i10, int i11) {
        final ImageView imageViewAj_ = aj_();
        if (imageViewAj_ == null) {
            return;
        }
        float f6 = z10 ? 1.0f : 0.0f;
        if (i10 == 0 && i11 == 0) {
            imageViewAj_.setAlpha(f6);
            imageViewAj_.setVisibility(z10 ? 0 : 8);
        } else {
            if (z10) {
                imageViewAj_.setVisibility(0);
            }
            imageViewAj_.animate().alpha(f6).setDuration(i10).setStartDelay(i11).setListener(null).withEndAction(new aq.b(new Runnable() { // from class: com.facetec.sdk.z1
                @Override // java.lang.Runnable
                public final void run() {
                    ba.am_(imageViewAj_, z10);
                }
            })).start();
        }
    }

    public abstract void e();

    public abstract boolean i();

    @Override // com.facetec.sdk.aq, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        Animator animator;
        Animator animator2;
        if (!z10 || (animator2 = this.f40475u) == null) {
            return (z10 || (animator = this.f40464i) == null) ? super.onCreateAnimator(i10, z10, i11) : animator;
        }
        return animator2;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.facetec_guidance_fragment, viewGroup, false);
        this.f40472r = viewInflate;
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        q();
    }

    @Override // android.app.Fragment
    public void onPause() {
        Runnable runnable;
        super.onPause();
        this.f40472r.removeCallbacks(null);
        AnimatorSet animatorSet = this.f40479y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Handler handler = this.f40477w;
        if (handler == null || (runnable = this.A) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        az.f40415d = false;
        this.f40463h = view.findViewById(R.id.centerContentView);
        this.f40457b = (bb) view.findViewById(R.id.zoomDialogBackground);
        this.f40473s = (ViewGroup) view.findViewById(R.id.bottomLayout);
        this.f40458c = (ViewGroup) view.findViewById(R.id.zoomDialogForeground);
        this.f40456a = (ImageView) view.findViewById(R.id.backButton);
        this.f40468n = (TextView) view.findViewById(R.id.zoomDialogIconSubtext);
        this.f40466k = (ImageView) view.findViewById(R.id.iconImageView);
        this.f40467l = (TextView) view.findViewById(R.id.zoomDialogHeader);
        this.m = (TextView) view.findViewById(R.id.messageView1);
        this.f40470p = (TextView) view.findViewById(R.id.messageView2);
        this.f40471q = (TextView) view.findViewById(R.id.zoomDialogText3);
        this.f40474t = (TextView) view.findViewById(R.id.zoomDialogText4);
        this.f40460e = (a) view.findViewById(R.id.zoomDialogActionButton);
        this.f40459d = (RelativeLayout) view.findViewById(R.id.guidanceTransitionView);
        be beVarG = g();
        if (k() != null && beVarG != null && beVarG.e() == bh.b.GRANTED && !this.f40461f) {
            e(beVarG, this.f40465j);
        }
        this.f40469o = beVarG.f40518o;
        n();
    }

    @Nullable
    private cc k() {
        be beVarG = g();
        if (beVarG != null) {
            return beVarG.f40571d;
        }
        return null;
    }

    private void m() {
        q();
        cc ccVarK = k();
        if (ccVarK != null) {
            ccVarK.b(this.C);
            this.C = null;
        }
    }

    private void p() {
        this.f40480z.removeCallbacksAndMessages(null);
        this.D = null;
    }

    private void q() {
        bv bvVar = this.B;
        if (bvVar != null) {
            bvVar.a();
            this.B = null;
        }
    }

    public final void e(@NonNull final Context context, final boolean z10) {
        be beVarG = g();
        if (beVarG != null) {
            beVarG.f40525v = be.c.PRE_SESSION_STARTED;
        }
        b(new Runnable() { // from class: com.facetec.sdk.a2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f40183p0.b(context, z10);
            }
        }, 20L);
        r();
        if (FaceTecSDK.f40108c == FaceTecSDK.c.NORMAL) {
            if (k() != null) {
                t();
            }
            b(new f1(this, 1), 185L);
        }
    }

    @Nullable
    public final be g() {
        return (be) getActivity();
    }

    @Nullable
    public final bh h() {
        return (bh) getActivity();
    }

    public final void j() {
        if (FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            ImageView imageView = this.f40456a;
            if (imageView == null) {
                t.c(g(), e.NON_FATAL_ERROR, "backButton is null unexpectedly.");
            } else {
                imageView.setImageResource(db.aH());
            }
        }
        this.f40460e.b();
        b();
    }

    public void l() {
        c();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void n() {
        int i10 = 0;
        this.f40456a.setEnabled(false);
        a(false);
        if (FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.f40456a.setImageResource(db.aH());
        }
        int i11 = AnonymousClass1.f40482c[FaceTecSDK.f40106a.f40090n.f40073e.ordinal()];
        if (i11 == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40456a.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
            this.f40456a.setLayoutParams(layoutParams);
        } else if (i11 == 3 || i11 == 4) {
            this.f40456a.setVisibility(8);
        }
        final float fC = db.c() * db.d();
        db.b(this.f40459d);
        this.f40468n.setTypeface(bl.f40644a);
        float f6 = 20.0f * fC;
        this.f40468n.setTextSize(2, f6);
        db.c(new Object[]{this.f40468n}, 166285300, -166285292, (int) System.currentTimeMillis());
        this.f40468n.setLineSpacing(0.0f, 1.1f);
        this.f40467l.setTypeface(bl.f40645b);
        db.c(new Object[]{this.f40467l}, 166285300, -166285292, (int) System.currentTimeMillis());
        this.f40467l.setTypeface(bl.f40645b);
        this.f40467l.setTextSize(2, 28.0f * fC);
        this.f40467l.setLineSpacing(0.0f, 1.1f);
        this.m.setTypeface(bl.f40644a);
        this.f40470p.setTypeface(bl.f40644a);
        this.f40471q.setTypeface(bl.f40644a);
        this.f40474t.setTypeface(bl.f40644a);
        this.m.setTextSize(2, f6);
        this.f40470p.setTextSize(2, f6);
        this.f40471q.setTextSize(2, f6);
        this.f40474t.setTextSize(2, f6);
        this.m.setLineSpacing(0.0f, 1.1f);
        this.f40470p.setLineSpacing(0.0f, 1.1f);
        this.f40471q.setLineSpacing(0.0f, 1.1f);
        this.f40474t.setLineSpacing(0.0f, 1.1f);
        db.c(new Object[]{this.m}, 166285300, -166285292, (int) System.currentTimeMillis());
        db.c(new Object[]{this.f40470p}, 166285300, -166285292, (int) System.currentTimeMillis());
        db.c(new Object[]{this.f40471q}, 166285300, -166285292, (int) System.currentTimeMillis());
        db.c(new Object[]{this.f40474t}, 166285300, -166285292, (int) System.currentTimeMillis());
        this.f40460e.setEnabled(false);
        this.f40460e.d();
        this.f40460e.setAlpha(0.0f);
        this.f40463h.setAlpha(0.0f);
        d(false, 0, 0);
        this.f40460e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.f2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f41531p0.d(fC);
            }
        });
        ay.a(getActivity());
        this.f40456a.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.g2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f41733p0.a(view);
            }
        });
        this.f40456a.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.h2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f41853p0.al_(view, motionEvent);
            }
        });
        this.f40460e.c(new aq.b(new x1(this, i10)));
        this.f40472r.post(new aq.b(new y1(this, i10)));
    }

    public final void o() {
        this.f40476v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(cp cpVar, ci ciVar, ck ckVar, cl clVar) throws Throwable {
        be beVarG;
        if (this.f40476v || (beVarG = g()) == null) {
            return;
        }
        if (cpVar == cp.TIMEOUT_GO_TO_RETRY) {
            if (beVarG.f40571d != null && cc.k() && i()) {
                m();
                s().run();
                return;
            } else {
                d(clVar);
                m();
                beVarG.g();
                return;
            }
        }
        if (cpVar == cp.DETECTING_LIGHT_MODE) {
            d(clVar);
            int i10 = AnonymousClass1.f40481a[ciVar.ordinal()];
            if (i10 == 2) {
                be.b(new Object[]{beVarG}, 226858727, -226858700, System.identityHashCode(beVarG));
            } else if (i10 == 3) {
                be.b(new Object[]{beVarG, Boolean.FALSE}, -2013187710, 2013187720, System.identityHashCode(beVarG));
            }
            if (clVar == cl.ENABLE) {
                boolean zI = i();
                boolean z10 = this.f40462g;
                boolean zIsEnabled = this.f40460e.isEnabled();
                boolean z11 = this.D != null;
                if (zI && z10 && zIsEnabled && !z11) {
                    p();
                    aq.b bVarS = s();
                    this.D = bVarS;
                    this.f40480z.postDelayed(bVarS, 2000L);
                    return;
                }
                return;
            }
            p();
            return;
        }
        m();
    }

    private void d(cl clVar) {
        if (i()) {
            if (dn.d()) {
                if (this.f40460e.isEnabled()) {
                    return;
                }
                this.f40460e.d(true, true);
                return;
            }
            int i10 = AnonymousClass1.f40483e[clVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2 && this.f40460e.isEnabled() && !this.f40462g) {
                    this.f40460e.d(false, true);
                    return;
                }
                return;
            }
            if (this.f40460e.isEnabled()) {
                return;
            }
            this.f40460e.d(true, true);
        }
    }

    public final void e(@NonNull final Runnable runnable, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f40479y = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40458c, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f));
        this.f40479y.setDuration(i10);
        this.f40479y.addListener(new b() { // from class: com.facetec.sdk.c2
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                runnable.run();
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
        this.f40479y.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(float f6) {
        if (this.f40478x) {
            return;
        }
        this.f40478x = true;
        int iE = (int) (ay.e(50) * f6);
        int iE2 = (int) (ay.e(35) * f6);
        int iE3 = db.e();
        float f10 = iE3 / 2.0f;
        int iRound = Math.round(f10);
        int iRound2 = Math.round(f10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40473s.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, iE3);
        this.f40473s.setLayoutParams(layoutParams);
        this.f40460e.setLayoutParams(new LinearLayout.LayoutParams((int) ((Resources.getSystem().getDisplayMetrics().widthPixels * db.d()) - (iE3 << 1)), iE));
        this.f40460e.requestLayout();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f40456a.getLayoutParams();
        layoutParams2.setMargins(iRound, iRound, 0, 0);
        layoutParams2.setMarginStart(iRound);
        layoutParams2.setMarginEnd(iRound);
        this.f40456a.setLayoutParams(layoutParams2);
        this.f40456a.setPadding(iRound2, iRound2, iRound2, iRound2);
        this.f40456a.getLayoutParams().height = iE2;
        this.f40456a.getLayoutParams().width = iE2;
        this.f40456a.requestLayout();
        this.f40463h.animate().alpha(1.0f).setDuration(300L).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f40456a.setAlpha(1.0f);
        this.f40456a.setEnabled(false);
        a(false);
        this.f40460e.d(false, true);
        e();
    }
}
