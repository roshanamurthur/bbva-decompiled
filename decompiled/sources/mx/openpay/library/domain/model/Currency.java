package mx.openpay.library.domain.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Currency.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lmx/openpay/library/domain/model/Currency;", "", "", "component1", "component2", "component3", "component4", "name", "symbol", "isoCode", "numericCode", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getSymbol", "c", "getIsoCode", "d", "getNumericCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Currency {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String isoCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String numericCode;

    public Currency(@NotNull String name, @NotNull String symbol, @NotNull String isoCode, @NotNull String numericCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        Intrinsics.checkNotNullParameter(numericCode, "numericCode");
        this.name = name;
        this.symbol = symbol;
        this.isoCode = isoCode;
        this.numericCode = numericCode;
    }

    public static /* synthetic */ Currency copy$default(Currency currency, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = currency.name;
        }
        if ((i10 & 2) != 0) {
            str2 = currency.symbol;
        }
        if ((i10 & 4) != 0) {
            str3 = currency.isoCode;
        }
        if ((i10 & 8) != 0) {
            str4 = currency.numericCode;
        }
        return currency.copy(str, str2, str3, str4);
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
    public final Currency copy(@NotNull String name, @NotNull String symbol, @NotNull String isoCode, @NotNull String numericCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        Intrinsics.checkNotNullParameter(numericCode, "numericCode");
        return new Currency(name, symbol, isoCode, numericCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Currency)) {
            return false;
        }
        Currency currency = (Currency) other;
        return Intrinsics.areEqual(this.name, currency.name) && Intrinsics.areEqual(this.symbol, currency.symbol) && Intrinsics.areEqual(this.isoCode, currency.isoCode) && Intrinsics.areEqual(this.numericCode, currency.numericCode);
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
        return this.numericCode.hashCode() + n1.c(this.isoCode, n1.c(this.symbol, this.name.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Currency(name=");
        sb2.append(this.name);
        sb2.append(", symbol=");
        sb2.append(this.symbol);
        sb2.append(", isoCode=");
        sb2.append(this.isoCode);
        sb2.append(", numericCode=");
        return d.f(sb2, this.numericCode, ")");
    }
}
