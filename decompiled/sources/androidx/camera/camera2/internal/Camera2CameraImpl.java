package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraState;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import com.nulabinc.zxcvbn.Guess;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class Camera2CameraImpl implements CameraInternal {
    private static final int ERROR_NONE = 0;
    private static final String TAG = "Camera2CameraImpl";
    private final CameraAvailability mCameraAvailability;

    @NonNull
    private CameraConfig mCameraConfig;
    private final Camera2CameraControlImpl mCameraControlInternal;

    @Nullable
    CameraDevice mCameraDevice;
    int mCameraDeviceError;

    @NonNull
    final Camera2CameraInfoImpl mCameraInfoInternal;
    private final CameraManagerCompat mCameraManager;
    private final CameraStateMachine mCameraStateMachine;
    private final CameraStateRegistry mCameraStateRegistry;
    CaptureSessionInterface mCaptureSession;

    @NonNull
    private final SynchronizedCaptureSessionOpener.Builder mCaptureSessionOpenerBuilder;

    @NonNull
    private final CaptureSessionRepository mCaptureSessionRepository;
    final Set<CaptureSession> mConfiguringForClose;

    @NonNull
    private final DisplayInfoManager mDisplayInfoManager;
    private final Executor mExecutor;
    boolean mIsActiveResumingMode;
    final Object mLock;
    private MeteringRepeatingSession mMeteringRepeatingSession;
    private final Set<String> mNotifyStateAttachedSet;
    private final LiveDataObservable<CameraInternal.State> mObservableState;
    final AtomicInteger mReleaseRequestCount;
    final Map<CaptureSessionInterface, ListenableFuture<Void>> mReleasedCaptureSessions;
    private final ScheduledExecutorService mScheduledExecutorService;

    @Nullable
    @GuardedBy("mLock")
    private SessionProcessor mSessionProcessor;
    volatile InternalState mState = InternalState.INITIALIZED;
    private final StateCallback mStateCallback;
    private final UseCaseAttachState mUseCaseAttachState;
    ListenableFuture<Void> mUserReleaseFuture;
    CallbackToFutureAdapter.Completer<Void> mUserReleaseNotifier;

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState;

        static {
            int[] iArr = new int[InternalState.values().length];
            $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState = iArr;
            try {
                iArr[InternalState.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[InternalState.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[InternalState.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[InternalState.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[InternalState.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[InternalState.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[InternalState.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[InternalState.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final class CameraAvailability extends CameraManager.AvailabilityCallback implements CameraStateRegistry.OnOpenAvailableListener {
        private boolean mCameraAvailable = true;
        private final String mCameraId;

        public CameraAvailability(String str) {
            this.mCameraId = str;
        }

        public boolean isCameraAvailable() {
            return this.mCameraAvailable;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(@NonNull String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = true;
                if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN) {
                    Camera2CameraImpl.this.tryOpenCameraDevice(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(@NonNull String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = false;
            }
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener
        public void onOpenAvailable() {
            if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN) {
                Camera2CameraImpl.this.tryOpenCameraDevice(false);
            }
        }
    }

    public final class ControlUpdateListenerInternal implements CameraControlInternal.ControlUpdateCallback {
        public ControlUpdateListenerInternal() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlCaptureRequests(@NonNull List<CaptureConfig> list) {
            Camera2CameraImpl.this.submitCaptureRequests((List) Preconditions.checkNotNull(list));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlUpdateSessionConfig() {
            Camera2CameraImpl.this.updateCaptureSessionConfig();
        }
    }

    public enum InternalState {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    @RequiresApi(21)
    public final class StateCallback extends CameraDevice.StateCallback {

        @NonNull
        private final CameraReopenMonitor mCameraReopenMonitor = new CameraReopenMonitor();
        private final Executor mExecutor;
        ScheduledFuture<?> mScheduledReopenHandle;
        private ScheduledReopen mScheduledReopenRunnable;
        private final ScheduledExecutorService mScheduler;

        public class CameraReopenMonitor {
            static final int ACTIVE_REOPEN_DELAY_BASE_MS = 1000;
            static final int ACTIVE_REOPEN_LIMIT_MS = 1800000;
            static final int INVALID_TIME = -1;
            static final int REOPEN_DELAY_MS = 700;
            static final int REOPEN_LIMIT_MS = 10000;
            private long mFirstReopenTime = -1;

            public CameraReopenMonitor() {
            }

            public boolean canScheduleCameraReopen() {
                if (getElapsedTime() < getReopenLimitMs()) {
                    return true;
                }
                reset();
                return false;
            }

            public long getElapsedTime() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.mFirstReopenTime == -1) {
                    this.mFirstReopenTime = jUptimeMillis;
                }
                return jUptimeMillis - this.mFirstReopenTime;
            }

            public int getReopenDelayMs() {
                if (!StateCallback.this.shouldActiveResume()) {
                    return 700;
                }
                long elapsedTime = getElapsedTime();
                if (elapsedTime <= 120000) {
                    return 1000;
                }
                return elapsedTime <= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS ? Guess.REFERENCE_YEAR : WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;
            }

            public int getReopenLimitMs() {
                if (StateCallback.this.shouldActiveResume()) {
                    return ACTIVE_REOPEN_LIMIT_MS;
                }
                return 10000;
            }

            public void reset() {
                this.mFirstReopenTime = -1L;
            }
        }

        public class ScheduledReopen implements Runnable {
            private boolean mCancelled = false;
            private Executor mExecutor;

            public ScheduledReopen(Executor executor) {
                this.mExecutor = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0() {
                if (this.mCancelled) {
                    return;
                }
                Preconditions.checkState(Camera2CameraImpl.this.mState == InternalState.REOPENING);
                if (StateCallback.this.shouldActiveResume()) {
                    Camera2CameraImpl.this.tryForceOpenCameraDevice(true);
                } else {
                    Camera2CameraImpl.this.tryOpenCameraDevice(true);
                }
            }

            public void cancel() {
                this.mCancelled = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mExecutor.execute(new i0(this, 0));
            }
        }

        public StateCallback(@NonNull Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
        }

        private void handleErrorOnOpen(@NonNull CameraDevice cameraDevice, int i10) {
            Preconditions.checkState(Camera2CameraImpl.this.mState == InternalState.OPENING || Camera2CameraImpl.this.mState == InternalState.OPENED || Camera2CameraImpl.this.mState == InternalState.REOPENING, "Attempt to handle open error from non open state: " + Camera2CameraImpl.this.mState);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                Logger.d(Camera2CameraImpl.TAG, String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i10)));
                reopenCameraAfterError(i10);
                return;
            }
            Logger.e(Camera2CameraImpl.TAG, "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + Camera2CameraImpl.getErrorMessage(i10) + " closing camera.");
            Camera2CameraImpl.this.setState(InternalState.CLOSING, CameraState.StateError.create(i10 == 3 ? 5 : 6));
            Camera2CameraImpl.this.closeCamera(false);
        }

        private void reopenCameraAfterError(int i10) {
            int i11 = 1;
            Preconditions.checkState(Camera2CameraImpl.this.mCameraDeviceError != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            Camera2CameraImpl.this.setState(InternalState.REOPENING, CameraState.StateError.create(i11));
            Camera2CameraImpl.this.closeCamera(false);
        }

        public boolean cancelScheduledReopen() {
            if (this.mScheduledReopenHandle == null) {
                return false;
            }
            Camera2CameraImpl.this.debugLog("Cancelling scheduled re-open: " + this.mScheduledReopenRunnable);
            this.mScheduledReopenRunnable.cancel();
            this.mScheduledReopenRunnable = null;
            this.mScheduledReopenHandle.cancel(false);
            this.mScheduledReopenHandle = null;
            return true;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onClosed()");
            Preconditions.checkState(Camera2CameraImpl.this.mCameraDevice == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i10 = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[Camera2CameraImpl.this.mState.ordinal()];
            if (i10 != 3) {
                if (i10 == 6) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.mCameraDeviceError == 0) {
                        camera2CameraImpl.tryOpenCameraDevice(false);
                        return;
                    }
                    camera2CameraImpl.debugLog("Camera closed due to error: " + Camera2CameraImpl.getErrorMessage(Camera2CameraImpl.this.mCameraDeviceError));
                    scheduleCameraReopen();
                    return;
                }
                if (i10 != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + Camera2CameraImpl.this.mState);
                }
            }
            Preconditions.checkState(Camera2CameraImpl.this.isSessionCloseComplete());
            Camera2CameraImpl.this.finishClose();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i10) {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = i10;
            int i11 = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[camera2CameraImpl.mState.ordinal()];
            if (i11 != 3) {
                if (i11 == 4 || i11 == 5 || i11 == 6) {
                    Logger.d(Camera2CameraImpl.TAG, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i10), Camera2CameraImpl.this.mState.name()));
                    handleErrorOnOpen(cameraDevice, i10);
                    return;
                } else if (i11 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + Camera2CameraImpl.this.mState);
                }
            }
            Logger.e(Camera2CameraImpl.TAG, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i10), Camera2CameraImpl.this.mState.name()));
            Camera2CameraImpl.this.closeCamera(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onOpened()");
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = 0;
            resetReopenMonitor();
            int i10 = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[Camera2CameraImpl.this.mState.ordinal()];
            if (i10 != 3) {
                if (i10 == 5 || i10 == 6) {
                    Camera2CameraImpl.this.setState(InternalState.OPENED);
                    Camera2CameraImpl.this.openCaptureSession();
                    return;
                } else if (i10 != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + Camera2CameraImpl.this.mState);
                }
            }
            Preconditions.checkState(Camera2CameraImpl.this.isSessionCloseComplete());
            Camera2CameraImpl.this.mCameraDevice.close();
            Camera2CameraImpl.this.mCameraDevice = null;
        }

        public void resetReopenMonitor() {
            this.mCameraReopenMonitor.reset();
        }

        public void scheduleCameraReopen() {
            Preconditions.checkState(this.mScheduledReopenRunnable == null);
            Preconditions.checkState(this.mScheduledReopenHandle == null);
            if (!this.mCameraReopenMonitor.canScheduleCameraReopen()) {
                Logger.e(Camera2CameraImpl.TAG, "Camera reopening attempted for " + this.mCameraReopenMonitor.getReopenLimitMs() + "ms without success.");
                Camera2CameraImpl.this.setState(InternalState.PENDING_OPEN, null, false);
                return;
            }
            this.mScheduledReopenRunnable = new ScheduledReopen(this.mExecutor);
            Camera2CameraImpl.this.debugLog("Attempting camera re-open in " + this.mCameraReopenMonitor.getReopenDelayMs() + "ms: " + this.mScheduledReopenRunnable + " activeResuming = " + Camera2CameraImpl.this.mIsActiveResumingMode);
            this.mScheduledReopenHandle = this.mScheduler.schedule(this.mScheduledReopenRunnable, (long) this.mCameraReopenMonitor.getReopenDelayMs(), TimeUnit.MILLISECONDS);
        }

        public boolean shouldActiveResume() {
            int i10;
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            return camera2CameraImpl.mIsActiveResumingMode && ((i10 = camera2CameraImpl.mCameraDeviceError) == 1 || i10 == 2);
        }
    }

    @AutoValue
    public static abstract class UseCaseInfo {
        @NonNull
        public static UseCaseInfo create(@NonNull String str, @NonNull Class<?> cls, @NonNull SessionConfig sessionConfig, @NonNull UseCaseConfig<?> useCaseConfig, @Nullable Size size) {
            return new AutoValue_Camera2CameraImpl_UseCaseInfo(str, cls, sessionConfig, useCaseConfig, size);
        }

        @NonNull
        public static UseCaseInfo from(@NonNull UseCase useCase) {
            return create(Camera2CameraImpl.getUseCaseId(useCase), useCase.getClass(), useCase.getSessionConfig(), useCase.getCurrentConfig(), useCase.getAttachedSurfaceResolution());
        }

        @NonNull
        public abstract SessionConfig getSessionConfig();

        @Nullable
        public abstract Size getSurfaceResolution();

        @NonNull
        public abstract UseCaseConfig<?> getUseCaseConfig();

        @NonNull
        public abstract String getUseCaseId();

        @NonNull
        public abstract Class<?> getUseCaseType();
    }

    public Camera2CameraImpl(@NonNull CameraManagerCompat cameraManagerCompat, @NonNull String str, @NonNull Camera2CameraInfoImpl camera2CameraInfoImpl, @NonNull CameraStateRegistry cameraStateRegistry, @NonNull Executor executor, @NonNull Handler handler, @NonNull DisplayInfoManager displayInfoManager) throws CameraUnavailableException {
        LiveDataObservable<CameraInternal.State> liveDataObservable = new LiveDataObservable<>();
        this.mObservableState = liveDataObservable;
        this.mCameraDeviceError = 0;
        this.mReleaseRequestCount = new AtomicInteger(0);
        this.mReleasedCaptureSessions = new LinkedHashMap();
        this.mConfiguringForClose = new HashSet();
        this.mNotifyStateAttachedSet = new HashSet();
        this.mCameraConfig = CameraConfigs.emptyConfig();
        this.mLock = new Object();
        this.mIsActiveResumingMode = false;
        this.mCameraManager = cameraManagerCompat;
        this.mCameraStateRegistry = cameraStateRegistry;
        ScheduledExecutorService scheduledExecutorServiceNewHandlerExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mScheduledExecutorService = scheduledExecutorServiceNewHandlerExecutor;
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = executorNewSequentialExecutor;
        this.mStateCallback = new StateCallback(executorNewSequentialExecutor, scheduledExecutorServiceNewHandlerExecutor);
        this.mUseCaseAttachState = new UseCaseAttachState(str);
        liveDataObservable.postValue(CameraInternal.State.CLOSED);
        CameraStateMachine cameraStateMachine = new CameraStateMachine(cameraStateRegistry);
        this.mCameraStateMachine = cameraStateMachine;
        CaptureSessionRepository captureSessionRepository = new CaptureSessionRepository(executorNewSequentialExecutor);
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mDisplayInfoManager = displayInfoManager;
        this.mCaptureSession = newCaptureSession();
        try {
            Camera2CameraControlImpl camera2CameraControlImpl = new Camera2CameraControlImpl(cameraManagerCompat.getCameraCharacteristicsCompat(str), scheduledExecutorServiceNewHandlerExecutor, executorNewSequentialExecutor, new ControlUpdateListenerInternal(), camera2CameraInfoImpl.getCameraQuirks());
            this.mCameraControlInternal = camera2CameraControlImpl;
            this.mCameraInfoInternal = camera2CameraInfoImpl;
            camera2CameraInfoImpl.linkWithCameraControl(camera2CameraControlImpl);
            camera2CameraInfoImpl.setCameraStateSource(cameraStateMachine.getStateLiveData());
            this.mCaptureSessionOpenerBuilder = new SynchronizedCaptureSessionOpener.Builder(executorNewSequentialExecutor, scheduledExecutorServiceNewHandlerExecutor, handler, captureSessionRepository, camera2CameraInfoImpl.getCameraQuirks(), DeviceQuirks.getAll());
            CameraAvailability cameraAvailability = new CameraAvailability(str);
            this.mCameraAvailability = cameraAvailability;
            cameraStateRegistry.registerCamera(this, executorNewSequentialExecutor, cameraAvailability);
            cameraManagerCompat.registerAvailabilityCallback(executorNewSequentialExecutor, cameraAvailability);
        } catch (CameraAccessExceptionCompat e5) {
            throw CameraUnavailableExceptionHelper.createFrom(e5);
        }
    }

    private void addMeteringRepeating() {
        if (this.mMeteringRepeatingSession != null) {
            this.mUseCaseAttachState.setUseCaseAttached(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode(), this.mMeteringRepeatingSession.getSessionConfig(), this.mMeteringRepeatingSession.getUseCaseConfig());
            this.mUseCaseAttachState.setUseCaseActive(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode(), this.mMeteringRepeatingSession.getSessionConfig(), this.mMeteringRepeatingSession.getUseCaseConfig());
        }
    }

    private void addOrRemoveMeteringRepeatingUseCase() {
        SessionConfig sessionConfigBuild = this.mUseCaseAttachState.getAttachedBuilder().build();
        CaptureConfig repeatingCaptureConfig = sessionConfigBuild.getRepeatingCaptureConfig();
        int size = repeatingCaptureConfig.getSurfaces().size();
        int size2 = sessionConfigBuild.getSurfaces().size();
        if (sessionConfigBuild.getSurfaces().isEmpty()) {
            return;
        }
        if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
            if (this.mMeteringRepeatingSession == null) {
                this.mMeteringRepeatingSession = new MeteringRepeatingSession(this.mCameraInfoInternal.getCameraCharacteristicsCompat(), this.mDisplayInfoManager);
            }
            addMeteringRepeating();
        } else {
            if (size2 == 1 && size == 1) {
                removeMeteringRepeating();
                return;
            }
            if (size >= 2) {
                removeMeteringRepeating();
                return;
            }
            Logger.d(TAG, "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    private boolean checkAndAttachRepeatingSurface(CaptureConfig.Builder builder) {
        if (!builder.getSurfaces().isEmpty()) {
            Logger.w(TAG, "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<SessionConfig> it = this.mUseCaseAttachState.getActiveAndAttachedSessionConfigs().iterator();
        while (it.hasNext()) {
            List<DeferrableSurface> surfaces = it.next().getRepeatingCaptureConfig().getSurfaces();
            if (!surfaces.isEmpty()) {
                Iterator<DeferrableSurface> it2 = surfaces.iterator();
                while (it2.hasNext()) {
                    builder.addSurface(it2.next());
                }
            }
        }
        if (!builder.getSurfaces().isEmpty()) {
            return true;
        }
        Logger.w(TAG, "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeInternal() {
        debugLog("Closing camera.");
        int i10 = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[this.mState.ordinal()];
        if (i10 == 2) {
            Preconditions.checkState(this.mCameraDevice == null);
            setState(InternalState.INITIALIZED);
            return;
        }
        if (i10 == 4) {
            setState(InternalState.CLOSING);
            closeCamera(false);
            return;
        }
        if (i10 != 5 && i10 != 6) {
            debugLog("close() ignored due to being in state: " + this.mState);
        } else {
            boolean zCancelScheduledReopen = this.mStateCallback.cancelScheduledReopen();
            setState(InternalState.CLOSING);
            if (zCancelScheduledReopen) {
                Preconditions.checkState(isSessionCloseComplete());
                finishClose();
            }
        }
    }

    private void configAndClose(boolean z10) {
        final CaptureSession captureSession = new CaptureSession();
        this.mConfiguringForClose.add(captureSession);
        resetCaptureSession(z10);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        final v vVar = new v(surface, surfaceTexture, 0);
        SessionConfig.Builder builder = new SessionConfig.Builder();
        final ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        builder.addNonRepeatingSurface(immediateSurface);
        builder.setTemplateType(1);
        debugLog("Start configAndClose.");
        captureSession.open(builder.build(), (CameraDevice) Preconditions.checkNotNull(this.mCameraDevice), this.mCaptureSessionOpenerBuilder.build()).addListener(new Runnable() { // from class: androidx.camera.camera2.internal.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f2005p0.lambda$configAndClose$1(captureSession, immediateSurface, vVar);
            }
        }, this.mExecutor);
    }

    private CameraDevice.StateCallback createDeviceStateCallback() {
        ArrayList arrayList = new ArrayList(this.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
        arrayList.add(this.mCaptureSessionRepository.getCameraStateCallback());
        arrayList.add(this.mStateCallback);
        return CameraDeviceStateCallbacks.createComboCallback(arrayList);
    }

    public static String getErrorMessage(int i10) {
        if (i10 == 0) {
            return "ERROR_NONE";
        }
        if (i10 == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i10 == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i10 == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i10 != 4) {
            return i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    private ListenableFuture<Void> getOrCreateUserReleaseFuture() {
        if (this.mUserReleaseFuture == null) {
            if (this.mState != InternalState.RELEASED) {
                this.mUserReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.a0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return this.f1804p0.lambda$getOrCreateUserReleaseFuture$4(completer);
                    }
                });
            } else {
                this.mUserReleaseFuture = Futures.immediateFuture(null);
            }
        }
        return this.mUserReleaseFuture;
    }

    @NonNull
    public static String getUseCaseId(@NonNull UseCase useCase) {
        return useCase.getName() + useCase.hashCode();
    }

    private boolean isLegacyDevice() {
        return ((Camera2CameraInfoImpl) getCameraInfoInternal()).getSupportedHardwareLevel() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachUseCases$11(List list) {
        try {
            tryAttachUseCases(list);
        } finally {
            this.mCameraControlInternal.decrementUseCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$configAndClose$0(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getOrCreateUserReleaseFuture$4(CallbackToFutureAdapter.Completer completer) throws Exception {
        Preconditions.checkState(this.mUserReleaseNotifier == null, "Camera can only be released once, so release completer should be null on creation.");
        this.mUserReleaseNotifier = completer;
        return "Release[camera=" + this + Constant.BRACKET_CLOSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$isUseCaseAttached$10(final String str, final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1809p0.lambda$isUseCaseAttached$9(completer, str);
                }
            });
            return "isUseCaseAttached";
        } catch (RejectedExecutionException unused) {
            completer.setException(new RuntimeException("Unable to check if use case is attached. Camera executor shut down."));
            return "isUseCaseAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isUseCaseAttached$9(CallbackToFutureAdapter.Completer completer, String str) {
        completer.set(Boolean.valueOf(this.mUseCaseAttachState.isUseCaseAttached(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseActive$5(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        debugLog(h0.b("Use case ", str, " ACTIVE"));
        this.mUseCaseAttachState.setUseCaseActive(str, sessionConfig, useCaseConfig);
        this.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig);
        updateCaptureSessionConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseInactive$6(String str) {
        debugLog(h0.b("Use case ", str, " INACTIVE"));
        this.mUseCaseAttachState.setUseCaseInactive(str);
        updateCaptureSessionConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseReset$8(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        debugLog(h0.b("Use case ", str, " RESET"));
        this.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig);
        resetCaptureSession(false);
        updateCaptureSessionConfig();
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUseCaseUpdated$7(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        debugLog(h0.b("Use case ", str, " UPDATED"));
        this.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig);
        updateCaptureSessionConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postSurfaceClosedError$14(SessionConfig.ErrorListener errorListener, SessionConfig sessionConfig) {
        errorListener.onError(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(CallbackToFutureAdapter.Completer completer) {
        Futures.propagate(releaseInternal(), completer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$release$3(final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1902p0.lambda$release$2(completer);
            }
        });
        return "Release[request=" + this.mReleaseRequestCount.getAndIncrement() + Constant.BRACKET_CLOSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setActiveResumingMode$13(boolean z10) {
        this.mIsActiveResumingMode = z10;
        if (z10 && this.mState == InternalState.PENDING_OPEN) {
            tryForceOpenCameraDevice(false);
        }
    }

    @NonNull
    private CaptureSessionInterface newCaptureSession() {
        synchronized (this.mLock) {
            try {
                if (this.mSessionProcessor == null) {
                    return new CaptureSession();
                }
                return new ProcessingCaptureSession(this.mSessionProcessor, this.mCameraInfoInternal, this.mExecutor, this.mScheduledExecutorService);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void notifyStateAttachedToUseCases(List<UseCase> list) {
        for (UseCase useCase : list) {
            String useCaseId = getUseCaseId(useCase);
            if (!this.mNotifyStateAttachedSet.contains(useCaseId)) {
                this.mNotifyStateAttachedSet.add(useCaseId);
                useCase.onStateAttached();
            }
        }
    }

    private void notifyStateDetachedToUseCases(List<UseCase> list) {
        for (UseCase useCase : list) {
            String useCaseId = getUseCaseId(useCase);
            if (this.mNotifyStateAttachedSet.contains(useCaseId)) {
                useCase.onStateDetached();
                this.mNotifyStateAttachedSet.remove(useCaseId);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private void openCameraDevice(boolean z10) {
        if (!z10) {
            this.mStateCallback.resetReopenMonitor();
        }
        this.mStateCallback.cancelScheduledReopen();
        debugLog("Opening camera.");
        setState(InternalState.OPENING);
        try {
            this.mCameraManager.openCamera(this.mCameraInfoInternal.getCameraId(), this.mExecutor, createDeviceStateCallback());
        } catch (CameraAccessExceptionCompat e5) {
            debugLog("Unable to open camera due to " + e5.getMessage());
            if (e5.getReason() != 10001) {
                return;
            }
            setState(InternalState.INITIALIZED, CameraState.StateError.create(7, e5));
        } catch (SecurityException e7) {
            debugLog("Unable to open camera due to " + e7.getMessage());
            setState(InternalState.REOPENING);
            this.mStateCallback.scheduleCameraReopen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInternal() {
        int i10 = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[this.mState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            tryForceOpenCameraDevice(false);
            return;
        }
        if (i10 != 3) {
            debugLog("open() ignored due to being in state: " + this.mState);
            return;
        }
        setState(InternalState.REOPENING);
        if (isSessionCloseComplete() || this.mCameraDeviceError != 0) {
            return;
        }
        Preconditions.checkState(this.mCameraDevice != null, "Camera Device should be open if session close is not complete");
        setState(InternalState.OPENED);
        openCaptureSession();
    }

    private ListenableFuture<Void> releaseInternal() {
        ListenableFuture<Void> orCreateUserReleaseFuture = getOrCreateUserReleaseFuture();
        switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[this.mState.ordinal()]) {
            case 1:
            case 2:
                Preconditions.checkState(this.mCameraDevice == null);
                setState(InternalState.RELEASING);
                Preconditions.checkState(isSessionCloseComplete());
                finishClose();
                return orCreateUserReleaseFuture;
            case 3:
            case 5:
            case 6:
            case 7:
                boolean zCancelScheduledReopen = this.mStateCallback.cancelScheduledReopen();
                setState(InternalState.RELEASING);
                if (zCancelScheduledReopen) {
                    Preconditions.checkState(isSessionCloseComplete());
                    finishClose();
                }
                return orCreateUserReleaseFuture;
            case 4:
                setState(InternalState.RELEASING);
                closeCamera(false);
                return orCreateUserReleaseFuture;
            default:
                debugLog("release() ignored due to being in state: " + this.mState);
                return orCreateUserReleaseFuture;
        }
    }

    private void removeMeteringRepeating() {
        if (this.mMeteringRepeatingSession != null) {
            this.mUseCaseAttachState.setUseCaseDetached(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mUseCaseAttachState.setUseCaseInactive(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mMeteringRepeatingSession.clear();
            this.mMeteringRepeatingSession = null;
        }
    }

    @NonNull
    private Collection<UseCaseInfo> toUseCaseInfos(@NonNull Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<UseCase> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(UseCaseInfo.from(it.next()));
        }
        return arrayList;
    }

    private void tryAttachUseCases(@NonNull Collection<UseCaseInfo> collection) {
        Size surfaceResolution;
        boolean zIsEmpty = this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (UseCaseInfo useCaseInfo : collection) {
            if (!this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.setUseCaseAttached(useCaseInfo.getUseCaseId(), useCaseInfo.getSessionConfig(), useCaseInfo.getUseCaseConfig());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == Preview.class && (surfaceResolution = useCaseInfo.getSurfaceResolution()) != null) {
                    rational = new Rational(surfaceResolution.getWidth(), surfaceResolution.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.mCameraControlInternal.setActive(true);
            this.mCameraControlInternal.incrementUseCount();
        }
        addOrRemoveMeteringRepeatingUseCase();
        updateZslDisabledByUseCaseConfigStatus();
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        } else {
            openInternal();
        }
        if (rational != null) {
            this.mCameraControlInternal.setPreviewAspectRatio(rational);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: tryDetachUseCases, reason: merged with bridge method [inline-methods] */
    public void lambda$detachUseCases$12(@NonNull Collection<UseCaseInfo> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (UseCaseInfo useCaseInfo : collection) {
            if (this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.removeUseCase(useCaseInfo.getUseCaseId());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == Preview.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.mCameraControlInternal.setPreviewAspectRatio(null);
        }
        addOrRemoveMeteringRepeatingUseCase();
        if (this.mUseCaseAttachState.getAttachedUseCaseConfigs().isEmpty()) {
            this.mCameraControlInternal.setZslDisabledByUserCaseConfig(false);
        } else {
            updateZslDisabledByUseCaseConfigStatus();
        }
        if (this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty()) {
            this.mCameraControlInternal.decrementUseCount();
            resetCaptureSession(false);
            this.mCameraControlInternal.setActive(false);
            this.mCaptureSession = newCaptureSession();
            closeInternal();
            return;
        }
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        }
    }

    private void updateZslDisabledByUseCaseConfigStatus() {
        Iterator<UseCaseConfig<?>> it = this.mUseCaseAttachState.getAttachedUseCaseConfigs().iterator();
        boolean zIsZslDisabled = false;
        while (it.hasNext()) {
            zIsZslDisabled |= it.next().isZslDisabled(false);
        }
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(zIsZslDisabled);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(@NonNull Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.mCameraControlInternal.incrementUseCount();
        notifyStateAttachedToUseCases(new ArrayList<>(arrayList));
        final ArrayList arrayList2 = new ArrayList(toUseCaseInfos(arrayList));
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1992p0.lambda$attachUseCases$11(arrayList2);
                }
            });
        } catch (RejectedExecutionException e5) {
            debugLog("Unable to attach use cases.", e5);
            this.mCameraControlInternal.decrementUseCount();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f1989p0.closeInternal();
            }
        });
    }

    public void closeCamera(boolean z10) {
        Preconditions.checkState(this.mState == InternalState.CLOSING || this.mState == InternalState.RELEASING || (this.mState == InternalState.REOPENING && this.mCameraDeviceError != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.mState + " (error: " + getErrorMessage(this.mCameraDeviceError) + ")");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 23 || i10 >= 29 || !isLegacyDevice() || this.mCameraDeviceError != 0) {
            resetCaptureSession(z10);
        } else {
            configAndClose(z10);
        }
        this.mCaptureSession.cancelIssuedCaptureRequests();
    }

    public void debugLog(@NonNull String str) {
        debugLog(str, null);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(@NonNull Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(toUseCaseInfos(arrayList));
        notifyStateDetachedToUseCases(new ArrayList<>(arrayList));
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f1985p0.lambda$detachUseCases$12(arrayList2);
            }
        });
    }

    @Nullable
    public SessionConfig findSessionConfigForSurface(@NonNull DeferrableSurface deferrableSurface) {
        for (SessionConfig sessionConfig : this.mUseCaseAttachState.getAttachedSessionConfigs()) {
            if (sessionConfig.getSurfaces().contains(deferrableSurface)) {
                return sessionConfig;
            }
        }
        return null;
    }

    public void finishClose() {
        Preconditions.checkState(this.mState == InternalState.RELEASING || this.mState == InternalState.CLOSING);
        Preconditions.checkState(this.mReleasedCaptureSessions.isEmpty());
        this.mCameraDevice = null;
        if (this.mState == InternalState.CLOSING) {
            setState(InternalState.INITIALIZED);
            return;
        }
        this.mCameraManager.unregisterAvailabilityCallback(this.mCameraAvailability);
        setState(InternalState.RELEASED);
        CallbackToFutureAdapter.Completer<Void> completer = this.mUserReleaseNotifier;
        if (completer != null) {
            completer.set(null);
            this.mUserReleaseNotifier = null;
        }
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public CameraAvailability getCameraAvailability() {
        return this.mCameraAvailability;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public final /* synthetic */ CameraControl getCameraControl() {
        return androidx.camera.core.impl.j.a(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public CameraControlInternal getCameraControlInternal() {
        return this.mCameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public final /* synthetic */ CameraInfo getCameraInfo() {
        return androidx.camera.core.impl.j.b(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public CameraInfoInternal getCameraInfoInternal() {
        return this.mCameraInfoInternal;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public final /* synthetic */ LinkedHashSet getCameraInternals() {
        return androidx.camera.core.impl.j.c(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public Observable<CameraInternal.State> getCameraState() {
        return this.mObservableState;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    @NonNull
    public CameraConfig getExtendedConfig() {
        return this.mCameraConfig;
    }

    public boolean isSessionCloseComplete() {
        return this.mReleasedCaptureSessions.isEmpty() && this.mConfiguringForClose.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public boolean isUseCaseAttached(@NonNull UseCase useCase) {
        try {
            final String useCaseId = getUseCaseId(useCase);
            return ((Boolean) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.q
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.f1973p0.lambda$isUseCaseAttached$10(useCaseId, completer);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e5) {
            throw new RuntimeException("Unable to check if use case is attached.", e5);
        }
    }

    @Override // androidx.camera.core.Camera
    public final /* synthetic */ boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return androidx.camera.core.c.a(this, useCaseArr);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(@NonNull UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        final SessionConfig sessionConfig = useCase.getSessionConfig();
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1887p0.lambda$onUseCaseActive$5(useCaseId, sessionConfig, currentConfig);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(@NonNull UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f2019p0.lambda$onUseCaseInactive$6(useCaseId);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(@NonNull UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        final SessionConfig sessionConfig = useCase.getSessionConfig();
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f2011p0.lambda$onUseCaseReset$8(useCaseId, sessionConfig, currentConfig);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(@NonNull UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        final SessionConfig sessionConfig = useCase.getSessionConfig();
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1915p0.lambda$onUseCaseUpdated$7(useCaseId, sessionConfig, currentConfig);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f1980p0.openInternal();
            }
        });
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public void openCaptureSession() {
        Preconditions.checkState(this.mState == InternalState.OPENED);
        SessionConfig.ValidatingBuilder attachedBuilder = this.mUseCaseAttachState.getAttachedBuilder();
        if (!attachedBuilder.isValid()) {
            debugLog("Unable to create capture session due to conflicting configurations");
            return;
        }
        Config implementationOptions = attachedBuilder.build().getImplementationOptions();
        Config.Option<Long> option = Camera2ImplConfig.STREAM_USE_CASE_OPTION;
        if (!implementationOptions.containsOption(option)) {
            attachedBuilder.addImplementationOption(option, Long.valueOf(StreamUseCaseUtil.getStreamUseCaseFromUseCaseConfigs(this.mUseCaseAttachState.getAttachedUseCaseConfigs(), this.mUseCaseAttachState.getAttachedSessionConfigs())));
        }
        Futures.addCallback(this.mCaptureSession.open(attachedBuilder.build(), (CameraDevice) Preconditions.checkNotNull(this.mCameraDevice), this.mCaptureSessionOpenerBuilder.build()), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                if (th2 instanceof DeferrableSurface.SurfaceClosedException) {
                    SessionConfig sessionConfigFindSessionConfigForSurface = Camera2CameraImpl.this.findSessionConfigForSurface(((DeferrableSurface.SurfaceClosedException) th2).getDeferrableSurface());
                    if (sessionConfigFindSessionConfigForSurface != null) {
                        Camera2CameraImpl.this.postSurfaceClosedError(sessionConfigFindSessionConfigForSurface);
                        return;
                    }
                    return;
                }
                if (th2 instanceof CancellationException) {
                    Camera2CameraImpl.this.debugLog("Unable to configure camera cancelled");
                    return;
                }
                InternalState internalState = Camera2CameraImpl.this.mState;
                InternalState internalState2 = InternalState.OPENED;
                if (internalState == internalState2) {
                    Camera2CameraImpl.this.setState(internalState2, CameraState.StateError.create(4, th2));
                }
                if (th2 instanceof CameraAccessException) {
                    Camera2CameraImpl.this.debugLog("Unable to configure camera due to " + th2.getMessage());
                    return;
                }
                if (th2 instanceof TimeoutException) {
                    Logger.e(Camera2CameraImpl.TAG, "Unable to configure camera " + Camera2CameraImpl.this.mCameraInfoInternal.getCameraId() + ", timeout!");
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r1) {
            }
        }, this.mExecutor);
    }

    public void postSurfaceClosedError(@NonNull final SessionConfig sessionConfig) {
        ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
        List<SessionConfig.ErrorListener> errorListeners = sessionConfig.getErrorListeners();
        if (errorListeners.isEmpty()) {
            return;
        }
        final SessionConfig.ErrorListener errorListener = errorListeners.get(0);
        debugLog("Posting surface closed", new Throwable());
        scheduledExecutorServiceMainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.lambda$postSurfaceClosedError$14(errorListener, sessionConfig);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public ListenableFuture<Void> release() {
        return CallbackToFutureAdapter.getFuture(new c0(this));
    }

    /* JADX INFO: renamed from: releaseNoOpSession, reason: merged with bridge method [inline-methods] */
    public void lambda$configAndClose$1(@NonNull CaptureSession captureSession, @NonNull DeferrableSurface deferrableSurface, @NonNull Runnable runnable) {
        this.mConfiguringForClose.remove(captureSession);
        ListenableFuture<Void> listenableFutureReleaseSession = releaseSession(captureSession, false);
        deferrableSurface.close();
        Futures.successfulAsList(Arrays.asList(listenableFutureReleaseSession, deferrableSurface.getTerminationFuture())).addListener(runnable, CameraXExecutors.directExecutor());
    }

    public ListenableFuture<Void> releaseSession(@NonNull final CaptureSessionInterface captureSessionInterface, boolean z10) {
        captureSessionInterface.close();
        ListenableFuture<Void> listenableFutureRelease = captureSessionInterface.release(z10);
        debugLog("Releasing session in state " + this.mState.name());
        this.mReleasedCaptureSessions.put(captureSessionInterface, listenableFutureRelease);
        Futures.addCallback(listenableFutureRelease, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r3) {
                CameraDevice cameraDevice;
                Camera2CameraImpl.this.mReleasedCaptureSessions.remove(captureSessionInterface);
                int i10 = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[Camera2CameraImpl.this.mState.ordinal()];
                if (i10 != 3) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            return;
                        }
                    } else if (Camera2CameraImpl.this.mCameraDeviceError == 0) {
                        return;
                    }
                }
                if (!Camera2CameraImpl.this.isSessionCloseComplete() || (cameraDevice = Camera2CameraImpl.this.mCameraDevice) == null) {
                    return;
                }
                ApiCompat.Api21Impl.close(cameraDevice);
                Camera2CameraImpl.this.mCameraDevice = null;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
            }
        }, CameraXExecutors.directExecutor());
        return listenableFutureRelease;
    }

    public void resetCaptureSession(boolean z10) {
        Preconditions.checkState(this.mCaptureSession != null);
        debugLog("Resetting Capture Session");
        CaptureSessionInterface captureSessionInterface = this.mCaptureSession;
        SessionConfig sessionConfig = captureSessionInterface.getSessionConfig();
        List<CaptureConfig> captureConfigs = captureSessionInterface.getCaptureConfigs();
        CaptureSessionInterface captureSessionInterfaceNewCaptureSession = newCaptureSession();
        this.mCaptureSession = captureSessionInterfaceNewCaptureSession;
        captureSessionInterfaceNewCaptureSession.setSessionConfig(sessionConfig);
        this.mCaptureSession.issueCaptureRequests(captureConfigs);
        releaseSession(captureSessionInterface, z10);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(final boolean z10) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f2023p0.lambda$setActiveResumingMode$13(z10);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public void setExtendedConfig(@Nullable CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = CameraConfigs.emptyConfig();
        }
        SessionProcessor sessionProcessor = cameraConfig.getSessionProcessor(null);
        this.mCameraConfig = cameraConfig;
        synchronized (this.mLock) {
            this.mSessionProcessor = sessionProcessor;
        }
    }

    public void setState(@NonNull InternalState internalState) {
        setState(internalState, null);
    }

    public void submitCaptureRequests(@NonNull List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig captureConfig : list) {
            CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(captureConfig);
            if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                builderFrom.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
            }
            if (!captureConfig.getSurfaces().isEmpty() || !captureConfig.isUseRepeatingSurface() || checkAndAttachRepeatingSurface(builderFrom)) {
                arrayList.add(builderFrom.build());
            }
        }
        debugLog("Issue capture request");
        this.mCaptureSession.issueCaptureRequests(arrayList);
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.mCameraInfoInternal.getCameraId());
    }

    public void tryForceOpenCameraDevice(boolean z10) {
        debugLog("Attempting to force open the camera.");
        if (this.mCameraStateRegistry.tryOpenCamera(this)) {
            openCameraDevice(z10);
        } else {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
        }
    }

    public void tryOpenCameraDevice(boolean z10) {
        debugLog("Attempting to open the camera.");
        if (this.mCameraAvailability.isCameraAvailable() && this.mCameraStateRegistry.tryOpenCamera(this)) {
            openCameraDevice(z10);
        } else {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
        }
    }

    public void updateCaptureSessionConfig() {
        SessionConfig.ValidatingBuilder activeAndAttachedBuilder = this.mUseCaseAttachState.getActiveAndAttachedBuilder();
        if (!activeAndAttachedBuilder.isValid()) {
            this.mCameraControlInternal.resetTemplate();
            this.mCaptureSession.setSessionConfig(this.mCameraControlInternal.getSessionConfig());
            return;
        }
        this.mCameraControlInternal.setTemplate(activeAndAttachedBuilder.build().getTemplateType());
        activeAndAttachedBuilder.add(this.mCameraControlInternal.getSessionConfig());
        this.mCaptureSession.setSessionConfig(activeAndAttachedBuilder.build());
    }

    private void debugLog(@NonNull String str, @Nullable Throwable th2) {
        Logger.d(TAG, String.format("{%s} %s", toString(), str), th2);
    }

    public void setState(@NonNull InternalState internalState, @Nullable CameraState.StateError stateError) {
        setState(internalState, stateError, true);
    }

    public void setState(@NonNull InternalState internalState, @Nullable CameraState.StateError stateError, boolean z10) {
        CameraInternal.State state;
        debugLog("Transitioning camera internal state: " + this.mState + " --> " + internalState);
        this.mState = internalState;
        switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$Camera2CameraImpl$InternalState[internalState.ordinal()]) {
            case 1:
                state = CameraInternal.State.CLOSED;
                break;
            case 2:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case 3:
                state = CameraInternal.State.CLOSING;
                break;
            case 4:
                state = CameraInternal.State.OPEN;
                break;
            case 5:
            case 6:
                state = CameraInternal.State.OPENING;
                break;
            case 7:
                state = CameraInternal.State.RELEASING;
                break;
            case 8:
                state = CameraInternal.State.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        this.mCameraStateRegistry.markCameraState(this, state, z10);
        this.mObservableState.postValue(state);
        this.mCameraStateMachine.updateState(state, stateError);
    }
}
