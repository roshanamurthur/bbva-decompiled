package org.objenesis.strategy;

import java.io.NotSerializableException;
import java.io.Serializable;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.android.AndroidSerializationInstantiator;
import org.objenesis.instantiator.basic.ObjectInputStreamInstantiator;
import org.objenesis.instantiator.basic.ObjectStreamClassInstantiator;
import org.objenesis.instantiator.gcj.GCJSerializationInstantiator;
import org.objenesis.instantiator.perc.PercSerializationInstantiator;
import org.objenesis.instantiator.sun.SunReflectionFactorySerializationInstantiator;

/* JADX INFO: loaded from: classes13.dex */
public class SerializingInstantiatorStrategy extends BaseInstantiatorStrategy {
    @Override // org.objenesis.strategy.InstantiatorStrategy
    public <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> cls) {
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new ObjenesisException(new NotSerializableException(cls + " not serializable"));
        }
        String str = PlatformDescription.JVM_NAME;
        if (str.startsWith("Java HotSpot") || PlatformDescription.isThisJVM(PlatformDescription.OPENJDK)) {
            return (PlatformDescription.isGoogleAppEngine() && PlatformDescription.SPECIFICATION_VERSION.equals("1.7")) ? new ObjectInputStreamInstantiator(cls) : new SunReflectionFactorySerializationInstantiator(cls);
        }
        if (str.startsWith(PlatformDescription.DALVIK)) {
            return PlatformDescription.isAndroidOpenJDK() ? new ObjectStreamClassInstantiator(cls) : new AndroidSerializationInstantiator(cls);
        }
        if (str.startsWith(PlatformDescription.GNU)) {
            return new GCJSerializationInstantiator(cls);
        }
        return str.startsWith(PlatformDescription.PERC) ? new PercSerializationInstantiator(cls) : new SunReflectionFactorySerializationInstantiator(cls);
    }
}
