package com.facetec.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.material3.TooltipKt;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FrameLayout f40771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f40772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f40773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f40774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f40775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40776f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f40777g;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        b(new i1(this, 6), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f40776f) {
            ((AnimatedVectorDrawableCompat) this.f40774d.getDrawable()).start();
        }
        this.f40775e.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new aq.b(new g1(this, 4))).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() throws Throwable {
        be beVar = (be) getActivity();
        if (beVar != null) {
            t.c(beVar, e.ADDITIONAL_REVIEW_BUTTON_PRESSED, (String) null);
            be.b(new Object[]{beVar}, 560820595, -560820591, System.identityHashCode(beVar));
        }
    }

    @Override // com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.facetec_additional_review_fragment, viewGroup, false);
        this.f40772b = viewInflate;
        return viewInflate;
    }

    @Override // android.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Activity activity = getActivity();
        this.f40773c = view.findViewById(R.id.backgroundView);
        this.f40775e = view.findViewById(R.id.contentLayout);
        this.f40771a = (FrameLayout) view.findViewById(R.id.iconFrameLayout);
        this.f40774d = (ImageView) view.findViewById(R.id.iconImageView);
        this.f40777g = (TextView) view.findViewById(R.id.messageTextView);
        float fC = db.c() * db.d();
        int iE = db.e();
        int iRound = Math.round(ay.e(80) * ((Float) db.c(new Object[0], -473030507, 473030524, (int) System.currentTimeMillis())).floatValue() * fC);
        int iRound2 = Math.round(ay.e(-55) * fC);
        int iRound3 = Math.round(fC * 24.0f);
        Typeface typeface = FaceTecSDK.f40106a.f40087j.messageFont;
        int iE2 = db.e(activity, ((Integer) db.c(new Object[0], 1284309801, -1284309795, (int) System.currentTimeMillis())).intValue());
        getActivity();
        int iAV = db.aV();
        int iAR = db.aR();
        int iAU = db.aU();
        if (iAR != 0) {
            this.f40774d.setImageDrawable(ay.a(getActivity(), iAR));
            this.f40776f = true;
        } else if (iAU != 0) {
            this.f40774d.setImageDrawable(ContextCompat.getDrawable(activity, iAU));
        } else if (iAV != 0) {
            this.f40774d.setImageDrawable(ContextCompat.getDrawable(activity, iAV));
        } else {
            this.f40774d.setVisibility(8);
        }
        this.f40775e.setTranslationY(iRound2);
        this.f40771a.getLayoutParams().height = iRound;
        this.f40771a.getLayoutParams().width = iRound;
        ((RelativeLayout.LayoutParams) this.f40771a.getLayoutParams()).setMargins(0, iE, 0, 0);
        dd.bv_(this.f40777g, R.string.FaceTec_idscan_additional_review_message);
        this.f40777g.setTextColor(iE2);
        this.f40777g.setTypeface(typeface);
        this.f40777g.setTextSize(iRound3);
        ((RelativeLayout.LayoutParams) this.f40777g.getLayoutParams()).setMargins(0, iE, 0, iE);
        db.c(this.f40773c);
        this.f40773c.getBackground().setAlpha(db.aS());
        b(new b2(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        b(new d2(this, 3), TooltipKt.TooltipDuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f40775e.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(new aq.b(new y5(this, 1))).start();
    }
}
