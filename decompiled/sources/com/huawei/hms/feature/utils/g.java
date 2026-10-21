package com.huawei.hms.feature.utils;

import androidx.camera.camera2.internal.h0;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50590a = "g";

    public static Object a(ClassLoader classLoader) throws Exception {
        if (classLoader == null) {
            return null;
        }
        Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
        declaredField.setAccessible(true);
        return declaredField.get((BaseDexClassLoader) classLoader);
    }

    public static Field a(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                Logger.d(f50590a, "findField " + str + " is not found ");
            }
        }
        throw new NoSuchFieldException(h0.b("findField ", str, " is not found "));
    }

    public static Method a(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                Logger.d(f50590a, "findMethod " + str + " is not found ");
            }
        }
        throw new NoSuchMethodException(h0.b("findMethod ", str, " is not found "));
    }

    public static void a(Object obj, String str, Object[] objArr) throws Exception {
        Field fieldA = a(obj, str);
        Object[] objArr2 = (Object[]) fieldA.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldA.set(obj, objArr3);
    }
}
