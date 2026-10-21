package com.veridas.detect.sequence.context.visitor;

import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.SequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IterationInitializerVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/veridas/detect/sequence/context/visitor/IterationInitializerVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "context", "", "visit", "Lcom/veridas/detect/Request;", "value", "request", "a", "Lcom/veridas/detect/Request;", "getRequest", "()Lcom/veridas/detect/Request;", "setRequest", "(Lcom/veridas/detect/Request;)V", "<init>", "()V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class IterationInitializerVisitor implements SequentialAnalysisContextVisitor<SequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Request request;

    @Nullable
    public final Request getRequest() {
        return this.request;
    }

    @NotNull
    public final IterationInitializerVisitor request(@NotNull Request value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.request = value;
        return this;
    }

    public final void setRequest(@Nullable Request request) {
        this.request = request;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull SequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = this.request;
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        context.setRequest(request);
        context.setAnalyze(request.getAnalyze());
        context.setIteration(context.getIteration() + 1);
        context.getIteration();
    }
}
