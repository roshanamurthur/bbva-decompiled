package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.c;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006 "}, d2 = {"Lmx/openpay/library/core/model/OpenPayCurrency;", "Landroid/os/Parcelable;", "name", "", "symbol", "isoCode", "numericCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIsoCode", "()Ljava/lang/String;", "getName", "getNumericCode", "getSymbol", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayCurrency implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final String isoCode;

    @NotNull
    private final String name;

    @NotNull
    private final String numericCode;

    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<OpenPayCurrency> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/core/model/OpenPayCurrency$Companion;", "", "()V", "createMXN", "Lmx/openpay/library/core/model/OpenPayCurrency;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OpenPayCurrency createMXN() {
            return new OpenPayCurrency("Peso Mexicano", Constant.MXN_SYMBOL, "MXN", "484");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayCurrency> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCurrency createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayCurrency(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCurrency[] newArray(int i10) {
            return new OpenPayCurrency[i10];
        }
    }

    public OpenPayCurrency(@NotNull String name, @NotNull String symbol, @NotNull String isoCode, @NotNull String numericCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        Intrinsics.checkNotNullParameter(numericCode, "numericCode");
        this.name = name;
        this.symbol = symbol;
        this.isoCode = isoCode;
        this.numericCode = numericCode;
    }

    public static /* synthetic */ OpenPayCurrency copy$default(OpenPayCurrency openPayCurrency, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = openPayCurrency.name;
        }
        if ((i10 & 2) != 0) {
            str2 = openPayCurrency.symbol;
        }
        if ((i10 & 4) != 0) {
            str3 = openPayCurrency.isoCode;
        }
        if ((i10 & 8) != 0) {
            str4 = openPayCurrency.numericCode;
        }
        return openPayCurrency.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNumericCode() {
        return this.numericCode;
    }

    @NotNull
    public final OpenPayCurrency copy(@NotNull String name, @NotNull String symbol, @NotNull String isoCode, @NotNull String numericCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        Intrinsics.checkNotNullParameter(numericCode, "numericCode");
        return new OpenPayCurrency(name, symbol, isoCode, numericCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayCurrency)) {
            return false;
        }
        OpenPayCurrency openPayCurrency = (OpenPayCurrency) other;
        return Intrinsics.areEqual(this.name, openPayCurrency.name) && Intrinsics.areEqual(this.symbol, openPayCurrency.symbol) && Intrinsics.areEqual(this.isoCode, openPayCurrency.isoCode) && Intrinsics.areEqual(this.numericCode, openPayCurrency.numericCode);
    }

    @NotNull
    public final String getIsoCode() {
        return this.isoCode;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNumericCode() {
        return this.numericCode;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return this.numericCode.hashCode() + a.a(this.isoCode, a.a(this.symbol, this.name.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.symbol;
        return c.b(androidx.constraintlayout.core.parser.a.c("OpenPayCurrency(name=", str, ", symbol=", str2, ", isoCode="), this.isoCode, ", numericCode=", this.numericCode, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.symbol);
        parcel.writeString(this.isoCode);
        parcel.writeString(this.numericCode);
    }
}
