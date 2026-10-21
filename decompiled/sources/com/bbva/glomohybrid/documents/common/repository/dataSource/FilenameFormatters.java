package com.bbva.glomohybrid.documents.common.repository.dataSource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FilenameFormatter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatters;", "", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoSpaceOrAscciFormatter;", "a", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoSpaceOrAscciFormatter;", "getNoSpaceOrAscciFormatter", "()Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoSpaceOrAscciFormatter;", "noSpaceOrAscciFormatter", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoOpFormatter;", "b", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoOpFormatter;", "getNoOpFormatter", "()Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoOpFormatter;", "noOpFormatter", "<init>", "()V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class FilenameFormatters {

    @NotNull
    public static final FilenameFormatters INSTANCE = new FilenameFormatters();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final NoSpaceOrAscciFormatter noSpaceOrAscciFormatter = new NoSpaceOrAscciFormatter(null, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final NoOpFormatter noOpFormatter = new NoOpFormatter();

    @NotNull
    public final NoOpFormatter getNoOpFormatter() {
        return noOpFormatter;
    }

    @NotNull
    public final NoSpaceOrAscciFormatter getNoSpaceOrAscciFormatter() {
        return noSpaceOrAscciFormatter;
    }
}
