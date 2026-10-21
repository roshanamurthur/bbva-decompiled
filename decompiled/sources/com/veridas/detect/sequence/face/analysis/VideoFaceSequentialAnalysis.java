package com.veridas.detect.sequence.face.analysis;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SequentialAnalysis;
import com.veridas.detect.sequence.context.VideoFaceSequentialAnalysisContext;
import com.veridas.detect.sequence.face.score.VideoFaceScorekeeper;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.spatial.SpatialDetectionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoFaceSequentialAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/veridas/detect/sequence/face/analysis/VideoFaceSequentialAnalysis;", "Lcom/veridas/detect/sequence/SequentialAnalysis;", "Lcom/veridas/detect/sequence/context/VideoFaceSequentialAnalysisContext;", "context", "", "calculateFramesWithoutFace", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "spatialResult", "analyze", "Lcom/veridas/detect/sequence/score/Score;", "a", "Lcom/veridas/detect/sequence/score/Score;", "getScore", "()Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/face/score/VideoFaceScorekeeper;", "b", "Lcom/veridas/detect/sequence/face/score/VideoFaceScorekeeper;", "getScorekeeper", "()Lcom/veridas/detect/sequence/face/score/VideoFaceScorekeeper;", "scorekeeper", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class VideoFaceSequentialAnalysis implements SequentialAnalysis<VideoFaceSequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Score score;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final VideoFaceScorekeeper scorekeeper;

    /* JADX INFO: compiled from: VideoFaceSequentialAnalysis.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0013"}, d2 = {"Lcom/veridas/detect/sequence/face/analysis/VideoFaceSequentialAnalysis$Builder;", "", "Lcom/veridas/detect/sequence/score/Score;", "value", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/face/score/VideoFaceScorekeeper;", "scorekeeper", "Lcom/veridas/detect/sequence/face/analysis/VideoFaceSequentialAnalysis;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/face/score/VideoFaceScorekeeper;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Score f66983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public VideoFaceScorekeeper f66984b;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Score score, VideoFaceScorekeeper videoFaceScorekeeper, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                score = builder.f66983a;
            }
            if ((i10 & 2) != 0) {
                videoFaceScorekeeper = builder.f66984b;
            }
            return builder.copy(score, videoFaceScorekeeper);
        }

        @NotNull
        public final VideoFaceSequentialAnalysis build() {
            Score score = this.f66983a;
            VideoFaceScorekeeper videoFaceScorekeeper = this.f66984b;
            if (score == null) {
                throw new IllegalArgumentException("The score parameter can't be null".toString());
            }
            if (videoFaceScorekeeper != null) {
                return new VideoFaceSequentialAnalysis(score, videoFaceScorekeeper, null);
            }
            throw new IllegalArgumentException("The scorekeeper parameter can't be null".toString());
        }

        @NotNull
        public final Builder copy(@Nullable Score score, @Nullable VideoFaceScorekeeper scorekeeper) {
            return new Builder(score, scorekeeper);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.f66983a, builder.f66983a) && Intrinsics.areEqual(this.f66984b, builder.f66984b);
        }

        public int hashCode() {
            Score score = this.f66983a;
            int iHashCode = (score == null ? 0 : score.hashCode()) * 31;
            VideoFaceScorekeeper videoFaceScorekeeper = this.f66984b;
            return iHashCode + (videoFaceScorekeeper != null ? videoFaceScorekeeper.hashCode() : 0);
        }

        @NotNull
        public final Builder score(@NotNull Score value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66983a = value;
            return this;
        }

        @NotNull
        public final Builder scorekeeper(@NotNull VideoFaceScorekeeper value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66984b = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(score=" + this.f66983a + ", scorekeeper=" + this.f66984b + ")";
        }

        public Builder(@Nullable Score score, @Nullable VideoFaceScorekeeper videoFaceScorekeeper) {
            this.f66983a = score;
            this.f66984b = videoFaceScorekeeper;
        }

        public /* synthetic */ Builder(Score score, VideoFaceScorekeeper videoFaceScorekeeper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : score, (i10 & 2) != 0 ? null : videoFaceScorekeeper);
        }
    }

    public VideoFaceSequentialAnalysis(Score score, VideoFaceScorekeeper videoFaceScorekeeper, DefaultConstructorMarker defaultConstructorMarker) {
        this.score = score;
        this.scorekeeper = videoFaceScorekeeper;
    }

    public final void calculateFramesWithoutFace(@NotNull VideoFaceSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.setEmptyFrameLimit(c.roundToInt(context.getEmptyFrameTime() * context.getFps()));
    }

    @NotNull
    public final Score getScore() {
        return this.score;
    }

    @NotNull
    public final VideoFaceScorekeeper getScorekeeper() {
        return this.scorekeeper;
    }

    @Override // com.veridas.detect.sequence.SequentialAnalysis
    public void analyze(@NotNull VideoFaceSequentialAnalysisContext context, @NotNull Request request, @NotNull SpatialDetectionResult spatialResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(spatialResult, "spatialResult");
        calculateFramesWithoutFace(context);
        context.accept(this.scorekeeper);
        context.setObjectLost(false);
        context.setObjectDetected(false);
        if (context.getEmptyFrameLimit() > 0) {
            Score score = this.score;
            if (score.getNotFound() >= context.getEmptyFrameLimit()) {
                context.setObjectLost(true);
                score.setNotFound(0);
            }
        }
    }
}
