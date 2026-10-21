package com.veridas.detect.sequence.document;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SafeSequenceObjectDetector;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.UniversalSequentialAnalysisContext;
import com.veridas.detect.sequence.document.analysis.NonIntelligentSequentialAnalysis;
import com.veridas.detect.sequence.document.analysis.visitor.AdvanceDetectionModeVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.NonIntelligentAdvanceDocumentVisitor;
import com.veridas.detect.sequence.document.proximity.DocumentViewportProximity;
import com.veridas.detect.sequence.document.score.PassportDocumentScorekeeper;
import com.veridas.detect.sequence.score.AbstractScorekeeper;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.log.ILibraryLogger;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NonIntelligentSequenceObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/veridas/detect/sequence/document/NonIntelligentSequenceObjectDetector;", "Lcom/veridas/detect/sequence/document/AbstractComplexSequenceDocumentDetector;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "Lcom/veridas/detect/sequence/document/analysis/visitor/AdvanceDetectionModeVisitor;", "t", "Lcom/veridas/detect/sequence/document/analysis/visitor/AdvanceDetectionModeVisitor;", "getAdvanceDetectionModeVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/AdvanceDetectionModeVisitor;", "advanceDetectionModeVisitor", "Lcom/veridas/detect/sequence/document/analysis/visitor/NonIntelligentAdvanceDocumentVisitor;", "u", "Lcom/veridas/detect/sequence/document/analysis/visitor/NonIntelligentAdvanceDocumentVisitor;", "getAdvanceDocumentVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/NonIntelligentAdvanceDocumentVisitor;", "advanceDocumentVisitor", "Lcom/veridas/log/ILibraryLogger;", SharedPrefsStorage.VERSION_KEY, "Lcom/veridas/log/ILibraryLogger;", "getLogger", "()Lcom/veridas/log/ILibraryLogger;", "logger", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class NonIntelligentSequenceObjectDetector extends AbstractComplexSequenceDocumentDetector<DocumentSequentialAnalysisContext> {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AdvanceDetectionModeVisitor advanceDetectionModeVisitor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NonIntelligentAdvanceDocumentVisitor advanceDocumentVisitor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ILibraryLogger logger;

    /* JADX INFO: compiled from: NonIntelligentSequenceObjectDetector.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\rj\u0002`\u000eJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0014Ju\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006 "}, d2 = {"Lcom/veridas/detect/sequence/document/NonIntelligentSequenceObjectDetector$Builder;", "", "Lcom/veridas/detect/sequence/document/analysis/NonIntelligentSequentialAnalysis;", "value", "analysis", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "Lcom/veridas/detect/sequence/document/score/DocumentScorekeeper;", "scorekeeper", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "Lcom/veridas/log/ILibraryLogger;", "logger", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Lcom/veridas/detect/sequence/document/analysis/NonIntelligentSequentialAnalysis;Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;Lcom/veridas/util/FpsCalculator;Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/score/AbstractScorekeeper;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;Lcom/veridas/log/ILibraryLogger;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public NonIntelligentSequentialAnalysis f66894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public DocumentSequentialAnalysisContext f66895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public FpsCalculator f66896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ObjectConfigurationProvider f66897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Score f66898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public AbstractScorekeeper<DocumentSequentialAnalysisContext> f66899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public SpatialObjectDetectorFactory f66900g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public ILibraryLogger f66901h;

        public Builder() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @NotNull
        public final Builder analysis(@NotNull NonIntelligentSequentialAnalysis value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66894a = value;
            return this;
        }

        @NotNull
        public final SequenceObjectDetector build() {
            FpsCalculator fpsCalculator = this.f66896c;
            ObjectConfigurationProvider objectConfigurationProvider = this.f66897d;
            SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f66900g;
            NonIntelligentSequentialAnalysis nonIntelligentSequentialAnalysisBuild = this.f66894a;
            DocumentSequentialAnalysisContext documentSequentialAnalysisContext = this.f66895b;
            Score score = this.f66898e;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> passportDocumentScorekeeper = this.f66899f;
            ILibraryLogger iLibraryLogger = this.f66901h;
            if (fpsCalculator == null) {
                throw new IllegalArgumentException("The fpsCalculator argument can't be null".toString());
            }
            if (objectConfigurationProvider == null) {
                throw new IllegalArgumentException("The objectConfigurationProvider argument can't be null".toString());
            }
            if (spatialObjectDetectorFactory == null) {
                throw new IllegalArgumentException("The spatialObjectDetectorFactory argument can't be null".toString());
            }
            if (iLibraryLogger == null) {
                throw new IllegalArgumentException("The logger argument can't be null".toString());
            }
            if (score == null) {
                score = new Score(0, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097151, null);
            }
            DocumentSequentialAnalysisContext universalSequentialAnalysisContext = documentSequentialAnalysisContext == null ? new UniversalSequentialAnalysisContext(score, null, false, null, null, null, 0.0d, false, 0, 0, 12, false, null, false, false, 0.0d, 100.0d, 25.0d, null, null, null, null, true, false, 0, 8, 1.5d, 1.5d, 0.0d, 0.0d, null, 0, null, 0, null, spatialObjectDetectorFactory, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0.0d, 0.0d, 0, -239272962, 1073741815, null) : documentSequentialAnalysisContext;
            if (passportDocumentScorekeeper == null) {
                passportDocumentScorekeeper = new PassportDocumentScorekeeper();
            }
            if (nonIntelligentSequentialAnalysisBuild == null) {
                nonIntelligentSequentialAnalysisBuild = new NonIntelligentSequentialAnalysis.Builder(null, null, 3, null).documentViewportProximity(new DocumentViewportProximity.Builder(0.0d, 0.0d, null, 7, null).tooFarScale(0.7d).build()).scorekeeper(passportDocumentScorekeeper).build();
            }
            return new SafeSequenceObjectDetector.Builder(null, null, 3, null).context(universalSequentialAnalysisContext).sequenceObjectDetector(new NonIntelligentSequenceObjectDetector(nonIntelligentSequentialAnalysisBuild, score, passportDocumentScorekeeper, universalSequentialAnalysisContext, fpsCalculator, objectConfigurationProvider, spatialObjectDetectorFactory, iLibraryLogger)).build();
        }

        @NotNull
        public final Builder context(@NotNull DocumentSequentialAnalysisContext value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66895b = value;
            return this;
        }

        @NotNull
        public final Builder copy(@Nullable NonIntelligentSequentialAnalysis analysis, @Nullable DocumentSequentialAnalysisContext context, @Nullable FpsCalculator fpsCalculator, @Nullable ObjectConfigurationProvider objectConfigurationProvider, @Nullable Score score, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> scorekeeper, @Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory, @Nullable ILibraryLogger logger) {
            return new Builder(analysis, context, fpsCalculator, objectConfigurationProvider, score, scorekeeper, spatialObjectDetectorFactory, logger);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.f66894a, builder.f66894a) && Intrinsics.areEqual(this.f66895b, builder.f66895b) && Intrinsics.areEqual(this.f66896c, builder.f66896c) && Intrinsics.areEqual(this.f66897d, builder.f66897d) && Intrinsics.areEqual(this.f66898e, builder.f66898e) && Intrinsics.areEqual(this.f66899f, builder.f66899f) && Intrinsics.areEqual(this.f66900g, builder.f66900g) && Intrinsics.areEqual(this.f66901h, builder.f66901h);
        }

        @NotNull
        public final Builder fpsCalculator(@NotNull FpsCalculator value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66896c = value;
            return this;
        }

        public int hashCode() {
            NonIntelligentSequentialAnalysis nonIntelligentSequentialAnalysis = this.f66894a;
            int iHashCode = (nonIntelligentSequentialAnalysis == null ? 0 : nonIntelligentSequentialAnalysis.hashCode()) * 31;
            DocumentSequentialAnalysisContext documentSequentialAnalysisContext = this.f66895b;
            int iHashCode2 = (iHashCode + (documentSequentialAnalysisContext == null ? 0 : documentSequentialAnalysisContext.hashCode())) * 31;
            FpsCalculator fpsCalculator = this.f66896c;
            int iHashCode3 = (iHashCode2 + (fpsCalculator == null ? 0 : fpsCalculator.hashCode())) * 31;
            ObjectConfigurationProvider objectConfigurationProvider = this.f66897d;
            int iHashCode4 = (iHashCode3 + (objectConfigurationProvider == null ? 0 : objectConfigurationProvider.hashCode())) * 31;
            Score score = this.f66898e;
            int iHashCode5 = (iHashCode4 + (score == null ? 0 : score.hashCode())) * 31;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper = this.f66899f;
            int iHashCode6 = (iHashCode5 + (abstractScorekeeper == null ? 0 : abstractScorekeeper.hashCode())) * 31;
            SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f66900g;
            int iHashCode7 = (iHashCode6 + (spatialObjectDetectorFactory == null ? 0 : spatialObjectDetectorFactory.hashCode())) * 31;
            ILibraryLogger iLibraryLogger = this.f66901h;
            return iHashCode7 + (iLibraryLogger != null ? iLibraryLogger.hashCode() : 0);
        }

        @NotNull
        public final Builder logger(@NotNull ILibraryLogger value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66901h = value;
            return this;
        }

        @NotNull
        public final Builder objectConfigurationProvider(@NotNull ObjectConfigurationProvider value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66897d = value;
            return this;
        }

        @NotNull
        public final Builder score(@NotNull Score value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66898e = value;
            return this;
        }

        @NotNull
        public final Builder scorekeeper(@NotNull AbstractScorekeeper<DocumentSequentialAnalysisContext> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66899f = value;
            return this;
        }

        @NotNull
        public final Builder spatialObjectDetectorFactory(@NotNull SpatialObjectDetectorFactory value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66900g = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(analysis=" + this.f66894a + ", context=" + this.f66895b + ", fpsCalculator=" + this.f66896c + ", objectConfigurationProvider=" + this.f66897d + ", score=" + this.f66898e + ", scorekeeper=" + this.f66899f + ", spatialObjectDetectorFactory=" + this.f66900g + ", logger=" + this.f66901h + ")";
        }

        public Builder(@Nullable NonIntelligentSequentialAnalysis nonIntelligentSequentialAnalysis, @Nullable DocumentSequentialAnalysisContext documentSequentialAnalysisContext, @Nullable FpsCalculator fpsCalculator, @Nullable ObjectConfigurationProvider objectConfigurationProvider, @Nullable Score score, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper, @Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory, @Nullable ILibraryLogger iLibraryLogger) {
            this.f66894a = nonIntelligentSequentialAnalysis;
            this.f66895b = documentSequentialAnalysisContext;
            this.f66896c = fpsCalculator;
            this.f66897d = objectConfigurationProvider;
            this.f66898e = score;
            this.f66899f = abstractScorekeeper;
            this.f66900g = spatialObjectDetectorFactory;
            this.f66901h = iLibraryLogger;
        }

        public /* synthetic */ Builder(NonIntelligentSequentialAnalysis nonIntelligentSequentialAnalysis, DocumentSequentialAnalysisContext documentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, Score score, AbstractScorekeeper abstractScorekeeper, SpatialObjectDetectorFactory spatialObjectDetectorFactory, ILibraryLogger iLibraryLogger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : nonIntelligentSequentialAnalysis, (i10 & 2) != 0 ? null : documentSequentialAnalysisContext, (i10 & 4) != 0 ? null : fpsCalculator, (i10 & 8) != 0 ? null : objectConfigurationProvider, (i10 & 16) != 0 ? null : score, (i10 & 32) != 0 ? null : abstractScorekeeper, (i10 & 64) != 0 ? null : spatialObjectDetectorFactory, (i10 & 128) == 0 ? iLibraryLogger : null);
        }
    }

    public NonIntelligentSequenceObjectDetector(NonIntelligentSequentialAnalysis nonIntelligentSequentialAnalysis, Score score, AbstractScorekeeper abstractScorekeeper, DocumentSequentialAnalysisContext documentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, SpatialObjectDetectorFactory spatialObjectDetectorFactory, ILibraryLogger iLibraryLogger) {
        AdvanceDetectionModeVisitor advanceDetectionModeVisitor = new AdvanceDetectionModeVisitor(false, 1, null);
        NonIntelligentAdvanceDocumentVisitor nonIntelligentAdvanceDocumentVisitor = new NonIntelligentAdvanceDocumentVisitor();
        super(nonIntelligentSequentialAnalysis, score, abstractScorekeeper, documentSequentialAnalysisContext, fpsCalculator, spatialObjectDetectorFactory, objectConfigurationProvider, null, null, null, 896, null);
        this.advanceDetectionModeVisitor = advanceDetectionModeVisitor;
        this.advanceDocumentVisitor = nonIntelligentAdvanceDocumentVisitor;
        this.logger = iLibraryLogger;
    }

    @NotNull
    public final AdvanceDetectionModeVisitor getAdvanceDetectionModeVisitor() {
        return this.advanceDetectionModeVisitor;
    }

    @NotNull
    public final NonIntelligentAdvanceDocumentVisitor getAdvanceDocumentVisitor() {
        return this.advanceDocumentVisitor;
    }

    @NotNull
    public final ILibraryLogger getLogger() {
        return this.logger;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext, com.veridas.detect.sequence.context.SequentialAnalysisContext] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext, com.veridas.detect.sequence.context.SequentialAnalysisContext] */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext, com.veridas.detect.sequence.context.SequentialAnalysisContext] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext] */
    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    @NotNull
    public SequentialDetectionResult request(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) getContext().accept(getInitializerVisitor().request(request)).accept(getDocumentConfigurationSelectionVisitor())).accept(getSelectDetectionModeVisitor())).accept(getSelectDetectorVisitor());
        this.logger.log("DETECTION_MODE", getContext().getDetectionMode().toString());
        ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) getContext().accept(getPreLightBlobDetectionVisitor())).accept(getDetectorVisitor())).accept(getFpsVisitor()).accept(getWarmupVisitor())).accept(getAnalysisVisitor())).accept(getResultVisitor()).accept(getPostLightBlobDetectionVisitor())).accept(this.advanceDocumentVisitor)).accept(this.advanceDetectionModeVisitor);
        SequentialDetectionResult result = getContext().getResult();
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
