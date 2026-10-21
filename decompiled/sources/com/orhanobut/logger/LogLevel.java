package com.orhanobut.logger;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class LogLevel {
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel FULL;
    public static final LogLevel NONE;

    static {
        LogLevel logLevel = new LogLevel("FULL", 0);
        FULL = logLevel;
        LogLevel logLevel2 = new LogLevel(ExpectedUserActionOnPoiTypes.NONE, 1);
        NONE = logLevel2;
        $VALUES = new LogLevel[]{logLevel, logLevel2};
    }

    public LogLevel() {
        throw null;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
