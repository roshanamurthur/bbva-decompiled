package com.veridas.detect.sequence.document.analysis.visitor;

import com.veridas.detect.DetectionMode;
import com.veridas.detect.sequence.context.AbstractDocumentSequentialAnalysisContextVisitor;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SelectDetectionModeVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectionModeVisitor;", "Lcom/veridas/detect/sequence/context/AbstractDocumentSequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "", "visit", "", "a", "Z", "getRectangleDetectionCapable", "()Z", "rectangleDetectionCapable", "<init>", "(Z)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class SelectDetectionModeVisitor extends AbstractDocumentSequentialAnalysisContextVisitor<DocumentSequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean rectangleDetectionCapable;

    public SelectDetectionModeVisitor() {
        this(false, 1, null);
    }

    public final boolean getRectangleDetectionCapable() {
        return this.rectangleDetectionCapable;
    }

    public /* synthetic */ SelectDetectionModeVisitor(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<DetectionMode> availableDetectionModes = getConfiguration(context).getAvailableDetectionModes(this.rectangleDetectionCapable);
        context.setLastDetectionMode((DetectionMode) CollectionsKt___CollectionsKt.last((List) availableDetectionModes));
        context.setDetectionMode(availableDetectionModes.get(context.getDetectionModeIndex()));
    }

    public SelectDetectionModeVisitor(boolean z10) {
        this.rectangleDetectionCapable = z10;
    }
}
