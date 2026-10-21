package mx.openpay.library.data.datasource.remote.model.response.paymentlink;

import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.response.TransactionResponseDto;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLinkResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0085\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00066"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/paymentlink/PaymentLinkResponseDto;", "", "id", "", PushConstants.AMOUNT, "", "description", "orderId", "currency", "iva", "status", "checkoutLink", Constants.creationDate, "expirationDate", "customer", "Lmx/openpay/library/data/datasource/remote/model/response/paymentlink/CustomerResponseDto;", "transaction", "Lmx/openpay/library/data/datasource/remote/model/response/TransactionResponseDto;", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/paymentlink/CustomerResponseDto;Lmx/openpay/library/data/datasource/remote/model/response/TransactionResponseDto;)V", "getAmount", "()D", "getCheckoutLink", "()Ljava/lang/String;", "getCreationDate", "getCurrency", "getCustomer", "()Lmx/openpay/library/data/datasource/remote/model/response/paymentlink/CustomerResponseDto;", "getDescription", "getExpirationDate", "getId", "getIva", "getOrderId", "getStatus", "getTransaction", "()Lmx/openpay/library/data/datasource/remote/model/response/TransactionResponseDto;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaymentLinkResponseDto {

    @SerializedName(PushConstants.AMOUNT)
    private final double amount;

    @SerializedName("checkout_link")
    @NotNull
    private final String checkoutLink;

    @SerializedName("creation_date")
    @NotNull
    private final String creationDate;

    @SerializedName("currency")
    @NotNull
    private final String currency;

    @SerializedName("customer")
    @NotNull
    private final CustomerResponseDto customer;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("expiration_date")
    @Nullable
    private final String expirationDate;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("iva")
    @NotNull
    private final String iva;

    @SerializedName("order_id")
    @NotNull
    private final String orderId;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("transaction")
    @Nullable
    private final TransactionResponseDto transaction;

    public PaymentLinkResponseDto(@NotNull String id, double d2, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String status, @NotNull String checkoutLink, @NotNull String creationDate, @Nullable String str, @NotNull CustomerResponseDto customer, @Nullable TransactionResponseDto transactionResponseDto) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(checkoutLink, "checkoutLink");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.id = id;
        this.amount = d2;
        this.description = description;
        this.orderId = orderId;
        this.currency = currency;
        this.iva = iva;
        this.status = status;
        this.checkoutLink = checkoutLink;
        this.creationDate = creationDate;
        this.expirationDate = str;
        this.customer = customer;
        this.transaction = transactionResponseDto;
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
    public final CustomerResponseDto getCustomer() {
        return this.customer;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TransactionResponseDto getTransaction() {
        return this.transaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
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
    public final PaymentLinkResponseDto copy(@NotNull String id, double amount, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String status, @NotNull String checkoutLink, @NotNull String creationDate, @Nullable String expirationDate, @NotNull CustomerResponseDto customer, @Nullable TransactionResponseDto transaction) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(checkoutLink, "checkoutLink");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        return new PaymentLinkResponseDto(id, amount, description, orderId, currency, iva, status, checkoutLink, creationDate, expirationDate, customer, transaction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentLinkResponseDto)) {
            return false;
        }
        PaymentLinkResponseDto paymentLinkResponseDto = (PaymentLinkResponseDto) other;
        return Intrinsics.areEqual(this.id, paymentLinkResponseDto.id) && Double.compare(this.amount, paymentLinkResponseDto.amount) == 0 && Intrinsics.areEqual(this.description, paymentLinkResponseDto.description) && Intrinsics.areEqual(this.orderId, paymentLinkResponseDto.orderId) && Intrinsics.areEqual(this.currency, paymentLinkResponseDto.currency) && Intrinsics.areEqual(this.iva, paymentLinkResponseDto.iva) && Intrinsics.areEqual(this.status, paymentLinkResponseDto.status) && Intrinsics.areEqual(this.checkoutLink, paymentLinkResponseDto.checkoutLink) && Intrinsics.areEqual(this.creationDate, paymentLinkResponseDto.creationDate) && Intrinsics.areEqual(this.expirationDate, paymentLinkResponseDto.expirationDate) && Intrinsics.areEqual(this.customer, paymentLinkResponseDto.customer) && Intrinsics.areEqual(this.transaction, paymentLinkResponseDto.transaction);
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
    public final CustomerResponseDto getCustomer() {
        return this.customer;
    }

    @NotNull
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
    public final TransactionResponseDto getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iC = n1.c(this.creationDate, n1.c(this.checkoutLink, n1.c(this.status, n1.c(this.iva, n1.c(this.currency, n1.c(this.orderId, n1.c(this.description, (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31), 31), 31), 31), 31), 31), 31);
        String str = this.expirationDate;
        int iHashCode2 = (this.customer.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        TransactionResponseDto transactionResponseDto = this.transaction;
        return iHashCode2 + (transactionResponseDto != null ? transactionResponseDto.hashCode() : 0);
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
        CustomerResponseDto customerResponseDto = this.customer;
        TransactionResponseDto transactionResponseDto = this.transaction;
        StringBuilder sb2 = new StringBuilder("PaymentLinkResponseDto(id=");
        sb2.append(str);
        sb2.append(", amount=");
        sb2.append(d2);
        k.e(sb2, ", description=", str2, ", orderId=", str3);
        k.e(sb2, ", currency=", str4, ", iva=", str5);
        k.e(sb2, ", status=", str6, ", checkoutLink=", str7);
        k.e(sb2, ", creationDate=", str8, ", expirationDate=", str9);
        sb2.append(", customer=");
        sb2.append(customerResponseDto);
        sb2.append(", transaction=");
        sb2.append(transactionResponseDto);
        sb2.append(")");
        return sb2.toString();
    }
}
