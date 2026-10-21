package com.bbva.component.dm.biometriclogin.presentation.viewmodel;

import android.app.Activity;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.imagecapture.a;
import bk.p;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.biometriclogin.domain.model.FidoAuthenticationErrorsKt;
import com.bbva.component.dm.biometriclogin.domain.model.FidoErrorResponse;
import com.bbva.component.dm.biometriclogin.presentation.model.LoginState;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.channels.BiometricAuthenticationChannels;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: BiometricLoginViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n¨\u0006\""}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/viewmodel/DefaultBiometricLoginViewModel;", "Lcom/bbva/component/dm/biometriclogin/presentation/viewmodel/BiometricLoginViewModel;", "Lkotlinx/coroutines/flow/Flow;", "", "biometricAuthObserver", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "loginStateObserver", "onBiometricAuthentication", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "state", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "updateBiometricAuthentication", "invalidateStartupAuthentication", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult$Success;", "params", "onBiometryAuthenticationSuccess", "closeBiometryChannels", "", "fidoException", "onBiometryAuthenticationError", "", Constants.backendRequestUserId, "setBiometricUser", "checkBiometricAuth", "resetBiometricsSessionState", "retryBiometry", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "id", "defaultState", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Ljava/lang/String;Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBiometricLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricLoginViewModel.kt\ncom/bbva/component/dm/biometriclogin/presentation/viewmodel/DefaultBiometricLoginViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n56#2,6:357\n1#3:363\n*S KotlinDebug\n*F\n+ 1 BiometricLoginViewModel.kt\ncom/bbva/component/dm/biometriclogin/presentation/viewmodel/DefaultBiometricLoginViewModel\n*L\n72#1:357,6\n*E\n"})
public final class DefaultBiometricLoginViewModel implements BiometricLoginViewModel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f27512p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final LoginState f27513q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f27514r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f27515s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Channel<Unit> f27516t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Channel<LoginState> f27517u0;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultBiometricLoginViewModel(@NotNull String id, @NotNull LoginState defaultState, @NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f27512p0 = id;
        this.f27513q0 = defaultState;
        this.f27514r0 = provider;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f27515s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<BiometricAuthenticationDataManager>() { // from class: com.bbva.component.dm.biometriclogin.presentation.viewmodel.DefaultBiometricLoginViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BiometricAuthenticationDataManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(BiometricAuthenticationDataManager.class), qualifier, objArr);
            }
        });
        this.f27516t0 = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.f27517u0 = ChannelKt.Channel$default(-1, null, null, 6, null);
    }

    public static void e(DefaultBiometricLoginViewModel defaultBiometricLoginViewModel, BiometryAuthState biometryAuthState) {
        String deviceBiometryType = defaultBiometricLoginViewModel.a().getDeviceBiometryType();
        defaultBiometricLoginViewModel.getClass();
        boolean z10 = biometryAuthState instanceof BiometryAuthState.Fraud;
        if (z10) {
            if (z10) {
                defaultBiometricLoginViewModel.onBiometryAuthenticationError(FidoAuthenticationErrorsKt.friendlyFraudError());
            }
        } else if ((biometryAuthState instanceof BiometryAuthState.Cancelled) || Intrinsics.areEqual(defaultBiometricLoginViewModel.a().isBiometricAvailable(), BiometryAuthState.Cancelled.INSTANCE)) {
            defaultBiometricLoginViewModel.d(new LoginState.All(deviceBiometryType));
        } else if ((biometryAuthState.isAvailable() && defaultBiometricLoginViewModel.a().getShouldShowAuthenticator()) || (biometryAuthState instanceof BiometryAuthState.Retry)) {
            defaultBiometricLoginViewModel.d(new LoginState.CompleteBiometry(deviceBiometryType));
        } else if (biometryAuthState.isAvailable()) {
            defaultBiometricLoginViewModel.d(new LoginState.Biometry(deviceBiometryType));
        } else if (biometryAuthState instanceof BiometryAuthState.NetworkUnavailable) {
            defaultBiometricLoginViewModel.d(new LoginState.All(deviceBiometryType));
        } else {
            defaultBiometricLoginViewModel.d(defaultBiometricLoginViewModel.f27513q0);
        }
        LoggerKt.logDebug$default("TAG[DefaultBiometricLoginViewModel] biometricLoginType[" + biometryAuthState + "] - deviceBioType[" + deviceBiometryType + Constant.BRACKET_CLOSE, null, 2, null);
    }

    public final BiometricAuthenticationDataManager a() {
        return (BiometricAuthenticationDataManager) this.f27515s0.getValue();
    }

    public final void authenticate(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a().authenticate(activity);
    }

    public final void b() {
        BiometryAuthState.NotAvailable notAvailable = new BiometryAuthState.NotAvailable(null, 1, null);
        a().setBiometricAvailable(notAvailable);
        updateBiometricAuthentication(notAvailable, null);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    @NotNull
    public Flow<Unit> biometricAuthObserver() {
        return FlowKt.consumeAsFlow(this.f27516t0);
    }

    public final void c() {
        b();
        a().setBiometricsAccessEnabled(false);
        a().setFidoEnrolled(false);
        Map mapMapOf = p.mapOf(TuplesKt.to("value", Boolean.TRUE));
        MessageDispatcher messageDispatcher = (MessageDispatcher) this.f27514r0.provide("web-dispatcher");
        if (messageDispatcher != null) {
            messageDispatcher.sendMessage(new WebMessage(BiometricAuthenticationChannels.CHANNEL_FRIENDLY_FRAUD, mapMapOf));
        }
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void checkBiometricAuth() {
        CellsReactor.fire$default(this.f27512p0, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_CHECK(), null, 4, null);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void closeBiometryChannels() {
        SendChannel.DefaultImpls.close$default(this.f27516t0, null, 1, null);
        SendChannel.DefaultImpls.close$default(this.f27517u0, null, 1, null);
    }

    public final void d(LoginState loginState) {
        this.f27517u0.mo5953trySendJP2dKIU(loginState);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void invalidateStartupAuthentication() {
        a().setShouldShowAuthenticator(false);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    @NotNull
    public Flow<LoginState> loginStateObserver() {
        return FlowKt.consumeAsFlow(this.f27517u0);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void onBiometricAuthentication() {
        CellsReactor.fire$default(this.f27512p0, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_AUTH(), null, 4, null);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void onBiometryAuthenticationError(@Nullable Throwable fidoException) {
        Object retry;
        FidoException fidoException2 = (FidoException) fidoException;
        String sdkClientCode = fidoException2 != null ? fidoException2.getSdkClientCode() : null;
        if (sdkClientCode == null) {
            sdkClientCode = FidoErrorResponse.INSTANCE.createFrom(fidoException2);
        }
        LoggerKt.logError$default(h0.b("TAG[DefaultBiometricLoginViewModel] onBiometryAuthError errorCode[", sdkClientCode, Constant.BRACKET_CLOSE), fidoException, null, 4, null);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"KEY_DISAPPEARED_PERMANENTLY", "CANCELED", "AUTHENTICATOR_DELETED", "SYSTEM_CANCELED"});
        String deviceBiometryType = a().getDeviceBiometryType();
        boolean zAreEqual = Intrinsics.areEqual(sdkClientCode, "SERVER_ERROR");
        String str = this.f27512p0;
        if (zAreEqual) {
            BiometryAuthState.NetworkUnavailable networkUnavailable = BiometryAuthState.NetworkUnavailable.INSTANCE;
            CellsReactor.fire(str, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_ERROR(), new BiometricErrorNavigation.NetworkUnavailable(deviceBiometryType));
            e(this, networkUnavailable);
            d(LoginState.BiometricsServerError.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(sdkClientCode, "USER_NOT_ENROLLED") || Intrinsics.areEqual(sdkClientCode, "AUTHENTICATOR_DELETED")) {
            c();
            CellsReactor.fire(str, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_ERROR(), new BiometricErrorNavigation.NotEnrolled(deviceBiometryType));
            d(LoginState.BiometricsError.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(sdkClientCode, "KEY_DISAPPEARED_PERMANENTLY")) {
            c();
            CellsReactor.fire(str, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_ERROR(), new BiometricErrorNavigation.FriendlyFraud(deviceBiometryType));
            d(LoginState.BiometricsFriendlyFraudError.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(sdkClientCode, "SYSTEM_CANCELED") || Intrinsics.areEqual(sdkClientCode, "CANCELED")) {
            BiometryAuthState.Cancelled cancelled = BiometryAuthState.Cancelled.INSTANCE;
            a().setBiometricAvailable(cancelled);
            e(this, cancelled);
            d(LoginState.BiometricsError.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(sdkClientCode, "USER_LOCKOUT")) {
            b();
            CellsReactor.fire(str, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_ERROR(), new BiometricErrorNavigation.UserLockOut(deviceBiometryType));
            d(LoginState.BiometricsError.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(sdkClientCode, "PASSWORD_EXPIRED")) {
            c();
            CellsReactor.fire(str, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_ERROR(), new BiometricErrorNavigation.ExpiredPassword(deviceBiometryType));
            d(LoginState.BiometricsError.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(sdkClientCode, "INACTIVE_ACCOUNT")) {
            c();
            CellsReactor.fire(str, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_ERROR(), new BiometricErrorNavigation.InactiveAccount(deviceBiometryType));
            d(LoginState.BiometricsError.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(sdkClientCode, "PASSWORD_BLOCKED")) {
            c();
            CellsReactor.fire(str, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_ERROR(), new BiometricErrorNavigation.BlockedPassword(deviceBiometryType));
            d(LoginState.BiometricsError.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(sdkClientCode, "NO_MATCH")) {
            c();
            CellsReactor.fire(str, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_ERROR(), new BiometricErrorNavigation.NotEnrolled(deviceBiometryType));
            d(LoginState.BiometricsError.INSTANCE);
        } else {
            if (listListOf.contains(sdkClientCode)) {
                return;
            }
            int skippedTimes = a().getSkippedTimes();
            if (skippedTimes >= 3) {
                b();
                retry = new BiometricErrorNavigation.Fatal(deviceBiometryType);
            } else {
                a().setSkippedTimes(skippedTimes + 1);
                retry = new BiometricErrorNavigation.Retry(deviceBiometryType);
            }
            CellsReactor.fire(str, BiometricLoginViewModel.INSTANCE.getACTION_BIOMETRIC_ERROR(), retry);
            if (retry instanceof BiometricErrorNavigation.Fatal) {
                d(LoginState.BiometricsRetryEndError.INSTANCE);
            }
        }
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void onBiometryAuthenticationSuccess(@NotNull BiometryAuthResult.Success params) {
        Intrinsics.checkNotNullParameter(params, "params");
        LoggerKt.logDebug$default("TAG[DefaultBiometricLoginViewModel] onBiometryAuthenticationSuccess", null, 2, null);
        String name = CellsChannels.INSTANCE.getUserIdChannel().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String userId = params.getUserId();
        MessageDispatcher messageDispatcher = (MessageDispatcher) this.f27514r0.provide("web-dispatcher");
        if (messageDispatcher != null) {
            messageDispatcher.sendMessage(new WebMessage(name, userId));
        }
        a().setBiometricAvailable(BiometryAuthState.Available.INSTANCE);
        this.f27516t0.mo5953trySendJP2dKIU(Unit.INSTANCE);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void resetBiometricsSessionState() {
        a().resetState();
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void retryBiometry() {
        a().setBiometricAvailable(BiometryAuthState.Retry.INSTANCE);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void setBiometricUser(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BiometricAuthenticationDataManager.setUp$default(a(), userId, null, 2, null);
        boolean z10 = userId.length() == 0;
        LoggerKt.logDebug$default("TAG[DefaultBiometricLoginViewModel] setBiometricUser NotEmpty[" + z10 + "] NotBlank[" + l.isBlank(userId) + Constant.BRACKET_CLOSE, null, 2, null);
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel
    public void updateBiometricAuthentication(@NotNull BiometryAuthState state, @Nullable Activity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        e(this, state);
        if ((!state.isAvailable() || !a().getShouldShowAuthenticator()) && (!state.isAvailable() || !(state instanceof BiometryAuthState.Retry))) {
            d(LoginState.BiometricsError.INSTANCE);
        } else if (activity != null) {
            a().authenticate(activity);
        }
        a().setShouldShowAuthenticator(false);
    }
}
