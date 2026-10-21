package com.bbva.ethermobilesdk.cipher.model;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CipherResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"getOrThrow", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "(Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;)Ljava/lang/Object;", "cipher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CipherResultKt {
    public static final <T> T getOrThrow(@NotNull CipherResult<T> cipherResult) throws Throwable {
        Intrinsics.checkNotNullParameter(cipherResult, "<this>");
        if (cipherResult instanceof CipherResult.Error) {
            throw ((CipherResult.Error) cipherResult).getException();
        }
        if (cipherResult instanceof CipherResult.Success) {
            return (T) ((CipherResult.Success) cipherResult).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
