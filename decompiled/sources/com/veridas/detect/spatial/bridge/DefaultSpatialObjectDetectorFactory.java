package com.veridas.detect.spatial.bridge;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.veridas.detect.DetectableObjectConfiguration;
import com.veridas.detect.spatial.GeometricAnalysisBuilder;
import com.veridas.detect.spatial.ReferenceObjectGeometricAnalysisBuilder;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.graphics.Frame;
import com.veridas.math.geometry.Vector2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultSpatialObjectDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\u000f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/veridas/detect/spatial/bridge/DefaultSpatialObjectDetectorFactory;", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "geometricAnalysisBuilder", "Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;", "(Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;)V", "getGeometricAnalysisBuilder", "()Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;", "createCascadeSpatialObjectDetector", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "context", "Landroid/content/Context;", "configuration", "Lcom/veridas/detect/DetectableObjectConfiguration;", "createPassportSpatialObjectDetector", "createRectangleSpatialObjectDetector", "createTemplateSpatialObjectDetector", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultSpatialObjectDetectorFactory implements SpatialObjectDetectorFactory {

    @NotNull
    private final GeometricAnalysisBuilder geometricAnalysisBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSpatialObjectDetectorFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory
    @NotNull
    public SpatialObjectDetector createCascadeSpatialObjectDetector(@Nullable Context context, @Nullable DetectableObjectConfiguration configuration) {
        if (configuration == null) {
            throw new IllegalArgumentException("The configuration parameter is required.".toString());
        }
        String documentId = configuration.getDocumentId();
        if (!configuration.getCascadeDetectionCapable()) {
            throw new IllegalArgumentException(h0.b("The configuration of document \"", documentId, "\" does not support a cascade detector.").toString());
        }
        String cascadePath = configuration.getCascadePath();
        String cascadeFile = configuration.getCascadeFile();
        if (cascadeFile == null) {
            throw new IllegalArgumentException(h0.b("The cascadeFile parameter can't be null for document \"", documentId, "\".").toString());
        }
        if (cascadeFile.length() > 0) {
            return new CascadeSpatialObjectDetector.Builder(null, null, null, 0.0d, 0, null, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null).cascadeFile(cascadeFile).geometricAnalysisBuilder(this.geometricAnalysisBuilder).maxDimensionFactor(new Vector2(configuration.getMaxDivisorWidth(), configuration.getMaxDivisorHeight())).minDimensionFactor(new Vector2(configuration.getMinDivisorWidth(), configuration.getMinDivisorHeight())).neighbors(configuration.getNeighbours()).scale(configuration.getScale()).widthTransformationFactor(configuration.getWidthTransformationFactor()).heightTransformationFactor(configuration.getHeightTransformationFactor()).xTransformationFactor(configuration.getXTransformationFactor()).yTransformationFactor(configuration.getYTransformationFactor()).build();
        }
        throw new IllegalArgumentException(h0.b("Cascade file ", cascadePath, " has no contents.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory
    @NotNull
    public SpatialObjectDetector createPassportSpatialObjectDetector(@Nullable Context context, @Nullable DetectableObjectConfiguration configuration) {
        return new PassportSpatialObjectDetector.Builder(null, 1, 0 == true ? 1 : 0).geometricAnalysisBuilder(this.geometricAnalysisBuilder).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory
    @NotNull
    public SpatialObjectDetector createRectangleSpatialObjectDetector(@Nullable Context context, @Nullable DetectableObjectConfiguration configuration) {
        return new RectangleSpatialObjectDetector.Builder(null, 1, 0 == true ? 1 : 0).geometricAnalysisBuilder(this.geometricAnalysisBuilder).build();
    }

    @Override // com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory
    @NotNull
    public SpatialObjectDetector createTemplateSpatialObjectDetector(@Nullable Context context, @Nullable DetectableObjectConfiguration configuration) {
        if (configuration == null) {
            throw new IllegalArgumentException("The configuration parameter is required.".toString());
        }
        String documentId = configuration.getDocumentId();
        Bitmap template = configuration.getTemplate();
        if (template == null) {
            throw new IllegalArgumentException(h0.b("The template parameter can't be null for document \"", documentId, "\".").toString());
        }
        return new TemplateSpatialObjectDetector.Builder(null, false, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, 16383, null).geometricAnalysisBuilder(this.geometricAnalysisBuilder).grayscale(configuration.isGray()).pyramidRange(configuration.getPyramidRange()).pyramidFactor(configuration.getPyramidFactor()).minimumFactor(configuration.getMinimumFactor()).roiFactor(configuration.getRoiFactor()).thresholdMaximumValue(configuration.getMinScore()).thresholdArea(configuration.getThresholdArea()).previousMargin(configuration.getPreviousMargin()).widthTransformationFactor(configuration.getWidthTemplateTransformationFactor()).heightTransformationFactor(configuration.getHeightTemplateTransformationFactor()).xTransformationFactor(configuration.getXTemplateTransformationFactor()).yTransformationFactor(configuration.getYTemplateTransformationFactor()).template(Frame.Companion.createRgb$default(Frame.INSTANCE, template, 0, 2, null)).build();
    }

    @NotNull
    public final GeometricAnalysisBuilder getGeometricAnalysisBuilder() {
        return this.geometricAnalysisBuilder;
    }

    public DefaultSpatialObjectDetectorFactory(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder) {
        Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
        this.geometricAnalysisBuilder = geometricAnalysisBuilder;
    }

    public /* synthetic */ DefaultSpatialObjectDetectorFactory(GeometricAnalysisBuilder geometricAnalysisBuilder, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReferenceObjectGeometricAnalysisBuilder() : geometricAnalysisBuilder);
    }
}
