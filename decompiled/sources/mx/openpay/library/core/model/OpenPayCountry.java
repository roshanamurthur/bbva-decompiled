package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lmx/openpay/library/core/model/OpenPayCountry;", "Landroid/os/Parcelable;", "name", "", "code", "currency", "Lmx/openpay/library/core/model/OpenPayCurrency;", "(Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/core/model/OpenPayCurrency;)V", "getCode", "()Ljava/lang/String;", "getCurrency", "()Lmx/openpay/library/core/model/OpenPayCurrency;", "getName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayCountry implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OpenPayCountry> CREATOR = new Creator();

    @NotNull
    private final String code;

    @NotNull
    private final OpenPayCurrency currency;

    @NotNull
    private final String name;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayCountry> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCountry createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayCountry(parcel.readString(), parcel.readString(), OpenPayCurrency.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCountry[] newArray(int i10) {
            return new OpenPayCountry[i10];
        }
    }

    public OpenPayCountry(@NotNull String name, @NotNull String code, @NotNull OpenPayCurrency currency) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.name = name;
        this.code = code;
        this.currency = currency;
    }

    public static /* synthetic */ OpenPayCountry copy$default(OpenPayCountry openPayCountry, String str, String str2, OpenPayCurrency openPayCurrency, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = openPayCountry.name;
        }
        if ((i10 & 2) != 0) {
            str2 = openPayCountry.code;
        }
        if ((i10 & 4) != 0) {
            openPayCurrency = openPayCountry.currency;
        }
        return openPayCountry.copy(str, str2, openPayCurrency);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OpenPayCurrency getCurrency() {
        return this.currency;
    }

    @NotNull
    public final OpenPayCountry copy(@NotNull String name, @NotNull String code, @NotNull OpenPayCurrency currency) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new OpenPayCountry(name, code, currency);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayCountry)) {
            return false;
        }
        OpenPayCountry openPayCountry = (OpenPayCountry) other;
        return Intrinsics.areEqual(this.name, openPayCountry.name) && Intrinsics.areEqual(this.code, openPayCountry.code) && Intrinsics.areEqual(this.currency, openPayCountry.currency);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final OpenPayCurrency getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.currency.hashCode() + a.a(this.code, this.name.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.code;
        OpenPayCurrency openPayCurrency = this.currency;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("OpenPayCountry(name=", str, ", code=", str2, ", currency=");
        sbC.append(openPayCurrency);
        sbC.append(")");
        return sbC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.code);
        this.currency.writeToParcel(parcel, flags);
    }
}
