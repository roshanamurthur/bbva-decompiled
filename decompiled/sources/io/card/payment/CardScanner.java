package io.card.payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Vibrator;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.budiyev.android.codescanner.BarcodeUtils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes7.dex */
class CardScanner implements Camera.AutoFocusCallback, Camera.PreviewCallback, SurfaceHolder.Callback {
    public static final boolean G0;
    public static boolean H0;
    public byte[] E0;
    public boolean F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Bitmap f69744p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final WeakReference<CardIOActivity> f69745q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f69746r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f69747s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f69748t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f69749u0;
    public boolean v0 = true;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public long f69750w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f69751x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Camera f69752y0;

    static {
        try {
            d("cardioDecider");
            nUseNeon();
            nUseTegra();
            nUseX86();
            if (nUseNeon() || nUseTegra() || nUseX86()) {
                d("opencv_core");
                d("opencv_imgproc");
            }
            if (nUseNeon() || nUseX86()) {
                d("cardioRecognizer");
            } else if (nUseTegra()) {
                d("cardioRecognizer_tegra2");
            } else {
                Log.w("card.io", "unsupported processor - card.io scanning requires ARMv7 or x86 architecture");
                G0 = true;
            }
        } catch (UnsatisfiedLinkError e5) {
            e5.getMessage();
            G0 = true;
        }
        H0 = false;
    }

