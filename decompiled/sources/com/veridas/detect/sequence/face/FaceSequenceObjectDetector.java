package com.veridas.detect.sequence.face;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SafeSequenceObjectDetector;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialAnalysis;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContext;
import com.veridas.detect.sequence.context.UniversalSequentialAnalysisContext;
import com.veridas.detect.sequence.context.visitor.AnalysisVisitor;
import com.veridas.detect.sequence.context.visitor.DetectorVisitor;
import com.veridas.detect.sequence.context.visitor.FpsVisitor;
import com.veridas.detect.sequence.context.visitor.IterationInitializerVisitor;
import com.veridas.detect.sequence.context.visitor.SequentialResultVisitor;
import com.veridas.detect.sequence.context.visitor.WarmupVisitor;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.sequence.score.Scorekeeper;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FaceSequenceObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001GB-\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\u0014\u001a\u00028\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\bE\u0010FJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR)\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/veridas/detect/sequence/face/FaceSequenceObjectDetector;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "C", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "", "finish", "initialize", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "Lcom/veridas/detect/sequence/SequentialAnalysis;", "a", "Lcom/veridas/detect/sequence/SequentialAnalysis;", "getAnalysis", "()Lcom/veridas/detect/sequence/SequentialAnalysis;", "analysis", "b", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "getContext", "()Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "context", "Lcom/veridas/util/FpsCalculator;", "c", "Lcom/veridas/util/FpsCalculator;", "getFpsCalculator", "()Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "d", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "getDetector", "()Lcom/veridas/detect/spatial/SpatialObjectDetector;", "detector", "Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "e", "Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "getAnalysisVisitor", "()Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "analysisVisitor", "Lcom/veridas/detect/sequence/context/visitor/DetectorVisitor;", "f", "Lcom/veridas/detect/sequence/context/visitor/DetectorVisitor;", "getDetectorVisitor", "()Lcom/veridas/detect/sequence/context/visitor/DetectorVisitor;", "detectorVisitor", "Lcom/veridas/detect/sequence/context/visitor/FpsVisitor;", "g", "Lcom/veridas/detect/sequence/context/visitor/FpsVisitor;", "getFpsVisitor", "()Lcom/veridas/detect/sequence/context/visitor/FpsVisitor;", "fpsVisitor", "Lcom/veridas/detect/sequence/context/visitor/IterationInitializerVisitor;", "h", "Lcom/veridas/detect/sequence/context/visitor/IterationInitializerVisitor;", "getInitializerVisitor", "()Lcom/veridas/detect/sequence/context/visitor/IterationInitializerVisitor;", "initializerVisitor", "Lcom/veridas/detect/sequence/context/visitor/SequentialResultVisitor;", "i", "Lcom/veridas/detect/sequence/context/visitor/SequentialResultVisitor;", "getResultVisitor", "()Lcom/veridas/detect/sequence/context/visitor/SequentialResultVisitor;", "resultVisitor", "Lcom/veridas/detect/sequence/context/visitor/WarmupVisitor;", "j", "Lcom/veridas/detect/sequence/context/visitor/WarmupVisitor;", "getWarmupVisitor", "()Lcom/veridas/detect/sequence/context/visitor/WarmupVisitor;", "warmupVisitor", "<init>", "(Lcom/veridas/detect/sequence/SequentialAnalysis;Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;Lcom/veridas/util/FpsCalculator;Lcom/veridas/detect/spatial/SpatialObjectDetector;)V", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class FaceSequenceObjectDetector<C extends SequentialAnalysisContext> implements SequenceObjectDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequentialAnalysis<C> analysis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final C context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FpsCalculator fpsCalculator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpatialObjectDetector detector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnalysisVisitor<C, SequentialAnalysis<C>> analysisVisitor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DetectorVisitor detectorVisitor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FpsVisitor fpsVisitor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IterationInitializerVisitor initializerVisitor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequentialResultVisitor resultVisitor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WarmupVisitor warmupVisitor;

    /* JADX INFO: compiled from: FaceSequenceObjectDetector.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003BU\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\tJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u000bJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\rJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011Jd\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÖ\u0003¨\u0006\u001e"}, d2 = {"Lcom/veridas/detect/sequence/face/FaceSequenceObjectDetector$Builder;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "C", "", "Lcom/veridas/detect/sequence/SequentialAnalysis;", "value", "analysis", "context", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;)Lcom/veridas/detect/sequence/face/FaceSequenceObjectDetector$Builder;", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "detector", "Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Scorekeeper;", "scorekeeper", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "(Lcom/veridas/detect/sequence/SequentialAnalysis;Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;Lcom/veridas/detect/spatial/SpatialObjectDetector;Lcom/veridas/util/FpsCalculator;Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/score/Scorekeeper;)Lcom/veridas/detect/sequence/face/FaceSequenceObjectDetector$Builder;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Lcom/veridas/detect/sequence/SequentialAnalysis;Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;Lcom/veridas/detect/spatial/SpatialObjectDetector;Lcom/veridas/util/FpsCalculator;Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/score/Scorekeeper;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder<C extends SequentialAnalysisContext> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public SequentialAnalysis<C> f66971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public C f66972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public SpatialObjectDetector f66973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public FpsCalculator f66974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Score f66975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Scorekeeper f66976f;

        public Builder() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder copy$default(Builder builder, SequentialAnalysis sequentialAnalysis, SequentialAnalysisContext sequentialAnalysisContext, SpatialObjectDetector spatialObjectDetector, FpsCalculator fpsCalculator, Score score, Scorekeeper scorekeeper, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sequentialAnalysis = builder.f66971a;
            }
            if ((i10 & 2) != 0) {
                sequentialAnalysisContext = builder.f66972b;
            }
            SequentialAnalysisContext sequentialAnalysisContext2 = sequentialAnalysisContext;
            if ((i10 & 4) != 0) {
                spatialObjectDetector = builder.f66973c;
            }
            SpatialObjectDetector spatialObjectDetector2 = spatialObjectDetector;
            if ((i10 & 8) != 0) {
                fpsCalculator = builder.f66974d;
            }
            FpsCalculator fpsCalculator2 = fpsCalculator;
            if ((i10 & 16) != 0) {
                score = builder.f66975e;
            }
            Score score2 = score;
            if ((i10 & 32) != 0) {
                scorekeeper = builder.f66976f;
            }
            return builder.copy(sequentialAnalysis, sequentialAnalysisContext2, spatialObjectDetector2, fpsCalculator2, score2, scorekeeper);
        }

        @NotNull
        public final Builder<C> analysis(@NotNull SequentialAnalysis<C> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66971a = value;
            return this;
        }

        @NotNull
        public final SequenceObjectDetector build() {
            SequentialAnalysis<C> sequentialAnalysis = this.f66971a;
            SpatialObjectDetector spatialObjectDetector = this.f66973c;
            FpsCalculator fpsCalculator = this.f66974d;
            Scorekeeper scorekeeper = this.f66976f;
            SequentialAnalysisContext universalSequentialAnalysisContext = this.f66972b;
            Score score = this.f66975e;
            if (sequentialAnalysis == null) {
                throw new IllegalArgumentException("The analysis argument can't be null".toString());
            }
            if (fpsCalculator == null) {
                throw new IllegalArgumentException("The fpsCalculator argument can't be null".toString());
            }
            if (scorekeeper == null) {
                throw new IllegalArgumentException("The scorekeeper argument can't be null".toString());
            }
            if (spatialObjectDetector == null) {
                throw new IllegalArgumentException("The objectDetector argument can't be null".toString());
            }
            if (score == null) {
                score = new Score(0, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097151, null);
            }
            Score score2 = score;
            if (universalSequentialAnalysisContext == null) {
                universalSequentialAnalysisContext = new UniversalSequentialAnalysisContext(score2, null, false, null, null, null, 0.0d, false, 0, 0, 0, false, null, false, false, 0.0d, 0.0d, 0.0d, null, null, null, null, false, false, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0.0d, 0.0d, 0, -2, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
            }
            return new SafeSequenceObjectDetector.Builder(null, null, 3, null).context(universalSequentialAnalysisContext).sequenceObjectDetector(new FaceSequenceObjectDetector(sequentialAnalysis, universalSequentialAnalysisContext, fpsCalculator, spatialObjectDetector)).build();
        }

        @NotNull
        public final Builder<C> context(@NotNull C value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66972b = value;
            return this;
        }

        @NotNull
        public final Builder<C> copy(@Nullable SequentialAnalysis<C> analysis, @Nullable C context, @Nullable SpatialObjectDetector detector, @Nullable FpsCalculator fpsCalculator, @Nullable Score score, @Nullable Scorekeeper scorekeeper) {
            return new Builder<>(analysis, context, detector, fpsCalculator, score, scorekeeper);
        }

        @NotNull
        public final Builder<C> detector(@NotNull SpatialObjectDetector value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66973c = value;
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
            return Intrinsics.areEqual(this.f66971a, builder.f66971a) && Intrinsics.areEqual(this.f66972b, builder.f66972b) && Intrinsics.areEqual(this.f66973c, builder.f66973c) && Intrinsics.areEqual(this.f66974d, builder.f66974d) && Intrinsics.areEqual(this.f66975e, builder.f66975e) && Intrinsics.areEqual(this.f66976f, builder.f66976f);
        }

        @NotNull
        public final Builder<C> fpsCalculator(@NotNull FpsCalculator value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66974d = value;
            return this;
        }

        public int hashCode() {
            SequentialAnalysis<C> sequentialAnalysis = this.f66971a;
            int iHashCode = (sequentialAnalysis == null ? 0 : sequentialAnalysis.hashCode()) * 31;
            C c10 = this.f66972b;
            int iHashCode2 = (iHashCode + (c10 == null ? 0 : c10.hashCode())) * 31;
            SpatialObjectDetector spatialObjectDetector = this.f66973c;
            int iHashCode3 = (iHashCode2 + (spatialObjectDetector == null ? 0 : spatialObjectDetector.hashCode())) * 31;
            FpsCalculator fpsCalculator = this.f66974d;
            int iHashCode4 = (iHashCode3 + (fpsCalculator == null ? 0 : fpsCalculator.hashCode())) * 31;
            Score score = this.f66975e;
            int iHashCode5 = (iHashCode4 + (score == null ? 0 : score.hashCode())) * 31;
            Scorekeeper scorekeeper = this.f66976f;
            return iHashCode5 + (scorekeeper != null ? scorekeeper.hashCode() : 0);
        }

        @NotNull
        public final Builder<C> score(@NotNull Score value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66975e = value;
            return this;
        }

        @NotNull
        public final Builder<C> scorekeeper(@NotNull Scorekeeper value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66976f = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(analysis=" + this.f66971a + ", context=" + this.f66972b + ", detector=" + this.f66973c + ", fpsCalculator=" + this.f66974d + ", score=" + this.f66975e + ", scorekeeper=" + this.f66976f + ")";
        }

        public Builder(@Nullable SequentialAnalysis<C> sequentialAnalysis, @Nullable C c10, @Nullable SpatialObjectDetector spatialObjectDetector, @Nullable FpsCalculator fpsCalculator, @Nullable Score score, @Nullable Scorekeeper scorekeeper) {
            this.f66971a = sequentialAnalysis;
            this.f66972b = c10;
            this.f66973c = spatialObjectDetector;
            this.f66974d = fpsCalculator;
            this.f66975e = score;
            this.f66976f = scorekeeper;
        }

        public /* synthetic */ Builder(SequentialAnalysis sequentialAnalysis, SequentialAnalysisContext sequentialAnalysisContext, SpatialObjectDetector spatialObjectDetector, FpsCalculator fpsCalculator, Score score, Scorekeeper scorekeeper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : sequentialAnalysis, (i10 & 2) != 0 ? null : sequentialAnalysisContext, (i10 & 4) != 0 ? null : spatialObjectDetector, (i10 & 8) != 0 ? null : fpsCalculator, (i10 & 16) != 0 ? null : score, (i10 & 32) != 0 ? null : scorekeeper);
        }
    }

    public FaceSequenceObjectDetector(@NotNull SequentialAnalysis<C> analysis, @NotNull C context, @NotNull FpsCalculator fpsCalculator, @NotNull SpatialObjectDetector detector) {
        Intrinsics.checkNotNullParameter(analysis, "analysis");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.analysis = analysis;
        this.context = context;
        this.fpsCalculator = fpsCalculator;
        this.detector = detector;
        this.analysisVisitor = new AnalysisVisitor<>(analysis);
        this.detectorVisitor = new DetectorVisitor();
        this.fpsVisitor = new FpsVisitor(fpsCalculator);
        this.initializerVisitor = new IterationInitializerVisitor();
        this.resultVisitor = new SequentialResultVisitor();
        this.warmupVisitor = new WarmupVisitor();
        context.setDetector(detector);
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    public boolean finish() {
        return this.detector.finish();
    }

    @NotNull
    public final SequentialAnalysis<C> getAnalysis() {
        return this.analysis;
    }

    @NotNull
    public final AnalysisVisitor<C, SequentialAnalysis<C>> getAnalysisVisitor() {
        return this.analysisVisitor;
    }

    @NotNull
    public final C getContext() {
        return this.context;
    }

    @NotNull
    public final SpatialObjectDetector getDetector() {
        return this.detector;
    }

    @NotNull
    public final DetectorVisitor getDetectorVisitor() {
        return this.detectorVisitor;
    }

    @NotNull
    public final FpsCalculator getFpsCalculator() {
        return this.fpsCalculator;
    }

    @NotNull
    public final FpsVisitor getFpsVisitor() {
        return this.fpsVisitor;
    }

    @NotNull
    public final IterationInitializerVisitor getInitializerVisitor() {
        return this.initializerVisitor;
    }

    @NotNull
    public final SequentialResultVisitor getResultVisitor() {
        return this.resultVisitor;
    }

    @NotNull
    public final WarmupVisitor getWarmupVisitor() {
        return this.warmupVisitor;
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    public boolean initialize() {
        return this.detector.initialize();
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    @NotNull
    public SequentialDetectionResult request(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        IterationInitializerVisitor iterationInitializerVisitorRequest = this.initializerVisitor.request(request);
        C c10 = this.context;
        ((DocumentSequentialAnalysisContext) c10.accept(iterationInitializerVisitorRequest).accept(this.detectorVisitor).accept(this.fpsVisitor).accept(this.warmupVisitor)).accept(this.analysisVisitor).accept(this.resultVisitor);
        SequentialDetectionResult result = c10.getResult();
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
