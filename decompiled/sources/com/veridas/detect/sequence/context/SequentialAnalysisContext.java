package com.veridas.detect.sequence.context;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.storage.db.i;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.math.geometry.Rectangle;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SequentialAnalysisContext.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010r\u001a\u0002Hs\"\b\b\u0000\u0010s*\u00020\u00002\f\u0010t\u001a\b\u0012\u0004\u0012\u0002Hs0uH&¢\u0006\u0002\u0010vJ\b\u0010w\u001a\u00020\tH&J\b\u0010x\u001a\u00020\tH&J\b\u0010y\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u00020!X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\rR\u0018\u0010)\u001a\u00020*X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u0010/\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR\u0018\u00102\u001a\u00020*X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u0018\u00105\u001a\u00020*X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u0018\u00108\u001a\u000209X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010>\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b?\u0010\u000b\"\u0004\b@\u0010\rR\u0018\u0010A\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\rR\u0018\u0010D\u001a\u00020!X¦\u000e¢\u0006\f\u001a\u0004\bE\u0010#\"\u0004\bF\u0010%R\u0018\u0010G\u001a\u00020!X¦\u000e¢\u0006\f\u001a\u0004\bH\u0010#\"\u0004\bI\u0010%R\u0018\u0010J\u001a\u00020!X¦\u000e¢\u0006\f\u001a\u0004\bK\u0010#\"\u0004\bL\u0010%R\u0018\u0010M\u001a\u00020NX¦\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u0004\u0018\u00010TX¦\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u0004\u0018\u00010ZX¦\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0012\u0010_\u001a\u00020`X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0018\u0010c\u001a\u00020NX¦\u000e¢\u0006\f\u001a\u0004\bd\u0010P\"\u0004\be\u0010RR\u0018\u0010f\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\bg\u0010\u000b\"\u0004\bh\u0010\rR\u0018\u0010i\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\bj\u0010\u000b\"\u0004\bk\u0010\rR\u0018\u0010l\u001a\u00020*X¦\u000e¢\u0006\f\u001a\u0004\bm\u0010,\"\u0004\bn\u0010.R\u0018\u0010o\u001a\u00020*X¦\u000e¢\u0006\f\u001a\u0004\bp\u0010,\"\u0004\bq\u0010.¨\u0006z"}, d2 = {"Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "", "analysisType", "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;", "getAnalysisType", "()Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;", "setAnalysisType", "(Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;)V", "analyze", "", "getAnalyze", "()Z", "setAnalyze", "(Z)V", "bestDetectionResult", "Lcom/veridas/math/geometry/Rectangle;", "getBestDetectionResult", "()Lcom/veridas/math/geometry/Rectangle;", "setBestDetectionResult", "(Lcom/veridas/math/geometry/Rectangle;)V", "detectionResult", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "getDetectionResult", "()Lcom/veridas/detect/spatial/SpatialDetectionResult;", "setDetectionResult", "(Lcom/veridas/detect/spatial/SpatialDetectionResult;)V", "detector", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "getDetector", "()Lcom/veridas/detect/spatial/SpatialObjectDetector;", "setDetector", "(Lcom/veridas/detect/spatial/SpatialObjectDetector;)V", "fps", "", "getFps", "()D", "setFps", "(D)V", "initialized", "getInitialized", "setInitialized", "iteration", "", "getIteration", "()I", "setIteration", "(I)V", "lightBlobDetected", "getLightBlobDetected", "setLightBlobDetected", "lightBlobDetectionFrameCount", "getLightBlobDetectionFrameCount", "setLightBlobDetectionFrameCount", "lightBlobDetectionInterval", "getLightBlobDetectionInterval", "setLightBlobDetectionInterval", "objectData", "", "getObjectData", "()Ljava/lang/String;", "setObjectData", "(Ljava/lang/String;)V", "objectDetected", "getObjectDetected", "setObjectDetected", "objectLost", "getObjectLost", "setObjectLost", "progress", "getProgress", "setProgress", "progressMax", "getProgressMax", "setProgressMax", "progressThreshold", "getProgressThreshold", "setProgressThreshold", i.a.f65026x, "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "getProximity", "()Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "setProximity", "(Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;)V", "request", "Lcom/veridas/detect/Request;", "getRequest", "()Lcom/veridas/detect/Request;", "setRequest", "(Lcom/veridas/detect/Request;)V", "result", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "getResult", "()Lcom/veridas/detect/sequence/SequentialDetectionResult;", "setResult", "(Lcom/veridas/detect/sequence/SequentialDetectionResult;)V", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Score;", "getScore", "()Lcom/veridas/detect/sequence/score/Score;", "viewportProximity", "getViewportProximity", "setViewportProximity", "warmup", "getWarmup", "setWarmup", "warmupComplete", "getWarmupComplete", "setWarmupComplete", "warmupFrameCount", "getWarmupFrameCount", "setWarmupFrameCount", "warmupMaxFrameCount", "getWarmupMaxFrameCount", "setWarmupMaxFrameCount", "accept", "C", "visitor", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;)Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "hasHit", "isWarmupActive", "isWarmupEndReached", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SequentialAnalysisContext {
    @NotNull
    <C extends SequentialAnalysisContext> C accept(@NotNull SequentialAnalysisContextVisitor<C> visitor);

    @NotNull
    VDConstantDefinition.AnalysisType getAnalysisType();

    boolean getAnalyze();

    @Nullable
    Rectangle getBestDetectionResult();

    @Nullable
    SpatialDetectionResult getDetectionResult();

    @Nullable
    SpatialObjectDetector getDetector();

    double getFps();

    boolean getInitialized();

    int getIteration();

    boolean getLightBlobDetected();

    int getLightBlobDetectionFrameCount();

    int getLightBlobDetectionInterval();

    @NotNull
    String getObjectData();

    boolean getObjectDetected();

    boolean getObjectLost();

    double getProgress();

    double getProgressMax();

    double getProgressThreshold();

    @NotNull
    VDConstantDefinition.TemplateProximity getProximity();

    @Nullable
    Request getRequest();

    @Nullable
    SequentialDetectionResult getResult();

    @NotNull
    Score getScore();

    @NotNull
    VDConstantDefinition.TemplateProximity getViewportProximity();

    boolean getWarmup();

    boolean getWarmupComplete();

    int getWarmupFrameCount();

    int getWarmupMaxFrameCount();

    boolean hasHit();

    boolean isWarmupActive();

    boolean isWarmupEndReached();

    void setAnalysisType(@NotNull VDConstantDefinition.AnalysisType analysisType);

    void setAnalyze(boolean z10);

    void setBestDetectionResult(@Nullable Rectangle rectangle);

    void setDetectionResult(@Nullable SpatialDetectionResult spatialDetectionResult);

    void setDetector(@Nullable SpatialObjectDetector spatialObjectDetector);

    void setFps(double d2);

    void setInitialized(boolean z10);

    void setIteration(int i10);

    void setLightBlobDetected(boolean z10);

    void setLightBlobDetectionFrameCount(int i10);

    void setLightBlobDetectionInterval(int i10);

    void setObjectData(@NotNull String str);

    void setObjectDetected(boolean z10);

    void setObjectLost(boolean z10);

    void setProgress(double d2);

    void setProgressMax(double d2);

    void setProgressThreshold(double d2);

    void setProximity(@NotNull VDConstantDefinition.TemplateProximity templateProximity);

    void setRequest(@Nullable Request request);

    void setResult(@Nullable SequentialDetectionResult sequentialDetectionResult);

    void setViewportProximity(@NotNull VDConstantDefinition.TemplateProximity templateProximity);

    void setWarmup(boolean z10);

    void setWarmupComplete(boolean z10);

    void setWarmupFrameCount(int i10);

    void setWarmupMaxFrameCount(int i10);
}
