package com.veridas.detect.sequence.document.context.visitor;

import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import com.veridas.detect.sequence.document.proximity.DocumentViewportProximity;
import com.veridas.detect.spatial.SpatialDetectionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentViewportProximityVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/veridas/detect/sequence/document/context/visitor/DocumentViewportProximityVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "", "visit", "Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;", "a", "Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;", "getDocumentViewportProximity", "()Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;", "documentViewportProximity", "<init>", "(Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class DocumentViewportProximityVisitor implements SequentialAnalysisContextVisitor<DocumentSequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentViewportProximity documentViewportProximity;

    public DocumentViewportProximityVisitor(@NotNull DocumentViewportProximity documentViewportProximity) {
        Intrinsics.checkNotNullParameter(documentViewportProximity, "documentViewportProximity");
        this.documentViewportProximity = documentViewportProximity;
    }

    @NotNull
    public final DocumentViewportProximity getDocumentViewportProximity() {
        return this.documentViewportProximity;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SpatialDetectionResult detectionResult = context.getDetectionResult();
        if (detectionResult == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        context.setViewportProximity(this.documentViewportProximity.calculate(detectionResult));
    }
}
