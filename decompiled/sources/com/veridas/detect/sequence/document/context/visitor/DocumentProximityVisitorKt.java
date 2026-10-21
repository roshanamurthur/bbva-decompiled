package com.veridas.detect.sequence.document.context.visitor;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.sequence.score.Score;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentProximityVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getDocumentProximity", "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/Score;", "common-image-processing_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DocumentProximityVisitorKt {
    @NotNull
    public static final VDConstantDefinition.TemplateProximity getDocumentProximity(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        double requiredHitsMultiplier = score.getRequiredHitsMultiplier() * ((double) score.getRequiredHitsThreshold());
        if (score.getFar() > requiredHitsMultiplier) {
            return VDConstantDefinition.TemplateProximity.EXTREMELY_FAR;
        }
        return ((double) score.getClose()) > requiredHitsMultiplier ? VDConstantDefinition.TemplateProximity.EXTREMELY_CLOSE : VDConstantDefinition.TemplateProximity.NOT_FOUND;
    }
}
