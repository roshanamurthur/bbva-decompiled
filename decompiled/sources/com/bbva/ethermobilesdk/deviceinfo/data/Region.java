package com.bbva.ethermobilesdk.deviceinfo.data;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.appsflyer.AppsFlyerProperties;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/Region;", "", ContextualDataConstants.CD_COUNTRY_CODE, "", "dateFormat", AppsFlyerProperties.CURRENCY_CODE, "countryName", "currencySymbol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getCountryName", "getCurrencyCode", "getCurrencySymbol", "getDateFormat", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Region {

    @NotNull
    private final String countryCode;

    @NotNull
    private final String countryName;

    @NotNull
    private final String currencyCode;

    @NotNull
    private final String currencySymbol;

    @NotNull
    private final String dateFormat;

    public Region(@NotNull String countryCode, @NotNull String dateFormat, @NotNull String currencyCode, @NotNull String countryName, @NotNull String currencySymbol) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        this.countryCode = countryCode;
        this.dateFormat = dateFormat;
        this.currencyCode = currencyCode;
        this.countryName = countryName;
        this.currencySymbol = currencySymbol;
    }

    public static /* synthetic */ Region copy$default(Region region, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = region.countryCode;
        }
        if ((i10 & 2) != 0) {
            str2 = region.dateFormat;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = region.currencyCode;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = region.countryName;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = region.currencySymbol;
        }
        return region.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateFormat() {
        return this.dateFormat;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    @NotNull
    public final Region copy(@NotNull String countryCode, @NotNull String dateFormat, @NotNull String currencyCode, @NotNull String countryName, @NotNull String currencySymbol) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        return new Region(countryCode, dateFormat, currencyCode, countryName, currencySymbol);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Region)) {
            return false;
        }
        Region region = (Region) other;
        return Intrinsics.areEqual(this.countryCode, region.countryCode) && Intrinsics.areEqual(this.dateFormat, region.dateFormat) && Intrinsics.areEqual(this.currencyCode, region.currencyCode) && Intrinsics.areEqual(this.countryName, region.countryName) && Intrinsics.areEqual(this.currencySymbol, region.currencySymbol);
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    @NotNull
    public final String getDateFormat() {
        return this.dateFormat;
    }

    public int hashCode() {
        return this.currencySymbol.hashCode() + n1.c(this.countryName, n1.c(this.currencyCode, n1.c(this.dateFormat, this.countryCode.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.countryCode;
        String str2 = this.dateFormat;
        String str3 = this.currencyCode;
        String str4 = this.countryName;
        String str5 = this.currencySymbol;
        StringBuilder sbC = a.c("Region(countryCode=", str, ", dateFormat=", str2, ", currencyCode=");
        k.e(sbC, str3, ", countryName=", str4, ", currencySymbol=");
        return d.f(sbC, str5, ")");
    }
}
