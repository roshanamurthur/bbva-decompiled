package com.bbva.ethermobilesdk.geolocation.geocoding.model;

import android.location.Address;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationAddress.kt */
/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geocoding/model/LocationAddress;", "Landroid/os/Parcelable;", "", "getFormattedAddress", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "describeContents", "Landroid/location/Address;", "component1", "Landroid/location/Location;", "component2", "address", "location", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Landroid/location/Address;", "getAddress", "()Landroid/location/Address;", "q0", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "<init>", "(Landroid/location/Address;Landroid/location/Location;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final /* data */ class LocationAddress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocationAddress> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Address address;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Location location;

    /* JADX INFO: compiled from: LocationAddress.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocationAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationAddress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocationAddress((Address) parcel.readParcelable(LocationAddress.class.getClassLoader()), (Location) parcel.readParcelable(LocationAddress.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationAddress[] newArray(int i10) {
            return new LocationAddress[i10];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LocationAddress(@NotNull Address address) {
        this(address, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(address, "address");
    }

    public static /* synthetic */ LocationAddress copy$default(LocationAddress locationAddress, Address address, Location location, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            address = locationAddress.address;
        }
        if ((i10 & 2) != 0) {
            location = locationAddress.location;
        }
        return locationAddress.copy(address, location);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    @NotNull
    public final LocationAddress copy(@NotNull Address address, @NotNull Location location) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        return new LocationAddress(address, location);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationAddress)) {
            return false;
        }
        LocationAddress locationAddress = (LocationAddress) other;
        return Intrinsics.areEqual(this.address, locationAddress.address) && Intrinsics.areEqual(this.location, locationAddress.location);
    }

    @NotNull
    public final Address getAddress() {
        return this.address;
    }

    @NotNull
    public final String getFormattedAddress() {
        StringBuilder sb2 = new StringBuilder();
        Address address = this.address;
        int maxAddressLineIndex = address.getMaxAddressLineIndex();
        if (maxAddressLineIndex >= 0) {
            int i10 = 0;
            while (true) {
                sb2.append(address.getAddressLine(i10));
                if (i10 == maxAddressLineIndex) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final Location getLocation() {
        return this.location;
    }

    public int hashCode() {
        return this.location.hashCode() + (this.address.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LocationAddress(address=" + this.address + ", location=" + this.location + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.address, flags);
        dest.writeParcelable(this.location, flags);
    }

    @JvmOverloads
    public LocationAddress(@NotNull Address address, @NotNull Location location) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        this.address = address;
        this.location = location;
        location.setLatitude(address.getLatitude());
        location.setLongitude(address.getLongitude());
    }

    public /* synthetic */ LocationAddress(Address address, Location location, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(address, (i10 & 2) != 0 ? new Location(LocationAddress.class.getCanonicalName()) : location);
    }
}
