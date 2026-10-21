package org.objenesis.instantiator.android;

import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.STANDARD)
public class Android17Instantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f92505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f92506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f92507c;

    public Android17Instantiator(Class<T> cls) {
        this.f92505a = cls;
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            this.f92506b = declaredMethod;
            try {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                this.f92507c = (Integer) declaredMethod2.invoke(null, Object.class);
            } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException e5) {
                throw new ObjenesisException(e5);
            }
        } catch (NoSuchMethodException | RuntimeException e7) {
            throw new ObjenesisException(e7);
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.f92505a;
            return cls.cast(this.f92506b.invoke(null, cls, this.f92507c));
        } catch (Exception e5) {
            throw new ObjenesisException(e5);
        }
    }
}
