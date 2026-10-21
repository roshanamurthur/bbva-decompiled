package com.bbva.ethermobilesdk.tokencompat.storage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacyStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\u000b\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/LegacyStorage;", "", "add", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LegacyStorage {
    @Nullable
    Object add(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object get(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object reset(@NotNull Continuation<? super Unit> continuation);
}
