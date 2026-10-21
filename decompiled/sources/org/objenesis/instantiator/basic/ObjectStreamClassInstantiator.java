package org.objenesis.instantiator.basic;

import java.io.ObjectStreamClass;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.SERIALIZATION)
public class ObjectStreamClassInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f92523b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObjectStreamClass f92524a;

    public ObjectStreamClassInstantiator(Class<T> cls) {
        if (f92523b == null) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[0]);
                f92523b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException | RuntimeException e5) {
                throw new ObjenesisException(e5);
            }
        }
        this.f92524a = ObjectStreamClass.lookup(cls);
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return (T) f92523b.invoke(this.f92524a, new Object[0]);
        } catch (Exception e5) {
            throw new ObjenesisException(e5);
        }
    }
}
