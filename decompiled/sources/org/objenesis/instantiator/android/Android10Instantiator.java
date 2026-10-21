package org.objenesis.instantiator.android;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.STANDARD)
public class Android10Instantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f92503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f92504b;

    public Android10Instantiator(Class<T> cls) {
        this.f92503a = cls;
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod.setAccessible(true);
            this.f92504b = declaredMethod;
        } catch (NoSuchMethodException | RuntimeException e5) {
            throw new ObjenesisException(e5);
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.f92503a;
            return cls.cast(this.f92504b.invoke(null, cls, Object.class));
        } catch (Exception e5) {
            throw new ObjenesisException(e5);
        }
    }
}
