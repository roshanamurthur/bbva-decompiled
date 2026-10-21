package com.sun.mail.util.logging;

import androidx.camera.core.processing.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Collections;
import java.util.Date;
import java.util.Formattable;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import ti.b;

/* JADX INFO: loaded from: classes9.dex */
public class CompactFormatter extends Formatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65624a;

    public class a implements Formattable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65626b;

        public a(String str, String str2) {
            this.f65625a = String.valueOf(str);
            this.f65626b = String.valueOf(str2);
        }

        public static String a(int i10, int i11, String str) {
            int length = i11 - str.length();
            StringBuilder sb2 = new StringBuilder(i11);
            int i12 = 0;
            if ((i10 & 1) == 1) {
                while (i12 < length) {
                    sb2.append(' ');
                    i12++;
                }
                sb2.append(str);
            } else {
                sb2.append(str);
                while (i12 < length) {
                    sb2.append(' ');
                    i12++;
                }
            }
            return sb2.toString();
        }

        @Override // java.util.Formattable
        public final void formatTo(java.util.Formatter formatter, int i10, int i11, int i12) {
            int i13 = i10 & 2;
            String strA = this.f65625a;
            String alternate = this.f65626b;
            if (i13 == 2) {
                strA = strA.toUpperCase(formatter.locale());
                alternate = alternate.toUpperCase(formatter.locale());
            }
            if ((i10 & 4) == 4) {
                CompactFormatter compactFormatter = CompactFormatter.this;
                strA = compactFormatter.toAlternate(strA);
                alternate = compactFormatter.toAlternate(alternate);
            }
            if (i12 <= 0) {
                i12 = Integer.MAX_VALUE;
            }
            int iMin = Math.min(strA.length(), i12);
            if (iMin > (i12 >> 1)) {
                iMin = Math.max(iMin - alternate.length(), iMin >> 1);
            }
            if (iMin > 0) {
                if (iMin > strA.length() && Character.isHighSurrogate(strA.charAt(iMin - 1))) {
                    iMin--;
                }
                strA = strA.substring(0, iMin);
            }
            String strSubstring = alternate.substring(0, Math.min(i12 - iMin, alternate.length()));
            if (i11 > 0) {
                int i14 = i11 >> 1;
                if (strA.length() < i14) {
                    strA = a(i10, i14, strA);
                }
                if (strSubstring.length() < i14) {
                    strSubstring = a(i10, i14, strSubstring);
                }
            }
            Object[] array = Collections.emptySet().toArray();
            formatter.format(strA, array);
            if (strA.length() != 0 && strSubstring.length() != 0) {
                formatter.format("|", array);
            }
            formatter.format(strSubstring, array);
        }
    }

    public CompactFormatter() {
        String strB = b.b(getClass().getName().concat(".format"));
        this.f65624a = d(strB) ? "%7$#.160s%n" : strB;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean a(StackTraceElement stackTraceElement) {
        if (stackTraceElement.getMethodName().indexOf(36) <= -1) {
            try {
                if (!b.e(stackTraceElement.getClassName())) {
                    try {
                        if (b.d(stackTraceElement.getClassName())) {
                            return false;
                        }
                    } catch (RuntimeException | Exception | LinkageError unused) {
                        if (!stackTraceElement.getClassName().startsWith("java.lang.reflect.") && !stackTraceElement.getClassName().startsWith("sun.reflect.")) {
                            return false;
                        }
                    }
                }
            } catch (RuntimeException | Exception | LinkageError unused2) {
                String className = stackTraceElement.getClassName();
                if ((!className.endsWith("s") || className.endsWith("es")) && !className.contains("Util") && !className.endsWith("Throwables")) {
                    if (b.d(stackTraceElement.getClassName())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static String c(StackTraceElement stackTraceElement) {
        int iLastIndexOf;
        String strF = f(stackTraceElement.getClassName());
        String strReplace = strF != null ? stackTraceElement.toString().replace(stackTraceElement.getClassName(), strF) : stackTraceElement.toString();
        String fileName = stackTraceElement.getFileName();
        if (fileName != null && (iLastIndexOf = fileName.lastIndexOf(46)) > -1) {
            fileName = fileName.substring(0, iLastIndexOf);
        }
        return (fileName == null || !strReplace.startsWith(fileName)) ? strReplace : strReplace.replace(stackTraceElement.getFileName(), "");
    }

    public static boolean d(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String e(String str, Throwable th2) {
        String strF;
        if (!d(str)) {
            int i10 = 0;
            while (th2 != null) {
                Class<?> cls = th2.getClass();
                String name = cls.getName();
                try {
                    strF = cls.getSimpleName();
                } catch (InternalError unused) {
                    strF = f(cls.getName());
                }
                str = str.replace(name, strF);
                i10++;
                if (i10 == 65536) {
                    break;
                }
                th2 = th2.getCause();
            }
        }
        return str;
    }

    public static String f(String str) {
        int i10;
        int i11;
        if (str == null) {
            return str;
        }
        int iCharCount = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isJavaIdentifierPart(iCodePointAt)) {
                if (iCodePointAt != 46) {
                    if (i12 + 1 != iCharCount) {
                        break;
                    }
                    i12 = i13;
                    break;
                }
                int i15 = i12 + 1;
                if (i15 == iCharCount || i15 == i14) {
                    return str;
                }
                i13 = i12;
                i12 = iCharCount;
            } else if (iCodePointAt == 36) {
                i14 = iCharCount;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        if (i12 <= -1 || (i10 = i12 + 1) >= iCharCount || (i11 = i14 + 1) >= iCharCount) {
            return str;
        }
        if (i11 > i10) {
            i10 = i11;
        }
        return str.substring(i10);
    }

    public Throwable apply(Throwable th2) {
        return SeverityComparator.f65661p0.apply(th2);
    }

    public final String b(StackTraceElement[] stackTraceElementArr) {
        String strC;
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                strC = "";
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            if (!ignore(stackTraceElement)) {
                strC = c(stackTraceElement);
                break;
            }
            i10++;
        }
        if (!d(strC)) {
            return strC;
        }
        for (StackTraceElement stackTraceElement2 : stackTraceElementArr) {
            if (!a(stackTraceElement2)) {
                return c(stackTraceElement2);
            }
        }
        return strC;
    }

    @Override // java.util.logging.Formatter
    public String format(LogRecord logRecord) {
        ResourceBundle resourceBundle = logRecord.getResourceBundle();
        Comparable date = null;
        Locale locale = resourceBundle == null ? null : resourceBundle.getLocale();
        String message = formatMessage(logRecord);
        String thrown = formatThrown(logRecord);
        String error = formatError(logRecord);
        Object[] objArr = new Object[16];
        Method method = b.f93614s0;
        if (method != null) {
            try {
                date = (Comparable) method.invoke(null, b.f93612q0.invoke(logRecord, new Object[0]), b.f93613r0.invoke(null, new Object[0]));
            } catch (RuntimeException | Exception unused) {
            } catch (InvocationTargetException e5) {
                Throwable cause = e5.getCause();
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new UndeclaredThrowableException(e5);
            }
        }
        if (date == null) {
            date = new Date(logRecord.getMillis());
        }
        objArr[0] = date;
        objArr[1] = formatSource(logRecord);
        objArr[2] = formatLoggerName(logRecord);
        objArr[3] = formatLevel(logRecord);
        objArr[4] = message;
        objArr[5] = thrown;
        objArr[6] = new a(message, thrown);
        objArr[7] = new a(thrown, message);
        objArr[8] = Long.valueOf(logRecord.getSequenceNumber());
        objArr[9] = formatThreadID(logRecord);
        objArr[10] = error;
        objArr[11] = new a(message, error);
        objArr[12] = new a(error, message);
        objArr[13] = formatBackTrace(logRecord);
        objArr[14] = logRecord.getResourceBundleName();
        objArr[15] = logRecord.getMessage();
        String str = this.f65624a;
        return locale == null ? String.format(str, objArr) : String.format(locale, str, objArr);
    }

    public String formatBackTrace(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        if (thrown == null) {
            return "";
        }
        StackTraceElement[] stackTrace = apply(thrown).getStackTrace();
        String strB = b(stackTrace);
        if (!d(strB)) {
            return strB;
        }
        int i10 = 0;
        while (thrown != null) {
            StackTraceElement[] stackTrace2 = thrown.getStackTrace();
            String strB2 = b(stackTrace2);
            if (d(strB2)) {
                if (stackTrace.length == 0) {
                    stackTrace = stackTrace2;
                }
                i10++;
                if (i10 != 65536) {
                    thrown = thrown.getCause();
                    strB = strB2;
                }
            }
            strB = strB2;
            break;
        }
        return (!d(strB) || stackTrace.length == 0) ? strB : c(stackTrace[0]);
    }

    public String formatError(LogRecord logRecord) {
        return formatMessage(logRecord.getThrown());
    }

    public String formatLevel(LogRecord logRecord) {
        return logRecord.getLevel().getLocalizedName();
    }

    public String formatLoggerName(LogRecord logRecord) {
        return f(logRecord.getLoggerName());
    }

    @Override // java.util.logging.Formatter
    public String formatMessage(LogRecord logRecord) {
        String strF;
        String strE = e(super.formatMessage(logRecord), logRecord.getThrown());
        Object[] parameters = logRecord.getParameters();
        if (!d(strE) && parameters != null) {
            for (Object obj : parameters) {
                if (obj != null) {
                    Class<?> cls = obj.getClass();
                    String name = cls.getName();
                    try {
                        strF = cls.getSimpleName();
                    } catch (InternalError unused) {
                        strF = f(cls.getName());
                    }
                    strE = strE.replace(name, strF);
                }
            }
        }
        return strE;
    }

    public String formatSource(LogRecord logRecord) {
        String sourceClassName = logRecord.getSourceClassName();
        if (sourceClassName == null) {
            return f(logRecord.getLoggerName());
        }
        if (logRecord.getSourceMethodName() == null) {
            return f(sourceClassName);
        }
        return f(sourceClassName) + " " + logRecord.getSourceMethodName();
    }

    public Number formatThreadID(LogRecord logRecord) {
        return Long.valueOf(((long) logRecord.getThreadID()) & 4294967295L);
    }

    public String formatThrown(LogRecord logRecord) {
        Throwable thrown = logRecord.getThrown();
        if (thrown == null) {
            return "";
        }
        String backTrace = formatBackTrace(logRecord);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(formatMessage(thrown));
        sb2.append(d(backTrace) ? "" : f.d(" ", backTrace));
        return sb2.toString();
    }

    public boolean ignore(StackTraceElement stackTraceElement) {
        return stackTraceElement.getLineNumber() < 0 || a(stackTraceElement);
    }

    public String toAlternate(String str) {
        if (str != null) {
            return str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
        }
        return null;
    }

    public CompactFormatter(String str) {
        String name = getClass().getName();
        if (str == null) {
            str = b.b(name.concat(".format"));
            if (d(str)) {
                str = "%7$#.160s%n";
            }
        }
        this.f65624a = str;
    }

    public String formatMessage(Throwable th2) {
        String strF;
        String strE;
        if (th2 == null) {
            return "";
        }
        Throwable thApply = apply(th2);
        String localizedMessage = thApply.getLocalizedMessage();
        String string = thApply.toString();
        Class<?> cls = thApply.getClass();
        try {
            strF = cls.getSimpleName();
        } catch (InternalError unused) {
            strF = f(cls.getName());
        }
        if (!d(localizedMessage)) {
            if (string.contains(localizedMessage)) {
                if (!string.startsWith(thApply.getClass().getName()) && !string.startsWith(strF)) {
                    strE = e(f(string), th2);
                } else {
                    strE = e(localizedMessage, th2);
                }
            } else {
                strE = e(f(string) + ": " + localizedMessage, th2);
            }
        } else {
            strE = e(f(string), th2);
        }
        return !strE.contains(strF) ? androidx.camera.core.impl.utils.a.b(strF, ": ", strE) : strE;
    }
}
