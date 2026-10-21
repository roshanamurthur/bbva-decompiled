package com.bbva.networkmonitor.lib.implementation;

import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkChangeProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.bbva.networkmonitor.lib.implementation.NetworkChangeProvider$onNewJob$1$1", f = "NetworkChangeProvider.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nNetworkChangeProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkChangeProvider.kt\ncom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider$onNewJob$1$1\n*L\n1#1,104:1\n*E\n"})
public final class NetworkChangeProvider$onNewJob$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f35213p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f35214q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkChangeProvider$onNewJob$1$1(Function0<Unit> function0, Continuation<? super NetworkChangeProvider$onNewJob$1$1> continuation) {
        super(2, continuation);
        this.f35214q0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new NetworkChangeProvider$onNewJob$1$1(this.f35214q0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35213p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f35213p0 = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f35214q0.invoke();
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) throws Throwable {
        InlineMarker.mark(0);
        DelayKt.delay(1000L, this);
        InlineMarker.mark(1);
        this.f35214q0.invoke();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((NetworkChangeProvider$onNewJob$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
