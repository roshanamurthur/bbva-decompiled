package androidx.camera.core.processing;

import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class SurfaceOutputImpl implements SurfaceOutput {
    private static final String TAG = "SurfaceOutputImpl";

    @NonNull
    private final ListenableFuture<Void> mCloseFuture;
    private CallbackToFutureAdapter.Completer<Void> mCloseFutureCompleter;

    @Nullable
    @GuardedBy("mLock")
    private Consumer<SurfaceOutput.Event> mEventListener;

    @Nullable
    @GuardedBy("mLock")
    private Executor mExecutor;
    private final int mFormat;
    private final SurfaceOutput.GlTransformOptions mGlTransformOptions;
    private final Rect mInputCropRect;
    private final Size mInputSize;
    private final boolean mMirroring;
    private final int mRotationDegrees;

    @NonNull
    private final Size mSize;

    @NonNull
    private final Surface mSurface;
    private final int mTargets;
    private final Object mLock = new Object();

    @NonNull
    private final float[] mGlTransform = new float[16];

    @GuardedBy("mLock")
    private boolean mHasPendingCloseRequest = false;

    @GuardedBy("mLock")
    private boolean mIsClosed = false;

    /* JADX INFO: renamed from: androidx.camera.core.processing.SurfaceOutputImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$SurfaceOutput$GlTransformOptions;

        static {
            int[] iArr = new int[SurfaceOutput.GlTransformOptions.values().length];
            $SwitchMap$androidx$camera$core$SurfaceOutput$GlTransformOptions = iArr;
            try {
                iArr[SurfaceOutput.GlTransformOptions.USE_SURFACE_TEXTURE_TRANSFORM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$SurfaceOutput$GlTransformOptions[SurfaceOutput.GlTransformOptions.APPLY_CROP_ROTATE_AND_MIRRORING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SurfaceOutputImpl(@NonNull Surface surface, int i10, int i11, @NonNull Size size, @NonNull SurfaceOutput.GlTransformOptions glTransformOptions, @NonNull Size size2, @NonNull Rect rect, int i12, boolean z10) {
        this.mSurface = surface;
        this.mTargets = i10;
        this.mFormat = i11;
        this.mSize = size;
        this.mGlTransformOptions = glTransformOptions;
        this.mInputSize = size2;
        this.mInputCropRect = new Rect(rect);
        this.mMirroring = z10;
        if (glTransformOptions == SurfaceOutput.GlTransformOptions.APPLY_CROP_ROTATE_AND_MIRRORING) {
            this.mRotationDegrees = i12;
            calculateGlTransform();
        } else {
            this.mRotationDegrees = 0;
        }
        this.mCloseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.j
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f2215p0.lambda$new$0(completer);
            }
        });
    }

    private void calculateGlTransform() {
        Matrix.setIdentityM(this.mGlTransform, 0);
        Matrix.translateM(this.mGlTransform, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(this.mGlTransform, 0, 1.0f, -1.0f, 1.0f);
        MatrixExt.preRotate(this.mGlTransform, this.mRotationDegrees, 0.5f, 0.5f);
        if (this.mMirroring) {
            Matrix.translateM(this.mGlTransform, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(this.mGlTransform, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeRotateSize = TransformUtils.rotateSize(this.mInputSize, this.mRotationDegrees);
        android.graphics.Matrix rectToRect = TransformUtils.getRectToRect(TransformUtils.sizeToRectF(this.mInputSize), TransformUtils.sizeToRectF(sizeRotateSize), this.mRotationDegrees, this.mMirroring);
        RectF rectF = new RectF(this.mInputCropRect);
        rectToRect.mapRect(rectF);
        float width = rectF.left / sizeRotateSize.getWidth();
        float height = ((sizeRotateSize.getHeight() - rectF.height()) - rectF.top) / sizeRotateSize.getHeight();
        float fWidth = rectF.width() / sizeRotateSize.getWidth();
        float fHeight = rectF.height() / sizeRotateSize.getHeight();
        Matrix.translateM(this.mGlTransform, 0, width, height, 0.0f);
        Matrix.scaleM(this.mGlTransform, 0, fWidth, fHeight, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mCloseFutureCompleter = completer;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestClose$1(AtomicReference atomicReference) {
        ((Consumer) atomicReference.get()).accept(SurfaceOutput.Event.of(0, this));
    }

    @Override // androidx.camera.core.SurfaceOutput
    @AnyThread
    public void close() {
        synchronized (this.mLock) {
            try {
                if (!this.mIsClosed) {
                    this.mIsClosed = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mCloseFutureCompleter.set(null);
    }

    @NonNull
    public ListenableFuture<Void> getCloseFuture() {
        return this.mCloseFuture;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getFormat() {
        return this.mFormat;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    @Override // androidx.camera.core.SurfaceOutput
    @NonNull
    public Size getSize() {
        return this.mSize;
    }

    @Override // androidx.camera.core.SurfaceOutput
    @NonNull
    public Surface getSurface(@NonNull Executor executor, @NonNull Consumer<SurfaceOutput.Event> consumer) {
        boolean z10;
        synchronized (this.mLock) {
            this.mExecutor = executor;
            this.mEventListener = consumer;
            z10 = this.mHasPendingCloseRequest;
        }
        if (z10) {
            requestClose();
        }
        return this.mSurface;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getTargets() {
        return this.mTargets;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public boolean isClosed() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mIsClosed;
        }
        return z10;
    }

    public void requestClose() {
        Executor executor;
        Consumer<SurfaceOutput.Event> consumer;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.mLock) {
            try {
                if (this.mExecutor == null || (consumer = this.mEventListener) == null) {
                    this.mHasPendingCloseRequest = true;
                } else if (!this.mIsClosed) {
                    atomicReference.set(consumer);
                    executor = this.mExecutor;
                    this.mHasPendingCloseRequest = false;
                }
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.core.processing.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2216p0.lambda$requestClose$1(atomicReference);
                    }
                });
            } catch (RejectedExecutionException e5) {
                Logger.d(TAG, "Processor executor closed. Close request not posted.", e5);
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput
    @AnyThread
    public void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int i10 = AnonymousClass1.$SwitchMap$androidx$camera$core$SurfaceOutput$GlTransformOptions[this.mGlTransformOptions.ordinal()];
        if (i10 == 1) {
            System.arraycopy(fArr2, 0, fArr, 0, 16);
        } else if (i10 == 2) {
            System.arraycopy(this.mGlTransform, 0, fArr, 0, 16);
        } else {
            throw new AssertionError("Unknown GlTransformOptions: " + this.mGlTransformOptions);
        }
    }
}
