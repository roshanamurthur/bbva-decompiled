package org.objenesis.instantiator.basic;

import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;
import org.objenesis.instantiator.util.ClassUtils;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.NOT_COMPLIANT)
public class NewInstanceInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f92515a;

    public NewInstanceInstantiator(Class<T> cls) {
        this.f92515a = cls;
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        return (T) ClassUtils.newInstance(this.f92515a);
    }
}
