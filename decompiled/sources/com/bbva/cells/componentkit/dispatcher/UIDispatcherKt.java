package com.bbva.cells.componentkit.dispatcher;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UIDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "getUiDispatcher", "()Lkotlin/coroutines/CoroutineContext;", "uiDispatcher", "componentkit_release"}, k = 2, mv = {1, 6, 0})
public final class UIDispatcherKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MainCoroutineDispatcher f26743a = Dispatchers.getMain();

    @NotNull
    public static final CoroutineContext getUiDispatcher() {
        return f26743a;
    }
}
