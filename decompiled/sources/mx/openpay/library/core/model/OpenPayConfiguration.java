package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lmx/openpay/library/core/model/OpenPayConfiguration;", "Landroid/os/Parcelable;", "environment", "Lmx/openpay/library/core/model/OpenPayEnvironment;", "country", "Lmx/openpay/library/core/model/OpenPayCountry;", "integrator", "Lmx/openpay/library/core/model/OpenPayIntegrator;", "(Lmx/openpay/library/core/model/OpenPayEnvironment;Lmx/openpay/library/core/model/OpenPayCountry;Lmx/openpay/library/core/model/OpenPayIntegrator;)V", "getCountry", "()Lmx/openpay/library/core/model/OpenPayCountry;", "getEnvironment", "()Lmx/openpay/library/core/model/OpenPayEnvironment;", "getIntegrator", "()Lmx/openpay/library/core/model/OpenPayIntegrator;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayConfiguration implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OpenPayConfiguration> CREATOR = new Creator();

    @NotNull
    private final OpenPayCountry country;

    @NotNull
    private final OpenPayEnvironment environment;

    @NotNull
    private final OpenPayIntegrator integrator;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayConfiguration> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayConfiguration createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayConfiguration(OpenPayEnvironment.CREATOR.createFromParcel(parcel), OpenPayCountry.CREATOR.createFromParcel(parcel), OpenPayIntegrator.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayConfiguration[] newArray(int i10) {
            return new OpenPayConfiguration[i10];
        }
    }

    public OpenPayConfiguration(@NotNull OpenPayEnvironment environment, @NotNull OpenPayCountry country, @NotNull OpenPayIntegrator integrator) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(integrator, "integrator");
        this.environment = environment;
        this.country = country;
        this.integrator = integrator;
    }

    public static /* synthetic */ OpenPayConfiguration copy$default(OpenPayConfiguration openPayConfiguration, OpenPayEnvironment openPayEnvironment, OpenPayCountry openPayCountry, OpenPayIntegrator openPayIntegrator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            openPayEnvironment = openPayConfiguration.environment;
        }
        if ((i10 & 2) != 0) {
            openPayCountry = openPayConfiguration.country;
        }
        if ((i10 & 4) != 0) {
            openPayIntegrator = openPayConfiguration.integrator;
        }
        return openPayConfiguration.copy(openPayEnvironment, openPayCountry, openPayIntegrator);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OpenPayEnvironment getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OpenPayCountry getCountry() {
        return this.country;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OpenPayIntegrator getIntegrator() {
        return this.integrator;
    }

    @NotNull
    public final OpenPayConfiguration copy(@NotNull OpenPayEnvironment environment, @NotNull OpenPayCountry country, @NotNull OpenPayIntegrator integrator) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(integrator, "integrator");
        return new OpenPayConfiguration(environment, country, integrator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayConfiguration)) {
            return false;
        }
        OpenPayConfiguration openPayConfiguration = (OpenPayConfiguration) other;
        return Intrinsics.areEqual(this.environment, openPayConfiguration.environment) && Intrinsics.areEqual(this.country, openPayConfiguration.country) && this.integrator == openPayConfiguration.integrator;
    }

    @NotNull
    public final OpenPayCountry getCountry() {
        return this.country;
    }

    @NotNull
    public final OpenPayEnvironment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final OpenPayIntegrator getIntegrator() {
        return this.integrator;
    }

    public int hashCode() {
        return this.integrator.hashCode() + ((this.country.hashCode() + (this.environment.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "OpenPayConfiguration(environment=" + this.environment + ", country=" + this.country + ", integrator=" + this.integrator + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.environment.writeToParcel(parcel, flags);
        this.country.writeToParcel(parcel, flags);
        parcel.writeString(this.integrator.name());
    }
}
