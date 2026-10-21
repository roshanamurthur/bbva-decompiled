package com.bbva.ethermobilesdk.geolocation.location.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LocationAccuracy.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationAccuracy;", "", "LOWEST", "LOW", "MEDIUM", "HIGH", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class LocationAccuracy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocationAccuracy[] $VALUES;
    public static final LocationAccuracy HIGH;
    public static final LocationAccuracy LOW;
    public static final LocationAccuracy LOWEST;
    public static final LocationAccuracy MEDIUM;

    static {
        LocationAccuracy locationAccuracy = new LocationAccuracy("LOWEST", 0);
        LOWEST = locationAccuracy;
        LocationAccuracy locationAccuracy2 = new LocationAccuracy("LOW", 1);
        LOW = locationAccuracy2;
        LocationAccuracy locationAccuracy3 = new LocationAccuracy("MEDIUM", 2);
        MEDIUM = locationAccuracy3;
        LocationAccuracy locationAccuracy4 = new LocationAccuracy("HIGH", 3);
        HIGH = locationAccuracy4;
        LocationAccuracy[] locationAccuracyArr = {locationAccuracy, locationAccuracy2, locationAccuracy3, locationAccuracy4};
        $VALUES = locationAccuracyArr;
        $ENTRIES = EnumEntriesKt.enumEntries(locationAccuracyArr);
    }

    public LocationAccuracy() {
        throw null;
    }

    @NotNull
    public static EnumEntries<LocationAccuracy> getEntries() {
        return $ENTRIES;
    }

    public static LocationAccuracy valueOf(String str) {
        return (LocationAccuracy) Enum.valueOf(LocationAccuracy.class, str);
    }

    public static LocationAccuracy[] values() {
        return (LocationAccuracy[]) $VALUES.clone();
    }
}
