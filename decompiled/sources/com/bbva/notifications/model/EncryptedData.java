package com.bbva.notifications.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoPushData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/notifications/model/EncryptedData;", "", "()V", "AccountValidation", "PaymentRequest", "PaymentStatus", "Lcom/bbva/notifications/model/EncryptedData$AccountValidation;", "Lcom/bbva/notifications/model/EncryptedData$PaymentRequest;", "Lcom/bbva/notifications/model/EncryptedData$PaymentStatus;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class EncryptedData {

    /* JADX INFO: compiled from: BanxicoPushData.kt */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bbva/notifications/model/EncryptedData$AccountValidation;", "Lcom/bbva/notifications/model/EncryptedData;", "cipherInfo", "", "trackingKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getCipherInfo", "()Ljava/lang/String;", "getTrackingKey", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AccountValidation extends EncryptedData {

        @SerializedName("infCif")
        @NotNull
        private final String cipherInfo;

        @SerializedName("cr")
        @NotNull
        private final String trackingKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountValidation(@NotNull String cipherInfo, @NotNull String trackingKey) {
            super(null);
            Intrinsics.checkNotNullParameter(cipherInfo, "cipherInfo");
            Intrinsics.checkNotNullParameter(trackingKey, "trackingKey");
            this.cipherInfo = cipherInfo;
            this.trackingKey = trackingKey;
        }

        public static /* synthetic */ AccountValidation copy$default(AccountValidation accountValidation, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = accountValidation.cipherInfo;
            }
            if ((i10 & 2) != 0) {
                str2 = accountValidation.trackingKey;
            }
            return accountValidation.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCipherInfo() {
            return this.cipherInfo;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTrackingKey() {
            return this.trackingKey;
        }

        @NotNull
        public final AccountValidation copy(@NotNull String cipherInfo, @NotNull String trackingKey) {
            Intrinsics.checkNotNullParameter(cipherInfo, "cipherInfo");
            Intrinsics.checkNotNullParameter(trackingKey, "trackingKey");
            return new AccountValidation(cipherInfo, trackingKey);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountValidation)) {
                return false;
            }
            AccountValidation accountValidation = (AccountValidation) other;
            return Intrinsics.areEqual(this.cipherInfo, accountValidation.cipherInfo) && Intrinsics.areEqual(this.trackingKey, accountValidation.trackingKey);
        }

        @NotNull
        public final String getCipherInfo() {
            return this.cipherInfo;
        }

        @NotNull
        public final String getTrackingKey() {
            return this.trackingKey;
        }

        public int hashCode() {
            return this.trackingKey.hashCode() + (this.cipherInfo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return u.g("AccountValidation(cipherInfo=", this.cipherInfo, ", trackingKey=", this.trackingKey, ")");
        }
    }

    /* JADX INFO: compiled from: BanxicoPushData.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/notifications/model/EncryptedData$PaymentRequest;", "Lcom/bbva/notifications/model/EncryptedData;", "cipherInfo", "Lcom/bbva/notifications/model/CipherInfo;", "(Lcom/bbva/notifications/model/CipherInfo;)V", "getCipherInfo", "()Lcom/bbva/notifications/model/CipherInfo;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentRequest extends EncryptedData {

        @SerializedName("infoCif")
        @NotNull
        private final CipherInfo cipherInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentRequest(@NotNull CipherInfo cipherInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(cipherInfo, "cipherInfo");
            this.cipherInfo = cipherInfo;
        }

        public static /* synthetic */ PaymentRequest copy$default(PaymentRequest paymentRequest, CipherInfo cipherInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cipherInfo = paymentRequest.cipherInfo;
            }
            return paymentRequest.copy(cipherInfo);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CipherInfo getCipherInfo() {
            return this.cipherInfo;
        }

        @NotNull
        public final PaymentRequest copy(@NotNull CipherInfo cipherInfo) {
            Intrinsics.checkNotNullParameter(cipherInfo, "cipherInfo");
            return new PaymentRequest(cipherInfo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentRequest) && Intrinsics.areEqual(this.cipherInfo, ((PaymentRequest) other).cipherInfo);
        }

        @NotNull
        public final CipherInfo getCipherInfo() {
            return this.cipherInfo;
        }

        public int hashCode() {
            return this.cipherInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaymentRequest(cipherInfo=" + this.cipherInfo + ")";
        }
    }

    /* JADX INFO: compiled from: BanxicoPushData.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/notifications/model/EncryptedData$PaymentStatus;", "Lcom/bbva/notifications/model/EncryptedData;", "cipherInfo", "Lcom/bbva/notifications/model/CipherInfo;", "(Lcom/bbva/notifications/model/CipherInfo;)V", "getCipherInfo", "()Lcom/bbva/notifications/model/CipherInfo;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentStatus extends EncryptedData {

        @SerializedName("infoCif")
        @NotNull
        private final CipherInfo cipherInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentStatus(@NotNull CipherInfo cipherInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(cipherInfo, "cipherInfo");
            this.cipherInfo = cipherInfo;
        }

        public static /* synthetic */ PaymentStatus copy$default(PaymentStatus paymentStatus, CipherInfo cipherInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cipherInfo = paymentStatus.cipherInfo;
            }
            return paymentStatus.copy(cipherInfo);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CipherInfo getCipherInfo() {
            return this.cipherInfo;
        }

        @NotNull
        public final PaymentStatus copy(@NotNull CipherInfo cipherInfo) {
            Intrinsics.checkNotNullParameter(cipherInfo, "cipherInfo");
            return new PaymentStatus(cipherInfo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentStatus) && Intrinsics.areEqual(this.cipherInfo, ((PaymentStatus) other).cipherInfo);
        }

        @NotNull
        public final CipherInfo getCipherInfo() {
            return this.cipherInfo;
        }

        public int hashCode() {
            return this.cipherInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaymentStatus(cipherInfo=" + this.cipherInfo + ")";
        }
    }

    private EncryptedData() {
    }

    public /* synthetic */ EncryptedData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
