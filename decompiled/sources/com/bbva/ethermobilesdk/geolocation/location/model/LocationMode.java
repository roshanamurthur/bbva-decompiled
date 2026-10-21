package com.bbva.ethermobilesdk.geolocation.location.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LocationMode.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationMode;", "", "OneFix", "Continuous", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class LocationMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocationMode[] $VALUES;
    public static final LocationMode Continuous;
    public static final LocationMode OneFix;

    static {
        LocationMode locationMode = new LocationMode("OneFix", 0);
        OneFix = locationMode;
        LocationMode locationMode2 = new LocationMode("Continuous", 1);
        Continuous = locationMode2;
        LocationMode[] locationModeArr = {locationMode, locationMode2};
        $VALUES = locationModeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(locationModeArr);
    }

    public LocationMode() {
        throw null;
    }

    @NotNull
    public static EnumEntries<LocationMode> getEntries() {
        return $ENTRIES;
    }

    public static LocationMode valueOf(String str) {
        return (LocationMode) Enum.valueOf(LocationMode.class, str);
    }

    public static LocationMode[] values() {
        return (LocationMode[]) $VALUES.clone();
    }
}
