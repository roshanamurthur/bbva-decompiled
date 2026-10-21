package com.bbva.glomohybrid.documents.common.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/model/CannotOpenFileException;", "Lcom/bbva/glomohybrid/documents/common/model/OpenDocumentException;", "()V", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CannotOpenFileException extends OpenDocumentException {

    @NotNull
    public static final CannotOpenFileException INSTANCE = new CannotOpenFileException();

    public CannotOpenFileException() {
        super(502, "Cannot open file", null, 4, null);
    }
}
