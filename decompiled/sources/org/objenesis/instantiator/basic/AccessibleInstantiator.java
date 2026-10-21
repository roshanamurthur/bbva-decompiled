package org.objenesis.instantiator.basic;

import java.lang.reflect.Constructor;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.NOT_COMPLIANT)
public class AccessibleInstantiator<T> extends ConstructorInstantiator<T> {
    public AccessibleInstantiator(Class<T> cls) {
        super(cls);
        Constructor<T> constructor = this.constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
    }
}
