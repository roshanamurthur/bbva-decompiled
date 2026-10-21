package com.veridas.detect.sequence.face.score;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.sequence.context.VideoFaceSequentialAnalysisContext;
import com.veridas.detect.sequence.score.AbstractScorekeeper;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.sequence.score.Scorekeeper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VideoFaceScorekeeper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/veridas/detect/sequence/face/score/VideoFaceScorekeeper;", "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "Lcom/veridas/detect/sequence/context/VideoFaceSequentialAnalysisContext;", "()V", "tally", "", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Score;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VideoFaceScorekeeper extends AbstractScorekeeper<VideoFaceSequentialAnalysisContext> {
    @Override // com.veridas.detect.sequence.score.Scorekeeper
    public void tally(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        VideoFaceSequentialAnalysisContext context = getContext();
        if (context == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (context.hasHit()) {
            Scorekeeper.subtractNotFound$default(this, score, 0, 2, null);
        } else {
            Scorekeeper.addNotFound$default(this, score, 0, 2, null);
        }
    }
}
