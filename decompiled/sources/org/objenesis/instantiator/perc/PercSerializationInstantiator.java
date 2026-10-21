package org.objenesis.instantiator.perc;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.SERIALIZATION)
public class PercSerializationInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f92530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f92531b;

    public PercSerializationInstantiator(Class<T> cls) {
        Class<T> superclass = cls;
        while (Serializable.class.isAssignableFrom(superclass)) {
            superclass = superclass.getSuperclass();
        }
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("noArgConstruct", Class.class, Object.class, Class.forName("COM.newmonics.PercClassLoader.Method"));
            this.f92531b = declaredMethod;
            declaredMethod.setAccessible(true);
            Object objInvoke = Class.forName("COM.newmonics.PercClassLoader.PercClass").getDeclaredMethod("getPercClass", Class.class).invoke(null, superclass);
            this.f92530a = new Object[]{superclass, cls, objInvoke.getClass().getDeclaredMethod("findMethod", String.class).invoke(objInvoke, "<init>()V")};
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
            throw new ObjenesisException(e5);
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return (T) this.f92531b.invoke(null, this.f92530a);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new ObjenesisException(e5);
        }
    }
}
