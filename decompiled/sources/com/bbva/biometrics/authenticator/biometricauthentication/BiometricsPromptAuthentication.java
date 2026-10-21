package com.bbva.biometrics.authenticator.biometricauthentication;

import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import com.bbva.biometrics.authenticator.HandlerThreadExecutor;
import com.bbva.biometrics.authenticator.data.AuthenticationResult;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.util.concurrent.Executor;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricsPromptAuthentication.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/bbva/biometrics/authenticator/biometricauthentication/BiometricsPromptAuthentication;", "Lcom/bbva/biometrics/authenticator/biometricauthentication/BiometricsAuthentication;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/biometric/BiometricPrompt$CryptoObject;", "cryptoObject", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/biometrics/authenticator/data/AuthenticationResult;", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "(Landroidx/fragment/app/FragmentActivity;Landroidx/biometric/BiometricPrompt$CryptoObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cancelAuthentication", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/biometric/BiometricPrompt$PromptInfo;", "promptInfo", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroidx/biometric/BiometricPrompt$PromptInfo;Ljava/util/concurrent/Executor;)V", "biometrics_release"}, k = 1, mv = {1, 5, 1})
public final class BiometricsPromptAuthentication implements BiometricsAuthentication, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BiometricPrompt.PromptInfo f26586p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Executor f26587q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f26588r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public BiometricPrompt f26589s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<AuthenticationResult> f26590t0;

    public BiometricsPromptAuthentication(@NotNull BiometricPrompt.PromptInfo promptInfo, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(promptInfo, "promptInfo");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f26586p0 = promptInfo;
        this.f26587q0 = executor;
        this.f26588r0 = CoroutineScopeKt.MainScope();
        this.f26590t0 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_LATEST, 2, null);
    }

    @Override // com.bbva.biometrics.authenticator.biometricauthentication.BiometricsAuthentication
    @Nullable
    public Object authenticate(@NotNull FragmentActivity fragmentActivity, @Nullable BiometricPrompt.CryptoObject cryptoObject, @NotNull Continuation<? super Flow<? extends AuthenticationResult>> continuation) {
        final MutableSharedFlow<AuthenticationResult> mutableSharedFlow = this.f26590t0;
        BiometricPrompt biometricPrompt = new BiometricPrompt(fragmentActivity, this.f26587q0, new BiometricPrompt.AuthenticationCallback() { // from class: com.bbva.biometrics.authenticator.biometricauthentication.BiometricsPromptAuthentication$authenticationCallback$1

            /* JADX INFO: compiled from: BiometricsPromptAuthentication.kt */
            @DebugMetadata(c = "com.bbva.biometrics.authenticator.biometricauthentication.BiometricsPromptAuthentication$authenticationCallback$1$onAuthenticationError$1", f = "BiometricsPromptAuthentication.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ MutableSharedFlow<AuthenticationResult> f26593p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ int f26594q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ CharSequence f26595r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(MutableSharedFlow<AuthenticationResult> mutableSharedFlow, int i10, CharSequence charSequence, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f26593p0 = mutableSharedFlow;
                    this.f26594q0 = i10;
                    this.f26595r0 = charSequence;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new a(this.f26593p0, this.f26594q0, this.f26595r0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    this.f26593p0.tryEmit(new AuthenticationResult.Error(this.f26594q0, this.f26595r0.toString()));
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: BiometricsPromptAuthentication.kt */
            @DebugMetadata(c = "com.bbva.biometrics.authenticator.biometricauthentication.BiometricsPromptAuthentication$authenticationCallback$1$onAuthenticationFailed$1", f = "BiometricsPromptAuthentication.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ MutableSharedFlow<AuthenticationResult> f26596p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(MutableSharedFlow<AuthenticationResult> mutableSharedFlow, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f26596p0 = mutableSharedFlow;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.f26596p0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    this.f26596p0.tryEmit(AuthenticationResult.Failed.INSTANCE);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: BiometricsPromptAuthentication.kt */
            @DebugMetadata(c = "com.bbva.biometrics.authenticator.biometricauthentication.BiometricsPromptAuthentication$authenticationCallback$1$onAuthenticationSucceeded$1", f = "BiometricsPromptAuthentication.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ MutableSharedFlow<AuthenticationResult> f26597p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ BiometricPrompt.AuthenticationResult f26598q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(MutableSharedFlow<AuthenticationResult> mutableSharedFlow, BiometricPrompt.AuthenticationResult authenticationResult, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f26597p0 = mutableSharedFlow;
                    this.f26598q0 = authenticationResult;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new c(this.f26597p0, this.f26598q0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    BiometricPrompt.CryptoObject cryptoObject = this.f26598q0.getCryptoObject();
                    this.f26597p0.tryEmit(new AuthenticationResult.Success(cryptoObject == null ? null : cryptoObject.getCipher()));
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int errorCode, @NotNull CharSequence errString) {
                Intrinsics.checkNotNullParameter(errString, "errString");
                BuildersKt__Builders_commonKt.launch$default(this.f26591a, null, null, new a(mutableSharedFlow, errorCode, errString, null), 3, null);
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                BuildersKt__Builders_commonKt.launch$default(this.f26591a, null, null, new b(mutableSharedFlow, null), 3, null);
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(@NotNull BiometricPrompt.AuthenticationResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                BuildersKt__Builders_commonKt.launch$default(this.f26591a, null, null, new c(mutableSharedFlow, result, null), 3, null);
            }
        });
        this.f26589s0 = biometricPrompt;
        BiometricPrompt.PromptInfo promptInfo = this.f26586p0;
        if (cryptoObject == null) {
            biometricPrompt.authenticate(promptInfo);
        } else {
            biometricPrompt.authenticate(promptInfo, cryptoObject);
        }
        return mutableSharedFlow;
    }

    @Override // com.bbva.biometrics.authenticator.biometricauthentication.BiometricsAuthentication
    public void cancelAuthentication() {
        BiometricPrompt biometricPrompt = this.f26589s0;
        if (biometricPrompt == null) {
            return;
        }
        biometricPrompt.cancelAuthentication();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f26588r0.getCoroutineContext();
    }

    public /* synthetic */ BiometricsPromptAuthentication(BiometricPrompt.PromptInfo promptInfo, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(promptInfo, (i10 & 2) != 0 ? new HandlerThreadExecutor() : executor);
    }
}
