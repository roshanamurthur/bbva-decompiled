package com.bbva.networkmonitor.lib.implementation;

import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkChangeProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/bbva/networkmonitor/lib/implementation/NetworkChangeProvider$onNewJob$1$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.bbva.networkmonitor.lib.implementation.NetworkChangeProvider$networkCallback$1$onLost$$inlined$onNewJob$1", f = "NetworkChangeProvider.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nNetworkChangeProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkChangeProvider.kt\ncom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider$onNewJob$1$1\n+ 2 NetworkChangeProvider.kt\ncom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider$networkCallback$1\n*L\n1#1,104:1\n92#2:105\n*E\n"})
public final class NetworkChangeProvider$networkCallback$1$onLost$$inlined$onNewJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f35211p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ NetworkChangeProvider f35212q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkChangeProvider$networkCallback$1$onLost$$inlined$onNewJob$1(Continuation continuation, NetworkChangeProvider networkChangeProvider) {
        super(2, continuation);
        this.f35212q0 = networkChangeProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new NetworkChangeProvider$networkCallback$1$onLost$$inlined$onNewJob$1(continuation, this.f35212q0);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35211p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f35211p0 = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        NetworkChangeProvider.access$notifyCurrentConnectionStatus(this.f35212q0, false);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((NetworkChangeProvider$networkCallback$1$onLost$$inlined$onNewJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
