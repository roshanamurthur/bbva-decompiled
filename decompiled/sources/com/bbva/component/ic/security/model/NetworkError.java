package com.bbva.component.ic.security.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.impl.v;
import androidx.collection.k;
import androidx.room.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkError.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, d2 = {"Lcom/bbva/component/ic/security/model/NetworkError;", "", "version", "", "severity", "", "httpErrorCode", "errorCode", "errorMessage", "consumerRequestId", "systemErrorCode", "systemErrorDescription", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVersion", "()I", "getSeverity", "()Ljava/lang/String;", "getHttpErrorCode", "getErrorCode", "getErrorMessage", "getConsumerRequestId", "getSystemErrorCode", "getSystemErrorDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetworkError {

    @SerializedName("consumer-request-id")
    @NotNull
    private final String consumerRequestId;

    @SerializedName("error-code")
    @NotNull
    private final String errorCode;

    @SerializedName("error-message")
    @NotNull
    private final String errorMessage;

    @SerializedName("http-status")
    private final int httpErrorCode;

    @NotNull
    private final String severity;

    @SerializedName("system-error-code")
    @NotNull
    private final String systemErrorCode;

    @SerializedName("system-error-description")
    @NotNull
    private final String systemErrorDescription;
    private final int version;

    public NetworkError(int i10, @NotNull String severity, int i11, @NotNull String errorCode, @NotNull String errorMessage, @NotNull String consumerRequestId, @NotNull String systemErrorCode, @NotNull String systemErrorDescription) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(consumerRequestId, "consumerRequestId");
        Intrinsics.checkNotNullParameter(systemErrorCode, "systemErrorCode");
        Intrinsics.checkNotNullParameter(systemErrorDescription, "systemErrorDescription");
        this.version = i10;
        this.severity = severity;
        this.httpErrorCode = i11;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.consumerRequestId = consumerRequestId;
        this.systemErrorCode = systemErrorCode;
        this.systemErrorDescription = systemErrorDescription;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSeverity() {
        return this.severity;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHttpErrorCode() {
        return this.httpErrorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getConsumerRequestId() {
        return this.consumerRequestId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSystemErrorCode() {
        return this.systemErrorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSystemErrorDescription() {
        return this.systemErrorDescription;
    }

    @NotNull
    public final NetworkError copy(int version, @NotNull String severity, int httpErrorCode, @NotNull String errorCode, @NotNull String errorMessage, @NotNull String consumerRequestId, @NotNull String systemErrorCode, @NotNull String systemErrorDescription) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(consumerRequestId, "consumerRequestId");
        Intrinsics.checkNotNullParameter(systemErrorCode, "systemErrorCode");
        Intrinsics.checkNotNullParameter(systemErrorDescription, "systemErrorDescription");
        return new NetworkError(version, severity, httpErrorCode, errorCode, errorMessage, consumerRequestId, systemErrorCode, systemErrorDescription);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkError)) {
            return false;
        }
        NetworkError networkError = (NetworkError) other;
        return this.version == networkError.version && Intrinsics.areEqual(this.severity, networkError.severity) && this.httpErrorCode == networkError.httpErrorCode && Intrinsics.areEqual(this.errorCode, networkError.errorCode) && Intrinsics.areEqual(this.errorMessage, networkError.errorMessage) && Intrinsics.areEqual(this.consumerRequestId, networkError.consumerRequestId) && Intrinsics.areEqual(this.systemErrorCode, networkError.systemErrorCode) && Intrinsics.areEqual(this.systemErrorDescription, networkError.systemErrorDescription);
    }

    @NotNull
    public final String getConsumerRequestId() {
        return this.consumerRequestId;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final int getHttpErrorCode() {
        return this.httpErrorCode;
    }

    @NotNull
    public final String getSeverity() {
        return this.severity;
    }

    @NotNull
    public final String getSystemErrorCode() {
        return this.systemErrorCode;
    }

    @NotNull
    public final String getSystemErrorDescription() {
        return this.systemErrorDescription;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.systemErrorDescription.hashCode() + n1.c(this.systemErrorCode, n1.c(this.consumerRequestId, n1.c(this.errorMessage, n1.c(this.errorCode, (n1.c(this.severity, this.version * 31, 31) + this.httpErrorCode) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.version;
        String str = this.severity;
        int i11 = this.httpErrorCode;
        String str2 = this.errorCode;
        String str3 = this.errorMessage;
        String str4 = this.consumerRequestId;
        String str5 = this.systemErrorCode;
        String str6 = this.systemErrorDescription;
        StringBuilder sbE = v.e("NetworkError(version=", i10, ", severity=", str, ", httpErrorCode=");
        a.f(sbE, i11, ", errorCode=", str2, ", errorMessage=");
        k.e(sbE, str3, ", consumerRequestId=", str4, ", systemErrorCode=");
        return c.b(sbE, str5, ", systemErrorDescription=", str6, ")");
    }
}
