package com.veridas.camera;

import android.view.SurfaceView;
import android.view.TextureView;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.noknok.android.uaf.framework.service.ASMCommunicationClientProxy;
import com.veridas.camera.metrics.MeteringSession;
import com.veridas.camera.parameter.ParametersBuilder;
import com.veridas.camera.picture.Picture;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface Camera {
    public static final String LOG_TAG = "Camera";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Error {
        private static final /* synthetic */ Error[] $VALUES;
        public static final Error DEVICE;
        public static final Error DISABLED;
        public static final Error IN_USE;
        public static final Error MAX_IN_USE;
        public static final Error NONE;
        public static final Error SERVICE;
        public static final Error UNKNOWN;

        static {
            Error error = new Error(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = error;
            Error error2 = new Error("UNKNOWN", 1);
            UNKNOWN = error2;
            Error error3 = new Error("DEVICE", 2);
            DEVICE = error3;
            Error error4 = new Error("DISABLED", 3);
            DISABLED = error4;
            Error error5 = new Error("IN_USE", 4);
            IN_USE = error5;
            Error error6 = new Error("MAX_IN_USE", 5);
            MAX_IN_USE = error6;
            Error error7 = new Error(ASMCommunicationClientProxy.ASMDestinationType.ASM_SERVICE, 6);
            SERVICE = error7;
            $VALUES = new Error[]{error, error2, error3, error4, error5, error6, error7};
        }

        public Error() {
            throw null;
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Facing {
        private static final /* synthetic */ Facing[] $VALUES;
        public static final Facing BACK;
        public static final Facing FRONT;

        static {
            Facing facing = new Facing("FRONT", 0);
            FRONT = facing;
            Facing facing2 = new Facing("BACK", 1);
            BACK = facing2;
            $VALUES = new Facing[]{facing, facing2};
        }

        public Facing() {
            throw null;
        }

        public static Facing valueOf(String str) {
            return (Facing) Enum.valueOf(Facing.class, str);
        }

        public static Facing[] values() {
            return (Facing[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PreviewMode {
        private static final /* synthetic */ PreviewMode[] $VALUES;
        public static final PreviewMode PULL;
        public static final PreviewMode PUSH;

        static {
            PreviewMode previewMode = new PreviewMode("PUSH", 0);
            PUSH = previewMode;
            PreviewMode previewMode2 = new PreviewMode("PULL", 1);
            PULL = previewMode2;
            $VALUES = new PreviewMode[]{previewMode, previewMode2};
        }

        public PreviewMode() {
            throw null;
        }

        public static PreviewMode valueOf(String str) {
            return (PreviewMode) Enum.valueOf(PreviewMode.class, str);
        }

        public static PreviewMode[] values() {
            return (PreviewMode[]) $VALUES.clone();
        }
    }

    void addCameraListener(CameraListener cameraListener);

    ParametersBuilder createParametersBuilder();

    Facing getFacing();

    String getId();

    MeteringSession getMeteringSession();

    int getPictureRotation();

    PreviewMode getPreviewMode();

    CameraProperties getProperties();

    int getSensorOrientation();

    int getSensorRotation();

    void initializeMediaRecorder();

    void initializeMediaRecorder(MediaRecorderAction mediaRecorderAction);

    boolean isFacingBack();

    boolean isFacingFront();

    boolean isRecording();

    void recycle(Picture picture);

    void removeCameraListener(CameraListener cameraListener);

    void reorient(int i10);

    void requestFrame();

    void restartPreview();

    void restartPreview(CameraAction cameraAction);

    void setPreviewMode(@NotNull PreviewMode previewMode);

    void setPreviewSurface(SurfaceView surfaceView);

    void setPreviewSurface(TextureView textureView);

    void start();

    void start(CameraAction cameraAction);

    void startAutoFocus();

    void startAutoFocus(CameraAction cameraAction);

    void startMediaRecorder();

    void startMediaRecorder(CameraAction cameraAction);

    void startPreview();

    void startPreview(CameraAction cameraAction);

    void stop();

    void stop(CameraAction cameraAction);

    void stopAutoFocus();

    void stopAutoFocus(CameraAction cameraAction);

    void stopMediaRecorder();

    void stopMediaRecorder(CameraAction cameraAction);

    void stopPreview();

    void stopPreview(CameraAction cameraAction);

    void takePicture();

    void takePicture(int i10);

    void takePicture(int i10, CameraAction cameraAction);

    void takePicture(CameraAction cameraAction);
}
