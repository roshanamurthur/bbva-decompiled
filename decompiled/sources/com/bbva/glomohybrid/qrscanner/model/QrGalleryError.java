package com.bbva.glomohybrid.qrscanner.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QrGalleryError.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/model/QrGalleryError;", "", "message", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class QrGalleryError {
    private final int code;

    @NotNull
    private final String message;

    public QrGalleryError(@NotNull String message, int i10) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.code = i10;
    }

    public static /* synthetic */ QrGalleryError copy$default(QrGalleryError qrGalleryError, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = qrGalleryError.message;
        }
        if ((i11 & 2) != 0) {
            i10 = qrGalleryError.code;
        }
        return qrGalleryError.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final QrGalleryError copy(@NotNull String message, int code) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new QrGalleryError(message, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrGalleryError)) {
            return false;
        }
        QrGalleryError qrGalleryError = (QrGalleryError) other;
        return Intrinsics.areEqual(this.message, qrGalleryError.message) && this.code == qrGalleryError.code;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.code;
    }

    @NotNull
    public String toString() {
        return "QrGalleryError(message=" + this.message + ", code=" + this.code + ")";
    }
}
