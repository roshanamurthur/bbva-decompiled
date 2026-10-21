package com.bbva.plugin.smsregex.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injectior.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\"\u0010\u0003\u001a\u00020\u00028F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u00048F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/plugin/smsregex/request/Injectior;", "", "Lcom/bbva/plugin/smsregex/request/SmsFactory;", "factory", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "", "update", "a", "Lcom/bbva/plugin/smsregex/request/SmsFactory;", "getFactory", "()Lcom/bbva/plugin/smsregex/request/SmsFactory;", "setFactory", "(Lcom/bbva/plugin/smsregex/request/SmsFactory;)V", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setIoDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "ioDispatcher", "<init>", "()V", "smsregex-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class Injectior {

    @NotNull
    public static final Injectior INSTANCE = new Injectior();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static SmsFactory factory = new SmsBroadcastFactory();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static CoroutineDispatcher ioDispatcher = Dispatchers.getIO();

    public static /* synthetic */ void update$default(Injectior injectior, SmsFactory smsFactory, CoroutineDispatcher coroutineDispatcher, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            smsFactory = new SmsBroadcastFactory();
        }
        if ((i10 & 2) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        injectior.update(smsFactory, coroutineDispatcher);
    }

    @NotNull
    public final SmsFactory getFactory() {
        return factory;
    }

    @NotNull
    public final CoroutineDispatcher getIoDispatcher() {
        return ioDispatcher;
    }

    public final void setFactory(@NotNull SmsFactory smsFactory) {
        Intrinsics.checkNotNullParameter(smsFactory, "<set-?>");
        factory = smsFactory;
    }

    public final void setIoDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "<set-?>");
        ioDispatcher = coroutineDispatcher;
    }

    public final void update(@NotNull SmsFactory factory2, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(factory2, "factory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        factory = factory2;
        ioDispatcher = dispatcher;
    }
}
