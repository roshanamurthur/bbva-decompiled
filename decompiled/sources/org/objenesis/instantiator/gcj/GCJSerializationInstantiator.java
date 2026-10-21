package org.objenesis.instantiator.gcj;

import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.SerializationInstantiatorHelper;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.SERIALIZATION)
public class GCJSerializationInstantiator<T> extends GCJInstantiatorBase<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<? super T> f92527c;

    public GCJSerializationInstantiator(Class<T> cls) {
        super(cls);
        this.f92527c = SerializationInstantiatorHelper.getNonSerializableSuperClass(cls);
    }

    @Override // org.objenesis.instantiator.gcj.GCJInstantiatorBase, org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(GCJInstantiatorBase.f92525a.invoke(GCJInstantiatorBase.f92526b, cls, this.f92527c));
        } catch (Exception e5) {
            throw new ObjenesisException(e5);
        }
    }
}
