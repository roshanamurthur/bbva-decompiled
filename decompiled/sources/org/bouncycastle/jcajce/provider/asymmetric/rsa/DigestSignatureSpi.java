package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import ad.d;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.MD4Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.RIPEMD128Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.RIPEMD256Digest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class DigestSignatureSpi extends SignatureSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f89996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsymmetricBlockCipher f89997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AlgorithmIdentifier f89998c;

    public static class MD2 extends DigestSignatureSpi {
        public MD2() {
            super(PKCSObjectIdentifiers.md2, new MD2Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD4 extends DigestSignatureSpi {
        public MD4() {
            super(PKCSObjectIdentifiers.md4, new MD4Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD5 extends DigestSignatureSpi {
        public MD5() {
            super(PKCSObjectIdentifiers.md5, DigestFactory.createMD5(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD128 extends DigestSignatureSpi {
        public RIPEMD128() {
            super(TeleTrusTObjectIdentifiers.ripemd128, new RIPEMD128Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD160 extends DigestSignatureSpi {
        public RIPEMD160() {
            super(TeleTrusTObjectIdentifiers.ripemd160, new RIPEMD160Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD256 extends DigestSignatureSpi {
        public RIPEMD256() {
            super(TeleTrusTObjectIdentifiers.ripemd256, new RIPEMD256Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA1 extends DigestSignatureSpi {
        public SHA1() {
            super(OIWObjectIdentifiers.idSHA1, DigestFactory.createSHA1(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA224 extends DigestSignatureSpi {
        public SHA224() {
            super(NISTObjectIdentifiers.id_sha224, DigestFactory.createSHA224(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA256 extends DigestSignatureSpi {
        public SHA256() {
            super(NISTObjectIdentifiers.id_sha256, DigestFactory.createSHA256(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA384 extends DigestSignatureSpi {
        public SHA384() {
            super(NISTObjectIdentifiers.id_sha384, DigestFactory.createSHA384(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA3_224 extends DigestSignatureSpi {
        public SHA3_224() {
            super(NISTObjectIdentifiers.id_sha3_224, DigestFactory.createSHA3_224(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA3_256 extends DigestSignatureSpi {
        public SHA3_256() {
            super(NISTObjectIdentifiers.id_sha3_256, DigestFactory.createSHA3_256(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA3_384 extends DigestSignatureSpi {
        public SHA3_384() {
            super(NISTObjectIdentifiers.id_sha3_384, DigestFactory.createSHA3_384(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA3_512 extends DigestSignatureSpi {
        public SHA3_512() {
            super(NISTObjectIdentifiers.id_sha3_512, DigestFactory.createSHA3_512(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA512 extends DigestSignatureSpi {
        public SHA512() {
            super(NISTObjectIdentifiers.id_sha512, DigestFactory.createSHA512(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA512_224 extends DigestSignatureSpi {
        public SHA512_224() {
            super(NISTObjectIdentifiers.id_sha512_224, DigestFactory.createSHA512_224(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA512_256 extends DigestSignatureSpi {
        public SHA512_256() {
            super(NISTObjectIdentifiers.id_sha512_256, DigestFactory.createSHA512_256(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class noneRSA extends DigestSignatureSpi {
        public noneRSA() {
            super(new NullDigest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public DigestSignatureSpi(ASN1ObjectIdentifier aSN1ObjectIdentifier, Digest digest, AsymmetricBlockCipher asymmetricBlockCipher) {
        this.f89996a = digest;
        this.f89997b = asymmetricBlockCipher;
        this.f89998c = new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(d.f(new StringBuilder("Supplied key ("), privateKey == null ? null : privateKey.getClass().getName(), ") is not a RSAPrivateKey instance"));
        }
        RSAKeyParameters rSAKeyParametersA = RSAUtil.a((RSAPrivateKey) privateKey);
        this.f89996a.reset();
        this.f89997b.init(true, rSAKeyParametersA);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException(d.f(new StringBuilder("Supplied key ("), publicKey == null ? null : publicKey.getClass().getName(), ") is not a RSAPublicKey instance"));
        }
        RSAKeyParameters rSAKeyParametersB = RSAUtil.b((RSAPublicKey) publicKey);
        this.f89996a.reset();
        this.f89997b.init(false, rSAKeyParametersB);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        Digest digest = this.f89996a;
        byte[] encoded = new byte[digest.getDigestSize()];
        digest.doFinal(encoded, 0);
        try {
            AlgorithmIdentifier algorithmIdentifier = this.f89998c;
            if (algorithmIdentifier != null) {
                encoded = new DigestInfo(algorithmIdentifier, encoded).getEncoded(ASN1Encoding.DER);
            }
            return this.f89997b.processBlock(encoded, 0, encoded.length);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new SignatureException("key too small for signature type");
        } catch (Exception e5) {
            throw new SignatureException(e5.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f89996a.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        Digest digest = this.f89996a;
        byte[] encoded = new byte[digest.getDigestSize()];
        digest.doFinal(encoded, 0);
        try {
            byte[] bArrProcessBlock = this.f89997b.processBlock(bArr, 0, bArr.length);
            AlgorithmIdentifier algorithmIdentifier = this.f89998c;
            if (algorithmIdentifier != null) {
                encoded = new DigestInfo(algorithmIdentifier, encoded).getEncoded(ASN1Encoding.DER);
            }
            if (bArrProcessBlock.length == encoded.length) {
                return Arrays.constantTimeAreEqual(bArrProcessBlock, encoded);
            }
            if (bArrProcessBlock.length != encoded.length - 2) {
                Arrays.constantTimeAreEqual(encoded, encoded);
                return false;
            }
            encoded[1] = (byte) (encoded[1] - 2);
            byte b10 = (byte) (encoded[3] - 2);
            encoded[3] = b10;
            int i10 = b10 + 4;
            int i11 = b10 + 6;
            int i12 = 0;
            for (int i13 = 0; i13 < encoded.length - i11; i13++) {
                i12 |= bArrProcessBlock[i10 + i13] ^ encoded[i11 + i13];
            }
            for (int i14 = 0; i14 < i10; i14++) {
                i12 |= bArrProcessBlock[i14] ^ encoded[i14];
            }
            return i12 == 0;
        } catch (Exception unused) {
        }
    }

    public DigestSignatureSpi(Digest digest, AsymmetricBlockCipher asymmetricBlockCipher) {
        this.f89996a = digest;
        this.f89997b = asymmetricBlockCipher;
        this.f89998c = null;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f89996a.update(bArr, i10, i11);
    }
}
