package com.bbva.ethermobilesdk.sharedstorage.extension;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.sharedstorage.model.SharedStorageResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0000¢\u0006\u0002\u0010\u0003\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"valueOrNull", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "(Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/sharedstorage/model/SharedStorageResult;", "(Lcom/bbva/ethermobilesdk/sharedstorage/model/SharedStorageResult;)Ljava/lang/Object;", "shared-storage_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ResultKt {
    @Nullable
    public static final <T> T valueOrNull(@NotNull SharedStorageResult<T> sharedStorageResult) {
        Intrinsics.checkNotNullParameter(sharedStorageResult, "<this>");
        if (sharedStorageResult instanceof SharedStorageResult.Success) {
            return (T) ((SharedStorageResult.Success) sharedStorageResult).getValue();
        }
        if ((sharedStorageResult instanceof SharedStorageResult.Empty) || (sharedStorageResult instanceof SharedStorageResult.Error)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final <T> T valueOrNull(@NotNull CipherResult<T> cipherResult) {
        Intrinsics.checkNotNullParameter(cipherResult, "<this>");
        if (cipherResult instanceof CipherResult.Success) {
            return (T) ((CipherResult.Success) cipherResult).getValue();
        }
        if (cipherResult instanceof CipherResult.Error) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
