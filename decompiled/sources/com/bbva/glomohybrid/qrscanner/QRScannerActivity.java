package com.bbva.glomohybrid.qrscanner;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.core.g;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.qr.contract.ScannerActivityContract;
import com.bbva.qr.model.input.BarcodeType;
import com.bbva.qr.model.input.CameraConfig;
import com.bbva.qr.model.input.CustomViewConfig;
import com.bbva.qr.model.input.OverlayConfig;
import com.bbva.qr.model.input.ScannerSettings;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QRScannerActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/QRScannerActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class QRScannerActivity extends BaseActivity implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "qrScanner";

    @NotNull
    public static final String QR_TYPE_KEY = "qr_window_type";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34380s0 = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f34381t0 = 1000;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ScannerSettings f34382u0;

    @NotNull
    public final ActivityResultLauncher<ScannerSettings> v0;

    /* JADX INFO: compiled from: QRScannerActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/QRScannerActivity$Companion;", "", "()V", "ID", "", "QR_TYPE_KEY", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public QRScannerActivity() {
        ActivityResultLauncher<ScannerSettings> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ScannerActivityContract(), new g(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.v0 = activityResultLauncherRegisterForActivityResult;
    }

    public static void f(QRScannerActivity qRScannerActivity, ActionSpec actionSpec) {
        qRScannerActivity.getClass();
        CellsReactor.fire(QRScannerComponent.ID, actionSpec, null);
        qRScannerActivity.finish();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34380s0.getCoroutineContext();
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle extras;
        String string;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString(QR_TYPE_KEY, null)) != null) {
            int i10 = Intrinsics.areEqual("qr_payment", string) ? R.layout.qr_payment_overlay : R.layout.qr_refund_overlay;
            BarcodeType barcodeType = BarcodeType.QR;
            CameraConfig cameraConfig = new CameraConfig(false, true);
            CustomViewConfig customViewConfig = new CustomViewConfig(Integer.valueOf(i10), null, null, 6, null);
            Boolean bool = Boolean.FALSE;
            this.f34382u0 = new ScannerSettings(barcodeType, cameraConfig, customViewConfig, null, new OverlayConfig(null, null, null, null, null, bool, bool, 31, null), null, 40, null);
        }
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            ScannerSettings scannerSettings = this.f34382u0;
            if (scannerSettings == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scanParams");
                scannerSettings = null;
            }
            this.v0.launch(scannerSettings);
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.CAMERA")) {
            f(this, QRScannerComponent.INSTANCE.getACTION_CAMERA_PERMISSION_REJECTED());
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, this.f34381t0);
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(this, null), 3, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.f34381t0) {
            if (!(!(grantResults.length == 0)) || grantResults[0] != 0) {
                f(this, QRScannerComponent.INSTANCE.getACTION_CAMERA_PERMISSION_REJECTED());
                return;
            }
            ScannerSettings scannerSettings = this.f34382u0;
            if (scannerSettings == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scanParams");
                scannerSettings = null;
            }
            this.v0.launch(scannerSettings);
        }
    }
}
