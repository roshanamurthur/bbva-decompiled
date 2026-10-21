package com.veridas.contextualdata.memory;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IMemoryContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/veridas/contextualdata/memory/IMemoryContextualDataProvider;", "", "getExternalStorageSizeBytes", "", "()Ljava/lang/Float;", "getInternalStorageSizeBytes", "getRamSizeBytes", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IMemoryContextualDataProvider {
    @Nullable
    Float getExternalStorageSizeBytes();

    @Nullable
    Float getInternalStorageSizeBytes();

    float getRamSizeBytes();
}
