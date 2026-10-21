package com.bbva.ethermobilesdk.tokencompat.extension;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Cipher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"valueOrThrow", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "(Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;)Ljava/lang/Object;", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CipherKt {
    public static final <T> T valueOrThrow(@NotNull CipherResult<T> cipherResult) throws TokenCompatError.IllegalState {
        Intrinsics.checkNotNullParameter(cipherResult, "<this>");
        if (cipherResult instanceof CipherResult.Error) {
            throw new TokenCompatError.IllegalState(0, null, ((CipherResult.Error) cipherResult).getException(), 3, null);
        }
        if (cipherResult instanceof CipherResult.Success) {
            return (T) ((CipherResult.Success) cipherResult).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
