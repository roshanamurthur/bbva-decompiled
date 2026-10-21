package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class Log {
    static final String INVALID_FORMAT = "Invalid Format";
    static final String UNEXPECTED_EMPTY_VALUE = "Unexpected Empty Value";
    static final String UNEXPECTED_NULL_VALUE = "Unexpected Null Value";
    private static LoggingMode loggingMode = LoggingMode.ERROR;
    private static LoggingService loggingService;

    private Log() {
    }

    public static void debug(String str, String str2, Object... objArr) {
        if (loggingService == null || loggingMode.id < LoggingMode.DEBUG.id) {
            return;
        }
        try {
            loggingService.debug(str, String.format(str2, objArr));
        } catch (Exception unused) {
            loggingService.debug(str, str2);
        }
    }

    public static void error(String str, String str2, Object... objArr) {
        if (loggingService == null || loggingMode.ordinal() < LoggingMode.ERROR.id) {
            return;
        }
        try {
            loggingService.error(str, String.format(str2, objArr));
        } catch (Exception unused) {
            loggingService.error(str, str2);
        }
    }

    public static LoggingMode getLogLevel() {
        return loggingMode;
    }

    public static void setLogLevel(LoggingMode loggingMode2) {
        loggingMode = loggingMode2;
    }

    public static void setLoggingService(LoggingService loggingService2) {
        loggingService = loggingService2;
    }

    public static void trace(String str, String str2, Object... objArr) {
        if (loggingService == null || loggingMode.id < LoggingMode.VERBOSE.id) {
            return;
        }
        try {
            loggingService.trace(str, String.format(str2, objArr));
        } catch (Exception unused) {
            loggingService.trace(str, str2);
        }
    }

    public static void warning(String str, String str2, Object... objArr) {
        if (loggingService == null || loggingMode.ordinal() < LoggingMode.WARNING.id) {
            return;
        }
        try {
            loggingService.warning(str, String.format(str2, objArr));
        } catch (Exception unused) {
            loggingService.warning(str, str2);
        }
    }
}
