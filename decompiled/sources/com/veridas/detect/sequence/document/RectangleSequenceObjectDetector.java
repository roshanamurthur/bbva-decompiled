package com.veridas.detect.sequence.document;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SafeSequenceObjectDetector;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.UniversalSequentialAnalysisContext;
import com.veridas.detect.sequence.document.analysis.RectangleSequentialAnalysis;
import com.veridas.detect.sequence.document.proximity.DocumentViewportProximity;
import com.veridas.detect.sequence.document.score.RectangleDocumentScorekeeper;
import com.veridas.detect.sequence.score.AbstractScorekeeper;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.sequence.score.Scorekeeper;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RectangleSequenceObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/veridas/detect/sequence/document/RectangleSequenceObjectDetector;", "Lcom/veridas/detect/sequence/document/AbstractSequenceDocumentDetector;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class RectangleSequenceObjectDetector extends AbstractSequenceDocumentDetector<DocumentSequentialAnalysisContext> {

    /* JADX INFO: compiled from: RectangleSequenceObjectDetector.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\rj\u0002`\u000eJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0012Ji\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u001e"}, d2 = {"Lcom/veridas/detect/sequence/document/RectangleSequenceObjectDetector$Builder;", "", "Lcom/veridas/detect/sequence/document/analysis/RectangleSequentialAnalysis;", "value", "analysis", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "Lcom/veridas/detect/sequence/document/score/DocumentScorekeeper;", "scorekeeper", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Lcom/veridas/detect/sequence/document/analysis/RectangleSequentialAnalysis;Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;Lcom/veridas/util/FpsCalculator;Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/score/AbstractScorekeeper;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public RectangleSequentialAnalysis f66909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public DocumentSequentialAnalysisContext f66910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public FpsCalculator f66911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ObjectConfigurationProvider f66912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Score f66913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public AbstractScorekeeper<DocumentSequentialAnalysisContext> f66914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public SpatialObjectDetectorFactory f66915g;

        public Builder() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder copy$default(Builder builder, RectangleSequentialAnalysis rectangleSequentialAnalysis, DocumentSequentialAnalysisContext documentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, Score score, AbstractScorekeeper abstractScorekeeper, SpatialObjectDetectorFactory spatialObjectDetectorFactory, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rectangleSequentialAnalysis = builder.f66909a;
            }
            if ((i10 & 2) != 0) {
                documentSequentialAnalysisContext = builder.f66910b;
            }
            DocumentSequentialAnalysisContext documentSequentialAnalysisContext2 = documentSequentialAnalysisContext;
            if ((i10 & 4) != 0) {
                fpsCalculator = builder.f66911c;
            }
            FpsCalculator fpsCalculator2 = fpsCalculator;
            if ((i10 & 8) != 0) {
                objectConfigurationProvider = builder.f66912d;
            }
            ObjectConfigurationProvider objectConfigurationProvider2 = objectConfigurationProvider;
            if ((i10 & 16) != 0) {
                score = builder.f66913e;
            }
            Score score2 = score;
            if ((i10 & 32) != 0) {
                abstractScorekeeper = builder.f66914f;
            }
            AbstractScorekeeper abstractScorekeeper2 = abstractScorekeeper;
            if ((i10 & 64) != 0) {
                spatialObjectDetectorFactory = builder.f66915g;
            }
            return builder.copy(rectangleSequentialAnalysis, documentSequentialAnalysisContext2, fpsCalculator2, objectConfigurationProvider2, score2, abstractScorekeeper2, spatialObjectDetectorFactory);
        }

        @NotNull
        public final Builder analysis(@NotNull RectangleSequentialAnalysis value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66909a = value;
            return this;
        }

        @NotNull
        public final SequenceObjectDetector build() {
            FpsCalculator fpsCalculator = this.f66911c;
            ObjectConfigurationProvider objectConfigurationProvider = this.f66912d;
            SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f66915g;
            RectangleSequentialAnalysis rectangleSequentialAnalysisBuild = this.f66909a;
            DocumentSequentialAnalysisContext documentSequentialAnalysisContext = this.f66910b;
            Score score = this.f66913e;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> rectangleDocumentScorekeeper = this.f66914f;
            if (fpsCalculator == null) {
                throw new IllegalArgumentException("The fpsCalculator argument can't be null".toString());
            }
            if (objectConfigurationProvider == null) {
                throw new IllegalArgumentException("The objectConfigurationProvider argument can't be null".toString());
            }
            if (spatialObjectDetectorFactory == null) {
                throw new IllegalArgumentException("The spatialObjectDetectorFactory argument can't be null".toString());
            }
            if (score == null) {
                score = new Score(0, 10, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097149, null);
            }
            DocumentSequentialAnalysisContext universalSequentialAnalysisContext = documentSequentialAnalysisContext == null ? new UniversalSequentialAnalysisContext(score, null, false, null, null, null, 0.0d, false, 0, 0, 12, false, null, false, false, 0.0d, 100.0d, 25.0d, null, null, null, null, true, false, 0, 8, 1.5d, 1.5d, 0.0d, 0.0d, null, 0, null, 0, null, spatialObjectDetectorFactory, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0.0d, 0.0d, 0, -239272962, 1073741815, null) : documentSequentialAnalysisContext;
            if (rectangleDocumentScorekeeper == null) {
                rectangleDocumentScorekeeper = new RectangleDocumentScorekeeper();
            }
            if (rectangleSequentialAnalysisBuild == null) {
                rectangleSequentialAnalysisBuild = new RectangleSequentialAnalysis.Builder(null, null, 3, null).documentViewportProximity(new DocumentViewportProximity.Builder(0.0d, 0.0d, null, 7, null).tooFarScale(0.8d).build()).scorekeeper(rectangleDocumentScorekeeper).build();
            }
            return new SafeSequenceObjectDetector.Builder(null, null, 3, null).context(universalSequentialAnalysisContext).sequenceObjectDetector(new RectangleSequenceObjectDetector(rectangleSequentialAnalysisBuild, score, rectangleDocumentScorekeeper, universalSequentialAnalysisContext, fpsCalculator, objectConfigurationProvider, spatialObjectDetectorFactory, null)).build();
        }

        @NotNull
        public final Builder context(@NotNull DocumentSequentialAnalysisContext value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66910b = value;
            return this;
        }

        @NotNull
        public final Builder copy(@Nullable RectangleSequentialAnalysis analysis, @Nullable DocumentSequentialAnalysisContext context, @Nullable FpsCalculator fpsCalculator, @Nullable ObjectConfigurationProvider objectConfigurationProvider, @Nullable Score score, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> scorekeeper, @Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
            return new Builder(analysis, context, fpsCalculator, objectConfigurationProvider, score, scorekeeper, spatialObjectDetectorFactory);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.f66909a, builder.f66909a) && Intrinsics.areEqual(this.f66910b, builder.f66910b) && Intrinsics.areEqual(this.f66911c, builder.f66911c) && Intrinsics.areEqual(this.f66912d, builder.f66912d) && Intrinsics.areEqual(this.f66913e, builder.f66913e) && Intrinsics.areEqual(this.f66914f, builder.f66914f) && Intrinsics.areEqual(this.f66915g, builder.f66915g);
        }

        @NotNull
        public final Builder fpsCalculator(@NotNull FpsCalculator value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66911c = value;
            return this;
        }

        public int hashCode() {
            RectangleSequentialAnalysis rectangleSequentialAnalysis = this.f66909a;
            int iHashCode = (rectangleSequentialAnalysis == null ? 0 : rectangleSequentialAnalysis.hashCode()) * 31;
            DocumentSequentialAnalysisContext documentSequentialAnalysisContext = this.f66910b;
            int iHashCode2 = (iHashCode + (documentSequentialAnalysisContext == null ? 0 : documentSequentialAnalysisContext.hashCode())) * 31;
            FpsCalculator fpsCalculator = this.f66911c;
            int iHashCode3 = (iHashCode2 + (fpsCalculator == null ? 0 : fpsCalculator.hashCode())) * 31;
            ObjectConfigurationProvider objectConfigurationProvider = this.f66912d;
            int iHashCode4 = (iHashCode3 + (objectConfigurationProvider == null ? 0 : objectConfigurationProvider.hashCode())) * 31;
            Score score = this.f66913e;
            int iHashCode5 = (iHashCode4 + (score == null ? 0 : score.hashCode())) * 31;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper = this.f66914f;
            int iHashCode6 = (iHashCode5 + (abstractScorekeeper == null ? 0 : abstractScorekeeper.hashCode())) * 31;
            SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f66915g;
            return iHashCode6 + (spatialObjectDetectorFactory != null ? spatialObjectDetectorFactory.hashCode() : 0);
        }

        @NotNull
        public final Builder objectConfigurationProvider(@NotNull ObjectConfigurationProvider value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66912d = value;
            return this;
        }

        @NotNull
        public final Builder score(@NotNull Score value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66913e = value;
            return this;
        }

        @NotNull
        public final Builder scorekeeper(@NotNull AbstractScorekeeper<DocumentSequentialAnalysisContext> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66914f = value;
            return this;
        }

        @NotNull
        public final Builder spatialObjectDetectorFactory(@NotNull SpatialObjectDetectorFactory value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66915g = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(analysis=" + this.f66909a + ", context=" + this.f66910b + ", fpsCalculator=" + this.f66911c + ", objectConfigurationProvider=" + this.f66912d + ", score=" + this.f66913e + ", scorekeeper=" + this.f66914f + ", spatialObjectDetectorFactory=" + this.f66915g + ")";
        }

        public Builder(@Nullable RectangleSequentialAnalysis rectangleSequentialAnalysis, @Nullable DocumentSequentialAnalysisContext documentSequentialAnalysisContext, @Nullable FpsCalculator fpsCalculator, @Nullable ObjectConfigurationProvider objectConfigurationProvider, @Nullable Score score, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper, @Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
            this.f66909a = rectangleSequentialAnalysis;
            this.f66910b = documentSequentialAnalysisContext;
            this.f66911c = fpsCalculator;
            this.f66912d = objectConfigurationProvider;
            this.f66913e = score;
            this.f66914f = abstractScorekeeper;
            this.f66915g = spatialObjectDetectorFactory;
        }

        public /* synthetic */ Builder(RectangleSequentialAnalysis rectangleSequentialAnalysis, DocumentSequentialAnalysisContext documentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, Score score, AbstractScorekeeper abstractScorekeeper, SpatialObjectDetectorFactory spatialObjectDetectorFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : rectangleSequentialAnalysis, (i10 & 2) != 0 ? null : documentSequentialAnalysisContext, (i10 & 4) != 0 ? null : fpsCalculator, (i10 & 8) != 0 ? null : objectConfigurationProvider, (i10 & 16) != 0 ? null : score, (i10 & 32) != 0 ? null : abstractScorekeeper, (i10 & 64) != 0 ? null : spatialObjectDetectorFactory);
        }
    }

    public RectangleSequenceObjectDetector(RectangleSequentialAnalysis rectangleSequentialAnalysis, Score score, Scorekeeper scorekeeper, DocumentSequentialAnalysisContext documentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, SpatialObjectDetectorFactory spatialObjectDetectorFactory, DefaultConstructorMarker defaultConstructorMarker) {
        super(rectangleSequentialAnalysis, score, scorekeeper, fpsCalculator, spatialObjectDetectorFactory, documentSequentialAnalysisContext, objectConfigurationProvider);
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    @NotNull
    public SequentialDetectionResult request(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) getContext().accept(getInitializerVisitor().request(request)).accept(getPreLightBlobDetectionVisitor())).accept(getDetectorVisitor())).accept(getFpsVisitor()).accept(getWarmupVisitor())).accept(getAnalysisVisitor())).accept(getResultVisitor()).accept(getPostLightBlobDetectionVisitor());
        SequentialDetectionResult result = getContext().getResult();
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
