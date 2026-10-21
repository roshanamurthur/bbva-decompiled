package com.bbva.component.dm.biometriclogin.presentation.model;

import ad.d;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginState.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "", "()V", "AccessingBiometrics", "All", "Basic", "BiometricsError", "BiometricsFriendlyFraudError", "BiometricsRetryEndError", "BiometricsRetryError", "BiometricsServerError", "Biometry", "CompleteBiometry", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$AccessingBiometrics;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$All;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$Basic;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsFriendlyFraudError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsRetryEndError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsRetryError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsServerError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$Biometry;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$CompleteBiometry;", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LoginState {

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$AccessingBiometrics;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AccessingBiometrics extends LoginState {

        @NotNull
        public static final AccessingBiometrics INSTANCE = new AccessingBiometrics();

        public AccessingBiometrics() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccessingBiometrics)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1149979629;
        }

        @NotNull
        public String toString() {
            return "AccessingBiometrics";
        }
    }

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$All;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class All extends LoginState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public All(@NotNull String biometricType) {
            super(null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ All copy$default(All all, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = all.biometricType;
            }
            return all.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final All copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new All(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof All) && Intrinsics.areEqual(this.biometricType, ((All) other).biometricType);
        }

        @NotNull
        public final String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("All(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$Basic;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Basic extends LoginState {

        @NotNull
        public static final Basic INSTANCE = new Basic();

        public Basic() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Basic)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1537063362;
        }

        @NotNull
        public String toString() {
            return "Basic";
        }
    }

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BiometricsError extends LoginState {

        @NotNull
        public static final BiometricsError INSTANCE = new BiometricsError();

        public BiometricsError() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BiometricsError)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -2085597023;
        }

        @NotNull
        public String toString() {
            return "BiometricsError";
        }
    }

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsFriendlyFraudError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BiometricsFriendlyFraudError extends LoginState {

        @NotNull
        public static final BiometricsFriendlyFraudError INSTANCE = new BiometricsFriendlyFraudError();

        public BiometricsFriendlyFraudError() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BiometricsFriendlyFraudError)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -147979498;
        }

        @NotNull
        public String toString() {
            return "BiometricsFriendlyFraudError";
        }
    }

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsRetryEndError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BiometricsRetryEndError extends LoginState {

        @NotNull
        public static final BiometricsRetryEndError INSTANCE = new BiometricsRetryEndError();

        public BiometricsRetryEndError() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BiometricsRetryEndError)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1412047282;
        }

        @NotNull
        public String toString() {
            return "BiometricsRetryEndError";
        }
    }

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsRetryError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BiometricsRetryError extends LoginState {

        @NotNull
        public static final BiometricsRetryError INSTANCE = new BiometricsRetryError();

        public BiometricsRetryError() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BiometricsRetryError)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1063772487;
        }

        @NotNull
        public String toString() {
            return "BiometricsRetryError";
        }
    }

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$BiometricsServerError;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BiometricsServerError extends LoginState {

        @NotNull
        public static final BiometricsServerError INSTANCE = new BiometricsServerError();

        public BiometricsServerError() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BiometricsServerError)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -506975138;
        }

        @NotNull
        public String toString() {
            return "BiometricsServerError";
        }
    }

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$Biometry;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Biometry extends LoginState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Biometry(@NotNull String biometricType) {
            super(null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ Biometry copy$default(Biometry biometry, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = biometry.biometricType;
            }
            return biometry.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final Biometry copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new Biometry(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Biometry) && Intrinsics.areEqual(this.biometricType, ((Biometry) other).biometricType);
        }

        @NotNull
        public final String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Biometry(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: LoginState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState$CompleteBiometry;", "Lcom/bbva/component/dm/biometriclogin/presentation/model/LoginState;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class CompleteBiometry extends LoginState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompleteBiometry(@NotNull String biometricType) {
            super(null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ CompleteBiometry copy$default(CompleteBiometry completeBiometry, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = completeBiometry.biometricType;
            }
            return completeBiometry.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final CompleteBiometry copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new CompleteBiometry(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CompleteBiometry) && Intrinsics.areEqual(this.biometricType, ((CompleteBiometry) other).biometricType);
        }

        @NotNull
        public final String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("CompleteBiometry(biometricType="), this.biometricType, ")");
        }
    }

    public LoginState() {
    }

    public /* synthetic */ LoginState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
