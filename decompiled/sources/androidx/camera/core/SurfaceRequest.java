package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class SurfaceRequest {
    private final CameraInternal mCamera;

    @Nullable
    private final Range<Integer> mExpectedFrameRate;
    private final DeferrableSurface mInternalDeferrableSurface;
    private final Object mLock;
    private final boolean mRGBA8888Required;
    private final CallbackToFutureAdapter.Completer<Void> mRequestCancellationCompleter;
    private final Size mResolution;
    private final ListenableFuture<Void> mSessionStatusFuture;
    private final CallbackToFutureAdapter.Completer<Surface> mSurfaceCompleter;
    final ListenableFuture<Surface> mSurfaceFuture;

    @Nullable
    @GuardedBy("mLock")
    private TransformationInfo mTransformationInfo;

    @Nullable
    @GuardedBy("mLock")
    private Executor mTransformationInfoExecutor;

    @Nullable
    @GuardedBy("mLock")
    private TransformationInfoListener mTransformationInfoListener;

    public static final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    @AutoValue
    public static abstract class Result {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ResultCode {
        }

        @NonNull
        public static Result of(int i10, @NonNull Surface surface) {
            return new AutoValue_SurfaceRequest_Result(i10, surface);
        }

        public abstract int getResultCode();

        @NonNull
        public abstract Surface getSurface();
    }

    @AutoValue
    public static abstract class TransformationInfo {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static TransformationInfo of(@NonNull Rect rect, int i10, int i11) {
            return new AutoValue_SurfaceRequest_TransformationInfo(rect, i10, i11);
        }

        @NonNull
        public abstract Rect getCropRect();

        public abstract int getRotationDegrees();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract int getTargetRotation();
    }

    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(@NonNull TransformationInfo transformationInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceRequest(@NonNull Size size, @NonNull CameraInternal cameraInternal, boolean z10) {
        this(size, cameraInternal, z10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$0(AtomicReference atomicReference, String str, CallbackToFutureAdapter.Completer completer) throws Exception {
        atomicReference.set(completer);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$1(AtomicReference atomicReference, String str, CallbackToFutureAdapter.Completer completer) throws Exception {
        atomicReference.set(completer);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$2(AtomicReference atomicReference, String str, CallbackToFutureAdapter.Completer completer) throws Exception {
        atomicReference.set(completer);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        this.mSurfaceFuture.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$4(Consumer consumer, Surface surface) {
        consumer.accept(Result.of(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$5(Consumer consumer, Surface surface) {
        consumer.accept(Result.of(4, surface));
    }

    @SuppressLint({"PairedRegistration"})
    public void addRequestCancellationListener(@NonNull Executor executor, @NonNull Runnable runnable) {
        this.mRequestCancellationCompleter.addCancellationListener(runnable, executor);
    }

    public void clearTransformationInfoListener() {
        synchronized (this.mLock) {
            this.mTransformationInfoListener = null;
            this.mTransformationInfoExecutor = null;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraInternal getCamera() {
        return this.mCamera;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeferrableSurface getDeferrableSurface() {
        return this.mInternalDeferrableSurface;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Range<Integer> getExpectedFrameRate() {
        return this.mExpectedFrameRate;
    }

    @NonNull
    public Size getResolution() {
        return this.mResolution;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRGBA8888Required() {
        return this.mRGBA8888Required;
    }

    public void provideSurface(@NonNull final Surface surface, @NonNull Executor executor, @NonNull final Consumer<Result> consumer) {
        if (this.mSurfaceCompleter.set(surface) || this.mSurfaceFuture.isCancelled()) {
            Futures.addCallback(this.mSessionStatusFuture, new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.4
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(@NonNull Throwable th2) {
                    Preconditions.checkState(th2 instanceof RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
                    consumer.accept(Result.of(1, surface));
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(@Nullable Void r3) {
                    consumer.accept(Result.of(0, surface));
                }
            }, executor);
            return;
        }
        Preconditions.checkState(this.mSurfaceFuture.isDone());
        try {
            this.mSurfaceFuture.get();
            executor.execute(new androidx.appcompat.app.h(consumer, surface, 2));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new o1(consumer, surface, 0));
        }
    }

    public void setTransformationInfoListener(@NonNull Executor executor, @NonNull TransformationInfoListener transformationInfoListener) {
        TransformationInfo transformationInfo;
        synchronized (this.mLock) {
            this.mTransformationInfoListener = transformationInfoListener;
            this.mTransformationInfoExecutor = executor;
            transformationInfo = this.mTransformationInfo;
        }
        if (transformationInfo != null) {
            executor.execute(new p1(transformationInfoListener, transformationInfo, 0));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void updateTransformationInfo(@NonNull TransformationInfo transformationInfo) {
        TransformationInfoListener transformationInfoListener;
        Executor executor;
        synchronized (this.mLock) {
            this.mTransformationInfo = transformationInfo;
            transformationInfoListener = this.mTransformationInfoListener;
            executor = this.mTransformationInfoExecutor;
        }
        if (transformationInfoListener == null || executor == null) {
            return;
        }
        executor.execute(new o0(transformationInfoListener, transformationInfo, 1));
    }

    public boolean willNotProvideSurface() {
        return this.mSurfaceCompleter.setException(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceRequest(@NonNull Size size, @NonNull CameraInternal cameraInternal, boolean z10, @Nullable Range<Integer> range) {
        this.mLock = new Object();
        this.mResolution = size;
        this.mCamera = cameraInternal;
        this.mRGBA8888Required = z10;
        this.mExpectedFrameRate = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + Constant.BRACKET_CLOSE;
        AtomicReference atomicReference = new AtomicReference(null);
        final ListenableFuture future = CallbackToFutureAdapter.getFuture(new k1(atomicReference, str));
        final CallbackToFutureAdapter.Completer<Void> completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
        this.mRequestCancellationCompleter = completer;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        ListenableFuture<Void> future2 = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.l1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer2) {
                return SurfaceRequest.lambda$new$1(atomicReference2, str, completer2);
            }
        });
        this.mSessionStatusFuture = future2;
        Futures.addCallback(future2, new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                if (th2 instanceof RequestCancelledException) {
                    Preconditions.checkState(future.cancel(false));
                } else {
                    Preconditions.checkState(completer.set(null));
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r3) {
                Preconditions.checkState(completer.set(null));
            }
        }, CameraXExecutors.directExecutor());
        final CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference2.get());
        AtomicReference atomicReference3 = new AtomicReference(null);
        ListenableFuture<Surface> future3 = CallbackToFutureAdapter.getFuture(new m1(atomicReference3, str));
        this.mSurfaceFuture = future3;
        this.mSurfaceCompleter = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference3.get());
        DeferrableSurface deferrableSurface = new DeferrableSurface(size, 34) { // from class: androidx.camera.core.SurfaceRequest.2
            @Override // androidx.camera.core.impl.DeferrableSurface
            @NonNull
            public ListenableFuture<Surface> provideSurface() {
                return SurfaceRequest.this.mSurfaceFuture;
            }
        };
        this.mInternalDeferrableSurface = deferrableSurface;
        final ListenableFuture<Void> terminationFuture = deferrableSurface.getTerminationFuture();
        Futures.addCallback(future3, new FutureCallback<Surface>() { // from class: androidx.camera.core.SurfaceRequest.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                if (th2 instanceof CancellationException) {
                    Preconditions.checkState(completer2.setException(new RequestCancelledException(ad.d.f(new StringBuilder(), str, " cancelled."), th2)));
                } else {
                    completer2.set(null);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Surface surface) {
                Futures.propagate(terminationFuture, completer2);
            }
        }, CameraXExecutors.directExecutor());
        terminationFuture.addListener(new n1(this, 0), CameraXExecutors.directExecutor());
    }
}
