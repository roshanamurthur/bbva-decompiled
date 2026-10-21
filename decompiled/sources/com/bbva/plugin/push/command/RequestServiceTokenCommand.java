package com.bbva.plugin.push.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.push.command.error.GetTokenError;
import com.bbva.plugin.push.command.error.HandlerNotFoundError;
import com.bbva.plugin.push.command.params.ServiceParams;
import com.bbva.plugin.push.command.validator.ServiceParamsValidator;
import com.bbva.push.PushManager;
import com.bbva.push.exception.HandlerNotFound;
import com.bbva.push.handler.PushHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RequestServiceTokenCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/push/command/RequestServiceTokenCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/push/command/params/ServiceParams;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/push/PushManager;", "pushManager", "<init>", "(Lcom/bbva/push/PushManager;)V", "Companion", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class RequestServiceTokenCommand extends AbstractCommand<ServiceParams> implements CoroutineScope {

    @NotNull
    public static final String ID = "getservicetoken";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PushManager f35908p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35909q0;

    /* JADX INFO: compiled from: RequestServiceTokenCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.push.command.RequestServiceTokenCommand$execute$1", f = "RequestServiceTokenCommand.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35910p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ServiceParams f35912r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35913s0;

        /* JADX INFO: renamed from: com.bbva.plugin.push.command.RequestServiceTokenCommand$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestServiceTokenCommand.kt */
        @DebugMetadata(c = "com.bbva.plugin.push.command.RequestServiceTokenCommand$execute$1$1", f = "RequestServiceTokenCommand.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0162a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f35914p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ RequestServiceTokenCommand f35915q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ ServiceParams f35916r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35917s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0162a(RequestServiceTokenCommand requestServiceTokenCommand, ServiceParams serviceParams, CommandCallback commandCallback, Continuation<? super C0162a> continuation) {
                super(2, continuation);
                this.f35915q0 = requestServiceTokenCommand;
                this.f35916r0 = serviceParams;
                this.f35917s0 = commandCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0162a(this.f35915q0, this.f35916r0, this.f35917s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0162a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Unit unit;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f35914p0;
                CommandCallback commandCallback = this.f35917s0;
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        PushManager pushManager = this.f35915q0.f35908p0;
                        String serviceId = this.f35916r0.getServiceId();
                        Intrinsics.checkNotNull(serviceId);
                        PushHandler pushHandlerHandler = pushManager.handler(serviceId);
                        this.f35914p0 = 1;
                        obj = pushHandlerHandler.token(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    String str = (String) obj;
                    if (str != null) {
                        commandCallback.sendEvent(str);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        commandCallback.sendError(Errors.ErrorNotAvailable);
                    }
                } catch (HandlerNotFound unused) {
                    commandCallback.sendError(HandlerNotFoundError.INSTANCE);
                } catch (Exception e5) {
                    String message = e5.getMessage();
                    if (message == null) {
                        message = "Unable to retrieve the service token";
                    }
                    commandCallback.sendError(new GetTokenError(message));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ServiceParams serviceParams, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35912r0 = serviceParams;
            this.f35913s0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RequestServiceTokenCommand.this.new a(this.f35912r0, this.f35913s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35910p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0162a c0162a = new C0162a(RequestServiceTokenCommand.this, this.f35912r0, this.f35913s0, null);
                this.f35910p0 = 1;
                if (BuildersKt.withContext(io2, c0162a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestServiceTokenCommand(@NotNull PushManager pushManager) {
        super(ServiceParams.class, new ServiceParamsValidator());
        Intrinsics.checkNotNullParameter(pushManager, "pushManager");
        this.f35908p0 = pushManager;
        this.f35909q0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35909q0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull ServiceParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(params, callback, null), 3, null);
    }
}
