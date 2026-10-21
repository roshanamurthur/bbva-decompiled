package mx.openpay.library.data.datasource.remote.model.request.paymentlink;

import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.PaymentPlanLinkRequestDto;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CreatePaymentLinkRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0083\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00065"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/CreatePaymentLinkRequestDto;", "", PushConstants.AMOUNT, "", "description", "orderId", "currency", "iva", "origin", "productType", "redirectUrl", "expirationDate", "sendEmail", "", "customer", "Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/CustomerRequestDto;", "paymentPlan", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanLinkRequestDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmx/openpay/library/data/datasource/remote/model/request/paymentlink/CustomerRequestDto;Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanLinkRequestDto;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getCustomer", "()Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/CustomerRequestDto;", "getDescription", "getExpirationDate", "getIva", "getOrderId", "getOrigin", "getPaymentPlan", "()Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanLinkRequestDto;", "getProductType", "getRedirectUrl", "getSendEmail", "()Z", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CreatePaymentLinkRequestDto {

    @SerializedName(PushConstants.AMOUNT)
    @NotNull
    private final String amount;

    @SerializedName("currency")
    @NotNull
    private final String currency;

    @SerializedName("customer")
    @NotNull
    private final CustomerRequestDto customer;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("expiration_date")
    @NotNull
    private final String expirationDate;

    @SerializedName("iva")
    @NotNull
    private final String iva;

    @SerializedName("order_id")
    @NotNull
    private final String orderId;

    @SerializedName("origin")
    @NotNull
    private final String origin;

    @SerializedName("payment_plan")
    @Nullable
    private final PaymentPlanLinkRequestDto paymentPlan;

    @SerializedName("product_type")
    @NotNull
    private final String productType;

    @SerializedName("redirect_url")
    @NotNull
    private final String redirectUrl;

    @SerializedName("send_email")
    private final boolean sendEmail;

    public CreatePaymentLinkRequestDto(@NotNull String amount, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String origin, @NotNull String productType, @NotNull String redirectUrl, @NotNull String expirationDate, boolean z10, @NotNull CustomerRequestDto customer, @Nullable PaymentPlanLinkRequestDto paymentPlanLinkRequestDto) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.amount = amount;
        this.description = description;
        this.orderId = orderId;
        this.currency = currency;
        this.iva = iva;
        this.origin = origin;
        this.productType = productType;
        this.redirectUrl = redirectUrl;
        this.expirationDate = expirationDate;
        this.sendEmail = z10;
        this.customer = customer;
        this.paymentPlan = paymentPlanLinkRequestDto;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CustomerRequestDto getCustomer() {
        return this.customer;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final PaymentPlanLinkRequestDto getPaymentPlan() {
        return this.paymentPlan;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIva() {
        return this.iva;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public final CreatePaymentLinkRequestDto copy(@NotNull String amount, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String origin, @NotNull String productType, @NotNull String redirectUrl, @NotNull String expirationDate, boolean sendEmail, @NotNull CustomerRequestDto customer, @Nullable PaymentPlanLinkRequestDto paymentPlan) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        return new CreatePaymentLinkRequestDto(amount, description, orderId, currency, iva, origin, productType, redirectUrl, expirationDate, sendEmail, customer, paymentPlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePaymentLinkRequestDto)) {
            return false;
        }
        CreatePaymentLinkRequestDto createPaymentLinkRequestDto = (CreatePaymentLinkRequestDto) other;
        return Intrinsics.areEqual(this.amount, createPaymentLinkRequestDto.amount) && Intrinsics.areEqual(this.description, createPaymentLinkRequestDto.description) && Intrinsics.areEqual(this.orderId, createPaymentLinkRequestDto.orderId) && Intrinsics.areEqual(this.currency, createPaymentLinkRequestDto.currency) && Intrinsics.areEqual(this.iva, createPaymentLinkRequestDto.iva) && Intrinsics.areEqual(this.origin, createPaymentLinkRequestDto.origin) && Intrinsics.areEqual(this.productType, createPaymentLinkRequestDto.productType) && Intrinsics.areEqual(this.redirectUrl, createPaymentLinkRequestDto.redirectUrl) && Intrinsics.areEqual(this.expirationDate, createPaymentLinkRequestDto.expirationDate) && this.sendEmail == createPaymentLinkRequestDto.sendEmail && Intrinsics.areEqual(this.customer, createPaymentLinkRequestDto.customer) && Intrinsics.areEqual(this.paymentPlan, createPaymentLinkRequestDto.paymentPlan);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final CustomerRequestDto getCustomer() {
        return this.customer;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getExpirationDate() {
        return this.expirationDate;
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
    public final String getOrigin() {
        return this.origin;
    }

    @Nullable
    public final PaymentPlanLinkRequestDto getPaymentPlan() {
        return this.paymentPlan;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        int iC = n1.c(this.expirationDate, n1.c(this.redirectUrl, n1.c(this.productType, n1.c(this.origin, n1.c(this.iva, n1.c(this.currency, n1.c(this.orderId, n1.c(this.description, this.amount.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        boolean z10 = this.sendEmail;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iHashCode = (this.customer.hashCode() + ((iC + r3) * 31)) * 31;
        PaymentPlanLinkRequestDto paymentPlanLinkRequestDto = this.paymentPlan;
        return iHashCode + (paymentPlanLinkRequestDto == null ? 0 : paymentPlanLinkRequestDto.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.amount;
        String str2 = this.description;
        String str3 = this.orderId;
        String str4 = this.currency;
        String str5 = this.iva;
        String str6 = this.origin;
        String str7 = this.productType;
        String str8 = this.redirectUrl;
        String str9 = this.expirationDate;
        boolean z10 = this.sendEmail;
        CustomerRequestDto customerRequestDto = this.customer;
        PaymentPlanLinkRequestDto paymentPlanLinkRequestDto = this.paymentPlan;
        StringBuilder sbC = a.c("CreatePaymentLinkRequestDto(amount=", str, ", description=", str2, ", orderId=");
        k.e(sbC, str3, ", currency=", str4, ", iva=");
        k.e(sbC, str5, ", origin=", str6, ", productType=");
        k.e(sbC, str7, ", redirectUrl=", str8, ", expirationDate=");
        sbC.append(str9);
        sbC.append(", sendEmail=");
        sbC.append(z10);
        sbC.append(", customer=");
        sbC.append(customerRequestDto);
        sbC.append(", paymentPlan=");
        sbC.append(paymentPlanLinkRequestDto);
        sbC.append(")");
        return sbC.toString();
    }
}
