package com.bbva.notifications.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006+"}, d2 = {"Lcom/bbva/notifications/model/PaymentStatusResult;", "", "id", "", PushConstants.AMOUNT, "", "trackingKey", "requestTimestamp", "", "processingTimestamp", "status", "", "seller", "Lcom/bbva/notifications/model/PaymentDetail;", "receiver", "(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/String;JJILcom/bbva/notifications/model/PaymentDetail;Lcom/bbva/notifications/model/PaymentDetail;)V", "getAmount", "()Ljava/lang/Number;", "getId", "()Ljava/lang/String;", "getProcessingTimestamp", "()J", "getReceiver", "()Lcom/bbva/notifications/model/PaymentDetail;", "getRequestTimestamp", "getSeller", "getStatus", "()I", "getTrackingKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentStatusResult {

    @SerializedName("mt")
    @NotNull
    private final Number amount;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("hp")
    private final long processingTimestamp;

    @SerializedName(SharedPrefsStorage.VERSION_KEY)
    @NotNull
    private final PaymentDetail receiver;

    @SerializedName("hs")
    private final long requestTimestamp;

    @SerializedName("c")
    @NotNull
    private final PaymentDetail seller;

    @SerializedName("e")
    private final int status;

    @SerializedName("cr")
    @NotNull
    private final String trackingKey;

    public PaymentStatusResult(@NotNull String id, @NotNull Number amount, @NotNull String trackingKey, long j10, long j11, int i10, @NotNull PaymentDetail seller, @NotNull PaymentDetail receiver) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(trackingKey, "trackingKey");
        Intrinsics.checkNotNullParameter(seller, "seller");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.id = id;
        this.amount = amount;
        this.trackingKey = trackingKey;
        this.requestTimestamp = j10;
        this.processingTimestamp = j11;
        this.status = i10;
        this.seller = seller;
        this.receiver = receiver;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Number getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrackingKey() {
        return this.trackingKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getProcessingTimestamp() {
        return this.processingTimestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PaymentDetail getSeller() {
        return this.seller;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PaymentDetail getReceiver() {
        return this.receiver;
    }

    @NotNull
    public final PaymentStatusResult copy(@NotNull String id, @NotNull Number amount, @NotNull String trackingKey, long requestTimestamp, long processingTimestamp, int status, @NotNull PaymentDetail seller, @NotNull PaymentDetail receiver) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(trackingKey, "trackingKey");
        Intrinsics.checkNotNullParameter(seller, "seller");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return new PaymentStatusResult(id, amount, trackingKey, requestTimestamp, processingTimestamp, status, seller, receiver);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentStatusResult)) {
            return false;
        }
        PaymentStatusResult paymentStatusResult = (PaymentStatusResult) other;
        return Intrinsics.areEqual(this.id, paymentStatusResult.id) && Intrinsics.areEqual(this.amount, paymentStatusResult.amount) && Intrinsics.areEqual(this.trackingKey, paymentStatusResult.trackingKey) && this.requestTimestamp == paymentStatusResult.requestTimestamp && this.processingTimestamp == paymentStatusResult.processingTimestamp && this.status == paymentStatusResult.status && Intrinsics.areEqual(this.seller, paymentStatusResult.seller) && Intrinsics.areEqual(this.receiver, paymentStatusResult.receiver);
    }

    @NotNull
    public final Number getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getProcessingTimestamp() {
        return this.processingTimestamp;
    }

    @NotNull
    public final PaymentDetail getReceiver() {
        return this.receiver;
    }

    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    @NotNull
    public final PaymentDetail getSeller() {
        return this.seller;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTrackingKey() {
        return this.trackingKey;
    }

    public int hashCode() {
        int iC = n1.c(this.trackingKey, (this.amount.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
        long j10 = this.requestTimestamp;
        int i10 = (iC + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.processingTimestamp;
        return this.receiver.hashCode() + ((this.seller.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.status) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "PaymentStatusResult(id=" + this.id + ", amount=" + this.amount + ", trackingKey=" + this.trackingKey + ", requestTimestamp=" + this.requestTimestamp + ", processingTimestamp=" + this.processingTimestamp + ", status=" + this.status + ", seller=" + this.seller + ", receiver=" + this.receiver + ")";
    }
}
