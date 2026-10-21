package com.bbva.biometrics.authenticator.data;

import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuthenticateResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "", "", "toString", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getState", "()I", "state", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "c", "getBiometricType", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "CipherNotSupported", "HwUnavailable", "NoHardware", "NoneEnrolled", "Success", "Unknown", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$Success;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$HwUnavailable;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$NoneEnrolled;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$NoHardware;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$CipherNotSupported;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$Unknown;", "biometrics_release"}, k = 1, mv = {1, 5, 1})
public abstract class AuthenticateResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String biometricType;

    /* JADX INFO: compiled from: AuthenticateResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$CipherNotSupported;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "description", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "(Ljava/lang/String;Ljava/lang/String;)V", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CipherNotSupported extends AuthenticateResult {
        public /* synthetic */ CipherNotSupported(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "This device doesn't support cipher operations" : str, str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CipherNotSupported(@NotNull String description, @NotNull String biometricType) {
            super(-2, description, biometricType, null);
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        }
    }

    /* JADX INFO: compiled from: AuthenticateResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$HwUnavailable;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "state", "", "description", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "(ILjava/lang/String;Ljava/lang/String;)V", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class HwUnavailable extends AuthenticateResult {
        public /* synthetic */ HwUnavailable(int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? "Hardware unavailable" : str, str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HwUnavailable(int i10, @NotNull String description, @NotNull String biometricType) {
            super(i10, description, biometricType, null);
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        }
    }

    /* JADX INFO: compiled from: AuthenticateResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$NoHardware;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "state", "", "description", "", "(ILjava/lang/String;)V", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NoHardware extends AuthenticateResult {
        public /* synthetic */ NoHardware(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? "No hardware" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoHardware(int i10, @NotNull String description) {
            super(i10, description, BiometricType.NONE.getValue(), null);
            Intrinsics.checkNotNullParameter(description, "description");
        }
    }

    /* JADX INFO: compiled from: AuthenticateResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$NoneEnrolled;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "state", "", "description", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "(ILjava/lang/String;Ljava/lang/String;)V", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NoneEnrolled extends AuthenticateResult {
        public /* synthetic */ NoneEnrolled(int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? "None enrolled" : str, str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoneEnrolled(int i10, @NotNull String description, @NotNull String biometricType) {
            super(i10, description, biometricType, null);
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        }
    }

    /* JADX INFO: compiled from: AuthenticateResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$Success;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "state", "", "description", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "(ILjava/lang/String;Ljava/lang/String;)V", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Success extends AuthenticateResult {
        public /* synthetic */ Success(int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? "Success" : str, str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(int i10, @NotNull String description, @NotNull String biometricType) {
            super(i10, description, biometricType, null);
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        }
    }

    /* JADX INFO: compiled from: AuthenticateResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/biometrics/authenticator/data/AuthenticateResult$Unknown;", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "state", "", "description", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "(ILjava/lang/String;Ljava/lang/String;)V", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unknown extends AuthenticateResult {
        public /* synthetic */ Unknown(int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? "Unknown error" : str, str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(int i10, @NotNull String description, @NotNull String biometricType) {
            super(i10, description, biometricType, null);
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        }
    }

    public AuthenticateResult(int i10, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.state = i10;
        this.description = str;
        this.biometricType = str2;
    }

    @NotNull
    public final String getBiometricType() {
        return this.biometricType;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public String toString() {
        return "state: " + this.state + ", description: " + this.description + ", type: " + this.biometricType;
    }
}
