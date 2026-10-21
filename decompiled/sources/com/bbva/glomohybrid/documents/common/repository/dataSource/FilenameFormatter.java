package com.bbva.glomohybrid.documents.common.repository.dataSource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FilenameFormatter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;", "", "format", "", "fileName", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoOpFormatter;", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoSpaceOrAscciFormatter;", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FilenameFormatter {
    @NotNull
    String format(@NotNull String fileName);
}
