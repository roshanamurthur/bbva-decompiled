package org.objenesis.instantiator.perc;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.STANDARD)
public class PercInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f92528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f92529b;

    public PercInstantiator(Class<T> cls) {
        Object[] objArr = {null, Boolean.FALSE};
        this.f92529b = objArr;
        objArr[0] = cls;
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Boolean.TYPE);
            this.f92528a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException | RuntimeException e5) {
            throw new ObjenesisException(e5);
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return (T) this.f92528a.invoke(null, this.f92529b);
        } catch (Exception e5) {
            throw new ObjenesisException(e5);
        }
    }
}
