package com.veridas.detect.sequence.context;

import com.veridas.detect.sequence.context.SequentialAnalysisContext;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SequentialAnalysisContext.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "C", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "", "visit", "", "context", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SequentialAnalysisContextVisitor<C extends SequentialAnalysisContext> {
    void visit(@NotNull C context);
}
