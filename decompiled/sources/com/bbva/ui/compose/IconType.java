package com.bbva.ui.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/ui/compose/IconType;", "", "ACTIONABLE_ALWAYS_VISIBLE", "DECORATIVE", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class IconType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IconType[] $VALUES;
    public static final IconType ACTIONABLE_ALWAYS_VISIBLE;
    public static final IconType DECORATIVE;

    static {
        IconType iconType = new IconType("ACTIONABLE_ALWAYS_VISIBLE", 0);
        ACTIONABLE_ALWAYS_VISIBLE = iconType;
        IconType iconType2 = new IconType("DECORATIVE", 1);
        DECORATIVE = iconType2;
        IconType[] iconTypeArr = {iconType, iconType2};
        $VALUES = iconTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(iconTypeArr);
    }

    public IconType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<IconType> getEntries() {
        return $ENTRIES;
    }

    public static IconType valueOf(String str) {
        return (IconType) Enum.valueOf(IconType.class, str);
    }

    public static IconType[] values() {
        return (IconType[]) $VALUES.clone();
    }
}
