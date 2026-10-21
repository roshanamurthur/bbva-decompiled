package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PrimitiveFactory<PrimitiveT, KeyProtoT extends MessageLite> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<PrimitiveT> f46671a;

    public PrimitiveFactory(Class<PrimitiveT> cls) {
        this.f46671a = cls;
    }

    public abstract PrimitiveT getPrimitive(KeyProtoT keyprotot) throws GeneralSecurityException;
}
