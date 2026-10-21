package com.bbva.cells.componentkit.dispatcher;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IODispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "componentkit_release"}, k = 2, mv = {1, 6, 0})
public final class IODispatcherKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CoroutineDispatcher f26742a = Dispatchers.getIO();

    @NotNull
    public static final CoroutineDispatcher getIoDispatcher() {
        return f26742a;
    }
}
