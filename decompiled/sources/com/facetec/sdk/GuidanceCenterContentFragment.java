package com.facetec.sdk;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

/* JADX INFO: loaded from: classes9.dex */
public final class GuidanceCenterContentFragment extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TextView f40135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TextView f40136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ImageView f40137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    TextView f40138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    LinearLayout f40139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    RelativeLayout f40140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LinearLayout f40141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f40142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f40143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f40144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f40145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private i f40146l;
    private TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RelativeLayout f40147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout f40148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f40149p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private GradientDrawable f40150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f40151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private GradientDrawable f40152s;

    public enum ScreenType {
        GENERIC,
        READY_OVAL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        float fC = db.c();
        int iRound = Math.round(db.e() * db.d());
        int iRound2 = Math.round(ay.e(35) * db.d() * fC);
        int iRound3 = Math.round(ay.e(5) * db.d() * fC);
        float f6 = getArguments().getFloat("bottomOval");
        float f10 = getArguments().getFloat("topOval") - (iRound << 1);
        int i12 = iRound3 << 1;
        float f11 = i12;
        float f12 = f10 - f11;
        float measuredHeight = (this.f40151r.getMeasuredHeight() - f6) - f11;
        int measuredHeight2 = this.f40141g.getMeasuredHeight() - i12;
        int iFloor = (int) Math.floor(f12);
        if (f12 < measuredHeight2) {
            iFloor = measuredHeight2 + (iRound3 << 2);
            z10 = true;
        } else {
            z10 = false;
        }
        int measuredHeight3 = this.f40146l.getMeasuredHeight() - i12;
        int iFloor2 = (int) Math.floor(measuredHeight);
        if (measuredHeight < measuredHeight3) {
            iFloor2 = measuredHeight3 + (iRound3 << 2);
            z11 = true;
        } else {
            z11 = false;
        }
        int i13 = (z10 && db.bj()) ? iRound2 : 0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, iFloor);
        layoutParams.setMargins(i13, 0, i13, 0);
        layoutParams.addRule(10);
        this.f40148o.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, iFloor2);
        layoutParams2.setMargins(0, 0, 0, iRound3);
        layoutParams2.addRule(12);
        this.f40140f.setLayoutParams(layoutParams2);
        if (z10) {
            this.f40141g.setPadding(iRound3, iRound3, iRound3, iRound3);
            this.f40141g.setBackground(this.f40152s);
            this.f40141g.invalidate();
        }
        if (z11) {
            this.f40146l.setPadding(iRound3, iRound3, iRound3, iRound3);
            this.f40146l.setBackground(this.f40150q);
            this.f40146l.invalidate();
        }
        if (FaceTecSDK.f40106a.f40080c) {
            this.f40146l.setOnClickRunnable(new i1(this, 4));
        }
        int iFloor3 = (int) Math.floor((((double) iFloor) / 2.0d) / 1.3d);
        int iFloor4 = (int) Math.floor((((double) iFloor2) / 2.0d) / 1.3d);
        int width = this.f40148o.getWidth();
        int width2 = this.f40140f.getWidth();
        if (z10) {
            iFloor3 = (int) Math.floor(((double) (iFloor - i12)) / 2.0d);
            i10 = width - i12;
            i11 = i10;
        } else {
            if (!db.bj()) {
                iRound2 = 0;
            }
            i10 = width - (iRound2 << 1);
            i11 = width;
        }
        if (z11) {
            iFloor4 = (int) Math.floor(((double) (iFloor2 - i12)) / 2.0d);
            width2 = this.f40140f.getWidth() - i12;
        }
        ay.b bVar = new ay.b(i10, iFloor3);
        ay.b bVar2 = new ay.b(i11, iFloor3);
        ay.b bVar3 = new ay.b(width2, iFloor4);
        int iRound4 = Math.round(ay.c(8));
        int iRound5 = Math.round(ay.c(40));
        int iRound6 = Math.round(ay.c(5));
        int iRound7 = Math.round(ay.c(36));
        int iY_ = ay.Y_(this.f40144j, bVar, iRound4, iRound5);
        int iY_2 = ay.Y_(this.f40142h, bVar2, iRound4, iRound5);
        int iY_3 = ay.Y_(this.f40145k, bVar3, iRound6, iRound7);
        int iY_4 = ay.Y_(this.m, bVar3, iRound6, iRound7);
        int iMin = Math.min(iY_, iY_2);
        int iRound8 = (int) Math.round(((double) iMin) * 0.85d);
        if (iY_3 >= iRound8) {
            iY_3 = iRound8;
        }
        if (iY_4 >= iY_3) {
            iY_4 = iY_3;
        }
        float f13 = iMin;
        this.f40144j.setTextSize(0, f13);
        this.f40142h.setTextSize(0, f13);
        float f14 = iY_4;
        this.f40145k.setTextSize(0, f14);
        this.m.setTextSize(0, f14);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f40144j.getText()));
        sb2.append((Object) this.f40142h.getText());
        this.f40141g.setContentDescription(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ax_(ValueAnimator valueAnimator) {
        if (isAdded()) {
            LinearLayout linearLayout = this.f40141g;
            if (linearLayout != null && linearLayout.getBackground() != null) {
                db.bU_(getActivity(), this.f40152s, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                this.f40141g.setBackground(this.f40152s);
            }
            i iVar = this.f40146l;
            if (iVar == null || iVar.getBackground() == null) {
                return;
            }
            db.bU_(getActivity(), this.f40150q, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f40146l.setBackground(this.f40150q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ay_(ValueAnimator valueAnimator) {
        TextView textView;
        if (!isAdded() || (textView = this.f40145k) == null || this.m == null) {
            return;
        }
        textView.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.m.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void az_(ValueAnimator valueAnimator) {
        TextView textView;
        if (!isAdded() || (textView = this.f40144j) == null || this.f40142h == null) {
            return;
        }
        textView.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f40142h.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        if (this.f40149p) {
            return;
        }
        this.f40149p = true;
        this.f40148o.post(new aq.b(new c6(this, 1)));
    }

    @Override // com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.facetec_guidance_center_content_fragment, viewGroup, false);
        this.f40151r = viewInflate;
        return viewInflate;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        if (getArguments().getBoolean("isCameraPermissionsShowing")) {
            this.f40135a.setImportantForAccessibility(1);
            this.f40135a.sendAccessibilityEvent(8);
            this.f40135a.performAccessibilityAction(64, null);
            return;
        }
        this.f40140f.setImportantForAccessibility(1);
        RelativeLayout relativeLayout = this.f40140f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f40145k.getText());
        sb2.append(" ");
        sb2.append((Object) this.m.getText());
        relativeLayout.setContentDescription(sb2.toString());
        this.f40141g.setImportantForAccessibility(1);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f40141g.setScreenReaderFocusable(true);
            this.f40140f.setScreenReaderFocusable(true);
        }
        this.f40141g.sendAccessibilityEvent(8);
        this.f40141g.performAccessibilityAction(64, null);
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f40139e = (LinearLayout) view.findViewById(R.id.iconLayout);
        this.f40137c = (ImageView) view.findViewById(R.id.iconImageView);
        TextView textView = (TextView) view.findViewById(R.id.genericHeaderView);
        this.f40135a = textView;
        db.c(new Object[]{textView}, 166285300, -166285292, (int) System.currentTimeMillis());
        this.f40135a.setTypeface(bl.f40645b);
        this.f40135a.setLineSpacing(0.0f, 1.1f);
        TextView textView2 = (TextView) view.findViewById(R.id.feedbackIconsHeader);
        this.f40143i = textView2;
        db.c(new Object[]{textView2}, 166285300, -166285292, (int) System.currentTimeMillis());
        this.f40143i.setTypeface(bl.f40645b);
        this.f40143i.setLineSpacing(0.0f, 1.1f);
        this.f40136b = (TextView) view.findViewById(R.id.messageView1);
        this.f40138d = (TextView) view.findViewById(R.id.messageView2);
        this.f40136b.setTypeface(bl.f40644a);
        this.f40138d.setTypeface(bl.f40644a);
        db.c(new Object[]{this.f40136b}, 166285300, -166285292, (int) System.currentTimeMillis());
        db.c(new Object[]{this.f40138d}, 166285300, -166285292, (int) System.currentTimeMillis());
        this.f40136b.setLineSpacing(0.0f, 1.1f);
        this.f40138d.setLineSpacing(0.0f, 1.1f);
        this.f40147n = (RelativeLayout) view.findViewById(R.id.readyScreenContent);
        this.f40144j = (TextView) view.findViewById(R.id.readyScreenHeader1);
        this.f40142h = (TextView) view.findViewById(R.id.readyScreenHeader2);
        this.f40145k = (TextView) view.findViewById(R.id.readyScreenSubtext1);
        this.m = (TextView) view.findViewById(R.id.readyScreenSubtext2);
        this.f40148o = (RelativeLayout) view.findViewById(R.id.readyScreenHeaderOuterContainer);
        this.f40140f = (RelativeLayout) view.findViewById(R.id.readyScreenSubtextOuterContainer);
        this.f40141g = (LinearLayout) view.findViewById(R.id.readyScreenHeaderInnerContainer);
        this.f40146l = (i) view.findViewById(R.id.readyScreenSubtextInnerContainer);
        this.f40141g.setImportantForAccessibility(1);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f40141g.setAccessibilityHeading(true);
        }
        this.f40140f.setImportantForAccessibility(1);
        this.f40148o.setImportantForAccessibility(2);
        this.f40144j.setImportantForAccessibility(2);
        this.f40142h.setImportantForAccessibility(2);
        this.f40145k.setImportantForAccessibility(2);
        this.m.setImportantForAccessibility(2);
        this.f40144j.setTypeface(db.by_());
        this.f40142h.setTypeface(db.by_());
        this.f40145k.setTypeface(db.bz_());
        this.m.setTypeface(db.bz_());
        this.f40144j.setTextColor(db.i(getActivity()));
        this.f40142h.setTextColor(db.i(getActivity()));
        this.f40145k.setTextColor(db.g(getActivity()));
        this.m.setTextColor(db.g(getActivity()));
        this.f40144j.setLineSpacing(0.0f, 1.1f);
        this.f40142h.setLineSpacing(0.0f, 1.1f);
        this.f40145k.setLineSpacing(0.0f, 1.1f);
        this.m.setLineSpacing(0.0f, 1.1f);
        float fC = db.c() * db.d();
        float f6 = 28.0f * fC;
        this.f40144j.setTextSize(2, f6);
        this.f40142h.setTextSize(2, f6);
        float f10 = 20.0f * fC;
        this.f40145k.setTextSize(2, f10);
        this.m.setTextSize(2, f10);
        this.f40135a.setTextSize(2, f6);
        this.f40143i.setTextSize(2, f6);
        this.f40136b.setTextSize(2, f10);
        int iE = db.e();
        view.setPadding(iE, iE, iE, 0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40148o.getLayoutParams();
        layoutParams.setMarginStart(iE);
        layoutParams.setMarginEnd(iE);
        this.f40148o.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f40140f.getLayoutParams();
        layoutParams2.setMarginStart(iE);
        layoutParams2.setMarginEnd(iE);
        this.f40140f.setLayoutParams(layoutParams2);
        ScreenType screenType = (ScreenType) getArguments().get("screenType");
        int i10 = getArguments().getInt("header");
        ScreenType screenType2 = ScreenType.GENERIC;
        if (screenType == screenType2) {
            dd.bv_(this.f40135a, i10);
        } else {
            dd.bv_(this.f40143i, i10);
        }
        if (screenType == screenType2) {
            dd.bv_(this.f40136b, getArguments().getInt("message"));
        } else if (screenType == ScreenType.READY_OVAL) {
            this.f40147n.setVisibility(0);
            db.c(new Object[]{this.f40144j, db.a(true, false)}, 338356619, -338356598, (int) System.currentTimeMillis());
            db.c(new Object[]{this.f40142h, db.b(true, false)}, 338356619, -338356598, (int) System.currentTimeMillis());
            db.c(new Object[]{this.f40145k, (String) db.c(new Object[]{Boolean.TRUE, Boolean.FALSE}, 1908944937, -1908944918, (int) System.currentTimeMillis())}, 338356619, -338356598, (int) System.currentTimeMillis());
            db.c(new Object[]{this.m, db.c(true, false)}, 338356619, -338356598, (int) System.currentTimeMillis());
            Resources resources = getResources();
            GradientDrawable gradientDrawable = (GradientDrawable) resources.getDrawable(R.drawable.facetec_ready_header_background).mutate();
            this.f40152s = gradientDrawable;
            gradientDrawable.setCornerRadius(ay.e(db.y()) * db.d());
            db.bU_(getActivity(), this.f40152s, db.O());
            GradientDrawable gradientDrawable2 = (GradientDrawable) resources.getDrawable(R.drawable.facetec_ready_subtext_background).mutate();
            this.f40150q = gradientDrawable2;
            gradientDrawable2.setCornerRadius(ay.e(db.y()) * db.d());
            db.bU_(getActivity(), this.f40150q, db.O());
            this.f40148o.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.g0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f41730p0.d();
                }
            });
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f40139e.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams3).height = Math.round(ay.e(78) * fC);
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = iE;
        this.f40139e.setLayoutParams(layoutParams3);
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.f40135a.getLayoutParams())).bottomMargin = iE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        be beVar = (be) getActivity();
        if (beVar != null) {
            beVar.C();
        }
    }

    @NonNull
    public static GuidanceCenterContentFragment a(@StringRes int i10, @StringRes int i11, ScreenType screenType, float f6, float f10, int i12) {
        GuidanceCenterContentFragment guidanceCenterContentFragment = new GuidanceCenterContentFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("header", i10);
        bundle.putInt("message", i11);
        bundle.putSerializable("screenType", screenType);
        bundle.putFloat("topOval", f6);
        bundle.putFloat("bottomOval", f10);
        bundle.putInt("retryActionButtonId", i12);
        guidanceCenterContentFragment.setArguments(bundle);
        return guidanceCenterContentFragment;
    }

    public final void a(boolean z10) {
        TextView textView = this.f40144j;
        if (textView == null || this.f40142h == null || this.f40145k == null || this.m == null) {
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(db.i(getActivity())));
        valueAnimatorOfObject.setDuration(1000L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41130a.az_(valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
        ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f40144j.getCurrentTextColor()), Integer.valueOf(db.g(getActivity())));
        valueAnimatorOfObject2.setDuration(1000L);
        valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.e0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41444a.ay_(valueAnimator);
            }
        });
        valueAnimatorOfObject2.start();
        if (z10) {
            if (this.f40141g.getBackground() == null && this.f40146l.getBackground() == null) {
                return;
            }
            ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(db.e(getActivity(), FaceTecSDK.f40106a.f40086i.readyScreenTextBackgroundColor)), Integer.valueOf(db.e(getActivity(), db.O())));
            valueAnimatorOfObject3.setDuration(1000L);
            valueAnimatorOfObject3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.f0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f41528a.ax_(valueAnimator);
                }
            });
            valueAnimatorOfObject3.start();
        }
    }
}
