package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import mx.openpay.library.di.DependenciesProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0010\u0012\u0006\u0010%\u001a\u00020\u0012\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bf\u0010gJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003J®\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00122\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b(\u0010)J\t\u0010*\u001a\u00020\u0002HÖ\u0001J\t\u0010+\u001a\u00020\u0014HÖ\u0001J\u0013\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010/\u001a\u00020\u0014HÖ\u0001J\u0019\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u00108R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\bB\u00108R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bD\u00108R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u00108R$\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bN\u00108R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u00106\u001a\u0004\bP\u00108R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u00106\u001a\u0004\bR\u00108\"\u0004\bS\u0010TR\"\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0017\u0010%\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010&\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010\u0016R\u0019\u0010'\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006h"}, d2 = {"Lmx/openpay/library/core/model/OpenPayPaymentLink;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "component8", "component9", "component10", "component11", "", "component12", "Lmx/openpay/library/core/model/OpenPayCustomer;", "component13", "", "component14", "()Ljava/lang/Integer;", "Lmx/openpay/library/core/model/OpenPayTransaction;", "component15", "id", PushConstants.AMOUNT, "description", "orderId", "currency", "iva", "redirectUrl", "status", "checkoutLink", Constants.creationDate, "expirationDate", "sendEmail", "customer", "plan", "transaction", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmx/openpay/library/core/model/OpenPayCustomer;Ljava/lang/Integer;Lmx/openpay/library/core/model/OpenPayTransaction;)Lmx/openpay/library/core/model/OpenPayPaymentLink;", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "q0", "D", "getAmount", "()D", "r0", "getDescription", "s0", "getOrderId", "t0", "getCurrency", "u0", "getIva", "v0", "getRedirectUrl", "w0", "Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "getStatus", "()Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "setStatus", "(Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;)V", "x0", "getCheckoutLink", "y0", "getCreationDate", "E0", "getExpirationDate", "setExpirationDate", "(Ljava/lang/String;)V", "F0", "Z", "getSendEmail", "()Z", "setSendEmail", "(Z)V", "G0", "Lmx/openpay/library/core/model/OpenPayCustomer;", "getCustomer", "()Lmx/openpay/library/core/model/OpenPayCustomer;", "H0", "Ljava/lang/Integer;", "getPlan", "I0", "Lmx/openpay/library/core/model/OpenPayTransaction;", "getTransaction", "()Lmx/openpay/library/core/model/OpenPayTransaction;", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmx/openpay/library/core/model/OpenPayCustomer;Ljava/lang/Integer;Lmx/openpay/library/core/model/OpenPayTransaction;)V", "library_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OpenPayPaymentLink implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OpenPayPaymentLink> CREATOR = new Creator();

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public String expirationDate;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public boolean sendEmail;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @NotNull
    public final OpenPayCustomer customer;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @Nullable
    public final Integer plan;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @Nullable
    public final OpenPayTransaction transaction;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String iva;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public final String redirectUrl;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public OpenPayPaymentLinkStatus status;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String checkoutLink;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String creationDate;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayPaymentLink> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayPaymentLink createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayPaymentLink(parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OpenPayPaymentLinkStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, OpenPayCustomer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? OpenPayTransaction.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayPaymentLink[] newArray(int i10) {
            return new OpenPayPaymentLink[i10];
        }
    }

    public OpenPayPaymentLink(@NotNull String id, double d2, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @Nullable String str, @Nullable OpenPayPaymentLinkStatus openPayPaymentLinkStatus, @NotNull String checkoutLink, @NotNull String creationDate, @NotNull String expirationDate, boolean z10, @NotNull OpenPayCustomer customer, @Nullable Integer num, @Nullable OpenPayTransaction openPayTransaction) {
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
        this.status = openPayPaymentLinkStatus;
        this.checkoutLink = checkoutLink;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
        this.sendEmail = z10;
        this.customer = customer;
        this.plan = num;
        this.transaction = openPayTransaction;
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

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final OpenPayCustomer getCustomer() {
        return this.customer;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getPlan() {
        return this.plan;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final OpenPayTransaction getTransaction() {
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
    public final OpenPayPaymentLinkStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCheckoutLink() {
        return this.checkoutLink;
    }

    @NotNull
    public final OpenPayPaymentLink copy(@NotNull String id, double amount, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @Nullable String redirectUrl, @Nullable OpenPayPaymentLinkStatus status, @NotNull String checkoutLink, @NotNull String creationDate, @NotNull String expirationDate, boolean sendEmail, @NotNull OpenPayCustomer customer, @Nullable Integer plan, @Nullable OpenPayTransaction transaction) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(checkoutLink, "checkoutLink");
        Intrinsics.checkNotNullParameter(creationDate, "creationDate");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        return new OpenPayPaymentLink(id, amount, description, orderId, currency, iva, redirectUrl, status, checkoutLink, creationDate, expirationDate, sendEmail, customer, plan, transaction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayPaymentLink)) {
            return false;
        }
        OpenPayPaymentLink openPayPaymentLink = (OpenPayPaymentLink) other;
        return Intrinsics.areEqual(this.id, openPayPaymentLink.id) && Double.compare(this.amount, openPayPaymentLink.amount) == 0 && Intrinsics.areEqual(this.description, openPayPaymentLink.description) && Intrinsics.areEqual(this.orderId, openPayPaymentLink.orderId) && Intrinsics.areEqual(this.currency, openPayPaymentLink.currency) && Intrinsics.areEqual(this.iva, openPayPaymentLink.iva) && Intrinsics.areEqual(this.redirectUrl, openPayPaymentLink.redirectUrl) && this.status == openPayPaymentLink.status && Intrinsics.areEqual(this.checkoutLink, openPayPaymentLink.checkoutLink) && Intrinsics.areEqual(this.creationDate, openPayPaymentLink.creationDate) && Intrinsics.areEqual(this.expirationDate, openPayPaymentLink.expirationDate) && this.sendEmail == openPayPaymentLink.sendEmail && Intrinsics.areEqual(this.customer, openPayPaymentLink.customer) && Intrinsics.areEqual(this.plan, openPayPaymentLink.plan) && Intrinsics.areEqual(this.transaction, openPayPaymentLink.transaction);
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

    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @Nullable
    public final OpenPayPaymentLinkStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final OpenPayTransaction getTransaction() {
        return this.transaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iA = a.a(this.iva, a.a(this.currency, a.a(this.orderId, a.a(this.description, (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + iHashCode) * 31, 31), 31), 31), 31);
        String str = this.redirectUrl;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        OpenPayPaymentLinkStatus openPayPaymentLinkStatus = this.status;
        int iA2 = a.a(this.expirationDate, a.a(this.creationDate, a.a(this.checkoutLink, (iHashCode2 + (openPayPaymentLinkStatus == null ? 0 : openPayPaymentLinkStatus.hashCode())) * 31, 31), 31), 31);
        boolean z10 = this.sendEmail;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iHashCode3 = (this.customer.hashCode() + ((iA2 + r3) * 31)) * 31;
        Integer num = this.plan;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        OpenPayTransaction openPayTransaction = this.transaction;
        return iHashCode4 + (openPayTransaction != null ? openPayTransaction.hashCode() : 0);
    }

    public final void setExpirationDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expirationDate = str;
    }

    public final void setSendEmail(boolean z10) {
        this.sendEmail = z10;
    }

    public final void setStatus(@Nullable OpenPayPaymentLinkStatus openPayPaymentLinkStatus) {
        this.status = openPayPaymentLinkStatus;
    }

    @NotNull
    public String toString() {
        OpenPayPaymentLinkStatus openPayPaymentLinkStatus = this.status;
        String str = this.expirationDate;
        boolean z10 = this.sendEmail;
        StringBuilder sb2 = new StringBuilder("OpenPayPaymentLink(id=");
        sb2.append(this.id);
        sb2.append(", amount=");
        sb2.append(this.amount);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", orderId=");
        sb2.append(this.orderId);
        sb2.append(", currency=");
        sb2.append(this.currency);
        sb2.append(", iva=");
        sb2.append(this.iva);
        sb2.append(", redirectUrl=");
        sb2.append(this.redirectUrl);
        sb2.append(", status=");
        sb2.append(openPayPaymentLinkStatus);
        sb2.append(", checkoutLink=");
        sb2.append(this.checkoutLink);
        sb2.append(", creationDate=");
        k.e(sb2, this.creationDate, ", expirationDate=", str, ", sendEmail=");
        sb2.append(z10);
        sb2.append(", customer=");
        sb2.append(this.customer);
        sb2.append(", plan=");
        sb2.append(this.plan);
        sb2.append(", transaction=");
        sb2.append(this.transaction);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.description);
        parcel.writeString(this.orderId);
        parcel.writeString(this.currency);
        parcel.writeString(this.iva);
        parcel.writeString(this.redirectUrl);
        OpenPayPaymentLinkStatus openPayPaymentLinkStatus = this.status;
        if (openPayPaymentLinkStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(openPayPaymentLinkStatus.name());
        }
        parcel.writeString(this.checkoutLink);
        parcel.writeString(this.creationDate);
        parcel.writeString(this.expirationDate);
        parcel.writeInt(this.sendEmail ? 1 : 0);
        this.customer.writeToParcel(parcel, flags);
        Integer num = this.plan;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        OpenPayTransaction openPayTransaction = this.transaction;
        if (openPayTransaction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openPayTransaction.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ OpenPayPaymentLink(String str, double d2, String str2, String str3, String str4, String str5, String str6, OpenPayPaymentLinkStatus openPayPaymentLinkStatus, String str7, String str8, String str9, boolean z10, OpenPayCustomer openPayCustomer, Integer num, OpenPayTransaction openPayTransaction, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d2, str2, str3, (i10 & 16) != 0 ? DependenciesProvider.INSTANCE.provideCurrencyIsoCode() : str4, str5, str6, (i10 & 128) != 0 ? null : openPayPaymentLinkStatus, str7, str8, str9, z10, openPayCustomer, (i10 & 8192) != 0 ? null : num, (i10 & 16384) != 0 ? null : openPayTransaction);
    }
}
