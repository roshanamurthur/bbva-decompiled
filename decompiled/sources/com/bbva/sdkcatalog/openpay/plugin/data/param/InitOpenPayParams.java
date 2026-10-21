package com.bbva.sdkcatalog.openpay.plugin.data.param;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InitOpenPayParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/param/InitOpenPayParams;", "", "country", "", "environment", Constants.device, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getEnvironment", "getDevice", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InitOpenPayParams {

    @SerializedName("country")
    @NotNull
    private final String country;

    @SerializedName(Constants.device)
    @NotNull
    private final String device;

    @SerializedName("environment")
    @NotNull
    private final String environment;

    public InitOpenPayParams(@NotNull String country, @NotNull String environment, @NotNull String device) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(device, "device");
        this.country = country;
        this.environment = environment;
        this.device = device;
    }

    public static /* synthetic */ InitOpenPayParams copy$default(InitOpenPayParams initOpenPayParams, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initOpenPayParams.country;
        }
        if ((i10 & 2) != 0) {
            str2 = initOpenPayParams.environment;
        }
        if ((i10 & 4) != 0) {
            str3 = initOpenPayParams.device;
        }
        return initOpenPayParams.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    @NotNull
    public final InitOpenPayParams copy(@NotNull String country, @NotNull String environment, @NotNull String device) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(device, "device");
        return new InitOpenPayParams(country, environment, device);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitOpenPayParams)) {
            return false;
        }
        InitOpenPayParams initOpenPayParams = (InitOpenPayParams) other;
        return Intrinsics.areEqual(this.country, initOpenPayParams.country) && Intrinsics.areEqual(this.environment, initOpenPayParams.environment) && Intrinsics.areEqual(this.device, initOpenPayParams.device);
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDevice() {
        return this.device;
    }

    @NotNull
    public final String getEnvironment() {
        return this.environment;
    }

    public int hashCode() {
        return this.device.hashCode() + n1.c(this.environment, this.country.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.country;
        String str2 = this.environment;
        return d.f(a.c("InitOpenPayParams(country=", str, ", environment=", str2, ", device="), this.device, ")");
    }
}
