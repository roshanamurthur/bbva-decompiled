package org.objenesis.instantiator.gcj;

import java.lang.reflect.InvocationTargetException;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.STANDARD)
public class GCJInstantiator<T> extends GCJInstantiatorBase<T> {
    public GCJInstantiator(Class<T> cls) {
        super(cls);
    }

    @Override // org.objenesis.instantiator.gcj.GCJInstantiatorBase, org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(GCJInstantiatorBase.f92525a.invoke(GCJInstantiatorBase.f92526b, cls, Object.class));
        } catch (IllegalAccessException | RuntimeException | InvocationTargetException e5) {
            throw new ObjenesisException(e5);
        }
    }
}
