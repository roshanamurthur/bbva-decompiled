package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "Landroid/os/Parcelable;", "", "component1", "Lmx/openpay/library/core/model/OpenPayPaymentType;", "component2", "payments", "paymentsType", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPayments", "()I", "q0", "Lmx/openpay/library/core/model/OpenPayPaymentType;", "getPaymentsType", "()Lmx/openpay/library/core/model/OpenPayPaymentType;", "<init>", "(ILmx/openpay/library/core/model/OpenPayPaymentType;)V", "library_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OpenPayPaymentPlan implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OpenPayPaymentPlan> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int payments;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OpenPayPaymentType paymentsType;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayPaymentPlan> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayPaymentPlan createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayPaymentPlan(parcel.readInt(), OpenPayPaymentType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayPaymentPlan[] newArray(int i10) {
            return new OpenPayPaymentPlan[i10];
        }
    }

    public OpenPayPaymentPlan(int i10, @NotNull OpenPayPaymentType paymentsType) {
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        this.payments = i10;
        this.paymentsType = paymentsType;
    }

    public static /* synthetic */ OpenPayPaymentPlan copy$default(OpenPayPaymentPlan openPayPaymentPlan, int i10, OpenPayPaymentType openPayPaymentType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = openPayPaymentPlan.payments;
        }
        if ((i11 & 2) != 0) {
            openPayPaymentType = openPayPaymentPlan.paymentsType;
        }
        return openPayPaymentPlan.copy(i10, openPayPaymentType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPayments() {
        return this.payments;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OpenPayPaymentType getPaymentsType() {
        return this.paymentsType;
    }

    @NotNull
    public final OpenPayPaymentPlan copy(int payments, @NotNull OpenPayPaymentType paymentsType) {
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        return new OpenPayPaymentPlan(payments, paymentsType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayPaymentPlan)) {
            return false;
        }
        OpenPayPaymentPlan openPayPaymentPlan = (OpenPayPaymentPlan) other;
        return this.payments == openPayPaymentPlan.payments && this.paymentsType == openPayPaymentPlan.paymentsType;
    }

    public final int getPayments() {
        return this.payments;
    }

    @NotNull
    public final OpenPayPaymentType getPaymentsType() {
        return this.paymentsType;
    }

    public int hashCode() {
        return this.paymentsType.hashCode() + (this.payments * 31);
    }

    @NotNull
    public String toString() {
        return "OpenPayPaymentPlan(payments=" + this.payments + ", paymentsType=" + this.paymentsType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.payments);
        parcel.writeString(this.paymentsType.name());
    }
}
