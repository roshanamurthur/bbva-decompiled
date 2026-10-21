package org.objenesis;

import ad.d;
import java.util.concurrent.ConcurrentHashMap;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.strategy.InstantiatorStrategy;

/* JADX INFO: loaded from: classes13.dex */
public class ObjenesisBase implements Objenesis {
    protected ConcurrentHashMap<String, ObjectInstantiator<?>> cache;
    protected final InstantiatorStrategy strategy;

    public ObjenesisBase(InstantiatorStrategy instantiatorStrategy) {
        this(instantiatorStrategy, true);
    }

    @Override // org.objenesis.Objenesis
    public <T> ObjectInstantiator<T> getInstantiatorOf(Class<T> cls) {
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Primitive types can't be instantiated in Java");
        }
        ConcurrentHashMap<String, ObjectInstantiator<?>> concurrentHashMap = this.cache;
        if (concurrentHashMap == null) {
            return this.strategy.newInstantiatorOf(cls);
        }
        ObjectInstantiator<T> objectInstantiator = (ObjectInstantiator) concurrentHashMap.get(cls.getName());
        if (objectInstantiator != null) {
            return objectInstantiator;
        }
        ObjectInstantiator<T> objectInstantiatorNewInstantiatorOf = this.strategy.newInstantiatorOf(cls);
        ObjectInstantiator<T> objectInstantiator2 = (ObjectInstantiator) this.cache.putIfAbsent(cls.getName(), objectInstantiatorNewInstantiatorOf);
        return objectInstantiator2 == null ? objectInstantiatorNewInstantiatorOf : objectInstantiator2;
    }

    @Override // org.objenesis.Objenesis
    public <T> T newInstance(Class<T> cls) {
        return getInstantiatorOf(cls).newInstance();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(" using ");
        sb2.append(this.strategy.getClass().getName());
        return d.f(sb2, this.cache == null ? " without" : " with", " caching");
    }

    public ObjenesisBase(InstantiatorStrategy instantiatorStrategy, boolean z10) {
        if (instantiatorStrategy == null) {
            throw new IllegalArgumentException("A strategy can't be null");
        }
        this.strategy = instantiatorStrategy;
        this.cache = z10 ? new ConcurrentHashMap<>() : null;
    }
}
