package mx.openpay.library.data.datasource.remote.model.response.transaction;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentPlanResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/transaction/PaymentPlanResponseDto;", "", "payments", "", "paymentsType", "", "(ILjava/lang/String;)V", "getPayments", "()I", "getPaymentsType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaymentPlanResponseDto {

    @SerializedName("payments")
    private final int payments;

    @SerializedName("payments_type")
    @NotNull
    private final String paymentsType;

    public PaymentPlanResponseDto(int i10, @NotNull String paymentsType) {
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        this.payments = i10;
        this.paymentsType = paymentsType;
    }

    public static /* synthetic */ PaymentPlanResponseDto copy$default(PaymentPlanResponseDto paymentPlanResponseDto, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = paymentPlanResponseDto.payments;
        }
        if ((i11 & 2) != 0) {
            str = paymentPlanResponseDto.paymentsType;
        }
        return paymentPlanResponseDto.copy(i10, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPayments() {
        return this.payments;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentsType() {
        return this.paymentsType;
    }

    @NotNull
    public final PaymentPlanResponseDto copy(int payments, @NotNull String paymentsType) {
        Intrinsics.checkNotNullParameter(paymentsType, "paymentsType");
        return new PaymentPlanResponseDto(payments, paymentsType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPlanResponseDto)) {
            return false;
        }
        PaymentPlanResponseDto paymentPlanResponseDto = (PaymentPlanResponseDto) other;
        return this.payments == paymentPlanResponseDto.payments && Intrinsics.areEqual(this.paymentsType, paymentPlanResponseDto.paymentsType);
    }

    public final int getPayments() {
        return this.payments;
    }

    @NotNull
    public final String getPaymentsType() {
        return this.paymentsType;
    }

    public int hashCode() {
        return this.paymentsType.hashCode() + (this.payments * 31);
    }

    @NotNull
    public String toString() {
        return z1.c("PaymentPlanResponseDto(payments=", this.payments, ", paymentsType=", this.paymentsType, ")");
    }
}
