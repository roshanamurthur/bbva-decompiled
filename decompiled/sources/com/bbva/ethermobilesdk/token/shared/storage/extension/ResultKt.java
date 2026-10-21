package com.bbva.ethermobilesdk.token.shared.storage.extension;

import com.bbva.ethermobilesdk.sharedstorage.model.SharedStorageResult;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"valueOrNull", "", "Lcom/bbva/ethermobilesdk/sharedstorage/model/SharedStorageResult;", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "ethertoken-shared-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ResultKt {
    @Nullable
    public static final String valueOrNull(@NotNull SharedStorageResult<StorageEntry> sharedStorageResult) {
        Intrinsics.checkNotNullParameter(sharedStorageResult, "<this>");
        if (sharedStorageResult instanceof SharedStorageResult.Success) {
            return ((StorageEntry) ((SharedStorageResult.Success) sharedStorageResult).getValue()).getValue();
        }
        if ((sharedStorageResult instanceof SharedStorageResult.Empty) || (sharedStorageResult instanceof SharedStorageResult.Error)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
