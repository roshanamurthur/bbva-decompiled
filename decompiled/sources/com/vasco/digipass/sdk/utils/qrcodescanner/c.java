package com.vasco.digipass.sdk.utils.qrcodescanner;

import android.app.Activity;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bbva.plugin.media.capture.util.Constants;
import com.budiyev.android.codescanner.BarcodeUtils;
import h2.j;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c extends com.vasco.digipass.sdk.utils.qrcodescanner.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HandlerThread f65865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Handler f65866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageReader f65867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CameraDevice f65868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f65869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CameraCaptureSession f65870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f65871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Semaphore f65872l;
    final SurfaceHolder.Callback m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final CameraDevice.StateCallback f65873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final CameraCaptureSession.StateCallback f65874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final ImageReader.OnImageAvailableListener f65875p;

    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            c cVar = c.this;
            if (cVar.f65858d) {
                return;
            }
            try {
                CameraManager cameraManager = (CameraManager) cVar.f65857c.getSystemService(Constants.CAMERA_SRC);
                if (c.this.f65869i == null) {
                    for (String str : cameraManager.getCameraIdList()) {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                            c.this.f65869i = str;
                            Size sizeA = c.this.a(surfaceHolder, ((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceHolder.class));
                            if (sizeA != null) {
                                c.this.f65867g = ImageReader.newInstance(sizeA.getWidth(), sizeA.getHeight(), 35, 3);
                                ImageReader imageReader = c.this.f65867g;
                                c cVar2 = c.this;
                                imageReader.setOnImageAvailableListener(cVar2.f65875p, cVar2.f65866f);
                                c.this.getHolder().setFixedSize(sizeA.getWidth(), sizeA.getHeight());
                                return;
                            }
                            return;
                        }
                    }
                    c.this.f65855a.onExceptionThrown(new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.CAMERA_NOT_AVAILABLE));
                }
                if (c.this.f65869i != null && c.this.f65868h == null && c.this.f65872l.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                    String str2 = c.this.f65869i;
                    c cVar3 = c.this;
                    cameraManager.openCamera(str2, cVar3.f65873n, cVar3.f65866f);
                }
            } catch (CameraAccessException e5) {
                com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = c.this.f65855a;
                if (aVar != null) {
                    aVar.onExceptionThrown(e5);
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar2 = c.this.f65855a;
                if (aVar2 != null) {
                    aVar2.onExceptionThrown(e7);
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            c.this.f65869i = null;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            surfaceHolder.removeCallback(this);
        }
    }

    public class b extends CameraDevice.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            c.this.f65872l.release();
            com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = c.this.f65855a;
            if (aVar != null) {
                aVar.onExceptionThrown(new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.CAMERA_NOT_AVAILABLE));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            c.this.f65872l.release();
            com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = c.this.f65855a;
            if (aVar != null) {
                aVar.onExceptionThrown(new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.CAMERA_NOT_AVAILABLE));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            c.this.f65872l.release();
            try {
                c.this.f65868h = cameraDevice;
                List<Surface> listAsList = Arrays.asList(c.this.getHolder().getSurface(), c.this.f65867g.getSurface());
                c cVar = c.this;
                cameraDevice.createCaptureSession(listAsList, cVar.f65874o, cVar.f65866f);
            } catch (Exception e5) {
                com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = c.this.f65855a;
                if (aVar != null) {
                    aVar.onExceptionThrown(e5);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.vasco.digipass.sdk.utils.qrcodescanner.c$c, reason: collision with other inner class name */
    public class C0272c extends CameraCaptureSession.StateCallback {
        public C0272c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            c.this.f65870j = null;
            c.this.f65865e.quitSafely();
            try {
                c.this.f65865e.join();
            } catch (InterruptedException e5) {
                com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = c.this.f65855a;
                if (aVar != null) {
                    aVar.onExceptionThrown(e5);
                    Thread.currentThread().interrupt();
                }
            }
            if (c.this.f65867g != null) {
                c.this.f65867g.close();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = c.this.f65855a;
            if (aVar != null) {
                aVar.onExceptionThrown(new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.CAMERA_NOT_AVAILABLE));
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            try {
                c.this.f65870j = cameraCaptureSession;
                SurfaceHolder holder = c.this.getHolder();
                if (holder != null) {
                    CaptureRequest.Builder builderCreateCaptureRequest = cameraCaptureSession.getDevice().createCaptureRequest(1);
                    builderCreateCaptureRequest.addTarget(holder.getSurface());
                    builderCreateCaptureRequest.addTarget(c.this.f65867g.getSurface());
                    c.this.setAndLockCameraOrientation(builderCreateCaptureRequest);
                    cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, c.this.f65866f);
                } else {
                    com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = c.this.f65855a;
                    if (aVar != null) {
                        aVar.onExceptionThrown(new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.INTERNAL_ERROR));
                    }
                }
            } catch (Exception e5) {
                com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar2 = c.this.f65855a;
                if (aVar2 != null) {
                    aVar2.onExceptionThrown(e5);
                }
            }
        }
    }

    public c(Activity activity) {
        super(activity);
        this.f65871k = false;
        this.f65872l = new Semaphore(1);
        a aVar = new a();
        this.m = aVar;
        this.f65873n = new b();
        this.f65874o = new C0272c();
        this.f65875p = new ImageReader.OnImageAvailableListener() { // from class: com.vasco.digipass.sdk.utils.qrcodescanner.h
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                this.f65881a.b(imageReader);
            }
        };
        try {
            getHolder().addCallback(aVar);
            HandlerThread handlerThread = new HandlerThread("background");
            this.f65865e = handlerThread;
            handlerThread.start();
            this.f65866f = new Handler(this.f65865e.getLooper());
        } catch (Exception e5) {
            com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar2 = this.f65855a;
            if (aVar2 != null) {
                aVar2.onExceptionThrown(e5);
            }
        }
    }

    private int a(boolean z10, int i10, int i11) {
        return z10 ? i10 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndLockCameraOrientation(CaptureRequest.Builder builder) {
        int iA;
        int rotation = this.f65857c.getWindowManager().getDefaultDisplay().getRotation();
        int i10 = 0;
        int i11 = 1;
        boolean z10 = getDeviceDefaultOrientation() == 2;
        try {
            if (this.f65869i != null) {
                int iIntValue = ((Integer) ((CameraManager) this.f65857c.getSystemService(Constants.CAMERA_SRC)).getCameraCharacteristics(this.f65869i).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                if (rotation == 0) {
                    iA = a(z10, 0, 1);
                } else if (rotation == 1) {
                    iA = a(z10, 9, 0);
                    i10 = 90;
                } else {
                    if (rotation != 2) {
                        if (rotation == 3) {
                            iA = a(z10, 1, 8);
                            i10 = BarcodeUtils.ROTATION_270;
                        }
                        this.f65857c.setRequestedOrientation(i11);
                        builder.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(((iIntValue - i10) + 360) % 360));
                    }
                    iA = a(z10, 8, 9);
                    i10 = 180;
                }
                i11 = iA;
                this.f65857c.setRequestedOrientation(i11);
                builder.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(((iIntValue - i10) + 360) % 360));
            }
        } catch (CameraAccessException e5) {
            com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = this.f65855a;
            if (aVar != null) {
                aVar.onExceptionThrown(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ImageReader imageReader) {
        try {
            if (this.f65871k) {
                Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                if (imageAcquireLatestImage != null) {
                    imageAcquireLatestImage.close();
                    return;
                }
                return;
            }
            this.f65871k = true;
            post(new j(this, imageReader, 5));
        } catch (Exception e5) {
            com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = this.f65855a;
            if (aVar != null) {
                aVar.onExceptionThrown(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Size a(SurfaceHolder surfaceHolder, Size[] sizeArr) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        float fA = a(surfaceFrame.width(), surfaceFrame.height());
        Size size = null;
        float f6 = 1024.0f;
        for (Size size2 : sizeArr) {
            if (size2.getHeight() * size2.getHeight() <= 2073600) {
                float fAbs = Math.abs(fA - a(size2.getWidth(), size2.getHeight()));
                if (fAbs < f6) {
                    size = size2;
                    f6 = fAbs;
                }
            }
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    public /* synthetic */ void a(ImageReader imageReader) throws Throwable {
        com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar;
        Image image;
        Image imageAcquireLatestImage;
        String str = null;
        try {
            try {
                try {
                    synchronized (this) {
                        try {
                            int i10 = -1;
                            if (this.f65858d) {
                                imageAcquireLatestImage = null;
                            } else {
                                imageAcquireLatestImage = imageReader.acquireLatestImage();
                                if (imageAcquireLatestImage != null) {
                                    if ((this.f65856b & 2) == 2) {
                                        com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.d dVar = new com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.d(imageAcquireLatestImage, a(imageAcquireLatestImage.getWidth(), imageAcquireLatestImage.getHeight()));
                                        str = QRCodeScannerSDKJNIWrapper.DecodeCrontoImage(dVar.a(), dVar.c(), dVar.b());
                                        if (str != null) {
                                            i10 = 2;
                                        }
                                    }
                                    if (str == null && (this.f65856b & 1) == 1) {
                                        int width = imageAcquireLatestImage.getWidth();
                                        int height = imageAcquireLatestImage.getHeight();
                                        com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.b bVar = new com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.b(imageAcquireLatestImage);
                                        bVar.a(a(width, height));
                                        byte[] bArrDecodeQRImage = QRCodeScannerSDKJNIWrapper.DecodeQRImage(bVar.a(), bVar.c(), bVar.b());
                                        if (bArrDecodeQRImage != null) {
                                            str = new String(bArrDecodeQRImage, StandardCharsets.UTF_8);
                                            i10 = 1;
                                        }
                                    }
                                }
                            }
                            image = imageAcquireLatestImage;
                            image = imageAcquireLatestImage;
                            if (!this.f65858d && str != null) {
                                this.f65858d = true;
                                this.f65855a.onScannedImage(str, i10);
                            }
                            if (image != null) {
                                image = imageReader;
                                image = imageAcquireLatestImage;
                                image.close();
                            }
                            image = imageReader;
                            image = imageAcquireLatestImage;
                            this.f65871k = false;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e5) {
                e = e5;
                imageReader = null;
                aVar = this.f65855a;
                image = imageReader;
                if (aVar != null) {
                    aVar.onExceptionThrown(e);
                }
            }
        } catch (Exception e7) {
            e = e7;
            aVar = this.f65855a;
            image = imageReader;
            if (aVar != null) {
                aVar.onExceptionThrown(e);
            }
        }
    }

    @Override // com.vasco.digipass.sdk.utils.qrcodescanner.a
    public void a() {
        try {
            this.f65872l.acquire();
            this.f65858d = true;
            CameraDevice cameraDevice = this.f65868h;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.f65868h = null;
            }
            CameraCaptureSession cameraCaptureSession = this.f65870j;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f65870j = null;
            }
            if (getHolder() != null) {
                getHolder().setFixedSize(0, 0);
            }
            ImageReader imageReader = this.f65867g;
            if (imageReader != null) {
                imageReader.close();
                this.f65867g = null;
            }
            this.f65855a = null;
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar = this.f65855a;
            if (aVar != null) {
                aVar.onExceptionThrown(e5);
            }
        } finally {
            this.f65872l.release();
        }
    }
}
