package mx.openpay.library.core.model.extra;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.noknok.android.client.utils.UIConfigTags;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003JW\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000bHÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u00065"}, d2 = {"Lmx/openpay/library/core/model/extra/OrderTerminal;", "Landroid/os/Parcelable;", PushConstants.AMOUNT, "", "iva", "", "description", "orderId", "currency", "dni", UIConfigTags.TAG_MONTHS, "", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAmount", "()D", "setAmount", "(D)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getDni", "setDni", "getIva", "setIva", "getMonths", "()I", "setMonths", "(I)V", "getOrderId", "setOrderId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OrderTerminal implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OrderTerminal> CREATOR = new Creator();
    private double amount;

    @Nullable
    private String currency;

    @Nullable
    private String description;

    @Nullable
    private String dni;

    @Nullable
    private String iva;
    private int months;

    @NotNull
    private String orderId;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderTerminal> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderTerminal createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderTerminal(parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderTerminal[] newArray(int i10) {
            return new OrderTerminal[i10];
        }
    }

    public OrderTerminal(double d2, @Nullable String str, @Nullable String str2, @NotNull String orderId, @Nullable String str3, @Nullable String str4, int i10) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.amount = d2;
        this.iva = str;
        this.description = str2;
        this.orderId = orderId;
        this.currency = str3;
        this.dni = str4;
        this.months = i10;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIva() {
        return this.iva;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDni() {
        return this.dni;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMonths() {
        return this.months;
    }

    @NotNull
    public final OrderTerminal copy(double amount, @Nullable String iva, @Nullable String description, @NotNull String orderId, @Nullable String currency, @Nullable String dni, int months) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new OrderTerminal(amount, iva, description, orderId, currency, dni, months);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTerminal)) {
            return false;
        }
        OrderTerminal orderTerminal = (OrderTerminal) other;
        return Double.compare(this.amount, orderTerminal.amount) == 0 && Intrinsics.areEqual(this.iva, orderTerminal.iva) && Intrinsics.areEqual(this.description, orderTerminal.description) && Intrinsics.areEqual(this.orderId, orderTerminal.orderId) && Intrinsics.areEqual(this.currency, orderTerminal.currency) && Intrinsics.areEqual(this.dni, orderTerminal.dni) && this.months == orderTerminal.months;
    }

    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDni() {
        return this.dni;
    }

    @Nullable
    public final String getIva() {
        return this.iva;
    }

    public final int getMonths() {
        return this.months;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        String str = this.iva;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iA = a.a(this.orderId, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.currency;
        int iHashCode2 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dni;
        return this.months + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final void setAmount(double d2) {
        this.amount = d2;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDni(@Nullable String str) {
        this.dni = str;
    }

    public final void setIva(@Nullable String str) {
        this.iva = str;
    }

    public final void setMonths(int i10) {
        this.months = i10;
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    @NotNull
    public String toString() {
        double d2 = this.amount;
        String str = this.iva;
        String str2 = this.description;
        String str3 = this.orderId;
        String str4 = this.currency;
        String str5 = this.dni;
        int i10 = this.months;
        StringBuilder sb2 = new StringBuilder("OrderTerminal(amount=");
        sb2.append(d2);
        sb2.append(", iva=");
        sb2.append(str);
        k.e(sb2, ", description=", str2, ", orderId=", str3);
        k.e(sb2, ", currency=", str4, ", dni=", str5);
        sb2.append(", months=");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.amount);
        parcel.writeString(this.iva);
        parcel.writeString(this.description);
        parcel.writeString(this.orderId);
        parcel.writeString(this.currency);
        parcel.writeString(this.dni);
        parcel.writeInt(this.months);
    }
}
