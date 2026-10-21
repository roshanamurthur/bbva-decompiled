package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.b;
import androidx.camera.core.processing.f;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.ISO9796d1Encoding;
import org.bouncycastle.crypto.encodings.OAEPEncoding;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class CipherSpi extends BaseCipherSpi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BCJcaJceHelper f89989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AsymmetricBlockCipher f89990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AlgorithmParameterSpec f89991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlgorithmParameters f89992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f89993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f89994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BaseCipherSpi.ErasableOutputStream f89995h;

    public static class ISO9796d1Padding extends CipherSpi {
        public ISO9796d1Padding() {
            super(new ISO9796d1Encoding(new RSABlindedEngine()));
        }
    }

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new RSABlindedEngine());
        }
    }

    public static class OAEPPadding extends CipherSpi {
        public OAEPPadding() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        this.f89989b = new BCJcaJceHelper();
        this.f89993f = false;
        this.f89994g = false;
        this.f89995h = new BaseCipherSpi.ErasableOutputStream();
        try {
            b(oAEPParameterSpec);
        } catch (NoSuchPaddingException e5) {
            throw new IllegalArgumentException(e5.getMessage());
        }
    }

    public final byte[] a() throws BadPaddingException {
        BaseCipherSpi.ErasableOutputStream erasableOutputStream = this.f89995h;
        try {
            try {
                byte[] bArrProcessBlock = this.f89990c.processBlock(erasableOutputStream.getBuf(), 0, erasableOutputStream.size());
                erasableOutputStream.erase();
                return bArrProcessBlock;
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new BadBlockException("unable to decrypt block", e5);
            } catch (InvalidCipherTextException e7) {
                throw new BadBlockException("unable to decrypt block", e7);
            }
        } catch (Throwable th2) {
            erasableOutputStream.erase();
            throw th2;
        }
    }

    public final void b(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        Digest digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest != null) {
            this.f89990c = new OAEPEncoding(new RSABlindedEngine(), digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.f89991d = oAEPParameterSpec;
        } else {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        if (engineGetOutputSize(i11) + i12 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        BaseCipherSpi.ErasableOutputStream erasableOutputStream = this.f89995h;
        if (bArr != null) {
            erasableOutputStream.write(bArr, i10, i11);
        }
        if (this.f89990c instanceof RSABlindedEngine) {
            if (erasableOutputStream.size() > this.f89990c.getInputBlockSize() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (erasableOutputStream.size() > this.f89990c.getInputBlockSize()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        byte[] bArrA = a();
        for (int i13 = 0; i13 != bArrA.length; i13++) {
            bArr2[i12 + i13] = bArrA[i13];
        }
        return bArrA.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        try {
            return this.f89990c.getInputBlockSize();
        } catch (NullPointerException unused) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        RSAKey rSAKey;
        if (key instanceof RSAPrivateKey) {
            rSAKey = (RSAPrivateKey) key;
        } else {
            if (!(key instanceof RSAPublicKey)) {
                throw new IllegalArgumentException("not an RSA key!");
            }
            rSAKey = (RSAPublicKey) key;
        }
        return rSAKey.getModulus().bitLength();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        try {
            return this.f89990c.getOutputBlockSize();
        } catch (NullPointerException unused) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.f89992e == null && this.f89991d != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.f89989b.createAlgorithmParameters("OAEP");
                this.f89992e = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.f89991d);
            } catch (Exception e5) {
                throw new RuntimeException(e5.toString());
            }
        }
        return this.f89992e;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e5) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e5.toString(), e5);
            }
        } else {
            parameterSpec = null;
        }
        this.f89992e = algorithmParameters;
        engineInit(i10, key, parameterSpec, secureRandom);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals(ExpectedUserActionOnPoiTypes.NONE) || upperCase.equals("ECB")) {
            return;
        }
        if (upperCase.equals("1")) {
            this.f89994g = true;
            this.f89993f = false;
        } else {
            if (!upperCase.equals("2")) {
                throw new NoSuchAlgorithmException(f.d("can't support mode ", str));
            }
            this.f89994g = false;
            this.f89993f = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        OAEPParameterSpec oAEPParameterSpec;
        OAEPParameterSpec oAEPParameterSpec2;
        AsymmetricBlockCipher iSO9796d1Encoding;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            iSO9796d1Encoding = new RSABlindedEngine();
        } else if (upperCase.equals("PKCS1PADDING")) {
            iSO9796d1Encoding = new PKCS1Encoding(new RSABlindedEngine());
        } else {
            if (!upperCase.equals("ISO9796-1PADDING")) {
                if (upperCase.equals("OAEPWITHMD5ANDMGF1PADDING")) {
                    oAEPParameterSpec2 = new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT);
                } else {
                    if (!upperCase.equals("OAEPPADDING")) {
                        if (upperCase.equals("OAEPWITHSHA1ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
                            oAEPParameterSpec = OAEPParameterSpec.DEFAULT;
                        } else if (upperCase.equals("OAEPWITHSHA224ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
                            oAEPParameterSpec = new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224), PSource.PSpecified.DEFAULT);
                        } else if (upperCase.equals("OAEPWITHSHA256ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
                            oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
                        } else if (upperCase.equals("OAEPWITHSHA384ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
                            oAEPParameterSpec = new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT);
                        } else if (upperCase.equals("OAEPWITHSHA512ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
                            oAEPParameterSpec = new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT);
                        } else if (upperCase.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
                            oAEPParameterSpec2 = new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT);
                        } else if (upperCase.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
                            oAEPParameterSpec2 = new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT);
                        } else if (upperCase.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
                            oAEPParameterSpec2 = new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT);
                        } else {
                            if (!upperCase.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                                throw new NoSuchPaddingException(u.f(str, " unavailable with RSA."));
                            }
                            oAEPParameterSpec2 = new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT);
                        }
                        b(oAEPParameterSpec);
                        return;
                    }
                    oAEPParameterSpec2 = OAEPParameterSpec.DEFAULT;
                }
                b(oAEPParameterSpec2);
                return;
            }
            iSO9796d1Encoding = new ISO9796d1Encoding(new RSABlindedEngine());
        }
        this.f89990c = iSO9796d1Encoding;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException {
        BaseCipherSpi.ErasableOutputStream erasableOutputStream = this.f89995h;
        erasableOutputStream.write(bArr, i10, i11);
        if (this.f89990c instanceof RSABlindedEngine) {
            if (erasableOutputStream.size() <= this.f89990c.getInputBlockSize() + 1) {
                return 0;
            }
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        if (erasableOutputStream.size() <= this.f89990c.getInputBlockSize()) {
            return 0;
        }
        throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
    }

    public CipherSpi(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.f89989b = new BCJcaJceHelper();
        this.f89993f = false;
        this.f89994g = false;
        this.f89995h = new BaseCipherSpi.ErasableOutputStream();
        this.f89990c = asymmetricBlockCipher;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException, IOException {
        BaseCipherSpi.ErasableOutputStream erasableOutputStream = this.f89995h;
        if (bArr != null) {
            erasableOutputStream.write(bArr, i10, i11);
        }
        if (this.f89990c instanceof RSABlindedEngine) {
            if (erasableOutputStream.size() > this.f89990c.getInputBlockSize() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (erasableOutputStream.size() > this.f89990c.getInputBlockSize()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return a();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new InvalidKeyException("Eeeek! " + e5.toString(), e5);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) throws IOException {
        BaseCipherSpi.ErasableOutputStream erasableOutputStream = this.f89995h;
        erasableOutputStream.write(bArr, i10, i11);
        if (this.f89990c instanceof RSABlindedEngine) {
            if (erasableOutputStream.size() <= this.f89990c.getInputBlockSize() + 1) {
                return null;
            }
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        if (erasableOutputStream.size() <= this.f89990c.getInputBlockSize()) {
            return null;
        }
        throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
    }

    public CipherSpi(boolean z10, boolean z11, AsymmetricBlockCipher asymmetricBlockCipher) {
        this.f89989b = new BCJcaJceHelper();
        this.f89993f = false;
        this.f89994g = false;
        this.f89995h = new BaseCipherSpi.ErasableOutputStream();
        this.f89993f = z10;
        this.f89994g = z11;
        this.f89990c = asymmetricBlockCipher;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters cipherParametersA;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        if (key instanceof RSAPublicKey) {
            if (this.f89994g && i10 == 1) {
                throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
            }
            cipherParametersA = RSAUtil.b((RSAPublicKey) key);
        } else {
            if (!(key instanceof RSAPrivateKey)) {
                throw new InvalidKeyException("unknown key type passed to RSA");
            }
            if (this.f89993f && i10 == 1) {
                throw new InvalidKeyException("mode 2 requires RSAPublicKey");
            }
            cipherParametersA = RSAUtil.a((RSAPrivateKey) key);
        }
        if (algorithmParameterSpec != null) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.f89991d = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.id_mgf1.getId())) {
                throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unkown MGF parameters");
            }
            Digest digest = DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
            if (digest == null) {
                throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            Digest digest2 = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
            if (digest2 == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.f89990c = new OAEPEncoding(new RSABlindedEngine(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        }
        if (!(this.f89990c instanceof RSABlindedEngine)) {
            cipherParametersA = secureRandom != null ? new ParametersWithRandom(cipherParametersA, secureRandom) : new ParametersWithRandom(cipherParametersA, CryptoServicesRegistrar.getSecureRandom());
        }
        this.f89995h.reset();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new InvalidParameterException(b.a("unknown opmode ", i10, " passed to RSA"));
                    }
                }
            }
            this.f89990c.init(false, cipherParametersA);
            return;
        }
        this.f89990c.init(true, cipherParametersA);
    }
}
