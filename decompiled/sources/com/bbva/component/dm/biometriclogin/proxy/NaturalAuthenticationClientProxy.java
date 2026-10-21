package com.bbva.component.dm.biometriclogin.proxy;

import android.app.Activity;
import android.content.Context;
import com.bbva.component.dm.biometriclogin.callbacks.DefaultDeleteAuthenticatorsLocallyCallback;
import com.bbva.component.dm.biometriclogin.callbacks.DefaultFidoAuthenticateCallback;
import com.bbva.component.dm.biometriclogin.callbacks.DefaultFidoCheckAuthCallback;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoQuickAuthData;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NaturalAuthenticationClientProxy.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J*\u0010\b\u001a\u00020\u00052\"\u0010\u0007\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006J:\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0007\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006J:\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0007\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u000fJ:\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0007\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000eJ\u001b\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/proxy/NaturalAuthenticationClientProxy;", "", "Lkotlin/Function1;", "Lcom/bbva/glomoutils/Either;", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "", "Lcom/bbva/component/dm/biometriclogin/proxy/SimpleCallback;", "block", "initialize", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "fidoSession", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "", "Lcom/bbva/component/dm/biometriclogin/proxy/BooleanCallback;", "checkAuthIsPossible", "deleteAuthenticatorsLocally", "enableQuickLogin", "setQuickLoginEnable", "isQuickDataEnabled", "(Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishInitialization", "Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;", "naturalAuthenticationApiClient", "Lcom/bbva/component/dm/biometriclogin/proxy/PostInitConfiguration;", "initConfiguration", "Lcom/bbva/component/dm/biometriclogin/proxy/ErrorReporter;", "errorReporter", "Landroid/content/Context;", "context", "<init>", "(Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;Lcom/bbva/component/dm/biometriclogin/proxy/PostInitConfiguration;Lcom/bbva/component/dm/biometriclogin/proxy/ErrorReporter;Landroid/content/Context;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class NaturalAuthenticationClientProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NaturalAuthentication f27525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PostInitConfiguration f27526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ErrorReporter f27527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f27528d;

    /* JADX INFO: compiled from: NaturalAuthenticationClientProxy.kt */
    public static final class a extends Lambda implements Function1<Either<? extends FidoException, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Either<? extends FidoException, Unit>, Unit> f27529p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Either<? extends FidoException, Unit>, Unit> function1) {
            super(1);
            this.f27529p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Either<? extends FidoException, ? extends Unit> either) {
            Either<? extends FidoException, ? extends Unit> it = either;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f27529p0.invoke((Either<? extends FidoException, Unit>) it);
            return Unit.INSTANCE;
        }
    }

    public NaturalAuthenticationClientProxy(@NotNull NaturalAuthentication naturalAuthenticationApiClient, @NotNull PostInitConfiguration initConfiguration, @NotNull ErrorReporter errorReporter, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(naturalAuthenticationApiClient, "naturalAuthenticationApiClient");
        Intrinsics.checkNotNullParameter(initConfiguration, "initConfiguration");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27525a = naturalAuthenticationApiClient;
        this.f27526b = initConfiguration;
        this.f27527c = errorReporter;
        this.f27528d = context;
    }

    public final void authenticate(@NotNull Activity activity, @NotNull FidoSession fidoSession, @NotNull Function1<? super Either<? extends FidoException, Unit>, Unit> block) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fidoSession, "fidoSession");
        Intrinsics.checkNotNullParameter(block, "block");
        NaturalAuthentication.authenticate$default(this.f27525a, activity, fidoSession, new DefaultFidoAuthenticateCallback(block), false, 8, null);
    }

    public final void checkAuthIsPossible(@NotNull Activity activity, @NotNull FidoSession fidoSession, @NotNull Function1<? super Either<? extends FidoException, Boolean>, Unit> block) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fidoSession, "fidoSession");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f27525a.checkAuthenticationPossible(activity, fidoSession, new DefaultFidoCheckAuthCallback(block));
    }

    public final void deleteAuthenticatorsLocally(@NotNull Activity activity, @NotNull FidoSession fidoSession, @NotNull Function1<? super Either<? extends FidoException, Unit>, Unit> block) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fidoSession, "fidoSession");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f27525a.deleteAllAuthenticatorsLocally(activity, fidoSession, new DefaultDeleteAuthenticatorsLocallyCallback(block));
    }

    public final void finishInitialization() {
        PostInitConfiguration postInitConfiguration = this.f27526b;
        String value = postInitConfiguration.getExternalDeviceId().getValue();
        NaturalAuthentication naturalAuthentication = this.f27525a;
        naturalAuthentication.setExternalDeviceId(value);
        naturalAuthentication.setFacetsUrl(postInitConfiguration.getFacetsUrl());
    }

    public final void initialize(@NotNull Function1<? super Either<? extends FidoException, Unit>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        final a aVar = new a(block);
        this.f27525a.initialize(this.f27528d, new FidoSdk.FidoInitializeCallback() { // from class: com.bbva.component.dm.biometriclogin.proxy.NaturalAuthenticationClientProxy.initialize.2
            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoInitializeCallback
            public void initCompleted() {
                aVar.invoke(EitherKt.right(Unit.INSTANCE));
            }

            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoInitializeCallback
            public void initFailed(@NotNull FidoException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f27527c.recordError(exception);
                aVar.invoke(EitherKt.left(exception));
            }
        });
    }

    @Nullable
    public final Object isQuickDataEnabled(@NotNull FidoSession fidoSession, @NotNull Continuation<? super Boolean> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        this.f27525a.quickAuthData(fidoSession, new FidoSdk.FidoQuickAuthDataCallback() { // from class: com.bbva.component.dm.biometriclogin.proxy.NaturalAuthenticationClientProxy$isQuickDataEnabled$2$1
            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoQuickAuthDataCallback
            public void failure(@NotNull FidoException fidoException) {
                Intrinsics.checkNotNullParameter(fidoException, "fidoException");
                Result.Companion companion = Result.INSTANCE;
                safeContinuation.resumeWith(Result.m5535constructorimpl(Boolean.FALSE));
            }

            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoQuickAuthDataCallback
            public void success(@Nullable FidoQuickAuthData quickAuthData) {
                Result.Companion companion = Result.INSTANCE;
                safeContinuation.resumeWith(Result.m5535constructorimpl(Boolean.valueOf(quickAuthData != null)));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final void setQuickLoginEnable(boolean enableQuickLogin) {
        this.f27525a.setQuickAuthEnabled(enableQuickLogin);
    }

    public /* synthetic */ NaturalAuthenticationClientProxy(NaturalAuthentication naturalAuthentication, PostInitConfiguration postInitConfiguration, ErrorReporter errorReporter, Context context, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(naturalAuthentication, postInitConfiguration, (i10 & 4) != 0 ? new DefaultErrorReporter() : errorReporter, context);
    }
}
