package com.bbva.notifications.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoPushData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lcom/bbva/notifications/model/PaymentDetail;", "", "name", "", "account", "bank", "", "accountType", "verificationDigit", "certificateSerialNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getAccountType", "()Ljava/lang/Number;", "getBank", "getCertificateSerialNumber", "getName", "getVerificationDigit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentDetail {

    @SerializedName("cb")
    @NotNull
    private final String account;

    @SerializedName("tc")
    @Nullable
    private final Number accountType;

    @SerializedName("ci")
    @NotNull
    private final Number bank;

    @SerializedName("nc")
    @NotNull
    private final String certificateSerialNumber;

    @SerializedName("nb")
    @NotNull
    private final String name;

    @SerializedName("dv")
    @NotNull
    private final Number verificationDigit;

    public PaymentDetail(@NotNull String name, @NotNull String account, @NotNull Number bank, @Nullable Number number, @NotNull Number verificationDigit, @NotNull String certificateSerialNumber) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(bank, "bank");
        Intrinsics.checkNotNullParameter(verificationDigit, "verificationDigit");
        Intrinsics.checkNotNullParameter(certificateSerialNumber, "certificateSerialNumber");
        this.name = name;
        this.account = account;
        this.bank = bank;
        this.accountType = number;
        this.verificationDigit = verificationDigit;
        this.certificateSerialNumber = certificateSerialNumber;
    }

    public static /* synthetic */ PaymentDetail copy$default(PaymentDetail paymentDetail, String str, String str2, Number number, Number number2, Number number3, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentDetail.name;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentDetail.account;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            number = paymentDetail.bank;
        }
        Number number4 = number;
        if ((i10 & 8) != 0) {
            number2 = paymentDetail.accountType;
        }
        Number number5 = number2;
        if ((i10 & 16) != 0) {
            number3 = paymentDetail.verificationDigit;
        }
        Number number6 = number3;
        if ((i10 & 32) != 0) {
            str3 = paymentDetail.certificateSerialNumber;
        }
        return paymentDetail.copy(str, str4, number4, number5, number6, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Number getBank() {
        return this.bank;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Number getAccountType() {
        return this.accountType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Number getVerificationDigit() {
        return this.verificationDigit;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCertificateSerialNumber() {
        return this.certificateSerialNumber;
    }

    @NotNull
    public final PaymentDetail copy(@NotNull String name, @NotNull String account, @NotNull Number bank, @Nullable Number accountType, @NotNull Number verificationDigit, @NotNull String certificateSerialNumber) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(bank, "bank");
        Intrinsics.checkNotNullParameter(verificationDigit, "verificationDigit");
        Intrinsics.checkNotNullParameter(certificateSerialNumber, "certificateSerialNumber");
        return new PaymentDetail(name, account, bank, accountType, verificationDigit, certificateSerialNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDetail)) {
            return false;
        }
        PaymentDetail paymentDetail = (PaymentDetail) other;
        return Intrinsics.areEqual(this.name, paymentDetail.name) && Intrinsics.areEqual(this.account, paymentDetail.account) && Intrinsics.areEqual(this.bank, paymentDetail.bank) && Intrinsics.areEqual(this.accountType, paymentDetail.accountType) && Intrinsics.areEqual(this.verificationDigit, paymentDetail.verificationDigit) && Intrinsics.areEqual(this.certificateSerialNumber, paymentDetail.certificateSerialNumber);
    }

    @NotNull
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final Number getAccountType() {
        return this.accountType;
    }

    @NotNull
    public final Number getBank() {
        return this.bank;
    }

    @NotNull
    public final String getCertificateSerialNumber() {
        return this.certificateSerialNumber;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Number getVerificationDigit() {
        return this.verificationDigit;
    }

    public int hashCode() {
        int iHashCode = (this.bank.hashCode() + n1.c(this.account, this.name.hashCode() * 31, 31)) * 31;
        Number number = this.accountType;
        return this.certificateSerialNumber.hashCode() + ((this.verificationDigit.hashCode() + ((iHashCode + (number == null ? 0 : number.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.account;
        Number number = this.bank;
        Number number2 = this.accountType;
        Number number3 = this.verificationDigit;
        String str3 = this.certificateSerialNumber;
        StringBuilder sbC = a.c("PaymentDetail(name=", str, ", account=", str2, ", bank=");
        sbC.append(number);
        sbC.append(", accountType=");
        sbC.append(number2);
        sbC.append(", verificationDigit=");
        sbC.append(number3);
        sbC.append(", certificateSerialNumber=");
        sbC.append(str3);
        sbC.append(")");
        return sbC.toString();
    }
}
