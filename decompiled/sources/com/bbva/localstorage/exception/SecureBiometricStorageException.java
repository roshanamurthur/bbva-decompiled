package com.bbva.localstorage.exception;

import ad.d;
import androidx.annotation.Keep;
import com.bbva.biometrics.authenticator.data.BiometricType;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import com.mypinpad.tsdk.isolation.z1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecureBiometricStorageException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002:\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getError", "()Ljava/lang/String;", "BiometricsException", "InvalidSecureDataStorage", "KeyPermanentlyInvalidatedException", "SecureDataStorageNotFound", "SecureKeyDecryption", "SecureKeyEncryption", "UnknownError", "UnsecuredHardware", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SecureBiometricStorageException extends Exception {

    @Nullable
    private final Throwable cause;

    @NotNull
    private final String error;

    /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0011!\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException;", "state", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "description", "", "(ILjava/util/List;Ljava/lang/String;)V", "getBiometricType", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getState", "()I", "BiometricUnknown", ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED, "CipherNotSupported", "HwUnavailable", "Lockout", "LockoutPermanent", "NegativeButton", "NoDeviceCredential", "NoHardware", "NoSpace", "NoneEnrolled", "SecurityUpdate", "Timeout", "UnableToProcess", "Unsupported", "UserCanceled", "Vendor", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$BiometricUnknown;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Canceled;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$CipherNotSupported;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$HwUnavailable;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Lockout;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$LockoutPermanent;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NegativeButton;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NoDeviceCredential;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NoHardware;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NoSpace;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NoneEnrolled;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$SecurityUpdate;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Timeout;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$UnableToProcess;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Unsupported;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$UserCanceled;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Vendor;", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class BiometricsException extends SecureBiometricStorageException {

        @Nullable
        private final List<BiometricType> biometricType;

        @NotNull
        private final String description;
        private final int state;

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$BiometricUnknown;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "description", "", "(ILjava/util/List;Ljava/lang/String;)V", "getBiometricType", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class BiometricUnknown extends BiometricsException {

            @Nullable
            private final List<BiometricType> biometricType;

            @NotNull
            private final String description;
            private final int state;

            public /* synthetic */ BiometricUnknown(int i10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, (i11 & 2) != 0 ? null : list, str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ BiometricUnknown copy$default(BiometricUnknown biometricUnknown, int i10, List list, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = biometricUnknown.getState();
                }
                if ((i11 & 2) != 0) {
                    list = biometricUnknown.getBiometricType();
                }
                if ((i11 & 4) != 0) {
                    str = biometricUnknown.getDescription();
                }
                return biometricUnknown.copy(i10, list, str);
            }

            public final int component1() {
                return getState();
            }

            @Nullable
            public final List<BiometricType> component2() {
                return getBiometricType();
            }

            @NotNull
            public final String component3() {
                return getDescription();
            }

            @NotNull
            public final BiometricUnknown copy(int state, @Nullable List<? extends BiometricType> biometricType, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new BiometricUnknown(state, biometricType, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BiometricUnknown)) {
                    return false;
                }
                BiometricUnknown biometricUnknown = (BiometricUnknown) other;
                return getState() == biometricUnknown.getState() && Intrinsics.areEqual(getBiometricType(), biometricUnknown.getBiometricType()) && Intrinsics.areEqual(getDescription(), biometricUnknown.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @Nullable
            public List<BiometricType> getBiometricType() {
                return this.biometricType;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (((getState() * 31) + (getBiometricType() == null ? 0 : getBiometricType().hashCode())) * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                int state = getState();
                List<BiometricType> biometricType = getBiometricType();
                String description = getDescription();
                StringBuilder sb2 = new StringBuilder("BiometricUnknown(state=");
                sb2.append(state);
                sb2.append(", biometricType=");
                sb2.append(biometricType);
                sb2.append(", description=");
                return d.f(sb2, description, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public BiometricUnknown(int i10, @Nullable List<? extends BiometricType> list, @NotNull String description) {
                super(i10, list, description, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.biometricType = list;
                this.description = description;
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Canceled;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Canceled extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Canceled(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ Canceled copy$default(Canceled canceled, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = canceled.getState();
                }
                if ((i11 & 2) != 0) {
                    str = canceled.getDescription();
                }
                return canceled.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final Canceled copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new Canceled(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Canceled)) {
                    return false;
                }
                Canceled canceled = (Canceled) other;
                return getState() == canceled.getState() && Intrinsics.areEqual(getDescription(), canceled.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("Canceled(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$CipherNotSupported;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "description", "", "(ILjava/util/List;Ljava/lang/String;)V", "getBiometricType", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class CipherNotSupported extends BiometricsException {

            @Nullable
            private final List<BiometricType> biometricType;

            @NotNull
            private final String description;
            private final int state;

            public /* synthetic */ CipherNotSupported(int i10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, (i11 & 2) != 0 ? null : list, str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CipherNotSupported copy$default(CipherNotSupported cipherNotSupported, int i10, List list, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = cipherNotSupported.getState();
                }
                if ((i11 & 2) != 0) {
                    list = cipherNotSupported.getBiometricType();
                }
                if ((i11 & 4) != 0) {
                    str = cipherNotSupported.getDescription();
                }
                return cipherNotSupported.copy(i10, list, str);
            }

            public final int component1() {
                return getState();
            }

            @Nullable
            public final List<BiometricType> component2() {
                return getBiometricType();
            }

            @NotNull
            public final String component3() {
                return getDescription();
            }

            @NotNull
            public final CipherNotSupported copy(int state, @Nullable List<? extends BiometricType> biometricType, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new CipherNotSupported(state, biometricType, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CipherNotSupported)) {
                    return false;
                }
                CipherNotSupported cipherNotSupported = (CipherNotSupported) other;
                return getState() == cipherNotSupported.getState() && Intrinsics.areEqual(getBiometricType(), cipherNotSupported.getBiometricType()) && Intrinsics.areEqual(getDescription(), cipherNotSupported.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @Nullable
            public List<BiometricType> getBiometricType() {
                return this.biometricType;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (((getState() * 31) + (getBiometricType() == null ? 0 : getBiometricType().hashCode())) * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                int state = getState();
                List<BiometricType> biometricType = getBiometricType();
                String description = getDescription();
                StringBuilder sb2 = new StringBuilder("CipherNotSupported(state=");
                sb2.append(state);
                sb2.append(", biometricType=");
                sb2.append(biometricType);
                sb2.append(", description=");
                return d.f(sb2, description, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public CipherNotSupported(int i10, @Nullable List<? extends BiometricType> list, @NotNull String description) {
                super(i10, list, description, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.biometricType = list;
                this.description = description;
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$HwUnavailable;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "description", "", "(ILjava/util/List;Ljava/lang/String;)V", "getBiometricType", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class HwUnavailable extends BiometricsException {

            @Nullable
            private final List<BiometricType> biometricType;

            @NotNull
            private final String description;
            private final int state;

            public /* synthetic */ HwUnavailable(int i10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, (i11 & 2) != 0 ? null : list, str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HwUnavailable copy$default(HwUnavailable hwUnavailable, int i10, List list, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = hwUnavailable.getState();
                }
                if ((i11 & 2) != 0) {
                    list = hwUnavailable.getBiometricType();
                }
                if ((i11 & 4) != 0) {
                    str = hwUnavailable.getDescription();
                }
                return hwUnavailable.copy(i10, list, str);
            }

            public final int component1() {
                return getState();
            }

            @Nullable
            public final List<BiometricType> component2() {
                return getBiometricType();
            }

            @NotNull
            public final String component3() {
                return getDescription();
            }

            @NotNull
            public final HwUnavailable copy(int state, @Nullable List<? extends BiometricType> biometricType, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new HwUnavailable(state, biometricType, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HwUnavailable)) {
                    return false;
                }
                HwUnavailable hwUnavailable = (HwUnavailable) other;
                return getState() == hwUnavailable.getState() && Intrinsics.areEqual(getBiometricType(), hwUnavailable.getBiometricType()) && Intrinsics.areEqual(getDescription(), hwUnavailable.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @Nullable
            public List<BiometricType> getBiometricType() {
                return this.biometricType;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (((getState() * 31) + (getBiometricType() == null ? 0 : getBiometricType().hashCode())) * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                int state = getState();
                List<BiometricType> biometricType = getBiometricType();
                String description = getDescription();
                StringBuilder sb2 = new StringBuilder("HwUnavailable(state=");
                sb2.append(state);
                sb2.append(", biometricType=");
                sb2.append(biometricType);
                sb2.append(", description=");
                return d.f(sb2, description, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public HwUnavailable(int i10, @Nullable List<? extends BiometricType> list, @NotNull String description) {
                super(i10, list, description, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.biometricType = list;
                this.description = description;
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Lockout;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Lockout extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Lockout(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ Lockout copy$default(Lockout lockout, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = lockout.getState();
                }
                if ((i11 & 2) != 0) {
                    str = lockout.getDescription();
                }
                return lockout.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final Lockout copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new Lockout(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Lockout)) {
                    return false;
                }
                Lockout lockout = (Lockout) other;
                return getState() == lockout.getState() && Intrinsics.areEqual(getDescription(), lockout.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("Lockout(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$LockoutPermanent;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class LockoutPermanent extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LockoutPermanent(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ LockoutPermanent copy$default(LockoutPermanent lockoutPermanent, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = lockoutPermanent.getState();
                }
                if ((i11 & 2) != 0) {
                    str = lockoutPermanent.getDescription();
                }
                return lockoutPermanent.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final LockoutPermanent copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new LockoutPermanent(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LockoutPermanent)) {
                    return false;
                }
                LockoutPermanent lockoutPermanent = (LockoutPermanent) other;
                return getState() == lockoutPermanent.getState() && Intrinsics.areEqual(getDescription(), lockoutPermanent.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("LockoutPermanent(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NegativeButton;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class NegativeButton extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NegativeButton(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ NegativeButton copy$default(NegativeButton negativeButton, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = negativeButton.getState();
                }
                if ((i11 & 2) != 0) {
                    str = negativeButton.getDescription();
                }
                return negativeButton.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final NegativeButton copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new NegativeButton(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NegativeButton)) {
                    return false;
                }
                NegativeButton negativeButton = (NegativeButton) other;
                return getState() == negativeButton.getState() && Intrinsics.areEqual(getDescription(), negativeButton.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("NegativeButton(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NoDeviceCredential;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class NoDeviceCredential extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoDeviceCredential(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ NoDeviceCredential copy$default(NoDeviceCredential noDeviceCredential, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = noDeviceCredential.getState();
                }
                if ((i11 & 2) != 0) {
                    str = noDeviceCredential.getDescription();
                }
                return noDeviceCredential.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final NoDeviceCredential copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new NoDeviceCredential(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoDeviceCredential)) {
                    return false;
                }
                NoDeviceCredential noDeviceCredential = (NoDeviceCredential) other;
                return getState() == noDeviceCredential.getState() && Intrinsics.areEqual(getDescription(), noDeviceCredential.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("NoDeviceCredential(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NoHardware;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "description", "", "(ILjava/util/List;Ljava/lang/String;)V", "getBiometricType", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class NoHardware extends BiometricsException {

            @Nullable
            private final List<BiometricType> biometricType;

            @NotNull
            private final String description;
            private final int state;

            public /* synthetic */ NoHardware(int i10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, (i11 & 2) != 0 ? null : list, str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ NoHardware copy$default(NoHardware noHardware, int i10, List list, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = noHardware.getState();
                }
                if ((i11 & 2) != 0) {
                    list = noHardware.getBiometricType();
                }
                if ((i11 & 4) != 0) {
                    str = noHardware.getDescription();
                }
                return noHardware.copy(i10, list, str);
            }

            public final int component1() {
                return getState();
            }

            @Nullable
            public final List<BiometricType> component2() {
                return getBiometricType();
            }

            @NotNull
            public final String component3() {
                return getDescription();
            }

            @NotNull
            public final NoHardware copy(int state, @Nullable List<? extends BiometricType> biometricType, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new NoHardware(state, biometricType, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoHardware)) {
                    return false;
                }
                NoHardware noHardware = (NoHardware) other;
                return getState() == noHardware.getState() && Intrinsics.areEqual(getBiometricType(), noHardware.getBiometricType()) && Intrinsics.areEqual(getDescription(), noHardware.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @Nullable
            public List<BiometricType> getBiometricType() {
                return this.biometricType;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (((getState() * 31) + (getBiometricType() == null ? 0 : getBiometricType().hashCode())) * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                int state = getState();
                List<BiometricType> biometricType = getBiometricType();
                String description = getDescription();
                StringBuilder sb2 = new StringBuilder("NoHardware(state=");
                sb2.append(state);
                sb2.append(", biometricType=");
                sb2.append(biometricType);
                sb2.append(", description=");
                return d.f(sb2, description, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public NoHardware(int i10, @Nullable List<? extends BiometricType> list, @NotNull String description) {
                super(i10, list, description, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.biometricType = list;
                this.description = description;
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NoSpace;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class NoSpace extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoSpace(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ NoSpace copy$default(NoSpace noSpace, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = noSpace.getState();
                }
                if ((i11 & 2) != 0) {
                    str = noSpace.getDescription();
                }
                return noSpace.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final NoSpace copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new NoSpace(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoSpace)) {
                    return false;
                }
                NoSpace noSpace = (NoSpace) other;
                return getState() == noSpace.getState() && Intrinsics.areEqual(getDescription(), noSpace.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("NoSpace(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$NoneEnrolled;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "description", "", "(ILjava/util/List;Ljava/lang/String;)V", "getBiometricType", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class NoneEnrolled extends BiometricsException {

            @Nullable
            private final List<BiometricType> biometricType;

            @NotNull
            private final String description;
            private final int state;

            public /* synthetic */ NoneEnrolled(int i10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, (i11 & 2) != 0 ? null : list, str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ NoneEnrolled copy$default(NoneEnrolled noneEnrolled, int i10, List list, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = noneEnrolled.getState();
                }
                if ((i11 & 2) != 0) {
                    list = noneEnrolled.getBiometricType();
                }
                if ((i11 & 4) != 0) {
                    str = noneEnrolled.getDescription();
                }
                return noneEnrolled.copy(i10, list, str);
            }

            public final int component1() {
                return getState();
            }

            @Nullable
            public final List<BiometricType> component2() {
                return getBiometricType();
            }

            @NotNull
            public final String component3() {
                return getDescription();
            }

            @NotNull
            public final NoneEnrolled copy(int state, @Nullable List<? extends BiometricType> biometricType, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new NoneEnrolled(state, biometricType, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoneEnrolled)) {
                    return false;
                }
                NoneEnrolled noneEnrolled = (NoneEnrolled) other;
                return getState() == noneEnrolled.getState() && Intrinsics.areEqual(getBiometricType(), noneEnrolled.getBiometricType()) && Intrinsics.areEqual(getDescription(), noneEnrolled.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @Nullable
            public List<BiometricType> getBiometricType() {
                return this.biometricType;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (((getState() * 31) + (getBiometricType() == null ? 0 : getBiometricType().hashCode())) * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                int state = getState();
                List<BiometricType> biometricType = getBiometricType();
                String description = getDescription();
                StringBuilder sb2 = new StringBuilder("NoneEnrolled(state=");
                sb2.append(state);
                sb2.append(", biometricType=");
                sb2.append(biometricType);
                sb2.append(", description=");
                return d.f(sb2, description, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public NoneEnrolled(int i10, @Nullable List<? extends BiometricType> list, @NotNull String description) {
                super(i10, list, description, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.biometricType = list;
                this.description = description;
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$SecurityUpdate;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "description", "", "(ILjava/util/List;Ljava/lang/String;)V", "getBiometricType", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class SecurityUpdate extends BiometricsException {

            @Nullable
            private final List<BiometricType> biometricType;

            @NotNull
            private final String description;
            private final int state;

            public /* synthetic */ SecurityUpdate(int i10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, (i11 & 2) != 0 ? null : list, str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SecurityUpdate copy$default(SecurityUpdate securityUpdate, int i10, List list, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = securityUpdate.getState();
                }
                if ((i11 & 2) != 0) {
                    list = securityUpdate.getBiometricType();
                }
                if ((i11 & 4) != 0) {
                    str = securityUpdate.getDescription();
                }
                return securityUpdate.copy(i10, list, str);
            }

            public final int component1() {
                return getState();
            }

            @Nullable
            public final List<BiometricType> component2() {
                return getBiometricType();
            }

            @NotNull
            public final String component3() {
                return getDescription();
            }

            @NotNull
            public final SecurityUpdate copy(int state, @Nullable List<? extends BiometricType> biometricType, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new SecurityUpdate(state, biometricType, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SecurityUpdate)) {
                    return false;
                }
                SecurityUpdate securityUpdate = (SecurityUpdate) other;
                return getState() == securityUpdate.getState() && Intrinsics.areEqual(getBiometricType(), securityUpdate.getBiometricType()) && Intrinsics.areEqual(getDescription(), securityUpdate.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @Nullable
            public List<BiometricType> getBiometricType() {
                return this.biometricType;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (((getState() * 31) + (getBiometricType() == null ? 0 : getBiometricType().hashCode())) * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                int state = getState();
                List<BiometricType> biometricType = getBiometricType();
                String description = getDescription();
                StringBuilder sb2 = new StringBuilder("SecurityUpdate(state=");
                sb2.append(state);
                sb2.append(", biometricType=");
                sb2.append(biometricType);
                sb2.append(", description=");
                return d.f(sb2, description, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public SecurityUpdate(int i10, @Nullable List<? extends BiometricType> list, @NotNull String description) {
                super(i10, list, description, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.biometricType = list;
                this.description = description;
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Timeout;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Timeout extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Timeout(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ Timeout copy$default(Timeout timeout, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = timeout.getState();
                }
                if ((i11 & 2) != 0) {
                    str = timeout.getDescription();
                }
                return timeout.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final Timeout copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new Timeout(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Timeout)) {
                    return false;
                }
                Timeout timeout = (Timeout) other;
                return getState() == timeout.getState() && Intrinsics.areEqual(getDescription(), timeout.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("Timeout(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$UnableToProcess;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class UnableToProcess extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnableToProcess(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ UnableToProcess copy$default(UnableToProcess unableToProcess, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = unableToProcess.getState();
                }
                if ((i11 & 2) != 0) {
                    str = unableToProcess.getDescription();
                }
                return unableToProcess.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final UnableToProcess copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new UnableToProcess(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UnableToProcess)) {
                    return false;
                }
                UnableToProcess unableToProcess = (UnableToProcess) other;
                return getState() == unableToProcess.getState() && Intrinsics.areEqual(getDescription(), unableToProcess.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("UnableToProcess(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Unsupported;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "", "Lcom/bbva/biometrics/authenticator/data/BiometricType;", "description", "", "(ILjava/util/List;Ljava/lang/String;)V", "getBiometricType", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Unsupported extends BiometricsException {

            @Nullable
            private final List<BiometricType> biometricType;

            @NotNull
            private final String description;
            private final int state;

            public /* synthetic */ Unsupported(int i10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, (i11 & 2) != 0 ? null : list, str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Unsupported copy$default(Unsupported unsupported, int i10, List list, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = unsupported.getState();
                }
                if ((i11 & 2) != 0) {
                    list = unsupported.getBiometricType();
                }
                if ((i11 & 4) != 0) {
                    str = unsupported.getDescription();
                }
                return unsupported.copy(i10, list, str);
            }

            public final int component1() {
                return getState();
            }

            @Nullable
            public final List<BiometricType> component2() {
                return getBiometricType();
            }

            @NotNull
            public final String component3() {
                return getDescription();
            }

            @NotNull
            public final Unsupported copy(int state, @Nullable List<? extends BiometricType> biometricType, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new Unsupported(state, biometricType, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unsupported)) {
                    return false;
                }
                Unsupported unsupported = (Unsupported) other;
                return getState() == unsupported.getState() && Intrinsics.areEqual(getBiometricType(), unsupported.getBiometricType()) && Intrinsics.areEqual(getDescription(), unsupported.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @Nullable
            public List<BiometricType> getBiometricType() {
                return this.biometricType;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (((getState() * 31) + (getBiometricType() == null ? 0 : getBiometricType().hashCode())) * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                int state = getState();
                List<BiometricType> biometricType = getBiometricType();
                String description = getDescription();
                StringBuilder sb2 = new StringBuilder("Unsupported(state=");
                sb2.append(state);
                sb2.append(", biometricType=");
                sb2.append(biometricType);
                sb2.append(", description=");
                return d.f(sb2, description, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Unsupported(int i10, @Nullable List<? extends BiometricType> list, @NotNull String description) {
                super(i10, list, description, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.biometricType = list;
                this.description = description;
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$UserCanceled;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class UserCanceled extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserCanceled(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ UserCanceled copy$default(UserCanceled userCanceled, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = userCanceled.getState();
                }
                if ((i11 & 2) != 0) {
                    str = userCanceled.getDescription();
                }
                return userCanceled.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final UserCanceled copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new UserCanceled(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UserCanceled)) {
                    return false;
                }
                UserCanceled userCanceled = (UserCanceled) other;
                return getState() == userCanceled.getState() && Intrinsics.areEqual(getDescription(), userCanceled.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("UserCanceled(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException$Vendor;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException$BiometricsException;", "state", "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Vendor extends BiometricsException {

            @NotNull
            private final String description;
            private final int state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Vendor(int i10, @NotNull String description) {
                super(i10, null, description, 2, null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.state = i10;
                this.description = description;
            }

            public static /* synthetic */ Vendor copy$default(Vendor vendor, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = vendor.getState();
                }
                if ((i11 & 2) != 0) {
                    str = vendor.getDescription();
                }
                return vendor.copy(i10, str);
            }

            public final int component1() {
                return getState();
            }

            @NotNull
            public final String component2() {
                return getDescription();
            }

            @NotNull
            public final Vendor copy(int state, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new Vendor(state, description);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Vendor)) {
                    return false;
                }
                Vendor vendor = (Vendor) other;
                return getState() == vendor.getState() && Intrinsics.areEqual(getDescription(), vendor.getDescription());
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            @NotNull
            public String getDescription() {
                return this.description;
            }

            @Override // com.bbva.localstorage.exception.SecureBiometricStorageException.BiometricsException
            public int getState() {
                return this.state;
            }

            public int hashCode() {
                return getDescription().hashCode() + (getState() * 31);
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return z1.c("Vendor(state=", getState(), ", description=", getDescription(), ")");
            }
        }

        public /* synthetic */ BiometricsException(int i10, List list, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, list, str);
        }

        @Nullable
        public List<BiometricType> getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int getState() {
            return this.state;
        }

        public /* synthetic */ BiometricsException(int i10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : list, str, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private BiometricsException(int i10, List<? extends BiometricType> list, String str) {
            super(str, null, 2, 0 == true ? 1 : 0);
            this.state = i10;
            this.biometricType = list;
            this.description = str;
        }
    }

    /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$InvalidSecureDataStorage;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidSecureDataStorage extends SecureBiometricStorageException {

        @Nullable
        private final Throwable cause;

        /* JADX WARN: Multi-variable type inference failed */
        public InvalidSecureDataStorage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.bbva.localstorage.exception.SecureBiometricStorageException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        public /* synthetic */ InvalidSecureDataStorage(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : th2);
        }

        public InvalidSecureDataStorage(@Nullable Throwable th2) {
            super("Empty or null data cannot be validated", th2);
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$KeyPermanentlyInvalidatedException;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KeyPermanentlyInvalidatedException extends SecureBiometricStorageException {

        @Nullable
        private final Throwable cause;

        public KeyPermanentlyInvalidatedException(@Nullable Throwable th2) {
            super("Key permanently invalidated", th2);
            this.cause = th2;
        }

        @Override // com.bbva.localstorage.exception.SecureBiometricStorageException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$SecureDataStorageNotFound;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SecureDataStorageNotFound extends SecureBiometricStorageException {

        @Nullable
        private final Throwable cause;

        /* JADX WARN: Multi-variable type inference failed */
        public SecureDataStorageNotFound() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.bbva.localstorage.exception.SecureBiometricStorageException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        public /* synthetic */ SecureDataStorageNotFound(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : th2);
        }

        public SecureDataStorageNotFound(@Nullable Throwable th2) {
            super("Key cannot be found on storage", th2);
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$SecureKeyDecryption;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SecureKeyDecryption extends SecureBiometricStorageException {

        @Nullable
        private final Throwable cause;

        public SecureKeyDecryption(@Nullable Throwable th2) {
            super("A problem has just occur decrypting secure key", th2);
            this.cause = th2;
        }

        @Override // com.bbva.localstorage.exception.SecureBiometricStorageException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$SecureKeyEncryption;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SecureKeyEncryption extends SecureBiometricStorageException {

        @Nullable
        private final Throwable cause;

        public SecureKeyEncryption(@Nullable Throwable th2) {
            super("A problem has just occur creating secure key", th2);
            this.cause = th2;
        }

        @Override // com.bbva.localstorage.exception.SecureBiometricStorageException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$UnknownError;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownError extends SecureBiometricStorageException {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        public /* synthetic */ UnknownError(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : th2);
        }

        @Override // com.bbva.localstorage.exception.SecureBiometricStorageException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(@NotNull String message, @Nullable Throwable th2) {
            super(message, th2);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: SecureBiometricStorageException.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/localstorage/exception/SecureBiometricStorageException$UnsecuredHardware;", "Lcom/bbva/localstorage/exception/SecureBiometricStorageException;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnsecuredHardware extends SecureBiometricStorageException {

        @Nullable
        private final Throwable cause;

        /* JADX WARN: Multi-variable type inference failed */
        public UnsecuredHardware() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.bbva.localstorage.exception.SecureBiometricStorageException, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        public /* synthetic */ UnsecuredHardware(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : th2);
        }

        public UnsecuredHardware(@Nullable Throwable th2) {
            super("Hardware protection check is not passed", th2);
            this.cause = th2;
        }
    }

    public /* synthetic */ SecureBiometricStorageException(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureBiometricStorageException(@NotNull String error, @Nullable Throwable th2) {
        super(error);
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.cause = th2;
    }
}
