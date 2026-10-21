package com.veridas.detect.sequence.document.analysis.visitor;

import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PreLightBlobDetectionVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/PreLightBlobDetectionVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "", "visit", "<init>", "()V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class PreLightBlobDetectionVisitor implements SequentialAnalysisContextVisitor<DocumentSequentialAnalysisContext> {
    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = context.getRequest();
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (request.getImageAnalysis().getDetectLightBlobs()) {
            int lightBlobDetectionInterval = context.getLightBlobDetectionInterval();
            int lightBlobDetectionFrameCount = context.getLightBlobDetectionFrameCount();
            boolean lightBlobDetected = context.getLightBlobDetected();
            if (lightBlobDetectionFrameCount % lightBlobDetectionInterval == 0 || lightBlobDetected) {
                context.setRequest(new Request.Builder(null, false, null, null, null, null, false, null, null, null, 0.0d, null, false, 0, false, 0, false, 0.0d, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, false, null, null, false, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null).copyFrom(request).detectLightBlobs(true).build());
            }
        }
    }
}
