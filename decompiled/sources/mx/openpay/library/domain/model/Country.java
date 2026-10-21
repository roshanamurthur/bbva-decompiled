package mx.openpay.library.domain.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Country.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lmx/openpay/library/domain/model/Country;", "", "", "component1", "component2", "Lmx/openpay/library/domain/model/Currency;", "component3", "name", "code", "currency", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getCode", "c", "Lmx/openpay/library/domain/model/Currency;", "getCurrency", "()Lmx/openpay/library/domain/model/Currency;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/domain/model/Currency;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Country {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Currency currency;

    public Country(@NotNull String name, @NotNull String code, @NotNull Currency currency) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.name = name;
        this.code = code;
        this.currency = currency;
    }

    public static /* synthetic */ Country copy$default(Country country, String str, String str2, Currency currency, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = country.name;
        }
        if ((i10 & 2) != 0) {
            str2 = country.code;
        }
        if ((i10 & 4) != 0) {
            currency = country.currency;
        }
        return country.copy(str, str2, currency);
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
    public final Currency getCurrency() {
        return this.currency;
    }

    @NotNull
    public final Country copy(@NotNull String name, @NotNull String code, @NotNull Currency currency) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new Country(name, code, currency);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return Intrinsics.areEqual(this.name, country.name) && Intrinsics.areEqual(this.code, country.code) && Intrinsics.areEqual(this.currency, country.currency);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final Currency getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.currency.hashCode() + n1.c(this.code, this.name.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "Country(name=" + this.name + ", code=" + this.code + ", currency=" + this.currency + ")";
    }
}
