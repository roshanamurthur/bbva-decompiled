package com.bbva.ethermobilesdk.cipher.extension;

import com.bbva.ethermobile.help.kit.result.Result;
import java.security.PublicKey;
import java.security.Signature;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PublicKey.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"verify", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "Ljava/security/PublicKey;", "dataToVerify", "", "signature", "algorithm", "", "cipher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PublicKeyKt {
    @NotNull
    public static final Result<Boolean> verify(@NotNull PublicKey publicKey, @NotNull byte[] dataToVerify, @NotNull byte[] signature, @NotNull String algorithm) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(publicKey, "<this>");
        Intrinsics.checkNotNullParameter(dataToVerify, "dataToVerify");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            Signature signature2 = Signature.getInstance(algorithm);
            signature2.initVerify(publicKey);
            signature2.update(dataToVerify);
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(Boolean.valueOf(signature2.verify(signature))));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }
}
