package com.facetec.sdk;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes9.dex */
public final class fc {
    public static boolean b(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public static <T> Class<T> e(Class<T> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }
}
