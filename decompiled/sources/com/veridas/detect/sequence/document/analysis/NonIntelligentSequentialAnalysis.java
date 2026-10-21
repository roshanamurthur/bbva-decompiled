package com.veridas.detect.sequence.document.analysis;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.document.context.visitor.ComplexDocumentProgressVisitor;
import com.veridas.detect.sequence.document.proximity.DocumentViewportProximity;
import com.veridas.detect.sequence.score.AbstractScorekeeper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NonIntelligentSequentialAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/NonIntelligentSequentialAnalysis;", "Lcom/veridas/detect/sequence/document/analysis/DocumentSequentialAnalysis;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/document/context/visitor/ComplexDocumentProgressVisitor;", "f", "Lcom/veridas/detect/sequence/document/context/visitor/ComplexDocumentProgressVisitor;", "getDocumentProgressVisitor", "()Lcom/veridas/detect/sequence/document/context/visitor/ComplexDocumentProgressVisitor;", "documentProgressVisitor", "Lcom/veridas/detect/sequence/document/analysis/NonIntelligentFinalizeAnalysisVisitor;", "g", "Lcom/veridas/detect/sequence/document/analysis/NonIntelligentFinalizeAnalysisVisitor;", "getFinalizeAnalysisVisitor", "()Lcom/veridas/detect/sequence/document/analysis/NonIntelligentFinalizeAnalysisVisitor;", "finalizeAnalysisVisitor", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class NonIntelligentSequentialAnalysis extends DocumentSequentialAnalysis<DocumentSequentialAnalysisContext> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ComplexDocumentProgressVisitor documentProgressVisitor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NonIntelligentFinalizeAnalysisVisitor finalizeAnalysisVisitor;

    /* JADX INFO: compiled from: NonIntelligentSequentialAnalysis.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007J\u0006\u0010\n\u001a\u00020\tJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007HÆ\u0003J-\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/NonIntelligentSequentialAnalysis$Builder;", "", "Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;", "value", "documentViewportProximity", "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/document/score/DocumentScorekeeper;", "scorekeeper", "Lcom/veridas/detect/sequence/document/analysis/NonIntelligentSequentialAnalysis;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "component1", "component2", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;", "getDocumentViewportProximity", "()Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;", "setDocumentViewportProximity", "(Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;)V", "b", "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "getScorekeeper", "()Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "setScorekeeper", "(Lcom/veridas/detect/sequence/score/AbstractScorekeeper;)V", "<init>", "(Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;Lcom/veridas/detect/sequence/score/AbstractScorekeeper;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public DocumentViewportProximity documentViewportProximity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public AbstractScorekeeper<DocumentSequentialAnalysisContext> scorekeeper;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder copy$default(Builder builder, DocumentViewportProximity documentViewportProximity, AbstractScorekeeper abstractScorekeeper, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                documentViewportProximity = builder.documentViewportProximity;
            }
            if ((i10 & 2) != 0) {
                abstractScorekeeper = builder.scorekeeper;
            }
            return builder.copy(documentViewportProximity, abstractScorekeeper);
        }

        @NotNull
        public final NonIntelligentSequentialAnalysis build() {
            DocumentViewportProximity documentViewportProximity = this.documentViewportProximity;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper = this.scorekeeper;
            if (documentViewportProximity == null) {
                throw new IllegalArgumentException("The documentViewportProximity parameter can't be null".toString());
            }
            if (abstractScorekeeper != null) {
                return new NonIntelligentSequentialAnalysis(documentViewportProximity, abstractScorekeeper, null);
            }
            throw new IllegalArgumentException("The scorekeeper parameter can't be null".toString());
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DocumentViewportProximity getDocumentViewportProximity() {
            return this.documentViewportProximity;
        }

        @Nullable
        public final AbstractScorekeeper<DocumentSequentialAnalysisContext> component2() {
            return this.scorekeeper;
        }

        @NotNull
        public final Builder copy(@Nullable DocumentViewportProximity documentViewportProximity, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> scorekeeper) {
            return new Builder(documentViewportProximity, scorekeeper);
        }

        @NotNull
        public final Builder documentViewportProximity(@NotNull DocumentViewportProximity value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.documentViewportProximity = value;
            return this;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.documentViewportProximity, builder.documentViewportProximity) && Intrinsics.areEqual(this.scorekeeper, builder.scorekeeper);
        }

        @Nullable
        public final DocumentViewportProximity getDocumentViewportProximity() {
            return this.documentViewportProximity;
        }

        @Nullable
        public final AbstractScorekeeper<DocumentSequentialAnalysisContext> getScorekeeper() {
            return this.scorekeeper;
        }

        public int hashCode() {
            DocumentViewportProximity documentViewportProximity = this.documentViewportProximity;
            int iHashCode = (documentViewportProximity == null ? 0 : documentViewportProximity.hashCode()) * 31;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper = this.scorekeeper;
            return iHashCode + (abstractScorekeeper != null ? abstractScorekeeper.hashCode() : 0);
        }

        @NotNull
        public final Builder scorekeeper(@NotNull AbstractScorekeeper<DocumentSequentialAnalysisContext> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.scorekeeper = value;
            return this;
        }

        public final void setDocumentViewportProximity(@Nullable DocumentViewportProximity documentViewportProximity) {
            this.documentViewportProximity = documentViewportProximity;
        }

        public final void setScorekeeper(@Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper) {
            this.scorekeeper = abstractScorekeeper;
        }

        @NotNull
        public String toString() {
            return "Builder(documentViewportProximity=" + this.documentViewportProximity + ", scorekeeper=" + this.scorekeeper + ")";
        }

        public Builder(@Nullable DocumentViewportProximity documentViewportProximity, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper) {
            this.documentViewportProximity = documentViewportProximity;
            this.scorekeeper = abstractScorekeeper;
        }

        public /* synthetic */ Builder(DocumentViewportProximity documentViewportProximity, AbstractScorekeeper abstractScorekeeper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : documentViewportProximity, (i10 & 2) != 0 ? null : abstractScorekeeper);
        }
    }

    public /* synthetic */ NonIntelligentSequentialAnalysis(DocumentViewportProximity documentViewportProximity, AbstractScorekeeper abstractScorekeeper, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentViewportProximity, abstractScorekeeper);
    }

    public NonIntelligentSequentialAnalysis(DocumentViewportProximity documentViewportProximity, AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper) {
        super(documentViewportProximity, abstractScorekeeper);
        this.documentProgressVisitor = new ComplexDocumentProgressVisitor();
        this.finalizeAnalysisVisitor = new NonIntelligentFinalizeAnalysisVisitor();
    }

    @Override // com.veridas.detect.sequence.document.analysis.DocumentSequentialAnalysis
    @NotNull
    public ComplexDocumentProgressVisitor getDocumentProgressVisitor() {
        return this.documentProgressVisitor;
    }

    @Override // com.veridas.detect.sequence.document.analysis.DocumentSequentialAnalysis
    @NotNull
    public NonIntelligentFinalizeAnalysisVisitor getFinalizeAnalysisVisitor() {
        return this.finalizeAnalysisVisitor;
    }
}
