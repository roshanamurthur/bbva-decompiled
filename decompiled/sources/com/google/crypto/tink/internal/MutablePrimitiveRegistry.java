package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MutablePrimitiveRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MutablePrimitiveRegistry f46658b = new MutablePrimitiveRegistry();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<PrimitiveRegistry> f46659a = new AtomicReference<>(new PrimitiveRegistry(new PrimitiveRegistry.Builder()));

    public static MutablePrimitiveRegistry globalInstance() {
        return f46658b;
    }

    public static void resetGlobalInstanceTestOnly() {
        f46658b = new MutablePrimitiveRegistry();
    }

    public <WrapperPrimitiveT> Class<?> getInputPrimitiveClass(Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return this.f46659a.get().getInputPrimitiveClass(cls);
    }

    public <KeyT extends Key, PrimitiveT> PrimitiveT getPrimitive(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.f46659a.get().getPrimitive(keyt, cls);
    }

    public synchronized <KeyT extends Key, PrimitiveT> void registerPrimitiveConstructor(PrimitiveConstructor<KeyT, PrimitiveT> primitiveConstructor) throws GeneralSecurityException {
        PrimitiveRegistry.Builder builderRegisterPrimitiveConstructor = new PrimitiveRegistry.Builder(this.f46659a.get()).registerPrimitiveConstructor(primitiveConstructor);
        builderRegisterPrimitiveConstructor.getClass();
        this.f46659a.set(new PrimitiveRegistry(builderRegisterPrimitiveConstructor));
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void registerPrimitiveWrapper(PrimitiveWrapper<InputPrimitiveT, WrapperPrimitiveT> primitiveWrapper) throws GeneralSecurityException {
        PrimitiveRegistry.Builder builderRegisterPrimitiveWrapper = new PrimitiveRegistry.Builder(this.f46659a.get()).registerPrimitiveWrapper(primitiveWrapper);
        builderRegisterPrimitiveWrapper.getClass();
        this.f46659a.set(new PrimitiveRegistry(builderRegisterPrimitiveWrapper));
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT wrap(PrimitiveSet<InputPrimitiveT> primitiveSet, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return (WrapperPrimitiveT) this.f46659a.get().wrap(primitiveSet, cls);
    }
}
