package com.veridas.detect.sequence.score;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Scorekeeper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u001e"}, d2 = {"Lcom/veridas/detect/sequence/score/Scorekeeper;", "", "()V", "add", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Score;", "value", "", "addCentered", "addCenteredWeighted", "addClose", "addFar", "addNotCentered", "addNotFound", "addRectangleDetected", "addWeighted", "falseNegatives", "subtract", "subtractAvoidingFalseNegatives", "subtractCentered", "subtractCenteredAvoidingFalseNegatives", "subtractClose", "subtractCloseWeighted", "subtractFar", "subtractFarWeighted", "subtractNotCentered", "subtractNotFound", "subtractRectangleDetected", "tally", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Scorekeeper {
    public static /* synthetic */ Scorekeeper add$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.add(score, i10);
    }

    public static /* synthetic */ Scorekeeper addCentered$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCentered");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.addCentered(score, i10);
    }

    public static /* synthetic */ Scorekeeper addCenteredWeighted$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCenteredWeighted");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.addCenteredWeighted(score, i10);
    }

    public static /* synthetic */ Scorekeeper addClose$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addClose");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.addClose(score, i10);
    }

    public static /* synthetic */ Scorekeeper addFar$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFar");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.addFar(score, i10);
    }

    public static /* synthetic */ Scorekeeper addNotCentered$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNotCentered");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.addNotCentered(score, i10);
    }

    public static /* synthetic */ Scorekeeper addNotFound$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNotFound");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.addNotFound(score, i10);
    }

    public static /* synthetic */ Scorekeeper addWeighted$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addWeighted");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.addWeighted(score, i10);
    }

    public static /* synthetic */ Scorekeeper subtract$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subtract");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.subtract(score, i10);
    }

    public static /* synthetic */ Scorekeeper subtractCentered$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subtractCentered");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.subtractCentered(score, i10);
    }

    public static /* synthetic */ Scorekeeper subtractClose$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subtractClose");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.subtractClose(score, i10);
    }

    public static /* synthetic */ Scorekeeper subtractCloseWeighted$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subtractCloseWeighted");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.subtractCloseWeighted(score, i10);
    }

    public static /* synthetic */ Scorekeeper subtractFar$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subtractFar");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.subtractFar(score, i10);
    }

    public static /* synthetic */ Scorekeeper subtractFarWeighted$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subtractFarWeighted");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.subtractFarWeighted(score, i10);
    }

    public static /* synthetic */ Scorekeeper subtractNotCentered$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subtractNotCentered");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.subtractNotCentered(score, i10);
    }

    public static /* synthetic */ Scorekeeper subtractNotFound$default(Scorekeeper scorekeeper, Score score, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subtractNotFound");
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return scorekeeper.subtractNotFound(score, i10);
    }

    @NotNull
    public final Scorekeeper add(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setTotal(score.getTotal() + value);
        return this;
    }

    @NotNull
    public final Scorekeeper addCentered(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setCenteredFalseNegatives(0);
        score.setCentered(score.getCentered() + value);
        return this;
    }

    @NotNull
    public final Scorekeeper addCenteredWeighted(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        addCentered(score, score.getWeight() * value);
        return this;
    }

    @NotNull
    public final Scorekeeper addClose(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setFar(0);
        score.setClose(score.getClose() + value);
        if (score.getClose() > score.getRequiredHits()) {
            score.setClose(score.getRequiredHits());
        }
        return this;
    }

    @NotNull
    public final Scorekeeper addFar(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setClose(0);
        score.setFar(score.getFar() + value);
        int iRoundToInt = c.roundToInt(score.getRequiredHitsFarMultiplier() * ((double) score.getRequiredHits()));
        if (score.getFar() > iRoundToInt) {
            score.setFar(iRoundToInt);
        }
        return this;
    }

    @NotNull
    public final Scorekeeper addNotCentered(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setNotCentered(score.getNotCentered() + value);
        return this;
    }

    @NotNull
    public final Scorekeeper addNotFound(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setNotFound(score.getNotFound() + value);
        return this;
    }

    @NotNull
    public final Scorekeeper addRectangleDetected(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setRectangleDetected(score.getRectangleDetected() + 1);
        score.getRectangleDetected();
        return this;
    }

    @NotNull
    public final Scorekeeper addWeighted(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        add(score, score.getWeight() * value);
        return this;
    }

    @NotNull
    public final Scorekeeper falseNegatives(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setFalseNegatives(value);
        return this;
    }

    @NotNull
    public final Scorekeeper subtract(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setTotal(score.getTotal() - value);
        if (score.getTotal() < 0) {
            score.setTotal(0);
        }
        return this;
    }

    @NotNull
    public final Scorekeeper subtractAvoidingFalseNegatives(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setFalseNegatives(score.getFalseNegatives() + 1);
        if (score.getFalseNegatives() >= score.getMaxFalseNegatives() + 1) {
            subtract(score, score.getFalseNegatives());
            score.setFalseNegatives(0);
        }
        return this;
    }

    @NotNull
    public final Scorekeeper subtractCentered(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setCentered(score.getCentered() - value);
        if (score.getCentered() < 0) {
            score.setCentered(0);
        }
        return this;
    }

    @NotNull
    public final Scorekeeper subtractCenteredAvoidingFalseNegatives(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setCenteredFalseNegatives(score.getCenteredFalseNegatives() + 1);
        if (score.getCenteredFalseNegatives() >= score.getMaxFalseNegatives() + 1) {
            subtractCentered(score, score.getCenteredFalseNegatives());
            score.setCenteredFalseNegatives(0);
        }
        return this;
    }

    @NotNull
    public final Scorekeeper subtractClose(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setClose(score.getClose() - value);
        if (score.getClose() < 0) {
            score.setClose(0);
        }
        return this;
    }

    @NotNull
    public final Scorekeeper subtractCloseWeighted(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        subtractClose(score, score.getWeight() * value);
        return this;
    }

    @NotNull
    public final Scorekeeper subtractFar(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setFar(score.getFar() - value);
        if (score.getFar() < 0) {
            score.setFar(0);
        }
        return this;
    }

    @NotNull
    public final Scorekeeper subtractFarWeighted(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        subtractFar(score, score.getWeight() * value);
        return this;
    }

    @NotNull
    public final Scorekeeper subtractNotCentered(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setNotCentered(score.getNotCentered() - value);
        if (score.getNotCentered() < 0) {
            score.setNotCentered(0);
        }
        return this;
    }

    @NotNull
    public final Scorekeeper subtractNotFound(@NotNull Score score, int value) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setNotFound(score.getNotFound() - value);
        if (score.getNotFound() < 0) {
            score.setNotFound(0);
        }
        return this;
    }

    @NotNull
    public final Scorekeeper subtractRectangleDetected(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        score.setRectangleDetected(score.getRectangleDetected() - 1);
        score.getRectangleDetected();
        if (score.getRectangleDetected() < 0) {
            score.setRectangleDetected(0);
        }
        return this;
    }

    public abstract void tally(@NotNull Score score);
}
