package com.bbva.glomohybrid.documents.common.model;

import androidx.annotation.Keep;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/model/LocalFile;", "", "file", "Ljava/io/File;", "mimeType", "", "(Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getMimeType", "()Ljava/lang/String;", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LocalFile {

    @NotNull
    private final File file;

    @NotNull
    private final String mimeType;

    public LocalFile(@NotNull File file, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.file = file;
        this.mimeType = mimeType;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }
}
