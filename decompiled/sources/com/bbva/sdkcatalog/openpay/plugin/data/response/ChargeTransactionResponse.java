package com.bbva.sdkcatalog.openpay.plugin.data.response;

import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ocrcard.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayPaymentPlan;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChargeTransactionResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J¥\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00066"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/response/ChargeTransactionResponse;", "", "authorization", "", "bankCode", "date", "bin", "span", "bankName", "type", "brand", ConstantsKt.CARD_NUMBER, "id", "gatewayCardPresent", "readMode", "paymentPlan", "Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayPaymentPlan;)V", "getAuthorization", "()Ljava/lang/String;", "getBankCode", "getDate", "getBin", "getSpan", "getBankName", "getType", "getBrand", "getCardNumber", "getId", "getGatewayCardPresent", "getReadMode", "getPaymentPlan", "()Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChargeTransactionResponse {

    @Nullable
    private final String authorization;

    @Nullable
    private final String bankCode;

    @Nullable
    private final String bankName;

    @Nullable
    private final String bin;

    @Nullable
    private final String brand;

    @Nullable
    private final String cardNumber;

    @Nullable
    private final String date;

    @Nullable
    private final String gatewayCardPresent;

    @Nullable
    private final String id;

    @Nullable
    private final OpenPayPaymentPlan paymentPlan;

    @Nullable
    private final String readMode;

    @Nullable
    private final String span;

    @Nullable
    private final String type;

    public ChargeTransactionResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable OpenPayPaymentPlan openPayPaymentPlan) {
        this.authorization = str;
        this.bankCode = str2;
        this.date = str3;
        this.bin = str4;
        this.span = str5;
        this.bankName = str6;
        this.type = str7;
        this.brand = str8;
        this.cardNumber = str9;
        this.id = str10;
        this.gatewayCardPresent = str11;
        this.readMode = str12;
        this.paymentPlan = openPayPaymentPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getReadMode() {
        return this.readMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final OpenPayPaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSpan() {
        return this.span;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @NotNull
    public final ChargeTransactionResponse copy(@Nullable String authorization, @Nullable String bankCode, @Nullable String date, @Nullable String bin, @Nullable String span, @Nullable String bankName, @Nullable String type, @Nullable String brand, @Nullable String cardNumber, @Nullable String id, @Nullable String gatewayCardPresent, @Nullable String readMode, @Nullable OpenPayPaymentPlan paymentPlan) {
        return new ChargeTransactionResponse(authorization, bankCode, date, bin, span, bankName, type, brand, cardNumber, id, gatewayCardPresent, readMode, paymentPlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChargeTransactionResponse)) {
            return false;
        }
        ChargeTransactionResponse chargeTransactionResponse = (ChargeTransactionResponse) other;
        return Intrinsics.areEqual(this.authorization, chargeTransactionResponse.authorization) && Intrinsics.areEqual(this.bankCode, chargeTransactionResponse.bankCode) && Intrinsics.areEqual(this.date, chargeTransactionResponse.date) && Intrinsics.areEqual(this.bin, chargeTransactionResponse.bin) && Intrinsics.areEqual(this.span, chargeTransactionResponse.span) && Intrinsics.areEqual(this.bankName, chargeTransactionResponse.bankName) && Intrinsics.areEqual(this.type, chargeTransactionResponse.type) && Intrinsics.areEqual(this.brand, chargeTransactionResponse.brand) && Intrinsics.areEqual(this.cardNumber, chargeTransactionResponse.cardNumber) && Intrinsics.areEqual(this.id, chargeTransactionResponse.id) && Intrinsics.areEqual(this.gatewayCardPresent, chargeTransactionResponse.gatewayCardPresent) && Intrinsics.areEqual(this.readMode, chargeTransactionResponse.readMode) && Intrinsics.areEqual(this.paymentPlan, chargeTransactionResponse.paymentPlan);
    }

    @Nullable
    public final String getAuthorization() {
        return this.authorization;
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final String getBin() {
        return this.bin;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getGatewayCardPresent() {
        return this.gatewayCardPresent;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final OpenPayPaymentPlan getPaymentPlan() {
        return this.paymentPlan;
    }

    @Nullable
    public final String getReadMode() {
        return this.readMode;
    }

    @Nullable
    public final String getSpan() {
        return this.span;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.authorization;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bankCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.date;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bin;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.span;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bankName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.type;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.brand;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardNumber;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.id;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.gatewayCardPresent;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.readMode;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        OpenPayPaymentPlan openPayPaymentPlan = this.paymentPlan;
        return iHashCode12 + (openPayPaymentPlan != null ? openPayPaymentPlan.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.authorization;
        String str2 = this.bankCode;
        String str3 = this.date;
        String str4 = this.bin;
        String str5 = this.span;
        String str6 = this.bankName;
        String str7 = this.type;
        String str8 = this.brand;
        String str9 = this.cardNumber;
        String str10 = this.id;
        String str11 = this.gatewayCardPresent;
        String str12 = this.readMode;
        OpenPayPaymentPlan openPayPaymentPlan = this.paymentPlan;
        StringBuilder sbC = a.c("ChargeTransactionResponse(authorization=", str, ", bankCode=", str2, ", date=");
        k.e(sbC, str3, ", bin=", str4, ", span=");
        k.e(sbC, str5, ", bankName=", str6, ", type=");
        k.e(sbC, str7, ", brand=", str8, ", cardNumber=");
        k.e(sbC, str9, ", id=", str10, ", gatewayCardPresent=");
        k.e(sbC, str11, ", readMode=", str12, ", paymentPlan=");
        sbC.append(openPayPaymentPlan);
        sbC.append(")");
        return sbC.toString();
    }
}
