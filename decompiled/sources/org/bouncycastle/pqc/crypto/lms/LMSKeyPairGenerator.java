package org.bouncycastle.pqc.crypto.lms;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import um.e;

/* JADX INFO: loaded from: classes13.dex */
public class LMSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LMSKeyGenerationParameters f91100a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        SecureRandom random = this.f91100a.getRandom();
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        byte[] bArr2 = new byte[32];
        random.nextBytes(bArr2);
        LMSPrivateKeyParameters lMSPrivateKeyParametersA = e.a(this.f91100a.getParameters().getLMSigParam(), this.f91100a.getParameters().getLMOTSParam(), 0, bArr, bArr2);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) lMSPrivateKeyParametersA.getPublicKey(), (AsymmetricKeyParameter) lMSPrivateKeyParametersA);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f91100a = (LMSKeyGenerationParameters) keyGenerationParameters;
    }
}
