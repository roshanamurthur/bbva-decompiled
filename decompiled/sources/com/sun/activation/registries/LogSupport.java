package com.sun.activation.registries;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class LogSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f65204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f65205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Level f65206c = Level.FINE;

    static {
        try {
            f65204a = Boolean.getBoolean("javax.activation.debug");
        } catch (Throwable unused) {
        }
        f65205b = Logger.getLogger("javax.activation");
    }

    public static boolean isLoggable() {
        return f65204a || f65205b.isLoggable(f65206c);
    }

    public static void log(String str) {
        if (f65204a) {
            System.out.println(str);
        }
        f65205b.log(f65206c, str);
    }

    public static void log(String str, Throwable th2) {
        if (f65204a) {
            System.out.println(str + "; Exception: " + th2);
        }
        f65205b.log(f65206c, str, th2);
    }
}
