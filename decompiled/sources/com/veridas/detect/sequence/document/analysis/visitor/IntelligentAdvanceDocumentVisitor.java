package com.veridas.detect.sequence.document.analysis.visitor;

import com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext;
import com.veridas.detect.sequence.score.Score;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AdvanceDocumentVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/IntelligentAdvanceDocumentVisitor;", "Lcom/veridas/detect/sequence/document/analysis/visitor/AbstractAdvanceDocumentVisitor;", "Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;", "()V", "cycleDocumentIndex", "", "context", "shouldAdvanceDocument", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntelligentAdvanceDocumentVisitor extends AbstractAdvanceDocumentVisitor<IntelligentSequentialAnalysisContext> {
    @Override // com.veridas.detect.sequence.document.analysis.visitor.AbstractAdvanceDocumentVisitor
    public void cycleDocumentIndex(@NotNull IntelligentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.cycleDocumentIndex(context);
        context.setCycle(context.getCycle() + 1);
        context.getCycle();
    }

    @Override // com.veridas.detect.sequence.document.analysis.visitor.AdvanceDocumentVisitor
    public boolean shouldAdvanceDocument(@NotNull IntelligentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Score score = context.getScore();
        return !context.hasHit() && context.getDetectionMode() == context.getLastDetectionMode() && score.getTotal() == 0 && score.getFar() < score.getRequiredHitsThreshold();
    }
}
