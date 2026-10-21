package com.veridas.detect.sequence.document.context.visitor;

import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.AbstractAdvanceDocumentVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.ImmediateAdvanceDocumentVisitor;
import com.veridas.detect.sequence.document.proximity.DocumentViewportProximity;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StuckDetectionVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/veridas/detect/sequence/document/context/visitor/StuckDetectionVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "", "visit", "Lcom/veridas/detect/sequence/document/analysis/visitor/AbstractAdvanceDocumentVisitor;", "a", "Lcom/veridas/detect/sequence/document/analysis/visitor/AbstractAdvanceDocumentVisitor;", "getImmediateAdvanceDocumentVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/AbstractAdvanceDocumentVisitor;", "immediateAdvanceDocumentVisitor", "<init>", "(Lcom/veridas/detect/sequence/document/analysis/visitor/AbstractAdvanceDocumentVisitor;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class StuckDetectionVisitor implements SequentialAnalysisContextVisitor<DocumentSequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AbstractAdvanceDocumentVisitor<DocumentSequentialAnalysisContext> immediateAdvanceDocumentVisitor;

    /* JADX WARN: Multi-variable type inference failed */
    public StuckDetectionVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final AbstractAdvanceDocumentVisitor<DocumentSequentialAnalysisContext> getImmediateAdvanceDocumentVisitor() {
        return this.immediateAdvanceDocumentVisitor;
    }

    public StuckDetectionVisitor(@NotNull AbstractAdvanceDocumentVisitor<DocumentSequentialAnalysisContext> immediateAdvanceDocumentVisitor) {
        Intrinsics.checkNotNullParameter(immediateAdvanceDocumentVisitor, "immediateAdvanceDocumentVisitor");
        this.immediateAdvanceDocumentVisitor = immediateAdvanceDocumentVisitor;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = context.getRequest();
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement = context.getDocumentDetectorElement();
        if (documentDetectorElement == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        context.getScore().setNotCentered(0);
        if (new DocumentViewportProximity.Builder(0.0d, 0.0d, null, 7, null).build().calculate(documentDetectorElement.getRectangleDetector().request(request)) == VDConstantDefinition.TemplateProximity.CENTERED) {
            context.accept(this.immediateAdvanceDocumentVisitor);
        }
    }

    public /* synthetic */ StuckDetectionVisitor(AbstractAdvanceDocumentVisitor abstractAdvanceDocumentVisitor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ImmediateAdvanceDocumentVisitor() : abstractAdvanceDocumentVisitor);
    }
}
