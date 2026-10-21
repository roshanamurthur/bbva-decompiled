package com.veridas.obj;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.d;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.graphics.Dimension;
import com.veridas.graphics.Frame;
import com.veridas.graphics.ImageEncoding;
import com.veridas.graphics.ImageUtils;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.Vector2;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentCropProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010J\u001e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u0019\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006$"}, d2 = {"Lcom/veridas/obj/DocumentCropProvider;", "Lcom/veridas/obj/ObjectCropProvider;", "imageUtils", "Lcom/veridas/graphics/ImageUtils;", "objectDetector", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "cropMargin", "", "(Lcom/veridas/graphics/ImageUtils;Lcom/veridas/detect/spatial/SpatialObjectDetector;D)V", "getCropMargin", "()D", "getImageUtils", "()Lcom/veridas/graphics/ImageUtils;", "getObjectDetector", "()Lcom/veridas/detect/spatial/SpatialObjectDetector;", "createGrayscaleFrame", "Lcom/veridas/graphics/Frame;", "src", "Ljava/nio/ByteBuffer;", "dimensions", "Lcom/veridas/graphics/Dimension;", "cropObject", "detectedObject", "Lcom/veridas/math/geometry/Rectangle;", "detectObject", "request", "Lcom/veridas/obj/CropRequest;", TypedValues.AttributesType.S_FRAME, "preProcessImage", "orientation", "", "Lcom/veridas/obj/CropResult;", "scaleMargin", "parentDimensions", "Lcom/veridas/math/geometry/Vector2;", "margin", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentCropProvider implements ObjectCropProvider {
    private final double cropMargin;

    @NotNull
    private final ImageUtils imageUtils;

    @NotNull
    private final SpatialObjectDetector objectDetector;

    public DocumentCropProvider(@NotNull ImageUtils imageUtils, @NotNull SpatialObjectDetector objectDetector, double d2) {
        Intrinsics.checkNotNullParameter(imageUtils, "imageUtils");
        Intrinsics.checkNotNullParameter(objectDetector, "objectDetector");
        this.imageUtils = imageUtils;
        this.objectDetector = objectDetector;
        this.cropMargin = d2;
    }

    @NotNull
    public final Frame createGrayscaleFrame(@NotNull ByteBuffer src, @NotNull Dimension dimensions) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(ImageUtils.INSTANCE.calculateBufferSizeForGrayscale(dimensions));
        ImageUtils imageUtils = this.imageUtils;
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        imageUtils.convertBgraToGrayscale(src, byteBufferAllocateDirect, dimensions.getWidth(), dimensions.getHeight());
        return new Frame(byteBufferAllocateDirect, dimensions, ImageEncoding.GRAYSCALE, 0);
    }

    @NotNull
    public final Frame cropObject(@NotNull ByteBuffer src, @NotNull Dimension dimensions, @NotNull Rectangle detectedObject) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(detectedObject, "detectedObject");
        Dimension dimension = new Dimension(detectedObject.getDimensions());
        int iCalculateBufferSizeForRgba = ImageUtils.INSTANCE.calculateBufferSizeForRgba(dimensions);
        if (iCalculateBufferSizeForRgba <= 0) {
            throw new IllegalArgumentException("The buffer for the crop can't be zero or negative.".toString());
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iCalculateBufferSizeForRgba);
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        Frame frame = new Frame(byteBufferAllocateDirect, dimension, ImageEncoding.BGRA, 0);
        this.imageUtils.crop(src, byteBufferAllocateDirect, dimensions.getWidth(), dimensions.getHeight(), c.roundToInt(detectedObject.getPosition().getX()), c.roundToInt(detectedObject.getPosition().getY()), dimension.getWidth(), dimension.getHeight());
        return frame;
    }

    @NotNull
    public final Rectangle detectObject(@NotNull CropRequest request, @NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(frame, "frame");
        Request.Builder builderFrame = new Request.Builder(null, false, null, null, null, null, false, null, null, null, 0.0d, null, false, 0, false, 0, false, 0.0d, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, false, null, null, false, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null).frame(frame);
        if (request.getReferenceObject() != null) {
            builderFrame.referenceObject(request.getReferenceObject());
        }
        if (request.getViewport() != null) {
            builderFrame.viewport(request.getViewport());
        }
        Request requestBuild = builderFrame.actualDetection(request.getDetectedObject()).useCropAlgorithm(true).objectIdentifiers(d.listOf("crop")).build();
        if (!this.objectDetector.initialize()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        SpatialDetectionResult spatialDetectionResultRequest = this.objectDetector.request(requestBuild);
        if (this.objectDetector.finish()) {
            return spatialDetectionResultRequest.getCandidate();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final double getCropMargin() {
        return this.cropMargin;
    }

    @NotNull
    public final ImageUtils getImageUtils() {
        return this.imageUtils;
    }

    @NotNull
    public final SpatialObjectDetector getObjectDetector() {
        return this.objectDetector;
    }

    @NotNull
    public final ByteBuffer preProcessImage(@NotNull ByteBuffer src, @NotNull Dimension dimensions, int orientation) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        this.imageUtils.rotateUp(src, dimensions.getWidth(), dimensions.getHeight(), orientation);
        return src;
    }

    @Override // com.veridas.obj.ObjectCropProvider
    @NotNull
    public CropResult request(@NotNull CropRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Frame frame = request.getFrame();
        Dimension dimensions = frame.getDimensions();
        ByteBuffer byteBufferPreProcessImage = preProcessImage(frame.getData(), dimensions, frame.getOrientation());
        Rectangle rectangleDetectObject = detectObject(request, frame);
        if (rectangleDetectObject.isEmpty()) {
            rectangleDetectObject = request.getDetectedObject();
        }
        if (rectangleDetectObject.isEmpty()) {
            rectangleDetectObject = new Rectangle(0, 0, dimensions.getWidth(), dimensions.getHeight());
        }
        CropResult.Builder builderRequest = new CropResult.Builder(null, null, null, 7, null).request(request);
        if (rectangleDetectObject.isNotEmpty()) {
            rectangleDetectObject = scaleMargin(rectangleDetectObject, dimensions.toPoint(), this.cropMargin);
            builderRequest.crop(cropObject(byteBufferPreProcessImage, dimensions, rectangleDetectObject));
        }
        return builderRequest.cropArea(rectangleDetectObject).build();
    }

    @NotNull
    public final Rectangle scaleMargin(@NotNull Rectangle detectedObject, @NotNull Vector2 parentDimensions, double margin) {
        Intrinsics.checkNotNullParameter(detectedObject, "detectedObject");
        Intrinsics.checkNotNullParameter(parentDimensions, "parentDimensions");
        Vector2 vector2Times = detectedObject.getDimensions().times(margin + 1.0d);
        Vector2 vector2Minus = detectedObject.getPosition().minus(vector2Times.minus(detectedObject.getDimensions()).div(2.0d));
        if (vector2Minus.getX() < 0.0d) {
            vector2Minus = new Vector2(0.0d, vector2Minus.getY());
        }
        if (vector2Minus.getY() < 0.0d) {
            vector2Minus = new Vector2(vector2Minus.getX(), 0.0d);
        }
        Vector2 vector2Minus2 = vector2Minus.plus(vector2Times).minus(parentDimensions);
        if (vector2Minus2.getX() > 0.0d) {
            vector2Times = new Vector2(vector2Times.getX() - vector2Minus2.getX(), vector2Times.getY());
        }
        if (vector2Minus2.getY() > 0.0d) {
            vector2Times = new Vector2(vector2Times.getX(), vector2Times.getY() - vector2Minus2.getY());
        }
        return new Rectangle(vector2Minus, vector2Times);
    }

    public /* synthetic */ DocumentCropProvider(ImageUtils imageUtils, SpatialObjectDetector spatialObjectDetector, double d2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ImageUtils() : imageUtils, spatialObjectDetector, (i10 & 4) != 0 ? 0.06d : d2);
    }
}
