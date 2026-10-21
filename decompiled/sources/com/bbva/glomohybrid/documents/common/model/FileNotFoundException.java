package com.bbva.glomohybrid.documents.common.model;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/model/FileNotFoundException;", "Lcom/bbva/glomohybrid/documents/common/model/OpenDocumentException;", "()V", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileNotFoundException extends OpenDocumentException {

    @NotNull
    public static final FileNotFoundException INSTANCE = new FileNotFoundException();

    public FileNotFoundException() {
        super(ResultCode.ERROR_REPO_CORRUPT, "File not found", null, 4, null);
    }
}
