package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PrimitiveConstructor<KeyT extends Key, PrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<KeyT> f46668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<PrimitiveT> f46669b;

    public interface PrimitiveConstructionFunction<KeyT extends Key, PrimitiveT> {
        PrimitiveT constructPrimitive(KeyT keyt) throws GeneralSecurityException;
    }

    public class a extends PrimitiveConstructor<KeyT, PrimitiveT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PrimitiveConstructionFunction f46670c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PrimitiveConstructionFunction primitiveConstructionFunction, Class cls, Class cls2) {
            super(cls, cls2);
            this.f46670c = primitiveConstructionFunction;
        }

        @Override // com.google.crypto.tink.internal.PrimitiveConstructor
        public final PrimitiveT constructPrimitive(KeyT keyt) throws GeneralSecurityException {
            return (PrimitiveT) this.f46670c.constructPrimitive(keyt);
        }
    }

    public PrimitiveConstructor() {
        throw null;
    }

    public PrimitiveConstructor(Class cls, Class cls2) {
        this.f46668a = cls;
        this.f46669b = cls2;
    }

    public static <KeyT extends Key, PrimitiveT> PrimitiveConstructor<KeyT, PrimitiveT> create(PrimitiveConstructionFunction<KeyT, PrimitiveT> primitiveConstructionFunction, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(primitiveConstructionFunction, cls, cls2);
    }

    public abstract PrimitiveT constructPrimitive(KeyT keyt) throws GeneralSecurityException;

    public Class<KeyT> getKeyClass() {
        return this.f46668a;
    }

    public Class<PrimitiveT> getPrimitiveClass() {
        return this.f46669b;
    }
}
