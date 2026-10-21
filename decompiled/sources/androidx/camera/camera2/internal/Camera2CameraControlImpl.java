package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.AeFpsRange;
import androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
public class Camera2CameraControlImpl implements CameraControlInternal {
    private static final int DEFAULT_TEMPLATE = 1;
    private static final String TAG = "Camera2CameraControlImp";
    static final String TAG_SESSION_UPDATE_ID = "CameraControlSessionUpdateId";
    private final AeFpsRange mAeFpsRange;
    private final AutoFlashAEModeDisabler mAutoFlashAEModeDisabler;
    private final Camera2CameraControl mCamera2CameraControl;
    private final Camera2CapturePipeline mCamera2CapturePipeline;
    private final CameraCaptureCallbackSet mCameraCaptureCallbackSet;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private final CameraControlInternal.ControlUpdateCallback mControlUpdateCallback;
    private long mCurrentSessionUpdateId;
    final Executor mExecutor;
    private final ExposureControl mExposureControl;
    private volatile int mFlashMode;

    @NonNull
    private volatile ListenableFuture<Void> mFlashModeChangeSessionUpdateFuture;
    private final FocusMeteringControl mFocusMeteringControl;
    private volatile boolean mIsTorchOn;
    private final Object mLock;
    private final AtomicLong mNextSessionUpdateId;

    @VisibleForTesting
    final CameraControlSessionCallback mSessionCallback;
    private final SessionConfig.Builder mSessionConfigBuilder;
    private int mTemplate;
    private final TorchControl mTorchControl;

    @GuardedBy("mLock")
    private int mUseCount;
    private final ZoomControl mZoomControl;

    @VisibleForTesting
    ZslControl mZslControl;

    @RequiresApi(21)
    public static final class CameraCaptureCallbackSet extends CameraCaptureCallback {
        Set<CameraCaptureCallback> mCallbacks = new HashSet();
        Map<CameraCaptureCallback, Executor> mCallbackExecutors = new ArrayMap();

