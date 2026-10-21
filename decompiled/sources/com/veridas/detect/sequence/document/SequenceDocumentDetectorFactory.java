package com.veridas.detect.sequence.document;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.score.Score;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SequenceDocumentDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J&\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J&\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J&\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/veridas/detect/sequence/document/SequenceDocumentDetectorFactory;", "", "createIntelligentSequenceObjectDetector", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "context", "Landroid/content/Context;", "fpsCalculator", "Lcom/veridas/util/FpsCalculator;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Score;", "createNonIntelligentSequenceObjectDetector", "createPassportSequenceObjectDetector", "createRectangleSequenceObjectDetector", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SequenceDocumentDetectorFactory {

    /* JADX INFO: compiled from: SequenceDocumentDetectorFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ SequenceObjectDetector createIntelligentSequenceObjectDetector$default(SequenceDocumentDetectorFactory sequenceDocumentDetectorFactory, Context context, FpsCalculator fpsCalculator, Score score, int i10, Object obj) {
            if (obj == null) {
                return sequenceDocumentDetectorFactory.createIntelligentSequenceObjectDetector((i10 & 1) != 0 ? null : context, fpsCalculator, (i10 & 4) != 0 ? new Score(0, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097151, null) : score);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createIntelligentSequenceObjectDetector");
        }

        public static /* synthetic */ SequenceObjectDetector createNonIntelligentSequenceObjectDetector$default(SequenceDocumentDetectorFactory sequenceDocumentDetectorFactory, Context context, FpsCalculator fpsCalculator, Score score, int i10, Object obj) {
            if (obj == null) {
                return sequenceDocumentDetectorFactory.createNonIntelligentSequenceObjectDetector((i10 & 1) != 0 ? null : context, fpsCalculator, (i10 & 4) != 0 ? new Score(0, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097151, null) : score);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNonIntelligentSequenceObjectDetector");
        }

        public static /* synthetic */ SequenceObjectDetector createPassportSequenceObjectDetector$default(SequenceDocumentDetectorFactory sequenceDocumentDetectorFactory, Context context, FpsCalculator fpsCalculator, Score score, int i10, Object obj) {
            if (obj == null) {
                return sequenceDocumentDetectorFactory.createPassportSequenceObjectDetector((i10 & 1) != 0 ? null : context, fpsCalculator, (i10 & 4) != 0 ? new Score(0, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097151, null) : score);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPassportSequenceObjectDetector");
        }

        public static /* synthetic */ SequenceObjectDetector createRectangleSequenceObjectDetector$default(SequenceDocumentDetectorFactory sequenceDocumentDetectorFactory, Context context, FpsCalculator fpsCalculator, Score score, int i10, Object obj) {
            if (obj == null) {
                return sequenceDocumentDetectorFactory.createRectangleSequenceObjectDetector((i10 & 1) != 0 ? null : context, fpsCalculator, (i10 & 4) != 0 ? new Score(0, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097151, null) : score);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createRectangleSequenceObjectDetector");
        }
    }

    @NotNull
    SequenceObjectDetector createIntelligentSequenceObjectDetector(@Nullable Context context, @NotNull FpsCalculator fpsCalculator, @NotNull Score score);

    @NotNull
    SequenceObjectDetector createNonIntelligentSequenceObjectDetector(@Nullable Context context, @NotNull FpsCalculator fpsCalculator, @NotNull Score score);

    @NotNull
    SequenceObjectDetector createPassportSequenceObjectDetector(@Nullable Context context, @NotNull FpsCalculator fpsCalculator, @NotNull Score score);

    @NotNull
    SequenceObjectDetector createRectangleSequenceObjectDetector(@Nullable Context context, @NotNull FpsCalculator fpsCalculator, @NotNull Score score);
}
