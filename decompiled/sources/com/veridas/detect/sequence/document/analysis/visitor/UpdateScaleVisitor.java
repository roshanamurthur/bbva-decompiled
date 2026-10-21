package com.veridas.detect.sequence.document.analysis.visitor;

import com.veridas.detect.DetectionMode;
import com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UpdateScaleVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/UpdateScaleVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;", "()V", "shouldUpdateScale", "", "context", "updateScale", "", "visit", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UpdateScaleVisitor implements SequentialAnalysisContextVisitor<IntelligentSequentialAnalysisContext> {
    public final boolean shouldUpdateScale(@NotNull IntelligentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getDetectionMode() == DetectionMode.XML && !context.hasHit();
    }

    public final void updateScale(@NotNull IntelligentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.setScale(context.getScale() - context.getScaleStep());
        if (context.getScale() < context.getScaleMin()) {
            context.setScale(context.getScaleMax());
        }
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull IntelligentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (shouldUpdateScale(context)) {
            updateScale(context);
        }
    }
}
