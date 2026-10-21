package com.vasco.digipass.sdk.utils.qrcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bbva.plugin.media.capture.util.Constants;

/* JADX INFO: loaded from: classes9.dex */
public class QRCodeScannerSDKActivity extends Activity implements com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f65847e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FrameLayout f65848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f65849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f65850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.c f65851d;

    static {
        try {
            System.loadLibrary("QRCronto");
            f65847e = true;
        } catch (UnsatisfiedLinkError unused) {
            f65847e = false;
        }
    }

    private boolean a() throws PackageManager.NameNotFoundException {
        String[] strArr = getPackageManager().getPackageInfo(getPackageName(), 4096).requestedPermissions;
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (str.equals("android.permission.CAMERA")) {
                return true;
            }
        }
        return false;
    }

    private boolean b() {
        CameraManager cameraManager = (CameraManager) getSystemService(Constants.CAMERA_SRC);
        try {
            for (String str : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num2 == null || num == null) {
                    break;
                    break;
                }
                if (num2.intValue() == 1 && (num.intValue() == 1 || (Build.VERSION.SDK_INT >= 24 && num.intValue() == 3))) {
                    return true;
                }
            }
        } catch (CameraAccessException unused) {
        }
        return false;
    }

    private void c() {
        a aVar = this.f65849b;
        if (aVar != null) {
            aVar.a();
            this.f65849b = null;
        }
        finish();
    }

    public boolean isOverlayEnabled() {
        return this.f65851d != null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (getPackageManager().getApplicationInfo(getPackageName(), 0).targetSdkVersion >= 23 && checkSelfPermission("android.permission.CAMERA") != 0) {
                throw new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.PERMISSION_DENIED);
            }
            if (!getPackageManager().hasSystemFeature("android.hardware.camera")) {
                throw new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.CAMERA_NOT_AVAILABLE);
            }
            if (!a()) {
                throw new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.PERMISSION_DENIED);
            }
            if (!f65847e) {
                throw new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.NATIVE_LIBRARY_NOT_LOADED);
            }
            getWindow().addFlags(128);
            FrameLayout frameLayout = new FrameLayout(this);
            this.f65848a = frameLayout;
            setContentView(frameLayout);
        } catch (Exception e5) {
            onExceptionThrown(e5);
        }
    }

    @Override // com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a
    public void onExceptionThrown(Throwable th2) {
        QRCodeScannerSDKException qRCodeScannerSDKException = th2 instanceof QRCodeScannerSDKException ? (QRCodeScannerSDKException) th2 : new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.INTERNAL_ERROR, th2);
        Intent intent = new Intent();
        intent.putExtra(QRCodeScannerSDKConstants.OUTPUT_EXCEPTION, qRCodeScannerSDKException);
        setResult(2, intent);
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            try {
                setResult(0);
                c();
                return true;
            } catch (Exception e5) {
                onExceptionThrown(e5);
            }
        } else if (i10 == 80 || i10 == 27) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            a aVar = this.f65849b;
            if (aVar != null) {
                aVar.a();
                this.f65849b = null;
            }
        } catch (Exception e5) {
            onExceptionThrown(e5);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            int intExtra = getIntent().getIntExtra("extra_code_type", 1);
            this.f65850c = getIntent().getBooleanExtra("extra_vibrate", true);
            a cVar = b() ? new c(this) : new b(this);
            this.f65849b = cVar;
            cVar.setImageScannerCallback(this);
            this.f65849b.setCodeType(intExtra);
            this.f65848a.removeAllViews();
            this.f65848a.addView(this.f65849b);
            if (getIntent().getBooleanExtra(QRCodeScannerSDKConstants.EXTRA_SCANNER_OVERLAY, false)) {
                com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.c cVar2 = new com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.c(this, getIntent().getIntExtra(QRCodeScannerSDKConstants.EXTRA_SCANNER_OVERLAY_COLOR, -1728053248));
                this.f65851d = cVar2;
                this.f65848a.addView(cVar2);
            }
        } catch (Exception e5) {
            onExceptionThrown(e5);
        }
    }

    @Override // com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a
    public void onScannedImage(String str, int i10) {
        try {
            if (this.f65850c) {
                ((Vibrator) getSystemService("vibrator")).vibrate(100L);
            }
            Intent intent = new Intent();
            intent.putExtra("output_result", str);
            intent.putExtra("output_code_type", i10);
            setResult(-1, intent);
            c();
        } catch (Exception e5) {
            onExceptionThrown(e5);
        }
    }
}
