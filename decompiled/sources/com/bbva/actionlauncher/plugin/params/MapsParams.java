package com.bbva.actionlauncher.plugin.params;

import ad.d;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JF\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/bbva/actionlauncher/plugin/params/MapsParams;", "", "uriString", "", "latitude", "", "longitude", "zoom", "", "name", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getName", "()Ljava/lang/String;", "getUriString", "getZoom", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;)Lcom/bbva/actionlauncher/plugin/params/MapsParams;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MapsParams {

    @Nullable
    private final Double latitude;

    @Nullable
    private final Double longitude;

    @Nullable
    private final String name;

    @NotNull
    private final String uriString;
    private final int zoom;

    public MapsParams(@NotNull String uriString, @Nullable Double d2, @Nullable Double d3, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        this.uriString = uriString;
        this.latitude = d2;
        this.longitude = d3;
        this.zoom = i10;
        this.name = str;
    }

    public static /* synthetic */ MapsParams copy$default(MapsParams mapsParams, String str, Double d2, Double d3, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mapsParams.uriString;
        }
        if ((i11 & 2) != 0) {
            d2 = mapsParams.latitude;
        }
        Double d7 = d2;
        if ((i11 & 4) != 0) {
            d3 = mapsParams.longitude;
        }
        Double d10 = d3;
        if ((i11 & 8) != 0) {
            i10 = mapsParams.zoom;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str2 = mapsParams.name;
        }
        return mapsParams.copy(str, d7, d10, i12, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUriString() {
        return this.uriString;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getZoom() {
        return this.zoom;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final MapsParams copy(@NotNull String uriString, @Nullable Double latitude, @Nullable Double longitude, int zoom, @Nullable String name) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        return new MapsParams(uriString, latitude, longitude, zoom, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapsParams)) {
            return false;
        }
        MapsParams mapsParams = (MapsParams) other;
        return Intrinsics.areEqual(this.uriString, mapsParams.uriString) && Intrinsics.areEqual((Object) this.latitude, (Object) mapsParams.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) mapsParams.longitude) && this.zoom == mapsParams.zoom && Intrinsics.areEqual(this.name, mapsParams.name);
    }

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getUriString() {
        return this.uriString;
    }

    public final int getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        int iHashCode = this.uriString.hashCode() * 31;
        Double d2 = this.latitude;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.longitude;
        int iHashCode3 = (((iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31) + this.zoom) * 31;
        String str = this.name;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uriString;
        Double d2 = this.latitude;
        Double d3 = this.longitude;
        int i10 = this.zoom;
        String str2 = this.name;
        StringBuilder sb2 = new StringBuilder("MapsParams(uriString=");
        sb2.append(str);
        sb2.append(", latitude=");
        sb2.append(d2);
        sb2.append(", longitude=");
        sb2.append(d3);
        sb2.append(", zoom=");
        sb2.append(i10);
        sb2.append(", name=");
        return d.f(sb2, str2, ")");
    }

    public /* synthetic */ MapsParams(String str, Double d2, Double d3, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d2, d3, (i11 & 8) != 0 ? 100 : i10, str2);
    }
}
