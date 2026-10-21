package com.veridas.detect.sequence.document.analysis.visitor;

import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModifyScaleVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/ModifyScaleVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;", "()V", "visit", "", "context", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModifyScaleVisitor implements SequentialAnalysisContextVisitor<IntelligentSequentialAnalysisContext> {
    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull IntelligentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = context.getRequest();
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        context.setRequest(new Request.Builder(null, false, null, null, null, null, false, null, null, null, 0.0d, null, false, 0, false, 0, false, 0.0d, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, false, null, null, false, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null).copyFrom(request).scale(context.getScale()).build());
    }
}
