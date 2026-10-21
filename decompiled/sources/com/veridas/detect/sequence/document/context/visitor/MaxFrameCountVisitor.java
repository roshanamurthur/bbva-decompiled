package com.veridas.detect.sequence.document.context.visitor;

import com.noknok.android.client.utils.UIConfigTags;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MaxFrameCountVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/veridas/detect/sequence/document/context/visitor/MaxFrameCountVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "()V", "calculateCaptureMaxFrameCount", "", "context", "calculateCenteredMaxFrameCount", "calculateRequiredFrames", UIConfigTags.TAG_SECONDS, "fps", "visit", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMaxFrameCountVisitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaxFrameCountVisitor.kt\ncom/veridas/detect/sequence/document/context/visitor/MaxFrameCountVisitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class MaxFrameCountVisitor implements SequentialAnalysisContextVisitor<DocumentSequentialAnalysisContext> {
    public final double calculateCaptureMaxFrameCount(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return calculateRequiredFrames(context.getCaptureTime(), context.getFps());
    }

    public final double calculateCenteredMaxFrameCount(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return calculateRequiredFrames(context.getCenteredTime(), context.getFps());
    }

    public final double calculateRequiredFrames(double seconds, double fps) {
        if (seconds < 0.0d) {
            throw new IllegalArgumentException("seconds cannot be negative".toString());
        }
        if (fps < 0.0d) {
            throw new IllegalArgumentException("fps cannot be negative".toString());
        }
        double d2 = fps * seconds;
        if (d2 == 0.0d) {
            return 1.0d;
        }
        return d2;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.setCaptureMaxFrameCount(calculateCaptureMaxFrameCount(context));
        context.setCenteredMaxFrameCount(calculateCenteredMaxFrameCount(context));
    }
}
