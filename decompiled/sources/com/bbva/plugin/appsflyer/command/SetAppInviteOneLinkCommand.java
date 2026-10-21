package com.bbva.plugin.appsflyer.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.appsflyer.AppsFlyerAdapter;
import com.bbva.appsflyer.AppsFlyerResponseException;
import com.bbva.plugin.appsflyer.Injection;
import com.bbva.plugin.appsflyer.models.LinkGeneratorDTO;
import com.bbva.plugin.appsflyer.validators.SetAppInviteOneLinkValidator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
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

/* JADX INFO: compiled from: SetAppInviteOneLinkCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/appsflyer/command/SetAppInviteOneLinkCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/appsflyer/models/LinkGeneratorDTO;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "appsflyer-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetAppInviteOneLinkCommand extends AbstractCommand<LinkGeneratorDTO> implements CoroutineScope {

    @NotNull
    public static final String ID = "setappinviteonelink";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35592p0;

    /* JADX INFO: compiled from: SetAppInviteOneLinkCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.appsflyer.command.SetAppInviteOneLinkCommand$execute$1", f = "SetAppInviteOneLinkCommand.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSetAppInviteOneLinkCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetAppInviteOneLinkCommand.kt\ncom/bbva/plugin/appsflyer/command/SetAppInviteOneLinkCommand$execute$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35593p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LinkGeneratorDTO f35594q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35595r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkGeneratorDTO linkGeneratorDTO, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35594q0 = linkGeneratorDTO;
            this.f35595r0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f35594q0, this.f35595r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Unit unit;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35593p0;
            Unit unit2 = null;
            CommandCallback commandCallback = this.f35595r0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AppsFlyerAdapter appsFlyerAdapter = Injection.INSTANCE.getAppsFlyerAdapter();
                    Map<String, Object> dataLinkGenerator = this.f35594q0.getDataLinkGenerator();
                    this.f35593p0 = 1;
                    obj = appsFlyerAdapter.generateMgMLink(dataLinkGenerator, this);
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
                    commandCallback.sendError(Errors.ErrorDefault);
                }
            } catch (AppsFlyerResponseException e5) {
                String message = e5.getMessage();
                if (message != null) {
                    commandCallback.sendError(message);
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 == null) {
                    commandCallback.sendError(Errors.ErrorDefault);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public SetAppInviteOneLinkCommand() {
        super(LinkGeneratorDTO.class, new SetAppInviteOneLinkValidator());
        this.f35592p0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35592p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull LinkGeneratorDTO params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(params, callback, null), 3, null);
    }
}
