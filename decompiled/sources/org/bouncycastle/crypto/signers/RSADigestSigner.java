package org.bouncycastle.crypto.signers;

import androidx.camera.core.impl.a;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RSADigestSigner implements Signer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Hashtable f89589e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PKCS1Encoding f89590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AlgorithmIdentifier f89591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Digest f89592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89593d;

    static {
        Hashtable hashtable = new Hashtable();
        f89589e = hashtable;
        hashtable.put("RIPEMD128", TeleTrusTObjectIdentifiers.ripemd128);
        hashtable.put("RIPEMD160", TeleTrusTObjectIdentifiers.ripemd160);
        hashtable.put("RIPEMD256", TeleTrusTObjectIdentifiers.ripemd256);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, X509ObjectIdentifiers.id_SHA1);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, NISTObjectIdentifiers.id_sha224);
        hashtable.put("SHA-256", NISTObjectIdentifiers.id_sha256);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, NISTObjectIdentifiers.id_sha384);
        hashtable.put("SHA-512", NISTObjectIdentifiers.id_sha512);
        hashtable.put("SHA-512/224", NISTObjectIdentifiers.id_sha512_224);
        hashtable.put(SPHINCSKeyParameters.SHA512_256, NISTObjectIdentifiers.id_sha512_256);
        hashtable.put("SHA3-224", NISTObjectIdentifiers.id_sha3_224);
        hashtable.put("SHA3-256", NISTObjectIdentifiers.id_sha3_256);
        hashtable.put("SHA3-384", NISTObjectIdentifiers.id_sha3_384);
        hashtable.put("SHA3-512", NISTObjectIdentifiers.id_sha3_512);
        hashtable.put("MD2", PKCSObjectIdentifiers.md2);
        hashtable.put("MD4", PKCSObjectIdentifiers.md4);
        hashtable.put("MD5", PKCSObjectIdentifiers.md5);
    }

    public RSADigestSigner(Digest digest) {
        this(digest, (ASN1ObjectIdentifier) f89589e.get(digest.getAlgorithmName()));
    }

    public final byte[] a(byte[] bArr) throws IOException {
        AlgorithmIdentifier algorithmIdentifier = this.f89591b;
        if (algorithmIdentifier != null) {
            return new DigestInfo(algorithmIdentifier, bArr).getEncoded(ASN1Encoding.DER);
        }
        try {
            DigestInfo.getInstance(bArr);
            return bArr;
        } catch (IllegalArgumentException e5) {
            throw new IOException("malformed DigestInfo for NONEwithRSA hash: " + e5.getMessage());
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        if (!this.f89593d) {
            throw new IllegalStateException("RSADigestSigner not initialised for signature generation.");
        }
        Digest digest = this.f89592c;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        try {
            byte[] bArrA = a(bArr);
            return this.f89590a.processBlock(bArrA, 0, bArrA.length);
        } catch (IOException e5) {
            throw new CryptoException(a.d(e5, new StringBuilder("unable to encode signature: ")), e5);
        }
    }

    public String getAlgorithmName() {
        return this.f89592c.getAlgorithmName() + "withRSA";
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f89593d = z10;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z10 && !asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("signing requires private key");
        }
        if (!z10 && asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("verification requires public key");
        }
        reset();
        this.f89590a.init(z10, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89592c.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f89592c.update(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.f89593d) {
            throw new IllegalStateException("RSADigestSigner not initialised for verification");
        }
        Digest digest = this.f89592c;
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        digest.doFinal(bArr2, 0);
        try {
            byte[] bArrProcessBlock = this.f89590a.processBlock(bArr, 0, bArr.length);
            byte[] bArrA = a(bArr2);
            if (bArrProcessBlock.length == bArrA.length) {
                return Arrays.constantTimeAreEqual(bArrProcessBlock, bArrA);
            }
            if (bArrProcessBlock.length != bArrA.length - 2) {
                Arrays.constantTimeAreEqual(bArrA, bArrA);
                return false;
            }
            int length = (bArrProcessBlock.length - digestSize) - 2;
            int length2 = (bArrA.length - digestSize) - 2;
            bArrA[1] = (byte) (bArrA[1] - 2);
            bArrA[3] = (byte) (bArrA[3] - 2);
            int i10 = 0;
            for (int i11 = 0; i11 < digestSize; i11++) {
                i10 |= bArrProcessBlock[length + i11] ^ bArrA[length2 + i11];
            }
            for (int i12 = 0; i12 < length; i12++) {
                i10 |= bArrProcessBlock[i12] ^ bArrA[i12];
            }
            return i10 == 0;
        } catch (Exception unused) {
        }
    }

    public RSADigestSigner(Digest digest, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f89590a = new PKCS1Encoding(new RSABlindedEngine());
        this.f89592c = digest;
        this.f89591b = aSN1ObjectIdentifier != null ? new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE) : null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f89592c.update(bArr, i10, i11);
    }
}
