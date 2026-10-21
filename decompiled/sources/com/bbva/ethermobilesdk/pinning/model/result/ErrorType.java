package com.bbva.ethermobilesdk.pinning.model.result;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PinningResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\r\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "ConfigurationValidationFailed", "HostCommonNameNotFound", "HostNoMatch", "HostServerCertificatesNotFound", "HostUnknownError", "SignatureIsNotPresent", "TrustDateAfterValidity", "TrustDateBeforeValidity", "TrustMangerNotAvailable", "TrustServerHandshakeError", "TrustUnknownError", "TrustVerifierInitError", "UpdateCatalogError", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$ConfigurationValidationFailed;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$HostCommonNameNotFound;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$HostNoMatch;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$HostServerCertificatesNotFound;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$HostUnknownError;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$SignatureIsNotPresent;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustDateAfterValidity;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustDateBeforeValidity;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustMangerNotAvailable;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustServerHandshakeError;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustUnknownError;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustVerifierInitError;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$UpdateCatalogError;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ErrorType {

    @NotNull
    private final String description;

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$ConfigurationValidationFailed;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "()V", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConfigurationValidationFailed extends ErrorType {

        @NotNull
        public static final ConfigurationValidationFailed INSTANCE = new ConfigurationValidationFailed();

        private ConfigurationValidationFailed() {
            super("Cannot verify the catalog file.", null);
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$HostCommonNameNotFound;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "host", "", "(Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HostCommonNameNotFound extends ErrorType {

        @NotNull
        private final String host;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HostCommonNameNotFound(@NotNull String host) {
            super("Certificate for host [" + host + "] doesn't contain CN or DNS subjectAlt", null);
            Intrinsics.checkNotNullParameter(host, "host");
            this.host = host;
        }

        public static /* synthetic */ HostCommonNameNotFound copy$default(HostCommonNameNotFound hostCommonNameNotFound, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hostCommonNameNotFound.host;
            }
            return hostCommonNameNotFound.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        @NotNull
        public final HostCommonNameNotFound copy(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            return new HostCommonNameNotFound(host);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HostCommonNameNotFound) && Intrinsics.areEqual(this.host, ((HostCommonNameNotFound) other).host);
        }

        @NotNull
        public final String getHost() {
            return this.host;
        }

        public int hashCode() {
            return this.host.hashCode();
        }

        @NotNull
        public String toString() {
            return h0.b("HostCommonNameNotFound(host=", this.host, ")");
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$HostNoMatch;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "host", "", "certificate", "(Ljava/lang/String;Ljava/lang/String;)V", "getCertificate", "()Ljava/lang/String;", "getHost", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HostNoMatch extends ErrorType {

        @NotNull
        private final String certificate;

        @NotNull
        private final String host;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HostNoMatch(@NotNull String host, @NotNull String certificate) {
            super(c.b(new StringBuilder("Hostname verification failed for host ["), host, "] against [", certificate, "]."), null);
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            this.host = host;
            this.certificate = certificate;
        }

        public static /* synthetic */ HostNoMatch copy$default(HostNoMatch hostNoMatch, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hostNoMatch.host;
            }
            if ((i10 & 2) != 0) {
                str2 = hostNoMatch.certificate;
            }
            return hostNoMatch.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCertificate() {
            return this.certificate;
        }

        @NotNull
        public final HostNoMatch copy(@NotNull String host, @NotNull String certificate) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            return new HostNoMatch(host, certificate);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HostNoMatch)) {
                return false;
            }
            HostNoMatch hostNoMatch = (HostNoMatch) other;
            return Intrinsics.areEqual(this.host, hostNoMatch.host) && Intrinsics.areEqual(this.certificate, hostNoMatch.certificate);
        }

        @NotNull
        public final String getCertificate() {
            return this.certificate;
        }

        @NotNull
        public final String getHost() {
            return this.host;
        }

        public int hashCode() {
            return this.certificate.hashCode() + (this.host.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return u.g("HostNoMatch(host=", this.host, ", certificate=", this.certificate, ")");
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$HostServerCertificatesNotFound;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "()V", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HostServerCertificatesNotFound extends ErrorType {

        @NotNull
        public static final HostServerCertificatesNotFound INSTANCE = new HostServerCertificatesNotFound();

        private HostServerCertificatesNotFound() {
            super("Server certificates list is empty", null);
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$HostUnknownError;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "()V", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HostUnknownError extends ErrorType {

        @NotNull
        public static final HostUnknownError INSTANCE = new HostUnknownError();

        private HostUnknownError() {
            super("An unexpected error has happened while trying to verify the hostname", null);
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$SignatureIsNotPresent;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "()V", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SignatureIsNotPresent extends ErrorType {

        @NotNull
        public static final SignatureIsNotPresent INSTANCE = new SignatureIsNotPresent();

        private SignatureIsNotPresent() {
            super("Error signature is not present.", null);
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustDateAfterValidity;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "date", "Ljava/util/Date;", "(Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TrustDateAfterValidity extends ErrorType {

        @NotNull
        private final Date date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustDateAfterValidity(@NotNull Date date) {
            super("Certificate expired on " + date, null);
            Intrinsics.checkNotNullParameter(date, "date");
            this.date = date;
        }

        public static /* synthetic */ TrustDateAfterValidity copy$default(TrustDateAfterValidity trustDateAfterValidity, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                date = trustDateAfterValidity.date;
            }
            return trustDateAfterValidity.copy(date);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        @NotNull
        public final TrustDateAfterValidity copy(@NotNull Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return new TrustDateAfterValidity(date);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrustDateAfterValidity) && Intrinsics.areEqual(this.date, ((TrustDateAfterValidity) other).date);
        }

        @NotNull
        public final Date getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        @NotNull
        public String toString() {
            return "TrustDateAfterValidity(date=" + this.date + ")";
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustDateBeforeValidity;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "date", "Ljava/util/Date;", "(Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TrustDateBeforeValidity extends ErrorType {

        @NotNull
        private final Date date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustDateBeforeValidity(@NotNull Date date) {
            super("Certificate not valid until " + date, null);
            Intrinsics.checkNotNullParameter(date, "date");
            this.date = date;
        }

        public static /* synthetic */ TrustDateBeforeValidity copy$default(TrustDateBeforeValidity trustDateBeforeValidity, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                date = trustDateBeforeValidity.date;
            }
            return trustDateBeforeValidity.copy(date);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        @NotNull
        public final TrustDateBeforeValidity copy(@NotNull Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return new TrustDateBeforeValidity(date);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrustDateBeforeValidity) && Intrinsics.areEqual(this.date, ((TrustDateBeforeValidity) other).date);
        }

        @NotNull
        public final Date getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        @NotNull
        public String toString() {
            return "TrustDateBeforeValidity(date=" + this.date + ")";
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustMangerNotAvailable;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "()V", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TrustMangerNotAvailable extends ErrorType {

        @NotNull
        public static final TrustMangerNotAvailable INSTANCE = new TrustMangerNotAvailable();

        private TrustMangerNotAvailable() {
            super("Error initialising verifier. No X509TrustManager implementations available.", null);
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustServerHandshakeError;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TrustServerHandshakeError extends ErrorType {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustServerHandshakeError(@NotNull String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ TrustServerHandshakeError copy$default(TrustServerHandshakeError trustServerHandshakeError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = trustServerHandshakeError.message;
            }
            return trustServerHandshakeError.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final TrustServerHandshakeError copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new TrustServerHandshakeError(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrustServerHandshakeError) && Intrinsics.areEqual(this.message, ((TrustServerHandshakeError) other).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return h0.b("TrustServerHandshakeError(message=", this.message, ")");
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustUnknownError;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "()V", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TrustUnknownError extends ErrorType {

        @NotNull
        public static final TrustUnknownError INSTANCE = new TrustUnknownError();

        private TrustUnknownError() {
            super("An unexpected error has happened while trying to verify the server trust", null);
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$TrustVerifierInitError;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TrustVerifierInitError extends ErrorType {

        @Nullable
        private final String message;

        public TrustVerifierInitError(@Nullable String str) {
            super(str == null ? "Trust verifier is not available" : str, null);
            this.message = str;
        }

        public static /* synthetic */ TrustVerifierInitError copy$default(TrustVerifierInitError trustVerifierInitError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = trustVerifierInitError.message;
            }
            return trustVerifierInitError.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final TrustVerifierInitError copy(@Nullable String message) {
            return new TrustVerifierInitError(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrustVerifierInitError) && Intrinsics.areEqual(this.message, ((TrustVerifierInitError) other).message);
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return h0.b("TrustVerifierInitError(message=", this.message, ")");
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType$UpdateCatalogError;", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UpdateCatalogError extends ErrorType {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateCatalogError(@NotNull Throwable cause) {
            super(f.d("There has been an error updating the catalog. ", cause.getLocalizedMessage()), null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public static /* synthetic */ UpdateCatalogError copy$default(UpdateCatalogError updateCatalogError, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = updateCatalogError.cause;
            }
            return updateCatalogError.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final UpdateCatalogError copy(@NotNull Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new UpdateCatalogError(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateCatalogError) && Intrinsics.areEqual(this.cause, ((UpdateCatalogError) other).cause);
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateCatalogError(cause=" + this.cause + ")";
        }
    }

    public /* synthetic */ ErrorType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    private ErrorType(String str) {
        this.description = str;
    }
}
