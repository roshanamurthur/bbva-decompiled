package com.veridas.detect.sequence.document.analysis.visitor;

import com.veridas.detect.DetectionMode;
import com.veridas.detect.sequence.context.AbstractDocumentSequentialAnalysisContextVisitor;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AdvanceDetectionModeVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/AdvanceDetectionModeVisitor;", "Lcom/veridas/detect/sequence/context/AbstractDocumentSequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "", "Lcom/veridas/detect/DetectionMode;", "availableDetectionModes", "", "advanceDetectionModeIndex", "", "shouldAdvanceDetectionMode", "visit", "a", "Z", "getRectangleDetectionCapable", "()Z", "rectangleDetectionCapable", "<init>", "(Z)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class AdvanceDetectionModeVisitor extends AbstractDocumentSequentialAnalysisContextVisitor<DocumentSequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean rectangleDetectionCapable;

    public AdvanceDetectionModeVisitor() {
        this(false, 1, null);
    }

    public final void advanceDetectionModeIndex(@NotNull DocumentSequentialAnalysisContext context, @NotNull List<? extends DetectionMode> availableDetectionModes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(availableDetectionModes, "availableDetectionModes");
        context.setDetectionModeIndex(context.getDetectionModeIndex() + 1);
        context.getDetectionModeIndex();
        if (context.getDetectionModeIndex() == availableDetectionModes.size()) {
            context.setDetectionModeIndex(0);
        }
    }

    public final boolean getRectangleDetectionCapable() {
        return this.rectangleDetectionCapable;
    }

    public final boolean shouldAdvanceDetectionMode(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !context.hasHit();
    }

    public /* synthetic */ AdvanceDetectionModeVisitor(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<DetectionMode> availableDetectionModes = getConfiguration(context).getAvailableDetectionModes(this.rectangleDetectionCapable);
        if (shouldAdvanceDetectionMode(context)) {
            advanceDetectionModeIndex(context, availableDetectionModes);
        }
    }

    public AdvanceDetectionModeVisitor(boolean z10) {
        this.rectangleDetectionCapable = z10;
    }
}
