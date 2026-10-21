package com.veridas.detect.sequence.context;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.veridas.detect.DetectableObjectConfiguration;
import com.veridas.detect.DetectionMode;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SequentialAnalysisContext.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u00016R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0018\u0010\n\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0005\"\u0004\b\f\u0010\u0007R\u0012\u0010\r\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005R\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u0004\u0018\u00010\"X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010,\u001a\u00020\u0016X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001e\u0010/\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001c00X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00103\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014¨\u00067"}, d2 = {"Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "captureMaxFrameCount", "", "getCaptureMaxFrameCount", "()D", "setCaptureMaxFrameCount", "(D)V", "captureTime", "getCaptureTime", "centeredMaxFrameCount", "getCenteredMaxFrameCount", "setCenteredMaxFrameCount", "centeredTime", "getCenteredTime", "detectionMode", "Lcom/veridas/detect/DetectionMode;", "getDetectionMode", "()Lcom/veridas/detect/DetectionMode;", "setDetectionMode", "(Lcom/veridas/detect/DetectionMode;)V", "detectionModeIndex", "", "getDetectionModeIndex", "()I", "setDetectionModeIndex", "(I)V", "documentDetectorElement", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;", "getDocumentDetectorElement", "()Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;", "setDocumentDetectorElement", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;)V", "documentDetectorFactory", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "getDocumentDetectorFactory", "()Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "setDocumentDetectorFactory", "(Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "documentIds", "", "", "getDocumentIds", "()Ljava/util/List;", "documentIndex", "getDocumentIndex", "setDocumentIndex", "documentMap", "", "getDocumentMap", "()Ljava/util/Map;", "lastDetectionMode", "getLastDetectionMode", "setLastDetectionMode", "DocumentDetectorElement", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DocumentSequentialAnalysisContext extends SequentialAnalysisContext {
    double getCaptureMaxFrameCount();

    double getCaptureTime();

    double getCenteredMaxFrameCount();

    double getCenteredTime();

    @NotNull
    DetectionMode getDetectionMode();

    int getDetectionModeIndex();

    @Nullable
    DocumentDetectorElement getDocumentDetectorElement();

    @Nullable
    SpatialObjectDetectorFactory getDocumentDetectorFactory();

    @NotNull
    List<String> getDocumentIds();

    int getDocumentIndex();

    @NotNull
    Map<String, DocumentDetectorElement> getDocumentMap();

    @NotNull
    DetectionMode getLastDetectionMode();

    void setCaptureMaxFrameCount(double d2);

    void setCenteredMaxFrameCount(double d2);

    void setDetectionMode(@NotNull DetectionMode detectionMode);

    void setDetectionModeIndex(int i10);

    void setDocumentDetectorElement(@Nullable DocumentDetectorElement documentDetectorElement);

    void setDocumentDetectorFactory(@Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory);

    void setDocumentIndex(int i10);

    void setLastDetectionMode(@NotNull DetectionMode detectionMode);

    /* JADX INFO: compiled from: SequentialAnalysisContext.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#¨\u0006,"}, d2 = {"Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;", "", "", "component1", "Lcom/veridas/detect/DetectableObjectConfiguration;", "component2", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "component3", "component4", "component5", "id", "configuration", "cascadeDetector", "rectangleDetector", "templateDetector", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/veridas/detect/DetectableObjectConfiguration;", "getConfiguration", "()Lcom/veridas/detect/DetectableObjectConfiguration;", "c", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "getCascadeDetector", "()Lcom/veridas/detect/spatial/SpatialObjectDetector;", "setCascadeDetector", "(Lcom/veridas/detect/spatial/SpatialObjectDetector;)V", "d", "getRectangleDetector", "setRectangleDetector", "e", "getTemplateDetector", "setTemplateDetector", "<init>", "(Ljava/lang/String;Lcom/veridas/detect/DetectableObjectConfiguration;Lcom/veridas/detect/spatial/SpatialObjectDetector;Lcom/veridas/detect/spatial/SpatialObjectDetector;Lcom/veridas/detect/spatial/SpatialObjectDetector;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class DocumentDetectorElement {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DetectableObjectConfiguration configuration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SpatialObjectDetector cascadeDetector;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public SpatialObjectDetector rectangleDetector;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SpatialObjectDetector templateDetector;

        public DocumentDetectorElement(@NotNull String id, @NotNull DetectableObjectConfiguration configuration, @Nullable SpatialObjectDetector spatialObjectDetector, @NotNull SpatialObjectDetector rectangleDetector, @Nullable SpatialObjectDetector spatialObjectDetector2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(rectangleDetector, "rectangleDetector");
            this.id = id;
            this.configuration = configuration;
            this.cascadeDetector = spatialObjectDetector;
            this.rectangleDetector = rectangleDetector;
            this.templateDetector = spatialObjectDetector2;
        }

        public static /* synthetic */ DocumentDetectorElement copy$default(DocumentDetectorElement documentDetectorElement, String str, DetectableObjectConfiguration detectableObjectConfiguration, SpatialObjectDetector spatialObjectDetector, SpatialObjectDetector spatialObjectDetector2, SpatialObjectDetector spatialObjectDetector3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = documentDetectorElement.id;
            }
            if ((i10 & 2) != 0) {
                detectableObjectConfiguration = documentDetectorElement.configuration;
            }
            DetectableObjectConfiguration detectableObjectConfiguration2 = detectableObjectConfiguration;
            if ((i10 & 4) != 0) {
                spatialObjectDetector = documentDetectorElement.cascadeDetector;
            }
            SpatialObjectDetector spatialObjectDetector4 = spatialObjectDetector;
            if ((i10 & 8) != 0) {
                spatialObjectDetector2 = documentDetectorElement.rectangleDetector;
            }
            SpatialObjectDetector spatialObjectDetector5 = spatialObjectDetector2;
            if ((i10 & 16) != 0) {
                spatialObjectDetector3 = documentDetectorElement.templateDetector;
            }
            return documentDetectorElement.copy(str, detectableObjectConfiguration2, spatialObjectDetector4, spatialObjectDetector5, spatialObjectDetector3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DetectableObjectConfiguration getConfiguration() {
            return this.configuration;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final SpatialObjectDetector getCascadeDetector() {
            return this.cascadeDetector;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final SpatialObjectDetector getRectangleDetector() {
            return this.rectangleDetector;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final SpatialObjectDetector getTemplateDetector() {
            return this.templateDetector;
        }

        @NotNull
        public final DocumentDetectorElement copy(@NotNull String id, @NotNull DetectableObjectConfiguration configuration, @Nullable SpatialObjectDetector cascadeDetector, @NotNull SpatialObjectDetector rectangleDetector, @Nullable SpatialObjectDetector templateDetector) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(rectangleDetector, "rectangleDetector");
            return new DocumentDetectorElement(id, configuration, cascadeDetector, rectangleDetector, templateDetector);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentDetectorElement)) {
                return false;
            }
            DocumentDetectorElement documentDetectorElement = (DocumentDetectorElement) other;
            return Intrinsics.areEqual(this.id, documentDetectorElement.id) && Intrinsics.areEqual(this.configuration, documentDetectorElement.configuration) && Intrinsics.areEqual(this.cascadeDetector, documentDetectorElement.cascadeDetector) && Intrinsics.areEqual(this.rectangleDetector, documentDetectorElement.rectangleDetector) && Intrinsics.areEqual(this.templateDetector, documentDetectorElement.templateDetector);
        }

        @Nullable
        public final SpatialObjectDetector getCascadeDetector() {
            return this.cascadeDetector;
        }

        @NotNull
        public final DetectableObjectConfiguration getConfiguration() {
            return this.configuration;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final SpatialObjectDetector getRectangleDetector() {
            return this.rectangleDetector;
        }

        @Nullable
        public final SpatialObjectDetector getTemplateDetector() {
            return this.templateDetector;
        }

        public int hashCode() {
            int iHashCode = (this.configuration.hashCode() + (this.id.hashCode() * 31)) * 31;
            SpatialObjectDetector spatialObjectDetector = this.cascadeDetector;
            int iHashCode2 = (this.rectangleDetector.hashCode() + ((iHashCode + (spatialObjectDetector == null ? 0 : spatialObjectDetector.hashCode())) * 31)) * 31;
            SpatialObjectDetector spatialObjectDetector2 = this.templateDetector;
            return iHashCode2 + (spatialObjectDetector2 != null ? spatialObjectDetector2.hashCode() : 0);
        }

        public final void setCascadeDetector(@Nullable SpatialObjectDetector spatialObjectDetector) {
            this.cascadeDetector = spatialObjectDetector;
        }

        public final void setRectangleDetector(@NotNull SpatialObjectDetector spatialObjectDetector) {
            Intrinsics.checkNotNullParameter(spatialObjectDetector, "<set-?>");
            this.rectangleDetector = spatialObjectDetector;
        }

        public final void setTemplateDetector(@Nullable SpatialObjectDetector spatialObjectDetector) {
            this.templateDetector = spatialObjectDetector;
        }

        @NotNull
        public String toString() {
            return "DocumentDetectorElement(id=" + this.id + ", configuration=" + this.configuration + ", cascadeDetector=" + this.cascadeDetector + ", rectangleDetector=" + this.rectangleDetector + ", templateDetector=" + this.templateDetector + ")";
        }

        public /* synthetic */ DocumentDetectorElement(String str, DetectableObjectConfiguration detectableObjectConfiguration, SpatialObjectDetector spatialObjectDetector, SpatialObjectDetector spatialObjectDetector2, SpatialObjectDetector spatialObjectDetector3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, detectableObjectConfiguration, (i10 & 4) != 0 ? null : spatialObjectDetector, spatialObjectDetector2, (i10 & 16) != 0 ? null : spatialObjectDetector3);
        }
    }
}
