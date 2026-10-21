package org.objenesis.instantiator.sun;

import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;
import org.objenesis.instantiator.basic.DelegatingToExoticInstantiator;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.STANDARD)
public class MagicInstantiator<T> extends DelegatingToExoticInstantiator<T> {
    public MagicInstantiator(Class<T> cls) {
        super("org.objenesis.instantiator.exotic.MagicInstantiator", cls);
    }
}
