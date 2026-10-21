package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.widget.a;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, d2 = {"Lmx/openpay/library/core/model/OpenPayCardPoints;", "Landroid/os/Parcelable;", PushConstants.AMOUNT, "", "remaining", "", "used", "(Ljava/lang/Double;II)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRemaining", "()I", "getUsed", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;II)Lmx/openpay/library/core/model/OpenPayCardPoints;", "describeContents", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayCardPoints implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OpenPayCardPoints> CREATOR = new Creator();

    @Nullable
    private final Double amount;
    private final int remaining;
    private final int used;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayCardPoints> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCardPoints createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayCardPoints(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCardPoints[] newArray(int i10) {
            return new OpenPayCardPoints[i10];
        }
    }

    public OpenPayCardPoints(@Nullable Double d2, int i10, int i11) {
        this.amount = d2;
        this.remaining = i10;
        this.used = i11;
    }

    public static /* synthetic */ OpenPayCardPoints copy$default(OpenPayCardPoints openPayCardPoints, Double d2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d2 = openPayCardPoints.amount;
        }
        if ((i12 & 2) != 0) {
            i10 = openPayCardPoints.remaining;
        }
        if ((i12 & 4) != 0) {
            i11 = openPayCardPoints.used;
        }
        return openPayCardPoints.copy(d2, i10, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRemaining() {
        return this.remaining;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUsed() {
        return this.used;
    }

    @NotNull
    public final OpenPayCardPoints copy(@Nullable Double amount, int remaining, int used) {
        return new OpenPayCardPoints(amount, remaining, used);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayCardPoints)) {
            return false;
        }
        OpenPayCardPoints openPayCardPoints = (OpenPayCardPoints) other;
        return Intrinsics.areEqual((Object) this.amount, (Object) openPayCardPoints.amount) && this.remaining == openPayCardPoints.remaining && this.used == openPayCardPoints.used;
    }

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    public final int getRemaining() {
        return this.remaining;
    }

    public final int getUsed() {
        return this.used;
    }

    public int hashCode() {
        Double d2 = this.amount;
        return this.used + ((this.remaining + ((d2 == null ? 0 : d2.hashCode()) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        Double d2 = this.amount;
        int i10 = this.remaining;
        int i11 = this.used;
        StringBuilder sb2 = new StringBuilder("OpenPayCardPoints(amount=");
        sb2.append(d2);
        sb2.append(", remaining=");
        sb2.append(i10);
        sb2.append(", used=");
        return a.c(sb2, i11, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Double d2 = this.amount;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeInt(this.remaining);
        parcel.writeInt(this.used);
    }
}
