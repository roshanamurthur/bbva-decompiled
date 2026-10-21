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

/* JADX INFO: compiled from: GetUnreadMessagesCountCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.push.command.inbox.GetUnreadMessagesCountCommand$execute$1$1", f = "GetUnreadMessagesCountCommand.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CommandCallback f35985p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f35986q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f35987r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Inbox f35988s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CommandCallback commandCallback, Inbox inbox, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f35987r0 = commandCallback;
        this.f35988s0 = inbox;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d(this.f35987r0, this.f35988s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CommandCallback commandCallback;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35986q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CommandCallback commandCallback2 = this.f35987r0;
            this.f35985p0 = commandCallback2;
            this.f35986q0 = 1;
            Object allUnreadMessagesCount = this.f35988s0.getAllUnreadMessagesCount(this);
            if (allUnreadMessagesCount == coroutine_suspended) {
                return coroutine_suspended;
            }
            commandCallback = commandCallback2;
            obj = allUnreadMessagesCount;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commandCallback = this.f35985p0;
            ResultKt.throwOnFailure(obj);
        }
        commandCallback.sendEvent(((Number) obj).intValue());
        return Unit.INSTANCE;
    }
}
