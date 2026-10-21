package com.bbva.glomoutils.scheduler;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ThreadDispatchers.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "", "default", "Lkotlinx/coroutines/CoroutineDispatcher;", "io", "main", "unconfined", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ThreadDispatchers {

    /* JADX INFO: compiled from: ThreadDispatchers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        /* JADX INFO: renamed from: default, reason: not valid java name */
        public static CoroutineDispatcher m4924default(@NotNull ThreadDispatchers threadDispatchers) {
            return Dispatchers.getDefault();
        }

        @NotNull
        public static CoroutineDispatcher io(@NotNull ThreadDispatchers threadDispatchers) {
            return Dispatchers.getIO();
        }

        @NotNull
        public static CoroutineDispatcher main(@NotNull ThreadDispatchers threadDispatchers) {
            return Dispatchers.getMain().getImmediate();
        }

        @NotNull
        public static CoroutineDispatcher unconfined(@NotNull ThreadDispatchers threadDispatchers) {
            return Dispatchers.getUnconfined();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: default */
    CoroutineDispatcher mo4923default();

    @NotNull
    CoroutineDispatcher io();

    @NotNull
    CoroutineDispatcher main();

    @NotNull
    CoroutineDispatcher unconfined();
}
