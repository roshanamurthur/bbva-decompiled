package com.veridas.detect.sequence.context.visitor;

import com.veridas.detect.sequence.context.SequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FpsVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/veridas/detect/sequence/context/visitor/FpsVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "context", "", "visit", "Lcom/veridas/util/FpsCalculator;", "a", "Lcom/veridas/util/FpsCalculator;", "getFpsCalculator", "()Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "<init>", "(Lcom/veridas/util/FpsCalculator;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class FpsVisitor implements SequentialAnalysisContextVisitor<SequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FpsCalculator fpsCalculator;

    public FpsVisitor(@NotNull FpsCalculator fpsCalculator) {
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        this.fpsCalculator = fpsCalculator;
    }

    @NotNull
    public final FpsCalculator getFpsCalculator() {
        return this.fpsCalculator;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull SequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FpsCalculator fpsCalculator = this.fpsCalculator;
        fpsCalculator.tick();
        context.setFps(fpsCalculator.getF67492d());
    }
}
