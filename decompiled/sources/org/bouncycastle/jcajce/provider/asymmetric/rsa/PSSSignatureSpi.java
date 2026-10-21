package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class PSSSignatureSpi extends SignatureSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BCJcaJceHelper f90005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlgorithmParameters f90006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PSSParameterSpec f90007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PSSParameterSpec f90008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AsymmetricBlockCipher f90009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Digest f90010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Digest f90011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f90012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f90013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f90014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RSAKeyParameters f90015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SecureRandom f90016l;
    public PSSSigner m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f90017n;

    public static class PSSwithRSA extends PSSSignatureSpi {
        public PSSwithRSA() {
            super(new RSABlindedEngine(), null);
        }
    }

    public static class SHA1withRSA extends PSSSignatureSpi {
        public SHA1withRSA() {
            super(new RSABlindedEngine(), PSSParameterSpec.DEFAULT);
        }
    }

    public static class SHA224withRSA extends PSSSignatureSpi {
        public SHA224withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224), 28, 1));
        }
    }

    public static class SHA256withRSA extends PSSSignatureSpi {
        public SHA256withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    public static class SHA384withRSA extends PSSSignatureSpi {
        public SHA384withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384), 48, 1));
        }
    }

    public static class SHA3_224withRSA extends PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    public static class SHA3_256withRSA extends PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), 32, 1));
        }
    }

    public static class SHA3_384withRSA extends PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    public static class SHA3_512withRSA extends PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    public static class SHA512_224withRSA extends PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-512(224)", "MGF1", new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    public static class SHA512_256withRSA extends PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    public static class SHA512withRSA extends PSSSignatureSpi {
        public SHA512withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    public class a implements Digest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ByteArrayOutputStream f90018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Digest f90019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f90020c;

        @Override // org.bouncycastle.crypto.Digest
        public final int doFinal(byte[] bArr, int i10) {
            byte[] byteArray = this.f90018a.toByteArray();
            if (this.f90020c) {
                System.arraycopy(byteArray, 0, bArr, i10, byteArray.length);
            } else {
                int length = byteArray.length;
                Digest digest = this.f90019b;
                digest.update(byteArray, 0, length);
                digest.doFinal(bArr, i10);
            }
            reset();
            this.f90020c = !this.f90020c;
            return byteArray.length;
        }

        @Override // org.bouncycastle.crypto.Digest
        public final String getAlgorithmName() {
            return VDVideoSelfieConfiguration.NULL;
        }

        @Override // org.bouncycastle.crypto.Digest
        public final int getDigestSize() {
            return this.f90019b.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.Digest
        public final void reset() {
            this.f90018a.reset();
            this.f90019b.reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public final void update(byte b10) {
            this.f90018a.write(b10);
        }

        @Override // org.bouncycastle.crypto.Digest
        public final void update(byte[] bArr, int i10, int i11) {
            this.f90018a.write(bArr, i10, i11);
        }
    }

    public static class nonePSS extends PSSSignatureSpi {
        public nonePSS() {
            super(new RSABlindedEngine(), null, true);
        }
    }

    public PSSSignatureSpi(AsymmetricBlockCipher asymmetricBlockCipher, PSSParameterSpec pSSParameterSpec) {
        this(asymmetricBlockCipher, pSSParameterSpec, false);
    }

    public final void a() {
        Digest digest;
        if (this.f90014j) {
            Digest digest2 = this.f90011g;
            a aVar = new a();
            aVar.f90018a = new ByteArrayOutputStream();
            aVar.f90020c = true;
            aVar.f90019b = digest2;
            digest = aVar;
        } else {
            digest = this.f90011g;
        }
        this.f90010f = digest;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.f90006b == null && this.f90007c != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.f90005a.createAlgorithmParameters("PSS");
                this.f90006b = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.f90007c);
            } catch (Exception e5) {
                throw new RuntimeException(e5.toString());
            }
        }
        return this.f90006b;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.f90015k = RSAUtil.a((RSAPrivateKey) privateKey);
        PSSSigner pSSSigner = new PSSSigner(this.f90009e, this.f90010f, this.f90011g, this.f90012h, this.f90013i);
        this.m = pSSSigner;
        SecureRandom secureRandom = this.f90016l;
        if (secureRandom != null) {
            pSSSigner.init(true, new ParametersWithRandom(this.f90015k, secureRandom));
        } else {
            pSSSigner.init(true, this.f90015k);
        }
        this.f90017n = true;
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
        }
        this.f90015k = RSAUtil.b((RSAPublicKey) publicKey);
        PSSSigner pSSSigner = new PSSSigner(this.f90009e, this.f90010f, this.f90011g, this.f90012h, this.f90013i);
        this.m = pSSSigner;
        pSSSigner.init(false, this.f90015k);
        this.f90017n = true;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        this.f90017n = true;
        try {
            return this.m.generateSignature();
        } catch (CryptoException e5) {
            throw new SignatureException(e5.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.m.update(b10);
        this.f90017n = false;
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        this.f90017n = true;
        return this.m.verifySignature(bArr);
    }

    public PSSSignatureSpi(AsymmetricBlockCipher asymmetricBlockCipher, PSSParameterSpec pSSParameterSpec, boolean z10) {
        this.f90005a = new BCJcaJceHelper();
        this.f90017n = true;
        this.f90009e = asymmetricBlockCipher;
        this.f90008d = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.f90007c = PSSParameterSpec.DEFAULT;
        } else {
            this.f90007c = pSSParameterSpec;
        }
        this.f90011g = DigestFactory.getDigest(this.f90007c.getDigestAlgorithm());
        this.f90012h = this.f90007c.getSaltLength();
        if (this.f90007c.getTrailerField() != 1) {
            throw new IllegalArgumentException("unknown trailer field");
        }
        this.f90013i = (byte) -68;
        this.f90014j = z10;
        a();
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f90016l = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        PSSSigner pSSSigner;
        PSSParameterSpec pSSParameterSpec = this.f90008d;
        if (algorithmParameterSpec == null) {
            if (pSSParameterSpec == null) {
                return;
            } else {
                algorithmParameterSpec = pSSParameterSpec;
            }
        }
        if (!this.f90017n) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
        }
        PSSParameterSpec pSSParameterSpec2 = (PSSParameterSpec) algorithmParameterSpec;
        if (pSSParameterSpec != null && !DigestFactory.isSameDigest(pSSParameterSpec.getDigestAlgorithm(), pSSParameterSpec2.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("parameter must be using " + pSSParameterSpec.getDigestAlgorithm());
        }
        if (!pSSParameterSpec2.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !pSSParameterSpec2.getMGFAlgorithm().equals(PKCSObjectIdentifiers.id_mgf1.getId())) {
            throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
        }
        if (!(pSSParameterSpec2.getMGFParameters() instanceof MGF1ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown MGF parameters");
        }
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec2.getMGFParameters();
        if (!DigestFactory.isSameDigest(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec2.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
        }
        Digest digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest == null) {
            throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        this.f90006b = null;
        this.f90007c = pSSParameterSpec2;
        this.f90011g = digest;
        this.f90012h = pSSParameterSpec2.getSaltLength();
        boolean z10 = true;
        if (this.f90007c.getTrailerField() != 1) {
            throw new IllegalArgumentException("unknown trailer field");
        }
        this.f90013i = (byte) -68;
        a();
        if (this.f90015k != null) {
            this.m = new PSSSigner(this.f90009e, this.f90010f, this.f90011g, this.f90012h, this.f90013i);
            if (this.f90015k.isPrivate()) {
                pSSSigner = this.m;
            } else {
                pSSSigner = this.m;
                z10 = false;
            }
            pSSSigner.init(z10, this.f90015k);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.m.update(bArr, i10, i11);
        this.f90017n = false;
    }
}
