package com.bbva.ethermobile.elogger;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobile/elogger/LoggerLevel;", "", "Companion", "VERBOSE", "DEBUG", "INFO", "WARNING", "WTF", "ERROR", "elogger_release"}, k = 1, mv = {1, 8, 0})
public final class LoggerLevel {
    private static final /* synthetic */ LoggerLevel[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final LoggerLevel DEBUG;
    public static final LoggerLevel ERROR;
    public static final LoggerLevel INFO;
    public static final LoggerLevel VERBOSE;
    public static final LoggerLevel WARNING;
    public static final LoggerLevel WTF;

    /* JADX INFO: compiled from: Model.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobile/elogger/LoggerLevel$Companion;", "", "()V", "from", "Lcom/bbva/ethermobile/elogger/LoggerLevel;", FirebaseAnalytics.Param.INDEX, "", "elogger_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoggerLevel from(int index) {
            return LoggerLevel.values()[index];
        }
    }

    static {
        LoggerLevel loggerLevel = new LoggerLevel("VERBOSE", 0);
        VERBOSE = loggerLevel;
        LoggerLevel loggerLevel2 = new LoggerLevel("DEBUG", 1);
        DEBUG = loggerLevel2;
        LoggerLevel loggerLevel3 = new LoggerLevel("INFO", 2);
        INFO = loggerLevel3;
        LoggerLevel loggerLevel4 = new LoggerLevel("WARNING", 3);
        WARNING = loggerLevel4;
        LoggerLevel loggerLevel5 = new LoggerLevel("WTF", 4);
        WTF = loggerLevel5;
        LoggerLevel loggerLevel6 = new LoggerLevel("ERROR", 5);
        ERROR = loggerLevel6;
        $VALUES = new LoggerLevel[]{loggerLevel, loggerLevel2, loggerLevel3, loggerLevel4, loggerLevel5, loggerLevel6};
        INSTANCE = new Companion(null);
    }

    public LoggerLevel() {
        throw null;
    }

    public static LoggerLevel valueOf(String str) {
        return (LoggerLevel) Enum.valueOf(LoggerLevel.class, str);
    }

    public static LoggerLevel[] values() {
        return (LoggerLevel[]) $VALUES.clone();
    }
}
