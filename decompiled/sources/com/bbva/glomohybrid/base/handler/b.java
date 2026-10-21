package com.bbva.glomohybrid.base.handler;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricsIntentHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.base.handler.BiometricsIntentHandler$handleBiometricsSuccess$1", f = "BiometricsIntentHandler.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f31399p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BiometricsIntentHandler f31400q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BiometricsIntentHandler biometricsIntentHandler, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f31400q0 = biometricsIntentHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f31400q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f31399p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel channel = this.f31400q0.f31389q0;
            BiometricsIntentHandler.Intent.AccessGranted accessGranted = BiometricsIntentHandler.Intent.AccessGranted.INSTANCE;
            this.f31399p0 = 1;
            if (channel.send(accessGranted, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
