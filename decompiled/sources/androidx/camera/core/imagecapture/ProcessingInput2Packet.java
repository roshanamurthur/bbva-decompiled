package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Preconditions;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
final class ProcessingInput2Packet implements Operation<ProcessingNode.InputPacket, Packet<ImageProxy>> {
    @NonNull
    private static Matrix getHalTransform(@IntRange(from = 0, to = 359) int i10, @NonNull Size size, @IntRange(from = 0, to = 359) int i11) {
        int i12 = i10 - i11;
        Size size2 = TransformUtils.is90or270(TransformUtils.within360(i12)) ? new Size(size.getHeight(), size.getWidth()) : size;
        return TransformUtils.getRectToRect(new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), i12);
    }

    @NonNull
    private static Rect getUpdatedCropRect(@NonNull Rect rect, @NonNull Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @NonNull
    private static Matrix getUpdatedTransform(@NonNull Matrix matrix, @NonNull Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    private static boolean isSizeMatch(@NonNull Exif exif, @NonNull ImageProxy imageProxy) {
        return exif.getWidth() == imageProxy.getWidth() && exif.getHeight() == imageProxy.getHeight();
    }

    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public Packet<ImageProxy> apply(@NonNull ProcessingNode.InputPacket inputPacket) throws ImageCaptureException {
        Exif exifCreateFromImageProxy;
        Matrix updatedTransform;
        int rotation;
        ImageProxy imageProxy = inputPacket.getImageProxy();
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        if (imageProxy.getFormat() == 256) {
            try {
                exifCreateFromImageProxy = Exif.createFromImageProxy(imageProxy);
                imageProxy.getPlanes()[0].getBuffer().rewind();
            } catch (IOException e5) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e5);
            }
        } else {
            exifCreateFromImageProxy = null;
        }
        CameraCaptureResult cameraCaptureResult = ((CameraCaptureResultImageInfo) imageProxy.getImageInfo()).getCameraCaptureResult();
        Rect cropRect = processingRequest.getCropRect();
        Matrix sensorToBufferTransform = processingRequest.getSensorToBufferTransform();
        int rotationDegrees = processingRequest.getRotationDegrees();
        if (ImagePipeline.EXIF_ROTATION_AVAILABILITY.shouldUseExifOrientation(imageProxy)) {
            Preconditions.checkNotNull(exifCreateFromImageProxy, "The image must have JPEG exif.");
            Preconditions.checkState(isSizeMatch(exifCreateFromImageProxy, imageProxy), "Exif size does not match image size.");
            Matrix halTransform = getHalTransform(processingRequest.getRotationDegrees(), new Size(exifCreateFromImageProxy.getWidth(), exifCreateFromImageProxy.getHeight()), exifCreateFromImageProxy.getRotation());
            Rect updatedCropRect = getUpdatedCropRect(processingRequest.getCropRect(), halTransform);
            updatedTransform = getUpdatedTransform(processingRequest.getSensorToBufferTransform(), halTransform);
            rotation = exifCreateFromImageProxy.getRotation();
            cropRect = updatedCropRect;
        } else {
            updatedTransform = sensorToBufferTransform;
            rotation = rotationDegrees;
        }
        return Packet.of(imageProxy, exifCreateFromImageProxy, cropRect, rotation, updatedTransform, cameraCaptureResult);
    }
}
