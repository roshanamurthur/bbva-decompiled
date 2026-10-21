package mx.openpay.library.data.datasource.remote.model.response;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TaxesResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/TaxesResponseDto;", "", PushConstants.AMOUNT, "", "description", "", "(DLjava/lang/String;)V", "getAmount", "()D", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TaxesResponseDto {

    @SerializedName(PushConstants.AMOUNT)
    private final double amount;

    @SerializedName("description")
    @NotNull
    private final String description;

    public TaxesResponseDto(double d2, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.amount = d2;
        this.description = description;
    }

    public static /* synthetic */ TaxesResponseDto copy$default(TaxesResponseDto taxesResponseDto, double d2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = taxesResponseDto.amount;
        }
        if ((i10 & 2) != 0) {
            str = taxesResponseDto.description;
        }
        return taxesResponseDto.copy(d2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final TaxesResponseDto copy(double amount, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new TaxesResponseDto(amount, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxesResponseDto)) {
            return false;
        }
        TaxesResponseDto taxesResponseDto = (TaxesResponseDto) other;
        return Double.compare(this.amount, taxesResponseDto.amount) == 0 && Intrinsics.areEqual(this.description, taxesResponseDto.description);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        return this.description.hashCode() + (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31);
    }

    @NotNull
    public String toString() {
        return "TaxesResponseDto(amount=" + this.amount + ", description=" + this.description + ")";
    }
}
