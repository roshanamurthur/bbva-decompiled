package com.bbva.dcaptureplugin.command.response;

import androidx.annotation.Keep;
import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LaunchDocumentCaptureResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bbva/dcaptureplugin/command/response/OnDocumentCaptured;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", "capturedDocument", "Lcom/bbva/dcaptureplugin/command/response/CapturedDocument;", "<init>", "(Lcom/bbva/dcaptureplugin/command/response/CapturedDocument;)V", "getCapturedDocument", "()Lcom/bbva/dcaptureplugin/command/response/CapturedDocument;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OnDocumentCaptured extends PayloadDTO {

    @NotNull
    private final CapturedDocument capturedDocument;

    public OnDocumentCaptured(@NotNull CapturedDocument capturedDocument) {
        Intrinsics.checkNotNullParameter(capturedDocument, "capturedDocument");
        this.capturedDocument = capturedDocument;
    }

    public static /* synthetic */ OnDocumentCaptured copy$default(OnDocumentCaptured onDocumentCaptured, CapturedDocument capturedDocument, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            capturedDocument = onDocumentCaptured.capturedDocument;
        }
        return onDocumentCaptured.copy(capturedDocument);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CapturedDocument getCapturedDocument() {
        return this.capturedDocument;
    }

    @NotNull
    public final OnDocumentCaptured copy(@NotNull CapturedDocument capturedDocument) {
        Intrinsics.checkNotNullParameter(capturedDocument, "capturedDocument");
        return new OnDocumentCaptured(capturedDocument);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnDocumentCaptured) && Intrinsics.areEqual(this.capturedDocument, ((OnDocumentCaptured) other).capturedDocument);
    }

    @NotNull
    public final CapturedDocument getCapturedDocument() {
        return this.capturedDocument;
    }

    public int hashCode() {
        return this.capturedDocument.hashCode();
    }

    @NotNull
    public String toString() {
        return "OnDocumentCaptured(capturedDocument=" + this.capturedDocument + ")";
    }
}
