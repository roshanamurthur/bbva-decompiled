package com.veridas.detect.sequence.face;

import android.content.Context;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.context.UniversalSequentialAnalysisContext;
import com.veridas.detect.sequence.face.analysis.ImageFaceSequentialAnalysis;
import com.veridas.detect.sequence.face.analysis.VideoFaceSequentialAnalysis;
import com.veridas.detect.sequence.face.score.ImageFaceScorekeeper;
import com.veridas.detect.sequence.face.score.VideoFaceScorekeeper;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.spatial.face.SpatialFaceDetectorFactory;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultSequenceFaceDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/veridas/detect/sequence/face/DefaultSequenceFaceDetectorFactory;", "Lcom/veridas/detect/sequence/face/SequenceFaceDetectorFactory;", "Landroid/content/Context;", "context", "Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "createImageFaceDetector", "createVideoFaceDetector", "Lcom/veridas/detect/spatial/face/SpatialFaceDetectorFactory;", "spatialFaceDetectorFactory", "<init>", "(Lcom/veridas/detect/spatial/face/SpatialFaceDetectorFactory;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultSequenceFaceDetectorFactory implements SequenceFaceDetectorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SpatialFaceDetectorFactory f66960a;

    public DefaultSequenceFaceDetectorFactory(@NotNull SpatialFaceDetectorFactory spatialFaceDetectorFactory) {
        Intrinsics.checkNotNullParameter(spatialFaceDetectorFactory, "spatialFaceDetectorFactory");
        this.f66960a = spatialFaceDetectorFactory;
    }

    @Override // com.veridas.detect.sequence.face.SequenceFaceDetectorFactory
    @NotNull
    public SequenceObjectDetector createImageFaceDetector(@NotNull Context context, @NotNull FpsCalculator fpsCalculator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        Score score = new Score(0, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2096639, null);
        UniversalSequentialAnalysisContext universalSequentialAnalysisContext = new UniversalSequentialAnalysisContext(score, null, false, null, null, null, 0.0d, false, 0, 0, 0, false, null, false, false, 0.0d, 0.0d, 0.0d, null, null, null, null, true, false, 0, 8, 0.0d, 0.0d, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.66d, 0.33d, 0.02d, 0.3d, 0.3d, 0.07d, 0.115d, 5.0d, 0.15d, 0.07d, 0.0d, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0.0d, 0.0d, 0, -37748738, 1073676351, null);
        ImageFaceScorekeeper imageFaceScorekeeper = new ImageFaceScorekeeper();
        return new FaceSequenceObjectDetector.Builder(null, null, null, null, null, null, 63, null).analysis(new ImageFaceSequentialAnalysis.Builder(null, null, 3, null).score(score).scorekeeper(imageFaceScorekeeper).build()).context(universalSequentialAnalysisContext).detector(this.f66960a.createSpatialFaceDetector(context)).fpsCalculator(fpsCalculator).score(score).scorekeeper(imageFaceScorekeeper).build();
    }

    @Override // com.veridas.detect.sequence.face.SequenceFaceDetectorFactory
    @NotNull
    public SequenceObjectDetector createVideoFaceDetector(@NotNull Context context, @NotNull FpsCalculator fpsCalculator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fpsCalculator, "fpsCalculator");
        Score score = new Score(0, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2096639, null);
        UniversalSequentialAnalysisContext universalSequentialAnalysisContext = new UniversalSequentialAnalysisContext(score, null, false, null, null, null, 0.0d, false, 0, 0, 0, false, null, false, false, 0.0d, 0.0d, 0.0d, null, null, null, null, false, false, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0.0d, 1.75d, 5, -2, 268435455, null);
        VideoFaceScorekeeper videoFaceScorekeeper = new VideoFaceScorekeeper();
        return new FaceSequenceObjectDetector.Builder(null, null, null, null, null, null, 63, null).analysis(new VideoFaceSequentialAnalysis.Builder(null, null, 3, null).score(score).scorekeeper(videoFaceScorekeeper).build()).context(universalSequentialAnalysisContext).detector(this.f66960a.createSpatialFaceDetector(context)).fpsCalculator(fpsCalculator).score(score).scorekeeper(videoFaceScorekeeper).build();
    }
}
