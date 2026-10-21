package com.veridas.detect.sequence.document.analysis;

import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.document.context.visitor.FinalizeAnalysisVisitor;
import com.veridas.detect.sequence.score.Score;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RectangleSequentialAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/RectangleFinalizeAnalysisVisitor;", "Lcom/veridas/detect/sequence/document/context/visitor/FinalizeAnalysisVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "()V", "visit", "", "context", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RectangleFinalizeAnalysisVisitor extends FinalizeAnalysisVisitor<DocumentSequentialAnalysisContext> {
    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Score score = context.getScore();
        if (context.getBestDetectionResult() == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        context.setAnalysisType(VDConstantDefinition.AnalysisType.RECTANGLE_BOX_OBVERSE);
        context.setObjectLost(false);
        if (score.getTotal() >= score.getRequiredHits()) {
            score.setTotal(0);
            context.setObjectDetected(true);
            context.setProgress(context.getProgressMax());
        }
    }
}
