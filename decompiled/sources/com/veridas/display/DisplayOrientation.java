package com.veridas.display;

import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DisplayOrientation.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/veridas/display/DisplayOrientation;", "", VDVideoSelfieConfiguration.LANDSCAPE, VDVideoSelfieConfiguration.PORTRAIT, "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class DisplayOrientation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisplayOrientation[] $VALUES;
    public static final DisplayOrientation LANDSCAPE;
    public static final DisplayOrientation PORTRAIT;

    static {
        DisplayOrientation displayOrientation = new DisplayOrientation(VDVideoSelfieConfiguration.LANDSCAPE, 0);
        LANDSCAPE = displayOrientation;
        DisplayOrientation displayOrientation2 = new DisplayOrientation(VDVideoSelfieConfiguration.PORTRAIT, 1);
        PORTRAIT = displayOrientation2;
        DisplayOrientation[] displayOrientationArr = {displayOrientation, displayOrientation2};
        $VALUES = displayOrientationArr;
        $ENTRIES = EnumEntriesKt.enumEntries(displayOrientationArr);
    }

    public DisplayOrientation() {
        throw null;
    }

    @NotNull
    public static EnumEntries<DisplayOrientation> getEntries() {
        return $ENTRIES;
    }

    public static DisplayOrientation valueOf(String str) {
        return (DisplayOrientation) Enum.valueOf(DisplayOrientation.class, str);
    }

    public static DisplayOrientation[] values() {
        return (DisplayOrientation[]) $VALUES.clone();
    }
}
