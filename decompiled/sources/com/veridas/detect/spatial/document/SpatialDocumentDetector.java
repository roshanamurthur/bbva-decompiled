package com.veridas.detect.spatial.document;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.SpatialObjectDetector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpatialDocumentDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/veridas/detect/spatial/document/SpatialDocumentDetector;", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "", "finish", "initialize", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "a", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "getDetector", "()Lcom/veridas/detect/spatial/SpatialObjectDetector;", "detector", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class SpatialDocumentDetector implements SpatialObjectDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpatialObjectDetector detector;

    /* JADX INFO: compiled from: SpatialDocumentDetector.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/veridas/detect/spatial/document/SpatialDocumentDetector$Builder;", "", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "detector", "Lcom/veridas/detect/spatial/document/SpatialDocumentDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "spatialObjectDetector", "<init>", "(Lcom/veridas/detect/spatial/SpatialObjectDetector;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public SpatialObjectDetector f67054a;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final SpatialDocumentDetector build() {
            SpatialObjectDetector spatialObjectDetector = this.f67054a;
            if (spatialObjectDetector != null) {
                return new SpatialDocumentDetector(spatialObjectDetector, null);
            }
            throw new IllegalArgumentException("Please provide a spatial object objectDetector.".toString());
        }

        @NotNull
        public final Builder detector(@NotNull SpatialObjectDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            this.f67054a = detector;
            return this;
        }

        public Builder(@Nullable SpatialObjectDetector spatialObjectDetector) {
            this.f67054a = spatialObjectDetector;
        }

        public /* synthetic */ Builder(SpatialObjectDetector spatialObjectDetector, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : spatialObjectDetector);
        }
    }

    public SpatialDocumentDetector(SpatialObjectDetector spatialObjectDetector, DefaultConstructorMarker defaultConstructorMarker) {
        this.detector = spatialObjectDetector;
    }

    @Override // com.veridas.detect.spatial.SpatialObjectDetector
    public boolean finish() {
        return this.detector.finish();
    }

    @NotNull
    public final SpatialObjectDetector getDetector() {
        return this.detector;
    }

    @Override // com.veridas.detect.spatial.SpatialObjectDetector
    public boolean initialize() {
        return this.detector.initialize();
    }

    @Override // com.veridas.detect.spatial.SpatialObjectDetector
    @NotNull
    public SpatialDetectionResult request(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.detector.request(request);
    }
}
