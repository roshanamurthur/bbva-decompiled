package com.veridas.detect.sequence.document.analysis.visitor;

import androidx.exifinterface.media.ExifInterface;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AdvanceDocumentVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ\u0013\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/AbstractAdvanceDocumentVisitor;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/document/analysis/visitor/AdvanceDocumentVisitor;", "()V", "advanceDocument", "", "context", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;)V", "cycleDocumentIndex", "isLastDocumentInList", "", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;)Z", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractAdvanceDocumentVisitor<T extends DocumentSequentialAnalysisContext> implements AdvanceDocumentVisitor<T> {
    @Override // com.veridas.detect.sequence.document.analysis.visitor.AdvanceDocumentVisitor
    public void advanceDocument(@NotNull T context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getScore().reset();
        context.setDocumentIndex(context.getDocumentIndex() + 1);
        context.getDocumentIndex();
        if (isLastDocumentInList(context)) {
            cycleDocumentIndex(context);
        }
    }

    public void cycleDocumentIndex(@NotNull T context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.setDocumentIndex(0);
    }

    public final boolean isLastDocumentInList(@NotNull T context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getDocumentIndex() >= context.getDocumentMap().size();
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull T t10) {
        AdvanceDocumentVisitor.DefaultImpls.visit(this, t10);
    }
}
