package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f24309a;

    public static class LogcatLogger extends Logger {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24310b;

        public LogcatLogger(int i10) {
            super(i10);
            this.f24310b = i10;
        }

        @Override // androidx.work.Logger
        public void debug(String str, String str2, Throwable... thArr) {
            if (this.f24310b > 3 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th2 = thArr[0];
        }

        @Override // androidx.work.Logger
        public void error(String str, String str2, Throwable... thArr) {
            if (this.f24310b > 6 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th2 = thArr[0];
        }

        @Override // androidx.work.Logger
        public void info(String str, String str2, Throwable... thArr) {
            if (this.f24310b > 4 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th2 = thArr[0];
        }

        @Override // androidx.work.Logger
        public void verbose(String str, String str2, Throwable... thArr) {
            if (this.f24310b > 2 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th2 = thArr[0];
        }

        @Override // androidx.work.Logger
        public void warning(String str, String str2, Throwable... thArr) {
            if (this.f24310b <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public Logger(int i10) {
    }

    public static synchronized Logger get() {
        try {
            if (f24309a == null) {
                f24309a = new LogcatLogger(3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24309a;
    }

    public static synchronized void setLogger(Logger logger) {
        f24309a = logger;
    }

    public static String tagWithPrefix(@NonNull String str) {
        int length = str.length();
        StringBuilder sbA = a.a(23, "WM-");
        if (length >= 20) {
            sbA.append(str.substring(0, 20));
        } else {
            sbA.append(str);
        }
        return sbA.toString();
    }

    public abstract void debug(String str, String str2, Throwable... thArr);

    public abstract void error(String str, String str2, Throwable... thArr);

    public abstract void info(String str, String str2, Throwable... thArr);

    public abstract void verbose(String str, String str2, Throwable... thArr);

    public abstract void warning(String str, String str2, Throwable... thArr);
}
