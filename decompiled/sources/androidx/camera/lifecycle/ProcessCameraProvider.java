package androidx.camera.lifecycle;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ProcessCameraProvider implements LifecycleCameraProvider {
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();
    private CameraX mCameraX;

    @GuardedBy("mLock")
    private ListenableFuture<CameraX> mCameraXInitializeFuture;
    private Context mContext;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private CameraXConfig.Provider mCameraXConfigProvider = null;

    @GuardedBy("mLock")
    private ListenableFuture<Void> mCameraXShutdownFuture = Futures.immediateFuture(null);
    private final LifecycleCameraRepository mLifecycleCameraRepository = new LifecycleCameraRepository();

    private ProcessCameraProvider() {
    }

    @ExperimentalCameraProviderConfiguration
    public static void configureInstance(@NonNull CameraXConfig cameraXConfig) {
        sAppInstance.configureInstanceInternal(cameraXConfig);
    }

    private void configureInstanceInternal(@NonNull final CameraXConfig cameraXConfig) {
        synchronized (this.mLock) {
            Preconditions.checkNotNull(cameraXConfig);
            Preconditions.checkState(this.mCameraXConfigProvider == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
            this.mCameraXConfigProvider = new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.b
                @Override // androidx.camera.core.CameraXConfig.Provider
                public final CameraXConfig getCameraXConfig() {
                    return ProcessCameraProvider.lambda$configureInstanceInternal$3(cameraXConfig);
                }
            };
        }
    }

    @NonNull
    public static ListenableFuture<ProcessCameraProvider> getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        return Futures.transform(sAppInstance.getOrCreateCameraXInstance(context), new k.a(context), CameraXExecutors.directExecutor());
    }

    private ListenableFuture<CameraX> getOrCreateCameraXInstance(@NonNull Context context) {
        synchronized (this.mLock) {
            try {
                ListenableFuture<CameraX> listenableFuture = this.mCameraXInitializeFuture;
                if (listenableFuture != null) {
                    return listenableFuture;
                }
                ListenableFuture<CameraX> future = CallbackToFutureAdapter.getFuture(new c(this, new CameraX(context, this.mCameraXConfigProvider)));
                this.mCameraXInitializeFuture = future;
                return future;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ProcessCameraProvider lambda$getInstance$0(Context context, CameraX cameraX) {
        ProcessCameraProvider processCameraProvider = sAppInstance;
        processCameraProvider.setCameraX(cameraX);
        processCameraProvider.setContext(ContextUtil.getApplicationContext(context));
        return processCameraProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListenableFuture lambda$getOrCreateCameraXInstance$1(CameraX cameraX, Void r1) throws Exception {
        return cameraX.getInitializeFuture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getOrCreateCameraXInstance$2(final CameraX cameraX, final CallbackToFutureAdapter.Completer completer) throws Exception {
        synchronized (this.mLock) {
            Futures.addCallback(FutureChain.from(this.mCameraXShutdownFuture).transformAsync(new AsyncFunction() { // from class: androidx.camera.lifecycle.a
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return ProcessCameraProvider.lambda$getOrCreateCameraXInstance$1(cameraX, (Void) obj);
                }
            }, CameraXExecutors.directExecutor()), new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(@NonNull Throwable th2) {
                    completer.setException(th2);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(@Nullable Void r3) {
                    completer.set(cameraX);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    private void setCameraX(CameraX cameraX) {
        this.mCameraX = cameraX;
    }

    private void setContext(Context context) {
        this.mContext = context;
    }

    @NonNull
    @MainThread
    public Camera bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraSelector cameraSelector, @NonNull UseCase... useCaseArr) {
        return bindToLifecycle(lifecycleOwner, cameraSelector, null, Collections.emptyList(), useCaseArr);
    }

    @Override // androidx.camera.core.CameraProvider
    @NonNull
    public List<CameraInfo> getAvailableCameraInfos() {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it = this.mCameraX.getCameraRepository().getCameras().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        return arrayList;
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(@NonNull CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        try {
            cameraSelector.select(this.mCameraX.getCameraRepository().getCameras());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(@NonNull UseCase useCase) {
        Iterator<LifecycleCamera> it = this.mLifecycleCameraRepository.getLifecycleCameras().iterator();
        while (it.hasNext()) {
            if (it.next().isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.TESTS})
    public ListenableFuture<Void> shutdown() {
        this.mLifecycleCameraRepository.clear();
        CameraX cameraX = this.mCameraX;
        ListenableFuture<Void> listenableFutureShutdown = cameraX != null ? cameraX.shutdown() : Futures.immediateFuture(null);
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = listenableFutureShutdown;
        }
        this.mCameraX = null;
        this.mContext = null;
        return listenableFutureShutdown;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbind(@NonNull UseCase... useCaseArr) {
        Threads.checkMainThread();
        this.mLifecycleCameraRepository.unbind(Arrays.asList(useCaseArr));
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbindAll() {
        Threads.checkMainThread();
        this.mLifecycleCameraRepository.unbindAll();
    }

    @NonNull
    @MainThread
    public Camera bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraSelector cameraSelector, @NonNull UseCaseGroup useCaseGroup) {
        return bindToLifecycle(lifecycleOwner, cameraSelector, useCaseGroup.getViewPort(), useCaseGroup.getEffects(), (UseCase[]) useCaseGroup.getUseCases().toArray(new UseCase[0]));
    }

    @NonNull
    public Camera bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraSelector cameraSelector, @Nullable ViewPort viewPort, @NonNull List<CameraEffect> list, @NonNull UseCase... useCaseArr) {
        CameraConfig cameraConfig;
        CameraConfig config;
        Threads.checkMainThread();
        CameraSelector.Builder builderFromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        int length = useCaseArr.length;
        int i10 = 0;
        while (true) {
            cameraConfig = null;
            if (i10 >= length) {
                break;
            }
            CameraSelector cameraSelector2 = useCaseArr[i10].getCurrentConfig().getCameraSelector(null);
            if (cameraSelector2 != null) {
                Iterator<CameraFilter> it = cameraSelector2.getCameraFilterSet().iterator();
                while (it.hasNext()) {
                    builderFromSelector.addCameraFilter(it.next());
                }
            }
            i10++;
        }
        LinkedHashSet<CameraInternal> linkedHashSetFilter = builderFromSelector.build().filter(this.mCameraX.getCameraRepository().getCameras());
        if (!linkedHashSetFilter.isEmpty()) {
            LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, CameraUseCaseAdapter.generateCameraId(linkedHashSetFilter));
            Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
            for (UseCase useCase : useCaseArr) {
                for (LifecycleCamera lifecycleCamera2 : lifecycleCameras) {
                    if (lifecycleCamera2.isBound(useCase) && lifecycleCamera2 != lifecycleCamera) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", useCase));
                    }
                }
            }
            if (lifecycleCamera == null) {
                lifecycleCamera = this.mLifecycleCameraRepository.createLifecycleCamera(lifecycleOwner, new CameraUseCaseAdapter(linkedHashSetFilter, this.mCameraX.getCameraDeviceSurfaceManager(), this.mCameraX.getDefaultConfigFactory()));
            }
            for (CameraFilter cameraFilter : cameraSelector.getCameraFilterSet()) {
                if (cameraFilter.getIdentifier() != CameraFilter.DEFAULT_ID && (config = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier()).getConfig(lifecycleCamera.getCameraInfo(), this.mContext)) != null) {
                    if (cameraConfig != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
            lifecycleCamera.setExtendedConfig(cameraConfig);
            if (useCaseArr.length == 0) {
                return lifecycleCamera;
            }
            this.mLifecycleCameraRepository.bindToLifecycleCamera(lifecycleCamera, viewPort, list, Arrays.asList(useCaseArr));
            return lifecycleCamera;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CameraXConfig lambda$configureInstanceInternal$3(CameraXConfig cameraXConfig) {
        return cameraXConfig;
    }
}
