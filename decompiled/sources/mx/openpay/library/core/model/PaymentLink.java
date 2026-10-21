package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import d.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import mx.openpay.library.di.DependenciesProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\bJ\u0010KJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Js\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\r2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0010HÖ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010\"\u001a\u00020\u0010HÖ\u0001J\u0019\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/\"\u0004\b:\u0010;R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lmx/openpay/library/core/model/PaymentLink;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "Lmx/openpay/library/core/model/OpenPayCustomer;", "component9", "", "", "component10", PushConstants.AMOUNT, "description", "orderId", "currency", "iva", "redirectUrl", "expirationDate", "sendEmail", "customer", "plan", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "D", "getAmount", "()D", "q0", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "r0", "getOrderId", "s0", "getCurrency", "t0", "getIva", "u0", "getRedirectUrl", "v0", "getExpirationDate", "setExpirationDate", "(Ljava/lang/String;)V", "w0", "Z", "getSendEmail", "()Z", "setSendEmail", "(Z)V", "x0", "Lmx/openpay/library/core/model/OpenPayCustomer;", "getCustomer", "()Lmx/openpay/library/core/model/OpenPayCustomer;", "y0", "Ljava/util/List;", "getPlan", "()Ljava/util/List;", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmx/openpay/library/core/model/OpenPayCustomer;Ljava/util/List;)V", "library_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PaymentLink implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PaymentLink> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String iva;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String redirectUrl;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public String expirationDate;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public boolean sendEmail;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OpenPayCustomer customer;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Integer> plan;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentLink> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentLink createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            double d2 = parcel.readDouble();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            OpenPayCustomer openPayCustomerCreateFromParcel = OpenPayCustomer.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new PaymentLink(d2, string, string2, string3, string4, string5, string6, z10, openPayCustomerCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentLink[] newArray(int i10) {
            return new PaymentLink[i10];
        }
    }

    public PaymentLink(double d2, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String redirectUrl, @NotNull String expirationDate, boolean z10, @NotNull OpenPayCustomer customer, @NotNull List<Integer> plan) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.amount = d2;
        this.description = description;
        this.orderId = orderId;
        this.currency = currency;
        this.iva = iva;
        this.redirectUrl = redirectUrl;
        this.expirationDate = expirationDate;
        this.sendEmail = z10;
        this.customer = customer;
        this.plan = plan;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final List<Integer> component10() {
        return this.plan;
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
    public final OpenPayCustomer getCustomer() {
        return this.customer;
    }

    @NotNull
    public final PaymentLink copy(double amount, @NotNull String description, @NotNull String orderId, @NotNull String currency, @NotNull String iva, @NotNull String redirectUrl, @NotNull String expirationDate, boolean sendEmail, @NotNull OpenPayCustomer customer, @NotNull List<Integer> plan) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iva, "iva");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(customer, "customer");
        Intrinsics.checkNotNullParameter(plan, "plan");
        return new PaymentLink(amount, description, orderId, currency, iva, redirectUrl, expirationDate, sendEmail, customer, plan);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentLink)) {
            return false;
        }
        PaymentLink paymentLink = (PaymentLink) other;
        return Double.compare(this.amount, paymentLink.amount) == 0 && Intrinsics.areEqual(this.description, paymentLink.description) && Intrinsics.areEqual(this.orderId, paymentLink.orderId) && Intrinsics.areEqual(this.currency, paymentLink.currency) && Intrinsics.areEqual(this.iva, paymentLink.iva) && Intrinsics.areEqual(this.redirectUrl, paymentLink.redirectUrl) && Intrinsics.areEqual(this.expirationDate, paymentLink.expirationDate) && this.sendEmail == paymentLink.sendEmail && Intrinsics.areEqual(this.customer, paymentLink.customer) && Intrinsics.areEqual(this.plan, paymentLink.plan);
    }

    public final double getAmount() {
        return this.amount;
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
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iA = a.a(this.expirationDate, a.a(this.redirectUrl, a.a(this.iva, a.a(this.currency, a.a(this.orderId, a.a(this.description, ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31), 31), 31), 31), 31), 31);
        boolean z10 = this.sendEmail;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        return this.plan.hashCode() + ((this.customer.hashCode() + ((iA + r3) * 31)) * 31);
    }

    public final void setExpirationDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expirationDate = str;
    }

    public final void setSendEmail(boolean z10) {
        this.sendEmail = z10;
    }

    @NotNull
    public String toString() {
        String str = this.expirationDate;
        boolean z10 = this.sendEmail;
        StringBuilder sb2 = new StringBuilder("PaymentLink(amount=");
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
        k.e(sb2, this.redirectUrl, ", expirationDate=", str, ", sendEmail=");
        sb2.append(z10);
        sb2.append(", customer=");
        sb2.append(this.customer);
        sb2.append(", plan=");
        return androidx.camera.core.imagecapture.a.c(sb2, this.plan, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.amount);
        parcel.writeString(this.description);
        parcel.writeString(this.orderId);
        parcel.writeString(this.currency);
        parcel.writeString(this.iva);
        parcel.writeString(this.redirectUrl);
        parcel.writeString(this.expirationDate);
        parcel.writeInt(this.sendEmail ? 1 : 0);
        this.customer.writeToParcel(parcel, flags);
        List<Integer> list = this.plan;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public /* synthetic */ PaymentLink(double d2, String str, String str2, String str3, String str4, String str5, String str6, boolean z10, OpenPayCustomer openPayCustomer, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, str, str2, (i10 & 8) != 0 ? DependenciesProvider.INSTANCE.provideCurrencyIsoCode() : str3, str4, str5, str6, z10, openPayCustomer, (i10 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
