package androidx.core.os;

import android.os.Build;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(17)
public class UserHandleCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Method f20012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Constructor<UserHandle> f20013b;

    @RequiresApi(24)
    public static class a {
        @NonNull
        public static UserHandle a(int i10) {
            return UserHandle.getUserHandleForUid(i10);
        }
    }

    public static Method a() throws NoSuchMethodException {
        if (f20012a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f20012a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f20012a;
    }

    public static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (f20013b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f20013b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f20013b;
    }

    @NonNull
    public static UserHandle getUserHandleForUid(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(i10);
        }
        try {
            return b().newInstance((Integer) a().invoke(null, Integer.valueOf(i10)));
        } catch (IllegalAccessException e5) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e5);
            throw illegalAccessError;
        } catch (InstantiationException e7) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e7);
            throw instantiationError;
        } catch (NoSuchMethodException e10) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e10);
            throw noSuchMethodError;
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
