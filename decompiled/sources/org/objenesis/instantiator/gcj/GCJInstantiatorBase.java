package org.objenesis.instantiator.gcj;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class GCJInstantiatorBase<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f92525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f92526b;
    protected final Class<T> type;

    public static class a extends ObjectInputStream {
    }

    public GCJInstantiatorBase(Class<T> cls) {
        this.type = cls;
        if (f92525a == null) {
            try {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newObject", Class.class, Class.class);
                f92525a = declaredMethod;
                declaredMethod.setAccessible(true);
                f92526b = new a();
            } catch (IOException | NoSuchMethodException | RuntimeException e5) {
                throw new ObjenesisException(e5);
            }
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public abstract T newInstance();
}
