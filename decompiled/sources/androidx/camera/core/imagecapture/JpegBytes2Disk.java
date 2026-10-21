package androidx.camera.core.imagecapture;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.google.auto.value.AutoValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
class JpegBytes2Disk implements Operation<In, ImageCapture.OutputFileResults> {
    private static final int COPY_BUFFER_SIZE = 1024;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final String TEMP_FILE_PREFIX = "CameraX";
    private static final String TEMP_FILE_SUFFIX = ".tmp";

    @AutoValue
    public static abstract class In {
        @NonNull
        public static In of(@NonNull Packet<byte[]> packet, @NonNull ImageCapture.OutputFileOptions outputFileOptions) {
            return new AutoValue_JpegBytes2Disk_In(packet, outputFileOptions);
        }

        @NonNull
        public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

        @NonNull
        public abstract Packet<byte[]> getPacket();
    }

    private static Uri copyFileToFile(@NonNull File file, @NonNull File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static Uri copyFileToMediaStore(@NonNull File file, @NonNull ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        ContentResolver contentResolver = outputFileOptions.getContentResolver();
        Objects.requireNonNull(contentResolver);
        ContentValues contentValues = outputFileOptions.getContentValues() != null ? new ContentValues(outputFileOptions.getContentValues()) : new ContentValues();
        setContentValuePendingFlag(contentValues, 1);
        Uri uriInsert = contentResolver.insert(outputFileOptions.getSaveCollection(), contentValues);
        if (uriInsert == null) {
            throw new ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
        }
        try {
            try {
                copyTempFileToUri(file, uriInsert, contentResolver);
                updateUriPendingStatus(uriInsert, contentResolver, 0);
                return uriInsert;
            } catch (IOException e5) {
                throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uriInsert, e5);
            }
        } catch (Throwable th2) {
            updateUriPendingStatus(uriInsert, contentResolver, 0);
            throw th2;
        }
    }

    private static void copyFileToOutputStream(@NonNull File file, @NonNull OutputStream outputStream) throws IOException {
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

    @Nullable
    private static Uri copyFileToTarget(@NonNull File file, @NonNull ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        if (isSaveToMediaStore(outputFileOptions)) {
            return copyFileToMediaStore(file, outputFileOptions);
        }
        if (isSaveToOutputStream(outputFileOptions)) {
            try {
                OutputStream outputStream = outputFileOptions.getOutputStream();
                Objects.requireNonNull(outputStream);
                copyFileToOutputStream(file, outputStream);
                return null;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        }
        if (!isSaveToFile(outputFileOptions)) {
            throw new ImageCaptureException(0, "Invalid OutputFileOptions", null);
        }
        File file2 = outputFileOptions.getFile();
        Objects.requireNonNull(file2);
        return copyFileToFile(file, file2);
    }

    private static void copyTempFileToUri(@NonNull File file, @NonNull Uri uri, @NonNull ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                copyFileToOutputStream(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th2) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @NonNull
    private static File createTempFile(@NonNull ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        try {
            File file = outputFileOptions.getFile();
            if (file == null) {
                return File.createTempFile(TEMP_FILE_PREFIX, TEMP_FILE_SUFFIX);
            }
            return new File(file.getParent(), TEMP_FILE_PREFIX + UUID.randomUUID().toString() + TEMP_FILE_SUFFIX);
        } catch (IOException e5) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e5);
        }
    }

    private static boolean isSaveToFile(ImageCapture.OutputFileOptions outputFileOptions) {
        return outputFileOptions.getFile() != null;
    }

    private static boolean isSaveToMediaStore(ImageCapture.OutputFileOptions outputFileOptions) {
        return (outputFileOptions.getSaveCollection() == null || outputFileOptions.getContentResolver() == null || outputFileOptions.getContentValues() == null) ? false : true;
    }

    private static boolean isSaveToOutputStream(ImageCapture.OutputFileOptions outputFileOptions) {
        return outputFileOptions.getOutputStream() != null;
    }

    private static void setContentValuePendingFlag(@NonNull ContentValues contentValues, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i10));
        }
    }

    private static void updateFileExif(@NonNull File file, @NonNull Exif exif, @NonNull ImageCapture.OutputFileOptions outputFileOptions, int i10) throws Throwable {
        try {
            Exif exifCreateFromFile = Exif.createFromFile(file);
            exif.copyToCroppedImage(exifCreateFromFile);
            if (exifCreateFromFile.getRotation() == 0 && i10 != 0) {
                exifCreateFromFile.rotate(i10);
            }
            ImageCapture.Metadata metadata = outputFileOptions.getMetadata();
            if (metadata.isReversedHorizontal()) {
                exifCreateFromFile.flipHorizontally();
            }
            if (metadata.isReversedVertical()) {
                exifCreateFromFile.flipVertically();
            }
            if (metadata.getLocation() != null) {
                exifCreateFromFile.attachLocation(metadata.getLocation());
            }
            exifCreateFromFile.save();
        } catch (IOException e5) {
            throw new ImageCaptureException(1, "Failed to update Exif data", e5);
        }
    }

    private static void updateUriPendingStatus(@NonNull Uri uri, @NonNull ContentResolver contentResolver, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            setContentValuePendingFlag(contentValues, i10);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    private static void writeBytesToFile(@NonNull File file, @NonNull byte[] bArr) throws ImageCaptureException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e5) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e5);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public ImageCapture.OutputFileResults apply(@NonNull In in2) throws Throwable {
        Packet<byte[]> packet = in2.getPacket();
        ImageCapture.OutputFileOptions outputFileOptions = in2.getOutputFileOptions();
        File fileCreateTempFile = createTempFile(outputFileOptions);
        writeBytesToFile(fileCreateTempFile, packet.getData());
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        updateFileExif(fileCreateTempFile, exif, outputFileOptions, packet.getRotationDegrees());
        return new ImageCapture.OutputFileResults(copyFileToTarget(fileCreateTempFile, outputFileOptions));
    }
}
