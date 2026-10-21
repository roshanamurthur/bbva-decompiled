package com.bbva.sdkcatalog.openpay.plugin.data.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayCustomer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLinkModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Ji\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0010HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/model/PaymentLinkModel;", "", PushConstants.AMOUNT, "", "orderId", "", "description", "iva", "expirationDate", "redirectURL", "sendEmail", "", "customer", "Lmx/openpay/library/core/model/OpenPayCustomer;", "plan", "", "", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmx/openpay/library/core/model/OpenPayCustomer;Ljava/util/List;)V", "getAmount", "()D", "getOrderId", "()Ljava/lang/String;", "getDescription", "getIva", "getExpirationDate", "getRedirectURL", "getSendEmail", "()Z", "getCustomer", "()Lmx/openpay/library/core/model/OpenPayCustomer;", "getPlan", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentLinkModel {
    private final double amount;

    @NotNull
    private final OpenPayCustomer customer;

    @NotNull
    private final String description;

    @NotNull
    private final String expirationDate;

    @NotNull
    private final String iva;

    @NotNull
    private final String orderId;

    @NotNull
    private final List<Integer> plan;

    @NotNull
    private final String redirectURL;
    private final boolean sendEmail;

    public PaymentLinkModel(double d2, @NotNull String orderId, @NotNull String description, @NotNull String iva, @NotNull String expirationDate, @NotNull String redirectURL, boolean z10, @NotNull OpenPayCustomer customer, @NotNull List<Integer> plan) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(redirectURL, "redirectURL");
        Intrinsics.checkNotNullParameter(customer, "customer");
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.amount = d2;
        this.orderId = orderId;
        this.description = description;
        this.iva = iva;
        this.expirationDate = expirationDate;
        this.redirectURL = redirectURL;
        this.sendEmail = z10;
        this.customer = customer;
        this.plan = plan;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIva() {
        return this.iva;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRedirectURL() {
        return this.redirectURL;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OpenPayCustomer getCustomer() {
        return this.customer;
    }

    @NotNull
    public final List<Integer> component9() {
        return this.plan;
    }

    @NotNull
    public final PaymentLinkModel copy(double amount, @NotNull String orderId, @NotNull String description, @NotNull String iva, @NotNull String expirationDate, @NotNull String redirectURL, boolean sendEmail, @NotNull OpenPayCustomer customer, @NotNull List<Integer> plan) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(redirectURL, "redirectURL");
        Intrinsics.checkNotNullParameter(customer, "customer");
        Intrinsics.checkNotNullParameter(plan, "plan");
        return new PaymentLinkModel(amount, orderId, description, iva, expirationDate, redirectURL, sendEmail, customer, plan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentLinkModel)) {
            return false;
        }
        PaymentLinkModel paymentLinkModel = (PaymentLinkModel) other;
        return Double.compare(this.amount, paymentLinkModel.amount) == 0 && Intrinsics.areEqual(this.orderId, paymentLinkModel.orderId) && Intrinsics.areEqual(this.description, paymentLinkModel.description) && Intrinsics.areEqual(this.iva, paymentLinkModel.iva) && Intrinsics.areEqual(this.expirationDate, paymentLinkModel.expirationDate) && Intrinsics.areEqual(this.redirectURL, paymentLinkModel.redirectURL) && this.sendEmail == paymentLinkModel.sendEmail && Intrinsics.areEqual(this.customer, paymentLinkModel.customer) && Intrinsics.areEqual(this.plan, paymentLinkModel.plan);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final OpenPayCustomer getCustomer() {
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
    public final List<Integer> getPlan() {
        return this.plan;
    }

    @NotNull
    public final String getRedirectURL() {
        return this.redirectURL;
    }

    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        return this.plan.hashCode() + ((this.customer.hashCode() + ((n1.c(this.redirectURL, n1.c(this.expirationDate, n1.c(this.iva, n1.c(this.description, n1.c(this.orderId, ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31), 31), 31), 31), 31) + (this.sendEmail ? 1231 : 1237)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        double d2 = this.amount;
        String str = this.orderId;
        String str2 = this.description;
        String str3 = this.iva;
        String str4 = this.expirationDate;
        String str5 = this.redirectURL;
        boolean z10 = this.sendEmail;
        OpenPayCustomer openPayCustomer = this.customer;
        List<Integer> list = this.plan;
        StringBuilder sb2 = new StringBuilder("PaymentLinkModel(amount=");
        sb2.append(d2);
        sb2.append(", orderId=");
        sb2.append(str);
        k.e(sb2, ", description=", str2, ", iva=", str3);
        k.e(sb2, ", expirationDate=", str4, ", redirectURL=", str5);
        sb2.append(", sendEmail=");
        sb2.append(z10);
        sb2.append(", customer=");
        sb2.append(openPayCustomer);
        sb2.append(", plan=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }
}
