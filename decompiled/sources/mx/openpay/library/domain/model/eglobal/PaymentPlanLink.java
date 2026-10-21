package mx.openpay.library.domain.model.eglobal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentPlan.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/PaymentPlanLink;", "", "", "component1", "Lmx/openpay/library/domain/model/eglobal/PaymentType;", "component2", "payments", "paymentsType", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getPayments", "()Ljava/lang/String;", "b", "Lmx/openpay/library/domain/model/eglobal/PaymentType;", "getPaymentsType", "()Lmx/openpay/library/domain/model/eglobal/PaymentType;", "<init>", "(Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/PaymentType;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PaymentPlanLink {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String payments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PaymentType paymentsType;

    public PaymentPlanLink(@NotNull String payments, @NotNull PaymentType paymentsType) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        this.payments = payments;
        this.paymentsType = paymentsType;
    }

    public static /* synthetic */ PaymentPlanLink copy$default(PaymentPlanLink paymentPlanLink, String str, PaymentType paymentType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentPlanLink.payments;
        }
        if ((i10 & 2) != 0) {
            paymentType = paymentPlanLink.paymentsType;
        }
        return paymentPlanLink.copy(str, paymentType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayments() {
        return this.payments;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentType getPaymentsType() {
        return this.paymentsType;
    }

    @NotNull
    public final PaymentPlanLink copy(@NotNull String payments, @NotNull PaymentType paymentsType) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        return new PaymentPlanLink(payments, paymentsType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPlanLink)) {
            return false;
        }
        PaymentPlanLink paymentPlanLink = (PaymentPlanLink) other;
        return Intrinsics.areEqual(this.payments, paymentPlanLink.payments) && this.paymentsType == paymentPlanLink.paymentsType;
    }

    @NotNull
    public final String getPayments() {
        return this.payments;
    }

    @NotNull
    public final PaymentType getPaymentsType() {
        return this.paymentsType;
    }

    public int hashCode() {
        return this.paymentsType.hashCode() + (this.payments.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PaymentPlanLink(payments=" + this.payments + ", paymentsType=" + this.paymentsType + ")";
    }
}
