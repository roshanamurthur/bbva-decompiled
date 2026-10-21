package org.objenesis.instantiator.android;

import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.SERIALIZATION)
public class AndroidSerializationInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f92511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObjectStreamClass f92512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f92513c;

    public AndroidSerializationInstantiator(Class<T> cls) {
        this.f92511a = cls;
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class);
            declaredMethod.setAccessible(true);
            this.f92513c = declaredMethod;
            try {
                try {
                    this.f92512b = (ObjectStreamClass) ObjectStreamClass.class.getMethod("lookupAny", Class.class).invoke(null, cls);
                } catch (IllegalAccessException | InvocationTargetException e5) {
                    throw new ObjenesisException(e5);
                }
            } catch (NoSuchMethodException e7) {
                throw new ObjenesisException(e7);
            }
        } catch (NoSuchMethodException | RuntimeException e10) {
            throw new ObjenesisException(e10);
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.f92511a;
            return cls.cast(this.f92513c.invoke(this.f92512b, cls));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
            throw new ObjenesisException(e5);
        }
    }
}
