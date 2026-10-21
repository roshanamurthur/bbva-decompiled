package com.sun.mail.util;

import com.bbva.glomohybrid.logs.LogKeysKt;
import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Session;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class MailLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f65560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PrintStream f65563d;

    public MailLogger(String str, String str2, boolean z10, PrintStream printStream) {
        this.f65560a = Logger.getLogger(str);
        this.f65561b = str2;
        this.f65562c = z10;
        this.f65563d = printStream == null ? System.out : printStream;
    }

    public static StackTraceElement b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int i10 = 0;
        while (i10 < stackTrace.length) {
            if (MailLogger.class.getName().equals(stackTrace[i10].getClassName())) {
                break;
            }
            i10++;
        }
        while (i10 < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!MailLogger.class.getName().equals(stackTraceElement.getClassName())) {
                return stackTraceElement;
            }
            i10++;
        }
        return new StackTraceElement(MailLogger.class.getName(), LogKeysKt.LOG, MailLogger.class.getName(), -1);
    }

    public final void a(String str) {
        PrintStream printStream = this.f65563d;
        String str2 = this.f65561b;
        if (str2 == null) {
            printStream.println(str);
            return;
        }
        printStream.println(str2 + ": " + str);
    }

    public void config(String str) {
        log(Level.CONFIG, str);
    }

    public void fine(String str) {
        log(Level.FINE, str);
    }

    public void finer(String str) {
        log(Level.FINER, str);
    }

    public void finest(String str) {
        log(Level.FINEST, str);
    }

    public MailLogger getLogger(String str, String str2) {
        return new MailLogger(str, str2, this.f65562c, this.f65563d);
    }

    public MailLogger getSubLogger(String str, String str2) {
        return new MailLogger(this.f65560a.getName() + Constant.DOT_STRING + str, str2, this.f65562c, this.f65563d);
    }

    public boolean isLoggable(Level level) {
        return this.f65562c || this.f65560a.isLoggable(level);
    }

    public void log(Level level, String str, Object obj) {
        if (this.f65562c) {
            str = MessageFormat.format(str, obj);
            a(str);
        }
        String str2 = str;
        if (this.f65560a.isLoggable(level)) {
            StackTraceElement stackTraceElementB = b();
            this.f65560a.logp(level, stackTraceElementB.getClassName(), stackTraceElementB.getMethodName(), str2, obj);
        }
    }

    public void logf(Level level, String str, Object... objArr) {
        String str2 = String.format(str, objArr);
        if (this.f65562c) {
            a(str2);
        }
        this.f65560a.log(level, str2);
    }

    public MailLogger getLogger(Class<?> cls, String str) {
        return new MailLogger(cls, str, this.f65562c, this.f65563d);
    }

    public MailLogger getSubLogger(String str, String str2, boolean z10) {
        return new MailLogger(this.f65560a.getName() + Constant.DOT_STRING + str, str2, z10, this.f65563d);
    }

    public MailLogger(Class<?> cls, String str, boolean z10, PrintStream printStream) {
        String strSubstring;
        Package r1 = cls.getPackage();
        if (r1 != null) {
            strSubstring = r1.getName();
        } else {
            String name = cls.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            strSubstring = iLastIndexOf > 0 ? name.substring(0, iLastIndexOf) : "";
        }
        this.f65560a = Logger.getLogger(strSubstring);
        this.f65561b = str;
        this.f65562c = z10;
        this.f65563d = printStream == null ? System.out : printStream;
    }

    public void log(Level level, String str, Object... objArr) {
        if (this.f65562c) {
            str = MessageFormat.format(str, objArr);
            a(str);
        }
        String str2 = str;
        if (this.f65560a.isLoggable(level)) {
            StackTraceElement stackTraceElementB = b();
            this.f65560a.logp(level, stackTraceElementB.getClassName(), stackTraceElementB.getMethodName(), str2, objArr);
        }
    }

    public void log(Level level, String str, Throwable th2) {
        if (this.f65562c) {
            if (th2 != null) {
                a(str + ", THROW: ");
                th2.printStackTrace(this.f65563d);
            } else {
                a(str);
            }
        }
        if (this.f65560a.isLoggable(level)) {
            StackTraceElement stackTraceElementB = b();
            this.f65560a.logp(level, stackTraceElementB.getClassName(), stackTraceElementB.getMethodName(), str, th2);
        }
    }

    public MailLogger(Class<?> cls, String str, String str2, boolean z10, PrintStream printStream) {
        String strSubstring;
        StringBuilder sb2 = new StringBuilder();
        Package r1 = cls.getPackage();
        if (r1 != null) {
            strSubstring = r1.getName();
        } else {
            String name = cls.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            strSubstring = iLastIndexOf > 0 ? name.substring(0, iLastIndexOf) : "";
        }
        sb2.append(strSubstring);
        sb2.append(Constant.DOT_STRING);
        sb2.append(str);
        this.f65560a = Logger.getLogger(sb2.toString());
        this.f65561b = str2;
        this.f65562c = z10;
        this.f65563d = printStream == null ? System.out : printStream;
    }

    public void log(Level level, String str) {
        if (this.f65562c) {
            a(str);
        }
        Logger logger = this.f65560a;
        if (logger.isLoggable(level)) {
            StackTraceElement stackTraceElementB = b();
            logger.logp(level, stackTraceElementB.getClassName(), stackTraceElementB.getMethodName(), str);
        }
    }

    @Deprecated
    public MailLogger(String str, String str2, Session session) {
        this(str, str2, session.getDebug(), session.getDebugOut());
    }

    @Deprecated
    public MailLogger(Class<?> cls, String str, Session session) {
        this(cls, str, session.getDebug(), session.getDebugOut());
    }
}
