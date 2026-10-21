package com.esotericsoftware.minlog;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class Log {
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_TRACE = 1;
    public static final int LEVEL_WARN = 4;
    public static boolean ERROR = true;
    public static boolean WARN = true;
    public static boolean INFO = true;
    public static boolean DEBUG = false;
    public static boolean TRACE = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f40060a = new Logger();

    public static class Logger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40061a = System.currentTimeMillis();

        public void log(int i10, String str, String str2, Throwable th2) {
            StringBuilder sb2 = new StringBuilder(256);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f40061a;
            long j10 = jCurrentTimeMillis / 60000;
            long j11 = (jCurrentTimeMillis / 1000) % 60;
            if (j10 <= 9) {
                sb2.append('0');
            }
            sb2.append(j10);
            sb2.append(AbstractJsonLexerKt.COLON);
            if (j11 <= 9) {
                sb2.append('0');
            }
            sb2.append(j11);
            if (i10 == 1) {
                sb2.append(" TRACE: ");
            } else if (i10 == 2) {
                sb2.append(" DEBUG: ");
            } else if (i10 == 3) {
                sb2.append("  INFO: ");
            } else if (i10 == 4) {
                sb2.append("  WARN: ");
            } else if (i10 == 5) {
                sb2.append(" ERROR: ");
            }
            if (str != null) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(str);
                sb2.append("] ");
            }
            sb2.append(str2);
            if (th2 != null) {
                StringWriter stringWriter = new StringWriter(256);
                th2.printStackTrace(new PrintWriter(stringWriter));
                sb2.append('\n');
                sb2.append(stringWriter.toString().trim());
            }
            print(sb2.toString());
        }

        public void print(String str) {
            System.out.println(str);
        }
    }

    public static void DEBUG() {
        set(2);
    }

    public static void ERROR() {
        set(5);
    }

    public static void INFO() {
        set(3);
    }

    public static void NONE() {
        set(6);
    }

    public static void TRACE() {
        set(1);
    }

    public static void WARN() {
        set(4);
    }

    public static void debug(String str, Throwable th2) {
        if (DEBUG) {
            f40060a.log(2, null, str, th2);
        }
    }

    public static void error(String str, Throwable th2) {
        if (ERROR) {
            f40060a.log(5, null, str, th2);
        }
    }

    public static void info(String str, Throwable th2) {
        if (INFO) {
            f40060a.log(3, null, str, th2);
        }
    }

    public static void set(int i10) {
        ERROR = i10 <= 5;
        WARN = i10 <= 4;
        INFO = i10 <= 3;
        DEBUG = i10 <= 2;
        TRACE = i10 <= 1;
    }

    public static void setLogger(Logger logger) {
        f40060a = logger;
    }

    public static void trace(String str, Throwable th2) {
        if (TRACE) {
            f40060a.log(1, null, str, th2);
        }
    }

    public static void warn(String str, Throwable th2) {
        if (WARN) {
            f40060a.log(4, null, str, th2);
        }
    }

    public static void debug(String str, String str2, Throwable th2) {
        if (DEBUG) {
            f40060a.log(2, str, str2, th2);
        }
    }

    public static void error(String str, String str2, Throwable th2) {
        if (ERROR) {
            f40060a.log(5, str, str2, th2);
        }
    }

    public static void info(String str, String str2, Throwable th2) {
        if (INFO) {
            f40060a.log(3, str, str2, th2);
        }
    }

    public static void trace(String str, String str2, Throwable th2) {
        if (TRACE) {
            f40060a.log(1, str, str2, th2);
        }
    }

    public static void warn(String str, String str2, Throwable th2) {
        if (WARN) {
            f40060a.log(4, str, str2, th2);
        }
    }

    public static void debug(String str) {
        if (DEBUG) {
            f40060a.log(2, null, str, null);
        }
    }

    public static void error(String str) {
        if (ERROR) {
            f40060a.log(5, null, str, null);
        }
    }

    public static void info(String str) {
        if (INFO) {
            f40060a.log(3, null, str, null);
        }
    }

    public static void trace(String str) {
        if (TRACE) {
            f40060a.log(1, null, str, null);
        }
    }

    public static void warn(String str) {
        if (WARN) {
            f40060a.log(4, null, str, null);
        }
    }

    public static void debug(String str, String str2) {
        if (DEBUG) {
            f40060a.log(2, str, str2, null);
        }
    }

    public static void error(String str, String str2) {
        if (ERROR) {
            f40060a.log(5, str, str2, null);
        }
    }

    public static void info(String str, String str2) {
        if (INFO) {
            f40060a.log(3, str, str2, null);
        }
    }

    public static void trace(String str, String str2) {
        if (TRACE) {
            f40060a.log(1, str, str2, null);
        }
    }

    public static void warn(String str, String str2) {
        if (WARN) {
            f40060a.log(4, str, str2, null);
        }
    }
}
