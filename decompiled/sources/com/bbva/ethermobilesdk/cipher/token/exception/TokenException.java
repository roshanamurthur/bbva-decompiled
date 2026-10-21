package com.bbva.ethermobilesdk.cipher.token.exception;

import com.bbva.ethermobilesdk.cipher.exception.EtherCipherErrorException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TokenException.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/exception/TokenException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/bbva/ethermobilesdk/cipher/exception/EtherCipherErrorException;", "", "getErrorCode", "getErrorDescription", "", "cause", "errorCode", "errorDescription", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class TokenException extends Exception implements EtherCipherErrorException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f29375p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f29376q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenException(@NotNull Throwable cause, @NotNull String errorCode, @NotNull String errorDescription) {
        super(errorDescription, cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        this.f29375p0 = errorCode;
        this.f29376q0 = errorDescription;
    }

    @Override // com.bbva.ethermobilesdk.cipher.exception.EtherCipherErrorException
    @NotNull
    /* JADX INFO: renamed from: getErrorCode, reason: from getter */
    public String getF29375p0() {
        return this.f29375p0;
    }

    @Override // com.bbva.ethermobilesdk.cipher.exception.EtherCipherErrorException
    @NotNull
    /* JADX INFO: renamed from: getErrorDescription, reason: from getter */
    public String getF29376q0() {
        return this.f29376q0;
    }
}
