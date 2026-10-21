package com.facetec.sdk;

import android.animation.Animator;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public final class cn extends ba {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static boolean f40916k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Handler f40917l;
    private GuidanceCenterContentFragment m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ct f40919o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f40918n = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f40921q = 500;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40920p = 300;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        dd.bv_(this.f40460e, R.string.FaceTec_action_im_ready);
        this.f40460e.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        d(true, 500, 0);
        d(new x1(this, 5), 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.f40456a.setEnabled(true);
        a(true);
    }

    private void d(GuidanceCenterContentFragment guidanceCenterContentFragment) {
        if (guidanceCenterContentFragment == null) {
            return;
        }
        getFragmentManager().beginTransaction().setCustomAnimations(R.anim.facetec_slide_in_left, R.anim.facetec_slide_out_left).replace(R.id.centerContentFrameLayout, guidanceCenterContentFragment, "centerContentFrameLayout").commitAllowingStateLoss();
    }

    @NonNull
    public static cn m() {
        cn cnVar = new cn();
        cnVar.setArguments(new Bundle());
        f40916k = false;
        cnVar.f40465j = true;
        return cnVar;
    }

    private void q() throws Throwable {
        if (dn.d()) {
            this.f40460e.d(true, false);
        } else {
            r();
        }
        d(false, 500, 0);
        this.f40460e.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        d(new z0(this, 4), 800L);
        t.f42834e = ak.f40296n;
        d(this.m);
        b(new l1(this, 5), 1000L);
        this.f40457b.b();
        t.c(h(), e.GET_READY_IM_READY_SHOWN_AND_READY_RETRY, (String) null);
        t.e(new Object[]{cu.RETRY_GET_READY}, -590439926, 590439930, (int) System.currentTimeMillis());
    }

    private void r() {
        new Handler().postDelayed(new aq.b(new l2(this, 6)), 4500L);
    }

    private void s() {
        Handler handler = this.f40917l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f40917l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void B() {
        this.f40460e.setImportantForAccessibility(1);
        this.f40456a.setImportantForAccessibility(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        ct ctVar = this.f40919o;
        if (ctVar != null) {
            ctVar.b();
            return;
        }
        GuidanceCenterContentFragment guidanceCenterContentFragment = this.m;
        if (guidanceCenterContentFragment != null) {
            guidanceCenterContentFragment.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        bh bhVarH = h();
        if (bhVarH != null) {
            bhVarH.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() throws Throwable {
        bh bhVarH = h();
        if (bhVarH != null) {
            bhVarH.n();
            t.c(bhVarH, e.GET_READY_IM_READY_PRESSED_RETY, (String) null);
        }
        o();
    }

    private void x() {
        cy cyVar;
        ct ctVar = this.f40919o;
        if (ctVar == null || (cyVar = ctVar.f41039h) == null) {
            return;
        }
        cyVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        o();
    }

    @Override // com.facetec.sdk.ba
    public final void a() {
        bh bhVarH = h();
        if (bhVarH != null && FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            dn.a(bhVarH, dn.b.RETRY);
        }
        ct ctVar = this.f40919o;
        int i10 = 4;
        if (ctVar != null) {
            ctVar.f41036e.setAlpha(0.0f);
            ctVar.f41032a.setAlpha(0.0f);
            ctVar.f41034c.setAlpha(0.0f);
            ctVar.f41035d.setAlpha(0.0f);
            ctVar.f41038g.setAlpha(0.0f);
            ctVar.f41041j.setAlpha(0.0f);
            this.f40460e.setVisibility(4);
            this.f40460e.setAlpha(0.0f);
        }
        this.f40463h.setVisibility(8);
        this.f40460e.setEnabled(false);
        this.f40456a.setEnabled(false);
        a(false);
        this.f40457b.b(db.aS(), 0, 0);
        if (this.f40917l == null) {
            Handler handler = new Handler();
            this.f40917l = handler;
            handler.postDelayed(new aq.b(new i3(this, i10)), 600000L);
        }
        b(new u4(this, 5));
    }

    @Override // com.facetec.sdk.ba
    public final void b() {
        b(new h3(this, 6));
        this.f40457b.a();
    }

    @Override // com.facetec.sdk.ba
    public final void c() throws Throwable {
        x();
        if (this.f40918n == 0) {
            q();
            ch.U();
            if (FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                dn.a(h(), dn.b.GET_READY_FRAME_YOUR_FACE_AUTOMATIC);
            }
            d(new s1(this, 6), 1300L);
        } else {
            f40916k = true;
            s();
            e(new aq.b(new g3(this, 4)), 1000);
        }
        this.f40918n++;
    }

    @Override // com.facetec.sdk.ba
    public final void e() throws Throwable {
        if (this.f40918n == 0) {
            q();
            ch.U();
            this.f40918n++;
        } else {
            bh bhVarH = h();
            if (bhVarH != null) {
                bhVarH.k();
            }
            s();
            x();
        }
    }

    @Override // com.facetec.sdk.ba
    public final boolean i() {
        return this.f40918n == 1;
    }

    public final boolean k() {
        return this.f40918n == 1;
    }

    @Override // com.facetec.sdk.ba, com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        Handler handler = new Handler();
        this.f40917l = handler;
        handler.postDelayed(new aq.b(new y1(this, 5)), 600000L);
        if (ch.C().length == 0) {
            t.f42834e = ak.f40296n;
            this.f40918n = 1;
            t.e(new Object[]{cu.RETRY_GET_READY}, -590439926, 590439930, (int) System.currentTimeMillis());
        } else {
            t.f42834e = ak.f40294k;
            this.f40919o = new ct();
            getFragmentManager().beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(R.id.centerContentFrameLayout, this.f40919o).commitAllowingStateLoss();
            t.e(new Object[]{cu.RETRY_SIDE_BY_SIDE}, -590439926, 590439930, (int) System.currentTimeMillis());
        }
    }

    @Override // com.facetec.sdk.ba, android.app.Fragment
    public final /* bridge */ /* synthetic */ Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return super.onCreateAnimator(i10, z10, i11);
    }

    @Override // com.facetec.sdk.ba, android.app.Fragment
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.facetec.sdk.ba, android.app.Fragment
    public final /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.facetec.sdk.ba, android.app.Fragment
    public final void onPause() {
        super.onPause();
        s();
        x();
    }

    @Override // com.facetec.sdk.ba, android.app.Fragment
    public final /* bridge */ /* synthetic */ void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public final void p() {
        if (this.f40917l == null) {
            this.f40917l = new Handler();
        }
        this.f40917l.postDelayed(new aq.b(new k3(this, 8)), 600000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        be beVarG = g();
        if (beVarG != null) {
            beVarG.B();
        }
        RectF rectFBo_ = this.f40457b.bo_();
        this.m = GuidanceCenterContentFragment.a(R.string.FaceTec_instructions_header_ready_1, R.string.FaceTec_instructions_message_ready_2, GuidanceCenterContentFragment.ScreenType.READY_OVAL, rectFBo_.top, rectFBo_.bottom, this.f40460e.getId());
        int i10 = 3;
        if (this.f40918n != 1) {
            if (this.f40919o == null) {
                return;
            }
            dd.bv_(this.f40460e, R.string.FaceTec_action_try_again);
            this.f40919o.e(new aq.b(new n6(this, i10)));
            return;
        }
        getFragmentManager().beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).replace(R.id.centerContentFrameLayout, this.m).commitAllowingStateLoss();
        dd.bv_(this.f40460e, R.string.FaceTec_action_im_ready);
        this.f40457b.f40484c.setAlpha(255);
        this.f40457b.e();
        b(new y5(this, 2), 500L);
        this.f40460e.setAlpha(0.0f);
        this.f40460e.setVisibility(0);
        this.f40460e.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).withEndAction(new aq.b(new f5(this, i10))).start();
        d(true, 500, 300);
        if (dn.d()) {
            this.f40460e.setEnabled(true);
        } else {
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        if (g() != null) {
            this.f40460e.d(true, true);
            this.f40456a.setEnabled(true);
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        cy cyVar = this.f40919o.f41039h;
        if (cyVar.f41075a.length != 0) {
            cyVar.f41076b = 0;
            cyVar.f41079e = true;
            cyVar.b();
            cyVar.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        d(new i2(this, 5), 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        if (db.aQ().length != 0) {
            d(new m2(this, 6), 10L);
        }
        d(new r1(this, 5), 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f40919o.bj_().setImportantForAccessibility(1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f40919o.bj_().setAccessibilityHeading(true);
        }
        this.f40460e.setImportantForAccessibility(1);
        this.f40456a.setImportantForAccessibility(1);
        if (i10 >= 28) {
            this.f40919o.bj_().setScreenReaderFocusable(true);
        }
        this.f40919o.bj_().sendAccessibilityEvent(8);
        this.f40460e.setAlpha(0.0f);
        this.f40460e.setVisibility(0);
        this.f40460e.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).withEndAction(new aq.b(new i4(this, 3))).start();
        d(true, 500, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        bh bhVarH = h();
        if (bhVarH != null) {
            bhVarH.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        bh bhVarH = h();
        if (bhVarH != null) {
            bhVarH.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f40457b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        if (g() != null) {
            B();
            this.f40456a.setEnabled(true);
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f40462g = true;
        if (this.f40460e.isEnabled()) {
            return;
        }
        this.f40460e.d(true, true);
    }

    @Override // com.facetec.sdk.ba
    public final void d() throws Throwable {
        ImageView imageViewAj_ = aj_();
        if (imageViewAj_ == null || !imageViewAj_.isEnabled() || f40916k) {
            return;
        }
        e();
    }
}
