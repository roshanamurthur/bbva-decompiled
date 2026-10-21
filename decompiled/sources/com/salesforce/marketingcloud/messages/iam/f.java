package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.messages.RegionMessageManager;

/* JADX INFO: loaded from: classes11.dex */
abstract class f extends FragmentActivity implements View.OnClickListener, SwipeDismissConstraintLayout.SwipeDismissListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f64660c = 123;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f64661d = "completedEvent";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f64662e = com.salesforce.marketingcloud.g.a("IamBaseActivity");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f64663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f64664b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64665a;

        static {
            int[] iArr = new int[InAppMessage.Button.ActionType.values().length];
            f64665a = iArr;
            try {
                iArr[InAppMessage.Button.ActionType.url.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64665a[InAppMessage.Button.ActionType.pushSettings.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64665a[InAppMessage.Button.ActionType.locationSettings.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private void d() {
        if (com.salesforce.marketingcloud.util.h.b(this) && MarketingCloudSdk.isReady()) {
            RegionMessageManager regionMessageManager = MarketingCloudSdk.getInstance().getRegionMessageManager();
            try {
                if (regionMessageManager.enableGeofenceMessaging()) {
                    com.salesforce.marketingcloud.g.a(f64662e, "Geofence messaging enabled from IAM action", new Object[0]);
                }
                if (regionMessageManager.enableProximityMessaging()) {
                    com.salesforce.marketingcloud.g.a(f64662e, "Proximity messaging enabled from IAM action", new Object[0]);
                }
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(f64662e, e5, "Unable to enable region messaging", new Object[0]);
            }
        }
    }

    private void e() {
        if (com.salesforce.marketingcloud.util.h.b(this)) {
            com.salesforce.marketingcloud.g.a(f64662e, "Location permission already allowed.  Skipping action from button click.", new Object[0]);
            d();
        } else {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION")) {
                ActivityCompat.requestPermissions(this, com.salesforce.marketingcloud.util.h.f65185b, 123);
                return;
            }
            try {
                startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null)), 123);
                return;
            } catch (ActivityNotFoundException e5) {
                com.salesforce.marketingcloud.g.b(f64662e, e5, "Unable to launch application settings page for location permission request.", new Object[0]);
            }
        }
        finish();
    }

    private void f() {
        Intent intentPutExtra = Build.VERSION.SDK_INT >= 26 ? new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", getPackageName()) : new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("app_package", getPackageName()).putExtra("app_uid", getApplicationInfo().uid);
        if (intentPutExtra != null) {
            try {
                startActivity(intentPutExtra);
            } catch (ActivityNotFoundException e5) {
                com.salesforce.marketingcloud.g.b(f64662e, e5, "Unable to handle push settings button action.", new Object[0]);
            }
        } else {
            com.salesforce.marketingcloud.g.a(f64662e, "Unable to launch notification settings for this device.", new Object[0]);
        }
        finish();
    }

    private void g() {
        try {
            int i10 = c().i();
            if (i10 != 0) {
                getWindow().setStatusBarColor(i10);
            }
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.a(f64662e, e5, "Failed to find status bar color from meta-data", new Object[0]);
        }
    }

    public long a() {
        k kVarC = c();
        kVarC.j();
        return kVarC.b();
    }

    public InAppMessage b() {
        return this.f64663a.d();
    }

    public k c() {
        return this.f64663a;
    }

    @Override // android.app.Activity
    public void finish() {
        k kVar = this.f64663a;
        if (kVar != null) {
            kVar.a(this.f64664b);
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 123) {
            d();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f64664b = j.b(this.f64663a.c(), a());
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.getTag() != null) {
            boolean z10 = view.getTag() instanceof InAppMessage.Button;
            Object tag = view.getTag();
            if (z10) {
                b((InAppMessage.Button) tag);
            } else if (tag instanceof InAppMessage.CloseButton) {
                this.f64664b = j.b(this.f64663a.c(), a());
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.f64663a = (k) getIntent().getParcelableExtra("messageHandler");
        }
        k kVar = this.f64663a;
        if (kVar == null || !kVar.a()) {
            finish();
            return;
        }
        g();
        if (bundle != null) {
            this.f64664b = (j) bundle.getParcelable(f64661d);
        }
    }

    public void onDismissed() {
        this.f64664b = j.b(this.f64663a.c(), a());
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c().f();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        d();
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c().g();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f64661d, this.f64664b);
    }

    private void a(InAppMessage.Button button) {
        PendingIntent pendingIntentA = c().a(this, button);
        if (pendingIntentA != null) {
            try {
                pendingIntentA.send();
            } catch (PendingIntent.CanceledException e5) {
                com.salesforce.marketingcloud.g.b(f64662e, e5, "Unable to launch url for button click", new Object[0]);
            }
        } else {
            com.salesforce.marketingcloud.g.a(f64662e, "No PendingIntent returned for button click.", new Object[0]);
        }
        finish();
    }

    public void b(InAppMessage.Button button) {
        if (button != null) {
            this.f64664b = j.a(this.f64663a.c(), a(), button);
            int i10 = a.f64665a[button.actionType().ordinal()];
            if (i10 == 1) {
                a(button);
                return;
            }
            if (i10 == 2) {
                f();
            } else if (i10 != 3) {
                finish();
            } else {
                e();
            }
        }
    }

    public void a(j jVar) {
        this.f64664b = jVar;
    }

    public void onSwipeStarted() {
    }

    public void onViewSettled() {
    }
}
