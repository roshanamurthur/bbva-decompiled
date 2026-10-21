package mx.openpay.library.domain.model.link;

import androidx.camera.camera2.internal.n1;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bC\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010&\u001a\u00020\u0013\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bY\u0010ZJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J°\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010&\u001a\u00020\u00132\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b)\u0010*J\t\u0010+\u001a\u00020\u0002HÖ\u0001J\t\u0010,\u001a\u00020\u0015HÖ\u0001J\u0013\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u00102R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u00102R\u0019\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00100\u001a\u0004\bF\u00102R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u00102R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00100\u001a\u0004\bJ\u00102R\u0019\u0010%\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010\u0012R\u0017\u0010&\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010'\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u0017R\u0019\u0010(\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006["}, d2 = {"Lmx/openpay/library/domain/model/link/PaymentLink;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "component8", "component9", "component10", "component11", "", "component12", "()Ljava/lang/Boolean;", "Lmx/openpay/library/domain/model/link/Customer;", "component13", "", "component14", "()Ljava/lang/Integer;", "Lmx/openpay/library/domain/model/transaction/Transaction;", "component15", "id", PushConstants.AMOUNT, "description", "orderId", "currency", "iva", "redirectUrl", "status", "checkoutLink", Constants.creationDate, "expirationDate", "sendEmail", "customer", "plan", "transaction", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/domain/model/link/PaymentLinkStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lmx/openpay/library/domain/model/link/Customer;Ljava/lang/Integer;Lmx/openpay/library/domain/model/transaction/Transaction;)Lmx/openpay/library/domain/model/link/PaymentLink;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "D", "getAmount", "()D", "c", "getDescription", "d", "getOrderId", "e", "getCurrency", "f", "getIva", "g", "getRedirectUrl", "h", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "getStatus", "()Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "i", "getCheckoutLink", "j", "getCreationDate", "k", "getExpirationDate", "l", "Ljava/lang/Boolean;", "getSendEmail", "m", "Lmx/openpay/library/domain/model/link/Customer;", "getCustomer", "()Lmx/openpay/library/domain/model/link/Customer;", "n", "Ljava/lang/Integer;", "getPlan", "o", "Lmx/openpay/library/domain/model/transaction/Transaction;", "getTransaction", "()Lmx/openpay/library/domain/model/transaction/Transaction;", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/domain/model/link/PaymentLinkStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lmx/openpay/library/domain/model/link/Customer;Ljava/lang/Integer;Lmx/openpay/library/domain/model/transaction/Transaction;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PaymentLink {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String iva;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String redirectUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PaymentLinkStatus status;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String checkoutLink;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String creationDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String expirationDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean sendEmail;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Customer customer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer plan;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final mx.openpay.library.domain.model.transaction.Transaction transaction;

    public PaymentLink(@NotNull String id, double d2, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @Nullable String str, @Nullable PaymentLinkStatus paymentLinkStatus, @NotNull String checkoutLink, @NotNull String creationDate, @NotNull String expirationDate, @Nullable Boolean bool, @NotNull Customer customer, @Nullable Integer num, @Nullable mx.openpay.library.domain.model.transaction.Transaction transaction) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(checkoutLink, "checkoutLink");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.id = id;
        this.amount = d2;
        this.description = description;
        this.orderId = orderId;
        this.currency = currency;
        this.iva = iva;
        this.redirectUrl = str;
        this.status = paymentLinkStatus;
        this.checkoutLink = checkoutLink;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
        this.sendEmail = bool;
        this.customer = customer;
        this.plan = num;
        this.transaction = transaction;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCreationDate() {
        return this.creationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Customer getCustomer() {
        return this.customer;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getPlan() {
        return this.plan;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final mx.openpay.library.domain.model.transaction.Transaction getTransaction() {
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

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PaymentLinkStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCheckoutLink() {
        return this.checkoutLink;
    }

    @NotNull
    public final PaymentLink copy(@NotNull String id, double amount, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @Nullable String redirectUrl, @Nullable PaymentLinkStatus status, @NotNull String checkoutLink, @NotNull String creationDate, @NotNull String expirationDate, @Nullable Boolean sendEmail, @NotNull Customer customer, @Nullable Integer plan, @Nullable mx.openpay.library.domain.model.transaction.Transaction transaction) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(checkoutLink, "checkoutLink");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        return new PaymentLink(id, amount, description, orderId, currency, iva, redirectUrl, status, checkoutLink, creationDate, expirationDate, sendEmail, customer, plan, transaction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentLink)) {
            return false;
        }
        PaymentLink paymentLink = (PaymentLink) other;
        return Intrinsics.areEqual(this.id, paymentLink.id) && Double.compare(this.amount, paymentLink.amount) == 0 && Intrinsics.areEqual(this.description, paymentLink.description) && Intrinsics.areEqual(this.orderId, paymentLink.orderId) && Intrinsics.areEqual(this.currency, paymentLink.currency) && Intrinsics.areEqual(this.iva, paymentLink.iva) && Intrinsics.areEqual(this.redirectUrl, paymentLink.redirectUrl) && this.status == paymentLink.status && Intrinsics.areEqual(this.checkoutLink, paymentLink.checkoutLink) && Intrinsics.areEqual(this.creationDate, paymentLink.creationDate) && Intrinsics.areEqual(this.expirationDate, paymentLink.expirationDate) && Intrinsics.areEqual(this.sendEmail, paymentLink.sendEmail) && Intrinsics.areEqual(this.customer, paymentLink.customer) && Intrinsics.areEqual(this.plan, paymentLink.plan) && Intrinsics.areEqual(this.transaction, paymentLink.transaction);
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

    @Nullable
    public final Integer getPlan() {
        return this.plan;
    }

    @Nullable
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    public final Boolean getSendEmail() {
        return this.sendEmail;
    }

    @Nullable
    public final PaymentLinkStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final mx.openpay.library.domain.model.transaction.Transaction getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iC = n1.c(this.iva, n1.c(this.currency, n1.c(this.orderId, n1.c(this.description, (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31), 31), 31), 31);
        String str = this.redirectUrl;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        PaymentLinkStatus paymentLinkStatus = this.status;
        int iC2 = n1.c(this.expirationDate, n1.c(this.creationDate, n1.c(this.checkoutLink, (iHashCode2 + (paymentLinkStatus == null ? 0 : paymentLinkStatus.hashCode())) * 31, 31), 31), 31);
        Boolean bool = this.sendEmail;
        int iHashCode3 = (this.customer.hashCode() + ((iC2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        Integer num = this.plan;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        mx.openpay.library.domain.model.transaction.Transaction transaction = this.transaction;
        return iHashCode4 + (transaction != null ? transaction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PaymentLink(id=" + this.id + ", amount=" + this.amount + ", description=" + this.description + ", orderId=" + this.orderId + ", currency=" + this.currency + ", iva=" + this.iva + ", redirectUrl=" + this.redirectUrl + ", status=" + this.status + ", checkoutLink=" + this.checkoutLink + ", creationDate=" + this.creationDate + ", expirationDate=" + this.expirationDate + ", sendEmail=" + this.sendEmail + ", customer=" + this.customer + ", plan=" + this.plan + ", transaction=" + this.transaction + ")";
    }

    public /* synthetic */ PaymentLink(String str, double d2, String str2, String str3, String str4, String str5, String str6, PaymentLinkStatus paymentLinkStatus, String str7, String str8, String str9, Boolean bool, Customer customer, Integer num, mx.openpay.library.domain.model.transaction.Transaction transaction, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d2, str2, str3, str4, str5, (i10 & 64) != 0 ? null : str6, paymentLinkStatus, str7, str8, str9, (i10 & 2048) != 0 ? null : bool, customer, (i10 & 8192) != 0 ? null : num, (i10 & 16384) != 0 ? null : transaction);
    }
}
