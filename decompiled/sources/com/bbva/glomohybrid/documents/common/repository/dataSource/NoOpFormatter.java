package com.bbva.glomohybrid.documents.common.repository.dataSource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NoOpFormatter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoOpFormatter;", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;", "()V", "format", "", "fileName", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NoOpFormatter implements FilenameFormatter {

    @NotNull
    public static final String ID = "no-op";

    @Override // com.bbva.glomohybrid.documents.common.repository.dataSource.FilenameFormatter
    @NotNull
    public String format(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return fileName;
    }
}
