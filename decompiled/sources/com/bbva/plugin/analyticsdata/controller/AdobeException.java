package com.bbva.plugin.analyticsdata.controller;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AdobeException.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/bbva/plugin/analyticsdata/controller/AdobeException;", "", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getErrorCode", "()I", "errorCode", "", "q0", "Ljava/lang/String;", "getErrorName", "()Ljava/lang/String;", "errorName", "<init>", "(ILjava/lang/String;)V", "Companion", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class AdobeException extends Throwable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final AdobeException f35585r0 = new AdobeException(-1, "unknown");

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int errorCode;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String errorName;

    /* JADX INFO: compiled from: AdobeException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/analyticsdata/controller/AdobeException$Companion;", "", "()V", "UnknownError", "Lcom/bbva/plugin/analyticsdata/controller/AdobeException;", "getUnknownError", "()Lcom/bbva/plugin/analyticsdata/controller/AdobeException;", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AdobeException getUnknownError() {
            return AdobeException.f35585r0;
        }
    }

    public AdobeException(int i10, @Nullable String str) {
        this.errorCode = i10;
        this.errorName = str;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorName() {
        return this.errorName;
    }

    public /* synthetic */ AdobeException(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str);
    }
}
