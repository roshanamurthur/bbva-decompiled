package com.bbva.component.dm.biometriclogin.presentation.viewmodel;

import android.app.Activity;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.biometriclogin.presentation.model.LoginState;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricLoginViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&J\b\u0010\n\u001a\u00020\u0004H&J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H&J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&¨\u0006\u001c"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/viewmodel/BiometricLoginViewModel;", "", "biometricAuthObserver", "Lkotlinx/coroutines/flow/Flow;", "", "checkBiometricAuth", "closeBiometryChannels", "invalidateStartupAuthentication", "loginStateObserver", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "onBiometricAuthentication", "onBiometryAuthenticationError", "fidoException", "", "onBiometryAuthenticationSuccess", "params", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult$Success;", "resetBiometricsSessionState", "retryBiometry", "setBiometricUser", Constants.backendRequestUserId, "", "updateBiometricAuthentication", "state", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "Companion", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BiometricLoginViewModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f27507a;
    public static final int MAX_BIOMETRY_AUTH_RETRY = 3;

    /* JADX INFO: compiled from: BiometricLoginViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/viewmodel/BiometricLoginViewModel$Companion;", "", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "b", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getACTION_BIOMETRIC_AUTH", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_BIOMETRIC_AUTH", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "c", "getACTION_BIOMETRIC_ERROR", "ACTION_BIOMETRIC_ERROR", "d", "getACTION_BIOMETRIC_CHECK", "ACTION_BIOMETRIC_CHECK", "e", "getACTION_CLEAR_BIOMETRIC_AVAILABLE_STATE", "ACTION_CLEAR_BIOMETRIC_AVAILABLE_STATE", "", "MAX_BIOMETRY_AUTH_RETRY", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "<init>", "()V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public static final int MAX_BIOMETRY_AUTH_RETRY = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f27507a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final ActionSpec<Unit> ACTION_BIOMETRIC_AUTH = new ActionSpec<>("action-biometric-auth");

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final ActionSpec<BiometricErrorNavigation> ACTION_BIOMETRIC_ERROR = new ActionSpec<>("action-biometry-error");

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final ActionSpec<Unit> ACTION_BIOMETRIC_CHECK = new ActionSpec<>("action-biometric-check");

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final ActionSpec<Unit> ACTION_CLEAR_BIOMETRIC_AVAILABLE_STATE = new ActionSpec<>("action-clear-biometric-available-state");

        @NotNull
        public final ActionSpec<Unit> getACTION_BIOMETRIC_AUTH() {
            return ACTION_BIOMETRIC_AUTH;
        }

        @NotNull
        public final ActionSpec<Unit> getACTION_BIOMETRIC_CHECK() {
            return ACTION_BIOMETRIC_CHECK;
        }

        @NotNull
        public final ActionSpec<BiometricErrorNavigation> getACTION_BIOMETRIC_ERROR() {
            return ACTION_BIOMETRIC_ERROR;
        }

        @NotNull
        public final ActionSpec<Unit> getACTION_CLEAR_BIOMETRIC_AVAILABLE_STATE() {
            return ACTION_CLEAR_BIOMETRIC_AVAILABLE_STATE;
        }
    }

    @NotNull
    Flow<Unit> biometricAuthObserver();

    void checkBiometricAuth();

    void closeBiometryChannels();

    void invalidateStartupAuthentication();

    @NotNull
    Flow<LoginState> loginStateObserver();

    void onBiometricAuthentication();

    void onBiometryAuthenticationError(@Nullable Throwable fidoException);

    void onBiometryAuthenticationSuccess(@NotNull BiometryAuthResult.Success params);

    void resetBiometricsSessionState();

    void retryBiometry();

    void setBiometricUser(@NotNull String userId);

    void updateBiometricAuthentication(@NotNull BiometryAuthState state, @Nullable Activity activity);
}
