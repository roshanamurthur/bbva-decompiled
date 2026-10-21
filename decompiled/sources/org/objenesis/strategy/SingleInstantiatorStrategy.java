package org.objenesis.strategy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;

/* JADX INFO: loaded from: classes13.dex */
public class SingleInstantiatorStrategy implements InstantiatorStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor<?> f92537a;

    public <T extends ObjectInstantiator<?>> SingleInstantiatorStrategy(Class<T> cls) {
        try {
            this.f92537a = cls.getConstructor(Class.class);
        } catch (NoSuchMethodException e5) {
            throw new ObjenesisException(e5);
        }
    }

    @Override // org.objenesis.strategy.InstantiatorStrategy
    public <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> cls) {
        try {
            return (ObjectInstantiator) this.f92537a.newInstance(cls);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new ObjenesisException(e5);
        }
    }
}
