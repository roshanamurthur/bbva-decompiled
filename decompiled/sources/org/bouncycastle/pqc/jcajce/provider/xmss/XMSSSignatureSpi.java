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
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSSigner;
import org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSSignatureSpi extends Signature implements StateAwareSignature {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Digest f91540p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final XMSSSigner f91541q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SecureRandom f91542r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1ObjectIdentifier f91543s0;

    public static class generic extends XMSSSignatureSpi {
        public generic() {
            super("XMSS", new NullDigest(), new XMSSSigner());
        }
    }

    public static class withSha256 extends XMSSSignatureSpi {
        public withSha256() {
            super("XMSS-SHA256", new NullDigest(), new XMSSSigner());
        }
    }

    public static class withSha256andPrehash extends XMSSSignatureSpi {
        public withSha256andPrehash() {
            super("SHA256withXMSS-SHA256", new SHA256Digest(), new XMSSSigner());
        }
    }

    public static class withSha512 extends XMSSSignatureSpi {
        public withSha512() {
            super("XMSS-SHA512", new NullDigest(), new XMSSSigner());
        }
    }

    public static class withSha512andPrehash extends XMSSSignatureSpi {
        public withSha512andPrehash() {
            super("SHA512withXMSS-SHA512", new SHA512Digest(), new XMSSSigner());
        }
    }

    public static class withShake128 extends XMSSSignatureSpi {
        public withShake128() {
            super("XMSS-SHAKE128", new NullDigest(), new XMSSSigner());
        }
    }

    public static class withShake128andPrehash extends XMSSSignatureSpi {
        public withShake128andPrehash() {
            super("SHAKE128withXMSSMT-SHAKE128", new SHAKEDigest(128), new XMSSSigner());
        }
    }

    public static class withShake256 extends XMSSSignatureSpi {
        public withShake256() {
            super("XMSS-SHAKE256", new NullDigest(), new XMSSSigner());
        }
    }

    public static class withShake256andPrehash extends XMSSSignatureSpi {
        public withShake256andPrehash() {
            super("SHAKE256withXMSS-SHAKE256", new SHAKEDigest(256), new XMSSSigner());
        }
    }

    public XMSSSignatureSpi(String str) {
        super(str);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCXMSSPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to XMSS");
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) privateKey;
        CipherParameters parametersWithRandom = bCXMSSPrivateKey.f91521p0;
        this.f91543s0 = bCXMSSPrivateKey.f91522q0;
        SecureRandom secureRandom = this.f91542r0;
        if (secureRandom != null) {
            parametersWithRandom = new ParametersWithRandom(parametersWithRandom, secureRandom);
        }
        this.f91540p0.reset();
        this.f91541q0.init(true, parametersWithRandom);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCXMSSPublicKey)) {
            throw new InvalidKeyException("unknown public key passed to XMSS");
        }
        XMSSPublicKeyParameters xMSSPublicKeyParameters = ((BCXMSSPublicKey) publicKey).f91524p0;
        this.f91543s0 = null;
        this.f91540p0.reset();
        this.f91541q0.init(false, xMSSPublicKeyParameters);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.f91541q0.generateSignature(a.b(this.f91540p0));
        } catch (Exception e5) {
            if (e5 instanceof IllegalStateException) {
                throw new SignatureException(e5.getMessage(), e5);
            }
            throw new SignatureException(e5.toString(), e5);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f91540p0.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.f91541q0.verifySignature(a.b(this.f91540p0), bArr);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public PrivateKey getUpdatedPrivateKey() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f91543s0;
        if (aSN1ObjectIdentifier == null) {
            throw new IllegalStateException("signature object not in a signing state");
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = new BCXMSSPrivateKey(aSN1ObjectIdentifier, (XMSSPrivateKeyParameters) this.f91541q0.getUpdatedPrivateKey());
        this.f91543s0 = null;
        return bCXMSSPrivateKey;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public boolean isSigningCapable() {
        return (this.f91543s0 == null || this.f91541q0.getUsagesRemaining() == 0) ? false : true;
    }

    public XMSSSignatureSpi(String str, Digest digest, XMSSSigner xMSSSigner) {
        super(str);
        this.f91540p0 = digest;
        this.f91541q0 = xMSSSigner;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f91540p0.update(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f91542r0 = secureRandom;
        engineInitSign(privateKey);
    }
}
