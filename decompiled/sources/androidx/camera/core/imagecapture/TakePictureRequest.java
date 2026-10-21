package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.b0;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.o1;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(api = 21)
public abstract class TakePictureRequest {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$0(ImageCaptureException imageCaptureException) {
        boolean z10 = getInMemoryCallback() != null;
        boolean z11 = getOnDiskCallback() != null;
        if (z10 && !z11) {
            ImageCapture.OnImageCapturedCallback inMemoryCallback = getInMemoryCallback();
            Objects.requireNonNull(inMemoryCallback);
            inMemoryCallback.onError(imageCaptureException);
        } else {
            if (!z11 || z10) {
                throw new IllegalStateException("One and only one callback is allowed.");
            }
            ImageCapture.OnImageSavedCallback onDiskCallback = getOnDiskCallback();
            Objects.requireNonNull(onDiskCallback);
            onDiskCallback.onError(imageCaptureException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResult$1(ImageCapture.OutputFileResults outputFileResults) {
        ImageCapture.OnImageSavedCallback onDiskCallback = getOnDiskCallback();
        Objects.requireNonNull(onDiskCallback);
        Objects.requireNonNull(outputFileResults);
        onDiskCallback.onImageSaved(outputFileResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResult$2(ImageProxy imageProxy) {
        ImageCapture.OnImageCapturedCallback inMemoryCallback = getInMemoryCallback();
        Objects.requireNonNull(inMemoryCallback);
        Objects.requireNonNull(imageProxy);
        inMemoryCallback.onCaptureSuccess(imageProxy);
    }

    @NonNull
    public static TakePictureRequest of(@NonNull Executor executor, @Nullable ImageCapture.OnImageCapturedCallback onImageCapturedCallback, @Nullable ImageCapture.OnImageSavedCallback onImageSavedCallback, @Nullable ImageCapture.OutputFileOptions outputFileOptions, @NonNull Rect rect, @NonNull Matrix matrix, int i10, int i11, int i12, @NonNull List<CameraCaptureCallback> list) {
        Preconditions.checkArgument((onImageSavedCallback == null) == (outputFileOptions == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        Preconditions.checkArgument((onImageCapturedCallback == null) ^ (onImageSavedCallback == null), "One and only one on-disk or in-memory callback should be present.");
        return new AutoValue_TakePictureRequest(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, rect, matrix, i10, i11, i12, list);
    }

    @NonNull
    public abstract Executor getAppExecutor();

    public abstract int getCaptureMode();

    @NonNull
    public abstract Rect getCropRect();

    @Nullable
    public abstract ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    public abstract int getJpegQuality();

    @Nullable
    public abstract ImageCapture.OnImageSavedCallback getOnDiskCallback();

    @Nullable
    public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

    public abstract int getRotationDegrees();

    @NonNull
    public abstract Matrix getSensorToBufferTransform();

    @NonNull
    public abstract List<CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks();

    public void onError(@NonNull ImageCaptureException imageCaptureException) {
        getAppExecutor().execute(new androidx.appcompat.app.h(this, imageCaptureException, 3));
    }

    public void onResult(@Nullable ImageCapture.OutputFileResults outputFileResults) {
        getAppExecutor().execute(new b0(this, outputFileResults, 1));
    }

    public void onResult(@Nullable ImageProxy imageProxy) {
        getAppExecutor().execute(new o1(this, imageProxy, 1));
    }
}
