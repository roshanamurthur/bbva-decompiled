package bc.org.bouncycastle.crypto.generators;

import bc.org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import bc.org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import bc.org.bouncycastle.crypto.params.ECDomainParameters;
import bc.org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import bc.org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import bc.org.bouncycastle.crypto.params.ECPublicKeyParameters;
import bc.org.bouncycastle.math.ec.ECConstants;
import bc.org.bouncycastle.math.ec.ECMultiplier;
import bc.org.bouncycastle.math.ec.FixedPointCombMultiplier;
import bc.org.bouncycastle.math.ec.WNafUtil;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.k3;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class ECKeyPairGenerator implements ECConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECDomainParameters f24968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f24969b;

    public ECMultiplier a() {
        return new FixedPointCombMultiplier();
    }

    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger n7 = this.f24968a.getN();
        int iBitLength = n7.bitLength();
        int i10 = iBitLength >>> 2;
        while (true) {
            BigInteger bigInteger = new BigInteger(iBitLength, this.f24969b);
            if (bigInteger.compareTo(ECConstants.TWO) >= 0 && bigInteger.compareTo(n7) < 0 && WNafUtil.getNafWeight(bigInteger) >= i10) {
                return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new ECPublicKeyParameters(a().multiply(this.f24968a.getG(), bigInteger), this.f24968a), (AsymmetricKeyParameter) new ECPrivateKeyParameters(bigInteger, this.f24968a));
            }
        }
    }

    public void init(k3 k3Var) {
        ECKeyGenerationParameters eCKeyGenerationParameters = (ECKeyGenerationParameters) k3Var;
        this.f24969b = eCKeyGenerationParameters.getRandom();
        this.f24968a = eCKeyGenerationParameters.getDomainParameters();
        if (this.f24969b == null) {
            this.f24969b = new SecureRandom();
        }
    }
}
