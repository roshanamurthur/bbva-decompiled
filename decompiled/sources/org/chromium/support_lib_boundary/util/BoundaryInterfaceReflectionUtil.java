package org.chromium.support_lib_boundary.util;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes13.dex */
public class BoundaryInterfaceReflectionUtil {

    @RequiresApi(19)
    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f91754a;

        public a(@NonNull Object obj) {
            this.f91754a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2 = this.f91754a;
            try {
                return BoundaryInterfaceReflectionUtil.dupeMethod(method, obj2.getClass().getClassLoader()).invoke(obj2, objArr);
            } catch (InvocationTargetException e5) {
                throw e5.getTargetException();
            } catch (ReflectiveOperationException e7) {
                throw new RuntimeException("Reflection failed for method " + method, e7);
            }
        }
    }

    @Nullable
    public static <T> T castToSuppLibClass(@NonNull Class<T> cls, @Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(BoundaryInterfaceReflectionUtil.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean containsFeature(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (collection.contains(str + Features.DEV_SUFFIX)) {
                }
            }
            return false;
        }
        return true;
    }

    @Nullable
    @RequiresApi(19)
    public static InvocationHandler createInvocationHandlerFor(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return new a(obj);
    }

    @Nullable
    @RequiresApi(19)
    public static InvocationHandler[] createInvocationHandlersForArray(@Nullable Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[length];
        for (int i10 = 0; i10 < length; i10++) {
            invocationHandlerArr[i10] = createInvocationHandlerFor(objArr[i10]);
        }
        return invocationHandlerArr;
    }

    public static Method dupeMethod(Method method, ClassLoader classLoader) throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    @Nullable
    @RequiresApi(19)
    public static Object getDelegateFromInvocationHandler(@Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((a) invocationHandler).f91754a;
    }

    public static boolean instanceOfInOwnClassLoader(Object obj, String str) {
        try {
            return Class.forName(str, false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean containsFeature(String[] strArr, String str) {
        return containsFeature(Arrays.asList(strArr), str);
    }
}
