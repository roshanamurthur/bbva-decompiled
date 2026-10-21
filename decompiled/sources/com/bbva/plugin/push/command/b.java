package com.bbva.plugin.push.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.push.handler.PushHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UnregisterCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.push.command.UnregisterCommand$execute$1$1", f = "UnregisterCommand.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CommandCallback f35935p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f35936q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f35937r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ PushHandler f35938s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CommandCallback commandCallback, PushHandler pushHandler, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f35937r0 = commandCallback;
        this.f35938s0 = pushHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f35937r0, this.f35938s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CommandCallback commandCallback;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35936q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CommandCallback commandCallback2 = this.f35937r0;
            this.f35935p0 = commandCallback2;
            this.f35936q0 = 1;
            Object objUnregister = this.f35938s0.unregister(this);
            if (objUnregister == coroutine_suspended) {
                return coroutine_suspended;
            }
            commandCallback = commandCallback2;
            obj = objUnregister;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commandCallback = this.f35935p0;
            ResultKt.throwOnFailure(obj);
        }
        commandCallback.sendEvent(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }
}
