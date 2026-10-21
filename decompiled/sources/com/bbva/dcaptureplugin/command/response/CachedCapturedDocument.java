package com.bbva.dcaptureplugin.command.response;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LaunchDocumentCaptureResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/bbva/dcaptureplugin/command/response/CachedCapturedDocument;", "", "content", "", "flash", "", "face", "Lcom/bbva/dcaptureplugin/command/response/Face;", "documentIds", "", "", "<init>", "([BZLcom/bbva/dcaptureplugin/command/response/Face;Ljava/util/List;)V", "getContent", "()[B", "getFlash", "()Z", "getFace", "()Lcom/bbva/dcaptureplugin/command/response/Face;", "getDocumentIds", "()Ljava/util/List;", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CachedCapturedDocument {

    @NotNull
    private final byte[] content;

    @NotNull
    private final List<String> documentIds;

    @NotNull
    private final Face face;
    private final boolean flash;

    public CachedCapturedDocument(@NotNull byte[] content, boolean z10, @NotNull Face face, @NotNull List<String> documentIds) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(face, "face");
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        this.content = content;
        this.flash = z10;
        this.face = face;
        this.documentIds = documentIds;
    }

    @NotNull
    public final byte[] getContent() {
        return this.content;
    }

    @NotNull
    public final List<String> getDocumentIds() {
        return this.documentIds;
    }

    @NotNull
    public final Face getFace() {
        return this.face;
    }

    public final boolean getFlash() {
        return this.flash;
    }
}
