package org.objenesis.instantiator.util;

import com.fasterxml.jackson.core.JsonPointer;
import org.objenesis.ObjenesisException;

/* JADX INFO: loaded from: classes13.dex */
public final class ClassUtils {
    public static String classNameToInternalClassName(String str) {
        return str.replace('.', JsonPointer.SEPARATOR);
    }

    public static String classNameToResource(String str) {
        return classNameToInternalClassName(str) + ".class";
    }

    public static <T> Class<T> getExistingClass(ClassLoader classLoader, String str) {
        try {
            return (Class<T>) Class.forName(str, true, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static <T> T newInstance(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e5) {
            throw new ObjenesisException(e5);
        }
    }
}
