package com.salesforce.marketingcloud.messages.iam;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.salesforce.marketingcloud.R;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IamBannerActivity extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f64627i = com.salesforce.marketingcloud.g.a("IamBaseActivity");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.salesforce.marketingcloud.messages.iam.a f64628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f64629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f64630h;

    public class a extends com.salesforce.marketingcloud.messages.iam.a {
        public a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // com.salesforce.marketingcloud.messages.iam.a, android.os.CountDownTimer
        public void onFinish() {
            IamBannerActivity.this.h();
        }
    }

    @AnimRes
    private int a(InAppMessage inAppMessage) {
        return inAppMessage.type() == InAppMessage.Type.bannerTop ? R.anim.mcsdk_iam_slide_in_from_top : R.anim.mcsdk_iam_slide_in_from_bottom;
    }

    @AnimRes
    private int b(InAppMessage inAppMessage) {
        return inAppMessage.type() == InAppMessage.Type.bannerTop ? R.anim.mcsdk_iam_slide_out_from_top : R.anim.mcsdk_iam_slide_out_from_bottom;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, android.app.Activity
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    public void h() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentFindFragmentById = supportFragmentManager.findFragmentById(android.R.id.content);
        if (fragmentFindFragmentById != null) {
            supportFragmentManager.beginTransaction().setCustomAnimations(0, b(c().d())).remove(fragmentFindFragmentById).commitAllowingStateLoss();
        }
        a(j.a(c().c(), a()));
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, android.view.View.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (isFinishing()) {
            return;
        }
        k kVarC = c();
        InAppMessage inAppMessageD = kVarC.d();
        findViewById(android.R.id.content).setBackgroundDrawable(new ColorDrawable(g.a(this, inAppMessageD.windowColor(), R.color.mcsdk_iam_default_window_background)));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(android.R.id.content) == null) {
            this.f64629g = true;
            supportFragmentManager.beginTransaction().setCustomAnimations(a(inAppMessageD), 0).add(android.R.id.content, c.a(kVarC)).commit();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public /* bridge */ /* synthetic */ void onDismissed() {
        super.onDismissed();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.salesforce.marketingcloud.messages.iam.a aVar = this.f64628f;
        if (aVar != null) {
            aVar.cancel();
            this.f64628f = null;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        long jDisplayDuration = b().displayDuration();
        long integer = this.f64629g ? (long) (((double) getResources().getInteger(R.integer.mcsdk_iam_banner_animation_duration)) * (-1.0d)) : 0L;
        this.f64629g = false;
        a(jDisplayDuration, integer);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public void onSwipeStarted() {
        super.onSwipeStarted();
        com.salesforce.marketingcloud.messages.iam.a aVar = this.f64628f;
        if (aVar != null) {
            aVar.cancel();
            this.f64630h = this.f64628f.a();
            this.f64628f = null;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public void onViewSettled() {
        super.onViewSettled();
        a(b().displayDuration(), this.f64630h);
    }

    private void a(long j10, long j11) {
        if (j10 > 0) {
            com.salesforce.marketingcloud.g.d(f64627i, "Banner dismiss timer set.  Will auto dismiss in %dms", Long.valueOf(j10 - j11));
            a aVar = new a(j10, j11);
            this.f64628f = aVar;
            aVar.start();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f
    public /* bridge */ /* synthetic */ void b(InAppMessage.Button button) {
        super.b(button);
    }
}
