package mx.openpay.library.data.datasource.remote.model.request.eglobal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentPlanRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanRequestDto;", "", "payments", "", "paymentsType", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentTypeRequestDto;", "(ILmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentTypeRequestDto;)V", "getPayments", "()I", "getPaymentsType", "()Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentTypeRequestDto;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaymentPlanRequestDto {

    @SerializedName("payments")
    private final int payments;

    @SerializedName("payments_type")
    @NotNull
    private final PaymentTypeRequestDto paymentsType;

    public PaymentPlanRequestDto(int i10, @NotNull PaymentTypeRequestDto paymentsType) {
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        this.payments = i10;
        this.paymentsType = paymentsType;
    }

    public static /* synthetic */ PaymentPlanRequestDto copy$default(PaymentPlanRequestDto paymentPlanRequestDto, int i10, PaymentTypeRequestDto paymentTypeRequestDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = paymentPlanRequestDto.payments;
        }
        if ((i11 & 2) != 0) {
            paymentTypeRequestDto = paymentPlanRequestDto.paymentsType;
        }
        return paymentPlanRequestDto.copy(i10, paymentTypeRequestDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPayments() {
        return this.payments;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentTypeRequestDto getPaymentsType() {
        return this.paymentsType;
    }

    @NotNull
    public final PaymentPlanRequestDto copy(int payments, @NotNull PaymentTypeRequestDto paymentsType) {
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        return new PaymentPlanRequestDto(payments, paymentsType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPlanRequestDto)) {
            return false;
        }
        PaymentPlanRequestDto paymentPlanRequestDto = (PaymentPlanRequestDto) other;
        return this.payments == paymentPlanRequestDto.payments && this.paymentsType == paymentPlanRequestDto.paymentsType;
    }

    public final int getPayments() {
        return this.payments;
    }

    @NotNull
    public final PaymentTypeRequestDto getPaymentsType() {
        return this.paymentsType;
    }

    public int hashCode() {
        return this.paymentsType.hashCode() + (this.payments * 31);
    }

    @NotNull
    public String toString() {
        return "PaymentPlanRequestDto(payments=" + this.payments + ", paymentsType=" + this.paymentsType + ")";
    }
}
