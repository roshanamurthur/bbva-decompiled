package com.bbva.plugin.push.command.inbox;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.push.inbox.Inbox;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetReadMessagesCountCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.push.command.inbox.GetReadMessagesCountCommand$execute$1$1", f = "GetReadMessagesCountCommand.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CommandCallback f35981p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f35982q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f35983r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Inbox f35984s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CommandCallback commandCallback, Inbox inbox, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f35983r0 = commandCallback;
        this.f35984s0 = inbox;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f35983r0, this.f35984s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CommandCallback commandCallback;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35982q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CommandCallback commandCallback2 = this.f35983r0;
            this.f35981p0 = commandCallback2;
            this.f35982q0 = 1;
            Object allReadMessagesCount = this.f35984s0.getAllReadMessagesCount(this);
            if (allReadMessagesCount == coroutine_suspended) {
                return coroutine_suspended;
            }
            commandCallback = commandCallback2;
            obj = allReadMessagesCount;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commandCallback = this.f35981p0;
            ResultKt.throwOnFailure(obj);
        }
        commandCallback.sendEvent(((Number) obj).intValue());
        return Unit.INSTANCE;
    }
}
