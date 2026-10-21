package com.bbva.notifications.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoPushData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006*"}, d2 = {"Lcom/bbva/notifications/model/PaymentRequestResult;", "", "id", "", "concept", PushConstants.AMOUNT, "", "eCommerceId", "requestTimestamp", "", "paymentLimitTimestamp", "receiver", "Lcom/bbva/notifications/model/PaymentDetail;", "paymentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/String;JJLcom/bbva/notifications/model/PaymentDetail;Ljava/lang/Number;)V", "getAmount", "()Ljava/lang/Number;", "getConcept", "()Ljava/lang/String;", "getECommerceId", "getId", "getPaymentLimitTimestamp", "()J", "getPaymentType", "getReceiver", "()Lcom/bbva/notifications/model/PaymentDetail;", "getRequestTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentRequestResult {

    @SerializedName("mt")
    @NotNull
    private final Number amount;

    @SerializedName("cc")
    @NotNull
    private final String concept;

    @SerializedName("idCE")
    @NotNull
    private final String eCommerceId;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("hl")
    private final long paymentLimitTimestamp;

    @SerializedName("tp")
    @NotNull
    private final Number paymentType;

    @SerializedName(SharedPrefsStorage.VERSION_KEY)
    @NotNull
    private final PaymentDetail receiver;

    @SerializedName("hs")
    private final long requestTimestamp;

    public PaymentRequestResult(@NotNull String id, @NotNull String concept, @NotNull Number amount, @NotNull String eCommerceId, long j10, long j11, @NotNull PaymentDetail receiver, @NotNull Number paymentType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(concept, "concept");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(eCommerceId, "eCommerceId");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.eCommerceId = eCommerceId;
        this.requestTimestamp = j10;
        this.paymentLimitTimestamp = j11;
        this.receiver = receiver;
        this.paymentType = paymentType;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConcept() {
        return this.concept;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Number getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getECommerceId() {
        return this.eCommerceId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPaymentLimitTimestamp() {
        return this.paymentLimitTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PaymentDetail getReceiver() {
        return this.receiver;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Number getPaymentType() {
        return this.paymentType;
    }

    @NotNull
    public final PaymentRequestResult copy(@NotNull String id, @NotNull String concept, @NotNull Number amount, @NotNull String eCommerceId, long requestTimestamp, long paymentLimitTimestamp, @NotNull PaymentDetail receiver, @NotNull Number paymentType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(concept, "concept");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(eCommerceId, "eCommerceId");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        return new PaymentRequestResult(id, concept, amount, eCommerceId, requestTimestamp, paymentLimitTimestamp, receiver, paymentType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentRequestResult)) {
            return false;
        }
        PaymentRequestResult paymentRequestResult = (PaymentRequestResult) other;
        return Intrinsics.areEqual(this.id, paymentRequestResult.id) && Intrinsics.areEqual(this.concept, paymentRequestResult.concept) && Intrinsics.areEqual(this.amount, paymentRequestResult.amount) && Intrinsics.areEqual(this.eCommerceId, paymentRequestResult.eCommerceId) && this.requestTimestamp == paymentRequestResult.requestTimestamp && this.paymentLimitTimestamp == paymentRequestResult.paymentLimitTimestamp && Intrinsics.areEqual(this.receiver, paymentRequestResult.receiver) && Intrinsics.areEqual(this.paymentType, paymentRequestResult.paymentType);
    }

    @NotNull
    public final Number getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getConcept() {
        return this.concept;
    }

    @NotNull
    public final String getECommerceId() {
        return this.eCommerceId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getPaymentLimitTimestamp() {
        return this.paymentLimitTimestamp;
    }

    @NotNull
    public final Number getPaymentType() {
        return this.paymentType;
    }

    @NotNull
    public final PaymentDetail getReceiver() {
        return this.receiver;
    }

    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public int hashCode() {
        int iC = n1.c(this.eCommerceId, (this.amount.hashCode() + n1.c(this.concept, this.id.hashCode() * 31, 31)) * 31, 31);
        long j10 = this.requestTimestamp;
        int i10 = (iC + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.paymentLimitTimestamp;
        return this.paymentType.hashCode() + ((this.receiver.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.concept;
        Number number = this.amount;
        String str3 = this.eCommerceId;
        long j10 = this.requestTimestamp;
        long j11 = this.paymentLimitTimestamp;
        PaymentDetail paymentDetail = this.receiver;
        Number number2 = this.paymentType;
        StringBuilder sbC = a.c("PaymentRequestResult(id=", str, ", concept=", str2, ", amount=");
        sbC.append(number);
        sbC.append(", eCommerceId=");
        sbC.append(str3);
        sbC.append(", requestTimestamp=");
        sbC.append(j10);
        sbC.append(", paymentLimitTimestamp=");
        sbC.append(j11);
        sbC.append(", receiver=");
        sbC.append(paymentDetail);
        sbC.append(", paymentType=");
        sbC.append(number2);
        sbC.append(")");
        return sbC.toString();
    }
}
