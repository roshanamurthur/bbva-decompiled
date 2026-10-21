package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeeResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/FeeResponseDto;", "", PushConstants.AMOUNT, "", "currency", "", FirebaseAnalytics.Param.TAX, "(DLjava/lang/String;D)V", "getAmount", "()D", "getCurrency", "()Ljava/lang/String;", "getTax", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FeeResponseDto {

    @SerializedName(PushConstants.AMOUNT)
    private final double amount;

    @SerializedName("currency")
    @NotNull
    private final String currency;

    @SerializedName(FirebaseAnalytics.Param.TAX)
    private final double tax;

    public FeeResponseDto(double d2, @NotNull String currency, double d3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = d2;
        this.currency = currency;
        this.tax = d3;
    }

    public static /* synthetic */ FeeResponseDto copy$default(FeeResponseDto feeResponseDto, double d2, String str, double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = feeResponseDto.amount;
        }
        double d7 = d2;
        if ((i10 & 2) != 0) {
            str = feeResponseDto.currency;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            d3 = feeResponseDto.tax;
        }
        return feeResponseDto.copy(d7, str2, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getTax() {
        return this.tax;
    }

    @NotNull
    public final FeeResponseDto copy(double amount, @NotNull String currency, double tax) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new FeeResponseDto(amount, currency, tax);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeResponseDto)) {
            return false;
        }
        FeeResponseDto feeResponseDto = (FeeResponseDto) other;
        return Double.compare(this.amount, feeResponseDto.amount) == 0 && Intrinsics.areEqual(this.currency, feeResponseDto.currency) && Double.compare(this.tax, feeResponseDto.tax) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final double getTax() {
        return this.tax;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iC = n1.c(this.currency, ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.tax);
        return iC + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @NotNull
    public String toString() {
        return "FeeResponseDto(amount=" + this.amount + ", currency=" + this.currency + ", tax=" + this.tax + ")";
    }
}
