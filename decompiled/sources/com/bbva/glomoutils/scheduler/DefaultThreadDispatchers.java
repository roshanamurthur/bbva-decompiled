package com.bbva.glomoutils.scheduler;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultThreadDispatchers.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomoutils/scheduler/DefaultThreadDispatchers;", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "()V", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultThreadDispatchers implements ThreadDispatchers {
    @Override // com.bbva.glomoutils.scheduler.ThreadDispatchers
    @NotNull
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public CoroutineDispatcher mo4923default() {
        return ThreadDispatchers.DefaultImpls.m4924default(this);
    }

    @Override // com.bbva.glomoutils.scheduler.ThreadDispatchers
    @NotNull
    public CoroutineDispatcher io() {
        return ThreadDispatchers.DefaultImpls.io(this);
    }

    @Override // com.bbva.glomoutils.scheduler.ThreadDispatchers
    @NotNull
    public CoroutineDispatcher main() {
        return ThreadDispatchers.DefaultImpls.main(this);
    }

    @Override // com.bbva.glomoutils.scheduler.ThreadDispatchers
    @NotNull
    public CoroutineDispatcher unconfined() {
        return ThreadDispatchers.DefaultImpls.unconfined(this);
    }
}
