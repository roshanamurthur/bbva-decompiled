package com.bbva.component.dm.biometriclogin.presentation.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricLoginConstants.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/BiometricLoginConstants;", "", "()V", "BLOCKED_PASSWORD", "", "ERROR_EXPIRED_PASSWORD_YEARLY", "ERROR_SCREEN", "ERROR_SCREEN_FRIENDLY_FRAUD", "ERROR_SCREEN_RETRY", "HALF_MODAL_ERROR", "HALF_MODAL_UNAVAILABLE", "HALF_MODAL_USER_LOCKOUT", "INACTIVE_ACCOUNT", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BiometricLoginConstants {

    @NotNull
    public static final String BLOCKED_PASSWORD = "max-attempts-blocked-password";

    @NotNull
    public static final String ERROR_EXPIRED_PASSWORD_YEARLY = "expired-password";

    @NotNull
    public static final String ERROR_SCREEN = "biometry-error";

    @NotNull
    public static final String ERROR_SCREEN_FRIENDLY_FRAUD = "biometry-friendly-fraud";

    @NotNull
    public static final String ERROR_SCREEN_RETRY = "biometry-error-retry";

    @NotNull
    public static final String HALF_MODAL_ERROR = "biometric-error-half-modal";

    @NotNull
    public static final String HALF_MODAL_UNAVAILABLE = "unavailable-service-half-modal";

    @NotNull
    public static final String HALF_MODAL_USER_LOCKOUT = "biometric-error-half-modal-user-lockout";

    @NotNull
    public static final String INACTIVE_ACCOUNT = "inactive-account";

    @NotNull
    public static final BiometricLoginConstants INSTANCE = new BiometricLoginConstants();
}
