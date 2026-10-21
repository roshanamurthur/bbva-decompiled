package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.agreement.ECVKOAgreement;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes8.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f89885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ECDomainParameters f89886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ECVKOAgreement f89887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f89888h;

    public static class ECVKO extends KeyAgreementSpi {
        public ECVKO() {
            super("ECGOST3410", new ECVKOAgreement(new GOST3411Digest()), null);
        }
    }

    public class a extends InvalidKeyException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Exception f89889p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Exception exc) {
            super(str);
            this.f89889p0 = exc;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.f89889p0;
        }
    }

    static {
        new X9IntegerConverter();
    }

    public KeyAgreementSpi(String str, ECVKOAgreement eCVKOAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.f89885e = str;
        this.f89887g = eCVKOAgreement;
    }

    public final void b(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        if (key instanceof PrivateKey) {
            ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            this.f89886f = eCPrivateKeyParameters.getParameters();
            byte[] userKeyingMaterial = algorithmParameterSpec instanceof UserKeyingMaterialSpec ? ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial() : null;
            this.ukmParameters = userKeyingMaterial;
            this.f89887g.init(new ParametersWithUKM(eCPrivateKeyParameters, userKeyingMaterial));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f89885e);
        sb2.append(" key agreement requires ");
        String name = ECPrivateKey.class.getName();
        sb2.append(name.substring(name.lastIndexOf(46) + 1));
        sb2.append(" for initialisation");
        throw new InvalidKeyException(sb2.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return this.f89888h;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z10) throws IllegalStateException, InvalidKeyException {
        ECDomainParameters eCDomainParameters = this.f89886f;
        String str = this.f89885e;
        if (eCDomainParameters == null) {
            throw new IllegalStateException(u.f(str, " not initialised."));
        }
        if (!z10) {
            throw new IllegalStateException(u.f(str, " can only be between two parties."));
        }
        if (key instanceof PublicKey) {
            PublicKey publicKey = (PublicKey) key;
            try {
                this.f89888h = this.f89887g.calculateAgreement(publicKey instanceof BCECPublicKey ? ((BCECGOST3410PublicKey) publicKey).f89882r0 : ECUtil.generatePublicKeyParameter(publicKey));
                return null;
            } catch (Exception e5) {
                throw new a(ci.a.b(e5, new StringBuilder("calculation failed: ")), e5);
            }
        }
        StringBuilder sbE = f.e(str, " key agreement requires ");
        String name = ECPublicKey.class.getName();
        sbE.append(name.substring(name.lastIndexOf(46) + 1));
        sbE.append(" for doPhase");
        throw new InvalidKeyException(sbE.toString());
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        b(key, null);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        b(key, algorithmParameterSpec);
    }
}
