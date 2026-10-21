package com.bbva.glomohybrid.documents.common.model;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/model/FileResponse;", "", "", "a", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "contentType", "Ljava/io/InputStream;", "b", "Ljava/io/InputStream;", "getFileContent", "()Ljava/io/InputStream;", "fileContent", "<init>", "(Ljava/lang/String;Ljava/io/InputStream;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class FileResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String contentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InputStream fileContent;

    public FileResponse(@NotNull String contentType, @NotNull InputStream fileContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(fileContent, "fileContent");
        this.contentType = contentType;
        this.fileContent = fileContent;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final InputStream getFileContent() {
        return this.fileContent;
    }
}
