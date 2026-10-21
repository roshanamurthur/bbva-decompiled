package com.veridas.detect.sequence;

import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.SequentialAnalysisContext;
import com.veridas.detect.spatial.SpatialDetectionResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SequentialAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/veridas/detect/sequence/SequentialAnalysis;", "C", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "", "analyze", "", "context", "request", "Lcom/veridas/detect/Request;", "spatialResult", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;Lcom/veridas/detect/Request;Lcom/veridas/detect/spatial/SpatialDetectionResult;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SequentialAnalysis<C extends SequentialAnalysisContext> {
    void analyze(@NotNull C context, @NotNull Request request, @NotNull SpatialDetectionResult spatialResult);
}
