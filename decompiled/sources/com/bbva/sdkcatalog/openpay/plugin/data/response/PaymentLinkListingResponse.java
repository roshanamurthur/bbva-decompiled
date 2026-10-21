package com.bbva.sdkcatalog.openpay.plugin.data.response;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayCustomer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLinkListingResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0087\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00067"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/response/PaymentLinkListingResponse;", "", "id", "", PushConstants.AMOUNT, "", "description", "orderId", "currency", "iva", "status", "checkoutLink", Constants.creationDate, "expirationDate", "customer", "Lmx/openpay/library/core/model/OpenPayCustomer;", "transaction", "Lcom/bbva/sdkcatalog/openpay/plugin/data/response/TransactionDetails;", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayCustomer;Lcom/bbva/sdkcatalog/openpay/plugin/data/response/TransactionDetails;)V", "getId", "()Ljava/lang/String;", "getAmount", "()D", "getDescription", "getOrderId", "getCurrency", "getIva", "getStatus", "getCheckoutLink", "getCreationDate", "getExpirationDate", "getCustomer", "()Lmx/openpay/library/core/model/OpenPayCustomer;", "getTransaction", "()Lcom/bbva/sdkcatalog/openpay/plugin/data/response/TransactionDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentLinkListingResponse {
    private final double amount;

    @NotNull
    private final String checkoutLink;

    @NotNull
    private final String creationDate;

    @NotNull
    private final String currency;

    @NotNull
    private final OpenPayCustomer customer;

    @Nullable
    private final String description;

    @Nullable
    private final String expirationDate;

    @NotNull
    private final String id;

    @NotNull
    private final String iva;

    @NotNull
    private final String orderId;

    @NotNull
    private final String status;

    @Nullable
    private final TransactionDetails transaction;

    public PaymentLinkListingResponse(@NotNull String id, double d2, @Nullable String str, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String status, @NotNull String checkoutLink, @NotNull String creationDate, @Nullable String str2, @NotNull OpenPayCustomer customer, @Nullable TransactionDetails transactionDetails) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(checkoutLink, "checkoutLink");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.id = id;
        this.amount = d2;
        this.description = str;
        this.orderId = orderId;
        this.currency = currency;
        this.iva = iva;
        this.status = status;
        this.checkoutLink = checkoutLink;
        this.creationDate = creationDate;
        this.expirationDate = str2;
        this.customer = customer;
        this.transaction = transactionDetails;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final OpenPayCustomer getCustomer() {
        return this.customer;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TransactionDetails getTransaction() {
        return this.transaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIva() {
        return this.iva;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCheckoutLink() {
        return this.checkoutLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCreationDate() {
        return this.creationDate;
    }

    @NotNull
    public final PaymentLinkListingResponse copy(@NotNull String id, double amount, @Nullable String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String status, @NotNull String checkoutLink, @NotNull String creationDate, @Nullable String expirationDate, @NotNull OpenPayCustomer customer, @Nullable TransactionDetails transaction) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(checkoutLink, "checkoutLink");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        return new PaymentLinkListingResponse(id, amount, description, orderId, currency, iva, status, checkoutLink, creationDate, expirationDate, customer, transaction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentLinkListingResponse)) {
            return false;
        }
        PaymentLinkListingResponse paymentLinkListingResponse = (PaymentLinkListingResponse) other;
        return Intrinsics.areEqual(this.id, paymentLinkListingResponse.id) && Double.compare(this.amount, paymentLinkListingResponse.amount) == 0 && Intrinsics.areEqual(this.description, paymentLinkListingResponse.description) && Intrinsics.areEqual(this.orderId, paymentLinkListingResponse.orderId) && Intrinsics.areEqual(this.currency, paymentLinkListingResponse.currency) && Intrinsics.areEqual(this.iva, paymentLinkListingResponse.iva) && Intrinsics.areEqual(this.status, paymentLinkListingResponse.status) && Intrinsics.areEqual(this.checkoutLink, paymentLinkListingResponse.checkoutLink) && Intrinsics.areEqual(this.creationDate, paymentLinkListingResponse.creationDate) && Intrinsics.areEqual(this.expirationDate, paymentLinkListingResponse.expirationDate) && Intrinsics.areEqual(this.customer, paymentLinkListingResponse.customer) && Intrinsics.areEqual(this.transaction, paymentLinkListingResponse.transaction);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCheckoutLink() {
        return this.checkoutLink;
    }

    @NotNull
    public final String getCreationDate() {
        return this.creationDate;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final OpenPayCustomer getCustomer() {
        return this.customer;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getIva() {
        return this.iva;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final TransactionDetails getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i10 = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        String str = this.description;
        int iC = n1.c(this.creationDate, n1.c(this.checkoutLink, n1.c(this.status, n1.c(this.iva, n1.c(this.currency, n1.c(this.orderId, (i10 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str2 = this.expirationDate;
        int iHashCode2 = (this.customer.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        TransactionDetails transactionDetails = this.transaction;
        return iHashCode2 + (transactionDetails != null ? transactionDetails.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        double d2 = this.amount;
        String str2 = this.description;
        String str3 = this.orderId;
        String str4 = this.currency;
        String str5 = this.iva;
        String str6 = this.status;
        String str7 = this.checkoutLink;
        String str8 = this.creationDate;
        String str9 = this.expirationDate;
        OpenPayCustomer openPayCustomer = this.customer;
        TransactionDetails transactionDetails = this.transaction;
        StringBuilder sb2 = new StringBuilder("PaymentLinkListingResponse(id=");
        sb2.append(str);
        sb2.append(", amount=");
        sb2.append(d2);
        k.e(sb2, ", description=", str2, ", orderId=", str3);
        k.e(sb2, ", currency=", str4, ", iva=", str5);
        k.e(sb2, ", status=", str6, ", checkoutLink=", str7);
        k.e(sb2, ", creationDate=", str8, ", expirationDate=", str9);
        sb2.append(", customer=");
        sb2.append(openPayCustomer);
        sb2.append(", transaction=");
        sb2.append(transactionDetails);
        sb2.append(")");
        return sb2.toString();
    }
}
