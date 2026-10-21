package com.bbva.localstorage.extension;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.localstorage.logger.LoggerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"valueOrNull", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "(Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;)Ljava/lang/Object;", "local-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ResultKt {
    @Nullable
    public static final <T> T valueOrNull(@NotNull CipherResult<T> cipherResult) {
        Intrinsics.checkNotNullParameter(cipherResult, "<this>");
        if (cipherResult instanceof CipherResult.Success) {
            return (T) ((CipherResult.Success) cipherResult).getValue();
        }
        if (!(cipherResult instanceof CipherResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        LoggerKt.logError(((CipherResult.Error) cipherResult).getException(), cipherResult.getClass());
        return null;
    }
}
