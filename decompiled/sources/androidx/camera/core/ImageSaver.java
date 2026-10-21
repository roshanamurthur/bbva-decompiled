package androidx.camera.core;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class ImageSaver implements Runnable {
    private static final int COPY_BUFFER_SIZE = 1024;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final String TAG = "ImageSaver";
    private static final String TEMP_FILE_PREFIX = "CameraX";
    private static final String TEMP_FILE_SUFFIX = ".tmp";

    @NonNull
    private final OnImageSavedCallback mCallback;
    private final ImageProxy mImage;
    private final int mJpegQuality;
    private final int mOrientation;

    @NonNull
    private final ImageCapture.OutputFileOptions mOutputFileOptions;

    @NonNull
    private final Executor mSequentialIoExecutor;

    @NonNull
    private final Executor mUserCallbackExecutor;

    /* JADX INFO: renamed from: androidx.camera.core.ImageSaver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType;

        static {
            int[] iArr = new int[ImageUtil.CodecFailedException.FailureType.values().length];
            $SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType = iArr;
            try {
                iArr[ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType[ImageUtil.CodecFailedException.FailureType.DECODE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType[ImageUtil.CodecFailedException.FailureType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface OnImageSavedCallback {
        void onError(@NonNull SaveError saveError, @NonNull String str, @Nullable Throwable th2);

        void onImageSaved(@NonNull ImageCapture.OutputFileResults outputFileResults);
    }

    public enum SaveError {
        FILE_IO_FAILED,
        ENCODE_FAILED,
        CROP_FAILED,
        UNKNOWN
    }

    public ImageSaver(@NonNull ImageProxy imageProxy, @NonNull ImageCapture.OutputFileOptions outputFileOptions, int i10, @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i11, @NonNull Executor executor, @NonNull Executor executor2, @NonNull OnImageSavedCallback onImageSavedCallback) {
        this.mImage = imageProxy;
        this.mOutputFileOptions = outputFileOptions;
        this.mOrientation = i10;
        this.mJpegQuality = i11;
        this.mCallback = onImageSavedCallback;
        this.mUserCallbackExecutor = executor;
        this.mSequentialIoExecutor = executor2;
    }

    private void copyTempFileToOutputStream(@NonNull File file, @NonNull OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private boolean copyTempFileToUri(@NonNull File file, @NonNull Uri uri) throws IOException {
        OutputStream outputStreamOpenOutputStream = this.mOutputFileOptions.getContentResolver().openOutputStream(uri);
        if (outputStreamOpenOutputStream == null) {
            if (outputStreamOpenOutputStream == null) {
                return false;
            }
            outputStreamOpenOutputStream.close();
            return false;
        }
        try {
            copyTempFileToOutputStream(file, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.close();
            return true;
        } catch (Throwable th2) {
            try {
                outputStreamOpenOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    private byte[] imageToJpegByteArray(@NonNull ImageProxy imageProxy, @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i10) throws ImageUtil.CodecFailedException {
        boolean zShouldCropImage = ImageUtil.shouldCropImage(imageProxy);
        int format = imageProxy.getFormat();
        if (format == 256) {
            return !zShouldCropImage ? ImageUtil.jpegImageToJpegByteArray(imageProxy) : ImageUtil.jpegImageToJpegByteArray(imageProxy, imageProxy.getCropRect(), i10);
        }
        if (format == 35) {
            return ImageUtil.yuvImageToJpegByteArray(imageProxy, zShouldCropImage ? imageProxy.getCropRect() : null, i10);
        }
        Logger.w(TAG, "Unrecognized image format: " + format);
        return null;
    }

    private boolean isSaveToFile() {
        return this.mOutputFileOptions.getFile() != null;
    }

    private boolean isSaveToMediaStore() {
        return (this.mOutputFileOptions.getSaveCollection() == null || this.mOutputFileOptions.getContentResolver() == null || this.mOutputFileOptions.getContentValues() == null) ? false : true;
    }

    private boolean isSaveToOutputStream() {
        return this.mOutputFileOptions.getOutputStream() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postError$2(SaveError saveError, String str, Throwable th2) {
        this.mCallback.onError(saveError, str, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postSuccess$1(Uri uri) {
        this.mCallback.onImageSaved(new ImageCapture.OutputFileResults(uri));
    }

    private void postError(final SaveError saveError, final String str, @Nullable final Throwable th2) {
        try {
            this.mUserCallbackExecutor.execute(new Runnable() { // from class: androidx.camera.core.u0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2261p0.lambda$postError$2(saveError, str, th2);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.e(TAG, "Application executor rejected executing OnImageSavedCallback.onError callback. Skipping.");
        }
    }

    private void postSuccess(@Nullable Uri uri) {
        try {
            this.mUserCallbackExecutor.execute(new t0(this, uri, 0));
        } catch (RejectedExecutionException unused) {
            Logger.e(TAG, "Application executor rejected executing OnImageSavedCallback.onImageSaved callback. Skipping.");
        }
    }

    @Nullable
    private File saveImageToTempFile() {
        File fileCreateTempFile;
        SaveError saveError;
        String str;
        Throwable th2;
        try {
            if (isSaveToFile()) {
                fileCreateTempFile = new File(this.mOutputFileOptions.getFile().getParent(), TEMP_FILE_PREFIX + UUID.randomUUID().toString() + TEMP_FILE_SUFFIX);
            } else {
                fileCreateTempFile = File.createTempFile(TEMP_FILE_PREFIX, TEMP_FILE_SUFFIX);
            }
            try {
                ImageProxy imageProxy = this.mImage;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        fileOutputStream.write(imageToJpegByteArray(this.mImage, this.mJpegQuality));
                        Exif exifCreateFromFile = Exif.createFromFile(fileCreateTempFile);
                        Exif.createFromImageProxy(this.mImage).copyToCroppedImage(exifCreateFromFile);
                        if (!new ExifRotationAvailability().shouldUseExifOrientation(this.mImage)) {
                            exifCreateFromFile.rotate(this.mOrientation);
                        }
                        ImageCapture.Metadata metadata = this.mOutputFileOptions.getMetadata();
                        if (metadata.isReversedHorizontal()) {
                            exifCreateFromFile.flipHorizontally();
                        }
                        if (metadata.isReversedVertical()) {
                            exifCreateFromFile.flipVertically();
                        }
                        if (metadata.getLocation() != null) {
                            exifCreateFromFile.attachLocation(this.mOutputFileOptions.getMetadata().getLocation());
                        }
                        exifCreateFromFile.save();
                        fileOutputStream.close();
                        if (imageProxy != null) {
                            imageProxy.close();
                        }
                        th2 = null;
                        saveError = null;
                        str = null;
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    if (imageProxy != null) {
                        try {
                            imageProxy.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            } catch (ImageUtil.CodecFailedException e5) {
                int i10 = AnonymousClass1.$SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType[e5.getFailureType().ordinal()];
                if (i10 == 1) {
                    saveError = SaveError.ENCODE_FAILED;
                    str = "Failed to encode mImage";
                } else if (i10 != 2) {
                    saveError = SaveError.UNKNOWN;
                    str = "Failed to transcode mImage";
                } else {
                    saveError = SaveError.CROP_FAILED;
                    str = "Failed to crop mImage";
                }
            } catch (IOException e7) {
                e = e7;
                saveError = SaveError.FILE_IO_FAILED;
                str = "Failed to write temp file";
                th2 = e;
            } catch (IllegalArgumentException e10) {
                e = e10;
                saveError = SaveError.FILE_IO_FAILED;
                str = "Failed to write temp file";
                th2 = e;
            }
            if (saveError == null) {
                th2 = e5;
                th2 = e5;
                th2 = e5;
                return fileCreateTempFile;
            }
            th2 = e5;
            th2 = e5;
            th2 = e5;
            postError(saveError, str, th2);
            fileCreateTempFile.delete();
            return null;
        } catch (IOException e11) {
            postError(SaveError.FILE_IO_FAILED, "Failed to create temp file", e11);
            return null;
        }
    }

    private void setContentValuePending(@NonNull ContentValues contentValues, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i10));
        }
    }

    private void setUriNotPending(@NonNull Uri uri) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            setContentValuePending(contentValues, 0);
            this.mOutputFileOptions.getContentResolver().update(uri, contentValues, null, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX INFO: renamed from: copyTempFileToDestination, reason: merged with bridge method [inline-methods] */
    public void lambda$run$0(@NonNull File file) {
        Uri uriFromFile;
        SaveError saveError;
        String str;
        Preconditions.checkNotNull(file);
        Throwable e5 = null;
        try {
            try {
                if (isSaveToMediaStore()) {
                    ContentValues contentValues = this.mOutputFileOptions.getContentValues() != null ? new ContentValues(this.mOutputFileOptions.getContentValues()) : new ContentValues();
                    setContentValuePending(contentValues, 1);
                    uriFromFile = this.mOutputFileOptions.getContentResolver().insert(this.mOutputFileOptions.getSaveCollection(), contentValues);
                    try {
                        if (uriFromFile == null) {
                            saveError = SaveError.FILE_IO_FAILED;
                            str = "Failed to insert URI.";
                        } else {
                            if (copyTempFileToUri(file, uriFromFile)) {
                                saveError = null;
                                str = null;
                            } else {
                                saveError = SaveError.FILE_IO_FAILED;
                                str = "Failed to save to URI.";
                            }
                            setUriNotPending(uriFromFile);
                        }
                    } catch (IOException e7) {
                        e5 = e7;
                        saveError = SaveError.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                    } catch (IllegalArgumentException e10) {
                        e5 = e10;
                        saveError = SaveError.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                    }
                } else {
                    if (isSaveToOutputStream()) {
                        copyTempFileToOutputStream(file, this.mOutputFileOptions.getOutputStream());
                    } else if (isSaveToFile()) {
                        File file2 = this.mOutputFileOptions.getFile();
                        if (file2.exists()) {
                            file2.delete();
                        }
                        if (file.renameTo(file2)) {
                            saveError = null;
                            str = null;
                        } else {
                            saveError = SaveError.FILE_IO_FAILED;
                            str = "Failed to rename file.";
                        }
                        uriFromFile = Uri.fromFile(file2);
                    }
                    uriFromFile = null;
                    saveError = null;
                    str = null;
                }
            } catch (Throwable th2) {
                file.delete();
                throw th2;
            }
        } catch (IOException e11) {
            e = e11;
            Throwable th3 = e;
            uriFromFile = null;
            e5 = th3;
            saveError = SaveError.FILE_IO_FAILED;
            str = "Failed to write destination file.";
            file.delete();
            if (saveError != null) {
                postError(saveError, str, e5);
            } else {
                postSuccess(uriFromFile);
            }
        } catch (IllegalArgumentException e12) {
            e = e12;
            Throwable th4 = e;
            uriFromFile = null;
            e5 = th4;
            saveError = SaveError.FILE_IO_FAILED;
            str = "Failed to write destination file.";
            file.delete();
            if (saveError != null) {
                postError(saveError, str, e5);
            } else {
                postSuccess(uriFromFile);
            }
        }
        file.delete();
        if (saveError != null) {
            postError(saveError, str, e5);
        } else {
            postSuccess(uriFromFile);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        final File fileSaveImageToTempFile = saveImageToTempFile();
        if (fileSaveImageToTempFile != null) {
            this.mSequentialIoExecutor.execute(new Runnable() { // from class: androidx.camera.core.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2273p0.lambda$run$0(fileSaveImageToTempFile);
                }
            });
        }
    }
}
