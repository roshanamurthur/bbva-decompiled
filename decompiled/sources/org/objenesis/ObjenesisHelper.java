package org.objenesis;

import java.io.Serializable;
import org.objenesis.instantiator.ObjectInstantiator;

/* JADX INFO: loaded from: classes13.dex */
public final class ObjenesisHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ObjenesisStd f92501a = new ObjenesisStd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ObjenesisSerializer f92502b = new ObjenesisSerializer();

    public static <T> ObjectInstantiator<T> getInstantiatorOf(Class<T> cls) {
        return f92501a.getInstantiatorOf(cls);
    }

    public static <T extends Serializable> ObjectInstantiator<T> getSerializableObjectInstantiatorOf(Class<T> cls) {
        return f92502b.getInstantiatorOf(cls);
    }

    public static <T> T newInstance(Class<T> cls) {
        return (T) f92501a.newInstance(cls);
    }

    public static <T extends Serializable> T newSerializableInstance(Class<T> cls) {
        return (T) f92502b.newInstance(cls);
    }
}
