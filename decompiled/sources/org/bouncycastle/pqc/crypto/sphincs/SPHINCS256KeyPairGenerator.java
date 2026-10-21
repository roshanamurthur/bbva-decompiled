package org.bouncycastle.pqc.crypto.sphincs;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public class SPHINCS256KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f91257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Digest f91258b;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        b.a aVar = new b.a();
        byte[] bArr = new byte[1088];
        this.f91257a.nextBytes(bArr);
        byte[] bArr2 = new byte[1056];
        System.arraycopy(bArr, 32, bArr2, 0, 1024);
        aVar.f91264a = 11;
        aVar.f91265b = 0L;
        aVar.f91266c = 0L;
        b.b(new xm.a(this.f91258b, null), bArr2, 1024, bArr, aVar, bArr2, 0);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new SPHINCSPublicKeyParameters(bArr2, this.f91258b.getAlgorithmName()), (AsymmetricKeyParameter) new SPHINCSPrivateKeyParameters(bArr, this.f91258b.getAlgorithmName()));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f91257a = keyGenerationParameters.getRandom();
        this.f91258b = ((SPHINCS256KeyGenerationParameters) keyGenerationParameters).getTreeDigest();
    }
}
