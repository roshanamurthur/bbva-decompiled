package com.budiyev.android.codescanner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class AutoFocusMode {
    private static final /* synthetic */ AutoFocusMode[] $VALUES;
    public static final AutoFocusMode CONTINUOUS;
    public static final AutoFocusMode SAFE;

    static {
        AutoFocusMode autoFocusMode = new AutoFocusMode("SAFE", 0);
        SAFE = autoFocusMode;
        AutoFocusMode autoFocusMode2 = new AutoFocusMode("CONTINUOUS", 1);
        CONTINUOUS = autoFocusMode2;
        $VALUES = new AutoFocusMode[]{autoFocusMode, autoFocusMode2};
    }

    public AutoFocusMode() {
        throw null;
    }

    public static AutoFocusMode valueOf(String str) {
        return (AutoFocusMode) Enum.valueOf(AutoFocusMode.class, str);
    }

    public static AutoFocusMode[] values() {
        return (AutoFocusMode[]) $VALUES.clone();
    }
}
