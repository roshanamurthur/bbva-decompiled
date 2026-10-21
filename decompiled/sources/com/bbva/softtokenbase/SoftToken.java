package com.bbva.softtokenbase;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SoftToken.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/bbva/softtokenbase/SoftToken;", "", "deleteAllTokenList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokenList", "", "", "softtokenbase_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SoftToken {
    @Nullable
    Object deleteAllTokenList(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getTokenList(@NotNull Continuation<? super Set<String>> continuation);
}
