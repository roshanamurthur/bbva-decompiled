package com.google.crypto.tink.internal;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
@Alpha
public abstract class PrivateKeyTypeManager<KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> extends KeyTypeManager<KeyProtoT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<PublicKeyProtoT> f46678d;

    @SafeVarargs
    public PrivateKeyTypeManager(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, PrimitiveFactory<?, KeyProtoT>... primitiveFactoryArr) {
        super(cls, primitiveFactoryArr);
        this.f46678d = cls2;
    }

    public abstract PublicKeyProtoT getPublicKey(KeyProtoT keyprotot) throws GeneralSecurityException;

    public final Class<PublicKeyProtoT> getPublicKeyClass() {
        return this.f46678d;
    }
}
