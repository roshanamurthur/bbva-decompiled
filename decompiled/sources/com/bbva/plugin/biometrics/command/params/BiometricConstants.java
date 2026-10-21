package com.bbva.plugin.biometrics.command.params;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricConstants.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bbva/plugin/biometrics/command/params/BiometricConstants;", "", "()V", "ERROR_CANCELED", "", "ERROR_HW_NOT_PRESENT", "ERROR_HW_UNAVAILABLE", "ERROR_LOCKOUT", "ERROR_LOCKOUT_PERMANENT", "ERROR_NEGATIVE_BUTTON", "ERROR_NO_BIOMETRICS", "ERROR_NO_DEVICE_CREDENTIAL", "ERROR_NO_SPACE", "ERROR_TIMEOUT", "ERROR_UNABLE_TO_PROCESS", "ERROR_USER_CANCELED", "ERROR_VENDOR", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BiometricConstants {
    public static final int ERROR_CANCELED = 5;
    public static final int ERROR_HW_NOT_PRESENT = 12;
    public static final int ERROR_HW_UNAVAILABLE = 1;
    public static final int ERROR_LOCKOUT = 7;
    public static final int ERROR_LOCKOUT_PERMANENT = 9;
    public static final int ERROR_NEGATIVE_BUTTON = 13;
    public static final int ERROR_NO_BIOMETRICS = 11;
    public static final int ERROR_NO_DEVICE_CREDENTIAL = 14;
    public static final int ERROR_NO_SPACE = 4;
    public static final int ERROR_TIMEOUT = 3;
    public static final int ERROR_UNABLE_TO_PROCESS = 2;
    public static final int ERROR_USER_CANCELED = 10;
    public static final int ERROR_VENDOR = 8;

    @NotNull
    public static final BiometricConstants INSTANCE = new BiometricConstants();
}
