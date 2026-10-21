package com.veridas.detect.sequence.context;

import com.veridas.detect.DetectableObjectConfiguration;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SequentialAnalysisContext.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/veridas/detect/sequence/context/AbstractDocumentSequentialAnalysisContextVisitor;", "C", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "()V", "getConfiguration", "Lcom/veridas/detect/DetectableObjectConfiguration;", "context", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;)Lcom/veridas/detect/DetectableObjectConfiguration;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractDocumentSequentialAnalysisContextVisitor<C extends DocumentSequentialAnalysisContext> implements SequentialAnalysisContextVisitor<C> {
    @NotNull
    public final DetectableObjectConfiguration getConfiguration(@NotNull C context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement = context.getDocumentDetectorElement();
        if (documentDetectorElement != null) {
            return documentDetectorElement.getConfiguration();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
