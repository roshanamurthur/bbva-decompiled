package mx.openpay.library.domain.model.link;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.eglobal.PaymentPlanLink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jo\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lmx/openpay/library/domain/model/link/CreatePaymentLink;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "Lmx/openpay/library/domain/model/link/Customer;", "component9", "Lmx/openpay/library/domain/model/eglobal/PaymentPlanLink;", "component10", PushConstants.AMOUNT, "description", "orderId", "currency", "iva", "redirectUrl", "expirationDate", "sendEmail", "customer", "paymentPlan", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "D", "getAmount", "()D", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "c", "getOrderId", "d", "getCurrency", "e", "getIva", "f", "getRedirectUrl", "g", "getExpirationDate", "h", "Z", "getSendEmail", "()Z", "i", "Lmx/openpay/library/domain/model/link/Customer;", "getCustomer", "()Lmx/openpay/library/domain/model/link/Customer;", "j", "Lmx/openpay/library/domain/model/eglobal/PaymentPlanLink;", "getPaymentPlan", "()Lmx/openpay/library/domain/model/eglobal/PaymentPlanLink;", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmx/openpay/library/domain/model/link/Customer;Lmx/openpay/library/domain/model/eglobal/PaymentPlanLink;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CreatePaymentLink {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String iva;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String redirectUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String expirationDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean sendEmail;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Customer customer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PaymentPlanLink paymentPlan;

    public CreatePaymentLink(double d2, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String redirectUrl, @NotNull String expirationDate, boolean z10, @NotNull Customer customer, @Nullable PaymentPlanLink paymentPlanLink) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.amount = d2;
        this.description = description;
        this.orderId = orderId;
        this.currency = currency;
        this.iva = iva;
        this.redirectUrl = redirectUrl;
        this.expirationDate = expirationDate;
        this.sendEmail = z10;
        this.customer = customer;
        this.paymentPlan = paymentPlanLink;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PaymentPlanLink getPaymentPlan() {
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
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Customer getCustomer() {
        return this.customer;
    }

    @NotNull
    public final CreatePaymentLink copy(double amount, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String redirectUrl, @NotNull String expirationDate, boolean sendEmail, @NotNull Customer customer, @Nullable PaymentPlanLink paymentPlan) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        return new CreatePaymentLink(amount, description, orderId, currency, iva, redirectUrl, expirationDate, sendEmail, customer, paymentPlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePaymentLink)) {
            return false;
        }
        CreatePaymentLink createPaymentLink = (CreatePaymentLink) other;
        return Double.compare(this.amount, createPaymentLink.amount) == 0 && Intrinsics.areEqual(this.description, createPaymentLink.description) && Intrinsics.areEqual(this.orderId, createPaymentLink.orderId) && Intrinsics.areEqual(this.currency, createPaymentLink.currency) && Intrinsics.areEqual(this.iva, createPaymentLink.iva) && Intrinsics.areEqual(this.redirectUrl, createPaymentLink.redirectUrl) && Intrinsics.areEqual(this.expirationDate, createPaymentLink.expirationDate) && this.sendEmail == createPaymentLink.sendEmail && Intrinsics.areEqual(this.customer, createPaymentLink.customer) && Intrinsics.areEqual(this.paymentPlan, createPaymentLink.paymentPlan);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final Customer getCustomer() {
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

    @Nullable
    public final PaymentPlanLink getPaymentPlan() {
        return this.paymentPlan;
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iC = n1.c(this.expirationDate, n1.c(this.redirectUrl, n1.c(this.iva, n1.c(this.currency, n1.c(this.orderId, n1.c(this.description, ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31), 31), 31), 31), 31), 31);
        boolean z10 = this.sendEmail;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iHashCode = (this.customer.hashCode() + ((iC + r3) * 31)) * 31;
        PaymentPlanLink paymentPlanLink = this.paymentPlan;
        return iHashCode + (paymentPlanLink == null ? 0 : paymentPlanLink.hashCode());
    }

    @NotNull
    public String toString() {
        return "CreatePaymentLink(amount=" + this.amount + ", description=" + this.description + ", orderId=" + this.orderId + ", currency=" + this.currency + ", iva=" + this.iva + ", redirectUrl=" + this.redirectUrl + ", expirationDate=" + this.expirationDate + ", sendEmail=" + this.sendEmail + ", customer=" + this.customer + ", paymentPlan=" + this.paymentPlan + ")";
    }
}
