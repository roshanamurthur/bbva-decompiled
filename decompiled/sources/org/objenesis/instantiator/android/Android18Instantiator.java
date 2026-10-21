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
public class Android18Instantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f92508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f92509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f92510c;

    public Android18Instantiator(Class<T> cls) {
        this.f92508a = cls;
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Long.TYPE);
            declaredMethod.setAccessible(true);
            this.f92509b = declaredMethod;
            try {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                this.f92510c = (Long) declaredMethod2.invoke(null, Object.class);
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
            Class<T> cls = this.f92508a;
            return cls.cast(this.f92509b.invoke(null, cls, this.f92510c));
        } catch (Exception e5) {
            throw new ObjenesisException(e5);
        }
    }
}
