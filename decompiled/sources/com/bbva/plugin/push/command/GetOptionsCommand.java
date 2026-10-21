package com.bbva.plugin.push.command;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.push.command.error.HandlerNotFoundError;
import com.bbva.plugin.push.command.params.GetOptionsParams;
import com.bbva.plugin.push.command.validator.GetOptionsValidator;
import com.bbva.push.PushManager;
import com.bbva.push.model.Token;
import com.bbva.push.model.TokenResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: GetOptionsCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/push/command/GetOptionsCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/push/command/params/GetOptionsParams;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/push/PushManager;", "pushManager", "<init>", "(Lcom/bbva/push/PushManager;)V", "Companion", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class GetOptionsCommand extends AbstractCommand<GetOptionsParams> implements CoroutineScope {

    @NotNull
    public static final String ID = "getoptions";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PushManager f35896p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35897q0;

    /* JADX INFO: compiled from: GetOptionsCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.push.command.GetOptionsCommand$execute$1", f = "GetOptionsCommand.kt", i = {}, l = {30, 31}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nGetOptionsCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetOptionsCommand.kt\ncom/bbva/plugin/push/command/GetOptionsCommand$execute$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public GetOptionsCommand f35898p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f35899q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f35900r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ GetOptionsParams f35902t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35903u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GetOptionsParams getOptionsParams, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35902t0 = getOptionsParams;
            this.f35903u0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = GetOptionsCommand.this.new a(this.f35902t0, this.f35903u0, continuation);
            aVar.f35900r0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x008d  */
        /* JADX WARN: Code duplicated, block: B:37:0x009e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            Map map;
            Object objM5535constructorimpl2;
            boolean zM5541isSuccessimpl;
            CommandCallback commandCallback;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35899q0;
            GetOptionsCommand getOptionsCommand = GetOptionsCommand.this;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        getOptionsCommand = this.f35898p0;
                        map = (Map) this.f35900r0;
                        ResultKt.throwOnFailure(obj);
                    }
                    objM5535constructorimpl = GetOptionsCommand.access$appendToken(getOptionsCommand, map, (TokenResult) obj);
                    objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
                    zM5541isSuccessimpl = Result.m5541isSuccessimpl(objM5535constructorimpl2);
                    commandCallback = this.f35903u0;
                    if (zM5541isSuccessimpl) {
                        commandCallback.sendEvent(new JSONObject((Map) objM5535constructorimpl2));
                    }
                    if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl2) != null) {
                        commandCallback.sendError(HandlerNotFoundError.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                PushManager pushManager = getOptionsCommand.f35896p0;
                GetOptionsParams getOptionsParams = this.f35902t0;
                String serviceId = getOptionsParams != null ? getOptionsParams.getServiceId() : null;
                Intrinsics.checkNotNull(serviceId);
                this.f35899q0 = 1;
                obj = pushManager.getConfiguration(serviceId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objM5535constructorimpl = Result.m5535constructorimpl(q.toMutableMap((Map) obj));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                Map map2 = (Map) objM5535constructorimpl;
                PushManager pushManager2 = getOptionsCommand.f35896p0;
                this.f35900r0 = map2;
                this.f35898p0 = getOptionsCommand;
                this.f35899q0 = 2;
                Object objRequestToken = pushManager2.requestToken(this);
                if (objRequestToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map = map2;
                obj = objRequestToken;
                objM5535constructorimpl = GetOptionsCommand.access$appendToken(getOptionsCommand, map, (TokenResult) obj);
            }
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            zM5541isSuccessimpl = Result.m5541isSuccessimpl(objM5535constructorimpl2);
            commandCallback = this.f35903u0;
            if (zM5541isSuccessimpl) {
                commandCallback.sendEvent(new JSONObject((Map) objM5535constructorimpl2));
            }
            if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl2) != null) {
                commandCallback.sendError(HandlerNotFoundError.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOptionsCommand(@NotNull PushManager pushManager) {
        super(GetOptionsParams.class, GetOptionsValidator.INSTANCE);
        Intrinsics.checkNotNullParameter(pushManager, "pushManager");
        this.f35896p0 = pushManager;
        this.f35897q0 = CoroutineScopeKt.MainScope();
    }

    public static final Map access$appendToken(GetOptionsCommand getOptionsCommand, Map map, TokenResult tokenResult) {
        getOptionsCommand.getClass();
        return (map.containsKey("token") || !(tokenResult instanceof Token)) ? map : q.plus(map, TuplesKt.to("token", ((Token) tokenResult).getValue()));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35897q0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable GetOptionsParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(params, callback, null), 3, null);
    }
}
