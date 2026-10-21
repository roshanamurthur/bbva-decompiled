package com.bbva.gp2.android.product.trustdevice.plugin.command;

import android.app.Application;
import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import com.bbva.gp2.android.product.trustdevice.library.TrustResult;
import com.bbva.gp2.android.product.trustdevice.plugin.TrustDeviceLibInjector;
import com.bbva.gp2.android.product.trustdevice.plugin.command.validator.LoginRequestValidator;
import com.bbva.gp2.android.product.trustdevice.plugin.request.LoginRequest;
import com.bbva.gp2.android.product.trustdevice.plugin.utils.Response;
import com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException;
import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.RegisterNeededException;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/command/LoginCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/gp2/android/product/trustdevice/plugin/request/LoginRequest;", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final class LoginCommand extends AbstractCommand<LoginRequest> {

    @NotNull
    public static final String ID = "login";
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.bbva.gp2.android.product.trustdevice.plugin.command.LoginCommand$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: LoginCommand.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 16})
    @DebugMetadata(c = "com.bbva.gp2.android.product.trustdevice.plugin.command.LoginCommand$execute$1", f = "LoginCommand.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandCallback $callback;
        final /* synthetic */ LoginRequest $params;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LoginRequest loginRequest, CommandCallback commandCallback, Continuation continuation) {
            super(2, continuation);
            this.$params = loginRequest;
            this.$callback = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = LoginCommand.this.new AnonymousClass1(this.$params, this.$callback, continuation);
            anonymousClass1.p$ = (CoroutineScope) obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws InitNeededException, RegisterNeededException {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = this.p$;
                TrustDeviceLib.Companion companion = TrustDeviceLib.INSTANCE;
                Application mApplication = ((AbstractCommand) LoginCommand.this).mApplication;
                Intrinsics.checkExpressionValueIsNotNull(mApplication, "mApplication");
                Context applicationContext = mApplication.getApplicationContext();
                Intrinsics.checkExpressionValueIsNotNull(applicationContext, "mApplication.applicationContext");
                companion.init(applicationContext);
                TrustDeviceLib trustDevice = TrustDeviceLibInjector.INSTANCE.getTrustDevice();
                String pkcs7 = this.$params.getPkcs7();
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = trustDevice.login(pkcs7, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TrustResult trustResult = (TrustResult) obj;
            if (trustResult instanceof TrustResult.Result) {
                this.$callback.sendEvent(((AbstractCommand) LoginCommand.this).mGson.toJson(Response.Companion.ok$default(Response.INSTANCE, null, 1, null)));
            } else if (trustResult instanceof TrustResult.Error) {
                this.$callback.sendError(((AbstractCommand) LoginCommand.this).mGson.toJson(Response.INSTANCE.error(((TrustResult.Error) trustResult).getError().name())));
            }
            return Unit.INSTANCE;
        }
    }

    public LoginCommand() {
        super(LoginRequest.class, LoginRequestValidator.INSTANCE);
        this.scope = CoroutineScopeKt.MainScope();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull LoginRequest params, @NotNull CommandCallback callback) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(params, callback, null), 3, null);
    }
}
