package org.koin.core.logger;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/koin/core/logger/Level;", "", "DEBUG", "INFO", "WARNING", "ERROR", ExpectedUserActionOnPoiTypes.NONE, "koin-core"}, k = 1, mv = {1, 8, 0})
public final class Level {
    private static final /* synthetic */ Level[] $VALUES;
    public static final Level DEBUG;
    public static final Level ERROR;
    public static final Level INFO;
    public static final Level NONE;
    public static final Level WARNING;

    static {
        Level level = new Level("DEBUG", 0);
        DEBUG = level;
        Level level2 = new Level("INFO", 1);
        INFO = level2;
        Level level3 = new Level("WARNING", 2);
        WARNING = level3;
        Level level4 = new Level("ERROR", 3);
        ERROR = level4;
        Level level5 = new Level(ExpectedUserActionOnPoiTypes.NONE, 4);
        NONE = level5;
        $VALUES = new Level[]{level, level2, level3, level4, level5};
    }

    public Level() {
        throw null;
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) $VALUES.clone();
    }
}
