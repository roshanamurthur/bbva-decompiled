package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.odml.image.BitmapExtractor;
import com.google.android.odml.image.ByteBufferExtractor;
import com.google.android.odml.image.ImageProperties;
import com.google.android.odml.image.MediaImageExtractor;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.common.InputImage;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class MobileVisionBase<DetectionResultT> implements Closeable, LifecycleObserver {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final GmsLogger f49588u0 = new GmsLogger("MobileVisionBase", "");
    public static final /* synthetic */ int zza = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicBoolean f49589p0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MLTask f49590q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final CancellationTokenSource f49591r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Executor f49592s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Task f49593t0;

    @KeepForSdk
    public MobileVisionBase(@NonNull MLTask<DetectionResultT, InputImage> mLTask, @NonNull Executor executor) {
        this.f49590q0 = mLTask;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f49591r0 = cancellationTokenSource;
        this.f49592s0 = executor;
        mLTask.pin();
        this.f49593t0 = mLTask.callAfterLoad(executor, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                GmsLogger gmsLogger = MobileVisionBase.f49588u0;
                return null;
            }
        }, cancellationTokenSource.getToken()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.vision.common.internal.zzc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                MobileVisionBase.f49588u0.e("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        if (this.f49589p0.getAndSet(true)) {
            return;
        }
        this.f49591r0.cancel();
        this.f49590q0.unpin(this.f49592s0);
    }

    @NonNull
    @KeepForSdk
    public synchronized Task<Void> closeWithTask() {
        if (this.f49589p0.getAndSet(true)) {
            return Tasks.forResult(null);
        }
        this.f49591r0.cancel();
        return this.f49590q0.unpinWithTask(this.f49592s0);
    }

    @NonNull
    @KeepForSdk
    public synchronized Task<Void> getInitTaskBase() {
        return this.f49593t0;
    }

    @NonNull
    @KeepForSdk
    public Task<DetectionResultT> process(@NonNull Bitmap bitmap, int i10) {
        return processBase(InputImage.fromBitmap(bitmap, i10));
    }

    @NonNull
    @KeepForSdk
    public synchronized Task<DetectionResultT> processBase(@NonNull final MlImage mlImage) {
        Preconditions.checkNotNull(mlImage, "MlImage can not be null");
        if (this.f49589p0.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        }
        if (mlImage.getWidth() < 32 || mlImage.getHeight() < 32) {
            return Tasks.forException(new MlKitException("MlImage width and height should be at least 32!", 3));
        }
        mlImage.getInternal().acquire();
        return this.f49590q0.callAfterLoad(this.f49592s0, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzd
            @Override // java.util.concurrent.Callable
            public final Object call() throws MlKitException {
                InputImage inputImageFromBitmap;
                Integer numValueOf;
                MobileVisionBase mobileVisionBase = this.zza;
                MlImage mlImage2 = mlImage;
                mobileVisionBase.getClass();
                ImageProperties imageProperties = mlImage2.getContainedImageProperties().get(0);
                int storageType = imageProperties.getStorageType();
                if (storageType != 1) {
                    inputImageFromBitmap = null;
                    if (storageType == 2) {
                        ByteBuffer byteBufferExtract = ByteBufferExtractor.extract(mlImage2);
                        int imageFormat = imageProperties.getImageFormat();
                        if (imageFormat != 4) {
                            numValueOf = imageFormat != 5 ? null : Integer.valueOf(InputImage.IMAGE_FORMAT_YV12);
                        } else {
                            numValueOf = 17;
                        }
                        if (numValueOf != null) {
                            zzli.zzb(zzlg.zzb("vision-common"), numValueOf.intValue(), 3, SystemClock.elapsedRealtime(), mlImage2.getHeight(), mlImage2.getWidth(), byteBufferExtract.limit(), mlImage2.getRotation());
                            inputImageFromBitmap = InputImage.fromByteBuffer(byteBufferExtract, mlImage2.getWidth(), mlImage2.getHeight(), mlImage2.getRotation(), numValueOf.intValue());
                        }
                    } else if (storageType == 3) {
                        Image imageExtract = MediaImageExtractor.extract(mlImage2);
                        zzli.zzb(zzlg.zzb("vision-common"), imageExtract.getFormat(), 5, SystemClock.elapsedRealtime(), mlImage2.getHeight(), mlImage2.getWidth(), imageExtract.getFormat() == 256 ? imageExtract.getPlanes()[0].getBuffer().limit() : (imageExtract.getPlanes()[0].getBuffer().limit() * 3) / 2, mlImage2.getRotation());
                        inputImageFromBitmap = InputImage.fromMediaImage(imageExtract, mlImage2.getRotation());
                    }
                } else {
                    Bitmap bitmapExtract = BitmapExtractor.extract(mlImage2);
                    zzli.zzb(zzlg.zzb("vision-common"), -1, 1, SystemClock.elapsedRealtime(), mlImage2.getHeight(), mlImage2.getWidth(), bitmapExtract.getAllocationByteCount(), mlImage2.getRotation());
                    inputImageFromBitmap = InputImage.fromBitmap(bitmapExtract, mlImage2.getRotation());
                }
                if (inputImageFromBitmap != null) {
                    zzlk.zza();
                }
                if (inputImageFromBitmap != null) {
                    return mobileVisionBase.f49590q0.run(inputImageFromBitmap);
                }
                throw new MlKitException("Current type of MlImage is not supported.", 13);
            }
        }, this.f49591r0.getToken()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.vision.common.internal.zze
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                MlImage mlImage2 = mlImage;
                GmsLogger gmsLogger = MobileVisionBase.f49588u0;
                mlImage2.close();
            }
        });
    }

    @NonNull
    @KeepForSdk
    public Task<DetectionResultT> process(@NonNull Image image, int i10) {
        return processBase(InputImage.fromMediaImage(image, i10));
    }

    @NonNull
    @KeepForSdk
    public Task<DetectionResultT> process(@NonNull Image image, int i10, @NonNull Matrix matrix) {
        return processBase(InputImage.fromMediaImage(image, i10, matrix));
    }

    @NonNull
    @KeepForSdk
    public Task<DetectionResultT> process(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        return processBase(InputImage.fromByteBuffer(byteBuffer, i10, i11, i12, i13));
    }

    @NonNull
    @KeepForSdk
    public synchronized Task<DetectionResultT> processBase(@NonNull final InputImage inputImage) {
        Preconditions.checkNotNull(inputImage, "InputImage can not be null");
        if (this.f49589p0.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        }
        if (inputImage.getWidth() >= 32 && inputImage.getHeight() >= 32) {
            return this.f49590q0.callAfterLoad(this.f49592s0, new Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    MobileVisionBase mobileVisionBase = this.zza;
                    InputImage inputImage2 = inputImage;
                    mobileVisionBase.getClass();
                    zzkl zzklVarZze = zzkl.zze("detectorTaskWithResource#run");
                    zzklVarZze.zzb();
                    try {
                        Object objRun = mobileVisionBase.f49590q0.run(inputImage2);
                        zzklVarZze.close();
                        return objRun;
                    } catch (Throwable th2) {
                        try {
                            zzklVarZze.close();
                        } catch (Throwable th3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            } catch (Exception unused) {
                            }
                        }
                        throw th2;
                    }
                }
            }, this.f49591r0.getToken());
        }
        return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
    }
}
