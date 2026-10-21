package com.veridas.detect.obj.document;

import com.veridas.detect.Request;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PassportAnalyzer.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/veridas/detect/obj/document/PassportAnalyzer;", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "()V", "finish", "", "initialize", "isIntelligent", "request", "Lcom/veridas/detect/Request;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PassportAnalyzer implements ObjectDetector<SequentialDetectionResult> {
    @Override // com.veridas.detect.obj.ObjectDetector
    public boolean finish() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    public boolean initialize() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    /* JADX INFO: renamed from: isIntelligent */
    public boolean getF66779a() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.veridas.detect.obj.ObjectDetector
    @NotNull
    public SequentialDetectionResult request(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
