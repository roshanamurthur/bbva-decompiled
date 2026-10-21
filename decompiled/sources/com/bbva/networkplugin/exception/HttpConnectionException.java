package com.bbva.networkplugin.exception;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpConnectionException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B1\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/bbva/networkplugin/exception/HttpConnectionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "code", "", "q0", "Ljava/lang/String;", "getHeaders", "()Ljava/lang/String;", "headers", "r0", "getBody", "body", "message", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class HttpConnectionException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String headers;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String body;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HttpConnectionException(@NotNull String message, int i10) {
        this(message, i10, null, null, 12, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getHeaders() {
        return this.headers;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HttpConnectionException(@NotNull String message, int i10, @Nullable String str) {
        this(message, i10, str, null, 8, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ HttpConnectionException(String str, int i10, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HttpConnectionException(@NotNull String message, int i10, @Nullable String str, @Nullable String str2) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i10;
        this.headers = str;
        this.body = str2;
    }
}
