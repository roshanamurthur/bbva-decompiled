package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class Camera2CapturePipeline {
    private static final Set<CameraCaptureMetaData.AeState> AE_CONVERGED_STATE_SET;
    private static final Set<CameraCaptureMetaData.AeState> AE_TORCH_AS_FLASH_CONVERGED_STATE_SET;
    private static final Set<CameraCaptureMetaData.AfState> AF_CONVERGED_STATE_SET = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AfState.PASSIVE_FOCUSED, CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED));
    private static final Set<CameraCaptureMetaData.AwbState> AWB_CONVERGED_STATE_SET = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AwbState.CONVERGED, CameraCaptureMetaData.AwbState.UNKNOWN));
    private static final String TAG = "Camera2CapturePipeline";

    @NonNull
    private final Camera2CameraControlImpl mCameraControl;

    @NonNull
    private final Quirks mCameraQuirk;

    @NonNull
    private final Executor mExecutor;
    private final boolean mIsLegacyDevice;
    private int mTemplate = 1;

    @NonNull
    private final UseTorchAsFlash mUseTorchAsFlash;

    public static class AePreCaptureTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        public AePreCaptureTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, int i10, @NonNull OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i10;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$0(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mCameraControl.getFocusMeteringControl().triggerAePrecapture(completer);
            this.mOverrideAeModeForStillCapture.onAePrecaptureStarted();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$preCapture$1(Void r1) {
            return Boolean.TRUE;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAePreCapture");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                this.mOverrideAeModeForStillCapture.onAePrecaptureFinished();
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            if (!Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                return Futures.immediateFuture(Boolean.FALSE);
            }
            Logger.d(Camera2CapturePipeline.TAG, "Trigger AE");
            this.mIsExecuted = true;
            return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.k0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.f1949p0.lambda$preCapture$0(completer);
                }
            })).transform(new l0(), CameraXExecutors.directExecutor());
        }
    }

    public static class AfTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted = false;

        public AfTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl) {
            this.mCameraControl = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAF");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(true, false);
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Integer num;
            ListenableFuture<Boolean> listenableFutureImmediateFuture = Futures.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return listenableFutureImmediateFuture;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                Logger.d(Camera2CapturePipeline.TAG, "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.d(Camera2CapturePipeline.TAG, "Trigger AF");
                    this.mIsExecuted = true;
                    this.mCameraControl.getFocusMeteringControl().triggerAf(null, false);
                }
            }
            return listenableFutureImmediateFuture;
        }
    }

    @VisibleForTesting
    public static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS;
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final int mTemplate;
        private long mTimeout3A = CHECK_3A_TIMEOUT_IN_NS;
        final List<PipelineTask> mTasks = new ArrayList();
        private final PipelineTask mPipelineSubTask = new AnonymousClass1();

        /* JADX INFO: renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1, reason: invalid class name */
        public class AnonymousClass1 implements PipelineTask {
            public AnonymousClass1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Boolean lambda$preCapture$0(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public boolean isCaptureResultNeeded() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    if (it.next().isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public void postCapture() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    it.next().postCapture();
                }
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            @NonNull
            public ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().preCapture(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new r0(), CameraXExecutors.directExecutor());
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CHECK_3A_TIMEOUT_IN_NS = timeUnit.toNanos(1L);
            CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(5L);
        }

        public Pipeline(int i10, @NonNull Executor executor, @NonNull Camera2CameraControlImpl camera2CameraControlImpl, boolean z10, @NonNull OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mTemplate = i10;
            this.mExecutor = executor;
            this.mCameraControl = camera2CameraControlImpl;
            this.mIsLegacyDevice = z10;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        @OptIn(markerClass = {ExperimentalCamera2Interop.class})
        private void applyAeModeQuirk(@NonNull CaptureConfig.Builder builder) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        private void applyStillCaptureTemplate(@NonNull CaptureConfig.Builder builder, @NonNull CaptureConfig captureConfig) {
            int i10;
            if (this.mTemplate != 3 || this.mIsLegacyDevice) {
                i10 = (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1;
            } else {
                i10 = 4;
            }
            if (i10 != -1) {
                builder.setTemplateType(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ ListenableFuture lambda$executeCapture$0(int i10, TotalCaptureResult totalCaptureResult) throws Exception {
            if (Camera2CapturePipeline.isFlashRequired(i10, totalCaptureResult)) {
                setTimeout3A(CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS);
            }
            return this.mPipelineSubTask.preCapture(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$executeCapture$1(TotalCaptureResult totalCaptureResult) {
            return Camera2CapturePipeline.is3AConverged(totalCaptureResult, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ ListenableFuture lambda$executeCapture$2(Boolean bool) throws Exception {
            return Boolean.TRUE.equals(bool) ? Camera2CapturePipeline.waitForResult(this.mTimeout3A, this.mCameraControl, new n0()) : Futures.immediateFuture(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ ListenableFuture lambda$executeCapture$3(List list, int i10, TotalCaptureResult totalCaptureResult) throws Exception {
            return submitConfigsInternal(list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$submitConfigsInternal$4(CaptureConfig.Builder builder, final CallbackToFutureAdapter.Completer completer) throws Exception {
            builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCancelled() {
                    completer.setException(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCompleted(@NonNull CameraCaptureResult cameraCaptureResult) {
                    completer.set(null);
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureFailed(@NonNull CameraCaptureFailure cameraCaptureFailure) {
                    completer.setException(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
                }
            });
            return "submitStillCapture";
        }

        private void setTimeout3A(long j10) {
            this.mTimeout3A = j10;
        }

        public void addTask(@NonNull PipelineTask pipelineTask) {
            this.mTasks.add(pipelineTask);
        }

        @NonNull
        public ListenableFuture<List<Void>> executeCapture(@NonNull final List<CaptureConfig> list, final int i10) {
            ListenableFuture listenableFutureImmediateFuture = Futures.immediateFuture(null);
            if (!this.mTasks.isEmpty()) {
                listenableFutureImmediateFuture = FutureChain.from(this.mPipelineSubTask.isCaptureResultNeeded() ? Camera2CapturePipeline.waitForResult(0L, this.mCameraControl, null) : Futures.immediateFuture(null)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.o0
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return this.f1966a.lambda$executeCapture$0(i10, (TotalCaptureResult) obj);
                    }
                }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.p0
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return this.f1971a.lambda$executeCapture$2((Boolean) obj);
                    }
                }, this.mExecutor);
            }
            FutureChain futureChainTransformAsync = FutureChain.from(listenableFutureImmediateFuture).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.q0
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.f1975a.lambda$executeCapture$3(list, i10, (TotalCaptureResult) obj);
                }
            }, this.mExecutor);
            PipelineTask pipelineTask = this.mPipelineSubTask;
            Objects.requireNonNull(pipelineTask);
            futureChainTransformAsync.addListener(new n(pipelineTask, 1), this.mExecutor);
            return futureChainTransformAsync;
        }

        @NonNull
        public ListenableFuture<List<Void>> submitConfigsInternal(@NonNull List<CaptureConfig> list, int i10) {
            ImageProxy imageProxyDequeueImageFromBuffer;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (CaptureConfig captureConfig : list) {
                final CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(captureConfig);
                CameraCaptureResult cameraCaptureResultRetrieveCameraCaptureResult = (captureConfig.getTemplateType() != 5 || this.mCameraControl.getZslControl().isZslDisabledByFlashMode() || this.mCameraControl.getZslControl().isZslDisabledByUserCaseConfig() || (imageProxyDequeueImageFromBuffer = this.mCameraControl.getZslControl().dequeueImageFromBuffer()) == null || !this.mCameraControl.getZslControl().enqueueImageToImageWriter(imageProxyDequeueImageFromBuffer)) ? null : CameraCaptureResults.retrieveCameraCaptureResult(imageProxyDequeueImageFromBuffer.getImageInfo());
                if (cameraCaptureResultRetrieveCameraCaptureResult != null) {
                    builderFrom.setCameraCaptureResult(cameraCaptureResultRetrieveCameraCaptureResult);
                } else {
                    applyStillCaptureTemplate(builderFrom, captureConfig);
                }
                if (this.mOverrideAeModeForStillCapture.shouldSetAeModeAlwaysFlash(i10)) {
                    applyAeModeQuirk(builderFrom);
                }
                arrayList.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.m0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return this.f1956p0.lambda$submitConfigsInternal$4(builderFrom, completer);
                    }
                }));
                arrayList2.add(builderFrom.build());
            }
            this.mCameraControl.submitCaptureRequestsInternal(arrayList2);
            return Futures.allAsList(arrayList);
        }
    }

    public interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        @NonNull
        ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult);
    }

    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {
        static final long NO_TIMEOUT = 0;
        private final Checker mChecker;
        private CallbackToFutureAdapter.Completer<TotalCaptureResult> mCompleter;
        private final long mTimeLimitNs;
        private final ListenableFuture<TotalCaptureResult> mFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.s0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f1987p0.lambda$new$0(completer);
            }
        });
        private volatile Long mTimestampOfFirstUpdateNs = null;

        public interface Checker {
            boolean check(@NonNull TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(long j10, @Nullable Checker checker) {
            this.mTimeLimitNs = j10;
            this.mChecker = checker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$new$0(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mCompleter = completer;
            return "waitFor3AResult";
        }

        @NonNull
        public ListenableFuture<TotalCaptureResult> getFuture() {
            return this.mFuture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
            Long l6 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l6 != null && this.mTimestampOfFirstUpdateNs == null) {
                this.mTimestampOfFirstUpdateNs = l6;
            }
            Long l7 = this.mTimestampOfFirstUpdateNs;
            if (0 == this.mTimeLimitNs || l7 == null || l6 == null || l6.longValue() - l7.longValue() <= this.mTimeLimitNs) {
                Checker checker = this.mChecker;
                if (checker != null && !checker.check(totalCaptureResult)) {
                    return false;
                }
                this.mCompleter.set(totalCaptureResult);
                return true;
            }
            this.mCompleter.set(null);
            Logger.d(Camera2CapturePipeline.TAG, "Wait for capture result timeout, current:" + l6 + " first: " + l7);
            return true;
        }
    }

    public static class TorchTask implements PipelineTask {
        private static final long CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final int mFlashMode;
        private boolean mIsExecuted = false;

        public TorchTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, int i10, @NonNull Executor executor) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i10;
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$0(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mCameraControl.getTorchControl().lambda$enableTorch$1(completer, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$preCapture$1(TotalCaptureResult totalCaptureResult) {
            return Camera2CapturePipeline.is3AConverged(totalCaptureResult, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ ListenableFuture lambda$preCapture$2(Void r4) throws Exception {
            return Camera2CapturePipeline.waitForResult(CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS, this.mCameraControl, new t0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$preCapture$3(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                this.mCameraControl.getTorchControl().lambda$enableTorch$1(null, false);
                Logger.d(Camera2CapturePipeline.TAG, "Turn off torch");
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            if (Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                if (!this.mCameraControl.isTorchOn()) {
                    Logger.d(Camera2CapturePipeline.TAG, "Turn on torch");
                    this.mIsExecuted = true;
                    return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.u0
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return this.f1994p0.lambda$preCapture$0(completer);
                        }
                    })).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.v0
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final ListenableFuture apply(Object obj) {
                            return this.f2000a.lambda$preCapture$2((Void) obj);
                        }
                    }, this.mExecutor).transform(new w0(), CameraXExecutors.directExecutor());
                }
                Logger.d(Camera2CapturePipeline.TAG, "Torch already on, not turn on");
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }
    }

    static {
        CameraCaptureMetaData.AeState aeState = CameraCaptureMetaData.AeState.CONVERGED;
        CameraCaptureMetaData.AeState aeState2 = CameraCaptureMetaData.AeState.FLASH_REQUIRED;
        CameraCaptureMetaData.AeState aeState3 = CameraCaptureMetaData.AeState.UNKNOWN;
        Set<CameraCaptureMetaData.AeState> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(aeState, aeState2, aeState3));
        AE_CONVERGED_STATE_SET = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(aeState2);
        enumSetCopyOf.remove(aeState3);
        AE_TORCH_AS_FLASH_CONVERGED_STATE_SET = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public Camera2CapturePipeline(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull Quirks quirks, @NonNull Executor executor) {
        this.mCameraControl = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.mIsLegacyDevice = num != null && num.intValue() == 2;
        this.mExecutor = executor;
        this.mCameraQuirk = quirks;
        this.mUseTorchAsFlash = new UseTorchAsFlash(quirks);
    }

    public static boolean is3AConverged(@Nullable TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        Camera2CameraCaptureResult camera2CameraCaptureResult = new Camera2CameraCaptureResult(totalCaptureResult);
        boolean z11 = camera2CameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.OFF || camera2CameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.UNKNOWN || AF_CONVERGED_STATE_SET.contains(camera2CameraCaptureResult.getAfState());
        boolean z12 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0;
        boolean z13 = !z10 ? !(z12 || AE_CONVERGED_STATE_SET.contains(camera2CameraCaptureResult.getAeState())) : !(z12 || AE_TORCH_AS_FLASH_CONVERGED_STATE_SET.contains(camera2CameraCaptureResult.getAeState()));
        boolean z14 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0 || AWB_CONVERGED_STATE_SET.contains(camera2CameraCaptureResult.getAwbState());
        Logger.d(TAG, "checkCaptureResult, AE=" + camera2CameraCaptureResult.getAeState() + " AF =" + camera2CameraCaptureResult.getAfState() + " AWB=" + camera2CameraCaptureResult.getAwbState());
        return z11 && z13 && z14;
    }

    public static boolean isFlashRequired(int i10, @Nullable TotalCaptureResult totalCaptureResult) {
        if (i10 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new AssertionError(i10);
    }

    private boolean isTorchAsFlash(int i10) {
        return this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mTemplate == 3 || i10 == 1;
    }

    @NonNull
    public static ListenableFuture<TotalCaptureResult> waitForResult(long j10, @NonNull Camera2CameraControlImpl camera2CameraControlImpl, @Nullable ResultListener.Checker checker) {
        ResultListener resultListener = new ResultListener(j10, checker);
        camera2CameraControlImpl.addCaptureResultListener(resultListener);
        return resultListener.getFuture();
    }

    public void setTemplate(int i10) {
        this.mTemplate = i10;
    }

    @NonNull
    public ListenableFuture<List<Void>> submitStillCaptures(@NonNull List<CaptureConfig> list, int i10, int i11, int i12) {
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(this.mCameraQuirk);
        Pipeline pipeline = new Pipeline(this.mTemplate, this.mExecutor, this.mCameraControl, this.mIsLegacyDevice, overrideAeModeForStillCapture);
        if (i10 == 0) {
            pipeline.addTask(new AfTask(this.mCameraControl));
        }
        if (isTorchAsFlash(i12)) {
            pipeline.addTask(new TorchTask(this.mCameraControl, i11, this.mExecutor));
        } else {
            pipeline.addTask(new AePreCaptureTask(this.mCameraControl, i11, overrideAeModeForStillCapture));
        }
        return Futures.nonCancellationPropagating(pipeline.executeCapture(list, i11));
    }
}
