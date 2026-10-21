package com.budiyev.android.codescanner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class ScanMode {
    private static final /* synthetic */ ScanMode[] $VALUES;
    public static final ScanMode CONTINUOUS;
    public static final ScanMode PREVIEW;
    public static final ScanMode SINGLE;

    static {
        ScanMode scanMode = new ScanMode("SINGLE", 0);
        SINGLE = scanMode;
        ScanMode scanMode2 = new ScanMode("CONTINUOUS", 1);
        CONTINUOUS = scanMode2;
        ScanMode scanMode3 = new ScanMode("PREVIEW", 2);
        PREVIEW = scanMode3;
        $VALUES = new ScanMode[]{scanMode, scanMode2, scanMode3};
    }

    public ScanMode() {
        throw null;
    }

    public static ScanMode valueOf(String str) {
        return (ScanMode) Enum.valueOf(ScanMode.class, str);
    }

    public static ScanMode[] values() {
        return (ScanMode[]) $VALUES.clone();
    }
}
