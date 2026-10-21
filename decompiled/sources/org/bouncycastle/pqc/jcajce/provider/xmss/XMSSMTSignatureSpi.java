package org.bouncycastle.pqc.jcajce.provider.xmss;

import cn.a;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner;
import org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSMTSignatureSpi extends Signature implements StateAwareSignature {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Digest f91536p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final XMSSMTSigner f91537q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1ObjectIdentifier f91538r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SecureRandom f91539s0;

    public static class generic extends XMSSMTSignatureSpi {
        public generic() {
            super("XMSSMT", new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withSha256 extends XMSSMTSignatureSpi {
        public withSha256() {
            super("XMSSMT-SHA256", new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withSha256andPrehash extends XMSSMTSignatureSpi {
        public withSha256andPrehash() {
            super("SHA256withXMSSMT-SHA256", new SHA256Digest(), new XMSSMTSigner());
        }
    }

    public static class withSha512 extends XMSSMTSignatureSpi {
        public withSha512() {
            super("XMSSMT-SHA512", new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withSha512andPrehash extends XMSSMTSignatureSpi {
        public withSha512andPrehash() {
            super("SHA512withXMSSMT-SHA512", new SHA512Digest(), new XMSSMTSigner());
        }
    }

    public static class withShake128 extends XMSSMTSignatureSpi {
        public withShake128() {
            super("XMSSMT-SHAKE128", new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withShake128andPrehash extends XMSSMTSignatureSpi {
        public withShake128andPrehash() {
            super("SHAKE128withXMSSMT-SHAKE128", new SHAKEDigest(128), new XMSSMTSigner());
        }
    }

    public static class withShake256 extends XMSSMTSignatureSpi {
        public withShake256() {
            super("XMSSMT-SHAKE256", new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withShake256andPrehash extends XMSSMTSignatureSpi {
        public withShake256andPrehash() {
            super("SHAKE256withXMSSMT-SHAKE256", new SHAKEDigest(256), new XMSSMTSigner());
        }
    }

    public XMSSMTSignatureSpi(String str) {
        super(str);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCXMSSMTPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to XMSSMT");
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey) privateKey;
        CipherParameters parametersWithRandom = bCXMSSMTPrivateKey.f91517q0;
        this.f91538r0 = bCXMSSMTPrivateKey.f91516p0;
        SecureRandom secureRandom = this.f91539s0;
        if (secureRandom != null) {
            parametersWithRandom = new ParametersWithRandom(parametersWithRandom, secureRandom);
        }
        this.f91536p0.reset();
        this.f91537q0.init(true, parametersWithRandom);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCXMSSMTPublicKey)) {
            throw new InvalidKeyException("unknown public key passed to XMSSMT");
        }
        XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = ((BCXMSSMTPublicKey) publicKey).f91520q0;
        this.f91538r0 = null;
        this.f91536p0.reset();
        this.f91537q0.init(false, xMSSMTPublicKeyParameters);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.f91537q0.generateSignature(a.b(this.f91536p0));
        } catch (Exception e5) {
            if (e5 instanceof IllegalStateException) {
                throw new SignatureException(e5.getMessage(), e5);
            }
            throw new SignatureException(e5.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f91536p0.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.f91537q0.verifySignature(a.b(this.f91536p0), bArr);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public PrivateKey getUpdatedPrivateKey() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f91538r0;
        if (aSN1ObjectIdentifier == null) {
            throw new IllegalStateException("signature object not in a signing state");
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = new BCXMSSMTPrivateKey(aSN1ObjectIdentifier, (XMSSMTPrivateKeyParameters) this.f91537q0.getUpdatedPrivateKey());
        this.f91538r0 = null;
        return bCXMSSMTPrivateKey;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public boolean isSigningCapable() {
        return (this.f91538r0 == null || this.f91537q0.getUsagesRemaining() == 0) ? false : true;
    }

    public XMSSMTSignatureSpi(String str, Digest digest, XMSSMTSigner xMSSMTSigner) {
        super(str);
        this.f91536p0 = digest;
        this.f91537q0 = xMSSMTSigner;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f91536p0.update(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f91539s0 = secureRandom;
        engineInitSign(privateKey);
    }
}
