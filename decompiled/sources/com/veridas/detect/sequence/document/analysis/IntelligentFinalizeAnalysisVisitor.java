package com.veridas.detect.sequence.document.analysis;

import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext;
import com.veridas.detect.sequence.document.context.visitor.FinalizeAnalysisVisitor;
import com.veridas.detect.sequence.score.Score;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntelligentSequentialAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/IntelligentFinalizeAnalysisVisitor;", "Lcom/veridas/detect/sequence/document/context/visitor/FinalizeAnalysisVisitor;", "Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;", "()V", "visit", "", "context", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntelligentFinalizeAnalysisVisitor extends FinalizeAnalysisVisitor<IntelligentSequentialAnalysisContext> {
    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull IntelligentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = context.getRequest();
        Score score = context.getScore();
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        finalize(context);
        if (score.getTotal() > score.getRequiredHitsThreshold()) {
            if (context.getDocumentIndex() >= context.getDocumentIds().size()) {
                throw new IllegalArgumentException("The document index can never be more than or equal to the size of the number of document identifiers".toString());
            }
            context.setObjectData(context.getDocumentIds().get(context.getDocumentIndex()));
        } else if (score.getTotal() == 0 && score.getFar() == 0) {
            context.setObjectData(VDConstantDefinition.ERROR_DOCUMENT);
        } else {
            context.setObjectData("");
        }
        if (context.getObjectDetected()) {
            context.setRectangleDetected(0);
        }
    }
}
