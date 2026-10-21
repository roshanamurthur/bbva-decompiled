package org.objenesis.instantiator.util;

import java.lang.reflect.Field;
import org.objenesis.ObjenesisException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes13.dex */
public final class UnsafeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f92536a;

    static {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            try {
                f92536a = (Unsafe) declaredField.get(null);
            } catch (IllegalAccessException e5) {
                throw new ObjenesisException(e5);
            }
        } catch (NoSuchFieldException e7) {
            throw new ObjenesisException(e7);
        }
    }

    public static Unsafe getUnsafe() {
        return f92536a;
    }
}
