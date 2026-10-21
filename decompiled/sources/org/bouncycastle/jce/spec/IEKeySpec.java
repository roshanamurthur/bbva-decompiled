package org.bouncycastle.jce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.IESKey;

/* JADX INFO: loaded from: classes8.dex */
public class IEKeySpec implements KeySpec, IESKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PublicKey f90549p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PrivateKey f90550q0;

    public IEKeySpec(PrivateKey privateKey, PublicKey publicKey) {
        this.f90550q0 = privateKey;
        this.f90549p0 = publicKey;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "IES";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    @Override // org.bouncycastle.jce.interfaces.IESKey
    public PrivateKey getPrivate() {
        return this.f90550q0;
    }

    @Override // org.bouncycastle.jce.interfaces.IESKey
    public PublicKey getPublic() {
        return this.f90549p0;
    }
}
