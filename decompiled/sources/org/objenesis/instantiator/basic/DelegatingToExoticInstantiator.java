package org.objenesis.instantiator.basic;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import java.lang.reflect.InvocationTargetException;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class DelegatingToExoticInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObjectInstantiator<T> f92514a;

    public DelegatingToExoticInstantiator(String str, Class<T> cls) {
        try {
            try {
                try {
                    this.f92514a = (ObjectInstantiator) Class.forName(str).getConstructor(Class.class).newInstance(cls);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
                    throw new RuntimeException(f.d("Failed to call constructor of ", str), e5);
                }
            } catch (NoSuchMethodException e7) {
                throw new ObjenesisException(h0.b("Try to find constructor taking a Class<T> in parameter on ", str, " but can't find it"), e7);
            }
        } catch (ClassNotFoundException e10) {
            throw new ObjenesisException(getClass().getSimpleName().concat(" now requires objenesis-exotic to be in the classpath"), e10);
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        return this.f92514a.newInstance();
    }
}
