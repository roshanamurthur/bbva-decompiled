package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lmx/openpay/library/core/model/OpenPayTaxes;", "Landroid/os/Parcelable;", PushConstants.AMOUNT, "", "description", "", "(DLjava/lang/String;)V", "getAmount", "()D", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayTaxes implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OpenPayTaxes> CREATOR = new Creator();
    private final double amount;

    @NotNull
    private final String description;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayTaxes> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayTaxes createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayTaxes(parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayTaxes[] newArray(int i10) {
            return new OpenPayTaxes[i10];
        }
    }

    public OpenPayTaxes(double d2, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.amount = d2;
        this.description = description;
    }

    public static /* synthetic */ OpenPayTaxes copy$default(OpenPayTaxes openPayTaxes, double d2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = openPayTaxes.amount;
        }
        if ((i10 & 2) != 0) {
            str = openPayTaxes.description;
        }
        return openPayTaxes.copy(d2, str);
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
    public final OpenPayTaxes copy(double amount, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new OpenPayTaxes(amount, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayTaxes)) {
            return false;
        }
        OpenPayTaxes openPayTaxes = (OpenPayTaxes) other;
        return Double.compare(this.amount, openPayTaxes.amount) == 0 && Intrinsics.areEqual(this.description, openPayTaxes.description);
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
        return "OpenPayTaxes(amount=" + this.amount + ", description=" + this.description + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.amount);
        parcel.writeString(this.description);
    }
}
