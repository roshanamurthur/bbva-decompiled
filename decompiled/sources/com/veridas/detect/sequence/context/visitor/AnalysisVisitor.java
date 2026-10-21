package com.veridas.detect.sequence.context.visitor;

import androidx.exifinterface.media.ExifInterface;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SequentialAnalysis;
import com.veridas.detect.sequence.context.SequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import com.veridas.detect.spatial.SpatialDetectionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnalysisVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u000f\u0012\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/veridas/detect/sequence/context/visitor/AnalysisVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "C", "Lcom/veridas/detect/sequence/SequentialAnalysis;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "context", "", "visit", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;)V", "a", "Lcom/veridas/detect/sequence/SequentialAnalysis;", "getAnalysis", "()Lcom/veridas/detect/sequence/SequentialAnalysis;", "analysis", "<init>", "(Lcom/veridas/detect/sequence/SequentialAnalysis;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class AnalysisVisitor<C extends SequentialAnalysisContext, A extends SequentialAnalysis<C>> implements SequentialAnalysisContextVisitor<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final A analysis;

    public AnalysisVisitor(@NotNull A analysis) {
        Intrinsics.checkNotNullParameter(analysis, "analysis");
        this.analysis = analysis;
    }

    @NotNull
    public final A getAnalysis() {
        return this.analysis;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull C context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.isWarmupEndReached()) {
            SpatialDetectionResult detectionResult = context.getDetectionResult();
            Request request = context.getRequest();
            if (detectionResult == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (request == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            this.analysis.analyze(context, request, detectionResult);
        }
    }
}
