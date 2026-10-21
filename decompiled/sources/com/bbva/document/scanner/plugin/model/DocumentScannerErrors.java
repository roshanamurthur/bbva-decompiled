package com.bbva.document.scanner.plugin.model;

import ad.d;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.StatusCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DocumentScannerErrors.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/DocumentScannerErrors;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "PreviewError", "ScanError", "Lcom/bbva/document/scanner/plugin/model/DocumentScannerErrors$PreviewError;", "Lcom/bbva/document/scanner/plugin/model/DocumentScannerErrors$ScanError;", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0})
public abstract class DocumentScannerErrors implements ErrorMessage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f29159p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f29160q0;

    /* JADX INFO: compiled from: DocumentScannerErrors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/DocumentScannerErrors$PreviewError;", "Lcom/bbva/document/scanner/plugin/model/DocumentScannerErrors;", "()V", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PreviewError extends DocumentScannerErrors {

        @NotNull
        public static final PreviewError INSTANCE = new PreviewError();

        public PreviewError() {
            super(StatusCode.SUCCESS, "Error generating preview", null);
        }
    }

    /* JADX INFO: compiled from: DocumentScannerErrors.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/DocumentScannerErrors$ScanError;", "Lcom/bbva/document/scanner/plugin/model/DocumentScannerErrors;", "", "component1", "errorMessage", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "r0", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class ScanError extends DocumentScannerErrors {

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScanError(@NotNull String errorMessage) {
            super(598, errorMessage, null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ ScanError copy$default(ScanError scanError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = scanError.errorMessage;
            }
            return scanError.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final ScanError copy(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new ScanError(errorMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScanError) && Intrinsics.areEqual(this.errorMessage, ((ScanError) other).errorMessage);
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("ScanError(errorMessage="), this.errorMessage, ")");
        }
    }

    public DocumentScannerErrors(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f29159p0 = i10;
        this.f29160q0 = str;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public int getF29159p0() {
        return this.f29159p0;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public String getF29160q0() {
        return this.f29160q0;
    }
}
