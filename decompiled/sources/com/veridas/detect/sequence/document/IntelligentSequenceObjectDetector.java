package com.veridas.detect.sequence.document;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.DetectionMode;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SafeSequenceObjectDetector;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.UniversalSequentialAnalysisContext;
import com.veridas.detect.sequence.context.visitor.AnalysisVisitor;
import com.veridas.detect.sequence.document.analysis.IntelligentSequentialAnalysis;
import com.veridas.detect.sequence.document.analysis.RectangleSequentialAnalysis;
import com.veridas.detect.sequence.document.analysis.visitor.AdvanceDetectionModeVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.IntelligentAdvanceDocumentVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.ModifyScaleVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.SelectDetectionModeVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.UpdateScaleVisitor;
import com.veridas.detect.sequence.document.context.visitor.RectangleHelpVisitor;
import com.veridas.detect.sequence.document.context.visitor.StuckDetectionVisitor;
import com.veridas.detect.sequence.document.proximity.DocumentViewportProximity;
import com.veridas.detect.sequence.document.score.IntelligentDocumentScorekeeper;
import com.veridas.detect.sequence.document.score.RectangleDocumentScorekeeper;
import com.veridas.detect.sequence.score.AbstractScorekeeper;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.log.ILibraryLogger;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntelligentSequenceObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0003J\u0010\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/veridas/detect/sequence/document/IntelligentSequenceObjectDetector;", "Lcom/veridas/detect/sequence/document/AbstractComplexSequenceDocumentDetector;", "Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;", "", "isRectangleDetectorActive", "Lcom/veridas/detect/Request;", "request", "shouldCommenceRectangleHelp", "shouldCommenceStuckDetection", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "Lcom/veridas/log/ILibraryLogger;", "t", "Lcom/veridas/log/ILibraryLogger;", "getLogger", "()Lcom/veridas/log/ILibraryLogger;", "logger", "Lcom/veridas/detect/sequence/document/context/visitor/StuckDetectionVisitor;", "w", "Lcom/veridas/detect/sequence/document/context/visitor/StuckDetectionVisitor;", "getStuckDetectionVisitor", "()Lcom/veridas/detect/sequence/document/context/visitor/StuckDetectionVisitor;", "stuckDetectionVisitor", "Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/document/analysis/RectangleSequentialAnalysis;", "x", "Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "getRectangleAnalysisVisitor", "()Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "rectangleAnalysisVisitor", "Lcom/veridas/detect/sequence/document/analysis/visitor/ModifyScaleVisitor;", "y", "Lcom/veridas/detect/sequence/document/analysis/visitor/ModifyScaleVisitor;", "getModifyScaleVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/ModifyScaleVisitor;", "modifyScaleVisitor", "Lcom/veridas/detect/sequence/document/context/visitor/RectangleHelpVisitor;", "z", "Lcom/veridas/detect/sequence/document/context/visitor/RectangleHelpVisitor;", "getRectangleHelpVisitor", "()Lcom/veridas/detect/sequence/document/context/visitor/RectangleHelpVisitor;", "rectangleHelpVisitor", "Lcom/veridas/detect/sequence/document/analysis/visitor/UpdateScaleVisitor;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/veridas/detect/sequence/document/analysis/visitor/UpdateScaleVisitor;", "getUpdateScaleVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/UpdateScaleVisitor;", "updateScaleVisitor", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class IntelligentSequenceObjectDetector extends AbstractComplexSequenceDocumentDetector<IntelligentSequentialAnalysisContext> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final UpdateScaleVisitor updateScaleVisitor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ILibraryLogger logger;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final IntelligentAdvanceDocumentVisitor f66876u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final AdvanceDetectionModeVisitor f66877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StuckDetectionVisitor stuckDetectionVisitor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnalysisVisitor<DocumentSequentialAnalysisContext, RectangleSequentialAnalysis> rectangleAnalysisVisitor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ModifyScaleVisitor modifyScaleVisitor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RectangleHelpVisitor rectangleHelpVisitor;

    /* JADX INFO: compiled from: IntelligentSequenceObjectDetector.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\rJ\u0018\u0010\u0012\u001a\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0011J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0017J\u0081\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006#"}, d2 = {"Lcom/veridas/detect/sequence/document/IntelligentSequenceObjectDetector$Builder;", "", "Lcom/veridas/detect/sequence/document/analysis/IntelligentSequentialAnalysis;", "value", "analysis", "Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;", "context", "Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "Lcom/veridas/detect/sequence/document/analysis/RectangleSequentialAnalysis;", "rectangleAnalysis", "Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/document/score/DocumentScorekeeper;", "scorekeeper", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "Lcom/veridas/log/ILibraryLogger;", "logger", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Lcom/veridas/detect/sequence/document/analysis/IntelligentSequentialAnalysis;Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;Lcom/veridas/util/FpsCalculator;Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/detect/sequence/document/analysis/RectangleSequentialAnalysis;Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/score/AbstractScorekeeper;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;Lcom/veridas/log/ILibraryLogger;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public IntelligentSequentialAnalysis f66882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public IntelligentSequentialAnalysisContext f66883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public FpsCalculator f66884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ObjectConfigurationProvider f66885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public RectangleSequentialAnalysis f66886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Score f66887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public AbstractScorekeeper<DocumentSequentialAnalysisContext> f66888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public SpatialObjectDetectorFactory f66889h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public ILibraryLogger f66890i;

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        @NotNull
        public final Builder analysis(@NotNull IntelligentSequentialAnalysis value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66882a = value;
            return this;
        }

        @NotNull
        public final SequenceObjectDetector build() {
            RectangleSequentialAnalysis rectangleSequentialAnalysisBuild;
            FpsCalculator fpsCalculator = this.f66884c;
            ObjectConfigurationProvider objectConfigurationProvider = this.f66885d;
            SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f66889h;
            IntelligentSequentialAnalysis intelligentSequentialAnalysisBuild = this.f66882a;
            IntelligentSequentialAnalysisContext intelligentSequentialAnalysisContext = this.f66883b;
            RectangleSequentialAnalysis rectangleSequentialAnalysis = this.f66886e;
            Score score = this.f66887f;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper = this.f66888g;
            ILibraryLogger iLibraryLogger = this.f66890i;
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
                score = new Score(2, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, null);
            }
            IntelligentSequentialAnalysisContext universalSequentialAnalysisContext = intelligentSequentialAnalysisContext == null ? new UniversalSequentialAnalysisContext(score, null, false, null, null, null, 0.0d, false, 0, 0, 12, false, null, false, false, 0.0d, 100.0d, 25.0d, null, null, null, null, true, false, 0, 8, 1.5d, 1.5d, 0.0d, 0.0d, null, 0, null, 0, null, spatialObjectDetectorFactory, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1, 2, 0.1d, 1.1d, 1.1d, 1.07d, 0.01d, 20, 0, 0, 0.0d, 0.0d, 0, -239272962, 1040318455, null) : intelligentSequentialAnalysisContext;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> intelligentDocumentScorekeeper = abstractScorekeeper == 0 ? new IntelligentDocumentScorekeeper() : abstractScorekeeper;
            if (intelligentSequentialAnalysisBuild == null) {
                intelligentSequentialAnalysisBuild = new IntelligentSequentialAnalysis.Builder(null, null, 3, null).documentViewportProximity(new DocumentViewportProximity.Builder(0.0d, 0.0d, null, 7, null).build()).scorekeeper(intelligentDocumentScorekeeper).build();
            }
            IntelligentSequentialAnalysis intelligentSequentialAnalysis = intelligentSequentialAnalysisBuild;
            if (rectangleSequentialAnalysis == null) {
                rectangleSequentialAnalysisBuild = new RectangleSequentialAnalysis.Builder(null, null, 3, null).documentViewportProximity(new DocumentViewportProximity.Builder(0.0d, 0.0d, null, 7, null).build()).scorekeeper(new RectangleDocumentScorekeeper()).build();
            } else {
                rectangleSequentialAnalysisBuild = rectangleSequentialAnalysis;
            }
            return new SafeSequenceObjectDetector.Builder(null, null, 3, null).context(universalSequentialAnalysisContext).sequenceObjectDetector(new IntelligentSequenceObjectDetector(intelligentSequentialAnalysis, score, intelligentDocumentScorekeeper, universalSequentialAnalysisContext, fpsCalculator, objectConfigurationProvider, spatialObjectDetectorFactory, iLibraryLogger, rectangleSequentialAnalysisBuild)).build();
        }

        @NotNull
        public final Builder context(@NotNull IntelligentSequentialAnalysisContext value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66883b = value;
            return this;
        }

        @NotNull
        public final Builder copy(@Nullable IntelligentSequentialAnalysis analysis, @Nullable IntelligentSequentialAnalysisContext context, @Nullable FpsCalculator fpsCalculator, @Nullable ObjectConfigurationProvider objectConfigurationProvider, @Nullable RectangleSequentialAnalysis rectangleAnalysis, @Nullable Score score, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> scorekeeper, @Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory, @Nullable ILibraryLogger logger) {
            return new Builder(analysis, context, fpsCalculator, objectConfigurationProvider, rectangleAnalysis, score, scorekeeper, spatialObjectDetectorFactory, logger);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.f66882a, builder.f66882a) && Intrinsics.areEqual(this.f66883b, builder.f66883b) && Intrinsics.areEqual(this.f66884c, builder.f66884c) && Intrinsics.areEqual(this.f66885d, builder.f66885d) && Intrinsics.areEqual(this.f66886e, builder.f66886e) && Intrinsics.areEqual(this.f66887f, builder.f66887f) && Intrinsics.areEqual(this.f66888g, builder.f66888g) && Intrinsics.areEqual(this.f66889h, builder.f66889h) && Intrinsics.areEqual(this.f66890i, builder.f66890i);
        }

        @NotNull
        public final Builder fpsCalculator(@NotNull FpsCalculator value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66884c = value;
            return this;
        }

        public int hashCode() {
            IntelligentSequentialAnalysis intelligentSequentialAnalysis = this.f66882a;
            int iHashCode = (intelligentSequentialAnalysis == null ? 0 : intelligentSequentialAnalysis.hashCode()) * 31;
            IntelligentSequentialAnalysisContext intelligentSequentialAnalysisContext = this.f66883b;
            int iHashCode2 = (iHashCode + (intelligentSequentialAnalysisContext == null ? 0 : intelligentSequentialAnalysisContext.hashCode())) * 31;
            FpsCalculator fpsCalculator = this.f66884c;
            int iHashCode3 = (iHashCode2 + (fpsCalculator == null ? 0 : fpsCalculator.hashCode())) * 31;
            ObjectConfigurationProvider objectConfigurationProvider = this.f66885d;
            int iHashCode4 = (iHashCode3 + (objectConfigurationProvider == null ? 0 : objectConfigurationProvider.hashCode())) * 31;
            RectangleSequentialAnalysis rectangleSequentialAnalysis = this.f66886e;
            int iHashCode5 = (iHashCode4 + (rectangleSequentialAnalysis == null ? 0 : rectangleSequentialAnalysis.hashCode())) * 31;
            Score score = this.f66887f;
            int iHashCode6 = (iHashCode5 + (score == null ? 0 : score.hashCode())) * 31;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper = this.f66888g;
            int iHashCode7 = (iHashCode6 + (abstractScorekeeper == null ? 0 : abstractScorekeeper.hashCode())) * 31;
            SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f66889h;
            int iHashCode8 = (iHashCode7 + (spatialObjectDetectorFactory == null ? 0 : spatialObjectDetectorFactory.hashCode())) * 31;
            ILibraryLogger iLibraryLogger = this.f66890i;
            return iHashCode8 + (iLibraryLogger != null ? iLibraryLogger.hashCode() : 0);
        }

        @NotNull
        public final Builder logger(@NotNull ILibraryLogger value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66890i = value;
            return this;
        }

        @NotNull
        public final Builder objectConfigurationProvider(@NotNull ObjectConfigurationProvider value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66885d = value;
            return this;
        }

        @NotNull
        public final Builder rectangleAnalysis(@NotNull RectangleSequentialAnalysis value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66886e = value;
            return this;
        }

        @NotNull
        public final Builder score(@NotNull Score value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66887f = value;
            return this;
        }

        @NotNull
        public final Builder scorekeeper(@NotNull AbstractScorekeeper<DocumentSequentialAnalysisContext> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66888g = value;
            return this;
        }

        @NotNull
        public final Builder spatialObjectDetectorFactory(@NotNull SpatialObjectDetectorFactory value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66889h = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(analysis=" + this.f66882a + ", context=" + this.f66883b + ", fpsCalculator=" + this.f66884c + ", objectConfigurationProvider=" + this.f66885d + ", rectangleAnalysis=" + this.f66886e + ", score=" + this.f66887f + ", scorekeeper=" + this.f66888g + ", spatialObjectDetectorFactory=" + this.f66889h + ", logger=" + this.f66890i + ")";
        }

        public Builder(@Nullable IntelligentSequentialAnalysis intelligentSequentialAnalysis, @Nullable IntelligentSequentialAnalysisContext intelligentSequentialAnalysisContext, @Nullable FpsCalculator fpsCalculator, @Nullable ObjectConfigurationProvider objectConfigurationProvider, @Nullable RectangleSequentialAnalysis rectangleSequentialAnalysis, @Nullable Score score, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper, @Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory, @Nullable ILibraryLogger iLibraryLogger) {
            this.f66882a = intelligentSequentialAnalysis;
            this.f66883b = intelligentSequentialAnalysisContext;
            this.f66884c = fpsCalculator;
            this.f66885d = objectConfigurationProvider;
            this.f66886e = rectangleSequentialAnalysis;
            this.f66887f = score;
            this.f66888g = abstractScorekeeper;
            this.f66889h = spatialObjectDetectorFactory;
            this.f66890i = iLibraryLogger;
        }

        public /* synthetic */ Builder(IntelligentSequentialAnalysis intelligentSequentialAnalysis, IntelligentSequentialAnalysisContext intelligentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, RectangleSequentialAnalysis rectangleSequentialAnalysis, Score score, AbstractScorekeeper abstractScorekeeper, SpatialObjectDetectorFactory spatialObjectDetectorFactory, ILibraryLogger iLibraryLogger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : intelligentSequentialAnalysis, (i10 & 2) != 0 ? null : intelligentSequentialAnalysisContext, (i10 & 4) != 0 ? null : fpsCalculator, (i10 & 8) != 0 ? null : objectConfigurationProvider, (i10 & 16) != 0 ? null : rectangleSequentialAnalysis, (i10 & 32) != 0 ? null : score, (i10 & 64) != 0 ? null : abstractScorekeeper, (i10 & 128) != 0 ? null : spatialObjectDetectorFactory, (i10 & 256) == 0 ? iLibraryLogger : null);
        }
    }

    public IntelligentSequenceObjectDetector() {
        throw null;
    }

    public IntelligentSequenceObjectDetector(IntelligentSequentialAnalysis intelligentSequentialAnalysis, Score score, AbstractScorekeeper abstractScorekeeper, IntelligentSequentialAnalysisContext intelligentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, SpatialObjectDetectorFactory spatialObjectDetectorFactory, ILibraryLogger iLibraryLogger, RectangleSequentialAnalysis rectangleSequentialAnalysis) {
        IntelligentAdvanceDocumentVisitor intelligentAdvanceDocumentVisitor = new IntelligentAdvanceDocumentVisitor();
        AdvanceDetectionModeVisitor advanceDetectionModeVisitor = new AdvanceDetectionModeVisitor(false);
        StuckDetectionVisitor stuckDetectionVisitor = new StuckDetectionVisitor(null, 1, null);
        AnalysisVisitor<DocumentSequentialAnalysisContext, RectangleSequentialAnalysis> analysisVisitor = new AnalysisVisitor<>(rectangleSequentialAnalysis);
        ModifyScaleVisitor modifyScaleVisitor = new ModifyScaleVisitor();
        RectangleHelpVisitor rectangleHelpVisitorBuild = new RectangleHelpVisitor.Builder(null, null, 3, null).scorekeeper(abstractScorekeeper).logger(iLibraryLogger).build();
        UpdateScaleVisitor updateScaleVisitor = new UpdateScaleVisitor();
        super(intelligentSequentialAnalysis, score, abstractScorekeeper, intelligentSequentialAnalysisContext, fpsCalculator, spatialObjectDetectorFactory, objectConfigurationProvider, null, new SelectDetectionModeVisitor(false), null, 640, null);
        this.logger = iLibraryLogger;
        this.f66876u = intelligentAdvanceDocumentVisitor;
        this.f66877v = advanceDetectionModeVisitor;
        this.stuckDetectionVisitor = stuckDetectionVisitor;
        this.rectangleAnalysisVisitor = analysisVisitor;
        this.modifyScaleVisitor = modifyScaleVisitor;
        this.rectangleHelpVisitor = rectangleHelpVisitorBuild;
        this.updateScaleVisitor = updateScaleVisitor;
    }

    @NotNull
    public final ILibraryLogger getLogger() {
        return this.logger;
    }

    @NotNull
    public final ModifyScaleVisitor getModifyScaleVisitor() {
        return this.modifyScaleVisitor;
    }

    @NotNull
    public final AnalysisVisitor<DocumentSequentialAnalysisContext, RectangleSequentialAnalysis> getRectangleAnalysisVisitor() {
        return this.rectangleAnalysisVisitor;
    }

    @NotNull
    public final RectangleHelpVisitor getRectangleHelpVisitor() {
        return this.rectangleHelpVisitor;
    }

    @NotNull
    public final StuckDetectionVisitor getStuckDetectionVisitor() {
        return this.stuckDetectionVisitor;
    }

    @NotNull
    public final UpdateScaleVisitor getUpdateScaleVisitor() {
        return this.updateScaleVisitor;
    }

    public final boolean isRectangleDetectorActive() {
        return ((IntelligentSequentialAnalysisContext) getContext()).getDetectionMode() == DetectionMode.RECTANGLE;
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    @NotNull
    public SequentialDetectionResult request(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ((IntelligentSequentialAnalysisContext) getContext()).accept(getInitializerVisitor().request(request)).accept(getDocumentConfigurationSelectionVisitor());
        boolean zIsRectangleDetectorActive = isRectangleDetectorActive();
        if (!zIsRectangleDetectorActive) {
            ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((IntelligentSequentialAnalysisContext) getContext()).accept(getSelectDetectionModeVisitor())).accept(getSelectDetectorVisitor())).accept(this.modifyScaleVisitor);
        }
        this.logger.log("DETECTION_MODE", ((IntelligentSequentialAnalysisContext) getContext()).getDetectionMode().toString());
        ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((IntelligentSequentialAnalysisContext) getContext()).accept(getPreLightBlobDetectionVisitor())).accept(getDetectorVisitor())).accept(getFpsVisitor()).accept(getWarmupVisitor());
        if (((IntelligentSequentialAnalysisContext) getContext()).isWarmupEndReached()) {
            if (zIsRectangleDetectorActive) {
                ((IntelligentSequentialAnalysisContext) getContext()).accept(this.rectangleAnalysisVisitor);
            } else {
                if (shouldCommenceStuckDetection()) {
                    ((IntelligentSequentialAnalysisContext) getContext()).accept(this.stuckDetectionVisitor);
                }
                if (shouldCommenceRectangleHelp(request)) {
                    ((IntelligentSequentialAnalysisContext) getContext()).accept(this.rectangleHelpVisitor);
                } else {
                    ((IntelligentSequentialAnalysisContext) ((IntelligentSequentialAnalysisContext) ((IntelligentSequentialAnalysisContext) ((IntelligentSequentialAnalysisContext) getContext()).accept(this.updateScaleVisitor)).accept(getAnalysisVisitor())).accept(this.f66876u)).accept(this.f66877v);
                }
            }
        }
        ((IntelligentSequentialAnalysisContext) getContext()).accept(getResultVisitor()).accept(getPostLightBlobDetectionVisitor());
        SequentialDetectionResult result = ((IntelligentSequentialAnalysisContext) getContext()).getResult();
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final boolean shouldCommenceRectangleHelp(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.getRectangleHelp() && ((IntelligentSequentialAnalysisContext) getContext()).getCycle() >= ((IntelligentSequentialAnalysisContext) getContext()).getRectangleDetectionCycleCount();
    }

    public final boolean shouldCommenceStuckDetection() {
        return getCom.google.firebase.analytics.FirebaseAnalytics.Param.SCORE java.lang.String().getNotCentered() >= ((IntelligentSequentialAnalysisContext) getContext()).getStuckHitLimit() && getCom.google.firebase.analytics.FirebaseAnalytics.Param.SCORE java.lang.String().getCentered() == 0;
    }
}
