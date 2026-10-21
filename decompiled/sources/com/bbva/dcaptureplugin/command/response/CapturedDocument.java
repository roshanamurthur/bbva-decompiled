package com.bbva.dcaptureplugin.command.response;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LaunchDocumentCaptureResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/bbva/dcaptureplugin/command/response/CapturedDocument;", "", "url", "", "flash", "", "face", "documentIds", "", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "getUrl", "()Ljava/lang/String;", "getFlash", "()Z", "getFace", "getDocumentIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CapturedDocument {

    @NotNull
    private final List<String> documentIds;

    @NotNull
    private final String face;
    private final boolean flash;

    @NotNull
    private final String url;

    public CapturedDocument(@NotNull String url, boolean z10, @NotNull String face, @NotNull List<String> documentIds) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(face, "face");
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        this.url = url;
        this.flash = z10;
        this.face = face;
        this.documentIds = documentIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CapturedDocument copy$default(CapturedDocument capturedDocument, String str, boolean z10, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = capturedDocument.url;
        }
        if ((i10 & 2) != 0) {
            z10 = capturedDocument.flash;
        }
        if ((i10 & 4) != 0) {
            str2 = capturedDocument.face;
        }
        if ((i10 & 8) != 0) {
            list = capturedDocument.documentIds;
        }
        return capturedDocument.copy(str, z10, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFlash() {
        return this.flash;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFace() {
        return this.face;
    }

    @NotNull
    public final List<String> component4() {
        return this.documentIds;
    }

    @NotNull
    public final CapturedDocument copy(@NotNull String url, boolean flash, @NotNull String face, @NotNull List<String> documentIds) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(face, "face");
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        return new CapturedDocument(url, flash, face, documentIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapturedDocument)) {
            return false;
        }
        CapturedDocument capturedDocument = (CapturedDocument) other;
        return Intrinsics.areEqual(this.url, capturedDocument.url) && this.flash == capturedDocument.flash && Intrinsics.areEqual(this.face, capturedDocument.face) && Intrinsics.areEqual(this.documentIds, capturedDocument.documentIds);
    }

    @NotNull
    public final List<String> getDocumentIds() {
        return this.documentIds;
    }

    @NotNull
    public final String getFace() {
        return this.face;
    }

    public final boolean getFlash() {
        return this.flash;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.documentIds.hashCode() + n1.c(this.face, ((this.url.hashCode() * 31) + (this.flash ? 1231 : 1237)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "CapturedDocument(url=" + this.url + ", flash=" + this.flash + ", face=" + this.face + ", documentIds=" + this.documentIds + ")";
    }
}
