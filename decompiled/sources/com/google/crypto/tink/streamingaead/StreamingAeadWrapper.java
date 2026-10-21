package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.StreamingAead;
import java.security.GeneralSecurityException;
import lf.d;

/* JADX INFO: loaded from: classes10.dex */
public class StreamingAeadWrapper implements PrimitiveWrapper<StreamingAead, StreamingAead> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StreamingAeadWrapper f47371a = new StreamingAeadWrapper();

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(f47371a);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<StreamingAead> getInputPrimitiveClass() {
        return StreamingAead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<StreamingAead> getPrimitiveClass() {
        return StreamingAead.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public StreamingAead wrap(PrimitiveSet<StreamingAead> primitiveSet) throws GeneralSecurityException {
        d dVar = new d();
        if (primitiveSet.getPrimary() == null) {
            throw new GeneralSecurityException("Missing primary primitive.");
        }
        dVar.f83209a = primitiveSet;
        return dVar;
    }
}
