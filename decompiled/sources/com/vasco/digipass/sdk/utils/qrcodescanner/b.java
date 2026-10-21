package com.vasco.digipass.sdk.utils.qrcodescanner;

import android.app.Activity;
import android.graphics.Rect;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import androidx.camera.core.d0;
import androidx.compose.ui.platform.j;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes9.dex */
public class b extends com.vasco.digipass.sdk.utils.qrcodescanner.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Camera f65859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f65860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f65861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SurfaceHolder.Callback f65862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Camera.PreviewCallback f65863i;

    public b(Activity activity) {
        super(activity);
        a aVar = new a();
        this.f65862h = aVar;
        Camera.PreviewCallback previewCallback = new Camera.PreviewCallback() { // from class: com.vasco.digipass.sdk.utils.qrcodescanner.e
            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                this.f65879p0.a(bArr, camera);
            }
        };
        this.f65863i = previewCallback;
        Camera cameraOpen = Camera.open();
        this.f65859e = cameraOpen;
        cameraOpen.setPreviewCallbackWithBuffer(previewCallback);
        getHolder().addCallback(aVar);
        getHolder().setType(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        try {
            if (this.f65858d) {
                return;
            }
            c();
        } catch (Exception e5) {
            this.f65855a.onExceptionThrown(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Camera camera;
        if (!this.f65861g || (camera = this.f65859e) == null) {
            return;
        }
        camera.autoFocus(new Camera.AutoFocusCallback() { // from class: com.vasco.digipass.sdk.utils.qrcodescanner.f
            @Override // android.hardware.Camera.AutoFocusCallback
            public final void onAutoFocus(boolean z10, Camera camera2) {
                this.f65880p0.a(z10, camera2);
            }
        });
    }

    @Override // com.vasco.digipass.sdk.utils.qrcodescanner.a
    public synchronized void a() {
        try {
            Camera camera = this.f65859e;
            if (camera != null) {
                this.f65858d = true;
                if (this.f65861g) {
                    camera.cancelAutoFocus();
                }
                this.f65859e.stopPreview();
                this.f65859e.setPreviewCallback(null);
                getHolder().removeCallback(this.f65862h);
                this.f65859e.release();
                this.f65859e = null;
                this.f65860f = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        private String a(Camera camera) {
            List<String> supportedFocusModes = camera.getParameters().getSupportedFocusModes();
            if (supportedFocusModes.contains("macro")) {
                b.this.f65861g = true;
                return "macro";
            }
            if (supportedFocusModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                b.this.f65861g = true;
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
            if (supportedFocusModes.contains("fixed")) {
                b.this.f65861g = false;
                return "fixed";
            }
            String str = supportedFocusModes.get(0);
            b.this.f65861g = false;
            return str;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                Camera.Size sizeA = a(surfaceHolder, b.this.f65859e);
                if (sizeA != null) {
                    int i10 = sizeA.width;
                    int i11 = sizeA.height;
                    Camera.Parameters parameters = b.this.f65859e.getParameters();
                    parameters.setPreviewSize(i10, i11);
                    parameters.setPreviewFormat(17);
                    parameters.setFocusMode(a(b.this.f65859e));
                    a(0, b.this.f65859e);
                    b.this.f65859e.setParameters(parameters);
                    b.this.f65859e.setPreviewDisplay(surfaceHolder);
                    b.this.f65860f = new byte[(int) (i10 * i11 * 1.5f)];
                    b.this.f65859e.addCallbackBuffer(b.this.f65860f);
                    b.this.f65859e.startPreview();
                    b.this.c();
                }
            } catch (Exception e5) {
                b.this.f65855a.onExceptionThrown(e5);
            }
        }

        private Camera.Size a(SurfaceHolder surfaceHolder, Camera camera) {
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            float fA = b.this.a(surfaceFrame.width(), surfaceFrame.height());
            List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            Collections.sort(supportedPreviewSizes, new g());
            Camera.Size size = null;
            float f6 = 1024.0f;
            for (int i10 = 0; i10 < supportedPreviewSizes.size(); i10++) {
                Camera.Size size2 = supportedPreviewSizes.get(i10);
                float fAbs = Math.abs(fA - b.this.a(size2.width, size2.height));
                if (fAbs < f6) {
                    size = size2;
                    f6 = fAbs;
                }
            }
            return size;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(Camera.Size size, Camera.Size size2) {
            return (size2.height * size2.width) - (size.height * size.width);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            if (r1 != 0) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(int r7, android.hardware.Camera r8) {
            /*
                r6 = this;
                android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
                r0.<init>()
                android.hardware.Camera.getCameraInfo(r7, r0)
                com.vasco.digipass.sdk.utils.qrcodescanner.b r7 = com.vasco.digipass.sdk.utils.qrcodescanner.b.this
                android.app.Activity r7 = r7.f65857c
                android.view.WindowManager r7 = r7.getWindowManager()
                android.view.Display r7 = r7.getDefaultDisplay()
                int r7 = r7.getRotation()
                com.vasco.digipass.sdk.utils.qrcodescanner.b r1 = com.vasco.digipass.sdk.utils.qrcodescanner.b.this
                int r1 = r1.getDeviceDefaultOrientation()
                r2 = 0
                r3 = 1
                r4 = 2
                if (r1 != r4) goto L25
                r1 = r3
                goto L26
            L25:
                r1 = r2
            L26:
                if (r7 != 0) goto L2e
                r7 = r1 ^ 1
            L2a:
                r5 = r2
                r2 = r7
                r7 = r5
                goto L4e
            L2e:
                if (r7 != r3) goto L36
                r7 = 90
                if (r1 == 0) goto L4e
            L34:
                r2 = r7
                goto L3e
            L36:
                if (r7 != r4) goto L41
                r7 = 180(0xb4, float:2.52E-43)
                if (r1 == 0) goto L34
                r2 = r7
                goto L4b
            L3e:
                r7 = 9
                goto L2a
            L41:
                r4 = 3
                if (r7 != r4) goto L48
                r2 = 270(0x10e, float:3.78E-43)
                if (r1 == 0) goto L4b
            L48:
                r7 = r2
                r2 = r3
                goto L4e
            L4b:
                r7 = 8
                goto L2a
            L4e:
                com.vasco.digipass.sdk.utils.qrcodescanner.b r1 = com.vasco.digipass.sdk.utils.qrcodescanner.b.this
                android.app.Activity r1 = r1.f65857c
                r1.setRequestedOrientation(r2)
                int r0 = r0.orientation
                int r0 = r0 - r7
                int r0 = r0 + 360
                int r0 = r0 % 360
                r8.setDisplayOrientation(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vasco.digipass.sdk.utils.qrcodescanner.b.a.a(int, android.hardware.Camera):void");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(byte[] bArr, Camera camera) {
        post(new d0(this, camera, 2, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Camera camera, byte[] bArr) {
        int i10;
        String str;
        try {
            synchronized (this) {
                try {
                    i10 = -1;
                    str = null;
                    if (!this.f65858d) {
                        Camera.Size previewSize = camera.getParameters().getPreviewSize();
                        int i11 = previewSize.width;
                        int i12 = previewSize.height;
                        if ((this.f65856b & 2) == 2) {
                            com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.d dVar = new com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.d(bArr, i11, i12, a(i11, i12));
                            str = QRCodeScannerSDKJNIWrapper.DecodeCrontoImage(dVar.a(), dVar.c(), dVar.b());
                            if (str != null) {
                                i10 = 2;
                            }
                        }
                        if (str == null && (this.f65856b & 1) == 1) {
                            Rect rectA = a(i11, i12);
                            byte[] bArrDecodeQRImage = QRCodeScannerSDKJNIWrapper.DecodeQRImage(a(bArr, i11, rectA), rectA.width(), rectA.height());
                            if (bArrDecodeQRImage != null) {
                                str = new String(bArrDecodeQRImage, StandardCharsets.UTF_8);
                                i10 = 1;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f65858d) {
                return;
            }
            if (str != null) {
                this.f65858d = true;
                this.f65855a.onScannedImage(str, i10);
            } else {
                camera.addCallbackBuffer(this.f65860f);
            }
        } catch (Exception e5) {
            this.f65855a.onExceptionThrown(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Camera camera) {
        postDelayed(new j(this, 8), 1000L);
    }
}
