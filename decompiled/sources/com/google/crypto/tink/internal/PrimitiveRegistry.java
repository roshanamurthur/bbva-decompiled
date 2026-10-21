package com.google.crypto.tink.internal;

import androidx.datastore.preferences.protobuf.q;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class PrimitiveRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f46672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f46673b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f46676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f46677b;

        public a() {
            throw null;
        }

        public a(Class cls, Class cls2) {
            this.f46676a = cls;
            this.f46677b = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f46676a.equals(this.f46676a) && aVar.f46677b.equals(this.f46677b);
        }

        public final int hashCode() {
            return Objects.hash(this.f46676a, this.f46677b);
        }

        public final String toString() {
            return this.f46676a.getSimpleName() + " with primitive type: " + this.f46677b.getSimpleName();
        }
    }

    public PrimitiveRegistry(Builder builder) {
        this.f46672a = new HashMap(builder.f46674a);
        this.f46673b = new HashMap(builder.f46675b);
    }

    public Class<?> getInputPrimitiveClass(Class<?> cls) throws GeneralSecurityException {
        HashMap map = this.f46673b;
        if (map.containsKey(cls)) {
            return ((PrimitiveWrapper) map.get(cls)).getInputPrimitiveClass();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public <KeyT extends Key, PrimitiveT> PrimitiveT getPrimitive(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        a aVar = new a(keyt.getClass(), cls);
        HashMap map = this.f46672a;
        if (map.containsKey(aVar)) {
            return (PrimitiveT) ((PrimitiveConstructor) map.get(aVar)).constructPrimitive(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + aVar + " available");
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT wrap(PrimitiveSet<InputPrimitiveT> primitiveSet, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        HashMap map = this.f46673b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException(q.c("No wrapper found for ", cls));
        }
        PrimitiveWrapper primitiveWrapper = (PrimitiveWrapper) map.get(cls);
        if (primitiveSet.getPrimitiveClass().equals(primitiveWrapper.getInputPrimitiveClass()) && primitiveWrapper.getInputPrimitiveClass().equals(primitiveSet.getPrimitiveClass())) {
            return (WrapperPrimitiveT) primitiveWrapper.wrap(primitiveSet);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f46674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f46675b;

        public Builder() {
            this.f46674a = new HashMap();
            this.f46675b = new HashMap();
        }

        @CanIgnoreReturnValue
        public <KeyT extends Key, PrimitiveT> Builder registerPrimitiveConstructor(PrimitiveConstructor<KeyT, PrimitiveT> primitiveConstructor) throws GeneralSecurityException {
            if (primitiveConstructor == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            a aVar = new a(primitiveConstructor.getKeyClass(), primitiveConstructor.getPrimitiveClass());
            HashMap map = this.f46674a;
            if (map.containsKey(aVar)) {
                PrimitiveConstructor primitiveConstructor2 = (PrimitiveConstructor) map.get(aVar);
                if (!primitiveConstructor2.equals(primitiveConstructor) || !primitiveConstructor.equals(primitiveConstructor2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + aVar);
                }
            } else {
                map.put(aVar, primitiveConstructor);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public <InputPrimitiveT, WrapperPrimitiveT> Builder registerPrimitiveWrapper(PrimitiveWrapper<InputPrimitiveT, WrapperPrimitiveT> primitiveWrapper) throws GeneralSecurityException {
            if (primitiveWrapper == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> primitiveClass = primitiveWrapper.getPrimitiveClass();
            HashMap map = this.f46675b;
            if (map.containsKey(primitiveClass)) {
                PrimitiveWrapper primitiveWrapper2 = (PrimitiveWrapper) map.get(primitiveClass);
                if (!primitiveWrapper2.equals(primitiveWrapper) || !primitiveWrapper.equals(primitiveWrapper2)) {
                    throw new GeneralSecurityException(q.c("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type", primitiveClass));
                }
            } else {
                map.put(primitiveClass, primitiveWrapper);
            }
            return this;
        }

        public Builder(PrimitiveRegistry primitiveRegistry) {
            this.f46674a = new HashMap(primitiveRegistry.f46672a);
            this.f46675b = new HashMap(primitiveRegistry.f46673b);
        }
    }
}
