package com.veridas.detect.sequence.document.analysis.visitor;

import androidx.exifinterface.media.ExifInterface;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AdvanceDocumentVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/AdvanceDocumentVisitor;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "advanceDocument", "", "context", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;)V", "shouldAdvanceDocument", "", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;)Z", "visit", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AdvanceDocumentVisitor<T extends DocumentSequentialAnalysisContext> extends SequentialAnalysisContextVisitor<T> {

    /* JADX INFO: compiled from: AdvanceDocumentVisitor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends DocumentSequentialAnalysisContext> void visit(@NotNull AdvanceDocumentVisitor<T> advanceDocumentVisitor, @NotNull T context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (advanceDocumentVisitor.shouldAdvanceDocument(context)) {
                advanceDocumentVisitor.advanceDocument(context);
            }
        }
    }

    void advanceDocument(@NotNull T context);

    boolean shouldAdvanceDocument(@NotNull T context);

    void visit(@NotNull T context);
}
