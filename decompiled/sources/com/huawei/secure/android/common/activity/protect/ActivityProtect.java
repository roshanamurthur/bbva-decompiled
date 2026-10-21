package com.huawei.secure.android.common.activity.protect;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes10.dex */
public final class ActivityProtect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f50603a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50604b = "ActivityProtect";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IActivityProtect f50605c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ExceptionHandler f50606d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f50607e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f50608f;

    public static class a implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            if (ActivityProtect.f50606d != null) {
                ActivityProtect.f50606d.uncaughtExceptionHappened(thread, th2);
            }
            if (thread == Looper.getMainLooper().getThread()) {
                ActivityProtect.d(th2);
                ActivityProtect.e(th2);
                ActivityProtect.i();
            }
        }
    }

    public static class b implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f50609a;

        public b(Handler handler) {
            this.f50609a = handler;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (Build.VERSION.SDK_INT >= 28) {
                if (!ActivityProtect.f50603a) {
                    com.huawei.secure.android.common.activity.a.b(ActivityProtect.f50604b, "handleMessage: >= 28");
                    boolean unused = ActivityProtect.f50603a = true;
                }
                if (message.what != 159) {
                    return false;
                }
                try {
                    this.f50609a.handleMessage(message);
                } catch (Throwable th2) {
                    ActivityProtect.f50605c.finishLaunchActivity(message);
                    ActivityProtect.f(th2);
                }
                return true;
            }
            if (!ActivityProtect.f50603a) {
                com.huawei.secure.android.common.activity.a.b(ActivityProtect.f50604b, "handleMessage: < 28");
                boolean unused2 = ActivityProtect.f50603a = true;
            }
            int i10 = message.what;
            if (i10 == 104) {
                try {
                    this.f50609a.handleMessage(message);
                } catch (Throwable th3) {
                    ActivityProtect.f50605c.finishStopActivity(message);
                    ActivityProtect.f(th3);
                }
                return true;
            }
            if (i10 == 107) {
                try {
                    this.f50609a.handleMessage(message);
                } catch (Throwable th4) {
                    ActivityProtect.f50605c.finishResumeActivity(message);
                    ActivityProtect.f(th4);
                }
                return true;
            }
            if (i10 == 109) {
                try {
                    this.f50609a.handleMessage(message);
                } catch (Throwable th5) {
                    ActivityProtect.f(th5);
                }
                return true;
            }
            switch (i10) {
                case 100:
                    try {
                        this.f50609a.handleMessage(message);
                        break;
                    } catch (Throwable th6) {
                        ActivityProtect.f50605c.finishLaunchActivity(message);
                        ActivityProtect.f(th6);
                    }
                    return true;
                case 101:
                case 102:
                    try {
                        this.f50609a.handleMessage(message);
                        break;
                    } catch (Throwable th7) {
                        ActivityProtect.f50605c.finishPauseActivity(message);
                        ActivityProtect.f(th7);
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    private ActivityProtect() {
    }

    @SuppressLint({"PrivateApi"})
    private static void f() throws Exception {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField("mH");
        declaredField.setAccessible(true);
        Handler handler = (Handler) declaredField.get(objInvoke);
        Field declaredField2 = Handler.class.getDeclaredField("mCallback");
        declaredField2.setAccessible(true);
        declaredField2.set(handler, new b(handler));
    }

    private static void g() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            f50605c = new e();
        } else if (i10 >= 26) {
            f50605c = new d();
        } else if (i10 == 25 || i10 == 24) {
            f50605c = new c();
        } else if (i10 <= 23) {
            f50605c = new com.huawei.secure.android.common.activity.protect.b();
        }
        try {
            f();
        } catch (Throwable th2) {
            com.huawei.secure.android.common.activity.a.a(f50604b, "initActivityProtect: " + th2.getMessage(), th2);
        }
    }

    private static boolean h() {
        return f50608f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Infinite loop detected, blocks: 16, insns: 0 */
    public static void i() {
        f50608f = true;
        if (f50606d != null) {
            com.huawei.secure.android.common.activity.a.b(f50604b, "safeMode: enter safe mode");
        }
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th2) {
                d(th2);
                e(th2);
                ExceptionHandler exceptionHandler = f50606d;
                if (exceptionHandler != null) {
                    exceptionHandler.a(th2);
                }
            }
        }
    }

    public static void init(Context context, ExceptionHandler exceptionHandler) {
        if (f50607e) {
            return;
        }
        try {
            f.a(context);
        } catch (Throwable th2) {
            com.huawei.secure.android.common.activity.a.a(f50604b, "un reflect error :" + th2.getMessage(), th2);
        }
        f50607e = true;
        f50606d = exceptionHandler;
        g();
        Thread.setDefaultUncaughtExceptionHandler(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Throwable th2) {
        if (th2 == null || f50606d == null) {
            return;
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            length--;
            if (length <= -1 || stackTrace.length - length > 20) {
                return;
            }
            StackTraceElement stackTraceElement = stackTrace[length];
            if ("android.view.Choreographer".equals(stackTraceElement.getClassName()) && "Choreographer.java".equals(stackTraceElement.getFileName()) && "doFrame".equals(stackTraceElement.getMethodName())) {
                com.huawei.secure.android.common.activity.a.a(f50604b, "isChoreographerException BlackScreen , suggest killing self ");
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Throwable th2) {
        if (th2 == null || f50606d == null) {
            return;
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        do {
            length--;
            if (length <= -1 || stackTrace.length - length > 20) {
                return;
            }
        } while (!"java.lang.ThreadGroup".equals(stackTrace[length].getClassName()));
        com.huawei.secure.android.common.activity.a.a(f50604b, "java.lang.ThreadGroup , suggest killing self ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Throwable th2) {
        if (f50606d == null) {
            return;
        }
        if (h()) {
            f50606d.a(th2);
        } else {
            f50606d.uncaughtExceptionHappened(Looper.getMainLooper().getThread(), th2);
            i();
        }
    }
}
