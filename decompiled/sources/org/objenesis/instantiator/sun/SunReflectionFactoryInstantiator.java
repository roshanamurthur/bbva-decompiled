package org.objenesis.instantiator.sun;

import af.b;
import java.lang.reflect.Constructor;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.STANDARD)
public class SunReflectionFactoryInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor<T> f92532a;

    public SunReflectionFactoryInstantiator(Class<T> cls) {
        try {
            Constructor<T> constructorA = b.a(cls, Object.class.getConstructor(null));
            this.f92532a = constructorA;
            constructorA.setAccessible(true);
        } catch (NoSuchMethodException e5) {
            throw new ObjenesisException(e5);
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return this.f92532a.newInstance(null);
        } catch (Exception e5) {
            throw new ObjenesisException(e5);
        }
    }
}
