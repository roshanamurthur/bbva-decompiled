package com.veridas.detect.sequence.document;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.FinishDetectorException;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.document.analysis.DocumentSequentialAnalysis;
import com.veridas.detect.sequence.document.analysis.visitor.DocumentConfigurationSelectionVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.SelectDetectionModeVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.SelectDetectorVisitor;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.sequence.score.Scorekeeper;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.lang.AggregateException;
import com.veridas.util.FpsCalculator;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractComplexSequenceDocumentDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003Bc\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010&\u001a\u00028\u0000\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\f\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\b\u0010\r\u001a\u00020\u0006H\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/veridas/detect/sequence/document/AbstractComplexSequenceDocumentDetector;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "C", "Lcom/veridas/detect/sequence/document/AbstractSequenceDocumentDetector;", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "detector", "", "finalizeDetector", "", "", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;", "documentMap", "finalizeDocumentList", "finish", "Lcom/veridas/detect/sequence/document/analysis/visitor/DocumentConfigurationSelectionVisitor;", "q", "Lcom/veridas/detect/sequence/document/analysis/visitor/DocumentConfigurationSelectionVisitor;", "getDocumentConfigurationSelectionVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/DocumentConfigurationSelectionVisitor;", "documentConfigurationSelectionVisitor", "Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectionModeVisitor;", "r", "Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectionModeVisitor;", "getSelectDetectionModeVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectionModeVisitor;", "selectDetectionModeVisitor", "Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectorVisitor;", "s", "Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectorVisitor;", "getSelectDetectorVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectorVisitor;", "selectDetectorVisitor", "Lcom/veridas/detect/sequence/document/analysis/DocumentSequentialAnalysis;", "analysis", "Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Scorekeeper;", "scorekeeper", "context", "Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "<init>", "(Lcom/veridas/detect/sequence/document/analysis/DocumentSequentialAnalysis;Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/score/Scorekeeper;Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;Lcom/veridas/util/FpsCalculator;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/detect/sequence/document/analysis/visitor/DocumentConfigurationSelectionVisitor;Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectionModeVisitor;Lcom/veridas/detect/sequence/document/analysis/visitor/SelectDetectorVisitor;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAbstractComplexSequenceDocumentDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractComplexSequenceDocumentDetector.kt\ncom/veridas/detect/sequence/document/AbstractComplexSequenceDocumentDetector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,118:1\n1855#2,2:119\n*S KotlinDebug\n*F\n+ 1 AbstractComplexSequenceDocumentDetector.kt\ncom/veridas/detect/sequence/document/AbstractComplexSequenceDocumentDetector\n*L\n60#1:119,2\n*E\n"})
public abstract class AbstractComplexSequenceDocumentDetector<C extends DocumentSequentialAnalysisContext> extends AbstractSequenceDocumentDetector<C> {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentConfigurationSelectionVisitor documentConfigurationSelectionVisitor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SelectDetectionModeVisitor selectDetectionModeVisitor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SelectDetectorVisitor selectDetectorVisitor;

