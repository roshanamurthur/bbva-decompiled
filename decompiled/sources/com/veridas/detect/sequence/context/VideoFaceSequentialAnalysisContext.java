package com.veridas.detect.sequence.context;

import kotlin.Metadata;

/* JADX INFO: compiled from: SequentialAnalysisContext.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/veridas/detect/sequence/context/VideoFaceSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "emptyFrameLimit", "", "getEmptyFrameLimit", "()I", "setEmptyFrameLimit", "(I)V", "emptyFrameTime", "", "getEmptyFrameTime", "()D", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface VideoFaceSequentialAnalysisContext extends SequentialAnalysisContext {
    int getEmptyFrameLimit();

    double getEmptyFrameTime();

    void setEmptyFrameLimit(int i10);
}
