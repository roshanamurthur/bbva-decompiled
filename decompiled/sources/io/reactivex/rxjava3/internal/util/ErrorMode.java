package io.reactivex.rxjava3.internal.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ErrorMode {
    private static final /* synthetic */ ErrorMode[] $VALUES;
    public static final ErrorMode BOUNDARY;
    public static final ErrorMode END;
    public static final ErrorMode IMMEDIATE;

    static {
        ErrorMode errorMode = new ErrorMode("IMMEDIATE", 0);
        IMMEDIATE = errorMode;
        ErrorMode errorMode2 = new ErrorMode("BOUNDARY", 1);
        BOUNDARY = errorMode2;
        ErrorMode errorMode3 = new ErrorMode("END", 2);
        END = errorMode3;
        $VALUES = new ErrorMode[]{errorMode, errorMode2, errorMode3};
    }

    public ErrorMode() {
        throw null;
    }

    public static ErrorMode valueOf(String str) {
        return (ErrorMode) Enum.valueOf(ErrorMode.class, str);
    }

    public static ErrorMode[] values() {
        return (ErrorMode[]) $VALUES.clone();
    }
}
