package com.veridas.detect.sequence.document.context.visitor;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import com.veridas.detect.sequence.score.Score;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FinalizeAnalysisVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001b\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/veridas/detect/sequence/document/context/visitor/FinalizeAnalysisVisitor;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "()V", "finalize", "", "context", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;)V", "hasEnoughHits", "", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Score;", "hasEnoughRectanglesInCenter", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;Lcom/veridas/detect/sequence/score/Score;)Z", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FinalizeAnalysisVisitor<T extends DocumentSequentialAnalysisContext> implements SequentialAnalysisContextVisitor<T> {
    public final void finalize(@NotNull T context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Score score = context.getScore();
        if (hasEnoughHits(score)) {
            score.setTotal(score.getRequiredHits());
            if (hasEnoughRectanglesInCenter(context, score)) {
                context.setProgress(context.getProgressMax());
                context.setObjectDetected(true);
            }
        }
    }

    public final boolean hasEnoughHits(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        return score.getTotal() >= score.getRequiredHits();
    }

    public final boolean hasEnoughRectanglesInCenter(@NotNull T context, @NotNull Score score) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(score, "score");
        return ((double) score.getCentered()) > context.getCenteredMaxFrameCount();
    }
}
