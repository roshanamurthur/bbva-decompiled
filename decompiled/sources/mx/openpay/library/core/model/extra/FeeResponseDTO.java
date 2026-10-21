package mx.openpay.library.core.model.extra;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lmx/openpay/library/core/model/extra/FeeResponseDTO;", "Landroid/os/Parcelable;", PushConstants.AMOUNT, "", "currency", "", FirebaseAnalytics.Param.TAX, "(DLjava/lang/String;D)V", "getAmount", "()D", "getCurrency", "()Ljava/lang/String;", "getTax", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FeeResponseDTO implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<FeeResponseDTO> CREATOR = new Creator();
    private final double amount;

    @NotNull
    private final String currency;
    private final double tax;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FeeResponseDTO> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeeResponseDTO createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeeResponseDTO(parcel.readDouble(), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeeResponseDTO[] newArray(int i10) {
            return new FeeResponseDTO[i10];
        }
    }

    public FeeResponseDTO(double d2, @NotNull String currency, double d3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = d2;
        this.currency = currency;
        this.tax = d3;
    }

    public static /* synthetic */ FeeResponseDTO copy$default(FeeResponseDTO feeResponseDTO, double d2, String str, double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = feeResponseDTO.amount;
        }
        double d7 = d2;
        if ((i10 & 2) != 0) {
            str = feeResponseDTO.currency;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            d3 = feeResponseDTO.tax;
        }
        return feeResponseDTO.copy(d7, str2, d3);
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
    public final FeeResponseDTO copy(double amount, @NotNull String currency, double tax) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new FeeResponseDTO(amount, currency, tax);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeResponseDTO)) {
            return false;
        }
        FeeResponseDTO feeResponseDTO = (FeeResponseDTO) other;
        return Double.compare(this.amount, feeResponseDTO.amount) == 0 && Intrinsics.areEqual(this.currency, feeResponseDTO.currency) && Double.compare(this.tax, feeResponseDTO.tax) == 0;
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
        int iA = a.a(this.currency, ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.tax);
        return ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2)) + iA;
    }

    @NotNull
    public String toString() {
        return "FeeResponseDTO(amount=" + this.amount + ", currency=" + this.currency + ", tax=" + this.tax + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.amount);
        parcel.writeString(this.currency);
        parcel.writeDouble(this.tax);
    }
}
