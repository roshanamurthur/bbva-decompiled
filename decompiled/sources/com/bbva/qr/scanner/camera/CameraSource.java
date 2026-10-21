package com.bbva.qr.scanner.camera;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.qr.extension.LoggerKt;
import com.bbva.qr.scanner.camera.CameraSource;
import com.bbva.qr.scanner.camera.FrameProcessor;
import com.bbva.qr.scanner.detectors.Detector;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.budiyev.android.codescanner.BarcodeUtils;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CameraSource.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/bbva/qr/scanner/camera/CameraSource;", "", "Landroid/view/SurfaceHolder;", "surface", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", ImageScaleTypeHandler.ID, "", "doZoom", "Lcom/bbva/qr/scanner/camera/Picture;", "d", "Lcom/bbva/qr/scanner/camera/Picture;", "getPicture", "()Lcom/bbva/qr/scanner/camera/Picture;", "setPicture", "(Lcom/bbva/qr/scanner/camera/Picture;)V", "picture", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFacing", "()I", "setFacing", "(I)V", "facing", "Landroid/content/Context;", "context", "Lcom/bbva/qr/scanner/detectors/Detector;", "detector", "Lcom/bbva/qr/scanner/camera/CameraOptions;", "options", "<init>", "(Landroid/content/Context;Lcom/bbva/qr/scanner/detectors/Detector;Lcom/bbva/qr/scanner/camera/CameraOptions;)V", "qr_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCameraSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraSource.kt\ncom/bbva/qr/scanner/camera/CameraSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class CameraSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Detector f36294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CameraOptions f36295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Picture picture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int facing;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Object f36298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Camera f36299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f36300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Thread f36302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public FrameProcessor f36303k;

    public CameraSource(@NotNull Context context, @NotNull Detector detector, @NotNull CameraOptions options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f36293a = context;
        this.f36294b = detector;
        this.f36295c = options;
        this.facing = options.getFacing().getValue();
        this.f36298f = new Object();
        this.f36300h = new LinkedHashMap();
    }

    public final void a(Camera camera, Camera.Parameters parameters, int i10) {
        int i11;
        Object systemService = this.f36293a.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
        int i12 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i12 = 90;
            } else if (rotation == 2) {
                i12 = 180;
            } else if (rotation != 3) {
                LoggerKt.logError$default("Bad rotation value: " + this.f36301i, null, 2, null);
            } else {
                i12 = BarcodeUtils.ROTATION_270;
            }
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i10, cameraInfo);
        if (cameraInfo.facing == 1) {
            int i13 = (cameraInfo.orientation + i12) % 360;
            this.f36301i = i13;
            i11 = (360 - i13) % 360;
        } else {
            i11 = ((cameraInfo.orientation - i12) + 360) % 360;
            this.f36301i = i11;
        }
        camera.setDisplayOrientation(i11);
        parameters.setRotation(this.f36301i);
    }

    public final Camera b() {
        CameraOptions cameraOptions;
        Integer numValueOf;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        int i10 = 0;
        while (true) {
            cameraOptions = this.f36295c;
            if (i10 >= numberOfCameras) {
                numValueOf = null;
                break;
            }
            Camera.getCameraInfo(i10, cameraInfo);
            if (cameraInfo.facing == cameraOptions.getFacing().getValue()) {
                numValueOf = Integer.valueOf(i10);
                break;
            }
            i10++;
        }
        if (numValueOf == null) {
            throw new RuntimeException("Could not find requested camera.");
        }
        int iIntValue = numValueOf.intValue();
        try {
            stop();
            Camera cameraOpen = Camera.open(iIntValue);
            if (cameraOpen == null) {
                throw new RuntimeException("Could not open camera.");
            }
            Preview preview = new Preview(cameraOpen, 0.0d, 2, null);
            Picture pictureSelectPictureSize = preview.selectPictureSize(cameraOptions.getPreviewSize());
            if (pictureSelectPictureSize == null) {
                throw new RuntimeException("Could not find suitable preview size.");
            }
            int[] iArrSelectFpsRange = preview.selectFpsRange(cameraOptions.getRequestedFps());
            if (iArrSelectFpsRange == null) {
                throw new RuntimeException("No suitable preview frames per second range available.");
            }
            Camera.Parameters parameters = cameraOpen.getParameters();
            Camera.Size content = pictureSelectPictureSize.getContent();
            if (content != null) {
                parameters.setPictureSize(content.width, content.height);
            }
            parameters.setPreviewSize(pictureSelectPictureSize.getPreview().width, pictureSelectPictureSize.getPreview().height);
            parameters.setPreviewFpsRange(iArrSelectFpsRange[0], iArrSelectFpsRange[1]);
            parameters.setPreviewFormat(17);
            a(cameraOpen, parameters, iIntValue);
            if (cameraOptions.getFocusMode() != null) {
                if (parameters.getSupportedFocusModes().contains(cameraOptions.getFocusMode().getValue())) {
                    parameters.setFocusMode(cameraOptions.getFocusMode().getValue());
                } else {
                    LoggerKt.logError$default("Camera focus mode: " + parameters.getFocusMode() + " is not supported on this device.", null, 2, null);
                }
            }
            if (cameraOptions.getFlashMode() != null) {
                if (parameters.getSupportedFlashModes().contains(cameraOptions.getFlashMode().getValue())) {
                    parameters.setFlashMode(cameraOptions.getFlashMode().getValue());
                } else {
                    LoggerKt.logError$default("Camera flash mode: " + parameters.getFlashMode() + " is not supported on this device.", null, 2, null);
                }
            }
            cameraOpen.setParameters(parameters);
            cameraOpen.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: ub.a
                @Override // android.hardware.Camera.PreviewCallback
                public final void onPreviewFrame(byte[] data, Camera camera) {
                    CameraSource this$0 = this.f93770p0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    FrameProcessor frameProcessor = this$0.f36303k;
                    if (frameProcessor != null) {
                        LinkedHashMap linkedHashMap = this$0.f36300h;
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        frameProcessor.nextFrame(linkedHashMap, data);
                    }
                }
            });
            cameraOpen.addCallbackBuffer(c(pictureSelectPictureSize.getPreview()));
            cameraOpen.addCallbackBuffer(c(pictureSelectPictureSize.getPreview()));
            cameraOpen.addCallbackBuffer(c(pictureSelectPictureSize.getPreview()));
            cameraOpen.addCallbackBuffer(c(pictureSelectPictureSize.getPreview()));
            this.f36299g = cameraOpen;
            this.picture = pictureSelectPictureSize;
            Intrinsics.checkNotNull(cameraOpen);
            return cameraOpen;
        } catch (Throwable unused) {
            throw new RuntimeException("Error while opening camera resource.");
        }
    }

    public final byte[] c(Camera.Size size) {
        byte[] bArr = new byte[((int) Math.ceil(((double) ((size.height * size.width) * ImageFormat.getBitsPerPixel(17))) / 8.0d)) + 1];
        ByteBuffer buffer = ByteBuffer.wrap(bArr);
        if (!buffer.hasArray() || !Intrinsics.areEqual(buffer.array(), bArr)) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.".toString());
        }
        LinkedHashMap linkedHashMap = this.f36300h;
        Intrinsics.checkNotNullExpressionValue(buffer, "buffer");
        linkedHashMap.put(bArr, buffer);
        return bArr;
    }

    public final int doZoom(float scale) {
        float f6;
        synchronized (this.f36298f) {
            Camera camera = this.f36299g;
            int i10 = 0;
            if (camera == null) {
                return 0;
            }
            Intrinsics.checkNotNull(camera);
            Camera.Parameters parameters = camera.getParameters();
            if (!parameters.isZoomSupported()) {
                LoggerKt.logError$default("Zoom is not supported on this device", null, 2, null);
                return 0;
            }
            int zoom = parameters.getZoom() + 1;
            int maxZoom = parameters.getMaxZoom();
            if (scale > 1.0f) {
                f6 = (scale * (maxZoom / 10)) + zoom;
            } else {
                f6 = scale * zoom;
            }
            int iRoundToInt = c.roundToInt(f6) - 1;
            if (iRoundToInt >= 0) {
                i10 = iRoundToInt > maxZoom ? maxZoom : iRoundToInt;
            }
            parameters.setZoom(i10);
            Camera camera2 = this.f36299g;
            Intrinsics.checkNotNull(camera2);
            camera2.setParameters(parameters);
            return i10;
        }
    }

    public final int getFacing() {
        return this.facing;
    }

    @Nullable
    public final Picture getPicture() {
        return this.picture;
    }

    public final void setFacing(int i10) {
        this.facing = i10;
    }

    public final void setPicture(@Nullable Picture picture) {
        this.picture = picture;
    }

    public final void start(@NotNull SurfaceHolder surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.f36298f) {
            if (this.f36299g != null) {
                return;
            }
            Camera cameraB = b();
            cameraB.setPreviewDisplay(surface);
            cameraB.startPreview();
            Picture picture = this.picture;
            if (picture != null) {
                FrameProcessor frameProcessor = new FrameProcessor(cameraB, picture.getPreview(), this.f36294b);
                frameProcessor.setRotation(this.f36301i);
                frameProcessor.setActive(true);
                this.f36303k = frameProcessor;
                Thread thread = new Thread(this.f36303k);
                this.f36302j = thread;
                thread.start();
            }
        }
    }

    public final void stop() {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        synchronized (this.f36298f) {
            try {
                FrameProcessor frameProcessor = this.f36303k;
                if (frameProcessor != null) {
                    frameProcessor.setActive(false);
                }
                Thread thread = this.f36302j;
                if (thread != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        thread.join();
                        objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
                        LoggerKt.logError$default("Frame processing thread interrupted on release.", null, 2, null);
                    }
                    this.f36302j = null;
                }
                this.f36300h.clear();
                Camera camera = this.f36299g;
                if (camera != null) {
                    camera.stopPreview();
                    camera.setPreviewCallbackWithBuffer(null);
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        camera.setPreviewTexture(null);
                        objM5535constructorimpl2 = Result.m5535constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th3) {
                        Result.Companion companion4 = Result.INSTANCE;
                        objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th3));
                    }
                    Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
                    if (thM5538exceptionOrNullimpl != null) {
                        LoggerKt.logError$default("Failed to clear camera preview: " + thM5538exceptionOrNullimpl, null, 2, null);
                    }
                    camera.release();
                    this.f36299g = null;
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
