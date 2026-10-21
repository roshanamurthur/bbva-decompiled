package com.veridas.detect.sequence.document.analysis;

import com.veridas.detect.Request;
import com.veridas.detect.sequence.SequentialAnalysis;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.document.context.visitor.DocumentProgressVisitor;
import com.veridas.detect.sequence.document.context.visitor.DocumentProximityVisitor;
import com.veridas.detect.sequence.document.context.visitor.DocumentViewportProximityVisitor;
import com.veridas.detect.sequence.document.context.visitor.FinalizeAnalysisVisitor;
import com.veridas.detect.sequence.document.context.visitor.MaxFrameCountVisitor;
import com.veridas.detect.sequence.document.context.visitor.SimpleDocumentProgressVisitor;
import com.veridas.detect.sequence.document.proximity.DocumentViewportProximity;
import com.veridas.detect.sequence.score.AbstractScorekeeper;
import com.veridas.detect.spatial.SpatialDetectionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentSequentialAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\u0012\u0006\u00100\u001a\u00020/\u0012\u0010\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00010\fj\u0002`\r¢\u0006\u0004\b1\u00102J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00010\fj\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/DocumentSequentialAnalysis;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "C", "Lcom/veridas/detect/sequence/SequentialAnalysis;", "context", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "spatialResult", "", "analyze", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;Lcom/veridas/detect/Request;Lcom/veridas/detect/spatial/SpatialDetectionResult;)V", "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "Lcom/veridas/detect/sequence/document/score/DocumentScorekeeper;", "a", "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "getScorekeeper", "()Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "scorekeeper", "Lcom/veridas/detect/sequence/document/context/visitor/DocumentProximityVisitor;", "b", "Lcom/veridas/detect/sequence/document/context/visitor/DocumentProximityVisitor;", "getDocumentProximityVisitor", "()Lcom/veridas/detect/sequence/document/context/visitor/DocumentProximityVisitor;", "documentProximityVisitor", "Lcom/veridas/detect/sequence/document/context/visitor/MaxFrameCountVisitor;", "c", "Lcom/veridas/detect/sequence/document/context/visitor/MaxFrameCountVisitor;", "getMaxFrameCountVisitor", "()Lcom/veridas/detect/sequence/document/context/visitor/MaxFrameCountVisitor;", "maxFrameCountVisitor", "Lcom/veridas/detect/sequence/document/context/visitor/DocumentViewportProximityVisitor;", "d", "Lcom/veridas/detect/sequence/document/context/visitor/DocumentViewportProximityVisitor;", "getDocumentViewportProximityVisitor", "()Lcom/veridas/detect/sequence/document/context/visitor/DocumentViewportProximityVisitor;", "documentViewportProximityVisitor", "Lcom/veridas/detect/sequence/document/context/visitor/DocumentProgressVisitor;", "e", "Lcom/veridas/detect/sequence/document/context/visitor/DocumentProgressVisitor;", "getDocumentProgressVisitor", "()Lcom/veridas/detect/sequence/document/context/visitor/DocumentProgressVisitor;", "documentProgressVisitor", "Lcom/veridas/detect/sequence/document/context/visitor/FinalizeAnalysisVisitor;", "getFinalizeAnalysisVisitor", "()Lcom/veridas/detect/sequence/document/context/visitor/FinalizeAnalysisVisitor;", "finalizeAnalysisVisitor", "Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;", "documentViewportProximity", "<init>", "(Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;Lcom/veridas/detect/sequence/score/AbstractScorekeeper;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public abstract class DocumentSequentialAnalysis<C extends DocumentSequentialAnalysisContext> implements SequentialAnalysis<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AbstractScorekeeper<DocumentSequentialAnalysisContext> scorekeeper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentProximityVisitor documentProximityVisitor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MaxFrameCountVisitor maxFrameCountVisitor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentViewportProximityVisitor documentViewportProximityVisitor;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SimpleDocumentProgressVisitor f66920e;

    public DocumentSequentialAnalysis(@NotNull DocumentViewportProximity documentViewportProximity, @NotNull AbstractScorekeeper<DocumentSequentialAnalysisContext> scorekeeper) {
        Intrinsics.checkNotNullParameter(documentViewportProximity, "documentViewportProximity");
        Intrinsics.checkNotNullParameter(scorekeeper, "scorekeeper");
        this.scorekeeper = scorekeeper;
        this.documentProximityVisitor = new DocumentProximityVisitor();
        this.maxFrameCountVisitor = new MaxFrameCountVisitor();
        this.documentViewportProximityVisitor = new DocumentViewportProximityVisitor(documentViewportProximity);
        this.f66920e = new SimpleDocumentProgressVisitor();
    }

    @NotNull
    public DocumentProgressVisitor getDocumentProgressVisitor() {
        return this.f66920e;
    }

    @NotNull
    public final DocumentProximityVisitor getDocumentProximityVisitor() {
        return this.documentProximityVisitor;
    }

    @NotNull
    public final DocumentViewportProximityVisitor getDocumentViewportProximityVisitor() {
        return this.documentViewportProximityVisitor;
    }

    @NotNull
    public abstract FinalizeAnalysisVisitor<C> getFinalizeAnalysisVisitor();

    @NotNull
    public final MaxFrameCountVisitor getMaxFrameCountVisitor() {
        return this.maxFrameCountVisitor;
    }

    @NotNull
    public final AbstractScorekeeper<DocumentSequentialAnalysisContext> getScorekeeper() {
        return this.scorekeeper;
    }

    @Override // com.veridas.detect.sequence.SequentialAnalysis
    public void analyze(@NotNull C context, @NotNull Request request, @NotNull SpatialDetectionResult spatialResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(spatialResult, "spatialResult");
        ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) context.accept(this.documentViewportProximityVisitor)).accept(this.scorekeeper)).accept(this.maxFrameCountVisitor)).accept(getDocumentProgressVisitor())).accept(this.documentProximityVisitor)).accept(getFinalizeAnalysisVisitor());
    }
}
