package org.objenesis.instantiator.basic;

import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.STANDARD)
public class ProxyingInstantiator<T> extends DelegatingToExoticInstantiator<T> {
    public ProxyingInstantiator(Class<T> cls) {
        super("org.objenesis.instantiator.exotic.ProxyingInstantiator", cls);
    }
}
