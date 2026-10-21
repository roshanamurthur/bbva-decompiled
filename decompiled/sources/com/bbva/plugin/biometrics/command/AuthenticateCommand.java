package com.bbva.plugin.biometrics.command;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.biometrics.authenticator.Biometrics;
import com.bbva.biometrics.authenticator.data.AuthenticationResult;
import com.bbva.plugin.biometrics.BiometricsFactory;
import com.bbva.plugin.biometrics.command.base.BiometricsCommand;
import com.bbva.plugin.biometrics.command.params.BiometricParams;
import com.bbva.plugin.biometrics.command.response.AuthenticationFailedDTO;
import com.bbva.plugin.biometrics.command.response.BiometricsResult;
import com.bbva.plugin.biometrics.command.validator.BiometricParamsValidator;
import com.cells.validator.ValidatorChecker;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AuthenticateCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B!\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0015R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bbva/plugin/biometrics/command/AuthenticateCommand;", "Lcom/bbva/plugin/biometrics/command/base/BiometricsCommand;", "Lcom/bbva/plugin/biometrics/command/params/BiometricParams;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/biometrics/authenticator/Biometrics$Builder;", "biometricsBuilder", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/plugin/biometrics/BiometricsFactory;", "biometricsFactory", "Lcom/cells/validator/ValidatorChecker;", "validatorChecker", "<init>", "(Lcom/bbva/plugin/biometrics/BiometricsFactory;Lcom/cells/validator/ValidatorChecker;)V", "Companion", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticateCommand extends BiometricsCommand<BiometricParams> implements CoroutineScope {

    @NotNull
    public static final String ACTION_AUTHENTICATION_FAILED = "OnAuthenticationFailed";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35597q0;

    /* JADX INFO: renamed from: com.bbva.plugin.biometrics.command.AuthenticateCommand$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: AuthenticateCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.biometrics.command.AuthenticateCommand$execute$1", f = "AuthenticateCommand.kt", i = {}, l = {57, 76}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35599p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Biometrics.Builder f35600q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BiometricParams f35601r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AuthenticateCommand f35602s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Biometrics.Builder builder, BiometricParams biometricParams, AuthenticateCommand authenticateCommand, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f35600q0 = builder;
            this.f35601r0 = biometricParams;
            this.f35602s0 = authenticateCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.f35600q0, this.f35601r0, this.f35602s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35599p0;
            final AuthenticateCommand authenticateCommand = this.f35602s0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            BiometricParams biometricParams = this.f35601r0;
            String title = biometricParams == null ? null : biometricParams.getTitle();
            Intrinsics.checkNotNull(title);
            Biometrics.Builder title2 = this.f35600q0.setTitle(title);
            String subtitle = biometricParams.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            Biometrics.Builder subtitle2 = title2.setSubtitle(subtitle);
            String description = biometricParams.getDescription();
            Biometrics.Builder description2 = subtitle2.setDescription(description != null ? description : "");
            String negativeButtonText = biometricParams.getNegativeButtonText();
            Intrinsics.checkNotNull(negativeButtonText);
            Biometrics.Builder negativeButtonText2 = description2.setNegativeButtonText(negativeButtonText);
            Boolean boolIsDeviceCredentialAllowed = biometricParams.isDeviceCredentialAllowed();
            Biometrics biometricsBuild = negativeButtonText2.setDeviceCredentialAllowed(boolIsDeviceCredentialAllowed == null ? false : boolIsDeviceCredentialAllowed.booleanValue()).setConfirmationRequired(biometricParams.isConfirmationRequired()).build();
            FragmentActivity fragmentActivityAccess$activity = AuthenticateCommand.access$activity(authenticateCommand);
            this.f35599p0 = 1;
            obj = biometricsBuild.authenticate(fragmentActivityAccess$activity, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                FlowCollector<AuthenticationResult> flowCollector = new FlowCollector<AuthenticationResult>() { // from class: com.bbva.plugin.biometrics.command.AuthenticateCommand$execute$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(AuthenticationResult authenticationResult, @NotNull Continuation<? super Unit> continuation) {
                        AuthenticationResult authenticationResult2 = authenticationResult;
                        boolean z10 = authenticationResult2 instanceof AuthenticationResult.Success;
                        AuthenticateCommand authenticateCommand2 = authenticateCommand;
                        if (z10) {
                            authenticateCommand2.getCommandCallback().sendEvent();
                        } else if (authenticationResult2 instanceof AuthenticationResult.Error) {
                            AuthenticationResult.Error error = (AuthenticationResult.Error) authenticationResult2;
                            authenticateCommand2.getCommandCallback().sendError(BiometricsResult.INSTANCE.getJsonObjectResult(error.getCode(), error.getMessage()));
                        } else if (Intrinsics.areEqual(authenticationResult2, AuthenticationResult.Failed.INSTANCE)) {
                            ((AbstractCommand) authenticateCommand2).mPostMessenger.postMessage(AuthenticateCommand.ACTION_AUTHENTICATION_FAILED, new AuthenticationFailedDTO(null, 1, null));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.f35599p0 = 2;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticateCommand() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final FragmentActivity access$activity(AuthenticateCommand authenticateCommand) {
        Activity activity = authenticateCommand.mActivityContainer.get().get();
        if (activity != null) {
            return (FragmentActivity) activity;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35597q0.getCoroutineContext();
    }

    public /* synthetic */ AuthenticateCommand(BiometricsFactory biometricsFactory, ValidatorChecker validatorChecker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new BiometricsFactory() : biometricsFactory, (i10 & 2) != 0 ? new BiometricParamsValidator() : validatorChecker);
    }

    @Override // com.bbva.plugin.biometrics.command.base.BiometricsCommand
    @SuppressLint({"NewApi"})
    public void execute(@Nullable BiometricParams params, @NotNull Biometrics.Builder biometricsBuilder) {
        Intrinsics.checkNotNullParameter(biometricsBuilder, "biometricsBuilder");
        BuildersKt__Builders_commonKt.launch$default(this, new AuthenticateCommand$execute$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this), null, new AnonymousClass1(biometricsBuilder, params, this, null), 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticateCommand(@NotNull BiometricsFactory biometricsFactory, @NotNull ValidatorChecker<BiometricParams> validatorChecker) {
        super(BiometricParams.class, biometricsFactory, validatorChecker);
        Intrinsics.checkNotNullParameter(biometricsFactory, "biometricsFactory");
        Intrinsics.checkNotNullParameter(validatorChecker, "validatorChecker");
        this.f35597q0 = CoroutineScopeKt.MainScope();
    }
}
