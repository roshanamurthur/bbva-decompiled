package com.veridas.detect.sequence.document.score;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.score.AbstractScorekeeper;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.sequence.score.Scorekeeper;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PassportDocumentScorekeeper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/veridas/detect/sequence/document/score/PassportDocumentScorekeeper;", "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/document/score/DocumentScorekeeper;", "()V", "tally", "", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Score;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PassportDocumentScorekeeper extends AbstractScorekeeper<DocumentSequentialAnalysisContext> {

    /* JADX INFO: compiled from: PassportDocumentScorekeeper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VDConstantDefinition.TemplateProximity.values().length];
            try {
                iArr[VDConstantDefinition.TemplateProximity.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VDConstantDefinition.TemplateProximity.CENTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VDConstantDefinition.TemplateProximity.EXTREMELY_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VDConstantDefinition.TemplateProximity.EXTREMELY_FAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.veridas.detect.sequence.score.Scorekeeper
    public void tally(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        DocumentSequentialAnalysisContext context = getContext();
        if (context == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[context.getViewportProximity().ordinal()];
        if (i10 == 1) {
            Scorekeeper.subtractClose$default(Scorekeeper.subtractFar$default(subtractCenteredAvoidingFalseNegatives(score), score, 0, 2, null), score, 0, 2, null).subtract(score, 2);
            return;
        }
        if (i10 == 2) {
            falseNegatives(score, 0).add(score, 2);
            Scorekeeper.subtractCloseWeighted$default(Scorekeeper.subtractFarWeighted$default(Scorekeeper.addCenteredWeighted$default(this, score, 0, 2, null), score, 0, 2, null), score, 0, 2, null);
        } else if (i10 == 3) {
            falseNegatives(score, 0).add(score, 2);
            Scorekeeper.subtractFarWeighted$default(addClose(score, 2), score, 0, 2, null).subtractCenteredAvoidingFalseNegatives(score);
        } else if (i10 != 4) {
            falseNegatives(score, 0).add(score, 2);
            subtractFar(score, 2).subtractClose(score, 2).subtractCenteredAvoidingFalseNegatives(score);
        } else {
            falseNegatives(score, 0).add(score, 2);
            Scorekeeper.subtractCloseWeighted$default(addFar(score, 2), score, 0, 2, null).subtractCenteredAvoidingFalseNegatives(score);
        }
    }
}
