package com.veridas.detect.spatial.document;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.detect.DetectionMode;
import com.veridas.detect.DetectionRequestException;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.lang.AggregateException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NonIntelligentSpatialDocumentDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/veridas/detect/spatial/document/NonIntelligentSpatialDocumentDetector;", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "", "finish", "initialize", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "a", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "getCascadeSpatialObjectDetector", "()Lcom/veridas/detect/spatial/SpatialObjectDetector;", "cascadeSpatialObjectDetector", "b", "getRectangleDetector", "rectangleDetector", "c", "getTemplateSpatialObjectDetector", "templateSpatialObjectDetector", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class NonIntelligentSpatialDocumentDetector implements SpatialObjectDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpatialObjectDetector cascadeSpatialObjectDetector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpatialObjectDetector rectangleDetector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpatialObjectDetector templateSpatialObjectDetector;

    /* JADX INFO: compiled from: NonIntelligentSpatialDocumentDetector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/veridas/detect/spatial/document/NonIntelligentSpatialDocumentDetector$Builder;", "", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "cascadeSpatialObjectDetector", "rectangleSpatialObjectDetector", "templateSpatialObjectDetector", "Lcom/veridas/detect/spatial/document/NonIntelligentSpatialDocumentDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "getRectangleSpatialObjectDetector", "()Lcom/veridas/detect/spatial/SpatialObjectDetector;", "setRectangleSpatialObjectDetector", "(Lcom/veridas/detect/spatial/SpatialObjectDetector;)V", "b", "getTemplateSpatialObjectDetector", "setTemplateSpatialObjectDetector", "c", "getCascadeSpatialObjectDetector", "setCascadeSpatialObjectDetector", "<init>", "(Lcom/veridas/detect/spatial/SpatialObjectDetector;Lcom/veridas/detect/spatial/SpatialObjectDetector;Lcom/veridas/detect/spatial/SpatialObjectDetector;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nNonIntelligentSpatialDocumentDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonIntelligentSpatialDocumentDetector.kt\ncom/veridas/detect/spatial/document/NonIntelligentSpatialDocumentDetector$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SpatialObjectDetector rectangleSpatialObjectDetector;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SpatialObjectDetector templateSpatialObjectDetector;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SpatialObjectDetector cascadeSpatialObjectDetector;

        public Builder() {
            this(null, null, null, 7, null);
        }

        @NotNull
        public final NonIntelligentSpatialDocumentDetector build() {
            SpatialObjectDetector spatialObjectDetector = this.cascadeSpatialObjectDetector;
            SpatialObjectDetector spatialObjectDetector2 = this.rectangleSpatialObjectDetector;
            SpatialObjectDetector spatialObjectDetector3 = this.templateSpatialObjectDetector;
            if (spatialObjectDetector == null) {
                throw new IllegalArgumentException("The cascade objectDetector can't be null.".toString());
            }
            if (spatialObjectDetector2 == null) {
                throw new IllegalArgumentException("The rectangle objectDetector can't be null.".toString());
            }
            if (spatialObjectDetector3 != null) {
                return new NonIntelligentSpatialDocumentDetector(spatialObjectDetector, spatialObjectDetector2, spatialObjectDetector3, null);
            }
            throw new IllegalArgumentException("The template objectDetector can't be null.".toString());
        }

        @NotNull
        public final Builder cascadeSpatialObjectDetector(@NotNull SpatialObjectDetector cascadeSpatialObjectDetector) {
            Intrinsics.checkNotNullParameter(cascadeSpatialObjectDetector, "cascadeSpatialObjectDetector");
            this.cascadeSpatialObjectDetector = cascadeSpatialObjectDetector;
            return this;
        }

        @Nullable
        public final SpatialObjectDetector getCascadeSpatialObjectDetector() {
            return this.cascadeSpatialObjectDetector;
        }

        @Nullable
        public final SpatialObjectDetector getRectangleSpatialObjectDetector() {
            return this.rectangleSpatialObjectDetector;
        }

        @Nullable
        public final SpatialObjectDetector getTemplateSpatialObjectDetector() {
            return this.templateSpatialObjectDetector;
        }

        @NotNull
        public final Builder rectangleSpatialObjectDetector(@NotNull SpatialObjectDetector rectangleSpatialObjectDetector) {
            Intrinsics.checkNotNullParameter(rectangleSpatialObjectDetector, "rectangleSpatialObjectDetector");
            this.rectangleSpatialObjectDetector = rectangleSpatialObjectDetector;
            return this;
        }

        public final void setCascadeSpatialObjectDetector(@Nullable SpatialObjectDetector spatialObjectDetector) {
            this.cascadeSpatialObjectDetector = spatialObjectDetector;
        }

        public final void setRectangleSpatialObjectDetector(@Nullable SpatialObjectDetector spatialObjectDetector) {
            this.rectangleSpatialObjectDetector = spatialObjectDetector;
        }

        public final void setTemplateSpatialObjectDetector(@Nullable SpatialObjectDetector spatialObjectDetector) {
            this.templateSpatialObjectDetector = spatialObjectDetector;
        }

        @NotNull
        public final Builder templateSpatialObjectDetector(@NotNull SpatialObjectDetector templateSpatialObjectDetector) {
            Intrinsics.checkNotNullParameter(templateSpatialObjectDetector, "templateSpatialObjectDetector");
            this.templateSpatialObjectDetector = templateSpatialObjectDetector;
            return this;
        }

        public Builder(@Nullable SpatialObjectDetector spatialObjectDetector, @Nullable SpatialObjectDetector spatialObjectDetector2, @Nullable SpatialObjectDetector spatialObjectDetector3) {
            this.rectangleSpatialObjectDetector = spatialObjectDetector;
            this.templateSpatialObjectDetector = spatialObjectDetector2;
            this.cascadeSpatialObjectDetector = spatialObjectDetector3;
        }

        public /* synthetic */ Builder(SpatialObjectDetector spatialObjectDetector, SpatialObjectDetector spatialObjectDetector2, SpatialObjectDetector spatialObjectDetector3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : spatialObjectDetector, (i10 & 2) != 0 ? null : spatialObjectDetector2, (i10 & 4) != 0 ? null : spatialObjectDetector3);
        }
    }

    /* JADX INFO: compiled from: NonIntelligentSpatialDocumentDetector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DetectionMode.values().length];
            try {
                iArr[DetectionMode.XML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DetectionMode.TEMPLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DetectionMode.RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NonIntelligentSpatialDocumentDetector(SpatialObjectDetector spatialObjectDetector, SpatialObjectDetector spatialObjectDetector2, SpatialObjectDetector spatialObjectDetector3, DefaultConstructorMarker defaultConstructorMarker) {
        this.cascadeSpatialObjectDetector = spatialObjectDetector;
        this.rectangleDetector = spatialObjectDetector2;
        this.templateSpatialObjectDetector = spatialObjectDetector3;
    }

    @Override // com.veridas.detect.spatial.SpatialObjectDetector
    public boolean finish() throws AggregateException {
        boolean zFinish;
        boolean zFinish2;
        boolean zFinish3;
        ArrayList arrayList = new ArrayList();
        try {
            zFinish = this.cascadeSpatialObjectDetector.finish();
        } catch (Exception e5) {
            arrayList.add(e5);
            zFinish = false;
        }
        try {
            zFinish2 = this.rectangleDetector.finish();
        } catch (Exception e7) {
            arrayList.add(e7);
            zFinish2 = false;
        }
        try {
            zFinish3 = this.templateSpatialObjectDetector.finish();
        } catch (Exception e10) {
            arrayList.add(e10);
            zFinish3 = false;
        }
        if (!arrayList.isEmpty()) {
            throw new AggregateException(arrayList);
        }
        return zFinish && zFinish2 && zFinish3;
    }

    @NotNull
    public final SpatialObjectDetector getCascadeSpatialObjectDetector() {
        return this.cascadeSpatialObjectDetector;
    }

    @NotNull
    public final SpatialObjectDetector getRectangleDetector() {
        return this.rectangleDetector;
    }

    @NotNull
    public final SpatialObjectDetector getTemplateSpatialObjectDetector() {
        return this.templateSpatialObjectDetector;
    }

    @Override // com.veridas.detect.spatial.SpatialObjectDetector
    public boolean initialize() throws AggregateException {
        boolean zInitialize;
        boolean zInitialize2;
        boolean zInitialize3;
        ArrayList arrayList = new ArrayList();
        try {
            zInitialize = this.cascadeSpatialObjectDetector.initialize();
        } catch (Exception e5) {
            arrayList.add(e5);
            zInitialize = false;
        }
        try {
            zInitialize2 = this.rectangleDetector.initialize();
        } catch (Exception e7) {
            arrayList.add(e7);
            zInitialize2 = false;
        }
        try {
            zInitialize3 = this.templateSpatialObjectDetector.initialize();
        } catch (Exception e10) {
            arrayList.add(e10);
            zInitialize3 = false;
        }
        if (!arrayList.isEmpty()) {
            throw new AggregateException(arrayList);
        }
        return zInitialize && zInitialize2 && zInitialize3;
    }

    @Override // com.veridas.detect.spatial.SpatialObjectDetector
    @NotNull
    public SpatialDetectionResult request(@NotNull Request request) throws DetectionRequestException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            int i10 = WhenMappings.$EnumSwitchMapping$0[request.getDetectionMode().ordinal()];
            if (i10 == 1) {
                return this.cascadeSpatialObjectDetector.request(request);
            }
            if (i10 != 2) {
                return i10 != 3 ? new SpatialDetectionResult.Builder(null, null, null, null, null, 0.0d, 0.0d, null, 0.0d, 511, null).build() : this.rectangleDetector.request(request);
            }
            return this.templateSpatialObjectDetector.request(request);
        } catch (Exception e5) {
            throw new DetectionRequestException(e5);
        }
    }
}
