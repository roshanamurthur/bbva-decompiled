package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceTecSessionActivity extends be {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static FaceTecFaceScanProcessor f40124e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static FaceTecIDScanProcessor f40125i;

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor) {
        createAndLaunchSession(context, faceTecFaceScanProcessor, null, "");
    }

    public static FaceTecIDScanResult getIDScanResultFromActivityResult(@NonNull Intent intent) {
        if (intent != null) {
            return (FaceTecIDScanResult) intent.getParcelableExtra(FaceTecSDK.EXTRA_ID_SCAN_RESULTS);
        }
        return null;
    }

    public static FaceTecSessionResult getSessionResultFromActivityResult(@NonNull Intent intent) {
        if (intent != null) {
            return (FaceTecSessionResult) intent.getParcelableExtra(FaceTecSDK.EXTRA_SESSION_RESULTS);
        }
        return null;
    }

    @Override // com.facetec.sdk.be, com.facetec.sdk.bh, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.facetec.sdk.be, android.app.Activity
    public final /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.facetec.sdk.bh, android.app.Activity, android.content.ComponentCallbacks
    public final /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facetec.sdk.be, com.facetec.sdk.bh, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.facetec.sdk.be, android.app.Activity
    public final /* bridge */ /* synthetic */ void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.facetec.sdk.be, com.facetec.sdk.bh, android.app.Activity
    public final void onPause() throws Throwable {
        super.onPause();
    }

    @Override // com.facetec.sdk.be, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public final /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // com.facetec.sdk.be, com.facetec.sdk.bh, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // com.facetec.sdk.be, com.facetec.sdk.bh, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // com.facetec.sdk.be, android.app.Activity, android.view.Window.Callback
    public final /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // com.facetec.sdk.be, com.facetec.sdk.cz.e
    public final /* bridge */ /* synthetic */ void s() {
        super.s();
    }

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor, String str) {
        createAndLaunchSession(context, faceTecFaceScanProcessor, null, str);
    }

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor, FaceTecIDScanProcessor faceTecIDScanProcessor) {
        createAndLaunchSession(context, faceTecFaceScanProcessor, faceTecIDScanProcessor, "");
    }

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor, FaceTecIDScanProcessor faceTecIDScanProcessor, String str) {
        bg.j();
        Intent intent = new Intent(context, (Class<?>) FaceTecSessionActivity.class);
        if (str != null) {
            intent.putExtra("zoom.serverSessionToken", str);
        }
        f40124e = faceTecFaceScanProcessor;
        f40125i = faceTecIDScanProcessor;
        ((Activity) context).startActivityForResult(intent, 1002);
    }

    public static void createAndLaunchSession(Context context, FaceTecIDScanProcessor faceTecIDScanProcessor, String str) {
        bg.j();
        Intent intent = new Intent(context, (Class<?>) FaceTecSessionActivity.class);
        if (str != null) {
            intent.putExtra("zoom.serverSessionToken", str);
        }
        f40124e = null;
        f40125i = faceTecIDScanProcessor;
        intent.putExtra("facetec.idScanOnlyMode", true);
        ((Activity) context).startActivityForResult(intent, 1002);
    }
}
