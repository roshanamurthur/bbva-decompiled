package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"kotlinx/coroutines/ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt", "kotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class ThreadPoolDispatcherKt {
    @DelicateCoroutinesApi
    @NotNull
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(int i10, @NotNull String str) {
        return ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext(i10, str);
    }

    @DelicateCoroutinesApi
    @ExperimentalCoroutinesApi
    @NotNull
    public static final ExecutorCoroutineDispatcher newSingleThreadContext(@NotNull String str) {
        return ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt.newSingleThreadContext(str);
    }
}
