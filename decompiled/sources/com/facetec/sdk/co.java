package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.material3.TooltipKt;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.noknok.android.client.asm.authenticator.KSUtils;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class co extends aq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int F;
    private static int K;
    private static int L;
    private static byte[] M;
    private static short[] N;
    private Animatable2Compat.AnimationCallback E;
    private AnimatedVectorDrawableCompat G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ImageView f40922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    RelativeLayout f40923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RelativeLayout f40924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    View f40925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    TextView f40926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    a f40927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f40928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f40929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ImageView f40930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected AnimatedVectorDrawableCompat f40931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ProgressBar f40932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RelativeLayout f40933l;
    private ImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f40934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f40935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LinearLayout f40936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RelativeLayout f40937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageView f40938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ObjectAnimator f40939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f40940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f40941u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40943w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f40945y = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f40944x = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f40942v = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f40946z = false;
    private long A = -1;
    private e B = e.UPLOAD_STARTED;
    private c C = c.DEFAULT;
    private final Handler D = new Handler(Looper.getMainLooper());
    private final aq.b H = new aq.b(new f5(this, 4));
    private ViewTreeObserver.OnGlobalLayoutListener I = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.co.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (co.this.f40943w) {
                return;
            }
            co.b(co.this);
            co.this.d();
            float fC = db.c();
            float fD = db.d();
            int iE = db.e();
            int iE2 = (int) (ay.e(35) * fD * fC);
            float f6 = iE / 2.0f;
            int iRound = Math.round(f6);
            int iRound2 = Math.round(f6);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) co.this.f40930i.getLayoutParams();
            layoutParams.setMargins(iRound, iRound, 0, 0);
            layoutParams.setMarginStart(iRound);
            layoutParams.setMarginEnd(iRound);
            co.this.f40930i.setLayoutParams(layoutParams);
            co.this.f40930i.setPadding(iRound2, iRound2, iRound2, iRound2);
            co.this.f40930i.getLayoutParams().height = iE2;
            co.this.f40930i.getLayoutParams().width = iE2;
            co.this.f40930i.requestLayout();
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.co$2, reason: invalid class name */
    public class AnonymousClass2 extends Animatable2Compat.AnimationCallback {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = co.this.f40931j;
            if (animatedVectorDrawableCompat == null) {
                return;
            }
            animatedVectorDrawableCompat.start();
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            co.this.b(new f1(this, 4));
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.co$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f40950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f40951c;

        static {
            int[] iArr = new int[c.values().length];
            f40949a = iArr;
            try {
                iArr[c.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40949a[c.FRONT_SIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40949a[c.BACK_SIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40949a[c.USER_CONFIRMED_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40949a[c.NFC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40949a[c.SKIPPED_NFC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[e.values().length];
            f40951c = iArr2;
            try {
                iArr2[e.UPLOAD_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40951c[e.STILL_UPLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40951c[e.UPLOAD_COMPLETE_AWAITING_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40951c[e.UPLOAD_COMPLETE_AWAITING_PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            f40950b = iArr3;
            try {
                iArr3[FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40950b[FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40950b[FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40950b[FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public enum c {
        DEFAULT,
        FRONT_SIDE,
        BACK_SIDE,
        USER_CONFIRMED_INFO,
        NFC,
        SKIPPED_NFC
    }

    public enum e {
        UPLOAD_STARTED,
        STILL_UPLOADING,
        UPLOAD_COMPLETE_AWAITING_RESPONSE,
        UPLOAD_COMPLETE_AWAITING_PROCESSING
    }

    static {
        init$0();
        F = -474229580;
        L = 315160293;
        K = -1011136515;
        M = new byte[]{107, 98, -101, 107, -112, 76, 79, -83, -109, 103, -97, 84, -89, KSUtils.PLAIN_BUFFER, 127, -99, 99, 81, -83, -68, 76, -88, -92, 90};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void O(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.facetec.sdk.co.$$a
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r8 = r8 * 2
            int r8 = 70 - r8
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L36
        L1b:
            r3 = r2
        L1c:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r6 = -r6
            int r8 = r8 + 1
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.co.O(byte, byte, int, java.lang.Object[]):void");
    }

    @NonNull
    public static co a(boolean z10, c cVar) {
        co coVar = new co();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isIDScan", z10);
        bundle.putSerializable("uploadType", cVar);
        coVar.setArguments(bundle);
        return coVar;
    }

    public static /* synthetic */ boolean b(co coVar) {
        coVar.f40943w = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bd_(Runnable runnable, Animator animator) {
        b(new y0(this, runnable, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void be_(aq.b bVar, Animator animator) {
        Animatable2Compat.AnimationCallback animationCallback;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f40931j;
        if (animatedVectorDrawableCompat != null && (animationCallback = this.E) != null) {
            animatedVectorDrawableCompat.unregisterAnimationCallback(animationCallback);
            this.f40931j.stop();
            this.f40931j = null;
            this.E = null;
        }
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.G;
        if (animatedVectorDrawableCompat2 != null) {
            animatedVectorDrawableCompat2.stop();
            this.G = null;
        }
        this.f40934n.animate().alpha(1.0f).setDuration(TooltipKt.TooltipDuration).setStartDelay(0L).setListener(null).start();
        aq.a(bVar, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bf_(aq.b bVar, Animator animator) {
        this.f40934n.animate().alpha(1.0f).setDuration(TooltipKt.TooltipDuration).setStartDelay(0L).setListener(null).start();
        aq.a(bVar, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void bg_(aq.b bVar, Animator animator) {
        if (bVar != null) {
            bVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    public /* synthetic */ boolean bh_(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40936p.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f) {
            this.f40936p.setAlpha(1.0f);
        } else {
            if (motionEvent.getX() > this.f40936p.getLeft() + this.f40936p.getWidth() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > this.f40936p.getHeight() + 10) {
                this.f40936p.setAlpha(1.0f);
            } else if (motionEvent.getAction() == 1) {
                this.f40936p.performClick();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    public /* synthetic */ boolean bi_(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40930i.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f) {
            this.f40930i.setAlpha(1.0f);
        } else {
            if (motionEvent.getX() > this.f40930i.getLeft() + this.f40930i.getWidth() + 10 || motionEvent.getY() < 0.0f) {
                this.f40930i.setAlpha(1.0f);
            } else {
                if (motionEvent.getY() > this.f40930i.getTop() + this.f40930i.getHeight() + 10) {
                    this.f40930i.setAlpha(1.0f);
                } else if (motionEvent.getAction() == 1) {
                    this.f40930i.setAlpha(1.0f);
                    this.f40930i.performClick();
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        ((FaceTecSessionActivity) getActivity()).o();
    }

    public static void init$0() {
        $$a = new byte[]{37, 15, -118, 86};
        $$b = 239;
    }

    public final RelativeLayout bc_() {
        return this.f40937q;
    }

    @Override // com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Handler handler = new Handler();
        this.f40941u = handler;
        handler.postDelayed(this.H, 600000L);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.facetec_results_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        d();
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        this.f40945y = getArguments().getBoolean("isIDScan");
        this.C = (c) getArguments().get("uploadType");
        this.B = e.UPLOAD_STARTED;
        this.f40929h = (ImageView) view.findViewById(R.id.activityIndicatorImageView);
        this.f40932k = (ProgressBar) view.findViewById(R.id.uploadProgressBar);
        this.f40928g = (TextView) view.findViewById(R.id.progressTextView);
        this.f40934n = (TextView) view.findViewById(R.id.resultTextView);
        this.f40925d = view.findViewById(R.id.zoomResultBackground);
        this.f40937q = (RelativeLayout) view.findViewById(R.id.progressBarLayout);
        this.f40923b = (RelativeLayout) view.findViewById(R.id.zoomResultLayout);
        this.f40933l = (RelativeLayout) view.findViewById(R.id.zoomResultContainer);
        this.f40935o = (ImageView) view.findViewById(R.id.resultAnimationBackground);
        this.m = (ImageView) view.findViewById(R.id.resultAnimationForeground);
        this.f40936p = (LinearLayout) view.findViewById(R.id.devModeTagLayout);
        this.f40940t = (TextView) view.findViewById(R.id.devModeTagTextView);
        this.f40938r = (ImageView) view.findViewById(R.id.devModeTagImageView);
        this.f40922a = (ImageView) view.findViewById(R.id.nfcIcon);
        this.f40926e = (TextView) view.findViewById(R.id.nfcStatus);
        this.f40924c = (RelativeLayout) view.findViewById(R.id.nfcLayout);
        ImageView imageView = (ImageView) view.findViewById(R.id.nfcBackButton);
        this.f40930i = imageView;
        int i10 = 1;
        imageView.setEnabled(true);
        if (FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.f40930i.setImageDrawable(ContextCompat.getDrawable(getActivity(), db.aH()));
        }
        int i11 = AnonymousClass5.f40950b[FaceTecSDK.f40106a.f40090n.f40073e.ordinal()];
        if (i11 == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40930i.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
            this.f40930i.setLayoutParams(layoutParams);
        } else if (i11 == 3 || i11 == 4) {
            this.f40930i.setVisibility(8);
        }
        this.f40930i.getViewTreeObserver().addOnGlobalLayoutListener(this.I);
        this.f40930i.setOnClickListener(new x2(this, i10));
        this.f40930i.setOnTouchListener(new y2(this, i10));
        if (bg.d() && FaceTecSDK.f40106a.f40082e && !getActivity().getPackageName().contains("com.facetec.zoomlogin") && !getActivity().getPackageName().contains("om.facetec.photoidmatchtester")) {
            float fC = db.c() * db.d();
            this.f40940t.setTypeface(FaceTecSDK.f40106a.f40087j.messageFont);
            this.f40940t.setTextSize(2, 14.0f * fC);
            db.bG_(this.f40940t);
            this.f40938r.setColorFilter(db.J(), PorterDuff.Mode.SRC_IN);
            this.f40938r.getLayoutParams().height = (int) (ay.e(18) * fC);
            this.f40938r.getLayoutParams().width = (int) (ay.e(18) * fC);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f40936p.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = db.e();
            ((ViewGroup.LayoutParams) layoutParams2).height = (int) (ay.e(26) * fC);
            this.f40936p.setLayoutParams(layoutParams2);
            this.f40936p.requestLayout();
            this.f40936p.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.c7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f40788p0.b(view2);
                }
            });
            this.f40936p.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.d7
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f41142p0.bh_(view2, motionEvent);
                }
            });
            this.f40936p.setVisibility(0);
        }
        db.h(this.f40925d);
        if (!this.f40945y) {
            this.f40925d.getBackground().setAlpha(db.aS());
        }
        float fC2 = db.c() * db.d();
        float fFloatValue = ((Float) db.c(new Object[0], -473030507, 473030524, (int) System.currentTimeMillis())).floatValue();
        int iE = db.e();
        int iRound = Math.round(ay.e(80) * fFloatValue * fC2);
        int iRound2 = Math.round(ay.e(130) * fC2);
        int iRound3 = Math.round(ay.e(-55) * fC2);
        int iRound4 = Math.round(ay.e(6) * fC2);
        int iRound5 = Math.round(ay.e(50) * fC2);
        a aVar = (a) view.findViewById(R.id.nfcSkipButton);
        this.f40927f = aVar;
        aVar.a();
        this.f40927f.setText(dd.c(R.string.FaceTec_action_skip_nfc));
        this.f40927f.setEnabled(false);
        int i12 = 7;
        this.f40927f.c(new aq.b(new l2(this, i12)));
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f40927f.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams3).height = iRound5;
        layoutParams3.setMargins(iE, 0, iE, iE);
        this.f40927f.setLayoutParams(layoutParams3);
        this.f40933l.setTranslationY(iRound3);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.resultFrame);
        frameLayout.getLayoutParams().height = iRound;
        frameLayout.getLayoutParams().width = iRound;
        ImageView imageView2 = this.f40935o;
        int iIntValue = ((Integer) db.c(new Object[]{getActivity()}, 1338845285, -1338845254, (int) System.currentTimeMillis())).intValue();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(iIntValue, mode);
        this.m.setColorFilter(db.m(getActivity()), mode);
        this.f40922a.getLayoutParams().height = iRound2;
        LayerDrawable layerDrawable = (LayerDrawable) getResources().getDrawable(R.drawable.facetec_progress_bar);
        layerDrawable.mutate();
        Drawable drawable = layerDrawable.getDrawable(0);
        LayerDrawable layerDrawable2 = (LayerDrawable) ((ScaleDrawable) layerDrawable.getDrawable(1)).getDrawable();
        Drawable drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progressFill);
        Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.progressGlow);
        float f6 = iRound4 / 2.0f;
        ((GradientDrawable) drawable).setCornerRadius(f6);
        ((GradientDrawable) drawableFindDrawableByLayerId).setCornerRadius(f6);
        ((GradientDrawable) drawableFindDrawableByLayerId2).setCornerRadius(f6);
        db.bH_(this.f40932k, drawable);
        db.bI_(this.f40932k, drawableFindDrawableByLayerId, drawableFindDrawableByLayerId2);
        this.f40932k.setProgressDrawable(layerDrawable);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f40932k.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams4).height = iRound4;
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = iE;
        this.f40932k.setLayoutParams(layoutParams4);
        this.f40932k.setVisibility(0);
        db.bG_(this.f40928g);
        db.bG_(this.f40934n);
        db.bG_(this.f40926e);
        this.f40928g.setTypeface(FaceTecSDK.f40106a.f40087j.messageFont);
        this.f40934n.setTypeface(FaceTecSDK.f40106a.f40087j.messageFont);
        this.f40926e.setTypeface(FaceTecSDK.f40106a.f40087j.messageFont);
        if (this.f40945y) {
            this.f40928g.setText(d(this.B, this.C));
        } else {
            dd.bv_(this.f40928g, R.string.FaceTec_result_facescan_upload_message);
            this.f40934n.setImportantForAccessibility(1);
            this.f40928g.setImportantForAccessibility(1);
            TextView textView = this.f40928g;
            textView.setContentDescription(textView.getText().toString());
            this.f40928g.performAccessibilityAction(64, null);
            this.f40928g.sendAccessibilityEvent(8);
        }
        float f10 = fC2 * 24.0f;
        this.f40928g.setTextSize(2, f10);
        this.f40926e.setTextSize(2, f10);
        this.f40934n.setTextSize(2, f10);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f40928g.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = iE;
        ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = iE;
        ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = iE;
        this.f40928g.setLayoutParams(layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.f40934n.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = iE;
        ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = iE;
        ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = iE;
        this.f40934n.setLayoutParams(layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) this.f40926e.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = iE;
        ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = iE;
        ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = iE;
        this.f40926e.setLayoutParams(layoutParams7);
        ViewGroup.LayoutParams layoutParams8 = this.f40929h.getLayoutParams();
        layoutParams8.height = iRound;
        layoutParams8.width = iRound;
        this.f40929h.setLayoutParams(layoutParams8);
        int iAO = db.aO();
        int iBb = db.bb();
        if (iBb != 0) {
            this.f40931j = ay.a(getActivity(), iBb);
        }
        if (this.f40931j != null) {
            b(new m2(this, i12));
            this.f40929h.setVisibility(0);
        } else if (iAO != 0) {
            this.f40929h.setImageResource(iAO);
            this.f40929h.clearAnimation();
            this.f40929h.setVisibility(0);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setDuration(FaceTecSDK.f40106a.f40087j.customActivityIndicatorRotationInterval);
            rotateAnimation.setRepeatCount(-1);
            this.f40929h.startAnimation(rotateAnimation);
        } else {
            b(new r1(this, 6));
        }
        boolean z10 = this.f40945y && FaceTecCustomization.f40077s != null;
        this.f40944x = z10;
        if (z10) {
            this.D.post(new aq.b(new s1(this, i12)));
        }
        if (FaceTecSDK.f40106a.f40087j.showUploadProgressBar) {
            this.f40932k.setVisibility(0);
            b(new g3(this, 5));
        } else {
            this.f40932k.setVisibility(4);
        }
        b(new h3(this, i12));
        t.e(new Object[]{cu.RESULT_UPLOAD}, -590439926, 590439930, (int) System.currentTimeMillis());
    }

    private static void J(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        long j10;
        gy gyVar = new gy();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(L)};
            int i13 = 0;
            Map map = bp.f40694x;
            Object method = map.get(-131541546);
            char c10 = '0';
            if (method == null) {
                Class cls = (Class) bp.a(24 - Color.alpha(0), Gravity.getAbsoluteGravity(0, 0) + 1624, (char) (AndroidCharacter.getMirror('0') - '0'));
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                O(b11, b12, (byte) (b12 + 1), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-131541546, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            int i14 = iIntValue == -1 ? 1 : 0;
            if (i14 == 0) {
                j10 = 8685730852850169510L;
            } else {
                byte[] bArr = M;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i15 = 0;
                    while (i15 < length) {
                        Object[] objArr4 = new Object[1];
                        objArr4[i13] = Integer.valueOf(bArr[i15]);
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1703225588);
                        if (method2 == null) {
                            Class cls3 = (Class) bp.a(Process.getGidForName("") + 25, 1167 - View.MeasureSpec.makeMeasureSpec(i13, i13), (char) (TextUtils.lastIndexOf("", c10) + 45989));
                            byte b13 = (byte) i13;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            O(b13, b14, (byte) (b14 + 2), objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], Integer.TYPE);
                            map2.put(1703225588, method2);
                        }
                        bArr2[i15] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i15++;
                        bArr = bArr;
                        i13 = 0;
                        c10 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = M;
                    Object[] objArr6 = {Integer.valueOf(i11), Integer.valueOf(F)};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-131541546);
                    if (method3 == null) {
                        Class cls4 = (Class) bp.a(MotionEvent.axisFromString("") + 25, 1624 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Color.red(0));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        O(b15, b16, (byte) (b16 + 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str2, cls5, cls5);
                        map3.put(-131541546, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr6)).intValue()]) ^ 8685730852850169510L)) + ((int) (((long) L) ^ 8685730852850169510L)));
                    j10 = 8685730852850169510L;
                } else {
                    j10 = 8685730852850169510L;
                    iIntValue = (short) (((short) (((long) N[i11 + ((int) (((long) F) ^ 8685730852850169510L))]) ^ 8685730852850169510L)) + ((int) (((long) L) ^ 8685730852850169510L)));
                }
            }
            if (iIntValue > 0) {
                gyVar.f41841b = ((i11 + iIntValue) - 2) + ((int) (((long) F) ^ j10)) + i14;
                Object[] objArr8 = {gyVar, Integer.valueOf(i12), Integer.valueOf(K), sb2};
                Map map4 = bp.f40694x;
                Object method4 = map4.get(-1555392445);
                if (method4 == null) {
                    Class cls6 = (Class) bp.a(23 - (Process.myPid() >> 22), 1483 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1));
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr9 = new Object[1];
                    O(b17, b18, b18, objArr9);
                    String str3 = (String) objArr9[0];
                    Class<?> cls7 = Integer.TYPE;
                    method4 = cls6.getMethod(str3, Object.class, cls7, cls7, Object.class);
                    map4.put(-1555392445, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr8)).append(gyVar.f41843e);
                gyVar.f41842d = gyVar.f41843e;
                byte[] bArr4 = M;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 8685730852850169510L);
                    }
                    bArr4 = bArr5;
                }
                boolean z10 = bArr4 != null;
                gyVar.f41840a = 1;
                while (gyVar.f41840a < iIntValue) {
                    if (z10) {
                        byte[] bArr6 = M;
                        int i17 = gyVar.f41841b;
                        gyVar.f41841b = i17 - 1;
                        gyVar.f41843e = (char) (gyVar.f41842d + (((byte) (((byte) (((long) bArr6[i17]) ^ 8685730852850169510L)) + s4)) ^ b10));
                    } else {
                        short[] sArr = N;
                        int i18 = gyVar.f41841b;
                        gyVar.f41841b = i18 - 1;
                        gyVar.f41843e = (char) (gyVar.f41842d + (((short) (((short) (((long) sArr[i18]) ^ 8685730852850169510L)) + s4)) ^ b10));
                    }
                    sb2.append(gyVar.f41843e);
                    gyVar.f41842d = gyVar.f41843e;
                    gyVar.f41840a++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f40936p.setEnabled(false);
        this.f40936p.setClickable(false);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://dev.facetec.com/removing-development-mode-watermark")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final Runnable runnable) {
        this.f40936p.animate().alpha(0.0f).setDuration(800L).setStartDelay(0L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
        RelativeLayout relativeLayout = this.f40933l;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", relativeLayout.getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.addListener(new b() { // from class: com.facetec.sdk.v6
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.f42925a.bd_(runnable, animator);
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
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() throws Throwable {
        this.B = e.UPLOAD_COMPLETE_AWAITING_RESPONSE;
        a(new aq.b(new t0(this, 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        if (this.f40946z) {
            return;
        }
        this.D.removeCallbacksAndMessages(null);
        this.D.postDelayed(new aq.b(new d2(this, 4)), 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() throws Throwable {
        if (this.D == null || this.f40946z) {
            return;
        }
        int i10 = 1;
        c(true);
        if (this.f40932k != null && FaceTecSDK.f40106a.f40087j.showUploadProgressBar) {
            b(new h4(this, null, i10));
        }
        this.D.postDelayed(new aq.b(new f1(this, 7)), 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() throws Throwable {
        this.D.removeCallbacksAndMessages(null);
        if (this.f40946z) {
            return;
        }
        this.B = e.UPLOAD_COMPLETE_AWAITING_PROCESSING;
        c(true);
        this.D.postDelayed(new aq.b(new i3(this, 5)), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() throws Throwable {
        if (this.f40946z) {
            return;
        }
        this.D.removeCallbacksAndMessages(null);
        this.B = e.STILL_UPLOADING;
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        if (this.f40946z) {
            return;
        }
        this.D.removeCallbacksAndMessages(null);
        c(new aq.b(new b1(this, 8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        ProgressBar progressBar = this.f40932k;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), 3000);
        this.f40939s = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(3000L);
        this.f40939s.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f40933l.animate().alpha(1.0f).setDuration(800L).setStartDelay(0L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
        this.f40936p.animate().alpha(1.0f).setDuration(800L).setStartDelay(0L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f40928g.setText(d(this.B, this.C));
        this.f40928g.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() throws Throwable {
        if (this.f40946z) {
            return;
        }
        this.D.removeCallbacksAndMessages(null);
        this.B = e.UPLOAD_STARTED;
        c(false);
        this.D.postDelayed(new aq.b(new b6(this, 4)), this.f40945y ? 8000L : 6000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        bh bhVar = (bh) getActivity();
        if (bhVar != null) {
            bhVar.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() throws Throwable {
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) getActivity();
        if (faceTecSessionActivity != null) {
            faceTecSessionActivity.F();
        }
    }

    public final void e(String str) throws Throwable {
        if (this.f40928g == null || this.f40944x) {
            return;
        }
        a(new aq.b(new h4(this, str, 2)));
    }

    private long c() throws Throwable {
        if (this.A == -1) {
            return 0L;
        }
        try {
            Object[] objArr = new Object[1];
            J(Gravity.getAbsoluteGravity(0, 0) - 68, (byte) ((Process.myTid() >> 22) - 52), (short) View.MeasureSpec.getSize(0), 244112879 + TextUtils.lastIndexOf("", '0', 0), 780947216 + ExpandableListView.getPackedPositionChild(0L), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            J((-68) - TextUtils.getOffsetBefore("", 0), (byte) (15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) + 244112894, 780947219 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            long jLongValue = (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() / AnimationKt.MillisToNanos) - this.A;
            if (jLongValue < 1000) {
                return 1000 - jLongValue;
            }
            return 0L;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final void d() {
        ImageView imageView = this.f40930i;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this.I);
        }
        this.I = null;
    }

    public final void e(boolean z10, @Nullable String str, @NonNull Runnable runnable) throws Throwable {
        d(z10, false, str, runnable);
    }

    private void c(boolean z10) throws Throwable {
        this.D.removeCallbacksAndMessages(null);
        a(new aq.b(new n3(this, z10, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.G = ay.a(getActivity(), R.drawable.facetec_animated_activity_indicator_vector_drawable);
        this.f40929h.setColorFilter(db.R(), PorterDuff.Mode.SRC_IN);
        this.f40929h.setImageDrawable(this.G);
        this.G.start();
        this.f40929h.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Runnable runnable) {
        RelativeLayout relativeLayout = this.f40933l;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) throws Throwable {
        if (this.f40946z) {
            return;
        }
        ProgressBar progressBar = this.f40932k;
        if (progressBar == null || progressBar.getProgress() / this.f40932k.getMax() < 0.9d) {
            this.f40928g.setText(str);
            try {
                Object[] objArr = new Object[1];
                J((-68) - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((-52) - Gravity.getAbsoluteGravity(0, 0)), (short) (Process.myTid() >> 22), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 244112877, Color.blue(0) + 780947215, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                J((-68) - View.MeasureSpec.getMode(0), (byte) (15 - KeyEvent.keyCodeFromString("")), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), View.getDefaultSize(0, 0) + 244112894, 780947218 - TextUtils.lastIndexOf("", '0'), objArr2);
                this.A = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() / AnimationKt.MillisToNanos;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public final void b(float f6) {
        ProgressBar progressBar = this.f40932k;
        if (progressBar == null) {
            return;
        }
        float progress = progressBar.getProgress() / this.f40932k.getMax();
        if (f6 > 1.0f || progress >= f6) {
            return;
        }
        if (f6 == 1.0f && !this.f40942v) {
            this.f40942v = true;
            if (this.f40944x) {
                this.D.post(new aq.b(new u4(this, 6)));
            }
        }
        float f10 = (f6 * 10000.0f) - 1000.0f;
        if (f10 > this.f40932k.getProgress()) {
            ObjectAnimator objectAnimator = this.f40939s;
            if (objectAnimator != null) {
                objectAnimator.end();
                this.f40939s = null;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                this.f40932k.setProgress(Math.round(f10), true);
            } else {
                this.f40932k.setProgress(Math.round(f10));
            }
        }
        this.f40941u.removeCallbacks(this.H);
        this.f40941u.postDelayed(this.H, 600000L);
    }

    private void c(@Nullable aq.b bVar) {
        ProgressBar progressBar = this.f40932k;
        if (progressBar != null && progressBar.getProgress() != this.f40932k.getMax() && FaceTecSDK.f40106a.f40087j.showUploadProgressBar) {
            b(new f3(this, bVar, 1));
        } else {
            bVar.run();
        }
    }

    private String d(e eVar, c cVar) {
        if (!this.f40945y) {
            return dd.c(R.string.FaceTec_result_facescan_upload_message);
        }
        if (FaceTecCustomization.f40077s == null) {
            return dd.c(R.string.FaceTec_result_idscan_upload_message);
        }
        dj djVar = dj.UNKNOWN;
        int i10 = AnonymousClass5.f40949a[cVar.ordinal()];
        if (i10 == 2) {
            int i11 = AnonymousClass5.f40951c[eVar.ordinal()];
            if (i11 == 1) {
                djVar = dj.IDSCAN_FRONT_SIDE_UPLOAD_STARTED;
            } else if (i11 == 2) {
                djVar = dj.IDSCAN_FRONT_SIDE_STILL_UPLOADING;
            } else if (i11 == 3) {
                djVar = dj.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i11 == 4) {
                djVar = dj.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i10 == 3) {
            int i12 = AnonymousClass5.f40951c[eVar.ordinal()];
            if (i12 == 1) {
                djVar = dj.IDSCAN_BACK_SIDE_UPLOAD_STARTED;
            } else if (i12 == 2) {
                djVar = dj.IDSCAN_BACK_SIDE_STILL_UPLOADING;
            } else if (i12 == 3) {
                djVar = dj.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i12 == 4) {
                djVar = dj.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i10 == 4) {
            int i13 = AnonymousClass5.f40951c[eVar.ordinal()];
            if (i13 == 1) {
                djVar = dj.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED;
            } else if (i13 == 2) {
                djVar = dj.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING;
            } else if (i13 == 3) {
                djVar = dj.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i13 == 4) {
                djVar = dj.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i10 == 5) {
            int i14 = AnonymousClass5.f40951c[eVar.ordinal()];
            if (i14 == 1) {
                djVar = dj.NFC_UPLOAD_STARTED;
            } else if (i14 == 2) {
                djVar = dj.NFC_STILL_UPLOADING;
            } else if (i14 == 3) {
                djVar = dj.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i14 == 4) {
                djVar = dj.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i10 == 6) {
            int i15 = AnonymousClass5.f40951c[eVar.ordinal()];
            if (i15 == 1) {
                djVar = dj.SKIPPED_NFC_UPLOAD_STARTED;
            } else if (i15 == 2) {
                djVar = dj.SKIPPED_NFC_STILL_UPLOADING;
            } else if (i15 == 3) {
                djVar = dj.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i15 == 4) {
                djVar = dj.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        }
        String strD = db.d(djVar);
        if (strD != null) {
            return strD;
        }
        if (eVar == e.UPLOAD_COMPLETE_AWAITING_PROCESSING) {
            return d(e.UPLOAD_COMPLETE_AWAITING_RESPONSE, cVar);
        }
        if (eVar != e.UPLOAD_COMPLETE_AWAITING_RESPONSE && eVar != e.STILL_UPLOADING) {
            if (this.f40945y) {
                if (cVar == c.NFC) {
                    return dd.c(R.string.FaceTec_result_nfc_upload_message);
                }
                return dd.c(R.string.FaceTec_result_idscan_upload_message);
            }
            return dd.c(R.string.FaceTec_result_facescan_upload_message);
        }
        return d(e.UPLOAD_STARTED, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.D.removeCallbacksAndMessages(null);
        this.f40946z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(boolean z10, Runnable runnable, boolean z11) {
        if (z10) {
            e(true, new aq.b(runnable));
            return;
        }
        if (z11) {
            final aq.b bVar = new aq.b(runnable);
            if (getActivity() != null) {
                final int iAX = db.aX();
                int iBd = db.bd();
                if (iBd == 0) {
                    iBd = R.drawable.facetec_internal_warning;
                }
                final int i10 = iBd;
                final boolean z12 = iAX != 0;
                b(new Runnable() { // from class: com.facetec.sdk.w6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42943p0.e(z12, iAX, i10, bVar);
                    }
                });
                return;
            }
            return;
        }
        if (this.f40945y) {
            e(false, new aq.b(runnable));
        } else {
            e(new aq.b(runnable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(boolean z10, int i10, int i11, aq.b bVar) {
        int i12 = 0;
        this.f40923b.setVisibility(0);
        this.f40935o.setImageDrawable(null);
        this.f40935o.clearColorFilter();
        this.f40935o.invalidate();
        this.m.clearColorFilter();
        this.m.invalidate();
        if (z10) {
            this.m.setImageDrawable(ay.a(getActivity(), i10));
            ((AnimatedVectorDrawableCompat) this.m.getDrawable()).start();
        } else {
            this.m.setImageDrawable(ContextCompat.getDrawable(getActivity(), i11));
        }
        RelativeLayout relativeLayout = this.f40937q;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", relativeLayout.getAlpha(), 0.0f);
        RelativeLayout relativeLayout2 = this.f40923b;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", relativeLayout2.getAlpha(), 1.0f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.addListener(new z6(this, i12, bVar));
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    private void a(aq.b bVar) throws Throwable {
        this.D.postDelayed(bVar, c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) throws Throwable {
        if (this.f40928g != null) {
            String strD = d(this.B, this.C);
            if (strD.equals(this.f40928g.getText().toString())) {
                return;
            }
            try {
                if (!z10) {
                    this.f40928g.setText(strD);
                    Object[] objArr = new Object[1];
                    J(Color.alpha(0) - 68, (byte) ((-52) - Drawable.resolveOpacity(0, 0)), (short) (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0') + 244112879, 20287 - AndroidCharacter.getMirror('0'), objArr);
                    Class<?> cls = Class.forName((String) objArr[0]);
                    Object[] objArr2 = new Object[1];
                    J(KeyEvent.keyCodeFromString("") - 68, (byte) (14 - TextUtils.lastIndexOf("", '0', 0)), (short) View.MeasureSpec.getMode(0), 244112895 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 780947219, objArr2);
                    this.A = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() / AnimationKt.MillisToNanos;
                    return;
                }
                Object[] objArr3 = new Object[1];
                J((-68) - (Process.myPid() >> 22), (byte) ((-52) - Color.red(0)), (short) Color.alpha(0), 244112878 + Drawable.resolveOpacity(0, 0), 780947214 - ExpandableListView.getPackedPositionChild(0L), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                J((-69) - Process.getGidForName(""), (byte) (15 - Gravity.getAbsoluteGravity(0, 0)), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 244112893 + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 780947218 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
                this.A = (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() / AnimationKt.MillisToNanos) + 1000;
                this.f40928g.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(new aq.b(new u2(this, 7))).start();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Runnable runnable) {
        this.f40936p.setVisibility(8);
        this.f40923b.setVisibility(8);
        this.f40928g.setVisibility(8);
        this.f40929h.setVisibility(4);
        this.f40924c.setAlpha(0.0f);
        this.f40937q.setAlpha(0.0f);
        this.f40937q.setVisibility(0);
        this.f40924c.setVisibility(0);
        this.f40927f.setVisibility(0);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final aq.b bVar) {
        ObjectAnimator objectAnimator = this.f40939s;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f40939s = null;
        }
        ProgressBar progressBar = this.f40932k;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), this.f40932k.getMax());
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.addListener(new b() { // from class: com.facetec.sdk.b7
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                co.bg_(bVar, animator);
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
        objectAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final boolean z10, final Runnable runnable, final boolean z11) {
        c(new aq.b(new Runnable() { // from class: com.facetec.sdk.e7
            @Override // java.lang.Runnable
            public final void run() {
                this.f41460p0.c(z10, runnable, z11);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, int i10, boolean z11, int i11, boolean z12, boolean z13, int i12, final aq.b bVar) {
        Activity activity;
        this.f40923b.setVisibility(0);
        if (z10) {
            this.m.clearColorFilter();
            this.m.invalidate();
            activity = getActivity();
        } else {
            if (z11) {
                this.f40935o.setImageResource(i11);
                this.f40935o.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(0L).setStartDelay(0L).setListener(null).start();
                this.f40935o.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(1000L).setStartDelay(0L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
            } else {
                this.f40935o.setImageDrawable(ay.a(getActivity(), R.drawable.facetec_animated_result_background));
                ((AnimatedVectorDrawableCompat) this.f40935o.getDrawable()).start();
            }
            activity = getActivity();
            i10 = z12 ? R.drawable.facetec_animated_success_foreground : R.drawable.facetec_animated_unsuccess_foreground;
        }
        this.m.setImageDrawable(ay.a(activity, i10));
        ((AnimatedVectorDrawableCompat) this.m.getDrawable()).start();
        RelativeLayout relativeLayout = this.f40937q;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", relativeLayout.getAlpha(), 0.0f);
        RelativeLayout relativeLayout2 = this.f40923b;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", relativeLayout2.getAlpha(), 1.0f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.addListener(new b() { // from class: com.facetec.sdk.a7
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.f40193a.be_(bVar, animator);
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
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f40929h.setImageDrawable(this.f40931j);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        this.E = anonymousClass2;
        this.f40931j.registerAnimationCallback(anonymousClass2);
        this.f40931j.start();
    }

    private void e(final boolean z10, @NonNull final aq.b bVar) {
        if (getActivity() == null) {
            return;
        }
        final int iAP = z10 ? db.aP() : ((Integer) db.c(new Object[0], -887973215, 887973237, (int) System.currentTimeMillis())).intValue();
        final boolean z11 = iAP != 0;
        Object[] objArr = new Object[0];
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        final int iIntValue = ((Integer) (z10 ? db.c(objArr, 866669272, -866669258, iCurrentTimeMillis) : db.c(objArr, -523817231, 523817258, iCurrentTimeMillis))).intValue();
        final boolean z12 = iIntValue != 0;
        final int iBk = z10 ? db.bk() : db.bi();
        if (z11 || z12) {
            this.f40935o.setImageDrawable(null);
            this.f40935o.clearColorFilter();
            this.f40935o.invalidate();
        }
        b(new Runnable() { // from class: com.facetec.sdk.y6
            @Override // java.lang.Runnable
            public final void run() {
                this.f42996p0.a(z12, iIntValue, z11, iAP, z10, false, iBk, bVar);
            }
        });
    }

    public final void e(@Nullable Runnable runnable) {
        if (getActivity() == null) {
            return;
        }
        b(new j1(this, runnable, 1));
    }

    public final void a(Runnable runnable) {
        this.f40936p.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
        this.f40923b.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
        this.f40928g.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
        this.f40929h.animate().alpha(0.0f).setDuration(800L).setListener(null).withEndAction(new aq.b(new a1(this, runnable, 3))).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(aq.b bVar) {
        this.f40932k.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(bVar).start();
    }

    public final void d(final boolean z10, final boolean z11, @Nullable String str, @NonNull final Runnable runnable) throws Throwable {
        this.f40928g.setImportantForAccessibility(2);
        if (getActivity() == null) {
            return;
        }
        TextView textView = this.f40928g;
        if (textView != null) {
            textView.setImportantForAccessibility(2);
        }
        this.f40941u.removeCallbacks(this.H);
        this.D.removeCallbacksAndMessages(null);
        if (!this.f40945y) {
            if (str == null) {
                str = dd.c(R.string.FaceTec_result_success_message);
            }
            this.f40934n.setText(str);
            if (z10) {
                this.f40934n.setContentDescription(str);
                this.f40934n.performAccessibilityAction(64, null);
                this.f40934n.sendAccessibilityEvent(8);
                this.f40934n.announceForAccessibility(str);
            }
        } else if (z10) {
            if (str == null) {
                str = dd.c(R.string.FaceTec_result_success_message);
            }
            this.f40934n.setText(str);
        } else {
            if (str == null) {
                str = dd.c(R.string.FaceTec_result_idscan_unsuccess_message);
            }
            this.f40934n.setText(str);
        }
        this.f40946z = true;
        a(new aq.b(new Runnable() { // from class: com.facetec.sdk.x6
            @Override // java.lang.Runnable
            public final void run() {
                this.f42966p0.a(z10, runnable, z11);
            }
        }));
    }

    public final void d(Runnable runnable) {
        this.f40923b.animate().alpha(0.0f).setDuration(800L).setStartDelay(0L).setListener(null).withEndAction(new aq.b(runnable)).start();
    }
}
