package com.veridas.detect.sequence.document;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.log.ILibraryLogger;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultSequenceDocumentDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, d2 = {"Lcom/veridas/detect/sequence/document/DefaultSequenceDocumentDetectorFactory;", "Lcom/veridas/detect/sequence/document/SequenceDocumentDetectorFactory;", "Landroid/content/Context;", "context", "Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "createIntelligentSequenceObjectDetector", "createNonIntelligentSequenceObjectDetector", "createPassportSequenceObjectDetector", "createRectangleSequenceObjectDetector", "Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "Lcom/veridas/log/ILibraryLogger;", "logger", "<init>", "(Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;Lcom/veridas/log/ILibraryLogger;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultSequenceDocumentDetectorFactory implements SequenceDocumentDetectorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ObjectConfigurationProvider f66872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SpatialObjectDetectorFactory f66873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ILibraryLogger f66874c;

    public DefaultSequenceDocumentDetectorFactory(@NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory, @NotNull ILibraryLogger logger) {
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f66872a = objectConfigurationProvider;
        this.f66873b = spatialObjectDetectorFactory;
        this.f66874c = logger;
    }

    @Override // com.veridas.detect.sequence.document.SequenceDocumentDetectorFactory
    @NotNull
    public SequenceObjectDetector createIntelligentSequenceObjectDetector(@Nullable Context context, @NotNull FpsCalculator fpsCalculator, @NotNull Score score) {
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        Intrinsics.checkNotNullParameter(score, "score");
        return new IntelligentSequenceObjectDetector.Builder(null, null, null, null, null, null, null, null, null, 511, null).fpsCalculator(fpsCalculator).objectConfigurationProvider(this.f66872a).spatialObjectDetectorFactory(this.f66873b).score(score).logger(this.f66874c).build();
    }

    @Override // com.veridas.detect.sequence.document.SequenceDocumentDetectorFactory
    @NotNull
    public SequenceObjectDetector createNonIntelligentSequenceObjectDetector(@Nullable Context context, @NotNull FpsCalculator fpsCalculator, @NotNull Score score) {
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        Intrinsics.checkNotNullParameter(score, "score");
        return new NonIntelligentSequenceObjectDetector.Builder(null, null, null, null, null, null, null, null, 255, null).fpsCalculator(fpsCalculator).objectConfigurationProvider(this.f66872a).spatialObjectDetectorFactory(this.f66873b).score(score).logger(this.f66874c).build();
    }

    @Override // com.veridas.detect.sequence.document.SequenceDocumentDetectorFactory
    @NotNull
    public SequenceObjectDetector createPassportSequenceObjectDetector(@Nullable Context context, @NotNull FpsCalculator fpsCalculator, @NotNull Score score) {
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        Intrinsics.checkNotNullParameter(score, "score");
        return new PassportSequenceObjectDetector.Builder(null, null, null, null, null, null, null, 127, null).fpsCalculator(fpsCalculator).objectConfigurationProvider(this.f66872a).spatialObjectDetectorFactory(this.f66873b).score(score).build();
    }

    @Override // com.veridas.detect.sequence.document.SequenceDocumentDetectorFactory
    @NotNull
    public SequenceObjectDetector createRectangleSequenceObjectDetector(@Nullable Context context, @NotNull FpsCalculator fpsCalculator, @NotNull Score score) {
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        Intrinsics.checkNotNullParameter(score, "score");
        return new RectangleSequenceObjectDetector.Builder(null, null, null, null, null, null, null, 127, null).fpsCalculator(fpsCalculator).objectConfigurationProvider(this.f66872a).spatialObjectDetectorFactory(this.f66873b).score(score).build();
    }
}