        public void addCaptureCallback(@NonNull Executor executor, @NonNull CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.add(cameraCaptureCallback);
            this.mCallbackExecutors.put(cameraCaptureCallback, executor);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
            for (CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new n(cameraCaptureCallback, 0));
                } catch (RejectedExecutionException e5) {
                    Logger.e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCancelled.", e5);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureResult cameraCaptureResult) {
            for (CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new o(cameraCaptureCallback, cameraCaptureResult, 0));
                } catch (RejectedExecutionException e5) {
                    Logger.e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCompleted.", e5);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(@NonNull final CameraCaptureFailure cameraCaptureFailure) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new Runnable() { // from class: androidx.camera.camera2.internal.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraCaptureCallback.onCaptureFailed(cameraCaptureFailure);
                        }
                    });
                } catch (RejectedExecutionException e5) {
                    Logger.e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureFailed.", e5);
                }
            }
        }

        public void removeCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.remove(cameraCaptureCallback);
            this.mCallbackExecutors.remove(cameraCaptureCallback);
        }
    }

    public static final class CameraControlSessionCallback extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        final Set<CaptureResultListener> mResultListeners = new HashSet();

        public CameraControlSessionCallback(@NonNull Executor executor) {
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureCompleted$0(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (CaptureResultListener captureResultListener : this.mResultListeners) {
                if (captureResultListener.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(captureResultListener);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.mResultListeners.removeAll(hashSet);
        }

        public void addListener(@NonNull CaptureResultListener captureResultListener) {
            this.mResultListeners.add(captureResultListener);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new p(this, totalCaptureResult, 0));
        }

        public void removeListener(@NonNull CaptureResultListener captureResultListener) {
            this.mResultListeners.remove(captureResultListener);
        }
    }

    public interface CaptureResultListener {
        boolean onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult);
    }

    @VisibleForTesting
    public Camera2CameraControlImpl(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor, @NonNull CameraControlInternal.ControlUpdateCallback controlUpdateCallback) {
        this(cameraCharacteristicsCompat, scheduledExecutorService, executor, controlUpdateCallback, new Quirks(new ArrayList()));
    }

    private int getSupportedAwbMode(int i10) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i10, iArr)) {
            return i10;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    private boolean isControlInUse() {
        return getUseCount() > 0;
    }

    private boolean isModeInList(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSessionUpdated(@NonNull TotalCaptureResult totalCaptureResult, long j10) {
        Long l6;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof TagBundle) && (l6 = (Long) ((TagBundle) tag).getTag(TAG_SESSION_UPDATE_ID)) != null && l6.longValue() >= j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSessionCameraCaptureCallback$8(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.addCaptureCallback(executor, cameraCaptureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        addCaptureResultListener(this.mCamera2CameraControl.getCaptureRequestListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSessionCameraCaptureCallback$9(CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.removeCaptureCallback(cameraCaptureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ListenableFuture lambda$submitStillCaptureRequests$5(List list, int i10, int i11, int i12, Void r10) throws Exception {
        return this.mCamera2CapturePipeline.submitStillCaptures(list, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSessionConfigAsync$6(CallbackToFutureAdapter.Completer completer) {
        Futures.propagate(waitForSessionUpdateId(updateSessionConfigSynchronous()), completer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$updateSessionConfigAsync$7(CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new k(this, completer, 0));
        return "updateSessionConfigAsync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$waitForSessionUpdateId$3(long j10, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        if (!isSessionUpdated(totalCaptureResult, j10)) {
            return false;
        }
        completer.set(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$waitForSessionUpdateId$4(final long j10, final CallbackToFutureAdapter.Completer completer) throws Exception {
        addCaptureResultListener(new CaptureResultListener() { // from class: androidx.camera.camera2.internal.i
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return Camera2CameraControlImpl.lambda$waitForSessionUpdateId$3(j10, completer, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    @NonNull
    private ListenableFuture<Void> waitForSessionUpdateId(final long j10) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.h
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f1923p0.lambda$waitForSessionUpdateId$4(j10, completer);
            }
        });
    }

    public void addCaptureResultListener(@NonNull CaptureResultListener captureResultListener) {
        this.mSessionCallback.addListener(captureResultListener);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(@NonNull Config config) {
        this.mCamera2CameraControl.addCaptureRequestOptions(CaptureRequestOptions.Builder.from(config).build()).addListener(new l(), CameraXExecutors.directExecutor());
    }

    public void addSessionCameraCaptureCallback(@NonNull Executor executor, @NonNull CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new g(this, executor, 0, cameraCaptureCallback));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(@NonNull SessionConfig.Builder builder) {
        this.mZslControl.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> cancelFocusAndMetering() {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mFocusMeteringControl.cancelFocusAndMetering());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCamera2CameraControl.clearCaptureRequestOptions().addListener(new f(), CameraXExecutors.directExecutor());
    }

    public void decrementUseCount() {
        synchronized (this.mLock) {
            try {
                int i10 = this.mUseCount;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.mUseCount = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> enableTorch(boolean z10) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mTorchControl.enableTorch(z10));
    }

    public void enableTorchInternal(boolean z10) {
        this.mIsTorchOn = z10;
        if (!z10) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(1)));
            builder2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
            builder.addImplementationOptions(builder2.build());
            submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
        }
        updateSessionConfigSynchronous();
    }

    @NonNull
    public Camera2CameraControl getCamera2CameraControl() {
        return this.mCamera2CameraControl;
    }

    @NonNull
    public Rect getCropSensorRegion() {
        return this.mZoomControl.getCropSensorRegion();
    }

    @VisibleForTesting
    public long getCurrentSessionUpdateId() {
        return this.mCurrentSessionUpdateId;
    }

    @NonNull
    public ExposureControl getExposureControl() {
        return this.mExposureControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mFlashMode;
    }

    @NonNull
    public FocusMeteringControl getFocusMeteringControl() {
        return this.mFocusMeteringControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Config getInteropConfig() {
        return this.mCamera2CameraControl.getCamera2ImplConfig();
    }

    public int getMaxAeRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAfRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAwbRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Rect getSensorRect() {
        return (Rect) Preconditions.checkNotNull((Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public SessionConfig getSessionConfig() {
        this.mSessionConfigBuilder.setTemplateType(this.mTemplate);
        this.mSessionConfigBuilder.setImplementationOptions(getSessionOptions());
        Object captureRequestTag = this.mCamera2CameraControl.getCamera2ImplConfig().getCaptureRequestTag(null);
        if (captureRequestTag != null && (captureRequestTag instanceof Integer)) {
            this.mSessionConfigBuilder.addTag(Camera2CameraControl.TAG_KEY, captureRequestTag);
        }
        this.mSessionConfigBuilder.addTag(TAG_SESSION_UPDATE_ID, Long.valueOf(this.mCurrentSessionUpdateId));
        return this.mSessionConfigBuilder.build();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073 A[LOOP:0: B:12:0x006d->B:14:0x0073, LOOP_END] */
    @VisibleForTesting
    public Config getSessionOptions() {
        int correctedAeMode;
        Camera2ImplConfig camera2ImplConfig;
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_MODE, 1);
        this.mFocusMeteringControl.addFocusMeteringOptions(builder);
        this.mAeFpsRange.addAeFpsRangeOptions(builder);
        this.mZoomControl.addZoomOption(builder);
        if (!this.mIsTorchOn) {
            int i10 = this.mFlashMode;
            if (i10 == 0) {
                correctedAeMode = this.mAutoFlashAEModeDisabler.getCorrectedAeMode(2);
            } else if (i10 == 1) {
                correctedAeMode = 3;
            }
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(correctedAeMode)));
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(getSupportedAwbMode(1)));
            this.mExposureControl.setCaptureRequestOption(builder);
            camera2ImplConfig = this.mCamera2CameraControl.getCamera2ImplConfig();
            camera2ImplConfig.getClass();
            for (Config.Option option : androidx.camera.core.impl.e0.e(camera2ImplConfig)) {
                builder.getMutableConfig().insertOption(option, Config.OptionPriority.ALWAYS_OVERRIDE, androidx.camera.core.impl.e0.f(camera2ImplConfig, option));
            }
            return builder.build();
        }
        builder.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 2);
        correctedAeMode = 1;
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(correctedAeMode)));
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(getSupportedAwbMode(1)));
        this.mExposureControl.setCaptureRequestOption(builder);
        camera2ImplConfig = this.mCamera2CameraControl.getCamera2ImplConfig();
        camera2ImplConfig.getClass();
        while (r2.hasNext()) {
            builder.getMutableConfig().insertOption(option, Config.OptionPriority.ALWAYS_OVERRIDE, androidx.camera.core.impl.e0.f(camera2ImplConfig, option));
        }
        return builder.build();
    }

    public int getSupportedAeMode(int i10) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i10, iArr)) {
            return i10;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    public int getSupportedAfMode(int i10) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i10, iArr)) {
            return i10;
        }
        if (isModeInList(4, iArr)) {
            return 4;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    @NonNull
    public TorchControl getTorchControl() {
        return this.mTorchControl;
    }

    @VisibleForTesting
    public int getUseCount() {
        int i10;
        synchronized (this.mLock) {
            i10 = this.mUseCount;
        }
        return i10;
    }

    @NonNull
    public ZoomControl getZoomControl() {
        return this.mZoomControl;
    }

    @NonNull
    public ZslControl getZslControl() {
        return this.mZslControl;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            this.mUseCount++;
        }
    }

    public boolean isTorchOn() {
        return this.mIsTorchOn;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mZslControl.isZslDisabledByUserCaseConfig();
    }

    public void removeCaptureResultListener(@NonNull CaptureResultListener captureResultListener) {
        this.mSessionCallback.removeListener(captureResultListener);
    }

    public void removeSessionCameraCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new v(this, cameraCaptureCallback, 1));
    }

    public void resetTemplate() {
        setTemplate(1);
    }

    public void setActive(boolean z10) {
        this.mFocusMeteringControl.setActive(z10);
        this.mZoomControl.setActive(z10);
        this.mTorchControl.setActive(z10);
        this.mExposureControl.setActive(z10);
        this.mCamera2CameraControl.setActive(z10);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Integer> setExposureCompensationIndex(int i10) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : this.mExposureControl.setExposureCompensationIndex(i10);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i10) {
        if (!isControlInUse()) {
            Logger.w(TAG, "Camera is not active.");
            return;
        }
        this.mFlashMode = i10;
        ZslControl zslControl = this.mZslControl;
        boolean z10 = true;
        if (this.mFlashMode != 1 && this.mFlashMode != 0) {
            z10 = false;
        }
        zslControl.setZslDisabledByFlashMode(z10);
        this.mFlashModeChangeSessionUpdateFuture = updateSessionConfigAsync();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setLinearZoom(float f6) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mZoomControl.setLinearZoom(f6));
    }

    public void setPreviewAspectRatio(@Nullable Rational rational) {
        this.mFocusMeteringControl.setPreviewAspectRatio(rational);
    }

    public void setTemplate(int i10) {
        this.mTemplate = i10;
        this.mFocusMeteringControl.setTemplate(i10);
        this.mCamera2CapturePipeline.setTemplate(this.mTemplate);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setZoomRatio(float f6) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mZoomControl.setZoomRatio(f6));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z10) {
        this.mZslControl.setZslDisabledByUserCaseConfig(z10);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mFocusMeteringControl.startFocusAndMetering(focusMeteringAction));
    }

    public void submitCaptureRequestsInternal(List<CaptureConfig> list) {
        this.mControlUpdateCallback.onCameraControlCaptureRequests(list);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public ListenableFuture<List<Void>> submitStillCaptureRequests(@NonNull final List<CaptureConfig> list, final int i10, final int i11) {
        if (isControlInUse()) {
            final int flashMode = getFlashMode();
            return FutureChain.from(Futures.nonCancellationPropagating(this.mFlashModeChangeSessionUpdateFuture)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.j
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.f1936a.lambda$submitStillCaptureRequests$5(list, i10, flashMode, i11, (Void) obj);
                }
            }, this.mExecutor);
        }
        Logger.w(TAG, "Camera is not active.");
        return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    public void updateSessionConfig() {
        this.mExecutor.execute(new d(this, 0));
    }

    @NonNull
    public ListenableFuture<Void> updateSessionConfigAsync() {
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.e
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f1894p0.lambda$updateSessionConfigAsync$7(completer);
            }
        }));
    }

    public long updateSessionConfigSynchronous() {
        this.mCurrentSessionUpdateId = this.mNextSessionUpdateId.getAndIncrement();
        this.mControlUpdateCallback.onCameraControlUpdateSessionConfig();
        return this.mCurrentSessionUpdateId;
    }

    public Camera2CameraControlImpl(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor, @NonNull CameraControlInternal.ControlUpdateCallback controlUpdateCallback, @NonNull Quirks quirks) {
        this.mLock = new Object();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.mSessionConfigBuilder = builder;
        this.mUseCount = 0;
        this.mIsTorchOn = false;
        this.mFlashMode = 2;
        this.mNextSessionUpdateId = new AtomicLong(0L);
        this.mFlashModeChangeSessionUpdateFuture = Futures.immediateFuture(null);
        this.mTemplate = 1;
        this.mCurrentSessionUpdateId = 0L;
        CameraCaptureCallbackSet cameraCaptureCallbackSet = new CameraCaptureCallbackSet();
        this.mCameraCaptureCallbackSet = cameraCaptureCallbackSet;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mControlUpdateCallback = controlUpdateCallback;
        this.mExecutor = executor;
        CameraControlSessionCallback cameraControlSessionCallback = new CameraControlSessionCallback(executor);
        this.mSessionCallback = cameraControlSessionCallback;
        builder.setTemplateType(this.mTemplate);
        builder.addRepeatingCameraCaptureCallback(CaptureCallbackContainer.create(cameraControlSessionCallback));
        builder.addRepeatingCameraCaptureCallback(cameraCaptureCallbackSet);
        this.mExposureControl = new ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.mFocusMeteringControl = new FocusMeteringControl(this, scheduledExecutorService, executor, quirks);
        this.mZoomControl = new ZoomControl(this, cameraCharacteristicsCompat, executor);
        this.mTorchControl = new TorchControl(this, cameraCharacteristicsCompat, executor);
        this.mZslControl = new ZslControlImpl(cameraCharacteristicsCompat);
        this.mAeFpsRange = new AeFpsRange(quirks);
        this.mAutoFlashAEModeDisabler = new AutoFlashAEModeDisabler(quirks);
        this.mCamera2CameraControl = new Camera2CameraControl(this, executor);
        this.mCamera2CapturePipeline = new Camera2CapturePipeline(this, cameraCharacteristicsCompat, quirks, executor);
        executor.execute(new q1(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addInteropConfig$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearInteropConfig$2() {
    }
}
