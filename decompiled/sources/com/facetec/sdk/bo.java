package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes9.dex */
public final class bo extends ba {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static boolean f40683n = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private bh.b f40685l;
    private Handler m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f40686o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private GuidanceCenterContentFragment f40687q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private GuidanceCenterContentFragment f40688r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40684k = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f40689t = new i1(this, 5);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        dn.a(h(), dn.b.GET_READY_PRESS_BUTTON_DELAYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (this.f40688r == null || !isAdded()) {
            return;
        }
        d(this.f40688r);
        this.f40457b.e();
        dd.bv_(this.f40460e, R.string.FaceTec_action_im_ready);
        this.f40459d.animate().alpha(0.0f).setDuration(500L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.f40462g = true;
        if (this.f40460e.isEnabled()) {
            return;
        }
        this.f40460e.d(true, true);
    }

    private void b(boolean z10) {
        this.f40457b.b(db.aS(), 1000, 500);
        int i10 = 1;
        if (z10) {
            this.f40459d.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new aq.b(new f5(this, i10))).start();
            this.f40684k++;
        } else {
            dd.bv_(this.f40460e, R.string.FaceTec_action_im_ready);
        }
        this.f40456a.setEnabled(true);
        a(true);
        d(true, 500, 0);
        if (dn.d()) {
            this.f40460e.d(true, false);
        } else {
            this.f40460e.d(false, true);
            new Handler().postDelayed(new aq.b(new n6(this, 2)), 4500L);
        }
        if (FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            dn.a(h(), dn.b.GET_READY_FRAME_YOUR_FACE_AUTOMATIC);
            Handler handler = new Handler();
            this.f40686o = handler;
            handler.postDelayed(this.f40689t, 4500L);
        }
    }

    @NonNull
    public static bo c(@NonNull bh.b bVar, boolean z10) {
        bo boVar = new bo();
        Bundle bundle = new Bundle();
        bundle.putInt("PERMISSION_STATUS", bVar.ordinal());
        bundle.putBoolean("IDSCAN_ONLY_MODE", z10);
        boVar.setArguments(bundle);
        f40683n = false;
        return boVar;
    }

