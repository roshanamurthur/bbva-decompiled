package com.veridas.detect.sequence.document.analysis.visitor;

import com.veridas.detect.DetectableObjectConfiguration;
import com.veridas.detect.DetectionMode;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SelectDetectorVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectorVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "()V", "createCascadeDetector", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "context", "element", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;", "configuration", "Lcom/veridas/detect/DetectableObjectConfiguration;", "createTemplateDetector", "selectDetector", "detectionMode", "Lcom/veridas/detect/DetectionMode;", "visit", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectDetectorVisitor implements SequentialAnalysisContextVisitor<DocumentSequentialAnalysisContext> {

    /* JADX INFO: compiled from: SelectDetectorVisitor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DetectionMode.values().length];
            try {
                iArr[DetectionMode.TEMPLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DetectionMode.XML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final SpatialObjectDetector createCascadeDetector(@NotNull DocumentSequentialAnalysisContext context, @NotNull DocumentSequentialAnalysisContext.DocumentDetectorElement element, @NotNull DetectableObjectConfiguration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        SpatialObjectDetector cascadeDetector = element.getCascadeDetector();
        if (cascadeDetector != null) {
            return cascadeDetector;
        }
        SpatialObjectDetectorFactory documentDetectorFactory = context.getDocumentDetectorFactory();
        if (documentDetectorFactory == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        SpatialObjectDetector spatialObjectDetectorCreateCascadeSpatialObjectDetector = documentDetectorFactory.createCascadeSpatialObjectDetector(null, configuration);
        spatialObjectDetectorCreateCascadeSpatialObjectDetector.initialize();
        element.setCascadeDetector(spatialObjectDetectorCreateCascadeSpatialObjectDetector);
        return spatialObjectDetectorCreateCascadeSpatialObjectDetector;
    }

    @NotNull
    public final SpatialObjectDetector createTemplateDetector(@NotNull DocumentSequentialAnalysisContext context, @NotNull DocumentSequentialAnalysisContext.DocumentDetectorElement element, @NotNull DetectableObjectConfiguration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        SpatialObjectDetector templateDetector = element.getTemplateDetector();
        if (templateDetector != null) {
            return templateDetector;
        }
        SpatialObjectDetectorFactory documentDetectorFactory = context.getDocumentDetectorFactory();
        if (documentDetectorFactory == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        SpatialObjectDetector spatialObjectDetectorCreateTemplateSpatialObjectDetector = documentDetectorFactory.createTemplateSpatialObjectDetector(null, configuration);
        spatialObjectDetectorCreateTemplateSpatialObjectDetector.initialize();
        element.setTemplateDetector(spatialObjectDetectorCreateTemplateSpatialObjectDetector);
        return spatialObjectDetectorCreateTemplateSpatialObjectDetector;
    }

    @NotNull
    public final SpatialObjectDetector selectDetector(@NotNull DocumentSequentialAnalysisContext context, @NotNull DocumentSequentialAnalysisContext.DocumentDetectorElement element, @NotNull DetectionMode detectionMode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(detectionMode, "detectionMode");
        DetectableObjectConfiguration configuration = element.getConfiguration();
        int i10 = WhenMappings.$EnumSwitchMapping$0[detectionMode.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? element.getRectangleDetector() : createCascadeDetector(context, element, configuration);
        }
        return createTemplateDetector(context, element, configuration);
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement = context.getDocumentDetectorElement();
        if (documentDetectorElement == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        context.setDetector(selectDetector(context, documentDetectorElement, context.getDetectionMode()));
    }
}
