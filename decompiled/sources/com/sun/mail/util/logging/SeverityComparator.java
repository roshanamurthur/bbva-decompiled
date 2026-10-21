package com.sun.mail.util.logging;

import java.io.Serializable;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes9.dex */
public class SeverityComparator implements Comparator<LogRecord>, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final SeverityComparator f65661p0 = new SeverityComparator();

    public Throwable apply(Throwable th2) {
        Throwable th3 = null;
        Throwable th4 = null;
        int i10 = 0;
        Throwable th5 = th2;
        while (true) {
            if (th2 == null) {
                th2 = th5;
                break;
            }
            if (isNormal(th2)) {
                th3 = th2;
            }
            if (th3 == null && (th2 instanceof Error)) {
                th4 = th2;
            }
            i10++;
            if (i10 == 65536) {
                break;
            }
            th5 = th2;
            th2 = th2.getCause();
        }
        if (th4 != null) {
            return th4;
        }
        return th3 != null ? th3 : th2;
    }

    public final int applyThenCompare(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return 0;
        }
        return compareThrowable(apply(th2), apply(th3));
    }

    public int compareThrowable(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return 0;
        }
        if (th2 == null) {
            return isNormal(th3) ? 1 : -1;
        }
        if (th3 == null) {
            return isNormal(th2) ? -1 : 1;
        }
        if (th2.getClass() == th3.getClass()) {
            return 0;
        }
        if (isNormal(th2)) {
            return isNormal(th3) ? 0 : -1;
        }
        if (isNormal(th3)) {
            return 1;
        }
        if (th2 instanceof Error) {
            return !(th3 instanceof Error) ? 1 : 0;
        }
        if (!(th2 instanceof RuntimeException)) {
            return ((th3 instanceof Error) || (th3 instanceof RuntimeException)) ? -1 : 0;
        }
        if (th3 instanceof Error) {
            return -1;
        }
        return th3 instanceof RuntimeException ? 0 : 1;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass();
    }

    public int hashCode() {
        return getClass().hashCode() * 31;
    }

    public boolean isNormal(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        for (Class<?> superclass = th2.getClass(); superclass != Throwable.class; superclass = superclass.getSuperclass()) {
            if (Error.class.isAssignableFrom(superclass)) {
                if (superclass.getName().equals("java.lang.ThreadDeath")) {
                    return true;
                }
            } else if (superclass.getName().contains("Interrupt")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // java.util.Comparator
    public int compare(LogRecord logRecord, LogRecord logRecord2) {
        int i10;
        int i11;
        if (logRecord == null || logRecord2 == null) {
            throw new NullPointerException(logRecord + ", " + logRecord2);
        }
        int i12 = 0;
        if (logRecord == logRecord2) {
            return 0;
        }
        Level level = logRecord.getLevel();
        Level level2 = logRecord2.getLevel();
        if (level == level2) {
            i10 = 0;
        } else {
            long jIntValue = level.intValue();
            long jIntValue2 = level2.intValue();
            if (jIntValue < jIntValue2) {
                i10 = -1;
            } else if (jIntValue > jIntValue2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        }
        if (i10 != 0) {
            return i10;
        }
        int iApplyThenCompare = applyThenCompare(logRecord.getThrown(), logRecord2.getThrown());
        if (iApplyThenCompare != 0) {
            return iApplyThenCompare;
        }
        long sequenceNumber = logRecord.getSequenceNumber();
        long sequenceNumber2 = logRecord2.getSequenceNumber();
        if (sequenceNumber < sequenceNumber2) {
            i11 = -1;
        } else {
            i11 = sequenceNumber > sequenceNumber2 ? 1 : 0;
        }
        if (i11 != 0) {
            return i11;
        }
        long millis = logRecord.getMillis();
        long millis2 = logRecord2.getMillis();
        if (millis < millis2) {
            i12 = -1;
        } else if (millis > millis2) {
            i12 = 1;
        }
        return i12;
    }
}
