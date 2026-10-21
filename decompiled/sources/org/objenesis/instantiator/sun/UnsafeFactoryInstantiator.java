package org.objenesis.instantiator.sun;

import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;
import org.objenesis.instantiator.util.UnsafeUtils;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.STANDARD)
public class UnsafeFactoryInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f92534a = UnsafeUtils.getUnsafe();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<T> f92535b;

    public UnsafeFactoryInstantiator(Class<T> cls) {
        this.f92535b = cls;
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.f92535b;
            return cls.cast(this.f92534a.allocateInstance(cls));
        } catch (InstantiationException e5) {
            throw new ObjenesisException(e5);
        }
    }
}
