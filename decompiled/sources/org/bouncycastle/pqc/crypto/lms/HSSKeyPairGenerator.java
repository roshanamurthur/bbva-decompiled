package org.bouncycastle.pqc.crypto.lms;

import java.util.Arrays;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import um.b;
import um.f;

/* JADX INFO: loaded from: classes13.dex */
public class HSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HSSKeyGenerationParameters f91078a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int i10;
        byte[] bArr;
        HSSKeyGenerationParameters hSSKeyGenerationParameters = this.f91078a;
        int depth = hSSKeyGenerationParameters.getDepth();
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = new LMSPrivateKeyParameters[depth];
        f[] fVarArr = new f[hSSKeyGenerationParameters.getDepth() - 1];
        byte[] bArr2 = new byte[32];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr2);
        byte[] bArr3 = new byte[16];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr3);
        byte[] bArr4 = new byte[0];
        int i11 = 0;
        long h4 = 1;
        while (i11 < depth) {
            if (i11 == 0) {
                i10 = i11;
                lMSPrivateKeyParametersArr[i10] = new LMSPrivateKeyParameters(hSSKeyGenerationParameters.getLmsParameters()[i11].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i11].getLMOTSParam(), 0, bArr3, 1 << hSSKeyGenerationParameters.getLmsParameters()[i11].getLMSigParam().getH(), bArr2);
                bArr = bArr4;
            } else {
                i10 = i11;
                bArr = bArr4;
                lMSPrivateKeyParametersArr[i10] = new b.a(hSSKeyGenerationParameters.getLmsParameters()[i10].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i10].getLMOTSParam(), -1, bArr, 1 << hSSKeyGenerationParameters.getLmsParameters()[i10].getLMSigParam().getH(), bArr);
            }
            h4 *= (long) (1 << hSSKeyGenerationParameters.getLmsParameters()[i10].getLMSigParam().getH());
            i11 = i10 + 1;
            bArr4 = bArr;
        }
        if (h4 == 0) {
            h4 = Long.MAX_VALUE;
        }
        HSSPrivateKeyParameters hSSPrivateKeyParameters = new HSSPrivateKeyParameters(hSSKeyGenerationParameters.getDepth(), Arrays.asList(lMSPrivateKeyParametersArr), Arrays.asList(fVarArr), 0L, h4);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) hSSPrivateKeyParameters.getPublicKey(), (AsymmetricKeyParameter) hSSPrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f91078a = (HSSKeyGenerationParameters) keyGenerationParameters;
    }
}
