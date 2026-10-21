package com.dasnano.vddocumentcapture.managers;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.camera.core.impl.k;
import androidx.camera.core.processing.l;
import androidx.compose.material3.TooltipKt;
import com.dasnano.vddocumentcapture.GenericDocumentState;
import com.dasnano.vddocumentcapture.camera.resolution.DefaultCaptureResolutionSelectionStrategy;
import com.dasnano.vddocumentcapture.camera.resolution.DefaultPreviewResolutionSelectionStrategy;
import com.dasnano.vddocumentcapture.camera.resolution.LargestByAspectRatioPreviewResolutionSelectionStrategy;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.veridas.bidicode.entities.BidiCodeRegion;
import com.veridas.camera.Camera;
import com.veridas.camera.CameraAction;
import com.veridas.camera.CameraAdapter;
import com.veridas.camera.parameter.Parameter;
import com.veridas.camera.parameter.ParametersBuilder;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.PreviewResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import com.veridas.detect.obj.document.DocumentDetectorFactory;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public abstract class CameraManagerBase {
    protected static final int MAX_NUMBER_FOCUS_ATTEMPTS = 3;
    protected static final int MILLISECONDS_TO_WAIT_FOR_AUTOFOCUS_TO_RESPOND = 1500;
    protected Camera camera;
    protected DocumentFragment fragment;
    protected final AtomicBoolean isRunning;
    protected LayoutInterface layoutInterface;
    protected Vibrator vibrator;
    protected final List<Parameter.FocusMode> PREFERRED_FOCUS_MODES = Arrays.asList(Parameter.FocusMode.CONTINUOUS_PICTURE, Parameter.FocusMode.AUTO);
    protected final List<Parameter.FocusMode> PREFERRED_FRONT_FOCUS_MODES = Arrays.asList(Parameter.FocusMode.INFINITY, Parameter.FocusMode.FIXED);
    protected volatile int focusAttempts = 0;
    protected final AtomicBoolean autofocusResponded = new AtomicBoolean(false);
    protected final AtomicBoolean canDetectDocument = new AtomicBoolean(false);
    protected Resolution capturedImageResolution = null;
    protected Resolution previewImageResolution = null;
    protected Resolution optimalResolutionForMegapixels = null;
    protected Resolution optimalRatioSize = Resolution.OPTIMAL_ASPECT_RATIO;
    protected final AtomicBoolean isPreviewing = new AtomicBoolean(false);
    protected final AtomicBoolean canTakePicture = new AtomicBoolean(true);
    protected boolean configIntermittentIdentification = false;
    protected boolean configIsFrontFacingCamera = false;
    protected boolean configIsOnPictureVibration = false;
    protected boolean configMustShowDocument = false;
    protected boolean configUseSmartAndRectDetector = false;
    protected double configMegaPixels = 8.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f39403a = new a();
    protected Handler autofocusTaskHandler = new Handler();
    protected Handler taskHandler = new Handler();

    public interface LayoutInterface {
        void bidiCodeFound(BidiCodeRegion bidiCodeRegion);

        boolean canRepeatProcess();

        void correctSurfaceSize();

        void disableTextViewHelp();

        void dismissProgressDialogIfNeeded();

        void drawBidiCodesFound(Rect rect);

        void drawDocument(Rect rect);

        void endOfObverseCapture(CameraAction cameraAction);

        List<String> getDocumentType();

        GenericDocumentState getGenericDocumentState();

        List<String> getPossibleDocs();

        int getProgress();

        Rect getReferenceRect();

        void onPictureTaken(Picture picture, SpatialDetectionResult spatialDetectionResult, GenericDocumentState genericDocumentState);

        void restartCamera(CameraAction cameraAction);

        void setArrowAttributes(Rect rect);

        void setDocumentReferenceDocumentOrFaceRectangle(int i10);

        void setGenericDocumentState(GenericDocumentState genericDocumentState);

        void setLastPictureIsBlurry(boolean z10);

        void showCameraErrorAlert();

        void showValidationTick();
    }

    public class a extends CameraAdapter {
        public a() {
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onError(Camera camera, Camera.Error error) {
            CameraManagerBase cameraManagerBase = CameraManagerBase.this;
            GenericDocumentState genericDocumentState = cameraManagerBase.layoutInterface.getGenericDocumentState();
            VDLogger.log(Logger.Tag.CAMERA_ERROR, "in state: %s", genericDocumentState.name());
            cameraManagerBase.setCanTakePicture(false);
            cameraManagerBase.autofocusTaskHandler.removeCallbacksAndMessages(null);
            cameraManagerBase.taskHandler.removeCallbacksAndMessages(null);
            cameraManagerBase.setFocusAttempts(0);
            try {
                cameraManagerBase.restartCamera(new d(cameraManagerBase, genericDocumentState));
            } catch (Exception e5) {
                Log.e("CameraManagerBase", e5);
                cameraManagerBase.layoutInterface.showCameraErrorAlert();
            }
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onPictureReady(Camera camera, Picture picture) {
            CameraManagerBase.this.onPictureReady(camera, picture);
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onPreviewReady(Camera camera, Picture picture) {
            CameraManagerBase cameraManagerBase = CameraManagerBase.this;
            GenericDocumentState genericDocumentState = cameraManagerBase.layoutInterface.getGenericDocumentState();
            if (cameraManagerBase.isRunning.get() && !picture.isEmpty() && genericDocumentState != GenericDocumentState.CALCULATING_AWAITING) {
                cameraManagerBase.onPreviewReady(camera, picture, genericDocumentState);
            }
            if (cameraManagerBase.canDetectDocument.get()) {
                camera.requestFrame();
            }
            camera.recycle(picture);
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onPreviewStarted(Camera camera) {
            CameraManagerBase.this.h(null);
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onStarted(Camera camera) {
            camera.setPreviewMode(Camera.PreviewMode.PULL);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!CameraManagerBase.this.isPreviewing.get()) {
                CameraManagerBase.this.j(0);
                return;
            }
            int i10 = CameraManagerBase.this.focusAttempts;
            if (i10 == 1) {
                CameraManagerBase cameraManagerBase = CameraManagerBase.this;
                cameraManagerBase.autofocusTaskHandler.removeCallbacksAndMessages(null);
                cameraManagerBase.camera.stopAutoFocus(new z0.d(cameraManagerBase));
            } else if (i10 == 2) {
                CameraManagerBase cameraManagerBase2 = CameraManagerBase.this;
                cameraManagerBase2.camera.stopAutoFocus(new com.dasnano.vddocumentcapture.managers.a(cameraManagerBase2));
            } else if (i10 != 3) {
                VDLogger.log(Logger.Tag.FOCUS_ATTEMPT, "Last attempt to takePicture.");
                CameraManagerBase.this.j(0);
            } else {
                CameraManagerBase cameraManagerBase3 = CameraManagerBase.this;
                cameraManagerBase3.autofocusTaskHandler.removeCallbacksAndMessages(null);
                cameraManagerBase3.camera.stopAutoFocus(new androidx.camera.camera2.interop.d(cameraManagerBase3));
            }
        }
    }

    public CameraManagerBase(DocumentFragment documentFragment, LayoutInterface layoutInterface, AtomicBoolean atomicBoolean) {
        this.fragment = documentFragment;
        this.isRunning = atomicBoolean;
        this.layoutInterface = layoutInterface;
    }

    public static void a(CameraManagerBase cameraManagerBase) {
        cameraManagerBase.autofocusTaskHandler.postDelayed(new com.dasnano.vddocumentcapture.managers.b(cameraManagerBase), TooltipKt.TooltipDuration);
        cameraManagerBase.camera.startAutoFocus(new k.a(cameraManagerBase));
    }

    public static /* synthetic */ void b(CameraManagerBase cameraManagerBase) {
        cameraManagerBase.autofocusResponded.set(false);
        cameraManagerBase.setFocusMode(Parameter.FocusMode.AUTO, new j.a(cameraManagerBase));
    }

    public static void c(CameraManagerBase cameraManagerBase, boolean z10) {
        cameraManagerBase.autofocusResponded.set(true);
        cameraManagerBase.autofocusTaskHandler.removeCallbacksAndMessages(null);
        cameraManagerBase.camera.stopAutoFocus();
        if (!z10) {
            cameraManagerBase.tryToTakeAPictureOnFocus();
            VDLogger.log(Logger.Tag.FOCUS_ATTEMPT, "onAutoFocus failure.");
        } else {
            VDLogger.log(Logger.Tag.FOCUS_ATTEMPT, "onAutoFocus success. TakePicture with focus mode: %s", cameraManagerBase.camera.getProperties().getFocusMode().name());
            cameraManagerBase.j(0);
        }
    }

    public static void d(CameraManagerBase cameraManagerBase, boolean z10) {
        cameraManagerBase.autofocusResponded.set(true);
        cameraManagerBase.autofocusTaskHandler.removeCallbacksAndMessages(null);
        cameraManagerBase.camera.stopAutoFocus();
        if (!z10) {
            cameraManagerBase.tryToTakeAPictureOnFocus();
            VDLogger.log(Logger.Tag.FOCUS_ATTEMPT, "onAutoFocus failure.");
        } else {
            VDLogger.log(Logger.Tag.FOCUS_ATTEMPT, "onAutoFocus success. TakePicture with focus mode: %s", cameraManagerBase.camera.getProperties().getFocusMode().name());
            cameraManagerBase.j(0);
        }
    }

    public static void e(CameraManagerBase cameraManagerBase) {
        cameraManagerBase.autofocusTaskHandler.postDelayed(new com.dasnano.vddocumentcapture.managers.b(cameraManagerBase), TooltipKt.TooltipDuration);
        cameraManagerBase.camera.startAutoFocus(new k(cameraManagerBase));
    }

    public static /* synthetic */ void f(CameraManagerBase cameraManagerBase) {
        cameraManagerBase.autofocusResponded.set(false);
        cameraManagerBase.camera.createParametersBuilder().setFlashMode(Parameter.FlashMode.OFF).setFocusMode(Parameter.FocusMode.AUTO).build().apply(new androidx.camera.camera2.interop.f(cameraManagerBase));
    }

    public boolean canTryAnotherAttempt() {
        return this.focusAttempts <= 3;
    }

    public boolean compareRatiosWithError(float f6, float f10, float f11) {
        return Math.abs(f6 - f10) < f11;
    }

    public abstract SpatialDetectionResult detectDocumentInCapturedFrame(Picture picture);

    public Camera getCamera() {
        return this.camera;
    }

    public int getCameraSensorRotation() {
        return this.camera.getSensorRotation();
    }

    public int getCameraSensorRotationPicture() {
        return this.camera.getPictureRotation();
    }

    public Resolution getCapturedImageResolution() {
        return this.capturedImageResolution;
    }

    public Resolution getOptimalRatioSize() {
        return this.optimalRatioSize;
    }

    public Resolution getOptimalResolutionForMegapixels() {
        return this.optimalResolutionForMegapixels;
    }

    public Resolution getPreviewImageResolution() {
        return this.previewImageResolution;
    }

    public Vibrator getVibrator() {
        return this.vibrator;
    }

    public final void h(c cVar) {
        DefaultCaptureResolutionSelectionStrategy defaultCaptureResolutionSelectionStrategy = new DefaultCaptureResolutionSelectionStrategy((float) this.configMegaPixels);
        DefaultPreviewResolutionSelectionStrategy defaultPreviewResolutionSelectionStrategy = new DefaultPreviewResolutionSelectionStrategy();
        this.optimalResolutionForMegapixels = Resolution.findOptimalResolutionForMegapixels((float) this.configMegaPixels);
        ParametersBuilder whiteBalanceMode = this.camera.createParametersBuilder().setCaptureResolutionSelectionStrategy(defaultCaptureResolutionSelectionStrategy).setColorEffectMode(Parameter.ColorEffectMode.NONE).setFlashMode(Parameter.FlashMode.OFF).setPreferredCaptureResolution(this.optimalRatioSize).setCaptureMode(Parameter.CaptureMode.PICTURE).setPreferredPreviewResolution(this.optimalRatioSize).setPreviewResolutionSelectionStrategy(defaultPreviewResolutionSelectionStrategy).setSceneMode(Parameter.SceneMode.NONE).setWhiteBalanceMode(Parameter.WhiteBalanceMode.NONE);
        if (this.configIsFrontFacingCamera) {
            whiteBalanceMode.setFocusMode(this.PREFERRED_FRONT_FOCUS_MODES).setZoomLevel(24);
        } else {
            whiteBalanceMode.setFocusMode(this.PREFERRED_FOCUS_MODES);
        }
        whiteBalanceMode.build();
        i(whiteBalanceMode.getSelectedPreviewResolution(), whiteBalanceMode.getSelectedPictureResolution());
        whiteBalanceMode.apply(cVar);
    }

    public final void i(Resolution resolution, Resolution resolution2) {
        if (resolution.isEqualFormat(this.previewImageResolution) && resolution2.isEqualFormat(this.capturedImageResolution)) {
            return;
        }
        this.capturedImageResolution = resolution2;
        this.previewImageResolution = resolution;
        VDLogger.log(Logger.Tag.OPEN_CAMERA, "Preview size: %dx%d; Capture size: %dx%d", Integer.valueOf(resolution.width), Integer.valueOf(this.previewImageResolution.height), Integer.valueOf(this.capturedImageResolution.width), Integer.valueOf(this.capturedImageResolution.height));
    }

    public final void j(int i10) {
        if (this.canTakePicture.get()) {
            this.isPreviewing.set(false);
            setCanTakePicture(false);
            VDLogger.log(Logger.Tag.CAMERA_TAKE_PICTURE, "Calling mCamera.takePicture with ATTEMPTS: %d", Integer.valueOf(this.focusAttempts));
            if (i10 == 0) {
                this.camera.takePicture();
            } else {
                this.camera.takePicture(i10);
            }
        }
    }

    public void onPictureReady(Camera camera, Picture picture) {
        if (picture.isEmpty()) {
            return;
        }
        this.layoutInterface.disableTextViewHelp();
        SpatialDetectionResult spatialDetectionResultDetectDocumentInCapturedFrame = detectDocumentInCapturedFrame(picture);
        boolean outOfFocus = spatialDetectionResultDetectDocumentInCapturedFrame.getOutOfFocus();
        this.layoutInterface.setLastPictureIsBlurry(outOfFocus);
        if (outOfFocus && canTryAnotherAttempt()) {
            setCanTakePicture(true);
            tryToTakeAPictureOnFocus();
        } else {
            onPictureVibration();
            setFocusMode(Parameter.FocusMode.CONTINUOUS_PICTURE, new l(this, picture, spatialDetectionResultDetectDocumentInCapturedFrame));
        }
    }

    public void onPictureVibration() {
        Vibrator vibrator;
        if (this.configIsOnPictureVibration && (vibrator = this.vibrator) != null && vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.vibrator.vibrate(VibrationEffect.createOneShot(150L, -1));
            } else {
                this.vibrator.vibrate(150L);
            }
        }
    }

    public abstract void onPreviewReady(Camera camera, Picture picture, GenericDocumentState genericDocumentState);

    public void restartCamera(CameraAction cameraAction) {
        this.layoutInterface.restartCamera(cameraAction);
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
        camera.addCameraListener(this.f39403a);
    }

    public void setCanDetectDocument(boolean z10) {
        this.canDetectDocument.set(z10);
    }

    public void setCanTakePicture(boolean z10) {
        this.canTakePicture.set(z10);
    }

    public void setFocusAttempts(int i10) {
        this.focusAttempts = i10;
    }

    public void setFocusMode(List<Parameter.FocusMode> list) {
        setFocusMode(list, (CameraAction) null);
    }

    public void setVibrator(Vibrator vibrator) {
        this.vibrator = vibrator;
    }

    public boolean shouldShowDocument() {
        return this.configMustShowDocument;
    }

    public void start(DocumentDetectorFactory documentDetectorFactory, Context context, CameraAction cameraAction) {
        this.camera.setPreviewMode(Camera.PreviewMode.PULL);
        h(new c(this, cameraAction));
    }

    public void startCameraPreview(Resolution resolution, PreviewResolutionSelectionStrategy previewResolutionSelectionStrategy, CameraAction cameraAction) {
        ParametersBuilder parametersBuilderBuild = this.camera.createParametersBuilder().setPreviewResolutionSelectionStrategy(previewResolutionSelectionStrategy).setPreferredPreviewResolution(resolution).build();
        i(parametersBuilderBuild.getSelectedPreviewResolution(), parametersBuilderBuild.getSelectedPictureResolution());
        parametersBuilderBuild.apply(cameraAction);
    }

    public void startCameraPreviewWithBiggestResolution(Resolution resolution, CameraAction cameraAction) {
        startCameraPreview(resolution, new LargestByAspectRatioPreviewResolutionSelectionStrategy(), cameraAction);
    }

    public void startCameraPreviewWithNormalResolution(CameraAction cameraAction) {
        startCameraPreview(this.optimalRatioSize, new DefaultPreviewResolutionSelectionStrategy(), cameraAction);
    }

    public void stop() {
        Camera camera = this.camera;
        if (camera != null) {
            camera.removeCameraListener(this.f39403a);
        }
    }

    public void tryToTakeAPictureOnFocus() {
        this.focusAttempts++;
        this.taskHandler.postDelayed(new b(), 100L);
    }

    public void setFocusMode(List<Parameter.FocusMode> list, CameraAction cameraAction) {
        if (this.configIsFrontFacingCamera) {
            if (cameraAction != null) {
                cameraAction.execute(true);
                return;
            }
            return;
        }
        try {
            Camera camera = this.camera;
            if (camera != null) {
                camera.createParametersBuilder().setFocusMode(list).build().apply(cameraAction);
            }
        } catch (Exception e5) {
            Log.e("CameraManagerBase", e5);
        }
    }

    public void setFocusMode(Parameter.FocusMode focusMode) {
        setFocusMode(focusMode, (CameraAction) null);
    }

    public void setFocusMode(Parameter.FocusMode focusMode, CameraAction cameraAction) {
        setFocusMode(Arrays.asList(focusMode), cameraAction);
    }
}
