package h3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: CanvasUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f69299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f69300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f69301c;

    /* JADX INFO: renamed from: h3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CanvasUtils.java */
    @RequiresApi(29)
    public static class C0291a {
        @DoNotInline
        public static void a(Canvas canvas) {
            canvas.disableZ();
        }

        @DoNotInline
        public static void b(Canvas canvas) {
            canvas.enableZ();
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(@NonNull Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                C0291a.b(canvas);
                return;
            } else {
                C0291a.a(canvas);
                return;
            }
        }
        if (i10 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f69301c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f69299a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f69300b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f69301c = true;
        }
        if (z10) {
            try {
                Method method2 = f69299a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(e5.getCause());
            }
        }
        if (z10 || (method = f69300b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
