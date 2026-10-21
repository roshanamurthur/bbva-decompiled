package com.veridas.detect.sequence.context.visitor;

import com.veridas.detect.Request;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.context.SequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import com.veridas.detect.spatial.SpatialDetectionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SequentialResultVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/veridas/detect/sequence/context/visitor/SequentialResultVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "()V", "visit", "", "context", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SequentialResultVisitor implements SequentialAnalysisContextVisitor<SequentialAnalysisContext> {
    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull SequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SpatialDetectionResult detectionResult = context.getDetectionResult();
        Request request = context.getRequest();
        if (detectionResult == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        context.setResult(new SequentialDetectionResult.Builder(null, 0.0d, null, false, false, 0.0d, null, null, null, false, false, 2047, null).analysisType(context.getAnalysisType()).fps(context.getFps()).objectData(context.getObjectData()).objectDetected(context.getObjectDetected()).objectLost(context.getObjectLost()).progress(context.getProgress()).proximity(context.getProximity()).request(request).spatialDetectionResult(detectionResult).warmup(context.isWarmupActive()).warmupComplete(context.isWarmupEndReached()).build());
    }
}
