package com.veridas.detect.sequence.document;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.FinishDetectorException;
import com.veridas.detect.InitializeDetectorException;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.visitor.AnalysisVisitor;
import com.veridas.detect.sequence.context.visitor.FpsVisitor;
import com.veridas.detect.sequence.context.visitor.IterationInitializerVisitor;
import com.veridas.detect.sequence.context.visitor.SequentialResultVisitor;
import com.veridas.detect.sequence.context.visitor.WarmupVisitor;
import com.veridas.detect.sequence.document.analysis.DocumentSequentialAnalysis;
import com.veridas.detect.sequence.document.analysis.visitor.DocumentDetectorVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.PostLightBlobDetectionVisitor;
import com.veridas.detect.sequence.document.analysis.visitor.PreLightBlobDetectionVisitor;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.sequence.score.Scorekeeper;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractSequenceDocumentDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003BE\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010'\u001a\u00020\"\u0012\u0006\u0010,\u001a\u00028\u0000\u0012\u0006\u00102\u001a\u00020-¢\u0006\u0004\bh\u0010iJ\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010,\u001a\u00028\u00008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00107\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R)\u0010=\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010C\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010I\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010O\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010U\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010[\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010a\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010g\u001a\u00020b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f¨\u0006j"}, d2 = {"Lcom/veridas/detect/sequence/document/AbstractSequenceDocumentDetector;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "C", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "", "mustInitiateBrightnessDetection", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "createDetector", "finish", "initialize", "Lcom/veridas/detect/sequence/document/analysis/DocumentSequentialAnalysis;", "a", "Lcom/veridas/detect/sequence/document/analysis/DocumentSequentialAnalysis;", "getAnalysis", "()Lcom/veridas/detect/sequence/document/analysis/DocumentSequentialAnalysis;", "analysis", "Lcom/veridas/detect/sequence/score/Score;", "b", "Lcom/veridas/detect/sequence/score/Score;", "getScore", "()Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Scorekeeper;", "c", "Lcom/veridas/detect/sequence/score/Scorekeeper;", "getScorekeeper", "()Lcom/veridas/detect/sequence/score/Scorekeeper;", "scorekeeper", "Lcom/veridas/util/FpsCalculator;", "d", "Lcom/veridas/util/FpsCalculator;", "getFpsCalculator", "()Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "e", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "getSpatialObjectDetectorFactory", "()Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "f", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "getContext", "()Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "Lcom/veridas/detect/ObjectConfigurationProvider;", "g", "Lcom/veridas/detect/ObjectConfigurationProvider;", "getObjectConfigurationProvider", "()Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "h", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "getDetector", "()Lcom/veridas/detect/spatial/SpatialObjectDetector;", "detector", "Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "i", "Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "getAnalysisVisitor", "()Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "analysisVisitor", "Lcom/veridas/detect/sequence/document/analysis/visitor/DocumentDetectorVisitor;", "j", "Lcom/veridas/detect/sequence/document/analysis/visitor/DocumentDetectorVisitor;", "getDetectorVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/DocumentDetectorVisitor;", "detectorVisitor", "Lcom/veridas/detect/sequence/context/visitor/FpsVisitor;", "k", "Lcom/veridas/detect/sequence/context/visitor/FpsVisitor;", "getFpsVisitor", "()Lcom/veridas/detect/sequence/context/visitor/FpsVisitor;", "fpsVisitor", "Lcom/veridas/detect/sequence/context/visitor/IterationInitializerVisitor;", "l", "Lcom/veridas/detect/sequence/context/visitor/IterationInitializerVisitor;", "getInitializerVisitor", "()Lcom/veridas/detect/sequence/context/visitor/IterationInitializerVisitor;", "initializerVisitor", "Lcom/veridas/detect/sequence/document/analysis/visitor/PreLightBlobDetectionVisitor;", "m", "Lcom/veridas/detect/sequence/document/analysis/visitor/PreLightBlobDetectionVisitor;", "getPreLightBlobDetectionVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/PreLightBlobDetectionVisitor;", "preLightBlobDetectionVisitor", "Lcom/veridas/detect/sequence/document/analysis/visitor/PostLightBlobDetectionVisitor;", "n", "Lcom/veridas/detect/sequence/document/analysis/visitor/PostLightBlobDetectionVisitor;", "getPostLightBlobDetectionVisitor", "()Lcom/veridas/detect/sequence/document/analysis/visitor/PostLightBlobDetectionVisitor;", "postLightBlobDetectionVisitor", "Lcom/veridas/detect/sequence/context/visitor/SequentialResultVisitor;", "o", "Lcom/veridas/detect/sequence/context/visitor/SequentialResultVisitor;", "getResultVisitor", "()Lcom/veridas/detect/sequence/context/visitor/SequentialResultVisitor;", "resultVisitor", "Lcom/veridas/detect/sequence/context/visitor/WarmupVisitor;", "p", "Lcom/veridas/detect/sequence/context/visitor/WarmupVisitor;", "getWarmupVisitor", "()Lcom/veridas/detect/sequence/context/visitor/WarmupVisitor;", "warmupVisitor", "<init>", "(Lcom/veridas/detect/sequence/document/analysis/DocumentSequentialAnalysis;Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/score/Scorekeeper;Lcom/veridas/util/FpsCalculator;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;Lcom/veridas/detect/ObjectConfigurationProvider;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public abstract class AbstractSequenceDocumentDetector<C extends DocumentSequentialAnalysisContext> implements SequenceObjectDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentSequentialAnalysis<C> analysis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Score score;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Scorekeeper scorekeeper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FpsCalculator fpsCalculator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpatialObjectDetectorFactory spatialObjectDetectorFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final C context;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ObjectConfigurationProvider objectConfigurationProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpatialObjectDetector detector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnalysisVisitor<C, DocumentSequentialAnalysis<C>> analysisVisitor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentDetectorVisitor detectorVisitor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FpsVisitor fpsVisitor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IterationInitializerVisitor initializerVisitor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final PreLightBlobDetectionVisitor preLightBlobDetectionVisitor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PostLightBlobDetectionVisitor postLightBlobDetectionVisitor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequentialResultVisitor resultVisitor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WarmupVisitor warmupVisitor;

    public AbstractSequenceDocumentDetector(@NotNull DocumentSequentialAnalysis<C> analysis, @NotNull Score score, @NotNull Scorekeeper scorekeeper, @NotNull FpsCalculator fpsCalculator, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory, @NotNull C context, @NotNull ObjectConfigurationProvider objectConfigurationProvider) {
        Intrinsics.checkNotNullParameter(analysis, "analysis");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(scorekeeper, "scorekeeper");
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        this.analysis = analysis;
        this.score = score;
        this.scorekeeper = scorekeeper;
        this.fpsCalculator = fpsCalculator;
        this.spatialObjectDetectorFactory = spatialObjectDetectorFactory;
        this.context = context;
        this.objectConfigurationProvider = objectConfigurationProvider;
        this.analysisVisitor = new AnalysisVisitor<>(analysis);
        this.detectorVisitor = new DocumentDetectorVisitor();
        this.fpsVisitor = new FpsVisitor(fpsCalculator);
        this.initializerVisitor = new IterationInitializerVisitor();
        this.preLightBlobDetectionVisitor = new PreLightBlobDetectionVisitor();
        this.postLightBlobDetectionVisitor = new PostLightBlobDetectionVisitor();
        this.resultVisitor = new SequentialResultVisitor();
        this.warmupVisitor = new WarmupVisitor();
        SpatialObjectDetector spatialObjectDetectorCreateDetector = createDetector();
        this.detector = spatialObjectDetectorCreateDetector;
        context.setDetector(spatialObjectDetectorCreateDetector);
    }

    @NotNull
    public SpatialObjectDetector createDetector() {
        return this.spatialObjectDetectorFactory.createRectangleSpatialObjectDetector(null, null);
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    public boolean finish() throws FinishDetectorException {
        try {
            return this.detector.finish();
        } catch (Exception e5) {
            throw new FinishDetectorException(e5);
        }
    }

    @NotNull
    public final DocumentSequentialAnalysis<C> getAnalysis() {
        return this.analysis;
    }

    @NotNull
    public final AnalysisVisitor<C, DocumentSequentialAnalysis<C>> getAnalysisVisitor() {
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
    public final DocumentDetectorVisitor getDetectorVisitor() {
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
    public final ObjectConfigurationProvider getObjectConfigurationProvider() {
        return this.objectConfigurationProvider;
    }

    @NotNull
    public final PostLightBlobDetectionVisitor getPostLightBlobDetectionVisitor() {
        return this.postLightBlobDetectionVisitor;
    }

    @NotNull
    public final PreLightBlobDetectionVisitor getPreLightBlobDetectionVisitor() {
        return this.preLightBlobDetectionVisitor;
    }

    @NotNull
    public final SequentialResultVisitor getResultVisitor() {
        return this.resultVisitor;
    }

    @NotNull
    public final Score getScore() {
        return this.score;
    }

    @NotNull
    public final Scorekeeper getScorekeeper() {
        return this.scorekeeper;
    }

    @NotNull
    public final SpatialObjectDetectorFactory getSpatialObjectDetectorFactory() {
        return this.spatialObjectDetectorFactory;
    }

    @NotNull
    public final WarmupVisitor getWarmupVisitor() {
        return this.warmupVisitor;
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    public boolean initialize() throws InitializeDetectorException {
        try {
            return this.detector.initialize();
        } catch (Exception e5) {
            throw new InitializeDetectorException(e5);
        }
    }

    public final boolean mustInitiateBrightnessDetection() {
        C c10 = this.context;
        return c10.getLightBlobDetectionInterval() > 0 && c10.getLightBlobDetectionFrameCount() % c10.getLightBlobDetectionInterval() == 0;
    }
}
