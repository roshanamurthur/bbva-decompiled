package com.sun.mail.util.logging;

import java.lang.reflect.UndeclaredThrowableException;
import java.text.MessageFormat;
import java.util.Comparator;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ti.b;

/* JADX INFO: loaded from: classes9.dex */
public class CollectorFormatter extends Formatter {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f65614j = System.currentTimeMillis();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Formatter f65616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparator<? super LogRecord> f65617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LogRecord f65618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f65619e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f65621g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f65620f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f65622h = f65614j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f65623i = Long.MIN_VALUE;

    public CollectorFormatter() {
        String name = getClass().getName();
        this.f65615a = e(name);
        this.f65616b = f(name);
        this.f65617c = d(name);
    }

    public static Comparator d(String str) {
        String strB = b.b(str.concat(".comparator"));
        String strB2 = b.b(str.concat(".comparator.reverse"));
        if (strB != null) {
            try {
                if (strB.length() != 0) {
                    if (!AbstractJsonLexerKt.NULL.equalsIgnoreCase(strB)) {
                        Comparator comparator = (Comparator) b.f(Comparator.class, strB);
                        return Boolean.parseBoolean(strB2) ? b.j(comparator) : comparator;
                    }
                    if (strB2 == null) {
                        return null;
                    }
                    throw new IllegalArgumentException("No comparator to reverse.");
                }
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception e7) {
                throw new UndeclaredThrowableException(e7);
            }
        }
        if (strB2 == null) {
            return (Comparator) Comparator.class.cast(SeverityComparator.f65661p0);
        }
        throw new IllegalArgumentException("No comparator to reverse.");
    }

    public static String e(String str) {
        String strB = b.b(str.concat(".format"));
        return (strB == null || strB.length() == 0) ? "{0}{1}{2}{4,choice,-1#|0#|0<... {4,number,integer} more}\n" : strB;
    }

    public static Formatter f(String str) {
        String strB = b.b(str.concat(".formatter"));
        if (strB == null || strB.length() == 0) {
            return (Formatter) Formatter.class.cast(new CompactFormatter());
        }
        if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(strB)) {
            return null;
        }
        try {
            return (Formatter) b.f(Formatter.class, strB);
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new UndeclaredThrowableException(e7);
        }
    }

    public final synchronized boolean a(LogRecord logRecord, LogRecord logRecord2) {
        try {
            long millis = logRecord2.getMillis();
            Throwable thrown = logRecord2.getThrown();
            if (this.f65618d != logRecord) {
                return false;
            }
            long j10 = this.f65619e + 1;
            this.f65619e = j10;
            if (j10 != 1) {
                this.f65622h = Math.min(this.f65622h, millis);
            } else {
                this.f65622h = millis;
            }
            this.f65623i = Math.max(this.f65623i, millis);
            if (thrown != null) {
                this.f65621g++;
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public LogRecord apply(LogRecord logRecord, LogRecord logRecord2) {
        if (logRecord == null || logRecord2 == null) {
            throw null;
        }
        Comparator<? super LogRecord> comparator = this.f65617c;
        if (comparator != null) {
            return comparator.compare(logRecord, logRecord2) >= 0 ? logRecord : logRecord2;
        }
        return logRecord2;
    }

    public final synchronized boolean b(LogRecord logRecord, LogRecord logRecord2) {
        if (!a(logRecord, logRecord2)) {
            return false;
        }
        this.f65618d = logRecord2;
        return true;
    }

    public final String c(Handler handler, boolean z10) {
        LogRecord logRecord;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis;
        String head;
        String message;
        String tail;
        ResourceBundle resourceBundle;
        synchronized (this) {
            try {
                logRecord = this.f65618d;
                j10 = this.f65619e;
                j11 = this.f65620f;
                j12 = this.f65621g;
                j13 = this.f65622h;
                j14 = this.f65623i;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (j10 == 0) {
                    j14 = jCurrentTimeMillis;
                }
                if (z10) {
                    g(j14);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Formatter formatter = this.f65616b;
        if (formatter != null) {
            synchronized (formatter) {
                try {
                    head = formatter.getHead(handler);
                    message = logRecord != null ? formatter.format(logRecord) : "";
                    tail = formatter.getTail(handler);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            head = "";
            message = logRecord != null ? formatMessage(logRecord) : "";
            tail = "";
        }
        String str = head;
        String str2 = message;
        Locale locale = null;
        if (logRecord != null && (resourceBundle = logRecord.getResourceBundle()) != null) {
            locale = resourceBundle.getLocale();
        }
        MessageFormat messageFormat = locale == null ? new MessageFormat(this.f65615a) : new MessageFormat(this.f65615a, locale);
        long j15 = f65614j;
        return messageFormat.format(new Object[]{finish(str), finish(str2), finish(tail), Long.valueOf(j10), Long.valueOf(j10 - 1), Long.valueOf(j12), Long.valueOf(j10 - j12), Long.valueOf(j13), Long.valueOf(j14), Long.valueOf(j14 - j13), Long.valueOf(j15), Long.valueOf(jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis - j15), Long.valueOf(j11)});
    }

    public String finish(String str) {
        return str.trim();
    }

    @Override // java.util.logging.Formatter
    public String format(LogRecord logRecord) {
        LogRecord logRecord2;
        boolean zA;
        logRecord.getClass();
        do {
            synchronized (this) {
                logRecord2 = this.f65618d;
            }
            LogRecord logRecordApply = apply(logRecord2 != null ? logRecord2 : logRecord, logRecord);
            if (logRecord2 != logRecordApply) {
                logRecordApply.getSourceMethodName();
                zA = b(logRecord2, logRecordApply);
            } else {
                zA = a(logRecord2, logRecord);
            }
        } while (!zA);
        return "";
    }

    public final synchronized void g(long j10) {
        try {
            if (this.f65618d != null) {
                this.f65618d = null;
                this.f65620f++;
            }
            this.f65619e = 0L;
            this.f65621g = 0L;
            this.f65622h = j10;
            this.f65623i = Long.MIN_VALUE;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.logging.Formatter
    public String getTail(Handler handler) {
        super.getTail(handler);
        return c(handler, true);
    }

    public String toString() {
        try {
            return c(null, false);
        } catch (RuntimeException unused) {
            return super.toString();
        }
    }

    public CollectorFormatter(String str) {
        String name = getClass().getName();
        this.f65615a = str == null ? e(name) : str;
        this.f65616b = f(name);
        this.f65617c = d(name);
    }

    public CollectorFormatter(String str, Formatter formatter, Comparator<? super LogRecord> comparator) {
        this.f65615a = str == null ? e(getClass().getName()) : str;
        this.f65616b = formatter;
        this.f65617c = comparator;
    }
}
