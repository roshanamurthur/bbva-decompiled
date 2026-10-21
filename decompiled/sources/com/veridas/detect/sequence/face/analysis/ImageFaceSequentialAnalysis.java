package com.veridas.detect.sequence.face.analysis;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SequentialAnalysis;
import com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext;
import com.veridas.detect.sequence.face.score.ImageFaceScorekeeper;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageFaceSequentialAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/veridas/detect/sequence/face/analysis/ImageFaceSequentialAnalysis;", "Lcom/veridas/detect/sequence/SequentialAnalysis;", "Lcom/veridas/detect/sequence/context/ImageFaceSequentialAnalysisContext;", "context", "", "calculateFramesForFoundThreshold", "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "calculateProximity", "", "determineMinimumFacePercentage", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "spatialResult", "analyze", "Lcom/veridas/detect/sequence/score/Score;", "a", "Lcom/veridas/detect/sequence/score/Score;", "getScore", "()Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/face/score/ImageFaceScorekeeper;", "b", "Lcom/veridas/detect/sequence/face/score/ImageFaceScorekeeper;", "getScorekeeper", "()Lcom/veridas/detect/sequence/face/score/ImageFaceScorekeeper;", "scorekeeper", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class ImageFaceSequentialAnalysis implements SequentialAnalysis<ImageFaceSequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Score score;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageFaceScorekeeper scorekeeper;

    /* JADX INFO: compiled from: ImageFaceSequentialAnalysis.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/veridas/detect/sequence/face/analysis/ImageFaceSequentialAnalysis$Builder;", "", "Lcom/veridas/detect/sequence/score/Score;", "value", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/face/score/ImageFaceScorekeeper;", "scorekeeper", "Lcom/veridas/detect/sequence/face/analysis/ImageFaceSequentialAnalysis;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "component1", "component2", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/veridas/detect/sequence/score/Score;", "getScore", "()Lcom/veridas/detect/sequence/score/Score;", "setScore", "(Lcom/veridas/detect/sequence/score/Score;)V", "b", "Lcom/veridas/detect/sequence/face/score/ImageFaceScorekeeper;", "getScorekeeper", "()Lcom/veridas/detect/sequence/face/score/ImageFaceScorekeeper;", "setScorekeeper", "(Lcom/veridas/detect/sequence/face/score/ImageFaceScorekeeper;)V", "<init>", "(Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/face/score/ImageFaceScorekeeper;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Score score;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public ImageFaceScorekeeper scorekeeper;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Score score, ImageFaceScorekeeper imageFaceScorekeeper, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                score = builder.score;
            }
            if ((i10 & 2) != 0) {
                imageFaceScorekeeper = builder.scorekeeper;
            }
            return builder.copy(score, imageFaceScorekeeper);
        }

        @NotNull
        public final ImageFaceSequentialAnalysis build() {
            Score score = this.score;
            ImageFaceScorekeeper imageFaceScorekeeper = this.scorekeeper;
            if (score == null) {
                throw new IllegalArgumentException("The score parameter can't be null".toString());
            }
            if (imageFaceScorekeeper != null) {
                return new ImageFaceSequentialAnalysis(score, imageFaceScorekeeper, null);
            }
            throw new IllegalArgumentException("The scorekeeper parameter can't be null".toString());
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Score getScore() {
            return this.score;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ImageFaceScorekeeper getScorekeeper() {
            return this.scorekeeper;
        }

        @NotNull
        public final Builder copy(@Nullable Score score, @Nullable ImageFaceScorekeeper scorekeeper) {
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
            return Intrinsics.areEqual(this.score, builder.score) && Intrinsics.areEqual(this.scorekeeper, builder.scorekeeper);
        }

        @Nullable
        public final Score getScore() {
            return this.score;
        }

        @Nullable
        public final ImageFaceScorekeeper getScorekeeper() {
            return this.scorekeeper;
        }

        public int hashCode() {
            Score score = this.score;
            int iHashCode = (score == null ? 0 : score.hashCode()) * 31;
            ImageFaceScorekeeper imageFaceScorekeeper = this.scorekeeper;
            return iHashCode + (imageFaceScorekeeper != null ? imageFaceScorekeeper.hashCode() : 0);
        }

        @NotNull
        public final Builder score(@NotNull Score value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.score = value;
            return this;
        }

        @NotNull
        public final Builder scorekeeper(@NotNull ImageFaceScorekeeper value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.scorekeeper = value;
            return this;
        }

        public final void setScore(@Nullable Score score) {
            this.score = score;
        }

        public final void setScorekeeper(@Nullable ImageFaceScorekeeper imageFaceScorekeeper) {
            this.scorekeeper = imageFaceScorekeeper;
        }

        @NotNull
        public String toString() {
            return "Builder(score=" + this.score + ", scorekeeper=" + this.scorekeeper + ")";
        }

        public Builder(@Nullable Score score, @Nullable ImageFaceScorekeeper imageFaceScorekeeper) {
            this.score = score;
            this.scorekeeper = imageFaceScorekeeper;
        }

        public /* synthetic */ Builder(Score score, ImageFaceScorekeeper imageFaceScorekeeper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : score, (i10 & 2) != 0 ? null : imageFaceScorekeeper);
        }
    }

    public ImageFaceSequentialAnalysis(Score score, ImageFaceScorekeeper imageFaceScorekeeper, DefaultConstructorMarker defaultConstructorMarker) {
        this.score = score;
        this.scorekeeper = imageFaceScorekeeper;
    }

    public final void calculateFramesForFoundThreshold(@NotNull ImageFaceSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iRoundToInt = c.roundToInt(context.getTimeForPicture() * context.getFps());
        double d2 = iRoundToInt;
        int iRoundToInt2 = c.roundToInt(context.getFramesForPictureVeryCloseMultiplier() * d2);
        Score score = this.score;
        score.setVeryCloseThreshold(iRoundToInt2);
        score.setMiddleDistanceThreshold(c.roundToInt(context.getFramesForPictureMiddleDistanceMultiplier() * d2));
        score.setFarDistanceThreshold(c.roundToInt(context.getFramesForPictureFarMultiplier() * d2));
        score.setExtremelyFarThreshold(c.roundToInt(context.getFramesForPictureExtremelyFarMultiplier() * d2));
        score.setNotCenteredThreshold(c.roundToInt(context.getFramesForPictureNotCenteredMultiplier() * d2));
        score.updateRequiredHits(iRoundToInt);
    }

    @NotNull
    public final VDConstantDefinition.TemplateProximity calculateProximity(@NotNull ImageFaceSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Score score = context.getScore();
        if (score.getTotal() > score.getVeryCloseThreshold()) {
            return VDConstantDefinition.TemplateProximity.VERY_CLOSE;
        }
        if (score.getTotal() > score.getMiddleDistanceThreshold()) {
            return VDConstantDefinition.TemplateProximity.MIDDLE_DISTANCE;
        }
        if (score.getTotal() > score.getFarDistanceThreshold()) {
            return VDConstantDefinition.TemplateProximity.FAR;
        }
        if (score.getFar() > score.getExtremelyFarThreshold()) {
            return VDConstantDefinition.TemplateProximity.EXTREMELY_FAR;
        }
        return score.getNotCentered() > score.getNotCenteredThreshold() ? VDConstantDefinition.TemplateProximity.NOT_CENTERED : VDConstantDefinition.TemplateProximity.NOT_FOUND;
    }

    public final double determineMinimumFacePercentage(@NotNull ImageFaceSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = context.getRequest();
        if (request != null) {
            return l.equals(request.getTightness(), VDPhotoSelfieConfiguration.TIGHT, true) ? context.getMinimumFaceFractionTight() : context.getMinimumFaceFractionNormal();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @NotNull
    public final Score getScore() {
        return this.score;
    }

    @NotNull
    public final ImageFaceScorekeeper getScorekeeper() {
        return this.scorekeeper;
    }

    @Override // com.veridas.detect.sequence.SequentialAnalysis
    public void analyze(@NotNull ImageFaceSequentialAnalysisContext context, @NotNull Request request, @NotNull SpatialDetectionResult spatialResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(spatialResult, "spatialResult");
        SpatialDetectionResult detectionResult = context.getDetectionResult();
        if (detectionResult == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        calculateFramesForFoundThreshold(context);
        context.setMinimumFaceFraction(determineMinimumFacePercentage(context));
        context.setRelativeDistanceToCenter(detectionResult.getGeometricAnalysis().getRelativeDistanceToFocusPoint1D());
        context.accept(this.scorekeeper);
        context.setObjectLost(false);
        context.setObjectDetected(false);
        Score score = this.score;
        if (score.getTotal() >= score.getRequiredHits()) {
            context.setObjectDetected(true);
        }
        context.setProximity(calculateProximity(context));
    }
}
