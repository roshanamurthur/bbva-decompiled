package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class CaptureProcessorPipeline implements CaptureProcessor {
    private static final String TAG = "CaptureProcessorPipeline";

    @GuardedBy("mLock")
    CallbackToFutureAdapter.Completer<Void> mCloseCompleter;

    @GuardedBy("mLock")
    private ListenableFuture<Void> mCloseFuture;

    @NonNull
    final Executor mExecutor;
    private final int mMaxImages;

    @NonNull
    private final CaptureProcessor mPostCaptureProcessor;

    @NonNull
    private final CaptureProcessor mPreCaptureProcessor;

    @NonNull
    private final ListenableFuture<List<Void>> mUnderlyingCaptureProcessorsCloseFuture;
    private ImageReaderProxy mIntermediateImageReader = null;
    private ImageInfo mSourceImageInfo = null;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private boolean mClosed = false;

    @GuardedBy("mLock")
    private boolean mProcessing = false;

    public CaptureProcessorPipeline(@NonNull CaptureProcessor captureProcessor, int i10, @NonNull CaptureProcessor captureProcessor2, @NonNull Executor executor) {
        this.mPreCaptureProcessor = captureProcessor;
        this.mPostCaptureProcessor = captureProcessor2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(captureProcessor.getCloseFuture());
        arrayList.add(captureProcessor2.getCloseFuture());
        this.mUnderlyingCaptureProcessorsCloseFuture = Futures.allAsList(arrayList);
        this.mExecutor = executor;
        this.mMaxImages = i10;
    }

    private void closeAndCompleteFutureIfNecessary() {
        boolean z10;
        boolean z11;
        final CallbackToFutureAdapter.Completer<Void> completer;
        synchronized (this.mLock) {
            try {
                z10 = this.mClosed;
                z11 = this.mProcessing;
                completer = this.mCloseCompleter;
                if (z10 && !z11) {
                    this.mIntermediateImageReader.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || z11 || completer == null) {
            return;
        }
        this.mUnderlyingCaptureProcessorsCloseFuture.addListener(new Runnable() { // from class: androidx.camera.core.o
            @Override // java.lang.Runnable
            public final void run() {
                completer.set(null);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getCloseFuture$3(List list) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getCloseFuture$4(CallbackToFutureAdapter.Completer completer) throws Exception {
        synchronized (this.mLock) {
            this.mCloseCompleter = completer;
        }
        return "CaptureProcessorPipeline-close";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResolutionUpdate$1(ImageReaderProxy imageReaderProxy) {
        final ImageProxy imageProxyAcquireNextImage = imageReaderProxy.acquireNextImage();
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2173p0.lambda$onResolutionUpdate$0(imageProxyAcquireNextImage);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.e(TAG, "The executor for post-processing might have been shutting down or terminated!");
            imageProxyAcquireNextImage.close();
        }
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void close() {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                this.mClosed = true;
                this.mPreCaptureProcessor.close();
                this.mPostCaptureProcessor.close();
                closeAndCompleteFutureIfNecessary();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    @NonNull
    public ListenableFuture<Void> getCloseFuture() {
        ListenableFuture<Void> listenableFutureNonCancellationPropagating;
        synchronized (this.mLock) {
            try {
                if (!this.mClosed || this.mProcessing) {
                    if (this.mCloseFuture == null) {
                        this.mCloseFuture = CallbackToFutureAdapter.getFuture(new m(this, 0));
                    }
                    listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(this.mCloseFuture);
                } else {
                    listenableFutureNonCancellationPropagating = Futures.transform(this.mUnderlyingCaptureProcessorsCloseFuture, new l(), CameraXExecutors.directExecutor());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listenableFutureNonCancellationPropagating;
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onOutputSurface(@NonNull Surface surface, int i10) {
        this.mPostCaptureProcessor.onOutputSurface(surface, i10);
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onResolutionUpdate(@NonNull Size size) {
        AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.mMaxImages));
        this.mIntermediateImageReader = androidImageReaderProxy;
        this.mPreCaptureProcessor.onOutputSurface(androidImageReaderProxy.getSurface(), 35);
        this.mPreCaptureProcessor.onResolutionUpdate(size);
        this.mPostCaptureProcessor.onResolutionUpdate(size);
        this.mIntermediateImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.k
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                this.f2160a.lambda$onResolutionUpdate$1(imageReaderProxy);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: renamed from: postProcess, reason: merged with bridge method [inline-methods] */
    public void lambda$onResolutionUpdate$0(ImageProxy imageProxy) {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mClosed;
        }
        if (!z10) {
            Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
            Preconditions.checkNotNull(this.mSourceImageInfo);
            String next = this.mSourceImageInfo.getTagBundle().listKeys().iterator().next();
            int iIntValue = ((Integer) this.mSourceImageInfo.getTagBundle().getTag(next)).intValue();
            SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, size, this.mSourceImageInfo);
            this.mSourceImageInfo = null;
            SettableImageProxyBundle settableImageProxyBundle = new SettableImageProxyBundle(Collections.singletonList(Integer.valueOf(iIntValue)), next);
            settableImageProxyBundle.addImageProxy(settableImageProxy);
            try {
                this.mPostCaptureProcessor.process(settableImageProxyBundle);
            } catch (Exception e5) {
                Logger.e(TAG, "Post processing image failed! " + e5.getMessage());
            }
        }
        synchronized (this.mLock) {
            this.mProcessing = false;
        }
        closeAndCompleteFutureIfNecessary();
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void process(@NonNull ImageProxyBundle imageProxyBundle) {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                this.mProcessing = true;
                ListenableFuture<ImageProxy> imageProxy = imageProxyBundle.getImageProxy(imageProxyBundle.getCaptureIds().get(0).intValue());
                Preconditions.checkArgument(imageProxy.isDone());
                try {
                    this.mSourceImageInfo = imageProxy.get().getImageInfo();
                    this.mPreCaptureProcessor.process(imageProxyBundle);
                } catch (InterruptedException | ExecutionException unused) {
                    throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
