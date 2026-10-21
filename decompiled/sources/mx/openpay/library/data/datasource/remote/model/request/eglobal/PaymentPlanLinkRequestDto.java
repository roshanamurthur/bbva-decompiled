package mx.openpay.library.data.datasource.remote.model.request.eglobal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentPlanLinkRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanLinkRequestDto;", "", "payments", "", "paymentsType", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentTypeRequestDto;", "(Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentTypeRequestDto;)V", "getPayments", "()Ljava/lang/String;", "getPaymentsType", "()Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentTypeRequestDto;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaymentPlanLinkRequestDto {

    @SerializedName("payments")
    @NotNull
    private final String payments;

    @SerializedName("payments_type")
    @NotNull
    private final PaymentTypeRequestDto paymentsType;

    public PaymentPlanLinkRequestDto(@NotNull String payments, @NotNull PaymentTypeRequestDto paymentsType) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        this.payments = payments;
        this.paymentsType = paymentsType;
    }

    public static /* synthetic */ PaymentPlanLinkRequestDto copy$default(PaymentPlanLinkRequestDto paymentPlanLinkRequestDto, String str, PaymentTypeRequestDto paymentTypeRequestDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentPlanLinkRequestDto.payments;
        }
        if ((i10 & 2) != 0) {
            paymentTypeRequestDto = paymentPlanLinkRequestDto.paymentsType;
        }
        return paymentPlanLinkRequestDto.copy(str, paymentTypeRequestDto);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayments() {
        return this.payments;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentTypeRequestDto getPaymentsType() {
        return this.paymentsType;
    }

    @NotNull
    public final PaymentPlanLinkRequestDto copy(@NotNull String payments, @NotNull PaymentTypeRequestDto paymentsType) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        return new PaymentPlanLinkRequestDto(payments, paymentsType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPlanLinkRequestDto)) {
            return false;
        }
        PaymentPlanLinkRequestDto paymentPlanLinkRequestDto = (PaymentPlanLinkRequestDto) other;
        return Intrinsics.areEqual(this.payments, paymentPlanLinkRequestDto.payments) && this.paymentsType == paymentPlanLinkRequestDto.paymentsType;
    }

    @NotNull
    public final String getPayments() {
        return this.payments;
    }

    @NotNull
    public final PaymentTypeRequestDto getPaymentsType() {
        return this.paymentsType;
    }

    public int hashCode() {
        return this.paymentsType.hashCode() + (this.payments.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PaymentPlanLinkRequestDto(payments=" + this.payments + ", paymentsType=" + this.paymentsType + ")";
    }
}