    private void k() {
        Handler handler = this.f40686o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f40686o = null;
        }
    }

    private boolean p() {
        return this.f40685l != bh.b.GRANTED;
    }

    private void q() {
        if (this.m == null) {
            this.m = new Handler();
        }
        this.m.postDelayed(new aq.b(new d2(this, 2)), 600000L);
    }

    private void s() {
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f40457b.a();
        GuidanceCenterContentFragment guidanceCenterContentFragment = this.f40688r;
        if (guidanceCenterContentFragment != null) {
            guidanceCenterContentFragment.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f40456a.setEnabled(true);
        a(true);
        this.f40460e.d(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() throws Throwable {
        bh bhVarH = h();
        if (bhVarH != null) {
            bhVarH.l();
            t.c(bhVarH, e.GET_READY_IM_READY_PRESSED, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        dd.bv_(this.f40460e, R.string.FaceTec_action_im_ready);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        bb bbVar = this.f40457b;
        if (bbVar != null) {
            bbVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.f40456a.setImportantForAccessibility(1);
    }

    @Override // com.facetec.sdk.ba
    public final void a() {
        t.f42834e = ak.f40296n;
        this.f40463h.setVisibility(8);
        d(this.f40687q);
        if (this.m == null) {
            this.m = new Handler();
        }
        this.m.post(new aq.b(new b1(this, 6)));
    }

    @Override // com.facetec.sdk.ba
    public final void d() {
    }

    @Override // com.facetec.sdk.ba
    public final void e() {
        s();
        k();
        this.f40464i = null;
        bh bhVarH = h();
        if (bhVarH == null) {
            return;
        }
        if (p()) {
            bhVarH.p();
        } else {
            bhVarH.r();
        }
    }

    @Override // com.facetec.sdk.ba
    public final boolean i() {
        return true;
    }

    @Override // com.facetec.sdk.ba
    public final void l() {
        bh bhVarH = h();
        if (bhVarH == null) {
            return;
        }
        if (!p()) {
            if (this.f40684k < 2) {
                Handler handler = new Handler();
                int i10 = this.f40684k;
                if (i10 == 0) {
                    this.f40684k = i10 + 1;
                }
                if (this.f40684k == 1) {
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.facetec_slide_in_left, R.anim.facetec_slide_out_left).replace(R.id.centerContentFrameLayout, this.f40688r, "centerContentFrameLayout").commitAllowingStateLoss();
                    this.f40457b.b();
                    handler.postDelayed(new aq.b(new u2(this, 6)), 900L);
                }
                handler.postDelayed(new aq.b(new d1(this, 8)), 900L);
            } else {
                super.l();
            }
            this.f40684k++;
        } else if (this.f40685l == bh.b.NOT_GRANTED) {
            s();
            bhVarH.c();
        } else {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", bhVarH.getPackageName(), null));
            bhVarH.startActivity(intent);
            bhVarH.p();
        }
        o();
    }

    public final void m() {
        q();
        this.f40685l = bh.b.GRANTED;
        be beVarG = g();
        int i10 = 1;
        if (beVarG == null || !this.f40461f) {
            c(true);
        } else {
            b(new h1(this, new aq.b(new m4(beVarG, 3)), i10));
        }
    }

    @Override // com.facetec.sdk.ba
    public final void n() {
        super.n();
        this.f40458c.setVisibility(4);
    }

    @Override // com.facetec.sdk.ba, com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f40685l = bh.b.values()[getArguments().getInt("PERMISSION_STATUS")];
        this.f40461f = getArguments().getBoolean("IDSCAN_ONLY_MODE");
        q();
        boolean z10 = this.f40685l == bh.b.NOT_GRANTED;
        GuidanceCenterContentFragment guidanceCenterContentFragment = new GuidanceCenterContentFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("screenType", GuidanceCenterContentFragment.ScreenType.GENERIC);
        bundle2.putSerializable("isCameraPermissionsShowing", Boolean.valueOf(z10));
        if (z10) {
            bundle2.putInt("header", R.string.FaceTec_camera_permission_header);
        }
        guidanceCenterContentFragment.setArguments(bundle2);
        this.f40687q = guidanceCenterContentFragment;
        int i10 = R.string.FaceTec_instructions_header_ready_1;
        int i11 = R.string.FaceTec_instructions_message_ready_2;
        GuidanceCenterContentFragment.ScreenType screenType = GuidanceCenterContentFragment.ScreenType.READY_OVAL;
        GuidanceCenterContentFragment guidanceCenterContentFragment2 = new GuidanceCenterContentFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("header", i10);
        bundle3.putInt("message", i11);
        bundle3.putSerializable("screenType", screenType);
        guidanceCenterContentFragment2.setArguments(bundle3);
        this.f40688r = guidanceCenterContentFragment2;
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
    public final void onDestroy() {
        super.onDestroy();
        this.f40687q = null;
        this.f40688r = null;
    }

    @Override // com.facetec.sdk.ba, android.app.Fragment
    public final void onPause() {
        super.onPause();
        s();
        k();
    }

    @Override // com.facetec.sdk.ba, android.app.Fragment
    public final /* bridge */ /* synthetic */ void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.f40460e.d(false, true);
        this.f40456a.setEnabled(false);
        a(false);
        bh bhVarH = h();
        if (bhVarH != null) {
            if (p()) {
                bhVarH.p();
            } else {
                bhVarH.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Runnable runnable) {
        e(runnable, 500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() throws Throwable {
        be beVarG = g();
        if (beVarG != null) {
            int i10 = 1;
            if (p()) {
                this.f40456a.setImportantForAccessibility(2);
                getActivity();
                if (db.aT() != 0) {
                    ImageView imageView = this.f40687q.f40137c;
                    Activity activity = getActivity();
                    getActivity();
                    imageView.setImageDrawable(ContextCompat.getDrawable(activity, db.aT()));
                    this.f40687q.f40137c.setVisibility(0);
                } else {
                    this.f40687q.f40137c.setVisibility(8);
                }
                this.f40687q.f40139e.setVisibility(0);
                dd.bv_(this.f40687q.f40135a, R.string.FaceTec_camera_permission_header);
                GuidanceCenterContentFragment guidanceCenterContentFragment = this.f40687q;
                int i11 = R.string.FaceTec_camera_permission_message_enroll;
                String[] strArrSplit = dd.c(i11).split("\n\n");
                if (strArrSplit.length == 2) {
                    guidanceCenterContentFragment.f40136b.setText(strArrSplit[0]);
                    guidanceCenterContentFragment.f40138d.setText(strArrSplit[1]);
                    guidanceCenterContentFragment.f40138d.setVisibility(0);
                } else {
                    dd.bv_(guidanceCenterContentFragment.f40136b, i11);
                    guidanceCenterContentFragment.f40138d.setVisibility(8);
                }
                if (this.f40685l == bh.b.NOT_GRANTED) {
                    dd.bv_(this.f40460e, R.string.FaceTec_camera_permission_enable_camera);
                } else {
                    dd.bv_(this.f40460e, R.string.FaceTec_camera_permission_launch_settings);
                }
                this.f40687q.f40135a.setVisibility(0);
                this.f40687q.f40136b.setVisibility(0);
                this.f40460e.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                this.f40460e.setEnabled(true);
                if (!FaceTecSDK.f40106a.f40090n.hideForCameraPermissions) {
                    d(true, 500, 0);
                }
                be beVarG2 = g();
                if (beVarG2 != null) {
                    beVarG2.f40514j = true;
                }
                new Handler().postDelayed(new aq.b(new b6(this, 3)), 1000L);
                t.e(new Object[]{cu.CAMERA_PERMISSION}, -590439926, 590439930, (int) System.currentTimeMillis());
                beVarG.B();
            } else {
                if (this.f40461f) {
                    s();
                    k();
                    e(new a5(i10), 300);
                    beVarG.u();
                    return;
                }
                c(false);
                beVarG.B();
            }
            this.f40458c.setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40458c, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(500L);
            animatorSet.play(objectAnimatorOfFloat);
            animatorSet.start();
            t.e(new Object[]{cu.INITIAL_FACE_SCAN_GET_READY}, -590439926, 590439930, (int) System.currentTimeMillis());
            t.c(h(), e.GET_READY_IM_READY_SHOWN_AND_READY, (String) null);
        }
    }

    private void d(GuidanceCenterContentFragment guidanceCenterContentFragment) {
        getFragmentManager().beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).replace(R.id.centerContentFrameLayout, guidanceCenterContentFragment).commitAllowingStateLoss();
    }

    private void c(boolean z10) {
        if (this.f40460e == null) {
            return;
        }
        this.f40688r = GuidanceCenterContentFragment.a(R.string.FaceTec_instructions_header_ready_1, R.string.FaceTec_instructions_message_ready_2, GuidanceCenterContentFragment.ScreenType.READY_OVAL, this.f40457b.bo_().top, this.f40457b.bo_().bottom, 0);
        int i10 = 0;
        if (z10) {
            e((Context) getActivity(), false);
            a aVar = this.f40460e;
            int i11 = FaceTecSDK.f40106a.f40086i.buttonTextNormalColor;
            db.c(new Object[]{aVar, Integer.valueOf(i11)}, -357145220, 357145231, i11);
        } else {
            this.f40460e.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
            this.f40460e.setEnabled(false);
            d(this.f40688r);
            this.f40457b.f40484c.setAlpha(255);
            this.f40457b.e();
            b(new y5(this, i10), 1000L);
        }
        this.f40684k = 2;
        b(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r() {
    }

    @Override // com.facetec.sdk.ba
    public final void b() {
        new Handler().post(new aq.b(new t0(this, 3)));
    }

    @Override // com.facetec.sdk.ba
    public final void c() {
        this.f40456a.setImportantForAccessibility(2);
        if ((this.f40688r != null) & isAdded()) {
            GuidanceCenterContentFragment guidanceCenterContentFragment = this.f40688r;
            LinearLayout linearLayout = guidanceCenterContentFragment.f40141g;
            if (linearLayout != null) {
                linearLayout.setImportantForAccessibility(2);
            }
            RelativeLayout relativeLayout = guidanceCenterContentFragment.f40140f;
            if (relativeLayout != null) {
                relativeLayout.setImportantForAccessibility(2);
            }
        }
        bh bhVarH = h();
        if (bhVarH == null) {
            return;
        }
        if (p()) {
            bhVarH.c();
        } else {
            this.f40460e.d(false, true);
            this.f40460e.setVisibility(4);
            f40683n = true;
            s();
            k();
            e(new aq.b(new f1(this, 6)), 300);
        }
        o();
    }
}
