package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class ProcessingImageReader implements ImageReaderProxy {
    private static final int EXIF_MAX_SIZE_BYTES = 64000;
    private static final String TAG = "ProcessingImageReader";

    @NonNull
    final CaptureProcessor mCaptureProcessor;

    @GuardedBy("mLock")
    CallbackToFutureAdapter.Completer<Void> mCloseCompleter;

    @GuardedBy("mLock")
    private ListenableFuture<Void> mCloseFuture;

    @GuardedBy("mLock")
    Executor mErrorCallbackExecutor;

    @Nullable
    @GuardedBy("mLock")
    Executor mExecutor;

    @GuardedBy("mLock")
    final ImageReaderProxy mInputImageReader;

    @Nullable
    @GuardedBy("mLock")
    ImageReaderProxy.OnImageAvailableListener mListener;

    @GuardedBy("mLock")
    OnProcessingErrorCallback mOnProcessingErrorCallback;

    @GuardedBy("mLock")
    final ImageReaderProxy mOutputImageReader;

    @NonNull
    final Executor mPostProcessExecutor;

    @NonNull
    private final ListenableFuture<Void> mUnderlyingCaptureProcessorCloseFuture;
    final Object mLock = new Object();
    private ImageReaderProxy.OnImageAvailableListener mTransformedListener = new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.ProcessingImageReader.1
        @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
        public void onImageAvailable(@NonNull ImageReaderProxy imageReaderProxy) {
            ProcessingImageReader.this.imageIncoming(imageReaderProxy);
        }
    };
    private ImageReaderProxy.OnImageAvailableListener mImageProcessedListener = new AnonymousClass2();
    private FutureCallback<List<ImageProxy>> mCaptureStageReadyCallback = new AnonymousClass3();

    @GuardedBy("mLock")
    boolean mClosed = false;

    @GuardedBy("mLock")
    boolean mProcessing = false;
    private String mTagBundleKey = new String();

    @NonNull
    @GuardedBy("mLock")
    SettableImageProxyBundle mSettableImageProxyBundle = new SettableImageProxyBundle(Collections.emptyList(), this.mTagBundleKey);
    private final List<Integer> mCaptureIdList = new ArrayList();
    private ListenableFuture<List<ImageProxy>> mSettableImageProxyFutureList = Futures.immediateFuture(new ArrayList());

    /* JADX INFO: renamed from: androidx.camera.core.ProcessingImageReader$2, reason: invalid class name */
    public class AnonymousClass2 implements ImageReaderProxy.OnImageAvailableListener {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onImageAvailable$0(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
            onImageAvailableListener.onImageAvailable(ProcessingImageReader.this);
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
        public void onImageAvailable(@NonNull ImageReaderProxy imageReaderProxy) {
            final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
            Executor executor;
            synchronized (ProcessingImageReader.this.mLock) {
                ProcessingImageReader processingImageReader = ProcessingImageReader.this;
                onImageAvailableListener = processingImageReader.mListener;
                executor = processingImageReader.mExecutor;
                processingImageReader.mSettableImageProxyBundle.reset();
                ProcessingImageReader.this.setupSettableImageProxyBundleCallbacks();
            }
            if (onImageAvailableListener != null) {
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.d1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2062p0.lambda$onImageAvailable$0(onImageAvailableListener);
                        }
                    });
                } else {
                    onImageAvailableListener.onImageAvailable(ProcessingImageReader.this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.ProcessingImageReader$3, reason: invalid class name */
    public class AnonymousClass3 implements FutureCallback<List<ImageProxy>> {
        public AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onSuccess$0(OnProcessingErrorCallback onProcessingErrorCallback, Exception exc) {
            onProcessingErrorCallback.notifyProcessingError(exc.getMessage(), exc.getCause());
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(@Nullable List<ImageProxy> list) {
            ProcessingImageReader processingImageReader;
            synchronized (ProcessingImageReader.this.mLock) {
                try {
                    ProcessingImageReader processingImageReader2 = ProcessingImageReader.this;
                    if (processingImageReader2.mClosed) {
                        return;
                    }
                    processingImageReader2.mProcessing = true;
                    SettableImageProxyBundle settableImageProxyBundle = processingImageReader2.mSettableImageProxyBundle;
                    final OnProcessingErrorCallback onProcessingErrorCallback = processingImageReader2.mOnProcessingErrorCallback;
                    Executor executor = processingImageReader2.mErrorCallbackExecutor;
                    try {
                        processingImageReader2.mCaptureProcessor.process(settableImageProxyBundle);
                    } catch (Exception e5) {
                        synchronized (ProcessingImageReader.this.mLock) {
                            try {
                                ProcessingImageReader.this.mSettableImageProxyBundle.reset();
                                if (onProcessingErrorCallback != null && executor != null) {
                                    executor.execute(new Runnable() { // from class: androidx.camera.core.e1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ProcessingImageReader.AnonymousClass3.lambda$onSuccess$0(onProcessingErrorCallback, e5);
                                        }
                                    });
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    synchronized (ProcessingImageReader.this.mLock) {
                        processingImageReader = ProcessingImageReader.this;
                        processingImageReader.mProcessing = false;
                    }
                    processingImageReader.closeAndCompleteFutureIfNecessary();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(@NonNull Throwable th2) {
        }
    }

    public interface OnProcessingErrorCallback {
        void notifyProcessingError(@Nullable String str, @Nullable Throwable th2);
    }

    public ProcessingImageReader(@NonNull Builder builder) {
        if (builder.mInputImageReader.getMaxImages() < builder.mCaptureBundle.getCaptureStages().size()) {
            throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
        }
        ImageReaderProxy imageReaderProxy = builder.mInputImageReader;
        this.mInputImageReader = imageReaderProxy;
        int width = imageReaderProxy.getWidth();
        int height = imageReaderProxy.getHeight();
        int i10 = builder.mOutputFormat;
        if (i10 == 256) {
            width = ((int) (width * height * 1.5f)) + EXIF_MAX_SIZE_BYTES;
            height = 1;
        }
        AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(width, height, i10, imageReaderProxy.getMaxImages()));
        this.mOutputImageReader = androidImageReaderProxy;
        this.mPostProcessExecutor = builder.mPostProcessExecutor;
        CaptureProcessor captureProcessor = builder.mCaptureProcessor;
        this.mCaptureProcessor = captureProcessor;
        captureProcessor.onOutputSurface(androidImageReaderProxy.getSurface(), builder.mOutputFormat);
        captureProcessor.onResolutionUpdate(new Size(imageReaderProxy.getWidth(), imageReaderProxy.getHeight()));
        this.mUnderlyingCaptureProcessorCloseFuture = captureProcessor.getCloseFuture();
        setCaptureBundle(builder.mCaptureBundle);
    }

    private void cancelSettableImageProxyBundleFutureList() {
        synchronized (this.mLock) {
            try {
                if (!this.mSettableImageProxyFutureList.isDone()) {
                    this.mSettableImageProxyFutureList.cancel(true);
                }
                this.mSettableImageProxyBundle.reset();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeAndCompleteFutureIfNecessary$0(CallbackToFutureAdapter.Completer completer) {
        cancelSettableImageProxyBundleFutureList();
        if (completer != null) {
            completer.set(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getCloseFuture$1(Void r1) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getCloseFuture$2(CallbackToFutureAdapter.Completer completer) throws Exception {
        synchronized (this.mLock) {
            this.mCloseCompleter = completer;
        }
        return "ProcessingImageReader-close";
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireLatestImage() {
        ImageProxy imageProxyAcquireLatestImage;
        synchronized (this.mLock) {
            imageProxyAcquireLatestImage = this.mOutputImageReader.acquireLatestImage();
        }
        return imageProxyAcquireLatestImage;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public ImageProxy acquireNextImage() {
        ImageProxy imageProxyAcquireNextImage;
        synchronized (this.mLock) {
            imageProxyAcquireNextImage = this.mOutputImageReader.acquireNextImage();
        }
        return imageProxyAcquireNextImage;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            try {
                this.mListener = null;
                this.mExecutor = null;
                this.mInputImageReader.clearOnImageAvailableListener();
                this.mOutputImageReader.clearOnImageAvailableListener();
                if (!this.mProcessing) {
                    this.mSettableImageProxyBundle.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                this.mInputImageReader.clearOnImageAvailableListener();
                this.mOutputImageReader.clearOnImageAvailableListener();
                this.mClosed = true;
                this.mCaptureProcessor.close();
                closeAndCompleteFutureIfNecessary();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void closeAndCompleteFutureIfNecessary() {
        boolean z10;
        boolean z11;
        final CallbackToFutureAdapter.Completer<Void> completer;
        synchronized (this.mLock) {
            try {
                z10 = this.mClosed;
                z11 = this.mProcessing;
                completer = this.mCloseCompleter;
                if (z10 && !z11) {
                    this.mInputImageReader.close();
                    this.mSettableImageProxyBundle.close();
                    this.mOutputImageReader.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || z11) {
            return;
        }
        this.mUnderlyingCaptureProcessorCloseFuture.addListener(new Runnable() { // from class: androidx.camera.core.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f2056p0.lambda$closeAndCompleteFutureIfNecessary$0(completer);
            }
        }, CameraXExecutors.directExecutor());
    }

    @Nullable
    public CameraCaptureCallback getCameraCaptureCallback() {
        synchronized (this.mLock) {
            try {
                ImageReaderProxy imageReaderProxy = this.mInputImageReader;
                if (imageReaderProxy instanceof MetadataImageReader) {
                    return ((MetadataImageReader) imageReaderProxy).getCameraCaptureCallback();
                }
                return new CameraCaptureCallback() { // from class: androidx.camera.core.ProcessingImageReader.4
                };
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public ListenableFuture<Void> getCloseFuture() {
        ListenableFuture<Void> listenableFutureNonCancellationPropagating;
        synchronized (this.mLock) {
            try {
                if (!this.mClosed || this.mProcessing) {
                    if (this.mCloseFuture == null) {
                        this.mCloseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.b1
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return this.f2053p0.lambda$getCloseFuture$2(completer);
                            }
                        });
                    }
                    listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(this.mCloseFuture);
                } else {
                    listenableFutureNonCancellationPropagating = Futures.transform(this.mUnderlyingCaptureProcessorCloseFuture, new a1(), CameraXExecutors.directExecutor());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listenableFutureNonCancellationPropagating;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mInputImageReader.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mOutputImageReader.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mInputImageReader.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @Nullable
    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mInputImageReader.getSurface();
        }
        return surface;
    }

    @NonNull
    public String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mInputImageReader.getWidth();
        }
        return width;
    }

    public void imageIncoming(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            try {
                ImageProxy imageProxyAcquireNextImage = imageReaderProxy.acquireNextImage();
                if (imageProxyAcquireNextImage != null) {
                    Integer num = (Integer) imageProxyAcquireNextImage.getImageInfo().getTagBundle().getTag(this.mTagBundleKey);
                    if (this.mCaptureIdList.contains(num)) {
                        this.mSettableImageProxyBundle.addImageProxy(imageProxyAcquireNextImage);
                    } else {
                        Logger.w(TAG, "ImageProxyBundle does not contain this id: " + num);
                        imageProxyAcquireNextImage.close();
                    }
                }
            } catch (IllegalStateException e5) {
                Logger.e(TAG, "Failed to acquire latest image.", e5);
            }
        }
    }

    public void setCaptureBundle(@NonNull CaptureBundle captureBundle) {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                cancelSettableImageProxyBundleFutureList();
                if (captureBundle.getCaptureStages() != null) {
                    if (this.mInputImageReader.getMaxImages() < captureBundle.getCaptureStages().size()) {
                        throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                    }
                    this.mCaptureIdList.clear();
                    for (CaptureStage captureStage : captureBundle.getCaptureStages()) {
                        if (captureStage != null) {
                            this.mCaptureIdList.add(Integer.valueOf(captureStage.getId()));
                        }
                    }
                }
                String string = Integer.toString(captureBundle.hashCode());
                this.mTagBundleKey = string;
                this.mSettableImageProxyBundle = new SettableImageProxyBundle(this.mCaptureIdList, string);
                setupSettableImageProxyBundleCallbacks();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@NonNull ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, @NonNull Executor executor) {
        synchronized (this.mLock) {
            this.mListener = (ImageReaderProxy.OnImageAvailableListener) Preconditions.checkNotNull(onImageAvailableListener);
            this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
            this.mInputImageReader.setOnImageAvailableListener(this.mTransformedListener, executor);
            this.mOutputImageReader.setOnImageAvailableListener(this.mImageProcessedListener, executor);
        }
    }

    public void setOnProcessingErrorCallback(@NonNull Executor executor, @NonNull OnProcessingErrorCallback onProcessingErrorCallback) {
        synchronized (this.mLock) {
            this.mErrorCallbackExecutor = executor;
            this.mOnProcessingErrorCallback = onProcessingErrorCallback;
        }
    }

    @GuardedBy("mLock")
    public void setupSettableImageProxyBundleCallbacks() {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = this.mCaptureIdList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.mSettableImageProxyBundle.getImageProxy(it.next().intValue()));
        }
        this.mSettableImageProxyFutureList = Futures.allAsList(arrayList);
        Futures.addCallback(Futures.allAsList(arrayList), this.mCaptureStageReadyCallback, this.mPostProcessExecutor);
    }

    public static final class Builder {

        @NonNull
        protected final CaptureBundle mCaptureBundle;

        @NonNull
        protected final CaptureProcessor mCaptureProcessor;

        @NonNull
        protected final ImageReaderProxy mInputImageReader;
        protected int mOutputFormat;

        @NonNull
        protected Executor mPostProcessExecutor;

        public Builder(@NonNull ImageReaderProxy imageReaderProxy, @NonNull CaptureBundle captureBundle, @NonNull CaptureProcessor captureProcessor) {
            this.mPostProcessExecutor = Executors.newSingleThreadExecutor();
            this.mInputImageReader = imageReaderProxy;
            this.mCaptureBundle = captureBundle;
            this.mCaptureProcessor = captureProcessor;
            this.mOutputFormat = imageReaderProxy.getImageFormat();
        }

        public ProcessingImageReader build() {
            return new ProcessingImageReader(this);
        }

        @NonNull
        public Builder setOutputFormat(int i10) {
            this.mOutputFormat = i10;
            return this;
        }

        @NonNull
        public Builder setPostProcessExecutor(@NonNull Executor executor) {
            this.mPostProcessExecutor = executor;
            return this;
        }

        public Builder(int i10, int i11, int i12, int i13, @NonNull CaptureBundle captureBundle, @NonNull CaptureProcessor captureProcessor) {
            this(new MetadataImageReader(i10, i11, i12, i13), captureBundle, captureProcessor);
        }
    }
}
