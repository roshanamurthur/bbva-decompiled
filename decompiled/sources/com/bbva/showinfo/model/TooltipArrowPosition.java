package com.bbva.showinfo.model;

import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/showinfo/model/TooltipArrowPosition;", "", "TOP", "BOTTOM", "LEFT", "RIGHT", LoginHelperConstants.CLIENT_STATUS_NEW_CLIENT, "NI", "IZ", "IZA", ExpectedUserActionOnPoiTypes.NONE, "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class TooltipArrowPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TooltipArrowPosition[] $VALUES;
    public static final TooltipArrowPosition BOTTOM;
    public static final TooltipArrowPosition IZ;
    public static final TooltipArrowPosition IZA;
    public static final TooltipArrowPosition LEFT;
    public static final TooltipArrowPosition NE;
    public static final TooltipArrowPosition NI;
    public static final TooltipArrowPosition NONE;
    public static final TooltipArrowPosition RIGHT;
    public static final TooltipArrowPosition TOP;

    static {
        TooltipArrowPosition tooltipArrowPosition = new TooltipArrowPosition("TOP", 0);
        TOP = tooltipArrowPosition;
        TooltipArrowPosition tooltipArrowPosition2 = new TooltipArrowPosition("BOTTOM", 1);
        BOTTOM = tooltipArrowPosition2;
        TooltipArrowPosition tooltipArrowPosition3 = new TooltipArrowPosition("LEFT", 2);
        LEFT = tooltipArrowPosition3;
        TooltipArrowPosition tooltipArrowPosition4 = new TooltipArrowPosition("RIGHT", 3);
        RIGHT = tooltipArrowPosition4;
        TooltipArrowPosition tooltipArrowPosition5 = new TooltipArrowPosition(LoginHelperConstants.CLIENT_STATUS_NEW_CLIENT, 4);
        NE = tooltipArrowPosition5;
        TooltipArrowPosition tooltipArrowPosition6 = new TooltipArrowPosition("NI", 5);
        NI = tooltipArrowPosition6;
        TooltipArrowPosition tooltipArrowPosition7 = new TooltipArrowPosition("IZ", 6);
        IZ = tooltipArrowPosition7;
        TooltipArrowPosition tooltipArrowPosition8 = new TooltipArrowPosition("IZA", 7);
        IZA = tooltipArrowPosition8;
        TooltipArrowPosition tooltipArrowPosition9 = new TooltipArrowPosition(ExpectedUserActionOnPoiTypes.NONE, 8);
        NONE = tooltipArrowPosition9;
        TooltipArrowPosition[] tooltipArrowPositionArr = {tooltipArrowPosition, tooltipArrowPosition2, tooltipArrowPosition3, tooltipArrowPosition4, tooltipArrowPosition5, tooltipArrowPosition6, tooltipArrowPosition7, tooltipArrowPosition8, tooltipArrowPosition9};
        $VALUES = tooltipArrowPositionArr;
        $ENTRIES = EnumEntriesKt.enumEntries(tooltipArrowPositionArr);
    }

    public TooltipArrowPosition() {
        throw null;
    }

    @NotNull
    public static EnumEntries<TooltipArrowPosition> getEntries() {
        return $ENTRIES;
    }

    public static TooltipArrowPosition valueOf(String str) {
        return (TooltipArrowPosition) Enum.valueOf(TooltipArrowPosition.class, str);
    }

    public static TooltipArrowPosition[] values() {
        return (TooltipArrowPosition[]) $VALUES.clone();
    }
}
