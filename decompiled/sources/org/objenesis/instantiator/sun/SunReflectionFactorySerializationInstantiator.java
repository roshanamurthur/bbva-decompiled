package org.objenesis.instantiator.sun;

import af.b;
import java.io.NotSerializableException;
import java.lang.reflect.Constructor;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.SerializationInstantiatorHelper;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.SERIALIZATION)
public class SunReflectionFactorySerializationInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor<T> f92533a;

    public SunReflectionFactorySerializationInstantiator(Class<T> cls) {
        try {
            Constructor<T> constructorA = b.a(cls, SerializationInstantiatorHelper.getNonSerializableSuperClass(cls).getDeclaredConstructor(null));
            this.f92533a = constructorA;
            constructorA.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            throw new ObjenesisException(new NotSerializableException(cls + " has no suitable superclass constructor"));
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return this.f92533a.newInstance(null);
        } catch (Exception e5) {
            throw new ObjenesisException(e5);
        }
    }
}
