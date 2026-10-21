package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbk {
    public static Field a(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    public static Method b(Class cls, String str, Class... clsArr) {
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    public static zzbi zza(Object obj, String str, Class cls) {
        return new zzbi(obj, a(obj, str), Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public static zzbj zzb(Object obj, String str, Class cls) {
        return new zzbj(obj, a(obj, str), cls);
    }

    public static Object zzc(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e5) {
            throw new zzbl(String.format("Failed to invoke default constructor on class %s", cls.getName()), e5);
        }
    }

    public static Object zzd(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(b(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (Exception e5) {
            throw new zzbl(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e5);
        }
    }

    public static Object zze(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(b(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (Exception e5) {
            throw new zzbl(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e5);
        }
    }

    public static Object zzf(Class cls, String str, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(b(cls, "isDexOptNeeded", cls3).invoke(null, obj));
        } catch (Exception e5) {
            throw new zzbl(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e5);
        }
    }

    public static Object zzg(Class cls, String str, Class cls2, Class cls3, Object obj, Class cls4, Object obj2) {
        try {
            return cls2.cast(b(cls, "optimizedPathFor", cls3, cls4).invoke(null, obj, obj2));
        } catch (Exception e5) {
            throw new zzbl(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls), e5);
        }
    }
}
