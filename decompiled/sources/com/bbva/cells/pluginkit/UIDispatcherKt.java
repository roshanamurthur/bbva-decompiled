package com.bbva.cells.pluginkit;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UIDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"uiDispatcher", "Lkotlin/coroutines/CoroutineContext;", "getUiDispatcher", "()Lkotlin/coroutines/CoroutineContext;", "pluginkit_release"}, k = 2, mv = {1, 4, 1})
public final class UIDispatcherKt {
    @NotNull
    public static final CoroutineContext getUiDispatcher() {
        return Dispatchers.getMain();
    }
}
