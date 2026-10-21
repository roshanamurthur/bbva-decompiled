package com.bbva.glomohybrid.mobilepayment.lib.model;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AppsFlyerProperties;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Amount.kt */
/* JADX INFO: loaded from: classes6.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/lib/model/Amount;", "Landroid/os/Parcelable;", "", "component1", "component2", PushConstants.AMOUNT, AppsFlyerProperties.CURRENCY_CODE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getAmount", "()Ljava/lang/String;", "q0", "getCurrencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "library_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Amount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Amount> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String amount;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String currencyCode;

    /* JADX INFO: compiled from: Amount.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Amount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Amount createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Amount(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Amount[] newArray(int i10) {
            return new Amount[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Amount() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Amount copy$default(Amount amount, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = amount.amount;
        }
        if ((i10 & 2) != 0) {
            str2 = amount.currencyCode;
        }
        return amount.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final Amount copy(@Nullable String amount, @Nullable String currencyCode) {
        return new Amount(amount, currencyCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) other;
        return Intrinsics.areEqual(this.amount, amount.amount) && Intrinsics.areEqual(this.currencyCode, amount.currencyCode);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyCode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Amount(amount=");
        sb2.append(this.amount);
        sb2.append(", currencyCode=");
        return d.f(sb2, this.currencyCode, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.amount);
        parcel.writeString(this.currencyCode);
    }

    public Amount(@Nullable String str, @Nullable String str2) {
        this.amount = str;
        this.currencyCode = str2;
    }

    public /* synthetic */ Amount(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
