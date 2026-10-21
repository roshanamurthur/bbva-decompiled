package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import d.a;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;", "Landroid/os/Parcelable;", PushConstants.AMOUNT, "Ljava/math/BigDecimal;", "orderId", "", "plan", "", "description", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getDescription", "()Ljava/lang/String;", "getOrderId", "getPlan", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;", "describeContents", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayTerminalChargeCreation implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OpenPayTerminalChargeCreation> CREATOR = new Creator();

    @NotNull
    private final BigDecimal amount;

    @NotNull
    private final String description;

    @NotNull
    private final String orderId;

    @Nullable
    private final Integer plan;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayTerminalChargeCreation> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayTerminalChargeCreation createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayTerminalChargeCreation((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayTerminalChargeCreation[] newArray(int i10) {
            return new OpenPayTerminalChargeCreation[i10];
        }
    }

    public OpenPayTerminalChargeCreation(@NotNull BigDecimal amount, @NotNull String orderId, @Nullable Integer num, @NotNull String description) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(description, "description");
        this.amount = amount;
        this.orderId = orderId;
        this.plan = num;
        this.description = description;
    }

    public static /* synthetic */ OpenPayTerminalChargeCreation copy$default(OpenPayTerminalChargeCreation openPayTerminalChargeCreation, BigDecimal bigDecimal, String str, Integer num, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bigDecimal = openPayTerminalChargeCreation.amount;
        }
        if ((i10 & 2) != 0) {
            str = openPayTerminalChargeCreation.orderId;
        }
        if ((i10 & 4) != 0) {
            num = openPayTerminalChargeCreation.plan;
        }
        if ((i10 & 8) != 0) {
            str2 = openPayTerminalChargeCreation.description;
        }
        return openPayTerminalChargeCreation.copy(bigDecimal, str, num, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPlan() {
        return this.plan;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final OpenPayTerminalChargeCreation copy(@NotNull BigDecimal amount, @NotNull String orderId, @Nullable Integer plan, @NotNull String description) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(description, "description");
        return new OpenPayTerminalChargeCreation(amount, orderId, plan, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayTerminalChargeCreation)) {
            return false;
        }
        OpenPayTerminalChargeCreation openPayTerminalChargeCreation = (OpenPayTerminalChargeCreation) other;
        return Intrinsics.areEqual(this.amount, openPayTerminalChargeCreation.amount) && Intrinsics.areEqual(this.orderId, openPayTerminalChargeCreation.orderId) && Intrinsics.areEqual(this.plan, openPayTerminalChargeCreation.plan) && Intrinsics.areEqual(this.description, openPayTerminalChargeCreation.description);
    }

    @NotNull
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Integer getPlan() {
        return this.plan;
    }

    public int hashCode() {
        int iA = a.a(this.orderId, this.amount.hashCode() * 31, 31);
        Integer num = this.plan;
        return this.description.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "OpenPayTerminalChargeCreation(amount=" + this.amount + ", orderId=" + this.orderId + ", plan=" + this.plan + ", description=" + this.description + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeSerializable(this.amount);
        parcel.writeString(this.orderId);
        Integer num = this.plan;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.description);
    }

    public /* synthetic */ OpenPayTerminalChargeCreation(BigDecimal bigDecimal, String str, Integer num, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? "" : str2);
    }
}
