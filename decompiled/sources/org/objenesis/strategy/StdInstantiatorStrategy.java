package org.objenesis.strategy;

import java.io.Serializable;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.android.Android10Instantiator;
import org.objenesis.instantiator.android.Android17Instantiator;
import org.objenesis.instantiator.android.Android18Instantiator;
import org.objenesis.instantiator.basic.AccessibleInstantiator;
import org.objenesis.instantiator.basic.ObjectInputStreamInstantiator;
import org.objenesis.instantiator.gcj.GCJInstantiator;
import org.objenesis.instantiator.perc.PercInstantiator;
import org.objenesis.instantiator.sun.SunReflectionFactoryInstantiator;
import org.objenesis.instantiator.sun.UnsafeFactoryInstantiator;

/* JADX INFO: loaded from: classes13.dex */
public class StdInstantiatorStrategy extends BaseInstantiatorStrategy {
    @Override // org.objenesis.strategy.InstantiatorStrategy
    public <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> cls) {
        if (PlatformDescription.isThisJVM("Java HotSpot") || PlatformDescription.isThisJVM(PlatformDescription.OPENJDK)) {
            if (PlatformDescription.isGoogleAppEngine() && PlatformDescription.SPECIFICATION_VERSION.equals("1.7")) {
                return Serializable.class.isAssignableFrom(cls) ? new ObjectInputStreamInstantiator(cls) : new AccessibleInstantiator(cls);
            }
            return new SunReflectionFactoryInstantiator(cls);
        }
        if (!PlatformDescription.isThisJVM(PlatformDescription.DALVIK)) {
            if (PlatformDescription.isThisJVM(PlatformDescription.GNU)) {
                return new GCJInstantiator(cls);
            }
            return PlatformDescription.isThisJVM(PlatformDescription.PERC) ? new PercInstantiator(cls) : new UnsafeFactoryInstantiator(cls);
        }
        if (PlatformDescription.isAndroidOpenJDK()) {
            return new UnsafeFactoryInstantiator(cls);
        }
        int i10 = PlatformDescription.ANDROID_VERSION;
        if (i10 <= 10) {
            return new Android10Instantiator(cls);
        }
        return i10 <= 17 ? new Android17Instantiator(cls) : new Android18Instantiator(cls);
    }
}