    public /* synthetic */ AbstractComplexSequenceDocumentDetector(DocumentSequentialAnalysis documentSequentialAnalysis, Score score, Scorekeeper scorekeeper, DocumentSequentialAnalysisContext documentSequentialAnalysisContext, FpsCalculator fpsCalculator, SpatialObjectDetectorFactory spatialObjectDetectorFactory, ObjectConfigurationProvider objectConfigurationProvider, DocumentConfigurationSelectionVisitor documentConfigurationSelectionVisitor, SelectDetectionModeVisitor selectDetectionModeVisitor, SelectDetectorVisitor selectDetectorVisitor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentSequentialAnalysis, score, scorekeeper, documentSequentialAnalysisContext, fpsCalculator, spatialObjectDetectorFactory, objectConfigurationProvider, (i10 & 128) != 0 ? new DocumentConfigurationSelectionVisitor(objectConfigurationProvider) : documentConfigurationSelectionVisitor, (i10 & 256) != 0 ? new SelectDetectionModeVisitor(false, 1, null) : selectDetectionModeVisitor, (i10 & 512) != 0 ? new SelectDetectorVisitor() : selectDetectorVisitor);
    }

    public final boolean finalizeDetector(@Nullable SpatialObjectDetector detector) throws FinishDetectorException {
        if (detector == null) {
            return true;
        }
        try {
            return detector.finish();
        } catch (Exception e5) {
            throw new FinishDetectorException(e5);
        }
    }

    public final boolean finalizeDocumentList(@NotNull Map<String, DocumentSequentialAnalysisContext.DocumentDetectorElement> documentMap) throws AggregateException {
        Intrinsics.checkNotNullParameter(documentMap, "documentMap");
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement : documentMap.values()) {
            try {
                boolean zFinalizeDetector = finalizeDetector(documentDetectorElement.getCascadeDetector());
                if (!zFinalizeDetector) {
                    z10 = zFinalizeDetector;
                }
            } catch (Exception e5) {
                arrayList.add(e5);
                z10 = false;
            }
            try {
                boolean zFinalizeDetector2 = finalizeDetector(documentDetectorElement.getTemplateDetector());
                if (!zFinalizeDetector2) {
                    z10 = zFinalizeDetector2;
                }
            } catch (Exception e7) {
                arrayList.add(e7);
                z10 = false;
            }
        }
        documentMap.clear();
        if (!arrayList.isEmpty()) {
            throw new AggregateException(arrayList);
        }
        return z10;
    }

    @Override // com.veridas.detect.sequence.document.AbstractSequenceDocumentDetector, com.veridas.detect.sequence.SequenceObjectDetector
    public boolean finish() throws AggregateException {
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        try {
            z10 = finalizeDocumentList(getContext().getDocumentMap());
        } catch (Exception e5) {
            arrayList.add(e5);
        }
        try {
            z11 = super.finish() ? z10 : false;
        } catch (Exception e7) {
            arrayList.add(e7);
        }
        if (true ^ arrayList.isEmpty()) {
            throw new AggregateException(arrayList);
        }
        return z11;
    }

    @NotNull
    public final DocumentConfigurationSelectionVisitor getDocumentConfigurationSelectionVisitor() {
        return this.documentConfigurationSelectionVisitor;
    }

    @NotNull
    public final SelectDetectionModeVisitor getSelectDetectionModeVisitor() {
        return this.selectDetectionModeVisitor;
    }

    @NotNull
    public final SelectDetectorVisitor getSelectDetectorVisitor() {
        return this.selectDetectorVisitor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractComplexSequenceDocumentDetector(@NotNull DocumentSequentialAnalysis<C> analysis, @NotNull Score score, @NotNull Scorekeeper scorekeeper, @NotNull C context, @NotNull FpsCalculator fpsCalculator, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory, @NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull DocumentConfigurationSelectionVisitor documentConfigurationSelectionVisitor, @NotNull SelectDetectionModeVisitor selectDetectionModeVisitor, @NotNull SelectDetectorVisitor selectDetectorVisitor) {
        super(analysis, score, scorekeeper, fpsCalculator, spatialObjectDetectorFactory, context, objectConfigurationProvider);
        Intrinsics.checkNotNullParameter(analysis, "analysis");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(scorekeeper, "scorekeeper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(documentConfigurationSelectionVisitor, "documentConfigurationSelectionVisitor");
        Intrinsics.checkNotNullParameter(selectDetectionModeVisitor, "selectDetectionModeVisitor");
        Intrinsics.checkNotNullParameter(selectDetectorVisitor, "selectDetectorVisitor");
        this.documentConfigurationSelectionVisitor = documentConfigurationSelectionVisitor;
        this.selectDetectionModeVisitor = selectDetectionModeVisitor;
        this.selectDetectorVisitor = selectDetectorVisitor;
    }
}
