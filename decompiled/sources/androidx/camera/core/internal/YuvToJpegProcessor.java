package androidx.camera.core.internal;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.impl.utils.ExifOutputStream;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public class YuvToJpegProcessor implements CaptureProcessor {
    private static final String TAG = "YuvToJpegProcessor";
    private static final Rect UNINITIALIZED_RECT = new Rect(0, 0, 0, 0);

    @GuardedBy("mLock")
    CallbackToFutureAdapter.Completer<Void> mCloseCompleter;

    @GuardedBy("mLock")
    private ListenableFuture<Void> mCloseFuture;

    @GuardedBy("mLock")
    private ImageWriter mImageWriter;
    private final int mMaxImages;

    @IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    @GuardedBy("mLock")
    private int mQuality;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private int mRotationDegrees = 0;

    @GuardedBy("mLock")
    private boolean mClosed = false;

    @GuardedBy("mLock")
    private int mProcessingImages = 0;

    @GuardedBy("mLock")
    private Rect mImageRect = UNINITIALIZED_RECT;

    public YuvToJpegProcessor(@IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i10, int i11) {
        this.mQuality = i10;
        this.mMaxImages = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getCloseFuture$0(CallbackToFutureAdapter.Completer completer) throws Exception {
        synchronized (this.mLock) {
            this.mCloseCompleter = completer;
        }
        return "YuvToJpegProcessor-close";
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void close() {
        CallbackToFutureAdapter.Completer<Void> completer;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                this.mClosed = true;
                if (this.mProcessingImages != 0 || this.mImageWriter == null) {
                    Logger.d(TAG, "close() called while processing. Will close after completion.");
                    completer = null;
                } else {
                    Logger.d(TAG, "No processing in progress. Closing immediately.");
                    this.mImageWriter.close();
                    completer = this.mCloseCompleter;
                }
                if (completer != null) {
                    completer.set(null);
                }
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
                if (this.mClosed && this.mProcessingImages == 0) {
                    listenableFutureNonCancellationPropagating = Futures.immediateFuture(null);
                } else {
                    if (this.mCloseFuture == null) {
                        this.mCloseFuture = CallbackToFutureAdapter.getFuture(new g(this));
                    }
                    listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(this.mCloseFuture);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listenableFutureNonCancellationPropagating;
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onOutputSurface(@NonNull Surface surface, int i10) {
        Preconditions.checkState(i10 == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    Logger.w(TAG, "Cannot set output surface. Processor is closed.");
                } else {
                    if (this.mImageWriter != null) {
                        throw new IllegalStateException("Output surface already set.");
                    }
                    this.mImageWriter = ImageWriterCompat.newInstance(surface, this.mMaxImages, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onResolutionUpdate(@NonNull Size size) {
        synchronized (this.mLock) {
            this.mImageRect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void process(@NonNull ImageProxyBundle imageProxyBundle) throws Throwable {
        ImageWriter imageWriter;
        boolean z10;
        Rect rect;
        int i10;
        int i11;
        ImageProxy imageProxy;
        Image imageDequeueInputImage;
        CallbackToFutureAdapter.Completer<Void> completer;
        CallbackToFutureAdapter.Completer<Void> completer2;
        CallbackToFutureAdapter.Completer<Void> completer3;
        List<Integer> captureIds = imageProxyBundle.getCaptureIds();
        boolean z11 = false;
        Preconditions.checkArgument(captureIds.size() == 1, "Processing image bundle have single capture id, but found " + captureIds.size());
        ListenableFuture<ImageProxy> imageProxy2 = imageProxyBundle.getImageProxy(captureIds.get(0).intValue());
        Preconditions.checkArgument(imageProxy2.isDone());
        synchronized (this.mLock) {
            try {
                imageWriter = this.mImageWriter;
                z10 = !this.mClosed;
                rect = this.mImageRect;
                if (z10) {
                    this.mProcessingImages++;
                }
                i10 = this.mQuality;
                i11 = this.mRotationDegrees;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            imageProxy = imageProxy2.get();
            try {
                if (!z10) {
                    Logger.w(TAG, "Image enqueued for processing on closed processor.");
                    imageProxy.close();
                    synchronized (this.mLock) {
                        if (z10) {
                            try {
                                int i12 = this.mProcessingImages;
                                this.mProcessingImages = i12 - 1;
                                if (i12 == 0 && this.mClosed) {
                                    z11 = true;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        completer3 = this.mCloseCompleter;
                    }
                    if (z11) {
                        imageWriter.close();
                        Logger.d(TAG, "Closed after completion of last image processed.");
                        if (completer3 != null) {
                            completer3.set(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                imageDequeueInputImage = imageWriter.dequeueInputImage();
                try {
                    try {
                        ImageProxy imageProxy3 = imageProxy2.get();
                        try {
                            Preconditions.checkState(imageProxy3.getFormat() == 35, "Input image is not expected YUV_420_888 image format");
                            YuvImage yuvImage = new YuvImage(ImageUtil.yuv_420_888toNv21(imageProxy3), 17, imageProxy3.getWidth(), imageProxy3.getHeight(), null);
                            ByteBuffer buffer = imageDequeueInputImage.getPlanes()[0].getBuffer();
                            int iPosition = buffer.position();
                            yuvImage.compressToJpeg(rect, i10, new ExifOutputStream(new ByteBufferOutputStream(buffer), ExifData.create(imageProxy3, i11)));
                            imageProxy3.close();
                            try {
                                buffer.limit(buffer.position());
                                buffer.position(iPosition);
                                imageWriter.queueInputImage(imageDequeueInputImage);
                                synchronized (this.mLock) {
                                    if (z10) {
                                        try {
                                            int i13 = this.mProcessingImages;
                                            this.mProcessingImages = i13 - 1;
                                            if (i13 == 0 && this.mClosed) {
                                                z11 = true;
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    completer2 = this.mCloseCompleter;
                                }
                                if (z11) {
                                    imageWriter.close();
                                    Logger.d(TAG, "Closed after completion of last image processed.");
                                    if (completer2 == null) {
                                        return;
                                    }
                                    completer2.set(null);
                                }
                            } catch (Exception e5) {
                                e = e5;
                                imageProxy = null;
                                if (z10) {
                                    Logger.e(TAG, "Failed to process YUV -> JPEG", e);
                                    imageDequeueInputImage = imageWriter.dequeueInputImage();
                                    ByteBuffer buffer2 = imageDequeueInputImage.getPlanes()[0].getBuffer();
                                    buffer2.rewind();
                                    buffer2.limit(0);
                                    imageWriter.queueInputImage(imageDequeueInputImage);
                                }
                                synchronized (this.mLock) {
                                    if (z10) {
                                        try {
                                            int i14 = this.mProcessingImages;
                                            this.mProcessingImages = i14 - 1;
                                            if (i14 == 0 && this.mClosed) {
                                                z11 = true;
                                            }
                                        } catch (Throwable th5) {
                                            throw th5;
                                        }
                                    }
                                    completer2 = this.mCloseCompleter;
                                }
                                if (imageDequeueInputImage != null) {
                                    imageDequeueInputImage.close();
                                }
                                if (imageProxy != null) {
                                    imageProxy.close();
                                }
                                if (!z11) {
                                    return;
                                }
                                imageWriter.close();
                                Logger.d(TAG, "Closed after completion of last image processed.");
                                if (completer2 == null) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                imageProxy = null;
                                synchronized (this.mLock) {
                                    if (z10) {
                                        try {
                                            int i15 = this.mProcessingImages;
                                            this.mProcessingImages = i15 - 1;
                                            if (i15 == 0 && this.mClosed) {
                                                z11 = true;
                                            }
                                        } catch (Throwable th7) {
                                            throw th7;
                                        }
                                    }
                                    completer = this.mCloseCompleter;
                                }
                                if (imageDequeueInputImage != null) {
                                    imageDequeueInputImage.close();
                                }
                                if (imageProxy != null) {
                                    imageProxy.close();
                                }
                                if (z11) {
                                    imageWriter.close();
                                    Logger.d(TAG, "Closed after completion of last image processed.");
                                    if (completer != null) {
                                        completer.set(null);
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            imageProxy = imageProxy3;
                        } catch (Throwable th8) {
                            th = th8;
                            imageProxy = imageProxy3;
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Exception e11) {
                e = e11;
                imageDequeueInputImage = null;
            } catch (Throwable th10) {
                th = th10;
                imageDequeueInputImage = null;
            }
        } catch (Exception e12) {
            e = e12;
            imageProxy = null;
            imageDequeueInputImage = null;
        } catch (Throwable th11) {
            th = th11;
            imageProxy = null;
            imageDequeueInputImage = null;
        }
    }

    public void setJpegQuality(@IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i10) {
        synchronized (this.mLock) {
            this.mQuality = i10;
        }
    }

    public void setRotationDegrees(int i10) {
        synchronized (this.mLock) {
            this.mRotationDegrees = i10;
        }
    }
}
