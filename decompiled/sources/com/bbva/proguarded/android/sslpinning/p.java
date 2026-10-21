package com.bbva.proguarded.android.sslpinning;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends Handler {
    public static void a(Handler handler, String str, Level level) {
        Logger logger = LogManager.getLogManager().getLogger("");
        for (Handler handler2 : logger.getHandlers()) {
            if (handler2.getClass().getCanonicalName().equals("com.android.internal.logging.AndroidHandler")) {
                logger.removeHandler(handler2);
                logger.addHandler(handler);
                logger.setLevel(Level.ALL);
                Logger.getLogger(str).setLevel(level);
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i10;
        if (isLoggable(logRecord)) {
            String loggerName = logRecord.getLoggerName();
            if (loggerName.length() > 30) {
                loggerName = loggerName.substring(loggerName.length() - 30);
            }
            try {
                int iIntValue = logRecord.getLevel().intValue();
                if (iIntValue >= 1000) {
                    i10 = 6;
                } else if (iIntValue >= 900) {
                    i10 = 5;
                } else {
                    i10 = iIntValue >= 800 ? 4 : 3;
                }
                Log.println(i10, loggerName, logRecord.getMessage());
                if (logRecord.getThrown() != null) {
                    Log.println(i10, loggerName, Log.getStackTraceString(logRecord.getThrown()));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
