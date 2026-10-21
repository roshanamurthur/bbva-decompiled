package com.budiyev.android.codescanner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class ButtonPosition {
    private static final /* synthetic */ ButtonPosition[] $VALUES;
    public static final ButtonPosition BOTTOM_END;
    public static final ButtonPosition BOTTOM_START;
    public static final ButtonPosition TOP_END;
    public static final ButtonPosition TOP_START;

    static {
        ButtonPosition buttonPosition = new ButtonPosition("TOP_START", 0);
        TOP_START = buttonPosition;
        ButtonPosition buttonPosition2 = new ButtonPosition("TOP_END", 1);
        TOP_END = buttonPosition2;
        ButtonPosition buttonPosition3 = new ButtonPosition("BOTTOM_START", 2);
        BOTTOM_START = buttonPosition3;
        ButtonPosition buttonPosition4 = new ButtonPosition("BOTTOM_END", 3);
        BOTTOM_END = buttonPosition4;
        $VALUES = new ButtonPosition[]{buttonPosition, buttonPosition2, buttonPosition3, buttonPosition4};
    }

    public ButtonPosition() {
        throw null;
    }

    public static ButtonPosition valueOf(String str) {
        return (ButtonPosition) Enum.valueOf(ButtonPosition.class, str);
    }

    public static ButtonPosition[] values() {
        return (ButtonPosition[]) $VALUES.clone();
    }
}
