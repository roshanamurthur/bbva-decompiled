package com.bbva.plugin.push.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.push.PushManager;
import com.bbva.push.model.Token;
import com.bbva.push.model.TokenError;
import com.bbva.push.model.TokenResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RequestTokenCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/push/command/RequestTokenCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/push/PushManager;", "pushManager", "<init>", "(Lcom/bbva/push/PushManager;)V", "Companion", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class RequestTokenCommand extends AbstractCommand implements CoroutineScope {

    @NotNull
    public static final String ID = "getregistrationtoken";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PushManager f35918p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35919q0;

    /* JADX INFO: compiled from: RequestTokenCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.push.command.RequestTokenCommand$execute$1", f = "RequestTokenCommand.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35920p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35922r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35922r0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RequestTokenCommand.this.new a(this.f35922r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35920p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PushManager pushManager = RequestTokenCommand.this.f35918p0;
                this.f35920p0 = 1;
                obj = pushManager.requestToken(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TokenResult tokenResult = (TokenResult) obj;
            boolean z10 = tokenResult instanceof Token;
            CommandCallback commandCallback = this.f35922r0;
            if (z10) {
                commandCallback.sendEvent(SimpleResponse.toJson(Constants.registrationId, ((Token) tokenResult).getValue()));
            } else if (tokenResult instanceof TokenError) {
                commandCallback.sendError(Errors.ErrorDefault);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestTokenCommand(@NotNull PushManager pushManager) {
        super(Void.class);
        Intrinsics.checkNotNullParameter(pushManager, "pushManager");
        this.f35918p0 = pushManager;
        this.f35919q0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35919q0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(callback, null), 3, null);
    }
}