    public CardScanner(CardIOActivity cardIOActivity, int i10) {
        boolean z10 = false;
        this.f69746r0 = false;
        this.f69748t0 = -1;
        this.f69749u0 = 1;
        Intent intent = cardIOActivity.getIntent();
        if (intent != null) {
            this.f69746r0 = intent.getBooleanExtra(CardIOActivity.EXTRA_SUPPRESS_SCAN, false);
            if (intent.getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, false) && intent.getBooleanExtra(CardIOActivity.EXTRA_SCAN_EXPIRY, true)) {
                z10 = true;
            }
            this.f69747s0 = z10;
            this.f69748t0 = intent.getIntExtra(CardIOActivity.EXTRA_UNBLUR_DIGITS, -1);
        }
        this.f69745q0 = new WeakReference<>(cardIOActivity);
        this.f69749u0 = i10;
        nSetup(this.f69746r0, 6.0f, this.f69748t0);
    }

    public static void d(String str) throws UnsatisfiedLinkError {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e5) {
            String strConcat = CardIONativeLibsConfig.f69743a;
            if (strConcat == null || strConcat.length() == 0) {
                throw e5;
            }
            String str2 = File.separator;
            if (!str2.equals(Character.valueOf(strConcat.charAt(strConcat.length() - 1)))) {
                strConcat = strConcat.concat(str2);
            }
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(strConcat);
            sbD.append(Build.CPU_ABI);
            sbD.append(str2);
            sbD.append(System.mapLibraryName(str));
            System.load(sbD.toString());
        }
    }

    private native void nCleanup();

    private native void nGetGuideFrame(int i10, int i11, int i12, Rect rect);

    private native int nGetNumFramesScanned();

    private native void nResetAnalytics();

    private native void nScanFrame(byte[] bArr, int i10, int i11, int i12, DetectionInfo detectionInfo, Bitmap bitmap, boolean z10);

    private native void nSetup(boolean z10, float f6);

    private native void nSetup(boolean z10, float f6, int i10);

    public static native boolean nUseNeon();

    public static native boolean nUseTegra();

    public static native boolean nUseX86();

    public final void a() {
        if (this.f69752y0 != null) {
            f();
        }
        nCleanup();
        this.E0 = null;
    }

    public final Rect b(int i10, int i11) {
        int i12 = this.f69749u0;
        if (G0 || !(nUseNeon() || nUseTegra() || nUseX86())) {
            return null;
        }
        Rect rect = new Rect();
        nGetGuideFrame(i12, i10, i11, rect);
        return rect;
    }

    public final int c() {
        int rotation = ((WindowManager) this.f69745q0.get().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        if (rotation == 3) {
            return BarcodeUtils.ROTATION_270;
        }
        return 0;
    }

    public final void e(SurfaceHolder surfaceHolder) {
        String.valueOf(surfaceHolder.getSurfaceFrame());
        this.v0 = true;
        try {
            this.f69752y0.setPreviewDisplay(surfaceHolder);
            this.f69752y0.startPreview();
            this.f69752y0.autoFocus(this);
        } catch (IOException | RuntimeException unused) {
        }
    }

    public final void f() {
        i(false);
        Camera camera = this.f69752y0;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.f69752y0.setPreviewDisplay(null);
            } catch (IOException e5) {
                Log.w("card.io", "can't stop preview display", e5);
            }
            this.f69752y0.setPreviewCallback(null);
            this.f69752y0.release();
            this.E0 = null;
            this.f69752y0 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:5:0x0015->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public final void g() {
        Camera.Size size;
        Camera cameraOpen;
        List<Camera.Size> supportedPreviewSizes;
        this.v0 = true;
        this.f69750w0 = 0L;
        this.f69751x0 = 0L;
        Camera camera = this.f69752y0;
        if (camera == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i10 = 5000;
            while (true) {
                size = null;
                try {
                    try {
                        cameraOpen = Camera.open();
                        break;
                    } catch (InterruptedException unused) {
                        if (System.currentTimeMillis() - jCurrentTimeMillis >= i10) {
                            Log.w("CardScanner", "camera connect timeout");
                            cameraOpen = null;
                            break;
                        }
                    }
                } catch (RuntimeException unused2) {
                    Log.w("card.io", "Wasn't able to connect to camera service. Waiting and trying again...");
                    Thread.sleep(50);
                    if (System.currentTimeMillis() - jCurrentTimeMillis >= i10) {
                        Log.w("CardScanner", "camera connect timeout");
                        cameraOpen = null;
                        this.f69752y0 = cameraOpen;
                        if (cameraOpen == null) {
                            return;
                        }
                        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                        Camera.getCameraInfo(0, cameraInfo);
                        cameraOpen.setDisplayOrientation(((cameraInfo.orientation - c()) + 360) % 360);
                        Camera.Parameters parameters = this.f69752y0.getParameters();
                        supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                        if (supportedPreviewSizes != null) {
                            while (r7.hasNext()) {
                                if (size.width != 640) {
                                }
                            }
                            if (size == null) {
                                Log.w("card.io", "Didn't find a supported 640x480 resolution, so forcing");
                                Camera.Size size2 = supportedPreviewSizes.get(0);
                                size2.width = 640;
                                size2.height = 480;
                            }
                        }
                        parameters.toString();
                        parameters.setPreviewSize(640, 480);
                        this.f69752y0.setParameters(parameters);
                        if (this.f69744p0 == null) {
                            this.f69744p0 = Bitmap.createBitmap(AsoResponse.HTTP_ARMADILLO_OTP_NEEDED, BarcodeUtils.ROTATION_270, Bitmap.Config.ARGB_8888);
                        }
                    }
                } catch (Exception unused3) {
                    i10 = 0;
                    if (System.currentTimeMillis() - jCurrentTimeMillis >= i10) {
                        Log.w("CardScanner", "camera connect timeout");
                        cameraOpen = null;
                        break;
                    }
                }
            }
            this.f69752y0 = cameraOpen;
            if (cameraOpen == null) {
                return;
            }
            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
            Camera.getCameraInfo(0, cameraInfo2);
            cameraOpen.setDisplayOrientation(((cameraInfo2.orientation - c()) + 360) % 360);
            Camera.Parameters parameters2 = this.f69752y0.getParameters();
            supportedPreviewSizes = parameters2.getSupportedPreviewSizes();
            if (supportedPreviewSizes != null) {
                for (Camera.Size size3 : supportedPreviewSizes) {
                    if (size3.width != 640 && size3.height == 480) {
                        size = size3;
                        break;
                    }
                }
                if (size == null) {
                    Log.w("card.io", "Didn't find a supported 640x480 resolution, so forcing");
                    Camera.Size size4 = supportedPreviewSizes.get(0);
                    size4.width = 640;
                    size4.height = 480;
                }
            }
            parameters2.toString();
            parameters2.setPreviewSize(640, 480);
            this.f69752y0.setParameters(parameters2);
        } else {
            Objects.toString(camera);
        }
        if (this.f69744p0 == null) {
            this.f69744p0 = Bitmap.createBitmap(AsoResponse.HTTP_ARMADILLO_OTP_NEEDED, BarcodeUtils.ROTATION_270, Bitmap.Config.ARGB_8888);
        }
    }

    public final boolean h(SurfaceHolder surfaceHolder) {
        Objects.toString(surfaceHolder);
        if (this.f69752y0 == null) {
            g();
        }
        Camera camera = this.f69752y0;
        if (camera == null) {
            return false;
        }
        if (this.E0 == null) {
            Objects.toString(camera);
            byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(this.f69752y0.getParameters().getPreviewFormat()) / 8) * 921600];
            this.E0 = bArr;
            this.f69752y0.addCallbackBuffer(bArr);
        }
        surfaceHolder.addCallback(this);
        surfaceHolder.setType(3);
        this.f69752y0.setPreviewCallbackWithBuffer(this);
        if (this.F0) {
            e(surfaceHolder);
        }
        i(false);
        System.currentTimeMillis();
        nResetAnalytics();
        return true;
    }

    public final boolean i(boolean z10) {
        Camera camera = this.f69752y0;
        if (camera == null) {
            return false;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(z10 ? "torch" : DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            this.f69752y0.setParameters(parameters);
            return true;
        } catch (RuntimeException e5) {
            Log.w("CardScanner", "Could not set flash mode: " + e5);
            return false;
        }
    }

    public final void j(boolean z10) {
        if (this.f69751x0 < this.f69750w0) {
            return;
        }
        try {
            this.f69750w0 = System.currentTimeMillis();
            this.f69752y0.autoFocus(this);
        } catch (RuntimeException e5) {
            Log.w("CardScanner", "could not trigger auto focus: " + e5);
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z10, Camera camera) {
        this.f69751x0 = System.currentTimeMillis();
    }

    public void onEdgeUpdate(DetectionInfo detectionInfo) {
        this.f69745q0.get().f69730p0.setDetectionInfo(detectionInfo);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        boolean z10;
        float f6;
        float f10;
        if (bArr == null) {
            Log.w("CardScanner", "frame is null! skipping");
            return;
        }
        if (H0) {
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
                return;
            }
            return;
        }
        H0 = true;
        boolean z11 = this.v0;
        WeakReference<CardIOActivity> weakReference = this.f69745q0;
        if (z11) {
            this.v0 = false;
            this.f69749u0 = 1;
            CardIOActivity cardIOActivity = weakReference.get();
            SurfaceView surfaceView = cardIOActivity.f69732r0.f69791r0;
            g gVar = cardIOActivity.f69730p0;
            if (gVar != null) {
                gVar.setCameraPreviewRect(new Rect(surfaceView.getLeft(), surfaceView.getTop(), surfaceView.getRight(), surfaceView.getBottom()));
            }
            cardIOActivity.v0 = 1;
            cardIOActivity.d(0);
            if (1 != cardIOActivity.v0) {
                Log.wtf("card.io", "the orientation of the scanner doesn't match the orientation of the activity");
            }
            cardIOActivity.f69730p0.setDetectionInfo(new DetectionInfo());
        }
        DetectionInfo detectionInfo = new DetectionInfo();
        nScanFrame(bArr, 640, 480, this.f69749u0, detectionInfo, this.f69744p0, this.f69747s0);
        if (detectionInfo.focusScore >= 6.0f) {
            if (detectionInfo.complete || (this.f69746r0 && detectionInfo.topEdge && detectionInfo.bottomEdge && detectionInfo.rightEdge && detectionInfo.leftEdge)) {
                Objects.toString(detectionInfo.a());
                CardIOActivity cardIOActivity2 = weakReference.get();
                Bitmap bitmap = this.f69744p0;
                cardIOActivity2.getClass();
                try {
                    ((Vibrator) cardIOActivity2.getSystemService("vibrator")).vibrate(CardIOActivity.K0, -1);
                } catch (SecurityException unused) {
                } catch (Exception e5) {
                    Log.w("card.io", "Exception while attempting to vibrate: ", e5);
                }
                cardIOActivity2.I0.f();
                cardIOActivity2.F0.setVisibility(4);
                if (detectionInfo.complete) {
                    CreditCard creditCardA = detectionInfo.a();
                    cardIOActivity2.f69733s0 = creditCardA;
                    cardIOActivity2.f69730p0.setDetectedCard(creditCardA);
                }
                int i10 = cardIOActivity2.v0;
                if (i10 == 1 || i10 == 2) {
                    f6 = cardIOActivity2.f69734t0.right / 428.0f;
                    f10 = 0.95f;
                } else {
                    f6 = cardIOActivity2.f69734t0.right / 428.0f;
                    f10 = 1.15f;
                }
                float f11 = f6 * f10;
                Matrix matrix = new Matrix();
                matrix.postScale(f11, f11);
                cardIOActivity2.f69730p0.setBitmap(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false));
                if (cardIOActivity2.f69737x0) {
                    Intent intent = new Intent();
                    j.d(cardIOActivity2.getIntent(), intent, cardIOActivity2.f69730p0);
                    cardIOActivity2.setResult(CardIOActivity.RESULT_SCAN_SUPPRESSED, intent);
                    CardIOActivity.M0 = null;
                    cardIOActivity2.finish();
                } else {
                    cardIOActivity2.b();
                }
            }
            z10 = false;
        } else {
            z10 = false;
            j(false);
        }
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
        H0 = z10;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(surfaceHolder != null);
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = Integer.valueOf(i12);
        String.format("Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )", objArr);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f69752y0 == null) {
            Log.wtf("card.io", "CardScanner.surfaceCreated() - camera is null!");
        } else {
            this.F0 = true;
            e(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Camera camera = this.f69752y0;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception unused) {
            }
        }
        this.F0 = false;
    }
}
