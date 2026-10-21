package com.veridas.detect.sequence.document.analysis;

import androidx.camera.core.processing.f;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.document.context.visitor.FinalizeAnalysisVisitor;
import com.veridas.detect.sequence.score.Score;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NonIntelligentSequentialAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/NonIntelligentFinalizeAnalysisVisitor;", "Lcom/veridas/detect/sequence/document/context/visitor/FinalizeAnalysisVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "()V", "visit", "", "context", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NonIntelligentFinalizeAnalysisVisitor extends FinalizeAnalysisVisitor<DocumentSequentialAnalysisContext> {
    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = context.getRequest();
        Score score = context.getScore();
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        finalize(context);
        if (context.getDocumentIndex() >= context.getDocumentIds().size()) {
            throw new IllegalArgumentException("The document index can never be more than or equal to the size of the number of document identifiers".toString());
        }
        String str = context.getDocumentIds().get(context.getDocumentIndex());
        DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement = context.getDocumentMap().get(str);
        if (documentDetectorElement == null) {
            throw new IllegalArgumentException(f.d("Configuration not found for ", str).toString());
        }
        if (!documentDetectorElement.getConfiguration().isIntelligent() || score.getTotal() <= score.getRequiredHitsThreshold()) {
            return;
        }
        context.setObjectData(str);
    }
}
