package com.sun.mail.util.logging;

import androidx.work.PeriodicWorkRequest;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ti.b;

/* JADX INFO: loaded from: classes9.dex */
public class DurationFilter implements Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f65629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f65630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f65631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f65632e;

    public DurationFilter() {
        long jA = a(".records");
        this.f65628a = jA <= 0 ? 1000L : jA;
        long jA2 = a(".duration");
        this.f65629b = jA2 <= 0 ? PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS : jA2;
    }

    public static String[] c(String str) {
        int iIndexOf = str.indexOf(42);
        if (iIndexOf > -1) {
            String[] strArrSplit = str.split("\\s*\\*\\s*");
            if (strArrSplit.length != 0) {
                if (iIndexOf == 0 || str.charAt(str.length() - 1) == '*') {
                    throw new NumberFormatException(str);
                }
                if (strArrSplit.length != 1) {
                    return strArrSplit;
                }
                throw new NumberFormatException(strArrSplit[0]);
            }
        }
        return new String[]{str};
    }

    public final long a(String str) {
        long jH;
        String strB = b.b(getClass().getName().concat(str));
        if (strB == null || strB.length() == 0) {
            return Long.MIN_VALUE;
        }
        String strTrim = strB.trim();
        if ((strTrim.charAt(0) == 'P' || strTrim.charAt(0) == 'p') && str.equals(".duration")) {
            try {
                jH = b.h(strTrim);
            } catch (RuntimeException | Exception | LinkageError unused) {
                jH = 0;
            }
        } else {
            jH = 0;
        }
        if (jH == 0) {
            try {
                String[] strArrC = c(strTrim);
                int length = strArrC.length;
                jH = 1;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        String strSubstring = strArrC[i10];
                        if (strSubstring.endsWith("L") || strSubstring.endsWith("l")) {
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                        }
                        long j10 = Long.parseLong(strSubstring);
                        long j11 = jH * j10;
                        if (((Math.abs(jH) | Math.abs(j10)) >>> 31) != 0 && ((j10 != 0 && j11 / j10 != jH) || (jH == Long.MIN_VALUE && j10 == -1))) {
                            break;
                        }
                        i10++;
                        jH = j11;
                    }
                }
                throw new ArithmeticException();
            } catch (RuntimeException unused2) {
                return Long.MIN_VALUE;
            }
        }
        return jH;
    }

    public final boolean b(long j10, long j11) {
        long j12;
        long j13;
        synchronized (this) {
            j12 = this.f65630c;
            j13 = this.f65632e;
        }
        if (j12 > 0) {
            return j11 - j13 >= this.f65629b || j12 < j10;
        }
        return j11 - j13 >= 0 || j12 == 0;
    }

    public boolean equals(Object obj) {
        long j10;
        long j11;
        long j12;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DurationFilter durationFilter = (DurationFilter) obj;
        if (this.f65628a != durationFilter.f65628a || this.f65629b != durationFilter.f65629b) {
            return false;
        }
        synchronized (this) {
            j10 = this.f65630c;
            j11 = this.f65631d;
            j12 = this.f65632e;
        }
        synchronized (durationFilter) {
            try {
                if (j10 == durationFilter.f65630c && j11 == durationFilter.f65631d && j12 == durationFilter.f65632e) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int hashCode() {
        long j10 = this.f65628a;
        int i10 = (267 + ((int) (j10 ^ (j10 >>> 32)))) * 89;
        long j11 = this.f65629b;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public boolean isIdle() {
        return b(0L, System.currentTimeMillis());
    }

    @Override // java.util.logging.Filter
    public boolean isLoggable(LogRecord logRecord) {
        boolean z10;
        long millis = logRecord.getMillis();
        synchronized (this) {
            try {
                long j10 = this.f65630c;
                z10 = false;
                if (j10 > 0) {
                    if (millis - this.f65631d > 0) {
                        this.f65631d = millis;
                    }
                    if (j10 != this.f65628a) {
                        this.f65630c = j10 + 1;
                    } else {
                        long j11 = this.f65631d;
                        long j12 = j11 - this.f65632e;
                        long j13 = this.f65629b;
                        if (j12 >= j13) {
                            this.f65630c = 1L;
                            this.f65632e = j11;
                        } else {
                            this.f65630c = -1L;
                            this.f65632e = j11 + j13;
                        }
                    }
                    z10 = true;
                } else if (millis - this.f65632e >= 0 || j10 == 0) {
                    this.f65630c = 1L;
                    this.f65632e = millis;
                    this.f65631d = millis;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public String toString() {
        boolean zB;
        boolean zB2;
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zB = b(0L, jCurrentTimeMillis);
            zB2 = b(this.f65628a, jCurrentTimeMillis);
        }
        return getClass().getName() + "{records=" + this.f65628a + ", duration=" + this.f65629b + ", idle=" + zB + ", loggable=" + zB2 + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DurationFilter m5512clone() throws CloneNotSupportedException {
        DurationFilter durationFilter = (DurationFilter) super.clone();
        durationFilter.f65630c = 0L;
        durationFilter.f65631d = 0L;
        durationFilter.f65632e = 0L;
        return durationFilter;
    }

    public DurationFilter(long j10, long j11) {
        this.f65628a = j10 <= 0 ? 1000L : j10;
        this.f65629b = j11 <= 0 ? PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS : j11;
    }

    public boolean isLoggable() {
        return b(this.f65628a, System.currentTimeMillis());
    }
}
