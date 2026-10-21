package org.bouncycastle.jce;

import ad.d;
import androidx.emoji2.text.flatbuffer.a;
import c2.b;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Hashtable;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class PKCS10CertificationRequest extends CertificationRequest {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Hashtable f90318p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Hashtable f90319q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Hashtable f90320r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Hashtable f90321s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final HashSet f90322t0;

    static {
        Hashtable hashtable = new Hashtable();
        f90318p0 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f90319q0 = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        f90320r0 = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        f90321s0 = hashtable4;
        HashSet hashSet = new HashSet();
        f90322t0 = hashSet;
        hashtable.put("MD2WITHRSAENCRYPTION", new ASN1ObjectIdentifier("1.2.840.113549.1.1.2"));
        hashtable.put("MD2WITHRSA", new ASN1ObjectIdentifier("1.2.840.113549.1.1.2"));
        hashtable.put("MD5WITHRSAENCRYPTION", new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"));
        hashtable.put("MD5WITHRSA", new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"));
        hashtable.put("RSAWITHMD5", new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"));
        hashtable.put("SHA1WITHRSAENCRYPTION", new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"));
        hashtable.put("SHA1WITHRSA", new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.sha224WithRSAEncryption;
        hashtable.put("SHA224WITHRSAENCRYPTION", aSN1ObjectIdentifier);
        hashtable.put("SHA224WITHRSA", aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.sha256WithRSAEncryption;
        hashtable.put("SHA256WITHRSAENCRYPTION", aSN1ObjectIdentifier2);
        hashtable.put("SHA256WITHRSA", aSN1ObjectIdentifier2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.sha384WithRSAEncryption;
        hashtable.put("SHA384WITHRSAENCRYPTION", aSN1ObjectIdentifier3);
        hashtable.put("SHA384WITHRSA", aSN1ObjectIdentifier3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.sha512WithRSAEncryption;
        hashtable.put("SHA512WITHRSAENCRYPTION", aSN1ObjectIdentifier4);
        hashtable.put("SHA512WITHRSA", aSN1ObjectIdentifier4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        hashtable.put("SHA1WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        hashtable.put("SHA224WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        hashtable.put("SHA256WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        hashtable.put("SHA384WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        hashtable.put("SHA512WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        hashtable.put("RSAWITHSHA1", new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"));
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        hashtable.put("RIPEMD128WITHRSAENCRYPTION", aSN1ObjectIdentifier6);
        hashtable.put("RIPEMD128WITHRSA", aSN1ObjectIdentifier6);
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        hashtable.put("RIPEMD160WITHRSAENCRYPTION", aSN1ObjectIdentifier7);
        hashtable.put("RIPEMD160WITHRSA", aSN1ObjectIdentifier7);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        hashtable.put("RIPEMD256WITHRSAENCRYPTION", aSN1ObjectIdentifier8);
        hashtable.put("RIPEMD256WITHRSA", aSN1ObjectIdentifier8);
        hashtable.put("SHA1WITHDSA", new ASN1ObjectIdentifier("1.2.840.10040.4.3"));
        hashtable.put("DSAWITHSHA1", new ASN1ObjectIdentifier("1.2.840.10040.4.3"));
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.dsa_with_sha224;
        hashtable.put("SHA224WITHDSA", aSN1ObjectIdentifier9);
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.dsa_with_sha256;
        hashtable.put("SHA256WITHDSA", aSN1ObjectIdentifier10);
        hashtable.put("SHA384WITHDSA", NISTObjectIdentifiers.dsa_with_sha384);
        hashtable.put("SHA512WITHDSA", NISTObjectIdentifiers.dsa_with_sha512);
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = X9ObjectIdentifiers.ecdsa_with_SHA1;
        hashtable.put("SHA1WITHECDSA", aSN1ObjectIdentifier11);
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = X9ObjectIdentifiers.ecdsa_with_SHA224;
        hashtable.put("SHA224WITHECDSA", aSN1ObjectIdentifier12);
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = X9ObjectIdentifiers.ecdsa_with_SHA256;
        hashtable.put("SHA256WITHECDSA", aSN1ObjectIdentifier13);
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = X9ObjectIdentifiers.ecdsa_with_SHA384;
        hashtable.put("SHA384WITHECDSA", aSN1ObjectIdentifier14);
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = X9ObjectIdentifiers.ecdsa_with_SHA512;
        hashtable.put("SHA512WITHECDSA", aSN1ObjectIdentifier15);
        hashtable.put("ECDSAWITHSHA1", aSN1ObjectIdentifier11);
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94;
        hashtable.put("GOST3411WITHGOST3410", aSN1ObjectIdentifier16);
        hashtable.put("GOST3410WITHGOST3411", aSN1ObjectIdentifier16);
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001;
        hashtable.put("GOST3411WITHECGOST3410", aSN1ObjectIdentifier17);
        hashtable.put("GOST3411WITHECGOST3410-2001", aSN1ObjectIdentifier17);
        hashtable.put("GOST3411WITHGOST3410-2001", aSN1ObjectIdentifier17);
        hashtable4.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashtable4.put(aSN1ObjectIdentifier, "SHA224WITHRSA");
        hashtable4.put(aSN1ObjectIdentifier2, "SHA256WITHRSA");
        hashtable4.put(aSN1ObjectIdentifier3, "SHA384WITHRSA");
        hashtable4.put(aSN1ObjectIdentifier4, "SHA512WITHRSA");
        hashtable4.put(aSN1ObjectIdentifier16, "GOST3411WITHGOST3410");
        hashtable4.put(aSN1ObjectIdentifier17, "GOST3411WITHECGOST3410");
        hashtable4.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashtable4.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashtable4.put(new ASN1ObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashtable4.put(aSN1ObjectIdentifier11, "SHA1WITHECDSA");
        hashtable4.put(aSN1ObjectIdentifier12, "SHA224WITHECDSA");
        hashtable4.put(aSN1ObjectIdentifier13, "SHA256WITHECDSA");
        hashtable4.put(aSN1ObjectIdentifier14, "SHA384WITHECDSA");
        hashtable4.put(aSN1ObjectIdentifier15, "SHA512WITHECDSA");
        hashtable4.put(OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        hashtable4.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        hashtable4.put(aSN1ObjectIdentifier9, "SHA224WITHDSA");
        hashtable4.put(aSN1ObjectIdentifier10, "SHA256WITHDSA");
        hashtable3.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
        hashtable3.put(X9ObjectIdentifiers.id_dsa, "DSA");
        hashSet.add(aSN1ObjectIdentifier11);
        hashSet.add(aSN1ObjectIdentifier12);
        hashSet.add(aSN1ObjectIdentifier13);
        hashSet.add(aSN1ObjectIdentifier14);
        hashSet.add(aSN1ObjectIdentifier15);
        hashSet.add(X9ObjectIdentifiers.id_dsa_with_sha1);
        hashSet.add(aSN1ObjectIdentifier9);
        hashSet.add(aSN1ObjectIdentifier10);
        hashSet.add(aSN1ObjectIdentifier16);
        hashSet.add(aSN1ObjectIdentifier17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = OIWObjectIdentifiers.idSHA1;
        DERNull dERNull = DERNull.INSTANCE;
        hashtable2.put("SHA1WITHRSAANDMGF1", a(new AlgorithmIdentifier(aSN1ObjectIdentifier18, dERNull), 20));
        hashtable2.put("SHA224WITHRSAANDMGF1", a(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, dERNull), 28));
        hashtable2.put("SHA256WITHRSAANDMGF1", a(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, dERNull), 32));
        hashtable2.put("SHA384WITHRSAANDMGF1", a(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, dERNull), 48));
        hashtable2.put("SHA512WITHRSAANDMGF1", a(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, dERNull), 64));
    }

    public PKCS10CertificationRequest(String str, X500Principal x500Principal, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        try {
            this(str, new X509Principal(x500Principal.getEncoded()), publicKey, aSN1Set, privateKey, BouncyCastleProvider.PROVIDER_NAME);
        } catch (IOException unused) {
            throw new IllegalArgumentException("can't convert name");
        }
    }

    public static RSASSAPSSparams a(AlgorithmIdentifier algorithmIdentifier, int i10) {
        return new RSASSAPSSparams(algorithmIdentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier), new ASN1Integer(i10), new ASN1Integer(1L));
    }

    public static String b(AlgorithmIdentifier algorithmIdentifier) {
        String id;
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters == null || DERNull.INSTANCE.equals(parameters) || !algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            return algorithmIdentifier.getAlgorithm().getId();
        }
        RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(parameters);
        StringBuilder sb2 = new StringBuilder();
        ASN1ObjectIdentifier algorithm = rSASSAPSSparams.getHashAlgorithm().getAlgorithm();
        if (PKCSObjectIdentifiers.md5.equals((ASN1Primitive) algorithm)) {
            id = "MD5";
        } else if (OIWObjectIdentifiers.idSHA1.equals((ASN1Primitive) algorithm)) {
            id = "SHA1";
        } else if (NISTObjectIdentifiers.id_sha224.equals((ASN1Primitive) algorithm)) {
            id = "SHA224";
        } else if (NISTObjectIdentifiers.id_sha256.equals((ASN1Primitive) algorithm)) {
            id = "SHA256";
        } else if (NISTObjectIdentifiers.id_sha384.equals((ASN1Primitive) algorithm)) {
            id = "SHA384";
        } else if (NISTObjectIdentifiers.id_sha512.equals((ASN1Primitive) algorithm)) {
            id = "SHA512";
        } else if (TeleTrusTObjectIdentifiers.ripemd128.equals((ASN1Primitive) algorithm)) {
            id = "RIPEMD128";
        } else if (TeleTrusTObjectIdentifiers.ripemd160.equals((ASN1Primitive) algorithm)) {
            id = "RIPEMD160";
        } else if (TeleTrusTObjectIdentifiers.ripemd256.equals((ASN1Primitive) algorithm)) {
            id = "RIPEMD256";
        } else {
            id = CryptoProObjectIdentifiers.gostR3411.equals((ASN1Primitive) algorithm) ? "GOST3411" : algorithm.getId();
        }
        return d.f(sb2, id, "withRSAandMGF1");
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        try {
            return getEncoded(ASN1Encoding.DER);
        } catch (IOException e5) {
            throw new RuntimeException(e5.toString());
        }
    }

    public PublicKey getPublicKey() throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        return getPublicKey(BouncyCastleProvider.PROVIDER_NAME);
    }

    public boolean verify() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        return verify(BouncyCastleProvider.PROVIDER_NAME);
    }

    public PublicKey getPublicKey(String str) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.reqInfo.getSubjectPublicKeyInfo();
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new DERBitString(subjectPublicKeyInfo).getOctets());
            AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            try {
                return str == null ? KeyFactory.getInstance(algorithm.getAlgorithm().getId()).generatePublic(x509EncodedKeySpec) : KeyFactory.getInstance(algorithm.getAlgorithm().getId(), str).generatePublic(x509EncodedKeySpec);
            } catch (NoSuchAlgorithmException e5) {
                Hashtable hashtable = f90320r0;
                if (hashtable.get(algorithm.getAlgorithm()) == null) {
                    throw e5;
                }
                String str2 = (String) hashtable.get(algorithm.getAlgorithm());
                return str == null ? KeyFactory.getInstance(str2).generatePublic(x509EncodedKeySpec) : KeyFactory.getInstance(str2, str).generatePublic(x509EncodedKeySpec);
            }
        } catch (IOException unused) {
            throw new InvalidKeyException("error decoding public key");
        } catch (InvalidKeySpecException unused2) {
            throw new InvalidKeyException("error decoding public key");
        }
    }

    public boolean verify(String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        return verify(getPublicKey(str), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public boolean verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        try {
            str = str == 0 ? Signature.getInstance(b(this.sigAlgId)) : Signature.getInstance(b(this.sigAlgId), (String) str);
        } catch (NoSuchAlgorithmException e5) {
            Hashtable hashtable = f90321s0;
            if (hashtable.get(this.sigAlgId.getAlgorithm()) == null) {
                throw e5;
            }
            String str2 = (String) hashtable.get(this.sigAlgId.getAlgorithm());
            str = str == 0 ? Signature.getInstance(str2) : Signature.getInstance(str2, (String) str);
        }
        ASN1Encodable parameters = this.sigAlgId.getParameters();
        if (parameters != null && !DERNull.INSTANCE.equals(parameters)) {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(str.getAlgorithm(), str.getProvider());
            try {
                algorithmParameters.init(parameters.toASN1Primitive().getEncoded(ASN1Encoding.DER));
                if (str.getAlgorithm().endsWith("MGF1")) {
                    try {
                        str.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e7) {
                        throw new SignatureException(a.d(e7, new StringBuilder("Exception extracting parameters: ")));
                    }
                }
            } catch (IOException e10) {
                throw new SignatureException(androidx.camera.core.impl.a.d(e10, new StringBuilder("IOException decoding parameters: ")));
            }
        }
        str.initVerify(publicKey);
        try {
            str.update(this.reqInfo.getEncoded(ASN1Encoding.DER));
            return str.verify(this.sigBits.getOctets());
        } catch (Exception e11) {
            throw new SignatureException(b.d("exception encoding TBS cert request - ", e11));
        }
    }

    public PKCS10CertificationRequest(String str, X500Principal x500Principal, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        try {
            this(str, new X509Principal(x500Principal.getEncoded()), publicKey, aSN1Set, privateKey, str2);
        } catch (IOException unused) {
            throw new IllegalArgumentException("can't convert name");
        }
    }

    public PKCS10CertificationRequest(String str, X509Name x509Name, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        this(str, x509Name, publicKey, aSN1Set, privateKey, BouncyCastleProvider.PROVIDER_NAME);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    public PKCS10CertificationRequest(String str, X509Name x509Name, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        AlgorithmIdentifier algorithmIdentifier;
        Signature signature;
        String upperCase = Strings.toUpperCase(str);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) f90318p0.get(upperCase);
        if (aSN1ObjectIdentifier == null) {
            try {
                aSN1ObjectIdentifier = new ASN1ObjectIdentifier(upperCase);
            } catch (Exception unused) {
                throw new IllegalArgumentException("Unknown signature type requested");
            }
        }
        if (x509Name == null) {
            throw new IllegalArgumentException("subject must not be null");
        }
        if (publicKey == null) {
            throw new IllegalArgumentException("public key must not be null");
        }
        try {
            try {
                if (!f90322t0.contains(aSN1ObjectIdentifier)) {
                    Hashtable hashtable = f90319q0;
                    if (hashtable.containsKey(upperCase)) {
                        this.sigAlgId = new AlgorithmIdentifier(aSN1ObjectIdentifier, (ASN1Encodable) hashtable.get(upperCase));
                    } else {
                        algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
                    }
                    this.reqInfo = new CertificationRequestInfo(x509Name, SubjectPublicKeyInfo.getInstance((ASN1Sequence) ASN1Primitive.fromByteArray(publicKey.getEncoded())), aSN1Set);
                    if (str2 == null) {
                        signature = Signature.getInstance(str);
                    } else {
                        signature = Signature.getInstance(str, str2);
                    }
                    signature.initSign(privateKey);
                    signature.update(this.reqInfo.getEncoded(ASN1Encoding.DER));
                    this.sigBits = new DERBitString(signature.sign());
                    return;
                }
                algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier);
                signature.update(this.reqInfo.getEncoded(ASN1Encoding.DER));
                this.sigBits = new DERBitString(signature.sign());
                return;
            } catch (Exception e5) {
                throw new IllegalArgumentException(b.d("exception encoding TBS cert request - ", e5));
            }
            this.reqInfo = new CertificationRequestInfo(x509Name, SubjectPublicKeyInfo.getInstance((ASN1Sequence) ASN1Primitive.fromByteArray(publicKey.getEncoded())), aSN1Set);
            if (str2 == null) {
                signature = Signature.getInstance(str);
            } else {
                signature = Signature.getInstance(str, str2);
            }
            signature.initSign(privateKey);
        } catch (IOException unused2) {
            throw new IllegalArgumentException("can't encode public key");
        }
        this.sigAlgId = algorithmIdentifier;
    }

    public PKCS10CertificationRequest(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public PKCS10CertificationRequest(byte[] bArr) {
        try {
            super((ASN1Sequence) new ASN1InputStream(bArr).readObject());
        } catch (Exception unused) {
            throw new IllegalArgumentException("badly encoded request");
        }
    }
}
