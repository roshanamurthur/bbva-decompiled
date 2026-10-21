package com.bbva.biometrics.authenticator;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import com.bbva.biometrics.authenticator.authenticationchecker.BiometricsAuthenticationChecker;
import com.bbva.biometrics.authenticator.biometricauthentication.BiometricsAuthentication;
import com.bbva.biometrics.authenticator.biometricauthentication.BiometricsPromptAuthentication;
import com.bbva.biometrics.authenticator.data.AuthenticateResult;
import com.bbva.biometrics.authenticator.data.AuthenticationResult;
import com.bbva.biometrics.authenticator.data.BiometricType;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Biometrics.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001!J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJj\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f28\b\u0002\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\r0\u000f2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/bbva/biometrics/authenticator/Biometrics;", "", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/biometrics/authenticator/data/AuthenticationResult;", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljavax/crypto/Cipher;", "cipher", "authenticateWithCipher", "(Landroidx/fragment/app/FragmentActivity;Ljavax/crypto/Cipher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "onAuthenticationSucceeded", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "errorCode", "", "error", "onAuthenticationError", "onAuthenticationFailed", "show", "Landroid/content/Context;", "context", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "canAuthenticate", "canAuthenticateWithCipher", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "getBiometricSystemType", "cancelAuthentication", "Builder", "biometrics_release"}, k = 1, mv = {1, 5, 1})
public final class Biometrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f26558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f26559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f26560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f26561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Executor f26564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f26565h = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public BiometricsPromptAuthentication f26566i;

    /* JADX INFO: compiled from: Biometrics.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/biometrics/authenticator/Biometrics$Builder;", "", "", "title", "setTitle", NotificationMessage.NOTIF_KEY_SUB_TITLE, "setSubtitle", "description", "setDescription", "negativeButtonText", "setNegativeButtonText", "", "isDeviceCredentialAllowed", "setDeviceCredentialAllowed", "isConfirmationRequired", "setConfirmationRequired", "Ljava/util/concurrent/Executor;", "executor", "setExecutor", "Lcom/bbva/biometrics/authenticator/Biometrics;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "biometrics_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f26571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f26572f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f26567a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f26568b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f26569c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f26570d = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public Executor f26573g = new HandlerThreadExecutor();

        @NotNull
        public final Biometrics build() {
            return new Biometrics(this.f26567a, this.f26568b, this.f26569c, this.f26570d, this.f26571e, this.f26572f, this.f26573g, null);
        }

        @NotNull
        public final Builder setConfirmationRequired(boolean isConfirmationRequired) {
            this.f26572f = isConfirmationRequired;
            return this;
        }

        @NotNull
        public final Builder setDescription(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f26569c = description;
            return this;
        }

        @RequiresApi(29)
        @NotNull
        public final Builder setDeviceCredentialAllowed(boolean isDeviceCredentialAllowed) {
            this.f26571e = isDeviceCredentialAllowed;
            return this;
        }

        @NotNull
        public final Builder setExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f26573g = executor;
            return this;
        }

        @NotNull
        public final Builder setNegativeButtonText(@NotNull String negativeButtonText) {
            Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
            this.f26570d = negativeButtonText;
            return this;
        }

        @NotNull
        public final Builder setSubtitle(@NotNull String subtitle) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.f26568b = subtitle;
            return this;
        }

        @NotNull
        public final Builder setTitle(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f26567a = title;
            return this;
        }
    }

    /* JADX INFO: compiled from: Biometrics.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f26574p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Biometrics.kt */
    public static final class b extends Lambda implements Function2<Integer, String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f26575p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, String str) {
            num.intValue();
            String noName_1 = str;
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Biometrics.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f26576p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bbva.biometrics.authenticator.Biometrics$show$4, reason: invalid class name */
    /* JADX INFO: compiled from: Biometrics.kt */
    @DebugMetadata(c = "com.bbva.biometrics.authenticator.Biometrics$show$4", f = "Biometrics.kt", i = {}, l = {124, 268}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26577p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f26579r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f26580s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, String, Unit> f26581t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f26582u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(FragmentActivity fragmentActivity, Function0<Unit> function0, Function2<? super Integer, ? super String, Unit> function2, Function0<Unit> function1, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.f26579r0 = fragmentActivity;
            this.f26580s0 = function0;
            this.f26581t0 = function2;
            this.f26582u0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return Biometrics.this.new AnonymousClass4(this.f26579r0, this.f26580s0, this.f26581t0, this.f26582u0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26577p0;
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
            BiometricsAuthentication biometricsAuthentication = Biometrics.this.f26566i;
            Intrinsics.checkNotNull(biometricsAuthentication);
            FragmentActivity fragmentActivity = this.f26579r0;
            this.f26577p0 = 1;
            obj = BiometricsAuthentication.DefaultImpls.authenticate$default(biometricsAuthentication, fragmentActivity, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            final Function0<Unit> function0 = this.f26580s0;
            final Function2<Integer, String, Unit> function2 = this.f26581t0;
            final Function0<Unit> function1 = this.f26582u0;
            FlowCollector<AuthenticationResult> flowCollector = new FlowCollector<AuthenticationResult>() { // from class: com.bbva.biometrics.authenticator.Biometrics$show$4$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(AuthenticationResult authenticationResult, @NotNull Continuation<? super Unit> continuation) {
                    AuthenticationResult authenticationResult2 = authenticationResult;
                    if (authenticationResult2 instanceof AuthenticationResult.Success) {
                        function0.invoke();
                    } else if (authenticationResult2 instanceof AuthenticationResult.Error) {
                        AuthenticationResult.Error error = (AuthenticationResult.Error) authenticationResult2;
                        function2.invoke(Boxing.boxInt(error.getCode()), error.getMessage());
                    } else if (Intrinsics.areEqual(authenticationResult2, AuthenticationResult.Failed.INSTANCE)) {
                        function1.invoke();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.f26577p0 = 2;
            if (((Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public Biometrics(String str, String str2, String str3, String str4, boolean z10, boolean z11, Executor executor, DefaultConstructorMarker defaultConstructorMarker) {
        this.f26558a = str;
        this.f26559b = str2;
        this.f26560c = str3;
        this.f26561d = str4;
        this.f26562e = z10;
        this.f26563f = z11;
        this.f26564g = executor;
    }

    public static BiometricPrompt.PromptInfo a(String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        BiometricPrompt.PromptInfo.Builder confirmationRequired = new BiometricPrompt.PromptInfo.Builder().setTitle(str).setSubtitle(str2).setDescription(str3).setConfirmationRequired(z11);
        Intrinsics.checkNotNullExpressionValue(confirmationRequired, "Builder()\n            .setTitle(title)\n            .setSubtitle(subtitle)\n            .setDescription(description)\n            .setConfirmationRequired(isConfirmationRequired)");
        if (!z10 || Build.VERSION.SDK_INT < 29) {
            confirmationRequired.setNegativeButtonText(str4);
        } else {
            confirmationRequired.setDeviceCredentialAllowed(z10);
        }
        BiometricPrompt.PromptInfo promptInfoBuild = confirmationRequired.build();
        Intrinsics.checkNotNullExpressionValue(promptInfoBuild, "promptInfoBuilder.build()");
        return promptInfoBuild;
    }

    public static /* synthetic */ Object authenticateWithCipher$default(Biometrics biometrics, FragmentActivity fragmentActivity, Cipher cipher, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cipher = null;
        }
        return biometrics.authenticateWithCipher(fragmentActivity, cipher, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(Biometrics biometrics, FragmentActivity fragmentActivity, Function0 function0, Function2 function2, Function0 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = a.f26574p0;
        }
        if ((i10 & 4) != 0) {
            function2 = b.f26575p0;
        }
        if ((i10 & 8) != 0) {
            function1 = c.f26576p0;
        }
        biometrics.show(fragmentActivity, function0, function2, function1);
    }

    @Nullable
    public final Object authenticate(@NotNull FragmentActivity fragmentActivity, @NotNull Continuation<? super Flow<? extends AuthenticationResult>> continuation) {
        BiometricsPromptAuthentication biometricsPromptAuthentication = new BiometricsPromptAuthentication(a(this.f26558a, this.f26559b, this.f26560c, this.f26561d, this.f26562e, this.f26563f), this.f26564g);
        this.f26566i = biometricsPromptAuthentication;
        Intrinsics.checkNotNull(biometricsPromptAuthentication);
        return BiometricsAuthentication.DefaultImpls.authenticate$default(biometricsPromptAuthentication, fragmentActivity, null, continuation, 2, null);
    }

    @Nullable
    public final Object authenticateWithCipher(@NotNull FragmentActivity fragmentActivity, @Nullable Cipher cipher, @NotNull Continuation<? super Flow<? extends AuthenticationResult>> continuation) {
        this.f26566i = new BiometricsPromptAuthentication(a(this.f26558a, this.f26559b, this.f26560c, this.f26561d, this.f26562e, this.f26563f), this.f26564g);
        BiometricPrompt.CryptoObject cryptoObject = cipher != null ? new BiometricPrompt.CryptoObject(cipher) : null;
        BiometricsPromptAuthentication biometricsPromptAuthentication = this.f26566i;
        Intrinsics.checkNotNull(biometricsPromptAuthentication);
        return biometricsPromptAuthentication.authenticate(fragmentActivity, cryptoObject, continuation);
    }

    @NotNull
    public final AuthenticateResult canAuthenticate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return BiometricsAuthenticationChecker.INSTANCE.canAuthenticate(context);
    }

    @NotNull
    public final AuthenticateResult canAuthenticateWithCipher(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return BiometricsAuthenticationChecker.INSTANCE.canAuthenticate(context);
    }

    public final void cancelAuthentication() {
        BiometricsPromptAuthentication biometricsPromptAuthentication = this.f26566i;
        if (biometricsPromptAuthentication == null) {
            return;
        }
        biometricsPromptAuthentication.cancelAuthentication();
    }

    @NotNull
    public final BiometricType getBiometricSystemType(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return BiometricType.FINGERPRINT;
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.biometrics.face") ? BiometricType.FACE : BiometricType.NONE;
    }

    @Deprecated(message = "This method has been deprecated, use the authenticate one instead", replaceWith = @ReplaceWith(expression = "authenticate(activity)", imports = {}))
    public final void show(@NotNull FragmentActivity activity, @NotNull Function0<Unit> onAuthenticationSucceeded, @NotNull Function2<? super Integer, ? super String, Unit> onAuthenticationError, @NotNull Function0<Unit> onAuthenticationFailed) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onAuthenticationSucceeded, "onAuthenticationSucceeded");
        Intrinsics.checkNotNullParameter(onAuthenticationError, "onAuthenticationError");
        Intrinsics.checkNotNullParameter(onAuthenticationFailed, "onAuthenticationFailed");
        this.f26566i = new BiometricsPromptAuthentication(a(this.f26558a, this.f26559b, this.f26560c, this.f26561d, this.f26562e, this.f26563f), this.f26564g);
        BuildersKt__Builders_commonKt.launch$default(this.f26565h, null, null, new AnonymousClass4(activity, onAuthenticationSucceeded, onAuthenticationError, onAuthenticationFailed, null), 3, null);
    }
}
