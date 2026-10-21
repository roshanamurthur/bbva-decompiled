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

/* JADX INFO: compiled from: RegisterCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.push.command.RegisterCommand$execute$1$1", f = "RegisterCommand.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CommandCallback f35931p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f35932q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f35933r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ PushHandler f35934s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CommandCallback commandCallback, PushHandler pushHandler, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f35933r0 = commandCallback;
        this.f35934s0 = pushHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f35933r0, this.f35934s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CommandCallback commandCallback;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35932q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CommandCallback commandCallback2 = this.f35933r0;
            this.f35931p0 = commandCallback2;
            this.f35932q0 = 1;
            Object objRegister = this.f35934s0.register(this);
            if (objRegister == coroutine_suspended) {
                return coroutine_suspended;
            }
            commandCallback = commandCallback2;
            obj = objRegister;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commandCallback = this.f35931p0;
            ResultKt.throwOnFailure(obj);
        }
        commandCallback.sendEvent(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }
}
